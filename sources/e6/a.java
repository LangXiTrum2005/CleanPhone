package e6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f39137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f39139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f39140d;

    static {
        a aVar = new a("PREFER_ARGB_8888", 0);
        f39137a = aVar;
        a aVar2 = new a("PREFER_RGB_565", 1);
        f39138b = aVar2;
        f39140d = new a[]{aVar, aVar2};
        f39139c = aVar;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f39140d.clone();
    }
}
