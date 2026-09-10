package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.sc[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.sc[]) from 0x0018: INVOKE (r0v1 com.inmobi.media.sc[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:25)
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
/* JADX INFO: renamed from: com.inmobi.media.sc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC3228sc {
    /* JADX INFO: Fake field, exist only in values array */
    HIGH,
    LOW;

    static {
        EnumEntriesKt.a(enumC3228scArr);
    }

    public EnumC3228sc() {
        super(str, i);
    }

    public static EnumC3228sc valueOf(String str) {
        return (EnumC3228sc) Enum.valueOf(EnumC3228sc.class, str);
    }

    public static EnumC3228sc[] values() {
        return (EnumC3228sc[]) f23985b.clone();
    }
}
