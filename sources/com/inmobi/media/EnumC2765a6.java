package com.inmobi.media;

import android.util.SparseArray;
import pussyfooter.attabal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v36 com.inmobi.media.a6[], still in use, count: 1, list:
  (r0v36 com.inmobi.media.a6[]) from 0x0202: INVOKE (r0v37 pussyfooter.attabal) = (r0v36 com.inmobi.media.a6[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:515)
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
/* JADX INFO: renamed from: com.inmobi.media.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC2765a6 {
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NETWORK_UNAVAILABLE_ERROR"),
    d("UNKNOWN_ERROR"),
    e("NETWORK_IO_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("OUT_OF_MEMORY_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("INVALID_ENCRYPTED_RESPONSE_RECEIVED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("GZIP_DECOMPRESSION_FAILED"),
    f("BAD_REQUEST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("GDPR_COMPLIANCE_ENFORCED"),
    g("GENERIC_HTTP_2XX"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("RESPONSE_PARSING_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12("RETRY_ATTEMPTED"),
    h("NETWORK_UNAVAILABLE_CONTEXT_LOSS"),
    i("NETWORK_UNAVAILABLE_IDLE_MODE"),
    j("NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE"),
    k("NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M"),
    l("NETWORK_UNAVAILABLE_EXCEPTION"),
    m("NETWORK_PREPARE_FAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NETWORK_REQUEST_GENERIC_DROPPED_BY_INTERCEPTOR"),
    n("NETWORK_REQUEST_CANCELLED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NETWORK_REQUEST_EXCEPTION"),
    o("NETWORK_UNAVAILABLE_CUSTOM_VALIDATOR"),
    p("NETWORK_REDIRECT_MALFORMED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_NO_CONTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_NOT_MODIFIED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_SEE_OTHER"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_SERVER_NOT_FOUND"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_MOVED_TEMP"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_INTERNAL_SERVER_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_NOT_IMPLEMENTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_BAD_GATEWAY"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_SERVER_NOT_AVAILABLE"),
    q("HTTP_GATEWAY_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF431("HTTP_VERSION_NOT_SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF444("HTTP_UNAUTHORISED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF457("SERVER_ERROR_END_CODE");

    public static final Y5 b;
    public static final SparseArray c;
    public final int a;

    static {
        attabal<EnumC2765a6> attabalVarAttabal = p002kotlin.enums.attabal.attabal(enumC2765a6Arr);
        b = new Y5();
        c = new SparseArray();
        for (EnumC2765a6 enumC2765a6 : attabalVarAttabal) {
            c.put(enumC2765a6.a, enumC2765a6);
        }
    }

    public EnumC2765a6(String str) {
        super(str, i);
        this.a = i;
    }

    public static EnumC2765a6 valueOf(String str) {
        return (EnumC2765a6) Enum.valueOf(EnumC2765a6.class, str);
    }

    public static EnumC2765a6[] values() {
        return (EnumC2765a6[]) r.clone();
    }
}
