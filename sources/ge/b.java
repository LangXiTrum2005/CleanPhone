package ge;

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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Closeable, Flushable {
    public static final Pattern l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f41877m = new String[128];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f41878n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f41879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f41880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.google.gson.a f41882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f41883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f41884f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41885g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f41886h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41887i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f41888j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41889k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f41877m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f41877m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f41878n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f41880b = iArr;
        this.f41881c = 0;
        if (iArr.length == 0) {
            this.f41880b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f41880b;
        int i10 = this.f41881c;
        this.f41881c = i10 + 1;
        iArr2[i10] = 6;
        this.f41886h = 2;
        this.f41889k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f41879a = writer;
        u(com.google.gson.a.f24735d);
    }

    public void A(Number number) throws IOException {
        if (number == null) {
            s();
            return;
        }
        D();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f41886h != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        d();
        this.f41879a.append((CharSequence) string);
    }

    public void B(String str) throws IOException {
        if (str == null) {
            s();
            return;
        }
        D();
        d();
        w(str);
    }

    public void C(boolean z10) throws IOException {
        D();
        d();
        this.f41879a.write(z10 ? com.ironsource.mediationsdk.metadata.a.f29610g : "false");
    }

    public final void D() throws IOException {
        if (this.f41888j != null) {
            int iT = t();
            if (iT == 5) {
                this.f41879a.write(this.f41884f);
            } else if (iT != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            r();
            this.f41880b[this.f41881c - 1] = 4;
            w(this.f41888j);
            this.f41888j = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f41879a.close();
        int i10 = this.f41881c;
        if (i10 > 1 || (i10 == 1 && this.f41880b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f41881c = 0;
    }

    public final void d() throws IOException {
        int iT = t();
        if (iT == 1) {
            this.f41880b[this.f41881c - 1] = 2;
            r();
            return;
        }
        Writer writer = this.f41879a;
        if (iT == 2) {
            writer.append((CharSequence) this.f41884f);
            r();
        } else {
            if (iT == 4) {
                writer.append((CharSequence) this.f41883e);
                this.f41880b[this.f41881c - 1] = 5;
                return;
            }
            if (iT != 6) {
                if (iT != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f41886h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f41880b[this.f41881c - 1] = 7;
        }
    }

    public void flush() throws IOException {
        if (this.f41881c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f41879a.flush();
    }

    public void h() throws IOException {
        D();
        d();
        int i10 = this.f41881c;
        int[] iArr = this.f41880b;
        if (i10 == iArr.length) {
            this.f41880b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f41880b;
        int i11 = this.f41881c;
        this.f41881c = i11 + 1;
        iArr2[i11] = 1;
        this.f41879a.write(91);
    }

    public void k() throws IOException {
        D();
        d();
        int i10 = this.f41881c;
        int[] iArr = this.f41880b;
        if (i10 == iArr.length) {
            this.f41880b = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = this.f41880b;
        int i11 = this.f41881c;
        this.f41881c = i11 + 1;
        iArr2[i11] = 3;
        this.f41879a.write(123);
    }

    public final void n(int i10, int i11, char c4) throws IOException {
        int iT = t();
        if (iT != i11 && iT != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f41888j != null) {
            throw new IllegalStateException("Dangling name: " + this.f41888j);
        }
        this.f41881c--;
        if (iT == i11) {
            r();
        }
        this.f41879a.write(c4);
    }

    public void o() throws IOException {
        n(1, 2, ']');
    }

    public void p() throws IOException {
        n(3, 5, '}');
    }

    public void q(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f41888j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iT = t();
        if (iT != 3 && iT != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f41888j = str;
    }

    public final void r() throws IOException {
        if (this.f41885g) {
            return;
        }
        String str = this.f41882d.f24736a;
        Writer writer = this.f41879a;
        writer.write(str);
        int i10 = this.f41881c;
        for (int i11 = 1; i11 < i10; i11++) {
            writer.write(this.f41882d.f24737b);
        }
    }

    public b s() throws IOException {
        if (this.f41888j != null) {
            if (!this.f41889k) {
                this.f41888j = null;
                return this;
            }
            D();
        }
        d();
        this.f41879a.write("null");
        return this;
    }

    public final int t() {
        int i10 = this.f41881c;
        if (i10 != 0) {
            return this.f41880b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void u(com.google.gson.a aVar) {
        Objects.requireNonNull(aVar);
        this.f41882d = aVar;
        this.f41884f = ",";
        if (aVar.f24738c) {
            this.f41883e = ": ";
            if (aVar.f24736a.isEmpty()) {
                this.f41884f = ", ";
            }
        } else {
            this.f41883e = ":";
        }
        this.f41885g = this.f41882d.f24736a.isEmpty() && this.f41882d.f24737b.isEmpty();
    }

    public final void v(int i10) {
        if (i10 == 0) {
            throw null;
        }
        this.f41886h = i10;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void w(String str) throws IOException {
        String str2;
        String[] strArr = this.f41887i ? f41878n : f41877m;
        Writer writer = this.f41879a;
        writer.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        writer.write(str, i10, i11 - i10);
                    }
                    writer.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    writer.write(str, i10, i11 - i10);
                }
                writer.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            writer.write(str, i10, length - i10);
        }
        writer.write(34);
    }

    public void x(double d10) throws IOException {
        D();
        if (this.f41886h == 1 || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            d();
            this.f41879a.append((CharSequence) Double.toString(d10));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
    }

    public void y(long j10) throws IOException {
        D();
        d();
        this.f41879a.write(Long.toString(j10));
    }

    public void z(Boolean bool) throws IOException {
        if (bool == null) {
            s();
            return;
        }
        D();
        d();
        this.f41879a.write(bool.booleanValue() ? com.ironsource.mediationsdk.metadata.a.f29610g : "false");
    }
}
