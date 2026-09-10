package com.bytedance.sdk.openadsdk.core.NXR.LD;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.badlogic.gdx.Input;
import com.bytedance.sdk.component.JXs.JVA;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.component.utils.aH;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.core.widget.brP;
import com.bytedance.sdk.openadsdk.core.widget.tD;
import com.bytedance.sdk.openadsdk.utils.QAg;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import com.bytedance.sdk.openadsdk.utils.nJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.So0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SurfaceHolderCallbackC4875vo0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TextureViewSurfaceTextureListenerC4871vm0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.To0;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class JXs implements RG, GK, aH.Lxb, com.bytedance.sdk.openadsdk.core.LD.Lxb.InterfaceC0093Lxb, brP.Lxb, tD.LD {
    private long BcA;
    com.bytedance.sdk.openadsdk.core.LD.Lxb CG;
    com.bytedance.sdk.openadsdk.core.model.tD CSn;
    int DY;
    boolean HD;
    TextView IeN;
    boolean Ivz;
    ImageView JVA;
    ImageView JXs;
    Lxb KPU;
    protected final int LD;
    protected final int Lxb;
    com.bytedance.sdk.openadsdk.core.widget.Lxb NXR;
    ImageView OY;
    View QAg;
    TextView STP;
    boolean Sfi;
    TextView VVE;
    TG ZU;
    int aH;
    int brP;
    int eK;
    View ebl;
    tD foI;
    com.bytedance.sdk.openadsdk.core.LD.Lxb hg;
    Context id;
    int kqm;
    View lc;
    private lc.Lxb le;
    ViewGroup lk;
    View nBu;
    com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc nE;
    boolean nJ;
    private final String rW;
    View sLN;
    int tD;
    So0 xan;

    public JXs(Context context, ViewGroup viewGroup, boolean z, int i, com.bytedance.sdk.openadsdk.core.model.tD tDVar, So0 so0) {
        this(context, viewGroup, z, i, tDVar, so0, true);
    }

    private boolean CSn() {
        return com.bytedance.sdk.openadsdk.core.model.tD.JXs(this.CSn) && (!com.bytedance.sdk.openadsdk.core.JVA.lk.Lxb(this.CSn.id()) ? this.CSn.rW() == null : this.CSn.dR() == null) && this.CSn.CSn() == 1;
    }

    public void DY() {
        ImageView imageView = this.JVA;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        com.bytedance.sdk.openadsdk.core.widget.Lxb lxb = this.NXR;
        if (lxb != null) {
            lxb.setImageBitmap(null);
        }
    }

    public boolean HD() {
        return this.HD;
    }

    public void IeN() {
        tD tDVar = this.foI;
        if (tDVar != null) {
            tDVar.Lxb(false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.tD.LD
    public void JVA() {
        Lxb(true, false);
    }

    public void JXs() {
    }

    public void LD(ViewGroup viewGroup) {
    }

    public void Lxb(int i) {
    }

    public TG NXR() {
        return this.ZU;
    }

    public void OY() {
        le.JXs(this.lc);
    }

    public void QAg() {
        ZU(8);
        if (aH()) {
            this.ZU.setVisibility(8);
        }
        ImageView imageView = this.OY;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        ZU(8);
        le.Lxb(this.nBu, 8);
        le.Lxb((View) this.JVA, 8);
        le.Lxb(this.sLN, 8);
        le.Lxb((View) this.NXR, 8);
        le.Lxb((View) this.STP, 8);
        le.Lxb((View) this.IeN, 8);
        tD tDVar = this.foI;
        if (tDVar != null) {
            tDVar.Lxb(true);
        }
    }

    public void STP() {
        if (this.KPU == null || this.foI != null) {
            return;
        }
        System.currentTimeMillis();
        tD tDVar = new tD();
        this.foI = tDVar;
        tDVar.Lxb(this.id, this.lk);
        this.foI.Lxb(this.KPU, this);
        System.currentTimeMillis();
    }

    public boolean Sfi() {
        return this.Sfi;
    }

    public boolean VVE() {
        if (this.KPU != null) {
            return true;
        }
        sLN.Lxb("NewLiveViewLayout", "callback is null");
        return false;
    }

    public void ZU() {
        this.ZU.a(this);
        this.JXs.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.JXs.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (JXs.this.VVE()) {
                    TextView textView = JXs.this.VVE;
                    if (textView == null || textView.getVisibility() != 0) {
                        JXs jXs = JXs.this;
                        jXs.KPU.Lxb(jXs, view);
                    }
                }
            }
        });
    }

    public boolean aH() {
        return (this.aH & 4) != 4 || this.Sfi;
    }

    @TargetApi(14)
    public void brP() {
        le.Lxb((View) this.lk, 0);
        TG tg = this.ZU;
        if (tg != null) {
            le.Lxb(tg.getView(), 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.brP.Lxb
    public boolean eK() {
        tD tDVar = this.foI;
        return tDVar != null && tDVar.Lxb();
    }

    public void ebl() {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar;
        le.lc(this.lc);
        le.lc(this.ebl);
        if (this.OY != null && (tDVar = this.CSn) != null && tDVar.JJ() != null && this.CSn.JJ().f != null) {
            le.lc(this.OY);
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.CSn.JJ().f, this.CSn.JJ().b, this.CSn.JJ().f3307a, this.OY, this.CSn);
        }
        if (this.JXs.getVisibility() == 0) {
            le.Lxb((View) this.JXs, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb.InterfaceC0093Lxb
    public long getVideoProgress() {
        if (this.BcA <= 0) {
            com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.CSn;
            if (tDVar != null && tDVar.JJ() != null) {
                this.BcA = (long) (this.CSn.JJ().d * 1000.0d);
            }
            So0 so0 = this.xan;
            if (so0 != null) {
                this.BcA = so0.OY();
            }
        }
        return this.BcA;
    }

    public void kqm() {
        le.lc(this.lc);
        le.lc(this.ebl);
        if (this.JXs.getVisibility() == 0) {
            le.Lxb((View) this.JXs, 8);
        }
    }

    public void lc() {
    }

    public void lk(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.tD.LD
    public boolean nBu() {
        return false;
    }

    public void sLN() {
        String str;
        int i;
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb;
        String str2 = this.Ivz ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.CSn.cR()) {
            str = "rewarded_video";
            i = 7;
        } else if (this.CSn.IG()) {
            str = "fullscreen_interstitial_ad";
            i = 5;
        } else if (this.CSn.qEi()) {
            str = "banner_ad";
            i = 2;
        } else {
            str = str2;
            i = 1;
        }
        if (this.CSn.sRq() == 4) {
            this.nE = ebl.Lxb(this.id, this.CSn, str);
        }
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb2 = new com.bytedance.sdk.openadsdk.core.LD.Lxb(this.id, this.CSn, str, i);
        this.hg = lxb2;
        lxb2.Lxb(this);
        this.hg.LD(true);
        if (this.Ivz) {
            this.hg.Lxb(true);
        } else {
            this.hg.Lxb(false);
            this.hg.lk(true);
        }
        this.hg.Lxb(this.xan);
        this.hg.JXs(true);
        this.hg.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.JXs.1
            @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
            public void Lxb(View view, int i2) {
                if (JXs.this.le != null) {
                    JXs.this.le.Lxb(view, i2);
                }
            }
        });
        com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar = this.nE;
        if (lcVar != null && (lxb = this.hg) != null) {
            lxb.Lxb(lcVar);
        }
        if (CSn()) {
            com.bytedance.sdk.openadsdk.core.LD.Lxb lxb3 = new com.bytedance.sdk.openadsdk.core.LD.Lxb(this.id, this.CSn, str, i) { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.JXs.2
                @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb
                public boolean LD() {
                    tD tDVar = JXs.this.foI;
                    boolean zLxb = tDVar != null ? tDVar.Lxb() : false;
                    JXs.this.JXs.getVisibility();
                    return zLxb || JXs.this.JXs.getVisibility() == 0;
                }

                @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb
                public boolean lk() {
                    View view = JXs.this.nBu;
                    if (view != null && view.getVisibility() == 0) {
                        return true;
                    }
                    View view2 = JXs.this.sLN;
                    if (view2 != null && view2.getVisibility() == 0) {
                        return true;
                    }
                    com.bytedance.sdk.openadsdk.core.widget.Lxb lxb4 = JXs.this.NXR;
                    if (lxb4 != null && lxb4.getVisibility() == 0) {
                        return true;
                    }
                    TextView textView = JXs.this.STP;
                    return textView != null && textView.getVisibility() == 0;
                }
            };
            this.CG = lxb3;
            lxb3.Lxb(new com.bytedance.sdk.openadsdk.core.LD.LD.Lxb() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.JXs.3
                @Override // com.bytedance.sdk.openadsdk.core.LD.LD.Lxb
                public void Lxb(View view, int i2) {
                    if (JXs.this.le != null) {
                        JXs.this.le.Lxb(view, i2);
                    }
                }
            });
            this.CG.LD(true);
            this.CG.Lxb(this.Ivz);
            this.CG.Lxb(this.xan);
            this.CG.JXs(true);
            com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.lc lcVar2 = this.nE;
            if (lcVar2 != null) {
                this.CG.Lxb(lcVar2);
            }
            this.CG.Lxb(this);
        }
    }

    public void tD() {
        try {
            le.Lxb(this.nBu, 8);
            le.Lxb((View) this.JVA, 8);
            le.Lxb(this.sLN, 8);
            le.Lxb((View) this.NXR, 8);
            le.Lxb((View) this.STP, 8);
            le.Lxb((View) this.IeN, 8);
            le.Lxb((View) this.VVE, 8);
        } catch (Exception unused) {
        }
    }

    private int JXs(int i) {
        if (this.tD <= 0 || this.DY <= 0) {
            return 0;
        }
        int iLk = le.lk(this.id, 228.0f);
        int iLk2 = le.lk(this.id, 160.0f);
        int i2 = (int) (this.DY * ((i * 1.0f) / this.tD));
        if (i2 > iLk) {
            return iLk;
        }
        return i2 < iLk2 ? iLk2 : i2;
    }

    private void lc(int i) {
        le.Lxb(this.sLN, i);
    }

    public void LD(boolean z) {
    }

    public void Lxb(long j) {
    }

    public void lk(int i) {
        le.Lxb((View) this.lk, 0);
        TG tg = this.ZU;
        if (tg != null) {
            tg.setVisibility(i);
        }
    }

    public JXs(Context context, ViewGroup viewGroup, boolean z, int i, com.bytedance.sdk.openadsdk.core.model.tD tDVar, So0 so0, boolean z2) {
        this.Lxb = 228;
        this.LD = Input.Keys.NUMPAD_ENTER;
        this.Sfi = true;
        this.Ivz = true;
        this.nJ = true;
        this.rW = Build.MODEL;
        if (this instanceof ZU) {
            return;
        }
        this.id = kqm.Lxb().getApplicationContext();
        ZU(z2);
        this.lk = viewGroup;
        this.Sfi = z;
        this.aH = i;
        this.xan = so0;
        this.CSn = tDVar;
        ZU(8);
        Lxb(context, this.lk);
        ZU();
        sLN();
    }

    public boolean LD(int i) {
        return false;
    }

    public void Lxb(long j, long j2) {
    }

    public void ZU(boolean z) {
        this.Ivz = z;
        if (z) {
            com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = this.hg;
            if (lxb != null) {
                lxb.Lxb(true);
            }
            com.bytedance.sdk.openadsdk.core.LD.Lxb lxb2 = this.CG;
            if (lxb2 != null) {
                lxb2.Lxb(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb3 = this.hg;
        if (lxb3 != null) {
            lxb3.Lxb(false);
        }
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb4 = this.CG;
        if (lxb4 != null) {
            lxb4.Lxb(false);
        }
    }

    public void LD(boolean z, boolean z2) {
        ImageView imageView = this.JXs;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(QAg.Lxb(this.id, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(QAg.Lxb(this.id, "tt_stop_movebar_textpage"));
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.aH.Lxb
    public void Lxb(Message message) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.brP.Lxb
    public void Lxb(View view, boolean z) {
    }

    public void lk(int i, int i2) {
        this.tD = i;
        this.DY = i2;
    }

    public void Lxb(ViewGroup viewGroup) {
    }

    public void LD(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.lk.getLayoutParams();
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.lk.setLayoutParams(layoutParams);
    }

    public void Lxb(String str) {
    }

    public void lk(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.lk.getParent() == null) {
            viewGroup.addView(this.lk);
        }
        ZU(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG
    @SuppressLint({"ClickableViewAccessibility"})
    public /* bridge */ /* synthetic */ void Lxb(Object obj, WeakReference weakReference, boolean z) {
        Lxb((com.bytedance.sdk.openadsdk.core.model.tD) obj, (WeakReference<Context>) weakReference, z);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG
    public View lk() {
        return this.lk;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG
    public void LD() {
        le.JXs(this.lc);
        le.JXs(this.ebl);
        ImageView imageView = this.OY;
        if (imageView != null) {
            le.JXs(imageView);
        }
    }

    public void Lxb(lc.Lxb lxb) {
        this.le = lxb;
    }

    public void Lxb(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb = this.hg;
        if (lxb != null) {
            lxb.Lxb(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.LD.Lxb lxb2 = this.CG;
        if (lxb2 != null) {
            lxb2.Lxb(pAGNativeAd);
        }
    }

    public void ZU(int i) {
        this.eK = i;
        le.Lxb((View) this.lk, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GK
    public void LD(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.ZU.getHolder()) {
            return;
        }
        this.HD = false;
        if (VVE()) {
            this.KPU.LD(this, surfaceHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.ViewGroup, android.widget.RelativeLayout] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.View, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TG] */
    public void Lxb(Context context, View view) {
        ?? textureViewSurfaceTextureListenerC4871vm0;
        System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.CSn;
        if ((tDVar == null || ((!tDVar.mW() && !this.CSn.qEi()) || VVE.TA().chu())) && view != null) {
            view.setKeepScreenOn(true);
        }
        So0 so0 = this.xan;
        if (so0 != null && so0.kqm()) {
            textureViewSurfaceTextureListenerC4871vm0 = new TextureViewSurfaceTextureListenerC4871vm0(this.id, null);
        } else {
            To0 to0 = new To0(this.id);
            SurfaceHolderCallbackC4875vo0 surfaceHolderCallbackC4875vo0 = new SurfaceHolderCallbackC4875vo0(to0);
            to0.b = surfaceHolderCallbackC4875vo0;
            To0.c.add(surfaceHolderCallbackC4875vo0);
            textureViewSurfaceTextureListenerC4871vm0 = to0;
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(textureViewSurfaceTextureListenerC4871vm0, 0, layoutParams);
        }
        le.Lxb((View) textureViewSurfaceTextureListenerC4871vm0, 8);
        this.ZU = textureViewSurfaceTextureListenerC4871vm0;
        this.JXs = (ImageView) view.findViewById(STP.nH);
        this.lc = view.findViewById(STP.Bj);
        this.ebl = view.findViewById(STP.goy);
        this.OY = (ImageView) view.findViewById(STP.FtP);
        this.QAg = view.findViewById(STP.owi);
        System.currentTimeMillis();
    }

    public void Lxb(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.QAg) == null || view2.getParent() == null || this.nBu != null) {
            return;
        }
        this.nBu = this.QAg;
        this.JVA = (ImageView) view.findViewById(STP.ek);
        this.sLN = view.findViewById(STP.TA);
        this.NXR = (com.bytedance.sdk.openadsdk.core.widget.Lxb) view.findViewById(STP.dR);
        this.STP = (TextView) view.findViewById(STP.NDz);
        this.IeN = (TextView) view.findViewById(STP.JJ);
        this.VVE = (TextView) view.findViewById(STP.VU);
    }

    public boolean Lxb(int i, KG kg, boolean z) {
        tD tDVar = this.foI;
        return tDVar == null || tDVar.Lxb(i, kg, z);
    }

    public void Lxb(FK fk) {
        if (fk instanceof Lxb) {
            this.KPU = (Lxb) fk;
            STP();
        }
    }

    public void Lxb(int i, int i2) {
        if (i == -1) {
            i = le.lk(this.id);
        }
        if (i <= 0) {
            return;
        }
        this.kqm = i;
        if (!Sfi() && !nBu() && (this.aH & 8) != 8) {
            this.brP = JXs(i);
        } else {
            this.brP = i2;
        }
        LD(this.kqm, this.brP);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG
    public void Lxb() {
        Lxb(false, this.Sfi);
        tD();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG
    public void Lxb(boolean z) {
        this.nJ = z;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x0212  */
    @SuppressLint({"ClickableViewAccessibility"})
    public void Lxb(final com.bytedance.sdk.openadsdk.core.model.tD tDVar, WeakReference<Context> weakReference, boolean z) {
        String strAe;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar2;
        com.bytedance.sdk.openadsdk.core.model.tD tDVar3;
        if (tDVar == null) {
            return;
        }
        Lxb(false, this.Sfi);
        Lxb(this.lk, kqm.Lxb());
        View view = this.nBu;
        if (view != null) {
            le.Lxb(view, 0);
        }
        ImageView imageView = this.JVA;
        if (imageView != null) {
            le.Lxb((View) imageView, 0);
        }
        le.Lxb(this.sLN, 0);
        if (this.JVA != null && (tDVar3 = this.CSn) != null && tDVar3.JJ() != null && this.CSn.JJ().f != null) {
            com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.CSn.JJ().f, this.CSn.JJ().b, this.CSn.JJ().f3307a, this.JVA, tDVar);
        }
        if (!TextUtils.isEmpty(tDVar.VU())) {
            strAe = tDVar.VU();
        } else if (!TextUtils.isEmpty(tDVar.FD())) {
            strAe = tDVar.FD();
        } else if (!TextUtils.isEmpty(tDVar.ae())) {
            strAe = tDVar.ae();
        } else {
            strAe = "";
        }
        if (this.NXR != null && (tDVar2 = this.CSn) != null && tDVar2.Lpq() != null && this.CSn.Lpq().Lxb() != null) {
            le.Lxb((View) this.NXR, 0);
            le.Lxb((View) this.STP, 4);
            com.bytedance.sdk.openadsdk.core.model.tD tDVar4 = this.CSn;
            if (tDVar4 != null && tDVar4.chu()) {
                com.bytedance.sdk.openadsdk.QAg.ZU.Lxb(this.CSn.Lpq()).lk(2).Lxb(new com.bytedance.sdk.openadsdk.QAg.LD(tDVar, this.CSn.Lpq().Lxb(), new com.bytedance.sdk.component.JXs.VVE<Bitmap>() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.JXs.5
                    @Override // com.bytedance.sdk.component.JXs.VVE
                    public void Lxb(JVA<Bitmap> jva) {
                        if (jva == null || jva.LD() == null) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.core.widget.Lxb lxb = JXs.this.NXR;
                        if (lxb != null) {
                            lxb.setImageBitmap(jva.LD());
                        }
                        com.bytedance.sdk.openadsdk.ZU.lk.LD(JXs.this.CSn, JXs.this.CSn != null ? nJ.lk(tDVar.lJ()) : null, "load_vast_icon_success", (JSONObject) null);
                    }

                    @Override // com.bytedance.sdk.component.JXs.VVE
                    public void Lxb(int i, String str, Throwable th) {
                        JXs.this.Lxb(i, str, tDVar);
                    }
                }));
                if (this.CSn.SlV() != null && this.CSn.SlV().LD() != null) {
                    this.CSn.SlV().LD().LD(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(this.CSn.Lpq(), this.NXR, tDVar);
            }
            com.bytedance.sdk.openadsdk.core.model.tD tDVar5 = this.CSn;
            if (tDVar5 != null && tDVar5.chu()) {
                try {
                    this.NXR.setTag(570425345, "VAST_ICON");
                } catch (Throwable unused) {
                }
            }
            com.bytedance.sdk.openadsdk.core.model.tD tDVar6 = this.CSn;
            if (tDVar6 != null && tDVar6.SlV() != null && this.CSn.SlV().LD() != null) {
                final com.bytedance.sdk.openadsdk.core.sLN.LD LD = this.CSn.SlV().LD();
                com.bytedance.sdk.openadsdk.core.widget.Lxb lxb = this.NXR;
                if (lxb != null) {
                    lxb.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.JXs.6
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.openadsdk.core.sLN.LD ld;
                            com.bytedance.sdk.openadsdk.core.widget.Lxb lxb2 = JXs.this.NXR;
                            if (lxb2 == null || !lxb2.isShown() || (ld = LD) == null) {
                                return;
                            }
                            ld.LD(JXs.this.getVideoProgress());
                        }
                    });
                }
            }
            if (CSn()) {
                this.NXR.setOnClickListener(this.CG);
                this.NXR.setOnTouchListener(this.CG);
            } else {
                this.NXR.setOnClickListener(this.hg);
                this.NXR.setOnTouchListener(this.hg);
            }
        } else if (!TextUtils.isEmpty(strAe)) {
            le.Lxb((View) this.NXR, 4);
            le.Lxb((View) this.STP, 0);
            TextView textView = this.STP;
            if (textView != null) {
                textView.setText(strAe.substring(0, 1));
                if (CSn()) {
                    this.STP.setOnClickListener(this.CG);
                    this.STP.setOnTouchListener(this.CG);
                } else {
                    this.STP.setOnClickListener(this.hg);
                    this.STP.setOnTouchListener(this.hg);
                }
            }
        }
        if (this.IeN != null && !TextUtils.isEmpty(strAe)) {
            this.IeN.setText(strAe);
            this.IeN.setTag(570425345, "VAST_TITLE");
        }
        le.Lxb((View) this.IeN, 0);
        le.Lxb((View) this.VVE, 0);
        String strXr = tDVar.xr();
        if (TextUtils.isEmpty(strXr)) {
            int iSRq = tDVar.sRq();
            if (iSRq == 2 || iSRq == 3) {
                strXr = com.bytedance.sdk.component.utils.tD.Lxb(this.id, "tt_video_mobile_go_detail");
            } else if (iSRq == 4) {
                strXr = com.bytedance.sdk.component.utils.tD.Lxb(this.id, "tt_video_download_apk");
            } else if (iSRq == 5) {
                strXr = com.bytedance.sdk.component.utils.tD.Lxb(this.id, "tt_video_dial_phone");
            } else if (iSRq != 8) {
                strXr = com.bytedance.sdk.component.utils.tD.Lxb(this.id, "tt_video_mobile_go_detail");
            } else {
                strXr = com.bytedance.sdk.component.utils.tD.Lxb(this.id, "tt_video_mobile_go_detail");
            }
        }
        TextView textView2 = this.VVE;
        if (textView2 != null) {
            textView2.setText(strXr);
            this.VVE.setOnClickListener(this.hg);
            this.VVE.setOnTouchListener(this.hg);
        }
        if (this.nJ) {
            return;
        }
        lc(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(final int i, final String str, final com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        com.bytedance.sdk.openadsdk.ZU.lk.Lxb(new OY("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.core.NXR.LD.JXs.7
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("description", i + ":" + str);
                    jSONObject.put("url", JXs.this.CSn.Lpq().Lxb());
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.ZU.lk.LD(JXs.this.CSn, JXs.this.CSn != null ? nJ.lk(tDVar.lJ()) : null, "load_vast_icon_fail", jSONObject);
            }
        });
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GK
    public void Lxb(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.ZU.getHolder()) {
            return;
        }
        this.HD = true;
        if (VVE()) {
            this.KPU.Lxb(this, surfaceHolder);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GK
    public void Lxb(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != this.ZU.getHolder()) {
            return;
        }
        VVE();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GK
    public void Lxb(SurfaceTexture surfaceTexture, int i, int i2) {
        this.HD = true;
        if (VVE()) {
            this.KPU.Lxb(this, surfaceTexture);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GK
    public boolean Lxb(SurfaceTexture surfaceTexture) {
        this.HD = false;
        if (!VVE()) {
            return true;
        }
        this.KPU.LD(this, surfaceTexture);
        return true;
    }

    public void Lxb(boolean z, boolean z2, boolean z3) {
        le.Lxb((View) this.JXs, (!z || this.lc.getVisibility() == 0) ? 8 : 0);
    }

    public void Lxb(boolean z, boolean z2) {
        le.Lxb((View) this.JXs, 8);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RG
    public void Lxb(Drawable drawable) {
        ViewGroup viewGroup = this.lk;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }
}
