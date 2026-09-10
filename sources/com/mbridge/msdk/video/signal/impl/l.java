package com.mbridge.msdk.video.signal.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class l extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f38176s = true;

    private com.mbridge.msdk.click.a q() {
        if (this.l == null) {
            this.l = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f38148j);
        }
        return this.l;
    }

    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put(X3.i.G, new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void a(CampaignEx campaignEx, Context context) {
        String queryParameter;
        try {
            queryParameter = Uri.parse(campaignEx.getNoticeUrl()).getQueryParameter(com.mbridge.msdk.foundation.same.a.f33726m);
        } catch (Throwable unused) {
        }
        this.f38150m.a((!TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0) == 2);
        q().a(this.f38150m);
        q().a(campaignEx);
        com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
    }

    public void b(JSONObject jSONObject) {
    }
}
