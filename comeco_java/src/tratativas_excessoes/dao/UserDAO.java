package tratativas_excessoes.dao;

import java.util.ArrayList;
import java.util.List;

import tratativas_excessoes.exception.EmptyStorageException;
import tratativas_excessoes.exception.UserNotFoundExcception;
import tratativas_excessoes.model.UserModel;

public class UserDAO {
    private long nextId = 1L;

    private final List<UserModel> models = new ArrayList<>();

    public UserModel save(final UserModel model) {
        model.setId(nextId++);
        models.add(model);
        return model;
    }
    public UserModel update(final UserModel model) {
        var toUpdate = findById(model.getId());
        models.remove(toUpdate);
        models.add(model);
        return model;
        
    }
    public void delete(final long id){
        var toDelete = findById(id);
        models.remove(toDelete);
    }
    public UserModel findById(final long id) {
        verificarArmazenamento();
        var message = String.format("Não existe usuario com o Id %s cadastrado", id);
        return models.stream()
            .filter(u -> u.getId() == id)
            .findFirst()
            .orElseThrow(() -> new UserNotFoundExcception(message));
        
    }
    public List<UserModel> findAll(){
        List<UserModel> result;
        try {
            verificarArmazenamento();
            result = models;
        } catch(EmptyStorageException ex) {
            ex.printStackTrace();
            result = new ArrayList<>();
        }
        return result;
    }

    private void verificarArmazenamento(){
        if (models.isEmpty()) throw new EmptyStorageException("O armazenamento está vazio");
    }
}
