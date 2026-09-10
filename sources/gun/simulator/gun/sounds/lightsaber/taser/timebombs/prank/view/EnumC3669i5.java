package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3669i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC3669i5 f4488a;
    public static final EnumC3669i5 b;
    public static final EnumC3669i5 c;
    public static final EnumC3669i5 d;
    public static final EnumC3669i5 e;
    public static final EnumC3669i5 f;
    public static final /* synthetic */ EnumC3669i5[] g;

    static {
        EnumC3669i5 enumC3669i5 = new EnumC3669i5("start", 0);
        f4488a = enumC3669i5;
        EnumC3669i5 enumC3669i6 = new EnumC3669i5("interrupt", 1);
        b = enumC3669i6;
        EnumC3669i5 enumC3669i7 = new EnumC3669i5(TtmlNode.END, 2);
        c = enumC3669i7;
        EnumC3669i5 enumC3669i8 = new EnumC3669i5("dispose", 3);
        d = enumC3669i8;
        EnumC3669i5 enumC3669i9 = new EnumC3669i5(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, 4);
        e = enumC3669i9;
        EnumC3669i5 enumC3669i10 = new EnumC3669i5(NotificationCompat.CATEGORY_EVENT, 5);
        f = enumC3669i10;
        g = new EnumC3669i5[]{enumC3669i5, enumC3669i6, enumC3669i7, enumC3669i8, enumC3669i9, enumC3669i10};
    }

    public static EnumC3669i5 valueOf(String str) {
        return (EnumC3669i5) Enum.valueOf(EnumC3669i5.class, str);
    }

    public static EnumC3669i5[] values() {
        return (EnumC3669i5[]) g.clone();
    }
}
