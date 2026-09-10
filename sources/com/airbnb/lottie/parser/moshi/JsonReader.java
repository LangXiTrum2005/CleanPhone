package com.airbnb.lottie.parser.moshi;

import android.support.v4.media.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer;
import okio.ByteString;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class JsonReader implements Closeable {
    public static final String[] f0 = new String[128];
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int[] f9934Y;
    public String[] Z;
    public int[] e0;

    public static final class Options {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f9935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final okio.Options f9936b;

        public Options(String[] strArr, okio.Options options) {
            this.f9935a = strArr;
            this.f9936b = options;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
        public static Options a(String... strArr) {
            String str;
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                Buffer buffer = new Buffer();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    String str2 = strArr[i2];
                    String[] strArr2 = JsonReader.f0;
                    buffer.T(34);
                    int length = str2.length();
                    int i3 = 0;
                    for (int i4 = 0; i4 < length; i4++) {
                        char cCharAt = str2.charAt(i4);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i3 < i4) {
                                    buffer.q0(i3, i4, str2);
                                }
                                buffer.s0(str);
                                i3 = i4 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i3 < i4) {
                                buffer.q0(i3, i4, str2);
                            }
                            buffer.s0(str);
                            i3 = i4 + 1;
                        }
                    }
                    if (i3 < length) {
                        buffer.q0(i3, length, str2);
                    }
                    buffer.T(34);
                    buffer.readByte();
                    byteStringArr[i2] = buffer.readByteString(buffer.f45132Y);
                }
                return new Options((String[]) strArr.clone(), okio.Options.Companion.b(byteStringArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Token {
        public static final Token X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final Token f9937Y;
        public static final Token Z;
        public static final Token e0;
        public static final Token f0;
        public static final Token g0;
        public static final Token h0;
        public static final Token i0;
        public static final Token j0;
        public static final Token k0;
        public static final /* synthetic */ Token[] l0;

        static {
            Token token = new Token("BEGIN_ARRAY", 0);
            X = token;
            Token token2 = new Token("END_ARRAY", 1);
            f9937Y = token2;
            Token token3 = new Token("BEGIN_OBJECT", 2);
            Z = token3;
            Token token4 = new Token("END_OBJECT", 3);
            e0 = token4;
            Token token5 = new Token("NAME", 4);
            f0 = token5;
            Token token6 = new Token("STRING", 5);
            g0 = token6;
            Token token7 = new Token("NUMBER", 6);
            h0 = token7;
            Token token8 = new Token("BOOLEAN", 7);
            i0 = token8;
            Token token9 = new Token("NULL", 8);
            j0 = token9;
            Token token10 = new Token("END_DOCUMENT", 9);
            k0 = token10;
            l0 = new Token[]{token, token2, token3, token4, token5, token6, token7, token8, token9, token10};
        }

        public static Token valueOf(String str) {
            return (Token) Enum.valueOf(Token.class, str);
        }

        public static Token[] values() {
            return (Token[]) l0.clone();
        }
    }

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f0[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader G(RealBufferedSource realBufferedSource) {
        return new JsonUtf8Reader(realBufferedSource);
    }

    public abstract Token H();

    public final void I(int i2) {
        int i3 = this.X;
        int[] iArr = this.f9934Y;
        if (i3 == iArr.length) {
            if (i3 == 256) {
                throw new JsonDataException("Nesting too deep at " + u());
            }
            this.f9934Y = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.Z;
            this.Z = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.e0;
            this.e0 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f9934Y;
        int i4 = this.X;
        this.X = i4 + 1;
        iArr3[i4] = i2;
    }

    public abstract int J(Options options);

    public abstract void K();

    public abstract void P();

    public final void S(String str) throws JsonEncodingException {
        StringBuilder sbX = a.x(str, " at path ");
        sbX.append(u());
        throw new JsonEncodingException(sbX.toString());
    }

    public abstract void d();

    public abstract void h();

    public abstract void k();

    public abstract void l();

    public abstract boolean m();

    public abstract boolean p();

    public abstract double q();

    public abstract int r();

    public abstract String s();

    public abstract String t();

    public final String u() {
        int i2 = this.X;
        int[] iArr = this.f9934Y;
        String[] strArr = this.Z;
        int[] iArr2 = this.e0;
        StringBuilder sb = new StringBuilder("$");
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(iArr2[i3]);
                sb.append(AbstractJsonLexerKt.END_LIST);
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String str = strArr[i3];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }
}
