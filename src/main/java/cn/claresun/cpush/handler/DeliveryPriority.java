package cn.claresun.cpush.handler;

/**
 * Created by claresun on 16-8-11.
 */
public enum DeliveryPriority {
    IMMEDIATE(10),

    CONSERVE_POWER(5);

    private final int code;

    private DeliveryPriority(final int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static DeliveryPriority getDeliveryPriority(final int code) {
        for (final DeliveryPriority priority : DeliveryPriority.values()) {
            if (priority.getCode() == code) {
                return priority;
            }
        }

        throw new IllegalArgumentException(String.format("No delivery priority found with code %d", code));
    }
}
