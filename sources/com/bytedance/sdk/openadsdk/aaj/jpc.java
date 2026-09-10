package com.bytedance.sdk.openadsdk.aaj;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.p004ironsource.d9;
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

/* JADX INFO: loaded from: classes3.dex */
public class jpc {
    private String aaj;
    private String ag;
    private String auu;
    private String ax;
    private volatile boolean az;
    private boolean bch;
    private ud bjy;
    private String blf;
    private ViewTreeObserver.OnGlobalLayoutListener bo;
    private long bqt;
    private String bx;
    private int ca;
    private int car;
    private int cx;
    private long dk;
    private String dps;
    private long ekw;
    private int en;
    private boolean eta;
    private JSONObject ew;
    private Set<String> exc;
    private Runnable exu;
    private boolean fc;
    private long fco;
    private int fge;
    private volatile boolean fhs;
    private final Handler fs;
    private mo fzn;
    private lnr gg;
    private int gsp;
    private String gsv;
    private int gt;
    private long gy;
    private String hcs;
    private int hd;
    private long hkc;
    private int hr;
    private String hvi;
    private long hzv;
    private long ijp;
    private int ir;
    private int irn;
    private JSONObject iw;
    private int ji;
    private int jjk;
    private boolean jl;
    private String jle;
    private JSONObject jnw;
    private final Handler jpc;
    private boolean jtx;
    private Map<String, String> jut;
    private String jyq;
    private qdl kab;
    private long kdv;
    private boolean kj;
    private int koa;
    private float kr;
    private boolean ljh;
    private float lme;
    public final String lnr;
    private com.bytedance.sdk.openadsdk.aaj.qdl lq;
    private int lte;
    private int mlb;
    public final String mml;
    private final String mo;
    private long mrf;
    public final String mzz;
    private boolean nts;
    private int nz;
    private boolean od;
    private String om;
    private boolean oth;
    private boolean oz;
    public final String qdl;
    private WebView qk;
    private Context ra;
    private long rc;
    private Runnable rdp;
    private Runnable rq;
    private int rzg;
    private int se;
    private boolean skm;
    private int sy;
    private int syy;
    private String taz;
    private int tdy;
    private boolean tid;
    private Runnable to;
    private WeakReference<View> tqd;
    private Runnable tvp;
    public final String ud;
    private String uvi;
    private String uw;
    private int vc;
    private boolean vm;
    private boolean vr;
    private long vu;
    private boolean vxg;
    private boolean wak;
    private String wc;
    private final String wd;
    private String xdk;
    private int xi;
    private long xmv;
    private float xx;
    private int ygv;
    private int yh;
    private List<JSONObject> yre;
    private boolean yt;
    private int zlt;
    private String zpu;
    private String zvv;
    private JSONObject zy;

