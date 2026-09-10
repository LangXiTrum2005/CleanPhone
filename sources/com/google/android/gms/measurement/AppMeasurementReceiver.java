package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import d1.a;
import ea.m1;
import ea.s0;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f24512c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f24512c == null) {
            this.f24512c = new i(this);
        }
        i iVar = this.f24512c;
        iVar.getClass();
        s0 s0Var = m1.n(context, null, null, null).f39587f;
        m1.h(s0Var);
        if (intent == null) {
            s0Var.f39756i.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        s0Var.f39760n.c(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                s0Var.f39756i.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        s0Var.f39760n.b("Starting wakeful intent.");
        ((AppMeasurementReceiver) iVar.f50111a).getClass();
        SparseArray sparseArray = a.f38618a;
        synchronized (sparseArray) {
            try {
                int i10 = a.f38619b;
                int i11 = i10 + 1;
                a.f38619b = i11;
                if (i11 <= 0) {
                    a.f38619b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i10);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                sparseArray.put(i10, wakeLockNewWakeLock);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
