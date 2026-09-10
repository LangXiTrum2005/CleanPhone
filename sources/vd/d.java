package vd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f52566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f52567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d[] f52568c;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        f52566a = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        f52567b = dVar2;
        f52568c = new d[]{dVar, dVar2, new d("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f52568c.clone();
    }
}
