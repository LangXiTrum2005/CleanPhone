package ads_mobile_sdk;

import com.ironsource.X3;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ads_mobile_sdk.e1[], still in use, count: 1, list:
  (r0v1 ads_mobile_sdk.e1[]) from 0x0024: INVOKE (r0v1 ads_mobile_sdk.e1[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:37)
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
public final class e1 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7(X3.i.C),
    /* JADX INFO: Fake field, exist only in values array */
    EF17(X3.i.D),
    /* JADX INFO: Fake field, exist only in values array */
    EF27("unknown");

    static {
        p002kotlin.enums.attabal.attabal(e1VarArr);
    }

    public e1(String str) {
        super(str, i);
    }

    public static e1[] values() {
        return (e1[]) a.clone();
    }
}
