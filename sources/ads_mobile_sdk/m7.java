package ads_mobile_sdk;

import java.util.LinkedHashMap;
import p002kotlin.collections.polder;
import saneness.haemocyte;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ads_mobile_sdk.m7[], still in use, count: 1, list:
  (r0v1 ads_mobile_sdk.m7[]) from 0x002e: INVOKE (r0v1 ads_mobile_sdk.m7[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:47)
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
public final class m7 {
    UNKNOWN(0),
    CPM(1),
    CPC(2),
    ONE_PIXEL(3);

    public static final haemocyte b;
    public static final LinkedHashMap c;
    public final int a;

    static {
        p002kotlin.enums.attabal.attabal(new m7[]{r0, r1, r3, r4});
        b = new haemocyte();
        m7[] m7VarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(m7VarArrValues.length), 16));
        for (m7 m7Var : m7VarArrValues) {
            linkedHashMap.put(Integer.valueOf(m7Var.a), m7Var);
        }
        c = linkedHashMap;
    }

    public m7(int i) {
        super(str, i);
        this.a = i;
    }

    public static m7[] values() {
        return (m7[]) h.clone();
    }
}
