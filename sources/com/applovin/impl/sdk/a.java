package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.u1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class a implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f9335e = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f9336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f9337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashSet f9338c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f9339d = new Object();

    /* JADX INFO: renamed from: com.applovin.impl.sdk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface InterfaceC0015a {
        void onAdExpired(u1 u1Var);
    }

    public a(l lVar) {
        this.f9336a = lVar;
        this.f9337b = lVar.Q();
    }

    private b b(u1 u1Var) {
        synchronized (this.f9339d) {
            try {
                if (u1Var == null) {
                    return null;
                }
                for (b bVar : this.f9338c) {
                    if (u1Var == bVar.b()) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean a(u1 u1Var, InterfaceC0015a interfaceC0015a) {
        synchronized (this.f9339d) {
            try {
                if (b(u1Var) != null) {
                    if (p.a()) {
                        this.f9337b.a("AdExpirationManager", "Ad expiration already scheduled for ad: " + u1Var);
                    }
                    return true;
                }
                if (u1Var.getTimeToLiveMillis() <= f9335e) {
                    if (p.a()) {
                        this.f9337b.a("AdExpirationManager", "Ad has already expired: " + u1Var);
                    }
                    u1Var.setExpired();
                    return false;
                }
                if (p.a()) {
                    this.f9337b.a("AdExpirationManager", "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(u1Var.getTimeToLiveMillis()) + " seconds from now for " + u1Var + "...");
                }
                if (this.f9338c.isEmpty()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                }
                this.f9338c.add(b.a(u1Var, interfaceC0015a, this.f9336a));
                return true;
            } catch (Throwable th2) {
                throw th2;
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
        synchronized (this.f9339d) {
            try {
                for (b bVar : this.f9338c) {
                    u1 u1VarB = bVar.b();
                    if (u1VarB == null) {
                        hashSet.add(bVar);
                    } else {
                        long timeToLiveMillis = u1VarB.getTimeToLiveMillis();
                        if (timeToLiveMillis <= 0) {
                            if (p.a()) {
                                this.f9337b.a("AdExpirationManager", "Ad expired while app was paused. Preparing to notify listener for ad: " + u1VarB);
                            }
                            hashSet.add(bVar);
                        } else {
                            if (p.a()) {
                                this.f9337b.a("AdExpirationManager", "Rescheduling expiration with remaining " + TimeUnit.MILLISECONDS.toSeconds(timeToLiveMillis) + " seconds for ad: " + u1VarB);
                            }
                            bVar.a(timeToLiveMillis);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (b bVar2 : hashSet) {
            a(bVar2);
            bVar2.d();
        }
    }

    public void a(u1 u1Var) {
        synchronized (this.f9339d) {
            try {
                b bVarB = b(u1Var);
                if (bVarB != null) {
                    if (p.a()) {
                        this.f9337b.a("AdExpirationManager", "Cancelling expiration timer for ad: " + u1Var);
                    }
                    bVarB.a();
                    a(bVarB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(b bVar) {
        synchronized (this.f9339d) {
            try {
                this.f9338c.remove(bVar);
                if (this.f9338c.isEmpty()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void a() {
        synchronized (this.f9339d) {
            try {
                Iterator it = this.f9338c.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
