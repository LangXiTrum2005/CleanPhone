package com.google.android.gms.common.api.internal;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.measurement.u6;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11774a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f11775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11776c;

    public /* synthetic */ w() {
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        com.adjust.sdk.i0 i0Var = (com.adjust.sdk.i0) this.f11776c;
        if (i0Var != null) {
            Context context = ((FirebaseMessaging) i0Var.f6859e).f24676b;
            this.f11775b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f11774a) {
            case 0:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    n nVar = (n) this.f11776c;
                    o oVar = (o) ((i0) nVar.f11738b).f11721c;
                    oVar.f11742b.set(null);
                    u6 u6Var = oVar.f11746f.f11705n;
                    u6Var.sendMessage(u6Var.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) nVar.f11737a;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context2 = this.f11775b;
                            if (context2 != null) {
                                context2.unregisterReceiver(this);
                            }
                            this.f11775b = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            default:
                com.adjust.sdk.i0 i0Var = (com.adjust.sdk.i0) this.f11776c;
                if (i0Var != null && i0Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    com.adjust.sdk.i0 i0Var2 = (com.adjust.sdk.i0) this.f11776c;
                    ((FirebaseMessaging) i0Var2.f6859e).getClass();
                    FirebaseMessaging.c(i0Var2, 0L);
                    Context context3 = this.f11775b;
                    if (context3 != null) {
                        context3.unregisterReceiver(this);
                    }
                    this.f11776c = null;
                    return;
                }
                return;
        }
    }

    public w(n nVar) {
        this.f11776c = nVar;
    }
}