    public enum qdl {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private jpc(Context context, WebView webView, lnr lnrVar, com.bytedance.sdk.openadsdk.aaj.qdl qdlVar, qdl qdlVar2) {
        this.mo = "playable_stuck_check_ping";
        this.wd = "playable_apply_media_permission_callback";
        this.jpc = new Handler(Looper.getMainLooper());
        this.fs = new Handler(Looper.getMainLooper());
        this.jtx = true;
        this.yt = true;
        this.jl = true;
        this.qdl = "PL_sdk_playable_global_viewable";
        this.ud = "PL_sdk_page_screen_blank";
        this.lnr = "PL_sdk_playable_destroy_analyze_summary";
        this.mml = "PL_sdk_playable_hardware_dialog_cancel";
        this.mzz = "PL_sdk_playable_hardware_dialog_setting";
        this.exc = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.aaj = null;
        this.jyq = "embeded_ad";
        this.oth = true;
        this.ljh = true;
        this.bch = false;
        this.uw = "";
        this.xmv = 10L;
        this.bqt = 10L;
        this.koa = 700;
        this.vu = 0L;
        this.rc = 0L;
        this.kdv = -1L;
        this.ekw = -1L;
        this.hkc = -1L;
        this.hzv = -1L;
        this.fco = -1L;
        this.mrf = -1L;
        this.gy = -1L;
        this.ax = "";
        this.ag = "";
        this.wc = "";
        this.om = "";
        this.cx = 0;
        this.yh = 0;
        this.wak = false;
        this.gt = 0;
        this.irn = -1;
        this.xi = 0;
        this.jjk = 0;
        this.zlt = 0;
        this.taz = null;
        this.tid = false;
        this.sy = 0;
        this.car = 0;
        this.mlb = 0;
        this.lte = 0;
        this.dk = 0L;
        this.ijp = 0L;
        this.en = -2;
        this.nz = 0;
        this.rzg = 0;
        this.ji = 0;
        this.ew = new JSONObject();
        this.jut = new HashMap();
        this.jnw = new JSONObject();
        this.dps = "";
        this.lme = 0.0f;
        this.kr = 0.0f;
        this.vm = false;
        this.vr = false;
        this.oz = false;
        this.yre = new ArrayList();
        this.skm = true;
        this.az = true;
        this.fhs = true;
        this.bo = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) jpc.this.tqd.get();
                    if (view == null) {
                        return;
                    }
                    jpc.this.ud(view);
                } catch (Throwable th) {
                    wd.qdl("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.ir = -1;
        this.en = 0;
        this.kab = qdlVar2;
        this.qk = webView;
        tvp.qdl(webView);
        qdl(webView);
        qdl(context, lnrVar, qdlVar);
    }

    private void ag() {
        this.bjy = new ud(this, this.koa);
        this.tvp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.5
            @Override // java.lang.Runnable
            public void run() {
                if (jpc.this.oth) {
                    jpc.this.oth = false;
                    jpc.this.jpc.removeCallbacks(jpc.this.to);
                    jpc.this.qdl(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.to = new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.6
            @Override // java.lang.Runnable
            public void run() {
                if (jpc.this.oth) {
                    jpc.this.oth = false;
                    jpc.this.az = false;
                    jpc.this.jpc.removeCallbacks(jpc.this.tvp);
                    jpc.this.qdl(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.exu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (jpc.this.qk != null) {
                    jpc.this.qk.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.7.1
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (jpc.this.bjy != null) {
                                jpc.this.bjy.qdl(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (jpc.this.fs != null) {
                    jpc.this.fs.postDelayed(this, 500L);
                }
            }
        };
        this.rdp = new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                jpc.this.qdl("playable_stuck_check_ping", new JSONObject());
                if (jpc.this.fs != null) {
                    jpc.this.fs.postDelayed(this, 500L);
                }
            }
        };
        this.rq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.9
            @Override // java.lang.Runnable
            public void run() {
                if (jpc.this.ijp <= 0) {
                    jpc.this.ud(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (jpc.this.ijp - jpc.this.dk > jpc.this.koa) {
                        jpc.this.ud(1, "Clicking on the hot zone causes the program to freeze.");
                        return;
                    }
                    jpc.this.ekw();
                    jpc.this.dk = 0L;
                    jpc.this.ijp = 0L;
                }
            }
        };
    }

    public static /* synthetic */ int exu(jpc jpcVar) {
        int i2 = jpcVar.yh;
        jpcVar.yh = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int fs(jpc jpcVar) {
        int i2 = jpcVar.cx;
        jpcVar.cx = i2 + 1;
        return i2;
    }

    private void om() {
        Runnable runnable;
        Runnable runnable2;
        this.bjy.qdl(System.currentTimeMillis());
        Handler handler = this.fs;
        if (handler != null) {
            int i2 = this.en;
            if (i2 == 0 && (runnable2 = this.exu) != null) {
                handler.post(runnable2);
            } else if ((i2 == 1 || i2 == 2) && (runnable = this.rdp) != null) {
                handler.post(runnable);
            }
            this.bjy.qdl(500);
        }
    }

    private void wc() {
        String str;
        if (this.jnw == null || (str = this.zpu) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.jnw.optString("cid");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.zpu).getHost();
        if (TextUtils.isEmpty(host)) {
            this.zpu = a.s(new StringBuilder(), this.zpu, "/cid_", strOptString);
        } else {
            this.zpu = this.zpu.replace(host, a.D(host, "/cid_", strOptString));
        }
    }

    public JSONObject aaj() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.xx);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.syy);
            jSONObject2.put("height", this.tdy);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.gsp);
            jSONObject3.put("y", this.ca);
            jSONObject3.put("width", this.ygv);
            jSONObject3.put("height", this.hr);
            jSONObject.put(d9.h.K, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.se);
            jSONObject4.put("y", this.hd);
            jSONObject4.put("width", this.vc);
            jSONObject4.put("height", this.fge);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "getViewport error", th);
            return jSONObject;
        }
    }

    public int ax() {
        return this.ir;
    }

    public void bch() {
        this.irn = 2;
    }

    public JSONObject bjy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.kab.ordinal());
            jSONObject.put("safe_area_top_height", this.lme);
            jSONObject.put("safe_area_bottom_height", this.kr);
            jSONObject.put("playable_enter_from", this.jjk);
            jSONObject.put("playable_retry_count", this.xi);
            jSONObject.put("playable_card_session", this.ax);
            jSONObject.put("playable_video_session", this.ag);
            jSONObject.put("playable_network_type", jtx());
            jSONObject.put("aweme_id", this.om);
            return jSONObject;
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void bqt() {
        if (this.lq != null) {
            qdl qdlVar = qdl.LAND_PAGE;
        }
    }

