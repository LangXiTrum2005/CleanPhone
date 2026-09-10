package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class B00 implements K00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2848a;
    public final JT b;
    public final JT c;
    public final J00 d;
    public InterfaceC4326pd0 e;
    public int f;
    public long g;
    public int h;
    public int i;
    public long j;

    public B00(J00 j00, int i) {
        this.f2848a = i;
        if (i != 1) {
            this.c = new JT(AbstractC5188zQ.f5325a);
            this.d = j00;
            this.b = new JT();
            this.g = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            this.h = -1;
            return;
        }
        this.b = new JT();
        this.c = new JT(AbstractC5188zQ.f5325a);
        this.d = j00;
        this.g = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.h = -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void a(InterfaceC4353pt interfaceC4353pt, int i) {
        int i2 = this.f2848a;
        J00 j00 = this.d;
        switch (i2) {
            case 0:
                InterfaceC4326pd0 interfaceC4326pd0Track = interfaceC4353pt.track(i, 2);
                this.e = interfaceC4326pd0Track;
                int i3 = Ug0.f3833a;
                interfaceC4326pd0Track.e(j00.c);
                break;
            default:
                InterfaceC4326pd0 interfaceC4326pd0Track2 = interfaceC4353pt.track(i, 2);
                this.e = interfaceC4326pd0Track2;
                interfaceC4326pd0Track2.e(j00.c);
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void c(int i, long j, JT jt, boolean z) throws KT {
        int i2 = this.f2848a;
        JT jt2 = this.b;
        int i3 = 1;
        switch (i2) {
            case 0:
                try {
                    int i4 = jt.f3266a[0] & 31;
                    FW.t(this.e);
                    if (i4 > 0 && i4 < 24) {
                        int iA = jt.a();
                        this.i = d() + this.i;
                        this.e.d(iA, jt);
                        this.i += iA;
                        this.f = (jt.f3266a[0] & 31) != 5 ? 0 : 1;
                    } else if (i4 == 24) {
                        jt.t();
                        while (jt.a() > 4) {
                            int iY = jt.y();
                            this.i = d() + this.i;
                            this.e.d(iY, jt);
                            this.i += iY;
                        }
                        this.f = 0;
                    } else {
                        if (i4 != 28) {
                            throw KT.b(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i4)), null);
                        }
                        byte[] bArr = jt.f3266a;
                        byte b = bArr[0];
                        byte b2 = bArr[1];
                        int i5 = (b & 224) | (b2 & 31);
                        boolean z2 = (b2 & 128) > 0;
                        boolean z3 = (b2 & 64) > 0;
                        if (z2) {
                            this.i = d() + this.i;
                            byte[] bArr2 = jt.f3266a;
                            bArr2[1] = (byte) i5;
                            jt2.getClass();
                            jt2.C(bArr2, bArr2.length);
                            jt2.E(1);
                        } else if (i != G00.a(this.h)) {
                            int i6 = Ug0.f3833a;
                            Locale locale = Locale.US;
                            AbstractC4038mJ.f();
                        } else {
                            byte[] bArr3 = jt.f3266a;
                            jt2.getClass();
                            jt2.C(bArr3, bArr3.length);
                            jt2.E(2);
                        }
                        int iA2 = jt2.a();
                        this.e.d(iA2, jt2);
                        this.i += iA2;
                        if (z3) {
                            this.f = (i5 & 31) != 5 ? 0 : 1;
                        }
                    }
                    if (z) {
                        if (this.g == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            this.g = j;
                        }
                        this.e.a(FW.i0(this.j, j, this.g, 90000), this.f, this.i, 0, null);
                        this.i = 0;
                    }
                    this.h = i;
                    return;
                } catch (IndexOutOfBoundsException e) {
                    throw KT.b(null, e);
                }
            default:
                byte[] bArr4 = jt.f3266a;
                if (bArr4.length == 0) {
                    throw KT.b("Empty RTP data packet.", null);
                }
                int i7 = (bArr4[0] >> 1) & 63;
                FW.t(this.e);
                JT jt3 = this.c;
                if (i7 >= 0 && i7 < 48) {
                    int iA3 = jt.a();
                    int i8 = this.i;
                    jt3.E(0);
                    int iA4 = jt3.a();
                    InterfaceC4326pd0 interfaceC4326pd0 = this.e;
                    interfaceC4326pd0.getClass();
                    interfaceC4326pd0.d(iA4, jt3);
                    this.i = iA4 + i8;
                    this.e.d(iA3, jt);
                    this.i += iA3;
                    int i9 = (jt.f3266a[0] >> 1) & 63;
                    if (i9 != 19 && i9 != 20) {
                        i3 = 0;
                    }
                    this.f = i3;
                } else {
                    if (i7 == 48) {
                        throw new UnsupportedOperationException("need to implement processAggregationPacket");
                    }
                    if (i7 != 49) {
                        throw KT.b(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i7)), null);
                    }
                    byte[] bArr5 = jt.f3266a;
                    if (bArr5.length < 3) {
                        throw KT.b("Malformed FU header.", null);
                    }
                    int i10 = bArr5[1] & 7;
                    byte b3 = bArr5[2];
                    int i11 = b3 & 63;
                    boolean z4 = (b3 & 128) > 0;
                    boolean z5 = (b3 & 64) > 0;
                    if (z4) {
                        int i12 = this.i;
                        jt3.E(0);
                        int iA5 = jt3.a();
                        InterfaceC4326pd0 interfaceC4326pd1 = this.e;
                        interfaceC4326pd1.getClass();
                        interfaceC4326pd1.d(iA5, jt3);
                        this.i = iA5 + i12;
                        byte[] bArr6 = jt.f3266a;
                        bArr6[1] = (byte) ((i11 << 1) & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
                        bArr6[2] = (byte) i10;
                        jt2.getClass();
                        jt2.C(bArr6, bArr6.length);
                        jt2.E(1);
                    } else if (i != (this.h + 1) % 65535) {
                        int i13 = Ug0.f3833a;
                        Locale locale2 = Locale.US;
                        AbstractC4038mJ.f();
                    } else {
                        jt2.getClass();
                        jt2.C(bArr5, bArr5.length);
                        jt2.E(3);
                    }
                    int iA6 = jt2.a();
                    this.e.d(iA6, jt2);
                    this.i += iA6;
                    if (z5) {
                        if (i11 != 19 && i11 != 20) {
                            i3 = 0;
                        }
                        this.f = i3;
                    }
                }
                if (z) {
                    if (this.g == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        this.g = j;
                    }
                    this.e.a(FW.i0(this.j, j, this.g, 90000), this.f, this.i, 0, null);
                    this.i = 0;
                }
                this.h = i;
                return;
        }
    }

    public final int d() {
        JT jt = this.c;
        jt.E(0);
        int iA = jt.a();
        InterfaceC4326pd0 interfaceC4326pd0 = this.e;
        interfaceC4326pd0.getClass();
        interfaceC4326pd0.d(iA, jt);
        return iA;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void seek(long j, long j2) {
        switch (this.f2848a) {
            case 0:
                this.g = j;
                this.i = 0;
                this.j = j2;
                break;
            default:
                this.g = j;
                this.i = 0;
                this.j = j2;
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K00
    public final void b(long j) {
    }
}
