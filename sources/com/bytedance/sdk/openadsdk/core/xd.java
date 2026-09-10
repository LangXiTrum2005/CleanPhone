package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;
import saneness.retroflection;
import shimmery.attabal;

/* JADX INFO: loaded from: classes2.dex */
public class xd implements hcw {
    private static final Map<Integer, String> lr = new HashMap<Integer, String>(59) { // from class: com.bytedance.sdk.openadsdk.core.xd.1
        {
            put(1, "is_init");
            put(2, "abtest");
            put(3, "language");
            put(4, "ad_sdk_version");
            put(5, "package_name");
            put(6, "user_data");
            put(7, "ts");
            put(8, "ipv4");
            put(9, "ipv6");
            put(10, "adx_id");
            put(11, "target_region");
            put(12, L6.V0);
            put(13, "banner");
            put(14, "app_reg");
            put(15, "apk-sign");
            put(16, "screen_scale");
            put(17, "app_set_id_scope");
            put(18, "app_set_id");
            put(19, "installed_source");
            put(20, "app_running_time");
            put(21, "js_render_ver");
            put(22, "js_render_v3_ver");
            put(23, "gp_v_name");
            put(24, "gp_v_code");
            put(25, "vendor");
            put(26, L6.B);
            put(27, "user_agent_device");
            put(28, "user_agent_webview");
            put(29, "sys_compiling_time");
            put(30, "screen_height");
            put(31, "screen_width");
            put(32, "rom_version");
            put(33, "carrier_name");
            put(34, "os_version");
            put(35, "conn_type");
            put(36, "boot");
            put(37, "oem_store");
            put(38, "board");
            put(39, "timezone");
            put(40, "device_city");
            put(41, "cpu_num");
            put(42, "density");
            put(43, "bt_time");
            put(44, "bt_id");
            put(45, "sec_did");
            put(46, "X-Armors");
            put(47, "url");
            put(48, "pangle_m");
            put(49, "ec");
            put(50, "pglx");
            put(51, L6.u);
            put(52, "bp");
            put(53, "t_ver");
            put(54, "is_fold");
            put(55, CampaignEx.JSON_KEY_AAB);
            put(56, "abi");
            put(57, "is_multi");
            put(58, "w_ver");
            put(59, "feature_data");
        }
    };
    private final AtomicReference<JSONObject> ri = new AtomicReference<>();
    private int ik = 0;

    public static boolean di(String str) {
        return "TX".equals(str);
    }

