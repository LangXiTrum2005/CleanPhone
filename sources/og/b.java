package og;

import com.applovin.shadow.okio.internal.Buffer;
import java.io.EOFException;
import java.math.BigDecimal;
import lo.e;
import lo.h;
import lo.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f47416k;
    public static final h l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f47417m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f47418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f47419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f47421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f47423j;

    static {
        h hVar = h.f45638d;
        f47416k = jj.d.v("'\\");
        l = jj.d.v("\"\\");
        f47417m = jj.d.v("{}[]:, \n\t\r\f/\\;#=");
        jj.d.v("\n\r");
        jj.d.v("*/");
    }

    public b(n nVar) {
        this.f47413b = new int[32];
        this.f47414c = new String[32];
        this.f47415d = new int[32];
        this.f47420g = 0;
        this.f47418e = nVar;
        this.f47419f = nVar.f45657b;
        h(6);
    }

    public final String A(h hVar) throws EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jA = this.f47418e.a(hVar);
            if (jA == -1) {
                j("Unterminated string");
                throw null;
            }
            e eVar = this.f47419f;
            if (eVar.h(jA) != 92) {
                if (sb2 == null) {
                    String string = eVar.readString(jA, an.a.f3768a);
                    eVar.readByte();
                    return string;
                }
                sb2.append(eVar.readString(jA, an.a.f3768a));
                eVar.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(eVar.readString(jA, an.a.f3768a));
            eVar.readByte();
            sb2.append(D());
        }
    }

    public final String B() {
        String string;
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        e eVar = this.f47419f;
        if (iP == 10) {
            long jA = this.f47418e.a(f47417m);
            if (jA != -1) {
                eVar.getClass();
                string = eVar.readString(jA, an.a.f3768a);
            } else {
                string = eVar.readUtf8();
            }
        } else if (iP == 9) {
            string = A(l);
        } else if (iP == 8) {
            string = A(f47416k);
        } else if (iP == 11) {
            string = this.f47423j;
            this.f47423j = null;
        } else if (iP == 16) {
            string = Long.toString(this.f47421h);
        } else {
            if (iP != 17) {
                throw new aa.b("Expected a string but was " + l1.d.u(C()) + " at path " + d(), 16);
            }
            long j10 = this.f47422i;
            eVar.getClass();
            string = eVar.readString(j10, an.a.f3768a);
        }
        this.f47420g = 0;
        int[] iArr = this.f47415d;
        int i10 = this.f47412a - 1;
        iArr[i10] = iArr[i10] + 1;
        return string;
    }

    public final int C() throws EOFException {
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        switch (iP) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final char D() throws EOFException {
        int i10;
        n nVar = this.f47418e;
        if (!nVar.request(1L)) {
            j("Unterminated escape sequence");
            throw null;
        }
        e eVar = this.f47419f;
        byte b10 = eVar.readByte();
        if (b10 == 10 || b10 == 34 || b10 == 39 || b10 == 47 || b10 == 92) {
            return (char) b10;
        }
        if (b10 == 98) {
            return '\b';
        }
        if (b10 == 102) {
            return '\f';
        }
        if (b10 == 110) {
            return '\n';
        }
        if (b10 == 114) {
            return '\r';
        }
        if (b10 == 116) {
            return '\t';
        }
        if (b10 != 117) {
            j("Invalid escape sequence: \\" + ((char) b10));
            throw null;
        }
        if (!nVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + d());
        }
        char c4 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            byte bH = eVar.h(i11);
            char c5 = (char) (c4 << 4);
            if (bH >= 48 && bH <= 57) {
                i10 = bH - 48;
            } else if (bH >= 97 && bH <= 102) {
                i10 = bH - 87;
            } else {
                if (bH < 65 || bH > 70) {
                    j("\\u".concat(eVar.readString(4L, an.a.f3768a)));
                    throw null;
                }
                i10 = bH - 55;
            }
            c4 = (char) (i10 + c5);
        }
        eVar.skip(4L);
        return c4;
    }

    public final void E(h hVar) throws EOFException {
        while (true) {
            long jA = this.f47418e.a(hVar);
            if (jA == -1) {
                j("Unterminated string");
                throw null;
            }
            e eVar = this.f47419f;
            if (eVar.h(jA) != 92) {
                eVar.skip(jA + 1);
                return;
            } else {
                eVar.skip(jA + 1);
                D();
            }
        }
    }

    public final void F() {
        int i10 = 0;
        do {
            int iP = this.f47420g;
            if (iP == 0) {
                iP = p();
            }
            if (iP == 3) {
                h(1);
            } else {
                if (iP == 1) {
                    h(3);
                } else if (iP == 4) {
                    i10--;
                    if (i10 < 0) {
                        throw new aa.b("Expected a value but was " + l1.d.u(C()) + " at path " + d(), 16);
                    }
                    this.f47412a--;
                } else if (iP == 2) {
                    i10--;
                    if (i10 < 0) {
                        throw new aa.b("Expected a value but was " + l1.d.u(C()) + " at path " + d(), 16);
                    }
                    this.f47412a--;
                } else {
                    e eVar = this.f47419f;
                    if (iP == 14 || iP == 10) {
                        long jA = this.f47418e.a(f47417m);
                        if (jA == -1) {
                            jA = eVar.f45637b;
                        }
                        eVar.skip(jA);
                    } else if (iP == 9 || iP == 13) {
                        E(l);
                    } else if (iP == 8 || iP == 12) {
                        E(f47416k);
                    } else if (iP == 17) {
                        eVar.skip(this.f47422i);
                    } else if (iP == 18) {
                        throw new aa.b("Expected a value but was " + l1.d.u(C()) + " at path " + d(), 16);
                    }
                }
                this.f47420g = 0;
            }
            i10++;
            this.f47420g = 0;
        } while (i10 != 0);
        int[] iArr = this.f47415d;
        int i11 = this.f47412a - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f47414c[i11] = "null";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.f47420g = 0;
        this.f47413b[0] = 8;
        this.f47412a = 1;
        e eVar = this.f47419f;
        eVar.skip(eVar.f45637b);
        this.f47418e.close();
    }

    public final void k() {
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 3) {
            h(1);
            this.f47415d[this.f47412a - 1] = 0;
            this.f47420g = 0;
        } else {
            throw new aa.b("Expected BEGIN_ARRAY but was " + l1.d.u(C()) + " at path " + d(), 16);
        }
    }

    public final void n() {
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 1) {
            h(3);
            this.f47420g = 0;
        } else {
            throw new aa.b("Expected BEGIN_OBJECT but was " + l1.d.u(C()) + " at path " + d(), 16);
        }
    }

    public final void o() {
        j("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x01bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x01be  */
    /* JADX WARN: Code duplicated, block: B:164:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:169:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:175:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:177:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:179:0x0204  */
    /* JADX WARN: Code duplicated, block: B:233:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x011a  */
    /* JADX WARN: Code duplicated, block: B:94:0x012b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0134  */
    public final int p() throws EOFException {
        int i10;
        String str;
        String str2;
        long j10;
        char cH;
        char c4;
        int i11;
        int i12;
        int i13;
        byte bH;
        char c5;
        int[] iArr = this.f47413b;
        int i14 = this.f47412a - 1;
        int i15 = iArr[i14];
        e eVar = this.f47419f;
        if (i15 == 1) {
            iArr[i14] = 2;
        } else if (i15 == 2) {
            int iY = y(true);
            eVar.readByte();
            if (iY != 44) {
                if (iY == 59) {
                    o();
                    throw null;
                }
                if (iY == 93) {
                    this.f47420g = 4;
                    return 4;
                }
                j("Unterminated array");
                throw null;
            }
        } else {
            if (i15 == 3 || i15 == 5) {
                iArr[i14] = 4;
                if (i15 == 5) {
                    int iY2 = y(true);
                    eVar.readByte();
                    if (iY2 != 44) {
                        if (iY2 == 59) {
                            o();
                            throw null;
                        }
                        if (iY2 == 125) {
                            this.f47420g = 2;
                            return 2;
                        }
                        j("Unterminated object");
                        throw null;
                    }
                }
                int iY3 = y(true);
                if (iY3 == 34) {
                    eVar.readByte();
                    this.f47420g = 13;
                    return 13;
                }
                if (iY3 == 39) {
                    eVar.readByte();
                    o();
                    throw null;
                }
                if (iY3 != 125) {
                    o();
                    throw null;
                }
                if (i15 == 5) {
                    j("Expected name");
                    throw null;
                }
                eVar.readByte();
                this.f47420g = 2;
                return 2;
            }
            if (i15 == 4) {
                iArr[i14] = 5;
                int iY4 = y(true);
                eVar.readByte();
                if (iY4 != 58) {
                    if (iY4 != 61) {
                        j("Expected ':'");
                        throw null;
                    }
                    o();
                    throw null;
                }
            } else if (i15 == 6) {
                iArr[i14] = 7;
            } else {
                if (i15 == 7) {
                    if (y(false) == -1) {
                        this.f47420g = 18;
                        return 18;
                    }
                    o();
                    throw null;
                }
                if (i15 == 9) {
                    throw null;
                }
                if (i15 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iY5 = y(true);
        if (iY5 == 34) {
            eVar.readByte();
            this.f47420g = 9;
            return 9;
        }
        if (iY5 == 39) {
            o();
            throw null;
        }
        if (iY5 != 44 && iY5 != 59) {
            if (iY5 == 91) {
                eVar.readByte();
                this.f47420g = 3;
                return 3;
            }
            if (iY5 != 93) {
                if (iY5 == 123) {
                    eVar.readByte();
                    this.f47420g = 1;
                    return 1;
                }
                byte bH2 = eVar.h(0L);
                n nVar = this.f47418e;
                if (bH2 == 116 || bH2 == 84) {
                    i10 = 5;
                    str2 = com.ironsource.mediationsdk.metadata.a.f29610g;
                    str = "TRUE";
                } else {
                    if (bH2 != 102 && bH2 != 70) {
                        if (bH2 == 110 || bH2 == 78) {
                            i10 = 7;
                            str2 = "null";
                            str = "NULL";
                        } else {
                            j10 = 0;
                            i10 = 0;
                        }
                        if (i10 != 0) {
                            return i10;
                        }
                        boolean z10 = true;
                        long j11 = j10;
                        c4 = 0;
                        i11 = 0;
                        boolean z11 = false;
                        while (true) {
                            i12 = i11 + 1;
                            if (nVar.request(i12)) {
                                bH = eVar.h(i11);
                                if (bH != 43) {
                                    if (bH != 69 || bH == 101) {
                                        c5 = 6;
                                        if (c4 != 2 || c4 == 4) {
                                            c4 = 5;
                                            i11 = i12;
                                        } else {
                                            i13 = 0;
                                        }
                                    } else if (bH == 45) {
                                        c5 = 6;
                                        if (c4 == 0) {
                                            c4 = 1;
                                            z11 = true;
                                        } else {
                                            if (c4 != 5) {
                                                i13 = 0;
                                            }
                                            c4 = c5;
                                        }
                                        i11 = i12;
                                    } else if (bH != 46) {
                                        if (bH >= 48 && bH <= 57) {
                                            if (c4 == 1 || c4 == 0) {
                                                c5 = 6;
                                                j11 = -(bH - 48);
                                                c4 = 2;
                                            } else {
                                                if (c4 == 2) {
                                                    if (j11 != j10) {
                                                        long j12 = (10 * j11) - ((long) (bH - 48));
                                                        z10 &= j11 > Buffer.OVERFLOW_ZONE || (j11 == Buffer.OVERFLOW_ZONE && j12 < j11);
                                                        j11 = j12;
                                                    }
                                                } else if (c4 == 3) {
                                                    c4 = 4;
                                                } else {
                                                    c5 = 6;
                                                    if (c4 == 5 || c4 == 6) {
                                                        c4 = 7;
                                                    }
                                                }
                                                c5 = 6;
                                                i11 = i12;
                                            }
                                            i11 = i12;
                                        } else if (!t(bH)) {
                                        }
                                        i13 = 0;
                                    } else {
                                        c5 = 6;
                                        if (c4 == 2) {
                                            c4 = 3;
                                            i11 = i12;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                    if (i13 != 0) {
                                        return i13;
                                    }
                                    if (t(eVar.h(j10))) {
                                        o();
                                        throw null;
                                    }
                                    j("Expected value");
                                    throw null;
                                }
                                c5 = 6;
                                if (c4 != 5) {
                                    i13 = 0;
                                    if (i13 != 0) {
                                        return i13;
                                    }
                                    if (t(eVar.h(j10))) {
                                        j("Expected value");
                                        throw null;
                                    }
                                    o();
                                    throw null;
                                }
                                c4 = c5;
                                i11 = i12;
                            }
                            if (c4 != 2 && z10 && ((j11 != Long.MIN_VALUE || z11) && (j11 != j10 || !z11))) {
                                if (!z11) {
                                    j11 = -j11;
                                }
                                this.f47421h = j11;
                                eVar.skip(i11);
                                i13 = 16;
                                this.f47420g = 16;
                            } else if (c4 != 2 || c4 == 4 || c4 == 7) {
                                this.f47422i = i11;
                                i13 = 17;
                                this.f47420g = 17;
                            } else {
                                i13 = 0;
                            }
                            if (i13 != 0) {
                                return i13;
                            }
                            if (t(eVar.h(j10))) {
                                j("Expected value");
                                throw null;
                            }
                            o();
                            throw null;
                        }
                    }
                    i10 = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j10 = 0;
                int i16 = 1;
                while (true) {
                    if (i16 >= length) {
                        if (!nVar.request(length + 1) || !t(eVar.h(length))) {
                            eVar.skip(length);
                            this.f47420g = i10;
                            break;
                        }
                    } else {
                        int i17 = i16 + 1;
                        if (nVar.request(i17) && ((cH = eVar.h(i16)) == str2.charAt(i16) || cH == str.charAt(i16))) {
                            i16 = i17;
                        }
                    }
                    i10 = 0;
                    break;
                }
                if (i10 != 0) {
                    return i10;
                }
                boolean z12 = true;
                long j13 = j10;
                c4 = 0;
                i11 = 0;
                boolean z13 = false;
                while (true) {
                    i12 = i11 + 1;
                    if (nVar.request(i12)) {
                        bH = eVar.h(i11);
                        if (bH != 43) {
                            if (bH != 69) {
                                c5 = 6;
                                if (c4 != 2) {
                                }
                                c4 = 5;
                                i11 = i12;
                            } else {
                                c5 = 6;
                                if (c4 != 2) {
                                }
                                c4 = 5;
                                i11 = i12;
                            }
                            if (i13 != 0) {
                                return i13;
                            }
                            if (t(eVar.h(j10))) {
                                j("Expected value");
                                throw null;
                            }
                            o();
                            throw null;
                        }
                        c5 = 6;
                        if (c4 != 5) {
                            i13 = 0;
                            if (i13 != 0) {
                                return i13;
                            }
                            if (t(eVar.h(j10))) {
                                j("Expected value");
                                throw null;
                            }
                            o();
                            throw null;
                        }
                        c4 = c5;
                        i11 = i12;
                    }
                    if (c4 != 2) {
                        if (c4 != 2) {
                        }
                        this.f47422i = i11;
                        i13 = 17;
                        this.f47420g = 17;
                    } else {
                        if (c4 != 2) {
                        }
                        this.f47422i = i11;
                        i13 = 17;
                        this.f47420g = 17;
                    }
                    if (i13 != 0) {
                        return i13;
                    }
                    if (t(eVar.h(j10))) {
                        j("Expected value");
                        throw null;
                    }
                    o();
                    throw null;
                }
            }
            if (i15 == 1) {
                eVar.readByte();
                this.f47420g = 4;
                return 4;
            }
        }
        if (i15 == 1 || i15 == 2) {
            o();
            throw null;
        }
        j("Unexpected value");
        throw null;
    }

    public final void q() {
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 4) {
            throw new aa.b("Expected END_ARRAY but was " + l1.d.u(C()) + " at path " + d(), 16);
        }
        int i10 = this.f47412a;
        this.f47412a = i10 - 1;
        int[] iArr = this.f47415d;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f47420g = 0;
    }

    public final void r() {
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        if (iP != 2) {
            throw new aa.b("Expected END_OBJECT but was " + l1.d.u(C()) + " at path " + d(), 16);
        }
        int i10 = this.f47412a;
        int i11 = i10 - 1;
        this.f47412a = i11;
        this.f47414c[i11] = null;
        int[] iArr = this.f47415d;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f47420g = 0;
    }

    public final boolean s() throws EOFException {
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        return (iP == 2 || iP == 4 || iP == 18) ? false : true;
    }

    public final boolean t(int i10) {
        if (i10 == 9 || i10 == 10 || i10 == 12 || i10 == 13 || i10 == 32) {
            return false;
        }
        if (i10 != 35) {
            if (i10 == 44) {
                return false;
            }
            if (i10 != 47 && i10 != 61) {
                if (i10 == 123 || i10 == 125 || i10 == 58) {
                    return false;
                }
                if (i10 != 59) {
                    switch (i10) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        o();
        throw null;
    }

    public final String toString() {
        return "JsonReader(" + this.f47418e + ")";
    }

    public final boolean u() throws EOFException {
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 5) {
            this.f47420g = 0;
            int[] iArr = this.f47415d;
            int i10 = this.f47412a - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iP == 6) {
            this.f47420g = 0;
            int[] iArr2 = this.f47415d;
            int i11 = this.f47412a - 1;
            iArr2[i11] = iArr2[i11] + 1;
            return false;
        }
        throw new aa.b("Expected a boolean but was " + l1.d.u(C()) + " at path " + d(), 16);
    }

    public final int v() throws EOFException {
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 16) {
            long j10 = this.f47421h;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f47420g = 0;
                int[] iArr = this.f47415d;
                int i11 = this.f47412a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new aa.b("Expected an int but was " + this.f47421h + " at path " + d(), 16);
        }
        if (iP == 17) {
            long j11 = this.f47422i;
            e eVar = this.f47419f;
            eVar.getClass();
            this.f47423j = eVar.readString(j11, an.a.f3768a);
        } else if (iP == 9 || iP == 8) {
            String strA = iP == 9 ? A(l) : A(f47416k);
            this.f47423j = strA;
            try {
                int i12 = Integer.parseInt(strA);
                this.f47420g = 0;
                int[] iArr2 = this.f47415d;
                int i13 = this.f47412a - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        } else if (iP != 11) {
            throw new aa.b("Expected an int but was " + l1.d.u(C()) + " at path " + d(), 16);
        }
        this.f47420g = 11;
        try {
            double d10 = Double.parseDouble(this.f47423j);
            int i14 = (int) d10;
            if (i14 != d10) {
                throw new aa.b("Expected an int but was " + this.f47423j + " at path " + d(), 16);
            }
            this.f47423j = null;
            this.f47420g = 0;
            int[] iArr3 = this.f47415d;
            int i15 = this.f47412a - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        } catch (NumberFormatException unused2) {
            throw new aa.b("Expected an int but was " + this.f47423j + " at path " + d(), 16);
        }
    }

    public final long w() throws EOFException {
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 16) {
            this.f47420g = 0;
            int[] iArr = this.f47415d;
            int i10 = this.f47412a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f47421h;
        }
        if (iP == 17) {
            long j10 = this.f47422i;
            e eVar = this.f47419f;
            eVar.getClass();
            this.f47423j = eVar.readString(j10, an.a.f3768a);
        } else if (iP == 9 || iP == 8) {
            String strA = iP == 9 ? A(l) : A(f47416k);
            this.f47423j = strA;
            try {
                long j11 = Long.parseLong(strA);
                this.f47420g = 0;
                int[] iArr2 = this.f47415d;
                int i11 = this.f47412a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j11;
            } catch (NumberFormatException unused) {
            }
        } else if (iP != 11) {
            throw new aa.b("Expected a long but was " + l1.d.u(C()) + " at path " + d(), 16);
        }
        this.f47420g = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f47423j).longValueExact();
            this.f47423j = null;
            this.f47420g = 0;
            int[] iArr3 = this.f47415d;
            int i12 = this.f47412a - 1;
            iArr3[i12] = iArr3[i12] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new aa.b("Expected a long but was " + this.f47423j + " at path " + d(), 16);
        }
    }

    public final String x() {
        String strA;
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 14) {
            long jA = this.f47418e.a(f47417m);
            e eVar = this.f47419f;
            if (jA != -1) {
                eVar.getClass();
                strA = eVar.readString(jA, an.a.f3768a);
            } else {
                strA = eVar.readUtf8();
            }
        } else if (iP == 13) {
            strA = A(l);
        } else if (iP == 12) {
            strA = A(f47416k);
        } else {
            if (iP != 15) {
                throw new aa.b("Expected a name but was " + l1.d.u(C()) + " at path " + d(), 16);
            }
            strA = this.f47423j;
            this.f47423j = null;
        }
        this.f47420g = 0;
        this.f47414c[this.f47412a - 1] = strA;
        return strA;
    }

    public final int y(boolean z10) throws EOFException {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            n nVar = this.f47418e;
            if (!nVar.request(i11)) {
                if (z10) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j10 = i10;
            e eVar = this.f47419f;
            byte bH = eVar.h(j10);
            if (bH != 10 && bH != 32 && bH != 13 && bH != 9) {
                eVar.skip(j10);
                if (bH == 47) {
                    if (nVar.request(2L)) {
                        o();
                        throw null;
                    }
                } else if (bH == 35) {
                    o();
                    throw null;
                }
                return bH;
            }
            i10 = i11;
        }
    }

    public final void z() throws EOFException {
        int iP = this.f47420g;
        if (iP == 0) {
            iP = p();
        }
        if (iP == 7) {
            this.f47420g = 0;
            int[] iArr = this.f47415d;
            int i10 = this.f47412a - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new aa.b("Expected null but was " + l1.d.u(C()) + " at path " + d(), 16);
    }
}
