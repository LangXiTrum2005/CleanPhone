package com.adjust.sdk.sig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.adjust.sdk.sig.p3[], still in use, count: 1, list:
  (r0v1 com.adjust.sdk.sig.p3[]) from 0x0036: CONSTRUCTOR (r0v1 com.adjust.sdk.sig.p3[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:55) call: com.adjust.sdk.sig.f0.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class p3 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    /* JADX INFO: Fake field, exist only in values array */
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ f0 f7001g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f7002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f7003b;

    static {
        f7001g = new f0(p3VarArr);
    }

    public p3(char c4, char c5) {
        super(str, i);
        this.f7002a = c4;
        this.f7003b = c5;
    }

    public static p3 valueOf(String str) {
        return (p3) Enum.valueOf(p3.class, str);
    }

    public static p3[] values() {
        return (p3[]) f7000f.clone();
    }
}
