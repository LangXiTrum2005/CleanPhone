package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.n4[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.n4[]) from 0x0066: INVOKE (r0v1 com.inmobi.media.n4[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:103)
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
/* JADX INFO: renamed from: com.inmobi.media.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3141n4 {
    /* JADX INFO: Fake field, exist only in values array */
    EF9("PING_V2_DISABLED", "Ping V2 is disabled from SDK config"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21("PING_ID_MISSING", "Ping ID is missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("PING_URL_INVALID", "Ping url is invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF45("PING_URL_MISSING", "Ping URL is missing"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57("PING_JSON_INVALID", "Ping JSON is invalid"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69("PING_ARRAY_EMPTY", "Ping array is empty"),
    /* JADX INFO: Fake field, exist only in values array */
    EF81("PING_UNKNOWN_RESPONSE", "Ping response is unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    EF93("PING_EXCEPTION", "Ping exception occurred");

    static {
        EnumEntriesKt.a(enumC3141n4Arr);
    }

    public EnumC3141n4(String str, String str2) {
        super(str, i);
    }

    public static EnumC3141n4 valueOf(String str) {
        return (EnumC3141n4) Enum.valueOf(EnumC3141n4.class, str);
    }

    public static EnumC3141n4[] values() {
        return (EnumC3141n4[]) f23825a.clone();
    }
}
