package com.p004ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.p004ironsource.a9;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.pf;
import com.p004ironsource.q9;
import com.p004ironsource.qf;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class BroadcastReceiverStrategy implements pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qf f27154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f27155b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strB = a9.b(context);
            if (strB.equals("none")) {
                BroadcastReceiverStrategy.this.f27154a.a();
            } else {
                BroadcastReceiverStrategy.this.f27154a.a(strB, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(qf qfVar) {
        this.f27154a = qfVar;
    }

    @Override // com.p004ironsource.pf
    public void b(Context context) {
        try {
            context.registerReceiver(this.f27155b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
        }
    }

    @Override // com.p004ironsource.pf
    public JSONObject c(Context context) {
        return new JSONObject();
    }

    @Override // com.p004ironsource.pf
    public void a() {
        this.f27155b = null;
    }

    @Override // com.p004ironsource.pf
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.f27155b);
        } catch (IllegalArgumentException e2) {
            q9.d().a(e2);
        } catch (Exception e3) {
            q9.d().a(e3);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e3);
        }
    }
}
