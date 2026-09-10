package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.UserChoiceBillingListener;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f18442f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f18443g;

    public p12(Context context, PurchasesUpdatedListener purchasesUpdatedListener, UserChoiceBillingListener userChoiceBillingListener, wi.b bVar) {
        this.f18438b = context;
        this.f18439c = purchasesUpdatedListener;
        this.f18440d = userChoiceBillingListener;
        this.f18441e = bVar;
        this.f18442f = new ea.x0(this, true);
        this.f18443g = new ea.x0(this, false);
    }

    public void a(ti.b bVar) {
        HashMap map = (HashMap) this.f18438b;
        uj.a.c("FlutterEngineConnectionRegistry#add ".concat(bVar.getClass().getSimpleName()));
        try {
            if (map.containsKey(bVar.getClass())) {
                Log.w("FlutterEngineCxnRegstry", "Attempted to register plugin (" + bVar + ") but it was already registered with this FlutterEngine (" + ((ni.c) this.f18439c) + ").");
                Trace.endSection();
                return;
            }
            bVar.toString();
            map.put(bVar.getClass(), bVar);
            bVar.onAttachedToEngine((ti.a) this.f18440d);
            if (bVar instanceof ui.a) {
                ui.a aVar = (ui.a) bVar;
                ((HashMap) this.f18441e).put(bVar.getClass(), aVar);
                if (f()) {
                    aVar.onAttachedToActivity((fc.f) this.f18443g);
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void b(Activity activity, androidx.lifecycle.o oVar) {
        this.f18443g = new fc.f(activity, oVar);
        boolean booleanExtra = activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false;
        ni.c cVar = (ni.c) this.f18439c;
        cVar.f46754s.f43372v = booleanExtra;
        eb.d0 d0Var = cVar.f46756u;
        io.flutter.embedding.engine.renderer.h hVar = cVar.f46738b;
        n.j jVar = cVar.f46739c;
        io.flutter.plugin.platform.n nVar = (io.flutter.plugin.platform.n) d0Var.f39976b;
        if (nVar.f43354c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        nVar.f43354c = activity;
        nVar.f43357f = hVar;
        nVar.f43359h = new v6.c(jVar, 9);
        io.flutter.plugin.platform.m mVar = (io.flutter.plugin.platform.m) d0Var.f39977c;
        if (mVar.f43338c != null) {
            throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        mVar.f43338c = activity;
        wi.b bVar = new wi.b(jVar, 1);
        mVar.f43342g = bVar;
        bVar.f53212b = mVar.f43350p;
        nVar.f43359h.f52488b = d0Var;
        for (ui.a aVar : ((HashMap) this.f18441e).values()) {
            if (this.f18437a) {
                aVar.onReattachedToActivityForConfigChanges((fc.f) this.f18443g);
            } else {
                aVar.onAttachedToActivity((fc.f) this.f18443g);
            }
        }
        this.f18437a = false;
    }

    public void c() {
        if (!f()) {
            Log.e("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        uj.a.c("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = ((HashMap) this.f18441e).values().iterator();
            while (it.hasNext()) {
                ((ui.a) it.next()).onDetachedFromActivity();
            }
            d();
            Trace.endSection();
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void d() {
        ni.c cVar = (ni.c) this.f18439c;
        io.flutter.plugin.platform.n nVar = cVar.f46754s;
        v6.c cVar2 = nVar.f43359h;
        if (cVar2 != null) {
            cVar2.f52488b = null;
        }
        nVar.c();
        nVar.f43359h = null;
        nVar.f43354c = null;
        nVar.f43357f = null;
        io.flutter.plugin.platform.m mVar = cVar.f46755t;
        wi.b bVar = mVar.f43342g;
        if (bVar != null) {
            bVar.f53212b = null;
        }
        Surface surface = mVar.f43348n;
        if (surface != null) {
            surface.release();
            mVar.f43348n = null;
            mVar.f43349o = null;
        }
        mVar.f43342g = null;
        mVar.f43338c = null;
        this.f18442f = null;
        this.f18443g = null;
    }

    public void e() {
        if (f()) {
            c();
        }
    }

    public boolean f() {
        return ((mi.e) this.f18442f) != null;
    }

    public p12(Context context, int i10) {
        switch (i10) {
            case 2:
                this.f18438b = context;
                this.f18439c = r1.b.f49250c;
                break;
            default:
                this.f18438b = context;
                this.f18439c = l02.f16620f;
                break;
        }
    }

    public p12(Context context, ni.c cVar, ri.d dVar) {
        this.f18438b = new HashMap();
        this.f18441e = new HashMap();
        this.f18437a = false;
        new HashMap();
        new HashMap();
        new HashMap();
        this.f18439c = cVar;
        this.f18440d = new ti.a(context, cVar, cVar.f46739c, cVar.f46738b, cVar.f46754s.f43352a, new s4.i(dVar));
    }
}
