package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.ironsource.L6;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends xd {
    private static volatile ArrayList<String> ri;
    private int lr = 12288;

    private void jbs(final String str) {
        try {
            com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ka.2
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("bidding_token");
                    riVar.fi("new");
                    riVar.xha(ka.this.sf(str).toString());
                    return riVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("BiddingTokenGenerator", th.getMessage());
        }
    }

    private void mj(final String str) {
        try {
            com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ka.1
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("bidding_token");
                    riVar.fi("new");
                    riVar.xha(ka.this.sf(str).toString());
                    return riVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("BiddingTokenGenerator", th.getMessage());
        }
    }

    private void qt(final String str) {
        try {
            com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.ka.3
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("bidding_token");
                    riVar.fi("new");
                    riVar.xha(ka.this.sf(str).toString());
                    return riVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("BiddingTokenGenerator", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject sf(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static class ri extends JSONObject {
        private ArrayList<String> ri;

        public ri(boolean z) {
            if (z) {
                this.ri = new ArrayList<>();
            }
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, boolean z) throws JSONException {
            ArrayList<String> arrayList = this.ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, z);
        }

        @Override // org.json.JSONObject
        public JSONObject putOpt(String str, Object obj) throws JSONException {
            ArrayList<String> arrayList = this.ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.putOpt(str, obj);
        }

        public ArrayList<String> ri() {
            return this.ri;
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, double d) throws JSONException {
            ArrayList<String> arrayList = this.ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, d);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, int i) throws JSONException {
            ArrayList<String> arrayList = this.ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, i);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, long j) throws JSONException {
            ArrayList<String> arrayList = this.ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, j);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, Object obj) throws JSONException {
            ArrayList<String> arrayList = this.ri;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, obj);
        }
    }

    private static void ri(JSONObject jSONObject, PAGBiddingRequest pAGBiddingRequest, String str) throws Throwable {
        jSONObject.put("is_init", vr.fi() ? 1 : 0);
        String strQt = nr.ka().qt();
        String strDw = nr.ka().dw();
        if (strQt != null && strDw != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("version", strQt);
            jSONObject2.put("param", strDw);
            jSONObject.put("abtest", jSONObject2);
        }
        jSONObject.put("language", aw.lr());
        jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
        jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.ig.di());
        if (pAGBiddingRequest != null) {
            jSONObject.put("user_data", ay.ri(TextUtils.isEmpty(pAGBiddingRequest.getSlotId()) ? null : new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build()));
        }
        jSONObject.put("ts", System.currentTimeMillis() / 1000);
        String strLr = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
        if (!strLr.isEmpty()) {
            jSONObject.put("ipv6", strLr);
        } else {
            String strLr2 = com.bytedance.sdk.openadsdk.tan.ka.ri.lr("ttopenadsdk", "key_ipv4", "");
            if (!strLr2.isEmpty()) {
                jSONObject.put("ipv4", strLr2);
            }
        }
        jSONObject.put("adx_id", str);
        jSONObject.put("target_region", nr.ka().tpb());
        com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().ri(jSONObject);
        if (pAGBiddingRequest != null) {
            jSONObject.put("banner", xd.ri(pAGBiddingRequest));
        }
        com.bytedance.sdk.openadsdk.core.settings.sf sfVarKa = nr.ka();
        jSONObject.put("app_reg", com.bytedance.sdk.openadsdk.core.qt.lr.ri().di() ? 1 : 0);
        Context contextRi = nr.ri();
        jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.ik.xha());
        jSONObject.put("screen_scale", com.bytedance.sdk.openadsdk.utils.qd.di(contextRi));
        jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.ka.lr());
        jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.ka.ik());
        jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.ka.ka());
        jSONObject.put("app_running_time", (System.currentTimeMillis() - vr.ri()) / 1000);
        jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.jbs.co.ik());
        jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.jbs.co.ka());
        jSONObject.put("gp_v_name", DeviceUtils.fi(contextRi));
        jSONObject.put("gp_v_code", DeviceUtils.di(contextRi));
        jSONObject.put("vendor", Build.MANUFACTURER);
        jSONObject.put(L6.B, Build.MODEL);
        jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.ig.lr());
        jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.ig.ka());
        jSONObject.put("sys_compiling_time", aw.lr(contextRi));
        jSONObject.put("screen_height", com.bytedance.sdk.openadsdk.utils.qd.fi(contextRi));
        jSONObject.put("screen_width", com.bytedance.sdk.openadsdk.utils.qd.ik(contextRi));
        jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.igq.ri());
        jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.dw.ri());
        jSONObject.put("os_version", Build.VERSION.RELEASE);
        jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.ig.mj(contextRi));
        if (sfVarKa.igq("boot")) {
            jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        }
        com.bytedance.sdk.openadsdk.utils.ig.ri(jSONObject);
        jSONObject.put("board", Build.BOARD);
        jSONObject.put("timezone", com.bytedance.sdk.openadsdk.utils.ig.su());
        jSONObject.put("device_city", com.bytedance.sdk.openadsdk.utils.ig.wjv());
        jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.utils.qt.lr());
        jSONObject.put("density", com.bytedance.sdk.openadsdk.utils.qd.mj(contextRi));
        DeviceUtils.ri(jSONObject);
        com.bytedance.sdk.openadsdk.core.sf.ik.ri(jSONObject);
        com.bytedance.sdk.openadsdk.utils.mj.ri(jSONObject, contextRi);
        jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.ihz.ri(contextRi));
        com.bytedance.sdk.openadsdk.utils.mj.lr(jSONObject, contextRi);
        com.bytedance.sdk.openadsdk.di.lr.ri().ri(jSONObject);
    }

    private void ri(final int i, final int i2, final String str, final String str2) {
        com.bytedance.sdk.openadsdk.slm.ka.ri("bid_tok_len_over_lim", false, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.core.ka.4
            @Override // com.bytedance.sdk.openadsdk.slm.lr
            public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("len_bef_rm", i);
                jSONObject.put("len_af_rm", i2);
                jSONObject.put("len_lm", ka.this.lr);
                jSONObject.put("re_f_key", str2);
                jSONObject.put("adx_id", str);
                return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("bid_tok_len_over_lim").lr(jSONObject.toString());
            }
        });
    }

    public boolean ri() {
        JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.wjv.fi.ri("bid_tok_con", (Object) null, com.bytedance.sdk.openadsdk.wjv.lr.ri);
        if (jSONObject == null) {
            return false;
        }
        this.lr = jSONObject.optInt("en_m_l", this.lr);
        return jSONObject.optInt(a.j, 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.xd, com.bytedance.sdk.openadsdk.core.hcw
    public void ri(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        int length;
        String adxId = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.ig.qt("getBiddingToken");
            if (pAGBiddingRequest != null && pAGBiddingRequest.getAdxId() != null) {
                adxId = pAGBiddingRequest.getAdxId();
            }
            jbs(adxId);
            String strTa = nr.ka().ta();
            String str = null;
            if (!com.bytedance.sdk.openadsdk.core.qt.lr.ri().di()) {
                pAGBidError = new PAGBidError(40060, jbs.ri(40060));
            } else if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().ka()) {
                pAGBidError = new PAGBidError(10007, jbs.ri(10007));
            } else if (!com.bytedance.sdk.openadsdk.core.qt.lr.ri().jbs()) {
                pAGBidError = new PAGBidError(10008, jbs.ri(10008));
            } else if (TextUtils.isEmpty(strTa)) {
                pAGBidError = new PAGBidError(10011, jbs.ri(10011));
                ri(5, pAGBiddingRequest);
            } else if (!xd.di(strTa) || nr.ka().zf(adxId)) {
                pAGBidError = null;
            } else {
                pAGBidError = new PAGBidError(10006, jbs.ri(10006));
                ri(2, pAGBiddingRequest);
            }
            if (pAGBidError != null) {
                pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                mj(adxId);
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().sf() && qt.lr().sf()) {
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10004, jbs.ri(10004)));
                mj(adxId);
                ri(3, pAGBiddingRequest);
                return;
            }
            com.bytedance.sdk.openadsdk.core.sf.ik.ri();
            ri riVar = new ri(ri == null);
            ri(riVar, pAGBiddingRequest, adxId);
            ArrayList<String> arrayListRi = riVar.ri();
            if (arrayListRi != null) {
                ri = arrayListRi;
            }
            JSONObject jSONObjectRi = xd.ri(riVar);
            int i = -1;
            int size = ri != null ? ri.size() - 1 : -1;
            while (true) {
                length = jSONObjectRi.toString().getBytes().length;
                if (length > this.lr) {
                    if (i < 0) {
                        i = length;
                    }
                    if (size < 0) {
                        break;
                    }
                    str = ri.get(size);
                    riVar.remove(str);
                    size--;
                    jSONObjectRi = xd.ri(riVar);
                } else {
                    break;
                }
            }
            if (jSONObjectRi.length() > 0) {
                jSONObjectRi.put("target_region", nr.ka().tpb());
            }
            pAGBidCallback.onBiddingTokenCollected(jSONObjectRi.toString());
            qt(adxId);
            if (i >= 0) {
                ri(i, length, adxId, str);
            }
        } catch (Throwable unused) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
            ri(4, pAGBiddingRequest);
            mj("");
        }
    }
}
