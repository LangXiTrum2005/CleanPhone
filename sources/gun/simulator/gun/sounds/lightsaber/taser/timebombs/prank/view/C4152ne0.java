package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ne0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4152ne0 implements L30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uh0 f4752a = new Uh0(new byte[5], 2, (Object) null);
    public final SparseArray b = new SparseArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    public final /* synthetic */ C4240oe0 e;

    public C4152ne0(C4240oe0 c4240oe0, int i) {
        this.e = c4240oe0;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0124  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L30
    public final void a(JT jt) {
        Mc0 mc0;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        Mc0 mc1;
        int i;
        SparseArray sparseArray2;
        SparseIntArray sparseIntArray;
        int i2;
        SparseArray sparseArray3;
        SparseIntArray sparseIntArray2;
        if (jt.t() != 2) {
            return;
        }
        C4240oe0 c4240oe0 = this.e;
        int i3 = c4240oe0.f4800a;
        int i4 = 0;
        List list = c4240oe0.b;
        if (i3 == 1 || i3 == 2 || c4240oe0.l == 1) {
            mc0 = (Mc0) list.get(0);
        } else {
            mc0 = new Mc0(((Mc0) list.get(0)).c());
            list.add(mc0);
        }
        if ((jt.t() & 128) == 0) {
            return;
        }
        jt.F(1);
        int iY = jt.y();
        int i5 = 3;
        jt.F(3);
        Uh0 uh0 = this.f4752a;
        jt.d(uh0.d, 0, 2);
        uh0.p(0);
        uh0.s(3);
        c4240oe0.r = uh0.i(13);
        jt.d(uh0.d, 0, 2);
        uh0.p(0);
        uh0.s(4);
        jt.F(uh0.i(12));
        C4237od c4237od = c4240oe0.e;
        int i6 = c4240oe0.f4800a;
        if (i6 == 2 && c4240oe0.p == null) {
            InterfaceC4503re0 interfaceC4503re0A = c4237od.a(21, new BR(21, (String) null, (ArrayList) null, Ug0.e));
            c4240oe0.p = interfaceC4503re0A;
            if (interfaceC4503re0A != null) {
                interfaceC4503re0A.b(mc0, c4240oe0.k, new C4416qe0(iY, 21, 8192));
            }
        }
        SparseArray sparseArray4 = this.b;
        sparseArray4.clear();
        SparseIntArray sparseIntArray3 = this.c;
        sparseIntArray3.clear();
        int iA = jt.a();
        while (true) {
            sparseBooleanArray = c4240oe0.g;
            if (iA <= 0) {
                break;
            }
            jt.d(uh0.d, i4, 5);
            uh0.p(i4);
            int i7 = uh0.i(8);
            uh0.s(i5);
            int i8 = uh0.i(13);
            uh0.s(4);
            int i9 = uh0.i(12);
            int i10 = jt.b;
            int i11 = i10 + i9;
            Mc0 mc2 = mc0;
            int i12 = iY;
            Uh0 uh1 = uh0;
            String strTrim = null;
            ArrayList arrayList = null;
            int i13 = -1;
            while (true) {
                if (jt.b >= i11) {
                    sparseArray2 = sparseArray4;
                    break;
                }
                int iT = jt.t();
                sparseArray2 = sparseArray4;
                int iT2 = jt.b + jt.t();
                if (iT2 > i11) {
                    break;
                }
                int i14 = i8;
                if (iT == 5) {
                    long jU = jt.u();
                    if (jU == 1094921523) {
                        i13 = 129;
                    } else if (jU == 1161904947) {
                        i13 = 135;
                    } else if (jU == 1094921524) {
                        i13 = 172;
                    } else if (jU == 1212503619) {
                        i13 = 36;
                    }
                    sparseIntArray2 = sparseIntArray3;
                } else if (iT == 106) {
                    sparseIntArray2 = sparseIntArray3;
                    i13 = 129;
                } else if (iT == 122) {
                    sparseIntArray2 = sparseIntArray3;
                    i13 = 135;
                } else {
                    if (iT == 127) {
                        if (jt.t() == 21) {
                            i13 = 172;
                        }
                    } else if (iT == 123) {
                        sparseIntArray2 = sparseIntArray3;
                        i13 = 138;
                    } else if (iT == 10) {
                        strTrim = jt.r(3, AbstractC2333Ce.c).trim();
                    } else if (iT == 89) {
                        arrayList = new ArrayList();
                        while (jt.b < iT2) {
                            String strTrim2 = jt.r(3, AbstractC2333Ce.c).trim();
                            jt.t();
                            byte[] bArr = new byte[4];
                            jt.d(bArr, 0, 4);
                            arrayList.add(new C4328pe0(strTrim2, bArr));
                            sparseIntArray3 = sparseIntArray3;
                        }
                        sparseIntArray2 = sparseIntArray3;
                        i13 = 89;
                    } else {
                        sparseIntArray2 = sparseIntArray3;
                        if (iT == 111) {
                            i13 = 257;
                        }
                    }
                    sparseIntArray2 = sparseIntArray3;
                }
                jt.F(iT2 - jt.b);
                sparseIntArray3 = sparseIntArray2;
                sparseArray4 = sparseArray2;
                i8 = i14;
            }
            SparseIntArray sparseIntArray4 = sparseIntArray3;
            int i15 = i8;
            jt.E(i11);
            BR br = new BR(i13, strTrim, arrayList, Arrays.copyOfRange(jt.f3266a, i10, i11));
            if (i7 == 6 || i7 == 5) {
                i7 = br.f2872a;
            }
            iA -= i9 + 5;
            int i16 = i6 == 2 ? i7 : i15;
            if (sparseBooleanArray.get(i16)) {
                sparseIntArray = sparseIntArray4;
                sparseArray3 = sparseArray2;
            } else {
                InterfaceC4503re0 interfaceC4503re0A2 = (i6 == 2 && i7 == 21) ? c4240oe0.p : c4237od.a(i7, br);
                sparseIntArray = sparseIntArray4;
                if (i6 == 2) {
                    i2 = i15;
                    if (i2 >= sparseIntArray.get(i16, 8192)) {
                        sparseArray3 = sparseArray2;
                    }
                } else {
                    i2 = i15;
                }
                sparseIntArray.put(i16, i2);
                sparseArray3 = sparseArray2;
                sparseArray3.put(i16, interfaceC4503re0A2);
            }
            sparseArray4 = sparseArray3;
            sparseIntArray3 = sparseIntArray;
            mc0 = mc2;
            uh0 = uh1;
            iY = i12;
            i4 = 0;
            i5 = 3;
        }
        SparseArray sparseArray5 = sparseArray4;
        Mc0 mc3 = mc0;
        SparseIntArray sparseIntArray5 = sparseIntArray3;
        int i17 = iY;
        int size = sparseIntArray5.size();
        int i18 = 0;
        while (true) {
            sparseArray = c4240oe0.f;
            if (i18 >= size) {
                break;
            }
            int iKeyAt = sparseIntArray5.keyAt(i18);
            int iValueAt = sparseIntArray5.valueAt(i18);
            sparseBooleanArray.put(iKeyAt, true);
            c4240oe0.h.put(iValueAt, true);
            InterfaceC4503re0 interfaceC4503re0 = (InterfaceC4503re0) sparseArray5.valueAt(i18);
            if (interfaceC4503re0 != null) {
                if (interfaceC4503re0 != c4240oe0.p) {
                    InterfaceC4353pt interfaceC4353pt = c4240oe0.k;
                    i = i17;
                    C4416qe0 c4416qe0 = new C4416qe0(i, iKeyAt, 8192);
                    mc1 = mc3;
                    interfaceC4503re0.b(mc1, interfaceC4353pt, c4416qe0);
                } else {
                    mc1 = mc3;
                    i = i17;
                }
                sparseArray.put(iValueAt, interfaceC4503re0);
            } else {
                mc1 = mc3;
                i = i17;
            }
            i18++;
            mc3 = mc1;
            i17 = i;
        }
        if (i6 == 2) {
            if (!c4240oe0.m) {
                c4240oe0.k.endTracks();
                c4240oe0.l = 0;
                c4240oe0.m = true;
            }
            return;
        }
        sparseArray.remove(this.d);
        int i19 = i6 == 1 ? 0 : c4240oe0.l - 1;
        c4240oe0.l = i19;
        if (i19 == 0) {
            c4240oe0.k.endTracks();
            c4240oe0.m = true;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L30
    public final void b(Mc0 mc0, InterfaceC4353pt interfaceC4353pt, C4416qe0 c4416qe0) {
    }
}
