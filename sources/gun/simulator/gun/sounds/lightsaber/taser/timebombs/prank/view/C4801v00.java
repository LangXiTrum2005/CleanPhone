package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Locale;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4801v00 implements K00 {
    public static final int[] h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J00 f5113a;
    public final boolean b;
    public final int c;
    public InterfaceC4326pd0 d;
    public long e;
    public long f;
    public int g;

    public C4801v00(J00 j00) {
        this.f5113a = j00;
        String str = j00.c.l;
        str.getClass();
        this.b = MimeTypes.AUDIO_AMR_WB.equals(str);
        this.c = j00.b;
        this.e = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.g = -1;
        this.f = 0L;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void a(InterfaceC4353pt interfaceC4353pt, int i2) {
        InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(i2, 1);
        this.d = interfaceC4326pd0Track;
        interfaceC4326pd0Track.e(this.f5113a.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void b(long j) {
        this.e = j;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void c(int i2, long j, JT jt, boolean z) {
        FW.t(this.d);
        int i3 = this.g;
        if (i3 != -1 && i2 != G00.a(i3)) {
            int i4 = Ug0.f3833a;
            Locale locale = Locale.US;
            AbstractC4038mJ.f();
        }
        jt.F(1);
        int iC = (jt.c() >> 3) & 15;
        boolean z2 = (iC >= 0 && iC <= 8) || iC == 15;
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        boolean z3 = this.b;
        sb.append(z3 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(iC);
        FW.i(z2, sb.toString());
        int i5 = z3 ? i[iC] : h[iC];
        int iA = jt.a();
        FW.i(iA == i5, "compound payload not supported currently");
        this.d.d(iA, jt);
        this.d.a(FW.i0(this.f, j, this.e, this.c), 1, iA, 0, null);
        this.g = i2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void seek(long j, long j2) {
        this.e = j;
        this.f = j2;
    }
}
