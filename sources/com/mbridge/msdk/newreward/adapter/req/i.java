package com.mbridge.msdk.newreward.adapter.req;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i implements com.mbridge.msdk.newreward.adapter.req.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.adapter.e f1589a;

    public i(com.mbridge.msdk.newreward.adapter.e eVar) {
        this.f1589a = eVar;
    }

    @Override // com.mbridge.msdk.newreward.adapter.req.a
    public void a(Object obj, b bVar) throws IOException {
        String str;
        int i;
        List<CampaignEx> listB;
        if (obj == null) {
            if (bVar != null) {
                bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880001, "ReqMoreOfferService doReq: params is null"));
                return;
            }
            return;
        }
        try {
            long jH = this.f1589a.h();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jH <= 0) {
                this.f1589a.a(jElapsedRealtime);
                jH = jElapsedRealtime;
            }
            int iD = this.f1589a.d();
            String strG = this.f1589a.G();
            String strR = this.f1589a.R();
            long jI = ((long) this.f1589a.i()) - (jElapsedRealtime - jH);
            Map<String, String> mapC = ((com.mbridge.msdk.newreward.function.paramter.b) obj).c();
            if (mapC != null && !mapC.isEmpty()) {
                String str2 = com.mbridge.msdk.foundation.same.net.utils.d.h().Z;
                if (this.f1589a.g() != null && (listB = this.f1589a.g().b()) != null && !listB.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject(listB.get(0).getReq_ext_data());
                        String strOptString = jSONObject.optString("mof_domain");
                        if (!TextUtils.isEmpty(strOptString)) {
                            str2 = strOptString + "/openapi/ad/v3";
                        }
                        String strOptString2 = jSONObject.optString("parent_id");
                        if (!TextUtils.isEmpty(strOptString2)) {
                            mapC.put("mof_parent_id", strOptString2);
                        }
                        String strOptString3 = jSONObject.optString("oneId");
                        if (!TextUtils.isEmpty(strOptString3)) {
                            mapC.put("oneId", strOptString3);
                        }
                        String strOptString4 = jSONObject.optString("mcd");
                        if (!TextUtils.isEmpty(strOptString4)) {
                            mapC.put("mcd", strOptString4);
                        }
                    } catch (Exception unused) {
                        str = com.mbridge.msdk.foundation.same.net.utils.d.h().Z;
                    }
                }
                str = str2;
                com.mbridge.msdk.newreward.function.core.request.g gVar = new com.mbridge.msdk.newreward.function.core.request.g(iD, strG, strR, Math.max(jI, 0L), str);
                gVar.a(mapC);
                gVar.a((com.mbridge.msdk.newreward.function.core.request.c) new a(bVar));
                byte[] bArrB = gVar.b();
                int length = bArrB != null ? bArrB.length : 0;
                gVar.c(com.mbridge.msdk.foundation.same.net.wrapper.e.k, String.valueOf(length));
                if (bArrB != null && (i = com.mbridge.msdk.foundation.same.net.utils.d.h().i()) > 0 && length > i) {
                    gVar.b(1);
                    gVar.b("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
                }
                com.mbridge.msdk.newreward.function.core.request.f.b().a((com.mbridge.msdk.newreward.function.core.request.a) gVar);
                return;
            }
            bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880001, "ReqMoreOfferService doReq: MoreOfferReqParameters is null"));
        } catch (Exception e) {
            if (bVar != null) {
                bVar.reqFailed(new com.mbridge.msdk.foundation.error.b(880001, "ReqMoreOfferService doReq: parse " + e.getMessage()));
            }
        }
    }

    public static class a implements com.mbridge.msdk.newreward.function.core.request.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f1590a;

        public a(b bVar) {
            this.f1590a = bVar;
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.c
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.request.a aVar) {
            b bVar2 = this.f1590a;
            if (bVar2 != null) {
                bVar2.reqSuccessful(bVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.c
        public void b(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.request.a aVar, com.mbridge.msdk.newreward.function.core.request.b bVar2) {
            if (this.f1590a != null) {
                this.f1590a.reqFailed(a(bVar2, 401, aVar.t()));
            }
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.c
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.request.a aVar, com.mbridge.msdk.newreward.function.core.request.b bVar2) {
            if (this.f1590a != null) {
                this.f1590a.reqFailed(a(bVar2, 402, aVar.t()));
            }
        }

        @Override // com.mbridge.msdk.newreward.function.core.request.c
        public void a(com.mbridge.msdk.newreward.function.core.campaign.b bVar, com.mbridge.msdk.newreward.function.core.request.a aVar, long j, com.mbridge.msdk.newreward.function.core.request.b bVar2) {
            if (this.f1590a != null) {
                this.f1590a.reqFailed(a(bVar2, 405, aVar.t()));
            }
        }

        private com.mbridge.msdk.foundation.error.b a(com.mbridge.msdk.newreward.function.core.request.b bVar, int i, String str) {
            String strB;
            boolean z;
            com.mbridge.msdk.foundation.error.b bVarA = null;
            int iC = 0;
            int i2 = 880002;
            String strB2 = "load exception with no mCampaignRequestError";
            if (bVar != null) {
                try {
                    String strE = "";
                    if (bVar.a() == 9) {
                        iC = bVar.c();
                        strB2 = bVar.d();
                        i2 = bVar.a() == -1 ? 880017 : 880003;
                        z = true;
                        strE = bVar.e();
                        strB = "";
                    } else if (bVar.a() == 10) {
                        try {
                            strB2 = bVar.b();
                            strB = "";
                            iC = 880023;
                            i2 = 880023;
                            z = false;
                        } catch (Exception e) {
                            e = e;
                            iC = 880023;
                            e.printStackTrace();
                        }
                    } else {
                        switch (bVar.a()) {
                            case 0:
                            case 5:
                                i2 = 880020;
                                break;
                            case 6:
                            case 7:
                                i2 = 880003;
                                break;
                        }
                        if (bVar.f() != null) {
                            int iC2 = bVar.f().c();
                            try {
                                strB2 = bVar.f().b();
                                iC = iC2;
                                strB = bVar.b();
                            } catch (Exception e2) {
                                e = e2;
                                iC = iC2;
                                e.printStackTrace();
                            }
                        } else {
                            strB = "";
                        }
                        z = false;
                    }
                    bVarA = com.mbridge.msdk.foundation.error.a.a(iC, i2, strB2);
                    bVarA.a("campaign_request_error_type", Integer.valueOf(i));
                    bVarA.a("campaign_request_error", bVar);
                    bVarA.a(z);
                    if (!TextUtils.isEmpty(strE)) {
                        bVarA.f(strE);
                    }
                    if (!TextUtils.isEmpty(strB)) {
                        bVarA.b(strB);
                    }
                    bVarA.a(str);
                } catch (Exception e3) {
                    e = e3;
                }
            }
            return bVarA == null ? com.mbridge.msdk.foundation.error.a.a(iC, i2, strB2) : bVarA;
        }
    }
}
