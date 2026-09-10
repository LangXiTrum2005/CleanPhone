package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5001xF extends IF {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5213a;
    public final String b;

    public C5001xF(Object obj, boolean z) {
        AbstractC2995aW.q(obj, TtmlNode.TAG_BODY);
        this.f5213a = z;
        this.b = obj.toString();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IF
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC2995aW.i(AbstractC3263dY.a(C5001xF.class), AbstractC3263dY.a(obj.getClass()))) {
            return false;
        }
        C5001xF c5001xF = (C5001xF) obj;
        return this.f5213a == c5001xF.f5213a && AbstractC2995aW.i(this.b, c5001xF.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f5213a ? 1231 : 1237) * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IF
    public final String toString() {
        String str = this.b;
        if (!this.f5213a) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        V90.a(sb, str);
        String string = sb.toString();
        AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
