package tn;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 tn.j[], still in use, count: 1, list:
  (r0v1 tn.j[]) from 0x0038: CONSTRUCTOR (r0v1 tn.j[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: dk.a.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dk.a f51606h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f51607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f51608b;

    static {
        f51606h = new dk.a(jVarArr);
    }

    public j(char c4, char c5) {
        super(str, i);
        this.f51607a = c4;
        this.f51608b = c5;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f51605g.clone();
    }
}
