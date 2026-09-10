package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import com.thinkup.core.common.n.mo;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhyo implements Closeable {
    private final Reader zzb;
    private long zzi;
    private int zzj;
    private int[] zzk;
    private String[] zzm;
    private int[] zzn;
    private zzhxo zzc = zzhxo.LEGACY_STRICT;
    private final char[] zzd = new char[1024];
    private int zze = 0;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = 0;
    int zza = 0;
    private int zzl = 1;

    static {
        zzhxr.zza = new zzhyn();
    }

    public zzhyo(Reader reader) {
        int[] iArr = new int[32];
        this.zzk = iArr;
        iArr[0] = 6;
        this.zzm = new String[32];
        this.zzn = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.zzb = reader;
    }

    private final boolean zzn(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case mo.oom.mo0 /* 93 */:
                            return false;
                        case mo.oom.m0n /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        zzt();
        return false;
    }

    private final String zzo(char c2) throws IOException {
        char[] cArr;
        int i2;
        StringBuilder sb = null;
        do {
            int i3 = this.zze;
            int i4 = this.zzf;
            int i5 = i3;
            while (true) {
                cArr = this.zzd;
                if (i3 < i4) {
                    int i6 = i3 + 1;
                    char c3 = cArr[i3];
                    zzhxo zzhxoVar = this.zzc;
                    zzhxo zzhxoVar2 = zzhxo.STRICT;
                    if (zzhxoVar == zzhxoVar2 && c3 < ' ') {
                        throw zzv("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                    }
                    if (c3 == c2) {
                        int i7 = (i6 - i5) - 1;
                        this.zze = i6;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    }
                    char c4 = '\n';
                    if (c3 == '\\') {
                        int i8 = i6 - i5;
                        int i9 = i8 - 1;
                        this.zze = i6;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i8 + i8, 16));
                        }
                        sb.append(cArr, i5, i9);
                        if (this.zze == this.zzf && !zzr(1)) {
                            throw zzv("Unterminated escape sequence");
                        }
                        int i10 = this.zze;
                        int i11 = i10 + 1;
                        this.zze = i11;
                        char c5 = cArr[i10];
                        if (c5 != '\n') {
                            if (c5 == '\"') {
                                c4 = c5;
                            } else {
                                if (c5 != '\'') {
                                    if (c5 != '/' && c5 != '\\') {
                                        if (c5 == 'b') {
                                            c4 = '\b';
                                        } else if (c5 == 'f') {
                                            c4 = '\f';
                                        } else if (c5 != 'n') {
                                            if (c5 == 'r') {
                                                c4 = '\r';
                                            } else if (c5 == 't') {
                                                c4 = '\t';
                                            } else {
                                                if (c5 != 'u') {
                                                    throw zzv("Invalid escape sequence");
                                                }
                                                if (i10 + 5 > this.zzf && !zzr(4)) {
                                                    throw zzv("Unterminated escape sequence");
                                                }
                                                int i12 = this.zze;
                                                int i13 = i12 + 4;
                                                int i14 = 0;
                                                while (i12 < i13) {
                                                    int i15 = i14 << 4;
                                                    char c6 = cArr[i12];
                                                    if (c6 >= '0' && c6 <= '9') {
                                                        i2 = c6 - '0';
                                                    } else if (c6 >= 'a' && c6 <= 'f') {
                                                        i2 = c6 - 'W';
                                                    } else {
                                                        if (c6 < 'A' || c6 > 'F') {
                                                            throw zzv("Malformed Unicode escape \\u".concat(new String(cArr, this.zze, 4)));
                                                        }
                                                        i2 = c6 - '7';
                                                    }
                                                    i14 = i2 + i15;
                                                    i12++;
                                                }
                                                this.zze += 4;
                                                c4 = (char) i14;
                                            }
                                        }
                                    }
                                }
                                c4 = c5;
                            }
                            sb.append(c4);
                            i5 = this.zze;
                            i4 = this.zzf;
                            i3 = i5;
                        } else {
                            if (this.zzc == zzhxoVar2) {
                                throw zzv("Cannot escape a newline character in strict mode");
                            }
                            this.zzg++;
                            this.zzh = i11;
                        }
                        if (this.zzc == zzhxoVar2) {
                            throw zzv("Invalid escaped character \"'\" in strict mode");
                        }
                        c4 = c5;
                        sb.append(c4);
                        i5 = this.zze;
                        i4 = this.zzf;
                        i3 = i5;
                    } else {
                        if (c3 == '\n') {
                            this.zzg++;
                            this.zzh = i6;
                        }
                        i3 = i6;
                    }
                }
            }
            int i16 = i3 - i5;
            if (sb == null) {
                sb = new StringBuilder(Math.max(i16 + i16, 16));
            }
            sb.append(cArr, i5, i16);
            this.zze = i3;
        } while (zzr(1));
        throw zzv("Unterminated string");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    private final String zzp() throws IOException {
        String string;
        int i2 = 0;
        StringBuilder sb = null;
        while (true) {
            int i3 = 0;
            while (true) {
                int i4 = this.zze + i3;
                if (i4 < this.zzf) {
                    char c2 = this.zzd[i4];
                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                        if (c2 != '#') {
                            if (c2 != ',') {
                                if (c2 != '/' && c2 != '=') {
                                    if (c2 != '{' && c2 != '}' && c2 != ':') {
                                        if (c2 != ';') {
                                            switch (c2) {
                                                case '[':
                                                case mo.oom.mo0 /* 93 */:
                                                    break;
                                                case mo.oom.m0n /* 92 */:
                                                    break;
                                                default:
                                                    i3++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        zzt();
                    }
                    i2 = i3;
                } else if (i3 >= 1024) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i3, 16));
                    }
                    sb.append(this.zzd, this.zze, i3);
                    this.zze += i3;
                    if (!zzr(1)) {
                    }
                } else if (!zzr(i3 + 1)) {
                    i2 = i3;
                }
                if (sb == null) {
                    string = new String(this.zzd, this.zze, i2);
                } else {
                    sb.append(this.zzd, this.zze, i2);
                    string = sb.toString();
                }
                this.zze += i2;
                return string;
            }
        }
    }

    private final void zzq(int i2) throws zzhyr {
        int i3 = this.zzl;
        if (i3 - 1 >= 1280) {
            String strZzl = zzl();
            throw new zzhyr(android.support.v4.media.a.r(new StringBuilder(strZzl.length() + 26), "Nesting limit 1280 reached", strZzl));
        }
        int[] iArr = this.zzk;
        if (i3 == iArr.length) {
            int i4 = i3 + i3;
            this.zzk = Arrays.copyOf(iArr, i4);
            this.zzn = Arrays.copyOf(this.zzn, i4);
            this.zzm = (String[]) Arrays.copyOf(this.zzm, i4);
        }
        int[] iArr2 = this.zzk;
        int i5 = this.zzl;
        this.zzl = i5 + 1;
        iArr2[i5] = i2;
    }

    private final boolean zzr(int i2) throws IOException {
        int i3;
        int i4 = this.zzh;
        int i5 = this.zze;
        this.zzh = i4 - i5;
        char[] cArr = this.zzd;
        int i6 = this.zzf;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.zzf = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.zzf = 0;
        }
        this.zze = 0;
        do {
            Reader reader = this.zzb;
            int i8 = this.zzf;
            int i9 = reader.read(cArr, i8, 1024 - i8);
            if (i9 == -1) {
                return false;
            }
            i3 = this.zzf + i9;
            this.zzf = i3;
            if (this.zzg == 0 && this.zzh == 0 && i3 > 0 && cArr[0] == 65279) {
                this.zze++;
                this.zzh = 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private final int zzs(boolean z2) throws IOException {
        int i2 = this.zze;
        int i3 = this.zzf;
        while (true) {
            if (i2 == i3) {
                this.zze = i2;
                if (!zzr(1)) {
                    if (z2) {
                        throw new EOFException("End of input".concat(zzl()));
                    }
                    return -1;
                }
                i2 = this.zze;
                i3 = this.zzf;
            }
            char[] cArr = this.zzd;
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.zzg++;
                this.zzh = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.zze = i4;
                    if (i4 == i3) {
                        this.zze = i2;
                        boolean zZzr = zzr(2);
                        this.zze++;
                        if (!zZzr) {
                            return 47;
                        }
                    }
                    zzt();
                    int i5 = this.zze;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.zze = i5 + 1;
                        while (true) {
                            if (this.zze + 2 > this.zzf && !zzr(2)) {
                                throw zzv("Unterminated comment");
                            }
                            int i6 = this.zze;
                            if (cArr[i6] != '\n') {
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= 2) {
                                        i2 = this.zze + 2;
                                        i3 = this.zzf;
                                        break;
                                    }
                                    if (cArr[this.zze + i7] != "*/".charAt(i7)) {
                                        break;
                                    }
                                    i7++;
                                }
                            } else {
                                this.zzg++;
                                this.zzh = i6 + 1;
                            }
                            this.zze++;
                        }
                    } else {
                        if (c3 != '/') {
                            return 47;
                        }
                        this.zze = i5 + 1;
                        zzu();
                        i2 = this.zze;
                        i3 = this.zzf;
                    }
                } else {
                    if (c2 != '#') {
                        this.zze = i4;
                        return c2;
                    }
                    this.zze = i4;
                    zzt();
                    zzu();
                    i2 = this.zze;
                    i3 = this.zzf;
                }
            }
            i2 = i4;
        }
    }

    private final void zzt() throws zzhyr {
        if (this.zzc != zzhxo.LENIENT) {
            throw zzv("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void zzu() throws IOException {
        char c2;
        do {
            if (this.zze >= this.zzf && !zzr(1)) {
                return;
            }
            char[] cArr = this.zzd;
            int i2 = this.zze;
            int i3 = i2 + 1;
            this.zze = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.zzg++;
                this.zzh = i3;
                return;
            }
        } while (c2 != '\r');
    }

    private final zzhyr zzv(String str) throws zzhyr {
        String strZzl = zzl();
        throw new zzhyr(android.support.v4.media.a.s(new StringBuilder(str.length() + strZzl.length() + 79), str, strZzl, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    private final IllegalStateException zzw(String str) throws IOException {
        int iZzm = zzm();
        String strZza = zzhyp.zza(zzm());
        String strZzl = zzl();
        int iD = Z.d(strZza, str.length() + 18, strZzl.length());
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iZzm == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb = new StringBuilder(strConcat.length() + iD + 5);
        androidx.media3.extractor.text.ttml.a.C(sb, "Expected ", str, " but was ", strZza);
        return new IllegalStateException(android.support.v4.media.a.s(sb, strZzl, "\nSee ", strConcat));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.zza = 0;
        this.zzk[0] = 8;
        this.zzl = 1;
        this.zzb.close();
    }

    public final String toString() {
        return "zzhyo".concat(zzl());
    }

    public final void zza(zzhxo zzhxoVar) {
        Objects.requireNonNull(zzhxoVar);
        this.zzc = zzhxoVar;
    }

    public final void zzb() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 3) {
            throw zzw("BEGIN_ARRAY");
        }
        zzq(1);
        this.zzn[this.zzl - 1] = 0;
        this.zza = 0;
    }

    public final void zzc() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 4) {
            throw zzw("END_ARRAY");
        }
        int i2 = this.zzl;
        this.zzl = i2 - 1;
        int[] iArr = this.zzn;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.zza = 0;
    }

    public final void zzd() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 1) {
            throw zzw("BEGIN_OBJECT");
        }
        zzq(3);
        this.zza = 0;
    }

    public final void zze() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 2) {
            throw zzw("END_OBJECT");
        }
        int i2 = this.zzl;
        int i3 = i2 - 1;
        this.zzl = i3;
        this.zzm[i3] = null;
        int[] iArr = this.zzn;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.zza = 0;
    }

    public final boolean zzf() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        return (iZzg == 2 || iZzg == 4 || iZzg == 17) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x018e  */
    /* JADX WARN: Code duplicated, block: B:115:0x019e  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:123:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:124:0x01bc A[PHI: r2 r6
  0x01bc: PHI (r2v41 int) = (r2v40 int), (r2v43 int) binds: [B:114:0x019c, B:123:0x01b6] A[DONT_GENERATE, DONT_INLINE]
  0x01bc: PHI (r6v15 int) = (r6v14 int), (r6v16 int) binds: [B:114:0x019c, B:123:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:126:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:166:0x0232  */
    /* JADX WARN: Code duplicated, block: B:167:0x0234  */
    /* JADX WARN: Code duplicated, block: B:169:0x023a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x023c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0241  */
    /* JADX WARN: Code duplicated, block: B:175:0x0247 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x024a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x025a A[DONT_INVERT, PHI: r8 r15
  0x025a: PHI (r8v20 int) = (r8v19 int), (r8v21 int) binds: [B:165:0x0230, B:171:0x023e] A[DONT_GENERATE, DONT_INLINE]
  0x025a: PHI (r15v15 int) = (r15v6 int), (r15v16 int) binds: [B:165:0x0230, B:171:0x023e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:183:0x025c  */
    /* JADX WARN: Code duplicated, block: B:195:0x027c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0282  */
    /* JADX WARN: Code duplicated, block: B:200:0x0287  */
    /* JADX WARN: Code duplicated, block: B:205:0x0296 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:206:0x0297  */
    /* JADX WARN: Code duplicated, block: B:208:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:210:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:212:0x02ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:217:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:226:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:228:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:244:0x030e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x0310  */
    /* JADX WARN: Code duplicated, block: B:247:0x0314  */
    /* JADX WARN: Code duplicated, block: B:249:0x0326  */
    /* JADX WARN: Code duplicated, block: B:250:0x0329  */
    /* JADX WARN: Code duplicated, block: B:252:0x032e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:254:0x0331  */
    /* JADX WARN: Code duplicated, block: B:256:0x0336  */
    /* JADX WARN: Code duplicated, block: B:258:0x033e  */
    /* JADX WARN: Code duplicated, block: B:267:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0247, code lost:
    
        if (r3 == 0) goto L179;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzg() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhyo.zzg():int");
    }

    public final String zzh() throws IOException {
        String strZzo;
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 14) {
            strZzo = zzp();
        } else if (iZzg == 12) {
            strZzo = zzo('\'');
        } else {
            if (iZzg != 13) {
                throw zzw("a name");
            }
            strZzo = zzo(AbstractJsonLexerKt.STRING);
        }
        this.zza = 0;
        this.zzm[this.zzl - 1] = strZzo;
        return strZzo;
    }

    public final String zzi() throws IOException {
        String string;
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 10) {
            string = zzp();
        } else if (iZzg == 8) {
            string = zzo('\'');
        } else if (iZzg == 9) {
            string = zzo(AbstractJsonLexerKt.STRING);
        } else if (iZzg == 11) {
            string = null;
        } else if (iZzg == 15) {
            string = Long.toString(this.zzi);
        } else {
            if (iZzg != 16) {
                throw zzw("a string");
            }
            String str = new String(this.zzd, this.zze, this.zzj);
            this.zze += this.zzj;
            string = str;
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
        return string;
    }

    public final boolean zzj() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg == 5) {
            this.zza = 0;
            int[] iArr = this.zzn;
            int i2 = this.zzl - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iZzg != 6) {
            throw zzw("a boolean");
        }
        this.zza = 0;
        int[] iArr2 = this.zzn;
        int i3 = this.zzl - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public final void zzk() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        if (iZzg != 7) {
            throw zzw(AbstractJsonLexerKt.NULL);
        }
        this.zza = 0;
        int[] iArr = this.zzn;
        int i2 = this.zzl - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final String zzl() {
        int i2 = this.zzg + 1;
        int i3 = this.zze - this.zzh;
        StringBuilder sb = new StringBuilder("$");
        for (int i4 = 0; i4 < this.zzl; i4++) {
            int i5 = this.zzk[i4];
            switch (i5) {
                case 1:
                case 2:
                    int i6 = this.zzn[i4];
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(i6);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.zzm[i4];
                    if (str != null) {
                        sb.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(androidx.datastore.preferences.protobuf.a.g(i5, "Unknown scope value: ", new StringBuilder(String.valueOf(i5).length() + 21)));
            }
        }
        int i7 = i3 + 1;
        String string = sb.toString();
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i7).length();
        StringBuilder sb2 = new StringBuilder(string.length() + length2 + length + 17 + 6);
        androidx.datastore.preferences.protobuf.a.z(sb2, " at line ", i2, " column ", i7);
        return android.support.v4.media.a.r(sb2, " path ", string);
    }

    public final int zzm() throws IOException {
        int iZzg = this.zza;
        if (iZzg == 0) {
            iZzg = zzg();
        }
        switch (iZzg) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }
}
