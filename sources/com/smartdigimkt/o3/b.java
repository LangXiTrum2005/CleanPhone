package com.smartdigimkt.o3;

import com.smartdigimkt.sdk.api.IOfferClickHandler;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class b implements com.smartdigimkt.m3.g.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    com.smartdigimkt.m3.g.d f37336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f37337b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f37338c = false;
    boolean d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f37339e;
    private boolean f;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.m3.g.d dVar = b.this.f37336a;
            if (dVar != null) {
                dVar.clickStartUI();
            }
        }
    }

    /* JADX INFO: renamed from: com.smartdigimkt.o3.b$b, reason: collision with other inner class name */
    public class RunnableC0558b implements Runnable {
        public RunnableC0558b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.m3.g.d dVar = b.this.f37336a;
            if (dVar != null) {
                dVar.clickEndUI();
            }
        }
    }

    public b() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f37339e = atomicBoolean;
        this.f = false;
        atomicBoolean.set(false);
        this.f = false;
        c();
    }

    public void a(com.smartdigimkt.m3.g.d dVar) {
        this.f37336a = dVar;
    }

    public boolean b() {
        return this.f37339e.get();
    }

    public void c() {
        this.f37337b = false;
        this.f37338c = false;
        this.d = false;
    }

    @Override // com.smartdigimkt.m3.g.d
    public void clickCallback() {
        if (this.f || this.f37337b) {
            return;
        }
        this.f37337b = true;
        com.smartdigimkt.m3.g.d dVar = this.f37336a;
        if (dVar != null) {
            dVar.clickCallback();
        }
    }

    @Override // com.smartdigimkt.m3.g.d
    public void clickEndUI() {
        this.f37339e.set(false);
        if (this.f || this.d) {
            return;
        }
        this.d = true;
        com.smartdigimkt.l7.b.a().e(new RunnableC0558b());
    }

    @Override // com.smartdigimkt.m3.g.d
    public void clickStartUI() {
        if (this.f || this.f37338c) {
            return;
        }
        this.f37338c = true;
        com.smartdigimkt.l7.b.a().e(new a());
    }

    public void d() {
        this.f37339e.set(true);
        c();
    }

    @Override // com.smartdigimkt.m3.g.d
    public void deeplinkCallback(boolean z2) {
        com.smartdigimkt.m3.g.d dVar;
        if (this.f || (dVar = this.f37336a) == null) {
            return;
        }
        dVar.deeplinkCallback(z2);
    }

    @Override // com.smartdigimkt.m3.g.d
    public boolean openInternalWebView(String str, IOfferClickHandler iOfferClickHandler) {
        com.smartdigimkt.m3.g.d dVar = this.f37336a;
        if (dVar != null) {
            return dVar.openInternalWebView(str, iOfferClickHandler);
        }
        return false;
    }

    public void a() {
        this.f37336a = null;
        this.f37339e.set(false);
        this.f = true;
    }
}
