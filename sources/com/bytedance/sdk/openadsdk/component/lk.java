package com.bytedance.sdk.openadsdk.component;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.QAg.OY;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.VVE;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.IeN;
import com.bytedance.sdk.openadsdk.utils.le;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private com.bytedance.sdk.openadsdk.core.JXs.ZU CSn;
    private float DY;

    @NonNull
    private final OY HD = new OY();
    private com.bytedance.sdk.openadsdk.core.JXs.OY IeN;
    protected final com.bytedance.sdk.openadsdk.component.OY.Lxb JVA;
    protected final com.bytedance.sdk.openadsdk.component.Lxb JXs;
    protected final tD LD;
    protected final Activity Lxb;
    private ImageView NXR;
    protected FrameLayout OY;
    protected View QAg;
    private PAGLogoView STP;
    private float Sfi;
    private ImageView VVE;
    protected final FrameLayout ZU;
    private com.bytedance.sdk.openadsdk.core.JXs.OY aH;
    private com.bytedance.sdk.openadsdk.core.JXs.OY brP;
    private com.bytedance.sdk.openadsdk.component.OY.lk eK;
    protected int ebl;
    private View foI;
    private VVE id;
    private kqm kqm;
    protected final int lc;
    protected final boolean lk;
    protected com.bytedance.sdk.openadsdk.core.JXs.ZU nBu;
    private RelativeLayout sLN;
    private com.bytedance.sdk.openadsdk.core.JXs.OY tD;

    public static class LD implements IeN.Lxb {
        private final WeakReference<lk> Lxb;

        public LD(lk lkVar) {
            this.Lxb = new WeakReference<>(lkVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.IeN.Lxb
        public void Lxb() {
        }

        @Override // com.bytedance.sdk.openadsdk.utils.IeN.Lxb
        public void Lxb(com.bytedance.sdk.openadsdk.kqm.Lxb.LD ld) {
            lk lkVar;
            if (!ld.ZU() || (lkVar = this.Lxb.get()) == null) {
                return;
            }
            lkVar.Lxb(ld);
            if (ld.LD() != null) {
                lkVar.Lxb(ld.Lxb());
            }
        }
    }

    public class Lxb implements lc.ZU {
        WeakReference<Activity> Lxb;

        public Lxb(Activity activity) {
            this.Lxb = new WeakReference<>(activity);
        }

        @Override // com.bytedance.sdk.openadsdk.component.lc.ZU
        public void Lxb(Bitmap bitmap) {
            if (this.Lxb.get() == null || this.Lxb.get().isFinishing()) {
                return;
            }
            lk.this.Lxb(bitmap);
        }
    }

    public lk(Activity activity, tD tDVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.Lxb lxb, int i, boolean z, com.bytedance.sdk.openadsdk.component.OY.Lxb lxb2) {
        this.Lxb = activity;
        this.LD = tDVar;
        this.ZU = frameLayout;
        this.ebl = i;
        this.lk = z;
        this.JXs = lxb;
        this.lc = tDVar.Td();
        this.JVA = lxb2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    private void OY() {
        boolean z;
        this.HD.Lxb();
        this.IeN.setText(this.LD.xr());
        if (this.LD.kVf()) {
            QAg();
            return;
        }
        if (this.lk) {
            LD(0);
            Lxb(8);
            if (Lxb(this.OY)) {
                this.JXs.lk();
            } else {
                this.JXs.ZU();
            }
            lc.Lxb(this.LD, new Lxb(this.Lxb), 25);
        } else {
            LD(8);
            Lxb(0);
            nBu();
            this.JXs.lk();
        }
        boolean z2 = true;
        if (this.aH == null) {
            z = false;
        } else {
            if (!TextUtils.isEmpty(this.LD.VU())) {
                this.aH.setText(this.LD.VU());
            } else if (this.LD.MGT() != null) {
                this.aH.setText(this.LD.MGT().LD());
            } else {
                z = false;
            }
            z = true;
        }
        if (this.CSn != null) {
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.LD.Lpq(), this.CSn, this.LD);
        }
        VVE vve = this.id;
        if (vve != null) {
            le.Lxb((TextView) null, vve, this.LD);
            if (this.LD.MGT() == null || this.LD.MGT().ZU() < 0.0d) {
                this.id.setVisibility(8);
                z2 = z;
            }
        } else {
            z2 = z;
        }
        View view = this.foI;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    private void QAg() {
        if (this.brP != null) {
            if (this.LD.MGT() != null && !TextUtils.isEmpty(this.LD.MGT().LD())) {
                this.brP.setText(this.LD.MGT().LD());
            } else if (TextUtils.isEmpty(this.LD.VU())) {
                this.brP.setVisibility(8);
            } else {
                this.brP.setText(this.LD.VU());
            }
        }
        if (this.tD != null) {
            if (TextUtils.isEmpty(this.LD.FD())) {
                this.tD.setVisibility(8);
            } else {
                this.tD.setText(this.LD.FD());
            }
        }
        if (this.kqm != null && this.LD.Lpq() != null && !TextUtils.isEmpty(this.LD.Lpq().Lxb())) {
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.LD.Lpq().Lxb(), this.LD.Lpq().LD(), this.LD.Lpq().lk(), this.kqm, this.LD);
        }
        this.JXs.lk();
    }

    private void nBu() {
        com.bytedance.sdk.openadsdk.core.model.IeN ieN = this.LD.uxf().get(0);
        IeN.Lxb(new com.bytedance.sdk.openadsdk.kqm.Lxb(ieN.Lxb(), ieN.ebl()), ieN.LD(), ieN.lk(), new LD(this), com.bytedance.sdk.openadsdk.component.ebl.Lxb.LD(TextUtils.isEmpty(ieN.ebl()) ? com.bytedance.sdk.component.utils.JXs.Lxb(ieN.Lxb()) : ieN.ebl()).getParent(), 25);
    }

    public void JXs() {
    }

    public void LD() {
        if (this.LD.Iyd()) {
            this.JXs.lk();
        } else {
            OY();
        }
    }

    public JSONObject Lxb(JSONObject jSONObject) {
        return null;
    }

    public int ZU() {
        return -1;
    }

    public com.bytedance.sdk.openadsdk.component.OY.lk ebl() {
        return this.eK;
    }

    public void lc() {
        this.QAg.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lk.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.Lxb lxb = lk.this.JXs;
                if (lxb != null) {
                    lxb.LD(view);
                }
            }
        });
        this.nBu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lk.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.bytedance.sdk.openadsdk.component.Lxb lxb = lk.this.JXs;
                if (lxb != null) {
                    lxb.Lxb(view);
                }
            }
        });
    }

    public void lk() {
        com.bytedance.sdk.openadsdk.component.OY.lk lkVar = this.eK;
        if (lkVar != null) {
            lkVar.JVA();
        }
    }

    public void Lxb(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.QAg.lk zu = new com.bytedance.sdk.openadsdk.component.QAg.ZU(this.Lxb);
        int iSTP = this.LD.STP();
        if (iSTP == 5) {
            zu = new com.bytedance.sdk.openadsdk.component.QAg.lc(this.Lxb);
        } else if (iSTP == 4) {
            zu = new com.bytedance.sdk.openadsdk.component.QAg.JXs(this.Lxb, this.LD);
        }
        this.sLN = zu;
        viewGroup.addView(zu);
        this.VVE = zu.getBackImage();
        this.OY = zu.getVideoContainer();
        this.NXR = zu.getImageView();
        this.IeN = zu.getClickButton();
        this.STP = zu.getAdLogo();
        this.aH = zu.getAdTitleTextView();
        this.CSn = zu.getAdIconView();
        this.id = zu.getScoreBar();
        this.foI = zu.getOverlayLayout();
        if (this.LD.kVf()) {
            this.kqm = zu.getIconOnlyView();
            this.brP = zu.getTitle();
            this.tD = zu.getContent();
        }
        if (zu.getDspAdChoice() != null) {
            zu.getDspAdChoice().Lxb(14, this.LD);
        }
        if (!this.LD.Iyd()) {
            this.HD.Lxb(zu, this.LD, this.Sfi, this.DY, this.lk);
        }
        this.QAg = zu.getTopDisLike();
        this.nBu = zu.getTopSkip();
        if (zu instanceof com.bytedance.sdk.openadsdk.component.QAg.JXs) {
            ((com.bytedance.sdk.openadsdk.component.QAg.JXs) zu).setRenderListener(new com.bytedance.sdk.openadsdk.component.QAg.JXs.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.lk.1
                @Override // com.bytedance.sdk.openadsdk.component.QAg.JXs.Lxb
                public void Lxb(View view, int i) {
                    lk.this.JXs.JXs();
                }
            });
        }
    }

    private void LD(int i) {
        le.Lxb((View) this.OY, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void Lxb() {
        this.STP.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.lk.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    lk lkVar = lk.this;
                    TTWebsiteActivity.Lxb(lkVar.Lxb, lkVar.LD, "open_ad");
                } catch (Throwable th) {
                    sLN.Lxb("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        lc();
        if (this.LD.Iyd()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.Lxb.Lxb Lxb2 = com.bytedance.sdk.openadsdk.component.Lxb.LD.Lxb(this.LD, this.Lxb, this.JVA);
        Lxb2.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.component.lk.3
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
            public void Lxb(View view, int i) {
                lk.this.JXs.JXs();
            }
        });
        Lxb2.Lxb(this.eK);
        if (this.LD.NXR() == 1) {
            this.sLN.setOnClickListener(Lxb2);
            this.sLN.setOnTouchListener(Lxb2);
        }
        this.IeN.setOnClickListener(Lxb2);
        this.IeN.setOnTouchListener(Lxb2);
    }

    public boolean Lxb(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.OY.lk lkVar = new com.bytedance.sdk.openadsdk.component.OY.lk(this.Lxb);
        this.eK = lkVar;
        return lkVar.Lxb(frameLayout, this.JXs, this.LD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                this.VVE.setImageDrawable(new BitmapDrawable(com.bytedance.sdk.openadsdk.core.kqm.Lxb().getResources(), bitmap));
            } catch (Throwable unused) {
                sLN.Lxb("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
            }
        }
    }

    public void Lxb(com.bytedance.sdk.openadsdk.kqm.Lxb.LD ld) {
        if (ld.LD() != null) {
            this.NXR.setImageBitmap(ld.LD());
            return;
        }
        if (this.LD.uxf() == null || this.LD.uxf().get(0) == null) {
            return;
        }
        Drawable drawableLxb = IeN.Lxb(ld.lk(), this.LD.uxf().get(0).LD());
        this.NXR.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.NXR.setImageDrawable(drawableLxb);
    }

    public void Lxb(int i) {
        le.Lxb((View) this.NXR, i);
    }

    public void Lxb(float f, float f2) {
        this.Sfi = f;
        this.DY = f2;
    }

    public void Lxb(int i, int i2, boolean z) {
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = this.nBu;
        if (zu == null) {
            return;
        }
        int i3 = z ? 0 : 8;
        if (zu.getVisibility() != i3) {
            this.nBu.setVisibility(i3);
        }
    }
}
