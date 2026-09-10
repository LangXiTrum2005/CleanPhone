package com.bykv.vk.openvk.preload.a.b.a;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends com.bykv.vk.openvk.preload.a.d.a {
    private static final Object b;
    private Object[] c;
    private int d;
    private String[] e;
    private int[] f;

    static {
        new Reader() { // from class: com.bykv.vk.openvk.preload.a.b.a.e.1
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                throw new AssertionError();
            }

            @Override // java.io.Reader
            public final int read(char[] cArr, int i, int i2) throws IOException {
                throw new AssertionError();
            }
        };
        b = new Object();
    }

    private Object t() {
        return this.c[this.d - 1];
    }

    private Object u() {
        Object[] objArr = this.c;
        int i = this.d - 1;
        this.d = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    private String v() {
        return " at path " + p();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void a() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY);
        a(((com.bykv.vk.openvk.preload.a.f) t()).iterator());
        this.f[this.d - 1] = 0;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void b() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_ARRAY);
        u();
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void c() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT);
        a(((com.bykv.vk.openvk.preload.a.k) t()).g().iterator());
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c = new Object[]{b};
        this.d = 1;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void d() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.END_OBJECT);
        u();
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean e() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        return (bVarF == com.bykv.vk.openvk.preload.a.d.b.END_OBJECT || bVarF == com.bykv.vk.openvk.preload.a.d.b.END_ARRAY) ? false : true;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final com.bykv.vk.openvk.preload.a.d.b f() throws IOException {
        while (this.d != 0) {
            Object objT = t();
            if (!(objT instanceof Iterator)) {
                if (objT instanceof com.bykv.vk.openvk.preload.a.k) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT;
                }
                if (objT instanceof com.bykv.vk.openvk.preload.a.f) {
                    return com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY;
                }
                if (!(objT instanceof com.bykv.vk.openvk.preload.a.m)) {
                    if (objT instanceof com.bykv.vk.openvk.preload.a.j) {
                        return com.bykv.vk.openvk.preload.a.d.b.NULL;
                    }
                    if (objT == b) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
                com.bykv.vk.openvk.preload.a.m mVar = (com.bykv.vk.openvk.preload.a.m) objT;
                if (mVar.i()) {
                    return com.bykv.vk.openvk.preload.a.d.b.STRING;
                }
                if (mVar.g()) {
                    return com.bykv.vk.openvk.preload.a.d.b.BOOLEAN;
                }
                if (mVar.h()) {
                    return com.bykv.vk.openvk.preload.a.d.b.NUMBER;
                }
                throw new AssertionError();
            }
            boolean z = this.c[this.d - 2] instanceof com.bykv.vk.openvk.preload.a.k;
            Iterator it = (Iterator) objT;
            if (!it.hasNext()) {
                return z ? com.bykv.vk.openvk.preload.a.d.b.END_OBJECT : com.bykv.vk.openvk.preload.a.d.b.END_ARRAY;
            }
            if (z) {
                return com.bykv.vk.openvk.preload.a.d.b.NAME;
            }
            a(it.next());
        }
        return com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String g() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) t()).next();
        String str = (String) entry.getKey();
        this.e[this.d - 1] = str;
        a(entry.getValue());
        return str;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String h() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.STRING;
        if (bVarF != bVar && bVarF != com.bykv.vk.openvk.preload.a.d.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarF + v());
        }
        String strB = ((com.bykv.vk.openvk.preload.a.m) u()).b();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strB;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final boolean i() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.BOOLEAN);
        boolean zF = ((com.bykv.vk.openvk.preload.a.m) u()).f();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zF;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void j() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NULL);
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final double k() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (bVarF != bVar && bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarF + v());
        }
        double dC = ((com.bykv.vk.openvk.preload.a.m) t()).c();
        if (!q() && (Double.isNaN(dC) || Double.isInfinite(dC))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(dC)));
        }
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dC;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final long l() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (bVarF != bVar && bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarF + v());
        }
        long jD = ((com.bykv.vk.openvk.preload.a.m) t()).d();
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jD;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final int m() throws IOException {
        com.bykv.vk.openvk.preload.a.d.b bVarF = f();
        com.bykv.vk.openvk.preload.a.d.b bVar = com.bykv.vk.openvk.preload.a.d.b.NUMBER;
        if (bVarF != bVar && bVarF != com.bykv.vk.openvk.preload.a.d.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + bVarF + v());
        }
        int iE = ((com.bykv.vk.openvk.preload.a.m) t()).e();
        u();
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iE;
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final void n() throws IOException {
        if (f() == com.bykv.vk.openvk.preload.a.d.b.NAME) {
            g();
            this.e[this.d - 2] = "null";
        } else {
            u();
            int i = this.d;
            if (i > 0) {
                this.e[i - 1] = "null";
            }
        }
        int i2 = this.d;
        if (i2 > 0) {
            int[] iArr = this.f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    public final void o() throws IOException {
        a(com.bykv.vk.openvk.preload.a.d.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) t()).next();
        a(entry.getValue());
        a(new com.bykv.vk.openvk.preload.a.m((String) entry.getKey()));
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String p() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.d) {
            Object[] objArr = this.c;
            Object obj = objArr[i];
            if (obj instanceof com.bykv.vk.openvk.preload.a.f) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f[i]);
                    sb.append(']');
                }
            } else if (obj instanceof com.bykv.vk.openvk.preload.a.k) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.e[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // com.bykv.vk.openvk.preload.a.d.a
    public final String toString() {
        return "e";
    }

    private void a(com.bykv.vk.openvk.preload.a.d.b bVar) throws IOException {
        if (f() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + f() + v());
    }

    private void a(Object obj) {
        int i = this.d;
        Object[] objArr = this.c;
        if (i == objArr.length) {
            int i2 = i << 1;
            this.c = Arrays.copyOf(objArr, i2);
            this.f = Arrays.copyOf(this.f, i2);
            this.e = (String[]) Arrays.copyOf(this.e, i2);
        }
        Object[] objArr2 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        objArr2[i3] = obj;
    }
}
