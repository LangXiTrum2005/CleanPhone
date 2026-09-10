package com.google.common.io;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.google.common.math.IntMath;
import com.p004ironsource.dc;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class BaseEncoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BaseEncoding f20011a;

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$1, reason: invalid class name */
    class AnonymousClass1 extends ByteSink {
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$2, reason: invalid class name */
    class AnonymousClass2 extends ByteSource {
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$3, reason: invalid class name */
    class AnonymousClass3 extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.Reader
        public final int read() {
            throw null;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i2, int i3) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$4, reason: invalid class name */
    class AnonymousClass4 implements Appendable {
        @Override // java.lang.Appendable
        public final Appendable append(char c2) {
            throw null;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i2, int i3) {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$5, reason: invalid class name */
    class AnonymousClass5 extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(int i2) {
            throw null;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i2, int i3) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class Alphabet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final char[] f20013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f20014c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f20015e;
        public final byte[] f;

        public Alphabet(String str, char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            int i2 = 0;
            while (true) {
                if (i2 >= cArr.length) {
                    this.f20012a = str;
                    this.f20013b = cArr;
                    try {
                        int length = cArr.length;
                        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
                        int iD = IntMath.d(length);
                        this.f20014c = iD;
                        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iD);
                        int i3 = 1 << (3 - iNumberOfTrailingZeros);
                        this.d = i3;
                        this.f20015e = iD >> iNumberOfTrailingZeros;
                        this.f = bArr;
                        boolean[] zArr = new boolean[i3];
                        for (int i4 = 0; i4 < this.f20015e; i4++) {
                            int i5 = this.f20014c;
                            RoundingMode roundingMode2 = RoundingMode.CEILING;
                            zArr[IntMath.c(i4 * 8, i5)] = true;
                        }
                        return;
                    } catch (ArithmeticException e2) {
                        throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e2);
                    }
                }
                char c2 = cArr[i2];
                if (!(c2 < 128)) {
                    throw new IllegalArgumentException(Strings.a("Non-ASCII character: %s", Character.valueOf(c2)));
                }
                if (!(bArr[c2] == -1)) {
                    throw new IllegalArgumentException(Strings.a("Duplicate character: %s", Character.valueOf(c2)));
                }
                bArr[c2] = (byte) i2;
                i2++;
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Alphabet)) {
                return false;
            }
            Alphabet alphabet = (Alphabet) obj;
            alphabet.getClass();
            return Arrays.equals(this.f20013b, alphabet.f20013b);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f20013b) + 1237;
        }

        public final String toString() {
            return this.f20012a;
        }
    }

    public static final class Base16Encoding extends StandardBaseEncoding {
        public final char[] d;

        public Base16Encoding() {
            Alphabet alphabet = new Alphabet("base16()", "0123456789ABCDEF".toCharArray());
            super(alphabet, (Character) null);
            this.d = new char[512];
            char[] cArr = alphabet.f20013b;
            Preconditions.f(cArr.length == 16);
            for (int i2 = 0; i2 < 256; i2++) {
                char[] cArr2 = this.d;
                cArr2[i2] = cArr[i2 >>> 4];
                cArr2[i2 | 256] = cArr[i2 & 15];
            }
        }
    }

    public static final class Base64Encoding extends StandardBaseEncoding {
        public Base64Encoding(String str, String str2) {
            Character chValueOf = Character.valueOf(dc.T);
            Alphabet alphabet = new Alphabet(str, str2.toCharArray());
            super(alphabet, chValueOf);
            Preconditions.f(alphabet.f20013b.length == 64);
        }
    }

    public static final class DecodingException extends IOException {
    }

    public static final class SeparatedBaseEncoding extends BaseEncoding {
        public final String toString() {
            return "null.withSeparator(\"null\", 0)";
        }
    }

    static {
        new Base64Encoding("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new Base64Encoding("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new StandardBaseEncoding("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new StandardBaseEncoding("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f20011a = new Base16Encoding();
    }

    public static class StandardBaseEncoding extends BaseEncoding {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Alphabet f20016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Character f20017c;

        /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$1, reason: invalid class name */
        class AnonymousClass1 extends OutputStream {
            public int X;

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                if (this.X <= 0) {
                    throw null;
                }
                throw null;
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() {
                throw null;
            }

            @Override // java.io.OutputStream
            public final void write(int i2) {
                this.X += 8;
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.google.common.io.BaseEncoding$StandardBaseEncoding$2, reason: invalid class name */
        class AnonymousClass2 extends InputStream {
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                throw null;
            }

            @Override // java.io.InputStream
            public final int read() {
                throw null;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i2, int i3) {
                int i4 = i3 + i2;
                Preconditions.l(i2, i4, bArr.length);
                if (i2 >= i4) {
                    return 0;
                }
                throw null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0017  */
        public StandardBaseEncoding(Alphabet alphabet, Character ch) {
            boolean z2;
            this.f20016b = alphabet;
            if (ch != null) {
                char cCharValue = ch.charValue();
                byte[] bArr = alphabet.f;
                if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            Preconditions.g(z2, "Padding character %s was already in alphabet", ch);
            this.f20017c = ch;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof StandardBaseEncoding) {
                StandardBaseEncoding standardBaseEncoding = (StandardBaseEncoding) obj;
                if (this.f20016b.equals(standardBaseEncoding.f20016b) && Objects.equals(this.f20017c, standardBaseEncoding.f20017c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f20016b.hashCode() ^ Objects.hashCode(this.f20017c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            Alphabet alphabet = this.f20016b;
            sb.append(alphabet);
            if (8 % alphabet.f20014c != 0) {
                Character ch = this.f20017c;
                if (ch == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(ch);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public StandardBaseEncoding(String str, String str2) {
            this(new Alphabet(str, str2.toCharArray()), Character.valueOf(dc.T));
        }
    }
}
