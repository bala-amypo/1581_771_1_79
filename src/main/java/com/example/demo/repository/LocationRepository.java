@Repository
public class LocationRepository {

    private final Map<Long, Location> store = new HashMap<>();

    public Location save(Location l) {
        store.put(l.getId(), l);
        return l;
    }

    public List<Location> findAll() {
        return new ArrayList<>(store.values());
    }
}
