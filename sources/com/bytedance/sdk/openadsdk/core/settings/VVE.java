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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
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
public class VVE implements STP.Lxb, lc {
    private static final ConcurrentLinkedQueue<IeN.Lxb> HD;
    private static final com.bytedance.sdk.component.OY.OY JVA;
    public static String JXs;
    public static final String LD;
    public static final String Lxb;
    private static final String QAg;
    public static String ZU;
    private static final JVA aH;
    static final ConcurrentHashMap<String, Integer> lc;
    public static final String lk;
    private static boolean sLN;
    private final BroadcastReceiver CSn;
    private int DY;
    private final NXR IeN;
    private final JXs.LD<Set<String>> Ivz;
    private final Set<String> KPU;
    private final nBu NXR;
    JXs.LD<com.bytedance.sdk.openadsdk.ZU.Lxb.STP> OY;
    private final com.bytedance.sdk.openadsdk.core.settings.Lxb STP;
    private boolean Sfi;
    private final AtomicBoolean VVE;
    private boolean brP;
    private QAg eK;
    final JXs.LD<ConcurrentHashMap<String, Integer>> ebl;
    private final JXs.LD<Map<String, Integer>> foI;
    private final Runnable id;
    private volatile boolean kqm;
    private Set<String> nBu;
    private JXs.LD<JSONObject> nE;
    private int tD;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.settings.VVE$11, reason: invalid class name */
    public class AnonymousClass11 extends BroadcastReceiver {
        private final Runnable LD = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.11.1
            @Override // java.lang.Runnable
            public void run() {
                hg.LD(new com.bytedance.sdk.component.OY.OY("LoadLocalData") { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.11.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            VVE.this.LD();
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        };

        public AnonymousClass11() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            if (intent == null) {
                return;
            }
            hg.LD(new com.bytedance.sdk.component.OY.OY("setting_receiver") { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.11.2
                @Override // java.lang.Runnable
                public void run() {
                    String action = intent.getAction();
                    if ("_tryFetRemoDat".equals(action)) {
                        VVE.this.Lxb(intent.getIntExtra("_source", 0), intent.getBooleanExtra("_force", false));
                    } else if ("_dataChanged".equals(action)) {
                        com.bytedance.sdk.component.utils.ebl.Lxb().removeCallbacks(AnonymousClass11.this.LD);
                        com.bytedance.sdk.component.utils.ebl.Lxb().postDelayed(AnonymousClass11.this.LD, WorkRequest.MIN_BACKOFF_MILLIS);
                    }
                }
            });
        }
    }

    public static final class Lxb {
        static final VVE Lxb = new VVE();
    }

