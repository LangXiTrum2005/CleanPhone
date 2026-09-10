package com.bytedance.sdk.openadsdk.tD;

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
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.hjq.permissions.Permission;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
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
public class OY {
    private int AcC;
    private long BcA;
    private String Bg;
    private int Bj;
    private long CG;
    private String CSn;
    private String DY;
    private int FD;

    @Nullable
    private WebView FGm;
    private String FV;
    private int FtP;
    private boolean HD;
    private boolean HN;
    private int Hu;
    private volatile boolean IG;
    private LD IeN;
    private long Ivz;
    private float Iyd;
    private Map<String, String> JD;
    private String JJ;
    private Runnable JVA;
    public final String JXs;
    private int JZE;
    private int KOQ;
    private int KPU;
    public final String LD;
    private int LRt;
    private int LXE;
    private int Ld;
    private int Lpq;
    private Context Lv;
    public final String Lxb;
    private int MGT;
    private String Mvg;
    private boolean Mx;
    private String NDz;
    private Runnable NXR;
    private int Ns;
    private boolean Nu;
    private final Handler OY;
    private boolean Of;
    private boolean Pd;
    private String Pw;
    private Runnable QAg;
    private String Rt;
    private int SS;
    private Runnable STP;
    private String Sfi;
    private float SlV;
    private int Sv;
    private int TA;
    private int Td;
    private int VB;
    private int VU;
    private boolean VVE;
    private List<JSONObject> Vs;
    private WeakReference<View> Wi;
    public final String ZU;
    private String Za;
    private boolean Zg;
    private boolean aH;
    private long ae;
    private JSONObject bG;
    private String bm;
    private boolean brP;
    private boolean cR;
    private float chu;
    private String dR;
    private boolean eK;
    private String eXY;
    private final String ebl;
    private int ek;
    private boolean fG;
    private long foI;
    private lk gS;
    private int goy;
    private long hg;
    private JSONObject iC;
    private long id;
    private int jeq;
    private boolean kRz;
    private boolean kqm;
    private String lJ;
    private final String lc;
    private long le;
    public final String lk;
    private String mOF;
    private ViewTreeObserver.OnGlobalLayoutListener mW;
    private JSONObject mb;
    private Runnable nBu;
    private long nE;
    private int nH;
    private long nJ;
    private Lxb nTb;
    private lc oc;
    private String op;
    private int owi;
    private String pyu;
    private volatile boolean qEi;
    private boolean rK;
    private long rW;
    private com.bytedance.sdk.openadsdk.tD.Lxb ro;
    private final Handler sLN;
    private int sRq;
    private Set<String> tD;
    private boolean tv;
    private String uxf;
    private JSONObject wCT;
    private String wPa;
    private int wbY;
    private long xan;
    private long xr;

