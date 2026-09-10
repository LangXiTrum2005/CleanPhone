package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class la implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o2 f16835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h3 f16836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ja f16839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16841g;

    static {
        int i10 = x10.f21697x;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        return x10.l(n2Var);
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        this.f16837c = j10 == 0 ? 0 : 4;
        ja jaVar = this.f16839e;
        if (jaVar != null) {
            jaVar.c(j11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:69:0x0202  */
    /* JADX WARN: Code duplicated, block: B:70:0x021a  */
    /* JADX WARN: Code duplicated, block: B:72:0x021f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0235  */
    /* JADX WARN: Code duplicated, block: B:74:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0239 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x023b  */
    /* JADX WARN: Code duplicated, block: B:77:0x023e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0247  */
    /* JADX WARN: Code duplicated, block: B:81:0x0250  */
    /* JADX WARN: Code duplicated, block: B:84:0x0266  */
    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) throws ab {
        byte[] bArr;
        int i10;
        byte[] bArr2;
        ma maVar;
        int iB;
        int i11;
        this.f16836b.getClass();
        String str = uu0.f20901a;
        int i12 = this.f16837c;
        int i13 = 0;
        if (i12 == 0) {
            ps1.c0(n2Var.zzn() == 0);
            int i14 = this.f16840f;
            if (i14 != -1) {
                n2Var.zzf(i14);
                this.f16837c = 4;
                return 0;
            }
            if (!x10.l(n2Var)) {
                throw ab.a(null, "Unsupported or unrecognized wav file type.");
            }
            n2Var.zzf((int) (n2Var.zzm() - n2Var.zzn()));
            this.f16837c = 1;
            return 0;
        }
        long jE = -1;
        if (i12 == 1) {
            np0 np0Var = new np0(8);
            a0 a0VarC = a0.c(n2Var, np0Var);
            if (a0VarC.f11791a != 1685272116) {
                n2Var.zzl();
            } else {
                n2Var.b(8);
                np0Var.E(0);
                n2Var.v(np0Var.f17880a, 0, 8);
                jE = np0Var.e();
                n2Var.zzf(((int) a0VarC.f11792b) + 8);
            }
            this.f16838d = jE;
            this.f16837c = 2;
            return 0;
        }
        if (i12 != 2) {
            if (i12 != 3) {
                ps1.c0(this.f16841g != -1);
                long jZzn = this.f16841g - n2Var.zzn();
                ja jaVar = this.f16839e;
                jaVar.getClass();
                return jaVar.f(n2Var, jZzn) ? -1 : 0;
            }
            n2Var.zzl();
            a0 a0VarT = x10.t(1684108385, n2Var, new np0(8));
            n2Var.zzf(8);
            Pair pairCreate = Pair.create(Long.valueOf(n2Var.zzn()), Long.valueOf(a0VarT.f11792b));
            this.f16840f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j10 = this.f16838d;
            if (j10 != -1 && jLongValue == 4294967295L) {
                jLongValue = j10;
            }
            long j11 = ((long) this.f16840f) + jLongValue;
            this.f16841g = j11;
            long jZzo = n2Var.zzo();
            if (jZzo != -1 && j11 > jZzo) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j11).length() + 29 + String.valueOf(jZzo).length());
                q4.a.r(sb2, "Data exceeds input length: ", j11, ", ");
                sb2.append(jZzo);
                v71.y("WavExtractor", sb2.toString());
                this.f16841g = jZzo;
                j11 = jZzo;
            }
            ja jaVar2 = this.f16839e;
            jaVar2.getClass();
            jaVar2.a(this.f16840f, j11);
            this.f16837c = 4;
            return 0;
        }
        np0 np0Var2 = new np0(16);
        long j12 = x10.t(1718449184, n2Var, np0Var2).f11792b;
        ps1.c0(j12 >= 16);
        n2Var.v(np0Var2.f17880a, 0, 16);
        np0Var2.E(0);
        int iM = np0Var2.M();
        int iM2 = np0Var2.M();
        int i15 = np0Var2.i();
        np0Var2.i();
        int iM3 = np0Var2.M();
        int iM4 = np0Var2.M();
        int i16 = ((int) j12) - 16;
        if (i16 > 0) {
            bArr = new byte[i16];
            n2Var.v(bArr, 0, i16);
            if (iM == 65534) {
                if (i16 == 24) {
                    np0 np0Var3 = new np0(bArr);
                    np0Var3.M();
                    int iM5 = np0Var3.M();
                    if (iM5 != 0 && iM5 != iM4) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iM4).length() + String.valueOf(iM5).length() + 33 + 19);
                        l1.d.p(sb3, "validBits ( ", iM5, ")  != bitsPerSample( ", iM4);
                        sb3.append(") are not supported");
                        throw ab.b(sb3.toString());
                    }
                    int i17 = np0Var3.i();
                    if ((i17 >> 18) != 0 || (i17 != 0 && Integer.bitCount(i17) != iM2)) {
                        StringBuilder sb4 = new StringBuilder(String.valueOf(i17).length() + 57 + String.valueOf(iM2).length());
                        sb4.append("Channel mask ");
                        sb4.append(i17);
                        sb4.append(" is invalid or does not match channel count ");
                        sb4.append(iM2);
                        throw ab.b(sb4.toString());
                    }
                    int iM6 = np0Var3.M();
                    byte[] bArr3 = new byte[14];
                    np0Var3.H(bArr3, 0, 14);
                    if (!Arrays.equals(bArr3, x10.f21682h) && !Arrays.equals(bArr3, x10.f21683i)) {
                        throw ab.b("invalid wav format extension guid");
                    }
                    i13 = i17;
                    bArr2 = bArr;
                    i10 = iM6;
                } else {
                    i10 = 65534;
                }
                n2Var.zzf((int) (n2Var.zzm() - n2Var.zzn()));
                maVar = new ma(i10, iM2, i15, iM3, iM4, i13, bArr2);
                if (i10 == 17) {
                    this.f16839e = new ia(this.f16835a, this.f16836b, maVar);
                } else if (i10 == 6) {
                    this.f16839e = new ka(this.f16835a, this.f16836b, maVar, MimeTypes.AUDIO_ALAW, -1);
                } else if (i10 == 7) {
                    this.f16839e = new ka(this.f16835a, this.f16836b, maVar, MimeTypes.AUDIO_MLAW, -1);
                } else {
                    if (i10 == 1) {
                        iB = uu0.b(iM4, ByteOrder.LITTLE_ENDIAN);
                        i11 = iB;
                    } else if (i10 == 3) {
                        iB = uu0.c(iM4, ByteOrder.LITTLE_ENDIAN);
                        i11 = iB;
                    } else if (i10 != 65534) {
                        i11 = 0;
                    } else {
                        iB = uu0.b(iM4, ByteOrder.LITTLE_ENDIAN);
                        i11 = iB;
                    }
                    if (i11 == 0) {
                        StringBuilder sb5 = new StringBuilder(String.valueOf(i10).length() + 29);
                        sb5.append("Unsupported WAV format type: ");
                        sb5.append(i10);
                        throw ab.b(sb5.toString());
                    }
                    this.f16839e = new ka(this.f16835a, this.f16836b, maVar, MimeTypes.AUDIO_RAW, i11);
                }
                this.f16837c = 3;
                return 0;
            }
            bArr2 = bArr;
            n2Var.zzf((int) (n2Var.zzm() - n2Var.zzn()));
            maVar = new ma(i10, iM2, i15, iM3, iM4, i13, bArr2);
            if (i10 == 17) {
                this.f16839e = new ia(this.f16835a, this.f16836b, maVar);
            } else if (i10 == 6) {
                this.f16839e = new ka(this.f16835a, this.f16836b, maVar, MimeTypes.AUDIO_ALAW, -1);
            } else if (i10 == 7) {
                this.f16839e = new ka(this.f16835a, this.f16836b, maVar, MimeTypes.AUDIO_MLAW, -1);
            } else {
                if (i10 == 1) {
                    iB = uu0.b(iM4, ByteOrder.LITTLE_ENDIAN);
                    i11 = iB;
                } else if (i10 == 3) {
                    iB = uu0.c(iM4, ByteOrder.LITTLE_ENDIAN);
                    i11 = iB;
                } else if (i10 != 65534) {
                    i11 = 0;
                } else {
                    iB = uu0.b(iM4, ByteOrder.LITTLE_ENDIAN);
                    i11 = iB;
                }
                if (i11 == 0) {
                    StringBuilder sb6 = new StringBuilder(String.valueOf(i10).length() + 29);
                    sb6.append("Unsupported WAV format type: ");
                    sb6.append(i10);
                    throw ab.b(sb6.toString());
                }
                this.f16839e = new ka(this.f16835a, this.f16836b, maVar, MimeTypes.AUDIO_RAW, i11);
            }
            this.f16837c = 3;
            return 0;
        }
        bArr = uu0.f20902b;
        i10 = iM;
        bArr2 = bArr;
        n2Var.zzf((int) (n2Var.zzm() - n2Var.zzn()));
        maVar = new ma(i10, iM2, i15, iM3, iM4, i13, bArr2);
        if (i10 == 17) {
            this.f16839e = new ia(this.f16835a, this.f16836b, maVar);
        } else if (i10 == 6) {
            this.f16839e = new ka(this.f16835a, this.f16836b, maVar, MimeTypes.AUDIO_ALAW, -1);
        } else if (i10 == 7) {
            this.f16839e = new ka(this.f16835a, this.f16836b, maVar, MimeTypes.AUDIO_MLAW, -1);
        } else {
            if (i10 == 1) {
                iB = uu0.b(iM4, ByteOrder.LITTLE_ENDIAN);
                i11 = iB;
            } else if (i10 == 3) {
                iB = uu0.c(iM4, ByteOrder.LITTLE_ENDIAN);
                i11 = iB;
            } else if (i10 != 65534) {
                i11 = 0;
            } else {
                iB = uu0.b(iM4, ByteOrder.LITTLE_ENDIAN);
                i11 = iB;
            }
            if (i11 == 0) {
                StringBuilder sb7 = new StringBuilder(String.valueOf(i10).length() + 29);
                sb7.append("Unsupported WAV format type: ");
                sb7.append(i10);
                throw ab.b(sb7.toString());
            }
            this.f16839e = new ka(this.f16835a, this.f16836b, maVar, MimeTypes.AUDIO_RAW, i11);
        }
        this.f16837c = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f16835a = o2Var;
        this.f16836b = o2Var.e(0, 1);
        o2Var.zzv();
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
