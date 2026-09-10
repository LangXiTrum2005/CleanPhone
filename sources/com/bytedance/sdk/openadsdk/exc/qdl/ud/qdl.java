package com.bytedance.sdk.openadsdk.exc.qdl.ud;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.fco;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class qdl {
    private static volatile qdl mml;
    private AtomicLong qdl = new AtomicLong(0);
    private int ud = 0;
    private String lnr = "";

    private qdl() {
    }

    public static qdl qdl() {
        if (mml == null) {
            synchronized (qdl.class) {
                try {
                    if (mml == null) {
                        mml = new qdl();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mml;
    }

    public boolean lnr() {
        return rq.lnr().bqt("gaid");
    }

    public String ud() {
        return lnr() ? this.lnr : "";
    }

    public void qdl(String str) {
        this.lnr = str;
    }

    public void qdl(boolean z2) {
        if (this.ud == 1 || !TextUtils.isEmpty(ud())) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (z2 || this.qdl.get() <= jElapsedRealtime) {
            this.qdl.set(jElapsedRealtime + 300000);
            fco.qdl((jpc) new DeviceUtils.lnr());
        }
    }

    public void qdl(int i2) {
        this.ud = i2;
    }

    public void qdl(JSONObject jSONObject) {
        if (!lnr() || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("gaid", this.lnr);
        } catch (JSONException unused) {
        }
    }
}
