package com.bytedance.adsdk.ugeno.yoga.lr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.bytedance.adsdk.ugeno.yoga.aw;
import com.bytedance.adsdk.ugeno.yoga.bgr;
import com.bytedance.adsdk.ugeno.yoga.di;
import com.bytedance.adsdk.ugeno.yoga.fi;
import com.bytedance.adsdk.ugeno.yoga.ka;
import com.bytedance.adsdk.ugeno.yoga.qt;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ri extends com.bytedance.adsdk.ugeno.lr.ri<ik> {
    private fi akr;
    private bgr de;
    private qt eu;
    private com.bytedance.adsdk.ugeno.yoga.ri xlq;
    private di zv;
    private com.bytedance.adsdk.ugeno.yoga.ri zxp;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.yoga.lr.ri$ri, reason: collision with other inner class name */
    public static class C0199ri extends com.bytedance.adsdk.ugeno.lr.ri.C0193ri {
        public int dw;
        public int dzy;
        private boolean feb;
        public int hcw;
        public float ig;
        public float igq;
        private boolean jc;
        private boolean kt;
        public int oh;
        public float ory;
        public int pv;
        private boolean qd;
        private boolean srn;
        public int su;
        public int xd;
        public float zf;
        private boolean zyn;

        public C0199ri(com.bytedance.adsdk.ugeno.lr.ri riVar) {
            super(riVar);
            this.su = 1;
            this.igq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.zf = 1.0f;
            this.dw = com.bytedance.adsdk.ugeno.yoga.ri.AUTO.ri();
            this.ory = -1.0f;
            this.hcw = aw.RELATIVE.ri();
        }

        private void ka() {
            com.bytedance.adsdk.ugeno.lr.ri riVar = this.fr;
            if (riVar instanceof ri) {
                if (((ri) riVar).xm() == fi.ROW && this.fr.pv() == -2 && this.ri == -1.0f && !this.fr.zyn()) {
                    this.ri = -2.0f;
                    this.zf = 1.0f;
                    this.igq = 1.0f;
                    this.qd = true;
                    this.ory = -1.0f;
                }
                if (((ri) this.fr).xm() == fi.COLUMN && this.fr.ig() == -2 && this.lr == -1.0f && !this.fr.zyn()) {
                    this.lr = -2.0f;
                    this.zf = 1.0f;
                    this.igq = 1.0f;
                    this.qd = true;
                    this.ory = -1.0f;
                }
            }
        }

        public boolean ik() {
            float f = this.ri;
            if (f == -1.0f && this.lr == -1.0f) {
                return false;
            }
            return f == -2.0f || this.lr == -2.0f;
        }

        @Override // com.bytedance.adsdk.ugeno.lr.ri.C0193ri
        /* JADX INFO: renamed from: lr, reason: merged with bridge method [inline-methods] */
        public ik.ri ri() {
            ka();
            ik.ri riVar = new ik.ri((int) this.ri, (int) this.lr);
            riVar.co((int) (this.ac ? this.di : this.fi));
            riVar.bgr((int) (this.ihz ? this.xha : this.fi));
            riVar.sf((int) (this.uq ? this.mj : this.fi));
            riVar.aw((int) (this.wjv ? this.jbs : this.fi));
            riVar.ri(this.su);
            riVar.fi(this.dw);
            riVar.lr(this.igq);
            riVar.ik(this.zf);
            riVar.slm(this.ik);
            riVar.bu(this.ka);
            if (this.qd) {
                riVar.ka(this.ory);
            }
            riVar.di(this.hcw);
            if (this.srn) {
                riVar.xha(this.oh);
            }
            if (this.jc) {
                riVar.jbs(this.xd);
            }
            if (this.kt) {
                riVar.mj(this.dzy);
            }
            if (this.feb) {
                riVar.qt(this.pv);
            }
            if (this.zyn && ik()) {
                float f = this.ig;
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    riVar.vr(f);
                    riVar.ik(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    riVar.lr(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
            }
            return riVar;
        }

        @Override // com.bytedance.adsdk.ugeno.lr.ri.C0193ri
        public String toString() {
            return "LayoutParams{mOrder=" + this.su + ", mFlexGrow=" + this.igq + ", mFlexShrink=" + this.zf + ", mAlignSelf=" + this.dw + ", mFlexBasis=" + this.ory + ", mPosition=" + this.hcw + ", mTop=" + this.oh + ", mBottom=" + this.xd + ", mLeft=" + this.dzy + ", mRight=" + this.pv + '}';
        }

        @Override // com.bytedance.adsdk.ugeno.lr.ri.C0193ri
        public void ri(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.ri(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasis":
                    this.qd = true;
                    float fRi = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, -1.0f);
                    this.ory = fRi;
                    this.ory = mj.ri(context, fRi);
                    break;
                case "bottom":
                    this.jc = true;
                    this.xd = (int) mj.ri(context, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0));
                    break;
                case "top":
                    this.srn = true;
                    this.oh = (int) mj.ri(context, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0));
                    break;
                case "left":
                    this.kt = true;
                    this.dzy = (int) mj.ri(context, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0));
                    break;
                case "order":
                    this.su = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 1);
                    break;
                case "ratio":
                    this.zyn = true;
                    this.ig = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "right":
                    this.feb = true;
                    this.pv = (int) mj.ri(context, com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 0));
                    break;
                case "position":
                    this.hcw = aw.ri(str2).ri();
                    break;
                case "flexShrink":
                    this.zf = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.igq = com.bytedance.adsdk.ugeno.xha.ik.ri(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    break;
                case "alignSelf":
                    this.dw = com.bytedance.adsdk.ugeno.yoga.ri.ri(str2).ri();
                    break;
            }
        }
    }

    public ri(Context context) {
        super(context);
        this.akr = fi.ROW;
        this.de = bgr.NO_WRAP;
        this.zv = di.FLEX_START;
        com.bytedance.adsdk.ugeno.yoga.ri riVar = com.bytedance.adsdk.ugeno.yoga.ri.STRETCH;
        this.xlq = riVar;
        this.zxp = riVar;
    }

    public fi xm() {
        return this.akr;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void zf() {
        ImageView.ScaleType scaleType;
        if (this.kt) {
            com.bytedance.adsdk.ugeno.fi.ri().lr().ri(this.jbs, this.qd, new com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri() { // from class: com.bytedance.adsdk.ugeno.yoga.lr.ri.1
                @Override // com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri
                public void ri(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.lr.ik) ri.this).pu != null) {
                            com.bytedance.adsdk.ugeno.core.di unused = ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).pu;
                            String unused2 = ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).qd;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.lr.ik) ri.this).pu != null) {
                        com.bytedance.adsdk.ugeno.core.di unused3 = ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).pu;
                        String unused4 = ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).qd;
                    }
                    final Bitmap bitmapRi = mj.ri(((com.bytedance.adsdk.ugeno.lr.ik) ri.this).lr, bitmap, (int) ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).jc);
                    if (bitmapRi != null) {
                        mj.ri(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.lr.ri.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ri.this.ri(new BitmapDrawable(bitmapRi));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.jbs.ka.ri riVar = new com.bytedance.adsdk.ugeno.jbs.ka.ri(this.lr);
        com.bytedance.adsdk.ugeno.fi.ri().lr().ri(this.jbs, this.qd, riVar, this.fi.getWidth(), this.fi.getHeight(), new com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri() { // from class: com.bytedance.adsdk.ugeno.yoga.lr.ri.2
            @Override // com.bytedance.adsdk.ugeno.ri.InterfaceC0195ri
            public void ri(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.lr.ik) ri.this).pu != null) {
                        com.bytedance.adsdk.ugeno.core.di unused = ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).pu;
                        String unused2 = ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).qd;
                        return;
                    }
                    return;
                }
                if (((com.bytedance.adsdk.ugeno.lr.ik) ri.this).pu != null) {
                    com.bytedance.adsdk.ugeno.core.di unused3 = ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).pu;
                    String unused4 = ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).qd;
                }
            }
        });
        if (!this.feb || (scaleType = this.srn) == ImageView.ScaleType.FIT_XY) {
            riVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            riVar.setScaleType(scaleType);
        }
        riVar.setCornerRadius(this.zyn);
        ik.ri riVar2 = new ik.ri(-1, -1);
        riVar2.di(aw.ABSOLUTE.ri());
        riVar2.xha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        riVar2.mj(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        T t = this.fi;
        if (t instanceof ik) {
            ((ik) t).addView(riVar, 0, riVar2);
            ri(riVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void bgr() {
        if (this.hcw) {
            this.eu.lr(ka.ALL, this.su);
        }
        if (this.oh) {
            this.eu.lr(ka.LEFT, this.igq);
        }
        if (this.xd) {
            this.eu.lr(ka.RIGHT, this.zf);
        }
        if (this.dzy) {
            this.eu.lr(ka.TOP, this.dw);
        }
        if (this.pv) {
            this.eu.lr(ka.BOTTOM, this.ory);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    /* JADX INFO: renamed from: ik, reason: merged with bridge method [inline-methods] */
    public ik ri() {
        ik ikVar = new ik(this.lr);
        ikVar.ri(this);
        this.eu = ikVar.getYogaNode();
        return ikVar;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri
    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public C0199ri qt() {
        return new C0199ri(this);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri, com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
        this.eu.ri(this.akr);
        this.eu.ri(this.de);
        this.eu.ri(this.zv);
        this.eu.ri(this.xlq);
        this.eu.ik(this.zxp);
        this.eu.ri(true);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(Drawable drawable) {
        ImageView.ScaleType scaleType;
        com.bytedance.adsdk.ugeno.jbs.ka.ri riVar = new com.bytedance.adsdk.ugeno.jbs.ka.ri(this.lr);
        riVar.setImageDrawable(drawable);
        if (this.feb && (scaleType = this.srn) != ImageView.ScaleType.FIT_XY) {
            riVar.setScaleType(scaleType);
        } else {
            riVar.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        riVar.setCornerRadius(this.zyn);
        ik.ri riVar2 = new ik.ri(-1, -1);
        riVar2.di(aw.ABSOLUTE.ri());
        riVar2.xha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        riVar2.mj(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        T t = this.fi;
        if (t instanceof ik) {
            ((ik) t).addView(riVar, 0, riVar2);
            ri(riVar);
        }
    }

    private void ri(final com.bytedance.adsdk.ugeno.jbs.ka.ri riVar) {
        this.fi.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.lr.ri.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                qt qtVarRi;
                if (((com.bytedance.adsdk.ugeno.lr.ik) ri.this).fi == null || (qtVarRi = ((ik) ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).fi).ri(riVar)) == null) {
                    return;
                }
                int width = ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).fi.getWidth();
                qtVarRi.ka(width);
                int height = ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).fi.getHeight();
                qtVarRi.di(height);
                riVar.setCornerRadius(((com.bytedance.adsdk.ugeno.lr.ik) ri.this).zyn);
                ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).fi.requestLayout();
                if (width > 0 || height > 0) {
                    ((com.bytedance.adsdk.ugeno.lr.ik) ri.this).fi.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri
    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar) {
        super.ri(ikVar);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ri
    public void ri(com.bytedance.adsdk.ugeno.lr.ik ikVar, ViewGroup.LayoutParams layoutParams) {
        if (ikVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.lr.ri) this).ri.add(ikVar);
        View viewSf = ikVar.sf();
        if (viewSf != null) {
            ((ik) this.fi).addView(viewSf, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void ri(String str, String str2) {
        super.ri(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.xlq = com.bytedance.adsdk.ugeno.yoga.ri.ri(str2);
                break;
            case "flexDirection":
                this.akr = fi.ri(str2);
                break;
            case "alignContent":
                this.zxp = com.bytedance.adsdk.ugeno.yoga.ri.ri(str2);
                break;
            case "flexWrap":
                this.de = bgr.ri(str2);
                break;
            case "justifyContent":
                this.zv = di.ri(str2);
                break;
        }
    }
}
