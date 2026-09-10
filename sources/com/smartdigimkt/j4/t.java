package com.smartdigimkt.j4;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public interface t {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s.a f36019b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<j> f36020c;
        private final long d;

        /* JADX INFO: renamed from: com.smartdigimkt.j4.t$a$a, reason: collision with other inner class name */
        public class RunnableC0510a implements Runnable {
            final /* synthetic */ t X;

            public RunnableC0510a(t tVar) {
                this.X = tVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = this.X;
                a aVar = a.this;
                tVar.b(aVar.f36018a, aVar.f36019b);
            }
        }

        public class b implements Runnable {
            final /* synthetic */ t X;

            public b(t tVar) {
                this.X = tVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = this.X;
                a aVar = a.this;
                tVar.c(aVar.f36018a, aVar.f36019b);
            }
        }

        public class c implements Runnable {
            final /* synthetic */ t X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ b f36023Y;
            final /* synthetic */ c Z;

            public c(t tVar, b bVar, c cVar) {
                this.X = tVar;
                this.f36023Y = bVar;
                this.Z = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = this.X;
                a aVar = a.this;
                tVar.a(aVar.f36018a, aVar.f36019b, this.f36023Y, this.Z);
            }
        }

        public class d implements Runnable {
            final /* synthetic */ t X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ b f36024Y;
            final /* synthetic */ c Z;

            public d(t tVar, b bVar, c cVar) {
                this.X = tVar;
                this.f36024Y = bVar;
                this.Z = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = this.X;
                a aVar = a.this;
                tVar.b(aVar.f36018a, aVar.f36019b, this.f36024Y, this.Z);
            }
        }

        public class e implements Runnable {
            final /* synthetic */ t X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ b f36025Y;
            final /* synthetic */ c Z;

            public e(t tVar, b bVar, c cVar) {
                this.X = tVar;
                this.f36025Y = bVar;
                this.Z = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = this.X;
                a aVar = a.this;
                tVar.c(aVar.f36018a, aVar.f36019b, this.f36025Y, this.Z);
            }
        }

        public class f implements Runnable {
            final /* synthetic */ t X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ b f36026Y;
            final /* synthetic */ c Z;
            final /* synthetic */ IOException e0;
            final /* synthetic */ boolean f0;

            public f(t tVar, b bVar, c cVar, IOException iOException, boolean z2) {
                this.X = tVar;
                this.f36026Y = bVar;
                this.Z = cVar;
                this.e0 = iOException;
                this.f0 = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = this.X;
                a aVar = a.this;
                tVar.a(aVar.f36018a, aVar.f36019b, this.f36026Y, this.Z, this.e0, this.f0);
            }
        }

        public class g implements Runnable {
            final /* synthetic */ t X;

            public g(t tVar) {
                this.X = tVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = this.X;
                a aVar = a.this;
                tVar.a(aVar.f36018a, aVar.f36019b);
            }
        }

        public class h implements Runnable {
            final /* synthetic */ t X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ c f36028Y;

            public h(t tVar, c cVar) {
                this.X = tVar;
                this.f36028Y = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = this.X;
                a aVar = a.this;
                tVar.a(aVar.f36018a, aVar.f36019b, this.f36028Y);
            }
        }

        public class i implements Runnable {
            final /* synthetic */ t X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ c f36029Y;

            public i(t tVar, c cVar) {
                this.X = tVar;
                this.f36029Y = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                t tVar = this.X;
                a aVar = a.this;
                tVar.b(aVar.f36018a, aVar.f36019b, this.f36029Y);
            }
        }

        public static final class j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Handler f36030a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final t f36031b;

            public j(Handler handler, t tVar) {
                this.f36030a = handler;
                this.f36031b = tVar;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public a a(int i2, s.a aVar, long j2) {
            return new a(this.f36020c, i2, aVar, j2);
        }

        public void b() {
            com.smartdigimkt.p4.a.b(this.f36019b != null);
            for (j jVar : this.f36020c) {
                a(jVar.f36030a, new b(jVar.f36031b));
            }
        }

        public void c(b bVar, c cVar) {
            for (j jVar : this.f36020c) {
                a(jVar.f36030a, new c(jVar.f36031b, bVar, cVar));
            }
        }

        private a(CopyOnWriteArrayList<j> copyOnWriteArrayList, int i2, s.a aVar, long j2) {
            this.f36020c = copyOnWriteArrayList;
            this.f36018a = i2;
            this.f36019b = aVar;
            this.d = j2;
        }

        public void a(Handler handler, t tVar) {
            com.smartdigimkt.p4.a.a((handler == null || tVar == null) ? false : true);
            this.f36020c.add(new j(handler, tVar));
        }

        public void a(t tVar) {
            for (j jVar : this.f36020c) {
                if (jVar.f36031b == tVar) {
                    this.f36020c.remove(jVar);
                }
            }
        }

        public void c() {
            com.smartdigimkt.p4.a.b(this.f36019b != null);
            for (j jVar : this.f36020c) {
                a(jVar.f36030a, new g(jVar.f36031b));
            }
        }

        public void b(com.smartdigimkt.n4.k kVar, int i2, long j2, long j3, long j4) {
            b(kVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4);
        }

        public void b(com.smartdigimkt.n4.k kVar, int i2, int i3, com.smartdigimkt.w3.m mVar, int i4, Object obj, long j2, long j3, long j4, long j5, long j6) {
            b(new b(kVar, j4, j5, j6), new c(i2, i3, mVar, i4, obj, a(j2), a(j3)));
        }

        public void a() {
            com.smartdigimkt.p4.a.b(this.f36019b != null);
            for (j jVar : this.f36020c) {
                a(jVar.f36030a, new RunnableC0510a(jVar.f36031b));
            }
        }

        public void b(b bVar, c cVar) {
            for (j jVar : this.f36020c) {
                a(jVar.f36030a, new d(jVar.f36031b, bVar, cVar));
            }
        }

        public void a(com.smartdigimkt.n4.k kVar, int i2, long j2) {
            a(kVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2);
        }

        public void a(com.smartdigimkt.n4.k kVar, int i2, int i3, com.smartdigimkt.w3.m mVar, int i4, Object obj, long j2, long j3, long j4) {
            c(new b(kVar, j4, 0L, 0L), new c(i2, i3, mVar, i4, obj, a(j2), a(j3)));
        }

        public void b(c cVar) {
            for (j jVar : this.f36020c) {
                a(jVar.f36030a, new h(jVar.f36031b, cVar));
            }
        }

        public void a(com.smartdigimkt.n4.k kVar, int i2, long j2, long j3, long j4) {
            a(kVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4);
        }

        public void a(com.smartdigimkt.n4.k kVar, int i2, int i3, com.smartdigimkt.w3.m mVar, int i4, Object obj, long j2, long j3, long j4, long j5, long j6) {
            a(new b(kVar, j4, j5, j6), new c(i2, i3, mVar, i4, obj, a(j2), a(j3)));
        }

        public void a(b bVar, c cVar) {
            for (j jVar : this.f36020c) {
                a(jVar.f36030a, new e(jVar.f36031b, bVar, cVar));
            }
        }

        public void a(com.smartdigimkt.n4.k kVar, int i2, long j2, long j3, long j4, IOException iOException, boolean z2) {
            a(kVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4, iOException, z2);
        }

        public void a(com.smartdigimkt.n4.k kVar, int i2, int i3, com.smartdigimkt.w3.m mVar, int i4, Object obj, long j2, long j3, long j4, long j5, long j6, IOException iOException, boolean z2) {
            a(new b(kVar, j4, j5, j6), new c(i2, i3, mVar, i4, obj, a(j2), a(j3)), iOException, z2);
        }

        public void a(b bVar, c cVar, IOException iOException, boolean z2) {
            for (j jVar : this.f36020c) {
                a(jVar.f36030a, new f(jVar.f36031b, bVar, cVar, iOException, z2));
            }
        }

        public void a(int i2, long j2, long j3) {
            b(new c(1, i2, null, 3, null, a(j2), a(j3)));
        }

        public void a(int i2, com.smartdigimkt.w3.m mVar, int i3, Object obj, long j2) {
            a(new c(1, i2, mVar, i3, obj, a(j2), -9223372036854775807L));
        }

        public void a(c cVar) {
            for (j jVar : this.f36020c) {
                a(jVar.f36030a, new i(jVar.f36031b, cVar));
            }
        }

        private long a(long j2) {
            long jB = com.smartdigimkt.w3.b.b(j2);
            if (jB == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + jB;
        }

        private void a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.smartdigimkt.n4.k f36032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f36033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f36034c;
        public final long d;

        public b(com.smartdigimkt.n4.k kVar, long j, long j2, long j3) {
            this.f36032a = kVar;
            this.f36033b = j;
            this.f36034c = j2;
            this.d = j3;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.smartdigimkt.w3.m f36037c;
        public final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f36038e;
        public final long f;
        public final long g;

        public c(int i2, int i3, com.smartdigimkt.w3.m mVar, int i4, Object obj, long j, long j2) {
            this.f36035a = i2;
            this.f36036b = i3;
            this.f36037c = mVar;
            this.d = i4;
            this.f36038e = obj;
            this.f = j;
            this.g = j2;
        }
    }

    void a(int i2, s.a aVar);

    void a(int i2, s.a aVar, b bVar, c cVar);

    void a(int i2, s.a aVar, b bVar, c cVar, IOException iOException, boolean z2);

    void a(int i2, s.a aVar, c cVar);

    void b(int i2, s.a aVar);

    void b(int i2, s.a aVar, b bVar, c cVar);

    void b(int i2, s.a aVar, c cVar);

    void c(int i2, s.a aVar);

    void c(int i2, s.a aVar, b bVar, c cVar);
}
