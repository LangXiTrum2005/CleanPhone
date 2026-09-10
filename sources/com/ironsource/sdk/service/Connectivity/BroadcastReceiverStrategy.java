package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C0474n4;
import com.ironsource.InterfaceC0566s7;
import com.ironsource.InterfaceC0584t7;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class BroadcastReceiverStrategy implements InterfaceC0566s7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0584t7 f30673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f30674b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strB = U3.b(context);
            if (strB.equals("none")) {
                BroadcastReceiverStrategy.this.f30673a.a();
            } else {
                BroadcastReceiverStrategy.this.f30673a.a(strB, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(InterfaceC0584t7 interfaceC0584t7) {
        this.f30673a = interfaceC0584t7;
    }

    @Override // com.ironsource.InterfaceC0566s7
    public void b(Context context) {
        try {
            context.registerReceiver(this.f30674b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC0566s7
    public JSONObject c(Context context) {
        return new JSONObject();
    }

    @Override // com.ironsource.InterfaceC0566s7
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.f30674b);
        } catch (IllegalArgumentException e10) {
            C0474n4.d().a(e10);
        } catch (Exception e11) {
            C0474n4.d().a(e11);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e11);
        }
    }

    @Override // com.ironsource.InterfaceC0566s7
    public void a() {
        this.f30674b = null;
    }
}
