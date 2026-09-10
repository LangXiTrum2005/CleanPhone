package com.bytedance.sdk.component.adexpress.JXs;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.adexpress.LD.JVA;
import com.bytedance.sdk.component.adexpress.LD.NXR;
import com.bytedance.sdk.component.adexpress.LD.OY;
import com.bytedance.sdk.component.adexpress.LD.STP;
import com.bytedance.sdk.component.adexpress.LD.ebl;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Lxb implements JVA, com.bytedance.sdk.component.adexpress.LD.ZU<com.bytedance.sdk.component.QAg.ZU>, com.bytedance.sdk.component.adexpress.Lxb, com.bytedance.sdk.component.adexpress.theme.Lxb {
    private OY JVA;
    protected boolean LD;
    protected JSONObject Lxb;
    private boolean NXR;
    private String OY;
    private volatile ebl QAg;
    private int STP;
    private String ebl;
    private Context lc;
    protected com.bytedance.sdk.component.QAg.ZU lk;
    private boolean nBu;
    private NXR sLN;
    protected int ZU = 8;
    protected AtomicBoolean JXs = new AtomicBoolean(false);
    private boolean IeN = false;

    public Lxb(Context context, NXR nxr, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.nBu = false;
        this.lc = context;
        this.sLN = nxr;
        this.ebl = nxr.ZU();
        themeStatusBroadcastReceiver.Lxb(this);
        if (com.bytedance.sdk.component.adexpress.ZU.LD()) {
            sLN();
            return;
        }
        com.bytedance.sdk.component.QAg.ZU zuNXR = NXR();
        this.lk = zuNXR;
        if (zuNXR != null) {
            this.nBu = true;
        } else if (com.bytedance.sdk.component.adexpress.ZU.Lxb() != null) {
            this.lk = new com.bytedance.sdk.component.QAg.ZU(com.bytedance.sdk.component.adexpress.ZU.Lxb());
        }
    }

    private com.bytedance.sdk.component.QAg.ZU NXR() {
        return this.sLN.eK() ? JXs.Lxb().Lxb(this.lc, this.ebl) : JXs.Lxb().LD(this.lc, this.ebl);
    }

    private void STP() {
        if (this.sLN.eK()) {
            JXs.Lxb().LD(this.lk);
        } else {
            JXs.Lxb().lk(this.lk);
        }
    }

    private void sLN() {
        if (this.lc == null && com.bytedance.sdk.component.adexpress.ZU.Lxb() != null) {
            this.lc = com.bytedance.sdk.component.adexpress.ZU.Lxb();
        }
        if (this.lc != null) {
            com.bytedance.sdk.component.QAg.ZU zuNXR = NXR();
            this.lk = zuNXR;
            if (zuNXR == null) {
                this.lk = new com.bytedance.sdk.component.QAg.ZU(new MutableContextWrapper(this.lc.getApplicationContext()));
            } else {
                this.nBu = true;
            }
        }
    }

    public NXR JVA() {
        return this.sLN;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.component.QAg.ZU JXs() {
        return Lxb();
    }

    public abstract void Lxb(int i);

    public void OY() {
        QAg();
        Activity activityLxb = com.bytedance.sdk.component.utils.LD.Lxb(this.lk);
        if (activityLxb != null) {
            this.STP = LD(activityLxb);
        }
    }

    public void QAg() {
    }

    public void ZU() {
        if (this.JXs.get()) {
            return;
        }
        this.JXs.set(true);
        ebl();
        if (this.lk.getParent() != null) {
            ((ViewGroup) this.lk.getParent()).removeView(this.lk);
        }
        if (this.LD) {
            STP();
        } else {
            JXs.Lxb().JXs(this.lk);
        }
    }

    public abstract void ebl();

    public void lc() {
        if (Lxb() == null) {
            return;
        }
        try {
            Lxb().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    public int lk() {
        return 0;
    }

    public void nBu() {
    }

    private int LD(Activity activity) {
        return activity.hashCode();
    }

    public void Lxb(String str) {
        this.OY = str;
    }

    public void LD(boolean z) {
        this.IeN = z;
    }

    public com.bytedance.sdk.component.QAg.ZU Lxb() {
        return this.lk;
    }

    public void Lxb(OY oy) {
        this.JVA = oy;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    public void Lxb(ebl eblVar) {
        this.QAg = eblVar;
        if (Lxb() != null && Lxb().getWebView() != null) {
            if (TextUtils.isEmpty(this.OY)) {
                this.QAg.Lxb(102, "url is empty");
                return;
            }
            if (!this.sLN.eK()) {
                if (!this.IeN && !com.bytedance.sdk.component.adexpress.Lxb.LD.LD.Lxb(this.Lxb)) {
                    ebl eblVar2 = this.QAg;
                    StringBuilder sb = new StringBuilder("data null is ");
                    sb.append(this.Lxb == null);
                    eblVar2.Lxb(103, sb.toString());
                    return;
                }
                if (this.IeN && !com.bytedance.sdk.component.adexpress.Lxb.LD.LD.lk(this.Lxb)) {
                    ebl eblVar3 = this.QAg;
                    StringBuilder sb2 = new StringBuilder("choice ad data null is ");
                    sb2.append(this.Lxb == null);
                    eblVar3.Lxb(103, sb2.toString());
                    return;
                }
            } else if (lk() == 9 && !com.bytedance.sdk.component.adexpress.Lxb.LD.LD.LD(this.Lxb)) {
                ebl eblVar4 = this.QAg;
                StringBuilder sb3 = new StringBuilder("data null is ");
                sb3.append(this.Lxb == null);
                eblVar4.Lxb(103, sb3.toString());
                return;
            }
            this.sLN.JXs().Lxb(this.nBu);
            if (this.nBu) {
                try {
                    this.lk.NXR();
                    this.sLN.JXs();
                    com.bytedance.sdk.component.utils.JVA.Lxb(this.lk.getWebView(), "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();");
                    return;
                } catch (Exception e) {
                    JXs.Lxb().JXs(this.lk);
                    this.QAg.Lxb(102, "load exception is " + e.getMessage());
                    return;
                }
            }
            com.bytedance.sdk.component.QAg.ZU zuLxb = Lxb();
            zuLxb.NXR();
            this.sLN.JXs();
            zuLxb.a_(this.OY);
            return;
        }
        ebl eblVar5 = this.QAg;
        StringBuilder sb4 = new StringBuilder("SSWebview null is ");
        sb4.append(Lxb() == null);
        sb4.append(" or Webview is null");
        eblVar5.Lxb(102, sb4.toString());
    }

    public void Lxb(boolean z) {
        this.NXR = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.JVA
    public void Lxb(final STP stp) {
        if (stp == null) {
            if (this.QAg != null) {
                this.QAg.Lxb(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zLk = stp.lk();
        final float fZU = (float) stp.ZU();
        final float fJXs = (float) stp.JXs();
        if (lk() == 0 && (fZU <= 0.0f || fJXs <= 0.0f)) {
            if (this.QAg != null) {
                this.QAg.Lxb(105, "width is " + fZU + "height is " + fJXs);
                return;
            }
            return;
        }
        this.LD = zLk;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Lxb(stp, fZU, fJXs);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.JXs.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    Lxb.this.Lxb(stp, fZU, fJXs);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(STP stp, float f, float f2) {
        stp.JVA();
        boolean z = this.LD;
        if (z && !this.NXR) {
            Lxb(f, f2);
            Lxb(this.ZU);
            if (this.QAg != null) {
                this.QAg.Lxb(Lxb(), stp);
                return;
            }
            return;
        }
        if (!z) {
            JXs.Lxb().JXs(this.lk);
        }
        Lxb(stp.JVA(), stp.nBu());
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.JVA
    public void Lxb(View view, int i, com.bytedance.sdk.component.adexpress.lk lkVar) {
        OY oy = this.JVA;
        if (oy != null) {
            oy.Lxb(view, i, lkVar);
        }
    }

    @UiThread
    private void Lxb(float f, float f2) {
        this.sLN.JXs().JXs();
        if (lk() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) Lxb().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            Lxb().setLayoutParams(layoutParams);
            return;
        }
        int iLxb = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.lc, f);
        int iLxb2 = (int) com.bytedance.sdk.component.adexpress.ZU.OY.Lxb(this.lc, f2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) Lxb().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iLxb, iLxb2);
        }
        layoutParams2.width = iLxb;
        layoutParams2.height = iLxb2;
        Lxb().setLayoutParams(layoutParams2);
    }

    private void Lxb(int i, String str) {
        if (this.QAg != null) {
            this.QAg.Lxb(i, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.Lxb
    public void Lxb(Activity activity) {
        if (this.STP == 0 || activity == null || activity.hashCode() != this.STP) {
            return;
        }
        ZU();
        nBu();
    }

    public void Lxb(JSONObject jSONObject) {
        this.Lxb = jSONObject;
    }
}
