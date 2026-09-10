package com.bumptech.glide;

import a7.p;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.a0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import t6.l;
import t6.m;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ComponentCallbacks2, t6.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final w6.f f10502k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f10503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t6.d f10505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f10506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t6.j f10507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f10508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f10509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t6.b f10510h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f10511i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w6.f f10512j;

    static {
        w6.f fVar = (w6.f) new w6.f().c(Bitmap.class);
        fVar.l = true;
        f10502k = fVar;
        ((w6.f) new w6.f().c(r6.c.class)).l = true;
    }

    public k(b bVar, t6.d dVar, t6.j jVar, Context context) {
        w6.f fVar;
        l lVar = new l(12);
        ne.c cVar = bVar.f10463g;
        this.f10508f = new m();
        a0 a0Var = new a0(this, 3);
        this.f10509g = a0Var;
        this.f10503a = bVar;
        this.f10505c = dVar;
        this.f10507e = jVar;
        this.f10506d = lVar;
        this.f10504b = context;
        Context applicationContext = context.getApplicationContext();
        j jVar2 = new j(this, lVar);
        cVar.getClass();
        boolean z10 = b0.b.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        t6.b cVar2 = z10 ? new t6.c(applicationContext, jVar2) : new t6.h();
        this.f10510h = cVar2;
        synchronized (bVar.f10464h) {
            if (bVar.f10464h.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f10464h.add(this);
        }
        char[] cArr = p.f3444a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            dVar.c(this);
        } else {
            p.f().post(a0Var);
        }
        dVar.c(cVar2);
        this.f10511i = new CopyOnWriteArrayList(bVar.f10460d.f10469d);
        e eVar = bVar.f10460d;
        synchronized (eVar) {
            try {
                if (eVar.f10474i == null) {
                    eVar.f10468c.getClass();
                    w6.f fVar2 = new w6.f();
                    fVar2.l = true;
                    eVar.f10474i = fVar2;
                }
                fVar = eVar.f10474i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this) {
            w6.f fVar3 = (w6.f) fVar.clone();
            if (fVar3.l && !fVar3.f52942n) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            fVar3.f52942n = true;
            fVar3.l = true;
            this.f10512j = fVar3;
        }
    }

    @Override // t6.f
    public final synchronized void f() {
        this.f10508f.f();
        k();
    }

    public final i h() {
        return new i(this.f10503a, this, this.f10504b).a(f10502k);
    }

    public final void i(x6.a aVar) {
        if (aVar == null) {
            return;
        }
        boolean zM = m(aVar);
        w6.c cVarD = aVar.d();
        if (zM) {
            return;
        }
        b bVar = this.f10503a;
        synchronized (bVar.f10464h) {
            try {
                Iterator it = bVar.f10464h.iterator();
                while (it.hasNext()) {
                    if (((k) it.next()).m(aVar)) {
                        return;
                    }
                }
                if (cVarD != null) {
                    aVar.b(null);
                    cVarD.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void j() {
        try {
            Iterator it = p.e(this.f10508f.f50552a).iterator();
            while (it.hasNext()) {
                i((x6.a) it.next());
            }
            this.f10508f.f50552a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void k() {
        l lVar = this.f10506d;
        lVar.f50549b = true;
        for (w6.c cVar : p.e((Set) lVar.f50550c)) {
            if (cVar.isRunning()) {
                cVar.pause();
                ((HashSet) lVar.f50551d).add(cVar);
            }
        }
    }

    public final synchronized void l() {
        l lVar = this.f10506d;
        lVar.f50549b = false;
        for (w6.c cVar : p.e((Set) lVar.f50550c)) {
            if (!cVar.h() && !cVar.isRunning()) {
                cVar.j();
            }
        }
        ((HashSet) lVar.f50551d).clear();
    }

    public final synchronized boolean m(x6.a aVar) {
        w6.c cVarD = aVar.d();
        if (cVarD == null) {
            return true;
        }
        if (!this.f10506d.b(cVarD)) {
            return false;
        }
        this.f10508f.f50552a.remove(aVar);
        aVar.b(null);
        return true;
    }

    @Override // t6.f
    public final synchronized void onDestroy() {
        this.f10508f.onDestroy();
        j();
        l lVar = this.f10506d;
        Iterator it = p.e((Set) lVar.f50550c).iterator();
        while (it.hasNext()) {
            lVar.b((w6.c) it.next());
        }
        ((HashSet) lVar.f50551d).clear();
        this.f10505c.b(this);
        this.f10505c.b(this.f10510h);
        p.f().removeCallbacks(this.f10509g);
        b bVar = this.f10503a;
        synchronized (bVar.f10464h) {
            if (!bVar.f10464h.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            bVar.f10464h.remove(this);
        }
    }

    @Override // t6.f
    public final synchronized void onStart() {
        l();
        this.f10508f.onStart();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f10506d + ", treeNode=" + this.f10507e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }
}
