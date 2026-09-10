package com.mbridge.msdk.advanced.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class NetWorkStateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31380c = "NetWorkStateReceiver";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f31381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31382b;

    public NetWorkStateReceiver(WebView webView) {
        this.f31381a = webView;
    }

    public void a() {
        this.f31381a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                a(this.f31381a, 0);
                return;
            }
            if (!com.mbridge.msdk.foundation.same.a.f33739z) {
                a(this.f31381a, 0);
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                a(this.f31381a, 0);
                return;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                if (activeNetworkInfo.getType() == 1) {
                    a(this.f31381a, 9);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    a(this.f31381a, 0);
                    return;
                }
                int networkType = telephonyManager.getNetworkType();
                this.f31382b = networkType;
                int iC = m0.c(networkType);
                this.f31382b = iC;
                a(this.f31381a, iC);
            }
        } catch (Throwable th2) {
            q0.a(f31380c, th2.getMessage());
        }
    }

    public void a(WebView webView, int i10) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a(webView, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th2) {
                q0.a(f31380c, th2.getMessage());
            }
        }
    }
}
