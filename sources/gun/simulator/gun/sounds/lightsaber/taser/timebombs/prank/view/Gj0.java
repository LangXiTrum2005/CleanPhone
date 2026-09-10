package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes2.dex */
public final class Gj0 implements InterfaceC4177nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC4353pt f3134a;
    public InterfaceC4326pd0 b;
    public Ej0 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Serializable] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        ?? r3;
        int iY;
        FW.t(this.b);
        int i = Ug0.f3833a;
        int i2 = this.c;
        if (i2 == 0) {
            FW.s(interfaceC4265ot.getPosition() == 0);
            int i3 = this.f;
            if (i3 != -1) {
                interfaceC4265ot.skipFully(i3);
                this.c = 4;
            } else {
                if (!FW.l(interfaceC4265ot)) {
                    throw KT.a("Unsupported or unrecognized wav file type.", null);
                }
                interfaceC4265ot.skipFully((int) (interfaceC4265ot.getPeekPosition() - interfaceC4265ot.getPosition()));
                this.c = 1;
            }
            return 0;
        }
        long jI = -1;
        if (i2 == 1) {
            JT jt = new JT(8);
            C2868Wu c2868WuD = C2868Wu.d(interfaceC4265ot, jt);
            if (c2868WuD.f3945a != 1685272116) {
                interfaceC4265ot.resetPeekPosition();
            } else {
                interfaceC4265ot.advancePeekPosition(8);
                jt.E(0);
                interfaceC4265ot.peekFully(jt.f3266a, 0, 8);
                jI = jt.i();
                interfaceC4265ot.skipFully(((int) c2868WuD.b) + 8);
            }
            this.d = jI;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException();
                }
                FW.s(this.g != -1);
                long position = this.g - interfaceC4265ot.getPosition();
                Ej0 ej0 = this.e;
                ej0.getClass();
                return ej0.a(interfaceC4265ot, position) ? -1 : 0;
            }
            interfaceC4265ot.resetPeekPosition();
            C2868Wu c2868WuZ = FW.Z(1684108385, interfaceC4265ot, new JT(8));
            interfaceC4265ot.skipFully(8);
            Pair pairCreate = Pair.create(Long.valueOf(interfaceC4265ot.getPosition()), Long.valueOf(c2868WuZ.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.g = ((long) this.f) + jLongValue;
            long length = interfaceC4265ot.getLength();
            if (length != -1 && this.g > length) {
                AbstractC4038mJ.f();
                this.g = length;
            }
            Ej0 ej1 = this.e;
            ej1.getClass();
            ej1.b(this.f, this.g);
            this.c = 4;
            return 0;
        }
        JT jt2 = new JT(16);
        long j2 = FW.Z(1718449184, interfaceC4265ot, jt2).b;
        FW.s(j2 >= 16);
        interfaceC4265ot.peekFully(jt2.f3266a, 0, 16);
        jt2.E(0);
        int iM = jt2.m();
        int iM2 = jt2.m();
        int iL = jt2.l();
        int iL2 = jt2.l();
        int iM3 = jt2.m();
        int iM4 = jt2.m();
        int i4 = ((int) j2) - 16;
        if (i4 > 0) {
            byte[] bArr = new byte[i4];
            interfaceC4265ot.peekFully(bArr, 0, i4);
            r3 = bArr;
        } else {
            r3 = Ug0.e;
        }
        interfaceC4265ot.skipFully((int) (interfaceC4265ot.getPeekPosition() - interfaceC4265ot.getPosition()));
        C3219d0 c3219d0 = new C3219d0();
        c3219d0.f4253a = iM;
        c3219d0.c = iM2;
        c3219d0.d = iL;
        c3219d0.e = iL2;
        c3219d0.f = iM3;
        c3219d0.g = iM4;
        c3219d0.b = r3;
        if (iM == 17) {
            this.e = new Dj0(this.f3134a, this.b, c3219d0);
        } else if (iM == 6) {
            this.e = new Fj0(this.f3134a, this.b, c3219d0, MimeTypes.AUDIO_ALAW, -1);
        } else if (iM == 7) {
            this.e = new Fj0(this.f3134a, this.b, c3219d0, MimeTypes.AUDIO_MLAW, -1);
        } else {
            if (iM == 1) {
                iY = Ug0.y(iM4);
            } else if (iM == 3) {
                iY = iM4 != 32 ? 0 : 4;
            } else if (iM != 65534) {
                iY = 0;
            } else {
                iY = Ug0.y(iM4);
            }
            if (iY == 0) {
                throw KT.c("Unsupported WAV format type: " + c3219d0.f4253a);
            }
            this.e = new Fj0(this.f3134a, this.b, c3219d0, MimeTypes.AUDIO_RAW, iY);
        }
        this.c = 3;
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        return FW.l(interfaceC4265ot);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.f3134a = interfaceC4353pt;
        this.b = interfaceC4353pt.track(0, 1);
        interfaceC4353pt.endTracks();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        Ej0 ej0 = this.e;
        if (ej0 != null) {
            ej0.c(j2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
