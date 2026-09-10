package com.bytedance.sdk.component.adexpress.dynamic.Lxb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.LD.JVA;
import com.bytedance.sdk.component.adexpress.LD.NXR;
import com.bytedance.sdk.component.adexpress.LD.OY;
import com.bytedance.sdk.component.adexpress.LD.STP;
import com.bytedance.sdk.component.adexpress.LD.ZU;
import com.bytedance.sdk.component.adexpress.LD.ebl;
import com.bytedance.sdk.component.adexpress.dynamic.ZU.lc;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicRootView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.nJ;
import com.bytedance.sdk.component.adexpress.lk;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements JVA, ZU<DynamicRootView> {
    private OY JXs;
    private com.bytedance.sdk.component.adexpress.dynamic.JXs.OY LD;
    private DynamicRootView Lxb;
    private AtomicBoolean OY = new AtomicBoolean(false);
    private ebl ZU;
    private ScheduledFuture<?> ebl;
    private NXR lc;
    private Context lk;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb$Lxb, reason: collision with other inner class name */
    public class RunnableC0056Lxb implements Runnable {
        private int LD;

        public RunnableC0056Lxb(int i) {
            this.LD = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.LD == 2) {
                Lxb.this.Lxb.callBackRenderFail(Lxb.this.LD instanceof com.bytedance.sdk.component.adexpress.dynamic.JXs.ebl ? EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE, null);
            }
        }
    }

    public Lxb(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, com.bytedance.sdk.component.adexpress.dynamic.JXs.OY oy, NXR nxr, com.bytedance.sdk.component.adexpress.dynamic.lc.Lxb lxb) {
        this.lk = context;
        DynamicRootView dynamicRootView = new DynamicRootView(context, themeStatusBroadcastReceiver, z, nxr, lxb);
        this.Lxb = dynamicRootView;
        this.LD = oy;
        this.lc = nxr;
        dynamicRootView.setRenderListener(this);
        this.lc = nxr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void OY() {
        try {
            ScheduledFuture<?> scheduledFuture = this.ebl;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.ebl.cancel(false);
            this.ebl = null;
        } catch (Throwable unused) {
        }
    }

    private boolean ebl() {
        DynamicRootView dynamicRootView = this.Lxb;
        return (dynamicRootView == null || dynamicRootView.getChildCount() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lc() {
        this.lc.JXs().LD(lk());
        JSONObject jSONObjectLk = this.lc.lk();
        if (com.bytedance.sdk.component.adexpress.Lxb.LD.LD.Lxb(jSONObjectLk)) {
            this.LD.Lxb(new com.bytedance.sdk.component.adexpress.dynamic.lc.LD() { // from class: com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb.2
                @Override // com.bytedance.sdk.component.adexpress.dynamic.lc.LD
                public void Lxb(final com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
                    Lxb.this.OY();
                    Lxb.this.lc.JXs().lk(Lxb.this.lk());
                    Lxb.this.Lxb(oy);
                    Lxb.this.LD(oy);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        Lxb.this.lk(oy);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                Lxb.this.lk(oy);
                            }
                        });
                    }
                    if (Lxb.this.Lxb == null || oy == null) {
                        return;
                    }
                    Lxb.this.Lxb.setBgColor(oy.Lxb());
                    Lxb.this.Lxb.setBgMaterialCenterCalcColor(oy.LD());
                }
            });
            this.LD.Lxb(this.lc);
            return;
        }
        int i = this.LD instanceof com.bytedance.sdk.component.adexpress.dynamic.JXs.ebl ? 123 : 113;
        DynamicRootView dynamicRootView = this.Lxb;
        StringBuilder sb = new StringBuilder("data null is ");
        sb.append(jSONObjectLk == null);
        dynamicRootView.callBackRenderFail(i, sb.toString());
    }

    public DynamicRootView ZU() {
        return this.Lxb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void LD(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        float fEbl;
        float fLc;
        List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> listJVA;
        if (oy == null) {
            return;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> listJVA2 = oy.JVA();
        if (listJVA2 == null || listJVA2.size() <= 0) {
            fEbl = 0.0f;
        } else {
            fEbl = 0.0f;
            for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy2 : listJVA2) {
                if (oy2.ebl() > oy.ebl() - oy2.QAg() || (listJVA = oy2.JVA()) == null || listJVA.size() <= 0) {
                    fLc = 0.0f;
                } else {
                    fLc = 0.0f;
                    for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy3 : listJVA) {
                        if (oy3.nBu().LD().equals("logo-union")) {
                            fLc = oy3.nBu().lc();
                            fEbl = ((oy.ebl() + (-fLc)) - oy2.ebl()) + oy2.nBu().JXs().Iyd();
                        }
                    }
                }
                LD(oy2);
                if (fLc <= -15.0f) {
                    oy2.lc(oy2.QAg() - fLc);
                    oy2.ZU(oy2.ebl() + fLc);
                    for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy4 : oy2.JVA()) {
                        oy4.ZU(oy4.ebl() - fLc);
                    }
                }
            }
        }
        com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oySLN = oy.sLN();
        if (oySLN == null) {
            return;
        }
        float fLc2 = oy.lc() - oySLN.lc();
        float fEbl2 = oy.ebl() - oySLN.ebl();
        oy.lk(fLc2);
        oy.ZU(fEbl2);
        if (fEbl > 0.0f) {
            oy.ZU(oy.ebl() - fEbl);
            oy.lc(oy.QAg() + fEbl);
            for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy5 : oy.JVA()) {
                oy5.ZU(oy5.ebl() + fEbl);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    public void Lxb(ebl eblVar) {
        this.ZU = eblVar;
        int iLc = this.lc.lc();
        if (iLc < 0) {
            this.Lxb.callBackRenderFail(this.LD instanceof com.bytedance.sdk.component.adexpress.dynamic.JXs.ebl ? EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE, "time is ".concat(String.valueOf(iLc)));
            return;
        }
        this.ebl = com.bytedance.sdk.component.adexpress.ZU.ZU.Lxb(new RunnableC0056Lxb(2), iLc, TimeUnit.MILLISECONDS);
        if (Looper.getMainLooper() == Looper.myLooper() && this.lc.QAg() <= 0) {
            lc();
        } else {
            com.bytedance.sdk.component.utils.ebl.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    Lxb.this.lc();
                }
            }, this.lc.QAg());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    public int lk() {
        return this.LD instanceof com.bytedance.sdk.component.adexpress.dynamic.JXs.ebl ? 3 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lk(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        if (oy == null) {
            this.Lxb.callBackRenderFail(this.LD instanceof com.bytedance.sdk.component.adexpress.dynamic.JXs.ebl ? 123 : 113, "layoutUnit is null");
            return;
        }
        this.lc.JXs().ZU(lk());
        try {
            this.Lxb.render(oy, lk());
        } catch (Exception e) {
            int i = this.LD instanceof com.bytedance.sdk.component.adexpress.dynamic.JXs.ebl ? 128 : EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE;
            this.Lxb.callBackRenderFail(i, "exception is " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy) {
        List<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY> listJVA;
        if (oy == null || (listJVA = oy.JVA()) == null || listJVA.size() <= 0) {
            return;
        }
        Collections.sort(listJVA, new Comparator<com.bytedance.sdk.component.adexpress.dynamic.ZU.OY>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.Lxb.Lxb.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
            public int compare(com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy2, com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy3) {
                lc lcVarJXs = oy2.nBu().JXs();
                lc lcVarJXs2 = oy3.nBu().JXs();
                if (lcVarJXs == null || lcVarJXs2 == null) {
                    return 0;
                }
                return lcVarJXs.wCT() >= lcVarJXs2.wCT() ? 1 : -1;
            }
        });
        for (com.bytedance.sdk.component.adexpress.dynamic.ZU.OY oy2 : listJVA) {
            if (oy2 != null) {
                Lxb(oy2);
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.ZU
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public DynamicRootView JXs() {
        return ZU();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Lxb(View view) {
        if (view == 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    break;
                }
                Lxb(viewGroup.getChildAt(i));
                i++;
            }
        }
        if (view instanceof nJ) {
            ((nJ) view).LD();
        }
    }

    public void Lxb(OY oy) {
        this.JXs = oy;
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.JVA
    public void Lxb(STP stp) {
        if (this.OY.get()) {
            return;
        }
        this.OY.set(true);
        if (stp.lk() && ebl()) {
            this.Lxb.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.ZU.Lxb(JXs(), stp);
            return;
        }
        this.ZU.Lxb(stp.JVA(), stp.nBu());
    }

    public void LD() {
        Lxb(JXs());
    }

    @Override // com.bytedance.sdk.component.adexpress.LD.JVA
    public void Lxb(View view, int i, lk lkVar) {
        OY oy = this.JXs;
        if (oy != null) {
            oy.Lxb(view, i, lkVar);
        }
    }
}
