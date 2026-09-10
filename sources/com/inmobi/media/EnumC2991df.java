package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.df[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.df[]) from 0x0024: INVOKE (r0v1 com.inmobi.media.df[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:37)
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
/* JADX INFO: renamed from: com.inmobi.media.df, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC2991df {
    UNKNOWN,
    HIDDEN,
    VISIBLE;

    static {
        EnumEntriesKt.a(enumC2991dfArr);
    }

    public EnumC2991df() {
        super(str, i);
    }

    public static EnumC2991df valueOf(String str) {
        return (EnumC2991df) Enum.valueOf(EnumC2991df.class, str);
    }

    public static EnumC2991df[] values() {
        return (EnumC2991df[]) d.clone();
    }
}