    public void ekw() {
        if (this.ljh) {
            this.mrf = System.currentTimeMillis();
            if (this.kab == qdl.FEED_AWEME) {
                if (this.od && this.nz == 3) {
                    ud udVar = this.bjy;
                    if (udVar != null && udVar.ud()) {
                        om();
                        return;
                    } else {
                        if (this.bjy == null) {
                            this.bjy = new ud(this, this.koa);
                            om();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.od && this.nz == 2) {
                ud udVar2 = this.bjy;
                if (udVar2 != null && udVar2.ud()) {
                    om();
                } else if (this.bjy == null) {
                    this.bjy = new ud(this, this.koa);
                    om();
                }
            }
        }
    }

    public JSONObject exc() {
        return this.jnw;
    }

    public void fco() {
        if (this.oz) {
            return;
        }
        this.oz = true;
        this.rc = 0L;
        this.yt = true;
        hzv();
        try {
            View view = this.tqd.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.bo);
            }
        } catch (Throwable unused) {
        }
        try {
            this.fzn.ud();
        } catch (Throwable unused2) {
        }
        try {
            ud udVar = this.bjy;
            if (udVar != null) {
                udVar.qdl();
                this.bjy = null;
            }
            Handler handler = this.fs;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.zpu)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.cx);
                jSONObject.put("playable_hit_times", this.yh);
                int i2 = this.cx;
                if (i2 > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.yh) / (((double) i2) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                lnr("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.zpu)) {
                if (this.kdv != -1) {
                    this.vu += System.currentTimeMillis() - this.kdv;
                    this.kdv = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.vu);
                lnr("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.az = false;
        this.fhs = false;
        this.jpc.removeCallbacks(this.tvp);
        this.jpc.removeCallbacks(this.to);
        this.jpc.removeCallbacksAndMessages(null);
    }

    public String gy() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public void hkc() {
        try {
            ud udVar = this.bjy;
            if (udVar != null) {
                udVar.qdl();
            }
            Handler handler = this.fs;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public void hzv() {
        this.rzg = 0;
        this.ji = 0;
        this.xx = 0.0f;
        this.syy = 0;
        this.tdy = 0;
        this.ca = 0;
        this.gsp = 0;
        this.ygv = 0;
        this.hr = 0;
        this.hd = 0;
        this.se = 0;
        this.vc = 0;
        this.fge = 0;
    }

    public JSONObject jl() {
        if (this.ew.isNull("width")) {
            View view = this.tqd.get();
            if (view == null) {
                return this.ew;
            }
            ud(view);
        }
        return this.ew;
    }

    public String jtx() {
        com.bytedance.sdk.openadsdk.aaj.qdl qdlVar;
        if (TextUtils.isEmpty(this.wc) && (qdlVar = this.lq) != null) {
            this.wc = qdlVar.qdl().toString();
        }
        return this.wc;
    }

    public void jyq() {
        com.bytedance.sdk.openadsdk.aaj.qdl qdlVar = this.lq;
        if (qdlVar != null) {
            qdlVar.ud();
        }
    }

    public void kdv() {
        this.fhs = false;
        this.jpc.removeCallbacks(this.to);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.hkc > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.hkc);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            lnr("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void koa() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.fco > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.fco);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.hkc > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.hkc);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            lnr("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void ljh() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.fco > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.fco);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.hkc > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.hkc;
                this.gy = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            lnr("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public int mrf() {
        return (this.ekw == -1 || !this.od) ? 1 : 2;
    }

    public void oth() {
        com.bytedance.sdk.openadsdk.aaj.qdl qdlVar = this.lq;
        if (qdlVar != null) {
            qdlVar.lnr();
        }
    }

    public void rc() {
        int i2;
        int i3 = this.en;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            if (this.az) {
                this.jpc.postDelayed(this.tvp, this.xmv * 1000);
            }
            if ((this.fhs && fs(this.zpu)) || (i2 = this.en) == 1 || i2 == 2) {
                this.jpc.postDelayed(this.to, this.bqt * 1000);
            }
        }
    }

    public JSONObject rdp() {
        boolean zQdl;
        boolean zQdl2;
        try {
            boolean z2 = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zQdl = mzz.qdl(this.ra, "android.permission.READ_MEDIA_IMAGES");
                zQdl2 = true;
            } else {
                zQdl = mzz.qdl(this.ra, "android.permission.READ_EXTERNAL_STORAGE");
                zQdl2 = mzz.qdl(this.ra, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zQdl);
            jSONObject.put("isHasWrite", zQdl2);
            if (!zQdl || !zQdl2) {
                z2 = false;
            }
            jSONObject.put("result", z2);
            return jSONObject;
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void uw() {
        this.tid = true;
    }

    public void vu() {
        ud udVar;
        this.ijp = System.currentTimeMillis();
        int i2 = this.en;
        if ((i2 == 1 || i2 == 2) && (udVar = this.bjy) != null) {
            udVar.qdl(System.currentTimeMillis());
        }
    }

    public void xmv() {
        if (this.lq != null) {
            qdl qdlVar = qdl.LAND_PAGE;
        }
    }

    public com.bytedance.sdk.openadsdk.aaj.qdl yt() {
        return this.lq;
    }

    private boolean fs(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public JSONObject exu() {
        try {
            boolean zQdl = mzz.qdl(this.ra, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zQdl);
            return jSONObject;
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public boolean jpc() {
        return this.kj;
    }

    public JSONObject lnr() {
        return this.iw;
    }

    public String mml() {
        return this.zvv;
    }

    public String mo() {
        return this.bx;
    }

    public String mzz() {
        return this.blf;
    }

    public Set<String> rq() {
        return this.fzn.qdl();
    }

    public JSONObject to() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.nts);
            return jSONObject;
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public boolean tvp() {
        return this.od;
    }

    public String wd() {
        return this.hcs;
    }

    public JSONObject fs() {
        try {
            boolean zQdl = mzz.qdl(this.ra, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zQdl);
            return jSONObject;
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject jpc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", mzz.ud(this.ra, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt == 2) {
                    jSONObject2.put("result", mzz.ud(this.ra, "android.permission.CAMERA"));
                    return jSONObject2;
                }
                if (iOptInt == 3) {
                    jSONObject2.put("result", mzz.qdl(this.ra));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public jpc lnr(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.iw = jSONObject;
            return this;
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "setPlayableStyle error", th);
            return this;
        }
    }

    public jpc mml(String str) {
        this.bx = str;
        return this;
    }

    public jpc mo(String str) {
        this.jyq = str;
        return this;
    }

    public jpc mzz(String str) {
        this.hcs = str;
        return this;
    }

    public void rq(String str) {
        this.jpc.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.3
            @Override // java.lang.Runnable
            public void run() {
                jpc.exu(jpc.this);
            }
        });
    }

    public void tvp(String str) {
        WebView webView;
        boolean z2 = this.nz == -1;
        this.nz = 2;
        if (!z2) {
            this.jle = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.hzv = jCurrentTimeMillis;
                long j = this.hkc;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", mrf());
            } catch (Throwable th) {
                wd.qdl("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            lnr("PL_sdk_html_load_finish", jSONObject);
        }
        this.az = false;
        this.jpc.removeCallbacks(this.tvp);
        try {
            if (this.en == 0) {
                if (this.jtx && (webView = this.qk) != null) {
                    this.jtx = false;
                    webView.evaluateJavascript(gy(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                ekw();
            }
        } catch (Throwable th2) {
            wd.qdl("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public jpc wd(String str) {
        int iIndexOf;
        String strDecode;
        this.dps = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (!d9.h.K.equalsIgnoreCase(host) && (host == null || !host.contains(d9.h.K))) {
                    if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                        if (this.en == -1) {
                            ud(2);
                        } else {
                            ud(1);
                        }
                    }
                } else {
                    ud(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                }
            } else {
                ud(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            }
        } catch (Throwable unused) {
        }
        this.zpu = str;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ud(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.rzg == view.getWidth() && this.ji == view.getHeight()) {
                return;
            }
            this.rzg = view.getWidth();
            this.ji = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.rzg);
            jSONObject.put("height", this.ji);
            qdl("resize", jSONObject);
            this.ew = jSONObject;
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public jpc mml(boolean z2) {
        this.nts = z2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.nts);
            qdl("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "setPlayableClick error", th);
            return this;
        }
    }

    public void mo(JSONObject jSONObject) {
        ud(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void mzz(JSONObject jSONObject) {
        this.zy = jSONObject;
        this.zlt++;
        hkc();
        this.jpc.removeCallbacks(this.rq);
        if (this.ljh) {
            this.mrf = System.currentTimeMillis();
            this.dk = System.currentTimeMillis();
            this.ijp = 0L;
            int i2 = this.en;
            if (i2 == 0) {
                WebView webView = this.qk;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.10
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            jpc.this.ijp = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i2 == 1 || i2 == 2) {
                qdl("playable_stuck_check_ping", new JSONObject());
            }
            this.jpc.postDelayed(this.rq, this.koa);
        }
    }

    private void qdl(Context context, lnr lnrVar, com.bytedance.sdk.openadsdk.aaj.qdl qdlVar) {
        this.aaj = UUID.randomUUID().toString();
        this.ra = context;
        this.lq = qdlVar;
        this.gg = lnrVar;
        to.qdl(qdlVar);
        this.fzn = new mo(this);
        ag();
        if (this.qk == null) {
            this.ir = 4;
            this.jpc.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.4
                @Override // java.lang.Runnable
                public void run() {
                    jpc.this.qdl(5, "webview is null");
                }
            });
        }
    }

    public void to(String str) {
        this.jpc.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.2
            @Override // java.lang.Runnable
            public void run() {
                jpc.fs(jpc.this);
            }
        });
    }

    public jpc lnr(boolean z2) {
        if (this.ir != -1 && this.od != z2) {
            this.od = z2;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.od) {
                    jSONObject.put("playable_background_show_type", this.car);
                }
            } catch (JSONException unused) {
            }
            lnr(this.od ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.ekw == -1 && this.od) {
                this.ekw = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.ir == 1 ? 1 : 2);
                    int i2 = this.ir;
                    if (i2 != -1) {
                        jSONObject2.put("webview_state", i2);
                    }
                } catch (JSONException unused2) {
                }
                lnr("PL_sdk_page_show", jSONObject2);
            }
            if (this.ekw != -1 && !this.od && !this.vm) {
                this.vm = true;
            }
            if (this.od) {
                this.kdv = System.currentTimeMillis();
            } else if (this.kdv != -1) {
                this.vu += System.currentTimeMillis() - this.kdv;
                this.kdv = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.od);
                qdl(d9.g.f24689V, jSONObject3);
            } catch (Throwable th) {
                wd.qdl("PlayablePlugin", "setViewable error", th);
            }
            if (this.od) {
                ekw();
            } else {
                hkc();
            }
        }
        return this;
    }

    public void mo(boolean z2) {
        this.vxg = z2;
    }

    public void mml(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.taz = jSONObject.optString("section");
        }
    }

    private String mml(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.zpu = str3;
        return str3;
    }

    public void jpc(String str) {
        this.nz = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.hkc = jCurrentTimeMillis;
            long j = this.ekw;
            jSONObject.put("playable_page_show_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        lnr("PL_sdk_html_load_start", jSONObject);
        this.az = true;
        this.fhs = true;
        if (this.skm) {
            rc();
            this.az = false;
            this.fhs = false;
        }
        if (this.yt) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (mzz.qdl(this.ra, mzz.fs)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (mzz.ud(this.ra, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (mzz.qdl(this.ra, mzz.rq)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (mzz.qdl(this.ra, mzz.to)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (mzz.qdl(this.ra, mzz.tvp)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (mzz.qdl(this.ra, mzz.jpc)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (mzz.ud(this.ra, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (mzz.qdl(this.ra, mzz.wd)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (mzz.qdl(this.ra)) {
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
                lnr("PL_sdk_hardware_detect", jSONObject2);
                this.yt = false;
            } catch (Throwable th2) {
                wd.qdl("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public JSONObject mml(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (wd.qdl() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectQdl = this.fzn.qdl(str, jSONObject);
        if (wd.qdl()) {
            System.currentTimeMillis();
            if (jSONObjectQdl != null) {
                jSONObjectQdl.toString();
            }
        }
        return jSONObjectQdl;
    }

    public Map<String, String> ud() {
        return this.jut;
    }

    public jpc ud(String str) {
        this.zvv = str;
        return this;
    }

    public void qdl(View view) {
        if (view == null) {
            return;
        }
        try {
            this.tqd = new WeakReference<>(view);
            ud(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.bo);
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    public jpc ud(boolean z2) {
        this.eta = z2;
        return this;
    }

    public jpc ud(long j) {
        if (j <= 0) {
            this.bqt = 10L;
            return this;
        }
        this.bqt = j;
        return this;
    }

    private void mzz(String str, JSONObject jSONObject) {
        try {
            int i2 = this.en;
            if (i2 == 0) {
                if (this.kab != qdl.LAND_PAGE && !fs(this.zpu)) {
                    wc();
                }
                jSONObject.put("playable_url", this.zpu);
            } else if (i2 == 3 || i2 == 4) {
                jSONObject.put("playable_url", mml(this.hvi, this.uvi));
            } else if (i2 == 1 || i2 == 2) {
                jSONObject.put("playable_url", lnr(this.auu, this.gsv));
            }
            jSONObject.put("playable_render_type", this.en);
            if (this.lq != null) {
                if (this.en == 0 && (this.kab != qdl.LAND_PAGE || fs(this.zpu))) {
                    this.lq.qdl(jSONObject);
                } else if (this.en != 0) {
                    this.lq.qdl(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void ud(JSONObject jSONObject) {
        if (this.lq != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public Context qdl() {
        return this.ra;
    }

    public jpc qdl(String str, String str2) {
        this.jut.put(str, str2);
        return this;
    }

    public void ud(String str, String str2) {
        Bitmap bitmapQdl;
        if (TextUtils.isEmpty(str2) || (bitmapQdl = mzz.qdl(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.ra.getContentResolver(), bitmapQdl, str, "");
    }

    public jpc qdl(String str) {
        this.blf = str;
        return this;
    }

    public jpc qdl(boolean z2) {
        this.kj = z2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.kj);
            qdl("volumeChange", jSONObject);
            return this;
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "setIsMute error", th);
            return this;
        }
    }

    public void tvp(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.nz = 3;
                ekw();
            } else {
                this.nz = -2;
            }
            if (zOptBoolean || !this.oth) {
                return;
            }
            this.oth = false;
            this.az = false;
            this.fhs = false;
            this.jpc.removeCallbacks(this.tvp);
            this.jpc.removeCallbacks(this.to);
            qdl(4, "CaseRenderFail");
        }
    }

    public jpc ud(int i2) {
        this.en = i2;
        return this;
    }

    public JSONObject wd(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return fs();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : rdp();
        }
        return exu();
    }

    public void ud(int i2, String str) {
        this.irn = i2;
        if (this.zy == null) {
            this.zy = new JSONObject();
        }
        try {
            this.zy.put("playable_stuck_type", i2);
            this.zy.put("playable_stuck_reason", str);
            if (this.mrf > 0) {
                this.zy.put("playable_stuck_duration", System.currentTimeMillis() - this.mrf);
            } else {
                this.zy.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        lnr("PL_sdk_page_stuck", this.zy);
        hkc();
        if (this.lq == null || i2 != 2) {
            return;
        }
        this.zy = new JSONObject();
    }

    public jpc qdl(long j) {
        if (j <= 0) {
            this.xmv = 10L;
            return this;
        }
        this.xmv = j;
        return this;
    }

    public jpc mzz(boolean z2) {
        this.skm = z2;
        return this;
    }

    public void qdl(int i2) {
        this.ir = i2;
    }

    public void wd(boolean z2) {
        this.fc = z2;
    }

    public void qdl(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.aaj.qdl qdlVar = this.lq;
        if (qdlVar == null || qdlVar.ud(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            ud(strOptString2, strOptString);
        }
    }

    public jpc lnr(JSONObject jSONObject) {
        this.jnw = jSONObject;
        return this;
    }

    private void lnr(int i2, String str) {
        com.bytedance.sdk.openadsdk.aaj.qdl qdlVar = this.lq;
        if (qdlVar != null) {
            qdlVar.qdl(i2, str);
        }
    }

    public void qdl(String str, JSONObject jSONObject) {
        if (this.fc) {
            if (!wd.qdl() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (wd.qdl() && jSONObject != null) {
            jSONObject.toString();
        }
        lnr lnrVar = this.gg;
        if (lnrVar != null) {
            lnrVar.qdl(str, jSONObject);
        }
    }

    public void ud(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mzz(str, jSONObject);
    }

    private String lnr(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.xdk) && !TextUtils.isEmpty(this.dps)) {
            Uri uri = Uri.parse(this.dps);
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
            this.xdk = builderAppendQueryParameter.toString();
        }
        return this.xdk;
    }

    public jpc qdl(float f) {
        this.xx = f;
        return this;
    }

    public void qdl(int i2, String str) {
        hkc();
        lnr(i2, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i2);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "reportRenderFatal error", th);
        }
        lnr("PL_sdk_global_faild", jSONObject);
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
    public void lnr(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.wak && this.yh > 0) {
                this.wak = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.vxg ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.od);
            jSONObject.put("playable_session_id", this.aaj);
            int i2 = this.en;
            if (i2 == 0) {
                if (this.kab != qdl.LAND_PAGE && !fs(this.zpu)) {
                    wc();
                }
                jSONObject.put("playable_url", this.zpu);
            } else if (i2 == 3 || i2 == 4) {
                jSONObject.put("playable_url", mml(this.hvi, this.uvi));
            } else if (i2 == 1 || i2 == 2) {
                jSONObject.put("playable_url", lnr(this.auu, this.gsv));
            }
            jSONObject.put("playable_full_url", this.dps);
            jSONObject.put("playable_replay_count", this.gt);
            jSONObject.put("playable_is_prerender", this.eta);
            jSONObject.put("playable_is_preload", this.wak);
            jSONObject.put("playable_render_type", this.en);
            jSONObject.put("playable_scenes_type", this.kab.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.auu) ? "" : this.auu);
            if (!TextUtils.isEmpty(this.gsv)) {
                str2 = this.gsv;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.hvi);
            jSONObject.put("playable_minigamelite_schema", this.uvi);
            jSONObject.put("playable_is_debug", this.vr);
            jSONObject.put("playable_retry_count", this.xi);
            jSONObject.put("playable_enter_from", this.jjk);
            jSONObject.put("playable_sequence", this.zlt);
            jSONObject.put("playable_current_section", this.taz);
            jSONObject.put("is_playable_finish", this.tid);
            jSONObject.put("playable_card_session", this.ax);
            jSONObject.put("playable_video_session", this.ag);
            jSONObject.put("playable_network_type", jtx());
            jSONObject.put("playable_lynx_version", this.uw);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.jyq);
            jSONObject2.put(com.smartdigimkt.b0.a.W, 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.jnw.opt("cid"));
            jSONObject2.put("log_extra", this.jnw.opt("log_extra"));
            int i3 = this.en;
            if (i3 != -1 && i3 != -2) {
                if (this.lq != null) {
                    List<JSONObject> list = this.yre;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.yre.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("adExtraData");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.en);
                                jSONObjectOptJSONObject.put("playable_url", this.zpu);
                            }
                            this.lq.qdl(jSONObjectOptJSONObject);
                        }
                        this.yre.clear();
                    }
                    if (this.en == 0 && (this.kab != qdl.LAND_PAGE || fs(this.zpu))) {
                        this.lq.qdl(jSONObject);
                        return;
                    } else {
                        if (this.en != 0) {
                            this.lq.qdl(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.yre == null) {
                this.yre = new ArrayList();
            }
            this.yre.add(jSONObject2);
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void qdl(int i2, String str, String str2) {
        this.nz = -1;
        this.jle = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i2);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", mrf());
        } catch (Throwable th) {
            wd.qdl("PlayablePlugin", "onWebReceivedError error", th);
        }
        lnr("PL_sdk_html_load_error", jSONObject);
        if (this.oth) {
            this.oth = false;
            this.az = false;
            this.fhs = false;
            this.jpc.removeCallbacks(this.tvp);
            this.jpc.removeCallbacks(this.to);
            qdl(1, "ContainerLoadFail");
        }
    }

    public void qdl(boolean z2, String str, int i2) {
        if (z2) {
            this.nz = -1;
            this.jle = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i2);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", mrf());
            } catch (Throwable th) {
                wd.qdl("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            lnr("PL_sdk_html_load_error", jSONObject);
            if (this.oth) {
                this.oth = false;
                this.az = false;
                this.fhs = false;
                this.jpc.removeCallbacks(this.tvp);
                this.jpc.removeCallbacks(this.to);
                qdl(1, "ContainerLoadFail");
            }
        }
    }

    private jpc(Context context, int i2, lnr lnrVar, com.bytedance.sdk.openadsdk.aaj.qdl qdlVar) {
        this.mo = "playable_stuck_check_ping";
        this.wd = "playable_apply_media_permission_callback";
        this.jpc = new Handler(Looper.getMainLooper());
        this.fs = new Handler(Looper.getMainLooper());
        this.jtx = true;
        this.yt = true;
        this.jl = true;
        this.qdl = "PL_sdk_playable_global_viewable";
        this.ud = "PL_sdk_page_screen_blank";
        this.lnr = "PL_sdk_playable_destroy_analyze_summary";
        this.mml = "PL_sdk_playable_hardware_dialog_cancel";
        this.mzz = "PL_sdk_playable_hardware_dialog_setting";
        this.exc = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.aaj = null;
        this.jyq = "embeded_ad";
        this.oth = true;
        this.ljh = true;
        this.bch = false;
        this.uw = "";
        this.xmv = 10L;
        this.bqt = 10L;
        this.koa = 700;
        this.vu = 0L;
        this.rc = 0L;
        this.kdv = -1L;
        this.ekw = -1L;
        this.hkc = -1L;
        this.hzv = -1L;
        this.fco = -1L;
        this.mrf = -1L;
        this.gy = -1L;
        this.ax = "";
        this.ag = "";
        this.wc = "";
        this.om = "";
        this.cx = 0;
        this.yh = 0;
        this.wak = false;
        this.gt = 0;
        this.irn = -1;
        this.xi = 0;
        this.jjk = 0;
        this.zlt = 0;
        this.taz = null;
        this.tid = false;
        this.sy = 0;
        this.car = 0;
        this.mlb = 0;
        this.lte = 0;
        this.dk = 0L;
        this.ijp = 0L;
        this.en = -2;
        this.nz = 0;
        this.rzg = 0;
        this.ji = 0;
        this.ew = new JSONObject();
        this.jut = new HashMap();
        this.jnw = new JSONObject();
        this.dps = "";
        this.lme = 0.0f;
        this.kr = 0.0f;
        this.vm = false;
        this.vr = false;
        this.oz = false;
        this.yre = new ArrayList();
        this.skm = true;
        this.az = true;
        this.fhs = true;
        this.bo = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.aaj.jpc.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) jpc.this.tqd.get();
                    if (view == null) {
                        return;
                    }
                    jpc.this.ud(view);
                } catch (Throwable th) {
                    wd.qdl("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.ir = -1;
        this.en = i2;
        this.kab = qdl.LAND_PAGE;
        qdl(context, lnrVar, qdlVar);
    }

    public static jpc qdl(Context context, WebView webView, lnr lnrVar, com.bytedance.sdk.openadsdk.aaj.qdl qdlVar) {
        if (lnrVar == null || qdlVar == null) {
            return null;
        }
        if (webView == null) {
            return new jpc(context, 0, lnrVar, qdlVar);
        }
        return new jpc(context, webView, lnrVar, qdlVar, qdl.LAND_PAGE);
    }
}
