package ah;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ah.a[], still in use, count: 1, list:
  (r0v1 ah.a[]) from 0x0030: CONSTRUCTOR (r0v1 ah.a[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:49) call: dk.a.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class a {
    /* JADX INFO: Fake field, exist only in values array */
    WHATSAPP("whatsapp"),
    /* JADX INFO: Fake field, exist only in values array */
    TELEGRAM("telegram"),
    /* JADX INFO: Fake field, exist only in values array */
    SNAPCHAT("snapchat"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSENGER("messenger");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ dk.a f3580c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3581a;

    static {
        f3580c = new dk.a(aVarArr);
    }

    public a(String str) {
        super(str, i);
        this.f3581a = str;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f3579b.clone();
    }
}
