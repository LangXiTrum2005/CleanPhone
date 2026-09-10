package ads_mobile_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ads_mobile_sdk.tg0[], still in use, count: 1, list:
  (r0v1 ads_mobile_sdk.tg0[]) from 0x002a: INVOKE (r0v1 ads_mobile_sdk.tg0[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:43)
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
/* JADX INFO: loaded from: classes.dex */
public final class tg0 {
    b("_ac"),
    c("_ai"),
    d("_ar");

    public final String a;

    static {
        p002kotlin.enums.attabal.attabal(tg0VarArr);
    }

    public tg0(String str) {
        super(str, i);
        this.a = str;
    }

    public static tg0[] values() {
        return (tg0[]) e.clone();
    }

    public final String a() {
        return this.a;
    }
}
