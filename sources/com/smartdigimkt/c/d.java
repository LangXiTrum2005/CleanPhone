package com.smartdigimkt.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.webkit.WebView;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.n;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f34011c = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f34012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34013b;

    public d(WebView webView) {
        this.f34012a = webView;
    }

    public void a() {
        this.f34012a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                a(this.f34012a, 0);
                return;
            }
            if (!com.smartdigimkt.b0.a.a2) {
                a(this.f34012a, 0);
                return;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                a(this.f34012a, 0);
                return;
            }
            if (activeNetworkInfo.getState() != NetworkInfo.State.CONNECTING && activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTING) {
                if (activeNetworkInfo.getType() == 1) {
                    a(this.f34012a, 9);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    a(this.f34012a, 0);
                    return;
                }
                int networkType = telephonyManager.getNetworkType();
                this.f34013b = networkType;
                int iB = n.b(networkType);
                this.f34013b = iB;
                a(this.f34012a, iB);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void a(WebView webView, int i2) {
        if (webView != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f34668n, i2);
                h.a().a(webView, NativeAdvancedJsUtils.m, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
