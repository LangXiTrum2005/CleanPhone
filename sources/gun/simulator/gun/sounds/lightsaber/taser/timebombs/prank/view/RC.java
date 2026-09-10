package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;

/* JADX INFO: loaded from: classes3.dex */
public enum RC {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE(MRAIDCommunicatorUtil.KEY_VIEWABLE),
    AUDIBLE("audible"),
    OTHER("other");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3650a;

    RC(String str) {
        this.f3650a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f3650a;
    }
}
