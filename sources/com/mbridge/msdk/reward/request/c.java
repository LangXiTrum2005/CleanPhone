package com.mbridge.msdk.reward.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f35544d = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.metrics.c f35547c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f35548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35549b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f35550c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f35551d;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.request.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0172a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f35553a;

            public RunnableC0172a(CampaignUnit campaignUnit) {
                this.f35553a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f35553a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f35553a.getAds().size() > 0) {
                    this.f35553a.setMetricsData(c.this.f35547c);
                    a aVar = a.this;
                    c.this.a(aVar.f35550c, this.f35553a);
                    c.this.saveRequestTime(this.f35553a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f35553a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.f35548a.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a aVar2 = a.this;
                c cVar = c.this;
                cVar.a(aVar2.f35551d, msg, cVar.f35547c);
            }
        }

        public a(JSONObject jSONObject, String str, List list, int i10) {
            this.f35548a = jSONObject;
            this.f35549b = str;
            this.f35550c = list;
            this.f35551d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f35548a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0172a("v5".equals(this.f35549b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObjectOptJSONObject, c.this.f35546b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObjectOptJSONObject, c.this.f35546b)));
        }
    }

    public abstract void a(int i10, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f35544d, "errorCode = " + aVar.f33812a);
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(aVar.f33812a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.a(aVar.f33813b);
        this.f35547c.a(bVar);
        a(aVar.f33812a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar), this.f35547c);
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f33810b) == null) {
            return;
        }
        int i10 = this.f35545a;
        if (i10 == 0) {
            b(aVar.f33833b, eVar.f33811c);
        } else if (i10 == 1) {
            a(aVar.f33833b, eVar.f33811c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(list, jSONObject, iOptInt, this.f35547c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject, jSONObject.optString("version"), list, iOptInt));
    }

    public void a(String str) {
        this.f35546b = str;
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.f35547c = cVar;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f35546b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f35546b);
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                List<Frame> listFrames = campaignUnit.getListFrames();
                a(listFrames);
                saveRequestTime(listFrames.size());
                return;
            } else {
                String msg = campaignUnit != null ? campaignUnit.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a(iOptInt, msg, this.f35547c);
                return;
            }
        }
        a(list, jSONObject, iOptInt, this.f35547c);
    }

    private void a(List<g> list, JSONObject jSONObject, int i10, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.error.b bVarA;
        String strB = "";
        if (list != null && list.size() > 0) {
            for (g gVar : list) {
                if (gVar != null) {
                    String strA = gVar.a();
                    if (!TextUtils.isEmpty(strA) && strA.equals("data_res_type")) {
                        strB = gVar.b();
                    }
                }
            }
        }
        String strL = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (!TextUtils.isEmpty(strB) && strB.equals("1")) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880018, strL);
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.c(true);
                if (TextUtils.isEmpty(strL)) {
                    strL = bVarA2.l();
                }
            }
            a(i10, strL, cVar);
            return;
        }
        if (i10 == -1) {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880017, strL);
        } else {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880003, strL);
        }
        if (cVar != null) {
            cVar.a(bVarA);
            cVar.c(false);
            if (TextUtils.isEmpty(strL)) {
                strL = bVarA.l();
            }
        }
        a(i10, strL, cVar);
    }
}
