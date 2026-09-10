package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.CustomRequestHeader;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.component.jpc.jpc;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.core.bch;
import com.bytedance.sdk.openadsdk.core.fs;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.settings.rq;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.multipro.mml.mml;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.p004ironsource.d9;
import com.p004ironsource.fl;
import com.p004ironsource.ne;
import com.p004ironsource.x4;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.smartdigimkt.b0.a;
import com.smartdigimkt.x.g;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ApmHelper {
    private static String lnr = null;
    private static boolean mml = false;
    private static qdl mo = null;
    private static ud mzz = null;
    private static volatile boolean qdl = false;
    private static final AtomicBoolean ud = new AtomicBoolean(false);

    public static class qdl {
        public final Throwable lnr;
        public final String qdl;
        public final String ud;

        public qdl(String str, String str2, Throwable th) {
            this.qdl = str;
            this.ud = str2;
            this.lnr = th;
        }
    }

    public interface ud {
        void qdl(String str, String str2, Throwable th);
    }

    public static Pair<String, String> generateRequestHeader() {
        String string = "";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gaid", com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
            jSONObject.put("ipv6", mml.ud("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, ""));
            jSONObject.put(TtmlNode.TAG_REGION, yt.mml().gt());
        } catch (JSONException unused) {
        }
        JSONObject jSONObjectEncryptType4WithNoWrapBase64 = PangleEncryptManager.encryptType4WithNoWrapBase64(jSONObject, new bch(PangleEncryptConstant.CryptDataScene.UNKNOWN));
        String str = "0";
        if (jSONObjectEncryptType4WithNoWrapBase64 != null) {
            int iOptInt = jSONObjectEncryptType4WithNoWrapBase64.optInt("cypher");
            if (iOptInt == 4) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "4";
            } else if (iOptInt == 3) {
                string = jSONObjectEncryptType4WithNoWrapBase64.optString(PglCryptUtils.KEY_MESSAGE);
                str = "3";
            } else {
                string = jSONObject.toString();
            }
        }
        return new Pair<>(str, string);
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (ud.compareAndSet(false, true) && !qdl) {
            fco.qdl(new jpc("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!ApmHelper.qdl) {
                        rq rqVarMml = yt.mml();
                        boolean unused = ApmHelper.mml = rqVarMml.ji();
                        String strJl = gy.jl();
                        if (ApmHelper.mml && !TextUtils.isEmpty(strJl)) {
                            String unused2 = ApmHelper.lnr = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String strQdl = fs.qdl(context);
                            try {
                                Npth.setCrashWaitTime(com.bytedance.sdk.openadsdk.jyq.qdl.qdl("apm_crash_wait_time", 10000));
                                Npth.enableLoopMonitor(false);
                                Npth.enableAnrInfo(false);
                                Npth.enableNativeDump(false);
                                Npth.enableActivityDump(false);
                                Npth.enableMessageDump(false);
                                MonitorCrash.setCustomRequestHeaderCallback(new CustomRequestHeader() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.CustomRequestHeader
                                    public void addRequestHeader(HttpURLConnection httpURLConnection) {
                                        Pair<String, String> pairGenerateRequestHeader = ApmHelper.generateRequestHeader();
                                        httpURLConnection.setRequestProperty("cypher", (String) pairGenerateRequestHeader.first);
                                        httpURLConnection.setRequestProperty("transfer-param", (String) pairGenerateRequestHeader.second);
                                        httpURLConnection.setRequestProperty("x-pangle-target-idc", yt.mml().ca());
                                    }
                                });
                                final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 7702L, BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.apm.insight.AttachUserData
                                    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> mapJpc = ApmHelper.jpc();
                                        if (mapJpc.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapJpc.get("render_type"));
                                            return mapJpc;
                                        }
                                        monitorCrashInitSDK.addTags("render_type", "-2");
                                        return mapJpc;
                                    }
                                });
                                if (rqVarMml.taz()) {
                                    monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strQdl);
                                monitorCrashInitSDK.setReportUrl(strJl);
                                monitorCrashInitSDK.addTags("host_appid", ApmHelper.lnr);
                                monitorCrashInitSDK.addTags(a.s1, BuildConfig.VERSION_NAME);
                                ud unused3 = ApmHelper.mzz = new ud() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.ud
                                    public void qdl(String str, String str2, Throwable th) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th);
                                    }
                                };
                                boolean unused4 = ApmHelper.qdl = true;
                                ApmHelper.lnr(strQdl, strJl);
                                qdl qdlVar = ApmHelper.mo;
                                qdl unused5 = ApmHelper.mo = null;
                                if (qdlVar != null) {
                                    ApmHelper.mzz.qdl(qdlVar.qdl, qdlVar.ud, qdlVar.lnr);
                                }
                            } catch (Throwable unused6) {
                                boolean unused7 = ApmHelper.qdl = false;
                            }
                        }
                    }
                    ApmHelper.ud.set(false);
                }
            });
        }
    }

    public static boolean isIsInit() {
        return qdl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> jpc() {
        HashMap map = new HashMap();
        ljh ljhVarUd = com.bytedance.sdk.openadsdk.utils.ud.ud();
        if (ljhVarUd != null) {
            map.put("adType", String.valueOf(ljhVarUd.ok()));
            map.put(fl.SESSION_HISTORY_KEY_AD_ID, String.valueOf(ljhVarUd.uhv()));
            map.put("cid", ljhVarUd.yre());
            map.put("reqId", ljhVarUd.cev());
            map.put("rit", ljhVarUd.kdv(x4.DISABLED_AUCTION_FALLBACK_ID));
            int iRa = ljhVarUd.ra();
            if (ljhVarUd.dk() != 2) {
                iRa = -1;
            }
            map.put("render_type", String.valueOf(iRa));
        }
        return map;
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        ud udVar = mzz;
        if (udVar != null) {
            udVar.qdl(str, str2, th);
        } else {
            mo = new qdl(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() {
        if (mml) {
            ud(fs.qdl(yt.qdl()), gy.jl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lnr(String str, String str2) {
        ud(str, str2);
    }

    private static void ud(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strN = android.support.v4.media.a.n("https://", str2, "/monitor/collect/c/session?version_code=7702&device_platform=android&aid=10000001");
        yt.lnr().qdl(ud(str), strN);
    }

    private static JSONObject ud(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put(a.s1, BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", lnr);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put(ne.f26256E, d9.d);
            jSONObject2.put(a.h1, Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put(fl.SESSION_HISTORY_KEY_AD_ID, "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("apm_id", "20000001");
            jSONObject.putOpt(g.f39716B, jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
            return jSONObject;
        } catch (JSONException e2) {
            aaj.lnr("ApmHelper", e2.getMessage());
            return jSONObject;
        }
    }
}
