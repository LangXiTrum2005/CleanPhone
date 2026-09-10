package com.thinkup.core.common.no.m.o.mm;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes6.dex */
final class o0 {
    private final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42016n;
    private final String o;
    private int o0;
    private int om;
    private char[] on;
    private int oo;

    private o0(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.o = name;
        this.m = name.length();
    }

    private String m() {
        int i2 = this.f42016n + 1;
        this.f42016n = i2;
        this.o0 = i2;
        this.oo = i2;
        while (true) {
            int i3 = this.f42016n;
            if (i3 == this.m) {
                throw new IllegalStateException("Unexpected end of DN: " + this.o);
            }
            char[] cArr = this.on;
            char c2 = cArr[i3];
            if (c2 == '\"') {
                this.f42016n = i3 + 1;
                while (true) {
                    int i4 = this.f42016n;
                    if (i4 >= this.m || this.on[i4] != ' ') {
                        break;
                    }
                    this.f42016n = i4 + 1;
                }
                char[] cArr2 = this.on;
                int i5 = this.o0;
                return new String(cArr2, i5, this.oo - i5);
            }
            if (c2 == '\\') {
                cArr[this.oo] = oo();
            } else {
                cArr[this.oo] = c2;
            }
            this.f42016n++;
            this.oo++;
        }
    }

    private String n() {
        char[] cArr;
        char c2;
        int i2 = this.f42016n;
        if (i2 + 4 >= this.m) {
            throw new IllegalStateException("Unexpected end of DN: " + this.o);
        }
        this.o0 = i2;
        this.f42016n = i2 + 1;
        while (true) {
            int i3 = this.f42016n;
            if (i3 == this.m || (c2 = (cArr = this.on)[i3]) == '+' || c2 == ',' || c2 == ';') {
                this.oo = i3;
                break;
            }
            if (c2 == ' ') {
                this.oo = i3;
                this.f42016n = i3 + 1;
                while (true) {
                    int i4 = this.f42016n;
                    if (i4 >= this.m || this.on[i4] != ' ') {
                        break;
                    }
                    this.f42016n = i4 + 1;
                }
            } else {
                if (c2 >= 'A' && c2 <= 'F') {
                    cArr[i3] = (char) (c2 + ' ');
                }
                this.f42016n = i3 + 1;
            }
        }
        int i5 = this.oo;
        int i6 = this.o0;
        int i7 = i5 - i6;
        if (i7 < 5 || (i7 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.o);
        }
        int i8 = i7 / 2;
        byte[] bArr = new byte[i8];
        int i9 = i6 + 1;
        for (int i10 = 0; i10 < i8; i10++) {
            bArr[i10] = (byte) o(i9);
            i9 += 2;
        }
        return new String(this.on, this.o0, i7);
    }

    private String o() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char c2;
        int i7;
        int i8;
        char c3;
        char c4;
        while (true) {
            i2 = this.f42016n;
            i3 = this.m;
            if (i2 >= i3 || this.on[i2] != ' ') {
                break;
            }
            this.f42016n = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.o0 = i2;
        this.f42016n = i2 + 1;
        while (true) {
            i4 = this.f42016n;
            i5 = this.m;
            if (i4 >= i5 || (c4 = this.on[i4]) == '=' || c4 == ' ') {
                break;
            }
            this.f42016n = i4 + 1;
        }
        if (i4 >= i5) {
            throw new IllegalStateException("Unexpected end of DN: " + this.o);
        }
        this.oo = i4;
        if (this.on[i4] == ' ') {
            while (true) {
                i7 = this.f42016n;
                i8 = this.m;
                if (i7 >= i8 || (c3 = this.on[i7]) == '=' || c3 != ' ') {
                    break;
                }
                this.f42016n = i7 + 1;
            }
            if (this.on[i7] != '=' || i7 == i8) {
                throw new IllegalStateException("Unexpected end of DN: " + this.o);
            }
        }
        do {
            i6 = this.f42016n + 1;
            this.f42016n = i6;
            if (i6 >= this.m) {
                break;
            }
        } while (this.on[i6] == ' ');
        int i9 = this.oo;
        int i10 = this.o0;
        if (i9 - i10 > 4) {
            char[] cArr = this.on;
            if (cArr[i10 + 3] == '.' && (((c2 = cArr[i10]) == 'O' || c2 == 'o') && ((cArr[i10 + 1] == 'I' || cArr[i10 + 1] == 'i') && (cArr[i10 + 2] == 'D' || cArr[i10 + 2] == 'd')))) {
                this.o0 = i10 + 4;
            }
        }
        char[] cArr2 = this.on;
        int i11 = this.o0;
        return new String(cArr2, i11, i9 - i11);
    }

