package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.applovin.impl.sultanate;
import com.applovin.sdk.AppLovinMediationProvider;
import com.bytedance.sdk.component.utils.ac;
import com.bytedance.sdk.component.utils.co;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.nr;
import com.bytedance.sdk.openadsdk.core.vr;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.ig;
import com.google.android.gms.ads.AdSize;
import com.ironsource.C3700q2;
import com.ironsource.Ua;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.vungle.ads.internal.signals.SignalManager;
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

/* JADX INFO: loaded from: classes2.dex */
public class sf implements jbs.ri {
    private static String fr;
    private final Runnable ac;
    private final mj aw;
    private fi.lr<JSONObject> ay;
    private final AtomicBoolean bgr;
    private int bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.settings.ri f18148co;
    private final fi.lr<Map<String, Integer>> ihz;
    fi.lr<com.bytedance.sdk.openadsdk.ka.ri.qt> mj;
    private boolean nr;
    private Set<String> qt;
    private int slm;
    private final Set<String> uq;
    private volatile boolean vr;
    private final fi.lr<Set<String>> wjv;
    public static final String ri = sultanate.attabal("_", new CharSequence[]{"bus_con_collect", ig.dw()});
    public static final String lr = sultanate.attabal("_", new CharSequence[]{"bus_con", ig.dw(), ig.zf(), "timeout"});
    public static final String ik = sultanate.attabal("_", new CharSequence[]{"bus_con", ig.dw(), ig.zf(), "alpha"});
    private static final String jbs = ig.uq();
    public static String ka = "";
    public static int fi = -2;
    public static String di = AndroidTcfDataSource.TCF_TCSTRING_KEY;
    private static boolean sf = false;
    private static final ConcurrentLinkedQueue<qt.ri> tan = new ConcurrentLinkedQueue<>();
    static final ConcurrentHashMap<String, Integer> xha = new ConcurrentHashMap<>();

    public static final class ri {
        static final sf ri = new sf();
    }

    private String evm() {
        return this.aw.ri("force_language", "");
    }

    public static String jm() {
        if (fr == null) {
            String strLr = com.bytedance.sdk.openadsdk.core.ik.ri().lr("settings_host_from_meta", "");
            fr = strLr;
            if (strLr == null) {
                fr = "";
            }
        }
        return fr;
    }

    public static boolean nbc() {
        return sf;
    }

    private Set<String> sz() {
        return (Set) this.aw.ri("perf_con_applog_send", this.uq, this.wjv);
    }

    public int aac() {
        int iRi = this.aw.ri("perf_con_webview_cache_count", 0);
        if (iRi < 0) {
            return 0;
        }
        return iRi;
    }

    public String ac() {
        return this.aw.ri("bus_con_express_host", "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/");
    }

