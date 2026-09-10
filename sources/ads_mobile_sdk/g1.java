package ads_mobile_sdk;

import java.util.LinkedHashMap;
import p002kotlin.collections.polder;
import saneness.specky;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ads_mobile_sdk.g1[], still in use, count: 1, list:
  (r0v1 ads_mobile_sdk.g1[]) from 0x002e: INVOKE (r0v1 ads_mobile_sdk.g1[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:47)
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
public final class g1 {
    FORMAT_DEFAULT(0),
    ON_AD_OPENED(1),
    ON_AD_SHOW(2),
    THIRD_PARTY_SDK_CALLBACK(3);

    public static final specky b;
    public static final LinkedHashMap c;
    public final int a;

    static {
        p002kotlin.enums.attabal.attabal(new g1[]{r0, r1, r3, r4});
        b = new specky();
        g1[] g1VarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(g1VarArrValues.length), 16));
        for (g1 g1Var : g1VarArrValues) {
            linkedHashMap.put(Integer.valueOf(g1Var.a), g1Var);
        }
        c = linkedHashMap;
    }

    public g1(int i) {
        super(str, i);
        this.a = i;
    }

    public static g1[] values() {
        return (g1[]) h.clone();
    }
}
