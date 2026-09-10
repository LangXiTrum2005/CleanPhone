package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.z00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5153z00 implements InterfaceC4177nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K00 f5310a;
    public final JT b;
    public final JT c;
    public final int d;
    public final Object e;
    public final I00 f;
    public InterfaceC4353pt g;
    public boolean h;
    public volatile long i;
    public volatile int j;
    public boolean k;
    public long l;
    public long m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0016  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C5153z00(J00 j00, int i) {
        byte b;
        K00 a00;
        K00 k00;
        this.d = i;
        String str = j00.c.l;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (!str.equals(MimeTypes.VIDEO_H263)) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1662541442:
                if (!str.equals("video/hevc")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1606874997:
                if (!str.equals(MimeTypes.AUDIO_AMR_WB)) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -53558318:
                if (!str.equals(MimeTypes.AUDIO_AAC)) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 187078296:
                if (!str.equals(MimeTypes.AUDIO_AC3)) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 187094639:
                if (!str.equals(MimeTypes.AUDIO_RAW)) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 1187890754:
                if (!str.equals(MimeTypes.VIDEO_MP4V)) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1331836730:
                if (!str.equals("video/avc")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1503095341:
                if (!str.equals(MimeTypes.AUDIO_AMR_NB)) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1504891608:
                if (!str.equals(MimeTypes.AUDIO_OPUS)) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 1599127256:
                if (!str.equals(MimeTypes.VIDEO_VP8)) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 1599127257:
                if (!str.equals(MimeTypes.VIDEO_VP9)) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case 1903231877:
                if (!str.equals(MimeTypes.AUDIO_ALAW)) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 1903589369:
                if (!str.equals(MimeTypes.AUDIO_MLAW)) {
                    b = -1;
                } else {
                    b = com.umeng.analytics.pro.cw.k;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                a00 = new A00(j00, 0);
                k00 = a00;
                break;
            case 1:
                a00 = new B00(j00, 1);
                k00 = a00;
                break;
            case 2:
            case 8:
                a00 = new C4801v00(j00);
                k00 = a00;
                break;
            case 3:
                a00 = j00.e.equals("MP4A-LATM") ? new C00(j00) : new C4625t00(j00);
                k00 = a00;
                break;
            case 4:
                a00 = new C4713u00(j00);
                k00 = a00;
                break;
            case 5:
            case 12:
            case 13:
                a00 = new L00(j00);
                k00 = a00;
                break;
            case 6:
                a00 = new D00(j00);
                k00 = a00;
                break;
            case 7:
                a00 = new B00(j00, 0);
                k00 = a00;
                break;
            case 9:
                a00 = new E00(j00);
                k00 = a00;
                break;
            case 10:
                a00 = new M00(j00);
                k00 = a00;
                break;
            case 11:
                a00 = new A00(j00, 1);
                k00 = a00;
                break;
            default:
                k00 = null;
                break;
        }
        k00.getClass();
        this.f5310a = k00;
        this.b = new JT(65507);
        this.c = new JT();
        this.e = new Object();
        this.f = new I00();
        this.i = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.j = -1;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) {
        byte[] bArr;
        this.g.getClass();
        int i = interfaceC4265ot.read(this.b.f3266a, 0, 65507);
        if (i == -1) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        this.b.E(0);
        this.b.D(i);
        JT jt = this.b;
        G00 g00 = null;
        if (jt.a() >= 12) {
            int iT = jt.t();
            byte b = (byte) (iT >> 6);
            byte b2 = (byte) (iT & 15);
            if (b == 2) {
                int iT2 = jt.t();
                boolean z = ((iT2 >> 7) & 1) == 1;
                byte b3 = (byte) (iT2 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                int iY = jt.y();
                long jU = jt.u();
                int iF = jt.f();
                byte[] bArr2 = G00.g;
                if (b2 > 0) {
                    bArr = new byte[b2 * 4];
                    for (int i2 = 0; i2 < b2; i2++) {
                        jt.d(bArr, i2 * 4, 4);
                    }
                } else {
                    bArr = bArr2;
                }
                byte[] bArr3 = new byte[jt.a()];
                jt.d(bArr3, 0, jt.a());
                F00 f00 = new F00();
                f00.f = bArr2;
                f00.g = bArr2;
                f00.f3049a = z;
                f00.b = b3;
                FW.h(iY >= 0 && iY <= 65535);
                f00.c = 65535 & iY;
                f00.d = jU;
                f00.e = iF;
                f00.f = bArr;
                f00.g = bArr3;
                g00 = new G00(f00);
            }
        }
        if (g00 == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - 30;
        this.f.c(g00, jElapsedRealtime);
        G00 g00D = this.f.d(j);
        if (g00D == null) {
            return 0;
        }
        if (!this.h) {
            if (this.i == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                this.i = g00D.d;
            }
            if (this.j == -1) {
                this.j = g00D.c;
            }
            this.f5310a.b(this.i);
            this.h = true;
        }
        synchronized (this.e) {
            try {
                if (!this.k) {
                    do {
                        JT jt2 = this.c;
                        byte[] bArr4 = g00D.f;
                        jt2.getClass();
                        jt2.C(bArr4, bArr4.length);
                        this.f5310a.c(g00D.c, g00D.d, this.c, g00D.f3098a);
                        g00D = this.f.d(j);
                    } while (g00D != null);
                } else if (this.l != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && this.m != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    this.f.e();
                    this.f5310a.seek(this.l, this.m);
                    this.k = false;
                    this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    this.m = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        throw new UnsupportedOperationException("RTP packets are transmitted in a packet stream do not support sniffing.");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.f5310a.a(interfaceC4353pt, this.d);
        interfaceC4353pt.endTracks();
        interfaceC4353pt.a(new C2946Zu(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET));
        this.g = interfaceC4353pt;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        synchronized (this.e) {
            try {
                if (!this.k) {
                    this.k = true;
                }
                this.l = j;
                this.m = j2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