    private String o0() {
        int i2;
        int i3;
        char c2;
        int i4 = this.f42016n;
        this.o0 = i4;
        this.oo = i4;
        while (true) {
            int i5 = this.f42016n;
            if (i5 >= this.m) {
                char[] cArr = this.on;
                int i6 = this.o0;
                return new String(cArr, i6, this.oo - i6);
            }
            char[] cArr2 = this.on;
            char c3 = cArr2[i5];
            if (c3 != ' ') {
                if (c3 != ';') {
                    if (c3 == '\\') {
                        int i7 = this.oo;
                        this.oo = i7 + 1;
                        cArr2[i7] = oo();
                        this.f42016n++;
                    } else if (c3 != '+' && c3 != ',') {
                        int i8 = this.oo;
                        this.oo = i8 + 1;
                        cArr2[i8] = c3;
                        this.f42016n = i5 + 1;
                    }
                }
                int i9 = this.o0;
                return new String(cArr2, i9, this.oo - i9);
            }
            int i10 = this.oo;
            this.om = i10;
            this.f42016n = i5 + 1;
            this.oo = i10 + 1;
            cArr2[i10] = ' ';
            while (true) {
                i2 = this.f42016n;
                i3 = this.m;
                if (i2 >= i3) {
                    break;
                }
                char[] cArr3 = this.on;
                if (cArr3[i2] != ' ') {
                    break;
                }
                int i11 = this.oo;
                this.oo = i11 + 1;
                cArr3[i11] = ' ';
                this.f42016n = i2 + 1;
            }
            if (i2 == i3 || (c2 = this.on[i2]) == ',' || c2 == '+' || c2 == ';') {
                char[] cArr4 = this.on;
                int i12 = this.o0;
                return new String(cArr4, i12, this.om - i12);
            }
        }
    }

    private char om() {
        int i2;
        int i3;
        int iO = o(this.f42016n);
        this.f42016n++;
        if (iO < 128) {
            return (char) iO;
        }
        if (iO < 192 || iO > 247) {
            return '?';
        }
        if (iO <= 223) {
            i2 = iO & 31;
            i3 = 1;
        } else if (iO <= 239) {
            i2 = iO & 15;
            i3 = 2;
        } else {
            i2 = iO & 7;
            i3 = 3;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.f42016n;
            int i6 = i5 + 1;
            this.f42016n = i6;
            if (i6 == this.m || this.on[i6] != '\\') {
                return '?';
            }
            int i7 = i5 + 2;
            this.f42016n = i7;
            int iO2 = o(i7);
            this.f42016n++;
            if ((iO2 & PsExtractor.AUDIO_STREAM) != 128) {
                return '?';
            }
            i2 = (i2 << 6) + (iO2 & 63);
        }
        return (char) i2;
    }

    private char oo() {
        int i2 = this.f42016n + 1;
        this.f42016n = i2;
        if (i2 == this.m) {
            throw new IllegalStateException("Unexpected end of DN: " + this.o);
        }
        char c2 = this.on[i2];
        if (c2 == ' ' || c2 == '%' || c2 == '\\' || c2 == '_' || c2 == '\"' || c2 == '#') {
            return c2;
        }
        switch (c2) {
            case '*':
            case '+':
            case ',':
                return c2;
            default:
                switch (c2) {
                    case ';':
                    case '<':
                    case APP_BACKGROUND_DURING_AD_LOAD_VALUE:
                    case '>':
                        return c2;
                    default:
                        return om();
                }
        }
    }

    private int o(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        if (i5 < this.m) {
            char[] cArr = this.on;
            char c2 = cArr[i2];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else {
                if (c2 < 'A' || c2 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.o);
                }
                i3 = c2 - '7';
            }
            char c3 = cArr[i5];
            if (c3 >= '0' && c3 <= '9') {
                i4 = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i4 = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new IllegalStateException("Malformed DN: " + this.o);
                }
                i4 = c3 - '7';
            }
            return (i3 << 4) + i4;
        }
        throw new IllegalStateException("Malformed DN: " + this.o);
    }

    private String o(String str) {
        String str2;
        this.f42016n = 0;
        this.o0 = 0;
        this.oo = 0;
        this.om = 0;
        this.on = this.o.toCharArray();
        String strO = o();
        if (strO == null) {
            return null;
        }
        do {
            int i2 = this.f42016n;
            if (i2 == this.m) {
                return null;
            }
            char c2 = this.on[i2];
            if (c2 == '\"') {
                int i3 = i2 + 1;
                this.f42016n = i3;
                this.o0 = i3;
                this.oo = i3;
                while (true) {
                    int i4 = this.f42016n;
                    if (i4 != this.m) {
                        char[] cArr = this.on;
                        char c3 = cArr[i4];
                        if (c3 == '\"') {
                            this.f42016n = i4 + 1;
                            while (true) {
                                int i5 = this.f42016n;
                                if (i5 >= this.m || this.on[i5] != ' ') {
                                    break;
                                }
                                this.f42016n = i5 + 1;
                            }
                            char[] cArr2 = this.on;
                            int i6 = this.o0;
                            str2 = new String(cArr2, i6, this.oo - i6);
                            break;
                        }
                        if (c3 == '\\') {
                            cArr[this.oo] = oo();
                        } else {
                            cArr[this.oo] = c3;
                        }
                        this.f42016n++;
                        this.oo++;
                    } else {
                        throw new IllegalStateException("Unexpected end of DN: " + this.o);
                    }
                }
            } else if (c2 == '#') {
                str2 = n();
            } else if (c2 != '+' && c2 != ',' && c2 != ';') {
                str2 = o0();
            } else {
                str2 = "";
            }
            if (str.equalsIgnoreCase(strO)) {
                return str2;
            }
            int i7 = this.f42016n;
            if (i7 >= this.m) {
                return null;
            }
            char c4 = this.on[i7];
            if (c4 != ',' && c4 != ';' && c4 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.o);
            }
            this.f42016n = i7 + 1;
            strO = o();
        } while (strO != null);
        throw new IllegalStateException("Malformed DN: " + this.o);
    }
}
