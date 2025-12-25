public interface ShipmentService {
    Shipment createShipment(Long vehicleId, Shipment shipment);
    Shipment getShipment(Long id);
}
