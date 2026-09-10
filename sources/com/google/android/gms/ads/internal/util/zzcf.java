package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzcf extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzcg f11110a;

    public zzcf(zzcg zzcgVar) {
        this.f11110a = zzcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zzcg zzcgVar = this.f11110a;
        synchronized (zzcgVar) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : zzcgVar.f11112b.entrySet()) {
                    if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                        arrayList.add((BroadcastReceiver) entry.getKey());
                    }
                }
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((BroadcastReceiver) arrayList.get(i10)).onReceive(context, intent);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
