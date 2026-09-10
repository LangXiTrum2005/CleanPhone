package com.bytedance.adsdk.ugeno.LD;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.ebl.OY;
import com.umeng.analytics.pro.cw;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Lxb<E extends ViewGroup> extends lk {
    protected List<lk<View>> Lxb;

    public Lxb(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public void LD() {
        super.LD();
    }

    public void Lxb(lk lkVar) {
        if (lkVar == null) {
            return;
        }
        this.Lxb.add(lkVar);
        View viewQAg = lkVar.QAg();
        if (viewQAg != null) {
            ((ViewGroup) this.OY).addView(viewQAg);
        }
    }

    public C0029Lxb lk() {
        return new C0029Lxb(this);
    }

    public Lxb(Context context, Lxb lxb) {
        super(context, lxb);
        this.Lxb = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public lk LD(String str) {
        lk<T> lkVarZU;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.IeN)) {
            return this;
        }
        for (lk<View> lkVar : this.Lxb) {
            if (lkVar != null && (lkVarZU = lkVar.ZU(str)) != 0) {
                return lkVarZU;
            }
        }
        return null;
    }

    public void Lxb(lk lkVar, ViewGroup.LayoutParams layoutParams) {
        if (lkVar == null) {
            return;
        }
        this.Lxb.add(lkVar);
        View viewQAg = lkVar.QAg();
        if (viewQAg != null) {
            ((ViewGroup) this.OY).addView(viewQAg, layoutParams);
        }
    }

    public List<lk<View>> Lxb() {
        return this.Lxb;
    }

    @Override // com.bytedance.adsdk.ugeno.LD.lk
    public lk Lxb(String str) {
        lk<T> lkVarLk;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.STP)) {
            return this;
        }
        for (lk<View> lkVar : this.Lxb) {
            if (lkVar != null && (lkVarLk = lkVar.lk(str)) != 0) {
                return lkVarLk;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.LD.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0029Lxb {
        protected boolean DY;
        protected boolean HD;
        protected boolean IeN;
        protected float JVA;
        protected float JXs;
        protected float NXR;
        protected float OY;
        protected float QAg;
        protected float STP;
        protected boolean Sfi;
        protected boolean VVE;
        protected Lxb aH;
        protected boolean brP;
        protected ViewGroup.LayoutParams eK;
        protected float ebl;
        protected boolean kqm;
        protected float lc;
        protected float nBu;
        protected float sLN;
        protected boolean tD;
        protected float Lxb = -2.0f;
        protected float LD = -2.0f;
        protected float lk = 0.0f;
        protected float ZU = 0.0f;

        public C0029Lxb(Lxb lxb) {
            this.aH = lxb;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public void Lxb(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            str.getClass();
            byte b = -1;
            switch (str.hashCode()) {
                case -1501175880:
                    if (str.equals("paddingLeft")) {
                        b = 0;
                    }
                    break;
                case -1375815020:
                    if (str.equals("minWidth")) {
                        b = 1;
                    }
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        b = 2;
                    }
                    break;
                case -1081309778:
                    if (str.equals("margin")) {
                        b = 3;
                    }
                    break;
                case -1044792121:
                    if (str.equals("marginTop")) {
                        b = 4;
                    }
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        b = 5;
                    }
                    break;
                case -289173127:
                    if (str.equals("marginBottom")) {
                        b = 6;
                    }
                    break;
                case -133587431:
                    if (str.equals("minHeight")) {
                        b = 7;
                    }
                    break;
                case 90130308:
                    if (str.equals("paddingTop")) {
                        b = 8;
                    }
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        b = 9;
                    }
                    break;
                case 202355100:
                    if (str.equals("paddingBottom")) {
                        b = 10;
                    }
                    break;
                case 713848971:
                    if (str.equals("paddingRight")) {
                        b = 11;
                    }
                    break;
                case 975087886:
                    if (str.equals("marginRight")) {
                        b = 12;
                    }
                    break;
                case 1970934485:
                    if (str.equals("marginLeft")) {
                        b = cw.k;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    this.JVA = OY.Lxb(context, str2);
                    this.IeN = true;
                    break;
                case 1:
                    this.lk = OY.Lxb(context, str2);
                    break;
                case 2:
                    if (TextUtils.equals(str2, "match_parent")) {
                        Lxb lxb = this.aH;
                        if (lxb != null && lxb.KPU() && this.aH.CG() == -2) {
                            this.LD = -2.0f;
                        } else {
                            this.LD = -1.0f;
                        }
                    } else if (!TextUtils.equals(str2, "wrap_content")) {
                        this.LD = OY.Lxb(context, str2);
                    } else {
                        this.LD = -2.0f;
                    }
                    break;
                case 3:
                    this.JXs = OY.Lxb(context, str2);
                    break;
                case 4:
                    this.OY = OY.Lxb(context, str2);
                    this.Sfi = true;
                    break;
                case 5:
                    this.nBu = OY.Lxb(context, str2);
                    break;
                case 6:
                    this.QAg = OY.Lxb(context, str2);
                    this.HD = true;
                    break;
                case 7:
                    this.ZU = OY.Lxb(context, str2);
                    break;
                case 8:
                    this.sLN = OY.Lxb(context, str2);
                    this.kqm = true;
                    break;
                case 9:
                    if (TextUtils.equals(str2, "match_parent")) {
                        Lxb lxb2 = this.aH;
                        if (lxb2 != null && lxb2.KPU() && this.aH.hg() == -2) {
                            this.Lxb = -2.0f;
                        } else {
                            this.Lxb = -1.0f;
                        }
                    } else if (!TextUtils.equals(str2, "wrap_content")) {
                        this.Lxb = OY.Lxb(context, str2);
                    } else {
                        this.Lxb = -2.0f;
                    }
                    break;
                case 10:
                    this.STP = OY.Lxb(context, str2);
                    this.brP = true;
                    break;
                case 11:
                    this.NXR = OY.Lxb(context, str2);
                    this.VVE = true;
                    break;
                case 12:
                    this.ebl = OY.Lxb(context, str2);
                    this.DY = true;
                    break;
                case 13:
                    this.lc = OY.Lxb(context, str2);
                    this.tD = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.Lxb + ", mHeight=" + this.LD + ", mMargin=" + this.JXs + ", mMarginLeft=" + this.lc + ", mMarginRight=" + this.ebl + ", mMarginTop=" + this.OY + ", mMarginBottom=" + this.QAg + ", mParams=" + this.eK + '}';
        }

        public ViewGroup.LayoutParams Lxb() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.Lxb, (int) this.LD);
            marginLayoutParams.leftMargin = (int) (this.tD ? this.lc : this.JXs);
            marginLayoutParams.rightMargin = (int) (this.DY ? this.ebl : this.JXs);
            marginLayoutParams.topMargin = (int) (this.Sfi ? this.OY : this.JXs);
            marginLayoutParams.bottomMargin = (int) (this.HD ? this.QAg : this.JXs);
            return marginLayoutParams;
        }
    }
}
