package rg;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 rg.d[], still in use, count: 1, list:
  (r0v1 rg.d[]) from 0x0026: CONSTRUCTOR (r0v1 rg.d[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: dk.a.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
    /* JADX INFO: Fake field, exist only in values array */
    MAKE_ASSET_CHANGES("makeAssetChanges"),
    /* JADX INFO: Fake field, exist only in values array */
    COMPRESS_VIDEO("compressVideo"),
    /* JADX INFO: Fake field, exist only in values array */
    CANCEL_COMPRESS_VIDEO("cancelCompressVideo");


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ dk.a f49585c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49586a;

    static {
        f49585c = new dk.a(dVarArr);
    }

    public d(String str) {
        super(str, i);
        this.f49586a = str;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f49584b.clone();
    }
}
