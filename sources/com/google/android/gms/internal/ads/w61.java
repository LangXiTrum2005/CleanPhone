package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w61 extends BroadcastReceiver implements p61, b31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f21432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21433c = true;

    public w61(Context context, ExecutorService executorService) {
        this.f21431a = context;
        this.f21432b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void a(HashMap map, Context context, View view) {
        boolean z10;
        synchronized (this) {
            z10 = this.f21433c;
        }
        map.put("up", Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void b(HashMap map) {
        boolean z10;
        synchronized (this) {
            z10 = this.f21433c;
        }
        map.put("up", Boolean.valueOf(z10));
    }

    @Override // com.google.android.gms.internal.ads.p61
    public final void c(HashMap map) {
        boolean z10;
        synchronized (this) {
            z10 = this.f21433c;
        }
        map.put("up", Boolean.valueOf(z10));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.f21433c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            synchronized (this) {
                this.f21433c = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b31
    public final ListenableFuture zza() {
        return zw1.o(this.f21432b, new ns0(this, 10));
    }
}
