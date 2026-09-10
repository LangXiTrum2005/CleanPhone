package com.mbridge.msdk.foundation.same.net.wrapper;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.j;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i<T> implements j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.net.b<T> f33891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f33892b = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f33893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f33894b;

        public a(v vVar, q qVar) {
            this.f33893a = vVar;
            this.f33894b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f33891a != null) {
                    i.this.f33891a.onSuccess(i.this.a(this.f33893a, this.f33894b));
                }
            } catch (Exception e10) {
                q0.b("MBridgeRequestListenerWrapper", "onResponseSuccess error", e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f33896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f33897b;

        public b(v vVar, q qVar) {
            this.f33896a = vVar;
            this.f33897b = qVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (i.this.f33891a != null) {
                    i.this.f33891a.onError(i.this.a(this.f33896a.f37037c, this.f33897b));
                }
            } catch (Exception e10) {
                q0.b("MBridgeRequestListenerWrapper", "onResponseError error", e10);
            }
        }
    }

    public i(com.mbridge.msdk.foundation.same.net.b<T> bVar) {
        this.f33891a = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.j
    public void b(com.mbridge.msdk.tracker.network.h<T> hVar, v<T> vVar, q qVar) {
        q0.a("MBridgeRequestListenerWrapper", "onResponseError: " + vVar.f37037c.d() + " " + vVar.f37037c.getMessage());
        this.f33892b.post(new b(vVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.e a(v<T> vVar, q qVar) {
        if (vVar == null) {
            return null;
        }
        return com.mbridge.msdk.foundation.same.net.e.a(vVar.f37035a, new com.mbridge.msdk.foundation.same.net.toolbox.a(qVar.f36960a, qVar.f36961b, qVar.f36963d));
    }

    @Override // com.mbridge.msdk.tracker.network.j
    public void a(com.mbridge.msdk.tracker.network.h<T> hVar, v<T> vVar, q qVar) {
        q0.a("MBridgeRequestListenerWrapper", "onResponseSuccess: " + vVar.f37035a);
        this.f33892b.post(new a(vVar, qVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.net.exception.a a(b0 b0Var, q qVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        if (b0Var == null) {
            return null;
        }
        if (qVar != null) {
            aVar = new com.mbridge.msdk.foundation.same.net.toolbox.a(qVar.f36960a, qVar.f36961b, qVar.f36963d);
        } else {
            aVar = new com.mbridge.msdk.foundation.same.net.toolbox.a(0, null, null);
        }
        if (b0Var.d() == 0) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 1) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(6, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 2) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 4) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(880041, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 5) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(8, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 6) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(15, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 7) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(7, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 8) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(10, aVar, b0Var.getMessage());
        }
        if (b0Var.d() == 9) {
            return new com.mbridge.msdk.foundation.same.net.exception.a(4, aVar, b0Var.getMessage());
        }
        return new com.mbridge.msdk.foundation.same.net.exception.a(2, aVar, b0Var.getMessage());
    }
}
