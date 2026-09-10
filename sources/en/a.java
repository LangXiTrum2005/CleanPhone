package en;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f40123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a[] f40125d;

    static {
        a aVar = new a("SUSPEND", 0);
        f40122a = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f40123b = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f40124c = aVar3;
        f40125d = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f40125d.clone();
    }
}
