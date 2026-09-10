package com.smartdigimkt.q4;

import android.os.Handler;
import android.view.Surface;
import com.smartdigimkt.w3.m;

/* JADX INFO: loaded from: classes6.dex */
public interface h {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f37916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f37917b;

        /* JADX INFO: renamed from: com.smartdigimkt.q4.h$a$a, reason: collision with other inner class name */
        public class RunnableC0570a implements Runnable {
            final /* synthetic */ com.smartdigimkt.z3.d X;

            public RunnableC0570a(com.smartdigimkt.z3.d dVar) {
                this.X = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f37917b.d(this.X);
            }
        }

        public class b implements Runnable {
            final /* synthetic */ String X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ long f37919Y;
            final /* synthetic */ long Z;

            public b(String str, long j, long j2) {
                this.X = str;
                this.f37919Y = j;
                this.Z = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f37917b.a(this.X, this.f37919Y, this.Z);
            }
        }

        public class c implements Runnable {
            final /* synthetic */ m X;

            public c(m mVar) {
                this.X = mVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f37917b.b(this.X);
            }
        }

        public class d implements Runnable {
            final /* synthetic */ int X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ long f37921Y;

            public d(int i2, long j) {
                this.X = i2;
                this.f37921Y = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f37917b.a(this.X, this.f37921Y);
            }
        }

        public class e implements Runnable {
            final /* synthetic */ int X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ int f37922Y;
            final /* synthetic */ int Z;
            final /* synthetic */ float e0;

            public e(int i2, int i3, int i4, float f) {
                this.X = i2;
                this.f37922Y = i3;
                this.Z = i4;
                this.e0 = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f37917b.a(this.X, this.f37922Y, this.Z, this.e0);
            }
        }

        public class f implements Runnable {
            final /* synthetic */ Surface X;

            public f(Surface surface) {
                this.X = surface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f37917b.a(this.X);
            }
        }

        public class g implements Runnable {
            final /* synthetic */ com.smartdigimkt.z3.d X;

            public g(com.smartdigimkt.z3.d dVar) {
                this.X = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a();
                a.this.f37917b.c(this.X);
            }
        }

        public a(Handler handler, h hVar) {
            this.f37916a = hVar != null ? (Handler) com.smartdigimkt.p4.a.a(handler) : null;
            this.f37917b = hVar;
        }

        public void b(com.smartdigimkt.z3.d dVar) {
            if (this.f37917b != null) {
                this.f37916a.post(new RunnableC0570a(dVar));
            }
        }

        public void a(String str, long j, long j2) {
            if (this.f37917b != null) {
                this.f37916a.post(new b(str, j, j2));
            }
        }

        public void a(m mVar) {
            if (this.f37917b != null) {
                this.f37916a.post(new c(mVar));
            }
        }

        public void a(int i2, long j) {
            if (this.f37917b != null) {
                this.f37916a.post(new d(i2, j));
            }
        }

        public void a(int i2, int i3, int i4, float f2) {
            if (this.f37917b != null) {
                this.f37916a.post(new e(i2, i3, i4, f2));
            }
        }

        public void a(Surface surface) {
            if (this.f37917b != null) {
                this.f37916a.post(new f(surface));
            }
        }

        public void a(com.smartdigimkt.z3.d dVar) {
            if (this.f37917b != null) {
                this.f37916a.post(new g(dVar));
            }
        }
    }

    void a(int i2, int i3, int i4, float f);

    void a(int i2, long j);

    void a(Surface surface);

    void a(String str, long j, long j2);

    void b(m mVar);

    void c(com.smartdigimkt.z3.d dVar);

    void d(com.smartdigimkt.z3.d dVar);
}
