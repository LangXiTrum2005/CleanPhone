package com.mbridge.msdk.newreward.function.core.request;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.VolleyErrorUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.tracker.network.c0;
import com.mbridge.msdk.tracker.network.d0;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.u;
import com.mbridge.msdk.tracker.network.w;
import com.mbridge.msdk.tracker.network.y;
import com.mbridge.msdk.tracker.network.z;
import com.umeng.analytics.pro.bc;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a extends u<JSONObject> implements w.a {
    protected String A;
    protected String B;
    private Map<String, String> C;
    private c D;
    private z E;
    private long F;
    private long G;
    private String H;
    private String I;
    private String J;
    private String K;
    private Map<String, String> L;
    private long M;
    protected com.mbridge.msdk.newreward.function.core.campaign.b w;
    protected Context x;
    protected int y;
    protected String z;

    /* JADX INFO: renamed from: com.mbridge.msdk.newreward.function.core.request.a$a, reason: collision with other inner class name */
    public static final class C0212a implements com.mbridge.msdk.newreward.adapter.timeout.a.InterfaceC0203a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f1678a;
        private final com.mbridge.msdk.newreward.function.core.campaign.b b;

        public C0212a(a aVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
            this.f1678a = aVar;
            this.b = bVar;
        }

        @Override // com.mbridge.msdk.newreward.adapter.timeout.a.InterfaceC0203a
        public void a(String str, long j) {
            o0.a("BaseCampaignRequest", "onTimeout taskID = " + str + ", timeout = " + j);
            a.b(this.f1678a, this.b, j);
        }
    }

    public a(int i, String str, String str2, String str3, long j, String str4, String str5) {
        super(0, str4, 0, str5);
        this.x = com.mbridge.msdk.foundation.controller.c.n().d();
        this.y = i;
        this.z = str;
        this.A = str2;
        this.B = str3;
        this.H = UUID.randomUUID().toString();
        this.F = SystemClock.elapsedRealtime();
        this.K = str4;
        this.w = new com.mbridge.msdk.newreward.function.core.campaign.b(this.y, this.z, this.A, this.B);
        a((w.a) this);
        b(true);
        c(true);
        this.M = j <= 0 ? WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS : j;
        com.mbridge.msdk.newreward.adapter.timeout.a.a().a(this.H, this.M, new C0212a(this, this.w));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(a aVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar, long j) {
        c cVarD;
        if (aVar == null || bVar == null || (cVarD = aVar.D()) == null) {
            return;
        }
        try {
            cVarD.a(bVar, aVar, j, new b(10, "v3 is timeout"));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("BaseCampaignRequest", "onTimeout Exception: ", e);
            }
        }
    }

    public String C() {
        return this.I;
    }

    public c D() {
        return this.D;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public boolean a() {
        return true;
    }

    public void c(String str, String str2) {
        if (this.C == null) {
            this.C = new HashMap();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, String> map = this.C;
        if (str2 == null) {
            str2 = "";
        }
        map.put(str, str2);
    }

    public void e(String str) {
        this.I = str;
    }

    public void f(String str) {
        a("local_id", str);
        a("ad_type", String.valueOf(this.y));
        this.J = str;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public Map<String, String> i() {
        if (this.C == null) {
            this.C = new HashMap();
        }
        return this.C;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public z o() {
        if (this.E == null) {
            this.E = new com.mbridge.msdk.tracker.network.e(10000, this.M, 5);
        }
        return this.E;
    }

    public void a(c cVar) {
        this.D = cVar;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public Map<String, String> f() {
        if (this.L == null) {
            this.L = new HashMap();
        }
        this.L.put("Charset", C.UTF8_NAME);
        return this.L;
    }

    public void a(Map<String, String> map) {
        if (this.C == null) {
            this.C = new HashMap();
        }
        if (map == null || map.size() == 0) {
            return;
        }
        this.C.putAll(map);
    }

    public void b(String str, String str2) {
        if (this.L == null) {
            this.L = new HashMap();
        }
        this.L.put(str, str2);
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public w<JSONObject> a(r rVar) {
        if (rVar != null) {
            try {
                byte[] bArr = rVar.b;
                if (bArr != null && bArr.length != 0) {
                    return w.a(new JSONObject(new String(bArr, StandardCharsets.UTF_8)), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
                }
            } catch (JSONException e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("BaseCampaignRequest", "parseNetworkResponse JSONException: ", e);
                }
                return w.a(new t(e));
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("BaseCampaignRequest", "parseNetworkResponse Exception: ", e2);
                }
                return w.a(new c0(e2));
            }
        }
        return w.a(new y());
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public void a(JSONObject jSONObject) {
        if (MBridgeConstans.DEBUG) {
            o0.a("BaseCampaignRequest", "deliverResponse: " + jSONObject);
        }
        com.mbridge.msdk.newreward.adapter.timeout.a.a().a(this.H);
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (iOptInt == 1) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                CampaignUnit campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObjectOptJSONObject, C());
                this.w.a(jSONObjectOptJSONObject);
                this.w.a(jSONObjectOptJSONObject.optString(bc.aL));
                this.w.h(jSONObjectOptJSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
                this.w.g(jSONObjectOptJSONObject.optString("a"));
                this.w.i(jSONObjectOptJSONObject.optInt("template"));
                this.w.d(System.currentTimeMillis());
                this.w.b(C());
                this.w.e(jSONObjectOptJSONObject.optString(com.mbridge.msdk.foundation.same.a.T));
                this.w.h(1);
                this.w.g(0);
                this.w.f(campaignUnit.getRequestId());
                this.w.a(campaignUnit.getEcppv());
                this.w.i(this.K);
                this.w.e(campaignUnit.getSecondRequestIndex());
                this.w.f(campaignUnit.getSecondShowIndex());
                MBridgeGlobalCommon.handlerCampaigns(this.J, this.w, campaignUnit.getAds(), new ArrayList());
                a(this, this.w);
            } else {
                a(this, this.w, new b(7, "data is null"));
            }
        } else {
            b bVar = new b(9);
            bVar.b(jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
            bVar.a(iOptInt);
            bVar.c(jSONObject.toString());
            a(this, this.w, bVar);
        }
        this.G = SystemClock.elapsedRealtime();
    }

    private static void a(a aVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar, b bVar2) {
        c cVarD;
        if (aVar == null || bVar == null || (cVarD = aVar.D()) == null) {
            return;
        }
        try {
            cVarD.a(bVar, aVar, bVar2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("BaseCampaignRequest", "handlerOnFailedEvent Exception: ", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public void a(d0 d0Var) {
        com.mbridge.msdk.newreward.adapter.timeout.a.a().a(this.H);
        if (MBridgeConstans.DEBUG) {
            o0.b("BaseCampaignRequest", "onErrorResponse: " + d0Var.getMessage());
        }
        a(this, this.w, d0Var);
    }

    private static void a(a aVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar, d0 d0Var) {
        c cVarD;
        if (aVar == null || bVar == null || (cVarD = aVar.D()) == null) {
            return;
        }
        try {
            cVarD.b(bVar, aVar, VolleyErrorUtils.parseVolleyError(d0Var));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("BaseCampaignRequest", "onError Exception: ", e);
            }
        }
    }

    private static void a(a aVar, com.mbridge.msdk.newreward.function.core.campaign.b bVar) {
        c cVarD;
        if (aVar == null || bVar == null || (cVarD = aVar.D()) == null) {
            return;
        }
        try {
            cVarD.a(bVar, aVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("BaseCampaignRequest", "handlerOnSuccessEvent Exception: ", e);
            }
        }
    }
}