    private static void jbs(final String str) {
        try {
            com.bytedance.sdk.openadsdk.nr.ik.lr(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.xd.5
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("bidding_token");
                    riVar.xha(xd.sf(str).toString());
                    return riVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTAdManagerImpl", th.getMessage());
        }
    }

    private static void mj(final String str) {
        try {
            com.bytedance.sdk.openadsdk.nr.ik.ri(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.xd.4
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("bidding_token");
                    riVar.xha(xd.sf(str).toString());
                    return riVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTAdManagerImpl", th.getMessage());
        }
    }

    private static void qt(final String str) {
        try {
            com.bytedance.sdk.openadsdk.nr.ik.ik(new com.bytedance.sdk.openadsdk.nr.ka() { // from class: com.bytedance.sdk.openadsdk.core.xd.6
                @Override // com.bytedance.sdk.openadsdk.nr.ka
                public com.bytedance.sdk.openadsdk.nr.lr.ri ri() {
                    com.bytedance.sdk.openadsdk.nr.lr.ri riVar = new com.bytedance.sdk.openadsdk.nr.lr.ri();
                    riVar.lr("bidding_token");
                    riVar.xha(xd.sf(str).toString());
                    return riVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ac.ik("TTAdManagerImpl", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject sf(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: fi, reason: merged with bridge method [inline-methods] */
    public xd lr(String str) {
        qt.lr().ik(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    public String ik() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public xd ri(String str) {
        qt.lr().ri(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    public int fi() {
        return qt.lr().qt();
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    public hcw ik(int i) {
        qt.lr().ik(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    public hcw ka(int i) {
        qt.lr().ka(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    public hcw lr() {
        com.bytedance.sdk.component.utils.vr.ri("PangleSDK-7911");
        attabal.wireman("PangleSDK-7911");
        com.bytedance.sdk.component.utils.ac.ri("PangleSDK-7911");
        com.bytedance.sdk.component.utils.vr.ri();
        com.bytedance.sdk.component.xha.ri.ri();
        attabal.saneness();
        com.bytedance.sdk.component.utils.ac.ri();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    public hcw ri(int i) {
        qt.lr().fi(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    public hcw ik(String str) {
        qt.lr().mj(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    public int ka() {
        return this.ik;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    public void ri(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        String str = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.ig.qt("getBiddingToken");
            String adxId = (pAGBiddingRequest == null || pAGBiddingRequest.getAdxId() == null) ? "" : pAGBiddingRequest.getAdxId();
            try {
                mj(adxId);
                String strTa = nr.ka().ta();
                int size = 2;
                AdSlot adSlotBuild = null;
                if (!com.bytedance.sdk.openadsdk.core.qt.lr.ri().di()) {
                    pAGBidError = new PAGBidError(40060, jbs.ri(40060));
                } else if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().ka()) {
                    pAGBidError = new PAGBidError(10007, jbs.ri(10007));
                } else if (!com.bytedance.sdk.openadsdk.core.qt.lr.ri().jbs()) {
                    pAGBidError = new PAGBidError(10008, jbs.ri(10008));
                } else if (TextUtils.isEmpty(strTa)) {
                    pAGBidError = new PAGBidError(10011, jbs.ri(10011));
                    ri(5, pAGBiddingRequest);
                } else if (!di(strTa) || nr.ka().zf(adxId)) {
                    pAGBidError = null;
                } else {
                    pAGBidError = new PAGBidError(10006, jbs.ri(10006));
                    ri(2, pAGBiddingRequest);
                }
                if (pAGBidError != null) {
                    pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                    qt(adxId);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().sf() && qt.lr().sf()) {
                    pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10004, jbs.ri(10004)));
                    qt(adxId);
                    ri(3, pAGBiddingRequest);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.sf.ik.ri();
                JSONObject jSONObject = new JSONObject();
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
                    if (!TextUtils.isEmpty(pAGBiddingRequest.getSlotId())) {
                        adSlotBuild = new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build();
                    }
                    jSONObject.put("user_data", ay.ri(adSlotBuild));
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
                jSONObject.put("adx_id", adxId);
                Object objTpb = nr.ka().tpb();
                jSONObject.put("target_region", objTpb);
                if (jSONObject.toString().getBytes().length <= 2680) {
                    com.bytedance.sdk.openadsdk.core.settings.sf sfVarKa = nr.ka();
                    com.bytedance.sdk.openadsdk.ihz.ri.lr.ri.ri().ri(jSONObject);
                    if (pAGBiddingRequest != null) {
                        jSONObject.put("banner", ri(pAGBiddingRequest));
                    }
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
                    size = lr.size();
                }
                while (size > 0 && jSONObject.toString().getBytes().length > 2680) {
                    jSONObject.remove(lr.get(Integer.valueOf(size)));
                    size--;
                }
                com.bytedance.sdk.openadsdk.di.lr.ri().ri(jSONObject);
                JSONObject jSONObjectRi = ri(jSONObject);
                while (size > 0 && jSONObjectRi.toString().getBytes().length > 12288) {
                    jSONObject.remove(lr.get(Integer.valueOf(size)));
                    jSONObjectRi = ri(jSONObject);
                    size--;
                }
                if (jSONObjectRi.length() > 0) {
                    jSONObjectRi.put("target_region", objTpb);
                }
                if (com.bytedance.sdk.component.utils.vr.ik()) {
                    jSONObjectRi.toString();
                    int length = jSONObjectRi.toString().getBytes().length;
                }
                jSONObjectRi.toString();
                pAGBidCallback.onBiddingTokenCollected(jSONObjectRi.toString());
                jbs(adxId);
            } catch (Throwable unused) {
                str = adxId;
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
                ri(4, pAGBiddingRequest);
                qt(str);
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hcw
    public hcw lr(int i) {
        this.ik = i;
        return this;
    }

    public void ri(int i, PAGBiddingRequest pAGBiddingRequest) {
        try {
            String strUq = qt.lr().uq();
            String str = "";
            String adxId = pAGBiddingRequest != null ? pAGBiddingRequest.getAdxId() : "";
            boolean zXlq = nr.ka().xlq();
            Set<String> setZxp = nr.ka().zxp();
            JSONArray jSONArray = new JSONArray();
            if (setZxp != null) {
                Iterator<String> it = setZxp.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            String strTa = com.bytedance.sdk.openadsdk.core.settings.sf.lr().ta();
            int iFi = fi();
            int iKa = vr.ka();
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("init_adx_id", strUq);
            jSONObject.put("bidding_adx_id", adxId);
            jSONObject.put("token_enable", zXlq ? 1 : 0);
            if (!TextUtils.isEmpty(strTa)) {
                str = strTa;
            }
            jSONObject.put("setting_dc", str);
            jSONObject.put("setting_token_adx_ids", jSONArray);
            jSONObject.put("init_pa_consent", iFi);
            jSONObject.put("init_state", iKa);
            jSONObject.put("reason", i);
            if (vr.fi()) {
                com.bytedance.sdk.openadsdk.slm.ka.ri("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.core.xd.2
                    @Override // com.bytedance.sdk.openadsdk.slm.lr
                    public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                        return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("biddingtoken_error").lr(jSONObject.toString());
                    }
                });
                final JSONObject andSet = this.ri.getAndSet(null);
                if (andSet != null) {
                    com.bytedance.sdk.openadsdk.slm.ka.ri("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.slm.lr() { // from class: com.bytedance.sdk.openadsdk.core.xd.3
                        @Override // com.bytedance.sdk.openadsdk.slm.lr
                        public com.bytedance.sdk.openadsdk.slm.ri.ik ri() throws Exception {
                            return com.bytedance.sdk.openadsdk.slm.ri.ka.lr().ri("biddingtoken_error").lr(andSet.toString());
                        }
                    });
                    return;
                }
                return;
            }
            retroflection.attabal(this.ri, null, jSONObject);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static JSONObject ri(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static JSONObject ri(JSONObject jSONObject) {
        JSONObject jSONObjectEncryptType4 = PangleEncryptManager.encryptType4(jSONObject, new fr(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
        su.ri(jSONObjectEncryptType4);
        return jSONObjectEncryptType4 != null ? jSONObjectEncryptType4 : new JSONObject();
    }
}
