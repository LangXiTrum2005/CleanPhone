package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class NetworkType {
    public static final NetworkType X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final NetworkType f8632Y;
    public static final NetworkType Z;
    public static final NetworkType e0;
    public static final NetworkType f0;
    public static final NetworkType g0;
    public static final /* synthetic */ NetworkType[] h0;

    static {
        NetworkType networkType = new NetworkType("NOT_REQUIRED", 0);
        X = networkType;
        NetworkType networkType2 = new NetworkType("CONNECTED", 1);
        f8632Y = networkType2;
        NetworkType networkType3 = new NetworkType("UNMETERED", 2);
        Z = networkType3;
        NetworkType networkType4 = new NetworkType("NOT_ROAMING", 3);
        e0 = networkType4;
        NetworkType networkType5 = new NetworkType("METERED", 4);
        f0 = networkType5;
        NetworkType networkType6 = new NetworkType("TEMPORARILY_UNMETERED", 5);
        g0 = networkType6;
        h0 = new NetworkType[]{networkType, networkType2, networkType3, networkType4, networkType5, networkType6};
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) h0.clone();
    }
}
