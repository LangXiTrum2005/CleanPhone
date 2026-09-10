package com.inmobi.media;

import android.util.SparseArray;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v20 com.inmobi.media.o4[], still in use, count: 1, list:
  (r1v20 com.inmobi.media.o4[]) from 0x01c5: INVOKE (r1v20 com.inmobi.media.o4[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:454)
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
/* JADX INFO: renamed from: com.inmobi.media.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3157o4 {
    d("NETWORK_UNAVAILABLE_ERROR"),
    f23855e("UNKNOWN_ERROR"),
    f("NETWORK_IO_ERROR"),
    g("OUT_OF_MEMORY_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5("INVALID_ENCRYPTED_RESPONSE_RECEIVED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("RESPONSE_EXCEEDS_SPECIFIED_SIZE_LIMIT"),
    f23856h("GZIP_DECOMPRESSION_FAILED"),
    f23857i("BAD_REQUEST"),
    j("GDPR_COMPLIANCE_ENFORCED"),
    k("GENERIC_HTTP_2XX"),
    f23858l("RESPONSE_PARSING_ERROR"),
    m("RETRY_ATTEMPTED"),
    f23859n("NETWORK_UNAVAILABLE_CONTEXT_LOSS"),
    o("NETWORK_UNAVAILABLE_IDLE_MODE"),
    f23860p("NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE"),
    q("NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M"),
    r("NETWORK_UNAVAILABLE_EXCEPTION"),
    s("NETWORK_PREPARE_FAIL"),
    t("NETWORK_UNAVAILABLE_CUSTOM_VALIDATOR"),
    f23861u("NETWORK_REDIRECT_MALFORMED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_NO_CONTENT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_NOT_MODIFIED"),
    v("HTTP_SEE_OTHER"),
    f23862w("HTTP_SERVER_NOT_FOUND"),
    x("HTTP_MOVED_TEMP"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("HTTP_INTERNAL_SERVER_ERROR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HTTP_NOT_IMPLEMENTED"),
    y("HTTP_BAD_GATEWAY"),
    f23863z("HTTP_SERVER_NOT_AVAILABLE"),
    f23851A("HTTP_GATEWAY_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF405("HTTP_VERSION_NOT_SUPPORTED");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3109l4 f23853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f23854c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23864a;

    static {
        EnumEntriesKt.a(new EnumC3157o4[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, r1, r0, new EnumC3157o4("HTTP_VERSION_NOT_SUPPORTED")});
        f23853b = new C3109l4();
        f23854c = new SparseArray();
        for (EnumC3157o4 enumC3157o4 : values()) {
            f23854c.put(enumC3157o4.f23864a, enumC3157o4);
        }
    }

    public EnumC3157o4(String str) {
        super(str, i);
        this.f23864a = i;
    }

    public static EnumC3157o4 valueOf(String str) {
        return (EnumC3157o4) Enum.valueOf(EnumC3157o4.class, str);
    }

    public static EnumC3157o4[] values() {
        return (EnumC3157o4[]) f23852B.clone();
    }
}
