package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f9 implements j9 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f14319x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14320a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f14326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h3 f14327h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h3 f14328i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14332n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f14336r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f14338t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h3 f14340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f14341w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gp0 f14321b = new gp0(new byte[7], 7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final np0 f14322c = new np0(Arrays.copyOf(f14319x, 10));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14333o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14334p = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f14337s = C.TIME_UNSET;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f14339u = C.TIME_UNSET;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14329j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14330k = 0;
    public int l = NotificationCompat.FLAG_LOCAL_ONLY;

    public f9(String str, int i10, String str2, boolean z10) {
        this.f14320a = z10;
        this.f14323d = str;
        this.f14324e = i10;
        this.f14325f = str2;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void c(int i10, long j10) {
        this.f14339u = j10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void e(o2 o2Var, ga gaVar) {
        gaVar.c();
        gaVar.d();
        this.f14326g = gaVar.f14806e;
        gaVar.d();
        h3 h3VarE = o2Var.e(gaVar.f14805d, 1);
        this.f14327h = h3VarE;
        this.f14340v = h3VarE;
        if (!this.f14320a) {
            this.f14328i = new k2();
            return;
        }
        gaVar.c();
        gaVar.d();
        h3 h3VarE2 = o2Var.e(gaVar.f14805d, 5);
        this.f14328i = h3VarE2;
        i12 i12Var = new i12();
        gaVar.d();
        i12Var.f15499a = gaVar.f14806e;
        i12Var.d(this.f14325f);
        i12Var.e(MimeTypes.APPLICATION_ID3);
        h3VarE2.f(new g22(i12Var));
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:108:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:121:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:123:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:0x030d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.j9
    public final void f(np0 np0Var) throws ab {
        byte b10;
        int i10;
        int i11;
        char c4;
        char c5;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        int i18;
        this.f14327h.getClass();
        String str = uu0.f20901a;
        while (np0Var.B() > 0) {
            int i19 = this.f14329j;
            np0 np0Var2 = this.f14322c;
            gp0 gp0Var = this.f14321b;
            int i20 = 4;
            int i21 = 3;
            byte b11 = -1;
            int i22 = 0;
            int i23 = 1;
            if (i19 == 0) {
                byte[] bArr = np0Var.f17880a;
                int i24 = np0Var.f17881b;
                int i25 = np0Var.f17882c;
                while (true) {
                    if (i24 < i25) {
                        int i26 = i24 + 1;
                        int i27 = i21;
                        byte b12 = bArr[i24];
                        int i28 = b12 & 255;
                        if (this.l == 512 && (((((((byte) i28) & 255) == true ? 1 : 0) | 65280) == true ? 1 : 0) & 65526) == 65520) {
                            if (!this.f14332n) {
                                int i29 = i24 - 1;
                                np0Var.E(i24);
                                byte[] bArr2 = gp0Var.f14921a;
                                if (np0Var.B() < i23) {
                                    i23 = i23;
                                } else {
                                    np0Var.H(bArr2, i22, i23);
                                    gp0Var.d(i20);
                                    int iH = gp0Var.h(i23);
                                    int i30 = this.f14333o;
                                    if (i30 == -1 || iH == i30) {
                                        if (this.f14334p != -1) {
                                            byte[] bArr3 = gp0Var.f14921a;
                                            if (np0Var.B() >= i23) {
                                                np0Var.H(bArr3, i22, i23);
                                                gp0Var.d(2);
                                                i16 = 4;
                                                i14 = i23;
                                                if (gp0Var.h(4) == this.f14334p) {
                                                    np0Var.E(i26);
                                                } else {
                                                    i23 = i14;
                                                }
                                            }
                                        } else {
                                            i14 = i23;
                                            i16 = 4;
                                        }
                                        byte[] bArr4 = gp0Var.f14921a;
                                        if (np0Var.B() >= i16) {
                                            np0Var.H(bArr4, i22, i16);
                                            gp0Var.d(14);
                                            int iH2 = gp0Var.h(13);
                                            if (iH2 >= 7) {
                                                byte[] bArr5 = np0Var.f17880a;
                                                int i31 = np0Var.f17882c;
                                                int i32 = i29 + iH2;
                                                if (i32 < i31) {
                                                    byte b13 = bArr5[i32];
                                                    b10 = -1;
                                                    if (b13 == -1) {
                                                        int i33 = i32 + 1;
                                                        if (i33 != i31) {
                                                            int i34 = bArr5[i33];
                                                            if ((((((i34 & 255) == true ? 1 : 0) | 65280) == true ? 1 : 0) & 65526) == 65520 && ((i34 & 8) >> 3) == iH) {
                                                            }
                                                        }
                                                    } else if (b13 == 73 && ((i17 = i32 + 1) == i31 || (bArr5[i17] == 68 && ((i18 = i32 + 2) == i31 || bArr5[i18] == 51)))) {
                                                    }
                                                }
                                            } else {
                                                b10 = -1;
                                            }
                                            i23 = i14;
                                        }
                                        this.f14335q = (b12 & 8) >> 3;
                                        i15 = i14;
                                        if (i15 != ((b12 & 1) ^ 1)) {
                                            z10 = 0;
                                        } else {
                                            z10 = i15;
                                        }
                                        this.f14331m = z10;
                                        if (this.f14332n) {
                                            this.f14329j = i27;
                                            this.f14330k = 0;
                                        } else {
                                            this.f14329j = i15;
                                            this.f14330k = 0;
                                        }
                                        np0Var.E(i26);
                                    } else {
                                        b10 = -1;
                                    }
                                    i10 = this.l;
                                    i11 = i28 | i10;
                                    if (i11 == 329) {
                                        c4 = 256;
                                        c5 = 2;
                                        i21 = 3;
                                        i12 = 0;
                                        i13 = 768;
                                    } else if (i11 == 511) {
                                        c4 = 256;
                                        c5 = 2;
                                        i21 = 3;
                                        i12 = 0;
                                        i13 = 512;
                                    } else if (i11 == 836) {
                                        c4 = 256;
                                        c5 = 2;
                                        i21 = 3;
                                        i12 = 0;
                                        i13 = 1024;
                                    } else if (i11 != 1075) {
                                        c4 = 256;
                                        if (i10 != 256) {
                                            this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                                            b11 = b10;
                                            i20 = 4;
                                            i21 = 3;
                                            i22 = 0;
                                        } else {
                                            c5 = 2;
                                            i21 = 3;
                                            i12 = 0;
                                            byte b14 = b10;
                                            i22 = i12;
                                            b11 = b14;
                                            i24 = i26;
                                            i20 = 4;
                                        }
                                    } else {
                                        this.f14329j = 2;
                                        this.f14330k = 3;
                                        this.f14338t = 0;
                                        np0Var2.E(0);
                                        np0Var.E(i26);
                                    }
                                    this.l = i13;
                                    byte b15 = b10;
                                    i22 = i12;
                                    b11 = b15;
                                    i24 = i26;
                                    i20 = 4;
                                }
                                b10 = -1;
                                i10 = this.l;
                                i11 = i28 | i10;
                                if (i11 == 329) {
                                    c4 = 256;
                                    c5 = 2;
                                    i21 = 3;
                                    i12 = 0;
                                    i13 = 768;
                                } else if (i11 == 511) {
                                    c4 = 256;
                                    c5 = 2;
                                    i21 = 3;
                                    i12 = 0;
                                    i13 = 512;
                                } else if (i11 == 836) {
                                    c4 = 256;
                                    c5 = 2;
                                    i21 = 3;
                                    i12 = 0;
                                    i13 = 1024;
                                } else if (i11 != 1075) {
                                    c4 = 256;
                                    if (i10 != 256) {
                                        this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                                        b11 = b10;
                                        i20 = 4;
                                        i21 = 3;
                                        i22 = 0;
                                    } else {
                                        c5 = 2;
                                        i21 = 3;
                                        i12 = 0;
                                        byte b16 = b10;
                                        i22 = i12;
                                        b11 = b16;
                                        i24 = i26;
                                        i20 = 4;
                                    }
                                } else {
                                    this.f14329j = 2;
                                    this.f14330k = 3;
                                    this.f14338t = 0;
                                    np0Var2.E(0);
                                    np0Var.E(i26);
                                }
                                this.l = i13;
                                byte b17 = b10;
                                i22 = i12;
                                b11 = b17;
                                i24 = i26;
                                i20 = 4;
                            }
                            i14 = i23;
                            this.f14335q = (b12 & 8) >> 3;
                            i15 = i14;
                            if (i15 != ((b12 & 1) ^ 1)) {
                                z10 = 0;
                            } else {
                                z10 = i15;
                            }
                            this.f14331m = z10;
                            if (this.f14332n) {
                                this.f14329j = i15;
                                this.f14330k = 0;
                            } else {
                                this.f14329j = i27;
                                this.f14330k = 0;
                            }
                            np0Var.E(i26);
                        } else {
                            b10 = b11;
                        }
                        i23 = i23;
                        i10 = this.l;
                        i11 = i28 | i10;
                        if (i11 == 329) {
                            c4 = 256;
                            c5 = 2;
                            i21 = 3;
                            i12 = 0;
                            i13 = 768;
                        } else if (i11 == 511) {
                            c4 = 256;
                            c5 = 2;
                            i21 = 3;
                            i12 = 0;
                            i13 = 512;
                        } else if (i11 == 836) {
                            c4 = 256;
                            c5 = 2;
                            i21 = 3;
                            i12 = 0;
                            i13 = 1024;
                        } else if (i11 != 1075) {
                            c4 = 256;
                            if (i10 != 256) {
                                this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                                b11 = b10;
                                i20 = 4;
                                i21 = 3;
                                i22 = 0;
                            } else {
                                c5 = 2;
                                i21 = 3;
                                i12 = 0;
                                byte b18 = b10;
                                i22 = i12;
                                b11 = b18;
                                i24 = i26;
                                i20 = 4;
                            }
                        } else {
                            this.f14329j = 2;
                            this.f14330k = 3;
                            this.f14338t = 0;
                            np0Var2.E(0);
                            np0Var.E(i26);
                        }
                        this.l = i13;
                        byte b19 = b10;
                        i22 = i12;
                        b11 = b19;
                        i24 = i26;
                        i20 = 4;
                    } else {
                        np0Var.E(i24);
                    }
                }
            } else if (i19 != 1) {
                if (i19 == 2) {
                    byte[] bArr6 = np0Var2.f17880a;
                    int iMin = Math.min(np0Var.B(), 10 - this.f14330k);
                    np0Var.H(bArr6, this.f14330k, iMin);
                    int i35 = this.f14330k + iMin;
                    this.f14330k = i35;
                    if (i35 == 10) {
                        this.f14328i.b(10, np0Var2);
                        np0Var2.E(6);
                        h3 h3Var = this.f14328i;
                        int iG = np0Var2.g() + 10;
                        this.f14329j = 4;
                        this.f14330k = 10;
                        this.f14340v = h3Var;
                        this.f14341w = 0L;
                        this.f14338t = iG;
                    }
                } else if (i19 != 3) {
                    int iMin2 = Math.min(np0Var.B(), this.f14338t - this.f14330k);
                    this.f14340v.b(iMin2, np0Var);
                    int i36 = this.f14330k + iMin2;
                    this.f14330k = i36;
                    if (i36 == this.f14338t) {
                        ps1.c0(this.f14339u != C.TIME_UNSET);
                        this.f14340v.c(this.f14339u, 1, this.f14338t, 0, null);
                        this.f14339u += this.f14341w;
                        this.f14329j = 0;
                        this.f14330k = 0;
                        this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                    }
                } else {
                    int i37 = true != this.f14331m ? 5 : 7;
                    byte[] bArr7 = gp0Var.f14921a;
                    int iMin3 = Math.min(np0Var.B(), i37 - this.f14330k);
                    np0Var.H(bArr7, this.f14330k, iMin3);
                    int i38 = this.f14330k + iMin3;
                    this.f14330k = i38;
                    if (i38 == i37) {
                        gp0Var.d(0);
                        if (this.f14336r) {
                            gp0Var.f(10);
                        } else {
                            int iH3 = gp0Var.h(2) + 1;
                            if (iH3 != 2) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(iH3).length() + 50);
                                sb2.append("Detected audio object type: ");
                                sb2.append(iH3);
                                sb2.append(", but assuming AAC LC.");
                                v71.y("AdtsReader", sb2.toString());
                            }
                            gp0Var.f(5);
                            int iH4 = gp0Var.h(3);
                            int i39 = this.f14334p;
                            byte[] bArr8 = {(byte) (((i39 >> 1) & 7) | 16), (byte) (((iH4 << 3) & 120) | ((i39 << 7) & 128))};
                            v1 v1VarP = dv.p(new gp0(bArr8, 2), false);
                            i12 i12Var = new i12();
                            i12Var.f15499a = this.f14326g;
                            i12Var.d(this.f14325f);
                            i12Var.e(MimeTypes.AUDIO_AAC);
                            i12Var.f15508j = v1VarP.f20993a;
                            i12Var.F = v1VarP.f20995c;
                            i12Var.H = v1VarP.f20994b;
                            i12Var.f15514q = Collections.singletonList(bArr8);
                            i12Var.f15502d = this.f14323d;
                            i12Var.f15504f = this.f14324e;
                            g22 g22Var = new g22(i12Var);
                            this.f14337s = 1024000000 / ((long) g22Var.I);
                            this.f14327h.f(g22Var);
                            this.f14336r = true;
                        }
                        gp0Var.f(4);
                        int iH5 = gp0Var.h(13);
                        int i40 = iH5 - 7;
                        if (this.f14331m) {
                            i40 = iH5 - 9;
                        }
                        h3 h3Var2 = this.f14327h;
                        long j10 = this.f14337s;
                        this.f14329j = 4;
                        this.f14330k = 0;
                        this.f14340v = h3Var2;
                        this.f14341w = j10;
                        this.f14338t = i40;
                    }
                }
            } else if (np0Var.B() != 0) {
                gp0Var.f14921a[0] = np0Var.f17880a[np0Var.f17881b];
                gp0Var.d(2);
                int iH6 = gp0Var.h(4);
                int i41 = this.f14334p;
                if (i41 == -1 || iH6 == i41) {
                    if (!this.f14332n) {
                        this.f14332n = true;
                        this.f14333o = this.f14335q;
                        this.f14334p = iH6;
                    }
                    this.f14329j = 3;
                    this.f14330k = 0;
                } else {
                    this.f14332n = false;
                    this.f14329j = 0;
                    this.f14330k = 0;
                    this.l = NotificationCompat.FLAG_LOCAL_ONLY;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        this.f14339u = C.TIME_UNSET;
        this.f14332n = false;
        this.f14329j = 0;
        this.f14330k = 0;
        this.l = NotificationCompat.FLAG_LOCAL_ONLY;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(boolean z10) {
    }
}
