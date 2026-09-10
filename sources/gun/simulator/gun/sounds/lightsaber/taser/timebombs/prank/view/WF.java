package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.Input;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class WF extends MF {
    public static final C3971lc l;
    public static final C3971lc m;
    public static final C3971lc n;
    public final InterfaceC2460Hb f;
    public final C4848vb g;
    public int h;
    public long i;
    public int j;
    public String k;

    static {
        C3971lc c3971lc = C3971lc.d;
        l = G7.x("'\\");
        m = G7.x("\"\\");
        n = G7.x("{}[]:, \n\t\r\f/\\;#=");
        G7.x("\n\r");
        G7.x("*/");
    }

    public WF(EX ex) {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.h = 0;
        this.f = ex;
        this.g = ex.b;
        u(6);
    }

    public final void R() throws C3124bu {
        y("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x019d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x01c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:167:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:172:0x01f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:175:0x0204  */
    /* JADX WARN: Code duplicated, block: B:177:0x020b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0210  */
    /* JADX WARN: Code duplicated, block: B:181:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:182:0x0218  */
    /* JADX WARN: Code duplicated, block: B:184:0x021f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0237  */
    /* JADX WARN: Code duplicated, block: B:195:0x023c  */
    /* JADX WARN: Code duplicated, block: B:230:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x00b9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:95:0x012b  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    public final int S() throws C3124bu, EOFException {
        int iW;
        byte bN;
        InterfaceC2460Hb interfaceC2460Hb;
        int i;
        String str;
        String str2;
        int length;
        int i2;
        int i3;
        char cN;
        char c;
        int i4;
        int i5;
        int i6;
        byte bN2;
        int[] iArr = this.b;
        int i7 = this.f3398a - 1;
        int i8 = iArr[i7];
        C4848vb c4848vb = this.g;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iW2 = W(true);
            c4848vb.readByte();
            if (iW2 != 44) {
                if (iW2 == 59) {
                    R();
                    throw null;
                }
                if (iW2 == 93) {
                    this.h = 4;
                    return 4;
                }
                y("Unterminated array");
                throw null;
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5) {
                    int iW3 = W(true);
                    c4848vb.readByte();
                    if (iW3 != 44) {
                        if (iW3 == 59) {
                            R();
                            throw null;
                        }
                        if (iW3 == 125) {
                            this.h = 2;
                            return 2;
                        }
                        y("Unterminated object");
                        throw null;
                    }
                }
                int iW4 = W(true);
                if (iW4 == 34) {
                    c4848vb.readByte();
                    this.h = 13;
                    return 13;
                }
                if (iW4 == 39) {
                    c4848vb.readByte();
                    R();
                    throw null;
                }
                if (iW4 != 125) {
                    R();
                    throw null;
                }
                if (i8 == 5) {
                    y("Expected name");
                    throw null;
                }
                c4848vb.readByte();
                this.h = 2;
                return 2;
            }
            if (i8 != 4) {
                if (i8 == 6) {
                    iArr[i7] = 7;
                } else {
                    if (i8 == 7) {
                        if (W(false) == -1) {
                            this.h = 18;
                            return 18;
                        }
                        R();
                        throw null;
                    }
                    if (i8 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iW = W(true);
                if (iW != 34) {
                    c4848vb.readByte();
                    this.h = 9;
                    return 9;
                }
                if (iW != 39) {
                    R();
                    throw null;
                }
                if (iW != 44 && iW != 59) {
                    if (iW != 91) {
                        c4848vb.readByte();
                        this.h = 3;
                        return 3;
                    }
                    if (iW != 93) {
                        if (iW != 123) {
                            c4848vb.readByte();
                            this.h = 1;
                            return 1;
                        }
                        bN = c4848vb.n(0L);
                        interfaceC2460Hb = this.f;
                        if (bN != 116 || bN == 84) {
                            i = 5;
                            str2 = "true";
                            str = "TRUE";
                        } else {
                            if (bN != 102 && bN != 70) {
                                if (bN != 110 && bN != 78) {
                                    i = 0;
                                    break;
                                }
                                i = 7;
                                str2 = "null";
                                str = "NULL";
                                if (i != 0) {
                                    return i;
                                }
                                long j = 0;
                                c = 0;
                                i4 = 0;
                                boolean z = true;
                                boolean z2 = false;
                                while (true) {
                                    i5 = i4 + 1;
                                    if (interfaceC2460Hb.l(i5)) {
                                        bN2 = c4848vb.n(i4);
                                        if (bN2 != 43) {
                                            if (bN2 != 69 || bN2 == 101) {
                                                if (c != 2 || c == 4) {
                                                    c = 5;
                                                    i4 = i5;
                                                } else {
                                                    i6 = 0;
                                                }
                                            } else if (bN2 == 45) {
                                                if (c == 0) {
                                                    c = 1;
                                                    z2 = true;
                                                } else {
                                                    if (c != 5) {
                                                        i6 = 0;
                                                    }
                                                    c = 6;
                                                }
                                                i4 = i5;
                                            } else if (bN2 != 46) {
                                                if (bN2 >= 48 && bN2 <= 57) {
                                                    if (c == 1 || c == 0) {
                                                        j = -(bN2 - 48);
                                                        c = 2;
                                                    } else if (c == 2) {
                                                        if (j != 0) {
                                                            long j2 = (10 * j) - ((long) (bN2 - 48));
                                                            z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                                            j = j2;
                                                        }
                                                    } else if (c == 3) {
                                                        c = 4;
                                                    } else if (c == 5 || c == 6) {
                                                        c = 7;
                                                    }
                                                    i4 = i5;
                                                } else if (!U(bN2)) {
                                                }
                                                i6 = 0;
                                            } else if (c == 2) {
                                                c = 3;
                                                i4 = i5;
                                            } else {
                                                i6 = 0;
                                            }
                                            if (i6 != 0) {
                                                return i6;
                                            }
                                            if (U(c4848vb.n(0L))) {
                                                R();
                                                throw null;
                                            }
                                            y("Expected value");
                                            throw null;
                                        }
                                        if (c != 5) {
                                            i6 = 0;
                                            if (i6 != 0) {
                                                return i6;
                                            }
                                            if (U(c4848vb.n(0L))) {
                                                y("Expected value");
                                                throw null;
                                            }
                                            R();
                                            throw null;
                                        }
                                        c = 6;
                                        i4 = i5;
                                    }
                                    if (c != 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
                                        if (!z2) {
                                            j = -j;
                                        }
                                        this.i = j;
                                        c4848vb.skip(i4);
                                        this.h = 16;
                                        i6 = 16;
                                    } else if (c != 2 || c == 4 || c == 7) {
                                        this.j = i4;
                                        this.h = 17;
                                        i6 = 17;
                                    } else {
                                        i6 = 0;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (U(c4848vb.n(0L))) {
                                        y("Expected value");
                                        throw null;
                                    }
                                    R();
                                    throw null;
                                }
                            }
                            i = 6;
                            str2 = "false";
                            str = "FALSE";
                        }
                        length = str2.length();
                        i2 = 1;
                        while (true) {
                            if (i2 >= length) {
                                if (interfaceC2460Hb.l(length + 1) || !U(c4848vb.n(length))) {
                                    c4848vb.skip(length);
                                    this.h = i;
                                    break;
                                }
                            } else {
                                i3 = i2 + 1;
                                if (!interfaceC2460Hb.l(i3) && ((cN = c4848vb.n(i2)) == str2.charAt(i2) || cN == str.charAt(i2))) {
                                    i2 = i3;
                                }
                            }
                            i = 0;
                            break;
                        }
                        if (i != 0) {
                            return i;
                        }
                        long j3 = 0;
                        c = 0;
                        i4 = 0;
                        boolean z3 = true;
                        boolean z4 = false;
                        while (true) {
                            i5 = i4 + 1;
                            if (interfaceC2460Hb.l(i5)) {
                                bN2 = c4848vb.n(i4);
                                if (bN2 != 43) {
                                    if (bN2 != 69) {
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i4 = i5;
                                    } else {
                                        if (c != 2) {
                                        }
                                        c = 5;
                                        i4 = i5;
                                    }
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (U(c4848vb.n(0L))) {
                                        y("Expected value");
                                        throw null;
                                    }
                                    R();
                                    throw null;
                                }
                                if (c != 5) {
                                    i6 = 0;
                                    if (i6 != 0) {
                                        return i6;
                                    }
                                    if (U(c4848vb.n(0L))) {
                                        y("Expected value");
                                        throw null;
                                    }
                                    R();
                                    throw null;
                                }
                                c = 6;
                                i4 = i5;
                            }
                            if (c != 2) {
                                if (c != 2) {
                                }
                                this.j = i4;
                                this.h = 17;
                                i6 = 17;
                            } else {
                                if (c != 2) {
                                }
                                this.j = i4;
                                this.h = 17;
                                i6 = 17;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (U(c4848vb.n(0L))) {
                                y("Expected value");
                                throw null;
                            }
                            R();
                            throw null;
                        }
                    }
                    if (i8 == 1) {
                        c4848vb.readByte();
                        this.h = 4;
                        return 4;
                    }
                }
                if (i8 != 1 || i8 == 2) {
                    R();
                    throw null;
                }
                y("Unexpected value");
                throw null;
            }
            iArr[i7] = 5;
            int iW5 = W(true);
            c4848vb.readByte();
            if (iW5 != 58) {
                if (iW5 != 61) {
                    y("Expected ':'");
                    throw null;
                }
                R();
                throw null;
            }
        }
        iW = W(true);
        if (iW != 34) {
            c4848vb.readByte();
            this.h = 9;
            return 9;
        }
        if (iW != 39) {
            R();
            throw null;
        }
        if (iW != 44) {
            if (iW != 91) {
                c4848vb.readByte();
                this.h = 3;
                return 3;
            }
            if (iW != 93) {
                if (iW != 123) {
                    c4848vb.readByte();
                    this.h = 1;
                    return 1;
                }
                bN = c4848vb.n(0L);
                interfaceC2460Hb = this.f;
                if (bN != 116) {
                    i = 5;
                    str2 = "true";
                    str = "TRUE";
                    length = str2.length();
                    i2 = 1;
                    while (true) {
                        if (i2 >= length) {
                            if (interfaceC2460Hb.l(length + 1)) {
                            }
                            c4848vb.skip(length);
                            this.h = i;
                            break;
                        }
                        i3 = i2 + 1;
                        if (!interfaceC2460Hb.l(i3)) {
                            i2 = i3;
                        }
                    }
                    if (i != 0) {
                        return i;
                    }
                    long j4 = 0;
                    c = 0;
                    i4 = 0;
                    boolean z5 = true;
                    boolean z6 = false;
                    while (true) {
                        i5 = i4 + 1;
                        if (interfaceC2460Hb.l(i5)) {
                            bN2 = c4848vb.n(i4);
                            if (bN2 != 43) {
                                if (bN2 != 69) {
                                    if (c != 2) {
                                    }
                                    c = 5;
                                    i4 = i5;
                                } else {
                                    if (c != 2) {
                                    }
                                    c = 5;
                                    i4 = i5;
                                }
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (U(c4848vb.n(0L))) {
                                    y("Expected value");
                                    throw null;
                                }
                                R();
                                throw null;
                            }
                            if (c != 5) {
                                i6 = 0;
                                if (i6 != 0) {
                                    return i6;
                                }
                                if (U(c4848vb.n(0L))) {
                                    y("Expected value");
                                    throw null;
                                }
                                R();
                                throw null;
                            }
                            c = 6;
                            i4 = i5;
                        }
                        if (c != 2) {
                            if (c != 2) {
                            }
                            this.j = i4;
                            this.h = 17;
                            i6 = 17;
                        } else {
                            if (c != 2) {
                            }
                            this.j = i4;
                            this.h = 17;
                            i6 = 17;
                        }
                        if (i6 != 0) {
                            return i6;
                        }
                        if (U(c4848vb.n(0L))) {
                            y("Expected value");
                            throw null;
                        }
                        R();
                        throw null;
                    }
                }
                i = 5;
                str2 = "true";
                str = "TRUE";
                length = str2.length();
                i2 = 1;
                while (true) {
                    if (i2 >= length) {
                        if (interfaceC2460Hb.l(length + 1)) {
                        }
                        c4848vb.skip(length);
                        this.h = i;
                        break;
                    }
                    i3 = i2 + 1;
                    if (!interfaceC2460Hb.l(i3)) {
                        i2 = i3;
                    }
                }
                if (i != 0) {
                    return i;
                }
                long j5 = 0;
                c = 0;
                i4 = 0;
                boolean z7 = true;
                boolean z8 = false;
                while (true) {
                    i5 = i4 + 1;
                    if (interfaceC2460Hb.l(i5)) {
                        bN2 = c4848vb.n(i4);
                        if (bN2 != 43) {
                            if (bN2 != 69) {
                                if (c != 2) {
                                }
                                c = 5;
                                i4 = i5;
                            } else {
                                if (c != 2) {
                                }
                                c = 5;
                                i4 = i5;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (U(c4848vb.n(0L))) {
                                y("Expected value");
                                throw null;
                            }
                            R();
                            throw null;
                        }
                        if (c != 5) {
                            i6 = 0;
                            if (i6 != 0) {
                                return i6;
                            }
                            if (U(c4848vb.n(0L))) {
                                y("Expected value");
                                throw null;
                            }
                            R();
                            throw null;
                        }
                        c = 6;
                        i4 = i5;
                    }
                    if (c != 2) {
                        if (c != 2) {
                        }
                        this.j = i4;
                        this.h = 17;
                        i6 = 17;
                    } else {
                        if (c != 2) {
                        }
                        this.j = i4;
                        this.h = 17;
                        i6 = 17;
                    }
                    if (i6 != 0) {
                        return i6;
                    }
                    if (U(c4848vb.n(0L))) {
                        y("Expected value");
                        throw null;
                    }
                    R();
                    throw null;
                }
                i = 0;
                if (i != 0) {
                    return i;
                }
                long j6 = 0;
                c = 0;
                i4 = 0;
                boolean z9 = true;
                boolean z10 = false;
                while (true) {
                    i5 = i4 + 1;
                    if (interfaceC2460Hb.l(i5)) {
                        bN2 = c4848vb.n(i4);
                        if (bN2 != 43) {
                            if (bN2 != 69) {
                                if (c != 2) {
                                }
                                c = 5;
                                i4 = i5;
                            } else {
                                if (c != 2) {
                                }
                                c = 5;
                                i4 = i5;
                            }
                            if (i6 != 0) {
                                return i6;
                            }
                            if (U(c4848vb.n(0L))) {
                                y("Expected value");
                                throw null;
                            }
                            R();
                            throw null;
                        }
                        if (c != 5) {
                            i6 = 0;
                            if (i6 != 0) {
                                return i6;
                            }
                            if (U(c4848vb.n(0L))) {
                                y("Expected value");
                                throw null;
                            }
                            R();
                            throw null;
                        }
                        c = 6;
                        i4 = i5;
                    }
                    if (c != 2) {
                        if (c != 2) {
                        }
                        this.j = i4;
                        this.h = 17;
                        i6 = 17;
                    } else {
                        if (c != 2) {
                        }
                        this.j = i4;
                        this.h = 17;
                        i6 = 17;
                    }
                    if (i6 != 0) {
                        return i6;
                    }
                    if (U(c4848vb.n(0L))) {
                        y("Expected value");
                        throw null;
                    }
                    R();
                    throw null;
                }
            }
            if (i8 == 1) {
                c4848vb.readByte();
                this.h = 4;
                return 4;
            }
        }
        if (i8 != 1) {
        }
        R();
        throw null;
    }

    public final int T(String str, C3692iN c3692iN) {
        int length = ((String[]) c3692iN.b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) c3692iN.b)[i])) {
                this.h = 0;
                this.c[this.f3398a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean U(int i) throws C3124bu {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case Input.Keys.MUTE /* 91 */:
                        case Input.Keys.PAGE_DOWN /* 93 */:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        R();
        throw null;
    }

    public final String V() throws C3124bu, EOFException {
        String strX;
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS == 14) {
            strX = Y();
        } else if (iS == 13) {
            strX = X(m);
        } else if (iS == 12) {
            strX = X(l);
        } else {
            if (iS != 15) {
                throw new C3770jF("Expected a name but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
            }
            strX = this.k;
        }
        this.h = 0;
        this.c[this.f3398a - 1] = strX;
        return strX;
    }

    public final int W(boolean z) throws C3124bu, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            InterfaceC2460Hb interfaceC2460Hb = this.f;
            if (!interfaceC2460Hb.l(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            C4848vb c4848vb = this.g;
            byte bN = c4848vb.n(j);
            if (bN != 10 && bN != 32 && bN != 13 && bN != 9) {
                c4848vb.skip(j);
                if (bN == 47) {
                    if (!interfaceC2460Hb.l(2L)) {
                        return bN;
                    }
                    R();
                    throw null;
                }
                if (bN != 35) {
                    return bN;
                }
                R();
                throw null;
            }
            i = i2;
        }
    }

    public final String X(C3971lc c3971lc) throws C3124bu, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jG = this.f.G(c3971lc);
            if (jG == -1) {
                y("Unterminated string");
                throw null;
            }
            C4848vb c4848vb = this.g;
            if (c4848vb.n(jG) != 92) {
                if (sb == null) {
                    String strS = c4848vb.s(jG, AbstractC2307Be.f2881a);
                    c4848vb.readByte();
                    return strS;
                }
                sb.append(c4848vb.s(jG, AbstractC2307Be.f2881a));
                c4848vb.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(c4848vb.s(jG, AbstractC2307Be.f2881a));
            c4848vb.readByte();
            sb.append(Z());
        }
    }

    public final String Y() {
        long jG = this.f.G(n);
        C4848vb c4848vb = this.g;
        if (jG == -1) {
            return c4848vb.t();
        }
        c4848vb.getClass();
        return c4848vb.s(jG, AbstractC2307Be.f2881a);
    }

    public final char Z() throws C3124bu, EOFException {
        int i;
        InterfaceC2460Hb interfaceC2460Hb = this.f;
        if (!interfaceC2460Hb.l(1L)) {
            y("Unterminated escape sequence");
            throw null;
        }
        C4848vb c4848vb = this.g;
        byte b = c4848vb.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            y("Invalid escape sequence: \\" + ((char) b));
            throw null;
        }
        if (!interfaceC2460Hb.l(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bN = c4848vb.n(i2);
            char c2 = (char) (c << 4);
            if (bN >= 48 && bN <= 57) {
                i = bN - 48;
            } else if (bN >= 97 && bN <= 102) {
                i = bN - 87;
            } else {
                if (bN < 65 || bN > 70) {
                    y("\\u".concat(c4848vb.s(4L, AbstractC2307Be.f2881a)));
                    throw null;
                }
                i = bN - 55;
            }
            c = (char) (i + c2);
        }
        c4848vb.skip(4L);
        return c;
    }

    public final void a0(C3971lc c3971lc) throws C3124bu, EOFException {
        while (true) {
            long jG = this.f.G(c3971lc);
            if (jG == -1) {
                y("Unterminated string");
                throw null;
            }
            C4848vb c4848vb = this.g;
            if (c4848vb.n(jG) != 92) {
                c4848vb.skip(jG + 1);
                return;
            } else {
                c4848vb.skip(jG + 1);
                Z();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.h = 0;
        this.b[0] = 8;
        this.f3398a = 1;
        C4848vb c4848vb = this.g;
        c4848vb.skip(c4848vb.b);
        this.f.close();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final void h() {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS == 3) {
            u(1);
            this.d[this.f3398a - 1] = 0;
            this.h = 0;
        } else {
            throw new C3770jF("Expected BEGIN_ARRAY but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final void k() {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS == 1) {
            u(3);
            this.h = 0;
        } else {
            throw new C3770jF("Expected BEGIN_OBJECT but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final void m() {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS != 4) {
            throw new C3770jF("Expected END_ARRAY but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
        }
        int i = this.f3398a;
        this.f3398a = i - 1;
        int[] iArr = this.d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.h = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final void n() {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS != 2) {
            throw new C3770jF("Expected END_OBJECT but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
        }
        int i = this.f3398a;
        int i2 = i - 1;
        this.f3398a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final boolean o() throws C3124bu, EOFException {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        return (iS == 2 || iS == 4 || iS == 18) ? false : true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final boolean p() throws C3124bu, EOFException {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS == 5) {
            this.h = 0;
            int[] iArr = this.d;
            int i = this.f3398a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iS == 6) {
            this.h = 0;
            int[] iArr2 = this.d;
            int i2 = this.f3398a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new C3770jF("Expected a boolean but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final double q() {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS == 16) {
            this.h = 0;
            int[] iArr = this.d;
            int i = this.f3398a - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iS == 17) {
            long j = this.j;
            C4848vb c4848vb = this.g;
            c4848vb.getClass();
            this.k = c4848vb.s(j, AbstractC2307Be.f2881a);
        } else if (iS == 9) {
            this.k = X(m);
        } else if (iS == 8) {
            this.k = X(l);
        } else if (iS == 10) {
            this.k = Y();
        } else if (iS != 11) {
            throw new C3770jF("Expected a double but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
        }
        this.h = 11;
        try {
            double d = Double.parseDouble(this.k);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new C3124bu("JSON forbids NaN and infinities: " + d + " at path " + getPath());
            }
            this.k = null;
            this.h = 0;
            int[] iArr2 = this.d;
            int i2 = this.f3398a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new C3770jF("Expected a double but was " + this.k + " at path " + getPath(), 0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final int r() {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS == 16) {
            long j = this.i;
            int i = (int) j;
            if (j == i) {
                this.h = 0;
                int[] iArr = this.d;
                int i2 = this.f3398a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new C3770jF("Expected an int but was " + this.i + " at path " + getPath(), 0);
        }
        if (iS == 17) {
            long j2 = this.j;
            C4848vb c4848vb = this.g;
            c4848vb.getClass();
            this.k = c4848vb.s(j2, AbstractC2307Be.f2881a);
        } else if (iS == 9 || iS == 8) {
            String strX = iS == 9 ? X(m) : X(l);
            this.k = strX;
            try {
                int i3 = Integer.parseInt(strX);
                this.h = 0;
                int[] iArr2 = this.d;
                int i4 = this.f3398a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iS != 11) {
            throw new C3770jF("Expected an int but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
        }
        this.h = 11;
        try {
            double d = Double.parseDouble(this.k);
            int i5 = (int) d;
            if (i5 != d) {
                throw new C3770jF("Expected an int but was " + this.k + " at path " + getPath(), 0);
            }
            this.k = null;
            this.h = 0;
            int[] iArr3 = this.d;
            int i6 = this.f3398a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new C3770jF("Expected an int but was " + this.k + " at path " + getPath(), 0);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final String s() {
        String strS;
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS == 10) {
            strS = Y();
        } else if (iS == 9) {
            strS = X(m);
        } else if (iS == 8) {
            strS = X(l);
        } else if (iS == 11) {
            strS = this.k;
            this.k = null;
        } else if (iS == 16) {
            strS = Long.toString(this.i);
        } else {
            if (iS != 17) {
                throw new C3770jF("Expected a string but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
            }
            long j = this.j;
            C4848vb c4848vb = this.g;
            c4848vb.getClass();
            strS = c4848vb.s(j, AbstractC2307Be.f2881a);
        }
        this.h = 0;
        int[] iArr = this.d;
        int i = this.f3398a - 1;
        iArr[i] = iArr[i] + 1;
        return strS;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final int t() throws C3124bu, EOFException {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        switch (iS) {
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

    public final String toString() {
        return "JsonReader(" + this.f + ")";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final int v(C3692iN c3692iN) {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS < 12 || iS > 15) {
            return -1;
        }
        if (iS == 15) {
            return T(this.k, c3692iN);
        }
        int iO = this.f.O((XS) c3692iN.c);
        if (iO != -1) {
            this.h = 0;
            this.c[this.f3398a - 1] = ((String[]) c3692iN.b)[iO];
            return iO;
        }
        String str = this.c[this.f3398a - 1];
        String strV = V();
        int iT = T(strV, c3692iN);
        if (iT == -1) {
            this.h = 15;
            this.k = strV;
            this.c[this.f3398a - 1] = str;
        }
        return iT;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final void w() {
        int iS = this.h;
        if (iS == 0) {
            iS = S();
        }
        if (iS == 14) {
            long jG = this.f.G(n);
            C4848vb c4848vb = this.g;
            if (jG == -1) {
                jG = c4848vb.b;
            }
            c4848vb.skip(jG);
        } else if (iS == 13) {
            a0(m);
        } else if (iS == 12) {
            a0(l);
        } else if (iS != 15) {
            throw new C3770jF("Expected a name but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
        }
        this.h = 0;
        this.c[this.f3398a - 1] = "null";
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MF
    public final void x() {
        int i = 0;
        do {
            int iS = this.h;
            if (iS == 0) {
                iS = S();
            }
            if (iS == 3) {
                u(1);
            } else {
                if (iS == 1) {
                    u(3);
                } else if (iS == 4) {
                    i--;
                    if (i < 0) {
                        throw new C3770jF("Expected a value but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
                    }
                    this.f3398a--;
                } else if (iS == 2) {
                    i--;
                    if (i < 0) {
                        throw new C3770jF("Expected a value but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
                    }
                    this.f3398a--;
                } else {
                    C4848vb c4848vb = this.g;
                    if (iS == 14 || iS == 10) {
                        long jG = this.f.G(n);
                        if (jG == -1) {
                            jG = c4848vb.b;
                        }
                        c4848vb.skip(jG);
                    } else if (iS == 9 || iS == 13) {
                        a0(m);
                    } else if (iS == 8 || iS == 12) {
                        a0(l);
                    } else if (iS == 17) {
                        c4848vb.skip(this.j);
                    } else if (iS == 18) {
                        throw new C3770jF("Expected a value but was " + AbstractC5044xl.B(t()) + " at path " + getPath(), 0);
                    }
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.f3398a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = "null";
    }
}
