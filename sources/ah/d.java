package ah;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ah.d[], still in use, count: 1, list:
  (r0v1 ah.d[]) from 0x0038: CONSTRUCTOR (r0v1 ah.d[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: dk.a.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class d {
    IMAGE("image"),
    VIDEO("video"),
    SCREENSHOT("screenShot"),
    SCREEN_RECORDING("screenRecording");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fd.b f3598b = new fd.b(2);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ dk.a f3604h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3605a;

    static {
        f3604h = new dk.a(new d[]{r0, r1, r2, r3});
    }

    public d(String str) {
        super(str, i);
        this.f3605a = str;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f3603g.clone();
    }
}
