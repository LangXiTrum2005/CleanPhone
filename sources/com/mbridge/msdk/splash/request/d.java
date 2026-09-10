package com.mbridge.msdk.splash.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f35922c = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f35923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35924b;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f35925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f35927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f35928d;

        /* JADX INFO: renamed from: com.mbridge.msdk.splash.request.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        public class RunnableC0181a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f35930a;

            public RunnableC0181a(CampaignUnit campaignUnit) {
                this.f35930a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f35930a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f35930a.getAds().size() > 0) {
                    a aVar = a.this;
                    d.this.a(aVar.f35927c, this.f35930a);
                    d.this.saveRequestTime(this.f35930a.getAds().size());
                } else {
                    CampaignUnit campaignUnit2 = this.f35930a;
                    String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                    if (TextUtils.isEmpty(msg)) {
                        msg = a.this.f35925a.optString(NotificationCompat.CATEGORY_MESSAGE);
                    }
                    a aVar2 = a.this;
                    d.this.a(aVar2.f35928d, msg);
                }
            }
        }

        public a(JSONObject jSONObject, String str, List list, int i10) {
            this.f35925a = jSONObject;
            this.f35926b = str;
            this.f35927c = list;
            this.f35928d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectOptJSONObject = this.f35925a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0181a("v5".equals(this.f35926b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObjectOptJSONObject, d.this.f35924b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObjectOptJSONObject, d.this.f35924b)));
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject, jSONObject.optString("version"), list, iOptInt));
    }

    public abstract void a(int i10, String str);

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.b(f35922c, "errorCode = " + aVar.f33812a);
        a(aVar.f33812a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(com.mbridge.msdk.foundation.same.net.e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.f33810b) == null) {
            return;
        }
        int i10 = this.f35923a;
        if (i10 == 0) {
            b(aVar.f33833b, eVar.f33811c);
        } else if (i10 == 1) {
            a(aVar.f33833b, eVar.f33811c);
        }
    }

    public void a(String str) {
        this.f35924b = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt("status");
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.f35924b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.f35924b);
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
                a(iOptInt, msg);
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
