package com.inmobi.media;

import com.ironsource.C3700q2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import pussyfooter.attabal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.inmobi.media.Pm[], still in use, count: 1, list:
  (r0v1 com.inmobi.media.Pm[]) from 0x004c: INVOKE (r0v1 com.inmobi.media.Pm[]) STATIC call: kotlin.enums.attabal.attabal(java.lang.Enum[]):pussyfooter.attabal A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):pussyfooter.attabal<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:77)
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
/* JADX INFO: loaded from: classes3.dex */
public final class Pm {
    /* JADX INFO: Fake field, exist only in values array */
    SHOW_VIDEO(C3700q2.v),
    /* JADX INFO: Fake field, exist only in values array */
    HIDE_VIDEO("hide"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAY_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_RESUME),
    /* JADX INFO: Fake field, exist only in values array */
    PAUSE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_PAUSE),
    /* JADX INFO: Fake field, exist only in values array */
    MUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_MUTE),
    /* JADX INFO: Fake field, exist only in values array */
    UNMUTE_VIDEO(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE),
    /* JADX INFO: Fake field, exist only in values array */
    SKIP_VIDEO("skip");

    public static final /* synthetic */ attabal c;
    public final String a;

    static {
        c = p002kotlin.enums.attabal.attabal(pmArr);
    }

    public Pm(String str) {
        super(str, i);
        this.a = str;
    }

    public static Pm valueOf(String str) {
        return (Pm) Enum.valueOf(Pm.class, str);
    }

    public static Pm[] values() {
        return (Pm[]) b.clone();
    }
}
