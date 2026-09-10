package ads_mobile_sdk;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 ads_mobile_sdk.vl1[], still in use, count: 1, list:
  (r0v1 ads_mobile_sdk.vl1[]) from 0x0042: INVOKE (r0v1 ads_mobile_sdk.vl1[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:67)
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
public final class vl1 {
    SCROLL_VIEW_TYPE_NONE(0),
    SCROLL_VIEW_TYPE_SCROLL_VIEW(1),
    SCROLL_VIEW_TYPE_ABS_LIST_VIEW(2),
    SCROLL_VIEW_TYPE_HORIZONTAL_SCROLL_VIEW(3),
    SCROLL_VIEW_TYPE_SCROLLING_VIEW(4),
    SCROLL_VIEW_TYPE_BY_KEYWORD(5);

    public final int a;

    static {
        p002kotlin.enums.attabal.attabal(vl1VarArr);
    }

    public vl1(int i) {
        super(str, i);
        this.a = i;
    }

    public static vl1[] values() {
        return (vl1[]) h.clone();
    }
}
