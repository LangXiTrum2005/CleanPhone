package com.bytedance.sdk.component.adexpress.fi;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.lr.aw;
import com.bytedance.sdk.component.adexpress.lr.mj;
import com.bytedance.sdk.component.adexpress.lr.sf;
import com.bytedance.sdk.component.adexpress.lr.xha;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.jbs.di;
import com.bytedance.sdk.component.utils.bgr;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri implements com.bytedance.sdk.component.adexpress.lr.ka<di>, sf, com.bytedance.sdk.component.adexpress.ri, com.bytedance.sdk.component.adexpress.theme.ri {
    private boolean aw;
    private int bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private aw f18041co;
    protected boolean ik;
    private String jbs;
    protected di ka;
    protected boolean lr;
    private String mj;
    private volatile xha qt;
    protected JSONObject ri;
    private mj sf;
    private Context xha;
    protected int fi = 8;
    protected AtomicBoolean di = new AtomicBoolean(false);

    public ri(Context context, aw awVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.lr = false;
        this.xha = context;
        this.f18041co = awVar;
        this.mj = awVar.ka();
        themeStatusBroadcastReceiver.ri(this);
        if (com.bytedance.sdk.component.adexpress.ka.lr()) {
            co();
            return;
        }
        di diVarAw = aw();
        this.ka = diVarAw;
        if (diVarAw != null) {
            this.lr = true;
        } else if (com.bytedance.sdk.component.adexpress.ka.ri() != null) {
            this.ka = new di(com.bytedance.sdk.component.adexpress.ka.ri(), di.ik.ADS);
        }
    }

    private di aw() {
        return this.f18041co.wjv() ? fi.ri().ri(this.xha, this.mj) : fi.ri().lr(this.xha, this.mj);
    }

    private void bgr() {
        if (this.f18041co.wjv()) {
            fi.ri().lr(this.ka);
        } else {
            fi.ri().ik(this.ka);
        }
    }

    private void co() {
        if (this.xha == null && com.bytedance.sdk.component.adexpress.ka.ri() != null) {
            this.xha = com.bytedance.sdk.component.adexpress.ka.ri();
        }
        if (this.xha != null) {
            di diVarAw = aw();
            this.ka = diVarAw;
            if (diVarAw == null) {
                this.ka = new di(new MutableContextWrapper(this.xha.getApplicationContext()), this.f18041co.wjv() ? di.ik.ADS_V3 : di.ik.ADS);
            } else {
                this.lr = true;
            }
        }
    }

    public void di() {
        if (ri() == null) {
            return;
        }
        try {
            ri().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    public int ik() {
        return 0;
    }

    public void ka() {
        if (this.di.get()) {
            return;
        }
        this.di.set(true);
        xha();
        if (this.ka.getParent() != null) {
            ((ViewGroup) this.ka.getParent()).removeView(this.ka);
        }
        if (this.ik) {
            bgr();
        } else {
            fi.ri().ka(this.ka);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
    public di fi() {
        return ri();
    }

    public void mj() {
        jbs();
        Activity activityRi = com.bytedance.sdk.component.utils.lr.ri(this.ka);
        if (activityRi != null) {
            this.bgr = lr(activityRi);
        }
    }

    public abstract void ri(int i);

    public aw sf() {
        return this.f18041co;
    }

    public abstract void xha();

    private int lr(Activity activity) {
        return activity.hashCode();
    }

    public void ri(String str) {
        this.jbs = str;
    }

    public di ri() {
        return this.ka;
    }

    public void ri(mj mjVar) {
        this.sf = mjVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.ka
    public void ri(xha xhaVar) {
        String str;
        this.qt = xhaVar;
        if (ri() != null && ri().getWebView() != null) {
            if (TextUtils.isEmpty(this.jbs)) {
                this.qt.ri(102, "url is empty");
                return;
            }
            if (!this.f18041co.wjv()) {
                if (!com.bytedance.sdk.component.adexpress.ri.lr.lr.ri(this.ri)) {
                    xha xhaVar2 = this.qt;
                    StringBuilder sb = new StringBuilder("data null is ");
                    sb.append(this.ri == null);
                    xhaVar2.ri(103, sb.toString());
                    return;
                }
            } else if (ik() == 9 && !com.bytedance.sdk.component.adexpress.ri.lr.lr.lr(this.ri)) {
                xha xhaVar3 = this.qt;
                StringBuilder sb2 = new StringBuilder("data null is ");
                sb2.append(this.ri == null);
                xhaVar3.ri(103, sb2.toString());
                return;
            }
            this.f18041co.fi().ri(this.lr);
            if (this.lr) {
                try {
                    int iFr = this.f18041co.fr();
                    if (this.f18041co.wjv() && iFr == 1) {
                        this.f18041co.ik();
                        str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.f18041co.ik() + ";") + "window.SDK_TRIGGER_RENDER();";
                    } else {
                        str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
                    }
                    this.ka.bu();
                    this.f18041co.fi();
                    bgr.ri(this.ka.getWebView(), str);
                    return;
                } catch (Exception e) {
                    fi.ri().ka(this.ka);
                    this.qt.ri(102, "load exception is " + e.getMessage());
                    return;
                }
            }
            di diVarRi = ri();
            diVarRi.bu();
            this.f18041co.fi();
            diVarRi.a_(this.jbs);
            return;
        }
        xha xhaVar4 = this.qt;
        StringBuilder sb3 = new StringBuilder("SSWebview null is ");
        sb3.append(ri() == null);
        sb3.append(" or Webview is null");
        xhaVar4.ri(102, sb3.toString());
    }

    public void jbs() {
    }

    public void qt() {
    }

    public void ri(boolean z) {
        this.aw = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.sf
    public void ri(final com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
        if (bgrVar == null) {
            if (this.qt != null) {
                this.qt.ri(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zLr = bgrVar.lr();
        final float fIk = (float) bgrVar.ik();
        final float fKa = (float) bgrVar.ka();
        if (ik() == 0 && (fIk <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fKa <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            if (this.qt != null) {
                this.qt.ri(105, "width is " + fIk + "height is " + fKa);
                return;
            }
            return;
        }
        this.ik = zLr;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ri(bgrVar, fIk, fKa);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.fi.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    ri.this.ri(bgrVar, fIk, fKa);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ri(com.bytedance.sdk.component.adexpress.lr.bgr bgrVar, float f, float f2) {
        bgrVar.qt();
        boolean z = this.ik;
        if (z && !this.aw) {
            ri(f, f2);
            ri(this.fi);
            if (this.qt != null) {
                this.qt.ri(ri(), bgrVar);
                return;
            }
            return;
        }
        if (!z) {
            fi.ri().ka(this.ka);
        }
        ri(bgrVar.qt(), bgrVar.jbs());
    }

    @Override // com.bytedance.sdk.component.adexpress.lr.sf
    public void ri(View view, int i, com.bytedance.sdk.component.adexpress.ik ikVar) {
        mj mjVar = this.sf;
        if (mjVar != null) {
            mjVar.ri(view, i, ikVar);
        }
    }

    private void ri(float f, float f2) {
        this.f18041co.fi().fi();
        if (ik() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ri().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            ri().setLayoutParams(layoutParams);
            return;
        }
        int iRi = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.xha, f);
        int iRi2 = (int) com.bytedance.sdk.component.adexpress.ka.xha.ri(this.xha, f2);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ri().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iRi, iRi2);
        }
        layoutParams2.width = iRi;
        layoutParams2.height = iRi2;
        ri().setLayoutParams(layoutParams2);
    }

    private void ri(int i, String str) {
        if (this.qt != null) {
            this.qt.ri(i, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ri
    public void ri(Activity activity) {
        if (this.bgr == 0 || activity == null || activity.hashCode() != this.bgr) {
            return;
        }
        ka();
        qt();
    }

    public void ri(JSONObject jSONObject) {
        this.ri = jSONObject;
    }
}
