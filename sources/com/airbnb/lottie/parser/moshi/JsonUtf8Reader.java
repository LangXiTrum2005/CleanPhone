package com.airbnb.lottie.parser.moshi;

import com.p004ironsource.mediationsdk.metadata.a;
import com.thinkup.core.common.n.mo;
import java.io.EOFException;
import kotlin.text.Charsets;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer;
import okio.ByteString;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes.dex */
final class JsonUtf8Reader extends JsonReader {
    public static final ByteString m0;
    public static final ByteString n0;
    public static final ByteString o0;
    public final RealBufferedSource g0;
    public final Buffer h0;
    public int i0;
    public long j0;
    public int k0;
    public String l0;

    static {
        ByteString byteString = ByteString.e0;
        m0 = ByteString.Companion.c("'\\");
        n0 = ByteString.Companion.c("\"\\");
        o0 = ByteString.Companion.c("{}[]:, \n\t\r\f/\\;#=");
        ByteString.Companion.c("\n\r");
        ByteString.Companion.c("*/");
    }

    public JsonUtf8Reader(RealBufferedSource realBufferedSource) {
        this.f9934Y = new int[32];
        this.Z = new String[32];
        this.e0 = new int[32];
        this.i0 = 0;
        this.g0 = realBufferedSource;
        this.h0 = realBufferedSource.f45156Y;
        I(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final JsonReader.Token H() throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        switch (iU) {
            case 1:
                return JsonReader.Token.Z;
            case 2:
                return JsonReader.Token.e0;
            case 3:
                return JsonReader.Token.X;
            case 4:
                return JsonReader.Token.f9937Y;
            case 5:
            case 6:
                return JsonReader.Token.i0;
            case 7:
                return JsonReader.Token.j0;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.g0;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.f0;
            case 16:
            case 17:
                return JsonReader.Token.h0;
            case 18:
                return JsonReader.Token.k0;
            default:
                throw new AssertionError();
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int J(JsonReader.Options options) throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU < 12 || iU > 15) {
            return -1;
        }
        if (iU == 15) {
            return Y(this.l0, options);
        }
        int iS0 = this.g0.S0(options.f9936b);
        if (iS0 != -1) {
            this.i0 = 0;
            this.Z[this.X - 1] = options.f9935a[iS0];
            return iS0;
        }
        String str = this.Z[this.X - 1];
        String strS = s();
        int iY = Y(strS, options);
        if (iY == -1) {
            this.i0 = 15;
            this.l0 = strS;
            this.Z[this.X - 1] = str;
        }
        return iY;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void K() throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU == 14) {
            long jA = this.g0.a(o0);
            Buffer buffer = this.h0;
            if (jA == -1) {
                jA = buffer.f45132Y;
            }
            buffer.skip(jA);
        } else if (iU == 13) {
            t0(n0);
        } else if (iU == 12) {
            t0(m0);
        } else if (iU != 15) {
            throw new JsonDataException("Expected a name but was " + H() + " at path " + u());
        }
        this.i0 = 0;
        this.Z[this.X - 1] = AbstractJsonLexerKt.NULL;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void P() throws JsonEncodingException, EOFException {
        int i2 = 0;
        do {
            int iU = this.i0;
            if (iU == 0) {
                iU = U();
            }
            if (iU == 3) {
                I(1);
            } else {
                if (iU == 1) {
                    I(3);
                } else if (iU == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new JsonDataException("Expected a value but was " + H() + " at path " + u());
                    }
                    this.X--;
                } else if (iU == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new JsonDataException("Expected a value but was " + H() + " at path " + u());
                    }
                    this.X--;
                } else {
                    Buffer buffer = this.h0;
                    if (iU == 14 || iU == 10) {
                        long jA = this.g0.a(o0);
                        if (jA == -1) {
                            jA = buffer.f45132Y;
                        }
                        buffer.skip(jA);
                    } else if (iU == 9 || iU == 13) {
                        t0(n0);
                    } else if (iU == 8 || iU == 12) {
                        t0(m0);
                    } else if (iU == 17) {
                        buffer.skip(this.k0);
                    } else if (iU == 18) {
                        throw new JsonDataException("Expected a value but was " + H() + " at path " + u());
                    }
                }
                this.i0 = 0;
            }
            i2++;
            this.i0 = 0;
        } while (i2 != 0);
        int[] iArr = this.e0;
        int i3 = this.X - 1;
        iArr[i3] = iArr[i3] + 1;
        this.Z[i3] = AbstractJsonLexerKt.NULL;
    }

    public final void T() throws JsonEncodingException {
        S("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:164:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:167:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:172:0x01ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:175:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:177:0x0200  */
    /* JADX WARN: Code duplicated, block: B:230:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:92:0x0127  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130  */
    public final int U() throws JsonEncodingException, EOFException {
        int i2;
        String str;
        String str2;
        long j;
        char cR;
        char c2;
        int i3;
        int i4;
        int i5;
        byte bR;
        char c3;
        int[] iArr = this.f9934Y;
        int i6 = this.X - 1;
        int i7 = iArr[i6];
        Buffer buffer = this.h0;
        if (i7 == 1) {
            iArr[i6] = 2;
        } else if (i7 == 2) {
            int iE0 = e0(true);
            buffer.readByte();
            if (iE0 != 44) {
                if (iE0 == 59) {
                    T();
                    throw null;
                }
                if (iE0 == 93) {
                    this.i0 = 4;
                    return 4;
                }
                S("Unterminated array");
                throw null;
            }
        } else {
            if (i7 == 3 || i7 == 5) {
                iArr[i6] = 4;
                if (i7 == 5) {
                    int iE1 = e0(true);
                    buffer.readByte();
                    if (iE1 != 44) {
                        if (iE1 == 59) {
                            T();
                            throw null;
                        }
                        if (iE1 == 125) {
                            this.i0 = 2;
                            return 2;
                        }
                        S("Unterminated object");
                        throw null;
                    }
                }
                int iE2 = e0(true);
                if (iE2 == 34) {
                    buffer.readByte();
                    this.i0 = 13;
                    return 13;
                }
                if (iE2 == 39) {
                    buffer.readByte();
                    T();
                    throw null;
                }
                if (iE2 != 125) {
                    T();
                    throw null;
                }
                if (i7 == 5) {
                    S("Expected name");
                    throw null;
                }
                buffer.readByte();
                this.i0 = 2;
                return 2;
            }
            if (i7 == 4) {
                iArr[i6] = 5;
                int iE3 = e0(true);
                buffer.readByte();
                if (iE3 != 58) {
                    if (iE3 != 61) {
                        S("Expected ':'");
                        throw null;
                    }
                    T();
                    throw null;
                }
            } else if (i7 == 6) {
                iArr[i6] = 7;
            } else {
                if (i7 == 7) {
                    if (e0(false) == -1) {
                        this.i0 = 18;
                        return 18;
                    }
                    T();
                    throw null;
                }
                if (i7 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iE4 = e0(true);
        if (iE4 == 34) {
            buffer.readByte();
            this.i0 = 9;
            return 9;
        }
        if (iE4 == 39) {
            T();
            throw null;
        }
        if (iE4 != 44 && iE4 != 59) {
            if (iE4 == 91) {
                buffer.readByte();
                this.i0 = 3;
                return 3;
            }
            if (iE4 != 93) {
                if (iE4 == 123) {
                    buffer.readByte();
                    this.i0 = 1;
                    return 1;
                }
                byte bR2 = buffer.r(0L);
                RealBufferedSource realBufferedSource = this.g0;
                if (bR2 == 116 || bR2 == 84) {
                    i2 = 5;
                    str2 = a.g;
                    str = "TRUE";
                } else {
                    if (bR2 != 102 && bR2 != 70) {
                        if (bR2 == 110 || bR2 == 78) {
                            i2 = 7;
                            str2 = AbstractJsonLexerKt.NULL;
                            str = "NULL";
                        } else {
                            j = 0;
                            i2 = 0;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        boolean z2 = true;
                        long j2 = j;
                        c2 = 0;
                        i3 = 0;
                        boolean z3 = false;
                        while (true) {
                            i4 = i3 + 1;
                            if (realBufferedSource.request(i4)) {
                                bR = buffer.r(i3);
                                if (bR != 43) {
                                    if (bR != 69 || bR == 101) {
                                        c3 = 6;
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = 0;
                                        }
                                    } else if (bR == 45) {
                                        c3 = 6;
                                        if (c2 == 0) {
                                            c2 = 1;
                                            z3 = true;
                                        } else {
                                            if (c2 != 5) {
                                                i5 = 0;
                                            }
                                            c2 = c3;
                                        }
                                        i3 = i4;
                                    } else if (bR != 46) {
                                        if (bR >= 48 && bR <= 57) {
                                            if (c2 == 1 || c2 == 0) {
                                                c3 = 6;
                                                j2 = -(bR - 48);
                                                c2 = 2;
                                            } else {
                                                if (c2 == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (bR - 48));
                                                        z2 &= j2 > com.applovin.shadow.okio.internal.Buffer.OVERFLOW_ZONE || (j2 == com.applovin.shadow.okio.internal.Buffer.OVERFLOW_ZONE && j3 < j2);
                                                        j2 = j3;
                                                    }
                                                } else if (c2 == 3) {
                                                    c2 = 4;
                                                } else {
                                                    c3 = 6;
                                                    if (c2 == 5 || c2 == 6) {
                                                        c2 = 7;
                                                    }
                                                }
                                                c3 = 6;
                                                i3 = i4;
                                            }
                                            i3 = i4;
                                        } else if (!c0(bR)) {
                                        }
                                        i5 = 0;
                                    } else {
                                        c3 = 6;
                                        if (c2 == 2) {
                                            c2 = 3;
                                            i3 = i4;
                                        } else {
                                            i5 = 0;
                                        }
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (c0(buffer.r(j))) {
                                        T();
                                        throw null;
                                    }
                                    S("Expected value");
                                    throw null;
                                }
                                c3 = 6;
                                if (c2 != 5) {
                                    i5 = 0;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (c0(buffer.r(j))) {
                                        S("Expected value");
                                        throw null;
                                    }
                                    T();
                                    throw null;
                                }
                                c2 = c3;
                                i3 = i4;
                            }
                            if (c2 != 2 && z2 && ((j2 != Long.MIN_VALUE || z3) && (j2 != j || !z3))) {
                                if (!z3) {
                                    j2 = -j2;
                                }
                                this.j0 = j2;
                                buffer.skip(i3);
                                i5 = 16;
                                this.i0 = 16;
                            } else if (c2 != 2 || c2 == 4 || c2 == 7) {
                                this.k0 = i3;
                                i5 = 17;
                                this.i0 = 17;
                            } else {
                                i5 = 0;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (c0(buffer.r(j))) {
                                S("Expected value");
                                throw null;
                            }
                            T();
                            throw null;
                        }
                    }
                    i2 = 6;
                    str2 = "false";
                    str = "FALSE";
                }
                int length = str2.length();
                j = 0;
                int i8 = 1;
                while (true) {
                    if (i8 >= length) {
                        if (!realBufferedSource.request(length + 1) || !c0(buffer.r(length))) {
                            buffer.skip(length);
                            this.i0 = i2;
                            break;
                        }
                    } else {
                        int i9 = i8 + 1;
                        if (realBufferedSource.request(i9) && ((cR = buffer.r(i8)) == str2.charAt(i8) || cR == str.charAt(i8))) {
                            i8 = i9;
                        }
                    }
                    i2 = 0;
                    break;
                }
                if (i2 != 0) {
                    return i2;
                }
                boolean z4 = true;
                long j4 = j;
                c2 = 0;
                i3 = 0;
                boolean z5 = false;
                while (true) {
                    i4 = i3 + 1;
                    if (realBufferedSource.request(i4)) {
                        bR = buffer.r(i3);
                        if (bR != 43) {
                            if (bR != 69) {
                                c3 = 6;
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i3 = i4;
                            } else {
                                c3 = 6;
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (c0(buffer.r(j))) {
                                S("Expected value");
                                throw null;
                            }
                            T();
                            throw null;
                        }
                        c3 = 6;
                        if (c2 != 5) {
                            i5 = 0;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (c0(buffer.r(j))) {
                                S("Expected value");
                                throw null;
                            }
                            T();
                            throw null;
                        }
                        c2 = c3;
                        i3 = i4;
                    }
                    if (c2 != 2) {
                        if (c2 != 2) {
                        }
                        this.k0 = i3;
                        i5 = 17;
                        this.i0 = 17;
                    } else {
                        if (c2 != 2) {
                        }
                        this.k0 = i3;
                        i5 = 17;
                        this.i0 = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (c0(buffer.r(j))) {
                        S("Expected value");
                        throw null;
                    }
                    T();
                    throw null;
                }
            }
            if (i7 == 1) {
                buffer.readByte();
                this.i0 = 4;
                return 4;
            }
        }
        if (i7 == 1 || i7 == 2) {
            T();
            throw null;
        }
        S("Unexpected value");
        throw null;
    }

    public final int Y(String str, JsonReader.Options options) {
        int length = options.f9935a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(options.f9935a[i2])) {
                this.i0 = 0;
                this.Z[this.X - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    public final boolean c0(int i2) throws JsonEncodingException {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
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
        T();
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.i0 = 0;
        this.f9934Y[0] = 8;
        this.X = 1;
        this.h0.k();
        this.g0.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void d() throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU == 3) {
            I(1);
            this.e0[this.X - 1] = 0;
            this.i0 = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + H() + " at path " + u());
        }
    }

    public final int e0(boolean z2) throws JsonEncodingException, EOFException {
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            RealBufferedSource realBufferedSource = this.g0;
            if (!realBufferedSource.request(i3)) {
                if (z2) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i2;
            Buffer buffer = this.h0;
            byte bR = buffer.r(j);
            if (bR != 10 && bR != 32 && bR != 13 && bR != 9) {
                buffer.skip(j);
                if (bR == 47) {
                    if (realBufferedSource.request(2L)) {
                        T();
                        throw null;
                    }
                } else if (bR == 35) {
                    T();
                    throw null;
                }
                return bR;
            }
            i2 = i3;
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void h() throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU == 1) {
            I(3);
            this.i0 = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + H() + " at path " + u());
        }
    }

    public final String j0(ByteString byteString) throws JsonEncodingException, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jA = this.g0.a(byteString);
            if (jA == -1) {
                S("Unterminated string");
                throw null;
            }
            Buffer buffer = this.h0;
            if (buffer.r(jA) != 92) {
                if (sb == null) {
                    String string = buffer.readString(jA, Charsets.f44691a);
                    buffer.readByte();
                    return string;
                }
                sb.append(buffer.readString(jA, Charsets.f44691a));
                buffer.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(buffer.readString(jA, Charsets.f44691a));
            buffer.readByte();
            sb.append(s0());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void k() throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + H() + " at path " + u());
        }
        int i2 = this.X;
        this.X = i2 - 1;
        int[] iArr = this.e0;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.i0 = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final void l() throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + H() + " at path " + u());
        }
        int i2 = this.X;
        int i3 = i2 - 1;
        this.X = i3;
        this.Z[i3] = null;
        int[] iArr = this.e0;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.i0 = 0;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean m() throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        return (iU == 2 || iU == 4 || iU == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final boolean p() throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU == 5) {
            this.i0 = 0;
            int[] iArr = this.e0;
            int i2 = this.X - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iU == 6) {
            this.i0 = 0;
            int[] iArr2 = this.e0;
            int i3 = this.X - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + H() + " at path " + u());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final double q() throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU == 16) {
            this.i0 = 0;
            int[] iArr = this.e0;
            int i2 = this.X - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j0;
        }
        if (iU == 17) {
            long j = this.k0;
            Buffer buffer = this.h0;
            buffer.getClass();
            this.l0 = buffer.readString(j, Charsets.f44691a);
        } else if (iU == 9) {
            this.l0 = j0(n0);
        } else if (iU == 8) {
            this.l0 = j0(m0);
        } else if (iU == 10) {
            this.l0 = q0();
        } else if (iU != 11) {
            throw new JsonDataException("Expected a double but was " + H() + " at path " + u());
        }
        this.i0 = 11;
        try {
            double d = Double.parseDouble(this.l0);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + u());
            }
            this.l0 = null;
            this.i0 = 0;
            int[] iArr2 = this.e0;
            int i3 = this.X - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.l0 + " at path " + u());
        }
    }

    public final String q0() {
        long jA = this.g0.a(o0);
        Buffer buffer = this.h0;
        if (jA == -1) {
            return buffer.readUtf8();
        }
        buffer.getClass();
        return buffer.readString(jA, Charsets.f44691a);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final int r() throws JsonEncodingException, EOFException {
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU == 16) {
            long j = this.j0;
            int i2 = (int) j;
            if (j == i2) {
                this.i0 = 0;
                int[] iArr = this.e0;
                int i3 = this.X - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new JsonDataException("Expected an int but was " + this.j0 + " at path " + u());
        }
        if (iU == 17) {
            long j2 = this.k0;
            Buffer buffer = this.h0;
            buffer.getClass();
            this.l0 = buffer.readString(j2, Charsets.f44691a);
        } else if (iU == 9 || iU == 8) {
            String strJ0 = iU == 9 ? j0(n0) : j0(m0);
            this.l0 = strJ0;
            try {
                int i4 = Integer.parseInt(strJ0);
                this.i0 = 0;
                int[] iArr2 = this.e0;
                int i5 = this.X - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        } else if (iU != 11) {
            throw new JsonDataException("Expected an int but was " + H() + " at path " + u());
        }
        this.i0 = 11;
        try {
            double d = Double.parseDouble(this.l0);
            int i6 = (int) d;
            if (i6 != d) {
                throw new JsonDataException("Expected an int but was " + this.l0 + " at path " + u());
            }
            this.l0 = null;
            this.i0 = 0;
            int[] iArr3 = this.e0;
            int i7 = this.X - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.l0 + " at path " + u());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String s() throws JsonEncodingException, EOFException {
        String strJ0;
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU == 14) {
            strJ0 = q0();
        } else if (iU == 13) {
            strJ0 = j0(n0);
        } else if (iU == 12) {
            strJ0 = j0(m0);
        } else {
            if (iU != 15) {
                throw new JsonDataException("Expected a name but was " + H() + " at path " + u());
            }
            strJ0 = this.l0;
        }
        this.i0 = 0;
        this.Z[this.X - 1] = strJ0;
        return strJ0;
    }

    public final char s0() throws JsonEncodingException, EOFException {
        int i2;
        RealBufferedSource realBufferedSource = this.g0;
        if (!realBufferedSource.request(1L)) {
            S("Unterminated escape sequence");
            throw null;
        }
        Buffer buffer = this.h0;
        byte b2 = buffer.readByte();
        if (b2 == 10 || b2 == 34 || b2 == 39 || b2 == 47 || b2 == 92) {
            return (char) b2;
        }
        if (b2 == 98) {
            return '\b';
        }
        if (b2 == 102) {
            return '\f';
        }
        if (b2 == 110) {
            return '\n';
        }
        if (b2 == 114) {
            return '\r';
        }
        if (b2 == 116) {
            return '\t';
        }
        if (b2 != 117) {
            S("Invalid escape sequence: \\" + ((char) b2));
            throw null;
        }
        if (!realBufferedSource.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + u());
        }
        char c2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bR = buffer.r(i3);
            char c3 = (char) (c2 << 4);
            if (bR >= 48 && bR <= 57) {
                i2 = bR - 48;
            } else if (bR >= 97 && bR <= 102) {
                i2 = bR - 87;
            } else {
                if (bR < 65 || bR > 70) {
                    S("\\u".concat(buffer.readString(4L, Charsets.f44691a)));
                    throw null;
                }
                i2 = bR - 55;
            }
            c2 = (char) (i2 + c3);
        }
        buffer.skip(4L);
        return c2;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public final String t() throws JsonEncodingException, EOFException {
        String string;
        int iU = this.i0;
        if (iU == 0) {
            iU = U();
        }
        if (iU == 10) {
            string = q0();
        } else if (iU == 9) {
            string = j0(n0);
        } else if (iU == 8) {
            string = j0(m0);
        } else if (iU == 11) {
            string = this.l0;
            this.l0 = null;
        } else if (iU == 16) {
            string = Long.toString(this.j0);
        } else {
            if (iU != 17) {
                throw new JsonDataException("Expected a string but was " + H() + " at path " + u());
            }
            long j = this.k0;
            Buffer buffer = this.h0;
            buffer.getClass();
            string = buffer.readString(j, Charsets.f44691a);
        }
        this.i0 = 0;
        int[] iArr = this.e0;
        int i2 = this.X - 1;
        iArr[i2] = iArr[i2] + 1;
        return string;
    }

    public final void t0(ByteString byteString) throws JsonEncodingException, EOFException {
        while (true) {
            long jA = this.g0.a(byteString);
            if (jA == -1) {
                S("Unterminated string");
                throw null;
            }
            Buffer buffer = this.h0;
            if (buffer.r(jA) != 92) {
                buffer.skip(jA + 1);
                return;
            } else {
                buffer.skip(jA + 1);
                s0();
            }
        }
    }

    public final String toString() {
        return "JsonReader(" + this.g0 + ")";
    }
}
