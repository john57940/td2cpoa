package td2;

public interface DAOClient<T> {
public abstract T getById(int id);
public abstract boolean create(T objet);
public abstract boolean update(T objet);
public abstract boolean delete(T objet);
}
