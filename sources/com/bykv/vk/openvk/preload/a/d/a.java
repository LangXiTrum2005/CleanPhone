package com.bykv.vk.openvk.preload.a.d;

import com.badlogic.gdx.Input;
import com.bykv.vk.openvk.preload.a.b.e;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {
    private final Reader b;
    private long i;
    private int j;
    private String k;
    private int[] l;
    private String[] n;
    private int[] o;
    private boolean c = false;
    private final char[] d = new char[1024];
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f295a = 0;
    private int m = 1;

    static {
        e.f276a = new e() { // from class: com.bykv.vk.openvk.preload.a.d.a.1
            @Override // com.bykv.vk.openvk.preload.a.b.e
            public final void a(a aVar) throws IOException {
                if (aVar instanceof com.bykv.vk.openvk.preload.a.b.a.e) {
                    ((com.bykv.vk.openvk.preload.a.b.a.e) aVar).o();
                    return;
                }
                int iR = aVar.f295a;
                if (iR == 0) {
                    iR = aVar.r();
                }
                if (iR == 13) {
                    aVar.f295a = 9;
                    return;
                }
                if (iR == 12) {
                    aVar.f295a = 8;
                } else {
                    if (iR == 14) {
                        aVar.f295a = 10;
                        return;
                    }
                    throw new IllegalStateException("Expected a name but was " + aVar.f() + aVar.s());
                }
            }
        };
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.b = reader;
    }

    private int o() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.d[this.e];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.e + i2 >= this.f && !b(i2 + 1)) {
                return 0;
            }
            char c2 = this.d[this.e + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.e + length < this.f || b(length + 1)) && a(this.d[this.e + length])) {
            return 0;
        }
        this.e += length;
        this.f295a = i;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:96:0x00ee  */
    private int t() throws IOException {
        char c;
        char[] cArr = this.d;
        int i = this.e;
        int i2 = this.f;
        int i3 = 0;
        int i4 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i + i4 == i2) {
                if (i4 != 1024) {
                    if (!b(i4 + 1)) {
                        break;
                    }
                    i = this.e;
                    i2 = this.f;
                    c = cArr[i + i4];
                    if (c != '+') {
                        if (c != 'E') {
                            i3 = 0;
                            if (c2 == 2) {
                            }
                            c2 = 5;
                        } else {
                            i3 = 0;
                            if (c2 == 2) {
                            }
                            c2 = 5;
                        }
                        i4++;
                    } else {
                        i3 = 0;
                        if (c2 != 5) {
                            return 0;
                        }
                    }
                    c2 = 6;
                    i4++;
                } else {
                    return i3;
                }
            } else {
                c = cArr[i + i4];
                if (c != '+') {
                    if (c != 'E' || c == 'e') {
                        i3 = 0;
                        if (c2 == 2 && c2 != 4) {
                            return 0;
                        }
                        c2 = 5;
                    } else if (c == '-') {
                        i3 = 0;
                        if (c2 == 0) {
                            c2 = 1;
                            z2 = true;
                        } else if (c2 != 5) {
                            return 0;
                        }
                    } else if (c == '.') {
                        i3 = 0;
                        if (c2 != 2) {
                            return 0;
                        }
                        c2 = 3;
                    } else {
                        if (c < '0' || c > '9') {
                            if (!a(c)) {
                                break;
                            }
                            return 0;
                        }
                        if (c2 == 1 || c2 == 0) {
                            j = -(c - '0');
                            i3 = 0;
                            c2 = 2;
                        } else {
                            if (c2 == 2) {
                                if (j == 0) {
                                    return 0;
                                }
                                long j2 = (10 * j) - ((long) (c - '0'));
                                z &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                                j = j2;
                            } else if (c2 == 3) {
                                i3 = 0;
                                c2 = 4;
                            } else if (c2 == 5 || c2 == 6) {
                                i3 = 0;
                                c2 = 7;
                            }
                            i3 = 0;
                        }
                    }
                    i4++;
                } else {
                    i3 = 0;
                    if (c2 != 5) {
                        return 0;
                    }
                }
                c2 = 6;
                i4++;
            }
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.i = j;
            this.e += i4;
            this.f295a = 15;
            return 15;
        }
        if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        }
        this.j = i4;
        this.f295a = 16;
        return 16;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private String u() throws IOException {
        String string;
        StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.e;
                if (i3 + i2 < this.f) {
                    char c = this.d[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case Input.Keys.MUTE /* 91 */:
                                                case Input.Keys.PAGE_DOWN /* 93 */:
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        v();
                    }
                    i = i2;
                } else if (i2 >= 1024) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(this.d, this.e, i2);
                    this.e += i2;
                    if (!b(1)) {
                    }
                } else if (!b(i2 + 1)) {
                    i = i2;
                }
                if (sb == null) {
                    string = new String(this.d, this.e, i);
                } else {
                    sb.append(this.d, this.e, i);
                    string = sb.toString();
                }
                this.e += i;
                return string;
            }
        }
    }

    private void v() throws IOException {
        if (!this.c) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void w() throws IOException {
        char c;
        do {
            if (this.e >= this.f && !b(1)) {
                return;
            }
            char[] cArr = this.d;
            int i = this.e;
            int i2 = i + 1;
            this.e = i2;
            c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = i2;
                return;
            }
        } while (c != '\r');
    }

    private char x() throws IOException {
        int i;
        if (this.e == this.f && !b(1)) {
            throw b("Unterminated escape sequence");
        }
        char[] cArr = this.d;
        int i2 = this.e;
        int i3 = i2 + 1;
        this.e = i3;
        char c = cArr[i2];
        if (c == '\n') {
            this.g++;
            this.h = i3;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c != 'u') {
                throw b("Invalid escape sequence");
            }
            if (i2 + 5 > this.f && !b(4)) {
                throw b("Unterminated escape sequence");
            }
            int i4 = this.e;
            int i5 = i4 + 4;
            char c2 = 0;
            while (i4 < i5) {
                char c3 = this.d[i4];
                char c4 = (char) (c2 << 4);
                if (c3 >= '0' && c3 <= '9') {
                    i = c3 - '0';
                } else if (c3 >= 'a' && c3 <= 'f') {
                    i = c3 - 'W';
                } else {
                    if (c3 < 'A' || c3 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(this.d, this.e, 4)));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (i + c4);
                i4++;
            }
            this.e += 4;
            return c2;
        }
        return c;
    }

    private void y() throws IOException {
        b(true);
        int i = this.e;
        int i2 = i - 1;
        this.e = i2;
        if (i + 4 <= this.f || b(5)) {
            char[] cArr = this.d;
            if (cArr[i2] == ')' && cArr[i] == ']' && cArr[i + 1] == '}' && cArr[i + 2] == '\'' && cArr[i + 3] == '\n') {
                this.e += 5;
            }
        }
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public void b() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + f() + s());
        }
        int i = this.m;
        this.m = i - 1;
        int[] iArr = this.o;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.f295a = 0;
    }

    public void c() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 1) {
            a(3);
            this.f295a = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + f() + s());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f295a = 0;
        this.l[0] = 8;
        this.m = 1;
        this.b.close();
    }

    public void d() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + f() + s());
        }
        int i = this.m;
        int i2 = i - 1;
        this.m = i2;
        this.n[i2] = null;
        int[] iArr = this.o;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f295a = 0;
    }

    public boolean e() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        return (iR == 2 || iR == 4) ? false : true;
    }

    public b f() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        switch (iR) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public String g() throws IOException {
        String strB;
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 14) {
            strB = u();
        } else if (iR == 12) {
            strB = b('\'');
        } else {
            if (iR != 13) {
                throw new IllegalStateException("Expected a name but was " + f() + s());
            }
            strB = b('\"');
        }
        this.f295a = 0;
        this.n[this.m - 1] = strB;
        return strB;
    }

    public String h() throws IOException {
        String str;
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 10) {
            str = u();
        } else if (iR == 8) {
            str = b('\'');
        } else if (iR == 9) {
            str = b('\"');
        } else if (iR == 11) {
            str = this.k;
            this.k = null;
        } else if (iR == 15) {
            str = Long.toString(this.i);
        } else {
            if (iR != 16) {
                throw new IllegalStateException("Expected a string but was " + f() + s());
            }
            str = new String(this.d, this.e, this.j);
            this.e += this.j;
        }
        this.f295a = 0;
        int[] iArr = this.o;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public boolean i() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 5) {
            this.f295a = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iR != 6) {
            throw new IllegalStateException("Expected a boolean but was " + f() + s());
        }
        this.f295a = 0;
        int[] iArr2 = this.o;
        int i2 = this.m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public void j() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR != 7) {
            throw new IllegalStateException("Expected null but was " + f() + s());
        }
        this.f295a = 0;
        int[] iArr = this.o;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
    }

    public double k() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            this.f295a = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iR == 16) {
            this.k = new String(this.d, this.e, this.j);
            this.e += this.j;
        } else if (iR == 8 || iR == 9) {
            this.k = b(iR == 8 ? '\'' : '\"');
        } else if (iR == 10) {
            this.k = u();
        } else if (iR != 11) {
            throw new IllegalStateException("Expected a double but was " + f() + s());
        }
        this.f295a = 11;
        double d = Double.parseDouble(this.k);
        if (!this.c && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new d("JSON forbids NaN and infinities: " + d + s());
        }
        this.k = null;
        this.f295a = 0;
        int[] iArr2 = this.o;
        int i2 = this.m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public long l() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            this.f295a = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iR == 16) {
            this.k = new String(this.d, this.e, this.j);
            this.e += this.j;
        } else {
            if (iR != 8 && iR != 9 && iR != 10) {
                throw new IllegalStateException("Expected a long but was " + f() + s());
            }
            if (iR == 10) {
                this.k = u();
            } else {
                this.k = b(iR == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.k);
                this.f295a = 0;
                int[] iArr2 = this.o;
                int i2 = this.m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.f295a = 11;
        double d = Double.parseDouble(this.k);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.k + s());
        }
        this.k = null;
        this.f295a = 0;
        int[] iArr3 = this.o;
        int i3 = this.m - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    public int m() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            long j = this.i;
            int i = (int) j;
            if (j != i) {
                throw new NumberFormatException("Expected an int but was " + this.i + s());
            }
            this.f295a = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iR == 16) {
            this.k = new String(this.d, this.e, this.j);
            this.e += this.j;
        } else {
            if (iR != 8 && iR != 9 && iR != 10) {
                throw new IllegalStateException("Expected an int but was " + f() + s());
            }
            if (iR == 10) {
                this.k = u();
            } else {
                this.k = b(iR == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.k);
                this.f295a = 0;
                int[] iArr2 = this.o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f295a = 11;
        double d = Double.parseDouble(this.k);
        int i5 = (int) d;
        if (i5 != d) {
            throw new NumberFormatException("Expected an int but was " + this.k + s());
        }
        this.k = null;
        this.f295a = 0;
        int[] iArr3 = this.o;
        int i6 = this.m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    public void n() throws IOException {
        int i = 0;
        do {
            int iR = this.f295a;
            if (iR == 0) {
                iR = r();
            }
            if (iR == 3) {
                a(1);
            } else {
                if (iR == 1) {
                    a(3);
                } else if (iR == 4 || iR == 2) {
                    this.m--;
                    i--;
                } else if (iR == 14 || iR == 10) {
                    while (true) {
                        int i2 = 0;
                        while (true) {
                            int i3 = this.e;
                            if (i3 + i2 < this.f) {
                                char c = this.d[i3 + i2];
                                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (c != '/' && c != '=') {
                                                if (c != '{' && c != '}' && c != ':') {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case Input.Keys.MUTE /* 91 */:
                                                            case Input.Keys.PAGE_DOWN /* 93 */:
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    v();
                                }
                                this.e += i2;
                            } else {
                                this.e = i3 + i2;
                                if (!b(1)) {
                                }
                            }
                        }
                    }
                } else if (iR == 8 || iR == 12) {
                    c('\'');
                } else if (iR == 9 || iR == 13) {
                    c('\"');
                } else if (iR == 16) {
                    this.e += this.j;
                }
                this.f295a = 0;
            }
            i++;
            this.f295a = 0;
        } while (i != 0);
        int[] iArr = this.o;
        int i4 = this.m;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.n[i4 - 1] = "null";
    }

    public String p() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.o[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.n[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final boolean q() {
        return this.c;
    }

    public final int r() throws IOException {
        int iB;
        int[] iArr = this.l;
        int i = this.m;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iB2 = b(true);
            if (iB2 != 44) {
                if (iB2 != 59) {
                    if (iB2 != 93) {
                        throw b("Unterminated array");
                    }
                    this.f295a = 4;
                    return 4;
                }
                v();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5 && (iB = b(true)) != 44) {
                    if (iB != 59) {
                        if (iB != 125) {
                            throw b("Unterminated object");
                        }
                        this.f295a = 2;
                        return 2;
                    }
                    v();
                }
                int iB3 = b(true);
                if (iB3 == 34) {
                    this.f295a = 13;
                    return 13;
                }
                if (iB3 == 39) {
                    v();
                    this.f295a = 12;
                    return 12;
                }
                if (iB3 == 125) {
                    if (i2 == 5) {
                        throw b("Expected name");
                    }
                    this.f295a = 2;
                    return 2;
                }
                v();
                this.e--;
                if (!a((char) iB3)) {
                    throw b("Expected name");
                }
                this.f295a = 14;
                return 14;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iB4 = b(true);
                if (iB4 != 58) {
                    if (iB4 != 61) {
                        throw b("Expected ':'");
                    }
                    v();
                    if (this.e < this.f || b(1)) {
                        char[] cArr = this.d;
                        int i3 = this.e;
                        if (cArr[i3] == '>') {
                            this.e = i3 + 1;
                        }
                    }
                }
            } else if (i2 == 6) {
                if (this.c) {
                    y();
                }
                this.l[this.m - 1] = 7;
            } else if (i2 == 7) {
                if (b(false) == -1) {
                    this.f295a = 17;
                    return 17;
                }
                v();
                this.e--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iB5 = b(true);
        if (iB5 == 34) {
            this.f295a = 9;
            return 9;
        }
        if (iB5 == 39) {
            v();
            this.f295a = 8;
            return 8;
        }
        if (iB5 != 44 && iB5 != 59) {
            if (iB5 == 91) {
                this.f295a = 3;
                return 3;
            }
            if (iB5 != 93) {
                if (iB5 == 123) {
                    this.f295a = 1;
                    return 1;
                }
                this.e--;
                int iO = o();
                if (iO != 0) {
                    return iO;
                }
                int iT = t();
                if (iT != 0) {
                    return iT;
                }
                if (!a(this.d[this.e])) {
                    throw b("Expected value");
                }
                v();
                this.f295a = 10;
                return 10;
            }
            if (i2 == 1) {
                this.f295a = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw b("Unexpected value");
        }
        v();
        this.e--;
        this.f295a = 7;
        return 7;
    }

    public final String s() {
        StringBuilder sbT = AbstractC3950lJ.t(" at line ", this.g + 1, " column ", (this.e - this.h) + 1, " path ");
        sbT.append(p());
        return sbT.toString();
    }

    public String toString() {
        return getClass().getSimpleName() + s();
    }

    public void a() throws IOException {
        int iR = this.f295a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 3) {
            a(1);
            this.o[this.m - 1] = 0;
            this.f295a = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + f() + s());
        }
    }

    private void c(char c) throws IOException {
        char[] cArr = this.d;
        while (true) {
            int i = this.e;
            int i2 = this.f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.e = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.e = i3;
                        x();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.g++;
                            this.h = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.e = i;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                    break;
                }
            }
        }
    }

    private String b(char c) throws IOException {
        char[] cArr = this.d;
        StringBuilder sb = null;
        while (true) {
            int i = this.e;
            int i2 = this.f;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.e = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.e = i4;
                        int i6 = i4 - i;
                        int i7 = i6 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i6 << 1, 16));
                        }
                        sb.append(cArr, i, i7);
                        sb.append(x());
                        break;
                    }
                    if (c2 == '\n') {
                        this.g++;
                        this.h = i4;
                    }
                    i3 = i4;
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i3 - i) << 1, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.e = i3;
                    if (b(1)) {
                        break;
                    }
                    throw b("Unterminated string");
                }
            }
        }
    }

    private boolean a(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case Input.Keys.MUTE /* 91 */:
                        case Input.Keys.PAGE_DOWN /* 93 */:
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        v();
        return false;
    }

    private void a(int i) {
        int i2 = this.m;
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            this.l = Arrays.copyOf(iArr, i3);
            this.o = Arrays.copyOf(this.o, i3);
            this.n = (String[]) Arrays.copyOf(this.n, i3);
        }
        int[] iArr2 = this.l;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr2[i4] = i;
    }

    private boolean a(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.e + length > this.f && !b(length)) {
                return false;
            }
            char[] cArr = this.d;
            int i = this.e;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.d[this.e + i2] == str.charAt(i2)) {
                    }
                }
                return true;
            }
            this.g++;
            this.h = i + 1;
            this.e++;
        }
    }

    private boolean b(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.d;
        int i4 = this.h;
        int i5 = this.e;
        this.h = i4 - i5;
        int i6 = this.f;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f = 0;
        }
        this.e = 0;
        do {
            Reader reader = this.b;
            int i8 = this.f;
            int i9 = reader.read(cArr, i8, 1024 - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f + i9;
            this.f = i2;
            if (this.g == 0 && (i3 = this.h) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.e++;
                this.h = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private int b(boolean z) throws IOException {
        char[] cArr = this.d;
        int i = this.e;
        int i2 = this.f;
        while (true) {
            if (i == i2) {
                this.e = i;
                if (!b(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + s());
                }
                i = this.e;
                i2 = this.f;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.e = i3;
                    if (i3 == i2) {
                        this.e = i;
                        boolean zB = b(2);
                        this.e++;
                        if (!zB) {
                            return c;
                        }
                    }
                    v();
                    int i4 = this.e;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.e = i4 + 1;
                        if (a("*/")) {
                            i = this.e + 2;
                            i2 = this.f;
                        } else {
                            throw b("Unterminated comment");
                        }
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.e = i4 + 1;
                        w();
                        i = this.e;
                        i2 = this.f;
                    }
                } else if (c == '#') {
                    this.e = i3;
                    v();
                    w();
                    i = this.e;
                    i2 = this.f;
                } else {
                    this.e = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private IOException b(String str) throws IOException {
        StringBuilder sbO = DM.o(str);
        sbO.append(s());
        throw new d(sbO.toString());
    }
}
