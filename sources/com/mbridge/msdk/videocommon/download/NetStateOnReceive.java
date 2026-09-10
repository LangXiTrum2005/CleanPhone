package com.mbridge.msdk.videocommon.download;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class NetStateOnReceive extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    b.getInstance().b(false);
                } else if (activeNetworkInfo.getType() == 1) {
                    b.getInstance().a(true);
                } else if (activeNetworkInfo.getType() == 0) {
                    b.getInstance().a();
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
