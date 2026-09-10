package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class BackoffPolicy {
    public static final BackoffPolicy X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final BackoffPolicy f8598Y;
    public static final /* synthetic */ BackoffPolicy[] Z;

    static {
        BackoffPolicy backoffPolicy = new BackoffPolicy("EXPONENTIAL", 0);
        X = backoffPolicy;
        BackoffPolicy backoffPolicy2 = new BackoffPolicy("LINEAR", 1);
        f8598Y = backoffPolicy2;
        Z = new BackoffPolicy[]{backoffPolicy, backoffPolicy2};
    }

    public static BackoffPolicy valueOf(String str) {
        return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, str);
    }

    public static BackoffPolicy[] values() {
        return (BackoffPolicy[]) Z.clone();
    }
}
