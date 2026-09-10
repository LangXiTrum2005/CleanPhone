package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends c<JSONObject> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f34518b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f34519a = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class RunnableC0139a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f34520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f34521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f34522c;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0140a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f34524a;

            public RunnableC0140a(CampaignUnit campaignUnit) {
                this.f34524a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f34524a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f34524a.getAds().size() > 0) {
                    a.this.a(this.f34524a);
                    if (!TextUtils.isEmpty(a.this.f34519a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.f34524a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f34524a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC0139a.this.f34520a.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                RunnableC0139a runnableC0139a = RunnableC0139a.this;
                a.this.a(runnableC0139a.f34522c, msg);
            }
        }

        public RunnableC0139a(JSONObject jSONObject, String str, int i10) {
            this.f34520a = jSONObject;
            this.f34521b = str;
            this.f34522c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f34520a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0140a("v5".equals(this.f34521b) ? b.parseV5CampaignUnit(jSONObjectOptJSONObject, a.this.f34519a) : b.parseCampaignUnit(jSONObjectOptJSONObject, a.this.f34519a)));
        }
    }

    public abstract void a(int i10, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.c(f34518b, "onFailed errorCode = " + aVar.f33812a);
        a(aVar.f33812a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.f33810b.f33833b, eVar.f33811c);
    }

    public void a(String str) {
        this.f34519a = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        q0.c(f34518b, "parseLoad content = " + jSONObject);
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0139a(jSONObject, jSONObject.optString("version"), iOptInt));
            return;
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
