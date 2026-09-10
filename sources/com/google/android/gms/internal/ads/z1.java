package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f22455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f22456k;
    public final String l;

    public /* synthetic */ z1(ArrayList arrayList, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f22446a = arrayList;
        this.f22447b = i10;
        this.f22448c = i11;
        this.f22449d = i12;
        this.f22450e = i13;
        this.f22451f = i14;
        this.f22452g = i15;
        this.f22453h = i16;
        this.f22454i = i17;
        this.f22455j = i18;
        this.f22456k = f10;
        this.l = str;
    }

    public static z1 a(l1.q qVar) throws i1.e0 {
        String strA;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            qVar.N(4);
            int iZ = (qVar.z() & 3) + 1;
            if (iZ == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZ2 = qVar.z() & 31;
            for (int i18 = 0; i18 < iZ2; i18++) {
                int iG = qVar.G();
                int i19 = qVar.f44814b;
                qVar.N(iG);
                byte[] bArr = qVar.f44813a;
                byte[] bArr2 = new byte[iG + 4];
                System.arraycopy(l1.c.f44778a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i19, bArr2, 4, iG);
                arrayList.add(bArr2);
            }
            int iZ3 = qVar.z();
            for (int i20 = 0; i20 < iZ3; i20++) {
                int iG2 = qVar.G();
                int i21 = qVar.f44814b;
                qVar.N(iG2);
                byte[] bArr3 = qVar.f44813a;
                byte[] bArr4 = new byte[iG2 + 4];
                System.arraycopy(l1.c.f44778a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i21, bArr4, 4, iG2);
                arrayList.add(bArr4);
            }
            if (iZ2 > 0) {
                m1.m mVarK = m1.n.k((byte[]) arrayList.get(0), 4, ((byte[]) arrayList.get(0)).length);
                int i22 = mVarK.f45806e;
                int i23 = mVarK.f45807f;
                int i24 = mVarK.f45809h + 8;
                int i25 = mVarK.f45810i + 8;
                int i26 = mVarK.f45816p;
                int i27 = mVarK.f45817q;
                int i28 = mVarK.f45818r;
                int i29 = mVarK.f45819s;
                float f11 = mVarK.f45808g;
                strA = l1.c.a(mVarK.f45802a, mVarK.f45803b, mVarK.f45804c);
                i13 = i27;
                i14 = i28;
                i15 = i29;
                f10 = f11;
                i11 = i23;
                i12 = i24;
                i16 = i25;
                i17 = i26;
                i10 = i22;
            } else {
                strA = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new z1(arrayList, iZ, i10, i11, i12, i16, i17, i13, i14, i15, f10, strA);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw i1.e0.a(e10, "Error parsing AVC config");
        }
    }

    public static z1 b(np0 np0Var) throws ab {
        String str;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            np0Var.G(4);
            int iK = (np0Var.K() & 3) + 1;
            if (iK == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iK2 = np0Var.K() & 31;
            for (int i18 = 0; i18 < iK2; i18++) {
                int iL = np0Var.L();
                int i19 = np0Var.f17881b;
                np0Var.G(iL);
                byte[] bArr = np0Var.f17880a;
                byte[] bArr2 = re0.f19567a;
                byte[] bArr3 = new byte[iL + 4];
                System.arraycopy(re0.f19567a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i19, bArr3, 4, iL);
                arrayList.add(bArr3);
            }
            int iK3 = np0Var.K();
            for (int i20 = 0; i20 < iK3; i20++) {
                int iL2 = np0Var.L();
                int i21 = np0Var.f17881b;
                np0Var.G(iL2);
                byte[] bArr4 = np0Var.f17880a;
                byte[] bArr5 = re0.f19567a;
                byte[] bArr6 = new byte[iL2 + 4];
                System.arraycopy(re0.f19567a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i21, bArr6, 4, iL2);
                arrayList.add(bArr6);
            }
            if (iK2 > 0) {
                t61 t61VarF = dv.F((byte[]) arrayList.get(0), 5, ((byte[]) arrayList.get(0)).length);
                int i22 = t61VarF.f20219e;
                int i23 = t61VarF.f20220f;
                int i24 = t61VarF.f20222h + 8;
                int i25 = t61VarF.f20223i + 8;
                int i26 = t61VarF.f20224j;
                int i27 = t61VarF.f20225k;
                int i28 = t61VarF.l;
                int i29 = t61VarF.f20226m;
                float f11 = t61VarF.f20221g;
                int i30 = t61VarF.f20215a;
                int i31 = t61VarF.f20216b;
                int i32 = t61VarF.f20217c;
                byte[] bArr7 = re0.f19567a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i30), Integer.valueOf(i31), Integer.valueOf(i32));
                i13 = i27;
                i14 = i28;
                i15 = i29;
                f10 = f11;
                i11 = i23;
                i12 = i24;
                i16 = i25;
                i17 = i26;
                i10 = i22;
            } else {
                str = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new z1(arrayList, iK, i10, i11, i12, i16, i17, i13, i14, i15, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ab.a(e10, "Error parsing AVC config");
        }
    }
}
