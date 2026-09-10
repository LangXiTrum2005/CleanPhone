package com.bykv.vk.openvk.preload.a.d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f297a = new String[128];
    private static final String[] b;
    private final Writer c;
    private int[] d = new int[32];
    private int e = 0;
    private String f;
    private boolean g;
    private boolean h;
    private String i;
    private boolean j;

    static {
        for (int i = 0; i <= 31; i++) {
            f297a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f297a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        a(6);
        this.f = ":";
        this.j = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.c = writer;
    }

    private int i() {
        int i = this.e;
        if (i != 0) {
            return this.d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void j() throws IOException {
        if (this.i != null) {
            k();
            c(this.i);
            this.i = null;
        }
    }

    private void k() throws IOException {
        int i = i();
        if (i == 5) {
            this.c.write(44);
        } else if (i != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        b(4);
    }

    private void l() throws IOException {
        int i = i();
        if (i == 1) {
            b(2);
            return;
        }
        if (i == 2) {
            this.c.append(',');
            return;
        }
        if (i == 4) {
            this.c.append((CharSequence) this.f);
            b(5);
            return;
        }
        if (i != 6) {
            if (i != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            if (!this.g) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        }
        b(7);
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final void b(boolean z) {
        this.h = z;
    }

    public final void c(boolean z) {
        this.j = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
        int i = this.e;
        if (i > 1 || (i == 1 && this.d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    public final c d() throws IOException {
        j();
        return a(1, '[');
    }

    public final c e() throws IOException {
        return a(1, 2, ']');
    }

    public final c f() throws IOException {
        j();
        return a(3, '{');
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.e == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.c.flush();
    }

    public final c g() throws IOException {
        return a(3, 5, '}');
    }

    public final c h() throws IOException {
        if (this.i != null) {
            if (!this.j) {
                this.i = null;
                return this;
            }
            j();
        }
        l();
        this.c.write("null");
        return this;
    }

    public final boolean a() {
        return this.g;
    }

    public final boolean b() {
        return this.h;
    }

    public final boolean c() {
        return this.j;
    }

    private c a(int i, char c) throws IOException {
        l();
        a(i);
        this.c.write(c);
        return this;
    }

    private void b(int i) {
        this.d[this.e - 1] = i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void c(String str) throws IOException {
        String str2;
        String[] strArr = this.h ? b : f297a;
        this.c.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        this.c.write(str, i, i2 - i);
                    }
                    this.c.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    this.c.write(str, i, i2 - i);
                }
                this.c.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.c.write(str, i, length - i);
        }
        this.c.write(34);
    }

    public final c d(boolean z) throws IOException {
        j();
        l();
        this.c.write(z ? "true" : "false");
        return this;
    }

    public final c b(String str) throws IOException {
        if (str == null) {
            return h();
        }
        j();
        l();
        c(str);
        return this;
    }

    private c a(int i, int i2, char c) throws IOException {
        int i3 = i();
        if (i3 != i2 && i3 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.i == null) {
            this.e--;
            this.c.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.i);
    }

    private void a(int i) {
        int i2 = this.e;
        int[] iArr = this.d;
        if (i2 == iArr.length) {
            this.d = Arrays.copyOf(iArr, i2 << 1);
        }
        int[] iArr2 = this.d;
        int i3 = this.e;
        this.e = i3 + 1;
        iArr2[i3] = i;
    }

    public final c a(String str) throws IOException {
        if (str != null) {
            if (this.i == null) {
                if (this.e != 0) {
                    this.i = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public final c a(Boolean bool) throws IOException {
        if (bool == null) {
            return h();
        }
        j();
        l();
        this.c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public final c a(long j) throws IOException {
        j();
        l();
        this.c.write(Long.toString(j));
        return this;
    }

    public final c a(Number number) throws IOException {
        if (number == null) {
            return h();
        }
        j();
        String string = number.toString();
        if (!this.g && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        l();
        this.c.append((CharSequence) string);
        return this;
    }
}
