package ads_mobile_sdk;

import saneness.monocoque;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ads_mobile_sdk.q6[], still in use, count: 1, list:
  (r0v1 ads_mobile_sdk.q6[]) from 0x0044: INVOKE (r0v1 ads_mobile_sdk.q6[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:69)
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
public final class q6 {
    UNKNOWN,
    /* JADX INFO: Fake field, exist only in values array */
    BANNER,
    /* JADX INFO: Fake field, exist only in values array */
    INTERSTITIAL,
    NATIVE,
    /* JADX INFO: Fake field, exist only in values array */
    REWARDED,
    APP_OPEN,
    /* JADX INFO: Fake field, exist only in values array */
    REWARDED_INTERSTITIAL;

    public static final monocoque a;

    static {
        p002kotlin.enums.attabal.attabal(q6VarArr);
        a = new monocoque();
    }

    public q6() {
        super(str, i);
    }

    public static q6[] values() {
        return (q6[]) e.clone();
    }
}
