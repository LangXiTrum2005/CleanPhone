package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 implements e6, h3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f22071e;

    public y1(String str, int i10, int i11, int i12, int i13) {
        this.f22067a = i10;
        this.f22071e = str;
        this.f22068b = i11;
        this.f22069c = i12;
        this.f22070d = i13;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x020c A[Catch: RuntimeException -> 0x0251, TryCatch #0 {RuntimeException -> 0x0251, blocks: (B:3:0x0008, B:6:0x001b, B:8:0x0039, B:14:0x005f, B:18:0x0083, B:20:0x00c9, B:22:0x00d7, B:24:0x00e5, B:26:0x010d, B:28:0x0113, B:30:0x0124, B:32:0x012d, B:34:0x0135, B:36:0x0146, B:38:0x0153, B:40:0x0164, B:42:0x016a, B:44:0x017b, B:46:0x0181, B:48:0x0192, B:50:0x019a, B:52:0x01a4, B:53:0x01a7, B:54:0x01aa, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:61:0x01d2, B:66:0x01df, B:68:0x01e5, B:70:0x01ea, B:71:0x01ed, B:74:0x01f8, B:77:0x01ff, B:80:0x0206, B:82:0x020c, B:84:0x0218, B:96:0x023c, B:100:0x0247, B:95:0x0238, B:64:0x01d9), top: B:105:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0218 A[Catch: RuntimeException -> 0x0251, TryCatch #0 {RuntimeException -> 0x0251, blocks: (B:3:0x0008, B:6:0x001b, B:8:0x0039, B:14:0x005f, B:18:0x0083, B:20:0x00c9, B:22:0x00d7, B:24:0x00e5, B:26:0x010d, B:28:0x0113, B:30:0x0124, B:32:0x012d, B:34:0x0135, B:36:0x0146, B:38:0x0153, B:40:0x0164, B:42:0x016a, B:44:0x017b, B:46:0x0181, B:48:0x0192, B:50:0x019a, B:52:0x01a4, B:53:0x01a7, B:54:0x01aa, B:56:0x01c0, B:58:0x01c6, B:60:0x01cf, B:61:0x01d2, B:66:0x01df, B:68:0x01e5, B:70:0x01ea, B:71:0x01ed, B:74:0x01f8, B:77:0x01ff, B:80:0x0206, B:82:0x020c, B:84:0x0218, B:96:0x023c, B:100:0x0247, B:95:0x0238, B:64:0x01d9), top: B:105:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0237  */
    /* JADX WARN: Code duplicated, block: B:98:0x0242  */
    /* JADX WARN: Code duplicated, block: B:99:0x0245  */
    public static y1 b(byte[] bArr) throws ab {
        int i10;
        int iH;
        int i11;
        int iH2;
        int i12;
        try {
            gp0 gp0Var = new gp0(bArr, bArr.length);
            gp0Var.e();
            int iH3 = gp0Var.h(7);
            if (iH3 != 1) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(iH3).length() + 26);
                sb2.append("Unsupported av1C version: ");
                sb2.append(iH3);
                v71.y("Av1Config", sb2.toString());
                return null;
            }
            int iH4 = gp0Var.h(3);
            int iH5 = gp0Var.h(5);
            boolean zG = gp0Var.g();
            int i13 = gp0Var.g() ? true != gp0Var.g() ? 10 : 12 : 8;
            gp0Var.f(13);
            Object[] objArr = {Integer.valueOf(iH5)};
            String str = uu0.f20901a;
            Locale locale = Locale.US;
            String str2 = String.format(locale, "%02d", objArr);
            String str3 = true != zG ? "M" : "H";
            String str4 = String.format(locale, "%02d", Integer.valueOf(i13));
            StringBuilder sb3 = new StringBuilder(String.valueOf(iH4).length() + 6 + str2.length() + 2 + str4.length());
            sb3.append("av01.");
            sb3.append(iH4);
            sb3.append(".");
            sb3.append(str2);
            sb3.append(str3);
            sb3.append(".");
            sb3.append(str4);
            String string = sb3.toString();
            if (gp0Var.b() <= 0) {
                return new y1(string, i13, -1, -1, -1);
            }
            gp0Var.e();
            int iH6 = gp0Var.h(4);
            if (iH6 != 1) {
                StringBuilder sb4 = new StringBuilder(String.valueOf(iH6).length() + 22);
                sb4.append("Unsupported obu_type: ");
                sb4.append(iH6);
                v71.r("Av1Config", sb4.toString());
                return new y1(string, i13, -1, -1, -1);
            }
            if (gp0Var.g()) {
                v71.r("Av1Config", "Unsupported obu_extension_flag");
                return new y1(string, i13, -1, -1, -1);
            }
            boolean zG2 = gp0Var.g();
            gp0Var.e();
            if (zG2 && gp0Var.h(8) > 127) {
                v71.r("Av1Config", "Excessive obu_size");
                return new y1(string, i13, -1, -1, -1);
            }
            int iH7 = gp0Var.h(3);
            gp0Var.e();
            if (gp0Var.g()) {
                v71.r("Av1Config", "Unsupported reduced_still_picture_header");
                return new y1(string, i13, -1, -1, -1);
            }
            if (gp0Var.g()) {
                v71.r("Av1Config", "Unsupported timing_info_present_flag");
                return new y1(string, i13, -1, -1, -1);
            }
            if (gp0Var.g()) {
                v71.r("Av1Config", "Unsupported initial_display_delay_present_flag");
                return new y1(string, i13, -1, -1, -1);
            }
            int iH8 = gp0Var.h(5);
            boolean z10 = false;
            for (int i14 = 0; i14 <= iH8; i14++) {
                gp0Var.f(12);
                if (gp0Var.h(5) > 7) {
                    gp0Var.e();
                }
            }
            int iH9 = gp0Var.h(4);
            int iH10 = gp0Var.h(4);
            gp0Var.f(iH9 + 1);
            gp0Var.f(iH10 + 1);
            if (gp0Var.g()) {
                i10 = 7;
                gp0Var.f(7);
            } else {
                i10 = 7;
            }
            gp0Var.f(i10);
            boolean zG3 = gp0Var.g();
            if (zG3) {
                gp0Var.f(2);
            }
            if (gp0Var.g() || gp0Var.h(1) > 0) {
                if (!gp0Var.g()) {
                    gp0Var.f(1);
                }
            }
            if (zG3) {
                gp0Var.f(3);
            }
            gp0Var.f(3);
            boolean zG4 = gp0Var.g();
            if (iH7 != 2) {
                if (iH7 == 1) {
                }
                if (!gp0Var.g()) {
                    return new y1(string, i13, -1, -1, -1);
                }
                int iH11 = gp0Var.h(8);
                iH = gp0Var.h(8);
                int iH12 = gp0Var.h(8);
                if (z10 && iH11 == 1) {
                    if (iH == 13) {
                        if (iH12 == 0) {
                            i11 = 13;
                            iH11 = 1;
                            iH2 = 1;
                        } else {
                            i11 = 13;
                        }
                        int iB = lq1.b(iH11);
                        if (iH2 == 1) {
                            i12 = 1;
                        } else {
                            i12 = 2;
                        }
                        return new y1(string, i13, iB, i12, lq1.c(i11));
                    }
                    i11 = iH;
                    iH11 = 1;
                } else {
                    i11 = iH;
                }
                iH2 = gp0Var.h(1);
                int iB2 = lq1.b(iH11);
                if (iH2 == 1) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                return new y1(string, i13, iB2, i12, lq1.c(i11));
            }
            if (zG4) {
                gp0Var.e();
            }
            if (gp0Var.g()) {
                z10 = true;
            }
            if (!gp0Var.g()) {
                return new y1(string, i13, -1, -1, -1);
            }
            int iH13 = gp0Var.h(8);
            iH = gp0Var.h(8);
            int iH14 = gp0Var.h(8);
            if (z10) {
                i11 = iH;
                iH2 = gp0Var.h(1);
            } else {
                i11 = iH;
                iH2 = gp0Var.h(1);
            }
            int iB3 = lq1.b(iH13);
            if (iH2 == 1) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            return new y1(string, i13, iB3, i12, lq1.c(i11));
        } catch (RuntimeException e10) {
            throw ab.a(e10, "Error parsing AV1 config");
        }
    }

    @Override // h3.a
    public int a() {
        return -1;
    }

    @Override // h3.a
    public int getSampleCount() {
        return this.f22067a;
    }

    @Override // h3.a
    public int readNextSampleSize() {
        l1.q qVar = (l1.q) this.f22071e;
        int i10 = this.f22068b;
        if (i10 == 8) {
            return qVar.z();
        }
        if (i10 == 16) {
            return qVar.G();
        }
        int i11 = this.f22069c;
        this.f22069c = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f22070d & 15;
        }
        int iZ = qVar.z();
        this.f22070d = iZ;
        return (iZ & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int zza() {
        return this.f22067a;
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int zzb() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.e6
    public int zzc() {
        np0 np0Var = (np0) this.f22071e;
        int i10 = this.f22068b;
        if (i10 == 8) {
            return np0Var.K();
        }
        if (i10 == 16) {
            return np0Var.L();
        }
        int i11 = this.f22069c;
        this.f22069c = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f22070d & 15;
        }
        int iK = np0Var.K();
        this.f22070d = iK;
        return (iK & PsExtractor.VIDEO_STREAM_MASK) >> 4;
    }

    public y1(w01 w01Var) {
        np0 np0Var = w01Var.f21353c;
        this.f22071e = np0Var;
        np0Var.E(12);
        this.f22068b = np0Var.h() & 255;
        this.f22067a = np0Var.h();
    }

    public y1(m1.d dVar) {
        l1.q qVar = dVar.f45776c;
        this.f22071e = qVar;
        qVar.M(12);
        this.f22068b = qVar.D() & 255;
        this.f22067a = qVar.D();
    }
}
