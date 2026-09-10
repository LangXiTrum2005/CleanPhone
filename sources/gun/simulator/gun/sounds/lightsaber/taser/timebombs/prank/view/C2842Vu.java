package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2842Vu implements InterfaceC4177nt {
    public InterfaceC4353pt e;
    public InterfaceC4326pd0 f;
    public Metadata h;
    public C3036av i;
    public int j;
    public int k;
    public C2816Uu l;
    public int m;
    public long n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3898a = new byte[42];
    public final JT b = new JT(new byte[32768], 0);
    public final boolean c = false;
    public final C2868Wu d = new C2868Wu(0);
    public int g = 0;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        C3036av c3036av;
        O30 c2946Zu;
        long j;
        long j2;
        long j3;
        boolean zM;
        int i = this.g;
        int i2 = 0;
        Object obj = null;
        boolean z = true;
        if (i == 0) {
            boolean z2 = !this.c;
            interfaceC4265ot.resetPeekPosition();
            long peekPosition = interfaceC4265ot.getPeekPosition();
            Metadata metadataE = new Wm0(22).E(interfaceC4265ot, z2 ? null : C3241dC.h);
            Metadata metadata = (metadataE == null || metadataE.f() == 0) ? null : metadataE;
            interfaceC4265ot.skipFully((int) (interfaceC4265ot.getPeekPosition() - peekPosition));
            this.h = metadata;
            this.g = 1;
            return 0;
        }
        int i3 = 2;
        byte[] bArr = this.f3898a;
        if (i == 1) {
            interfaceC4265ot.peekFully(bArr, 0, bArr.length);
            interfaceC4265ot.resetPeekPosition();
            this.g = 2;
            return 0;
        }
        int i4 = 3;
        if (i == 2) {
            JT jt = new JT(4);
            interfaceC4265ot.readFully(jt.f3266a, 0, 4);
            if (jt.u() != 1716281667) {
                throw KT.a("Failed to read FLAC stream marker.", null);
            }
            this.g = 3;
            return 0;
        }
        int i5 = 7;
        if (i != 3) {
            long j4 = 0;
            if (i == 4) {
                interfaceC4265ot.resetPeekPosition();
                JT jt2 = new JT(2);
                interfaceC4265ot.peekFully(jt2.f3266a, 0, 2);
                int iY = jt2.y();
                if ((iY >> 2) != 16382) {
                    interfaceC4265ot.resetPeekPosition();
                    throw KT.a("First frame does not start with sync code.", null);
                }
                interfaceC4265ot.resetPeekPosition();
                this.k = iY;
                InterfaceC4353pt interfaceC4353pt = this.e;
                int i6 = Ug0.f3833a;
                long position = interfaceC4265ot.getPosition();
                long length = interfaceC4265ot.getLength();
                this.i.getClass();
                C3036av c3036av2 = this.i;
                if (c3036av2.k != null) {
                    c2946Zu = new C2946Zu(c3036av2, position, 0);
                } else if (length == -1 || c3036av2.j <= 0) {
                    c2946Zu = new C2946Zu(c3036av2.b());
                } else {
                    int i7 = this.k;
                    Md0 md0 = new Md0(c3036av2, 20);
                    A70 a70 = new A70(c3036av2, i7);
                    long jB = c3036av2.b();
                    int i8 = c3036av2.c;
                    int i9 = c3036av2.d;
                    if (i9 > 0) {
                        j = (((long) i9) + ((long) i8)) / 2;
                        j2 = 1;
                    } else {
                        int i10 = c3036av2.b;
                        int i11 = c3036av2.f4147a;
                        j = ((((i11 != i10 || i11 <= 0) ? PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM : i11) * ((long) c3036av2.g)) * ((long) c3036av2.h)) / 8;
                        j2 = 64;
                    }
                    C2816Uu c2816Uu = new C2816Uu(md0, a70, jB, c3036av2.j, position, length, j + j2, Math.max(6, i8));
                    this.l = c2816Uu;
                    c2946Zu = c2816Uu.f5330a;
                }
                interfaceC4353pt.a(c2946Zu);
                this.g = 5;
                return 0;
            }
            if (i != 5) {
                throw new IllegalStateException();
            }
            this.f.getClass();
            this.i.getClass();
            C2816Uu c2816Uu2 = this.l;
            if (c2816Uu2 != null && c2816Uu2.c != null) {
                return c2816Uu2.a(interfaceC4265ot, c2868Wu);
            }
            if (this.n == -1) {
                C3036av c3036av3 = this.i;
                interfaceC4265ot.resetPeekPosition();
                interfaceC4265ot.advancePeekPosition(1);
                byte[] bArr2 = new byte[1];
                interfaceC4265ot.peekFully(bArr2, 0, 1);
                boolean z3 = (bArr2[0] & 1) == 1;
                interfaceC4265ot.advancePeekPosition(2);
                i5 = z3 ? 7 : 6;
                JT jt3 = new JT(i5);
                byte[] bArr3 = jt3.f3266a;
                int i12 = 0;
                while (i12 < i5) {
                    int iF = interfaceC4265ot.f(bArr3, i12, i5 - i12);
                    if (iF == -1) {
                        break;
                    }
                    i12 += iF;
                }
                jt3.D(i12);
                interfaceC4265ot.resetPeekPosition();
                try {
                    long jZ = jt3.z();
                    if (!z3) {
                        jZ *= (long) c3036av3.b;
                    }
                    j4 = jZ;
                } catch (NumberFormatException unused) {
                    z = false;
                }
                if (!z) {
                    throw KT.a(null, null);
                }
                this.n = j4;
                return 0;
            }
            JT jt4 = this.b;
            int i13 = jt4.c;
            if (i13 < 32768) {
                int i14 = interfaceC4265ot.read(jt4.f3266a, i13, 32768 - i13);
                z = i14 == -1;
                if (!z) {
                    jt4.D(i13 + i14);
                } else if (jt4.a() == 0) {
                    long j5 = this.n * 1000000;
                    C3036av c3036av4 = this.i;
                    int i15 = Ug0.f3833a;
                    this.f.a(j5 / ((long) c3036av4.e), 1, this.m, 0, null);
                    return -1;
                }
            } else {
                z = false;
            }
            int i16 = jt4.b;
            int i17 = this.m;
            int i18 = this.j;
            if (i17 < i18) {
                jt4.F(Math.min(i18 - i17, jt4.a()));
            }
            this.i.getClass();
            int i19 = jt4.b;
            while (true) {
                int i20 = jt4.c - 16;
                C2868Wu c2868Wu2 = this.d;
                if (i19 > i20) {
                    if (z) {
                        while (true) {
                            int i21 = jt4.c;
                            if (i19 <= i21 - this.j) {
                                jt4.E(i19);
                                try {
                                    zM = AbstractC2340Cl.m(jt4, this.i, this.k, c2868Wu2);
                                } catch (IndexOutOfBoundsException unused2) {
                                    zM = false;
                                }
                                if (jt4.b <= jt4.c && zM) {
                                    jt4.E(i19);
                                    j3 = c2868Wu2.b;
                                    break;
                                }
                                i19++;
                            } else {
                                jt4.E(i21);
                            }
                        }
                    } else {
                        jt4.E(i19);
                    }
                    j3 = -1;
                    break;
                }
                jt4.E(i19);
                if (AbstractC2340Cl.m(jt4, this.i, this.k, c2868Wu2)) {
                    jt4.E(i19);
                    j3 = c2868Wu2.b;
                    break;
                }
                i19++;
            }
            int i22 = jt4.b - i16;
            jt4.E(i16);
            this.f.d(i22, jt4);
            int i23 = this.m + i22;
            this.m = i23;
            if (j3 != -1) {
                long j6 = this.n * 1000000;
                C3036av c3036av5 = this.i;
                int i24 = Ug0.f3833a;
                this.f.a(j6 / ((long) c3036av5.e), 1, i23, 0, null);
                this.m = 0;
                this.n = j3;
            }
            if (jt4.a() >= 16) {
                return 0;
            }
            int iA = jt4.a();
            byte[] bArr4 = jt4.f3266a;
            System.arraycopy(bArr4, jt4.b, bArr4, 0, iA);
            jt4.E(0);
            jt4.D(iA);
            return 0;
        }
        C3036av c3036av6 = this.i;
        while (true) {
            interfaceC4265ot.resetPeekPosition();
            Uh0 uh0 = new Uh0(new byte[4], i3, obj);
            interfaceC4265ot.peekFully(uh0.d, i2, 4);
            boolean zH = uh0.h();
            int i25 = uh0.i(i5);
            int i26 = uh0.i(24) + 4;
            if (i25 == 0) {
                byte[] bArr5 = new byte[38];
                interfaceC4265ot.readFully(bArr5, i2, 38);
                c3036av6 = new C3036av(bArr5, 4);
            } else {
                if (c3036av6 == null) {
                    throw new IllegalArgumentException();
                }
                if (i25 == i4) {
                    JT jt5 = new JT(i26);
                    interfaceC4265ot.readFully(jt5.f3266a, i2, i26);
                    c3036av6 = new C3036av(c3036av6.f4147a, c3036av6.b, c3036av6.c, c3036av6.d, c3036av6.e, c3036av6.g, c3036av6.h, c3036av6.j, AbstractC2845Vx.b0(jt5), c3036av6.l);
                } else {
                    Metadata metadata2 = c3036av6.l;
                    if (i25 == 4) {
                        JT jt6 = new JT(i26);
                        interfaceC4265ot.readFully(jt6.f3266a, 0, i26);
                        jt6.F(4);
                        Metadata metadataB = Zh0.b(Arrays.asList((String[]) Zh0.c(jt6, false, false).d));
                        if (metadata2 != null) {
                            metadataB = metadata2.c(metadataB);
                        }
                        c3036av = new C3036av(c3036av6.f4147a, c3036av6.b, c3036av6.c, c3036av6.d, c3036av6.e, c3036av6.g, c3036av6.h, c3036av6.j, c3036av6.k, metadataB);
                    } else if (i25 == 6) {
                        JT jt7 = new JT(i26);
                        interfaceC4265ot.readFully(jt7.f3266a, 0, i26);
                        jt7.F(4);
                        Metadata metadata3 = new Metadata(AC.p(PictureFrame.b(jt7)));
                        if (metadata2 != null) {
                            metadata3 = metadata2.c(metadata3);
                        }
                        c3036av = new C3036av(c3036av6.f4147a, c3036av6.b, c3036av6.c, c3036av6.d, c3036av6.e, c3036av6.g, c3036av6.h, c3036av6.j, c3036av6.k, metadata3);
                    } else {
                        interfaceC4265ot.skipFully(i26);
                    }
                    c3036av6 = c3036av;
                }
            }
            int i27 = Ug0.f3833a;
            this.i = c3036av6;
            if (zH) {
                this.j = Math.max(c3036av6.c, 6);
                this.f.e(this.i.c(bArr, this.h));
                this.g = 4;
                return 0;
            }
            i2 = 0;
            obj = null;
            i3 = 2;
            i4 = 3;
            i5 = 7;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) {
        Metadata metadataE = new Wm0(22).E(interfaceC4265ot, C3241dC.h);
        if (metadataE != null) {
            metadataE.f();
        }
        JT jt = new JT(4);
        ((C2938Zm) interfaceC4265ot).peekFully(jt.f3266a, 0, 4, false);
        return jt.u() == 1716281667;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.e = interfaceC4353pt;
        this.f = interfaceC4353pt.track(0, 1);
        interfaceC4353pt.endTracks();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        if (j == 0) {
            this.g = 0;
        } else {
            C2816Uu c2816Uu = this.l;
            if (c2816Uu != null) {
                c2816Uu.c(j2);
            }
        }
        this.n = j2 != 0 ? -1L : 0L;
        this.m = 0;
        this.b.B(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
