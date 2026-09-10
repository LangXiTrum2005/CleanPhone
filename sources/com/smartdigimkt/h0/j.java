package com.smartdigimkt.h0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j<T> implements Comparable<j<T>> {
    private static final String k = "j";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f35584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f35585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ConcurrentHashMap<String, String> f35586c;
    private final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e<T> f35587e;
    private Integer f;
    private k g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f35588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private m f35589i;
    private Object j;

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f35590a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35591b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f35592c = 2;
        public static final int d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35593e = 4;
        public static final int f = 5;
        public static final int g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f35594h = 7;
    }

    public class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35595b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f35596c = 2;
        public static final int d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f35597e = 4;

        public b() {
        }
    }

    public j(int i2, String str, e<T> eVar) {
        this.f35586c = new ConcurrentHashMap<>();
        this.f35588h = false;
        this.f35585b = str;
        this.f35584a = i2;
        this.f35587e = eVar;
        this.d = false;
        a((m) new com.smartdigimkt.h0.b());
    }

    public abstract l<T> a(com.smartdigimkt.n0.c cVar);

    public void a(OutputStream outputStream) {
    }

    public com.smartdigimkt.i0.a b(com.smartdigimkt.i0.a aVar) {
        return aVar;
    }

    public void c() {
        e<T> eVar = this.f35587e;
        if (eVar != null) {
            eVar.a();
        }
    }

    public void d() {
        e<T> eVar = this.f35587e;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void e() {
        e<T> eVar = this.f35587e;
        if (eVar != null) {
            eVar.b();
        }
    }

    public void f() {
        e<T> eVar = this.f35587e;
        if (eVar != null) {
            eVar.c();
        }
    }

    public byte[] g() {
        return null;
    }

    public Map<String, String> h() {
        return this.f35586c;
    }

    public int i() {
        return this.f35584a;
    }

    public int j() {
        return 2;
    }

    public m k() {
        return this.f35589i;
    }

    public final int l() {
        Integer num = this.f;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public Object m() {
        return this.j;
    }

    public final int n() {
        return this.f35589i.g();
    }

    public String o() {
        return this.f35585b;
    }

    public boolean p() {
        return this.f35588h;
    }

    public void q() {
        a("Charset", "UTF-8");
        if (this.d) {
            a("Connection", "keep-alive");
        } else {
            a("Connection", "close");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35588h ? "[X] " : "[ ] ");
        sb.append(o());
        sb.append(" ");
        sb.append(j());
        sb.append(" ");
        sb.append(this.f);
        return sb.toString();
    }

    public void a(e<T> eVar) {
        this.f35587e = eVar;
    }

    public final void b(String str) {
        this.f35586c.remove(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j<?> a(Object obj) {
        this.j = obj;
        return this;
    }

    public void b() {
        e<T> eVar = this.f35587e;
        if (eVar != null) {
            eVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j<?> a(m mVar) {
        this.f35589i = mVar;
        return this;
    }

    public void a(String str) {
        k kVar = this.g;
        if (kVar != null) {
            kVar.b(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j<?> a(k kVar) {
        this.g = kVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final j<?> a(int i2) {
        this.f = Integer.valueOf(i2);
        return this;
    }

    public j(int i2, String str, e<T> eVar, boolean z2) {
        this.f35586c = new ConcurrentHashMap<>();
        this.f35588h = false;
        this.f35585b = str;
        this.f35584a = i2;
        this.f35587e = eVar;
        this.d = z2;
        a((m) new com.smartdigimkt.h0.b());
    }

    public void a() {
        this.f35588h = true;
    }

    public final void a(String str, String str2) {
        b(str);
        this.f35586c.put(str, str2);
    }

    public final void a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public byte[] a(com.smartdigimkt.n0.b bVar, c cVar) throws IOException, com.smartdigimkt.i0.a {
        if (bVar.a() != null) {
            return a(bVar);
        }
        return new byte[0];
    }

    public j(int i2, String str) {
        this.f35586c = new ConcurrentHashMap<>();
        this.f35587e = null;
        this.f35588h = false;
        this.f35585b = str;
        this.f35584a = i2;
        this.d = false;
        a((m) new com.smartdigimkt.h0.b());
    }

    /* JADX WARN: Code duplicated, block: B:36:0x005c A[Catch: IOException -> 0x0058, TRY_LEAVE, TryCatch #1 {IOException -> 0x0058, blocks: (B:32:0x0054, B:36:0x005c), top: B:42:0x0054 }] */
    private byte[] a(com.smartdigimkt.n0.b bVar) throws Throwable {
        InputStream inputStreamA;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            inputStreamA = bVar.a();
            try {
                if (com.smartdigimkt.o0.d.b(bVar.b()) && !(inputStreamA instanceof GZIPInputStream)) {
                    inputStreamA = new GZIPInputStream(inputStreamA);
                }
                if (inputStreamA != null) {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i2 = inputStreamA.read(bArr);
                            if (i2 != -1) {
                                byteArrayOutputStream2.write(bArr, 0, i2);
                            } else {
                                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                                try {
                                    inputStreamA.close();
                                    byteArrayOutputStream2.close();
                                    return byteArray;
                                } catch (IOException e2) {
                                    e2.getMessage();
                                    return byteArray;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        byteArrayOutputStream = byteArrayOutputStream2;
                        th = th;
                        if (inputStreamA != null) {
                            try {
                                inputStreamA.close();
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                            } catch (IOException e3) {
                                e3.getMessage();
                                throw th;
                            }
                        } else if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th;
                    }
                } else {
                    throw new com.smartdigimkt.i0.a(7, null);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamA = null;
        }
    }

    public void a(l<T> lVar) {
        e<T> eVar = this.f35587e;
        if (eVar != null) {
            eVar.a(lVar);
        }
    }

    public void a(com.smartdigimkt.i0.a aVar) {
        e<T> eVar = this.f35587e;
        if (eVar != null) {
            eVar.a(aVar);
        }
    }

    public void a(long j, long j2) {
        e<T> eVar = this.f35587e;
        if (eVar != null) {
            eVar.a(j, j2);
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j<T> jVar) {
        int iJ = j();
        int iJ2 = jVar.j();
        return iJ == iJ2 ? this.f.intValue() - jVar.f.intValue() : iJ2 - iJ;
    }
}
