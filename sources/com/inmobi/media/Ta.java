package com.inmobi.media;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.Ta[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.Ta[]) from 0x0032: INVOKE (r0v1 com.inmobi.media.Ta[]) STATIC call: kotlin.enums.EnumEntriesKt.a(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:(java.lang.Enum[]):kotlin.enums.EnumEntries (m)] (LINE:51)
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
/* JADX INFO: loaded from: classes5.dex */
public final class Ta {
    f23232b("HIGHEST"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("HIGH"),
    f23233c("MEDIUM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF33("LOW"),
    /* JADX INFO: Fake field, exist only in values array */
    EF41("LOWEST");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23234a;

    static {
        EnumEntriesKt.a(taArr);
    }

    public Ta(String str) {
        super(str, i);
        this.f23234a = i;
    }

    public static Ta valueOf(String str) {
        return (Ta) Enum.valueOf(Ta.class, str);
    }

    public static Ta[] values() {
        return (Ta[]) d.clone();
    }
}
