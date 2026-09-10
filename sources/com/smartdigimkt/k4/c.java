package com.smartdigimkt.k4;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.smartdigimkt.j4.l;
import com.smartdigimkt.j4.o;
import com.smartdigimkt.j4.r;
import com.smartdigimkt.j4.s;
import com.smartdigimkt.n4.k;
import com.smartdigimkt.w3.e0;
import com.smartdigimkt.w3.h;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c extends com.smartdigimkt.j4.f<s.a> {
    private static final String y0 = "AdsMediaSource";
    private final s j0;
    private final g k0;
    private final com.smartdigimkt.k4.b l0;
    private final ViewGroup m0;
    private final Handler n0;
    private final f o0;
    private final Handler p0;
    private final Map<s, List<l>> q0;
    private final e0.b r0;
    private e s0;
    private e0 t0;
    private Object u0;
    private com.smartdigimkt.k4.a v0;
    private s[][] w0;
    private long[][] x0;

    public class a implements Runnable {
        final /* synthetic */ h X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ e f36190Y;

        public a(h hVar, e eVar) {
            this.X = hVar;
            this.f36190Y = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.l0.a(this.X, this.f36190Y, c.this.m0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.l0.a();
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.k4.c$c, reason: collision with other inner class name */
    public static final class C0519c extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f36191b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f36192c = 1;
        public static final int d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f36193e = 3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36194a;

        /* JADX INFO: renamed from: com.smartdigimkt.k4.c$c$a */
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private C0519c(int i2, Exception exc) {
            super(exc);
            this.f36194a = i2;
        }

        public static C0519c a(Exception exc) {
            return new C0519c(0, exc);
        }

        public static C0519c b(Exception exc) {
            return new C0519c(2, exc);
        }

        public static C0519c a(Exception exc, int i2) {
            return new C0519c(1, new IOException(android.support.v4.media.a.h(i2, "Failed to load ad group "), exc));
        }

        public RuntimeException b() {
            com.smartdigimkt.p4.a.b(this.f36194a == 3);
            return (RuntimeException) getCause();
        }

        public static C0519c a(RuntimeException runtimeException) {
            return new C0519c(3, runtimeException);
        }
    }

    public final class d implements l.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f36195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f36196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f36197c;

        public class a implements Runnable {
            final /* synthetic */ IOException X;

            public a(IOException iOException) {
                this.X = iOException;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.l0.a(d.this.f36196b, d.this.f36197c, this.X);
            }
        }

        public d(Uri uri, int i2, int i3) {
            this.f36195a = uri;
            this.f36196b = i2;
            this.f36197c = i3;
        }

        @Override // com.smartdigimkt.j4.l.a
        public void a(s.a aVar, IOException iOException) {
            c.this.a(aVar).a(new k(this.f36195a), 6, -1L, 0L, 0L, C0519c.a(iOException), true);
            c.this.p0.post(new a(iOException));
        }
    }

    public final class e implements com.smartdigimkt.k4.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f36199a = new Handler();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f36200b;

        public class a implements Runnable {
            final /* synthetic */ com.smartdigimkt.k4.a X;

            public a(com.smartdigimkt.k4.a aVar) {
                this.X = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f36200b) {
                    return;
                }
                c.this.a(this.X);
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f36200b) {
                    return;
                }
                c.this.o0.a();
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.k4.c$e$c, reason: collision with other inner class name */
        public class RunnableC0520c implements Runnable {
            public RunnableC0520c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f36200b) {
                    return;
                }
                c.this.o0.b();
            }
        }

        public class d implements Runnable {
            final /* synthetic */ C0519c X;

            public d(C0519c c0519c) {
                this.X = c0519c;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f36200b) {
                    return;
                }
                if (this.X.f36194a == 3) {
                    c.this.o0.a(this.X.b());
                } else {
                    c.this.o0.a(this.X);
                }
            }
        }

        public e() {
        }

        @Override // com.smartdigimkt.k4.b.a
        public void b() {
            if (this.f36200b || c.this.n0 == null || c.this.o0 == null) {
                return;
            }
            c.this.n0.post(new RunnableC0520c());
        }

        public void c() {
            this.f36200b = true;
            this.f36199a.removeCallbacksAndMessages(null);
        }

        @Override // com.smartdigimkt.k4.b.a
        public void a(com.smartdigimkt.k4.a aVar) {
            if (this.f36200b) {
                return;
            }
            this.f36199a.post(new a(aVar));
        }

        @Override // com.smartdigimkt.k4.b.a
        public void a() {
            if (this.f36200b || c.this.n0 == null || c.this.o0 == null) {
                return;
            }
            c.this.n0.post(new b());
        }

        @Override // com.smartdigimkt.k4.b.a
        public void a(C0519c c0519c, k kVar) {
            if (this.f36200b) {
                return;
            }
            c.this.a((s.a) null).a(kVar, 6, -1L, 0L, 0L, c0519c, true);
            if (c.this.n0 == null || c.this.o0 == null) {
                return;
            }
            c.this.n0.post(new d(c0519c));
        }
    }

    @Deprecated
    public interface f {
        void a();

        void a(IOException iOException);

        void a(RuntimeException runtimeException);

        void b();
    }

    public interface g {
        s a(Uri uri);

        int[] a();
    }

    public c(s sVar, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.k4.b bVar, ViewGroup viewGroup) {
        this(sVar, new o.d(aVar), bVar, viewGroup, (Handler) null, (f) null);
    }

    private void n() {
        com.smartdigimkt.k4.a aVar = this.v0;
        if (aVar == null || this.t0 == null) {
            return;
        }
        com.smartdigimkt.k4.a aVarA = aVar.a(this.x0);
        this.v0 = aVarA;
        a(aVarA.f36183a == 0 ? this.t0 : new com.smartdigimkt.k4.d(this.t0, this.v0), this.u0);
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.c
    public void g() {
        super.g();
        this.s0.c();
        this.s0 = null;
        this.q0.clear();
        this.t0 = null;
        this.u0 = null;
        this.v0 = null;
        this.w0 = new s[0][];
        this.x0 = new long[0][];
        this.p0.post(new b());
    }

    public c(s sVar, g gVar, com.smartdigimkt.k4.b bVar, ViewGroup viewGroup) {
        this(sVar, gVar, bVar, viewGroup, (Handler) null, (f) null);
    }

    @Deprecated
    public c(s sVar, com.smartdigimkt.n4.h.a aVar, com.smartdigimkt.k4.b bVar, ViewGroup viewGroup, Handler handler, f fVar) {
        this(sVar, new o.d(aVar), bVar, viewGroup, handler, fVar);
    }

    private void b(e0 e0Var, Object obj) {
        this.t0 = e0Var;
        this.u0 = obj;
        n();
    }

    @Deprecated
    public c(s sVar, g gVar, com.smartdigimkt.k4.b bVar, ViewGroup viewGroup, Handler handler, f fVar) {
        this.j0 = sVar;
        this.k0 = gVar;
        this.l0 = bVar;
        this.m0 = viewGroup;
        this.n0 = handler;
        this.o0 = fVar;
        this.p0 = new Handler(Looper.getMainLooper());
        this.q0 = new HashMap();
        this.r0 = new e0.b();
        this.w0 = new s[0][];
        this.x0 = new long[0][];
        bVar.a(gVar.a());
    }

    @Override // com.smartdigimkt.j4.f, com.smartdigimkt.j4.c
    public void a(h hVar, boolean z2) {
        super.a(hVar, z2);
        com.smartdigimkt.p4.a.a(z2);
        e eVar = new e();
        this.s0 = eVar;
        a(new s.a(0), this.j0);
        this.p0.post(new a(hVar, eVar));
    }

    @Override // com.smartdigimkt.j4.s
    public r a(s.a aVar, com.smartdigimkt.n4.b bVar) {
        if (this.v0.f36183a > 0 && aVar.a()) {
            int i2 = aVar.f36016b;
            int i3 = aVar.f36017c;
            Uri uri = this.v0.f36185c[i2].f36188b[i3];
            if (this.w0[i2].length <= i3) {
                s sVarA = this.k0.a(uri);
                s[][] sVarArr = this.w0;
                s[] sVarArr2 = sVarArr[i2];
                int length = sVarArr2.length;
                if (i3 >= length) {
                    int i4 = i3 + 1;
                    sVarArr[i2] = (s[]) Arrays.copyOf(sVarArr2, i4);
                    long[][] jArr = this.x0;
                    jArr[i2] = Arrays.copyOf(jArr[i2], i4);
                    Arrays.fill(this.x0[i2], length, i4, -9223372036854775807L);
                }
                this.w0[i2][i3] = sVarA;
                this.q0.put(sVarA, new ArrayList());
                a(aVar, sVarA);
            }
            s sVar = this.w0[i2][i3];
            l lVar = new l(sVar, new s.a(0, aVar.d), bVar);
            lVar.a(new d(uri, i2, i3));
            List<l> list = this.q0.get(sVar);
            if (list == null) {
                lVar.a();
                return lVar;
            }
            list.add(lVar);
            return lVar;
        }
        l lVar2 = new l(this.j0, aVar, bVar);
        lVar2.a();
        return lVar2;
    }

    @Override // com.smartdigimkt.j4.s
    public void a(r rVar) {
        l lVar = (l) rVar;
        List<l> list = this.q0.get(lVar.X);
        if (list != null) {
            list.remove(lVar);
        }
        lVar.d();
    }

    @Override // com.smartdigimkt.j4.f
    public void a(s.a aVar, s sVar, e0 e0Var, Object obj) {
        if (aVar.a()) {
            a(sVar, aVar.f36016b, aVar.f36017c, e0Var);
        } else {
            b(e0Var, obj);
        }
    }

    @Override // com.smartdigimkt.j4.f
    public s.a a(s.a aVar, s.a aVar2) {
        return aVar.a() ? aVar : aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.k4.a aVar) {
        if (this.v0 == null) {
            s[][] sVarArr = new s[aVar.f36183a][];
            this.w0 = sVarArr;
            Arrays.fill(sVarArr, new s[0]);
            long[][] jArr = new long[aVar.f36183a][];
            this.x0 = jArr;
            Arrays.fill(jArr, new long[0]);
        }
        this.v0 = aVar;
        n();
    }

    private void a(s sVar, int i2, int i3, e0 e0Var) {
        com.smartdigimkt.p4.a.a(e0Var.a() == 1);
        this.x0[i2][i3] = e0Var.a(0, this.r0).d();
        if (this.q0.containsKey(sVar)) {
            List<l> list = this.q0.get(sVar);
            for (int i4 = 0; i4 < list.size(); i4++) {
                list.get(i4).a();
            }
            this.q0.remove(sVar);
        }
        n();
    }
}