    public enum Lxb {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    private OY(Context context, WebView webView, lk lkVar, com.bytedance.sdk.openadsdk.tD.Lxb lxb, Lxb lxb2) {
        this.lc = "playable_stuck_check_ping";
        this.ebl = "playable_apply_media_permission_callback";
        this.OY = new Handler(Looper.getMainLooper());
        this.sLN = new Handler(Looper.getMainLooper());
        this.VVE = true;
        this.kqm = true;
        this.brP = true;
        this.Lxb = "PL_sdk_playable_global_viewable";
        this.LD = "PL_sdk_page_screen_blank";
        this.lk = "PL_sdk_playable_destroy_analyze_summary";
        this.ZU = "PL_sdk_playable_hardware_dialog_cancel";
        this.JXs = "PL_sdk_playable_hardware_dialog_setting";
        this.tD = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.DY = null;
        this.Sfi = "embeded_ad";
        this.HD = true;
        this.eK = true;
        this.aH = false;
        this.CSn = "";
        this.id = 10L;
        this.foI = 10L;
        this.KPU = TypedValues.TransitionType.TYPE_DURATION;
        this.Ivz = 0L;
        this.nE = 0L;
        this.xan = -1L;
        this.hg = -1L;
        this.CG = -1L;
        this.nJ = -1L;
        this.le = -1L;
        this.BcA = -1L;
        this.rW = -1L;
        this.Pw = "";
        this.dR = "";
        this.NDz = "";
        this.JJ = "";
        this.VU = 0;
        this.sRq = 0;
        this.Of = false;
        this.Ld = 0;
        this.JZE = -1;
        this.Lpq = 0;
        this.Ns = 0;
        this.Sv = 0;
        this.uxf = null;
        this.Nu = false;
        this.SS = 0;
        this.LXE = 0;
        this.wbY = 0;
        this.FD = 0;
        this.ae = 0L;
        this.xr = 0L;
        this.jeq = -2;
        this.MGT = 0;
        this.Hu = 0;
        this.AcC = 0;
        this.wCT = new JSONObject();
        this.JD = new HashMap();
        this.iC = new JSONObject();
        this.pyu = "";
        this.chu = 0.0f;
        this.SlV = 0.0f;
        this.HN = false;
        this.fG = false;
        this.Pd = false;
        this.Vs = new ArrayList();
        this.cR = true;
        this.IG = true;
        this.qEi = true;
        this.mW = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.tD.OY.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) OY.this.Wi.get();
                    if (view == null) {
                        return;
                    }
                    OY.this.LD(view);
                } catch (Throwable th) {
                    ebl.Lxb("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.Td = -1;
        this.jeq = 0;
        this.nTb = lxb2;
        this.FGm = webView;
        QAg.Lxb(webView);
        Lxb(webView);
        Lxb(context, lkVar, lxb);
    }

    private void NDz() {
        Runnable runnable;
        Runnable runnable2;
        this.IeN.Lxb(System.currentTimeMillis());
        Handler handler = this.sLN;
        if (handler != null) {
            int i = this.jeq;
            if (i == 0 && (runnable2 = this.NXR) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.STP) != null) {
                handler.post(runnable);
            }
            this.IeN.Lxb(500);
        }
    }

    public static /* synthetic */ int NXR(OY oy) {
        int i = oy.sRq;
        oy.sRq = i + 1;
        return i;
    }

