package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;

/* JADX INFO: loaded from: classes6.dex */
public final class bf extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f40836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cf f40837b;

    public bf(cf cfVar, hf hfVar) {
        this.f40837b = cfVar;
        this.f40836a = hfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f40836a.a(new Pair(this.f40837b, intent));
    }
}
