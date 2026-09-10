package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class Modality {
    public static final Modality X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Modality f43574Y;
    public static final Modality Z;
    public static final Modality e0;
    public static final /* synthetic */ Modality[] f0;

    public static final class Companion {
    }

    static {
        Modality modality = new Modality("FINAL", 0);
        X = modality;
        Modality modality2 = new Modality("SEALED", 1);
        f43574Y = modality2;
        Modality modality3 = new Modality("OPEN", 2);
        Z = modality3;
        Modality modality4 = new Modality("ABSTRACT", 3);
        e0 = modality4;
        f0 = new Modality[]{modality, modality2, modality3, modality4};
    }

    public static Modality valueOf(String str) {
        return (Modality) Enum.valueOf(Modality.class, str);
    }

    public static Modality[] values() {
        return (Modality[]) f0.clone();
    }
}
