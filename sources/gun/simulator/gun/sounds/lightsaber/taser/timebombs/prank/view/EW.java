package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class EW implements InterfaceC4177nt {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public C2816Uu i;
    public InterfaceC4353pt j;
    public boolean k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mc0 f3025a = new Mc0(0);
    public final JT c = new JT(4096);
    public final SparseArray b = new SparseArray();
    public final CW d = new CW();

    /* JADX WARN: Code duplicated, block: B:103:0x0231  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) {
        InterfaceC2656Oq c2768Sy;
        long jC;
        long j;
        FW.t(this.j);
        long length = interfaceC4265ot.getLength();
        CW cw = this.d;
        int i = 1;
        if (length != -1 && !cw.c) {
            boolean z = cw.e;
            JT jt = cw.b;
            if (!z) {
                long length2 = interfaceC4265ot.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j2 = length2 - ((long) iMin);
                if (interfaceC4265ot.getPosition() != j2) {
                    c2868Wu.b = j2;
                } else {
                    jt.B(iMin);
                    interfaceC4265ot.resetPeekPosition();
                    interfaceC4265ot.peekFully(jt.f3266a, 0, iMin);
                    int i2 = jt.b;
                    int i3 = jt.c - 4;
                    while (true) {
                        if (i3 < i2) {
                            j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                            break;
                        }
                        if (CW.b(i3, jt.f3266a) == 442) {
                            jt.E(i3 + 4);
                            long jC2 = CW.c(jt);
                            if (jC2 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                j = jC2;
                                break;
                            }
                        }
                        i3--;
                    }
                    cw.g = j;
                    cw.e = true;
                    i = 0;
                }
            } else {
                if (cw.g == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    cw.a(interfaceC4265ot);
                    return 0;
                }
                if (cw.d) {
                    long j3 = cw.f;
                    if (j3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        cw.a(interfaceC4265ot);
                        return 0;
                    }
                    Mc0 mc0 = cw.f2925a;
                    long jB = mc0.b(cw.g) - mc0.b(j3);
                    cw.h = jB;
                    if (jB < 0) {
                        AbstractC4038mJ.f();
                        cw.h = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                    }
                    cw.a(interfaceC4265ot);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, interfaceC4265ot.getLength());
                long j4 = 0;
                if (interfaceC4265ot.getPosition() != j4) {
                    c2868Wu.b = j4;
                } else {
                    jt.B(iMin2);
                    interfaceC4265ot.resetPeekPosition();
                    interfaceC4265ot.peekFully(jt.f3266a, 0, iMin2);
                    int i4 = jt.b;
                    int i5 = jt.c;
                    while (true) {
                        if (i4 >= i5 - 3) {
                            jC = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                            break;
                        }
                        if (CW.b(i4, jt.f3266a) == 442) {
                            jt.E(i4 + 4);
                            jC = CW.c(jt);
                            if (jC != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                break;
                            }
                        }
                        i4++;
                    }
                    cw.f = jC;
                    cw.d = true;
                    i = 0;
                }
            }
            return i;
        }
        if (!this.k) {
            this.k = true;
            long j5 = cw.h;
            if (j5 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                C2816Uu c2816Uu = new C2816Uu(new Qm0(26), new C3491g4(cw.f2925a, 0), j5, j5 + 1, 0L, length, 188L, 1000);
                this.i = c2816Uu;
                this.j.a(c2816Uu.f5330a);
            } else {
                this.j.a(new C2946Zu(j5));
            }
        }
        C2816Uu c2816Uu2 = this.i;
        if (c2816Uu2 != null && c2816Uu2.c != null) {
            return c2816Uu2.a(interfaceC4265ot, c2868Wu);
        }
        interfaceC4265ot.resetPeekPosition();
        long peekPosition = length != -1 ? length - interfaceC4265ot.getPeekPosition() : -1L;
        if (peekPosition != -1 && peekPosition < 4) {
            return -1;
        }
        JT jt2 = this.c;
        if (!interfaceC4265ot.peekFully(jt2.f3266a, 0, 4, true)) {
            return -1;
        }
        jt2.E(0);
        int iF = jt2.f();
        if (iF == 441) {
            return -1;
        }
        if (iF == 442) {
            interfaceC4265ot.peekFully(jt2.f3266a, 0, 10);
            jt2.E(9);
            interfaceC4265ot.skipFully((jt2.t() & 7) + 14);
            return 0;
        }
        if (iF == 443) {
            interfaceC4265ot.peekFully(jt2.f3266a, 0, 2);
            jt2.E(0);
            interfaceC4265ot.skipFully(jt2.y() + 6);
            return 0;
        }
        if (((iF & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            interfaceC4265ot.skipFully(1);
            return 0;
        }
        int i6 = iF & 255;
        SparseArray sparseArray = this.b;
        DW dw = (DW) sparseArray.get(i6);
        if (!this.e) {
            if (dw == null) {
                InterfaceC2656Oq interfaceC2656Oq = null;
                if (i6 == 189) {
                    c2768Sy = new C3130c0(null);
                    this.f = true;
                    this.h = interfaceC4265ot.getPosition();
                } else if ((iF & 224) == 192) {
                    c2768Sy = new QP(null);
                    this.f = true;
                    this.h = interfaceC4265ot.getPosition();
                } else if ((iF & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    c2768Sy = new C2768Sy(null);
                    this.g = true;
                    this.h = interfaceC4265ot.getPosition();
                } else if (interfaceC2656Oq != null) {
                    interfaceC2656Oq.c(this.j, new C4416qe0(i6, 256));
                    dw = new DW(interfaceC2656Oq, this.f3025a);
                    sparseArray.put(i6, dw);
                }
                interfaceC2656Oq = c2768Sy;
                if (interfaceC2656Oq != null) {
                    interfaceC2656Oq.c(this.j, new C4416qe0(i6, 256));
                    dw = new DW(interfaceC2656Oq, this.f3025a);
                    sparseArray.put(i6, dw);
                }
            }
            if (interfaceC4265ot.getPosition() > ((this.f && this.g) ? this.h + PlaybackStateCompat.ACTION_PLAY_FROM_URI : PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                this.e = true;
                this.j.endTracks();
            }
        }
        interfaceC4265ot.peekFully(jt2.f3266a, 0, 2);
        jt2.E(0);
        int iY = jt2.y() + 6;
        if (dw == null) {
            interfaceC4265ot.skipFully(iY);
            return 0;
        }
        jt2.B(iY);
        interfaceC4265ot.readFully(jt2.f3266a, 0, iY);
        jt2.E(6);
        Uh0 uh0 = dw.c;
        jt2.d(uh0.d, 0, 3);
        uh0.p(0);
        uh0.s(8);
        dw.d = uh0.h();
        dw.e = uh0.h();
        uh0.s(6);
        jt2.d(uh0.d, 0, uh0.i(8));
        uh0.p(0);
        dw.g = 0L;
        if (dw.d) {
            uh0.s(4);
            long jI = ((long) uh0.i(3)) << 30;
            uh0.s(1);
            long jI2 = jI | ((long) (uh0.i(15) << 15));
            uh0.s(1);
            long jI3 = jI2 | ((long) uh0.i(15));
            uh0.s(1);
            boolean z2 = dw.f;
            Mc0 mc1 = dw.b;
            if (!z2 && dw.e) {
                uh0.s(4);
                long jI4 = ((long) uh0.i(3)) << 30;
                uh0.s(1);
                long jI5 = jI4 | ((long) (uh0.i(15) << 15));
                uh0.s(1);
                long jI6 = jI5 | ((long) uh0.i(15));
                uh0.s(1);
                mc1.b(jI6);
                dw.f = true;
            }
            dw.g = mc1.b(jI3);
        }
        long j6 = dw.g;
        InterfaceC2656Oq interfaceC2656Oq2 = dw.f2972a;
        interfaceC2656Oq2.b(4, j6);
        interfaceC2656Oq2.a(jt2);
        interfaceC2656Oq2.packetFinished();
        jt2.D(jt2.f3266a.length);
        return 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        C2938Zm c2938Zm = (C2938Zm) interfaceC4265ot;
        c2938Zm.peekFully(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        c2938Zm.advancePeekPosition(bArr[13] & 7, false);
        c2938Zm.peekFully(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.j = interfaceC4353pt;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        Mc0 mc0 = this.f3025a;
        boolean z = mc0.d() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        if (!z) {
            long jC = mc0.c();
            if (jC != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && jC != 0 && jC != j2) {
                mc0.e(j2);
            }
        } else if (z) {
            mc0.e(j2);
        }
        C2816Uu c2816Uu = this.i;
        if (c2816Uu != null) {
            c2816Uu.c(j2);
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.b;
            if (i >= sparseArray.size()) {
                return;
            }
            DW dw = (DW) sparseArray.valueAt(i);
            dw.f = false;
            dw.f2972a.seek();
            i++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
