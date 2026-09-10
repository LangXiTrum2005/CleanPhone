package com.bytedance.adsdk.ugeno.lr;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.xha.mj;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ri<E extends ViewGroup> extends ik {
    protected List<ik<View>> ri;

    public ri(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public ik ik(String str) {
        ik<T> ikVarXha;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f18024co) && this.nd == 0) {
            return this;
        }
        if (this.nd != 0) {
            return null;
        }
        for (ik<View> ikVar : this.ri) {
            if (ikVar != null && (ikVarXha = ikVar.xha(str)) != 0) {
                return ikVarXha;
            }
        }
        return null;
    }

    public List<ik<View>> jbs() {
        return this.ri;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public ik ka(String str) {
        ik<T> ikVarMj;
        if (!TextUtils.isEmpty(str) && co(str) != null) {
            return this;
        }
        for (ik<View> ikVar : this.ri) {
            if (ikVar != null && (ikVarMj = ikVar.mj(str)) != 0) {
                return ikVarMj;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public void lr() {
        super.lr();
    }

    public C0193ri qt() {
        return new C0193ri(this);
    }

    public void ri(ik ikVar) {
        if (ikVar == null) {
            return;
        }
        this.ri.add(ikVar);
        View viewSf = ikVar.sf();
        if (viewSf != null) {
            ((ViewGroup) this.fi).addView(viewSf);
        }
    }

    public ri(Context context, ri riVar) {
        super(context, riVar);
        this.ri = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public ik lr(String str) {
        ik<T> ikVarDi;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f18024co)) {
            return this;
        }
        for (ik<View> ikVar : this.ri) {
            if (ikVar != null && (ikVarDi = ikVar.di(str)) != 0) {
                return ikVarDi;
            }
        }
        return null;
    }

    public void ri(ik ikVar, ViewGroup.LayoutParams layoutParams) {
        if (ikVar == null) {
            return;
        }
        this.ri.add(ikVar);
        View viewSf = ikVar.sf();
        if (viewSf != null) {
            ((ViewGroup) this.fi).addView(viewSf, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lr.ik
    public ik ri(String str) {
        ik<T> ikVarFi;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.sf)) {
            return this;
        }
        for (ik<View> ikVar : this.ri) {
            if (ikVar != null && (ikVarFi = ikVar.fi(str)) != 0) {
                return ikVarFi;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.lr.ri$ri, reason: collision with other inner class name */
    public static class C0193ri {
        protected boolean ac;
        protected float aw;
        protected ViewGroup.LayoutParams ay;
        protected float bgr;
        protected boolean bu;

        /* JADX INFO: renamed from: co, reason: collision with root package name */
        protected float f18025co;
        protected float di;
        protected float fi;
        protected ri fr;
        protected boolean ihz;
        protected float jbs;
        protected float mj;
        protected boolean nr;
        protected float qt;
        protected float sf;
        protected boolean slm;
        protected boolean tan;
        protected boolean uq;
        protected boolean vr;
        protected boolean wjv;
        protected float xha;
        protected float ri = -2.0f;
        protected float lr = -2.0f;
        protected float ik = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        protected float ka = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        public C0193ri(ri riVar) {
            this.fr = riVar;
        }

        public void ri(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "paddingLeft":
                    this.sf = mj.ri(context, str2);
                    this.slm = true;
                    break;
                case "minWidth":
                    this.ik = mj.ri(context, str2);
                    break;
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.lr = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.lr = mj.ri(context, str2);
                        } else {
                            this.lr = -2.0f;
                        }
                        break;
                    }
                    break;
                case "margin":
                    this.fi = mj.ri(context, str2);
                    break;
                case "marginTop":
                    this.mj = mj.ri(context, str2);
                    this.uq = true;
                    break;
                case "padding":
                    this.qt = mj.ri(context, str2);
                    this.vr = true;
                    break;
                case "marginBottom":
                    this.jbs = mj.ri(context, str2);
                    this.wjv = true;
                    break;
                case "minHeight":
                    this.ka = mj.ri(context, str2);
                    break;
                case "paddingTop":
                    this.f18025co = mj.ri(context, str2);
                    this.nr = true;
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.ri = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.ri = mj.ri(context, str2);
                        } else {
                            this.ri = -2.0f;
                        }
                        break;
                    }
                    break;
                case "paddingBottom":
                    this.bgr = mj.ri(context, str2);
                    this.tan = true;
                    break;
                case "paddingRight":
                    this.aw = mj.ri(context, str2);
                    this.bu = true;
                    break;
                case "marginRight":
                    this.xha = mj.ri(context, str2);
                    this.ihz = true;
                    break;
                case "marginLeft":
                    this.di = mj.ri(context, str2);
                    this.ac = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.ri + ", mHeight=" + this.lr + ", mMargin=" + this.fi + ", mMarginLeft=" + this.di + ", mMarginRight=" + this.xha + ", mMarginTop=" + this.mj + ", mMarginBottom=" + this.jbs + ", mParams=" + this.ay + '}';
        }

        public ViewGroup.LayoutParams ri() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.ri, (int) this.lr);
            marginLayoutParams.leftMargin = (int) (this.ac ? this.di : this.fi);
            marginLayoutParams.rightMargin = (int) (this.ihz ? this.xha : this.fi);
            marginLayoutParams.topMargin = (int) (this.uq ? this.mj : this.fi);
            marginLayoutParams.bottomMargin = (int) (this.wjv ? this.jbs : this.fi);
            return marginLayoutParams;
        }
    }
}
