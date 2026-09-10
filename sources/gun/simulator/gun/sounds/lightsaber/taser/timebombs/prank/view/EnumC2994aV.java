package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.aV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC2994aV {
    /* JADX INFO: Fake field, exist only in values array */
    MINIMIZED("minimized"),
    /* JADX INFO: Fake field, exist only in values array */
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPANDED(MRAIDCommunicatorUtil.STATES_EXPANDED),
    FULLSCREEN(C2390Ej.TEMPLATE_TYPE_FULLSCREEN);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4123a;

    EnumC2994aV(String str) {
        this.f4123a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f4123a;
    }
}
