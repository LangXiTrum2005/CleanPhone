package com.bytedance.sdk.openadsdk.ka.fi.lr;

import benzoyl.attabal;
import com.bytedance.sdk.component.utils.ac;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import shimmery.saneness;

/* JADX INFO: loaded from: classes2.dex */
public class mj extends ik {
    private long ik;
    private int ka;
    private long lr;
    private final com.bykv.vk.openvk.ri.ri.ri.ik.ik ri;

    public mj(com.bykv.vk.openvk.ri.ri.ri.ik.ik ikVar) {
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
            jSONObject.put("video_start_duration", this.lr);
            jSONObject.put("video_cache_size", this.ik);
            jSONObject.put("is_auto_play", this.ka);
        } catch (Throwable th) {
            ac.ik("FeedPlayModel", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ka.fi.lr.ik
    public void ri(ri riVar) throws Throwable {
        if (this.ri.su()) {
            String strFi = this.ri.fi();
            String strBu = this.ri.bu();
            File fileSaneness = attabal.saneness(strFi, strBu);
            File fileAttabal = attabal.attabal(strFi, strBu);
            if (fileAttabal.exists()) {
                fileSaneness = fileAttabal;
            }
            try {
                riVar.ka().put("moov_box_pos", saneness.attabal(fileSaneness));
            } catch (JSONException unused) {
            }
        }
    }
}
