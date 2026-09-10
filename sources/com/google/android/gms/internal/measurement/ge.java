package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.internal.ads.v71;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ge extends BroadcastReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile q6 f23514b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23515a;

    public /* synthetic */ ge(int i10) {
        this.f23515a = i10;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f23515a) {
            case 0:
                String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                if (stringExtra != null) {
                    if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                        StringBuilder sb2 = new StringBuilder(stringExtra.length() + 68);
                        sb2.append("Got an invalid config package for P/H that includes '..': ");
                        sb2.append(stringExtra);
                        sb2.append(". Exiting.");
                        Log.w("PhUpdateBroadcastRecv", sb2.toString());
                    } else {
                        q6 q6Var = f23514b;
                        if (q6Var != null) {
                            nd ndVar = (nd) ((ConcurrentHashMap) ((q6) q6Var.f23891b).f23891b).get(stringExtra);
                            if (ndVar != null) {
                                ndVar.f23780a.b();
                            }
                        } else {
                            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
                        }
                    }
                    break;
                }
                break;
            case 1:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        v71.f21098v = 1;
                    } else if (intExtra == 1) {
                        v71.f21098v = 2;
                    }
                }
                break;
            default:
                ak.f fVar = null;
                if (kotlin.jvm.internal.n.a(intent != null ? intent.getAction() : null, "android.media.RINGER_MODE_CHANGED")) {
                    android.support.v4.media.session.a.B(new fh.b(2, fVar, 5));
                }
                break;
        }
    }
}
