package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.t1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.applovin.impl.sdk.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0961a implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f11660e = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f11661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f11662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet f11663c = new HashSet();
    private final Object d = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    public interface InterfaceC0038a {
        void onAdExpired(t1 t1Var);
    }

    public C0961a(k kVar) {
        this.f11661a = kVar;
        this.f11662b = kVar.O();
    }

    private b b(t1 t1Var) {
        synchronized (this.d) {
            try {
                if (t1Var == null) {
                    return null;
                }
                for (b bVar : this.f11663c) {
                    if (t1Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean a(t1 t1Var, InterfaceC0038a interfaceC0038a) {
        synchronized (this.d) {
            try {
                if (b(t1Var) != null) {
                    if (o.a()) {
                        this.f11662b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + t1Var);
                    }
                    return true;
                }
                if (t1Var.getTimeToLiveMillis() <= f11660e) {
                    if (o.a()) {
                        this.f11662b.a("AdExpirationManager", "Ad has already expired: " + t1Var);
                    }
                    t1Var.setExpired();
                    return false;
                }
                if (o.a()) {
                    this.f11662b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(t1Var.getTimeToLiveMillis()) + " seconds from now for " + t1Var + "...");
                }
                if (this.f11663c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f11663c.add(b.a(t1Var, interfaceC0038a, this.f11661a));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            a();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            b();
        }
    }

    private void b() {
        HashSet<b> hashSet = new HashSet();
        synchronized (this.d) {
            try {
                for (b bVar : this.f11663c) {
                    t1 t1VarB = bVar.b();
                    if (t1VarB == null) {
                        hashSet.add(bVar);
                    } else {
                        long timeToLiveMillis = t1VarB.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (o.a()) {
                                this.f11662b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + t1VarB);
                            }
                            hashSet.add(bVar);
                        } else {
                            if (o.a()) {
                                this.f11662b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + t1VarB);
                            }
                            bVar.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (b bVar2 : hashSet) {
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(t1 t1Var) {
        synchronized (this.d) {
            try {
                b bVarB = b(t1Var);
                if (bVarB != null) {
                    if (o.a()) {
                        this.f11662b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + t1Var);
                    }
                    bVarB.a();
                    a(bVarB);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.d) {
            try {
                this.f11663c.remove(bVar);
                if (this.f11663c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a() {
        synchronized (this.d) {
            try {
                Iterator it = this.f11663c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
