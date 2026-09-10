package com.bytedance.sdk.openadsdk.core.jbs;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.ory;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.google.android.material.card.MaterialCardView;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private int di;
    private ac fi;
    private ri ik;
    private int jbs;
    private com.bytedance.sdk.component.adexpress.lr.vr ka;
    private final Context lr;
    private ScheduledFuture<?> mj;
    com.bytedance.sdk.openadsdk.core.model.wjv ri;
    private int xha;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ik$ik, reason: collision with other inner class name */
    public interface InterfaceC0252ik {
        void lr(String str);

        void ri();

        void ri(int i, int i2);

        void ri(String str);
    }

    public static class lr implements Runnable {
        InterfaceC0252ik ri;

        public lr(InterfaceC0252ik interfaceC0252ik) {
            this.ri = interfaceC0252ik;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC0252ik interfaceC0252ik = this.ri;
            if (interfaceC0252ik != null) {
                interfaceC0252ik.ri(107, 107);
            }
        }
    }

    public static class ri implements com.bytedance.sdk.component.adexpress.lr.ka<View>, fi.lr {
        private int aw;
        private com.bytedance.sdk.component.adexpress.lr.xha bgr;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        private fi f18126co;
        private final int di;
        private final Context fi;
        private TTDislikeDialogAbstract ik;
        private com.bytedance.sdk.openadsdk.core.model.wjv jbs;
        private String ka;
        private com.bytedance.sdk.openadsdk.ik.ik lr;
        private FrameLayout mj;
        private final int qt;
        AtomicBoolean ri = new AtomicBoolean(false);
        private String sf;
        private PAGExpressAdWrapperListener vr;
        private final int xha;

        public ri(Context context, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, int i, int i2, String str, int i3) {
            this.sf = str;
            if (wjvVar != null && wjvVar.vgs()) {
                this.sf = "fullscreen_interstitial_ad";
            }
            this.fi = context;
            this.di = i;
            this.xha = i2;
            this.jbs = wjvVar;
            this.qt = qd.lr(context, 3.0f);
            this.aw = i3;
            di();
        }

        private void di() {
            FrameLayout frameLayout = new FrameLayout(this.fi);
            this.mj = frameLayout;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(this.di, this.xha);
            }
            layoutParams.width = this.di;
            layoutParams.height = this.xha;
            layoutParams.gravity = 17;
            this.mj.setLayoutParams(layoutParams);
            fi fiVarMj = mj();
            this.mj.addView(fiVarMj);
            View viewXha = xha();
            this.mj.addView(viewXha);
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.jbs;
            if (wjvVar != null && wjvVar.vgs()) {
                fiVarMj.setBackgroundColor(-16777216);
                fiVarMj.ri(((Activity) this.fi).findViewById(com.bytedance.sdk.openadsdk.utils.slm.zz), FriendlyObstructionPurpose.OTHER);
            }
            FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
            fiVarMj.ri(viewXha, friendlyObstructionPurpose);
            Context context = this.fi;
            if (context == null || !(context instanceof Activity)) {
                return;
            }
            View viewFindViewById = ((Activity) context).findViewById(com.bytedance.sdk.openadsdk.utils.slm.udw);
            if (viewFindViewById != null) {
                fiVarMj.ri(viewFindViewById, friendlyObstructionPurpose);
            }
            View viewFindViewById2 = ((Activity) this.fi).findViewById(com.bytedance.sdk.openadsdk.utils.slm.ugd);
            if (viewFindViewById2 != null) {
                fiVarMj.ri(viewFindViewById2, friendlyObstructionPurpose);
            }
        }

        private fi mj() {
            fi fiVarLr = ka.ri().lr();
            this.f18126co = fiVarLr;
            if (fiVarLr == null) {
                this.f18126co = new fi(this.fi);
            }
            ka.ri().ik(this.f18126co);
            this.f18126co.ri(this.jbs, this, this.sf);
            this.f18126co.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return this.f18126co;
        }

        private View xha() {
            PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.fi, this.jbs);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.jbs;
            if (wjvVar == null || !wjvVar.vgs()) {
                int i = this.qt;
                layoutParams.topMargin = i;
                layoutParams.leftMargin = i;
            } else {
                layoutParams.leftMargin = qd.lr(this.fi, 20.0f);
                layoutParams.bottomMargin = qd.lr(this.fi, 20.0f);
                layoutParams.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_BOTTOM_START;
            }
            pAGLogoViewCreatePAGLogoViewByMaterial.setLayoutParams(layoutParams);
            pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ik.ri.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTWebsiteActivity.ri(ri.this.fi, ri.this.jbs, ri.this.sf);
                }
            });
            return pAGLogoViewCreatePAGLogoViewByMaterial;
        }

        @Override // com.bytedance.sdk.component.adexpress.lr.ka
        public View fi() {
            return this.mj;
        }

        @Override // com.bytedance.sdk.component.adexpress.lr.ka
        public int ik() {
            return 5;
        }

        public void ka() {
            this.mj = null;
            this.lr = null;
            this.ik = null;
            this.bgr = null;
            this.jbs = null;
            fi fiVar = this.f18126co;
            if (fiVar != null) {
                fiVar.slm();
                ka.ri().ri(this.f18126co);
            }
            this.ri.set(true);
        }

        @Override // com.bytedance.sdk.openadsdk.core.jbs.fi.lr
        public void lr() {
            if (this.bgr != null) {
                com.bytedance.sdk.component.adexpress.lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.lr.bgr();
                bgrVar.ri(true);
                bgrVar.ri(qd.ik(this.fi, this.di));
                bgrVar.lr(qd.ik(this.fi, this.xha));
                this.bgr.ri(this.mj, bgrVar);
            }
        }

        @Override // com.bytedance.sdk.component.adexpress.lr.ka
        public void ri(com.bytedance.sdk.component.adexpress.lr.xha xhaVar) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
            if (this.ri.get()) {
                return;
            }
            if (this.fi == null || (wjvVar = this.jbs) == null) {
                xhaVar.ri(106, "material null");
                return;
            }
            this.bgr = xhaVar;
            if (TextUtils.isEmpty(wjvVar.rko())) {
                xhaVar.ri(106, "dsp data is null");
            } else {
                this.f18126co.ac();
            }
        }

        public void ri(ory oryVar) {
            if (oryVar instanceof com.bytedance.sdk.openadsdk.ik.ik) {
                this.lr = (com.bytedance.sdk.openadsdk.ik.ik) oryVar;
            }
        }

        public void ri(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
            com.bytedance.sdk.openadsdk.core.model.wjv wjvVar;
            if (tTDislikeDialogAbstract != null && (wjvVar = this.jbs) != null) {
                tTDislikeDialogAbstract.setMaterialMeta(wjvVar.yjg(), this.jbs.ib());
            }
            this.ik = tTDislikeDialogAbstract;
        }

        public void ri(String str) {
            this.ka = str;
        }

        @Override // com.bytedance.sdk.openadsdk.core.jbs.fi.lr
        public View ri() {
            FrameLayout frameLayout = this.mj;
            if (frameLayout == null) {
                return null;
            }
            return (View) frameLayout.getParent();
        }

        @Override // com.bytedance.sdk.openadsdk.core.jbs.fi.lr
        public void ri(View view, int i) {
            PAGExpressAdWrapperListener pAGExpressAdWrapperListener = this.vr;
            if (pAGExpressAdWrapperListener != null) {
                pAGExpressAdWrapperListener.onAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.jbs.fi.lr
        public void ri(int i, int i2) {
            com.bytedance.sdk.component.adexpress.lr.xha xhaVar = this.bgr;
            if (xhaVar != null) {
                xhaVar.ri(i, "render fail");
            }
        }

        public void ri(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
            this.vr = pAGExpressAdWrapperListener;
        }
    }

    public ik(Context context, ac acVar, com.bytedance.sdk.openadsdk.core.model.wjv wjvVar, String str) {
        this.ri = wjvVar;
        this.lr = context;
        this.fi = acVar;
        ri(acVar);
        this.ik = new ri(context, wjvVar, this.di, this.xha, str, this.jbs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ik() {
        try {
            ScheduledFuture<?> scheduledFuture = this.mj;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.mj.cancel(false);
            this.mj = null;
        } catch (Throwable unused) {
        }
    }

    private void ri(ac acVar) {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.ri;
        if (wjvVar != null && wjvVar.vgs()) {
            this.di = -1;
            this.xha = -1;
            return;
        }
        nr nrVarRi = com.bytedance.sdk.openadsdk.core.ka.lr.ri(acVar.getExpectExpressWidth(), acVar.getExpectExpressHeight());
        this.jbs = nrVarRi.ri;
        if (acVar.getExpectExpressWidth() <= 0 || acVar.getExpectExpressHeight() <= 0) {
            int iIk = qd.ik(this.lr);
            this.di = iIk;
            this.xha = Float.valueOf(iIk / nrVarRi.lr).intValue();
        } else {
            this.di = qd.lr(this.lr, acVar.getExpectExpressWidth());
            this.xha = qd.lr(this.lr, acVar.getExpectExpressHeight());
        }
        int i = this.di;
        if (i <= 0 || i <= qd.ik(this.lr)) {
            return;
        }
        float fIk = qd.ik(this.lr) / this.di;
        this.di = qd.ik(this.lr);
        this.xha = Float.valueOf(this.xha * fIk).intValue();
    }

    public void lr() {
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ka();
            this.ik = null;
        }
        ik();
        this.ka = null;
        this.fi = null;
    }

    public void ri(com.bytedance.sdk.component.adexpress.lr.vr vrVar) {
        this.ka = vrVar;
    }

    public void ri() {
        com.bytedance.sdk.openadsdk.core.model.wjv wjvVar = this.ri;
        if (wjvVar != null && wjvVar.vgs()) {
            this.mj = dzy.ri().schedule(new lr(this.ik.f18126co), com.bytedance.sdk.openadsdk.core.nr.ka().dzy(), TimeUnit.MILLISECONDS);
        }
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ri(new com.bytedance.sdk.component.adexpress.lr.xha() { // from class: com.bytedance.sdk.openadsdk.core.jbs.ik.1
                @Override // com.bytedance.sdk.component.adexpress.lr.xha
                public void ri(View view, com.bytedance.sdk.component.adexpress.lr.bgr bgrVar) {
                    if (ik.this.fi == null || view == null) {
                        if (ik.this.ka != null) {
                            ik.this.ka.a_(106);
                        }
                    } else if (ik.this.ka != null) {
                        ik.this.ka.ri(ik.this.ik, bgrVar);
                    }
                    ik.this.ik();
                }

                @Override // com.bytedance.sdk.component.adexpress.lr.xha
                public void ri(int i, String str) {
                    if (ik.this.ka != null) {
                        ik.this.ka.a_(106);
                    }
                    ik.this.ik();
                }
            });
            View viewFi = this.ik.fi();
            this.fi.removeView(viewFi);
            if (viewFi.getParent() != null) {
                ((ViewGroup) viewFi.getParent()).removeView(viewFi);
            }
            this.fi.addView(viewFi, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        com.bytedance.sdk.component.adexpress.lr.vr vrVar = this.ka;
        if (vrVar != null) {
            vrVar.a_(106);
        }
    }

    public void ri(ory oryVar) {
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ri(oryVar);
        }
    }

    public void ri(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ri(tTDislikeDialogAbstract);
        }
    }

    public void ri(String str) {
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ri(str);
        }
    }

    public void ri(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        ri riVar = this.ik;
        if (riVar != null) {
            riVar.ri(pAGExpressAdWrapperListener);
        }
    }
}
