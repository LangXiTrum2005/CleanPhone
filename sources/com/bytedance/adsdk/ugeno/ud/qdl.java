package com.bytedance.adsdk.ugeno.ud;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.wd.jpc;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes.dex */
public class qdl<E extends ViewGroup> extends lnr {
    protected List<lnr<View>> qdl;

    public qdl(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public lnr lnr(String str) {
        lnr<T> lnrVarWd;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.fs) && this.mlb == 0) {
            return this;
        }
        if (this.mlb != 0) {
            return null;
        }
        for (lnr<View> lnrVar : this.qdl) {
            if (lnrVar != null && (lnrVarWd = lnrVar.wd(str)) != 0) {
                return lnrVarWd;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public lnr mml(String str) {
        lnr<T> lnrVarJpc;
        if (!TextUtils.isEmpty(str) && exu(str) != null) {
            return this;
        }
        for (lnr<View> lnrVar : this.qdl) {
            if (lnrVar != null && (lnrVarJpc = lnrVar.jpc(str)) != 0) {
                return lnrVarJpc;
            }
        }
        return null;
    }

    public void qdl(lnr lnrVar) {
        if (lnrVar == null) {
            return;
        }
        this.qdl.add(lnrVar);
        View viewRq = lnrVar.rq();
        if (viewRq != null) {
            ((ViewGroup) this.mzz).addView(viewRq);
        }
    }

    public C0070qdl to() {
        return new C0070qdl(this);
    }

    public List<lnr<View>> tvp() {
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
    }

    public qdl(Context context, qdl qdlVar) {
        super(context, qdlVar);
        this.qdl = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public lnr ud(String str) {
        lnr<T> lnrVarMo;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.fs)) {
            return this;
        }
        for (lnr<View> lnrVar : this.qdl) {
            if (lnrVar != null && (lnrVarMo = lnrVar.mo(str)) != 0) {
                return lnrVarMo;
            }
        }
        return null;
    }

    public void qdl(lnr lnrVar, ViewGroup.LayoutParams layoutParams) {
        if (lnrVar == null) {
            return;
        }
        this.qdl.add(lnrVar);
        View viewRq = lnrVar.rq();
        if (viewRq != null) {
            ((ViewGroup) this.mzz).addView(viewRq, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public lnr qdl(String str) {
        lnr<T> lnrVarMzz;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.rq)) {
            return this;
        }
        for (lnr<View> lnrVar : this.qdl) {
            if (lnrVar != null && (lnrVarMzz = lnrVar.mzz(str)) != 0) {
                return lnrVarMzz;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ud.qdl$qdl, reason: collision with other inner class name */
    public static class C0070qdl {
        protected boolean aaj;
        protected ViewGroup.LayoutParams bch;
        protected boolean bjy;
        protected boolean exc;
        protected float exu;
        protected float fs;
        protected boolean jl;
        protected float jpc;
        protected boolean jtx;
        protected boolean jyq;
        protected boolean ljh;
        protected float mo;
        protected float mzz;
        protected boolean oth;
        protected float rdp;
        protected float rq;
        protected float to;
        protected float tvp;
        protected qdl uw;
        protected float wd;
        protected boolean yt;
        protected float qdl = -2.0f;
        protected float ud = -2.0f;
        protected float lnr = 0.0f;
        protected float mml = 0.0f;

        public C0070qdl(qdl qdlVar) {
            this.uw = qdlVar;
        }

        public void qdl(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "paddingLeft":
                    this.rq = jpc.qdl(context, str2);
                    this.jtx = true;
                    break;
                case "minWidth":
                    this.lnr = jpc.qdl(context, str2);
                    break;
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.ud = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.ud = jpc.qdl(context, str2);
                        } else {
                            this.ud = -2.0f;
                        }
                        break;
                    }
                    break;
                case "margin":
                    this.mzz = jpc.qdl(context, str2);
                    break;
                case "marginTop":
                    this.jpc = jpc.qdl(context, str2);
                    this.oth = true;
                    break;
                case "padding":
                    this.to = jpc.qdl(context, str2);
                    this.bjy = true;
                    break;
                case "marginBottom":
                    this.tvp = jpc.qdl(context, str2);
                    this.ljh = true;
                    break;
                case "minHeight":
                    this.mml = jpc.qdl(context, str2);
                    break;
                case "paddingTop":
                    this.fs = jpc.qdl(context, str2);
                    this.jl = true;
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.qdl = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.qdl = jpc.qdl(context, str2);
                        } else {
                            this.qdl = -2.0f;
                        }
                        break;
                    }
                    break;
                case "paddingBottom":
                    this.rdp = jpc.qdl(context, str2);
                    this.exc = true;
                    break;
                case "paddingRight":
                    this.exu = jpc.qdl(context, str2);
                    this.yt = true;
                    break;
                case "marginRight":
                    this.wd = jpc.qdl(context, str2);
                    this.jyq = true;
                    break;
                case "marginLeft":
                    this.mo = jpc.qdl(context, str2);
                    this.aaj = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.qdl + ", mHeight=" + this.ud + ", mMargin=" + this.mzz + ", mMarginLeft=" + this.mo + ", mMarginRight=" + this.wd + ", mMarginTop=" + this.jpc + ", mMarginBottom=" + this.tvp + ", mParams=" + this.bch + AbstractJsonLexerKt.END_OBJ;
        }

        public ViewGroup.LayoutParams qdl() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.qdl, (int) this.ud);
            marginLayoutParams.leftMargin = (int) (this.aaj ? this.mo : this.mzz);
            marginLayoutParams.rightMargin = (int) (this.jyq ? this.wd : this.mzz);
            marginLayoutParams.topMargin = (int) (this.oth ? this.jpc : this.mzz);
            marginLayoutParams.bottomMargin = (int) (this.ljh ? this.tvp : this.mzz);
            return marginLayoutParams;
        }
    }
}
