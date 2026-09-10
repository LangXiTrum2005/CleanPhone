package com.inmobi.media;

import p002kotlin.enums.attabal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 com.inmobi.media.p8[], still in use, count: 1, list:
  (r0v3 com.inmobi.media.p8[]) from 0x00b8: INVOKE (r0v3 com.inmobi.media.p8[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m)] (LINE:185)
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
/* JADX INFO: renamed from: com.inmobi.media.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3146p8 {
    VIDEO_READY("VideoReady"),
    VIDEO_COMPLETE("VideoComplete"),
    VIDEO_PLAYBACK_ERROR("VideoPlaybackError"),
    VIDEO_COMMAND_ERROR("VideoCommandError"),
    VIDEO_PLAYBACK_STATE("VideoPlaybackState"),
    VIDEO_PLAYBACK_UPDATE("VideoPlaybackUpdate"),
    VIDEO_QUARTILES_EVENT("VideoQuartilesEvent"),
    VIDEO_PLAYER_CREATED("VideoPlayerCreated"),
    VIDEO_PLAYER_POSITION_UPDATED("VideoPlayerPositionUpdated"),
    VIDEO_PLAYER_DESTROYED("VideoPlayerDestroyed"),
    VIDEO_PLAYER_ACTION_EXECUTED("VideoPlayerActionExecuted"),
    VIDEO_PLAYER_POSITION("VideoPlayerPosition"),
    VIDEO_CAN_PLAY_THROUGH("VideoCanPlayThrough"),
    VIDEO_LOADED_METADATA("VideoLoadedMetadata");

    public final String a;

    static {
        attabal.attabal(enumC3146p8Arr);
    }

    public EnumC3146p8(String str) {
        super(str, i);
        this.a = str;
    }

    public static EnumC3146p8 valueOf(String str) {
        return (EnumC3146p8) Enum.valueOf(EnumC3146p8.class, str);
    }

    public static EnumC3146p8[] values() {
        return (EnumC3146p8[]) p.clone();
    }
}
