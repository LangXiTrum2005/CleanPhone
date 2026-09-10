package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.rc[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.rc[]) from 0x0032: INVOKE (r0v1 com.inmobi.media.rc[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:51)
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
/* JADX INFO: renamed from: com.inmobi.media.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3212rc {
    GET,
    POST,
    /* JADX INFO: Fake field, exist only in values array */
    PUT,
    /* JADX INFO: Fake field, exist only in values array */
    DELETE,
    /* JADX INFO: Fake field, exist only in values array */
    PATCH;

    static {
        EnumEntriesKt.a(enumC3212rcArr);
    }

    public EnumC3212rc() {
        super(str, i);
    }

    public static EnumC3212rc valueOf(String str) {
        return (EnumC3212rc) Enum.valueOf(EnumC3212rc.class, str);
    }

    public static EnumC3212rc[] values() {
        return (EnumC3212rc[]) f23967c.clone();
    }
}
