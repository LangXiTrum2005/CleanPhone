package com.smartdigimkt.y3;

import android.os.Handler;

/* JADX INFO: loaded from: classes6.dex */
public interface g {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f40053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final g f40054b;

        /* JADX INFO: renamed from: com.smartdigimkt.y3.g$a$a, reason: collision with other inner class name */
        public class RunnableC0645a implements Runnable {
            final /* synthetic */ com.smartdigimkt.z3.d X;

            public RunnableC0645a(com.smartdigimkt.z3.d dVar) {
                this.X = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f40054b.b(this.X);
            }
        }

        public class b implements Runnable {
            final /* synthetic */ String X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ long f40056Y;
            final /* synthetic */ long Z;

            public b(String str, long j, long j2) {
                this.X = str;
                this.f40056Y = j;
                this.Z = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f40054b.b(this.X, this.f40056Y, this.Z);
            }
        }

        public class c implements Runnable {
            final /* synthetic */ com.smartdigimkt.w3.m X;

            public c(com.smartdigimkt.w3.m mVar) {
                this.X = mVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f40054b.a(this.X);
            }
        }

        public class d implements Runnable {
            final /* synthetic */ int X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ long f40058Y;
            final /* synthetic */ long Z;

            public d(int i2, long j, long j2) {
                this.X = i2;
                this.f40058Y = j;
                this.Z = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f40054b.a(this.X, this.f40058Y, this.Z);
            }
        }

        public class e implements Runnable {
            final /* synthetic */ com.smartdigimkt.z3.d X;

            public e(com.smartdigimkt.z3.d dVar) {
                this.X = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a();
                a.this.f40054b.a(this.X);
            }
        }

        public class f implements Runnable {
            final /* synthetic */ int X;

            public f(int i2) {
                this.X = i2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f40054b.a(this.X);
            }
        }

        public a(Handler handler, g gVar) {
            this.f40053a = gVar != null ? (Handler) com.smartdigimkt.p4.a.a(handler) : null;
            this.f40054b = gVar;
        }

        public void b(com.smartdigimkt.z3.d dVar) {
            if (this.f40054b != null) {
                this.f40053a.post(new RunnableC0645a(dVar));
            }
        }

        public void a(String str, long j, long j2) {
            if (this.f40054b != null) {
                this.f40053a.post(new b(str, j, j2));
            }
        }

        public void a(com.smartdigimkt.w3.m mVar) {
            if (this.f40054b != null) {
                this.f40053a.post(new c(mVar));
            }
        }

        public void a(int i2, long j, long j2) {
            if (this.f40054b != null) {
                this.f40053a.post(new d(i2, j, j2));
            }
        }

        public void a(com.smartdigimkt.z3.d dVar) {
            if (this.f40054b != null) {
                this.f40053a.post(new e(dVar));
            }
        }

        public void a(int i2) {
            if (this.f40054b != null) {
                this.f40053a.post(new f(i2));
            }
        }
    }

    void a(int i2);

    void a(int i2, long j, long j2);

    void a(com.smartdigimkt.w3.m mVar);

    void a(com.smartdigimkt.z3.d dVar);

    void b(com.smartdigimkt.z3.d dVar);

    void b(String str, long j, long j2);
}
