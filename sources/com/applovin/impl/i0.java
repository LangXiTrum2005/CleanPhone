package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class i0 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f8121c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j7 f8122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f8123b;

    private i0(long j10, boolean z10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        this.f8122a = j7.a(j10, z10, lVar, new cj.i(this, z10, runnable, 1));
        this.f8123b = lVar;
        f8121c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public long b() {
        return this.f8122a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f8122a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f8122a.e();
        }
    }

    public static i0 a(long j10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return a(j10, false, lVar, runnable);
    }

    public static i0 a(long j10, boolean z10, com.applovin.impl.sdk.l lVar, Runnable runnable) {
        return new i0(j10, z10, lVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Runnable runnable) {
        if (!z10) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.f8122a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f8121c.remove(this);
    }
}
