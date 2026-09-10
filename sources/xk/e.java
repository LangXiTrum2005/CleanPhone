package xk;

import wk.m;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final un.a f53887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f53888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f53889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f53890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f53891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ e[] f53892h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yl.c f53893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53894b;

    static {
        e eVar = new e("Function", 0, m.f53373k, "Function");
        f53888d = eVar;
        e eVar2 = new e("SuspendFunction", 1, m.f53367e, "SuspendFunction");
        f53889e = eVar2;
        yl.c cVar = m.f53370h;
        e eVar3 = new e("KFunction", 2, cVar, "KFunction");
        f53890f = eVar3;
        e eVar4 = new e("KSuspendFunction", 3, cVar, "KSuspendFunction");
        f53891g = eVar4;
        f53892h = new e[]{eVar, eVar2, eVar3, eVar4};
        f53887c = new un.a(10);
    }

    public e(String str, int i10, yl.c cVar, String str2) {
        super(str, i10);
        this.f53893a = cVar;
        this.f53894b = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f53892h.clone();
    }

    public final yl.f a(int i10) {
        return yl.f.e(this.f53894b + i10);
    }
}
