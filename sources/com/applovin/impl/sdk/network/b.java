package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.fragment.app.n;
import com.applovin.impl.f6;
import com.applovin.impl.k5;
import com.applovin.impl.q7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.p;
import com.applovin.impl.u6;
import com.applovin.impl.v2;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class b implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f9622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f9623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f9624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f9625e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f9626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f9627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f9628h;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements AppLovinPostbackListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f9629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AppLovinPostbackListener f9630b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.f9629a = dVar;
            this.f9630b = appLovinPostbackListener;
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            p unused = b.this.f9622b;
            if (p.a()) {
                b.this.f9622b.d("PersistentPostbackManager", "Failed to submit postback: " + this.f9629a + " with error code: " + i10 + "; will retry later...");
            }
            b.this.d(this.f9629a);
            v2.a(this.f9630b, str, i10);
            if (this.f9629a.c() == 1) {
                b.this.f9621a.E().a("dispatchPostback", str, i10, (String) null);
            }
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            b.this.a(this.f9629a);
            p unused = b.this.f9622b;
            if (p.a()) {
                b.this.f9622b.a("PersistentPostbackManager", "Successfully submit postback: " + this.f9629a);
            }
            b.this.c();
            v2.a(this.f9630b, str);
        }
    }

    public b(l lVar) {
        ArrayList arrayList = new ArrayList();
        this.f9626f = arrayList;
        this.f9627g = new HashSet();
        this.f9628h = new ArrayList();
        if (lVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f9621a = lVar;
        this.f9622b = lVar.Q();
        int iIntValue = ((Integer) lVar.a(z4.N2)).intValue();
        this.f9623c = iIntValue;
        if (!((Boolean) lVar.a(z4.Q2)).booleanValue()) {
            this.f9624d = null;
            return;
        }
        c cVar = new c(this, lVar);
        this.f9624d = cVar;
        arrayList.addAll(cVar.a(iIntValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        this.f9621a.s0().a((k5) this.f9624d, f6.b.OTHER);
    }

    private void c(d dVar) {
        synchronized (this.f9625e) {
            while (this.f9626f.size() > this.f9623c) {
                try {
                    this.f9626f.remove(0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f9626f.add(dVar);
        }
        if (p.a()) {
            this.f9622b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f9625e) {
            try {
                if (((Boolean) this.f9621a.a(z4.P2)).booleanValue()) {
                    arrayList.ensureCapacity(this.f9628h.size());
                    arrayList.addAll(this.f9628h);
                } else {
                    arrayList.ensureCapacity(this.f9626f.size());
                    arrayList.addAll(this.f9626f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.f9625e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        synchronized (this.f9625e) {
            try {
                Iterator it = new ArrayList(this.f9626f).iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(d dVar, boolean z10) {
        a(dVar, z10, (AppLovinPostbackListener) null);
    }

    public void a(d dVar, boolean z10, AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (p.a()) {
                this.f9622b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z10) {
                dVar.a();
            }
            a(new androidx.fragment.app.d(this, dVar, appLovinPostbackListener, 22), q7.i(), dVar.m());
        }
    }

    public void b() {
        a((Runnable) new n(this, 11), true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f9625e) {
            try {
                Iterator it = this.f9628h.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.f9628h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f9625e) {
            this.f9626f.clear();
            this.f9628h.clear();
        }
        this.f9621a.s0().a((k5) this.f9624d, f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(d dVar) {
        synchronized (this.f9625e) {
            this.f9627g.remove(dVar);
            this.f9628h.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (p.a()) {
            this.f9622b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.f9621a.G0() && !dVar.m()) {
            if (p.a()) {
                this.f9622b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (p.a()) {
                this.f9622b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.f9625e) {
            try {
                if (this.f9627g.contains(dVar)) {
                    if (p.a()) {
                        this.f9622b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.f9621a.a(z4.M2);
                if (dVar.c() > num.intValue()) {
                    if (p.a()) {
                        this.f9622b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.f9625e) {
                    this.f9627g.add(dVar);
                }
                e eVarB = e.b(this.f9621a).b(dVar.k()).a(dVar.d()).b(dVar.i()).c(dVar.h()).a(dVar.g()).a(dVar.j() != null ? new JSONObject(dVar.j()) : null).b(dVar.o()).a(dVar.n()).a(dVar.f()).h(dVar.p()).e(dVar.e()).a();
                if (p.a()) {
                    this.f9622b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.f9621a.i0().dispatchPostbackRequest(eVarB, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar) {
        synchronized (this.f9625e) {
            this.f9627g.remove(dVar);
            this.f9626f.remove(dVar);
        }
        if (p.a()) {
            this.f9622b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z10, boolean z11) {
        if (z10) {
            this.f9621a.s0().a((k5) new u6(this.f9621a, z11, "runPostbackTask", runnable), f6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
