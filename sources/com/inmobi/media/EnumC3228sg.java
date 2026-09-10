package com.inmobi.media;

import p002kotlin.enums.attabal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.sg[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.sg[]) from 0x0056: INVOKE (r0v1 com.inmobi.media.sg[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:87)
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
/* JADX INFO: renamed from: com.inmobi.media.sg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3228sg {
    STATE_INITIALIZED,
    STATE_PREPARING,
    STATE_PREPARED,
    STATE_PLAYING,
    STATE_PAUSED,
    STATE_PLAYBACK_COMPLETED,
    STATE_ERROR,
    STATE_DESTROYED;

    static {
        attabal.attabal(enumC3228sgArr);
    }

    public EnumC3228sg() {
        super(str, i);
    }

    public static EnumC3228sg valueOf(String str) {
        return (EnumC3228sg) Enum.valueOf(EnumC3228sg.class, str);
    }

    public static EnumC3228sg[] values() {
        return (EnumC3228sg[]) i.clone();
    }
}
