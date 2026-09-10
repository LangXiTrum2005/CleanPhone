package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 implements m2 {
    public static final int[] l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f16683m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f16684n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f16685o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16690e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o2 f16692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h3 f16693h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r2 f16695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16696k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f16686a = new byte[1];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16691f = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h3 f16694i = new k2();

    static {
        String str = uu0.f20901a;
        Charset charset = StandardCharsets.UTF_8;
        f16684n = "#!AMR\n".getBytes(charset);
        f16685o = "#!AMR-WB\n".getBytes(charset);
    }

    public final boolean a(n2 n2Var) {
        n2Var.zzl();
        byte[] bArr = f16684n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        n2Var.v(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f16687b = false;
            n2Var.zzf(bArr.length);
            return true;
        }
        n2Var.zzl();
        byte[] bArr3 = f16685o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        n2Var.v(bArr4, 0, length2);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f16687b = true;
        n2Var.zzf(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        return a(n2Var);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        this.f16688c = 0L;
        this.f16689d = 0;
        this.f16690e = 0;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0094  */
    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x0105  */
    /* JADX WARN: Code duplicated, block: B:62:0x010e  */
    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        byte b10;
        int iE;
        int i10;
        this.f16693h.getClass();
        String str = uu0.f20901a;
        if (n2Var.zzn() == 0 && !a(n2Var)) {
            throw ab.a(null, "Could not find AMR header.");
        }
        boolean z10 = this.f16696k;
        int[] iArr = l;
        int[] iArr2 = f16683m;
        if (!z10) {
            this.f16696k = true;
            boolean z11 = this.f16687b;
            String str2 = MimeTypes.AUDIO_AMR_WB;
            String str3 = true != z11 ? "audio/amr" : MimeTypes.AUDIO_AMR_WB;
            if (true != z11) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            }
            int i11 = true != z11 ? 8000 : 16000;
            int i12 = z11 ? iArr2[8] : iArr[7];
            h3 h3Var = this.f16693h;
            i12 i12Var = new i12();
            i12Var.d(str3);
            i12Var.e(str2);
            i12Var.f15512o = i12;
            i12Var.F = 1;
            i12Var.H = i11;
            h3Var.f(new g22(i12Var));
        }
        int i13 = this.f16690e;
        if (i13 == 0) {
            try {
                n2Var.zzl();
                byte[] bArr = this.f16686a;
                n2Var.v(bArr, 0, 1);
                byte b11 = bArr[0];
                if ((b11 & 131) > 0) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf((int) b11).length() + 38);
                    sb2.append("Invalid padding bits for frame header ");
                    sb2.append((int) b11);
                    throw ab.a(null, sb2.toString());
                }
                boolean z12 = this.f16687b;
                int i14 = (b11 >> 3) & 15;
                if (!z12) {
                    if (!z12) {
                        if (i14 >= 12 && i14 <= 14) {
                        }
                    }
                    String str4 = true != z12 ? "NB" : "WB";
                    StringBuilder sb3 = new StringBuilder(String.valueOf(i14).length() + 26);
                    sb3.append("Illegal AMR ");
                    sb3.append(str4);
                    sb3.append(" frame type ");
                    sb3.append(i14);
                    throw ab.a(null, sb3.toString());
                }
                if (i14 >= 10 && i14 <= 13) {
                    if (!z12) {
                        if (i14 >= 12) {
                        }
                    }
                    if (true != z12) {
                    }
                    StringBuilder sb4 = new StringBuilder(String.valueOf(i14).length() + 26);
                    sb4.append("Illegal AMR ");
                    sb4.append(str4);
                    sb4.append(" frame type ");
                    sb4.append(i14);
                    throw ab.a(null, sb4.toString());
                }
                i13 = z12 ? iArr2[i14] : iArr[i14];
                this.f16689d = i13;
                this.f16690e = i13;
                if (this.f16691f == -1) {
                    this.f16691f = i13;
                }
                iE = this.f16694i.e(n2Var, i13, true);
                if (iE == -1) {
                    b10 = -1;
                } else {
                    i10 = this.f16690e - iE;
                    this.f16690e = i10;
                    if (i10 <= 0) {
                        this.f16694i.c(this.f16688c, 1, this.f16689d, 0, null);
                        this.f16688c += 20000;
                    }
                    b10 = 0;
                }
            } catch (EOFException unused) {
            }
        } else {
            iE = this.f16694i.e(n2Var, i13, true);
            if (iE == -1) {
                b10 = -1;
            } else {
                i10 = this.f16690e - iE;
                this.f16690e = i10;
                if (i10 <= 0) {
                    this.f16694i.c(this.f16688c, 1, this.f16689d, 0, null);
                    this.f16688c += 20000;
                }
                b10 = 0;
            }
        }
        if (this.f16695j == null) {
            r2 r2Var = new r2(C.TIME_UNSET, 0L);
            this.f16695j = r2Var;
            this.f16692g.o(r2Var);
        }
        return b10 == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f16692g = o2Var;
        h3 h3VarE = o2Var.e(0, 1);
        this.f16693h = h3VarE;
        this.f16694i = h3VarE;
        o2Var.zzv();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
