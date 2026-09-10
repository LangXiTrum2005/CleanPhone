package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.a7[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.a7[]) from 0x002e: INVOKE (r0v1 com.inmobi.media.a7[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:47)
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
/* JADX INFO: renamed from: com.inmobi.media.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2932a7 {
    INFO,
    DEBUG,
    ERROR,
    STATE;

    static {
        EnumEntriesKt.a(enumC2932a7Arr);
    }

    public EnumC2932a7() {
        super(str, i);
    }

    public static EnumC2932a7 valueOf(String str) {
        return (EnumC2932a7) Enum.valueOf(EnumC2932a7.class, str);
    }

    public static EnumC2932a7[] values() {
        return (EnumC2932a7[]) f23434e.clone();
    }
}
