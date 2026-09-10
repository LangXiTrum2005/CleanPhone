package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pr1 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringReader f18776a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f18785j;
    public String[] l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f18787m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f18777b = new char[1024];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18778c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18779d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18780e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18781f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18782g = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18786k = 1;

    public pr1(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f18785j = iArr;
        iArr[0] = 6;
        this.l = new String[32];
        this.f18787m = new int[32];
        this.f18776a = stringReader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18782g = 0;
        this.f18785j[0] = 8;
        this.f18786k = 1;
        this.f18776a.close();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x014c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0150  */
    /* JADX WARN: Code duplicated, block: B:142:0x01be  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:154:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e9 A[DONT_INVERT, PHI: r9
  0x01e9: PHI (r9v20 char) = (r9v10 char), (r9v21 char) binds: [B:141:0x01bc, B:147:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:172:0x0208  */
    /* JADX WARN: Code duplicated, block: B:174:0x020c  */
    /* JADX WARN: Code duplicated, block: B:177:0x0211  */
    /* JADX WARN: Code duplicated, block: B:182:0x021f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:183:0x0220  */
    /* JADX WARN: Code duplicated, block: B:185:0x022a  */
    /* JADX WARN: Code duplicated, block: B:187:0x022e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0234 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:237:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x011c  */
    /* JADX WARN: Code duplicated, block: B:92:0x012d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x0140  */
    /* JADX WARN: Code duplicated, block: B:99:0x0144 A[PHI: r1 r3
  0x0144: PHI (r1v33 int) = (r1v32 int), (r1v47 int) binds: [B:91:0x012b, B:98:0x0140] A[DONT_GENERATE, DONT_INLINE]
  0x0144: PHI (r3v10 int) = (r3v9 int), (r3v11 int) binds: [B:91:0x012b, B:98:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01d2, code lost:
    
        if (r6 == false) goto L152;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d() {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pr1.d():int");
    }

    public final String h() {
        String str;
        int iD = this.f18782g;
        if (iD == 0) {
            iD = d();
        }
        if (iD == 10) {
            str = q();
        } else if (iD == 8) {
            str = p('\'');
        } else if (iD == 9) {
            str = p('\"');
        } else if (iD == 11) {
            str = null;
        } else if (iD == 15) {
            str = Long.toString(this.f18783h);
        } else {
            if (iD != 16) {
                throw w("a string");
            }
            str = new String(this.f18777b, this.f18778c, this.f18784i);
            this.f18778c += this.f18784i;
        }
        this.f18782g = 0;
        int[] iArr = this.f18787m;
        int i10 = this.f18786k - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    public final String k() {
        int i10 = this.f18780e + 1;
        int i11 = this.f18778c - this.f18781f;
        StringBuilder sb2 = new StringBuilder("$");
        for (int i12 = 0; i12 < this.f18786k; i12++) {
            int i13 = this.f18785j[i12];
            switch (i13) {
                case 1:
                case 2:
                    int i14 = this.f18787m[i12];
                    sb2.append('[');
                    sb2.append(i14);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.l[i12];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(l1.d.k(new StringBuilder(String.valueOf(i13).length() + 21), "Unknown scope value: ", i13));
            }
        }
        int i15 = i11 + 1;
        String string = sb2.toString();
        int length = String.valueOf(i10).length();
        int length2 = String.valueOf(i15).length();
        StringBuilder sb3 = new StringBuilder(string.length() + length2 + length + 17 + 6);
        l1.d.p(sb3, " at line ", i10, " column ", i15);
        return defpackage.e.q(" path ", string, sb3);
    }

    public final int n() {
        int iD = this.f18782g;
        if (iD == 0) {
            iD = d();
        }
        switch (iD) {
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

    public final boolean o(char c4) throws b2.z {
        if (c4 == '\t' || c4 == '\n' || c4 == '\f' || c4 == '\r' || c4 == ' ') {
            return false;
        }
        if (c4 != '#') {
            if (c4 == ',') {
                return false;
            }
            if (c4 != '/' && c4 != '=') {
                if (c4 == '{' || c4 == '}' || c4 == ':') {
                    return false;
                }
                if (c4 != ';') {
                    switch (c4) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        u();
        throw null;
    }

    public final String p(char c4) {
        char[] cArr;
        int i10;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f18778c;
            int i12 = this.f18779d;
            int i13 = i11;
            while (true) {
                cArr = this.f18777b;
                if (i11 < i12) {
                    int i14 = i11 + 1;
                    char c5 = cArr[i11];
                    if (c5 == c4) {
                        int i15 = (i14 - i13) - 1;
                        this.f18778c = i14;
                        if (sb2 == null) {
                            return new String(cArr, i13, i15);
                        }
                        sb2.append(cArr, i13, i15);
                        return sb2.toString();
                    }
                    char c10 = '\n';
                    if (c5 == '\\') {
                        int i16 = i14 - i13;
                        int i17 = i16 - 1;
                        this.f18778c = i14;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max(i16 + i16, 16));
                        }
                        sb2.append(cArr, i13, i17);
                        if (this.f18778c == this.f18779d && !s(1)) {
                            v("Unterminated escape sequence");
                            throw null;
                        }
                        int i18 = this.f18778c;
                        int i19 = i18 + 1;
                        this.f18778c = i19;
                        char c11 = cArr[i18];
                        if (c11 != '\n') {
                            if (c11 != '\"' && c11 != '\'' && c11 != '/' && c11 != '\\') {
                                if (c11 == 'b') {
                                    c10 = '\b';
                                } else if (c11 == 'f') {
                                    c10 = '\f';
                                } else if (c11 != 'n') {
                                    if (c11 == 'r') {
                                        c10 = '\r';
                                    } else if (c11 == 't') {
                                        c10 = '\t';
                                    } else {
                                        if (c11 != 'u') {
                                            v("Invalid escape sequence");
                                            throw null;
                                        }
                                        if (i18 + 5 > this.f18779d && !s(4)) {
                                            v("Unterminated escape sequence");
                                            throw null;
                                        }
                                        int i20 = this.f18778c;
                                        int i21 = i20 + 4;
                                        int i22 = 0;
                                        while (i20 < i21) {
                                            int i23 = i22 << 4;
                                            char c12 = cArr[i20];
                                            if (c12 >= '0' && c12 <= '9') {
                                                i10 = c12 - '0';
                                            } else if (c12 >= 'a' && c12 <= 'f') {
                                                i10 = c12 - 'W';
                                            } else {
                                                if (c12 < 'A' || c12 > 'F') {
                                                    v("Malformed Unicode escape \\u".concat(new String(cArr, this.f18778c, 4)));
                                                    throw null;
                                                }
                                                i10 = c12 - '7';
                                            }
                                            i22 = i10 + i23;
                                            i20++;
                                        }
                                        this.f18778c += 4;
                                        c10 = (char) i22;
                                    }
                                }
                            }
                            sb2.append(c10);
                            i13 = this.f18778c;
                            i12 = this.f18779d;
                            i11 = i13;
                        } else {
                            this.f18780e++;
                            this.f18781f = i19;
                        }
                        c10 = c11;
                        sb2.append(c10);
                        i13 = this.f18778c;
                        i12 = this.f18779d;
                        i11 = i13;
                    } else {
                        if (c5 == '\n') {
                            this.f18780e++;
                            this.f18781f = i14;
                        }
                        i11 = i14;
                    }
                }
            }
            int i24 = i11 - i13;
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max(i24 + i24, 16));
            }
            sb2.append(cArr, i13, i24);
            this.f18778c = i11;
        } while (s(1));
        v("Unterminated string");
        throw null;
    }

    public final String q() {
        char[] cArr;
        String string;
        int i10 = 0;
        int i11 = 0;
        StringBuilder sb2 = null;
        while (true) {
            int i12 = this.f18778c + i11;
            int i13 = this.f18779d;
            cArr = this.f18777b;
            if (i12 < i13) {
                char c4 = cArr[i12];
                if (c4 != '\t' && c4 != '\n' && c4 != '\f' && c4 != '\r' && c4 != ' ') {
                    if (c4 != '#') {
                        if (c4 != ',') {
                            if (c4 != '/' && c4 != '=') {
                                if (c4 != '{' && c4 != '}' && c4 != ':') {
                                    if (c4 != ';') {
                                        switch (c4) {
                                            case '[':
                                            case ']':
                                                break;
                                            case '\\':
                                                break;
                                            default:
                                                i11++;
                                                continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    u();
                    throw null;
                }
                i10 = i11;
            } else if (i11 >= 1024) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(Math.max(i11, 16));
                }
                sb2.append(cArr, this.f18778c, i11);
                this.f18778c += i11;
                if (s(1)) {
                    i11 = 0;
                }
            } else if (!s(i11 + 1)) {
                i10 = i11;
            }
        }
        if (sb2 == null) {
            string = new String(cArr, this.f18778c, i10);
        } else {
            sb2.append(cArr, this.f18778c, i10);
            string = sb2.toString();
        }
        this.f18778c += i10;
        return string;
    }

    public final void r(int i10) {
        int i11 = this.f18786k;
        if (i11 - 1 >= 1280) {
            String strK = k();
            throw new b2.z(defpackage.e.q("Nesting limit 1280 reached", strK, new StringBuilder(strK.length() + 26)));
        }
        int[] iArr = this.f18785j;
        if (i11 == iArr.length) {
            int i12 = i11 + i11;
            this.f18785j = Arrays.copyOf(iArr, i12);
            this.f18787m = Arrays.copyOf(this.f18787m, i12);
            this.l = (String[]) Arrays.copyOf(this.l, i12);
        }
        int[] iArr2 = this.f18785j;
        int i13 = this.f18786k;
        this.f18786k = i13 + 1;
        iArr2[i13] = i10;
    }

    public final boolean s(int i10) throws IOException {
        int i11;
        int i12 = this.f18781f;
        int i13 = this.f18778c;
        this.f18781f = i12 - i13;
        int i14 = this.f18779d;
        char[] cArr = this.f18777b;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f18779d = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f18779d = 0;
        }
        this.f18778c = 0;
        do {
            int i16 = this.f18779d;
            int i17 = this.f18776a.read(cArr, i16, 1024 - i16);
            if (i17 == -1) {
                return false;
            }
            i11 = this.f18779d + i17;
            this.f18779d = i11;
            if (this.f18780e == 0 && this.f18781f == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f18778c++;
                this.f18781f = 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final int t(boolean z10) throws IOException {
        int i10 = this.f18778c;
        int i11 = this.f18779d;
        while (true) {
            if (i10 == i11) {
                this.f18778c = i10;
                if (!s(1)) {
                    if (z10) {
                        throw new EOFException("End of input".concat(k()));
                    }
                    return -1;
                }
                i10 = this.f18778c;
                i11 = this.f18779d;
            }
            int i12 = i10 + 1;
            char c4 = this.f18777b[i10];
            if (c4 == '\n') {
                this.f18780e++;
                this.f18781f = i12;
            } else if (c4 != ' ' && c4 != '\r' && c4 != '\t') {
                if (c4 != '/') {
                    if (c4 != '#') {
                        this.f18778c = i12;
                        return c4;
                    }
                    this.f18778c = i12;
                    u();
                    throw null;
                }
                this.f18778c = i12;
                if (i12 == i11) {
                    this.f18778c = i10;
                    boolean zS = s(2);
                    this.f18778c++;
                    if (!zS) {
                        return 47;
                    }
                }
                u();
                throw null;
            }
            i10 = i12;
        }
    }

    public final String toString() {
        return pr1.class.getSimpleName().concat(k());
    }

    public final void u() throws b2.z {
        v("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public final void v(String str) throws b2.z {
        String strK = k();
        throw new b2.z(q4.a.j(new StringBuilder(str.length() + strK.length() + 79), str, strK, "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json"));
    }

    public final IllegalStateException w(String str) {
        int iN = n();
        String strA = jd1.a(n());
        String strK = k();
        int i10 = com.applovin.impl.ca.i(str.length() + 18, strK.length(), strA);
        String strConcat = "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iN == 9 ? "adapter-not-null-safe" : "unexpected-json-structure");
        StringBuilder sb2 = new StringBuilder(strConcat.length() + i10 + 5);
        d5.u.r(sb2, "Expected ", str, " but was ", strA);
        return new IllegalStateException(q4.a.j(sb2, strK, "\nSee ", strConcat));
    }
}
