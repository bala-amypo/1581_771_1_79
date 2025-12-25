public interface UserService {
    User register(User user);
    User findById(Long id);
    User findByEmail(String email);
}
