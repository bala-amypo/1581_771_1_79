@Override
public User register(User user) {
    return userRepository.save(user);
}

@Override
public User findByEmail(String email) {
    return userRepository.findByEmail(email)
        .orElseThrow(() -> new RuntimeException("User not found"));
}
