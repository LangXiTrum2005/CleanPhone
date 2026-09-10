package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes6.dex */
public final class yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f41706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f41707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41708c;

    public yb(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f41706a = intentFilter;
        this.f41707b = broadcastReceiver;
    }
}