    private void Pw() {
        this.IeN = new LD(this, this.KPU);
        this.QAg = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.OY.5
            @Override // java.lang.Runnable
            public void run() {
                if (OY.this.HD) {
                    OY.this.HD = false;
                    OY.this.OY.removeCallbacks(OY.this.nBu);
                    OY.this.Lxb(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.nBu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.OY.6
            @Override // java.lang.Runnable
            public void run() {
                if (OY.this.HD) {
                    OY.this.HD = false;
                    OY.this.IG = false;
                    OY.this.OY.removeCallbacks(OY.this.QAg);
                    OY.this.Lxb(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.NXR = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.OY.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (OY.this.FGm != null) {
                    OY.this.FGm.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tD.OY.7.1
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (OY.this.IeN != null) {
                                OY.this.IeN.Lxb(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (OY.this.sLN != null) {
                    OY.this.sLN.postDelayed(this, 500L);
                }
            }
        };
        this.STP = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.OY.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                OY.this.Lxb("playable_stuck_check_ping", new JSONObject());
                if (OY.this.sLN != null) {
                    OY.this.sLN.postDelayed(this, 500L);
                }
            }
        };
        this.JVA = new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.OY.9
            @Override // java.lang.Runnable
            public void run() {
                if (OY.this.xr <= 0) {
                    OY.this.LD(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (OY.this.xr - OY.this.ae > OY.this.KPU) {
                        OY.this.LD(1, "Clicking on the hot zone causes the program to freeze.");
                        return;
                    }
                    OY.this.xan();
                    OY.this.ae = 0L;
                    OY.this.xr = 0L;
                }
            }
        };
    }

    private void dR() {
        String str;
        if (this.iC == null || (str = this.bm) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.iC.optString(BidResponsedEx.KEY_CID);
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.bm).getHost();
        if (TextUtils.isEmpty(host)) {
            this.bm = AbstractC5044xl.p(new StringBuilder(), this.bm, "/cid_", strOptString);
        } else {
            this.bm = this.bm.replace(host, DM.i(host, "/cid_", strOptString));
        }
    }

    public static /* synthetic */ int sLN(OY oy) {
        int i = oy.VU;
        oy.VU = i + 1;
        return i;
    }

    public String BcA() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public void CG() {
        this.Hu = 0;
        this.AcC = 0;
        this.Iyd = 0.0f;
        this.owi = 0;
        this.TA = 0;
        this.ek = 0;
        this.Bj = 0;
        this.FtP = 0;
        this.goy = 0;
        this.nH = 0;
        this.VB = 0;
        this.KOQ = 0;
        this.LRt = 0;
    }

    public void CSn() {
        if (this.ro != null) {
            Lxb lxb = Lxb.LAND_PAGE;
        }
    }

    public JSONObject DY() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.Iyd);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.owi);
            jSONObject2.put("height", this.TA);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.Bj);
            jSONObject3.put("y", this.ek);
            jSONObject3.put("width", this.FtP);
            jSONObject3.put("height", this.goy);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.VB);
            jSONObject4.put("y", this.nH);
            jSONObject4.put("width", this.KOQ);
            jSONObject4.put("height", this.LRt);
            jSONObject.put("visible", jSONObject4);
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "getViewport error", th);
        }
        return jSONObject;
    }

    public void HD() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.le > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.le);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.CG > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.CG;
                this.rW = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            lk("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public JSONObject IeN() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.nTb.ordinal());
            jSONObject.put("safe_area_top_height", this.chu);
            jSONObject.put("safe_area_bottom_height", this.SlV);
            jSONObject.put("playable_enter_from", this.Ns);
            jSONObject.put("playable_retry_count", this.Lpq);
            jSONObject.put("playable_card_session", this.Pw);
            jSONObject.put("playable_video_session", this.dR);
            jSONObject.put("playable_network_type", VVE());
            jSONObject.put("aweme_id", this.JJ);
            return jSONObject;
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void Ivz() {
        int i;
        int i2 = this.jeq;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.IG) {
                this.OY.postDelayed(this.QAg, this.id * 1000);
            }
            if ((this.qEi && sLN(this.bm)) || (i = this.jeq) == 1 || i == 2) {
                this.OY.postDelayed(this.nBu, this.foI * 1000);
            }
        }
    }

    public void KPU() {
        LD ld;
        this.xr = System.currentTimeMillis();
        int i = this.jeq;
        if ((i == 1 || i == 2) && (ld = this.IeN) != null) {
            ld.Lxb(System.currentTimeMillis());
        }
    }

    public JSONObject STP() {
        boolean zLxb;
        boolean zLxb2;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 33) {
                zLxb = JXs.Lxb(this.Lv, Permission.READ_MEDIA_IMAGES);
                zLxb2 = true;
            } else {
                zLxb = JXs.Lxb(this.Lv, Permission.READ_EXTERNAL_STORAGE);
                zLxb2 = JXs.Lxb(this.Lv, Permission.WRITE_EXTERNAL_STORAGE);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zLxb);
            jSONObject.put("isHasWrite", zLxb2);
            if (!zLxb || !zLxb2) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void Sfi() {
        com.bytedance.sdk.openadsdk.tD.Lxb lxb = this.ro;
        if (lxb != null) {
            lxb.LD();
        }
    }

    public String VVE() {
        com.bytedance.sdk.openadsdk.tD.Lxb lxb;
        if (TextUtils.isEmpty(this.NDz) && (lxb = this.ro) != null) {
            this.NDz = lxb.Lxb().toString();
        }
        return this.NDz;
    }

    public void aH() {
        this.Nu = true;
    }

    public JSONObject brP() {
        if (this.wCT.isNull("width")) {
            View view = this.Wi.get();
            if (view == null) {
                return this.wCT;
            }
            LD(view);
        }
        return this.wCT;
    }

    public void eK() {
        this.JZE = 2;
    }

    public void foI() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.le > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.le);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.CG > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.CG);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            lk("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void hg() {
        try {
            LD ld = this.IeN;
            if (ld != null) {
                ld.Lxb();
            }
            Handler handler = this.sLN;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
    }

    public void id() {
        if (this.ro != null) {
            Lxb lxb = Lxb.LAND_PAGE;
        }
    }

    public com.bytedance.sdk.openadsdk.tD.Lxb kqm() {
        return this.ro;
    }

    public int le() {
        return (this.hg == -1 || !this.Zg) ? 1 : 2;
    }

    public void nE() {
        this.qEi = false;
        this.OY.removeCallbacks(this.nBu);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.CG > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.CG);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            lk("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void nJ() {
        if (this.Pd) {
            return;
        }
        this.Pd = true;
        this.nE = 0L;
        this.kqm = true;
        CG();
        try {
            View view = this.Wi.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.mW);
            }
        } catch (Throwable unused) {
        }
        try {
            LD ld = this.IeN;
            if (ld != null) {
                ld.Lxb();
                this.IeN = null;
            }
            Handler handler = this.sLN;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            th.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.bm)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.VU);
                jSONObject.put("playable_hit_times", this.sRq);
                int i = this.VU;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.sRq) / (((double) i) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                lk("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused2) {
        }
        try {
            if (!TextUtils.isEmpty(this.bm)) {
                if (this.xan != -1) {
                    this.Ivz += System.currentTimeMillis() - this.xan;
                    this.xan = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.Ivz);
                lk("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused3) {
        }
        this.IG = false;
        this.qEi = false;
        this.OY.removeCallbacks(this.QAg);
        this.OY.removeCallbacks(this.nBu);
        this.OY.removeCallbacksAndMessages(null);
    }

    public int rW() {
        return this.Td;
    }

    public JSONObject tD() {
        return this.iC;
    }

    public void xan() {
        if (this.eK) {
            this.BcA = System.currentTimeMillis();
            if (this.nTb == Lxb.FEED_AWEME) {
                if (this.Zg && this.MGT == 3) {
                    LD ld = this.IeN;
                    if (ld != null && ld.LD()) {
                        NDz();
                        return;
                    } else {
                        if (this.IeN == null) {
                            this.IeN = new LD(this, this.KPU);
                            NDz();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.Zg && this.MGT == 2) {
                LD ld2 = this.IeN;
                if (ld2 != null && ld2.LD()) {
                    NDz();
                } else if (this.IeN == null) {
                    this.IeN = new LD(this, this.KPU);
                    NDz();
                }
            }
        }
    }

    private boolean sLN(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public Set<String> JVA() {
        return this.oc.Lxb();
    }

    public String JXs() {
        return this.Za;
    }

    public JSONObject NXR() {
        try {
            boolean zLxb = JXs.Lxb(this.Lv, Permission.CAMERA);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zLxb);
            return jSONObject;
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public boolean OY() {
        return this.tv;
    }

    public boolean QAg() {
        return this.Zg;
    }

    public String ZU() {
        return this.wPa;
    }

    public String ebl() {
        return this.Bg;
    }

    public String lc() {
        return this.FV;
    }

    public JSONObject lk() {
        return this.mb;
    }

    public JSONObject nBu() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.rK);
            return jSONObject;
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public void JVA(String str) {
        this.OY.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.OY.3
            @Override // java.lang.Runnable
            public void run() {
                OY.NXR(OY.this);
            }
        });
    }

    public OY JXs(String str) {
        this.Bg = str;
        return this;
    }

    public JSONObject OY(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt != 1) {
                if (iOptInt != 2) {
                    if (iOptInt == 3) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            jSONObject2.put("result", JXs.Lxb(this.Lv));
                        } else {
                            jSONObject2.put("result", false);
                        }
                    }
                    return jSONObject2;
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    jSONObject2.put("result", JXs.LD(this.Lv, Permission.CAMERA));
                } else {
                    jSONObject2.put("result", false);
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                jSONObject2.put("result", JXs.LD(this.Lv, Permission.RECORD_AUDIO));
            } else {
                jSONObject2.put("result", false);
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void QAg(String str) {
        WebView webView;
        boolean z = this.MGT == -1;
        this.MGT = 2;
        if (!z) {
            this.eXY = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.nJ = jCurrentTimeMillis;
                long j = this.CG;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", le());
            } catch (Throwable th) {
                ebl.Lxb("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            lk("PL_sdk_html_load_finish", jSONObject);
        }
        this.IG = false;
        this.OY.removeCallbacks(this.QAg);
        try {
            if (this.jeq == 0) {
                if (this.VVE && (webView = this.FGm) != null) {
                    this.VVE = false;
                    webView.evaluateJavascript(BcA(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tD.OY.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                xan();
            }
        } catch (Throwable th2) {
            ebl.Lxb("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public OY ZU(String str) {
        this.FV = str;
        return this;
    }

    public OY ebl(String str) {
        int iIndexOf;
        String strDecode;
        this.pyu = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!ProxyConfig.MATCH_HTTP.equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                    if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                        if (this.jeq == -1) {
                            LD(2);
                        } else {
                            LD(1);
                        }
                    }
                } else {
                    LD(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                }
            } else {
                LD(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            }
        } catch (Throwable unused) {
        }
        this.bm = str;
        return this;
    }

    public OY lc(String str) {
        this.Sfi = str;
        return this;
    }

    public OY lk(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.mb = jSONObject;
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "setPlayableStyle error", th);
        }
        return this;
    }

    public JSONObject sLN() {
        try {
            boolean zLxb = JXs.Lxb(this.Lv, Permission.RECORD_AUDIO);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zLxb);
            return jSONObject;
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.Hu == view.getWidth() && this.AcC == view.getHeight()) {
                return;
            }
            this.Hu = view.getWidth();
            this.AcC = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.Hu);
            jSONObject.put("height", this.AcC);
            Lxb("resize", jSONObject);
            this.wCT = jSONObject;
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public void JXs(JSONObject jSONObject) {
        this.bG = jSONObject;
        this.Sv++;
        hg();
        this.OY.removeCallbacks(this.JVA);
        if (this.eK) {
            this.BcA = System.currentTimeMillis();
            this.ae = System.currentTimeMillis();
            this.xr = 0L;
            int i = this.jeq;
            if (i == 0) {
                WebView webView = this.FGm;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.tD.OY.10
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            OY.this.xr = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                Lxb("playable_stuck_check_ping", new JSONObject());
            }
            this.OY.postDelayed(this.JVA, this.KPU);
        }
    }

    public OY ZU(boolean z) {
        this.rK = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.rK);
            Lxb("change_playable_click", jSONObject);
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "setPlayableClick error", th);
        }
        return this;
    }

    public void lc(JSONObject jSONObject) {
        LD(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    private void Lxb(Context context, lk lkVar, com.bytedance.sdk.openadsdk.tD.Lxb lxb) {
        this.DY = UUID.randomUUID().toString();
        this.Lv = context;
        this.ro = lxb;
        this.gS = lkVar;
        nBu.Lxb(lxb);
        this.oc = new lc(this);
        Pw();
        if (this.FGm == null) {
            this.Td = 4;
            this.OY.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.OY.4
                @Override // java.lang.Runnable
                public void run() {
                    OY.this.Lxb(5, "webview is null");
                }
            });
        }
    }

    public void nBu(String str) {
        this.OY.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.OY.2
            @Override // java.lang.Runnable
            public void run() {
                OY.sLN(OY.this);
            }
        });
    }

    public void lc(boolean z) {
        this.kRz = z;
    }

    public OY lk(boolean z) {
        if (this.Td == -1 || this.Zg == z) {
            return this;
        }
        this.Zg = z;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.Zg) {
                jSONObject.put("playable_background_show_type", this.LXE);
            }
        } catch (JSONException unused) {
        }
        lk(this.Zg ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.hg == -1 && this.Zg) {
            this.hg = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("render_type", this.Td == 1 ? 1 : 2);
                int i = this.Td;
                if (i != -1) {
                    jSONObject2.put("webview_state", i);
                }
            } catch (JSONException unused2) {
            }
            lk("PL_sdk_page_show", jSONObject2);
        }
        if (this.hg != -1 && !this.Zg && !this.HN) {
            this.HN = true;
        }
        if (this.Zg) {
            this.xan = System.currentTimeMillis();
        } else if (this.xan != -1) {
            this.Ivz += System.currentTimeMillis() - this.xan;
            this.xan = -1L;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("viewStatus", this.Zg);
            Lxb("viewableChange", jSONObject3);
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "setViewable error", th);
        }
        if (this.Zg) {
            xan();
        } else {
            hg();
        }
        return this;
    }

    public void ZU(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.uxf = jSONObject.optString("section");
        }
    }

    private String ZU(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.bm = str3;
        return str3;
    }

    public JSONObject ZU(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (ebl.Lxb() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectLxb = this.oc.Lxb(str, jSONObject);
        if (ebl.Lxb()) {
            System.currentTimeMillis();
            if (jSONObjectLxb != null) {
                jSONObjectLxb.toString();
            }
        }
        return jSONObjectLxb;
    }

    public Map<String, String> LD() {
        return this.JD;
    }

    public OY LD(String str) {
        this.wPa = str;
        return this;
    }

    public OY LD(boolean z) {
        this.Mx = z;
        return this;
    }

    public void Lxb(View view) {
        if (view == null) {
            return;
        }
        try {
            this.Wi = new WeakReference<>(view);
            LD(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.mW);
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    public OY LD(long j) {
        if (j <= 0) {
            this.foI = 10L;
        } else {
            this.foI = j;
        }
        return this;
    }

    public void OY(String str) {
        this.MGT = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.CG = jCurrentTimeMillis;
            long j = this.hg;
            jSONObject.put("playable_page_show_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        lk("PL_sdk_html_load_start", jSONObject);
        this.IG = true;
        this.qEi = true;
        if (this.cR) {
            Ivz();
            this.IG = false;
            this.qEi = false;
        }
        if (this.kqm) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (JXs.Lxb(this.Lv, JXs.sLN)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (JXs.LD(this.Lv, Permission.RECORD_AUDIO)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (JXs.Lxb(this.Lv, JXs.JVA)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (JXs.Lxb(this.Lv, JXs.nBu)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (JXs.Lxb(this.Lv, JXs.QAg)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (JXs.Lxb(this.Lv, JXs.OY)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (JXs.LD(this.Lv, Permission.CAMERA)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (JXs.Lxb(this.Lv, JXs.ebl)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (JXs.Lxb(this.Lv)) {
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
                lk("PL_sdk_hardware_detect", jSONObject2);
                this.kqm = false;
            } catch (Throwable th2) {
                ebl.Lxb("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    private void JXs(String str, JSONObject jSONObject) {
        try {
            int i = this.jeq;
            if (i == 0) {
                if (this.nTb != Lxb.LAND_PAGE && !sLN(this.bm)) {
                    dR();
                }
                jSONObject.put("playable_url", this.bm);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", ZU(this.lJ, this.op));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", lk(this.mOF, this.Mvg));
            }
            jSONObject.put("playable_render_type", this.jeq);
            if (this.ro != null) {
                if (this.jeq == 0 && (this.nTb != Lxb.LAND_PAGE || sLN(this.bm))) {
                    this.ro.Lxb(jSONObject);
                } else if (this.jeq != 0) {
                    this.ro.Lxb(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void LD(JSONObject jSONObject) {
        if (this.ro != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public Context Lxb() {
        return this.Lv;
    }

    public void LD(String str, String str2) {
        Bitmap bitmapLxb;
        if (TextUtils.isEmpty(str2) || (bitmapLxb = JXs.Lxb(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.Lv.getContentResolver(), bitmapLxb, str, "");
    }

    public OY Lxb(String str, String str2) {
        this.JD.put(str, str2);
        return this;
    }

    public OY Lxb(String str) {
        this.Za = str;
        return this;
    }

    public OY Lxb(boolean z) {
        this.tv = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.tv);
            Lxb("volumeChange", jSONObject);
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "setIsMute error", th);
        }
        return this;
    }

    public void QAg(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.MGT = 3;
                xan();
            } else {
                this.MGT = -2;
            }
            if (zOptBoolean || !this.HD) {
                return;
            }
            this.HD = false;
            this.IG = false;
            this.qEi = false;
            this.OY.removeCallbacks(this.QAg);
            this.OY.removeCallbacks(this.nBu);
            Lxb(4, "CaseRenderFail");
        }
    }

    public OY LD(int i) {
        this.jeq = i;
        return this;
    }

    public JSONObject ebl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return sLN();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : STP();
        }
        return NXR();
    }

    public void LD(int i, String str) {
        this.JZE = i;
        if (this.bG == null) {
            this.bG = new JSONObject();
        }
        try {
            this.bG.put("playable_stuck_type", i);
            this.bG.put("playable_stuck_reason", str);
            if (this.BcA > 0) {
                this.bG.put("playable_stuck_duration", System.currentTimeMillis() - this.BcA);
            } else {
                this.bG.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        lk("PL_sdk_page_stuck", this.bG);
        hg();
        if (this.ro == null || i != 2) {
            return;
        }
        this.bG = new JSONObject();
    }

    public OY Lxb(long j) {
        if (j <= 0) {
            this.id = 10L;
        } else {
            this.id = j;
        }
        return this;
    }

    public OY JXs(boolean z) {
        this.cR = z;
        return this;
    }

    public void Lxb(int i) {
        this.Td = i;
    }

    public void Lxb(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.tD.Lxb lxb = this.ro;
        if (lxb == null || lxb.LD(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            LD(strOptString2, strOptString);
        }
    }

    public OY lk(JSONObject jSONObject) {
        this.iC = jSONObject;
        return this;
    }

    private void lk(int i, String str) {
        com.bytedance.sdk.openadsdk.tD.Lxb lxb = this.ro;
        if (lxb != null) {
            lxb.Lxb(i, str);
        }
    }

    public void LD(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JXs(str, jSONObject);
    }

    public void Lxb(String str, JSONObject jSONObject) {
        if (ebl.Lxb() && jSONObject != null) {
            jSONObject.toString();
        }
        lk lkVar = this.gS;
        if (lkVar != null) {
            lkVar.Lxb(str, jSONObject);
        }
    }

    private String lk(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.Rt) && !TextUtils.isEmpty(this.pyu)) {
            Uri uri = Uri.parse(this.pyu);
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
            this.Rt = builderAppendQueryParameter.toString();
        }
        return this.Rt;
    }

    public OY Lxb(float f) {
        this.Iyd = f;
        return this;
    }

    public void Lxb(int i, String str) {
        hg();
        lk(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "reportRenderFatal error", th);
        }
        lk("PL_sdk_global_faild", jSONObject);
    }

    public void Lxb(int i, String str, String str2) {
        this.MGT = -1;
        this.eXY = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", le());
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "onWebReceivedError error", th);
        }
        lk("PL_sdk_html_load_error", jSONObject);
        if (this.HD) {
            this.HD = false;
            this.IG = false;
            this.qEi = false;
            this.OY.removeCallbacks(this.QAg);
            this.OY.removeCallbacks(this.nBu);
            Lxb(1, "ContainerLoadFail");
        }
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
    public void lk(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.Of && this.sRq > 0) {
                this.Of = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.kRz ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.Zg);
            jSONObject.put("playable_session_id", this.DY);
            int i = this.jeq;
            if (i == 0) {
                if (this.nTb != Lxb.LAND_PAGE && !sLN(this.bm)) {
                    dR();
                }
                jSONObject.put("playable_url", this.bm);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", ZU(this.lJ, this.op));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", lk(this.mOF, this.Mvg));
            }
            jSONObject.put("playable_full_url", this.pyu);
            jSONObject.put("playable_replay_count", this.Ld);
            jSONObject.put("playable_is_prerender", this.Mx);
            jSONObject.put("playable_is_preload", this.Of);
            jSONObject.put("playable_render_type", this.jeq);
            jSONObject.put("playable_scenes_type", this.nTb.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.mOF) ? "" : this.mOF);
            if (!TextUtils.isEmpty(this.Mvg)) {
                str2 = this.Mvg;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.lJ);
            jSONObject.put("playable_minigamelite_schema", this.op);
            jSONObject.put("playable_is_debug", this.fG);
            jSONObject.put("playable_retry_count", this.Lpq);
            jSONObject.put("playable_enter_from", this.Ns);
            jSONObject.put("playable_sequence", this.Sv);
            jSONObject.put("playable_current_section", this.uxf);
            jSONObject.put("is_playable_finish", this.Nu);
            jSONObject.put("playable_card_session", this.Pw);
            jSONObject.put("playable_video_session", this.dR);
            jSONObject.put("playable_network_type", VVE());
            jSONObject.put("playable_lynx_version", this.CSn);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("ad_extra_data", jSONObject);
            jSONObject2.put("tag", this.Sfi);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, this.iC.opt(BidResponsedEx.KEY_CID));
            jSONObject2.put("log_extra", this.iC.opt("log_extra"));
            int i2 = this.jeq;
            if (i2 != -1 && i2 != -2) {
                if (this.ro != null) {
                    List<JSONObject> list = this.Vs;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.Vs.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("ad_extra_data");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.jeq);
                                jSONObjectOptJSONObject.put("playable_url", this.bm);
                            }
                            this.ro.Lxb(jSONObjectOptJSONObject);
                        }
                        this.Vs.clear();
                    }
                    if (this.jeq == 0 && (this.nTb != Lxb.LAND_PAGE || sLN(this.bm))) {
                        this.ro.Lxb(jSONObject);
                        return;
                    } else {
                        if (this.jeq != 0) {
                            this.ro.Lxb(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.Vs == null) {
                this.Vs = new ArrayList();
            }
            this.Vs.add(jSONObject2);
        } catch (Throwable th) {
            ebl.Lxb("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void Lxb(boolean z, String str, int i) {
        if (z) {
            this.MGT = -1;
            this.eXY = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", le());
            } catch (Throwable th) {
                ebl.Lxb("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            lk("PL_sdk_html_load_error", jSONObject);
            if (this.HD) {
                this.HD = false;
                this.IG = false;
                this.qEi = false;
                this.OY.removeCallbacks(this.QAg);
                this.OY.removeCallbacks(this.nBu);
                Lxb(1, "ContainerLoadFail");
            }
        }
    }

    private OY(Context context, int i, lk lkVar, com.bytedance.sdk.openadsdk.tD.Lxb lxb) {
        this.lc = "playable_stuck_check_ping";
        this.ebl = "playable_apply_media_permission_callback";
        this.OY = new Handler(Looper.getMainLooper());
        this.sLN = new Handler(Looper.getMainLooper());
        this.VVE = true;
        this.kqm = true;
        this.brP = true;
        this.Lxb = "PL_sdk_playable_global_viewable";
        this.LD = "PL_sdk_page_screen_blank";
        this.lk = "PL_sdk_playable_destroy_analyze_summary";
        this.ZU = "PL_sdk_playable_hardware_dialog_cancel";
        this.JXs = "PL_sdk_playable_hardware_dialog_setting";
        this.tD = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.DY = null;
        this.Sfi = "embeded_ad";
        this.HD = true;
        this.eK = true;
        this.aH = false;
        this.CSn = "";
        this.id = 10L;
        this.foI = 10L;
        this.KPU = TypedValues.TransitionType.TYPE_DURATION;
        this.Ivz = 0L;
        this.nE = 0L;
        this.xan = -1L;
        this.hg = -1L;
        this.CG = -1L;
        this.nJ = -1L;
        this.le = -1L;
        this.BcA = -1L;
        this.rW = -1L;
        this.Pw = "";
        this.dR = "";
        this.NDz = "";
        this.JJ = "";
        this.VU = 0;
        this.sRq = 0;
        this.Of = false;
        this.Ld = 0;
        this.JZE = -1;
        this.Lpq = 0;
        this.Ns = 0;
        this.Sv = 0;
        this.uxf = null;
        this.Nu = false;
        this.SS = 0;
        this.LXE = 0;
        this.wbY = 0;
        this.FD = 0;
        this.ae = 0L;
        this.xr = 0L;
        this.jeq = -2;
        this.MGT = 0;
        this.Hu = 0;
        this.AcC = 0;
        this.wCT = new JSONObject();
        this.JD = new HashMap();
        this.iC = new JSONObject();
        this.pyu = "";
        this.chu = 0.0f;
        this.SlV = 0.0f;
        this.HN = false;
        this.fG = false;
        this.Pd = false;
        this.Vs = new ArrayList();
        this.cR = true;
        this.IG = true;
        this.qEi = true;
        this.mW = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.tD.OY.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) OY.this.Wi.get();
                    if (view == null) {
                        return;
                    }
                    OY.this.LD(view);
                } catch (Throwable th) {
                    ebl.Lxb("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.Td = -1;
        this.jeq = i;
        this.nTb = Lxb.LAND_PAGE;
        Lxb(context, lkVar, lxb);
    }

    public static OY Lxb(Context context, @Nullable WebView webView, lk lkVar, com.bytedance.sdk.openadsdk.tD.Lxb lxb) {
        if (lkVar == null || lxb == null) {
            return null;
        }
        if (webView == null) {
            return new OY(context, 0, lkVar, lxb);
        }
        return new OY(context, webView, lkVar, lxb, Lxb.LAND_PAGE);
    }
}
