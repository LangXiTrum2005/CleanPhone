package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class DeserializedContainerAbiStability {
    public static final DeserializedContainerAbiStability X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final DeserializedContainerAbiStability f44455Y;
    public static final DeserializedContainerAbiStability Z;
    public static final /* synthetic */ DeserializedContainerAbiStability[] e0;

    static {
        DeserializedContainerAbiStability deserializedContainerAbiStability = new DeserializedContainerAbiStability("STABLE", 0);
        X = deserializedContainerAbiStability;
        DeserializedContainerAbiStability deserializedContainerAbiStability2 = new DeserializedContainerAbiStability("FIR_UNSTABLE", 1);
        f44455Y = deserializedContainerAbiStability2;
        DeserializedContainerAbiStability deserializedContainerAbiStability3 = new DeserializedContainerAbiStability("IR_UNSTABLE", 2);
        Z = deserializedContainerAbiStability3;
        e0 = new DeserializedContainerAbiStability[]{deserializedContainerAbiStability, deserializedContainerAbiStability2, deserializedContainerAbiStability3};
    }

    public static DeserializedContainerAbiStability valueOf(String str) {
        return (DeserializedContainerAbiStability) Enum.valueOf(DeserializedContainerAbiStability.class, str);
    }

    public static DeserializedContainerAbiStability[] values() {
        return (DeserializedContainerAbiStability[]) e0.clone();
    }
}
