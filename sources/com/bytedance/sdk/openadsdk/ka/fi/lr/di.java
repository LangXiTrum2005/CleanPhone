package com.bytedance.sdk.openadsdk.ka.fi.lr;

import android.os.SystemClock;
import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.component.utils.ac;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import shimmery.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class di extends ik {
    private long ik;
    private int ka = 0;
    private long lr;
    private final com.bykv.vk.openvk.ri.ri.ri.ik.ik ri;

    public di(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar) {
        this.ri = ikVar;
    }

    public void lr(long j) {
        this.ik = j;
    }

    public void ri(long j) {
        this.lr = j;
    }

    public void ri(int i) {
        this.ka = i;
    }

    @Override // com.bytedance.sdk.openadsdk.ka.fi.lr.ik
    public void ri(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.lr);
            jSONObject.put("buffers_time", this.ik);
            jSONObject.put("video_backup", this.ka);
        } catch (Throwable th) {
            ac.ik("FeedOverModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ka.fi.lr.ik
    public void ri(ri riVar) {
        super.ri(riVar);
        JSONObject jSONObjectKa = riVar.ka();
        if (com.bytedance.sdk.openadsdk.wjv.fi.ri("re_vi_en_le", 0) != 1) {
            return;
        }
        File file = new File(this.ri.fi(), this.ri.bu());
        if (file.exists()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                jSONObjectKa.put(AppLovinEventTypes.USER_COMPLETED_LEVEL, saneness.saneness(file.getAbsolutePath()));
                jSONObjectKa.put("level_cost_time", SystemClock.elapsedRealtime() - jElapsedRealtime);
            } catch (JSONException unused) {
            }
        }
    }
}
