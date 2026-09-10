package ge;

import com.applovin.shadow.okio.internal.Buffer;
import d5.u;
import ea.a0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import l1.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f41863a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f41870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41871i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f41872j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f41873k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String[] f41874m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f41875n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41876o = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f41864b = new char[1024];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41865c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41866d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41867e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41868f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41869g = 0;
    public int l = 1;

    static {
        a0.l = new a0(18);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f41873k = iArr;
        iArr[0] = 6;
        this.f41874m = new String[32];
        this.f41875n = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f41863a = reader;
    }

    public long A() throws IOException {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            this.f41869g = 0;
            int[] iArr = this.f41875n;
            int i10 = this.l - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f41870h;
        }
        if (iN == 16) {
            this.f41872j = new String(this.f41864b, this.f41865c, this.f41871i);
            this.f41865c += this.f41871i;
        } else {
            if (iN != 8 && iN != 9 && iN != 10) {
                throw P("a long");
            }
            if (iN == 10) {
                this.f41872j = G();
            } else {
                this.f41872j = E(iN == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f41872j);
                this.f41869g = 0;
                int[] iArr2 = this.f41875n;
                int i11 = this.l - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f41869g = 11;
        double d10 = Double.parseDouble(this.f41872j);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f41872j + w());
        }
        this.f41872j = null;
        this.f41869g = 0;
        int[] iArr3 = this.f41875n;
        int i12 = this.l - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String B() throws IOException {
        String strE;
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 14) {
            strE = G();
        } else if (iN == 12) {
            strE = E('\'');
        } else {
            if (iN != 13) {
                throw P("a name");
            }
            strE = E('\"');
        }
        this.f41869g = 0;
        this.f41874m[this.l - 1] = strE;
        return strE;
    }

    public final int C(boolean z10) throws IOException {
        int i10 = this.f41865c;
        int i11 = this.f41866d;
        while (true) {
            if (i10 == i11) {
                this.f41865c = i10;
                if (!q(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + w());
                }
                i10 = this.f41865c;
                i11 = this.f41866d;
            }
            int i12 = i10 + 1;
            char[] cArr = this.f41864b;
            char c4 = cArr[i10];
            if (c4 == '\n') {
                this.f41867e++;
                this.f41868f = i12;
            } else if (c4 != ' ' && c4 != '\r' && c4 != '\t') {
                if (c4 == '/') {
                    this.f41865c = i12;
                    if (i12 == i11) {
                        this.f41865c = i10;
                        boolean zQ = q(2);
                        this.f41865c++;
                        if (!zQ) {
                        }
                        return c4;
                    }
                    k();
                    int i13 = this.f41865c;
                    char c5 = cArr[i13];
                    if (c5 == '*') {
                        this.f41865c = i13 + 1;
                        while (true) {
                            if (this.f41865c + 2 > this.f41866d && !q(2)) {
                                O("Unterminated comment");
                                throw null;
                            }
                            int i14 = this.f41865c;
                            if (cArr[i14] != '\n') {
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= 2) {
                                        i10 = this.f41865c + 2;
                                        i11 = this.f41866d;
                                        break;
                                    }
                                    if (cArr[this.f41865c + i15] != "*/".charAt(i15)) {
                                        break;
                                    }
                                    i15++;
                                }
                            } else {
                                this.f41867e++;
                                this.f41868f = i14 + 1;
                            }
                            this.f41865c++;
                        }
                    } else {
                        if (c5 != '/') {
                            return c4;
                        }
                        this.f41865c = i13 + 1;
                        L();
                        i10 = this.f41865c;
                        i11 = this.f41866d;
                    }
                } else {
                    if (c4 != '#') {
                        this.f41865c = i12;
                        return c4;
                    }
                    this.f41865c = i12;
                    k();
                    L();
                    i10 = this.f41865c;
                    i11 = this.f41866d;
                }
            }
            i10 = i12;
        }
    }

    public void D() {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 7) {
            throw P("null");
        }
        this.f41869g = 0;
        int[] iArr = this.f41875n;
        int i10 = this.l - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final String E(char c4) throws c {
        int i10;
        char[] cArr;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f41865c;
            int i12 = this.f41866d;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    cArr = this.f41864b;
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c5 = cArr[i11];
                        if (this.f41876o == 3 && c5 < ' ') {
                            O("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                            throw null;
                        }
                        if (c5 == c4) {
                            this.f41865c = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c5 == '\\') {
                            this.f41865c = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(J());
                            i11 = this.f41865c;
                            i12 = this.f41866d;
                        } else {
                            if (c5 == '\n') {
                                this.f41867e++;
                                this.f41868f = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb2.append(cArr, i10, i11 - i10);
            this.f41865c = i11;
        } while (q(1));
        O("Unterminated string");
        throw null;
    }

    public String F() throws IOException {
        String str;
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 10) {
            str = G();
        } else if (iN == 8) {
            str = E('\'');
        } else if (iN == 9) {
            str = E('\"');
        } else if (iN == 11) {
            str = this.f41872j;
            this.f41872j = null;
        } else if (iN == 15) {
            str = Long.toString(this.f41870h);
        } else {
            if (iN != 16) {
                throw P("a string");
            }
            str = new String(this.f41864b, this.f41865c, this.f41871i);
            this.f41865c += this.f41871i;
        }
        this.f41869g = 0;
        int[] iArr = this.f41875n;
        int i10 = this.l - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String G() throws c {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f41865c;
                int i13 = i12 + i11;
                int i14 = this.f41866d;
                char[] cArr = this.f41864b;
                if (i13 < i14) {
                    char c4 = cArr[i12 + i11];
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
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        k();
                    }
                    i10 = i11;
                } else if (i11 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(cArr, this.f41865c, i11);
                    this.f41865c += i11;
                    if (!q(1)) {
                    }
                } else if (!q(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(cArr, this.f41865c, i10);
                } else {
                    sb2.append(cArr, this.f41865c, i10);
                    string = sb2.toString();
                }
                this.f41865c += i10;
                return string;
            }
        }
    }

    public int H() throws IOException {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        switch (iN) {
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
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void I(int i10) throws c {
        int i11 = this.l;
        if (i11 - 1 >= 255) {
            throw new c("Nesting limit 255 reached" + w());
        }
        int[] iArr = this.f41873k;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f41873k = Arrays.copyOf(iArr, i12);
            this.f41875n = Arrays.copyOf(this.f41875n, i12);
            this.f41874m = (String[]) Arrays.copyOf(this.f41874m, i12);
        }
        int[] iArr2 = this.f41873k;
        int i13 = this.l;
        this.l = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char J() throws c {
        int i10;
        if (this.f41865c == this.f41866d && !q(1)) {
            O("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f41865c;
        int i12 = i11 + 1;
        this.f41865c = i12;
        char[] cArr = this.f41864b;
        char c4 = cArr[i11];
        if (c4 != '\n') {
            if (c4 != '\"') {
                if (c4 != '\'') {
                    if (c4 != '/' && c4 != '\\') {
                        if (c4 == 'b') {
                            return '\b';
                        }
                        if (c4 == 'f') {
                            return '\f';
                        }
                        if (c4 == 'n') {
                            return '\n';
                        }
                        if (c4 == 'r') {
                            return '\r';
                        }
                        if (c4 == 't') {
                            return '\t';
                        }
                        if (c4 != 'u') {
                            O("Invalid escape sequence");
                            throw null;
                        }
                        if (i11 + 5 > this.f41866d && !q(4)) {
                            O("Unterminated escape sequence");
                            throw null;
                        }
                        int i13 = this.f41865c;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c5 = cArr[i13];
                            int i16 = i15 << 4;
                            if (c5 >= '0' && c5 <= '9') {
                                i10 = c5 - '0';
                            } else if (c5 >= 'a' && c5 <= 'f') {
                                i10 = c5 - 'W';
                            } else {
                                if (c5 < 'A' || c5 > 'F') {
                                    O("Malformed Unicode escape \\u".concat(new String(cArr, this.f41865c, 4)));
                                    throw null;
                                }
                                i10 = c5 - '7';
                            }
                            i15 = i10 + i16;
                            i13++;
                        }
                        this.f41865c += 4;
                        return (char) i15;
                    }
                }
            }
            return c4;
        }
        if (this.f41876o == 3) {
            O("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f41867e++;
        this.f41868f = i12;
        if (this.f41876o == 3) {
            O("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c4;
    }

    public final void K(char c4) throws c {
        do {
            int i10 = this.f41865c;
            int i11 = this.f41866d;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c5 = this.f41864b[i10];
                if (c5 == c4) {
                    this.f41865c = i12;
                    return;
                }
                if (c5 == '\\') {
                    this.f41865c = i12;
                    J();
                    i10 = this.f41865c;
                    i11 = this.f41866d;
                } else {
                    if (c5 == '\n') {
                        this.f41867e++;
                        this.f41868f = i12;
                    }
                    i10 = i12;
                }
            }
            this.f41865c = i10;
        } while (q(1));
        O("Unterminated string");
        throw null;
    }

    public final void L() {
        char c4;
        do {
            if (this.f41865c >= this.f41866d && !q(1)) {
                return;
            }
            int i10 = this.f41865c;
            int i11 = i10 + 1;
            this.f41865c = i11;
            c4 = this.f41864b[i10];
            if (c4 == '\n') {
                this.f41867e++;
                this.f41868f = i11;
                return;
            }
        } while (c4 != '\r');
    }

    public final void M() throws c {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f41865c;
                if (i11 + i10 < this.f41866d) {
                    char c4 = this.f41864b[i11 + i10];
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
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        k();
                    }
                    this.f41865c += i10;
                    return;
                }
                this.f41865c = i11 + i10;
            }
        } while (q(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void N() throws IOException {
        int i10 = 0;
        do {
            int iN = this.f41869g;
            if (iN == 0) {
                iN = n();
            }
            switch (iN) {
                case 1:
                    I(3);
                    i10++;
                    this.f41869g = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f41874m[this.l - 1] = null;
                    }
                    this.l--;
                    i10--;
                    this.f41869g = 0;
                    break;
                case 3:
                    I(1);
                    i10++;
                    this.f41869g = 0;
                    break;
                case 4:
                    this.l--;
                    i10--;
                    this.f41869g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f41869g = 0;
                    break;
                case 8:
                    K('\'');
                    this.f41869g = 0;
                    break;
                case 9:
                    K('\"');
                    this.f41869g = 0;
                    break;
                case 10:
                    M();
                    this.f41869g = 0;
                    break;
                case 12:
                    K('\'');
                    if (i10 == 0) {
                        this.f41874m[this.l - 1] = "<skipped>";
                    }
                    this.f41869g = 0;
                    break;
                case 13:
                    K('\"');
                    if (i10 == 0) {
                        this.f41874m[this.l - 1] = "<skipped>";
                    }
                    this.f41869g = 0;
                    break;
                case 14:
                    M();
                    if (i10 == 0) {
                        this.f41874m[this.l - 1] = "<skipped>";
                    }
                    this.f41869g = 0;
                    break;
                case 16:
                    this.f41865c += this.f41871i;
                    this.f41869g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f41875n;
        int i11 = this.l - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void O(String str) throws c {
        StringBuilder sbI = u.i(str);
        sbI.append(w());
        sbI.append("\nSee ");
        sbI.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new c(sbI.toString());
    }

    public final IllegalStateException P(String str) {
        String str2 = H() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbK = u.k("Expected ", str, " but was ");
        sbK.append(u.z(H()));
        sbK.append(w());
        sbK.append("\nSee ");
        sbK.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbK.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41869g = 0;
        this.f41873k[0] = 8;
        this.l = 1;
        this.f41863a.close();
    }

    public void d() throws IOException {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 3) {
            throw P("BEGIN_ARRAY");
        }
        I(1);
        this.f41875n[this.l - 1] = 0;
        this.f41869g = 0;
    }

    public void h() throws IOException {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 1) {
            throw P("BEGIN_OBJECT");
        }
        I(3);
        this.f41869g = 0;
    }

    public final void k() throws c {
        if (this.f41876o == 1) {
            return;
        }
        O("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0145  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e  */
    /* JADX WARN: Code duplicated, block: B:112:0x016b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0173  */
    /* JADX WARN: Code duplicated, block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:120:0x0189  */
    /* JADX WARN: Code duplicated, block: B:123:0x019b  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b2 A[PHI: r4 r14
  0x01b2: PHI (r4v10 int) = (r4v9 int), (r4v15 int) binds: [B:122:0x0199, B:129:0x01ac] A[DONT_GENERATE, DONT_INLINE]
  0x01b2: PHI (r14v6 int) = (r14v5 int), (r14v7 int) binds: [B:122:0x0199, B:129:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:134:0x01be  */
    /* JADX WARN: Code duplicated, block: B:172:0x021d  */
    /* JADX WARN: Code duplicated, block: B:173:0x021f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0240 A[DONT_INVERT, PHI: r13
  0x0240: PHI (r13v24 int) = (r13v23 int), (r13v25 int) binds: [B:171:0x021b, B:177:0x0228] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x0242  */
    /* JADX WARN: Code duplicated, block: B:199:0x025f  */
    /* JADX WARN: Code duplicated, block: B:201:0x0262  */
    /* JADX WARN: Code duplicated, block: B:204:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x0270 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:209:0x0271  */
    /* JADX WARN: Code duplicated, block: B:211:0x027b  */
    /* JADX WARN: Code duplicated, block: B:213:0x0281  */
    /* JADX WARN: Code duplicated, block: B:215:0x0287  */
    /* JADX WARN: Code duplicated, block: B:217:0x028a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:218:0x028c  */
    /* JADX WARN: Code duplicated, block: B:220:0x0290  */
    /* JADX WARN: Code duplicated, block: B:230:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:232:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:273:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x012b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x0136  */
    /* JADX WARN: Code duplicated, block: B:99:0x013e  */
    public final int n() throws IOException {
        int iC;
        int i10;
        int iC2;
        char c4;
        String str;
        String str2;
        int i11;
        int i12;
        int length;
        int i13;
        char c5;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        char c10;
        int i18;
        int i19;
        int[] iArr = this.f41873k;
        int i20 = this.l - 1;
        int i21 = iArr[i20];
        char[] cArr = this.f41864b;
        if (i21 == 1) {
            iArr[i20] = 2;
        } else if (i21 == 2) {
            int iC3 = C(true);
            if (iC3 != 44) {
                if (iC3 != 59) {
                    if (iC3 == 93) {
                        this.f41869g = 4;
                        return 4;
                    }
                    O("Unterminated array");
                    throw null;
                }
                k();
            }
        } else {
            if (i21 == 3 || i21 == 5) {
                iArr[i20] = 4;
                if (i21 == 5 && (iC = C(true)) != 44) {
                    if (iC != 59) {
                        if (iC == 125) {
                            this.f41869g = 2;
                            return 2;
                        }
                        O("Unterminated object");
                        throw null;
                    }
                    k();
                }
                int iC4 = C(true);
                if (iC4 == 34) {
                    this.f41869g = 13;
                    return 13;
                }
                if (iC4 == 39) {
                    k();
                    this.f41869g = 12;
                    return 12;
                }
                if (iC4 == 125) {
                    if (i21 != 5) {
                        this.f41869g = 2;
                        return 2;
                    }
                    O("Expected name");
                    throw null;
                }
                k();
                this.f41865c--;
                if (v((char) iC4)) {
                    this.f41869g = 14;
                    return 14;
                }
                O("Expected name");
                throw null;
            }
            if (i21 != 4) {
                if (i21 == 6) {
                    if (this.f41876o == 1) {
                        C(true);
                        int i22 = this.f41865c;
                        this.f41865c = i22 - 1;
                        if (i22 + 4 <= this.f41866d || q(5)) {
                            int i23 = this.f41865c;
                            if (cArr[i23] == ')' && cArr[i23 + 1] == ']' && cArr[i23 + 2] == '}' && cArr[i23 + 3] == '\'' && cArr[i23 + 4] == '\n') {
                                this.f41865c = i23 + 5;
                            }
                        }
                    }
                    this.f41873k[this.l - 1] = 7;
                } else if (i21 == 7) {
                    i10 = 0;
                    if (C(false) == -1) {
                        this.f41869g = 17;
                        return 17;
                    }
                    k();
                    this.f41865c--;
                } else {
                    i10 = 0;
                    if (i21 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iC2 = C(true);
                if (iC2 != 34) {
                    this.f41869g = 9;
                    return 9;
                }
                if (iC2 != 39) {
                    k();
                    this.f41869g = 8;
                    return 8;
                }
                if (iC2 != 44 && iC2 != 59) {
                    if (iC2 != 91) {
                        this.f41869g = 3;
                        return 3;
                    }
                    if (iC2 != 93) {
                        if (iC2 != 123) {
                            this.f41869g = 1;
                            return 1;
                        }
                        int i24 = this.f41865c - 1;
                        this.f41865c = i24;
                        c4 = cArr[i24];
                        if (c4 != 't' || c4 == 'T') {
                            str = com.ironsource.mediationsdk.metadata.a.f29610g;
                            str2 = "TRUE";
                            i11 = 5;
                        } else {
                            if (c4 != 'f' && c4 != 'F') {
                                if (c4 != 'n' && c4 != 'N') {
                                    i11 = i10;
                                    break;
                                }
                                str = "null";
                                str2 = "NULL";
                                i11 = 7;
                                if (i11 != 0) {
                                    return i11;
                                }
                                int i25 = this.f41865c;
                                i14 = this.f41866d;
                                i15 = i10;
                                i16 = i15;
                                int i26 = i16;
                                i17 = i25;
                                z10 = true;
                                long j10 = 0;
                                while (true) {
                                    if (i17 + i16 != i14) {
                                        c10 = cArr[i17 + i16];
                                        if (c10 != '+') {
                                            if (c10 != 'E' || c10 == 'e') {
                                                if (i15 != 2 || i15 == 4) {
                                                    i15 = 5;
                                                    i16++;
                                                }
                                            } else if (c10 == '-') {
                                                if (i15 == 0) {
                                                    i15 = 1;
                                                    i26 = 1;
                                                } else {
                                                    if (i15 != 5) {
                                                    }
                                                    i15 = 6;
                                                }
                                                i16++;
                                            } else if (c10 != '.') {
                                                if (c10 >= '0' && c10 <= '9') {
                                                    if (i15 == 1 || i15 == 0) {
                                                        j10 = -(c10 - '0');
                                                        i15 = 2;
                                                    } else if (i15 == 2) {
                                                        if (j10 != 0) {
                                                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                                                            z10 &= j10 > Buffer.OVERFLOW_ZONE || (j10 == Buffer.OVERFLOW_ZONE && j11 < j10);
                                                            j10 = j11;
                                                        }
                                                    } else if (i15 == 3) {
                                                        i15 = 4;
                                                    } else if (i15 == 5 || i15 == 6) {
                                                        i15 = 7;
                                                    }
                                                    i16++;
                                                } else if (!v(c10)) {
                                                    i19 = 2;
                                                    if (i15 != 2) {
                                                        if (i15 != i19 || i15 == 4 || i15 == 7) {
                                                            this.f41871i = i16;
                                                            i18 = 16;
                                                            this.f41869g = 16;
                                                        }
                                                    } else if (z10 || ((j10 == Long.MIN_VALUE && i26 == 0) || (j10 == 0 && i26 != 0))) {
                                                        i19 = 2;
                                                        if (i15 != i19) {
                                                        }
                                                        this.f41871i = i16;
                                                        i18 = 16;
                                                        this.f41869g = 16;
                                                    } else {
                                                        if (i26 == 0) {
                                                            j10 = -j10;
                                                        }
                                                        this.f41870h = j10;
                                                        this.f41865c += i16;
                                                        i18 = 15;
                                                        this.f41869g = 15;
                                                    }
                                                }
                                            } else if (i15 == 2) {
                                                i15 = 3;
                                                i16++;
                                            }
                                            if (i18 != 0) {
                                                return i18;
                                            }
                                            if (v(cArr[this.f41865c])) {
                                                O("Expected value");
                                                throw null;
                                            }
                                            k();
                                            this.f41869g = 10;
                                            return 10;
                                        }
                                        if (i15 != 5) {
                                        }
                                        i15 = 6;
                                        i16++;
                                    } else if (i16 != cArr.length) {
                                        if (q(i16 + 1)) {
                                            i17 = this.f41865c;
                                            i14 = this.f41866d;
                                            c10 = cArr[i17 + i16];
                                            if (c10 != '+') {
                                                if (c10 != 'E') {
                                                    if (i15 != 2) {
                                                    }
                                                    i15 = 5;
                                                    i16++;
                                                } else {
                                                    if (i15 != 2) {
                                                    }
                                                    i15 = 5;
                                                    i16++;
                                                }
                                                if (i18 != 0) {
                                                    return i18;
                                                }
                                                if (v(cArr[this.f41865c])) {
                                                    O("Expected value");
                                                    throw null;
                                                }
                                                k();
                                                this.f41869g = 10;
                                                return 10;
                                            }
                                            if (i15 != 5) {
                                            }
                                            i15 = 6;
                                            i16++;
                                        }
                                        i19 = 2;
                                        if (i15 != 2) {
                                            if (i15 != i19) {
                                            }
                                            this.f41871i = i16;
                                            i18 = 16;
                                            this.f41869g = 16;
                                        } else {
                                            if (z10) {
                                            }
                                            i19 = 2;
                                            if (i15 != i19) {
                                            }
                                            this.f41871i = i16;
                                            i18 = 16;
                                            this.f41869g = 16;
                                        }
                                        if (i18 != 0) {
                                            return i18;
                                        }
                                        if (v(cArr[this.f41865c])) {
                                            O("Expected value");
                                            throw null;
                                        }
                                        k();
                                        this.f41869g = 10;
                                        return 10;
                                    }
                                    i18 = 0;
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (v(cArr[this.f41865c])) {
                                        O("Expected value");
                                        throw null;
                                    }
                                    k();
                                    this.f41869g = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i11 = 6;
                        }
                        if (this.f41876o != 3) {
                            i12 = 1;
                        } else {
                            i12 = i10;
                        }
                        length = str.length();
                        i13 = i10;
                        while (true) {
                            if (i13 >= length) {
                                if ((this.f41865c + length < this.f41866d && !q(length + 1)) || !v(cArr[this.f41865c + length])) {
                                    this.f41865c += length;
                                    this.f41869g = i11;
                                    break;
                                }
                                break;
                            }
                            if ((this.f41865c + i13 >= this.f41866d || q(i13 + 1)) && ((c5 = cArr[this.f41865c + i13]) == str.charAt(i13) || (i12 != 0 && c5 == str2.charAt(i13)))) {
                            }
                            i11 = i10;
                            break;
                        }
                        if (i11 != 0) {
                            return i11;
                        }
                        int i27 = this.f41865c;
                        i14 = this.f41866d;
                        i15 = i10;
                        i16 = i15;
                        int i28 = i16;
                        i17 = i27;
                        z10 = true;
                        long j12 = 0;
                        while (true) {
                            if (i17 + i16 != i14) {
                                c10 = cArr[i17 + i16];
                                if (c10 != '+') {
                                    if (c10 != 'E') {
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                    } else {
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                    }
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (v(cArr[this.f41865c])) {
                                        O("Expected value");
                                        throw null;
                                    }
                                    k();
                                    this.f41869g = 10;
                                    return 10;
                                }
                                if (i15 != 5) {
                                }
                                i15 = 6;
                                i16++;
                            } else if (i16 != cArr.length) {
                                if (q(i16 + 1)) {
                                    i17 = this.f41865c;
                                    i14 = this.f41866d;
                                    c10 = cArr[i17 + i16];
                                    if (c10 != '+') {
                                        if (c10 != 'E') {
                                            if (i15 != 2) {
                                            }
                                            i15 = 5;
                                            i16++;
                                        } else {
                                            if (i15 != 2) {
                                            }
                                            i15 = 5;
                                            i16++;
                                        }
                                        if (i18 != 0) {
                                            return i18;
                                        }
                                        if (v(cArr[this.f41865c])) {
                                            O("Expected value");
                                            throw null;
                                        }
                                        k();
                                        this.f41869g = 10;
                                        return 10;
                                    }
                                    if (i15 != 5) {
                                    }
                                    i15 = 6;
                                    i16++;
                                }
                                i19 = 2;
                                if (i15 != 2) {
                                    if (i15 != i19) {
                                    }
                                    this.f41871i = i16;
                                    i18 = 16;
                                    this.f41869g = 16;
                                } else {
                                    if (z10) {
                                    }
                                    i19 = 2;
                                    if (i15 != i19) {
                                    }
                                    this.f41871i = i16;
                                    i18 = 16;
                                    this.f41869g = 16;
                                }
                                if (i18 != 0) {
                                    return i18;
                                }
                                if (v(cArr[this.f41865c])) {
                                    O("Expected value");
                                    throw null;
                                }
                                k();
                                this.f41869g = 10;
                                return 10;
                            }
                            i18 = 0;
                            if (i18 != 0) {
                                return i18;
                            }
                            if (v(cArr[this.f41865c])) {
                                O("Expected value");
                                throw null;
                            }
                            k();
                            this.f41869g = 10;
                            return 10;
                        }
                    }
                    if (i21 == 1) {
                        this.f41869g = 4;
                        return 4;
                    }
                }
                if (i21 == 1 && i21 != 2) {
                    O("Unexpected value");
                    throw null;
                }
                k();
                this.f41865c--;
                this.f41869g = 7;
                return 7;
            }
            iArr[i20] = 5;
            int iC5 = C(true);
            if (iC5 != 58) {
                if (iC5 != 61) {
                    O("Expected ':'");
                    throw null;
                }
                k();
                if (this.f41865c < this.f41866d || q(1)) {
                    int i29 = this.f41865c;
                    if (cArr[i29] == '>') {
                        this.f41865c = i29 + 1;
                    }
                }
            }
        }
        i10 = 0;
        iC2 = C(true);
        if (iC2 != 34) {
            this.f41869g = 9;
            return 9;
        }
        if (iC2 != 39) {
            k();
            this.f41869g = 8;
            return 8;
        }
        if (iC2 != 44) {
            if (iC2 != 91) {
                this.f41869g = 3;
                return 3;
            }
            if (iC2 != 93) {
                if (iC2 != 123) {
                    this.f41869g = 1;
                    return 1;
                }
                int i210 = this.f41865c - 1;
                this.f41865c = i210;
                c4 = cArr[i210];
                if (c4 != 't') {
                    str = com.ironsource.mediationsdk.metadata.a.f29610g;
                    str2 = "TRUE";
                    i11 = 5;
                    if (this.f41876o != 3) {
                        i12 = 1;
                    } else {
                        i12 = i10;
                    }
                    length = str.length();
                    i13 = i10;
                    while (true) {
                        if (i13 >= length) {
                            if (this.f41865c + length < this.f41866d) {
                            }
                            this.f41865c += length;
                            this.f41869g = i11;
                            break;
                        }
                        i13 = this.f41865c + i13 >= this.f41866d ? i13 + 1 : i13 + 1;
                    }
                    if (i11 != 0) {
                        return i11;
                    }
                    int i211 = this.f41865c;
                    i14 = this.f41866d;
                    i15 = i10;
                    i16 = i15;
                    int i212 = i16;
                    i17 = i211;
                    z10 = true;
                    long j13 = 0;
                    while (true) {
                        if (i17 + i16 != i14) {
                            c10 = cArr[i17 + i16];
                            if (c10 != '+') {
                                if (c10 != 'E') {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                } else {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                }
                                if (i18 != 0) {
                                    return i18;
                                }
                                if (v(cArr[this.f41865c])) {
                                    O("Expected value");
                                    throw null;
                                }
                                k();
                                this.f41869g = 10;
                                return 10;
                            }
                            if (i15 != 5) {
                            }
                            i15 = 6;
                            i16++;
                        } else if (i16 != cArr.length) {
                            if (q(i16 + 1)) {
                                i17 = this.f41865c;
                                i14 = this.f41866d;
                                c10 = cArr[i17 + i16];
                                if (c10 != '+') {
                                    if (c10 != 'E') {
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                    } else {
                                        if (i15 != 2) {
                                        }
                                        i15 = 5;
                                        i16++;
                                    }
                                    if (i18 != 0) {
                                        return i18;
                                    }
                                    if (v(cArr[this.f41865c])) {
                                        O("Expected value");
                                        throw null;
                                    }
                                    k();
                                    this.f41869g = 10;
                                    return 10;
                                }
                                if (i15 != 5) {
                                }
                                i15 = 6;
                                i16++;
                            }
                            i19 = 2;
                            if (i15 != 2) {
                                if (i15 != i19) {
                                }
                                this.f41871i = i16;
                                i18 = 16;
                                this.f41869g = 16;
                            } else {
                                if (z10) {
                                }
                                i19 = 2;
                                if (i15 != i19) {
                                }
                                this.f41871i = i16;
                                i18 = 16;
                                this.f41869g = 16;
                            }
                            if (i18 != 0) {
                                return i18;
                            }
                            if (v(cArr[this.f41865c])) {
                                O("Expected value");
                                throw null;
                            }
                            k();
                            this.f41869g = 10;
                            return 10;
                        }
                        i18 = 0;
                        if (i18 != 0) {
                            return i18;
                        }
                        if (v(cArr[this.f41865c])) {
                            O("Expected value");
                            throw null;
                        }
                        k();
                        this.f41869g = 10;
                        return 10;
                    }
                }
                str = com.ironsource.mediationsdk.metadata.a.f29610g;
                str2 = "TRUE";
                i11 = 5;
                if (this.f41876o != 3) {
                    i12 = 1;
                } else {
                    i12 = i10;
                }
                length = str.length();
                i13 = i10;
                while (true) {
                    if (i13 >= length) {
                        if (this.f41865c + length < this.f41866d) {
                        }
                        this.f41865c += length;
                        this.f41869g = i11;
                        break;
                    }
                    if (this.f41865c + i13 >= this.f41866d) {
                    }
                }
                if (i11 != 0) {
                    return i11;
                }
                int i213 = this.f41865c;
                i14 = this.f41866d;
                i15 = i10;
                i16 = i15;
                int i214 = i16;
                i17 = i213;
                z10 = true;
                long j14 = 0;
                while (true) {
                    if (i17 + i16 != i14) {
                        c10 = cArr[i17 + i16];
                        if (c10 != '+') {
                            if (c10 != 'E') {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i16++;
                            } else {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i16++;
                            }
                            if (i18 != 0) {
                                return i18;
                            }
                            if (v(cArr[this.f41865c])) {
                                O("Expected value");
                                throw null;
                            }
                            k();
                            this.f41869g = 10;
                            return 10;
                        }
                        if (i15 != 5) {
                        }
                        i15 = 6;
                        i16++;
                    } else if (i16 != cArr.length) {
                        if (q(i16 + 1)) {
                            i17 = this.f41865c;
                            i14 = this.f41866d;
                            c10 = cArr[i17 + i16];
                            if (c10 != '+') {
                                if (c10 != 'E') {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                } else {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                }
                                if (i18 != 0) {
                                    return i18;
                                }
                                if (v(cArr[this.f41865c])) {
                                    O("Expected value");
                                    throw null;
                                }
                                k();
                                this.f41869g = 10;
                                return 10;
                            }
                            if (i15 != 5) {
                            }
                            i15 = 6;
                            i16++;
                        }
                        i19 = 2;
                        if (i15 != 2) {
                            if (i15 != i19) {
                            }
                            this.f41871i = i16;
                            i18 = 16;
                            this.f41869g = 16;
                        } else {
                            if (z10) {
                            }
                            i19 = 2;
                            if (i15 != i19) {
                            }
                            this.f41871i = i16;
                            i18 = 16;
                            this.f41869g = 16;
                        }
                        if (i18 != 0) {
                            return i18;
                        }
                        if (v(cArr[this.f41865c])) {
                            O("Expected value");
                            throw null;
                        }
                        k();
                        this.f41869g = 10;
                        return 10;
                    }
                    i18 = 0;
                    if (i18 != 0) {
                        return i18;
                    }
                    if (v(cArr[this.f41865c])) {
                        O("Expected value");
                        throw null;
                    }
                    k();
                    this.f41869g = 10;
                    return 10;
                }
                i11 = i10;
                if (i11 != 0) {
                    return i11;
                }
                int i215 = this.f41865c;
                i14 = this.f41866d;
                i15 = i10;
                i16 = i15;
                int i216 = i16;
                i17 = i215;
                z10 = true;
                long j15 = 0;
                while (true) {
                    if (i17 + i16 != i14) {
                        c10 = cArr[i17 + i16];
                        if (c10 != '+') {
                            if (c10 != 'E') {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i16++;
                            } else {
                                if (i15 != 2) {
                                }
                                i15 = 5;
                                i16++;
                            }
                            if (i18 != 0) {
                                return i18;
                            }
                            if (v(cArr[this.f41865c])) {
                                O("Expected value");
                                throw null;
                            }
                            k();
                            this.f41869g = 10;
                            return 10;
                        }
                        if (i15 != 5) {
                        }
                        i15 = 6;
                        i16++;
                    } else if (i16 != cArr.length) {
                        if (q(i16 + 1)) {
                            i17 = this.f41865c;
                            i14 = this.f41866d;
                            c10 = cArr[i17 + i16];
                            if (c10 != '+') {
                                if (c10 != 'E') {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                } else {
                                    if (i15 != 2) {
                                    }
                                    i15 = 5;
                                    i16++;
                                }
                                if (i18 != 0) {
                                    return i18;
                                }
                                if (v(cArr[this.f41865c])) {
                                    O("Expected value");
                                    throw null;
                                }
                                k();
                                this.f41869g = 10;
                                return 10;
                            }
                            if (i15 != 5) {
                            }
                            i15 = 6;
                            i16++;
                        }
                        i19 = 2;
                        if (i15 != 2) {
                            if (i15 != i19) {
                            }
                            this.f41871i = i16;
                            i18 = 16;
                            this.f41869g = 16;
                        } else {
                            if (z10) {
                            }
                            i19 = 2;
                            if (i15 != i19) {
                            }
                            this.f41871i = i16;
                            i18 = 16;
                            this.f41869g = 16;
                        }
                        if (i18 != 0) {
                            return i18;
                        }
                        if (v(cArr[this.f41865c])) {
                            O("Expected value");
                            throw null;
                        }
                        k();
                        this.f41869g = 10;
                        return 10;
                    }
                    i18 = 0;
                    if (i18 != 0) {
                        return i18;
                    }
                    if (v(cArr[this.f41865c])) {
                        O("Expected value");
                        throw null;
                    }
                    k();
                    this.f41869g = 10;
                    return 10;
                }
            }
            if (i21 == 1) {
                this.f41869g = 4;
                return 4;
            }
        }
        if (i21 == 1) {
        }
        k();
        this.f41865c--;
        this.f41869g = 7;
        return 7;
    }

    public void o() throws IOException {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 4) {
            throw P("END_ARRAY");
        }
        int i10 = this.l;
        this.l = i10 - 1;
        int[] iArr = this.f41875n;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f41869g = 0;
    }

    public void p() throws IOException {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN != 2) {
            throw P("END_OBJECT");
        }
        int i10 = this.l;
        int i11 = i10 - 1;
        this.l = i11;
        this.f41874m[i11] = null;
        int[] iArr = this.f41875n;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f41869g = 0;
    }

    public final boolean q(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f41868f;
        int i14 = this.f41865c;
        this.f41868f = i13 - i14;
        int i15 = this.f41866d;
        char[] cArr = this.f41864b;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f41866d = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f41866d = 0;
        }
        this.f41865c = 0;
        do {
            int i17 = this.f41866d;
            int i18 = this.f41863a.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f41866d + i18;
            this.f41866d = i11;
            if (this.f41867e == 0 && (i12 = this.f41868f) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f41865c++;
                this.f41868f = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public String r() {
        return s(false);
    }

    public final String s(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.l;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f41873k[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f41875n[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f41874m[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(d.e(i12, "Unknown scope value: "));
            }
            i10++;
        }
    }

    public String t() {
        return s(true);
    }

    public String toString() {
        return getClass().getSimpleName() + w();
    }

    public boolean u() throws IOException {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        return (iN == 2 || iN == 4 || iN == 17) ? false : true;
    }

    public final boolean v(char c4) throws c {
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
        k();
        return false;
    }

    final String w() {
        StringBuilder sbL = d.l(" at line ", this.f41867e + 1, " column ", (this.f41865c - this.f41868f) + 1, " path ");
        sbL.append(r());
        return sbL.toString();
    }

    public boolean x() throws IOException {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 5) {
            this.f41869g = 0;
            int[] iArr = this.f41875n;
            int i10 = this.l - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iN != 6) {
            throw P("a boolean");
        }
        this.f41869g = 0;
        int[] iArr2 = this.f41875n;
        int i11 = this.l - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public double y() throws IOException {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            this.f41869g = 0;
            int[] iArr = this.f41875n;
            int i10 = this.l - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f41870h;
        }
        if (iN == 16) {
            this.f41872j = new String(this.f41864b, this.f41865c, this.f41871i);
            this.f41865c += this.f41871i;
        } else if (iN == 8 || iN == 9) {
            this.f41872j = E(iN == 8 ? '\'' : '\"');
        } else if (iN == 10) {
            this.f41872j = G();
        } else if (iN != 11) {
            throw P("a double");
        }
        this.f41869g = 11;
        double d10 = Double.parseDouble(this.f41872j);
        if (this.f41876o != 1 && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            O("JSON forbids NaN and infinities: " + d10);
            throw null;
        }
        this.f41872j = null;
        this.f41869g = 0;
        int[] iArr2 = this.f41875n;
        int i11 = this.l - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int z() throws IOException {
        int iN = this.f41869g;
        if (iN == 0) {
            iN = n();
        }
        if (iN == 15) {
            long j10 = this.f41870h;
            int i10 = (int) j10;
            if (j10 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f41870h + w());
            }
            this.f41869g = 0;
            int[] iArr = this.f41875n;
            int i11 = this.l - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iN == 16) {
            this.f41872j = new String(this.f41864b, this.f41865c, this.f41871i);
            this.f41865c += this.f41871i;
        } else {
            if (iN != 8 && iN != 9 && iN != 10) {
                throw P("an int");
            }
            if (iN == 10) {
                this.f41872j = G();
            } else {
                this.f41872j = E(iN == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f41872j);
                this.f41869g = 0;
                int[] iArr2 = this.f41875n;
                int i13 = this.l - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f41869g = 11;
        double d10 = Double.parseDouble(this.f41872j);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f41872j + w());
        }
        this.f41872j = null;
        this.f41869g = 0;
        int[] iArr3 = this.f41875n;
        int i15 = this.l - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }
}
