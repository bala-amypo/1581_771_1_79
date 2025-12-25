@Repository
public class ShipmentRepository {

    private final Map<Long, Shipment> store = new HashMap<>();

    public Shipment save(Shipment s) {
        store.put(s.getId(), s);
        return s;
    }

    public Optional<Shipment> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }
}
