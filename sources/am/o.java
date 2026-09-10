package am;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f3758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f3759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f3760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ o[] f3761d;

    static {
        o oVar = new o("ALL", 0);
        f3758a = oVar;
        o oVar2 = new o("ONLY_NON_SYNTHESIZED", 1);
        f3759b = oVar2;
        o oVar3 = new o("NONE", 2);
        f3760c = oVar3;
        f3761d = new o[]{oVar, oVar2, oVar3};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f3761d.clone();
    }
}
