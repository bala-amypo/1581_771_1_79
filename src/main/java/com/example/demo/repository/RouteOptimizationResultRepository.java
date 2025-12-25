@Repository
public class RouteOptimizationResultRepository {

    private final Map<Long, RouteOptimizationResult> store = new HashMap<>();

    public RouteOptimizationResult save(RouteOptimizationResult r) {
        store.put(r.getShipmentId(), r);
        return r;
    }

    public Optional<RouteOptimizationResult> findByShipmentId(Long id) {
        return Optional.ofNullable(store.get(id));
    }
}
