@Repository
public class VehicleRepository {

    private final Map<Long, Vehicle> store = new HashMap<>();

    public Vehicle save(Vehicle v) {
        store.put(v.getId() , v);
        return v;
    }

    public Optional<Vehicle> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    public List<Vehicle> findByUserId(Long userId) {
        List<Vehicle> list = new ArrayList<>();
        for (Vehicle v : store.values()) {
            if (v.getUser().getId().equals(userId)) {
                list.add(v);
            }
        }
        return list;
    }
}
