package com.bytedance.sdk.openadsdk.core.settings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.Z;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.component.utils.fs;
import com.bytedance.sdk.component.utils.jl;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.rdp;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.fco;
import com.bytedance.sdk.openadsdk.utils.gy;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.smartdigimkt.d2.a;
import com.vungle.ads.internal.model.Cookie;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class rq implements tvp.qdl {
    private static final ConcurrentLinkedQueue<to.qdl> aaj;
    private static String bqt;
    private static boolean fs;
    public static final String lnr;
    public static String mml;
    static final ConcurrentHashMap<String, Integer> mo;
    public static String mzz;
    public static final String qdl;
    private static final com.bytedance.sdk.component.jpc.jpc rq;
    private static final String tvp;
    public static final String ud;
    private final Set<String> bch;
    private final AtomicBoolean bjy;
    private boolean exc;
    private final com.bytedance.sdk.openadsdk.core.settings.qdl exu;
    private int jl;
    mzz.ud<com.bytedance.sdk.openadsdk.mml.qdl.rq> jpc;
    private volatile boolean jtx;
    private final BroadcastReceiver jyq;
    private final mzz.ud<Map<String, Integer>> ljh;
    private final Runnable oth;
    private final jpc rdp;
    private Set<String> to;
    private final mzz.ud<Set<String>> uw;
    final mzz.ud<ConcurrentHashMap<String, Integer>> wd;
    private mzz.ud<JSONObject> xmv;
    private int yt;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.rq$9, reason: invalid class name */
    public class AnonymousClass9 extends BroadcastReceiver {
        private final Runnable ud = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.9.1
            @Override // java.lang.Runnable
            public void run() {
                fco.ud(new com.bytedance.sdk.component.jpc.jpc("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.9.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            rq.this.mml();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        public AnonymousClass9() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            fco.ud(new com.bytedance.sdk.component.jpc.jpc("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.9.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        rq.this.qdl(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.tvp.qdl().removeCallbacks(AnonymousClass9.this.ud);
                        com.bytedance.sdk.component.utils.tvp.qdl().postDelayed(AnonymousClass9.this.ud, 10000L);
                    }
                }
            });
        }
    }

    public static final class qdl {
        static final rq qdl = new rq();
    }

    static {
        CharSequence[] charSequenceArr = {"bus_con_collect", gy.vu()};
        StringBuilder sb = new StringBuilder();
        sb.append(charSequenceArr[0]);
        sb.append((CharSequence) "_");
        sb.append(charSequenceArr[1]);
        qdl = sb.toString();
        CharSequence[] charSequenceArr2 = {"bus_con", gy.vu(), gy.koa(), "timeout"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr2[0]);
        for (int i2 = 1; i2 < 4; i2++) {
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr2[i2]);
        }
        ud = sb2.toString();
        CharSequence[] charSequenceArr3 = {"bus_con", gy.vu(), gy.koa(), "alpha"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr3[0]);
        for (int i3 = 1; i3 < 4; i3++) {
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr3[i3]);
        }
        lnr = sb3.toString();
        tvp = gy.oth();
        rq = new com.bytedance.sdk.component.jpc.jpc("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.qdl.ud.mzz.ud().tvp();
                com.bytedance.sdk.component.adexpress.qdl.ud.mzz.ud().ud(false);
                com.bytedance.sdk.component.adexpress.qdl.ud.ud.ud();
                com.bytedance.sdk.component.adexpress.qdl.ud.mzz.ud().lnr();
            }
        };
        mml = "";
        mzz = "IABTCF_TCString";
        fs = false;
        aaj = new ConcurrentLinkedQueue<>();
        mo = new ConcurrentHashMap<>();
    }

    public static String gsp() {
        if (bqt == null) {
            String strUd = com.bytedance.sdk.openadsdk.core.lnr.qdl().ud("settings_host_from_meta", "");
            bqt = strUd;
            if (strUd == null) {
                bqt = "";
            }
        }
        return bqt;
    }

    private String hd() {
        return this.rdp.qdl("force_language", "");
    }

    public static boolean lme() {
        return fs;
    }

    public static rq lnr() {
        return qdl.qdl;
    }

    private static SharedPreferences mml(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    private Set<String> se() {
        return (Set) this.rdp.qdl("perf_con_applog_send", this.bch, this.uw);
    }

    public boolean aaj() {
        return this.rdp.qdl("bus_con_adshow_check_enable", true);
    }

    public String ag() {
        return this.rdp.qdl("ads_url", "");
    }

    public boolean ax() {
        return this.rdp.ud();
    }

    public String bch() {
        return this.rdp.qdl("bus_con_check_clz", "");
    }

    public int bjy() {
        se();
        return this.jl;
    }

    public boolean blf() {
        return this.rdp.qdl("perf_con_use_new_thread_pool", 0) == 1;
    }

    public int bqt() {
        return this.rdp.qdl(ud, 10000);
    }

    public JSONObject bx() {
        return (JSONObject) this.rdp.qdl("perf_con_thread_pool_config", new JSONObject(), this.xmv);
    }

    public String ca() {
        return this.rdp.qdl("target_region", "");
    }

    public boolean car() {
        return this.rdp.qdl("privacy_debug_unlock", 1) != 0;
    }

    public String cx() {
        return this.rdp.qdl("policy_url", "");
    }

    public boolean dk() {
        return this.rdp.qdl("global_rate", 1.0f) == 1.0f;
    }

    public int dps() {
        return this.rdp.qdl("perf_con_close_button_delay_check_time", -1);
    }

    public long ekw() {
        return this.rdp.qdl("duration", 10000L);
    }

    public int en() {
        int iQdl = this.rdp.qdl("perf_con_webview_cache_count_v3", 0);
        if (iQdl < 0) {
            return 0;
        }
        return iQdl;
    }

    public long ew() {
        return this.rdp.qdl("perf_con_adlog_expire_time", 0L);
    }

    public boolean exc() {
        return this.rdp.qdl("ad_revenue_enable", true);
    }

    public int exu() {
        return this.rdp.qdl("perf_con_drawable_code", 0);
    }

    public int fco() {
        int iQdl = this.rdp.qdl("fetch_tpl_timeout_ctrl", 3000);
        if (iQdl <= 0) {
            return 3000;
        }
        return iQdl;
    }

    public int fs() {
        return this.rdp.qdl("splash_video_load_strategy", 0);
    }

    public void fzn() {
        if (tvp.qdl()) {
            rdp.ud().removeCallbacks(this.oth);
            rdp.ud().postDelayed(this.oth, qk());
        }
    }

    public int gg() {
        return this.rdp.qdl("bus_con_send_log_type", 1);
    }

    public String gt() {
        return this.rdp.qdl("dc", "TX");
    }

    public void gy() {
        String strHd = hd();
        if (TextUtils.isEmpty(strHd)) {
            return;
        }
        if (strHd.equals("zh-Hant")) {
            fs.qdl(yt.qdl(), a.S, "tw");
        } else {
            fs.qdl(yt.qdl(), strHd, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            aaj.lnr("TTAD.SdkSettings", th.getMessage());
        }
    }

    public int hkc() {
        return this.rdp.qdl("max", 50);
    }

    public mo hzv() {
        return (mo) this.rdp.qdl("insert_js_config", mo.qdl, new mzz.ud<mo>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.ud
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public mo ud(String str) {
                return new mo(str);
            }
        });
    }

    public boolean ijp() {
        return this.rdp.qdl("read_video_from_cache", 1) == 1;
    }

    public int irn() {
        return this.rdp.qdl("isGdprUser", -1);
    }

    public Set<String> iw() {
        return (Set) this.rdp.qdl("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, mzz.ud);
    }

    public boolean ji() {
        int iQdl = this.exu.qdl("perf_con_apm", 100);
        if (iQdl == 0) {
            return false;
        }
        return iQdl < 0 || iQdl >= 100 || iQdl > ((int) (Math.random() * 100.0d));
    }

    public boolean jjk() {
        int iQdl = this.rdp.qdl("privacy_ad_enable", Integer.MAX_VALUE);
        if (iQdl == 1) {
            return true;
        }
        if (iQdl == 0) {
            return false;
        }
        int iBch = gy.bch();
        return iBch == 1 || iBch == 2 || iBch == 3;
    }

    public boolean jl() {
        return this.rdp.qdl("support_gzip", false);
    }

    public int jle() {
        int iQdl = this.rdp.qdl("bus_con_auto_click_delay", 3000);
        if (iQdl <= 0) {
            return 3000;
        }
        return iQdl;
    }

    public boolean jnw() {
        return this.rdp.qdl("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    public long jpc() {
        return this.rdp.qdl("data_time", 0L);
    }

    public int jtx() {
        se();
        return this.yt;
    }

    public boolean jut() {
        return this.rdp.qdl("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    public int jyq() {
        int iQdl = this.rdp.qdl("bus_con_token_thread_count", 4);
        if (iQdl <= 0 || iQdl > 30) {
            return 4;
        }
        return iQdl;
    }

    public int kab() {
        return this.rdp.qdl("blank_detect_rate", 30);
    }

    public boolean kdv() {
        return this.rdp.qdl("landingpage_new_style", -1) == 1;
    }

    public float koa() {
        return this.rdp.qdl(lnr, 1.0f);
    }

    public boolean kr() {
        return this.rdp.qdl("bus_con_video_keep_screen_on", 1) == 1;
    }

    public int ljh() {
        return this.rdp.qdl("bus_con_behavior_count", 300);
    }

    public boolean lq() {
        if (com.bytedance.sdk.component.adexpress.mml.ud.qdl(yt.qdl())) {
            return this.rdp.qdl("support_rtl", false);
        }
        return false;
    }

    public boolean lte() {
        return this.jtx;
    }

    public boolean mlb() {
        return this.rdp.qdl("privacy_app_reg", true);
    }

    public int mo() {
        return this.rdp.qdl("max_tpl_cnts", 100);
    }

    public int mrf() {
        int iQdl = this.rdp.qdl("fetch_tpl_second", 0);
        if (iQdl <= 0) {
            return 0;
        }
        return iQdl;
    }

    public String mzz() {
        return this.rdp.qdl("aes_key", "");
    }

    public String[] nz() {
        try {
            Set<String> set = this.to;
            if (set == null || set.size() == 0) {
                JSONArray jSONArray = new JSONArray(this.rdp.qdl("gecko_hosts", (String) null));
                if (jSONArray.length() != 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        this.to.add(jSONArray.getString(i2));
                    }
                }
                Set<String> setQdl = jpc.qdl(this.to);
                this.to = setQdl;
                if (setQdl != null) {
                    if (setQdl.size() == 0) {
                    }
                }
                return null;
            }
            return (String[]) this.to.toArray(new String[0]);
        } catch (Throwable unused) {
        }
    }

    public String om() {
        return this.rdp.qdl("app_log_url", "");
    }

    public String oth() {
        return this.rdp.qdl("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public long qk() {
        long jQdl = this.rdp.qdl("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (jQdl < 0 || jQdl > 86400000) ? TTAdConstant.AD_MAX_EVENT_TIME : jQdl;
    }

    public JSONObject ra() {
        return (JSONObject) this.rdp.qdl("video_cache_config", null, mzz.qdl);
    }

    public String rc() {
        return this.rdp.qdl("ab_test_param", "");
    }

    public Set<String> rdp() {
        return se();
    }

    public String rq() {
        return this.rdp.qdl("ab_test_version", "");
    }

    public int rzg() {
        return this.rdp.qdl("perf_con_thread_stack_size", 0);
    }

    public boolean sy() {
        return this.rdp.qdl("bus_con_dislike_report_raw", false);
    }

    public Set<String> syy() {
        return (Set) this.rdp.qdl("privacy_fields_allowed", Collections.EMPTY_SET, mzz.ud);
    }

    public boolean taz() {
        return this.rdp.qdl("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    public boolean tdy() {
        return this.rdp.qdl("token_enable", 0) == 1;
    }

    public boolean tid() {
        return this.rdp.qdl("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    public boolean to() {
        return this.rdp.qdl("if_both_open", 0) == 1;
    }

    public long tqd() {
        return this.rdp.qdl("last_req_time", 0L);
    }

    public void tvp() {
        this.rdp.qdl().qdl("tt_sdk_settings").qdl("ab_test_param").qdl();
    }

    public boolean uw() {
        return this.rdp.qdl("bus_con_url_check", 1) != 0;
    }

    public int vu() {
        return this.rdp.qdl("loadedCallbackOpportunity", 0);
    }

    public String wak() {
        return this.rdp.qdl("dyn_draw_engine_url", tvp);
    }

    public String wc() {
        return this.rdp.qdl("settings_url", "");
    }

    public JSONObject wd() {
        return (JSONObject) this.rdp.qdl("digest", null, mzz.qdl);
    }

    public com.bytedance.sdk.openadsdk.mml.qdl.rq xdk() {
        return (com.bytedance.sdk.openadsdk.mml.qdl.rq) this.rdp.qdl("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.mml.qdl.rq.qdl, this.jpc);
    }

    public int xi() {
        return this.rdp.qdl("vbtt", 5);
    }

    public boolean xmv() {
        return this.rdp.qdl(qdl, false);
    }

    public void xx() {
        mzz.qdl qdlVarQdl = this.rdp.qdl();
        qdlVarQdl.qdl("settings_url", "");
        qdlVarQdl.qdl();
        vu("");
    }

    public int yh() {
        return this.rdp.qdl("ivrv_downward", 0);
    }

    public boolean yt() {
        return this.rdp.qdl("allow_blind_mode_request_ad", false);
    }

    public int zlt() {
        int iQdl = this.rdp.qdl("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iQdl != Integer.MAX_VALUE) {
            return iQdl;
        }
        int iBch = gy.bch();
        if (iBch == 1 || iBch == 2) {
            return 2;
        }
        return iBch != 3 ? 0 : 1;
    }

    public String zpu() {
        return this.rdp.qdl("dual_event_url", (String) null);
    }

    public boolean zvv() {
        return this.rdp.qdl("perf_con_is_new_net_thread", 0) == 1;
    }

    public int zy() {
        int iQdl = this.rdp.qdl("perf_con_webview_cache_count", 0);
        if (iQdl < 0) {
            return 0;
        }
        return iQdl;
    }

    private rq() {
        this.to = Collections.synchronizedSet(new HashSet());
        this.exu = new com.bytedance.sdk.openadsdk.core.settings.qdl();
        this.rdp = new jpc(new to.qdl() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.to.qdl
            public void qdl() {
                to.qdl[] qdlVarArr;
                boolean unused = rq.fs = true;
                if (rq.aaj == null || rq.aaj.size() == 0 || (qdlVarArr = (to.qdl[]) rq.aaj.toArray()) == null) {
                    return;
                }
                for (to.qdl qdlVar : qdlVarArr) {
                    qdlVar.qdl();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.to.qdl
            public void ud() {
                if (rq.aaj == null || rq.aaj.isEmpty()) {
                    return;
                }
                Iterator it = rq.aaj.iterator();
                while (it.hasNext()) {
                    ((to.qdl) it.next()).ud();
                }
            }
        });
        this.bjy = new AtomicBoolean(false);
        this.jtx = false;
        this.yt = 5000;
        this.jl = 10;
        AnonymousClass9 anonymousClass9 = new AnonymousClass9();
        this.jyq = anonymousClass9;
        this.oth = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.10
            @Override // java.lang.Runnable
            public void run() {
                rq.this.mml(2);
                rq.this.fzn();
            }
        };
        this.wd = new mzz.ud<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.11
            @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.ud
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public ConcurrentHashMap<String, Integer> ud(String str) {
                if (TextUtils.isEmpty(str)) {
                    return rq.mo;
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        int iOptInt = jSONObject.optInt(next, 100);
                        if (!TextUtils.isEmpty(next) && iOptInt >= 0 && iOptInt <= 100) {
                            concurrentHashMap.put(next, Integer.valueOf(iOptInt));
                        }
                    }
                } catch (JSONException e2) {
                    Log.i("TTAD.SdkSettings", e2.getMessage());
                }
                return concurrentHashMap;
            }
        };
        this.ljh = new mzz.ud<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.12
            @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.ud
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> ud(String str) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    HashMap map = new HashMap(jSONObject.length());
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!TextUtils.isEmpty(next)) {
                            int iOptInt = jSONObject.optInt(next, 100);
                            if (iOptInt < 0 || iOptInt > 100) {
                                map.put(next, 100);
                            } else {
                                map.put(next, Integer.valueOf(iOptInt));
                            }
                        }
                    }
                    return map;
                } catch (Exception e2) {
                    aaj.lnr(Z.m(e2, new StringBuilder("get applog rate from sp failed:")), new Object[0]);
                    return null;
                }
            }
        };
        this.bch = new HashSet();
        this.uw = new mzz.ud<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.ud
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public Set<String> ud(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            rq.this.jl = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            rq.this.yt = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                String string = jSONArray.getString(i2);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e2) {
                        Log.i("TTAD.SdkSettings", e2.getMessage());
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.xmv = new mzz.ud<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.ud
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public JSONObject ud(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    aaj.lnr("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.jpc = new mzz.ud<com.bytedance.sdk.openadsdk.mml.qdl.rq>() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.mzz.ud
            /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.mml.qdl.rq ud(String str) {
                com.bytedance.sdk.openadsdk.mml.qdl.rq rqVar = new com.bytedance.sdk.openadsdk.mml.qdl.rq();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    rqVar.qdl(jSONObject.optInt("enable_strategy", 0) == 1);
                    rqVar.qdl(qdl(jSONObject.optJSONObject("default")));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            rqVar.qdl(next, qdl(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return rqVar;
            }

            private com.bytedance.sdk.openadsdk.mml.qdl.rq.qdl qdl(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new com.bytedance.sdk.openadsdk.mml.qdl.rq.qdl(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            Context contextQdl = yt.qdl();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (Build.VERSION.SDK_INT >= 33) {
                contextQdl.registerReceiver(anonymousClass9, intentFilter, 4);
            } else {
                contextQdl.registerReceiver(anonymousClass9, intentFilter);
            }
        } catch (Exception e2) {
            aaj.qdl("TTAD.SdkSettings", "", e2);
        }
    }

    public static void vu(String str) {
        if (str == null) {
            str = "";
        }
        String strGsp = gsp();
        if (strGsp == null || !strGsp.equals(str)) {
            com.bytedance.sdk.openadsdk.core.lnr.qdl().qdl("settings_host_from_meta", str);
            bqt = str;
            lnr().qdl(8, true);
        }
    }

    public boolean aaj(String str) {
        return xmv(str).jyq;
    }

    public boolean bch(String str) {
        return xmv(str).rc;
    }

    public boolean bqt(String str) {
        Set set = (Set) this.rdp.qdl("privacy_fields_allowed", Collections.EMPTY_SET, mzz.ud);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iBch = gy.bch();
        if (iBch != 1) {
            if (iBch != 2 && iBch != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    public int exc(String str) {
        return xmv(str).aaj;
    }

    public int exu(String str) {
        return xmv(String.valueOf(str)).jpc;
    }

    public boolean fs(String str) {
        try {
            return xmv(str).ljh != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public JSONObject jl(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.rdp.qdl("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", xmv(str).ekw);
                return jSONObject2;
            } catch (JSONException e2) {
                e = e2;
                jSONObject = jSONObject2;
                aaj.lnr("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e3) {
            e = e3;
        }
    }

    public boolean jpc(String str) {
        return str == null || xmv(str).rdp == 1;
    }

    public int jyq(String str) {
        return xmv(str).uw;
    }

    public boolean koa(String str) {
        Set set;
        if (TextUtils.isEmpty(str) || (set = (Set) this.rdp.qdl("token_adx_ids", Collections.EMPTY_SET, mzz.ud)) == null || set.size() == 0) {
            return false;
        }
        return set.contains(str);
    }

    public int ljh(String str) {
        return xmv(str).bqt;
    }

    public boolean lnr(String str) {
        return xmv(str).lnr == 1;
    }

    public synchronized void mml() {
        SystemClock.elapsedRealtime();
        boolean z2 = this.jtx;
        this.exu.qdl(this.jtx);
        this.rdp.qdl(this.jtx);
        lnr.qdl(!z2);
        this.jtx = true;
        SystemClock.elapsedRealtime();
        if (!z2) {
            rdp.ud().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.6
                @Override // java.lang.Runnable
                public void run() {
                    if (!tvp.qdl()) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.qdl.qdl().ud();
                    } else {
                        rq.this.mml(1);
                        rq.this.fzn();
                    }
                }
            }, 1000L);
        }
    }

    public boolean mo(String str) {
        return xmv(str).wd == 1;
    }

    public boolean mzz(String str) {
        int i2 = xmv(str).mzz;
        if (i2 != 1) {
            return i2 == 2 && jl.lnr(yt.qdl()) != 0;
        }
        return jl.mml(yt.qdl());
    }

    public int oth(String str) {
        return xmv(str).xmv;
    }

    public boolean rdp(String str) {
        return exu(str) != 1;
    }

    public int rq(String str) {
        return xmv(str).fs;
    }

    public int to(String str) {
        return xmv(str).rq;
    }

    public int tvp(String str) {
        if (str == null) {
            return 1500;
        }
        return xmv(str).jtx;
    }

    public boolean uw(String str) {
        return yt.mml().xmv(str).bjy == 1;
    }

    public int wd(String str) {
        return xmv(str).jl;
    }

    public ud xmv(String str) {
        return lnr.qdl(str);
    }

    public boolean yt(String str) {
        return str == null || DeviceUtils.to(yt.qdl()) == 0 || xmv(str).exu == 1;
    }

    private static void ud(int i2, boolean z2) {
        Context contextQdl = yt.qdl();
        if (contextQdl != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextQdl.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z2);
                intent.putExtra("_source", i2);
                contextQdl.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public int bjy(String str) {
        return xmv(str).to;
    }

    public boolean jtx(String str) {
        return xmv(str).oth == 0;
    }

    public void qdl() {
        try {
            lnr.qdl();
            this.rdp.lnr();
            this.exu.lnr();
            Context contextQdl = yt.qdl();
            File file = new File(new File(contextQdl.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                contextQdl.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    public int lnr(int i2) {
        return xmv(String.valueOf(i2)).tvp;
    }

    public void lnr(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.jyq, intentFilter, 4);
            } else {
                context.registerReceiver(this.jyq, intentFilter);
            }
        } catch (Exception e2) {
            aaj.qdl("TTAD.SdkSettings", "", e2);
        }
        if (lte()) {
            mml(1);
            fzn();
        }
    }

    public static void ud() {
        Context contextQdl;
        if (com.bytedance.sdk.openadsdk.multipro.ud.lnr() && (contextQdl = yt.qdl()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextQdl.getPackageName());
                intent.setAction("_dataChanged");
                contextQdl.sendBroadcast(intent);
            } catch (Throwable th) {
                aaj.qdl("TTAD.SdkSettings", "", th);
            }
        }
    }

    public boolean mml(String str) {
        return xmv(str).koa;
    }

    public static int qdl(Context context) {
        SharedPreferences sharedPreferencesMml;
        if (context == null || (sharedPreferencesMml = mml(context)) == null) {
            return -2;
        }
        int i2 = sharedPreferencesMml.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
        int i3 = sharedPreferencesMml.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
        if (i2 == Integer.MIN_VALUE && i3 == Integer.MIN_VALUE) {
            return -2;
        }
        return sharedPreferencesMml.getInt(Cookie.IABTCF_GDPR_APPLIES, -1);
    }

    public void mml(int i2) {
        qdl(i2, false);
    }

    public static String ud(Context context) {
        SharedPreferences sharedPreferencesMml;
        return (context == null || (sharedPreferencesMml = mml(context)) == null) ? "" : sharedPreferencesMml.getString(mzz, "");
    }

    public void qdl(JSONObject jSONObject, mzz.qdl qdlVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        jpc jpcVar = this.rdp;
        String str = tvp;
        String strQdl = jpcVar.qdl("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strQdl) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strQdl)) {
            rdp.ud().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.rq.7
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(rq.this.rdp.qdl("dyn_draw_engine_url", rq.tvp), strOptString)) {
                        com.bytedance.sdk.component.adexpress.qdl.ud.mzz.ud().lnr();
                    }
                }
            }, 5000L);
        }
        qdlVar.qdl("dyn_draw_engine_url", strOptString);
    }

    public void ud(JSONObject jSONObject, mzz.qdl qdlVar) {
        if (jSONObject.has("is_gdpr_user")) {
            int iOptInt = jSONObject.optInt("is_gdpr_user", -1);
            qdlVar.qdl("isGdprUser", (iOptInt == -1 || iOptInt == 1 || iOptInt == 0) ? iOptInt : -1);
        }
    }

    public int qdl(String str) {
        if (str == null) {
            return 0;
        }
        return yt.mml().xmv(str).exc;
    }

    public int ud(String str) {
        Integer num;
        Map map = (Map) this.rdp.qdl("perf_con_applog_rate", null, this.ljh);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    public int qdl(String str, int i2) {
        Integer num;
        Map map = (Map) this.rdp.qdl("perf_con_stats_rate", mo, this.wd);
        return (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) ? i2 : num.intValue();
    }

    public int ud(int i2) {
        return xmv(String.valueOf(i2)).ud;
    }

    public int qdl(int i2) {
        return xmv(String.valueOf(i2)).kdv;
    }

    public void qdl(long j) {
        this.rdp.qdl().qdl("last_req_time", j).qdl();
    }

    public void qdl(int i2, boolean z2) {
        if (!rdp.mzz() && i2 != 1 && i2 != 2) {
            if (z2) {
                this.exc = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.tvp.ud().mml())) {
                return;
            }
            if (this.exc) {
                this.exc = false;
                if (!z2) {
                    z2 = true;
                }
            }
            long jTqd = tqd();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jQk = qk();
            long j = jCurrentTimeMillis - jTqd;
            if (z2 || j >= jQk) {
                if (!tvp.qdl()) {
                    ud(i2, z2);
                } else if (this.bjy.compareAndSet(false, true)) {
                    fco.ud((com.bytedance.sdk.component.jpc.jpc) new tvp(this, this.rdp, this.exu));
                    rdp.ud().removeCallbacks(this.oth);
                }
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("settings request error", "settings", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.tvp.qdl
    public void qdl(boolean z2) {
        this.bjy.set(false);
        fzn();
        if (z2) {
            HashMap map = new HashMap();
            Set<String> setSyy = syy();
            if (setSyy != null && !setSyy.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setSyy);
            }
            String strJl = gy.jl();
            if (!TextUtils.isEmpty(strJl)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strJl);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, ca());
            com.bytedance.sdk.openadsdk.core.to.ud.ud().qdl(map);
            ud();
        }
    }

    public boolean qdl(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        if (cryptDataScene != PangleEncryptConstant.CryptDataScene.GET_ADS && cryptDataScene != PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN) {
            if (cryptDataScene == PangleEncryptConstant.CryptDataScene.APP_LOG) {
                return this.rdp.qdl("perf_con_crypt_V4_applog", false);
            }
            return this.rdp.qdl("perf_con_crypt_V4", false);
        }
        return this.rdp.qdl("perf_con_crypt_V4_get_ad", false);
    }

    public static void qdl(to.qdl qdlVar) {
        ConcurrentLinkedQueue<to.qdl> concurrentLinkedQueue = aaj;
        if (concurrentLinkedQueue.contains(qdlVar)) {
            return;
        }
        concurrentLinkedQueue.add(qdlVar);
    }
}
