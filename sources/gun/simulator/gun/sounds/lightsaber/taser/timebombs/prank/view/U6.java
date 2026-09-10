package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class U6 {

    /* JADX INFO: Fake field, exist only in values array */
    U6 EF12;
    public static final /* synthetic */ U6[] b = {new U6(TtmlNode.TAG_REGION, 0), new U6("boundingbox", 1), new U6("mesh", 2), new U6("linkedmesh", 3), new U6(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, 4), new U6("point", 5), new U6("clipping", 6), new U6("sequence", 7)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final U6[] f3811a = values();

    public static U6 valueOf(String str) {
        return (U6) Enum.valueOf(U6.class, str);
    }

    public static U6[] values() {
        return (U6[]) b.clone();
    }
}