    public long ajz() {
        long jRi = this.aw.ri("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (jRi < 0 || jRi > SignalManager.TWENTY_FOUR_HOURS_MILLIS) ? TTAdConstant.AD_MAX_EVENT_TIME : jRi;
    }

    public boolean akr() {
        return this.aw.ri("bus_con_video_keep_screen_on", 1) == 1;
    }

    public Set<String> aw() {
        return sz();
    }

    public boolean ay() {
        return this.aw.ri(ri, false);
    }

    public int bgr() {
        sz();
        return this.bu;
    }

    public int bnj() {
        return this.aw.ri("vbtt", 5);
    }

    public boolean bu() {
        return this.aw.ri("support_gzip", false);
    }

    public int che() {
        return this.aw.ri("perf_con_close_button_delay_check_time", -1);
    }

    public int co() {
        return this.aw.ri("perf_con_drawable_code", 0);
    }

    public void de() {
        fi.ri riVarLr = this.aw.lr();
        riVarLr.ri("settings_url", "");
        riVarLr.ri();
        dw("");
    }

    public JSONObject di() {
        return (JSONObject) this.aw.ri("digest", null, fi.ri);
    }

    public String dw() {
        return this.aw.ri("ab_test_param", "");
    }

    public int dzy() {
        int iRi = this.aw.ri("fetch_tpl_timeout_ctrl", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        return iRi <= 0 ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : iRi;
    }

    public boolean eb() {
        return this.aw.ri("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    public Set<String> eu() {
        mj mjVar = this.aw;
        Set<String> set = Collections.EMPTY_SET;
        Set<String> set2 = (Set) mjVar.ri("ads_url_backup", set, fi.lr);
        return (set2 == null || set2.size() == 0) ? set : set2;
    }

    public String fe() {
        return this.aw.ri("dc", "TX");
    }

    public String feb() {
        return this.aw.ri("policy_url", "");
    }

    public int fi() {
        return this.aw.ri("max_tpl_cnts", 100);
    }

    public int fr() {
        return this.aw.ri(lr, 10000);
    }

    public String gcp() {
        return this.aw.ri("privacy_app_reg", "");
    }

    public long hcw() {
        return this.aw.ri(IronSourceConstants.EVENTS_DURATION, Ua.s);
    }

    public Set<String> hd() {
        return (Set) this.aw.ri("perf_con_drop2rt_skip_label_list", Collections.EMPTY_SET, fi.lr);
    }

    public boolean hpn() {
        if (com.bytedance.sdk.component.adexpress.ka.lr.ri(nr.ri())) {
            return this.aw.ri("support_rtl", false);
        }
        return false;
    }

    public boolean hws() {
        return this.aw.ri("perf_con_is_new_net_thread", 0) == 1;
    }

    public long id() {
        return this.aw.ri("perf_con_adlog_expire_time", 0L);
    }

    public void ig() {
        String strEvm = evm();
        if (TextUtils.isEmpty(strEvm)) {
            return;
        }
        if (strEvm.equals("zh-Hant")) {
            co.ri(nr.ri(), "zh", "tw");
        } else {
            co.ri(nr.ri(), strEvm, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            ac.ik("TTAD.SdkSettings", th.getMessage());
        }
    }

    public int igq() {
        return this.aw.ri("bus_con_slide_num", 2);
    }

    public int ihz() {
        return this.aw.ri("bus_con_behavior_count", AdSize.MEDIUM_RECTANGLE_WIDTH);
    }

    public int iph() {
        int iRi = this.aw.ri("bus_con_auto_click_delay", IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        return iRi <= 0 ? IronSourceError.ERROR_CAPPING_VALIDATION_FAILED : iRi;
    }

    public boolean jbs() {
        return this.aw.ri("if_both_open", 0) == 1;
    }

    public String jc() {
        return this.aw.ri("settings_url", "");
    }

    public JSONObject jxw() {
        return (JSONObject) this.aw.ri("perf_con_thread_pool_config", new JSONObject(), this.ay);
    }

    public String ka() {
        return this.aw.ri("aes_key", "");
    }

    public String kt() {
        return this.aw.ri("app_log_url", "");
    }

    public void luy() {
        vr.lr().removeCallbacks(this.ac);
        vr.lr().postDelayed(this.ac, ajz());
    }

    public void mj() {
        this.aw.lr().ri("ab_test_param").ri();
    }

    public boolean nd() {
        return this.aw.ri("global_rate", 1.0f) == 1.0f;
    }

    public boolean nh() {
        return this.aw.ri("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    public boolean nr() {
        return this.aw.ri("ad_revenue_enable", true);
    }

    public int oh() {
        return this.aw.ri(AppLovinMediationProvider.MAX, 50);
    }

    public boolean ory() {
        return this.aw.ri("landingpage_new_style", -1) == 1;
    }

    public JSONObject pc() {
        return (JSONObject) this.aw.ri("video_cache_config", null, fi.ri);
    }

    public com.bytedance.sdk.openadsdk.ka.ri.qt pu() {
        return (com.bytedance.sdk.openadsdk.ka.ri.qt) this.aw.ri("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.ka.ri.qt.ri, this.mj);
    }

    public int pv() {
        int iRi = this.aw.ri("fetch_tpl_second", 0);
        if (iRi <= 0) {
            return 0;
        }
        return iRi;
    }

    public boolean qd() {
        return this.aw.ik();
    }

    public boolean qh() {
        return this.aw.ri("privacy_debug_unlock", 1) != 0;
    }

    public boolean qmx() {
        int iRi = this.f18148co.ri("perf_con_apm", 100);
        if (iRi == 0) {
            return false;
        }
        return iRi < 0 || iRi >= 100 || iRi > ((int) (Math.random() * 100.0d));
    }

    public String qt() {
        return this.aw.ri("ab_test_version", "");
    }

    public boolean rzk() {
        return this.aw.ri("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    public int saa() {
        return this.aw.ri("blank_detect_rate", 30);
    }

    public int sez() {
        return this.aw.ri("perf_con_sync_gaid", 0);
    }

    public int sf() {
        return this.aw.ri("splash_video_load_strategy", 0);
    }

    public boolean siy() {
        int iRi = this.aw.ri("privacy_ad_enable", Integer.MAX_VALUE);
        if (iRi == 1) {
            return true;
        }
        if (iRi == 0) {
            return false;
        }
        int iAy = ig.ay();
        return iAy == 1 || iAy == 2 || iAy == 3;
    }

    public boolean slm() {
        return this.aw.ri("allow_blind_mode_request_ad", false);
    }

    public String srn() {
        return this.aw.ri("ads_url", "");
    }

    public float su() {
        return this.aw.ri(ik, 1.0f);
    }

    public String ta() {
        return this.aw.ri("dc", "");
    }

    public boolean tan() {
        return this.aw.ri("bus_con_adshow_check_enable", true);
    }

    public String tnn() {
        return this.aw.ri("dyn_draw_engine_url", jbs);
    }

    public String tpb() {
        return this.aw.ri("target_region", "");
    }

    public boolean tw() {
        return this.vr;
    }

    public boolean ud() {
        return this.bgr.get();
    }

    public String uq() {
        return this.aw.ri("bus_con_check_clz", "");
    }

    public int vr() {
        sz();
        return this.slm;
    }

    public String vt() {
        return this.aw.ri("dual_event_url", (String) null);
    }

    public int whw() {
        int iRi = this.aw.ri("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iRi != Integer.MAX_VALUE) {
            return iRi;
        }
        int iAy = ig.ay();
        if (iAy == 1 || iAy == 2) {
            return 2;
        }
        return iAy != 3 ? 0 : 1;
    }

    public boolean wjv() {
        return this.aw.ri("bus_con_url_check", 1) != 0;
    }

    public di xd() {
        return (di) this.aw.ri("insert_js_config", di.ri, new fi.lr<di>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.fi.lr
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public di lr(String str) {
                return new di(str);
            }
        });
    }

    public int xe() {
        int iRi = this.aw.ri("perf_con_webview_cache_count_v3", 0);
        if (iRi < 0) {
            return 0;
        }
        return iRi;
    }

    public long xha() {
        return this.aw.ri("data_time", 0L);
    }

    public boolean xlq() {
        return this.aw.ri("token_enable", 0) == 1;
    }

    public boolean xm() {
        return this.aw.ri("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    public String[] yjm() {
        try {
            Set<String> set = this.qt;
            if (set == null || set.size() == 0) {
                JSONArray jSONArray = new JSONArray(this.aw.ri("gecko_hosts", (String) null));
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.qt.add(jSONArray.getString(i));
                    }
                }
                Set<String> setRi = mj.ri(this.qt);
                this.qt = setRi;
                if (setRi != null) {
                    if (setRi.size() == 0) {
                    }
                }
                return null;
            }
            return (String[]) this.qt.toArray(new String[0]);
        } catch (Throwable unused) {
        }
    }

    public boolean zb() {
        return this.aw.ri("read_video_from_cache", 1) == 1;
    }

    public int zf() {
        return this.aw.ri("loadedCallbackOpportunity", 0);
    }

    public long zk() {
        return this.aw.ri("last_req_time", 0L);
    }

    public Set<String> zv() {
        return (Set) this.aw.ri("privacy_fields_allowed", Collections.EMPTY_SET, fi.lr);
    }

    public Set<String> zxp() {
        return (Set) this.aw.ri("token_adx_ids", Collections.EMPTY_SET, fi.lr);
    }

    public int zyn() {
        return this.aw.ri("ivrv_downward", 0);
    }

    private sf() {
        this.qt = Collections.synchronizedSet(new HashSet());
        this.f18148co = new com.bytedance.sdk.openadsdk.core.settings.ri();
        this.aw = new mj(new qt.ri() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.qt.ri
            public void lr() {
                com.bytedance.sdk.openadsdk.core.qt.lr.ri().vr();
                if (sf.tan == null || sf.tan.isEmpty()) {
                    return;
                }
                Iterator it = sf.tan.iterator();
                while (it.hasNext()) {
                    ((qt.ri) it.next()).lr();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.qt.ri
            public void ri() {
                qt.ri[] riVarArr;
                boolean unused = sf.sf = true;
                com.bytedance.sdk.openadsdk.core.qt.lr.ri().bgr();
                if (sf.tan == null || sf.tan.size() == 0 || (riVarArr = (qt.ri[]) sf.tan.toArray()) == null) {
                    return;
                }
                for (qt.ri riVar : riVarArr) {
                    riVar.ri();
                }
            }
        });
        this.bgr = new AtomicBoolean(false);
        this.vr = false;
        this.slm = 5000;
        this.bu = 10;
        this.ac = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.7
            @Override // java.lang.Runnable
            public void run() {
                sf.this.ri(2, false);
                sf.this.luy();
            }
        };
        this.ihz = new fi.lr<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.8
            @Override // com.bytedance.sdk.openadsdk.core.settings.fi.lr
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> lr(String str) {
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
                } catch (Exception e) {
                    ac.ik("get applog rate from sp failed:" + e.getMessage(), new Object[0]);
                    return null;
                }
            }
        };
        this.uq = new HashSet();
        this.wjv = new fi.lr<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.fi.lr
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public Set<String> lr(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            sf.this.bu = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            sf.this.slm = iOptInt2;
                        }
                        JSONArray jSONArray = jSONObject.getJSONArray("core_label_arr");
                        if (jSONArray != null) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String string = jSONArray.getString(i);
                                if (!TextUtils.isEmpty(string)) {
                                    hashSet.add(string);
                                }
                            }
                        }
                    } catch (JSONException e) {
                        e.getMessage();
                    }
                }
                return hashSet.size() == 0 ? new HashSet(Arrays.asList("click", C3700q2.v, "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.ay = new fi.lr<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.fi.lr
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public JSONObject lr(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    ac.ik("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.mj = new fi.lr<com.bytedance.sdk.openadsdk.ka.ri.qt>() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.fi.lr
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.ka.ri.qt lr(String str) {
                com.bytedance.sdk.openadsdk.ka.ri.qt qtVar = new com.bytedance.sdk.openadsdk.ka.ri.qt();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    qtVar.ri(jSONObject.optInt("enable_strategy", 0) == 1);
                    qtVar.ri(ri(jSONObject.optJSONObject(BuildConfig.FLAVOR)));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            qtVar.ri(next, ri(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return qtVar;
            }

            private com.bytedance.sdk.openadsdk.ka.ri.qt.ri ri(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new com.bytedance.sdk.openadsdk.ka.ri.qt.ri(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
    }

    public static void dw(String str) {
        if (str == null) {
            str = "";
        }
        String strJm = jm();
        if (strJm == null || !strJm.equals(str)) {
            com.bytedance.sdk.openadsdk.core.ik.ri().ri("settings_host_from_meta", str);
            fr = str;
            lr().ri(8, true);
        }
    }

    private static SharedPreferences ik(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean ac(String str) {
        return su(str).ihz;
    }

    public int aw(String str) {
        return su(String.valueOf(str)).mj;
    }

    public boolean ay(String str) {
        return su(str).ory;
    }

    public boolean bu(String str) {
        return str == null || DeviceUtils.qt(nr.ri()) == 0 || su(str).aw == 1;
    }

    public boolean co(String str) {
        try {
            return su(str).wjv != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean di(String str) {
        return su(str).xha == 1;
    }

    public boolean fi(String str) {
        int i = su(str).fi;
        if (i != 1) {
            return i == 2 && com.bytedance.sdk.component.utils.nr.ik(nr.ri()) != 0;
        }
        return com.bytedance.sdk.component.utils.nr.ka(nr.ri());
    }

    public boolean fr(String str) {
        return nr.ka().su(str).vr == 1;
    }

    public boolean igq(String str) {
        Set set = (Set) this.aw.ri("privacy_fields_allowed", Collections.EMPTY_SET, fi.lr);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iAy = ig.ay();
        if (iAy != 1) {
            if (iAy != 2 && iAy != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    public int ihz(String str) {
        return su(str).fr;
    }

    public int jbs(String str) {
        if (str == null) {
            return 1500;
        }
        return su(str).slm;
    }

    public boolean ka(String str) {
        return su(str).zf;
    }

    public boolean mj(String str) {
        return str == null || su(str).bgr == 1;
    }

    public JSONObject nr(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.aw.ri("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", su(str).oh);
                return jSONObject2;
            } catch (JSONException e) {
                e = e;
                jSONObject = jSONObject2;
                ac.ik("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    public int qt(String str) {
        return su(str).sf;
    }

    public int sf(String str) {
        return su(str).f18147co;
    }

    public boolean slm(String str) {
        return su(str).uq == 0;
    }

    public lr su(String str) {
        return ik.ri(str);
    }

    public int tan(String str) {
        return su(str).ac;
    }

    public int uq(String str) {
        return su(str).su;
    }

    public int wjv(String str) {
        return su(str).igq;
    }

    public int xha(String str) {
        return su(str).nr;
    }

    public boolean zf(String str) {
        Set<String> setZxp;
        if (TextUtils.isEmpty(str) || (setZxp = zxp()) == null || setZxp.size() == 0) {
            return false;
        }
        return setZxp.contains(str);
    }

    public boolean bgr(String str) {
        return aw(str) != 1;
    }

    public synchronized void ik() {
        SystemClock.elapsedRealtime();
        boolean z = this.vr;
        this.f18148co.ri(this.vr);
        this.aw.ri(this.vr);
        ik.ri(!z);
        this.vr = true;
        SystemClock.elapsedRealtime();
        if (!z) {
            vr.lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.3
                @Override // java.lang.Runnable
                public void run() {
                    sf.this.ri(1, com.bytedance.sdk.openadsdk.core.qt.lr.ri().xha() || com.bytedance.sdk.openadsdk.core.qt.lr.ri().qt());
                    sf.this.luy();
                }
            }, 1000L);
        }
    }

    public void ri() {
        try {
            ik.ri();
            this.aw.ka();
            this.f18148co.ka();
            Context contextRi = nr.ri();
            File file = new File(new File(contextRi.getDataDir(), "shared_prefs"), "tt_sdk_settings.xml");
            if (file.exists() && file.isFile()) {
                contextRi.deleteSharedPreferences(file.getName().replace(".xml", ""));
            }
        } catch (Throwable unused) {
        }
    }

    public int vr(String str) {
        return su(str).qt;
    }

    public static String lr(Context context) {
        SharedPreferences sharedPreferencesIk;
        return (context == null || (sharedPreferencesIk = ik(context)) == null) ? "" : sharedPreferencesIk.getString(di, "");
    }

    public static sf lr() {
        return ri.ri;
    }

    public int lr(String str) {
        Integer num;
        Map map = (Map) this.aw.ri("perf_con_applog_rate", null, this.ihz);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    public boolean ik(String str) {
        return su(str).ik == 1;
    }

    public int lr(int i) {
        return su(String.valueOf(i)).lr;
    }

    public static int ri(Context context) {
        SharedPreferences sharedPreferencesIk;
        if (context == null || (sharedPreferencesIk = ik(context)) == null) {
            return -2;
        }
        int i = sharedPreferencesIk.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
        int i2 = sharedPreferencesIk.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
            return -2;
        }
        return sharedPreferencesIk.getInt("IABTCF_gdprApplies", -1);
    }

    public int ik(int i) {
        return su(String.valueOf(i)).jbs;
    }

    public void ri(JSONObject jSONObject, fi.ri riVar) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        mj mjVar = this.aw;
        String str = jbs;
        String strRi = mjVar.ri("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strRi) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strRi)) {
            vr.lr().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.4
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(sf.this.aw.ri("dyn_draw_engine_url", sf.jbs), strOptString)) {
                        com.bytedance.sdk.component.adexpress.ri.lr.fi.lr().ik();
                    }
                }
            }, 5000L);
        }
        riVar.ri("dyn_draw_engine_url", strOptString);
    }

    public int ri(String str) {
        if (str == null) {
            return 0;
        }
        return nr.ka().su(str).tan;
    }

    public int ri(int i) {
        return su(String.valueOf(i)).hcw;
    }

    public void ri(long j) {
        this.aw.lr().ri("last_req_time", j).ri();
    }

    public void ri(final int i, boolean z) {
        if (com.bytedance.sdk.openadsdk.core.qt.lr.ri().ka()) {
            return;
        }
        if (!vr.fi() && i != 1 && i != 2) {
            if (z) {
                this.nr = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.qt.lr().ka())) {
                return;
            }
            if (this.nr) {
                this.nr = false;
                if (!z) {
                    z = true;
                }
            }
            long jZk = zk();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jAjz = ajz();
            long j = jCurrentTimeMillis - jZk;
            if ((z || j >= jAjz) && this.bgr.compareAndSet(false, true)) {
                dzy.ik((Runnable) new com.bytedance.sdk.component.mj.lr.ik("setting_req") { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.6
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.core.qt.lr.ri().ri(new com.bytedance.sdk.openadsdk.core.qt.ka() { // from class: com.bytedance.sdk.openadsdk.core.settings.sf.6.1
                            @Override // com.bytedance.sdk.openadsdk.core.qt.ka
                            public void ri(boolean z2) {
                                if (!z2) {
                                    sf.this.bgr.set(false);
                                } else {
                                    sf sfVar = sf.this;
                                    new jbs(sfVar, sfVar.aw, sf.this.f18148co).run();
                                }
                            }
                        }, i == 6);
                    }
                });
                vr.lr().removeCallbacks(this.ac);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("settings request error", "settings", th);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.jbs.ri
    public void ri(boolean z) {
        this.bgr.set(false);
        luy();
        if (z) {
            HashMap map = new HashMap();
            Set<String> setZv = zv();
            if (setZv != null && !setZv.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setZv);
            }
            String strNr = ig.nr();
            if (!TextUtils.isEmpty(strNr)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strNr);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, tpb());
            com.bytedance.sdk.openadsdk.core.sf.ik.ri(map);
        }
    }

    public static void ri(qt.ri riVar) {
        ConcurrentLinkedQueue<qt.ri> concurrentLinkedQueue = tan;
        if (concurrentLinkedQueue.contains(riVar)) {
            return;
        }
        concurrentLinkedQueue.add(riVar);
    }
}
