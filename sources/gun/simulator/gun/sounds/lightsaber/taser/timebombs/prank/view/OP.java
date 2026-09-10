package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class OP {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3712id0 f3504a;
    public final C4414qd0 b;
    public final InterfaceC4326pd0 c;
    public final C3626he0 d;
    public int e;

    public OP(C3712id0 c3712id0, C4414qd0 c4414qd0, InterfaceC4326pd0 interfaceC4326pd0) {
        this.f3504a = c3712id0;
        this.b = c4414qd0;
        this.c = interfaceC4326pd0;
        this.d = MimeTypes.AUDIO_TRUEHD.equals(c3712id0.f.l) ? new C3626he0() : null;
    }
}