    static {
        CharSequence[] charSequenceArr = {"bus_con_collect", nJ.Sfi()};
        StringBuilder sb = new StringBuilder();
        sb.append(charSequenceArr[0]);
        sb.append((CharSequence) "_");
        sb.append(charSequenceArr[1]);
        Lxb = sb.toString();
        CharSequence[] charSequenceArr2 = {"bus_con", nJ.Sfi(), nJ.DY(), "timeout"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr2[0]);
        for (int i = 1; i < 4; i++) {
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr2[i]);
        }
        LD = sb2.toString();
        CharSequence[] charSequenceArr3 = {"bus_con", nJ.Sfi(), nJ.DY(), "alpha"};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr3[0]);
        for (int i2 = 1; i2 < 4; i2++) {
            sb3.append((CharSequence) "_");
            sb3.append(charSequenceArr3[i2]);
        }
        lk = sb3.toString();
        QAg = nJ.STP();
        JVA = new com.bytedance.sdk.component.OY.OY("TemplateReInitTask") { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.Lxb.LD.JXs.LD().QAg();
                com.bytedance.sdk.component.adexpress.Lxb.LD.JXs.LD().LD(false);
                com.bytedance.sdk.component.adexpress.Lxb.LD.LD.LD();
                com.bytedance.sdk.component.adexpress.Lxb.LD.JXs.LD().lk();
            }
        };
        ZU = "";
        JXs = AndroidTcfDataSource.TCF_TCSTRING_KEY;
        sLN = false;
        HD = new ConcurrentLinkedQueue<>();
        aH = new JVA();
        lc = new ConcurrentHashMap<>();
    }

    private Set<String> Bg() {
        return (Set) this.IeN.Lxb("perf_con_applog_send", this.KPU, this.Ivz);
    }

    public static boolean Bj() {
        return sLN;
    }

    private long KOQ() {
        long jLxb = this.IeN.Lxb("req_inter_min", TTAdConstant.AD_MAX_EVENT_TIME);
        return (jLxb < 0 || jLxb > 86400000) ? TTAdConstant.AD_MAX_EVENT_TIME : jLxb;
    }

    private long LRt() {
        return this.IeN.Lxb("last_req_time", 0L);
    }

    public static lc TA() {
        if (kqm.Lxb() != null) {
            return Lxb.Lxb;
        }
        ApmHelper.reportCustomError("context is null", "context is null", new IllegalStateException("context is null"));
        return aH;
    }

    private int VB() {
        return this.IeN.Lxb("coppa", -99);
    }

    @Nullable
    private static SharedPreferences ZU(Context context) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(context);
        } catch (Exception unused) {
            return null;
        }
    }

    private static int lk(boolean z) {
        return z ? 20 : 5;
    }

    private String nH() {
        return this.IeN.Lxb("force_language", "");
    }

    public static void owi() {
        Context contextLxb;
        if (com.bytedance.sdk.openadsdk.multipro.LD.lk() && (contextLxb = kqm.Lxb()) != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextLxb.getPackageName());
                intent.setAction("_dataChanged");
                contextLxb.sendBroadcast(intent);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.SdkSettings", "", th);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int AcC() {
        int iLxb = this.IeN.Lxb("bus_con_auto_click_delay", PathInterpolatorCompat.MAX_NUM_POINTS);
        return iLxb <= 0 ? PathInterpolatorCompat.MAX_NUM_POINTS : iLxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String BcA() {
        return this.IeN.Lxb("dyn_draw_engine_url", QAg);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String CG() {
        return this.STP.Lxb("apm_url", "pangolin16.sgsnssdk.com");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public ebl CSn() {
        return (ebl) this.IeN.Lxb("insert_js_config", ebl.Lxb, new JXs.LD<ebl>() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.10
            @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.LD
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public ebl LD(String str) {
                return new ebl(str);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String DY() {
        return this.IeN.Lxb("ab_test_param", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean FD() {
        if (com.bytedance.sdk.component.adexpress.ZU.LD.Lxb(kqm.Lxb())) {
            return this.IeN.Lxb("support_rtl", false);
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public long FGm() {
        long jLxb = this.IeN.Lxb("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME);
        return jLxb < WorkRequest.MIN_BACKOFF_MILLIS ? WorkRequest.MIN_BACKOFF_MILLIS : jLxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean FV() {
        return this.IeN.Lxb(Lxb, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean HD() {
        return this.IeN.Lxb("landingpage_new_style", -1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String Hu() {
        return this.IeN.Lxb("dual_event_url", (String) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int IeN() {
        Bg();
        return this.tD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int Ivz(String str) {
        Integer num;
        Map map = (Map) this.IeN.Lxb("perf_con_applog_rate", null, this.foI);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean Iyd() {
        return this.IeN.Lxb("privacy_app_reg", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int JD() {
        return this.IeN.Lxb(LD, 10000);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int JJ() {
        int iLxb = this.IeN.Lxb("privacy_personalized_ad", Integer.MAX_VALUE);
        if (iLxb != Integer.MAX_VALUE) {
            return iLxb;
        }
        int iVVE = nJ.VVE();
        if (iVVE == 1 || iVVE == 2) {
            return 2;
        }
        return iVVE != 3 ? 0 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int JVA() {
        return this.IeN.Lxb("load_callback_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    @Nullable
    public JSONObject JXs() {
        return (JSONObject) this.IeN.Lxb("digest", null, JXs.Lxb);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean JZE() {
        return this.kqm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int KPU() {
        int iLxb = this.IeN.Lxb("fetch_tpl_second", 0);
        if (iLxb <= 0) {
            return 0;
        }
        return iLxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public JSONObject LXE() {
        return (JSONObject) this.IeN.Lxb("video_cache_config", null, JXs.Lxb);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean Ld() {
        return this.IeN.Lxb("privacy_debug_unlock", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean Lpq() {
        return this.IeN.Lxb("global_rate", 1.0f) == 1.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean Lv() {
        return this.IeN.Lxb("perf_con_adlog_turn_off_retry_stats", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public long MGT() {
        return this.IeN.Lxb("perf_con_adlog_expire_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean NDz() {
        int iLxb = this.IeN.Lxb("privacy_ad_enable", Integer.MAX_VALUE);
        if (iLxb == 1) {
            return true;
        }
        if (iLxb == 0) {
            return false;
        }
        int iVVE = nJ.VVE();
        return iVVE == 1 || iVVE == 2 || iVVE == 3;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public Set<String> NXR() {
        return Bg();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean Ns() {
        return this.IeN.Lxb("read_video_from_cache", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String[] Nu() {
        try {
            Set<String> set = this.nBu;
            if (set == null || set.size() == 0) {
                JSONArray jSONArray = new JSONArray(this.IeN.Lxb("gecko_hosts", (String) null));
                if (jSONArray.length() != 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        this.nBu.add(jSONArray.getString(i));
                    }
                }
                Set<String> setLxb = NXR.Lxb(this.nBu);
                this.nBu = setLxb;
                if (setLxb != null) {
                    if (setLxb.size() == 0) {
                    }
                }
                return null;
            }
            return (String[]) this.nBu.toArray(new String[0]);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean OY() {
        return this.IeN.Lxb("if_both_open", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean Of() {
        return this.IeN.Lxb("bus_con_dislike_report_raw", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int Pw() {
        return this.IeN.Lxb("isGdprUser", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean QAg() {
        return this.IeN.Lxb("support_tnc", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean Rt() {
        return this.IeN.Lxb("bus_con_url_check", 1) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int SS() {
        return this.IeN.Lxb("blank_detect_rate", 30);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int STP() {
        Bg();
        return this.DY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    @NonNull
    public QAg Sfi() {
        QAg qAg = this.eK;
        if (qAg != null) {
            return qAg;
        }
        QAg qAg2 = (QAg) this.NXR.Lxb("mediation_init_conf", QAg.Lxb, new JXs.LD<QAg>() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.9
            @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.LD
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public QAg LD(String str) {
                return new QAg(str);
            }
        });
        this.eK = qAg2;
        return qAg2;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public Set<String> SlV() {
        return (Set) this.IeN.Lxb("perf_con_drop2rt_skip_label_list", Collections.emptySet(), JXs.LD);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int Sv() {
        int iLxb = this.IeN.Lxb("perf_con_webview_cache_count", 0);
        if (iLxb < 0) {
            return 0;
        }
        return iLxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean VU() {
        int iLxb = this.STP.Lxb("perf_con_apm", 100);
        if (iLxb == 0) {
            return false;
        }
        return iLxb < 0 || iLxb >= 100 || iLxb > ((int) (Math.random() * 100.0d));
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean VVE() {
        return this.IeN.Lxb("allow_blind_mode_request_ad", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int Wi() {
        int iLxb = this.IeN.Lxb("bus_con_token_thread_count", 4);
        if (iLxb <= 0 || iLxb > 30) {
            return 4;
        }
        return iLxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int Za() {
        return this.IeN.Lxb("perf_con_drawable_code", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int aH() {
        return this.IeN.Lxb("max", 50);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int ae() {
        return this.IeN.Lxb("bus_con_send_log_type", 1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int bG() {
        return this.IeN.Lxb("perf_con_thread_stack_size", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean bm() {
        return this.IeN.Lxb("bus_con_rewardedfull_link", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean brP() {
        return this.IeN.Lxb("ad_revenue_enable", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean chu() {
        return this.IeN.Lxb("bus_con_video_keep_screen_on", 1) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int dR() {
        return this.IeN.Lxb("vbtt", 5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public long eK() {
        return this.IeN.Lxb("duration", WorkRequest.MIN_BACKOFF_MILLIS);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String eXY() {
        return this.IeN.Lxb("bus_con_check_clz", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public void ebl() {
        this.IeN.Lxb().Lxb("tt_sdk_settings").Lxb("ab_test_param").Lxb();
    }

    public void ek() {
        if (STP.Lxb()) {
            com.bytedance.sdk.openadsdk.core.STP.LD().removeCallbacks(this.id);
            com.bytedance.sdk.openadsdk.core.STP.LD().postDelayed(this.id, KOQ());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int foI() {
        int iLxb = this.IeN.Lxb("fetch_tpl_timeout_ctrl", PathInterpolatorCompat.MAX_NUM_POINTS);
        return iLxb <= 0 ? PathInterpolatorCompat.MAX_NUM_POINTS : iLxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean gS() {
        return this.IeN.Lxb("perf_con_use_new_thread_pool", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String hg() {
        return this.IeN.Lxb("app_log_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public float iC() {
        return this.IeN.Lxb(lk, 1.0f);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String id() {
        return this.IeN.Lxb("playableLoadH5Url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean jeq() {
        return this.IeN.Lxb("bus_con_adshow_check_enable", true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean kqm() {
        return this.IeN.Lxb("support_gzip", false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public long lc() {
        return this.IeN.Lxb("data_time", 0L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int le() {
        return this.IeN.Lxb("ivrv_downward", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean mb() {
        return this.IeN.Lxb("perf_con_is_new_net_thread", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String nBu() {
        return this.IeN.Lxb("ab_test_version", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean nE() {
        return this.IeN.LD();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String nJ() {
        return this.IeN.Lxb("policy_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean nTb() {
        return this.IeN.Lxb("perf_con_adlog_turn_off_retry_ad", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String oc() {
        return this.IeN.Lxb("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int pyu() {
        return this.IeN.Lxb("perf_con_close_button_delay_check_time", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String rW() {
        return this.IeN.Lxb("dc", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int ro() {
        return this.IeN.Lxb("bus_con_behavior_count", 300);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int sLN() {
        return this.IeN.Lxb("splash_video_load_strategy", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean sRq() {
        return this.IeN.Lxb("bus_con_sec_type", Integer.MAX_VALUE) != 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int tD() {
        return this.IeN.Lxb("loadedCallbackOpportunity", 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int uxf() {
        int iLxb = this.IeN.Lxb("perf_con_webview_cache_count_v3", 0);
        if (iLxb < 0) {
            return 0;
        }
        return iLxb;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public com.bytedance.sdk.openadsdk.ZU.Lxb.STP wCT() {
        return (com.bytedance.sdk.openadsdk.ZU.Lxb.STP) this.IeN.Lxb("perf_con_track_url_strategy", com.bytedance.sdk.openadsdk.ZU.Lxb.STP.Lxb, this.OY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public JSONObject wPa() {
        return (JSONObject) this.IeN.Lxb("perf_con_thread_pool_config", new JSONObject(), this.nE);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public void wbY() {
        this.brP = true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String xan() {
        return this.IeN.Lxb("ads_url", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean xr() {
        return this.IeN.Lxb("perf_con_apm_native", Integer.MAX_VALUE) == 1;
    }

    private VVE() {
        this.nBu = Collections.synchronizedSet(new HashSet());
        this.NXR = new nBu();
        this.STP = new com.bytedance.sdk.openadsdk.core.settings.Lxb();
        this.IeN = new NXR(new IeN.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.6
            @Override // com.bytedance.sdk.openadsdk.core.settings.IeN.Lxb
            public void LD() {
                if (VVE.HD == null || VVE.HD.isEmpty()) {
                    return;
                }
                Iterator it = VVE.HD.iterator();
                while (it.hasNext()) {
                    ((IeN.Lxb) it.next()).LD();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.IeN.Lxb
            public void Lxb() {
                IeN.Lxb[] lxbArr;
                boolean unused = VVE.sLN = true;
                if (VVE.HD == null || VVE.HD.size() == 0 || (lxbArr = (IeN.Lxb[]) VVE.HD.toArray()) == null) {
                    return;
                }
                for (IeN.Lxb lxb : lxbArr) {
                    lxb.Lxb();
                }
            }
        });
        this.VVE = new AtomicBoolean(false);
        this.kqm = false;
        this.brP = false;
        this.tD = 5000;
        this.DY = 10;
        AnonymousClass11 anonymousClass11 = new AnonymousClass11();
        this.CSn = anonymousClass11;
        this.id = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.12
            @Override // java.lang.Runnable
            public void run() {
                VVE.this.ZU(2);
                VVE.this.ek();
            }
        };
        this.ebl = new JXs.LD<ConcurrentHashMap<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.13
            @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.LD
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public ConcurrentHashMap<String, Integer> LD(String str) {
                if (TextUtils.isEmpty(str)) {
                    return VVE.lc;
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
                } catch (JSONException e) {
                    e.getMessage();
                }
                return concurrentHashMap;
            }
        };
        this.foI = new JXs.LD<Map<String, Integer>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.2
            @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.LD
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public Map<String, Integer> LD(String str) {
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
                    com.bytedance.sdk.component.utils.sLN.LD("get applog rate from sp failed:" + e.getMessage());
                    return null;
                }
            }
        };
        this.KPU = new HashSet();
        this.Ivz = new JXs.LD<Set<String>>() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.3
            @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.LD
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public Set<String> LD(String str) {
                HashSet hashSet = new HashSet();
                if (!TextUtils.isEmpty(str)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        int iOptInt = jSONObject.optInt("applog_count");
                        if (iOptInt >= 2 && iOptInt <= 100) {
                            VVE.this.DY = iOptInt;
                        }
                        int iOptInt2 = jSONObject.optInt("applog_interval");
                        if (iOptInt2 >= 100 && iOptInt2 <= 30000) {
                            VVE.this.tD = iOptInt2;
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
                return hashSet.size() == 0 ? new HashSet(Arrays.asList(CampaignEx.JSON_NATIVE_VIDEO_CLICK, "show", "insight_log", "mrc_show")) : hashSet;
            }
        };
        this.nE = new JXs.LD<JSONObject>() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.4
            @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.LD
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public JSONObject LD(String str) {
                JSONObject jSONObject;
                try {
                    jSONObject = new JSONObject(str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.SdkSettings", th.getMessage());
                    jSONObject = null;
                }
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        };
        this.OY = new JXs.LD<com.bytedance.sdk.openadsdk.ZU.Lxb.STP>() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.5
            @Override // com.bytedance.sdk.openadsdk.core.settings.JXs.LD
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public com.bytedance.sdk.openadsdk.ZU.Lxb.STP LD(String str) {
                com.bytedance.sdk.openadsdk.ZU.Lxb.STP stp = new com.bytedance.sdk.openadsdk.ZU.Lxb.STP();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    stp.Lxb(jSONObject.optInt("enable_strategy", 0) == 1);
                    stp.Lxb(Lxb(jSONObject.optJSONObject(MRAIDCommunicatorUtil.STATES_DEFAULT)));
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("adid_configs");
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            stp.Lxb(next, Lxb(jSONObjectOptJSONObject.getJSONObject(next)));
                        }
                    }
                } catch (Exception unused) {
                }
                return stp;
            }

            private com.bytedance.sdk.openadsdk.ZU.Lxb.STP.Lxb Lxb(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new com.bytedance.sdk.openadsdk.ZU.Lxb.STP.Lxb(jSONObject.optInt("retry_times", -1), jSONObject.optInt("time_interval", -1));
                }
                return null;
            }
        };
        try {
            Context contextLxb = kqm.Lxb();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("_dataChanged");
            if (Build.VERSION.SDK_INT >= 33) {
                contextLxb.registerReceiver(anonymousClass11, intentFilter, 4);
            } else {
                contextLxb.registerReceiver(anonymousClass11, intentFilter);
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.SdkSettings", "", e);
        }
    }

    public static String lk(Context context) {
        SharedPreferences sharedPreferencesZU;
        return (context == null || (sharedPreferencesZU = ZU(context)) == null) ? "" : sharedPreferencesZU.getString(JXs, "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int CSn(String str) {
        return foI(str).hg;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean DY(String str) {
        return foI(str).Sfi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int HD(String str) {
        return foI(str).foI;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int JVA(String str) {
        return foI(str).sLN;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean JXs(String str) {
        int i = foI(str).JXs;
        if (i != 1) {
            return i == 2 && com.bytedance.sdk.component.utils.IeN.lk(kqm.Lxb()) != 0;
        }
        return com.bytedance.sdk.component.utils.IeN.ZU(kqm.Lxb());
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean KPU(@NonNull String str) {
        Set set = (Set) this.IeN.Lxb("privacy_fields_allowed", Collections.emptySet(), JXs.LD);
        if (!set.isEmpty()) {
            return set.contains(str);
        }
        int iVVE = nJ.VVE();
        if (iVVE != 1) {
            if (iVVE != 2 && iVVE != 3) {
                return false;
            }
            if (!"mcc".equals(str) && !"mnc".equals(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int NXR(String str) {
        return foI(String.valueOf(str)).OY;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean OY(String str) {
        return str == null || foI(str).STP == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int QAg(String str) {
        if (str == null) {
            return 1500;
        }
        return foI(str).VVE;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean VVE(String str) {
        return foI(str).HD == 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int ZU() {
        return this.IeN.Lxb("max_tpl_cnts", 100);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean aH(String str) {
        return foI(str).xan;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public JSONObject brP(String str) {
        JSONObject jSONObject = null;
        try {
            JSONObject jSONObject2 = new JSONObject(this.IeN.Lxb("core_settings", ""));
            try {
                jSONObject2.put("ad_slot_setting", foI(str).Of);
                return jSONObject2;
            } catch (JSONException e) {
                e = e;
                jSONObject = jSONObject2;
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.SdkSettings", "getCoreSettingJsonObj", e.getMessage());
                return jSONObject;
            }
        } catch (JSONException e2) {
            e = e2;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int eK(String str) {
        return foI(str).KPU;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int ebl(String str) {
        return foI(str).brP;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    @NonNull
    public LD foI(String str) {
        return lk.Lxb(str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean id(String str) {
        return kqm.ZU().foI(str).IeN == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean kqm(String str) {
        return str == null || DeviceUtils.OY(kqm.Lxb()) == 0 || foI(str).NXR == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean lc(String str) {
        return foI(str).ebl == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int nBu(String str) {
        return foI(str).JVA;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean sLN(String str) {
        try {
            return foI(str).eK != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int tD(String str) {
        return foI(str).DY;
    }

    private static void LD(int i, boolean z) {
        Context contextLxb = kqm.Lxb();
        if (contextLxb != null) {
            try {
                Intent intent = new Intent();
                intent.setPackage(contextLxb.getPackageName());
                intent.setAction("_tryFetRemoDat");
                intent.putExtra("_force", z);
                intent.putExtra("_source", i);
                contextLxb.sendBroadcast(intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int IeN(String str) {
        return foI(str).nBu;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public void Lxb() {
        File file;
        try {
            lk.Lxb();
            this.IeN.lk();
            this.NXR.lk();
            this.STP.lk();
            Context contextLxb = kqm.Lxb();
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                file = new File(contextLxb.getDataDir(), "shared_prefs");
            } else {
                file = new File(contextLxb.getDatabasePath("1").getParentFile().getParentFile(), "shared_prefs");
            }
            File file2 = new File(file, "tt_sdk_settings.xml");
            if (file2.exists() && file2.isFile()) {
                String strReplace = file2.getName().replace(".xml", "");
                if (i >= 24) {
                    contextLxb.deleteSharedPreferences(strReplace);
                } else {
                    contextLxb.getSharedPreferences(strReplace, 0).edit().clear().apply();
                    com.bytedance.sdk.component.utils.lc.lk(file2);
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean STP(String str) {
        return NXR(str) != 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int Sfi(String str) {
        return foI(str).id;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean ZU(String str) {
        return foI(str).Ivz;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public void Ivz() {
        String strNH = nH();
        if (TextUtils.isEmpty(strNH)) {
            return;
        }
        if (strNH.equals("zh-Hant")) {
            com.bytedance.sdk.component.utils.QAg.Lxb(kqm.Lxb(), "zh", "tw");
        } else {
            com.bytedance.sdk.component.utils.QAg.Lxb(kqm.Lxb(), strNH, null);
        }
        try {
            TTAdDislikeToast.onResourceUpdated();
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.SdkSettings", th.getMessage());
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public void ZU(@TTSdkSettings.FETCH_REQUEST_SOURCE int i) {
        Lxb(i, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public String lk() {
        return this.IeN.Lxb("aes_key", "");
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean lk(String str) {
        return foI(str).lk == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int lk(int i) {
        return foI(String.valueOf(i)).QAg;
    }

    public static int LD(Context context) {
        SharedPreferences sharedPreferencesZU;
        if (context == null || (sharedPreferencesZU = ZU(context)) == null) {
            return -2;
        }
        int i = sharedPreferencesZU.getInt("IABTCF_CmpSdkID", Integer.MIN_VALUE);
        int i2 = sharedPreferencesZU.getInt("IABTCF_CmpSdkVersion", Integer.MIN_VALUE);
        if (i == Integer.MIN_VALUE && i2 == Integer.MIN_VALUE) {
            return -2;
        }
        return sharedPreferencesZU.getInt("IABTCF_gdprApplies", -1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    @WorkerThread
    public synchronized void LD() {
        SystemClock.elapsedRealtime();
        boolean z = !this.kqm;
        this.NXR.Lxb(this.kqm);
        this.STP.Lxb(this.kqm);
        this.IeN.Lxb(this.kqm);
        lk.Lxb(z);
        com.bytedance.sdk.openadsdk.core.QAg.LD().ZU(VB());
        this.kqm = true;
        SystemClock.elapsedRealtime();
        if (z) {
            com.bytedance.sdk.openadsdk.core.STP.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.7
                @Override // java.lang.Runnable
                public void run() {
                    if (!STP.Lxb()) {
                        com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.Lxb().LD();
                    } else {
                        VVE.this.ZU(1);
                        VVE.this.ek();
                    }
                }
            }, 1000L);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public void Lxb(JSONObject jSONObject, JXs.Lxb lxb) {
        if (jSONObject == null || !jSONObject.has("dyn_draw_engine_url")) {
            return;
        }
        NXR nxr = this.IeN;
        String str = QAg;
        String strLxb = nxr.Lxb("dyn_draw_engine_url", str);
        final String strOptString = jSONObject.optString("dyn_draw_engine_url", str);
        if (!TextUtils.isEmpty(strLxb) && !TextUtils.isEmpty(strOptString) && !strOptString.equals(strLxb)) {
            com.bytedance.sdk.openadsdk.core.STP.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.VVE.8
                @Override // java.lang.Runnable
                public void run() {
                    if (TextUtils.equals(VVE.this.IeN.Lxb("dyn_draw_engine_url", VVE.QAg), strOptString)) {
                        com.bytedance.sdk.component.adexpress.Lxb.LD.JXs.LD().lk();
                    }
                }
            }, 5000L);
        }
        lxb.Lxb("dyn_draw_engine_url", strOptString);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public void LD(JSONObject jSONObject, JXs.Lxb lxb) {
        if (jSONObject.has("is_gdpr_user")) {
            int iOptInt = jSONObject.optInt("is_gdpr_user", -1);
            lxb.Lxb("isGdprUser", (iOptInt == -1 || iOptInt == 1 || iOptInt == 0) ? iOptInt : -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int Lxb(String str) {
        if (str == null) {
            return 0;
        }
        return kqm.ZU().foI(str).tD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int LD(String str) {
        Integer num;
        Map map = (Map) this.IeN.Lxb("perf_con_stats_rate", lc, this.ebl);
        if (map == null || (num = (Integer) map.get(str)) == null || num.intValue() < 0 || num.intValue() > 100) {
            return 100;
        }
        return num.intValue();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int Lxb(String str, boolean z) {
        if (str == null) {
            return lk(z);
        }
        int i = foI(str).CSn;
        return i != -1 ? i : lk(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int Lxb(int i) {
        return foI(String.valueOf(i)).CG;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public int LD(int i) {
        return foI(String.valueOf(i)).LD;
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public void Lxb(long j) {
        this.IeN.Lxb().Lxb("last_req_time", j).Lxb();
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public void Lxb(@TTSdkSettings.FETCH_REQUEST_SOURCE int i, boolean z) {
        if (!com.bytedance.sdk.openadsdk.core.STP.JXs() && i != 1 && i != 2) {
            if (z) {
                this.Sfi = true;
                return;
            }
            return;
        }
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.QAg.LD().ZU())) {
                return;
            }
            if (this.Sfi) {
                this.Sfi = false;
                if (!z) {
                    z = true;
                }
            }
            long jLRt = LRt();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jKOQ = KOQ();
            long j = jCurrentTimeMillis - jLRt;
            if (!z && j < jKOQ) {
                com.bytedance.sdk.openadsdk.core.nBu.Lxb.Lxb();
                return;
            }
            if (!STP.Lxb()) {
                LD(i, z);
            } else if (this.VVE.compareAndSet(false, true)) {
                hg.LD((com.bytedance.sdk.component.OY.OY) new STP(this, this.IeN, this.NXR, this.STP));
                com.bytedance.sdk.openadsdk.core.STP.LD().removeCallbacks(this.id);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.STP.Lxb
    public void Lxb(boolean z) {
        this.VVE.set(false);
        ek();
        if (z) {
            owi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public void Lxb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("_tryFetRemoDat");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this.CSn, intentFilter, 4);
            } else {
                context.registerReceiver(this.CSn, intentFilter);
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.SdkSettings", "", e);
        }
        if (JZE()) {
            ZU(1);
            ek();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.lc
    public boolean Lxb(PangleEncryptConstant.CryptDataScene cryptDataScene) {
        if (cryptDataScene != PangleEncryptConstant.CryptDataScene.GET_ADS && cryptDataScene != PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN) {
            if (cryptDataScene == PangleEncryptConstant.CryptDataScene.APP_LOG) {
                return this.IeN.Lxb("perf_con_crypt_V4_applog", false);
            }
            return this.IeN.Lxb("perf_con_crypt_V4", false);
        }
        return this.IeN.Lxb("perf_con_crypt_V4_get_ad", false);
    }

    public static void Lxb(IeN.Lxb lxb) {
        ConcurrentLinkedQueue<IeN.Lxb> concurrentLinkedQueue = HD;
        if (concurrentLinkedQueue.contains(lxb)) {
            return;
        }
        concurrentLinkedQueue.add(lxb);
    }
}
