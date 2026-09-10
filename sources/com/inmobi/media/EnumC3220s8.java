package com.inmobi.media;

import p002kotlin.enums.attabal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.s8[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.s8[]) from 0x0061: INVOKE (r0v1 com.inmobi.media.s8[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:98)
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
/* JADX INFO: renamed from: com.inmobi.media.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3220s8 {
    INIT,
    LOADING,
    LOADED,
    LOAD_FAILED,
    PLAYING,
    PAUSED,
    COMPLETED,
    ERROR,
    DESTROYED;

    static {
        attabal.attabal(enumC3220s8Arr);
    }

    public EnumC3220s8() {
        super(str, i);
    }

    public static EnumC3220s8 valueOf(String str) {
        return (EnumC3220s8) Enum.valueOf(EnumC3220s8.class, str);
    }

    public static EnumC3220s8[] values() {
        return (EnumC3220s8[]) j.clone();
    }
}
