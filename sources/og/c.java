package og;

import java.io.IOException;
import java.util.Arrays;
import lo.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f47424h = new String[128];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f47425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f47426g;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f47424h[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f47424h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public c(m mVar) {
        int[] iArr = new int[32];
        this.f47428b = iArr;
        this.f47429c = new String[32];
        this.f47430d = new int[32];
        this.f47431e = -1;
        this.f47425f = mVar;
        this.f47427a = 1;
        iArr[0] = 6;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void t(m mVar, String str) {
        String str2;
        mVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = f47424h[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        mVar.h(i10, i11, str);
                    }
                    mVar.writeUtf8(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    mVar.h(i10, i11, str);
                }
                mVar.writeUtf8(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            mVar.h(i10, length, str);
        }
        mVar.writeByte(34);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f47425f.close();
        int i10 = this.f47427a;
        if (i10 > 1 || (i10 == 1 && this.f47428b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f47427a = 0;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f47427a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f47425f.flush();
    }

    public final void h() {
        int iD = d();
        int i10 = 2;
        if (iD != 1) {
            m mVar = this.f47425f;
            if (iD == 2) {
                mVar.writeByte(44);
            } else if (iD == 4) {
                mVar.writeUtf8(":");
                i10 = 5;
            } else {
                if (iD == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (iD != 6) {
                    if (iD != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                i10 = 7;
            }
        }
        this.f47428b[this.f47427a - 1] = i10;
    }

    public final c k() {
        y();
        s(1, 2, '[');
        return this;
    }

    public final c n() {
        y();
        s(3, 5, '{');
        return this;
    }

    public final void o(int i10, int i11, char c4) {
        int iD = d();
        if (iD != i11 && iD != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f47426g != null) {
            throw new IllegalStateException("Dangling name: " + this.f47426g);
        }
        int i12 = this.f47427a;
        int i13 = ~this.f47431e;
        if (i12 == i13) {
            this.f47431e = i13;
            return;
        }
        int i14 = i12 - 1;
        this.f47427a = i14;
        this.f47429c[i14] = null;
        int[] iArr = this.f47430d;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f47425f.writeByte(c4);
    }

    public final c p() {
        o(3, 5, '}');
        return this;
    }

    public final c q(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f47427a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iD = d();
        if ((iD != 3 && iD != 5) || this.f47426g != null) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f47426g = str;
        this.f47429c[this.f47427a - 1] = str;
        return this;
    }

    public final c r() {
        if (this.f47426g != null) {
            this.f47426g = null;
            return this;
        }
        h();
        this.f47425f.writeUtf8("null");
        int[] iArr = this.f47430d;
        int i10 = this.f47427a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final void s(int i10, int i11, char c4) {
        int i12;
        int i13 = this.f47427a;
        int i14 = this.f47431e;
        if (i13 == i14 && ((i12 = this.f47428b[i13 - 1]) == i10 || i12 == i11)) {
            this.f47431e = ~i14;
            return;
        }
        h();
        int i15 = this.f47427a;
        int[] iArr = this.f47428b;
        if (i15 == iArr.length) {
            if (i15 == 256) {
                throw new aa.b("Nesting too deep at " + d0.c.t(this.f47427a, this.f47428b, this.f47429c, this.f47430d) + ": circular reference?", 16);
            }
            this.f47428b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f47429c;
            this.f47429c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f47430d;
            this.f47430d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f47428b;
        int i16 = this.f47427a;
        this.f47427a = i16 + 1;
        iArr3[i16] = i10;
        this.f47430d[i16] = 0;
        this.f47425f.writeByte(c4);
    }

    public final c u(long j10) {
        y();
        h();
        this.f47425f.writeUtf8(Long.toString(j10));
        int[] iArr = this.f47430d;
        int i10 = this.f47427a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final c v(Integer num) {
        String string = num.toString();
        if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + num);
        }
        y();
        h();
        this.f47425f.writeUtf8(string);
        int[] iArr = this.f47430d;
        int i10 = this.f47427a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final c w(String str) {
        if (str == null) {
            r();
            return this;
        }
        y();
        h();
        t(this.f47425f, str);
        int[] iArr = this.f47430d;
        int i10 = this.f47427a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final c x(boolean z10) {
        y();
        h();
        this.f47425f.writeUtf8(z10 ? com.ironsource.mediationsdk.metadata.a.f29610g : "false");
        int[] iArr = this.f47430d;
        int i10 = this.f47427a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    public final void y() {
        if (this.f47426g != null) {
            int iD = d();
            m mVar = this.f47425f;
            if (iD == 5) {
                mVar.writeByte(44);
            } else if (iD != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f47428b[this.f47427a - 1] = 4;
            t(mVar, this.f47426g);
            this.f47426g = null;
        }
    }
}
