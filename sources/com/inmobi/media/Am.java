package com.inmobi.media;

import p002kotlin.enums.attabal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.Am[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.Am[]) from 0x004c: INVOKE (r0v1 com.inmobi.media.Am[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:77)
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
/* JADX INFO: loaded from: classes3.dex */
public final class Am {
    UNKNOWN(Y7.UNDEFINED_ERROR),
    MALFORMED_URL(Y7.MALFORMED_URL),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT(Y7.TIMEOUT),
    NETWORK(Y7.NETWORK),
    NO_URL_FOUND(Y7.NO_URL_FOUND),
    INVALID_STATE(Y7.INVALID_STATE);

    public final Y7 a;

    static {
        attabal.attabal(amArr);
    }

    public Am(Y7 y7) {
        super(str, i);
        this.a = y7;
    }

    public static Am valueOf(String str) {
        return (Am) Enum.valueOf(Am.class, str);
    }

    public static Am[] values() {
        return (Am[]) g.clone();
    }
}
