package com.google.gson.stream;

import android.support.v4.media.a;
import com.applovin.shadow.okio.internal.Buffer;
import com.google.gson.JsonPrimitive;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.bind.JsonTreeReader;
import com.thinkup.core.common.n.mo;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class JsonReader implements Closeable {
    public final Reader X;
    public long j0;
    public int k0;
    public String l0;
    public int[] m0;
    public String[] o0;
    public int[] p0;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f21326Y = false;
    public final char[] Z = new char[1024];
    public int e0 = 0;
    public int f0 = 0;
    public int g0 = 0;
    public int h0 = 0;
    public int i0 = 0;
    public int n0 = 1;

    /* JADX INFO: renamed from: com.google.gson.stream.JsonReader$1, reason: invalid class name */
    public class AnonymousClass1 extends JsonReaderInternalAccess {
        @Override // com.google.gson.internal.JsonReaderInternalAccess
        public final void a(JsonReader jsonReader) throws IOException {
            if (jsonReader instanceof JsonTreeReader) {
                JsonTreeReader jsonTreeReader = (JsonTreeReader) jsonReader;
                jsonTreeReader.D0(JsonToken.f0);
                Map.Entry entry = (Map.Entry) ((Iterator) jsonTreeReader.J0()).next();
                jsonTreeReader.N0(entry.getValue());
                jsonTreeReader.N0(new JsonPrimitive((String) entry.getKey()));
                return;
            }
            int iL = jsonReader.i0;
            if (iL == 0) {
                iL = jsonReader.l();
            }
            if (iL == 13) {
                jsonReader.i0 = 9;
                return;
            }
            if (iL == 12) {
                jsonReader.i0 = 8;
            } else {
                if (iL == 14) {
                    jsonReader.i0 = 10;
                    return;
                }
                throw new IllegalStateException("Expected a name but was " + jsonReader.j0() + jsonReader.H());
            }
        }
    }

    static {
        JsonReaderInternalAccess.f21232a = new AnonymousClass1();
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.m0 = iArr;
        iArr[0] = 6;
        this.o0 = new String[32];
        this.p0 = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.X = reader;
    }

    public final void C0(String str) {
        StringBuilder sbW = a.w(str);
        sbW.append(H());
        throw new MalformedJsonException(sbW.toString());
    }

    public final boolean G(char c2) {
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
        k();
        return false;
    }

    final String H() {
        StringBuilder sbP = androidx.datastore.preferences.protobuf.a.p(this.g0 + 1, (this.e0 - this.h0) + 1, " at line ", " column ", " path ");
        sbP.append(u());
        return sbP.toString();
    }

    public boolean I() throws IOException {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 5) {
            this.i0 = 0;
            int[] iArr = this.p0;
            int i2 = this.n0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iL != 6) {
            throw new IllegalStateException("Expected a boolean but was " + j0() + H());
        }
        this.i0 = 0;
        int[] iArr2 = this.p0;
        int i3 = this.n0 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public double J() throws IOException {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            this.i0 = 0;
            int[] iArr = this.p0;
            int i2 = this.n0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j0;
        }
        if (iL == 16) {
            this.l0 = new String(this.Z, this.e0, this.k0);
            this.e0 += this.k0;
        } else if (iL == 8 || iL == 9) {
            this.l0 = Y(iL == 8 ? '\'' : AbstractJsonLexerKt.STRING);
        } else if (iL == 10) {
            this.l0 = e0();
        } else if (iL != 11) {
            throw new IllegalStateException("Expected a double but was " + j0() + H());
        }
        this.i0 = 11;
        double d = Double.parseDouble(this.l0);
        if (!this.f21326Y && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d + H());
        }
        this.l0 = null;
        this.i0 = 0;
        int[] iArr2 = this.p0;
        int i3 = this.n0 - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return d;
    }

    public int K() throws IOException {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            long j = this.j0;
            int i2 = (int) j;
            if (j != i2) {
                throw new NumberFormatException("Expected an int but was " + this.j0 + H());
            }
            this.i0 = 0;
            int[] iArr = this.p0;
            int i3 = this.n0 - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (iL == 16) {
            this.l0 = new String(this.Z, this.e0, this.k0);
            this.e0 += this.k0;
        } else {
            if (iL != 8 && iL != 9 && iL != 10) {
                throw new IllegalStateException("Expected an int but was " + j0() + H());
            }
            if (iL == 10) {
                this.l0 = e0();
            } else {
                this.l0 = Y(iL == 8 ? '\'' : AbstractJsonLexerKt.STRING);
            }
            try {
                int i4 = Integer.parseInt(this.l0);
                this.i0 = 0;
                int[] iArr2 = this.p0;
                int i5 = this.n0 - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.i0 = 11;
        double d = Double.parseDouble(this.l0);
        int i6 = (int) d;
        if (i6 != d) {
            throw new NumberFormatException("Expected an int but was " + this.l0 + H());
        }
        this.l0 = null;
        this.i0 = 0;
        int[] iArr3 = this.p0;
        int i7 = this.n0 - 1;
        iArr3[i7] = iArr3[i7] + 1;
        return i6;
    }

    public long P() throws IOException {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            this.i0 = 0;
            int[] iArr = this.p0;
            int i2 = this.n0 - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j0;
        }
        if (iL == 16) {
            this.l0 = new String(this.Z, this.e0, this.k0);
            this.e0 += this.k0;
        } else {
            if (iL != 8 && iL != 9 && iL != 10) {
                throw new IllegalStateException("Expected a long but was " + j0() + H());
            }
            if (iL == 10) {
                this.l0 = e0();
            } else {
                this.l0 = Y(iL == 8 ? '\'' : AbstractJsonLexerKt.STRING);
            }
            try {
                long j = Long.parseLong(this.l0);
                this.i0 = 0;
                int[] iArr2 = this.p0;
                int i3 = this.n0 - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.i0 = 11;
        double d = Double.parseDouble(this.l0);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.l0 + H());
        }
        this.l0 = null;
        this.i0 = 0;
        int[] iArr3 = this.p0;
        int i4 = this.n0 - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j2;
    }

    public String S() throws IOException {
        String strY;
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            strY = e0();
        } else if (iL == 12) {
            strY = Y('\'');
        } else {
            if (iL != 13) {
                throw new IllegalStateException("Expected a name but was " + j0() + H());
            }
            strY = Y(AbstractJsonLexerKt.STRING);
        }
        this.i0 = 0;
        this.o0[this.n0 - 1] = strY;
        return strY;
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    public final int T(boolean z2) throws IOException {
        int i2 = this.e0;
        int i3 = this.f0;
        while (true) {
            if (i2 == i3) {
                this.e0 = i2;
                if (!q(1)) {
                    if (!z2) {
                        return -1;
                    }
                    throw new EOFException("End of input" + H());
                }
                i2 = this.e0;
                i3 = this.f0;
            }
            int i4 = i2 + 1;
            char[] cArr = this.Z;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.g0++;
                this.h0 = i4;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.e0 = i4;
                    if (i4 == i3) {
                        this.e0 = i2;
                        boolean zQ = q(2);
                        this.e0++;
                        if (!zQ) {
                        }
                        return c2;
                    }
                    k();
                    int i5 = this.e0;
                    char c3 = cArr[i5];
                    if (c3 == '*') {
                        this.e0 = i5 + 1;
                        while (true) {
                            if (this.e0 + 2 > this.f0 && !q(2)) {
                                C0("Unterminated comment");
                                throw null;
                            }
                            int i6 = this.e0;
                            if (cArr[i6] != '\n') {
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= 2) {
                                        i2 = this.e0 + 2;
                                        i3 = this.f0;
                                        break;
                                    }
                                    if (cArr[this.e0 + i7] != "*/".charAt(i7)) {
                                        break;
                                    }
                                    i7++;
                                }
                            } else {
                                this.g0++;
                                this.h0 = i6 + 1;
                            }
                            this.e0++;
                        }
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.e0 = i5 + 1;
                        u0();
                        i2 = this.e0;
                        i3 = this.f0;
                    }
                } else {
                    if (c2 != '#') {
                        this.e0 = i4;
                        return c2;
                    }
                    this.e0 = i4;
                    k();
                    u0();
                    i2 = this.e0;
                    i3 = this.f0;
                }
            }
            i2 = i4;
        }
    }

    public void U() {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 7) {
            throw new IllegalStateException("Expected null but was " + j0() + H());
        }
        this.i0 = 0;
        int[] iArr = this.p0;
        int i2 = this.n0 - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public final String Y(char c2) throws IOException {
        int i2;
        char[] cArr;
        StringBuilder sb = null;
        do {
            int i3 = this.e0;
            int i4 = this.f0;
            while (true) {
                int i5 = i4;
                i2 = i3;
                while (true) {
                    cArr = this.Z;
                    if (i3 < i5) {
                        int i6 = i3 + 1;
                        char c3 = cArr[i3];
                        if (c3 == c2) {
                            this.e0 = i6;
                            int i7 = (i6 - i2) - 1;
                            if (sb == null) {
                                return new String(cArr, i2, i7);
                            }
                            sb.append(cArr, i2, i7);
                            return sb.toString();
                        }
                        if (c3 == '\\') {
                            this.e0 = i6;
                            int i8 = i6 - i2;
                            int i9 = i8 - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max(i8 * 2, 16));
                            }
                            sb.append(cArr, i2, i9);
                            sb.append(s0());
                            i3 = this.e0;
                            i4 = this.f0;
                        } else {
                            if (c3 == '\n') {
                                this.g0++;
                                this.h0 = i6;
                            }
                            i3 = i6;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i3 - i2) * 2, 16));
            }
            sb.append(cArr, i2, i3 - i2);
            this.e0 = i3;
        } while (q(1));
        C0("Unterminated string");
        throw null;
    }

    public String c0() throws IOException {
        String str;
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 10) {
            str = e0();
        } else if (iL == 8) {
            str = Y('\'');
        } else if (iL == 9) {
            str = Y(AbstractJsonLexerKt.STRING);
        } else if (iL == 11) {
            str = this.l0;
            this.l0 = null;
        } else if (iL == 15) {
            str = Long.toString(this.j0);
        } else {
            if (iL != 16) {
                throw new IllegalStateException("Expected a string but was " + j0() + H());
            }
            str = new String(this.Z, this.e0, this.k0);
            this.e0 += this.k0;
        }
        this.i0 = 0;
        int[] iArr = this.p0;
        int i2 = this.n0 - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i0 = 0;
        this.m0[0] = 8;
        this.n0 = 1;
        this.X.close();
    }

    public void d() throws IOException {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 3) {
            q0(1);
            this.p0[this.n0 - 1] = 0;
            this.i0 = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + j0() + H());
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String e0() throws IOException {
        String string;
        StringBuilder sb = null;
        int i2 = 0;
        while (true) {
            int i3 = 0;
            while (true) {
                int i4 = this.e0;
                int i5 = i4 + i3;
                int i6 = this.f0;
                char[] cArr = this.Z;
                if (i5 < i6) {
                    char c2 = cArr[i4 + i3];
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
                        k();
                    }
                    i2 = i3;
                } else if (i3 >= cArr.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i3, 16));
                    }
                    sb.append(cArr, this.e0, i3);
                    this.e0 += i3;
                    if (!q(1)) {
                    }
                } else if (!q(i3 + 1)) {
                    i2 = i3;
                }
                if (sb == null) {
                    string = new String(cArr, this.e0, i2);
                } else {
                    sb.append(cArr, this.e0, i2);
                    string = sb.toString();
                }
                this.e0 += i2;
                return string;
            }
        }
    }

    public void h() throws IOException {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 1) {
            q0(3);
            this.i0 = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + j0() + H());
        }
    }

    public JsonToken j0() throws IOException {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        switch (iL) {
            case 1:
                return JsonToken.Z;
            case 2:
                return JsonToken.e0;
            case 3:
                return JsonToken.X;
            case 4:
                return JsonToken.f21327Y;
            case 5:
            case 6:
                return JsonToken.i0;
            case 7:
                return JsonToken.j0;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.g0;
            case 12:
            case 13:
            case 14:
                return JsonToken.f0;
            case 15:
            case 16:
                return JsonToken.h0;
            case 17:
                return JsonToken.k0;
            default:
                throw new AssertionError();
        }
    }

    public final void k() {
        if (this.f21326Y) {
            return;
        }
        C0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:108:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x016a  */
    /* JADX WARN: Code duplicated, block: B:115:0x017f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:116:0x0180  */
    /* JADX WARN: Code duplicated, block: B:119:0x0192  */
    /* JADX WARN: Code duplicated, block: B:122:0x0198  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a9 A[PHI: r4 r15
  0x01a9: PHI (r4v10 int) = (r4v9 int), (r4v15 int) binds: [B:118:0x0190, B:125:0x01a3] A[DONT_GENERATE, DONT_INLINE]
  0x01a9: PHI (r15v3 int) = (r15v2 int), (r15v4 int) binds: [B:118:0x0190, B:125:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0214  */
    /* JADX WARN: Code duplicated, block: B:169:0x0216  */
    /* JADX WARN: Code duplicated, block: B:181:0x0237 A[DONT_INVERT, PHI: r8
  0x0237: PHI (r8v19 int) = (r8v18 int), (r8v20 int) binds: [B:167:0x0212, B:173:0x021f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0239  */
    /* JADX WARN: Code duplicated, block: B:195:0x0256  */
    /* JADX WARN: Code duplicated, block: B:197:0x0259  */
    /* JADX WARN: Code duplicated, block: B:200:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:204:0x0267 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:205:0x0268  */
    /* JADX WARN: Code duplicated, block: B:207:0x0272  */
    /* JADX WARN: Code duplicated, block: B:209:0x0278  */
    /* JADX WARN: Code duplicated, block: B:211:0x027e  */
    /* JADX WARN: Code duplicated, block: B:213:0x0281 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x0283  */
    /* JADX WARN: Code duplicated, block: B:216:0x0287  */
    /* JADX WARN: Code duplicated, block: B:226:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:228:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:269:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x012a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0136  */
    /* JADX WARN: Code duplicated, block: B:97:0x013d  */
    public final int l() throws IOException {
        int iT;
        int i2;
        int iT2;
        char c2;
        String str;
        String str2;
        int i3;
        int length;
        int i4;
        char c3;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        char c4;
        int i9;
        int i10;
        int[] iArr = this.m0;
        int i11 = this.n0 - 1;
        int i12 = iArr[i11];
        char[] cArr = this.Z;
        if (i12 == 1) {
            iArr[i11] = 2;
        } else if (i12 == 2) {
            int iT3 = T(true);
            if (iT3 != 44) {
                if (iT3 != 59) {
                    if (iT3 == 93) {
                        this.i0 = 4;
                        return 4;
                    }
                    C0("Unterminated array");
                    throw null;
                }
                k();
            }
        } else {
            if (i12 == 3 || i12 == 5) {
                iArr[i11] = 4;
                if (i12 == 5 && (iT = T(true)) != 44) {
                    if (iT != 59) {
                        if (iT == 125) {
                            this.i0 = 2;
                            return 2;
                        }
                        C0("Unterminated object");
                        throw null;
                    }
                    k();
                }
                int iT4 = T(true);
                if (iT4 == 34) {
                    this.i0 = 13;
                    return 13;
                }
                if (iT4 == 39) {
                    k();
                    this.i0 = 12;
                    return 12;
                }
                if (iT4 == 125) {
                    if (i12 != 5) {
                        this.i0 = 2;
                        return 2;
                    }
                    C0("Expected name");
                    throw null;
                }
                k();
                this.e0--;
                if (G((char) iT4)) {
                    this.i0 = 14;
                    return 14;
                }
                C0("Expected name");
                throw null;
            }
            if (i12 != 4) {
                if (i12 == 6) {
                    if (this.f21326Y) {
                        T(true);
                        int i13 = this.e0;
                        this.e0 = i13 - 1;
                        if (i13 + 4 <= this.f0 || q(5)) {
                            int i14 = this.e0;
                            if (cArr[i14] == ')' && cArr[i14 + 1] == ']' && cArr[i14 + 2] == '}' && cArr[i14 + 3] == '\'' && cArr[i14 + 4] == '\n') {
                                this.e0 = i14 + 5;
                            }
                        }
                    }
                    this.m0[this.n0 - 1] = 7;
                } else if (i12 == 7) {
                    i2 = 0;
                    if (T(false) == -1) {
                        this.i0 = 17;
                        return 17;
                    }
                    k();
                    this.e0--;
                } else {
                    i2 = 0;
                    if (i12 == 8) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                }
                iT2 = T(true);
                if (iT2 != 34) {
                    this.i0 = 9;
                    return 9;
                }
                if (iT2 != 39) {
                    k();
                    this.i0 = 8;
                    return 8;
                }
                if (iT2 != 44 && iT2 != 59) {
                    if (iT2 != 91) {
                        this.i0 = 3;
                        return 3;
                    }
                    if (iT2 != 93) {
                        if (iT2 != 123) {
                            this.i0 = 1;
                            return 1;
                        }
                        int i15 = this.e0 - 1;
                        this.e0 = i15;
                        c2 = cArr[i15];
                        if (c2 != 't' || c2 == 'T') {
                            str = com.p004ironsource.mediationsdk.metadata.a.g;
                            str2 = "TRUE";
                            i3 = 5;
                        } else {
                            if (c2 != 'f' && c2 != 'F') {
                                if (c2 != 'n' && c2 != 'N') {
                                    i3 = i2;
                                    break;
                                }
                                str = AbstractJsonLexerKt.NULL;
                                str2 = "NULL";
                                i3 = 7;
                                if (i3 != 0) {
                                    return i3;
                                }
                                int i16 = this.e0;
                                i5 = this.f0;
                                i6 = i2;
                                i7 = i6;
                                int i17 = i7;
                                i8 = i16;
                                z2 = true;
                                long j = 0;
                                while (true) {
                                    if (i8 + i7 != i5) {
                                        c4 = cArr[i8 + i7];
                                        if (c4 != '+') {
                                            if (c4 != 'E' || c4 == 'e') {
                                                if (i6 != 2 || i6 == 4) {
                                                    i6 = 5;
                                                    i7++;
                                                }
                                            } else if (c4 == '-') {
                                                if (i6 == 0) {
                                                    i6 = 1;
                                                    i17 = 1;
                                                } else {
                                                    if (i6 != 5) {
                                                    }
                                                    i6 = 6;
                                                }
                                                i7++;
                                            } else if (c4 != '.') {
                                                if (c4 >= '0' && c4 <= '9') {
                                                    if (i6 == 1 || i6 == 0) {
                                                        j = -(c4 - '0');
                                                        i6 = 2;
                                                    } else if (i6 == 2) {
                                                        if (j != 0) {
                                                            long j2 = (10 * j) - ((long) (c4 - '0'));
                                                            z2 &= j > Buffer.OVERFLOW_ZONE || (j == Buffer.OVERFLOW_ZONE && j2 < j);
                                                            j = j2;
                                                        }
                                                    } else if (i6 == 3) {
                                                        i6 = 4;
                                                    } else if (i6 == 5 || i6 == 6) {
                                                        i6 = 7;
                                                    }
                                                    i7++;
                                                } else if (!G(c4)) {
                                                    i10 = 2;
                                                    if (i6 != 2) {
                                                        if (i6 != i10 || i6 == 4 || i6 == 7) {
                                                            this.k0 = i7;
                                                            i9 = 16;
                                                            this.i0 = 16;
                                                        }
                                                    } else if (z2 || ((j == Long.MIN_VALUE && i17 == 0) || (j == 0 && i17 != 0))) {
                                                        i10 = 2;
                                                        if (i6 != i10) {
                                                        }
                                                        this.k0 = i7;
                                                        i9 = 16;
                                                        this.i0 = 16;
                                                    } else {
                                                        if (i17 == 0) {
                                                            j = -j;
                                                        }
                                                        this.j0 = j;
                                                        this.e0 += i7;
                                                        i9 = 15;
                                                        this.i0 = 15;
                                                    }
                                                }
                                            } else if (i6 == 2) {
                                                i6 = 3;
                                                i7++;
                                            }
                                            if (i9 != 0) {
                                                return i9;
                                            }
                                            if (G(cArr[this.e0])) {
                                                C0("Expected value");
                                                throw null;
                                            }
                                            k();
                                            this.i0 = 10;
                                            return 10;
                                        }
                                        if (i6 != 5) {
                                        }
                                        i6 = 6;
                                        i7++;
                                    } else if (i7 != cArr.length) {
                                        if (q(i7 + 1)) {
                                            i8 = this.e0;
                                            i5 = this.f0;
                                            c4 = cArr[i8 + i7];
                                            if (c4 != '+') {
                                                if (c4 != 'E') {
                                                    if (i6 != 2) {
                                                    }
                                                    i6 = 5;
                                                    i7++;
                                                } else {
                                                    if (i6 != 2) {
                                                    }
                                                    i6 = 5;
                                                    i7++;
                                                }
                                                if (i9 != 0) {
                                                    return i9;
                                                }
                                                if (G(cArr[this.e0])) {
                                                    C0("Expected value");
                                                    throw null;
                                                }
                                                k();
                                                this.i0 = 10;
                                                return 10;
                                            }
                                            if (i6 != 5) {
                                            }
                                            i6 = 6;
                                            i7++;
                                        }
                                        i10 = 2;
                                        if (i6 != 2) {
                                            if (i6 != i10) {
                                            }
                                            this.k0 = i7;
                                            i9 = 16;
                                            this.i0 = 16;
                                        } else {
                                            if (z2) {
                                            }
                                            i10 = 2;
                                            if (i6 != i10) {
                                            }
                                            this.k0 = i7;
                                            i9 = 16;
                                            this.i0 = 16;
                                        }
                                        if (i9 != 0) {
                                            return i9;
                                        }
                                        if (G(cArr[this.e0])) {
                                            C0("Expected value");
                                            throw null;
                                        }
                                        k();
                                        this.i0 = 10;
                                        return 10;
                                    }
                                    i9 = 0;
                                    if (i9 != 0) {
                                        return i9;
                                    }
                                    if (G(cArr[this.e0])) {
                                        C0("Expected value");
                                        throw null;
                                    }
                                    k();
                                    this.i0 = 10;
                                    return 10;
                                }
                            }
                            str = "false";
                            str2 = "FALSE";
                            i3 = 6;
                        }
                        length = str.length();
                        i4 = 1;
                        while (true) {
                            if (i4 >= length) {
                                if ((this.e0 + length < this.f0 && !q(length + 1)) || !G(cArr[this.e0 + length])) {
                                    this.e0 += length;
                                    this.i0 = i3;
                                    break;
                                }
                                break;
                            }
                            if ((this.e0 + i4 >= this.f0 || q(i4 + 1)) && ((c3 = cArr[this.e0 + i4]) == str.charAt(i4) || c3 == str2.charAt(i4))) {
                            }
                            i3 = i2;
                            break;
                        }
                        if (i3 != 0) {
                            return i3;
                        }
                        int i18 = this.e0;
                        i5 = this.f0;
                        i6 = i2;
                        i7 = i6;
                        int i19 = i7;
                        i8 = i18;
                        z2 = true;
                        long j3 = 0;
                        while (true) {
                            if (i8 + i7 != i5) {
                                c4 = cArr[i8 + i7];
                                if (c4 != '+') {
                                    if (c4 != 'E') {
                                        if (i6 != 2) {
                                        }
                                        i6 = 5;
                                        i7++;
                                    } else {
                                        if (i6 != 2) {
                                        }
                                        i6 = 5;
                                        i7++;
                                    }
                                    if (i9 != 0) {
                                        return i9;
                                    }
                                    if (G(cArr[this.e0])) {
                                        C0("Expected value");
                                        throw null;
                                    }
                                    k();
                                    this.i0 = 10;
                                    return 10;
                                }
                                if (i6 != 5) {
                                }
                                i6 = 6;
                                i7++;
                            } else if (i7 != cArr.length) {
                                if (q(i7 + 1)) {
                                    i8 = this.e0;
                                    i5 = this.f0;
                                    c4 = cArr[i8 + i7];
                                    if (c4 != '+') {
                                        if (c4 != 'E') {
                                            if (i6 != 2) {
                                            }
                                            i6 = 5;
                                            i7++;
                                        } else {
                                            if (i6 != 2) {
                                            }
                                            i6 = 5;
                                            i7++;
                                        }
                                        if (i9 != 0) {
                                            return i9;
                                        }
                                        if (G(cArr[this.e0])) {
                                            C0("Expected value");
                                            throw null;
                                        }
                                        k();
                                        this.i0 = 10;
                                        return 10;
                                    }
                                    if (i6 != 5) {
                                    }
                                    i6 = 6;
                                    i7++;
                                }
                                i10 = 2;
                                if (i6 != 2) {
                                    if (i6 != i10) {
                                    }
                                    this.k0 = i7;
                                    i9 = 16;
                                    this.i0 = 16;
                                } else {
                                    if (z2) {
                                    }
                                    i10 = 2;
                                    if (i6 != i10) {
                                    }
                                    this.k0 = i7;
                                    i9 = 16;
                                    this.i0 = 16;
                                }
                                if (i9 != 0) {
                                    return i9;
                                }
                                if (G(cArr[this.e0])) {
                                    C0("Expected value");
                                    throw null;
                                }
                                k();
                                this.i0 = 10;
                                return 10;
                            }
                            i9 = 0;
                            if (i9 != 0) {
                                return i9;
                            }
                            if (G(cArr[this.e0])) {
                                C0("Expected value");
                                throw null;
                            }
                            k();
                            this.i0 = 10;
                            return 10;
                        }
                    }
                    if (i12 == 1) {
                        this.i0 = 4;
                        return 4;
                    }
                }
                if (i12 == 1 && i12 != 2) {
                    C0("Unexpected value");
                    throw null;
                }
                k();
                this.e0--;
                this.i0 = 7;
                return 7;
            }
            iArr[i11] = 5;
            int iT5 = T(true);
            if (iT5 != 58) {
                if (iT5 != 61) {
                    C0("Expected ':'");
                    throw null;
                }
                k();
                if (this.e0 < this.f0 || q(1)) {
                    int i20 = this.e0;
                    if (cArr[i20] == '>') {
                        this.e0 = i20 + 1;
                    }
                }
            }
        }
        i2 = 0;
        iT2 = T(true);
        if (iT2 != 34) {
            this.i0 = 9;
            return 9;
        }
        if (iT2 != 39) {
            k();
            this.i0 = 8;
            return 8;
        }
        if (iT2 != 44) {
            if (iT2 != 91) {
                this.i0 = 3;
                return 3;
            }
            if (iT2 != 93) {
                if (iT2 != 123) {
                    this.i0 = 1;
                    return 1;
                }
                int i110 = this.e0 - 1;
                this.e0 = i110;
                c2 = cArr[i110];
                if (c2 != 't') {
                    str = com.p004ironsource.mediationsdk.metadata.a.g;
                    str2 = "TRUE";
                    i3 = 5;
                    length = str.length();
                    i4 = 1;
                    while (true) {
                        if (i4 >= length) {
                            if (this.e0 + length < this.f0) {
                            }
                            this.e0 += length;
                            this.i0 = i3;
                            break;
                        }
                        i4 = this.e0 + i4 >= this.f0 ? i4 + 1 : i4 + 1;
                    }
                    if (i3 != 0) {
                        return i3;
                    }
                    int i111 = this.e0;
                    i5 = this.f0;
                    i6 = i2;
                    i7 = i6;
                    int i112 = i7;
                    i8 = i111;
                    z2 = true;
                    long j4 = 0;
                    while (true) {
                        if (i8 + i7 != i5) {
                            c4 = cArr[i8 + i7];
                            if (c4 != '+') {
                                if (c4 != 'E') {
                                    if (i6 != 2) {
                                    }
                                    i6 = 5;
                                    i7++;
                                } else {
                                    if (i6 != 2) {
                                    }
                                    i6 = 5;
                                    i7++;
                                }
                                if (i9 != 0) {
                                    return i9;
                                }
                                if (G(cArr[this.e0])) {
                                    C0("Expected value");
                                    throw null;
                                }
                                k();
                                this.i0 = 10;
                                return 10;
                            }
                            if (i6 != 5) {
                            }
                            i6 = 6;
                            i7++;
                        } else if (i7 != cArr.length) {
                            if (q(i7 + 1)) {
                                i8 = this.e0;
                                i5 = this.f0;
                                c4 = cArr[i8 + i7];
                                if (c4 != '+') {
                                    if (c4 != 'E') {
                                        if (i6 != 2) {
                                        }
                                        i6 = 5;
                                        i7++;
                                    } else {
                                        if (i6 != 2) {
                                        }
                                        i6 = 5;
                                        i7++;
                                    }
                                    if (i9 != 0) {
                                        return i9;
                                    }
                                    if (G(cArr[this.e0])) {
                                        C0("Expected value");
                                        throw null;
                                    }
                                    k();
                                    this.i0 = 10;
                                    return 10;
                                }
                                if (i6 != 5) {
                                }
                                i6 = 6;
                                i7++;
                            }
                            i10 = 2;
                            if (i6 != 2) {
                                if (i6 != i10) {
                                }
                                this.k0 = i7;
                                i9 = 16;
                                this.i0 = 16;
                            } else {
                                if (z2) {
                                }
                                i10 = 2;
                                if (i6 != i10) {
                                }
                                this.k0 = i7;
                                i9 = 16;
                                this.i0 = 16;
                            }
                            if (i9 != 0) {
                                return i9;
                            }
                            if (G(cArr[this.e0])) {
                                C0("Expected value");
                                throw null;
                            }
                            k();
                            this.i0 = 10;
                            return 10;
                        }
                        i9 = 0;
                        if (i9 != 0) {
                            return i9;
                        }
                        if (G(cArr[this.e0])) {
                            C0("Expected value");
                            throw null;
                        }
                        k();
                        this.i0 = 10;
                        return 10;
                    }
                }
                str = com.p004ironsource.mediationsdk.metadata.a.g;
                str2 = "TRUE";
                i3 = 5;
                length = str.length();
                i4 = 1;
                while (true) {
                    if (i4 >= length) {
                        if (this.e0 + length < this.f0) {
                        }
                        this.e0 += length;
                        this.i0 = i3;
                        break;
                    }
                    if (this.e0 + i4 >= this.f0) {
                    }
                }
                if (i3 != 0) {
                    return i3;
                }
                int i113 = this.e0;
                i5 = this.f0;
                i6 = i2;
                i7 = i6;
                int i114 = i7;
                i8 = i113;
                z2 = true;
                long j5 = 0;
                while (true) {
                    if (i8 + i7 != i5) {
                        c4 = cArr[i8 + i7];
                        if (c4 != '+') {
                            if (c4 != 'E') {
                                if (i6 != 2) {
                                }
                                i6 = 5;
                                i7++;
                            } else {
                                if (i6 != 2) {
                                }
                                i6 = 5;
                                i7++;
                            }
                            if (i9 != 0) {
                                return i9;
                            }
                            if (G(cArr[this.e0])) {
                                C0("Expected value");
                                throw null;
                            }
                            k();
                            this.i0 = 10;
                            return 10;
                        }
                        if (i6 != 5) {
                        }
                        i6 = 6;
                        i7++;
                    } else if (i7 != cArr.length) {
                        if (q(i7 + 1)) {
                            i8 = this.e0;
                            i5 = this.f0;
                            c4 = cArr[i8 + i7];
                            if (c4 != '+') {
                                if (c4 != 'E') {
                                    if (i6 != 2) {
                                    }
                                    i6 = 5;
                                    i7++;
                                } else {
                                    if (i6 != 2) {
                                    }
                                    i6 = 5;
                                    i7++;
                                }
                                if (i9 != 0) {
                                    return i9;
                                }
                                if (G(cArr[this.e0])) {
                                    C0("Expected value");
                                    throw null;
                                }
                                k();
                                this.i0 = 10;
                                return 10;
                            }
                            if (i6 != 5) {
                            }
                            i6 = 6;
                            i7++;
                        }
                        i10 = 2;
                        if (i6 != 2) {
                            if (i6 != i10) {
                            }
                            this.k0 = i7;
                            i9 = 16;
                            this.i0 = 16;
                        } else {
                            if (z2) {
                            }
                            i10 = 2;
                            if (i6 != i10) {
                            }
                            this.k0 = i7;
                            i9 = 16;
                            this.i0 = 16;
                        }
                        if (i9 != 0) {
                            return i9;
                        }
                        if (G(cArr[this.e0])) {
                            C0("Expected value");
                            throw null;
                        }
                        k();
                        this.i0 = 10;
                        return 10;
                    }
                    i9 = 0;
                    if (i9 != 0) {
                        return i9;
                    }
                    if (G(cArr[this.e0])) {
                        C0("Expected value");
                        throw null;
                    }
                    k();
                    this.i0 = 10;
                    return 10;
                }
                i3 = i2;
                if (i3 != 0) {
                    return i3;
                }
                int i115 = this.e0;
                i5 = this.f0;
                i6 = i2;
                i7 = i6;
                int i116 = i7;
                i8 = i115;
                z2 = true;
                long j6 = 0;
                while (true) {
                    if (i8 + i7 != i5) {
                        c4 = cArr[i8 + i7];
                        if (c4 != '+') {
                            if (c4 != 'E') {
                                if (i6 != 2) {
                                }
                                i6 = 5;
                                i7++;
                            } else {
                                if (i6 != 2) {
                                }
                                i6 = 5;
                                i7++;
                            }
                            if (i9 != 0) {
                                return i9;
                            }
                            if (G(cArr[this.e0])) {
                                C0("Expected value");
                                throw null;
                            }
                            k();
                            this.i0 = 10;
                            return 10;
                        }
                        if (i6 != 5) {
                        }
                        i6 = 6;
                        i7++;
                    } else if (i7 != cArr.length) {
                        if (q(i7 + 1)) {
                            i8 = this.e0;
                            i5 = this.f0;
                            c4 = cArr[i8 + i7];
                            if (c4 != '+') {
                                if (c4 != 'E') {
                                    if (i6 != 2) {
                                    }
                                    i6 = 5;
                                    i7++;
                                } else {
                                    if (i6 != 2) {
                                    }
                                    i6 = 5;
                                    i7++;
                                }
                                if (i9 != 0) {
                                    return i9;
                                }
                                if (G(cArr[this.e0])) {
                                    C0("Expected value");
                                    throw null;
                                }
                                k();
                                this.i0 = 10;
                                return 10;
                            }
                            if (i6 != 5) {
                            }
                            i6 = 6;
                            i7++;
                        }
                        i10 = 2;
                        if (i6 != 2) {
                            if (i6 != i10) {
                            }
                            this.k0 = i7;
                            i9 = 16;
                            this.i0 = 16;
                        } else {
                            if (z2) {
                            }
                            i10 = 2;
                            if (i6 != i10) {
                            }
                            this.k0 = i7;
                            i9 = 16;
                            this.i0 = 16;
                        }
                        if (i9 != 0) {
                            return i9;
                        }
                        if (G(cArr[this.e0])) {
                            C0("Expected value");
                            throw null;
                        }
                        k();
                        this.i0 = 10;
                        return 10;
                    }
                    i9 = 0;
                    if (i9 != 0) {
                        return i9;
                    }
                    if (G(cArr[this.e0])) {
                        C0("Expected value");
                        throw null;
                    }
                    k();
                    this.i0 = 10;
                    return 10;
                }
            }
            if (i12 == 1) {
                this.i0 = 4;
                return 4;
            }
        }
        if (i12 == 1) {
        }
        k();
        this.e0--;
        this.i0 = 7;
        return 7;
    }

    public void m() throws IOException {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + j0() + H());
        }
        int i2 = this.n0;
        this.n0 = i2 - 1;
        int[] iArr = this.p0;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.i0 = 0;
    }

    public void p() throws IOException {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + j0() + H());
        }
        int i2 = this.n0;
        int i3 = i2 - 1;
        this.n0 = i3;
        this.o0[i3] = null;
        int[] iArr = this.p0;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.i0 = 0;
    }

    public final boolean q(int i2) throws IOException {
        int i3;
        int i4;
        int i5 = this.h0;
        int i6 = this.e0;
        this.h0 = i5 - i6;
        int i7 = this.f0;
        char[] cArr = this.Z;
        if (i7 != i6) {
            int i8 = i7 - i6;
            this.f0 = i8;
            System.arraycopy(cArr, i6, cArr, 0, i8);
        } else {
            this.f0 = 0;
        }
        this.e0 = 0;
        do {
            int i9 = this.f0;
            int i10 = this.X.read(cArr, i9, cArr.length - i9);
            if (i10 == -1) {
                return false;
            }
            i3 = this.f0 + i10;
            this.f0 = i3;
            if (this.g0 == 0 && (i4 = this.h0) == 0 && i3 > 0 && cArr[0] == 65279) {
                this.e0++;
                this.h0 = i4 + 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    public final void q0(int i2) {
        int i3 = this.n0;
        int[] iArr = this.m0;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.m0 = Arrays.copyOf(iArr, i4);
            this.p0 = Arrays.copyOf(this.p0, i4);
            this.o0 = (String[]) Arrays.copyOf(this.o0, i4);
        }
        int[] iArr2 = this.m0;
        int i5 = this.n0;
        this.n0 = i5 + 1;
        iArr2[i5] = i2;
    }

    public final String r(boolean z2) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.n0;
            if (i2 >= i3) {
                return sb.toString();
            }
            int i4 = this.m0[i2];
            if (i4 == 1 || i4 == 2) {
                int i5 = this.p0[i2];
                if (z2 && i5 > 0 && i2 == i3 - 1) {
                    i5--;
                }
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(i5);
                sb.append(AbstractJsonLexerKt.END_LIST);
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = this.o0[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
            i2++;
        }
    }

    public String s() {
        return r(true);
    }

    public final char s0() throws IOException {
        int i2;
        if (this.e0 == this.f0 && !q(1)) {
            C0("Unterminated escape sequence");
            throw null;
        }
        int i3 = this.e0;
        int i4 = i3 + 1;
        this.e0 = i4;
        char[] cArr = this.Z;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.g0++;
            this.h0 = i4;
            return c2;
        }
        if (c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\') {
            return c2;
        }
        if (c2 == 'b') {
            return '\b';
        }
        if (c2 == 'f') {
            return '\f';
        }
        if (c2 == 'n') {
            return '\n';
        }
        if (c2 == 'r') {
            return '\r';
        }
        if (c2 == 't') {
            return '\t';
        }
        if (c2 != 'u') {
            C0("Invalid escape sequence");
            throw null;
        }
        if (i3 + 5 > this.f0 && !q(4)) {
            C0("Unterminated escape sequence");
            throw null;
        }
        int i5 = this.e0;
        int i6 = i5 + 4;
        char c3 = 0;
        while (i5 < i6) {
            char c4 = cArr[i5];
            char c5 = (char) (c3 << 4);
            if (c4 >= '0' && c4 <= '9') {
                i2 = c4 - '0';
            } else if (c4 >= 'a' && c4 <= 'f') {
                i2 = c4 - 'W';
            } else {
                if (c4 < 'A' || c4 > 'F') {
                    throw new NumberFormatException("\\u".concat(new String(cArr, this.e0, 4)));
                }
                i2 = c4 - '7';
            }
            c3 = (char) (i2 + c5);
            i5++;
        }
        this.e0 += 4;
        return c3;
    }

    public boolean t() throws IOException {
        int iL = this.i0;
        if (iL == 0) {
            iL = l();
        }
        return (iL == 2 || iL == 4 || iL == 17) ? false : true;
    }

    public final void t0(char c2) throws IOException {
        do {
            int i2 = this.e0;
            int i3 = this.f0;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = this.Z[i2];
                if (c3 == c2) {
                    this.e0 = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.e0 = i4;
                    s0();
                    i2 = this.e0;
                    i3 = this.f0;
                } else {
                    if (c3 == '\n') {
                        this.g0++;
                        this.h0 = i4;
                    }
                    i2 = i4;
                }
            }
            this.e0 = i2;
        } while (q(1));
        C0("Unterminated string");
        throw null;
    }

    public String toString() {
        return getClass().getSimpleName() + H();
    }

    public String u() {
        return r(false);
    }

    public final void u0() {
        char c2;
        do {
            if (this.e0 >= this.f0 && !q(1)) {
                return;
            }
            int i2 = this.e0;
            int i3 = i2 + 1;
            this.e0 = i3;
            c2 = this.Z[i2];
            if (c2 == '\n') {
                this.g0++;
                this.h0 = i3;
                return;
            }
        } while (c2 != '\r');
    }

    public final void w0() {
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.e0;
                if (i3 + i2 < this.f0) {
                    char c2 = this.Z[i3 + i2];
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
                                                    i2++;
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
                    this.e0 += i2;
                    return;
                }
                this.e0 = i3 + i2;
            }
        } while (q(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void z0() throws IOException {
        int i2 = 0;
        do {
            int iL = this.i0;
            if (iL == 0) {
                iL = l();
            }
            switch (iL) {
                case 1:
                    q0(3);
                    i2++;
                    this.i0 = 0;
                    break;
                case 2:
                    if (i2 == 0) {
                        this.o0[this.n0 - 1] = null;
                    }
                    this.n0--;
                    i2--;
                    this.i0 = 0;
                    break;
                case 3:
                    q0(1);
                    i2++;
                    this.i0 = 0;
                    break;
                case 4:
                    this.n0--;
                    i2--;
                    this.i0 = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.i0 = 0;
                    break;
                case 8:
                    t0('\'');
                    this.i0 = 0;
                    break;
                case 9:
                    t0(AbstractJsonLexerKt.STRING);
                    this.i0 = 0;
                    break;
                case 10:
                    w0();
                    this.i0 = 0;
                    break;
                case 12:
                    t0('\'');
                    if (i2 == 0) {
                        this.o0[this.n0 - 1] = "<skipped>";
                    }
                    this.i0 = 0;
                    break;
                case 13:
                    t0(AbstractJsonLexerKt.STRING);
                    if (i2 == 0) {
                        this.o0[this.n0 - 1] = "<skipped>";
                    }
                    this.i0 = 0;
                    break;
                case 14:
                    w0();
                    if (i2 == 0) {
                        this.o0[this.n0 - 1] = "<skipped>";
                    }
                    this.i0 = 0;
                    break;
                case 16:
                    this.e0 += this.k0;
                    this.i0 = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i2 > 0);
        int[] iArr = this.p0;
        int i3 = this.n0 - 1;
        iArr[i3] = iArr[i3] + 1;
    }
}
