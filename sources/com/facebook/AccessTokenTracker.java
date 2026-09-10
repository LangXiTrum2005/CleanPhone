package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.internal.Validate;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AccessTokenTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BroadcastReceiver f15896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15897b;

    public class CurrentAccessTokenBroadcastReceiver extends BroadcastReceiver {
        public CurrentAccessTokenBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                HashSet hashSet = FacebookSdk.f15915a;
                AccessTokenTracker.this.a((AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (AccessToken) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public AccessTokenTracker() {
        this.f15897b = false;
        Validate.h();
        CurrentAccessTokenBroadcastReceiver currentAccessTokenBroadcastReceiver = new CurrentAccessTokenBroadcastReceiver();
        this.f15896a = currentAccessTokenBroadcastReceiver;
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(FacebookSdk.b());
        if (this.f15897b) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        localBroadcastManager.registerReceiver(currentAccessTokenBroadcastReceiver, intentFilter);
        this.f15897b = true;
    }

    public abstract void a(AccessToken accessToken, AccessToken accessToken2);
}
