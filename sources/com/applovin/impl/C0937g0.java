package com.applovin.impl;

import A.RunnableC0899k;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0937g0 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f10858c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f10859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f10860b;

    private C0937g0(long j, boolean z2, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f10859a = g7.a(j, z2, kVar, new RunnableC0899k(this, z2, runnable, 3));
        this.f10860b = kVar;
        f10858c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public long b() {
        return this.f10859a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f10859a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f10859a.e();
        }
    }

    public static C0937g0 a(long j, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j, false, kVar, runnable);
    }

    public static C0937g0 a(long j, boolean z2, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new C0937g0(j, z2, kVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, Runnable runnable) {
        if (!z2) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.f10859a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f10858c.remove(this);
    }
}
