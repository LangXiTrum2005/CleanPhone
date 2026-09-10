package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class KotlinRetention {
    public static final KotlinRetention X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final KotlinRetention f43619Y;
    public static final KotlinRetention Z;
    public static final /* synthetic */ KotlinRetention[] e0;

    static {
        KotlinRetention kotlinRetention = new KotlinRetention("RUNTIME", 0);
        X = kotlinRetention;
        KotlinRetention kotlinRetention2 = new KotlinRetention("BINARY", 1);
        f43619Y = kotlinRetention2;
        KotlinRetention kotlinRetention3 = new KotlinRetention("SOURCE", 2);
        Z = kotlinRetention3;
        e0 = new KotlinRetention[]{kotlinRetention, kotlinRetention2, kotlinRetention3};
    }

    public static KotlinRetention valueOf(String str) {
        return (KotlinRetention) Enum.valueOf(KotlinRetention.class, str);
    }

    public static KotlinRetention[] values() {
        return (KotlinRetention[]) e0.clone();
    }
}
