package ads_mobile_sdk;

import java.util.LinkedHashMap;
import p002kotlin.collections.polder;
import saneness.molet;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ads_mobile_sdk.d1[], still in use, count: 1, list:
  (r0v1 ads_mobile_sdk.d1[]) from 0x0034: INVOKE (r0v1 ads_mobile_sdk.d1[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:53)
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
public final class d1 {
    FORMAT_DEFAULT(0),
    ONE_PIXEL(1),
    /* JADX INFO: Fake field, exist only in values array */
    AD_LOAD(2),
    /* JADX INFO: Fake field, exist only in values array */
    NO_IMPRESSION(3),
    THIRD_PARTY_SDK_CALLBACK(4);

    public static final molet b;
    public static final LinkedHashMap c;
    public final int a;

    static {
        p002kotlin.enums.attabal.attabal(new d1[]{r0, r1, r3, r4, r5});
        b = new molet();
        d1[] d1VarArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(d1VarArrValues.length), 16));
        for (d1 d1Var : d1VarArrValues) {
            linkedHashMap.put(Integer.valueOf(d1Var.a), d1Var);
        }
        c = linkedHashMap;
    }

    public d1(int i) {
        super(str, i);
        this.a = i;
    }

    public static d1[] values() {
        return (d1[]) g.clone();
    }
}
