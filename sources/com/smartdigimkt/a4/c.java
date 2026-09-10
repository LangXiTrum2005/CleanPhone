package com.smartdigimkt.a4;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public interface c {
    void a();

    void a(Exception exc);

    void b();

    void c();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CopyOnWriteArrayList<e> f33618a = new CopyOnWriteArrayList<>();

        /* JADX INFO: renamed from: com.smartdigimkt.a4.c$a$a, reason: collision with other inner class name */
        public class RunnableC0430a implements Runnable {
            final /* synthetic */ c X;

            public RunnableC0430a(c cVar) {
                this.X = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.c();
            }
        }

        public class b implements Runnable {
            final /* synthetic */ c X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            final /* synthetic */ Exception f33620Y;

            public b(c cVar, Exception exc) {
                this.X = cVar;
                this.f33620Y = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a(this.f33620Y);
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.a4.c$a$c, reason: collision with other inner class name */
        public class RunnableC0431c implements Runnable {
            final /* synthetic */ c X;

            public RunnableC0431c(c cVar) {
                this.X = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.a();
            }
        }

        public class d implements Runnable {
            final /* synthetic */ c X;

            public d(c cVar) {
                this.X = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.X.b();
            }
        }

        public static final class e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Handler f33623a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f33624b;

            public e(Handler handler, c cVar) {
                this.f33623a = handler;
                this.f33624b = cVar;
            }
        }

        public void a(Handler handler, c cVar) {
            com.smartdigimkt.p4.a.a((handler == null || cVar == null) ? false : true);
            this.f33618a.add(new e(handler, cVar));
        }

        public void b() {
            for (e eVar : this.f33618a) {
                eVar.f33623a.post(new d(eVar.f33624b));
            }
        }

        public void c() {
            for (e eVar : this.f33618a) {
                eVar.f33623a.post(new RunnableC0431c(eVar.f33624b));
            }
        }

        public void a(c cVar) {
            for (e eVar : this.f33618a) {
                if (eVar.f33624b == cVar) {
                    this.f33618a.remove(eVar);
                }
            }
        }

        public void a() {
            for (e eVar : this.f33618a) {
                eVar.f33623a.post(new RunnableC0430a(eVar.f33624b));
            }
        }

        public void a(Exception exc) {
            for (e eVar : this.f33618a) {
                eVar.f33623a.post(new b(eVar.f33624b, exc));
            }
        }
    }
}
