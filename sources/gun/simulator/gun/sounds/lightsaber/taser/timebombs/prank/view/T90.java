package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class T90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3759a;
    public final A70 b;
    public String c;
    public final StringBuilder d;
    public final String e;

    public T90(String str) {
        AbstractC2995aW.q(str, "source");
        this.b = new A70(12);
        this.d = new StringBuilder();
        this.e = str;
    }

    public static /* synthetic */ void p(T90 t90, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = t90.f3759a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        t90.o(i, str, str2);
        throw null;
    }

    public final int a(String str, int i) {
        int i2 = i + 4;
        if (i2 < str.length()) {
            this.d.append((char) (r(str, i + 3) + (r(str, i) << 12) + (r(str, i + 1) << 8) + (r(str, i + 2) << 4)));
            return i2;
        }
        this.f3759a = i;
        if (i2 < str.length()) {
            return a(str, this.f3759a);
        }
        p(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public final boolean b() {
        int i = this.f3759a;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length()) {
                this.f3759a = i;
                return false;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f3759a = i;
                return !(cCharAt == '}' || cCharAt == ']' || cCharAt == ':' || cCharAt == ',');
            }
            i++;
        }
    }

    public final boolean c(int i) {
        int iT = t(i);
        String str = this.e;
        if (iT >= str.length() || iT == -1) {
            p(this, "EOF", 0, null, 6);
            throw null;
        }
        int i2 = iT + 1;
        int iCharAt = str.charAt(iT) | ' ';
        if (iCharAt == 102) {
            d(i2, "alse");
            return false;
        }
        if (iCharAt == 116) {
            d(i2, "rue");
            return true;
        }
        p(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
        throw null;
    }

    public final void d(int i, String str) {
        String str2 = this.e;
        if (str2.length() - i < str.length()) {
            p(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                p(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f3759a = str.length() + i;
    }

    public final String e() {
        i('\"');
        int i = this.f3759a;
        String str = this.e;
        int iS0 = AbstractC3089ba0.s0(str, '\"', i, false, 4);
        if (iS0 == -1) {
            q((byte) 1);
            throw null;
        }
        int i2 = i;
        while (i2 < iS0) {
            if (str.charAt(i2) == '\\') {
                int iT = this.f3759a;
                char cCharAt = str.charAt(i2);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        this.d.append((CharSequence) str, iT, i2);
                        int iT2 = t(i2 + 1);
                        if (iT2 == -1) {
                            p(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iA = iT2 + 1;
                        char cCharAt2 = str.charAt(iT2);
                        if (cCharAt2 == 'u') {
                            iA = a(str, iA);
                        } else {
                            char c = cCharAt2 < 'u' ? C4590se.f4990a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                p(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            this.d.append(c);
                        }
                        iT = t(iA);
                        if (iT == -1) {
                            p(this, "EOF", iT, null, 4);
                            throw null;
                        }
                    } else {
                        i2++;
                        if (i2 >= str.length()) {
                            this.d.append((CharSequence) str, iT, i2);
                            iT = t(i2);
                            if (iT == -1) {
                                p(this, "EOF", iT, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i2);
                    }
                    i2 = iT;
                    z = true;
                    cCharAt = str.charAt(i2);
                }
                String string = !z ? str.subSequence(iT, i2).toString() : n(iT, i2);
                this.f3759a = i2 + 1;
                return string;
            }
            i2++;
        }
        this.f3759a = iS0 + 1;
        String strSubstring = str.substring(i, iS0);
        AbstractC2995aW.p(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String f(String str, boolean z) {
        AbstractC2995aW.q(str, "keyToMatch");
        int i = this.f3759a;
        try {
            if (g() != 6) {
                return null;
            }
            if (!AbstractC2995aW.i(z ? e() : m(), str)) {
                return null;
            }
            if (g() != 5) {
                return null;
            }
            return z ? k() : m();
        } finally {
            this.f3759a = i;
        }
    }

    public final byte g() {
        byte bR;
        do {
            int i = this.f3759a;
            if (i == -1) {
                return (byte) 10;
            }
            String str = this.e;
            if (i >= str.length()) {
                return (byte) 10;
            }
            int i2 = this.f3759a;
            this.f3759a = i2 + 1;
            bR = AbstractC2871Wx.R(str.charAt(i2));
        } while (bR == 3);
        return bR;
    }

    public final byte h(byte b) {
        byte bG = g();
        if (bG == b) {
            return bG;
        }
        q(b);
        throw null;
    }

    public final void i(char c) {
        if (this.f3759a == -1) {
            y(c);
            throw null;
        }
        while (true) {
            int i = this.f3759a;
            String str = this.e;
            if (i >= str.length()) {
                y(c);
                throw null;
            }
            int i2 = this.f3759a;
            this.f3759a = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt == c) {
                    return;
                }
                y(c);
                throw null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String, java.lang.Throwable] */
    public final long j() {
        boolean z;
        int iT = t(u());
        String str = this.e;
        int i = 6;
        int i2 = 0;
        ?? r7 = 0;
        if (iT >= str.length() || iT == -1) {
            p(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iT) == '\"') {
            iT++;
            if (iT == str.length()) {
                p(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i3 = iT;
        long j = 0;
        boolean z2 = true;
        boolean z3 = false;
        while (z2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != '-') {
                if (AbstractC2871Wx.R(cCharAt) != 0) {
                    break;
                }
                i3++;
                z2 = i3 != str.length();
                int i4 = cCharAt - '0';
                if (i4 < 0 || i4 >= 10) {
                    ?? r9 = r7;
                    p(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, r9, 6);
                    throw r9;
                }
                j = (j * ((long) 10)) - ((long) i4);
                if (j > 0) {
                    p(this, "Numeric value overflow", 0, null, 6);
                    throw null;
                }
                i = 6;
                i2 = 0;
                r7 = 0;
            } else {
                if (i3 != iT) {
                    p(this, "Unexpected symbol '-' in numeric literal", i2, r7, i);
                    throw r7;
                }
                i3++;
                z3 = true;
            }
        }
        if (iT == i3 || (z3 && iT == i3 - 1)) {
            p(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z) {
            if (!z2) {
                p(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i3) != '\"') {
                p(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i3++;
        }
        this.f3759a = i3;
        if (z3) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        p(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final String k() {
        String str = this.c;
        if (str == null) {
            return e();
        }
        AbstractC2995aW.n(str);
        this.c = null;
        return str;
    }

    public final String l() {
        String str = this.c;
        if (str != null) {
            AbstractC2995aW.n(str);
            this.c = null;
            return str;
        }
        int iU = u();
        String str2 = this.e;
        if (iU >= str2.length() || iU == -1) {
            p(this, "EOF", iU, null, 4);
            throw null;
        }
        byte bR = AbstractC2871Wx.R(str2.charAt(iU));
        if (bR == 1) {
            return k();
        }
        if (bR != 0) {
            p(this, "Expected beginning of the string, but got " + str2.charAt(iU), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (AbstractC2871Wx.R(str2.charAt(iU)) == 0) {
            iU++;
            if (iU >= str2.length()) {
                this.d.append((CharSequence) str2, this.f3759a, iU);
                int iT = t(iU);
                if (iT == -1) {
                    this.f3759a = iU;
                    return n(0, 0);
                }
                iU = iT;
                z = true;
            }
        }
        String string = !z ? str2.subSequence(this.f3759a, iU).toString() : n(this.f3759a, iU);
        this.f3759a = iU;
        return string;
    }

    public final String m() {
        String strL = l();
        if (AbstractC2995aW.i(strL, "null")) {
            if (this.e.charAt(this.f3759a - 1) != '\"') {
                p(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return strL;
    }

    public final String n(int i, int i2) {
        this.d.append((CharSequence) this.e, i, i2);
        String string = this.d.toString();
        AbstractC2995aW.p(string, "escapedString.toString()");
        this.d.setLength(0);
        return string;
    }

    public final void o(int i, String str, String str2) {
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        AbstractC2995aW.q(str2, "hint");
        String strConcat = str2.length() == 0 ? "" : "\n".concat(str2);
        StringBuilder sbQ = DM.q(str, " at path: ");
        sbQ.append(this.b.d());
        sbQ.append(strConcat);
        throw AbstractC2871Wx.J(i, this.e, sbQ.toString());
    }

    public final void q(byte b) {
        String str;
        int i;
        if (b == 1) {
            str = "quotation mark '\"'";
        } else if (b == 4) {
            str = "comma ','";
        } else if (b == 5) {
            str = "colon ':'";
        } else if (b == 6) {
            str = "start of the object '{'";
        } else if (b == 7) {
            str = "end of the object '}'";
        } else if (b == 8) {
            str = "start of the array '['";
        } else {
            str = b == 9 ? "end of the array ']'" : "valid token";
        }
        int i2 = this.f3759a;
        String str2 = this.e;
        p(this, AbstractC5044xl.n("Expected ", str, ", but had '", (i2 == str2.length() || (i = this.f3759a) <= 0) ? "EOF" : String.valueOf(str2.charAt(i - 1)), "' instead"), this.f3759a - 1, null, 4);
        throw null;
    }

    public final int r(String str, int i) {
        char cCharAt = str.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        p(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final byte s() {
        int i = this.f3759a;
        while (true) {
            int iT = t(i);
            if (iT == -1) {
                this.f3759a = iT;
                return (byte) 10;
            }
            char cCharAt = this.e.charAt(iT);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f3759a = iT;
                return AbstractC2871Wx.R(cCharAt);
            }
            i = iT + 1;
        }
    }

    public final int t(int i) {
        if (i < this.e.length()) {
            return i;
        }
        return -1;
    }

    public final int u() {
        char cCharAt;
        int i = this.f3759a;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.e;
            if (i >= str.length() || !((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i++;
        }
        this.f3759a = i;
        return i;
    }

    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(source='");
        sb.append((Object) this.e);
        sb.append("', currentPosition=");
        return DM.k(sb, this.f3759a, ')');
    }

    public final boolean w() {
        int iU = u();
        String str = this.e;
        if (iU == str.length() || iU == -1 || str.charAt(iU) != ',') {
            return false;
        }
        this.f3759a++;
        return true;
    }

    public final boolean x() {
        int iT = t(u());
        String str = this.e;
        int length = str.length() - iT;
        if (length < 4 || iT == -1) {
            return true;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != str.charAt(iT + i)) {
                return true;
            }
        }
        if (length > 4 && AbstractC2871Wx.R(str.charAt(iT + 4)) == 0) {
            return true;
        }
        this.f3759a = iT + 4;
        return false;
    }

    public final void y(char c) {
        int i = this.f3759a - 1;
        this.f3759a = i;
        if (i >= 0 && c == '\"' && AbstractC2995aW.i(l(), "null")) {
            o(this.f3759a - 4, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw null;
        }
        q(AbstractC2871Wx.R(c));
        throw null;
    }
}
