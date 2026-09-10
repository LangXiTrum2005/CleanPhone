package com.smartdigimkt.c1;

import android.os.Handler;
import android.os.Looper;
import com.smartdigimkt.x.e;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f34033c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f34034a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34035b;

    /* JADX INFO: renamed from: com.smartdigimkt.c1.a$a, reason: collision with other inner class name */
    public class RunnableC0447a implements Runnable {
        final /* synthetic */ com.smartdigimkt.a1.b X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f34036Y;
        final /* synthetic */ e Z;

        public RunnableC0447a(com.smartdigimkt.a1.b bVar, String str, e eVar) {
            this.X = bVar;
            this.f34036Y = str;
            this.Z = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.a1.b bVar = this.X;
            if (bVar != null) {
                bVar.a(this.f34036Y, this.Z, a.this.f34035b);
            }
        }
    }

    public class b implements Runnable {
        final /* synthetic */ com.smartdigimkt.a1.b X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.y.c f34037Y;

        public b(com.smartdigimkt.a1.b bVar, com.smartdigimkt.y.c cVar) {
            this.X = bVar;
            this.f34037Y = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X != null) {
                this.f34037Y.b(a.this.f34035b);
                this.X.a(this.f34037Y);
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ com.smartdigimkt.a1.b X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f34038Y;

        public c(com.smartdigimkt.a1.b bVar, String str) {
            this.X = bVar;
            this.f34038Y = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.a1.b bVar = this.X;
            if (bVar != null) {
                bVar.a(this.f34038Y, a.this.f34035b);
            }
        }
    }

    public class d implements Runnable {
        final /* synthetic */ com.smartdigimkt.a1.b X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.y.c f34039Y;

        public d(com.smartdigimkt.a1.b bVar, com.smartdigimkt.y.c cVar) {
            this.X = bVar;
            this.f34039Y = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.X != null) {
                this.f34039Y.b(a.this.f34035b);
                this.X.b(this.f34039Y);
            }
        }
    }

    public void b(com.smartdigimkt.a1.b bVar, com.smartdigimkt.y.c cVar) {
        Objects.toString(cVar);
        this.f34034a.post(new d(bVar, cVar));
    }

    public void a(boolean z2) {
        this.f34035b = z2;
    }

    public boolean a() {
        return this.f34035b;
    }

    public void a(com.smartdigimkt.a1.b bVar, e eVar, String str) {
        this.f34034a.post(new RunnableC0447a(bVar, str, eVar));
    }

    public void a(com.smartdigimkt.a1.b bVar, com.smartdigimkt.y.c cVar) {
        this.f34034a.post(new b(bVar, cVar));
    }

    public void a(com.smartdigimkt.a1.b bVar, String str) {
        this.f34034a.post(new c(bVar, str));
    }
}
