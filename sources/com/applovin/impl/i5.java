package com.applovin.impl;

import android.content.Intent;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.communicator.CommunicatorMessageImpl;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i5 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f8140c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8138a = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f8141d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8142e = new Object();

    public i5(String str, AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber) {
        this.f8139b = str;
        this.f8140c = new WeakReference(appLovinCommunicatorSubscriber);
    }

    public AppLovinCommunicatorSubscriber a() {
        return (AppLovinCommunicatorSubscriber) this.f8140c.get();
    }

    public String b() {
        return this.f8139b;
    }

    public boolean c() {
        return this.f8138a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f8140c.get();
        i5 i5Var = (i5) obj;
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber2 = (AppLovinCommunicatorSubscriber) i5Var.f8140c.get();
        return b().equals(i5Var.b()) && (appLovinCommunicatorSubscriber == null ? appLovinCommunicatorSubscriber == appLovinCommunicatorSubscriber2 : appLovinCommunicatorSubscriber.equals(appLovinCommunicatorSubscriber2));
    }

    public int hashCode() {
        int iHashCode = this.f8139b.hashCode();
        AppLovinCommunicatorSubscriber appLovinCommunicatorSubscriber = (AppLovinCommunicatorSubscriber) this.f8140c.get();
        return (iHashCode * 31) + (appLovinCommunicatorSubscriber != null ? appLovinCommunicatorSubscriber.hashCode() : 0);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        boolean z10;
        if (a() == null) {
            com.applovin.impl.sdk.p.h("AppLovinCommunicator", "Message received for GC'd subscriber");
            return;
        }
        CommunicatorMessageImpl communicatorMessageImpl = (CommunicatorMessageImpl) intent;
        synchronized (this.f8142e) {
            try {
                if (this.f8141d.contains(communicatorMessageImpl.getUniqueId())) {
                    z10 = false;
                } else {
                    this.f8141d.add(communicatorMessageImpl.getUniqueId());
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            a().onMessageReceived((AppLovinCommunicatorMessage) communicatorMessageImpl);
        }
    }

    public void a(boolean z10) {
        this.f8138a = z10;
    }
}
