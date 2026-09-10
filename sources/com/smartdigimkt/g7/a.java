package com.smartdigimkt.g7;

import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextUtils;
import com.smartdigimkt.d7.d;
import com.smartdigimkt.n8.l;
import com.smartdigimkt.p6.p;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a extends com.smartdigimkt.f7.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final String f35495i;
    public com.smartdigimkt.g7.b j;
    public List<b> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f35496l;
    private final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f35497n;
    private int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f35498p;
    private long q;
    private String r;
    private boolean s;
    private final long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f35499u;
    private MediaMetadataRetriever v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f35500w;
    int x;

    /* JADX INFO: renamed from: com.smartdigimkt.g7.a$a, reason: collision with other inner class name */
    public class C0494a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f35501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f35502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f35503c;
        int d;

        public C0494a(long j, long j2, long j3, int i2) {
            this.f35501a = j;
            this.f35502b = j2;
            this.f35503c = j3;
            this.d = i2;
        }

        public long a() {
            return this.f35503c;
        }

        public int b() {
            return this.d;
        }

        public long c() {
            return this.f35501a;
        }

        public long d() {
            return this.f35502b;
        }
    }

    public static abstract class b {
        public abstract void a(C0494a c0494a);

        public abstract void a(String str, String str2);

        public abstract boolean a(int i2, long j, long j2);
    }

    public static abstract class c {
        public abstract void a(long j, long j2, long j3, long j4, long j5);

        public abstract void a(String str, String str2, long j, long j2, long j3, long j4);
    }

    public a(String str) {
        super(str);
        this.f35495i = "a";
        this.m = 0;
        this.f35497n = 1;
        this.t = 512000L;
        this.f35500w = new Object();
        this.x = -1;
        this.k = new ArrayList();
        this.j = new com.smartdigimkt.g7.b();
        this.f35498p = 0;
        this.q = 0L;
        this.s = false;
        this.f35499u = 0L;
        b(0);
    }

    private void b(int i2) {
        this.o = i2;
    }

    private synchronized void c(String str, String str2) {
        try {
            b(0);
            Iterator<b> it = this.k.iterator();
            while (it.hasNext()) {
                it.next().a(str, str2);
            }
            l();
            c cVar = this.f35496l;
            if (cVar != null) {
                cVar.a(str, str2, this.f35256h, this.d, this.f35255e, this.g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private boolean h() {
        int i2 = this.f35498p;
        if (i2 != 100) {
            return this.o == 0 && i2 < 100;
        }
        b(i2, this.q);
        a(this.f35498p, this.q);
        return false;
    }

    private void j() {
        String strB = d.c().b(4);
        if (TextUtils.isEmpty(strB)) {
            c("", "without saveDirectory");
            return;
        }
        File file = new File(strB);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.r = d.c().d(4, l.b(this.f35253b));
        File file2 = new File(this.r);
        if (file2.exists()) {
            this.q = file2.length();
        }
    }

    private synchronized void l() {
        this.k.clear();
    }

    private void o() {
        long j;
        if (this.f35499u > 0 && this.v == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            this.v = mediaMetadataRetriever;
            int i2 = this.j.f35505a;
            try {
                mediaMetadataRetriever.setDataSource(this.r);
                j = Long.parseLong(this.v.extractMetadata(9));
                if (j > 0) {
                    try {
                        int i3 = (int) (((this.f35499u + 500) * 100) / j);
                        i2 = i3 > 100 ? 100 : i3;
                        com.smartdigimkt.g7.b bVar = this.j;
                        if (bVar.f35505a < i2) {
                            bVar.f35505a = i2;
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
                j = -1;
            }
            try {
                this.v.release();
            } catch (Throwable unused3) {
            }
            int i4 = i2;
            a(new C0494a(this.f35499u, j, System.currentTimeMillis() - jCurrentTimeMillis, i4));
            int i5 = this.j.f35505a;
        }
    }

    @Override // com.smartdigimkt.f7.b
    public void a(String str, String str2) {
    }

    @Override // com.smartdigimkt.f7.b
    public void d() {
        b(0);
    }

    @Override // com.smartdigimkt.f7.b
    public Map<String, String> e() {
        return null;
    }

    public int i() {
        return this.o;
    }

    public void k() {
        this.s = false;
        b(0);
    }

    public void m() {
        h();
        this.s = true;
        if (h()) {
            j();
            b(1);
            f();
        }
    }

    public void n() {
        h();
        if (h()) {
            j();
            b(1);
            f();
        }
    }

    private synchronized void b(int i2, long j) {
        try {
            if (this.x != i2) {
                this.x = i2;
            }
            p.c().a(this.f35253b, this.r, this.f35256h, j, i2, false);
            Iterator<b> it = this.k.iterator();
            if (this.f35256h > 512000 || i2 == 100) {
                boolean z2 = false;
                while (it.hasNext()) {
                    if (it.next().a(i2, j, this.f35256h)) {
                        z2 = i2 != 100;
                        it.remove();
                    }
                }
                if (z2) {
                    p.c().a(this.f35253b, this.r, this.f35256h, j, i2);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(com.smartdigimkt.g7.b bVar) {
        synchronized (this.f35500w) {
            try {
                int i2 = bVar.f35505a;
                int i3 = bVar.f35507c;
                long j = bVar.d;
                com.smartdigimkt.g7.b bVar2 = this.j;
                if (bVar2.f35505a < i2) {
                    bVar2.f35505a = i2;
                }
                if (j > this.f35499u) {
                    this.f35499u = j;
                }
                if (Build.VERSION.SDK_INT <= 24) {
                    bVar2.f35507c = 1;
                } else if (bVar2.f35507c != 1) {
                    bVar2.f35507c = i3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.smartdigimkt.f7.b
    public void b(String str, String str2) {
        c(str, str2);
    }

    public synchronized void a(b bVar) {
        if (!this.k.contains(bVar)) {
            this.k.add(bVar);
        }
    }

    public void a(c cVar) {
        this.f35496l = cVar;
    }

    private boolean a(int i2) {
        synchronized (this.f35500w) {
            try {
                if (this.s) {
                    return true;
                }
                if (this.f35256h < 512000) {
                    return true;
                }
                com.smartdigimkt.g7.b bVar = this.j;
                int i3 = bVar.f35507c;
                if (i3 == 2 && i2 >= bVar.f35505a) {
                    return false;
                }
                if (i3 == 1) {
                    return true;
                }
                List<b> list = this.k;
                return list == null || list.size() != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i2, long j) {
        if (i2 == 100) {
            p.c().a(this.f35253b, this.r, this.f35256h, j, i2, true);
            c cVar = this.f35496l;
            if (cVar != null) {
                cVar.a(this.f35256h, this.d, this.f, this.f35255e, this.g);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // com.smartdigimkt.f7.b
    public boolean a(InputStream inputStream) {
        ?? r6;
        double d;
        FileOutputStream fileOutputStream;
        boolean z2 = false;
        if (!TextUtils.isEmpty(this.r)) {
            FileOutputStream fileOutputStream2 = null;
            try {
                long j = this.q;
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                try {
                    if (i2 > 0) {
                        long jSkip = inputStream.skip(j);
                        fileOutputStream = new FileOutputStream(this.r, true);
                        long j2 = this.q;
                        d = 100.0d;
                        int i3 = (int) (((j2 * 1.0d) / this.f35256h) * 100.0d);
                        this.f35498p = i3;
                        if (j2 == jSkip) {
                            b(i3, j2);
                        } else {
                            throw new Exception("countinu download video fail with skip error");
                        }
                    } else {
                        d = 100.0d;
                        fileOutputStream = new FileOutputStream(this.r);
                        this.f35498p = 0;
                    }
                    fileOutputStream2 = fileOutputStream;
                    byte[] bArr = new byte[com.p004ironsource.mediationsdk.metadata.a.f25965n];
                    while (true) {
                        int i4 = inputStream.read(bArr);
                        if (i4 == -1 || !a(this.f35498p)) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i4);
                        long j3 = this.q + ((long) i4);
                        this.q = j3;
                        int i5 = (int) (((j3 * 1.0d) / this.f35256h) * d);
                        this.f35498p = i5;
                        if (i5 >= 5) {
                            o();
                        }
                        b(this.f35498p, this.q);
                    }
                    fileOutputStream2.close();
                    try {
                        fileOutputStream2.close();
                    } catch (Throwable unused) {
                    }
                    z2 = true;
                } catch (Throwable th) {
                    th = th;
                    r6 = i2;
                    try {
                        th.printStackTrace();
                        if (r6 != 0) {
                            try {
                                r6.close();
                            } catch (Throwable unused2) {
                            }
                        }
                    } catch (Throwable th2) {
                        if (r6 != 0) {
                            try {
                                r6.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                r6 = fileOutputStream2;
            }
        }
        a(this.f35498p, this.q);
        return z2;
    }

    @Override // com.smartdigimkt.f7.b
    public void a(com.smartdigimkt.l7.d dVar) {
        com.smartdigimkt.l7.b.a().a(dVar, 4);
    }

    private synchronized void a(C0494a c0494a) {
        c0494a.d();
        c0494a.b();
        Iterator<b> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().a(c0494a);
        }
    }
}
