package com.smartdigimkt.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import com.smartdigimkt.m.a;
import com.smartdigimkt.n.b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AbsFeedBackForH5 extends BaseAbsFeedBackForH5 {
    @Override // com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5
    public void getCacheKey(Object obj, String str) {
        try {
            a.a().a(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
            th.printStackTrace();
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5
    public void startShake(Object obj, String str) {
        Object obj2;
        try {
            if (TextUtils.isEmpty(str)) {
                obj2 = obj;
            } else {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt("deviceMotionUpdateInterval", 1);
                obj2 = obj;
                try {
                    a.a().a(obj2, ((b) obj).f36886a, jSONObject.optString("oldCache", ""), jSONObject.optString(com.smartdigimkt.q0.b.O, ""), iOptInt);
                } catch (Throwable th) {
                    th = th;
                    callbackExcep(obj2, th.getMessage());
                    return;
                }
            }
            callbackSuccess(obj2);
        } catch (Throwable th2) {
            th = th2;
            obj2 = obj;
        }
    }

    @Override // com.smartdigimkt.expressad.atsignalcommon.windvane.BaseAbsFeedBackForH5
    public void stopShake(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                a.a().a(obj, ((b) obj).f36886a, new JSONObject(str).optString(com.smartdigimkt.q0.b.O, ""));
            }
            callbackSuccess(obj);
        } catch (Throwable th) {
            callbackExcep(obj, th.getMessage());
        }
    }
}
