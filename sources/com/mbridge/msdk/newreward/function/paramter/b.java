package com.mbridge.msdk.newreward.function.paramter;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.wrapper.f;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.setting.h;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a {
    private final String b = "CN";
    private final String c = "117361";
    private final String d = "92762";
    private final String e = "936dcbdd57fe235fd7cf61c2e93da3c4";
    private CampaignEx f;

    public void a(CampaignEx campaignEx) {
        this.f = campaignEx;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0195 A[Catch: Exception -> 0x006b, TRY_ENTER, TryCatch #1 {Exception -> 0x006b, blocks: (B:7:0x0027, B:9:0x005e, B:20:0x0091, B:22:0x00c3, B:25:0x00db, B:30:0x0131, B:33:0x0158, B:41:0x017d, B:44:0x0195, B:46:0x019e, B:48:0x01a4, B:50:0x01b3, B:55:0x01f7, B:57:0x0234, B:58:0x0248, B:54:0x01f4, B:49:0x01ac, B:45:0x0199, B:24:0x00d0, B:51:0x01c4), top: B:68:0x0027, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0199 A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:7:0x0027, B:9:0x005e, B:20:0x0091, B:22:0x00c3, B:25:0x00db, B:30:0x0131, B:33:0x0158, B:41:0x017d, B:44:0x0195, B:46:0x019e, B:48:0x01a4, B:50:0x01b3, B:55:0x01f7, B:57:0x0234, B:58:0x0248, B:54:0x01f4, B:49:0x01ac, B:45:0x0199, B:24:0x00d0, B:51:0x01c4), top: B:68:0x0027, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x01a4 A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:7:0x0027, B:9:0x005e, B:20:0x0091, B:22:0x00c3, B:25:0x00db, B:30:0x0131, B:33:0x0158, B:41:0x017d, B:44:0x0195, B:46:0x019e, B:48:0x01a4, B:50:0x01b3, B:55:0x01f7, B:57:0x0234, B:58:0x0248, B:54:0x01f4, B:49:0x01ac, B:45:0x0199, B:24:0x00d0, B:51:0x01c4), top: B:68:0x0027, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01ac A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:7:0x0027, B:9:0x005e, B:20:0x0091, B:22:0x00c3, B:25:0x00db, B:30:0x0131, B:33:0x0158, B:41:0x017d, B:44:0x0195, B:46:0x019e, B:48:0x01a4, B:50:0x01b3, B:55:0x01f7, B:57:0x0234, B:58:0x0248, B:54:0x01f4, B:49:0x01ac, B:45:0x0199, B:24:0x00d0, B:51:0x01c4), top: B:68:0x0027, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0234 A[Catch: Exception -> 0x006b, TryCatch #1 {Exception -> 0x006b, blocks: (B:7:0x0027, B:9:0x005e, B:20:0x0091, B:22:0x00c3, B:25:0x00db, B:30:0x0131, B:33:0x0158, B:41:0x017d, B:44:0x0195, B:46:0x019e, B:48:0x01a4, B:50:0x01b3, B:55:0x01f7, B:57:0x0234, B:58:0x0248, B:54:0x01f4, B:49:0x01ac, B:45:0x0199, B:24:0x00d0, B:51:0x01c4), top: B:68:0x0027, inners: #2 }] */
    public Map<String, String> c() {
        String strK;
        String str;
        if (this.f == null) {
            return null;
        }
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e(a());
        try {
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            String campaignUnitId = this.f.getCampaignUnitId();
            String id = this.f.getId();
            String requestIdNotice = this.f.getRequestIdNotice();
            this.f.getRequestId();
            String strA = z0.a(this.f.getendcard_url(), "mof_testuid");
            if (TextUtils.isEmpty(strA)) {
                strA = z0.a(this.f.getendcard_url(), "mof_uid");
            }
            try {
                strK = (TextUtils.isEmpty(strB) || h.b().d(strB) == null) ? "CN" : h.b().d(strB).k();
            } catch (Exception unused) {
            }
            String strA2 = z0.a(this.f.getendcard_url(), "mcc");
            String strA3 = z0.a(this.f.getendcard_url(), "mnc");
            String strA4 = z0.a(this.f.getendcard_url(), "rv_tid");
            String strA5 = this.f.getendcard_url().contains("ecid") ? z0.a(this.f.getendcard_url(), "ecid") : String.valueOf(this.f.getEcTemplateId());
            String strA6 = z0.a(this.f.getendcard_url(), "tplgp");
            String strA7 = z0.a(this.f.getendcard_url(), "v_fmd5");
            String strA8 = z0.a(this.f.getendcard_url(), "i_fmd5");
            eVar.a("appid", strB);
            eVar.a("sign", SameMD5.getMD5(strB + com.mbridge.msdk.foundation.controller.c.n().c()));
            String str2 = "";
            eVar.a("r_id", TextUtils.isEmpty(requestIdNotice) ? "" : requestIdNotice);
            eVar.a("e", Arrays.toString(new String[]{id}));
            eVar.a("mof_type", "1");
            eVar.a("h5_type", "1");
            eVar.a("mof", "1");
            if (TextUtils.isEmpty(strK)) {
                strK = "CN";
            }
            eVar.a("country_code", strK);
            eVar.a("mof_ver", "1");
            eVar.a("parent_exchange", "");
            int adType = this.f.getAdType();
            try {
                if (adType != 94) {
                    if (adType == 287) {
                        str = "interstitial_video";
                    }
                    eVar.a("parent_ad_type", str2);
                    eVar.a("oneId", this.f.getReq_ext_data());
                    if (TextUtils.isEmpty(strA5)) {
                        eVar.a("parent_template_id", "404");
                    } else {
                        eVar.a("parent_template_id", strA5);
                    }
                    if (TextUtils.isEmpty(strA)) {
                        eVar.a("uc_parent_unit", campaignUnitId);
                    } else {
                        eVar.a("parent_unit", campaignUnitId);
                    }
                    eVar.a("mcn", strA3);
                    eVar.a("mcc", strA2);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crt_cid", id);
                    jSONObject.put("crt_rid", requestIdNotice);
                    jSONObject.put("rv_tid", strA4);
                    jSONObject.put("ecid", strA5);
                    jSONObject.put("tplgp", strA6);
                    jSONObject.put("v_fmd5", strA7);
                    jSONObject.put("i_fmd5", strA8);
                    jSONObject.put("h5_t", 1);
                    jSONObject.put("mof_t", 1);
                    eVar.a("mof_data", jSONObject.toString());
                    eVar.a("offer_id", id);
                    eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, "0");
                    eVar.a("category", "0");
                    eVar.a("only_impression", "1");
                    eVar.a("ping_mode", "1");
                    eVar.a("http_req", "2");
                    eVar.a("ad_num", "20");
                    eVar.a("tnum", "20");
                    if (TextUtils.isEmpty(strA)) {
                        strA = "117361";
                        eVar.a("app_id", "92762");
                        eVar.a("sign", SameMD5.getMD5("92762936dcbdd57fe235fd7cf61c2e93da3c4"));
                    }
                    eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, strA);
                    f.a(eVar, com.mbridge.msdk.foundation.controller.c.n().d());
                    f.b(eVar);
                    f.d(eVar);
                    f.j(eVar);
                    f.k(eVar);
                    return eVar.a();
                }
                str = "rewarded_video";
                jSONObject.put("crt_cid", id);
                jSONObject.put("crt_rid", requestIdNotice);
                jSONObject.put("rv_tid", strA4);
                jSONObject.put("ecid", strA5);
                jSONObject.put("tplgp", strA6);
                jSONObject.put("v_fmd5", strA7);
                jSONObject.put("i_fmd5", strA8);
                jSONObject.put("h5_t", 1);
                jSONObject.put("mof_t", 1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            str2 = str;
            eVar.a("parent_ad_type", str2);
            eVar.a("oneId", this.f.getReq_ext_data());
            if (TextUtils.isEmpty(strA5)) {
                eVar.a("parent_template_id", strA5);
            } else {
                eVar.a("parent_template_id", "404");
            }
            if (TextUtils.isEmpty(strA)) {
                eVar.a("uc_parent_unit", campaignUnitId);
            } else {
                eVar.a("parent_unit", campaignUnitId);
            }
            eVar.a("mcn", strA3);
            eVar.a("mcc", strA2);
            JSONObject jSONObject2 = new JSONObject();
            eVar.a("mof_data", jSONObject2.toString());
            eVar.a("offer_id", id);
            eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, "0");
            eVar.a("category", "0");
            eVar.a("only_impression", "1");
            eVar.a("ping_mode", "1");
            eVar.a("http_req", "2");
            eVar.a("ad_num", "20");
            eVar.a("tnum", "20");
            if (TextUtils.isEmpty(strA)) {
                strA = "117361";
                eVar.a("app_id", "92762");
                eVar.a("sign", SameMD5.getMD5("92762936dcbdd57fe235fd7cf61c2e93da3c4"));
            }
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, strA);
            f.a(eVar, com.mbridge.msdk.foundation.controller.c.n().d());
            f.b(eVar);
            f.d(eVar);
            f.j(eVar);
            f.k(eVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return eVar.a();
    }
}
