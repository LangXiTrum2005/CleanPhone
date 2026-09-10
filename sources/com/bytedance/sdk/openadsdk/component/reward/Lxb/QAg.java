package com.bytedance.sdk.openadsdk.component.reward.Lxb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.component.utils.HomeWatcherReceiver;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.le;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.net.URLEncoder;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class QAg implements Handler.Callback, com.bytedance.sdk.openadsdk.sLN.ebl {
    private static final com.bytedance.sdk.openadsdk.tD.ebl.Lxb nBu = new com.bytedance.sdk.openadsdk.tD.ebl.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.QAg.1
        @Override // com.bytedance.sdk.openadsdk.tD.ebl.Lxb
        public void Lxb(String str, String str2, Throwable th) {
            com.bytedance.sdk.component.utils.sLN.Lxb(str, str2, th);
        }
    };
    private boolean CSn;
    private com.bytedance.sdk.openadsdk.tD.OY HD;
    private final Lxb IeN;
    private volatile boolean JVA;

    @NonNull
    private final com.bytedance.sdk.openadsdk.core.model.tD NXR;
    private boolean OY;
    private boolean QAg;
    private final String STP;
    private HomeWatcherReceiver Sfi;
    private volatile boolean aH;
    private boolean eK;
    private boolean id;
    private brP kqm;
    private final Activity sLN;
    private com.bytedance.sdk.openadsdk.core.widget.JVA tD;
    protected final AtomicBoolean Lxb = new AtomicBoolean(false);
    private final Handler VVE = new Handler(this);
    boolean LD = false;
    boolean lk = false;
    long ZU = 0;
    int JXs = 0;
    int lc = 0;
    int ebl = 0;
    private int brP = 1;
    private boolean DY = true;
    private final com.bytedance.sdk.openadsdk.sLN.ZU foI = new com.bytedance.sdk.openadsdk.sLN.ZU() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.QAg.8
        @Override // com.bytedance.sdk.openadsdk.sLN.ZU
        public void LD() {
        }

        @Override // com.bytedance.sdk.openadsdk.sLN.ZU
        public void Lxb(int i) {
        }

        @Override // com.bytedance.sdk.openadsdk.sLN.ZU
        public void Lxb() {
            if (!QAg.this.IeN.Pw.isFinishing() && QAg.this.IeN.LD.mOF() && eK.VVE(QAg.this.IeN.LD)) {
                QAg.this.VVE.removeMessages(800);
                QAg.this.VVE.sendMessage(QAg.Lxb(1, 0));
            }
        }
    };

    public QAg(Lxb lxb) {
        this.OY = true;
        this.IeN = lxb;
        this.sLN = lxb.Pw;
        this.STP = lxb.JXs;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb.LD;
        this.NXR = tDVar;
        this.OY = eK.ebl(tDVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static com.bytedance.sdk.openadsdk.tD.ZU DY() {
        String strLc = com.bytedance.sdk.openadsdk.common.LD.lc();
        strLc.getClass();
        switch (strLc) {
            case "2g":
                return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_2G;
            case "3g":
                return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_3G;
            case "4g":
                return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_4G;
            case "5g":
                return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_5G;
            case "wifi":
                return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_WIFI;
            default:
                return com.bytedance.sdk.openadsdk.tD.ZU.TYPE_UNKNOWN;
        }
    }

    private boolean HD() {
        if (this.tD == null) {
            return false;
        }
        if (this.NXR.mOF() && eK.brP(this.NXR)) {
            this.tD.LD(this.NXR, this.brP);
            return true;
        }
        this.tD.lk();
        return false;
    }

    private void Sfi() {
        if (this.OY) {
            this.tD = (com.bytedance.sdk.openadsdk.core.widget.JVA) this.IeN.rW.findViewById(com.bytedance.sdk.openadsdk.utils.STP.JP);
        }
    }

    private String eK() {
        String strId = com.bytedance.sdk.openadsdk.core.kqm.ZU().id();
        if (TextUtils.isEmpty(strId) || this.NXR.MGT() == null) {
            return strId;
        }
        String strLD = this.NXR.MGT().LD();
        double dZU = this.NXR.MGT().ZU();
        int iJXs = this.NXR.MGT().JXs();
        String strLxb = (this.NXR.Lpq() == null || TextUtils.isEmpty(this.NXR.Lpq().Lxb())) ? "" : this.NXR.Lpq().Lxb();
        String strBG = this.NXR.bG();
        String strLk = this.NXR.MGT().lk();
        String strLxb2 = this.NXR.MGT().Lxb();
        String strLD2 = this.NXR.MGT().LD();
        String strFD = this.NXR.FD();
        StringBuilder sb = new StringBuilder("appname=");
        sb.append(URLEncoder.encode(strLD));
        sb.append("&stars=");
        sb.append(dZU);
        sb.append("&comments=");
        sb.append(iJXs);
        sb.append("&icon=");
        sb.append(URLEncoder.encode(strLxb));
        sb.append("&downloading=true&id=");
        sb.append(URLEncoder.encode(strBG));
        sb.append("&packageName=");
        sb.append(URLEncoder.encode(strLk));
        sb.append("&downloadUrl=");
        sb.append(URLEncoder.encode(strLxb2));
        sb.append("&name=");
        sb.append(URLEncoder.encode(strLD2));
        sb.append("&orientation=");
        sb.append(this.brP == 1 ? "portrait" : "landscape");
        sb.append("&apptitle=");
        sb.append(URLEncoder.encode(strFD));
        return strId + "?" + ((Object) sb);
    }

    public boolean IeN() {
        return this.aH;
    }

    public void JVA() {
        if (this.OY && this.HD != null && le.ZU(this.IeN.hg.nBu())) {
            this.HD.lk(true);
        }
    }

    public void NXR() {
        if (this.OY) {
            this.VVE.removeMessages(TypedValues.Custom.TYPE_INT);
            this.VVE.removeMessages(600);
        }
    }

    public boolean OY() {
        return this.JVA;
    }

    public int QAg() {
        return this.lc;
    }

    public com.bytedance.sdk.openadsdk.sLN.ZU STP() {
        return this.foI;
    }

    public boolean VVE() {
        return this.CSn;
    }

    public com.bytedance.sdk.openadsdk.tD.OY brP() {
        return this.HD;
    }

    public void ebl() {
        if (this.OY && !this.tD.isShown()) {
            com.bytedance.sdk.openadsdk.core.widget.JVA jva = this.tD;
            if (jva != null) {
                jva.LD(this.NXR, this.brP);
                this.tD.setProgress(this.IeN.hg.nBu() != null ? this.IeN.hg.nBu().getProgress() : 0);
            }
            com.bytedance.sdk.openadsdk.tD.OY oy = this.HD;
            if (oy != null) {
                oy.Ivz();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        com.bytedance.sdk.openadsdk.core.widget.JVA jva;
        brP brp;
        int i = message.what;
        if (i == 900) {
            if (!this.JVA || !eK.brP(this.IeN.LD)) {
                return true;
            }
            int i2 = message.arg1;
            if (i2 > 0) {
                this.IeN.nJ.ZU(true);
                int iLD = this.IeN.CSn.LD(i2);
                if (iLD == i2) {
                    this.IeN.nJ.Lxb(String.valueOf(i2), null);
                } else if (iLD > 0) {
                    this.IeN.nJ.Lxb(String.valueOf(i2), String.format(com.bytedance.sdk.component.utils.tD.Lxb(this.IeN.Pw.getApplicationContext(), "tt_skip_ad_time_text"), Integer.valueOf(iLD)));
                } else if (!eK.OY(this.NXR) || IeN()) {
                    this.IeN.tD.set(true);
                    this.IeN.bG.IeN();
                } else {
                    this.IeN.nJ.Lxb(String.valueOf(i2), com.bytedance.sdk.component.utils.tD.Lxb(this.IeN.Pw.getApplicationContext(), "tt_reward_screen_skip_tx"));
                    this.IeN.nJ.JXs(true);
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = TypedValues.Custom.TYPE_INT;
                messageObtain.arg1 = i2 - 1;
                this.VVE.sendMessageDelayed(messageObtain, 1000L);
                JXs(i2);
            } else {
                if (!eK.OY(this.NXR) || (eK.eK(this.NXR) && this.IeN.CSn.ebl())) {
                    this.IeN.nJ.ZU(false);
                    this.IeN.tD.set(true);
                    this.IeN.bG.IeN();
                } else {
                    this.IeN.nJ.lk();
                    this.IeN.nJ.JXs(true);
                }
                if (!this.QAg) {
                    this.CSn = true;
                }
            }
            this.IeN.dR.STP();
        } else {
            if (i != 800 || ((jva = this.tD) != null && (!jva.isShown() || this.tD.ZU()))) {
                return true;
            }
            JSONObject jSONObject = new JSONObject();
            long displayDuration = 0;
            try {
                jSONObject.put("remove_loading_page_type", message.arg1);
                int i3 = message.arg2;
                if (i3 != 0) {
                    jSONObject.put("remove_loading_page_reason", i3);
                }
                String strSLN = eK.sLN(this.NXR);
                Lxb lxb = this.IeN;
                if (lxb != null && (brp = lxb.hg) != null) {
                    String strCSn = brp.CSn();
                    if (!TextUtils.isEmpty(strCSn)) {
                        strSLN = strCSn;
                    }
                }
                jSONObject.put("playable_url", strSLN);
                com.bytedance.sdk.openadsdk.core.widget.JVA jva2 = this.tD;
                displayDuration = jva2 != null ? jva2.getDisplayDuration() : 0L;
                jSONObject.put("duration", displayDuration);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFPM", "handleMessage json error", e);
            }
            long j = displayDuration;
            Lxb lxb2 = this.IeN;
            com.bytedance.sdk.openadsdk.ZU.lk.Lxb(lxb2.LD, lxb2.JXs, "remove_loading_page", jSONObject, j);
            this.VVE.removeMessages(800);
            if (!this.sLN.isFinishing()) {
                this.IeN.CSn.JXs();
            }
        }
        return true;
    }

    public boolean kqm() {
        com.bytedance.sdk.openadsdk.core.widget.JVA jva = this.tD;
        return jva != null && jva.isShown();
    }

    public int nBu() {
        return this.JXs;
    }

    public void sLN() {
        if (this.OY) {
            com.bytedance.sdk.openadsdk.tD.OY oy = this.HD;
            if (oy != null) {
                oy.lk(false);
            }
            this.VVE.removeMessages(TypedValues.Custom.TYPE_INT);
        }
    }

    public void JXs() {
        if (this.OY && this.ZU <= 0) {
            this.ZU = System.currentTimeMillis();
            Handler handler = this.VVE;
            handler.sendMessage(handler.obtainMessage(TypedValues.Custom.TYPE_INT, QAg(), 0));
            lk(true);
        }
    }

    public void LD(int i) {
        if (this.OY) {
            if (i == 5) {
                this.QAg = true;
                if (eK.eK(this.NXR)) {
                    this.VVE.removeMessages(TypedValues.Custom.TYPE_INT);
                    this.IeN.JJ.sendEmptyMessage(600);
                }
            }
            this.VVE.sendMessage(Lxb(i, 0));
        }
    }

    public void ZU() {
        if (this.OY) {
            try {
                HomeWatcherReceiver homeWatcherReceiver = new HomeWatcherReceiver();
                this.Sfi = homeWatcherReceiver;
                homeWatcherReceiver.Lxb(new HomeWatcherReceiver.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.QAg.7
                    @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.Lxb
                    public void LD() {
                        QAg.this.lk = true;
                    }

                    @Override // com.bytedance.sdk.component.utils.HomeWatcherReceiver.Lxb
                    public void Lxb() {
                        QAg.this.lk = true;
                    }
                });
                this.sLN.getApplicationContext().registerReceiver(this.Sfi, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (Throwable unused) {
            }
        }
    }

    public void lc() {
        com.bytedance.sdk.openadsdk.tD.OY oy;
        com.bytedance.sdk.openadsdk.utils.sLN sln;
        if (this.OY) {
            if (!eK.OY(this.NXR) && this.tD.isShown() && (sln = this.IeN.MGT) != null) {
                sln.Lxb(QAg() * 1000);
            }
            if (eK.tD(this.NXR) && this.tD.isShown()) {
                Lxb lxb = this.IeN;
                lxb.le.LD(lxb.bG);
            }
            com.bytedance.sdk.openadsdk.core.widget.JVA jva = this.tD;
            if (jva != null) {
                jva.lk();
            }
            if (this.Lxb.getAndSet(true)) {
                return;
            }
            if (this.IeN.hg.BcA() && (oy = this.HD) != null) {
                oy.Lxb(1);
            }
            if (eK.ebl(this.NXR) && eK.eK(this.NXR)) {
                brP brp = this.IeN.hg;
                if (brp == null || brp.BcA()) {
                    Lxb lxb2 = this.IeN;
                    lxb2.le.Lxb(lxb2.bG);
                    return;
                }
                int i = !this.IeN.hg.brP() ? 2 : 3;
                com.bytedance.sdk.openadsdk.tD.OY oy2 = this.HD;
                if (oy2 != null) {
                    oy2.Lxb(i);
                }
                if (eK.brP(this.IeN.LD)) {
                    Lxb lxb3 = this.IeN;
                    int i2 = lxb3.lc;
                    com.bytedance.sdk.openadsdk.core.model.tD tDVar = lxb3.LD;
                    Lxb(i2, tDVar, tDVar.cR());
                    JXs();
                    this.IeN.dR.JVA();
                }
                this.IeN.le.Lxb(false);
                this.IeN.hg.le();
                this.aH = true;
                this.IeN.nJ.lk(false);
                this.IeN.xan.Lxb(true);
                this.IeN.Of = true;
                if (eK.tD(this.NXR)) {
                    this.VVE.removeMessages(TypedValues.Custom.TYPE_INT);
                    this.IeN.nJ.ZU(false);
                    aH aHVar = this.IeN.JJ;
                    if (aHVar != null) {
                        aHVar.removeMessages(1);
                        this.IeN.JJ.sendEmptyMessageDelayed(600, 1000L);
                    }
                }
                com.bytedance.sdk.openadsdk.tD.OY oy3 = this.HD;
                if (oy3 != null) {
                    oy3.lk(true);
                }
            }
        }
    }

    public void lk() {
        if (this.OY && !this.id) {
            this.id = true;
            lk(false);
            Lxb(this.sLN.getApplicationContext());
            com.bytedance.sdk.openadsdk.tD.OY oy = this.HD;
            if (oy != null) {
                oy.nJ();
            }
            this.VVE.removeCallbacksAndMessages(null);
            DeviceUtils.AudioInfoReceiver.LD(this);
        }
    }

    public static Message Lxb(int i, int i2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 800;
        messageObtain.arg1 = i;
        if (i == 3) {
            messageObtain.arg2 = i2;
        }
        return messageObtain;
    }

    public void JXs(int i) {
        this.JXs = i - 1;
    }

    public void Lxb() {
        if (this.OY && !this.eK) {
            this.eK = true;
            Lxb lxb = this.IeN;
            this.kqm = lxb.hg;
            this.brP = lxb.Ns;
            Sfi();
            if (eK.ebl(this.NXR)) {
                DeviceUtils.AudioInfoReceiver.Lxb(this);
            }
            if (HD() && eK.brP(this.NXR) && eK.VVE(this.NXR)) {
                Handler handler = this.VVE;
                handler.sendMessageDelayed(handler.obtainMessage(800, 2, eK.Lxb(2)), eK.DY(this.NXR) * 1000);
            }
        }
    }

    public int ZU(int i) {
        return this.ebl - (this.lc - i);
    }

    public void JXs(boolean z) {
        com.bytedance.sdk.openadsdk.tD.OY oy;
        if (this.OY && (oy = this.HD) != null) {
            oy.Lxb(z);
        }
    }

    public void LD() {
        if (this.OY && !this.Lxb.getAndSet(true)) {
            this.kqm.nJ();
            if (eK.OY(this.NXR)) {
                this.kqm.ebl();
            }
        }
    }

    public void ZU(boolean z) {
        com.bytedance.sdk.openadsdk.tD.OY oy;
        if (this.OY && (oy = this.HD) != null) {
            oy.lk(z);
        }
    }

    public void lk(int i) {
        com.bytedance.sdk.openadsdk.core.widget.JVA jva;
        if (this.OY && (jva = this.tD) != null) {
            jva.setProgress(i);
        }
    }

    public void LD(boolean z) {
        if (this.OY) {
            if (z) {
                try {
                    if (!TextUtils.isEmpty(this.kqm.CSn()) && this.kqm.eK() != 0) {
                        com.bytedance.sdk.openadsdk.STP.lk.Lxb().Lxb(this.kqm.CSn(), this.kqm.eK(), this.kqm.aH());
                    }
                } catch (Throwable unused) {
                }
            }
            if (z) {
                try {
                    if (TextUtils.isEmpty(this.kqm.CSn())) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.STP.lk.Lxb().LD(this.kqm.CSn());
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public void lk(boolean z) {
        if (this.OY) {
            this.JVA = z;
            if (z) {
                return;
            }
            this.VVE.removeMessages(TypedValues.Custom.TYPE_INT);
        }
    }

    public void lk(String str) {
        com.bytedance.sdk.openadsdk.tD.OY oy = this.HD;
        if (oy == null || !this.OY) {
            return;
        }
        oy.lc(com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(this.NXR));
        this.HD.OY(str);
    }

    public void LD(String str) {
        com.bytedance.sdk.openadsdk.tD.OY oy = this.HD;
        if (oy != null) {
            if (!this.OY) {
                return;
            }
            oy.lc(com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(this.NXR));
            this.HD.QAg(str);
        }
        if (IeN()) {
            this.IeN.hg.ZU(true);
            this.IeN.xan.Lxb(true);
            this.IeN.Of = true;
        }
    }

    public void Lxb(final com.bytedance.sdk.openadsdk.sLN.JXs jXs, boolean z) {
        com.bytedance.sdk.openadsdk.STP.LD ld;
        com.bytedance.sdk.component.Lxb.kqm kqmVarLxb;
        if (this.OY && eK.ebl(this.NXR) && this.IeN.VU) {
            if (com.bytedance.sdk.openadsdk.core.QAg.LD().kqm()) {
                com.bytedance.sdk.openadsdk.tD.ebl.Lxb(nBu);
            }
            com.bytedance.sdk.openadsdk.tD.Lxb lxb = new com.bytedance.sdk.openadsdk.tD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.QAg.2
                @Override // com.bytedance.sdk.openadsdk.tD.Lxb
                public void LD() {
                    QAg.this.IeN.hg.sLN().lk(true);
                    com.bytedance.sdk.openadsdk.sLN.JXs jXs2 = jXs;
                    if (jXs2 != null) {
                        jXs2.Lxb();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.tD.Lxb
                public void Lxb(int i, String str) {
                    super.Lxb(i, str);
                    if (QAg.this.tD == null || !QAg.this.tD.isShown()) {
                        return;
                    }
                    QAg.this.VVE.sendMessage(QAg.Lxb(3, eK.Lxb(i)));
                }

                @Override // com.bytedance.sdk.openadsdk.tD.Lxb
                public com.bytedance.sdk.openadsdk.tD.ZU Lxb() {
                    return QAg.DY();
                }

                @Override // com.bytedance.sdk.openadsdk.tD.Lxb
                public void Lxb(JSONObject jSONObject) {
                    com.bytedance.sdk.openadsdk.ZU.lk.LD(QAg.this.NXR, QAg.this.STP, "playable_track", jSONObject);
                }
            };
            com.bytedance.sdk.openadsdk.tD.lk lkVar = new com.bytedance.sdk.openadsdk.tD.lk() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.QAg.3
                @Override // com.bytedance.sdk.openadsdk.tD.lk
                public void Lxb(String str, JSONObject jSONObject) {
                    QAg.this.IeN.hg.sLN().Lxb(str, jSONObject);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(BidResponsedEx.KEY_CID, this.NXR.bG());
                jSONObject.put("log_extra", this.NXR.Lv());
                com.bytedance.sdk.openadsdk.tD.OY oyJXs = com.bytedance.sdk.openadsdk.tD.OY.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), this.IeN.hg.nBu().getWebView(), lkVar, lxb).ebl(this.IeN.hg.CSn()).JXs(com.bytedance.sdk.openadsdk.common.LD.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb())).Lxb(com.bytedance.sdk.openadsdk.common.LD.Lxb()).lk(jSONObject).Lxb("sdkEdition", com.bytedance.sdk.openadsdk.common.LD.lk()).LD(com.bytedance.sdk.openadsdk.common.LD.JXs()).ZU(com.bytedance.sdk.openadsdk.common.LD.ZU()).ZU(false).Lxb(z).Lxb(eK.DY(this.NXR)).LD(eK.DY(this.NXR)).JXs(eK.brP(this.NXR));
                this.HD = oyJXs;
                if (oyJXs == null) {
                    ld = new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.QAg.4
                        @Override // com.bytedance.sdk.openadsdk.STP.LD
                        public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("PlayablePlugin_init").LD(jSONObject2.toString());
                        }
                    };
                    com.bytedance.sdk.openadsdk.STP.lk.Lxb("PlayablePlugin_init", false, ld);
                }
            } catch (Exception unused) {
                if (this.HD == null) {
                    ld = new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.QAg.4
                        @Override // com.bytedance.sdk.openadsdk.STP.LD
                        public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("PlayablePlugin_init").LD(jSONObject2.toString());
                        }
                    };
                }
            } catch (Throwable th) {
                if (this.HD == null) {
                    com.bytedance.sdk.openadsdk.STP.lk.Lxb("PlayablePlugin_init", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.QAg.4
                        @Override // com.bytedance.sdk.openadsdk.STP.LD
                        public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("PlayablePlugin_is_null", true);
                            return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("PlayablePlugin_init").LD(jSONObject2.toString());
                        }
                    });
                }
                throw th;
            }
            if (this.HD != null && !TextUtils.isEmpty(eK.JVA(this.NXR))) {
                this.HD.lk(eK.JVA(this.NXR));
            }
            com.bytedance.sdk.openadsdk.tD.OY oy = this.HD;
            if (oy != null) {
                Set<String> setJVA = oy.JVA();
                final WeakReference weakReference = new WeakReference(this.HD);
                for (String str : setJVA) {
                    if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (kqmVarLxb = this.IeN.hg.sLN().Lxb()) != null) {
                        kqmVarLxb.Lxb(str, new com.bytedance.sdk.component.Lxb.JXs<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.QAg.5
                            @Override // com.bytedance.sdk.component.Lxb.JXs
                            public JSONObject Lxb(@NonNull JSONObject jSONObject2, @NonNull com.bytedance.sdk.component.Lxb.lc lcVar) {
                                try {
                                    com.bytedance.sdk.openadsdk.tD.OY oy2 = (com.bytedance.sdk.openadsdk.tD.OY) weakReference.get();
                                    if (oy2 == null) {
                                        return null;
                                    }
                                    return oy2.ZU(Lxb(), jSONObject2);
                                } catch (Throwable unused2) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public void lc(int i) {
        this.JXs = i;
    }

    public void lc(boolean z) {
        if (this.OY && z && !this.IeN.CSn.ebl()) {
            com.bytedance.sdk.openadsdk.tD.OY oy = this.HD;
            if (oy != null) {
                oy.Lxb(1);
            }
            boolean zBrP = eK.brP(this.NXR);
            if ((zBrP || eK.eK(this.NXR)) && this.NXR.mOF() && !eK.VVE(this.NXR)) {
                Handler handler = this.VVE;
                handler.sendMessageDelayed(handler.obtainMessage(800, 0, 0), 1000L);
            }
            if (zBrP) {
                this.IeN.CSn.OY();
                this.IeN.hg.LD(true);
                this.IeN.hg.lk(true);
                com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), this.IeN.LD, this.STP, "py_loading_success");
            }
        }
    }

    public void Lxb(DownloadListener downloadListener) {
        com.bytedance.sdk.component.QAg.ZU zuJVA;
        if (this.OY && (zuJVA = this.kqm.JVA()) != null) {
            String strEK = eK();
            if (TextUtils.isEmpty(strEK)) {
                return;
            }
            zuJVA.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs(this.sLN, this.kqm.NXR(), this.NXR.bG(), null, false) { // from class: com.bytedance.sdk.openadsdk.component.reward.Lxb.QAg.6
                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    if (QAg.this.DY) {
                        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(System.currentTimeMillis(), QAg.this.NXR, QAg.this.STP, "loading_h5_success");
                    }
                    super.onPageFinished(webView, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    QAg.this.DY = false;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    QAg.this.DY = false;
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.Lxb.JXs, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    QAg.this.DY = false;
                }
            });
            zuJVA.a_(strEK);
            zuJVA.setDisplayZoomControls(false);
            zuJVA.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.Lxb.ZU(this.kqm.NXR(), this.kqm.STP()));
            zuJVA.setDownloadListener(downloadListener);
        }
    }

    public void Lxb(boolean z) {
        if (this.OY && z) {
            this.kqm.nBu().setDomStorageEnabled(true);
        }
    }

    private void Lxb(Context context) {
        if (this.OY) {
            try {
                this.Sfi.Lxb(null);
                context.getApplicationContext().unregisterReceiver(this.Sfi);
            } catch (Throwable unused) {
            }
        }
    }

    public void Lxb(String str) {
        if (this.OY && this.lk) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.ZU);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFPM", "sendPlayableEvent error", e);
            }
            com.bytedance.sdk.openadsdk.ZU.lk.LD(this.NXR, this.STP, str, jSONObject);
            if ("return_foreground".equals(str)) {
                this.lk = false;
            }
        }
    }

    public void Lxb(JSONObject jSONObject) {
        if (this.OY && jSONObject != null) {
            try {
                jSONObject.put("duration", System.currentTimeMillis() - this.ZU);
            } catch (JSONException e) {
                com.bytedance.sdk.component.utils.sLN.Lxb("TTAD.RFPM", "endShow json error", e);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Lxb(com.bytedance.sdk.openadsdk.core.LD.JXs jXs) {
        com.bytedance.sdk.openadsdk.core.widget.JVA jva;
        if (!this.OY || (jva = this.tD) == null || jva.getDownloadButton() == null) {
            return;
        }
        if (eK.brP(this.NXR) || eK.eK(this.NXR)) {
            this.tD.getDownloadButton().setOnClickListener(jXs);
            this.tD.getDownloadButton().setOnTouchListener(jXs);
        }
    }

    public void Lxb(int i, com.bytedance.sdk.openadsdk.core.model.tD tDVar, boolean z) {
        if (this.OY && tDVar != null) {
            this.lc = tDVar.Rt();
            this.ebl = com.bytedance.sdk.openadsdk.core.kqm.ZU().Lxb(String.valueOf(i), z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sLN.ebl
    public void Lxb(int i) {
        if (this.OY) {
            if (!eK.tD(this.IeN.LD) || this.IeN.nBu.get()) {
                if (eK.brP(this.IeN.LD) || eK.tD(this.IeN.LD)) {
                    if (this.IeN.xan.LD()) {
                        Lxb lxb = this.IeN;
                        boolean z = lxb.Of;
                        lxb.xan.Lxb();
                        if (i == 0) {
                            this.IeN.nJ.LD(true);
                            this.IeN.eK.LD(true);
                            return;
                        } else {
                            this.IeN.nJ.LD(false);
                            this.IeN.eK.LD(false);
                            return;
                        }
                    }
                    this.IeN.xan.Lxb(-1);
                    Lxb lxb2 = this.IeN;
                    boolean z2 = lxb2.Of;
                    lxb2.xan.Lxb();
                    Lxb lxb3 = this.IeN;
                    if (lxb3.Ld) {
                        if (i == 0) {
                            lxb3.Of = true;
                            lxb3.nJ.LD(true);
                            this.IeN.eK.LD(true);
                        } else {
                            lxb3.Of = false;
                            lxb3.nJ.LD(false);
                            this.IeN.eK.LD(false);
                        }
                    }
                }
            }
        }
    }

    public void Lxb(int i, String str, String str2) {
        if (this.OY) {
            try {
                com.bytedance.sdk.openadsdk.tD.OY oy = this.HD;
                if (oy != null) {
                    oy.lc(com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(this.NXR));
                    this.HD.Lxb(i, str, str2);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void Lxb(boolean z, String str, int i) {
        if (this.OY) {
            try {
                com.bytedance.sdk.openadsdk.tD.OY oy = this.HD;
                if (oy != null) {
                    oy.lc(com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().Lxb(this.NXR));
                    this.HD.Lxb(z, str, i);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void Lxb(long j) {
        if (this.OY) {
            Message messageObtain = Message.obtain();
            messageObtain.what = TypedValues.Custom.TYPE_INT;
            messageObtain.arg1 = nBu();
            this.VVE.sendMessageDelayed(messageObtain, j);
        }
    }
}
