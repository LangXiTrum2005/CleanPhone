package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.ironsource.C3700q2;
import com.ironsource.C3724ra;
import com.ironsource.X3;
import com.ironsource.sdk.controller.f;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class dzy implements com.bytedance.sdk.component.adexpress.fi.lr, com.bytedance.sdk.component.utils.igq.ri, com.bytedance.sdk.openadsdk.sf.lr {
    private static final Map<String, Boolean> mj;
    private com.bytedance.sdk.openadsdk.core.jbs.vr ac;
    private int aw;
    private com.bytedance.sdk.openadsdk.aw.fi ay;
    private String bgr;
    private ik bnj;
    private com.bytedance.sdk.openadsdk.core.model.wjv bu;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private String f18119co;
    private String di;
    private com.bytedance.sdk.component.ri.vr dzy;
    private igq fe;
    private boolean feb;
    private JSONObject fr;
    private String ig;
    private com.bytedance.sdk.openadsdk.aw.ik igq;
    private JSONObject ihz;
    private com.bytedance.sdk.openadsdk.sf.ik jbs;
    private com.bytedance.sdk.openadsdk.aw.xha jc;
    private WeakReference<com.bytedance.sdk.component.jbs.di> ka;
    private boolean kt;
    private JSONObject nr;
    private HashMap<String, sf> ory;
    private com.bytedance.sdk.openadsdk.aw.lr pv;
    private String qt;
    protected Map<String, Object> ri;
    private WeakReference<View> sf;
    private com.bytedance.sdk.openadsdk.core.widget.ri.ri srn;
    private com.bytedance.sdk.openadsdk.core.ik.ka su;
    private ri ta;
    private com.bytedance.sdk.component.adexpress.lr.sf tan;
    private com.bytedance.sdk.openadsdk.core.bgr.ka.lr tnn;
    private com.bytedance.sdk.openadsdk.sf.ka uq;
    private int vr;
    private com.bytedance.sdk.openadsdk.aw.ri wjv;
    private com.bytedance.sdk.openadsdk.ka.ka.fi xd;
    private com.bytedance.sdk.openadsdk.core.widget.fi xha;
    private com.bytedance.sdk.openadsdk.aw.qt zf;
    private Context zyn;
    private boolean slm = true;
    private boolean dw = true;
    private boolean hcw = false;
    private boolean oh = false;
    boolean lr = false;
    boolean ik = false;
    private boolean qd = false;
    private final com.bytedance.sdk.component.utils.igq fi = new com.bytedance.sdk.component.utils.igq(Looper.getMainLooper(), this);

    public static class ik implements Runnable {
        private final JSONObject lr;
        private final com.bytedance.sdk.openadsdk.core.jbs.vr ri;

        public ik(com.bytedance.sdk.openadsdk.core.jbs.vr vrVar, JSONObject jSONObject) {
            this.ri = vrVar;
            this.lr = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            dzy.lr(this.ri, this.lr);
        }
    }

    public static class lr {
        public int fi;
        public String ik;
        public JSONObject ka;
        public String lr;
        public String ri;
    }

    public interface ri {
        void ri();
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        mj = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public dzy(Context context) {
        this.zyn = context;
    }

    private WebView ac() {
        com.bytedance.sdk.component.jbs.di diVar;
        WeakReference<com.bytedance.sdk.component.jbs.di> weakReference = this.ka;
        if (weakReference == null || (diVar = weakReference.get()) == null) {
            return null;
        }
        return diVar.getWebView();
    }

    private void aw(JSONObject jSONObject) throws Exception {
        ri(jSONObject, this.bu);
    }

    private void ay() {
        com.bytedance.sdk.openadsdk.aw.qt qtVar = this.zf;
        if (qtVar == null) {
            return;
        }
        qtVar.ri();
    }

    private void bgr(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.dw.qt(this.bu))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.dw.qt(this.bu));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bu(JSONObject jSONObject) {
        if (this.ac == null || jSONObject == null) {
            return;
        }
        try {
            this.ac.ri(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private boolean dw() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.bu;
        if (wjvVar == null || wjvVar.ugd() == null || com.bytedance.sdk.openadsdk.core.model.dw.lr(this.bu) || this.hcw || this.bu.ugd().optInt("parent_type") != 2) {
            return false;
        }
        int iLji = this.bu.lji();
        if (iLji != 8 && iLji != 7) {
            return false;
        }
        this.hcw = true;
        return true;
    }

    private void fr() {
        com.bytedance.sdk.openadsdk.aw.qt qtVar = this.zf;
        if (qtVar == null) {
            return;
        }
        qtVar.lr();
    }

    private void igq() {
        if (this.zyn == null || TextUtils.isEmpty(nr.ka().feb())) {
            return;
        }
        TTWebsiteActivity.ri(this.zyn, this.bu, this.ig);
    }

    private JSONObject ihz() {
        try {
            View view = this.sf.get();
            com.bytedance.sdk.component.jbs.di diVar = this.ka.get();
            if (view != null && diVar != null) {
                int[] iArrLr = com.bytedance.sdk.openadsdk.utils.qd.lr(view);
                int[] iArrLr2 = com.bytedance.sdk.openadsdk.utils.qd.lr((View) diVar);
                if (iArrLr != null && iArrLr2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("x", com.bytedance.sdk.openadsdk.utils.qd.ik(nr.ri(), iArrLr[0] - iArrLr2[0]));
                    jSONObject.put("y", com.bytedance.sdk.openadsdk.utils.qd.ik(nr.ri(), iArrLr[1] - iArrLr2[1]));
                    jSONObject.put("w", com.bytedance.sdk.openadsdk.utils.qd.ik(nr.ri(), view.getWidth()));
                    jSONObject.put("h", com.bytedance.sdk.openadsdk.utils.qd.ik(nr.ri(), view.getHeight()));
                    jSONObject.put("isExist", true);
                    return jSONObject;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private boolean nr(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.jbs.vr vrVar = this.ac;
        if (vrVar != null && jSONObject != null) {
            double dIk = vrVar.ik();
            double dKa = this.ac.ka();
            int iFi = this.ac.fi();
            com.bytedance.sdk.component.utils.ac.ri("TTAD.TopLayoutHelper", "current:", Double.valueOf(dIk), "state", Integer.valueOf(iFi), "countdownTime", Double.valueOf(dKa));
            try {
                jSONObject.put("currentTime", dIk / 1000.0d);
                if (dKa > 0.0d) {
                    jSONObject.put("countDownTime", dKa / 1000.0d);
                }
                jSONObject.put("state", iFi);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private void ory() {
        if (this.jbs == null) {
            this.jbs = com.bytedance.sdk.openadsdk.sf.ri.ri(this, this.bu);
        }
    }

    private void slm(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.aw.ik ikVar = this.igq;
        if (ikVar == null || jSONObject == null) {
            return;
        }
        ikVar.ri(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void su() {
        com.bytedance.sdk.openadsdk.core.jbs.vr vrVar = this.ac;
        if (vrVar != null) {
            vrVar.ri();
        }
    }

    private void tan(JSONObject jSONObject) {
        int i;
        double dOptDouble;
        double dOptDouble2;
        int i2;
        dzy dzyVar = this;
        if (dzyVar.tan == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar = dzyVar.xd;
        if (fiVar != null) {
            fiVar.vr();
        }
        com.bytedance.sdk.component.adexpress.lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.lr.bgr();
        bgrVar.ri(1);
        try {
            boolean zOptBoolean = jSONObject.optBoolean("isRenderSuc");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("AdSize");
            if (jSONObjectOptJSONObject != null) {
                dOptDouble = jSONObjectOptJSONObject.optDouble("width");
                dOptDouble2 = jSONObjectOptJSONObject.optDouble("height");
            } else {
                dOptDouble = 0.0d;
                dOptDouble2 = 0.0d;
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject2 != null) {
                try {
                    double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("x");
                    double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("y");
                    i2 = 101;
                    try {
                        double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("width");
                        double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("height");
                        if (dzyVar.ac(jSONObjectOptJSONObject2)) {
                            bgrVar.ri((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft"));
                            bgrVar.lr((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight"));
                            bgrVar.ik((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft"));
                            bgrVar.ka((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight"));
                        }
                        bgrVar.ik(dOptDouble3);
                        bgrVar.ka(dOptDouble4);
                        bgrVar.fi(dOptDouble5);
                        bgrVar.di(dOptDouble6);
                    } catch (Exception unused) {
                        dzyVar = this;
                        i = 101;
                        bgrVar.lr(i);
                        bgrVar.ri(jbs.ri(i));
                        dzyVar.tan.ri(bgrVar);
                    }
                } catch (Exception unused2) {
                    i = 101;
                    dzyVar = this;
                    bgrVar.lr(i);
                    bgrVar.ri(jbs.ri(i));
                    dzyVar.tan.ri(bgrVar);
                }
            } else {
                dOptDouble2 = dOptDouble2;
                i2 = 101;
            }
            try {
                String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, jbs.ri(i2));
                i = i2;
                try {
                    int iOptInt = jSONObject.optInt("code", i);
                    bgrVar.ri(zOptBoolean);
                    bgrVar.ri(dOptDouble);
                    bgrVar.lr(dOptDouble2);
                    bgrVar.ri(strOptString);
                    bgrVar.lr(iOptInt);
                    dzyVar = this;
                    dzyVar.tan.ri(bgrVar);
                } catch (Exception unused3) {
                    dzyVar = this;
                    bgrVar.lr(i);
                    bgrVar.ri(jbs.ri(i));
                    dzyVar.tan.ri(bgrVar);
                }
            } catch (Exception unused4) {
                dzyVar = this;
                i = 101;
                bgrVar.lr(i);
                bgrVar.ri(jbs.ri(i));
                dzyVar.tan.ri(bgrVar);
            }
        } catch (Exception unused5) {
        }
    }

    private static List<String> uq() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    private void vr(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.ka.ka.fi fiVar;
        if (jSONObject == null || (fiVar = this.xd) == null) {
            return;
        }
        fiVar.lr(jSONObject);
    }

    private Context wjv() {
        WeakReference<com.bytedance.sdk.component.jbs.di> weakReference = this.ka;
        Activity activityRi = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.lr.ri(this.ka.get());
        return activityRi == null ? this.zyn : activityRi;
    }

    private JSONObject zf() {
        return lr(this.bu);
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            aw(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            lr(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dzy.3
                @Override // java.lang.Runnable
                public void run() {
                    dzy.this.bu(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dzy.4
                @Override // java.lang.Runnable
                public void run() {
                    dzy.this.fi(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    public void co() {
        com.bytedance.sdk.openadsdk.sf.ik ikVar = this.jbs;
        if (ikVar != null) {
            ikVar.ri();
        }
        ik ikVar2 = this.bnj;
        if (ikVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.dzy.lr(ikVar2);
            this.bnj = null;
        }
        this.zyn = null;
        this.tnn = null;
    }

    public boolean di() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            ihz(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        nr(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.ihz.toString();
        }
        try {
            JSONObject jSONObjectRi = com.bytedance.sdk.openadsdk.core.jbs.ri.lr.ri(this.ihz, new JSONObject(str));
            return jSONObjectRi == null ? this.ihz.toString() : jSONObjectRi.toString();
        } catch (Exception unused) {
            return this.ihz.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public String getTemplateInfo() {
        ri("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.ihz;
            if (jSONObject != null) {
                jSONObject.put("setting", zf());
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.bu;
                if (wjvVar != null && wjvVar.hqg() != null) {
                    this.ihz.put("dynamic_configs", this.bu.hqg());
                }
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.bu;
                if (wjvVar2 != null) {
                    this.ihz.put("extension", wjvVar2.cm());
                }
            }
            ri("getTemplateInfo", false);
            return this.ihz.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dzy.6
            @Override // java.lang.Runnable
            public void run() {
                if (dzy.this.srn != null) {
                    dzy.this.srn.ri();
                }
            }
        });
    }

    public boolean jbs() {
        return this.qd;
    }

    public void mj() {
        com.bytedance.sdk.openadsdk.core.jbs.vr vrVar = this.ac;
        if (vrVar != null) {
            vrVar.lr();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            ik ikVar = this.bnj;
            if (ikVar != null) {
                com.bytedance.sdk.openadsdk.utils.dzy.lr(ikVar);
            }
            ik ikVar2 = new ik(this.ac, jSONObject);
            this.bnj = ikVar2;
            com.bytedance.sdk.openadsdk.utils.dzy.ri(ikVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.AndroidObject", "");
        }
    }

    public boolean qt() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.bu;
        return wjvVar != null && wjvVar.zxp() == 1;
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            tan(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    public void sf() {
        dw();
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dzy.5
            @Override // java.lang.Runnable
            public void run() {
                dzy.this.su();
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    @JavascriptInterface
    public void videoFrameChanged(String str) {
        if (this.jc == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.component.adexpress.lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.lr.bgr();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject != null) {
                double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
                double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
                double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
                double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
                if (ac(jSONObjectOptJSONObject)) {
                    bgrVar.ri((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopLeft"));
                    bgrVar.lr((float) jSONObjectOptJSONObject.optDouble("borderRadiusTopRight"));
                    bgrVar.ik((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomLeft"));
                    bgrVar.ka((float) jSONObjectOptJSONObject.optDouble("borderRadiusBottomRight"));
                }
                bgrVar.ik(dOptDouble);
                bgrVar.ka(dOptDouble2);
                bgrVar.fi(dOptDouble3);
                bgrVar.di(dOptDouble4);
            }
            com.bytedance.sdk.openadsdk.aw.xha xhaVar = this.jc;
            if (xhaVar != null) {
                xhaVar.ri(bgrVar);
            }
        } catch (Throwable unused) {
        }
    }

    public void xha() {
        com.bytedance.sdk.openadsdk.aw.ik ikVar;
        if (this.feb && (ikVar = this.igq) != null) {
            ikVar.ri();
            return;
        }
        Context context = this.zyn;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.wjv.ri((Activity) context)) {
            ((Activity) this.zyn).finish();
        }
    }

    private void jbs(String str) {
        int iIndexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView webViewAc = ac();
                    if (webViewAc != null) {
                        com.bytedance.sdk.component.utils.bgr.ri(webViewAc, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (str.startsWith("bytedance://private/setresult/") && (iIndexOf = str.indexOf(38, 30)) > 0) {
                    String strSubstring = str.substring(30, iIndexOf);
                    String strSubstring2 = str.substring(iIndexOf + 1);
                    if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                        return;
                    }
                    xha(strSubstring2);
                }
            } catch (Exception unused) {
            }
        }
    }

    private void uq(JSONObject jSONObject) {
        if (jSONObject == null || this.uq == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                this.uq.ri(false, null);
            } else {
                this.uq.ri(true, jSONArrayOptJSONArray);
            }
        } catch (Exception unused) {
            this.uq.ri(false, null);
        }
    }

    public void aw() {
        ri riVar = this.ta;
        if (riVar != null) {
            riVar.ri();
        }
    }

    public void di(String str) {
        this.ig = str;
    }

    public boolean fi() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.bu;
        return wjvVar != null && wjvVar.luy();
    }

    public dzy ik(String str) {
        this.qt = str;
        return this;
    }

    public com.bytedance.sdk.openadsdk.core.model.wjv ka() {
        return this.bu;
    }

    public void sf(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("status");
        igq igqVar = this.fe;
        if (igqVar != null) {
            if (iOptInt == 1) {
                igqVar.p_();
            } else if (iOptInt == 2) {
                igqVar.q_();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject ay(JSONObject jSONObject) {
        if (this.ri != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new JSONObject(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.ri.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.ac.ik(e.toString(), new Object[0]);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean mj(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return qt();
        }
        return true;
    }

    public com.bytedance.sdk.openadsdk.core.bgr.ka.lr bgr() {
        return this.tnn;
    }

    public void di(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVarRi = com.bytedance.sdk.openadsdk.core.lr.ri(jSONObject, null, null, null, 0);
        if (wjvVarRi != null) {
            boolean zXha = com.bytedance.sdk.openadsdk.core.model.ac.xha(this.bu);
            ri(wjvVarRi, zXha ? com.bytedance.sdk.openadsdk.utils.ig.lr(this.aw) : this.ig, !zXha);
        }
    }

    public dzy fi(String str) {
        this.bgr = str;
        return this;
    }

    public void ik() {
        com.bytedance.sdk.component.ri.vr vrVar = this.dzy;
        if (vrVar == null) {
            return;
        }
        vrVar.ri();
        this.dzy = null;
    }

    public dzy ka(String str) {
        this.f18119co = str;
        return this;
    }

    public void qt(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.ri riVarKa;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.bu;
        if (wjvVar == null || (riVarKa = wjvVar.ka()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.wjv> listKa = riVarKa.ka();
        if (iOptInt < 0 || iOptInt >= listKa.size()) {
            return;
        }
        ri(listKa.get(iOptInt), this.ig, false);
        com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar = this.tnn;
        if (lrVar != null) {
            lrVar.gcp();
        }
    }

    public void slm() {
        igq igqVar = this.fe;
        if (igqVar != null) {
            igqVar.n_();
        }
    }

    public void vr() {
        igq igqVar = this.fe;
        if (igqVar != null) {
            igqVar.m_();
        }
    }

    private boolean ac(JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    private void wjv(JSONObject jSONObject) {
        WebView webViewAc;
        if (jSONObject == null || (webViewAc = ac()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.bgr.ri(webViewAc, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    public JSONObject bu() {
        JSONObject jSONObject = new JSONObject();
        try {
            igq igqVar = this.fe;
            if (igqVar != null) {
                jSONObject.put("leftTime", igqVar.o_());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public void fi(JSONObject jSONObject) {
        double d;
        double d2;
        double dOptDouble;
        double d3;
        double d4;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.component.utils.ac.ri("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String strOptString = jSONObject.optString(f.b.c);
            int iOptInt = jSONObject.optInt("areaType", 1);
            String strOptString2 = jSONObject.optString("clickAreaType");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            double d5 = 0.0d;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", 0.0d);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", 0.0d);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", 0.0d);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", 0.0d);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", 0.0d);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", 0.0d);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                d4 = dOptDouble6;
                d5 = dOptDouble2;
                d2 = dOptDouble3;
                d3 = dOptDouble5;
                d = dOptDouble4;
            } else {
                d = 0.0d;
                d2 = 0.0d;
                dOptDouble = 0.0d;
                d3 = 0.0d;
                d4 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            com.bytedance.sdk.openadsdk.core.model.slm slmVarRi = new com.bytedance.sdk.openadsdk.core.model.slm.ri().ka((float) d5).ik((float) dOptDouble).lr((float) d2).ri((float) d).lr((long) d3).ri((long) d4).ri(strOptString2).ri((SparseArray<com.bytedance.sdk.openadsdk.core.ik.ik.ri>) null).ri(true).lr(iOptInt).ri(jSONObjectOptJSONObject).ri(jSONObject.optInt("clickAreaCategory", -1)).lr(jSONObjectOptJSONObject2).ri();
            com.bytedance.sdk.component.adexpress.lr.sf sfVar = this.tan;
            if (sfVar != null) {
                sfVar.ri(null, iOptInt, slmVarRi);
            }
            ri(strOptString, iOptInt, slmVarRi);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.lr.sf sfVar2 = this.tan;
            if (sfVar2 != null) {
                sfVar2.ri(null, -1, null);
            }
        }
    }

    public void ka(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("zoom_type", 1);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.lr.bgr();
        if (jSONObjectOptJSONObject != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
            double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
            double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
            bgrVar.ik(dOptDouble);
            bgrVar.ka(dOptDouble2);
            bgrVar.fi(dOptDouble3);
            bgrVar.di(dOptDouble4);
        }
        com.bytedance.sdk.openadsdk.core.jbs.vr vrVar = this.ac;
        if (vrVar != null) {
            vrVar.ri(iOptInt, bgrVar);
        }
    }

    public dzy lr(String str) {
        this.di = str;
        return this;
    }

    private void xha(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                lr lrVar = new lr();
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        lrVar.ri = jSONObjectOptJSONObject.optString("__msg_type", null);
                        lrVar.lr = jSONObjectOptJSONObject.optString("__callback_id", null);
                        lrVar.ik = jSONObjectOptJSONObject.optString("func");
                        lrVar.ka = jSONObjectOptJSONObject.optJSONObject("params");
                        lrVar.fi = jSONObjectOptJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(lrVar.ri) && !TextUtils.isEmpty(lrVar.ik)) {
                    Message messageObtainMessage = this.fi.obtainMessage(11);
                    messageObtainMessage.obj = lrVar;
                    this.fi.sendMessage(messageObtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public com.bytedance.sdk.component.ri.vr lr() {
        return this.dzy;
    }

    public void ik(JSONObject jSONObject) {
        tan.ri(wjv(), this.zyn instanceof Activity, jSONObject, this.bu, this.ig, this.aw, ac(), this.xha);
    }

    public dzy lr(com.bytedance.sdk.component.jbs.di diVar) {
        this.ka = new WeakReference<>(diVar);
        return this;
    }

    public JSONObject mj(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.jbs.vr vrVar = this.ac;
        if (vrVar != null) {
            try {
                jSONObject2.put("state", vrVar.ri(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    public dzy lr(int i) {
        this.aw = i;
        return this;
    }

    public static void lr(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = uq().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.ik.ri());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.ik.fi());
        jSONObject.put(C3724ra.b, com.bytedance.sdk.openadsdk.common.ik.lr());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.ik.ik());
        jSONObject.put(X3.j.W, com.bytedance.sdk.openadsdk.common.ik.ka());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.ik.di());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.ik.ri(nr.ri()));
        if (DeviceUtils.lr(nr.ri())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", X3.d);
        }
        jSONObject.put("device_type", Build.VERSION.RELEASE);
    }

    public void co(final JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ka.ik.ri(new com.bytedance.sdk.component.mj.lr.ik("sendLogV3") { // from class: com.bytedance.sdk.openadsdk.core.dzy.2
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extJson");
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has("category") && jSONObjectOptJSONObject.has("tag") && jSONObjectOptJSONObject.has("label")) {
                    String strOptString = jSONObjectOptJSONObject.optString("category");
                    String strOptString2 = jSONObjectOptJSONObject.optString("tag");
                    String strOptString3 = jSONObjectOptJSONObject.optString("label");
                    long jOptLong = jSONObject.optLong("value");
                    long jOptLong2 = jSONObject.optLong("extValue");
                    try {
                        jSONObjectOptJSONObject.put("ua_policy", dzy.this.vr);
                    } catch (Exception unused) {
                    }
                    new com.bytedance.sdk.openadsdk.ka.ri.C0266ri(System.currentTimeMillis(), dzy.this.bu).ka(strOptString).lr(strOptString2).ik(strOptString3).ri(dzy.this.bu == null ? "" : dzy.this.bu.tyc()).ri(dzy.this.bu == null ? null : dzy.this.bu.am()).fi(String.valueOf(jOptLong)).di(String.valueOf(jOptLong2)).ri(jSONObjectOptJSONObject).ri((com.bytedance.sdk.openadsdk.ka.lr.ri) null);
                }
            }
        });
    }

    public dzy ri(com.bytedance.sdk.openadsdk.core.widget.ri.ri riVar) {
        this.srn = riVar;
        return this;
    }

    public void nr() {
        igq igqVar = this.fe;
        if (igqVar != null) {
            igqVar.r_();
        }
    }

    public dzy ri(com.bytedance.sdk.openadsdk.core.widget.fi fiVar) {
        this.xha = fiVar;
        return this;
    }

    public com.bytedance.sdk.openadsdk.aw.lr ri() {
        return this.pv;
    }

    private void ihz(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.tan.ri(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    private void ik(String str, JSONObject jSONObject) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", NotificationCompat.CATEGORY_EVENT);
            jSONObject2.put("__event_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            wjv(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.aw.lr lrVar) {
        this.pv = lrVar;
    }

    public dzy ri(com.bytedance.sdk.component.jbs.di diVar) {
        WebView webView;
        if (diVar != null && (webView = diVar.getWebView()) != null) {
            try {
                this.dzy = com.bytedance.sdk.component.ri.vr.ri(webView).ri(new com.bytedance.sdk.openadsdk.co.ri()).ri("ToutiaoJSBridge").ri(new com.bytedance.sdk.component.ri.qt() { // from class: com.bytedance.sdk.openadsdk.core.dzy.1
                    @Override // com.bytedance.sdk.component.ri.qt
                    public <T> T ri(String str, Type type) {
                        return null;
                    }

                    @Override // com.bytedance.sdk.component.ri.qt
                    public <T> String ri(T t) {
                        return null;
                    }
                }).ri(qt.lr().vr()).lr(true).ri();
                if (com.bytedance.sdk.openadsdk.wjv.fi.xha()) {
                    com.bytedance.sdk.openadsdk.co.ri.mj.ri(this.dzy, this);
                    com.bytedance.sdk.openadsdk.co.ri.qt.ri(this.dzy, this);
                    com.bytedance.sdk.openadsdk.co.ri.ac.ri(this.dzy, diVar, this, this.bu);
                } else {
                    com.bytedance.sdk.openadsdk.co.ri.xha.ri(this.dzy, this);
                    com.bytedance.sdk.openadsdk.co.ri.jbs.ri(this.dzy, this);
                    com.bytedance.sdk.openadsdk.co.ri.tan.ri(this.dzy, diVar, this, this.bu);
                }
                com.bytedance.sdk.openadsdk.co.ri.ri.ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.co.ri.lr.ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.co.ri.ik.ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.co.ri.di.ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.co.ri.sf.ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.co.ri.vr.ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.co.ri.aw.ri(this.dzy, diVar);
                com.bytedance.sdk.openadsdk.co.ri.fi.ri(this.dzy, this.ihz);
                com.bytedance.sdk.openadsdk.co.ri.ka.ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.co.ri.bgr.ri(this.dzy, this, this.bu);
                com.bytedance.sdk.openadsdk.co.ri.slm.ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.co.ri.bu.ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.co.ri.co.ri(this.dzy, this);
                com.bytedance.sdk.openadsdk.co.ri.nr.ri(this.dzy, this.bu);
            } catch (Exception unused) {
            }
        }
        return this;
    }

    public JSONObject jbs(JSONObject jSONObject) {
        List<com.bytedance.sdk.openadsdk.core.model.wjv> listRzk;
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar = this.tnn;
            if (lrVar != null && (listRzk = lrVar.rzk()) != null) {
                for (int i = 0; i < listRzk.size(); i++) {
                    jSONArray.put(ik(listRzk.get(i)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void ik(int i) {
        com.bytedance.sdk.openadsdk.core.jbs.vr vrVar = this.ac;
        if (vrVar != null) {
            vrVar.lr(i);
        }
    }

    public void ka(boolean z) {
        this.feb = z;
    }

    public void ik(boolean z) {
        this.kt = z;
    }

    public JSONObject xha(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        com.bytedance.sdk.openadsdk.core.jbs.vr vrVar = this.ac;
        if (vrVar != null) {
            try {
                jSONObject2.put("state", vrVar.lr(jSONObject) ? 1 : 0);
            } catch (Throwable unused) {
            }
        }
        return jSONObject2;
    }

    private JSONObject ik(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put(BidResponsedEx.KEY_CID, wjvVar.fe());
        jSONObject2.put("req_id", wjvVar.jf());
        jSONObject2.put("ad_id", wjvVar.tn());
        jSONObject2.put("log_extra", wjvVar.yjg());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.sf.lr().hpn());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", wjvVar.ta());
        jSONObject.put("dynamic_creative", wjvVar.de());
        jSONObject.put("title", wjvVar.xh());
        com.bytedance.sdk.openadsdk.core.model.wjv.ri(wjvVar, jSONObject);
        com.bytedance.sdk.openadsdk.core.model.wjv.lr(wjvVar, jSONObject);
        jSONObject.put("source", wjvVar.tpb());
        jSONObject.put("button_text", wjvVar.jg());
        com.bytedance.sdk.openadsdk.core.model.aw awVarLau = wjvVar.lau();
        if (awVarLau != null) {
            jSONObject.put("deeplink_url", awVarLau.ri());
        }
        jSONObject.put("app_name", wjvVar.jm());
        jSONObject.put("has_show", wjvVar.feb() ? 1 : 0);
        jSONObject.put("has_click", wjvVar.nhl() ? 1 : 0);
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lr(com.bytedance.sdk.openadsdk.core.jbs.vr vrVar, JSONObject jSONObject) {
        if (vrVar == null || jSONObject == null) {
            return;
        }
        try {
            vrVar.ri(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false), !jSONObject.has(CampaignEx.JSON_NATIVE_VIDEO_MUTE) ? "jsb_def" : "jsb_web");
        } catch (Exception unused) {
        }
    }

    public static JSONObject lr(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        int iUr;
        boolean zBu;
        JSONObject jSONObject = new JSONObject();
        if (nr.ka() != null) {
            if (wjvVar != null) {
                try {
                    iUr = wjvVar.ur();
                } catch (Exception unused) {
                }
            } else {
                iUr = 0;
            }
            int iLji = wjvVar != null ? wjvVar.lji() : 0;
            int iPlm = wjvVar != null ? wjvVar.plm() : 0;
            int iMhp = wjvVar != null ? wjvVar.mhp() : 0;
            boolean zDi = nr.ka().di(String.valueOf(iUr));
            boolean z = nr.ka().aw(String.valueOf(iUr)) == 1;
            if (iLji != 7 && iLji != 8) {
                zBu = nr.ka().ik(String.valueOf(iUr));
            } else {
                zBu = nr.ka().bu(String.valueOf(iUr));
            }
            jSONObject.put("voice_control", zBu);
            jSONObject.put("rv_skip_time", iPlm);
            jSONObject.put("fv_skip_show", zDi);
            jSONObject.put("iv_skip_time", iMhp);
            jSONObject.put("show_dislike", wjvVar != null && wjvVar.nlk());
            jSONObject.put("video_adaptation", wjvVar != null ? wjvVar.hws() : 0);
            jSONObject.put("splash_image_count_down_time", nr.ka().wjv(String.valueOf(iUr)));
            if (wjvVar != null && wjvVar.hqg() != null) {
                jSONObject.put("dynamic_configs", wjvVar.hqg());
            }
            if (com.bytedance.sdk.openadsdk.core.model.ac.ik(wjvVar)) {
                jSONObject.put("skip_change_to_close", true);
            } else {
                jSONObject.put("skip_change_to_close", z);
            }
            jSONObject.put("bar_render_platform", wjvVar.zyn() ? 1 : 0);
        }
        return jSONObject;
    }

    public void tan() {
        com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar = this.tnn;
        if (lrVar != null) {
            lrVar.ory();
        }
    }

    public dzy ri(com.bytedance.sdk.openadsdk.ka.ka.fi fiVar) {
        this.xd = fiVar;
        return this;
    }

    public dzy ri(boolean z) {
        this.oh = z;
        return this;
    }

    public dzy ri(View view) {
        this.sf = new WeakReference<>(view);
        return this;
    }

    public dzy ri(int i) {
        this.vr = i;
        return this;
    }

    public dzy ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) {
        this.bu = wjvVar;
        if (wjvVar != null) {
            this.nr = wjvVar.ugd();
        }
        return this;
    }

    public dzy ri(com.bytedance.sdk.openadsdk.aw.ik ikVar) {
        this.igq = ikVar;
        return this;
    }

    public dzy ri(com.bytedance.sdk.openadsdk.aw.qt qtVar) {
        this.zf = qtVar;
        return this;
    }

    public dzy ri(Map<String, Object> map) {
        this.ri = map;
        return this;
    }

    public dzy ri(com.bytedance.sdk.component.adexpress.lr.sf sfVar) {
        this.tan = sfVar;
        return this;
    }

    public void lr(boolean z) {
        this.lr = z;
    }

    public dzy ri(com.bytedance.sdk.openadsdk.core.jbs.vr vrVar) {
        this.ac = vrVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lr(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            wjv(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public dzy ri(JSONObject jSONObject) {
        this.ihz = jSONObject;
        return this;
    }

    public dzy ri(com.bytedance.sdk.openadsdk.aw.ri riVar) {
        this.wjv = riVar;
        return this;
    }

    public dzy ri(com.bytedance.sdk.openadsdk.aw.fi fiVar) {
        this.ay = fiVar;
        return this;
    }

    public dzy ri(com.bytedance.sdk.openadsdk.aw.xha xhaVar) {
        this.jc = xhaVar;
        return this;
    }

    public static void ri(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar) throws Exception {
        String strTn = wjvVar.tn();
        if (!TextUtils.isEmpty(strTn)) {
            jSONObject.put(BidResponsedEx.KEY_CID, strTn);
        }
        String strYjg = wjvVar.yjg();
        if (!TextUtils.isEmpty(strYjg)) {
            jSONObject.put("log_extra", strYjg);
        }
        String strUo = wjvVar.uo();
        if (!TextUtils.isEmpty(strUo)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, strUo);
        }
        jSONObject.put("dc", TextUtils.isEmpty(nr.ka().fe()) ? nr.ka().fe() : "TX");
        jSONObject.put("language", aw.lr());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.sf.lr().hpn());
    }

    public void lr(final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    jbs(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.ka.ik.ri(new com.bytedance.sdk.component.mj.lr.ik("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.dzy.10
                @Override // java.lang.Runnable
                public void run() {
                    long j;
                    String strRi;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    dzy.this.ig = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (dzy.this.mj(queryParameter3)) {
                        long j2 = 0;
                        try {
                            j = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        try {
                            j2 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j3 = j2;
                        JSONObject jSONObject = null;
                        try {
                            String queryParameter4 = uri.getQueryParameter("extra");
                            if (!TextUtils.isEmpty(queryParameter4)) {
                                JSONObject jSONObject2 = new JSONObject(queryParameter4);
                                try {
                                    jSONObject2.putOpt("ua_policy", Integer.valueOf(dzy.this.vr));
                                } catch (Throwable unused3) {
                                }
                                jSONObject = jSONObject2;
                            }
                        } catch (Throwable unused4) {
                        }
                        if ("click".equals(queryParameter3)) {
                            jSONObject = dzy.this.ay(jSONObject);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                jSONObject = new JSONObject();
                                for (String str : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str)) {
                                            jSONObject.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject.put(str, uri.getQueryParameter(str));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                strRi = dzy.this.di;
                            } catch (Exception unused6) {
                                return;
                            }
                        } else {
                            strRi = dzy.this.ri(queryParameter2, queryParameter3);
                        }
                        com.bytedance.sdk.openadsdk.ka.ik.ri(dzy.this.bu, queryParameter, strRi, queryParameter3, j, j3, jSONObject, com.bytedance.sdk.openadsdk.core.model.ac.xha(dzy.this.bu));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:220:0x0394 A[PHI: r3
  0x0394: PHI (r3v15 org.json.JSONObject) = (r3v10 org.json.JSONObject), (r3v16 org.json.JSONObject) binds: [B:237:0x03d9, B:219:0x0392] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public JSONObject ri(lr lrVar, int i) throws Exception {
        byte b;
        JSONObject jSONObjectIhz;
        Context context;
        JSONObject jSONObject;
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
        if (!NotificationCompat.CATEGORY_CALL.equals(lrVar.ri)) {
            return null;
        }
        qt.lr().vr();
        JSONObject jSONObject2 = new JSONObject();
        String str = lrVar.ik;
        str.getClass();
        switch (str.hashCode()) {
            case -2036781162:
                b = !str.equals("subscribe_app_ad") ? (byte) -1 : (byte) 0;
                break;
            case -1423303823:
                b = !str.equals("adInfo") ? (byte) -1 : (byte) 1;
                break;
            case -1330994877:
                b = !str.equals("pauseWebView") ? (byte) -1 : (byte) 2;
                break;
            case -1169135450:
                b = !str.equals("changeVideoState") ? (byte) -1 : (byte) 3;
                break;
            case -1023873614:
                b = !str.equals("openAdLandPageLinks") ? (byte) -1 : (byte) 4;
                break;
            case -844321441:
                b = !str.equals("webview_time_track") ? (byte) -1 : (byte) 5;
                break;
            case -800853518:
                b = !str.equals("clickEvent") ? (byte) -1 : (byte) 6;
                break;
            case -794273169:
                b = !str.equals("appInfo") ? (byte) -1 : (byte) 7;
                break;
            case -715147645:
                b = !str.equals("getScreenSize") ? (byte) -1 : (byte) 8;
                break;
            case -511324706:
                b = !str.equals("openPrivacy") ? (byte) -1 : (byte) 9;
                break;
            case -278382602:
                b = !str.equals("send_temai_product_ids") ? (byte) -1 : (byte) 10;
                break;
            case -173752734:
                b = !str.equals("getTeMaiAds") ? (byte) -1 : (byte) 11;
                break;
            case 27837080:
                b = !str.equals("download_app_ad") ? (byte) -1 : (byte) 12;
                break;
            case 94756344:
                b = !str.equals("close") ? (byte) -1 : (byte) 13;
                break;
            case 105049135:
                b = !str.equals("unsubscribe_app_ad") ? (byte) -1 : (byte) 14;
                break;
            case 399543522:
                b = !str.equals("getCloseButtonInfo") ? (byte) -1 : (byte) 15;
                break;
            case 402955465:
                b = !str.equals(X3.i.o) ? (byte) -1 : ExecutionDataWriter.BLOCK_SESSIONINFO;
                break;
            case 425443791:
                b = !str.equals("getNativeSiteCustomData") ? (byte) -1 : ExecutionDataWriter.BLOCK_EXECUTIONDATA;
                break;
            case 442647767:
                b = !str.equals("sendReward") ? (byte) -1 : (byte) 18;
                break;
            case 571273292:
                b = !str.equals("dynamicTrack") ? (byte) -1 : (byte) 19;
                break;
            case 650209982:
                b = !str.equals("getTemplateInfo") ? (byte) -1 : (byte) 20;
                break;
            case 672928467:
                b = !str.equals("cancel_download_app_ad") ? (byte) -1 : (byte) 21;
                break;
            case 711635577:
                b = !str.equals("getCurrentVideoState") ? (byte) -1 : (byte) 22;
                break;
            case 885131792:
                b = !str.equals("getVolume") ? (byte) -1 : (byte) 23;
                break;
            case 1107374321:
                b = !str.equals("pauseWebViewTimers") ? (byte) -1 : (byte) 24;
                break;
            case 1151744482:
                b = !str.equals("muteVideo") ? (byte) -1 : (byte) 25;
                break;
            case 1237100796:
                b = !str.equals("renderDidFinish") ? (byte) -1 : (byte) 26;
                break;
            case 1532142616:
                b = !str.equals("removeLoading") ? (byte) -1 : (byte) 27;
                break;
            case 1634511418:
                b = !str.equals("endcard_load") ? (byte) -1 : (byte) 28;
                break;
            case 1713585602:
                b = !str.equals("getNetworkData") ? (byte) -1 : (byte) 29;
                break;
            case 1731806400:
                b = !str.equals("playable_style") ? (byte) -1 : (byte) 30;
                break;
            case 1979895452:
                b = !str.equals("sendLog") ? (byte) -1 : (byte) 31;
                break;
            case 2086000188:
                b = !str.equals("skipVideo") ? (byte) -1 : RemoteControlWriter.BLOCK_CMDOK;
                break;
            case 2105008900:
                b = !str.equals("landscape_click") ? (byte) -1 : (byte) 33;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                ory();
                com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ig, 0, (JSONObject) null);
                Context context2 = this.zyn;
                if (context2 != null) {
                    this.jbs.ri(context2, lrVar.ka, this.f18119co, this.aw, this.slm);
                } else {
                    com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ig, -1, (JSONObject) null);
                }
                break;
            case 1:
                aw(jSONObject2);
                break;
            case 2:
                ay();
                break;
            case 3:
                bu(lrVar.ka);
                break;
            case 4:
                JSONObject jSONObject3 = lrVar.ka;
                if (ri(jSONObject3, jSONObject2)) {
                    ik(jSONObject3);
                }
                break;
            case 5:
                vr(lrVar.ka);
                break;
            case 6:
                fi(lrVar.ka);
                break;
            case 7:
                lr(jSONObject2);
                break;
            case 8:
                com.bytedance.sdk.openadsdk.aw.ri riVar = this.wjv;
                if (riVar != null) {
                    int iLr = riVar.lr();
                    int iRi = this.wjv.ri();
                    jSONObject2.put("width", iLr);
                    jSONObject2.put("height", iRi);
                }
                break;
            case 9:
                igq();
                break;
            case 10:
                uq(lrVar.ka);
                break;
            case 11:
                jSONObjectIhz = this.fr;
                if (jSONObjectIhz != null) {
                    jSONObject2 = jSONObjectIhz;
                }
                break;
            case 12:
                this.qd = true;
                com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ig, 1, (JSONObject) null);
                com.bytedance.sdk.openadsdk.core.ik.ka kaVar = this.su;
                if (kaVar != null) {
                    kaVar.fi(this.dw);
                } else {
                    com.bytedance.sdk.openadsdk.sf.ik ikVar = this.jbs;
                    if (ikVar != null && (context = this.zyn) != null) {
                        ikVar.ri(context, lrVar.ka, this.ig);
                        com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar2 = this.tnn;
                        if (lrVar2 != null) {
                            lrVar2.gcp();
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.ka.ik.lr(this.bu, this.ig, -2, (JSONObject) null);
                    }
                }
                break;
            case 13:
                xha();
                break;
            case 14:
                com.bytedance.sdk.openadsdk.sf.ik ikVar2 = this.jbs;
                if (ikVar2 != null) {
                    ikVar2.ri(lrVar.ka);
                }
                break;
            case 15:
                jSONObjectIhz = ihz();
                if (jSONObjectIhz != null) {
                    jSONObject2 = jSONObjectIhz;
                }
                break;
            case 16:
                jSONObject2.put("viewStatus", this.oh ? 1 : 0);
                break;
            case 17:
                com.bytedance.sdk.openadsdk.core.model.wjv wjvVar2 = this.bu;
                if (wjvVar2 != null && !TextUtils.isEmpty(wjvVar2.pu())) {
                    jSONObject2.put("data", this.bu.pu());
                }
                break;
            case 18:
                this.lr = true;
                com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar3 = this.tnn;
                if (lrVar3 != null) {
                    lrVar3.dzy();
                }
                break;
            case 19:
                ihz(lrVar.ka);
                break;
            case 20:
                JSONObject jSONObject4 = this.ihz;
                if (jSONObject4 != null) {
                    jSONObject4.put("setting", zf());
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVar3 = this.bu;
                    if (wjvVar3 != null && wjvVar3.hqg() != null) {
                        this.ihz.put("dynamic_configs", this.bu.hqg());
                    }
                    com.bytedance.sdk.openadsdk.core.model.wjv wjvVar4 = this.bu;
                    if (wjvVar4 != null) {
                        this.ihz.put("extension", wjvVar4.cm());
                    }
                }
                jSONObject2 = this.ihz;
                break;
            case 22:
                nr(jSONObject2);
                break;
            case 23:
                AudioManager audioManager = (AudioManager) nr.ri().getSystemService("audio");
                jSONObject2.put("endcard_mute", (audioManager != null ? audioManager.getStreamVolume(3) : -1) <= 0);
                break;
            case 24:
                fr();
                break;
            case 25:
                lr(this.ac, lrVar.ka);
                break;
            case 26:
                tan(lrVar.ka);
                break;
            case 27:
                com.bytedance.sdk.openadsdk.aw.fi fiVar = this.ay;
                if (fiVar != null) {
                    fiVar.ri();
                }
                break;
            case 28:
                slm(lrVar.ka);
                break;
            case 29:
                ri(lrVar, jSONObject2);
                break;
            case 30:
                bgr(jSONObject2);
                break;
            case 31:
                JSONObject jSONObject5 = lrVar.ka;
                if (jSONObject5 != null && (jSONObject = jSONObject5.getJSONObject("extJson")) != null && jSONObject.has("category") && jSONObject.has("tag") && jSONObject.has("label")) {
                    String strOptString = jSONObject.optString("category");
                    String strOptString2 = jSONObject.optString("tag");
                    String strOptString3 = jSONObject.optString("label");
                    long jOptLong = jSONObject5.optLong("value");
                    long jOptLong2 = jSONObject5.optLong("extValue");
                    try {
                        jSONObject.putOpt("ua_policy", Integer.valueOf(this.vr));
                        break;
                    } catch (Exception unused) {
                    }
                    if ("click".equals(strOptString3)) {
                        jSONObject = ay(jSONObject);
                    }
                    if ("insight_log".equals(strOptString3) && (wjvVar = this.bu) != null && wjvVar.inh()) {
                        jSONObject.putOpt("page_visible", Integer.valueOf(this.bu.qhn()));
                        jSONObject.putOpt("time_to_leave", Long.valueOf(this.bu.kcf() > 0 ? SystemClock.elapsedRealtime() - this.bu.kcf() : -1L));
                        jSONObject.putOpt("time_to_click", Long.valueOf(this.bu.mn() > 0 ? SystemClock.elapsedRealtime() - this.bu.mn() : -1L));
                    }
                    String strRi = ri(strOptString2, strOptString3);
                    boolean zXha = com.bytedance.sdk.openadsdk.core.model.ac.xha(this.bu);
                    ri(jSONObject, zXha, strOptString3);
                    com.bytedance.sdk.openadsdk.ka.ik.ri(this.bu, strOptString, strRi, strOptString3, jOptLong, jOptLong2, jSONObject, zXha);
                }
                break;
            case 32:
                su();
                break;
            case 33:
                Context context3 = this.zyn;
                if (context3 instanceof com.bytedance.sdk.openadsdk.core.bgr.ka.lr) {
                    ((com.bytedance.sdk.openadsdk.core.bgr.ka.lr) context3).gcp();
                }
                break;
        }
        if (i == 1 && !TextUtils.isEmpty(lrVar.lr)) {
            lr(lrVar.lr, jSONObject2);
            if (qt.lr().vr()) {
                Objects.toString(jSONObject2);
            }
        }
        return jSONObject2;
    }

    private void ri(JSONObject jSONObject, boolean z, String str) {
        com.bytedance.sdk.openadsdk.core.widget.fi fiVar;
        if (z) {
            try {
                String strOptString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString) || new JSONObject(strOptString).optInt("agg_request_type", -1) != 1 || !"click".equals(str) || (fiVar = this.xha) == null) {
                    return;
                }
                fiVar.ri();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ri("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    private boolean ri(JSONObject jSONObject, JSONObject jSONObject2) {
        String strOptString;
        int iOptInt;
        String strOptString2;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("landingStyle");
            strOptString = jSONObject.optString("url");
            strOptString2 = jSONObject.optString("fallback_url");
        } else {
            strOptString = null;
            iOptInt = -1;
            strOptString2 = null;
        }
        if (iOptInt == 1) {
            if (!com.bytedance.sdk.component.utils.nr.ri(strOptString)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e) {
                    com.bytedance.sdk.component.utils.ac.ri("TTAD.AndroidObject", "handleUrl, EX1->: ", e);
                }
                return false;
            }
            return true;
        }
        if (iOptInt == 2) {
            try {
                if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                    jSONObject2.put("empty_url", 1);
                    return false;
                }
                if (!com.bytedance.sdk.component.utils.nr.ri(strOptString2)) {
                    jSONObject2.put("invalid_url", 1);
                    return false;
                }
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.ac.ri("TTAD.AndroidObject", "handleUrl, EX2->: ", e2);
            }
        }
        return true;
    }

    private void ri(String str, boolean z) {
        if (this.xd == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            this.xd.ri(str);
        } else {
            this.xd.lr(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fi.lr
    public void ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("time");
            String strOptString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.jbs.vr vrVar = this.ac;
            if (vrVar != null) {
                vrVar.ri(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.ac.ik("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    public void ri(final lr lrVar, final JSONObject jSONObject) {
        if (lrVar == null) {
            return;
        }
        try {
            ri(lrVar.ka, new com.bytedance.sdk.openadsdk.aw.ka() { // from class: com.bytedance.sdk.openadsdk.core.dzy.7
                @Override // com.bytedance.sdk.openadsdk.aw.ka
                public void ri(boolean z, com.bytedance.sdk.openadsdk.core.model.ri riVar) {
                    if (!z) {
                        dzy.this.lr(lrVar.lr, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", dzy.ri(riVar));
                        dzy.this.lr(lrVar.lr, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private boolean ri(String str, int i, com.bytedance.sdk.openadsdk.core.model.slm slmVar) {
        HashMap<String, sf> map;
        if (TextUtils.isEmpty(str) || (map = this.ory) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    public void ri(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.aw.ka kaVar) {
        JSONObject jSONObjectOptJSONObject;
        if (kaVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.aw.ka kaVar2 = new com.bytedance.sdk.openadsdk.aw.ka() { // from class: com.bytedance.sdk.openadsdk.core.dzy.8
                @Override // com.bytedance.sdk.openadsdk.aw.ka
                public void ri(final boolean z, final com.bytedance.sdk.openadsdk.core.model.ri riVar) {
                    com.bytedance.sdk.openadsdk.utils.dzy.ri(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.dzy.8.1
                        @Override // java.lang.Runnable
                        public void run() {
                            kaVar.ri(z, riVar);
                        }
                    });
                }
            };
            if (this.bu != null && !TextUtils.isEmpty(this.f18119co)) {
                int iLji = this.bu.lji();
                AdSlot adSlotEb = this.bu.eb();
                com.bytedance.sdk.openadsdk.core.model.igq igqVar = new com.bytedance.sdk.openadsdk.core.model.igq();
                igqVar.di = true;
                if (this.bu.sez() != null || this.bu.zv() != null) {
                    igqVar.jbs = 2;
                }
                JSONObject jSONObject2 = this.nr;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null && jSONObject.has("session_params") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("session_params")) != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObjectOptJSONObject.opt(next));
                    }
                }
                igqVar.xha = jSONObject2;
                if (jSONObject != null && jSONObject.has("common_params")) {
                    if (igqVar.mj == null) {
                        igqVar.mj = new JSONObject();
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("common_params");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                        while (itKeys2.hasNext()) {
                            String next2 = itKeys2.next();
                            igqVar.mj.put(next2, jSONObjectOptJSONObject2.opt(next2));
                        }
                    }
                }
                nr.ik().ri(adSlotEb, igqVar, iLji, new uq() { // from class: com.bytedance.sdk.openadsdk.core.dzy.9
                    @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
                    public void ri(int i, String str) {
                        kaVar2.ri(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.uq, com.bytedance.sdk.openadsdk.core.wjv.ri
                    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar) {
                        dzy.this.ri(riVar, ikVar, kaVar2);
                    }
                });
                return;
            }
            kaVar2.ri(false, null);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.ac.ri("TTAD.AndroidObject", "get ads error", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.openadsdk.core.model.ri riVar, com.bytedance.sdk.openadsdk.core.model.ik ikVar, com.bytedance.sdk.openadsdk.aw.ka kaVar) {
        if (riVar.ka() != null && !riVar.ka().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = riVar.ka().get(0);
            if (wjvVar != null) {
                this.nr = wjvVar.ugd();
            }
            kaVar.ri(true, riVar);
            return;
        }
        kaVar.ri(false, null);
        ikVar.ri(-3);
        ikVar.ik(7);
        com.bytedance.sdk.openadsdk.core.model.ik.ri(ikVar);
    }

    public static JSONArray ri(com.bytedance.sdk.openadsdk.core.model.ri riVar) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVarDi;
        if (riVar == null || !riVar.fi() || (wjvVarDi = riVar.di()) == null || TextUtils.isEmpty(wjvVarDi.tt())) {
            return null;
        }
        try {
            return new JSONObject(wjvVarDi.tt()).optJSONArray("creatives");
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean ri(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!"bytedance".equals(uri.getScheme())) {
                return false;
            }
            if (mj.containsKey(uri.getHost())) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String ri(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.ac.xha(this.bu)) {
            if (C3700q2.v.equals(str2)) {
                return com.bytedance.sdk.openadsdk.utils.ig.ri(this.aw);
            }
            return "aggregate_page";
        }
        if (com.bytedance.sdk.openadsdk.core.model.dw.fi(this.bu)) {
            return this.di;
        }
        if (this.igq != null) {
            return com.bytedance.sdk.openadsdk.utils.ig.ri(this.aw);
        }
        return this.tan == null ? com.bytedance.sdk.openadsdk.utils.ig.lr(this.aw) : str;
    }

    @Override // com.bytedance.sdk.component.utils.igq.ri
    public void ri(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof lr) {
                try {
                    ri((lr) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sf.lr
    public void ri(String str, JSONObject jSONObject) {
        ik(str, jSONObject);
    }

    private void ri(com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.ik.ri riVar = new com.bytedance.sdk.openadsdk.core.ik.ri(nr.ri(), wjvVar, str, this.aw);
        riVar.ri(com.bytedance.sdk.openadsdk.ihz.ri.ri.ka.ri(nr.ri(), str));
        if (!z) {
            riVar.ri(false);
        }
        riVar.onClick(null);
    }

    public void ri(JSONObject jSONObject, String str) {
        com.bytedance.sdk.openadsdk.core.jbs.vr vrVar = this.ac;
        if (vrVar != null) {
            vrVar.ri(str, jSONObject);
            return;
        }
        com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar = this.tnn;
        if (lrVar != null) {
            lrVar.ri(str, jSONObject);
        }
    }

    public void ri(com.bytedance.sdk.openadsdk.core.bgr.ka.lr lrVar) {
        this.tnn = lrVar;
    }

    public void ri(igq igqVar) {
        this.fe = igqVar;
    }

    public void ri(ri riVar) {
        this.ta = riVar;
    }
}
