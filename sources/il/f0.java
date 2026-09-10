package il;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f43067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f43068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f0 f43069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f43070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f0[] f43071f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43072a;

    static {
        f0 f0Var = new f0("NULL", 0, null);
        f43067b = f0Var;
        f0 f0Var2 = new f0("INDEX", 1, -1);
        f43068c = f0Var2;
        f0 f0Var3 = new f0("FALSE", 2, Boolean.FALSE);
        f43069d = f0Var3;
        e0 e0Var = new e0("MAP_GET_OR_DEFAULT", 3, null);
        f43070e = e0Var;
        f43071f = new f0[]{f0Var, f0Var2, f0Var3, e0Var};
    }

    public f0(String str, int i10, Object obj) {
        super(str, i10);
        this.f43072a = obj;
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f43071f.clone();
    }
}
