package ads_mobile_sdk;

import java.util.LinkedHashMap;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.polder;
import saneness.ginshop;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ads_mobile_sdk.yf2[], still in use, count: 1, list:
  (r0v1 ads_mobile_sdk.yf2[]) from 0x0066: INVOKE (r0v2 pussyfooter.attabal) = (r0v1 ads_mobile_sdk.yf2[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:103)
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
public final class yf2 {
    d(""),
    e("app_open_ad"),
    f("banner"),
    g("icon"),
    h("interstitial"),
    i("native"),
    j("rewarded"),
    k("rewarded_interstitial");

    public static final ginshop b;
    public static final LinkedHashMap c;
    public static final /* synthetic */ pussyfooter.attabal m;
    public final String a;

    static {
        pussyfooter.attabal attabalVarAttabal = p002kotlin.enums.attabal.attabal(yf2VarArr);
        m = attabalVarAttabal;
        b = new ginshop();
        LinkedHashMap linkedHashMap = new LinkedHashMap(p002kotlin.ranges.wireman.wireman(polder.marial(dovishness.gintrap(attabalVarAttabal, 10)), 16));
        for (Object obj : attabalVarAttabal) {
            linkedHashMap.put(((yf2) obj).a, obj);
        }
        c = linkedHashMap;
    }

    public yf2(String str) {
        super(str, i);
        this.a = str;
    }

    public static yf2[] values() {
        return (yf2[]) l.clone();
    }

    public final String a() {
        return this.a;
    }
}
