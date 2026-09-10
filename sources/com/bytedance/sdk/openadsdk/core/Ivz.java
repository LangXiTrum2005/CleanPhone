package com.bytedance.sdk.openadsdk.core;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.JProtect;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.cw;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Ivz implements com.bytedance.sdk.component.adexpress.JXs.LD, com.bytedance.sdk.component.utils.aH.Lxb, com.bytedance.sdk.openadsdk.nBu.LD {
    private static final Map<String, Boolean> OY;
    private com.bytedance.sdk.component.Lxb.kqm BcA;
    private com.bytedance.sdk.openadsdk.sLN.ZU CSn;
    private com.bytedance.sdk.openadsdk.core.OY.STP DY;
    private com.bytedance.sdk.openadsdk.nBu.ZU HD;
    private int IeN;
    private com.bytedance.sdk.openadsdk.sLN.QAg Ivz;
    private boolean JJ;
    private WeakReference<View> JVA;
    private lk JZE;
    private com.bytedance.sdk.openadsdk.sLN.LD KPU;
    boolean LD;
    private Lxb Ld;
    protected Map<String, Object> Lxb;
    private com.bytedance.sdk.openadsdk.sLN.lc NDz;
    private int NXR;
    private com.bytedance.sdk.openadsdk.core.NXR.ZU.LD Of;
    private com.bytedance.sdk.openadsdk.nBu.lk QAg;
    private String STP;
    private JSONObject Sfi;
    private boolean VU;
    private WeakReference<com.bytedance.sdk.component.QAg.ZU> ZU;
    private com.bytedance.sdk.openadsdk.sLN.JXs aH;
    private JSONObject brP;
    private com.bytedance.sdk.openadsdk.core.widget.Lxb.Lxb dR;
    private com.bytedance.sdk.openadsdk.sLN.Lxb eK;
    private com.bytedance.sdk.openadsdk.core.widget.lc ebl;
    private com.bytedance.sdk.openadsdk.core.LD.ZU foI;
    private HashMap<String, nBu> hg;
    private JSONObject id;
    private com.bytedance.sdk.openadsdk.core.model.tD kqm;
    private String lc;
    private com.bytedance.sdk.openadsdk.ZU.ZU.JXs le;
    private String nBu;
    private String rW;
    private String sLN;
    private Context sRq;
    private com.bytedance.sdk.component.adexpress.LD.JVA tD;
    private List<com.bytedance.sdk.openadsdk.core.model.tD> xan;
    private boolean VVE = true;
    private boolean nE = true;
    private boolean CG = false;
    private boolean nJ = false;
    boolean lk = false;
    private boolean Pw = false;
    private final com.bytedance.sdk.component.utils.aH JXs = new com.bytedance.sdk.component.utils.aH(Looper.getMainLooper(), this);

    public static class LD {
        public int JXs;
        public String LD;
        public String Lxb;
        public JSONObject ZU;
        public String lk;
    }

    public interface Lxb {
        void Lxb();
    }

    public static class lk implements Runnable {
        private final JSONObject LD;
        private final com.bytedance.sdk.openadsdk.core.OY.STP Lxb;

        public lk(com.bytedance.sdk.openadsdk.core.OY.STP stp, JSONObject jSONObject) {
            this.Lxb = stp;
            this.LD = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            Ivz.LD(this.Lxb, this.LD);
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        OY = concurrentHashMap;
        Boolean bool = Boolean.TRUE;
        concurrentHashMap.put("log_event", bool);
        concurrentHashMap.put("private", bool);
        concurrentHashMap.put("dispatch_message", bool);
        concurrentHashMap.put("custom_event", bool);
        concurrentHashMap.put("log_event_v3", bool);
    }

    public Ivz(Context context) {
        this.sRq = context;
    }

    private void DY() {
        if (this.sRq == null || TextUtils.isEmpty(kqm.ZU().nJ())) {
            return;
        }
        TTWebsiteActivity.Lxb(this.sRq, this.kqm, this.rW);
    }

    private boolean HD() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.kqm;
        if (tDVar == null || tDVar.AcC() == null || com.bytedance.sdk.openadsdk.core.model.eK.LD(this.kqm) || this.CG || this.kqm.AcC().optInt("parent_type") != 2) {
            return false;
        }
        int iLJ = this.kqm.lJ();
        if (iLJ != 8 && iLJ != 7) {
            return false;
        }
        this.CG = true;
        return true;
    }

    private static List<String> IeN() {
        return Arrays.asList("appInfo", "adInfo", "getTemplateInfo", "getTeMaiAds");
    }

    private void JVA(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs;
        if (jSONObject == null || (jXs = this.le) == null) {
            return;
        }
        jXs.LD(jSONObject);
    }

    private WebView NXR() {
        com.bytedance.sdk.component.QAg.ZU zu;
        WeakReference<com.bytedance.sdk.component.QAg.ZU> weakReference = this.ZU;
        if (weakReference == null || (zu = weakReference.get()) == null) {
            return null;
        }
        return zu.getWebView();
    }

    private void QAg(JSONObject jSONObject) throws Exception {
        if (this.JJ) {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.kqm;
            if ((tDVar instanceof com.bytedance.sdk.openadsdk.core.model.DY) && ((com.bytedance.sdk.openadsdk.core.model.DY) tDVar).JW()) {
                JSONArray jSONArray = new JSONArray();
                jSONObject.put("adInfos", jSONArray);
                for (com.bytedance.sdk.openadsdk.core.model.tD tDVar2 : ((com.bytedance.sdk.openadsdk.core.model.DY) this.kqm).cRD()) {
                    JSONObject jSONObject2 = new JSONObject();
                    Lxb(jSONObject2, tDVar2);
                    jSONArray.put(jSONObject2);
                }
                return;
            }
        }
        Lxb(jSONObject, this.kqm);
    }

    @JProtect
    private JSONObject STP() {
        try {
            View view = this.JVA.get();
            com.bytedance.sdk.component.QAg.ZU zu = this.ZU.get();
            if (view == null || zu == null) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AndroidObject", "setCloseButtonInfo error closeButton is null");
                return null;
            }
            int[] iArrLD = le.LD(view);
            int[] iArrLD2 = le.LD((View) zu);
            if (iArrLD != null && iArrLD2 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", le.ZU(kqm.Lxb(), iArrLD[0] - iArrLD2[0]));
                jSONObject.put("y", le.ZU(kqm.Lxb(), iArrLD[1] - iArrLD2[1]));
                jSONObject.put("w", le.ZU(kqm.Lxb(), view.getWidth()));
                jSONObject.put(bc.aM, le.ZU(kqm.Lxb(), view.getHeight()));
                jSONObject.put("isExist", true);
                return jSONObject;
            }
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AndroidObject", "setCloseButtonInfo error position or webViewPosition is null");
            return null;
        } catch (Throwable unused) {
        }
    }

    @JProtect
    private JSONObject Sfi() {
        return LD(this.kqm);
    }

    private Context VVE() {
        WeakReference<com.bytedance.sdk.component.QAg.ZU> weakReference = this.ZU;
        Activity activityLxb = (weakReference == null || weakReference.get() == null) ? null : com.bytedance.sdk.component.utils.LD.Lxb(this.ZU.get());
        return activityLxb == null ? this.sRq : activityLxb;
    }

    private void brP() {
        com.bytedance.sdk.openadsdk.sLN.QAg qAg = this.Ivz;
        if (qAg == null) {
            return;
        }
        qAg.LD();
    }

    private void eK() {
        if (this.QAg == null) {
            this.QAg = com.bytedance.sdk.openadsdk.nBu.Lxb.Lxb(this, this.kqm);
        }
    }

    private void kqm() {
        com.bytedance.sdk.openadsdk.sLN.QAg qAg = this.Ivz;
        if (qAg == null) {
            return;
        }
        qAg.Lxb();
    }

    private void nBu(JSONObject jSONObject) throws Exception {
        if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.model.eK.JVA(this.kqm))) {
            return;
        }
        jSONObject.put("playable_style", com.bytedance.sdk.openadsdk.core.model.eK.JVA(this.kqm));
    }

    private void sLN(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.sLN.LD ld = this.KPU;
        if (ld == null || jSONObject == null) {
            return;
        }
        ld.Lxb(jSONObject.optBoolean("isRenderSuc", false), jSONObject.optInt("code", -1), jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tD() {
        com.bytedance.sdk.openadsdk.core.OY.STP stp = this.DY;
        if (stp != null) {
            stp.Lxb();
        }
    }

    public boolean OY() {
        return this.Pw;
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public String adInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            QAg(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public String appInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            LD(jSONObject);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public void changeVideoState(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ivz.2
                @Override // java.lang.Runnable
                public void run() {
                    Ivz.this.NXR(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public void chooseAdResult(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("video_choose");
            long jOptLong = jSONObject.optLong("video_choose_duration");
            com.bytedance.sdk.openadsdk.sLN.lc lcVar = this.NDz;
            if (lcVar != null) {
                lcVar.Lxb(iOptInt, jOptLong);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public void clickEvent(String str) {
        try {
            final JSONObject jSONObject = new JSONObject(str);
            com.bytedance.sdk.openadsdk.utils.hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ivz.3
                @Override // java.lang.Runnable
                public void run() {
                    Ivz.this.JXs(jSONObject);
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public void dynamicTrack(String str) {
        try {
            kqm(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    public void ebl() {
        com.bytedance.sdk.openadsdk.core.OY.STP stp = this.DY;
        if (stp != null) {
            stp.LD();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public String getCurrentVideoState() {
        JSONObject jSONObject = new JSONObject();
        STP(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public String getData(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.Sfi.toString();
        }
        try {
            JSONObject jSONObjectLxb = com.bytedance.sdk.openadsdk.core.OY.Lxb.LD.Lxb(this.Sfi, new JSONObject(str));
            return jSONObjectLxb == null ? this.Sfi.toString() : jSONObjectLxb.toString();
        } catch (Exception unused) {
            return this.Sfi.toString();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public String getTemplateInfo() {
        Lxb("getTemplateInfo", true);
        try {
            JSONObject jSONObject = this.Sfi;
            if (jSONObject != null) {
                jSONObject.put("setting", Sfi());
                com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.kqm;
                if (tDVar != null) {
                    this.Sfi.put("extension", tDVar.ek());
                }
            }
            Lxb("getTemplateInfo", false);
            return this.Sfi.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public void initRenderFinish() {
        com.bytedance.sdk.openadsdk.utils.hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ivz.5
            @Override // java.lang.Runnable
            public void run() {
                if (Ivz.this.dR != null) {
                    Ivz.this.dR.Lxb();
                }
            }
        });
    }

    public void lc() {
        com.bytedance.sdk.openadsdk.sLN.LD ld;
        if (this.VU && (ld = this.KPU) != null) {
            ld.Lxb();
            return;
        }
        Context context = this.sRq;
        if ((context instanceof Activity) && com.bytedance.sdk.openadsdk.utils.DY.Lxb((Activity) context)) {
            ((Activity) this.sRq).finish();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public void muteVideo(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            lk lkVar = this.JZE;
            if (lkVar != null) {
                com.bytedance.sdk.openadsdk.utils.hg.LD(lkVar);
            }
            lk lkVar2 = new lk(this.DY, jSONObject);
            this.JZE = lkVar2;
            com.bytedance.sdk.openadsdk.utils.hg.Lxb(lkVar2);
        } catch (Exception unused) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AndroidObject", "");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public void renderDidFinish(String str) {
        try {
            IeN(new JSONObject(str));
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    @JavascriptInterface
    public void skipVideo() {
        com.bytedance.sdk.openadsdk.utils.hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ivz.4
            @Override // java.lang.Runnable
            public void run() {
                Ivz.this.tD();
            }
        });
    }

    @JProtect
    private void IeN(JSONObject jSONObject) {
        int i;
        double dOptDouble;
        double dOptDouble2;
        com.bytedance.sdk.openadsdk.sLN.lc lcVar;
        Ivz ivz = this;
        if (ivz.tD == null || jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs = ivz.le;
        if (jXs != null) {
            jXs.VVE();
        }
        com.bytedance.sdk.component.adexpress.LD.STP stp = new com.bytedance.sdk.component.adexpress.LD.STP();
        stp.Lxb(1);
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
                    double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("width");
                    double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("height");
                    if (ivz.VVE(jSONObjectOptJSONObject2)) {
                        stp.Lxb((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopLeft"));
                        stp.LD((float) jSONObjectOptJSONObject2.optDouble("borderRadiusTopRight"));
                        stp.lk((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomLeft"));
                        stp.ZU((float) jSONObjectOptJSONObject2.optDouble("borderRadiusBottomRight"));
                    }
                    stp.lk(dOptDouble3);
                    stp.ZU(dOptDouble4);
                    stp.JXs(dOptDouble5);
                    stp.lc(dOptDouble6);
                } catch (Exception unused) {
                    i = 101;
                    ivz = this;
                }
            } else {
                dOptDouble2 = dOptDouble2;
            }
            try {
                String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE, OY.Lxb(101));
                int iOptInt = jSONObject.optInt("code", 101);
                stp.Lxb(zOptBoolean);
                stp.Lxb(dOptDouble);
                stp.LD(dOptDouble2);
                stp.Lxb(strOptString);
                stp.LD(iOptInt);
                ivz = this;
                ivz.tD.Lxb(stp);
                if (jSONObjectOptJSONObject2 == null || (lcVar = ivz.NDz) == null) {
                    return;
                }
                lcVar.Lxb(stp);
                return;
            } catch (Exception unused2) {
                ivz = this;
            }
        } catch (Exception unused3) {
        }
        i = 101;
        stp.LD(i);
        stp.Lxb(OY.Lxb(i));
        ivz.tD.Lxb(stp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean OY(String str) {
        if (!TextUtils.isEmpty(str) && "click_other".equals(str)) {
            return QAg();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject Sfi(JSONObject jSONObject) {
        if (this.Lxb != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                String strOptString = jSONObject.optString("ad_extra_data", null);
                if (strOptString != null) {
                    jSONObject2 = new JSONObject(strOptString);
                }
                for (Map.Entry<String, Object> entry : this.Lxb.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.sLN.LD(e.toString());
            }
        }
        return jSONObject;
    }

    public Ivz JXs(String str) {
        this.STP = str;
        return this;
    }

    public boolean ZU() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.kqm;
        return tDVar != null && tDVar.aH();
    }

    private void brP(JSONObject jSONObject) {
        if (jSONObject == null || this.HD == null) {
            return;
        }
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("temaiProductIds");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                this.HD.Lxb(true, jSONArrayOptJSONArray);
            } else {
                this.HD.Lxb(false, null);
            }
        } catch (Exception unused) {
            this.HD.Lxb(false, null);
        }
    }

    private void ebl(String str) {
        try {
            JSONArray jSONArray = new JSONArray(new String(Base64.decode(str, 2)));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                LD ld = new LD();
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject != null) {
                        ld.Lxb = jSONObjectOptJSONObject.optString("__msg_type", null);
                        ld.LD = jSONObjectOptJSONObject.optString("__callback_id", null);
                        ld.lk = jSONObjectOptJSONObject.optString("func");
                        ld.ZU = jSONObjectOptJSONObject.optJSONObject("params");
                        ld.JXs = jSONObjectOptJSONObject.optInt("JSSDK");
                    }
                } catch (Throwable unused) {
                }
                if (!TextUtils.isEmpty(ld.Lxb) && !TextUtils.isEmpty(ld.lk)) {
                    Message messageObtainMessage = this.JXs.obtainMessage(11);
                    messageObtainMessage.obj = ld;
                    this.JXs.sendMessage(messageObtainMessage);
                }
            }
        } catch (Exception unused2) {
        }
    }

    private void kqm(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Uri uri = Uri.parse(jSONObject.optString("trackData"));
            if ("bytedance".equals(uri.getScheme().toLowerCase())) {
                com.bytedance.sdk.openadsdk.utils.kqm.Lxb(uri, this);
            }
        } catch (Exception unused) {
        }
    }

    private boolean tD(JSONObject jSONObject) {
        try {
            jSONObject.put("creatives", LD(this.xan));
        } catch (Exception unused) {
        }
        return true;
    }

    public void JVA() {
        com.bytedance.sdk.openadsdk.nBu.lk lkVar = this.QAg;
        if (lkVar != null) {
            lkVar.Lxb();
        }
        lk lkVar2 = this.JZE;
        if (lkVar2 != null) {
            com.bytedance.sdk.openadsdk.utils.hg.LD(lkVar2);
            this.JZE = null;
        }
        this.sRq = null;
        this.Of = null;
    }

    public boolean JXs() {
        return this.lk;
    }

    public Ivz ZU(String str) {
        this.sLN = str;
        return this;
    }

    public Ivz lk(String str) {
        this.nBu = str;
        return this;
    }

    public void nBu() {
        HD();
    }

    public void sLN() {
        Lxb lxb = this.Ld;
        if (lxb != null) {
            lxb.Lxb();
        }
    }

    private void DY(JSONObject jSONObject) {
        WebView webViewNXR;
        if (jSONObject == null || (webViewNXR = NXR()) == null) {
            return;
        }
        com.bytedance.sdk.component.utils.JVA.Lxb(webViewNXR, "javascript:ToutiaoJSBridge._handleMessageFromToutiao(" + jSONObject + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void NXR(JSONObject jSONObject) {
        if (this.DY == null || jSONObject == null) {
            return;
        }
        try {
            this.DY.Lxb(jSONObject.optInt("stateType", -1));
        } catch (Exception unused) {
        }
    }

    private boolean VVE(@NonNull JSONObject jSONObject) {
        return jSONObject.has("borderRadiusTopLeft") && jSONObject.has("borderRadiusBottomLeft") && jSONObject.has("borderRadiusTopRight") && jSONObject.has("borderRadiusBottomRight");
    }

    public void JXs(JSONObject jSONObject) {
        double d;
        double d2;
        double dOptDouble;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        JSONObject jSONObjectOptJSONObject;
        if (jSONObject == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.Sfi.Lxb("TTAD.AndroidObject", "trigger Class1 method1");
        try {
            String strOptString = jSONObject.optString("adId");
            int iOptInt = jSONObject.optInt("areaType", 1);
            String strOptString2 = jSONObject.optString("clickAreaType");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("clickInfo");
            double d9 = 0.0d;
            if (jSONObjectOptJSONObject2 != null) {
                double dOptDouble2 = jSONObjectOptJSONObject2.optDouble("down_x", 0.0d);
                dOptDouble = jSONObjectOptJSONObject2.optDouble("down_y", 0.0d);
                double dOptDouble3 = jSONObjectOptJSONObject2.optDouble("up_x", 0.0d);
                double dOptDouble4 = jSONObjectOptJSONObject2.optDouble("up_y", 0.0d);
                double dOptDouble5 = jSONObjectOptJSONObject2.optDouble("down_time", 0.0d);
                double dOptDouble6 = jSONObjectOptJSONObject2.optDouble("up_time", 0.0d);
                double dOptDouble7 = jSONObjectOptJSONObject2.optDouble("button_x", 0.0d);
                double dOptDouble8 = jSONObjectOptJSONObject2.optDouble("button_y", 0.0d);
                double dOptDouble9 = jSONObjectOptJSONObject2.optDouble("button_width", 0.0d);
                double dOptDouble10 = jSONObjectOptJSONObject2.optDouble("button_height", 0.0d);
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("rectInfo");
                d8 = dOptDouble10;
                d9 = dOptDouble2;
                d2 = dOptDouble3;
                d3 = dOptDouble5;
                d4 = dOptDouble6;
                d5 = dOptDouble7;
                d6 = dOptDouble8;
                d7 = dOptDouble9;
                d = dOptDouble4;
            } else {
                d = 0.0d;
                d2 = 0.0d;
                dOptDouble = 0.0d;
                d3 = 0.0d;
                d4 = 0.0d;
                d5 = 0.0d;
                d6 = 0.0d;
                d7 = 0.0d;
                d8 = 0.0d;
                jSONObjectOptJSONObject = null;
            }
            com.bytedance.sdk.openadsdk.core.model.STP stpLxb = new com.bytedance.sdk.openadsdk.core.model.STP.Lxb().ZU((float) d9).lk((float) dOptDouble).LD((float) d2).Lxb((float) d).LD((long) d3).Lxb((long) d4).lk((int) d5).ZU((int) d6).JXs((int) d7).lc((int) d8).Lxb(strOptString2).Lxb((SparseArray<com.bytedance.sdk.openadsdk.core.LD.lk.Lxb>) null).Lxb(true).LD(iOptInt).Lxb(jSONObjectOptJSONObject).Lxb(jSONObject.optInt("clickAreaCategory", -1)).LD(jSONObjectOptJSONObject2).Lxb();
            com.bytedance.sdk.component.adexpress.LD.JVA jva = this.tD;
            if (jva != null) {
                jva.Lxb(null, iOptInt, stpLxb);
            }
            Lxb(strOptString, iOptInt, stpLxb);
        } catch (Exception unused) {
            com.bytedance.sdk.component.adexpress.LD.JVA jva2 = this.tD;
            if (jva2 != null) {
                jva2.Lxb(null, -1, null);
            }
        }
    }

    public Ivz LD(String str) {
        this.lc = str;
        return this;
    }

    public void ZU(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("zoom_type", 1);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("videoInfo");
        com.bytedance.sdk.component.adexpress.LD.STP stp = new com.bytedance.sdk.component.adexpress.LD.STP();
        if (jSONObjectOptJSONObject != null) {
            double dOptDouble = jSONObjectOptJSONObject.optDouble("x");
            double dOptDouble2 = jSONObjectOptJSONObject.optDouble("y");
            double dOptDouble3 = jSONObjectOptJSONObject.optDouble("width");
            double dOptDouble4 = jSONObjectOptJSONObject.optDouble("height");
            stp.lk(dOptDouble);
            stp.ZU(dOptDouble2);
            stp.JXs(dOptDouble3);
            stp.lc(dOptDouble4);
        }
        com.bytedance.sdk.openadsdk.core.OY.STP stp2 = this.DY;
        if (stp2 != null) {
            stp2.Lxb(iOptInt, stp);
        }
    }

    public com.bytedance.sdk.openadsdk.core.model.tD lk() {
        return this.kqm;
    }

    public Ivz LD(com.bytedance.sdk.component.QAg.ZU zu) {
        this.ZU = new WeakReference<>(zu);
        return this;
    }

    public void OY(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.Lxb lxbFoF;
        if (jSONObject == null) {
            return;
        }
        int iOptInt = jSONObject.optInt("index");
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.kqm;
        if (!(tDVar instanceof com.bytedance.sdk.openadsdk.core.model.DY) || (lxbFoF = ((com.bytedance.sdk.openadsdk.core.model.DY) tDVar).foF()) == null) {
            return;
        }
        List<com.bytedance.sdk.openadsdk.core.model.tD> listZU = lxbFoF.ZU();
        if (iOptInt < 0 || iOptInt >= listZU.size()) {
            return;
        }
        Lxb(listZU.get(iOptInt), this.rW, false);
        com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld = this.Of;
        if (ld != null) {
            ld.ZU();
        }
    }

    public void lc(String str) {
        this.rW = str;
    }

    public void lk(JSONObject jSONObject) {
        brP.Lxb(VVE(), this.sRq instanceof Activity, jSONObject, this.kqm, this.rW, this.NXR, NXR(), this.ebl);
    }

    public Ivz LD(boolean z) {
        this.nJ = z;
        return this;
    }

    public void lc(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVarLxb = com.bytedance.sdk.openadsdk.core.LD.Lxb(jSONObject);
        if (tDVarLxb != null) {
            boolean zJXs = com.bytedance.sdk.openadsdk.core.model.kqm.JXs(this.kqm);
            Lxb(tDVarLxb, zJXs ? nJ.LD(this.NXR) : this.rW, !zJXs);
        }
    }

    public void LD() {
        com.bytedance.sdk.component.Lxb.kqm kqmVar = this.BcA;
        if (kqmVar == null) {
            return;
        }
        kqmVar.Lxb();
        this.BcA = null;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.core.widget.Lxb.Lxb lxb) {
        this.dR = lxb;
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.core.widget.lc lcVar) {
        this.ebl = lcVar;
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.component.QAg.ZU zu) {
        WebView webView = zu.getWebView();
        if (webView == null) {
            return this;
        }
        try {
            com.bytedance.sdk.component.Lxb.kqm kqmVarLD = com.bytedance.sdk.component.Lxb.kqm.Lxb(webView).Lxb(new com.bytedance.sdk.openadsdk.JVA.Lxb()).Lxb("ToutiaoJSBridge").Lxb(new com.bytedance.sdk.component.Lxb.sLN() { // from class: com.bytedance.sdk.openadsdk.core.Ivz.1
                @Override // com.bytedance.sdk.component.Lxb.sLN
                @NonNull
                public <T> T Lxb(@NonNull String str, @NonNull Type type) {
                    return null;
                }

                @Override // com.bytedance.sdk.component.Lxb.sLN
                @NonNull
                public <T> String Lxb(@NonNull T t) {
                    return null;
                }
            }).Lxb(QAg.LD().kqm()).LD(true).Lxb().LD();
            this.BcA = kqmVarLD;
            com.bytedance.sdk.openadsdk.JVA.Lxb.ebl.Lxb(kqmVarLD, this);
            com.bytedance.sdk.openadsdk.JVA.Lxb.Lxb.Lxb(this.BcA, this);
            com.bytedance.sdk.openadsdk.JVA.Lxb.LD.Lxb(this.BcA, this);
            com.bytedance.sdk.openadsdk.JVA.Lxb.lk.Lxb(this.BcA, this);
            com.bytedance.sdk.openadsdk.JVA.Lxb.lc.Lxb(this.BcA, this);
            com.bytedance.sdk.openadsdk.JVA.Lxb.QAg.Lxb(this.BcA, this);
            com.bytedance.sdk.openadsdk.JVA.Lxb.JVA.Lxb(this.BcA, this);
            com.bytedance.sdk.openadsdk.JVA.Lxb.nBu.Lxb(this.BcA, zu);
            com.bytedance.sdk.openadsdk.JVA.Lxb.OY.Lxb(this.BcA, this);
            com.bytedance.sdk.openadsdk.JVA.Lxb.JXs.Lxb(this.BcA, this.Sfi);
            com.bytedance.sdk.openadsdk.JVA.Lxb.ZU.Lxb(this.BcA, this);
        } catch (Exception unused) {
        }
        return this;
    }

    public boolean QAg() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.kqm;
        return tDVar != null && tDVar.NDz() == 1;
    }

    public Ivz LD(int i) {
        this.NXR = i;
        return this;
    }

    public void lk(boolean z) {
        this.lk = z;
    }

    @JProtect
    public static void LD(JSONObject jSONObject) throws Exception {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = IeN().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        jSONObject.put("appName", com.bytedance.sdk.openadsdk.common.LD.Lxb());
        jSONObject.put("innerAppName", com.bytedance.sdk.openadsdk.common.LD.JXs());
        jSONObject.put("aid", com.bytedance.sdk.openadsdk.common.LD.LD());
        jSONObject.put("sdkEdition", com.bytedance.sdk.openadsdk.common.LD.lk());
        jSONObject.put("appVersion", com.bytedance.sdk.openadsdk.common.LD.ZU());
        jSONObject.put("netType", com.bytedance.sdk.openadsdk.common.LD.lc());
        jSONObject.put("supportList", jSONArray);
        jSONObject.put("deviceId", com.bytedance.sdk.openadsdk.common.LD.Lxb(kqm.Lxb()));
        if (DeviceUtils.LD(kqm.Lxb())) {
            jSONObject.put("device_platform", "Android_Pad");
        } else {
            jSONObject.put("device_platform", AnalyticsConstants.SDK_TYPE);
        }
        jSONObject.put(bc.ai, Build.VERSION.RELEASE);
    }

    private void QAg(String str) {
        int iIndexOf;
        if (str != null && str.startsWith("bytedance://")) {
            try {
                if (str.equals("bytedance://dispatch_message/")) {
                    WebView webViewNXR = NXR();
                    if (webViewNXR != null) {
                        com.bytedance.sdk.component.utils.JVA.Lxb(webViewNXR, "javascript:ToutiaoJSBridge._fetchQueue()");
                        return;
                    }
                    return;
                }
                if (!str.startsWith("bytedance://private/setresult/") || (iIndexOf = str.indexOf(38, 30)) <= 0) {
                    return;
                }
                String strSubstring = str.substring(30, iIndexOf);
                String strSubstring2 = str.substring(iIndexOf + 1);
                if (!strSubstring.equals("SCENE_FETCHQUEUE") || strSubstring2.length() <= 0) {
                    return;
                }
                ebl(strSubstring2);
            } catch (Exception unused) {
            }
        }
    }

    private void lk(String str, JSONObject jSONObject) {
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
            DY(jSONObject2);
        } catch (Exception unused) {
        }
    }

    private boolean STP(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.core.OY.STP stp = this.DY;
        if (stp != null && jSONObject != null) {
            double dLk = stp.lk();
            int iZU = this.DY.ZU();
            try {
                jSONObject.put("currentTime", dLk / 1000.0d);
                jSONObject.put("state", iZU);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void ZU(boolean z) {
        this.JJ = z;
    }

    public JSONObject ebl(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.kqm;
            if (tDVar instanceof com.bytedance.sdk.openadsdk.core.model.DY) {
                List<com.bytedance.sdk.openadsdk.core.model.tD> listZU = ((com.bytedance.sdk.openadsdk.core.model.DY) tDVar).foF().ZU();
                for (int i = 0; i < listZU.size(); i++) {
                    jSONArray.put(lk(listZU.get(i)));
                }
            }
            jSONObject2.put("creatives", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void lk(int i) {
        com.bytedance.sdk.openadsdk.core.OY.STP stp = this.DY;
        if (stp != null) {
            stp.LD(i);
        }
    }

    private JSONObject lk(com.bytedance.sdk.openadsdk.core.model.tD tDVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("is_ad_event", "1");
        jSONObject2.put(BidResponsedEx.KEY_CID, tDVar.rO());
        jSONObject2.put("req_id", tDVar.xNP());
        jSONObject2.put("ad_id", tDVar.bG());
        jSONObject2.put("log_extra", tDVar.Lv());
        jSONObject2.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.VVE.TA().FD());
        jSONObject.put("ad_info", jSONObject2);
        jSONObject.put("endcard_creative", tDVar.iQi());
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void LD(com.bytedance.sdk.openadsdk.core.OY.STP stp, JSONObject jSONObject) {
        if (stp == null || jSONObject == null) {
            return;
        }
        try {
            stp.Lxb(jSONObject.optBoolean(CampaignEx.JSON_NATIVE_VIDEO_MUTE, false));
        } catch (Exception unused) {
        }
    }

    public static JSONObject LD(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        int iTd;
        boolean zKqm;
        JSONObject jSONObject = new JSONObject();
        if (kqm.ZU() == null) {
            return jSONObject;
        }
        int i = 0;
        if (tDVar != null) {
            try {
                iTd = tDVar.Td();
            } catch (Exception unused) {
            }
        } else {
            iTd = 0;
        }
        int iLJ = tDVar != null ? tDVar.lJ() : 0;
        int iNBu = kqm.ZU().nBu(String.valueOf(iTd));
        int iTD = kqm.ZU().tD(String.valueOf(iTd));
        boolean zLc = kqm.ZU().lc(String.valueOf(iTd));
        boolean z = kqm.ZU().NXR(String.valueOf(iTd)) == 1;
        if (iLJ != 7 && iLJ != 8) {
            zKqm = kqm.ZU().lk(String.valueOf(iTd));
        } else {
            zKqm = kqm.ZU().kqm(String.valueOf(iTd));
        }
        jSONObject.put("voice_control", zKqm);
        jSONObject.put("rv_skip_time", iNBu);
        jSONObject.put("fv_skip_show", zLc);
        jSONObject.put("iv_skip_time", iTD);
        jSONObject.put("show_dislike", tDVar != null && tDVar.FV());
        jSONObject.put("video_adaptation", tDVar != null ? tDVar.Ivz() : 0);
        if (com.bytedance.sdk.openadsdk.core.model.kqm.lk(tDVar)) {
            jSONObject.put("skip_change_to_close", true);
        } else {
            jSONObject.put("skip_change_to_close", z);
        }
        if (tDVar.LYC() && com.bytedance.sdk.openadsdk.core.settings.VVE.TA().bm()) {
            i = 1;
        }
        jSONObject.put("bar_render_platform", i);
        return jSONObject;
    }

    public com.bytedance.sdk.component.Lxb.kqm Lxb() {
        return this.BcA;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.ZU.ZU.JXs jXs) {
        this.le = jXs;
        return this;
    }

    public Ivz Lxb(boolean z) {
        this.LD = z;
        return this;
    }

    public Ivz Lxb(View view) {
        this.JVA = new WeakReference<>(view);
        return this;
    }

    public Ivz Lxb(int i) {
        this.IeN = i;
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        this.kqm = tDVar;
        if (tDVar != null) {
            this.brP = tDVar.AcC();
        }
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.sLN.LD ld) {
        this.KPU = ld;
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.sLN.QAg qAg) {
        this.Ivz = qAg;
        return this;
    }

    public Ivz Lxb(Map<String, Object> map) {
        this.Lxb = map;
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.component.adexpress.LD.JVA jva) {
        this.tD = jva;
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.core.OY.STP stp) {
        this.DY = stp;
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.core.LD.ZU zu) {
        this.foI = zu;
        return this;
    }

    public Ivz Lxb(JSONObject jSONObject) {
        this.Sfi = jSONObject;
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.sLN.Lxb lxb) {
        this.eK = lxb;
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.sLN.JXs jXs) {
        this.aH = jXs;
        return this;
    }

    public void JXs(boolean z) {
        this.VU = z;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.sLN.ZU zu) {
        this.CSn = zu;
        return this;
    }

    public Ivz Lxb(List<com.bytedance.sdk.openadsdk.core.model.tD> list) {
        this.xan = list;
        return this;
    }

    public Ivz Lxb(com.bytedance.sdk.openadsdk.sLN.lc lcVar) {
        this.NDz = lcVar;
        return this;
    }

    public static void Lxb(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tD tDVar) throws Exception {
        String strBG = tDVar.bG();
        if (!TextUtils.isEmpty(strBG)) {
            jSONObject.put(BidResponsedEx.KEY_CID, strBG);
        }
        String strLv = tDVar.Lv();
        if (!TextUtils.isEmpty(strLv)) {
            jSONObject.put("log_extra", strLv);
        }
        String strCf = tDVar.cf();
        if (!TextUtils.isEmpty(strCf)) {
            jSONObject.put(DownloadModel.DOWNLOAD_URL, strCf);
        }
        jSONObject.put("dc", TextUtils.isEmpty(kqm.ZU().rW()) ? kqm.ZU().rW() : "SG");
        jSONObject.put(bc.N, sLN.LD());
        jSONObject.put("isRTL", com.bytedance.sdk.openadsdk.core.settings.VVE.TA().FD());
    }

    public static JSONArray LD(List<com.bytedance.sdk.openadsdk.core.model.tD> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null) {
            return jSONArray;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(list.get(i).JD());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__msg_type", "callback");
            jSONObject2.put("__callback_id", str);
            if (jSONObject != null) {
                jSONObject2.put("__params", jSONObject);
            }
            DY(jSONObject2);
        } catch (Exception unused) {
        }
    }

    public void LD(@NonNull final Uri uri) {
        try {
            String host = uri.getHost();
            if (!"log_event".equals(host) && !"custom_event".equals(host) && !"log_event_v3".equals(host)) {
                if ("private".equals(host) || "dispatch_message".equals(host)) {
                    QAg(uri.toString());
                    return;
                }
                return;
            }
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(new com.bytedance.sdk.component.OY.OY("log_event_handleUri") { // from class: com.bytedance.sdk.openadsdk.core.Ivz.9
                @Override // java.lang.Runnable
                public void run() {
                    long j;
                    String strLxb;
                    String queryParameter = uri.getQueryParameter("category");
                    String queryParameter2 = uri.getQueryParameter("tag");
                    Ivz.this.rW = queryParameter2;
                    String queryParameter3 = uri.getQueryParameter("label");
                    if (Ivz.this.OY(queryParameter3)) {
                        long j2 = 0;
                        try {
                            j = Long.parseLong(uri.getQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        } catch (Exception unused) {
                            j = 0;
                        }
                        try {
                            j2 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                        }
                        long j3 = j2;
                        String queryParameter4 = uri.getQueryParameter("extra");
                        JSONObject jSONObjectSfi = null;
                        if (!TextUtils.isEmpty(queryParameter4)) {
                            try {
                                JSONObject jSONObject = new JSONObject(queryParameter4);
                                try {
                                    jSONObject.putOpt("ua_policy", Integer.valueOf(Ivz.this.IeN));
                                } catch (Exception unused3) {
                                }
                                jSONObjectSfi = jSONObject;
                            } catch (Exception unused4) {
                            }
                        }
                        if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(queryParameter3)) {
                            jSONObjectSfi = Ivz.this.Sfi(jSONObjectSfi);
                        }
                        if ("landing_perf_error".equals(queryParameter3) || "landing_perf_stats".equals(queryParameter3)) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                for (String str : uri.getQueryParameterNames()) {
                                    try {
                                        if ("extra".equals(str)) {
                                            jSONObject2.put("ad_extra_data", new JSONObject(uri.getQueryParameter(str)).optString("ad_extra_data"));
                                        } else {
                                            jSONObject2.put(str, uri.getQueryParameter(str));
                                        }
                                    } catch (Exception unused5) {
                                    }
                                }
                                strLxb = Ivz.this.lc;
                                jSONObjectSfi = jSONObject2;
                            } catch (Exception unused6) {
                                return;
                            }
                        } else {
                            strLxb = Ivz.this.Lxb(queryParameter2, queryParameter3);
                        }
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(Ivz.this.kqm, queryParameter, strLxb, queryParameter3, j, j3, jSONObjectSfi, com.bytedance.sdk.openadsdk.core.model.kqm.JXs(Ivz.this.kqm));
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:207:0x0323 A[PHI: r3
  0x0323: PHI (r3v15 org.json.JSONObject) = (r3v10 org.json.JSONObject), (r3v16 org.json.JSONObject) binds: [B:224:0x0368, B:206:0x0321] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @JProtect
    public JSONObject Lxb(LD ld, int i) throws Exception {
        byte b;
        JSONObject jSONObjectSTP;
        Context context;
        JSONObject jSONObject;
        if (!NotificationCompat.CATEGORY_CALL.equals(ld.Lxb)) {
            return null;
        }
        QAg.LD().kqm();
        JSONObject jSONObject2 = new JSONObject();
        String str = ld.lk;
        str.getClass();
        switch (str.hashCode()) {
            case -2036781162:
                if (!str.equals("subscribe_app_ad")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1423303823:
                if (!str.equals("adInfo")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1330994877:
                if (!str.equals("pauseWebView")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -1169135450:
                if (!str.equals("changeVideoState")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1023873614:
                if (!str.equals("openAdLandPageLinks")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case -844321441:
                if (!str.equals("webview_time_track")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -800853518:
                if (!str.equals("clickEvent")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case -794273169:
                if (!str.equals("appInfo")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case -715147645:
                if (!str.equals("getScreenSize")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case -511324706:
                if (!str.equals("openPrivacy")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case -489318846:
                if (!str.equals("getMaterialMeta")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case -278382602:
                if (!str.equals("send_temai_product_ids")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            case -173752734:
                if (!str.equals("getTeMaiAds")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 27837080:
                if (!str.equals("download_app_ad")) {
                    b = -1;
                } else {
                    b = cw.k;
                }
                break;
            case 94756344:
                if (!str.equals("close")) {
                    b = -1;
                } else {
                    b = cw.l;
                }
                break;
            case 105049135:
                if (!str.equals("unsubscribe_app_ad")) {
                    b = -1;
                } else {
                    b = cw.m;
                }
                break;
            case 399543522:
                if (!str.equals("getCloseButtonInfo")) {
                    b = -1;
                } else {
                    b = cw.n;
                }
                break;
            case 402955465:
                if (!str.equals("isViewable")) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 425443791:
                if (!str.equals("getNativeSiteCustomData")) {
                    b = -1;
                } else {
                    b = 18;
                }
                break;
            case 442647767:
                if (!str.equals("sendReward")) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case 571273292:
                if (!str.equals("dynamicTrack")) {
                    b = -1;
                } else {
                    b = 20;
                }
                break;
            case 650209982:
                if (!str.equals("getTemplateInfo")) {
                    b = -1;
                } else {
                    b = 21;
                }
                break;
            case 672928467:
                if (!str.equals("cancel_download_app_ad")) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case 711635577:
                if (!str.equals("getCurrentVideoState")) {
                    b = -1;
                } else {
                    b = 23;
                }
                break;
            case 885131792:
                if (!str.equals("getVolume")) {
                    b = -1;
                } else {
                    b = 24;
                }
                break;
            case 1107374321:
                if (!str.equals("pauseWebViewTimers")) {
                    b = -1;
                } else {
                    b = 25;
                }
                break;
            case 1151744482:
                if (!str.equals("muteVideo")) {
                    b = -1;
                } else {
                    b = 26;
                }
                break;
            case 1237100796:
                if (!str.equals("renderDidFinish")) {
                    b = -1;
                } else {
                    b = 27;
                }
                break;
            case 1532142616:
                if (!str.equals("removeLoading")) {
                    b = -1;
                } else {
                    b = 28;
                }
                break;
            case 1634511418:
                if (!str.equals("endcard_load")) {
                    b = -1;
                } else {
                    b = 29;
                }
                break;
            case 1713585602:
                if (!str.equals("getNetworkData")) {
                    b = -1;
                } else {
                    b = 30;
                }
                break;
            case 1731806400:
                if (!str.equals("playable_style")) {
                    b = -1;
                } else {
                    b = 31;
                }
                break;
            case 1979895452:
                if (!str.equals("sendLog")) {
                    b = -1;
                } else {
                    b = 32;
                }
                break;
            case 2086000188:
                if (!str.equals("skipVideo")) {
                    b = -1;
                } else {
                    b = 33;
                }
                break;
            case 2105008900:
                if (!str.equals("landscape_click")) {
                    b = -1;
                } else {
                    b = 34;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                eK();
                com.bytedance.sdk.openadsdk.ZU.lk.LD(this.kqm, this.rW, 0, (JSONObject) null);
                Context context2 = this.sRq;
                if (context2 != null) {
                    this.QAg.Lxb(context2, ld.ZU, this.sLN, this.NXR, this.VVE);
                } else {
                    com.bytedance.sdk.openadsdk.ZU.lk.LD(this.kqm, this.rW, -1, (JSONObject) null);
                }
                break;
            case 1:
                QAg(jSONObject2);
                break;
            case 2:
                kqm();
                break;
            case 3:
                NXR(ld.ZU);
                break;
            case 4:
                JSONObject jSONObject3 = ld.ZU;
                if (Lxb(jSONObject3, jSONObject2)) {
                    lk(jSONObject3);
                }
                break;
            case 5:
                JVA(ld.ZU);
                break;
            case 6:
                JXs(ld.ZU);
                break;
            case 7:
                LD(jSONObject2);
                break;
            case 8:
                com.bytedance.sdk.openadsdk.sLN.Lxb lxb = this.eK;
                if (lxb != null) {
                    int iLD = lxb.LD();
                    int iLxb = this.eK.Lxb();
                    jSONObject2.put("width", iLD);
                    jSONObject2.put("height", iLxb);
                }
                break;
            case 9:
                DY();
                break;
            case 10:
                tD(jSONObject2);
                break;
            case 11:
                brP(ld.ZU);
                break;
            case 12:
                jSONObjectSTP = this.id;
                if (jSONObjectSTP != null) {
                    jSONObject2 = jSONObjectSTP;
                }
                break;
            case 13:
                this.Pw = true;
                com.bytedance.sdk.openadsdk.ZU.lk.LD(this.kqm, this.rW, 1, (JSONObject) null);
                com.bytedance.sdk.openadsdk.core.LD.ZU zu = this.foI;
                if (zu != null) {
                    zu.Lxb(this.nE);
                } else {
                    com.bytedance.sdk.openadsdk.nBu.lk lkVar = this.QAg;
                    if (lkVar != null && (context = this.sRq) != null) {
                        lkVar.Lxb(context, ld.ZU, this.rW);
                        com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld2 = this.Of;
                        if (ld2 != null) {
                            ld2.ZU();
                        }
                    } else {
                        com.bytedance.sdk.openadsdk.ZU.lk.LD(this.kqm, this.rW, -2, (JSONObject) null);
                    }
                }
                break;
            case 14:
                lc();
                break;
            case 15:
                com.bytedance.sdk.openadsdk.nBu.lk lkVar2 = this.QAg;
                if (lkVar2 != null) {
                    lkVar2.Lxb(ld.ZU);
                }
                break;
            case 16:
                jSONObjectSTP = STP();
                if (jSONObjectSTP != null) {
                    jSONObject2 = jSONObjectSTP;
                }
                break;
            case 17:
                jSONObject2.put("viewStatus", this.nJ ? 1 : 0);
                break;
            case 18:
                com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.kqm;
                if (tDVar != null && !TextUtils.isEmpty(tDVar.nJ())) {
                    jSONObject2.put("data", this.kqm.nJ());
                }
                break;
            case 19:
                this.lk = true;
                com.bytedance.sdk.openadsdk.sLN.JXs jXs = this.aH;
                if (jXs != null) {
                    jXs.Lxb();
                }
                break;
            case 20:
                kqm(ld.ZU);
                break;
            case 21:
                JSONObject jSONObject4 = this.Sfi;
                if (jSONObject4 != null) {
                    jSONObject4.put("setting", Sfi());
                    com.bytedance.sdk.openadsdk.core.model.tD tDVar2 = this.kqm;
                    if (tDVar2 != null) {
                        this.Sfi.put("extension", tDVar2.ek());
                    }
                }
                jSONObject2 = this.Sfi;
                break;
            case 23:
                STP(jSONObject2);
                break;
            case 24:
                AudioManager audioManager = (AudioManager) kqm.Lxb().getSystemService("audio");
                jSONObject2.put("endcard_mute", audioManager == null || audioManager.getStreamVolume(3) <= 0);
                break;
            case 25:
                brP();
                break;
            case 26:
                LD(this.DY, ld.ZU);
                break;
            case 27:
                IeN(ld.ZU);
                break;
            case 28:
                com.bytedance.sdk.openadsdk.sLN.ZU zu2 = this.CSn;
                if (zu2 != null) {
                    zu2.Lxb();
                }
                break;
            case 29:
                sLN(ld.ZU);
                break;
            case 30:
                Lxb(ld, jSONObject2);
                break;
            case 31:
                nBu(jSONObject2);
                break;
            case 32:
                JSONObject jSONObject5 = ld.ZU;
                if (jSONObject5 != null && (jSONObject = jSONObject5.getJSONObject("extJson")) != null && jSONObject.has("category") && jSONObject.has("tag") && jSONObject.has("label")) {
                    String strOptString = jSONObject.optString("category");
                    String strOptString2 = jSONObject.optString("tag");
                    String strOptString3 = jSONObject.optString("label");
                    long jOptLong = jSONObject5.optLong(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                    long jOptLong2 = jSONObject5.optLong("extValue");
                    try {
                        jSONObject.putOpt("ua_policy", Integer.valueOf(this.IeN));
                        break;
                    } catch (Exception unused) {
                    }
                    if (CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(strOptString3)) {
                        jSONObject = Sfi(jSONObject);
                    }
                    String strLxb = Lxb(strOptString2, strOptString3);
                    boolean zJXs = com.bytedance.sdk.openadsdk.core.model.kqm.JXs(this.kqm);
                    Lxb(jSONObject, zJXs, strOptString3);
                    com.bytedance.sdk.openadsdk.ZU.lk.Lxb(this.kqm, strOptString, strLxb, strOptString3, jOptLong, jOptLong2, jSONObject, zJXs);
                }
                break;
            case 33:
                tD();
                break;
            case 34:
                Context context3 = this.sRq;
                if (context3 instanceof com.bytedance.sdk.openadsdk.core.NXR.ZU.LD) {
                    ((com.bytedance.sdk.openadsdk.core.NXR.ZU.LD) context3).ZU();
                }
                break;
        }
        if (i == 1 && !TextUtils.isEmpty(ld.LD)) {
            LD(ld.LD, jSONObject2);
            if (QAg.LD().kqm()) {
                Objects.toString(jSONObject2);
            }
        }
        return jSONObject2;
    }

    private void Lxb(JSONObject jSONObject, boolean z, String str) {
        com.bytedance.sdk.openadsdk.core.widget.lc lcVar;
        if (z) {
            try {
                String strOptString = jSONObject.optString("ad_extra_data");
                if (TextUtils.isEmpty(strOptString) || new JSONObject(strOptString).optInt("agg_request_type", -1) != 1 || !CampaignEx.JSON_NATIVE_VIDEO_CLICK.equals(str) || (lcVar = this.ebl) == null) {
                    return;
                }
                lcVar.Lxb();
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AndroidObject", "callAggClickListener faile", th);
            }
        }
    }

    private boolean Lxb(JSONObject jSONObject, JSONObject jSONObject2) {
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
        boolean z = false;
        if (iOptInt == 1) {
            if (!com.bytedance.sdk.component.utils.IeN.Lxb(strOptString)) {
                try {
                    jSONObject2.put("invalid_url", 1);
                } catch (JSONException e) {
                    com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AndroidObject", "handleUrl, EX1->: ", e);
                }
            }
            return z;
        }
        if (iOptInt == 2) {
            try {
                if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) {
                    jSONObject2.put("empty_url", 1);
                } else if (!com.bytedance.sdk.component.utils.IeN.Lxb(strOptString2)) {
                    jSONObject2.put("invalid_url", 1);
                }
            } catch (JSONException e2) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AndroidObject", "handleUrl, EX2->: ", e2);
            }
        }
        return z;
        z = true;
        return z;
    }

    private void Lxb(String str, boolean z) {
        if (this.le == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            this.le.Lxb(str);
        } else {
            this.le.LD(str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.JXs.LD
    public void Lxb(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("time");
            String strOptString = jSONObject.optString("flag");
            com.bytedance.sdk.openadsdk.core.OY.STP stp = this.DY;
            if (stp != null) {
                stp.Lxb(iOptInt, strOptString);
            }
        } catch (JSONException unused) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AndroidObject", "requestPauseVideo json exception");
        }
    }

    private void Lxb(final LD ld, final JSONObject jSONObject) {
        if (ld == null) {
            return;
        }
        try {
            Lxb(ld.ZU, new com.bytedance.sdk.openadsdk.sLN.lk() { // from class: com.bytedance.sdk.openadsdk.core.Ivz.6
                @Override // com.bytedance.sdk.openadsdk.sLN.lk
                public void Lxb(boolean z, List<com.bytedance.sdk.openadsdk.core.model.tD> list) {
                    if (!z) {
                        Ivz.this.LD(ld.LD, jSONObject);
                        return;
                    }
                    try {
                        jSONObject.put("creatives", Ivz.LD(list));
                        Ivz.this.LD(ld.LD, jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    @JProtect
    private boolean Lxb(String str, int i, com.bytedance.sdk.openadsdk.core.model.STP stp) {
        HashMap<String, nBu> map;
        if (TextUtils.isEmpty(str) || (map = this.hg) == null || map.get(str) == null) {
            return false;
        }
        throw null;
    }

    @JProtect
    public void Lxb(JSONObject jSONObject, final com.bytedance.sdk.openadsdk.sLN.lk lkVar) {
        if (lkVar == null) {
            return;
        }
        try {
            final com.bytedance.sdk.openadsdk.sLN.lk lkVar2 = new com.bytedance.sdk.openadsdk.sLN.lk() { // from class: com.bytedance.sdk.openadsdk.core.Ivz.7
                @Override // com.bytedance.sdk.openadsdk.sLN.lk
                public void Lxb(final boolean z, final List<com.bytedance.sdk.openadsdk.core.model.tD> list) {
                    com.bytedance.sdk.openadsdk.utils.hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.Ivz.7.1
                        @Override // java.lang.Runnable
                        public void run() {
                            lkVar.Lxb(z, list);
                        }
                    });
                }
            };
            if (this.kqm != null && !TextUtils.isEmpty(this.sLN)) {
                int iLJ = this.kqm.lJ();
                AdSlot adSlotHg = this.kqm.hg();
                com.bytedance.sdk.openadsdk.core.model.Sfi sfi = new com.bytedance.sdk.openadsdk.core.model.Sfi();
                sfi.lc = true;
                if (this.kqm.rW() != null || this.kqm.dR() != null) {
                    sfi.OY = 2;
                }
                JSONObject jSONObject2 = this.brP;
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                if (jSONObject != null) {
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                }
                sfi.ebl = jSONObject2;
                kqm.lk().Lxb(adSlotHg, sfi, iLJ, new tD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.Ivz.8
                    @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
                    public void Lxb(int i, String str) {
                        lkVar2.Lxb(false, null);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.tD.Lxb
                    public void Lxb(com.bytedance.sdk.openadsdk.core.model.Lxb lxb, com.bytedance.sdk.openadsdk.core.model.LD ld) {
                        if (lxb.ZU() == null || lxb.ZU().isEmpty()) {
                            lkVar2.Lxb(false, null);
                            ld.Lxb(-3);
                            com.bytedance.sdk.openadsdk.core.model.LD.Lxb(ld);
                        } else {
                            com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb.ZU().get(0);
                            if (tDVar != null) {
                                Ivz.this.brP = tDVar.AcC();
                            }
                            lkVar2.Lxb(true, lxb.ZU());
                        }
                    }
                });
                return;
            }
            lkVar2.Lxb(false, null);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.AndroidObject", "get ads error", e);
        }
    }

    public boolean Lxb(Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            if (!"bytedance".equals(uri.getScheme())) {
                return false;
            }
            if (OY.containsKey(uri.getHost())) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Lxb(String str, String str2) {
        if (com.bytedance.sdk.openadsdk.core.model.kqm.JXs(this.kqm)) {
            if ("show".equals(str2)) {
                return nJ.Lxb(this.NXR);
            }
            return "aggregate_page";
        }
        if (com.bytedance.sdk.openadsdk.core.model.eK.JXs(this.kqm)) {
            return this.lc;
        }
        if (this.KPU != null) {
            return nJ.Lxb(this.NXR);
        }
        return this.tD == null ? nJ.LD(this.NXR) : str;
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
        if (message != null && message.what == 11) {
            Object obj = message.obj;
            if (obj instanceof LD) {
                try {
                    Lxb((LD) obj, 1);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.nBu.LD
    public void Lxb(String str, JSONObject jSONObject) {
        lk(str, jSONObject);
    }

    private void Lxb(com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = new com.bytedance.sdk.openadsdk.core.LD.Lxb(kqm.Lxb(), tDVar, str, this.NXR);
        lxb.Lxb(com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(kqm.Lxb(), tDVar, str));
        if (!z) {
            lxb.Lxb(false);
        }
        lxb.onClick(null);
    }

    public void Lxb(JSONObject jSONObject, String str) {
        com.bytedance.sdk.openadsdk.core.OY.STP stp = this.DY;
        if (stp != null) {
            stp.Lxb(str, jSONObject);
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.core.NXR.ZU.LD ld) {
        this.Of = ld;
    }

    public void Lxb(Lxb lxb) {
        this.Ld = lxb;
    }
}
