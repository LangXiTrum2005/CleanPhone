package com.bytedance.adsdk.ugeno.yoga.LD;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.ZU;
import com.bytedance.adsdk.ugeno.ebl.lk;
import com.bytedance.adsdk.ugeno.yoga.IeN;
import com.bytedance.adsdk.ugeno.yoga.JXs;
import com.bytedance.adsdk.ugeno.yoga.LD;
import com.bytedance.adsdk.ugeno.yoga.OY;
import com.bytedance.adsdk.ugeno.yoga.VVE;
import com.bytedance.adsdk.ugeno.yoga.ebl;
import com.bytedance.adsdk.ugeno.yoga.lc;
import com.bytedance.adsdk.ugeno.yoga.sLN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public class Lxb extends com.bytedance.adsdk.ugeno.LD.Lxb<OY> {
    private lc LD;
    private LD Rt;
    private ebl ZU;
    private VVE lk;
    private sLN mb;
    private LD pyu;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.LD.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0043Lxb extends com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb {
        private boolean BcA;
        public int CG;
        public int CSn;
        public float Ivz;
        private boolean JJ;
        public int KPU;
        private boolean NDz;
        private boolean Pw;
        private boolean dR;
        public float foI;
        public int hg;
        public float id;
        public float le;
        public int nE;
        public int nJ;
        private boolean rW;
        public int xan;

        public C0043Lxb(com.bytedance.adsdk.ugeno.LD.Lxb lxb) {
            super(lxb);
            this.CSn = 1;
            this.id = 0.0f;
            this.foI = 1.0f;
            this.KPU = LD.AUTO.Lxb();
            this.Ivz = -1.0f;
            this.nE = IeN.RELATIVE.Lxb();
        }

        @Override // com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb
        /* JADX INFO: renamed from: LD, reason: merged with bridge method [inline-methods] */
        public OY.Lxb Lxb() {
            OY.Lxb lxb = new OY.Lxb((int) this.Lxb, (int) this.LD);
            lxb.sLN((int) (this.tD ? this.lc : this.JXs));
            lxb.STP((int) (this.DY ? this.ebl : this.JXs));
            lxb.JVA((int) (this.Sfi ? this.OY : this.JXs));
            lxb.NXR((int) (this.HD ? this.QAg : this.JXs));
            lxb.Lxb(this.CSn);
            lxb.JXs(this.KPU);
            lxb.LD(this.id);
            lxb.lk(this.foI);
            lxb.VVE(this.lk);
            lxb.kqm(this.ZU);
            if (this.BcA) {
                lxb.ZU(this.Ivz);
            }
            lxb.lc(this.nE);
            if (this.rW) {
                lxb.ebl(this.xan);
            }
            if (this.Pw) {
                lxb.QAg(this.hg);
            }
            if (this.dR) {
                lxb.OY(this.CG);
            }
            if (this.NDz) {
                lxb.nBu(this.nJ);
            }
            if (this.JJ && lk()) {
                float f = this.le;
                if (f > 0.0f) {
                    lxb.IeN(f);
                }
            }
            return lxb;
        }

        public boolean lk() {
            float f = this.Lxb;
            if (f == -1.0f && this.LD == -1.0f) {
                return false;
            }
            return f == -2.0f || this.LD == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb
        public String toString() {
            StringBuilder sb = new StringBuilder("LayoutParams{mOrder=");
            sb.append(this.CSn);
            sb.append(", mFlexGrow=");
            sb.append(this.id);
            sb.append(", mFlexShrink=");
            sb.append(this.foI);
            sb.append(", mAlignSelf=");
            sb.append(this.KPU);
            sb.append(", mFlexBasis=");
            sb.append(this.Ivz);
            sb.append(", mPosition=");
            sb.append(this.nE);
            sb.append(", mTop=");
            sb.append(this.xan);
            sb.append(", mBottom=");
            sb.append(this.hg);
            sb.append(", mLeft=");
            sb.append(this.CG);
            sb.append(", mRight=");
            return DM.k(sb, this.nJ, '}');
        }

        @Override // com.bytedance.adsdk.ugeno.LD.Lxb.C0029Lxb
        public void Lxb(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.Lxb(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasis":
                    this.BcA = true;
                    this.Ivz = lk.Lxb(str2, -1.0f);
                    break;
                case "bottom":
                    this.Pw = true;
                    this.hg = (int) com.bytedance.adsdk.ugeno.ebl.OY.Lxb(context, lk.Lxb(str2, 0));
                    break;
                case "top":
                    this.rW = true;
                    this.xan = (int) com.bytedance.adsdk.ugeno.ebl.OY.Lxb(context, lk.Lxb(str2, 0));
                    break;
                case "left":
                    this.dR = true;
                    this.CG = (int) com.bytedance.adsdk.ugeno.ebl.OY.Lxb(context, lk.Lxb(str2, 0));
                    break;
                case "order":
                    this.CSn = lk.Lxb(str2, 1);
                    break;
                case "ratio":
                    this.JJ = true;
                    this.le = lk.Lxb(str2, 0.0f);
                    break;
                case "right":
                    this.NDz = true;
                    this.nJ = (int) com.bytedance.adsdk.ugeno.ebl.OY.Lxb(context, lk.Lxb(str2, 0));
                    break;
                case "position":
                    this.nE = IeN.Lxb(str2).Lxb();
                    break;
                case "flexShrink":
                    this.foI = lk.Lxb(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.id = lk.Lxb(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.KPU = LD.Lxb(str2).Lxb();
                    break;
            }
        }
    }

    public Lxb(Context context) {
        super(context);
        this.LD = lc.ROW;
        this.lk = VVE.NO_WRAP;
        this.ZU = ebl.FLEX_START;
        LD ld = LD.STRETCH;
        this.Rt = ld;
        this.pyu = ld;
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void JVA() {
        float f = this.nJ ? this.nE : this.Ivz;
        float f2 = this.le ? this.xan : this.Ivz;
        float f3 = this.BcA ? this.hg : this.Ivz;
        float f4 = this.rW ? this.CG : this.Ivz;
        this.mb.LD(JXs.LEFT, f);
        this.mb.LD(JXs.RIGHT, f2);
        this.mb.LD(JXs.TOP, f3);
        this.mb.LD(JXs.BOTTOM, f4);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb
    /* JADX INFO: renamed from: Ld, reason: merged with bridge method [inline-methods] */
    public C0043Lxb lk() {
        return new C0043Lxb(this);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    /* JADX INFO: renamed from: Of, reason: merged with bridge method [inline-methods] */
    public OY ZU() {
        OY oy = new OY(this.JXs);
        oy.Lxb(this);
        this.mb = oy.getYogaNode();
        return oy;
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void aH() {
        ImageView.ScaleType scaleType;
        if (this.VU) {
            ZU.Lxb().LD().Lxb(this.sLN, this.dR, new com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb() { // from class: com.bytedance.adsdk.ugeno.yoga.LD.Lxb.1
                @Override // com.bytedance.adsdk.ugeno.Lxb.InterfaceC0030Lxb
                public void Lxb(Bitmap bitmap) {
                    final Bitmap bitmapLxb;
                    if (bitmap == null || (bitmapLxb = com.bytedance.adsdk.ugeno.ebl.OY.Lxb(((com.bytedance.adsdk.ugeno.LD.lk) Lxb.this).JXs, bitmap, (int) ((com.bytedance.adsdk.ugeno.LD.lk) Lxb.this).JJ)) == null) {
                        return;
                    }
                    com.bytedance.adsdk.ugeno.ebl.OY.Lxb(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.LD.Lxb.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Lxb.this.Lxb(new BitmapDrawable(bitmapLxb));
                        }
                    });
                }
            });
            return;
        }
        ImageView imageView = new ImageView(this.JXs);
        ZU.Lxb().LD().Lxb(this.sLN, this.dR, imageView, this.OY.getWidth(), this.OY.getHeight());
        if (!this.sRq || (scaleType = this.NDz) == ImageView.ScaleType.FIT_XY) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            imageView.setScaleType(scaleType);
        }
        OY.Lxb lxb = new OY.Lxb(-1, -1);
        lxb.lc(IeN.ABSOLUTE.Lxb());
        T t = this.OY;
        if (t instanceof OY) {
            ((OY) t).addView(imageView, 0, lxb);
            Lxb(imageView);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb, com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
        this.mb.Lxb(this.LD);
        this.mb.Lxb(this.lk);
        this.mb.Lxb(this.ZU);
        this.mb.Lxb(this.Rt);
        this.mb.lk(this.pyu);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(Drawable drawable) {
        ImageView.ScaleType scaleType;
        ImageView imageView = new ImageView(this.JXs);
        imageView.setImageDrawable(drawable);
        if (!this.sRq || (scaleType = this.NDz) == ImageView.ScaleType.FIT_XY) {
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            imageView.setScaleType(scaleType);
        }
        OY.Lxb lxb = new OY.Lxb(-1, -1);
        lxb.lc(IeN.ABSOLUTE.Lxb());
        T t = this.OY;
        if (t instanceof OY) {
            ((OY) t).addView(imageView, 0, lxb);
            Lxb(imageView);
        }
    }

    private void Lxb(final ImageView imageView) {
        this.OY.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.LD.Lxb.2
            @Override // java.lang.Runnable
            public void run() {
                sLN slnLxb;
                if (((com.bytedance.adsdk.ugeno.LD.lk) Lxb.this).OY == null || (slnLxb = ((OY) ((com.bytedance.adsdk.ugeno.LD.lk) Lxb.this).OY).Lxb(imageView)) == null) {
                    return;
                }
                slnLxb.ZU(((com.bytedance.adsdk.ugeno.LD.lk) Lxb.this).OY.getWidth());
                slnLxb.lc(((com.bytedance.adsdk.ugeno.LD.lk) Lxb.this).OY.getHeight());
                ((com.bytedance.adsdk.ugeno.LD.lk) Lxb.this).OY.requestLayout();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb
    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar) {
        super.Lxb(lkVar);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.Lxb
    public void Lxb(com.bytedance.adsdk.ugeno.LD.lk lkVar, ViewGroup.LayoutParams layoutParams) {
        if (lkVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.LD.Lxb) this).Lxb.add(lkVar);
        View viewQAg = lkVar.QAg();
        if (viewQAg != null) {
            ((OY) this.OY).addView(viewQAg, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void Lxb(String str, String str2) {
        super.Lxb(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.Rt = LD.Lxb(str2);
                break;
            case "flexDirection":
                this.LD = lc.Lxb(str2);
                break;
            case "alignContent":
                this.pyu = LD.Lxb(str2);
                break;
            case "flexWrap":
                this.lk = VVE.Lxb(str2);
                break;
            case "justifyContent":
                this.ZU = ebl.Lxb(str2);
                break;
        }
    }
}
