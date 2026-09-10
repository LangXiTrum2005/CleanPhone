package com.inmobi.media;

import android.util.SparseArray;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v35 com.inmobi.media.m4[], still in use, count: 1, list:
  (r0v35 com.inmobi.media.m4[]) from 0x01db: INVOKE (r0v36 kotlin.enums.EnumEntries) = (r0v35 com.inmobi.media.m4[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:476)
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
/* JADX INFO: renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3125m4 {
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NETWORK_UNAVAILABLE_ERROR"),
    d("UNKNOWN_ERROR"),
    f23805e("NETWORK_IO_ERROR"),
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
    /* JADX INFO: Fake field, exist only in values array */
    EF13("NETWORK_UNAVAILABLE_CONTEXT_LOSS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("NETWORK_UNAVAILABLE_IDLE_MODE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15("NETWORK_UNAVAILABLE_NO_CONNECTION_M_OR_ABOVE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NETWORK_UNAVAILABLE_NO_CONNECTION_BELOW_M"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NETWORK_UNAVAILABLE_EXCEPTION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NETWORK_PREPARE_FAIL"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NETWORK_REQUEST_GENERIC_DROPPED_BY_INTERCEPTOR"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NETWORK_REQUEST_CANCELLED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("NETWORK_REQUEST_EXCEPTION"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0("NETWORK_UNAVAILABLE_CUSTOM_VALIDATOR"),
    f23806h("NETWORK_REDIRECT_MALFORMED"),
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
    f23807i("HTTP_GATEWAY_TIMEOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF407("HTTP_VERSION_NOT_SUPPORTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF420("HTTP_UNAUTHORISED");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3093k4 f23803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SparseArray f23804c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23808a;

    static {
        EnumEntries<EnumC3125m4> enumEntriesA = EnumEntriesKt.a(enumC3125m4Arr);
        f23803b = new C3093k4();
        f23804c = new SparseArray();
        for (EnumC3125m4 enumC3125m4 : enumEntriesA) {
            f23804c.put(enumC3125m4.f23808a, enumC3125m4);
        }
    }

    public EnumC3125m4(String str) {
        super(str, i);
        this.f23808a = i;
    }

    public static EnumC3125m4 valueOf(String str) {
        return (EnumC3125m4) Enum.valueOf(EnumC3125m4.class, str);
    }

    public static EnumC3125m4[] values() {
        return (EnumC3125m4[]) j.clone();
    }
}
