package bk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f5708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f5709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f5711d;

    static {
        a aVar = new a("COROUTINE_SUSPENDED", 0);
        f5708a = aVar;
        a aVar2 = new a("UNDECIDED", 1);
        f5709b = aVar2;
        a aVar3 = new a("RESUMED", 2);
        f5710c = aVar3;
        f5711d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f5711d.clone();
    }
}
