package x8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f53666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f53667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f53668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ c[] f53669d;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        f53666a = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        f53667b = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        f53668c = cVar3;
        f53669d = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f53669d.clone();
    }
}
