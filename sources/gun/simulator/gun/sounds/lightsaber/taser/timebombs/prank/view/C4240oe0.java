package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.badlogic.gdx.Input;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4240oe0 implements InterfaceC4177nt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4800a;
    public final List b;
    public final JT c;
    public final SparseIntArray d;
    public final C4237od e;
    public final SparseArray f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final C4064me0 i;
    public C2816Uu j;
    public InterfaceC4353pt k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public InterfaceC4503re0 p;
    public int q;
    public int r;

    public C4240oe0(int i, Mc0 mc0, C4237od c4237od) {
        this.e = c4237od;
        this.f4800a = i;
        if (i == 1 || i == 2) {
            this.b = Collections.singletonList(mc0);
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(mc0);
        }
        this.c = new JT(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.g = sparseBooleanArray;
        this.h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f = sparseArray;
        this.d = new SparseIntArray();
        this.i = new C4064me0();
        this.k = InterfaceC4353pt.f1;
        this.r = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i2 = 0; i2 < size; i2++) {
            sparseArray.put(sparseArray2.keyAt(i2), (InterfaceC4503re0) sparseArray2.valueAt(i2));
        }
        sparseArray.put(0, new M30(new C3491g4(this)));
        this.p = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final int a(InterfaceC4265ot interfaceC4265ot, C2868Wu c2868Wu) throws KT {
        ?? r3;
        ?? r4;
        int i;
        int i2;
        boolean z;
        long jI0;
        int i3;
        long j;
        long length = interfaceC4265ot.getLength();
        boolean z2 = this.m;
        int i4 = this.f4800a;
        if (z2) {
            C4064me0 c4064me0 = this.i;
            if (length != -1 && i4 != 2 && !c4064me0.d) {
                int i5 = this.r;
                if (i5 <= 0) {
                    c4064me0.a(interfaceC4265ot);
                    return 0;
                }
                boolean z3 = c4064me0.f;
                JT jt = c4064me0.c;
                int i6 = c4064me0.f4705a;
                if (!z3) {
                    long length2 = interfaceC4265ot.getLength();
                    int iMin = (int) Math.min(i6, length2);
                    long j2 = length2 - ((long) iMin);
                    if (interfaceC4265ot.getPosition() != j2) {
                        c2868Wu.b = j2;
                        i3 = 1;
                    } else {
                        jt.B(iMin);
                        interfaceC4265ot.resetPeekPosition();
                        interfaceC4265ot.peekFully(jt.f3266a, 0, iMin);
                        int i7 = jt.b;
                        int i8 = jt.c;
                        int i9 = i8 - 188;
                        while (true) {
                            if (i9 < i7) {
                                j = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                break;
                            }
                            byte[] bArr = jt.f3266a;
                            int i10 = 0;
                            for (int i11 = -4; i11 <= 4; i11++) {
                                int i12 = (i11 * Input.Keys.F18) + i9;
                                if (i12 >= i7 && i12 < i8 && bArr[i12] == 71) {
                                    i10++;
                                    if (i10 == 5) {
                                        long jI1 = AbstractC2995aW.i0(i9, i5, jt);
                                        if (jI1 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                            break;
                                        }
                                        j = jI1;
                                        break;
                                    }
                                } else {
                                    i10 = 0;
                                }
                            }
                            i9--;
                        }
                        c4064me0.h = j;
                        c4064me0.f = true;
                        i3 = 0;
                    }
                } else {
                    if (c4064me0.h == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        c4064me0.a(interfaceC4265ot);
                        return 0;
                    }
                    if (c4064me0.e) {
                        long j3 = c4064me0.g;
                        if (j3 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            c4064me0.a(interfaceC4265ot);
                            return 0;
                        }
                        Mc0 mc0 = c4064me0.b;
                        long jB = mc0.b(c4064me0.h) - mc0.b(j3);
                        c4064me0.i = jB;
                        if (jB < 0) {
                            AbstractC4038mJ.f();
                            c4064me0.i = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                        }
                        c4064me0.a(interfaceC4265ot);
                        return 0;
                    }
                    int iMin2 = (int) Math.min(i6, interfaceC4265ot.getLength());
                    long j4 = 0;
                    if (interfaceC4265ot.getPosition() != j4) {
                        c2868Wu.b = j4;
                        i3 = 1;
                    } else {
                        jt.B(iMin2);
                        interfaceC4265ot.resetPeekPosition();
                        interfaceC4265ot.peekFully(jt.f3266a, 0, iMin2);
                        int i13 = jt.b;
                        int i14 = jt.c;
                        while (true) {
                            if (i13 >= i14) {
                                jI0 = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
                                break;
                            }
                            if (jt.f3266a[i13] == 71) {
                                jI0 = AbstractC2995aW.i0(i13, i5, jt);
                                if (jI0 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                    break;
                                }
                            }
                            i13++;
                        }
                        c4064me0.g = jI0;
                        c4064me0.e = true;
                        i3 = 0;
                    }
                }
                return i3;
            }
            if (!this.n) {
                this.n = true;
                long j5 = c4064me0.i;
                if (j5 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    int i15 = this.r;
                    Qm0 qm0 = new Qm0(26);
                    VC vc = new VC();
                    vc.f3864a = i15;
                    vc.c = c4064me0.b;
                    vc.b = 112800;
                    vc.d = new JT();
                    C2816Uu c2816Uu = new C2816Uu(qm0, vc, j5, j5 + 1, 0L, length, 188L, 940);
                    this.j = c2816Uu;
                    this.k.a(c2816Uu.f5330a);
                } else {
                    this.k.a(new C2946Zu(j5));
                }
            }
            if (this.o) {
                z = false;
                this.o = false;
                seek(0L, 0L);
                if (interfaceC4265ot.getPosition() != 0) {
                    c2868Wu.b = 0L;
                    return 1;
                }
            } else {
                z = false;
            }
            r4 = 1;
            r4 = 1;
            C2816Uu c2816Uu2 = this.j;
            r3 = z;
            if (c2816Uu2 != null && c2816Uu2.c != null) {
                r3 = z;
                return c2816Uu2.a(interfaceC4265ot, c2868Wu);
            }
        } else {
            i4 = i4;
            r3 = 0;
            r4 = 1;
        }
        r3 = z;
        JT jt2 = this.c;
        byte[] bArr2 = jt2.f3266a;
        if (9400 - jt2.b < 188) {
            int iA = jt2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, jt2.b, bArr2, r3, iA);
            }
            jt2.C(bArr2, iA);
        }
        while (jt2.a() < 188) {
            int i16 = jt2.c;
            int i17 = interfaceC4265ot.read(bArr2, i16, 9400 - i16);
            if (i17 == -1) {
                return -1;
            }
            jt2.D(i16 + i17);
        }
        int i18 = jt2.b;
        int i19 = jt2.c;
        byte[] bArr3 = jt2.f3266a;
        int i20 = i18;
        while (i20 < i19 && bArr3[i20] != 71) {
            i20++;
        }
        jt2.E(i20);
        int i21 = i20 + Input.Keys.F18;
        if (i21 > i19) {
            int i22 = (i20 - i18) + this.q;
            this.q = i22;
            i = i4;
            i2 = 2;
            if (i == 2 && i22 > 376) {
                throw KT.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i = i4;
            i2 = 2;
            this.q = r3;
        }
        int i23 = jt2.c;
        if (i21 > i23) {
            return r3;
        }
        int iF = jt2.f();
        if ((8388608 & iF) != 0) {
            jt2.E(i21);
            return r3;
        }
        int i24 = (4194304 & iF) != 0 ? 1 : 0;
        int i25 = (2096896 & iF) >> 8;
        boolean z4 = (iF & 32) != 0;
        InterfaceC4503re0 interfaceC4503re0 = (iF & 16) != 0 ? (InterfaceC4503re0) this.f.get(i25) : null;
        if (interfaceC4503re0 == null) {
            jt2.E(i21);
            return r3;
        }
        if (i != i2) {
            int i26 = iF & 15;
            SparseIntArray sparseIntArray = this.d;
            int i27 = sparseIntArray.get(i25, i26 - 1);
            sparseIntArray.put(i25, i26);
            if (i27 == i26) {
                jt2.E(i21);
                return r3;
            }
            if (i26 != ((i27 + r4) & 15)) {
                interfaceC4503re0.seek();
            }
        }
        if (z4) {
            int iT = jt2.t();
            i24 |= (jt2.t() & 64) != 0 ? 2 : 0;
            jt2.F(iT - r4);
        }
        boolean z5 = this.m;
        if (i == i2 || z5 || !this.h.get(i25, r3)) {
            jt2.D(i21);
            interfaceC4503re0.a(i24, jt2);
            jt2.D(i23);
        }
        if (i != i2 && !z5 && this.m && length != -1) {
            this.o = r4;
        }
        jt2.E(i21);
        return r3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final boolean b(InterfaceC4265ot interfaceC4265ot) throws EOFException, InterruptedIOException {
        byte[] bArr = this.c.f3266a;
        C2938Zm c2938Zm = (C2938Zm) interfaceC4265ot;
        c2938Zm.peekFully(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    c2938Zm.skipFully(i);
                    return true;
                }
                if (bArr[(i2 * Input.Keys.F18) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void d(InterfaceC4353pt interfaceC4353pt) {
        this.k = interfaceC4353pt;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void seek(long j, long j2) {
        C2816Uu c2816Uu;
        FW.s(this.f4800a != 2);
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Mc0 mc0 = (Mc0) list.get(i);
            boolean z = mc0.d() == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            if (!z) {
                long jC = mc0.c();
                if (jC != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET && jC != 0 && jC != j2) {
                    mc0.e(j2);
                }
            } else if (z) {
                mc0.e(j2);
            }
        }
        if (j2 != 0 && (c2816Uu = this.j) != null) {
            c2816Uu.c(j2);
        }
        this.c.B(0);
        this.d.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i2 >= sparseArray.size()) {
                this.q = 0;
                return;
            } else {
                ((InterfaceC4503re0) sparseArray.valueAt(i2)).seek();
                i2++;
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4177nt
    public final void release() {
    }
}
