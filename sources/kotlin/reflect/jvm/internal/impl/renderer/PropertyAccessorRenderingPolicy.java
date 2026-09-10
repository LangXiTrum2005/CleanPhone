package kotlin.reflect.jvm.internal.impl.renderer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class PropertyAccessorRenderingPolicy {
    public static final PropertyAccessorRenderingPolicy X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final PropertyAccessorRenderingPolicy f44273Y;
    public static final /* synthetic */ PropertyAccessorRenderingPolicy[] Z;

    /* JADX INFO: Fake field, exist only in values array */
    PropertyAccessorRenderingPolicy EF0;

    static {
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = new PropertyAccessorRenderingPolicy("PRETTY", 0);
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy2 = new PropertyAccessorRenderingPolicy("DEBUG", 1);
        X = propertyAccessorRenderingPolicy2;
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy3 = new PropertyAccessorRenderingPolicy("NONE", 2);
        f44273Y = propertyAccessorRenderingPolicy3;
        Z = new PropertyAccessorRenderingPolicy[]{propertyAccessorRenderingPolicy, propertyAccessorRenderingPolicy2, propertyAccessorRenderingPolicy3};
    }

    public static PropertyAccessorRenderingPolicy valueOf(String str) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, str);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) Z.clone();
    }
}
