package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21380e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21381f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21383h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21384i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f21385j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f21386k;
    public final float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f21387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f21388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f21389o;

    public /* synthetic */ w2(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f10, int i20, String str, Object obj) {
        this.f21376a = list;
        this.f21377b = i10;
        this.f21378c = i11;
        this.f21379d = i12;
        this.f21380e = i13;
        this.f21381f = i14;
        this.f21382g = i15;
        this.f21383h = i16;
        this.f21384i = i17;
        this.f21385j = i18;
        this.f21386k = i19;
        this.l = f10;
        this.f21387m = i20;
        this.f21388n = str;
        this.f21389o = obj;
    }

    public static w2 a(l1.q qVar, boolean z10, k5.g gVar) throws i1.e0 {
        boolean z11;
        d5.o oVarH;
        int i10 = 4;
        try {
            if (z10) {
                qVar.N(4);
            } else {
                qVar.N(21);
            }
            int iZ = qVar.z() & 3;
            int iZ2 = qVar.z();
            int i11 = qVar.f44814b;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                z11 = true;
                if (i13 >= iZ2) {
                    break;
                }
                qVar.N(1);
                int iG = qVar.G();
                for (int i15 = 0; i15 < iG; i15++) {
                    int iG2 = qVar.G();
                    i14 += iG2 + 4;
                    qVar.N(iG2);
                }
                i13++;
            }
            qVar.M(i11);
            byte[] bArr = new byte[i14];
            k5.g gVar2 = gVar;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            float f10 = 1.0f;
            String strB = null;
            int i26 = 0;
            int i27 = 0;
            while (i26 < iZ2) {
                int iZ3 = qVar.z() & 63;
                int iG3 = qVar.G();
                int i28 = i12;
                k5.g gVarJ = gVar2;
                while (i28 < iG3) {
                    boolean z12 = z11;
                    int iG4 = qVar.G();
                    int i29 = iZ;
                    System.arraycopy(m1.n.f45820a, i12, bArr, i27, i10);
                    int i30 = i27 + 4;
                    System.arraycopy(qVar.f44813a, qVar.f44814b, bArr, i30, iG4);
                    if (iZ3 == 32 && i28 == 0) {
                        gVarJ = m1.n.j(bArr, i30, i30 + iG4);
                    } else {
                        if (iZ3 == 33 && i28 == 0) {
                            h51 h51VarI = m1.n.i(bArr, i30, i30 + iG4, gVarJ);
                            i16 = h51VarI.f15167a + 1;
                            i17 = h51VarI.f15172f;
                            int i31 = h51VarI.f15173g;
                            i19 = h51VarI.f15168b + 8;
                            i20 = h51VarI.f15169c + 8;
                            int i32 = h51VarI.f15176j;
                            i18 = i31;
                            int i33 = h51VarI.f15177k;
                            int i34 = h51VarI.l;
                            float f11 = h51VarI.f15174h;
                            int i35 = h51VarI.f15175i;
                            m1.h hVar = (m1.h) h51VarI.f15178m;
                            if (hVar != null) {
                                strB = l1.c.b(hVar.f45784a, hVar.f45785b, hVar.f45786c, hVar.f45787d, hVar.f45788e, hVar.f45789f);
                            }
                            i25 = i35;
                            f10 = f11;
                            i23 = i34;
                            i22 = i33;
                            i21 = i32;
                        } else if (iZ3 == 39 && i28 == 0 && (oVarH = m1.n.h(bArr, i30, i30 + iG4)) != null && gVarJ != null) {
                            i12 = 0;
                            i24 = oVarH.f38703b == ((m1.g) ((oa.j0) gVarJ.f44325a).get(0)).f45783b ? 4 : 5;
                        }
                        i12 = 0;
                    }
                    i27 = i30 + iG4;
                    qVar.N(iG4);
                    i28++;
                    z11 = z12;
                    iZ = i29;
                    i10 = 4;
                }
                i26++;
                gVar2 = gVarJ;
                i10 = 4;
            }
            return new w2(i14 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iZ + 1, i16, i17, i18, i19, i20, i21, i22, i23, i24, f10, i25, strB, gVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw i1.e0.a(e10, "Error parsing".concat(z10 ? "L-HEVC config" : "HEVC config"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x027a  */
    /* JADX WARN: Code duplicated, block: B:120:0x027d  */
    public static w2 b(np0 np0Var, boolean z10, uw uwVar) throws ab {
        boolean z11;
        boolean z12;
        String str;
        int i10;
        char c4;
        d5.o oVar;
        int i11;
        int i12;
        int i13 = 4;
        boolean z13 = true;
        if (z10) {
            try {
                np0Var.G(4);
            } catch (ArrayIndexOutOfBoundsException e10) {
                e = e10;
                z12 = true;
                if (z12 != z10) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw ab.a(e, "Error parsing".concat(str));
            }
        } else {
            try {
                np0Var.G(21);
            } catch (ArrayIndexOutOfBoundsException e11) {
                e = e11;
                z11 = z13;
                z12 = z11;
                if (z12 != z10) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw ab.a(e, "Error parsing".concat(str));
            }
        }
        int iK = np0Var.K() & 3;
        int iK2 = np0Var.K();
        int i14 = np0Var.f17881b;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < iK2; i17++) {
            np0Var.G(1);
            int iL = np0Var.L();
            for (int i18 = 0; i18 < iL; i18++) {
                int iL2 = np0Var.L();
                i16 += iL2 + 4;
                np0Var.G(iL2);
            }
        }
        np0Var.E(i14);
        byte[] bArr = new byte[i16];
        uw uwVar2 = uwVar;
        int i19 = 0;
        float f10 = 1.0f;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int i26 = -1;
        int i27 = -1;
        int i28 = -1;
        int i29 = -1;
        String strA = null;
        int i30 = 0;
        while (i30 < iK2) {
            int iK3 = np0Var.K() & 63;
            int iL3 = np0Var.L();
            z11 = z13;
            int i31 = i15;
            uw uwVarH = uwVar2;
            while (i31 < iL3) {
                try {
                    int iL4 = np0Var.L();
                    int i32 = i31;
                    System.arraycopy(dv.f13741n, i15, bArr, i19, i13);
                    int i33 = i19 + 4;
                    System.arraycopy(np0Var.f17880a, np0Var.f17881b, bArr, i33, iL4);
                    int i34 = 32;
                    if (iK3 == 32) {
                        if (i32 == 0) {
                            uwVarH = dv.H(bArr, i33, i33 + iL4);
                            i10 = iK;
                            i12 = 0;
                            i11 = 0;
                        }
                        c4 = '?';
                        i19 = i33 + iL4;
                        np0Var.G(iL4);
                        i31 = i12 + 1;
                        i13 = 4;
                        i15 = i11;
                        iK = i10;
                    } else {
                        i34 = iK3;
                    }
                    i10 = iK;
                    if (i34 != 33) {
                        i33 = i33;
                        int i35 = 8;
                        if (i34 == 39 && i32 == 0) {
                            int i36 = i19 + 6;
                            int i37 = (i33 + iL4) - 1;
                            while (true) {
                                byte b10 = bArr[i37];
                                if (b10 != 0) {
                                    if (b10 == 0) {
                                        c4 = '?';
                                        oVar = null;
                                        break;
                                    }
                                    if (i37 > i36) {
                                        ta1 ta1Var = new ta1(bArr, i36, i37 + 1);
                                        while (true) {
                                            if (ta1Var.c(16)) {
                                                int i38 = i35;
                                                int iE = ta1Var.e(i38);
                                                int i39 = 0;
                                                while (iE == 255) {
                                                    i39 += 255;
                                                    iE = ta1Var.e(i38);
                                                }
                                                int i40 = i39 + iE;
                                                int iE2 = ta1Var.e(i38);
                                                int i41 = 0;
                                                while (iE2 == 255) {
                                                    i41 += 255;
                                                    iE2 = ta1Var.e(8);
                                                }
                                                i35 = 8;
                                                int i42 = i41 + iE2;
                                                if (i42 != 0) {
                                                    if (ta1Var.c(i42)) {
                                                        if (i40 == 176) {
                                                            int iG = ta1Var.g();
                                                            boolean zD = ta1Var.d();
                                                            int iG2 = zD ? ta1Var.g() : 0;
                                                            int iG3 = ta1Var.g();
                                                            int i43 = -1;
                                                            int i44 = 0;
                                                            while (true) {
                                                                if (i44 > iG3) {
                                                                    c4 = '?';
                                                                    oVar = new d5.o(i43, 6);
                                                                    break;
                                                                }
                                                                int iG4 = ta1Var.g();
                                                                ta1Var.g();
                                                                int i45 = i44;
                                                                int iE3 = ta1Var.e(6);
                                                                if (iE3 == 63) {
                                                                    c4 = '?';
                                                                } else {
                                                                    ta1Var.e(iE3 == 0 ? Math.max(0, iG - 30) : Math.max(0, (iE3 + iG) - 31));
                                                                    if (zD) {
                                                                        int iE4 = ta1Var.e(6);
                                                                        if (iE4 == 63) {
                                                                            c4 = '?';
                                                                        } else {
                                                                            ta1Var.e(iE4 == 0 ? Math.max(0, iG2 - 30) : Math.max(0, (iE4 + iG2) - 31));
                                                                        }
                                                                    }
                                                                    if (ta1Var.d()) {
                                                                        ta1Var.b(10);
                                                                    }
                                                                    i44 = i45 + 1;
                                                                    i43 = iG4;
                                                                }
                                                                oVar = null;
                                                                break;
                                                            }
                                                        }
                                                        ta1Var.b(i42 * 8);
                                                    }
                                                }
                                            }
                                            c4 = '?';
                                            oVar = null;
                                            break;
                                        }
                                    }
                                } else if (i37 > i36) {
                                    i37--;
                                }
                                oVar = null;
                                c4 = '?';
                                break;
                            }
                            if (oVar == null || uwVarH == null) {
                                i11 = 0;
                            } else {
                                i11 = 0;
                                if (oVar.f38703b == ((j21) ((ca1) uwVarH.f20919c).get(0)).f15938b) {
                                    i12 = i32;
                                    i28 = 4;
                                } else {
                                    i28 = 5;
                                }
                                i19 = i33 + iL4;
                                np0Var.G(iL4);
                                i31 = i12 + 1;
                                i13 = 4;
                                i15 = i11;
                                iK = i10;
                            }
                        }
                        i12 = i32;
                        i19 = i33 + iL4;
                        np0Var.G(iL4);
                        i31 = i12 + 1;
                        i13 = 4;
                        i15 = i11;
                        iK = i10;
                    } else if (i32 == 0) {
                        h51 h51VarJ = dv.J(bArr, i33, i33 + iL4, uwVarH);
                        int i46 = h51VarJ.f15167a + 1;
                        int i47 = h51VarJ.f15172f;
                        int i48 = h51VarJ.f15173g;
                        int i49 = h51VarJ.f15168b + 8;
                        int i50 = h51VarJ.f15169c + 8;
                        int i51 = h51VarJ.f15176j;
                        int i52 = h51VarJ.f15177k;
                        int i53 = h51VarJ.l;
                        float f11 = h51VarJ.f15174h;
                        int i54 = h51VarJ.f15175i;
                        j31 j31Var = (j31) h51VarJ.f15178m;
                        if (j31Var != null) {
                            strA = re0.a(j31Var.f15955a, j31Var.f15956b, j31Var.f15957c, j31Var.f15958d, j31Var.f15959e, j31Var.f15960f);
                        }
                        i27 = i53;
                        f10 = f11;
                        i29 = i54;
                        i12 = i32;
                        i24 = i50;
                        i25 = i51;
                        i26 = i52;
                        i23 = i49;
                        i21 = i47;
                        i22 = i48;
                        i11 = 0;
                        i20 = i46;
                        c4 = '?';
                        i19 = i33 + iL4;
                        np0Var.G(iL4);
                        i31 = i12 + 1;
                        i13 = 4;
                        i15 = i11;
                        iK = i10;
                    } else {
                        i33 = i33;
                    }
                    i11 = 0;
                    c4 = '?';
                    i12 = i32;
                    i19 = i33 + iL4;
                    np0Var.G(iL4);
                    i31 = i12 + 1;
                    i13 = 4;
                    i15 = i11;
                    iK = i10;
                } catch (ArrayIndexOutOfBoundsException e12) {
                    e = e12;
                    z12 = z11;
                    if (z12 != z10) {
                        str = "HEVC config";
                    } else {
                        str = "L-HEVC config";
                    }
                    throw ab.a(e, "Error parsing".concat(str));
                }
            }
            i30++;
            uwVar2 = uwVarH;
            z13 = z11;
            iK = iK;
            i13 = 4;
        }
        z11 = z13;
        return new w2(i16 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iK + 1, i20, i21, i22, i23, i24, i25, i26, i27, i28, f10, i29, strA, uwVar2);
    }
}
