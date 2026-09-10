package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3783jS implements InterfaceC4177nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC4353pt f4553a;
    public K90 b;
    public boolean c;

    /* JADX WARN: Code duplicated, block: B:66:0x0177  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        JT jt;
        int i;
        byte[] bArr;
        FW.t(this.f4553a);
        if (this.b == null) {
            if (!c(interfaceC4265ot)) {
                throw KT.a("Failed to determine bitstream type", null);
            }
            interfaceC4265ot.resetPeekPosition();
        }
        if (!this.c) {
            InterfaceC4326pd0 interfaceC4326pd0Track = this.f4553a.track(0, 1);
            this.f4553a.endTracks();
            K90 k90 = this.b;
            k90.c = this.f4553a;
            k90.b = interfaceC4326pd0Track;
            k90.d(true);
            this.c = true;
        }
        K90 k91 = this.b;
        FW.t(k91.b);
        int i2 = Ug0.f3833a;
        int i3 = k91.h;
        C3871kS c3871kS = k91.f3305a;
        if (i3 == 0) {
            while (c3871kS.b(interfaceC4265ot)) {
                long position = interfaceC4265ot.getPosition();
                long j = k91.f;
                k91.k = position - j;
                C3491g4 c3491g4 = k91.j;
                JT jt2 = c3871kS.b;
                if (!k91.c(jt2, j, c3491g4)) {
                    C4619sw c4619sw = (C4619sw) k91.j.b;
                    k91.i = c4619sw.z;
                    if (!k91.m) {
                        k91.b.e(c4619sw);
                        k91.m = true;
                    }
                    InterfaceC4047mS interfaceC4047mS = (InterfaceC4047mS) k91.j.c;
                    if (interfaceC4047mS == null) {
                        if (interfaceC4265ot.getLength() == -1) {
                            k91.d = new G7();
                        } else {
                            C3959lS c3959lS = c3871kS.f4598a;
                            boolean z = (c3959lS.f4646a & 4) != 0;
                            long j2 = k91.f;
                            long length = interfaceC4265ot.getLength();
                            long j3 = c3959lS.d + c3959lS.e;
                            long j4 = c3959lS.b;
                            jt = jt2;
                            i = 2;
                            k91.d = new C2342Cn(k91, j2, length, j3, j4, z);
                        }
                        k91.h = i;
                        bArr = jt.f3266a;
                        if (bArr.length != 65025) {
                            jt.C(Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, jt.c)), jt.c);
                        }
                        return 0;
                    }
                    k91.d = interfaceC4047mS;
                    jt = jt2;
                    i = 2;
                    k91.h = i;
                    bArr = jt.f3266a;
                    if (bArr.length != 65025) {
                        jt.C(Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, jt.c)), jt.c);
                    }
                    return 0;
                }
                k91.f = interfaceC4265ot.getPosition();
            }
            k91.h = 3;
        } else {
            if (i3 == 1) {
                interfaceC4265ot.skipFully((int) k91.f);
                k91.h = 2;
                return 0;
            }
            if (i3 == 2) {
                long jL = k91.d.l(interfaceC4265ot);
                if (jL >= 0) {
                    c2868Wu.b = jL;
                    return 1;
                }
                if (jL < -1) {
                    k91.a(-(jL + 2));
                }
                if (!k91.l) {
                    O30 o30CreateSeekMap = k91.d.createSeekMap();
                    FW.t(o30CreateSeekMap);
                    k91.c.a(o30CreateSeekMap);
                    k91.l = true;
                }
                if (k91.k > 0 || c3871kS.b(interfaceC4265ot)) {
                    k91.k = 0L;
                    JT jt3 = c3871kS.b;
                    long jB = k91.b(jt3);
                    if (jB >= 0) {
                        long j5 = k91.g;
                        if (j5 + jB >= k91.e) {
                            long j6 = (j5 * 1000000) / ((long) k91.i);
                            k91.b.d(jt3.c, jt3);
                            k91.b.a(j6, 1, jt3.c, 0, null);
                            k91.e = -1L;
                        }
                    }
                    k91.g += jB;
                    return 0;
                }
                k91.h = 3;
            } else if (i3 != 3) {
                throw new IllegalStateException();
            }
        }
        return -1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        try {
            return c(interfaceC4265ot);
        } catch (KT unused) {
            return false;
        }
    }

    public final boolean c(InterfaceC4265ot interfaceC4265ot) {
        C3959lS c3959lS = new C3959lS();
        if (c3959lS.a(interfaceC4265ot, true) && (c3959lS.f4646a & 2) == 2) {
            int iMin = Math.min(c3959lS.e, 8);
            JT jt = new JT(iMin);
            interfaceC4265ot.peekFully(jt.f3266a, 0, iMin);
            jt.E(0);
            if (jt.a() >= 5 && jt.t() == 127 && jt.u() == 1179402563) {
                this.b = new C2920Yu();
            } else {
                jt.E(0);
                try {
                    if (Zh0.d(1, jt, true)) {
                        this.b = new Wh0();
                    } else {
                        jt.E(0);
                        if (ZS.e(jt, ZS.o)) {
                            this.b = new ZS();
                        }
                    }
                } catch (KT unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.f4553a = interfaceC4353pt;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        K90 k90 = this.b;
        if (k90 != null) {
            C3871kS c3871kS = k90.f3305a;
            C3959lS c3959lS = c3871kS.f4598a;
            c3959lS.f4646a = 0;
            c3959lS.b = 0L;
            c3959lS.c = 0;
            c3959lS.d = 0;
            c3959lS.e = 0;
            c3871kS.b.B(0);
            c3871kS.c = -1;
            c3871kS.e = false;
            if (j == 0) {
                k90.d(!k90.l);
                return;
            }
            if (k90.h != 0) {
                long j3 = (((long) k90.i) * j2) / 1000000;
                k90.e = j3;
                InterfaceC4047mS interfaceC4047mS = k90.d;
                int i = Ug0.f3833a;
                interfaceC4047mS.startSeek(j3);
                k90.h = 2;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
