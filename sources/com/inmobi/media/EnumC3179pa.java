package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.pa[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.pa[]) from 0x002e: INVOKE (r0v1 com.inmobi.media.pa[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:47)
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
/* JADX INFO: renamed from: com.inmobi.media.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3179pa {
    PORTRAIT,
    LANDSCAPE,
    REVERSE_PORTRAIT,
    REVERSE_LANDSCAPE;

    static {
        EnumEntriesKt.a(enumC3179paArr);
    }

    public EnumC3179pa() {
        super(str, i);
    }

    public static EnumC3179pa valueOf(String str) {
        return (EnumC3179pa) Enum.valueOf(EnumC3179pa.class, str);
    }

    public static EnumC3179pa[] values() {
        return (EnumC3179pa[]) f23895e.clone();
    }
}
