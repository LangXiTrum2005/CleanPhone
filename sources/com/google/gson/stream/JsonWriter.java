package com.google.gson.stream;

import com.p004ironsource.mediationsdk.metadata.a;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class JsonWriter implements Closeable, Flushable {
    public static final Pattern j0 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] k0 = new String[128];
    public static final String[] l0;
    public final Writer X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int[] f21328Y;
    public int Z;
    public final String e0;
    public boolean f0;
    public boolean g0;
    public String h0;
    public boolean i0;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            k0[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = k0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        l0 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        int[] iArr = new int[32];
        this.f21328Y = iArr;
        this.Z = 0;
        if (iArr.length == 0) {
            this.f21328Y = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f21328Y;
        int i2 = this.Z;
        this.Z = i2 + 1;
        iArr2[i2] = 6;
        this.e0 = ":";
        this.i0 = true;
        Objects.requireNonNull(writer, "out == null");
        this.X = writer;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void G(String str) throws IOException {
        String str2;
        String[] strArr = this.g0 ? l0 : k0;
        Writer writer = this.X;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i2 < i3) {
                        writer.write(str, i2, i3 - i2);
                    }
                    writer.write(str2);
                    i2 = i3 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i3) {
                    writer.write(str, i2, i3 - i2);
                }
                writer.write(str2);
                i2 = i3 + 1;
            }
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    public void H(double d) throws IOException {
        T();
        if (this.f0 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            d();
            this.X.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }

    public void I(long j) throws IOException {
        T();
        d();
        this.X.write(Long.toString(j));
    }

    public void J(Boolean bool) throws IOException {
        if (bool == null) {
            s();
            return;
        }
        T();
        d();
        this.X.write(bool.booleanValue() ? a.g : "false");
    }

    public void K(Number number) throws IOException {
        if (number == null) {
            s();
            return;
        }
        T();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !j0.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f0) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        d();
        this.X.append((CharSequence) string);
    }

    public void P(String str) throws IOException {
        if (str == null) {
            s();
            return;
        }
        T();
        d();
        G(str);
    }

    public void S(boolean z2) throws IOException {
        T();
        d();
        this.X.write(z2 ? a.g : "false");
    }

    public final void T() throws IOException {
        if (this.h0 != null) {
            int iT = t();
            if (iT == 5) {
                this.X.write(44);
            } else if (iT != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            r();
            this.f21328Y[this.Z - 1] = 4;
            G(this.h0);
            this.h0 = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.X.close();
        int i2 = this.Z;
        if (i2 > 1 || (i2 == 1 && this.f21328Y[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.Z = 0;
    }

    public final void d() throws IOException {
        int iT = t();
        if (iT == 1) {
            this.f21328Y[this.Z - 1] = 2;
            r();
            return;
        }
        Writer writer = this.X;
        if (iT == 2) {
            writer.append(AbstractJsonLexerKt.COMMA);
            r();
        } else {
            if (iT == 4) {
                writer.append((CharSequence) this.e0);
                this.f21328Y[this.Z - 1] = 5;
                return;
            }
            if (iT != 6) {
                if (iT != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f0) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f21328Y[this.Z - 1] = 7;
        }
    }

    public void flush() throws IOException {
        if (this.Z == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.X.flush();
    }

    public void h() throws IOException {
        T();
        d();
        int i2 = this.Z;
        int[] iArr = this.f21328Y;
        if (i2 == iArr.length) {
            this.f21328Y = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f21328Y;
        int i3 = this.Z;
        this.Z = i3 + 1;
        iArr2[i3] = 1;
        this.X.write(91);
    }

    public void k() throws IOException {
        T();
        d();
        int i2 = this.Z;
        int[] iArr = this.f21328Y;
        if (i2 == iArr.length) {
            this.f21328Y = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f21328Y;
        int i3 = this.Z;
        this.Z = i3 + 1;
        iArr2[i3] = 3;
        this.X.write(123);
    }

    public final void l(int i2, int i3, char c2) throws IOException {
        int iT = t();
        if (iT != i3 && iT != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.h0 != null) {
            throw new IllegalStateException("Dangling name: " + this.h0);
        }
        this.Z--;
        if (iT == i3) {
            r();
        }
        this.X.write(c2);
    }

    public void m() throws IOException {
        l(1, 2, AbstractJsonLexerKt.END_LIST);
    }

    public void p() throws IOException {
        l(3, 5, AbstractJsonLexerKt.END_OBJ);
    }

    public void q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.h0 != null) {
            throw new IllegalStateException();
        }
        if (this.Z == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.h0 = str;
    }

    public final void r() {
    }

    public JsonWriter s() throws IOException {
        if (this.h0 != null) {
            if (!this.i0) {
                this.h0 = null;
                return this;
            }
            T();
        }
        d();
        this.X.write(AbstractJsonLexerKt.NULL);
        return this;
    }

    public final int t() {
        int i2 = this.Z;
        if (i2 != 0) {
            return this.f21328Y[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }
}
