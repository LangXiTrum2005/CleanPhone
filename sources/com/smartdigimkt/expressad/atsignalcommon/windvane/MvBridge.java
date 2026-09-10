package com.smartdigimkt.expressad.atsignalcommon.windvane;

import com.smartdigimkt.n.b;
import com.smartdigimkt.n.f;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class MvBridge extends AbsFeedBackForH5 {
    public void getDeviceInfo(Object obj, String str) {
        WindVaneWebView windVaneWebView = ((b) obj).f36886a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", "hello fail");
            f.a().a(obj, jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void getTitle(Object obj, String str) {
        b bVar = (b) obj;
        WindVaneWebView windVaneWebView = bVar.f36886a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", "hello succ");
            f.a().b(obj, jSONObject.toString());
            f.a().a(bVar, "receiveMessage", jSONObject.toString());
        } catch (Exception unused) {
        }
    }

    public void openWindow(Object obj, String str) {
        WindVaneWebView windVaneWebView = ((b) obj).f36886a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("a", "hello succ");
            f.a().b(obj, jSONObject.toString());
        } catch (Exception unused) {
        }
    }
}
