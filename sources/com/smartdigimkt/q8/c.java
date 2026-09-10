package com.smartdigimkt.q8;

import android.text.TextUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f37950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    WeakReference<e> f37951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.smartdigimkt.h7.c f37952c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f37953e = false;
    private Runnable d = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f37953e = false;
            c.this.b();
        }
    }

    public c(e eVar) {
        this.f37951b = new WeakReference<>(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        WeakReference<e> weakReference = this.f37951b;
        e eVar = weakReference != null ? weakReference.get() : null;
        if (eVar != null) {
            eVar.timeUpRefreshView();
        } else {
            c();
        }
    }

    public synchronized void c() {
        try {
            com.smartdigimkt.h7.c cVar = this.f37952c;
            if (cVar != null) {
                cVar.c();
            }
            this.f37952c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d() {
        try {
            if (TextUtils.isEmpty(this.f37950a)) {
                return;
            }
            com.smartdigimkt.l8.e eVarA = com.smartdigimkt.k8.c.a().a(this.f37950a);
            if (this.f37952c != null) {
                c();
            }
            if (eVarA != null && eVarA.m() == 1) {
                this.f37953e = true;
                long jN = eVarA.n();
                if (jN <= 2000) {
                    jN = 2000;
                }
                com.smartdigimkt.h7.c cVar = new com.smartdigimkt.h7.c(jN, this.d, false);
                this.f37952c = cVar;
                cVar.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void a(String str) {
        this.f37950a = str;
    }

    public boolean a() {
        return this.f37953e;
    }
}
