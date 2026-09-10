package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzr extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzs f11167a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zEquals = Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT");
        zzs zzsVar = this.f11167a;
        if (zEquals) {
            zzsVar.f11172e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzsVar.f11172e = false;
        }
    }
}
