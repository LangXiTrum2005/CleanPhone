package com.unity3d.services.core.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import d5.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class BroadcastEventReceiver extends BroadcastReceiver {
    private String _name;

    public BroadcastEventReceiver(String str) {
        this._name = str;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String dataString = intent.getDataString() != null ? intent.getDataString() : "";
        JSONObject jSONObject = new JSONObject();
        try {
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                for (String str : extras.keySet()) {
                    jSONObject.put(str, extras.get(str));
                }
            }
        } catch (JSONException e10) {
            StringBuilder sbK = u.k("JSONException when composing extras for broadcast action ", action, ": ");
            sbK.append(e10.getMessage());
            DeviceLog.debug(sbK.toString());
        }
        WebViewApp currentApp = WebViewApp.getCurrentApp();
        if (currentApp == null || !currentApp.isWebAppLoaded()) {
            return;
        }
        currentApp.sendEvent(WebViewEventCategory.BROADCAST, BroadcastEvent.ACTION, this._name, action, dataString, jSONObject);
    }
}
