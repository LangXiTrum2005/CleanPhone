package o8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f47211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f47212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f47213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d[] f47214d;

    static {
        d dVar = new d("DEFAULT", 0);
        f47211a = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f47212b = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f47213c = dVar3;
        f47214d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f47214d.clone();
    }
}
