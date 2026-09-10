package com.bytedance.sdk.openadsdk.uq;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class mj {
    private long aac;
    private String ac;
    private int adz;
    private ri ajz;
    private String akr;
    private boolean amj;
    private Runnable aw;
    private boolean ay;
    private boolean bfa;
    private Runnable bgr;
    private int bnj;
    private boolean bu;
    private int bzf;
    private boolean cem;
    private JSONObject che;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private final Handler f18167co;
    private JSONObject de;
    private final String di;
    private boolean du;
    private long dw;
    private long dzy;
    private String eb;
    private boolean eqw;
    private int eu;
    private int evm;
    private int ezp;
    private int fb;
    private boolean fe;
    private String feb;
    public final String fi;
    private boolean fn;
    private String fr;
    private int gcp;
    private long hcw;
    private String hd;
    private di hpn;
    private int hws;
    private ViewTreeObserver.OnGlobalLayoutListener ib;
    private ik id;
    private long ig;
    private long igq;
    private String ihz;
    public final String ik;
    private String iph;
    private Runnable jbs;
    private String jc;
    private String jg;
    private int jm;
    private int jxw;
    public final String ka;
    private boolean klz;
    private String kt;
    private boolean lau;
    public final String lr;
    private WebView luy;
    private final Handler mj;
    private int mvf;
    private String nbc;
    private int nd;
    private JSONObject nh;
    private boolean nr;
    private long oh;
    private long ory;
    private int pc;
    private Map<String, String> pu;
    private long pv;
    private long qd;
    private boolean qh;
    private com.bytedance.sdk.openadsdk.uq.ri qmx;
    private Runnable qt;
    private String rbz;
    public final String ri;
    private String rzk;
    private int saa;
    private String sez;
    private Runnable sf;
    private int siy;
    private String skk;
    private boolean slm;
    private int smj;
    private String srn;
    private long su;
    private int sz;
    private int ta;
    private Set<String> tan;
    private String tn;
    private int tnn;
    private int tpb;
    private boolean tq;
    private int tw;
    private String tyc;
    private List<JSONObject> tyz;
    private WeakReference<View> ud;
    private boolean uq;
    private lr vr;
    private String vt;
    private volatile boolean vz;
    private int whw;
    private boolean wjv;
    private long xd;
    private long xe;
    private boolean xh;
    private final String xha;
    private float xlq;
    private int xm;
    private volatile boolean yjg;
    private JSONObject yjm;
    private int zb;
    private int zf;
    private Context zk;
    private float zv;
    private float zxp;
    private int zyn;

    public enum ri {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private mj(Context context, WebView webView, ik ikVar, com.bytedance.sdk.openadsdk.uq.ri riVar, ri riVar2) {
        this.di = "playable_stuck_check_ping";
        this.xha = "playable_apply_media_permission_callback";
        this.mj = new Handler(Looper.getMainLooper());
        this.f18167co = new Handler(Looper.getMainLooper());
        this.slm = true;
        this.bu = true;
        this.nr = true;
        this.ri = "PL_sdk_playable_global_viewable";
        this.lr = "PL_sdk_page_screen_blank";
        this.ik = "PL_sdk_playable_destroy_analyze_summary";
        this.ka = "PL_sdk_playable_hardware_dialog_cancel";
        this.fi = "PL_sdk_playable_hardware_dialog_setting";
        this.tan = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.ac = null;
        this.ihz = "embeded_ad";
        this.uq = true;
        this.wjv = true;
        this.ay = false;
        this.fr = "";
        this.su = 10L;
        this.igq = 10L;
        this.zf = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
        this.dw = 0L;
        this.ory = 0L;
        this.hcw = -1L;
        this.oh = -1L;
        this.xd = -1L;
        this.dzy = -1L;
        this.pv = -1L;
        this.ig = -1L;
        this.qd = -1L;
        this.srn = "";
        this.jc = "";
        this.kt = "";
        this.feb = "";
        this.zyn = 0;
        this.tnn = 0;
        this.fe = false;
        this.ta = 0;
        this.bnj = -1;
        this.siy = 0;
        this.whw = 0;
        this.xm = 0;
        this.rzk = null;
        this.qh = false;
        this.gcp = 0;
        this.tw = 0;
        this.nd = 0;
        this.zb = 0;
        this.aac = 0L;
        this.xe = 0L;
        this.saa = -2;
        this.pc = 0;
        this.hws = 0;
        this.jxw = 0;
        this.nh = new JSONObject();
        this.pu = new HashMap();
        this.che = new JSONObject();
        this.akr = "";
        this.zv = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.xlq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.bfa = false;
        this.tq = false;
        this.klz = false;
        this.tyz = new ArrayList();
        this.lau = true;
        this.yjg = true;
        this.vz = true;
        this.ib = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.uq.mj.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) mj.this.ud.get();
                    if (view == null) {
                        return;
                    }
                    mj.this.lr(view);
                } catch (Throwable th) {
                    xha.ri("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.mvf = -1;
        this.saa = 0;
        this.ajz = riVar2;
        this.luy = webView;
        jbs.ri(webView);
        ri(webView);
        ri(context, ikVar, riVar);
    }

    public static /* synthetic */ int aw(mj mjVar) {
        int i = mjVar.tnn;
        mjVar.tnn = i + 1;
        return i;
    }

    public static /* synthetic */ int co(mj mjVar) {
        int i = mjVar.zyn;
        mjVar.zyn = i + 1;
        return i;
    }

    private void feb() {
        Runnable runnable;
        Runnable runnable2;
        this.vr.ri(System.currentTimeMillis());
        Handler handler = this.f18167co;
        if (handler != null) {
            int i = this.saa;
            if (i == 0 && (runnable2 = this.aw) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.bgr) != null) {
                handler.post(runnable);
            }
            this.vr.ri(500);
        }
    }

    private void jc() {
        this.vr = new lr(this, this.zf);
        this.jbs = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.5
            @Override // java.lang.Runnable
            public void run() {
                if (mj.this.uq) {
                    mj.this.uq = false;
                    mj.this.mj.removeCallbacks(mj.this.qt);
                    mj.this.ri(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.qt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.6
            @Override // java.lang.Runnable
            public void run() {
                if (mj.this.uq) {
                    mj.this.uq = false;
                    mj.this.yjg = false;
                    mj.this.mj.removeCallbacks(mj.this.jbs);
                    mj.this.ri(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.aw = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (mj.this.luy != null) {
                    mj.this.luy.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.uq.mj.7.1
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (mj.this.vr != null) {
                                mj.this.vr.ri(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (mj.this.f18167co != null) {
                    mj.this.f18167co.postDelayed(this, 500L);
                }
            }
        };
        this.bgr = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                mj.this.ri("playable_stuck_check_ping", new JSONObject());
                if (mj.this.f18167co != null) {
                    mj.this.f18167co.postDelayed(this, 500L);
                }
            }
        };
        this.sf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.9
            @Override // java.lang.Runnable
            public void run() {
                if (mj.this.xe <= 0) {
                    mj.this.lr(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (mj.this.xe - mj.this.aac > mj.this.zf) {
                        mj.this.lr(1, "Clicking on the hot zone causes the program to freeze.");
                        return;
                    }
                    mj.this.oh();
                    mj.this.aac = 0L;
                    mj.this.xe = 0L;
                }
            }
        };
    }

    private void kt() {
        String str;
        if (this.che == null || (str = this.hd) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.che.optString(BidResponsedEx.KEY_CID);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.hd).getHost();
        if (TextUtils.isEmpty(host)) {
            this.hd += "/cid_" + strOptString;
            return;
        }
        this.hd = this.hd.replace(host, host + "/cid_" + strOptString);
    }

    public JSONObject ac() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.zxp);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.eu);
            jSONObject2.put("height", this.tpb);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.adz);
            jSONObject3.put("y", this.jm);
            jSONObject3.put("width", this.ezp);
            jSONObject3.put("height", this.evm);
            jSONObject.put(X3.i.K, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.fb);
            jSONObject4.put("y", this.sz);
            jSONObject4.put("width", this.bzf);
            jSONObject4.put("height", this.smj);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "getViewport error", th);
            return jSONObject;
        }
    }

    public void ay() {
        this.bnj = 2;
    }

    public JSONObject bgr() {
        boolean zRi;
        boolean zRi2;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zRi = fi.ri(this.zk, "android.permission.READ_MEDIA_IMAGES");
                zRi2 = true;
            } else {
                zRi = fi.ri(this.zk, "android.permission.READ_EXTERNAL_STORAGE");
                zRi2 = fi.ri(this.zk, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zRi);
            jSONObject.put("isHasWrite", zRi2);
            if (!zRi || !zRi2) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public com.bytedance.sdk.openadsdk.uq.ri bu() {
        return this.qmx;
    }

    public void dw() {
        lr lrVar;
        this.xe = System.currentTimeMillis();
        int i = this.saa;
        if ((i == 1 || i == 2) && (lrVar = this.vr) != null) {
            lrVar.ri(System.currentTimeMillis());
        }
    }

    public void dzy() {
        this.hws = 0;
        this.jxw = 0;
        this.zxp = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.eu = 0;
        this.tpb = 0;
        this.jm = 0;
        this.adz = 0;
        this.ezp = 0;
        this.evm = 0;
        this.sz = 0;
        this.fb = 0;
        this.bzf = 0;
        this.smj = 0;
    }

    public void fr() {
        this.qh = true;
    }

    public void hcw() {
        this.vz = false;
        this.mj.removeCallbacks(this.qt);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.xd > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.xd);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            ik("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public int ig() {
        return (this.oh == -1 || !this.amj) ? 1 : 2;
    }

    public void igq() {
        if (this.qmx != null) {
            ri riVar = ri.LAND_PAGE;
        }
    }

    public void ihz() {
        com.bytedance.sdk.openadsdk.uq.ri riVar = this.qmx;
        if (riVar != null) {
            riVar.lr();
        }
    }

    public JSONObject nr() {
        if (this.nh.isNull("width")) {
            View view = this.ud.get();
            if (view == null) {
                return this.nh;
            }
            lr(view);
        }
        return this.nh;
    }

    public void oh() {
        if (this.wjv) {
            this.ig = System.currentTimeMillis();
            if (this.ajz == ri.FEED_AWEME) {
                if (this.amj && this.pc == 3) {
                    lr lrVar = this.vr;
                    if (lrVar != null && lrVar.lr()) {
                        feb();
                        return;
                    } else {
                        if (this.vr == null) {
                            this.vr = new lr(this, this.zf);
                            feb();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.amj && this.pc == 2) {
                lr lrVar2 = this.vr;
                if (lrVar2 != null && lrVar2.lr()) {
                    feb();
                } else if (this.vr == null) {
                    this.vr = new lr(this, this.zf);
                    feb();
                }
            }
        }
    }

    public void ory() {
        int i;
        int i2 = this.saa;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.yjg) {
                this.mj.postDelayed(this.jbs, this.su * 1000);
            }
            if ((this.vz && co(this.hd)) || (i = this.saa) == 1 || i == 2) {
                this.mj.postDelayed(this.qt, this.igq * 1000);
            }
        }
    }

    public void pv() {
        if (this.klz) {
            return;
        }
        this.klz = true;
        this.ory = 0L;
        this.bu = true;
        dzy();
        try {
            View view = this.ud.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.ib);
            }
        } catch (Throwable unused) {
        }
        try {
            this.hpn.lr();
        } catch (Throwable unused2) {
        }
        try {
            lr lrVar = this.vr;
            if (lrVar != null) {
                lrVar.ri();
                this.vr = null;
            }
            Handler handler = this.f18167co;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.hd)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.zyn);
                jSONObject.put("playable_hit_times", this.tnn);
                int i = this.zyn;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.tnn) / (((double) i) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                ik("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.hd)) {
                if (this.hcw != -1) {
                    this.dw += System.currentTimeMillis() - this.hcw;
                    this.hcw = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.dw);
                ik("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.yjg = false;
        this.vz = false;
        this.mj.removeCallbacks(this.jbs);
        this.mj.removeCallbacks(this.qt);
        this.mj.removeCallbacksAndMessages(null);
    }

    public String qd() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public String slm() {
        com.bytedance.sdk.openadsdk.uq.ri riVar;
        if (TextUtils.isEmpty(this.kt) && (riVar = this.qmx) != null) {
            this.kt = riVar.ri().toString();
        }
        return this.kt;
    }

    public int srn() {
        return this.mvf;
    }

    public void su() {
        if (this.qmx != null) {
            ri riVar = ri.LAND_PAGE;
        }
    }

    public JSONObject tan() {
        return this.che;
    }

    public void uq() {
        com.bytedance.sdk.openadsdk.uq.ri riVar = this.qmx;
        if (riVar != null) {
            riVar.ik();
        }
    }

    public JSONObject vr() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.ajz.ordinal());
            jSONObject.put("safe_area_top_height", this.zv);
            jSONObject.put("safe_area_bottom_height", this.xlq);
            jSONObject.put("playable_enter_from", this.whw);
            jSONObject.put("playable_retry_count", this.siy);
            jSONObject.put("playable_card_session", this.srn);
            jSONObject.put("playable_video_session", this.jc);
            jSONObject.put("playable_network_type", slm());
            jSONObject.put("aweme_id", this.feb);
            return jSONObject;
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void wjv() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.pv > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.pv);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.xd > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.xd;
                this.qd = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            ik("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void xd() {
        try {
            lr lrVar = this.vr;
            if (lrVar != null) {
                lrVar.ri();
            }
            Handler handler = this.f18167co;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public void zf() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.pv > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.pv);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.xd > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.xd);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            ik("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    private boolean co(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public JSONObject aw() {
        try {
            boolean zRi = fi.ri(this.zk, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zRi);
            return jSONObject;
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public String di() {
        return this.iph;
    }

    public String fi() {
        return this.eb;
    }

    public JSONObject ik() {
        return this.de;
    }

    public boolean jbs() {
        return this.amj;
    }

    public String ka() {
        return this.vt;
    }

    public boolean mj() {
        return this.eqw;
    }

    public JSONObject qt() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.fn);
            return jSONObject;
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public Set<String> sf() {
        return this.hpn.ri();
    }

    public String xha() {
        return this.rbz;
    }

    public JSONObject co() {
        try {
            boolean zRi = fi.ri(this.zk, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zRi);
            return jSONObject;
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public mj di(String str) {
        this.ihz = str;
        return this;
    }

    public mj fi(String str) {
        this.rbz = str;
        return this;
    }

    public mj ik(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.de = jSONObject;
            return this;
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "setPlayableStyle error", th);
            return this;
        }
    }

    public void jbs(String str) {
        WebView webView;
        boolean z = this.pc == -1;
        this.pc = 2;
        if (!z) {
            this.sez = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.dzy = jCurrentTimeMillis;
                long j = this.xd;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", ig());
            } catch (Throwable th) {
                xha.ri("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            ik("PL_sdk_html_load_finish", jSONObject);
        }
        this.yjg = false;
        this.mj.removeCallbacks(this.jbs);
        try {
            if (this.saa == 0) {
                if (this.slm && (webView = this.luy) != null) {
                    this.slm = false;
                    webView.evaluateJavascript(qd(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.uq.mj.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                oh();
            }
        } catch (Throwable th2) {
            xha.ri("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public mj ka(String str) {
        this.iph = str;
        return this;
    }

    public JSONObject mj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", fi.lr(this.zk, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt == 2) {
                    jSONObject2.put("result", fi.lr(this.zk, "android.permission.CAMERA"));
                    return jSONObject2;
                }
                if (iOptInt == 3) {
                    jSONObject2.put("result", fi.ri(this.zk));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void sf(String str) {
        this.mj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.3
            @Override // java.lang.Runnable
            public void run() {
                mj.aw(mj.this);
            }
        });
    }

    public mj xha(String str) {
        int iIndexOf;
        String strDecode;
        this.akr = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (!X3.i.K.equalsIgnoreCase(host) && (host == null || !host.contains(X3.i.K))) {
                    if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                        if (this.saa == -1) {
                            lr(2);
                        } else {
                            lr(1);
                        }
                    }
                } else {
                    lr(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                }
            } else {
                lr(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            }
        } catch (Throwable unused) {
        }
        this.hd = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.hws == view.getWidth() && this.jxw == view.getHeight()) {
                return;
            }
            this.hws = view.getWidth();
            this.jxw = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.hws);
            jSONObject.put("height", this.jxw);
            ri("resize", jSONObject);
            this.nh = jSONObject;
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public void di(JSONObject jSONObject) {
        lr(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void fi(JSONObject jSONObject) {
        this.yjm = jSONObject;
        this.xm++;
        xd();
        this.mj.removeCallbacks(this.sf);
        if (this.wjv) {
            this.ig = System.currentTimeMillis();
            this.aac = System.currentTimeMillis();
            this.xe = 0L;
            int i = this.saa;
            if (i == 0) {
                WebView webView = this.luy;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.uq.mj.10
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            mj.this.xe = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                ri("playable_stuck_check_ping", new JSONObject());
            }
            this.mj.postDelayed(this.sf, this.zf);
        }
    }

    public mj ka(boolean z) {
        this.fn = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.fn);
            ri("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "setPlayableClick error", th);
            return this;
        }
    }

    private void ri(Context context, ik ikVar, com.bytedance.sdk.openadsdk.uq.ri riVar) {
        this.ac = UUID.randomUUID().toString();
        this.zk = context;
        this.qmx = riVar;
        this.id = ikVar;
        qt.ri(riVar);
        this.hpn = new di(this);
        jc();
        if (this.luy == null) {
            this.mvf = 4;
            this.mj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.4
                @Override // java.lang.Runnable
                public void run() {
                    mj.this.ri(5, "webview is null");
                }
            });
        }
    }

    public void qt(String str) {
        this.mj.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.mj.2
            @Override // java.lang.Runnable
            public void run() {
                mj.co(mj.this);
            }
        });
    }

    public void di(boolean z) {
        this.cem = z;
    }

    public mj ik(boolean z) {
        if (this.mvf != -1 && this.amj != z) {
            this.amj = z;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.amj) {
                    jSONObject.put("playable_background_show_type", this.tw);
                }
            } catch (JSONException unused) {
            }
            ik(this.amj ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.oh == -1 && this.amj) {
                this.oh = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.mvf == 1 ? 1 : 2);
                    int i = this.mvf;
                    if (i != -1) {
                        jSONObject2.put("webview_state", i);
                    }
                } catch (JSONException unused2) {
                }
                ik("PL_sdk_page_show", jSONObject2);
            }
            if (this.oh != -1 && !this.amj && !this.bfa) {
                this.bfa = true;
            }
            if (this.amj) {
                this.hcw = System.currentTimeMillis();
            } else if (this.hcw != -1) {
                this.dw += System.currentTimeMillis() - this.hcw;
                this.hcw = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.amj);
                ri(X3.h.V, jSONObject3);
            } catch (Throwable th) {
                xha.ri("PlayablePlugin", "setViewable error", th);
            }
            if (this.amj) {
                oh();
            } else {
                xd();
            }
        }
        return this;
    }

    public void ka(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.rzk = jSONObject.optString("section");
        }
    }

    private String ka(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.hd = str3;
        return str3;
    }

    public void mj(String str) {
        this.pc = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.xd = jCurrentTimeMillis;
            long j = this.oh;
            jSONObject.put("playable_page_show_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        ik("PL_sdk_html_load_start", jSONObject);
        this.yjg = true;
        this.vz = true;
        if (this.lau) {
            ory();
            this.yjg = false;
            this.vz = false;
        }
        if (this.bu) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (fi.ri(this.zk, fi.f18166co)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (fi.lr(this.zk, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (fi.ri(this.zk, fi.sf)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (fi.ri(this.zk, fi.qt)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (fi.ri(this.zk, fi.jbs)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (fi.ri(this.zk, fi.mj)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (fi.lr(this.zk, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (fi.ri(this.zk, fi.xha)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (fi.ri(this.zk)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                ik("PL_sdk_hardware_detect", jSONObject2);
                this.bu = false;
            } catch (Throwable th2) {
                xha.ri("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public JSONObject ka(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (xha.ri() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectRi = this.hpn.ri(str, jSONObject);
        if (xha.ri()) {
            System.currentTimeMillis();
            if (jSONObjectRi != null) {
                jSONObjectRi.toString();
            }
        }
        return jSONObjectRi;
    }

    public Map<String, String> lr() {
        return this.pu;
    }

    public mj lr(String str) {
        this.vt = str;
        return this;
    }

    public mj lr(boolean z) {
        this.xh = z;
        return this;
    }

    public void ri(View view) {
        if (view == null) {
            return;
        }
        try {
            this.ud = new WeakReference<>(view);
            lr(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.ib);
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    public mj lr(long j) {
        if (j <= 0) {
            this.igq = 10L;
            return this;
        }
        this.igq = j;
        return this;
    }

    private void fi(String str, JSONObject jSONObject) {
        try {
            int i = this.saa;
            if (i == 0) {
                if (this.ajz != ri.LAND_PAGE && !co(this.hd)) {
                    kt();
                }
                jSONObject.put("playable_url", this.hd);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", ka(this.tn, this.tyc));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", ik(this.skk, this.jg));
            }
            jSONObject.put("playable_render_type", this.saa);
            if (this.qmx != null) {
                if (this.saa == 0 && (this.ajz != ri.LAND_PAGE || co(this.hd))) {
                    this.qmx.ri(jSONObject);
                } else if (this.saa != 0) {
                    this.qmx.ri(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void lr(JSONObject jSONObject) {
        if (this.qmx != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public Context ri() {
        return this.zk;
    }

    public void lr(String str, String str2) {
        Bitmap bitmapRi;
        if (TextUtils.isEmpty(str2) || (bitmapRi = fi.ri(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.zk.getContentResolver(), bitmapRi, str, "");
    }

    public mj ri(String str, String str2) {
        this.pu.put(str, str2);
        return this;
    }

    public mj ri(String str) {
        this.eb = str;
        return this;
    }

    public void jbs(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.pc = 3;
                oh();
            } else {
                this.pc = -2;
            }
            if (zOptBoolean || !this.uq) {
                return;
            }
            this.uq = false;
            this.yjg = false;
            this.vz = false;
            this.mj.removeCallbacks(this.jbs);
            this.mj.removeCallbacks(this.qt);
            ri(4, "CaseRenderFail");
        }
    }

    public mj ri(boolean z) {
        this.eqw = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.eqw);
            ri("volumeChange", jSONObject);
            return this;
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "setIsMute error", th);
            return this;
        }
    }

    public mj lr(int i) {
        this.saa = i;
        return this;
    }

    public JSONObject xha(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return co();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : bgr();
        }
        return aw();
    }

    public void lr(int i, String str) {
        this.bnj = i;
        if (this.yjm == null) {
            this.yjm = new JSONObject();
        }
        try {
            this.yjm.put("playable_stuck_type", i);
            this.yjm.put("playable_stuck_reason", str);
            if (this.ig > 0) {
                this.yjm.put("playable_stuck_duration", System.currentTimeMillis() - this.ig);
            } else {
                this.yjm.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        ik("PL_sdk_page_stuck", this.yjm);
        xd();
        if (this.qmx == null || i != 2) {
            return;
        }
        this.yjm = new JSONObject();
    }

    public mj ri(long j) {
        if (j <= 0) {
            this.su = 10L;
            return this;
        }
        this.su = j;
        return this;
    }

    public mj fi(boolean z) {
        this.lau = z;
        return this;
    }

    public void ri(int i) {
        this.mvf = i;
    }

    public void xha(boolean z) {
        this.du = z;
    }

    public void ri(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.uq.ri riVar = this.qmx;
        if (riVar == null || riVar.lr(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            lr(strOptString2, strOptString);
        }
    }

    public mj ik(JSONObject jSONObject) {
        this.che = jSONObject;
        return this;
    }

    private void ik(int i, String str) {
        com.bytedance.sdk.openadsdk.uq.ri riVar = this.qmx;
        if (riVar != null) {
            riVar.ri(i, str);
        }
    }

    public void lr(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fi(str, jSONObject);
    }

    public void ri(String str, JSONObject jSONObject) {
        if (this.du) {
            if (!xha.ri() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (xha.ri() && jSONObject != null) {
            jSONObject.toString();
        }
        ik ikVar = this.id;
        if (ikVar != null) {
            ikVar.ri(str, jSONObject);
        }
    }

    private String ik(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.nbc) && !TextUtils.isEmpty(this.akr)) {
            Uri uri = Uri.parse(this.akr);
            String host = uri.getHost();
            if (!"lynxview".equalsIgnoreCase(host) && (host == null || !host.contains("lynxview"))) {
                queryParameter = "";
                queryParameter2 = "";
            } else {
                queryParameter = uri.getQueryParameter("surl");
                queryParameter2 = uri.getQueryParameter("playable_hash");
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.nbc = builderAppendQueryParameter.toString();
        }
        return this.nbc;
    }

    public mj ri(float f) {
        this.zxp = f;
        return this;
    }

    public void ri(int i, String str) {
        xd();
        ik(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "reportRenderFatal error", th);
        }
        ik("PL_sdk_global_faild", jSONObject);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void ik(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.fe && this.tnn > 0) {
                this.fe = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.cem ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.amj);
            jSONObject.put("playable_session_id", this.ac);
            int i = this.saa;
            if (i == 0) {
                if (this.ajz != ri.LAND_PAGE && !co(this.hd)) {
                    kt();
                }
                jSONObject.put("playable_url", this.hd);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", ka(this.tn, this.tyc));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", ik(this.skk, this.jg));
            }
            jSONObject.put("playable_full_url", this.akr);
            jSONObject.put("playable_replay_count", this.ta);
            jSONObject.put("playable_is_prerender", this.xh);
            jSONObject.put("playable_is_preload", this.fe);
            jSONObject.put("playable_render_type", this.saa);
            jSONObject.put("playable_scenes_type", this.ajz.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.skk) ? "" : this.skk);
            if (!TextUtils.isEmpty(this.jg)) {
                str2 = this.jg;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.tn);
            jSONObject.put("playable_minigamelite_schema", this.tyc);
            jSONObject.put("playable_is_debug", this.tq);
            jSONObject.put("playable_retry_count", this.siy);
            jSONObject.put("playable_enter_from", this.whw);
            jSONObject.put("playable_sequence", this.xm);
            jSONObject.put("playable_current_section", this.rzk);
            jSONObject.put("is_playable_finish", this.qh);
            jSONObject.put("playable_card_session", this.srn);
            jSONObject.put("playable_video_session", this.jc);
            jSONObject.put("playable_network_type", slm());
            jSONObject.put("playable_lynx_version", this.fr);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.ihz);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.che.opt(BidResponsedEx.KEY_CID));
            jSONObject2.put("log_extra", this.che.opt("log_extra"));
            int i2 = this.saa;
            if (i2 != -1 && i2 != -2) {
                if (this.qmx != null) {
                    List<JSONObject> list = this.tyz;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.tyz.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("adExtraData");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.saa);
                                jSONObjectOptJSONObject.put("playable_url", this.hd);
                            }
                            this.qmx.ri(jSONObjectOptJSONObject);
                        }
                        this.tyz.clear();
                    }
                    if (this.saa == 0 && (this.ajz != ri.LAND_PAGE || co(this.hd))) {
                        this.qmx.ri(jSONObject);
                        return;
                    } else {
                        if (this.saa != 0) {
                            this.qmx.ri(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.tyz == null) {
                this.tyz = new ArrayList();
            }
            this.tyz.add(jSONObject2);
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void ri(int i, String str, String str2) {
        this.pc = -1;
        this.sez = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", ig());
        } catch (Throwable th) {
            xha.ri("PlayablePlugin", "onWebReceivedError error", th);
        }
        ik("PL_sdk_html_load_error", jSONObject);
        if (this.uq) {
            this.uq = false;
            this.yjg = false;
            this.vz = false;
            this.mj.removeCallbacks(this.jbs);
            this.mj.removeCallbacks(this.qt);
            ri(1, "ContainerLoadFail");
        }
    }

    public void ri(boolean z, String str, int i) {
        if (z) {
            this.pc = -1;
            this.sez = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", ig());
            } catch (Throwable th) {
                xha.ri("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            ik("PL_sdk_html_load_error", jSONObject);
            if (this.uq) {
                this.uq = false;
                this.yjg = false;
                this.vz = false;
                this.mj.removeCallbacks(this.jbs);
                this.mj.removeCallbacks(this.qt);
                ri(1, "ContainerLoadFail");
            }
        }
    }

    private mj(Context context, int i, ik ikVar, com.bytedance.sdk.openadsdk.uq.ri riVar) {
        this.di = "playable_stuck_check_ping";
        this.xha = "playable_apply_media_permission_callback";
        this.mj = new Handler(Looper.getMainLooper());
        this.f18167co = new Handler(Looper.getMainLooper());
        this.slm = true;
        this.bu = true;
        this.nr = true;
        this.ri = "PL_sdk_playable_global_viewable";
        this.lr = "PL_sdk_page_screen_blank";
        this.ik = "PL_sdk_playable_destroy_analyze_summary";
        this.ka = "PL_sdk_playable_hardware_dialog_cancel";
        this.fi = "PL_sdk_playable_hardware_dialog_setting";
        this.tan = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.ac = null;
        this.ihz = "embeded_ad";
        this.uq = true;
        this.wjv = true;
        this.ay = false;
        this.fr = "";
        this.su = 10L;
        this.igq = 10L;
        this.zf = IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED;
        this.dw = 0L;
        this.ory = 0L;
        this.hcw = -1L;
        this.oh = -1L;
        this.xd = -1L;
        this.dzy = -1L;
        this.pv = -1L;
        this.ig = -1L;
        this.qd = -1L;
        this.srn = "";
        this.jc = "";
        this.kt = "";
        this.feb = "";
        this.zyn = 0;
        this.tnn = 0;
        this.fe = false;
        this.ta = 0;
        this.bnj = -1;
        this.siy = 0;
        this.whw = 0;
        this.xm = 0;
        this.rzk = null;
        this.qh = false;
        this.gcp = 0;
        this.tw = 0;
        this.nd = 0;
        this.zb = 0;
        this.aac = 0L;
        this.xe = 0L;
        this.saa = -2;
        this.pc = 0;
        this.hws = 0;
        this.jxw = 0;
        this.nh = new JSONObject();
        this.pu = new HashMap();
        this.che = new JSONObject();
        this.akr = "";
        this.zv = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.xlq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.bfa = false;
        this.tq = false;
        this.klz = false;
        this.tyz = new ArrayList();
        this.lau = true;
        this.yjg = true;
        this.vz = true;
        this.ib = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.uq.mj.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) mj.this.ud.get();
                    if (view == null) {
                        return;
                    }
                    mj.this.lr(view);
                } catch (Throwable th) {
                    xha.ri("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.mvf = -1;
        this.saa = i;
        this.ajz = ri.LAND_PAGE;
        ri(context, ikVar, riVar);
    }

    public static mj ri(Context context, WebView webView, ik ikVar, com.bytedance.sdk.openadsdk.uq.ri riVar) {
        if (ikVar == null || riVar == null) {
            return null;
        }
        if (webView == null) {
            return new mj(context, 0, ikVar, riVar);
        }
        return new mj(context, webView, ikVar, riVar, ri.LAND_PAGE);
    }
}
