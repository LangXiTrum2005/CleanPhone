package com.bytedance.sdk.openadsdk.lnr;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.ax;
import com.bytedance.sdk.openadsdk.utils.jtx;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class tvp extends com.bytedance.sdk.openadsdk.core.mo.lnr implements to.lnr, to.mml, to.qdl, to.ud {
    private int exu;
    private int fs;
    private View jpc;
    private int lnr;
    private final to mml;
    private TextView mo;
    private com.bytedance.sdk.openadsdk.core.mo.jpc mzz;
    mo qdl;
    private FilterWord rdp;
    private com.bytedance.sdk.openadsdk.core.mo.jpc rq;
    private com.bytedance.sdk.openadsdk.core.mo.mml to;
    private View tvp;
    private int ud;
    private rq wd;

    public tvp(Context context, to toVar) {
        this(context, toVar, null);
    }

    private void lnr() {
        if (this.fs > 0) {
            return;
        }
        this.fs = ax.lnr(getContext());
        int iMzz = ax.mzz(getContext());
        this.exu = iMzz;
        this.mml.qdl(this.fs, iMzz);
    }

    private boolean mml() {
        if (this.fs == 0) {
            lnr();
        }
        return this.fs < this.exu;
    }

    private com.bytedance.sdk.openadsdk.core.mo.jpc ud(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = mml() ? this.ud : ax.ud(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.lnr);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.lnr);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i2 = this.lnr;
        jpcVar.setPadding(0, i2, 0, i2);
        jpcVar.setGravity(17);
        jpcVar.setBackground(stateListDrawable);
        jpcVar.setTextColor(-1);
        jpcVar.setTextSize(16.0f);
        jpcVar.setText(ljh.qdl(context, "tt_suggestion_commit"));
        jpcVar.setEnabled(false);
        jpcVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lnr.tvp.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tvp.this.mml.mml();
            }
        });
        jpcVar.setLayoutParams(layoutParams);
        return jpcVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.mo.lnr, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.fs == 0) {
                lnr();
            }
            layoutParams.width = Math.min(this.fs, this.exu) - (ax.ud(getContext(), 16.0f) * 2);
        }
    }

    public tvp(Context context, to toVar, List<FilterWord> list) {
        super(context);
        this.mml = toVar;
        toVar.qdl((to.lnr) this);
        toVar.qdl((to.ud) this);
        toVar.qdl((to.mml) this);
        toVar.qdl((to.qdl) this);
        lnr();
        qdl(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        ud(list);
    }

    private void qdl(Context context) {
        this.lnr = ax.ud(context, 8.0f);
        this.ud = ax.ud(context, 20.0f);
        int iUd = ax.ud(context, 56.0f);
        int iUd2 = ax.ud(context, 30.0f);
        int iUd3 = ax.ud(context, 12.0f);
        if (mml()) {
            iUd3 = this.ud;
        }
        if (!mml()) {
            iUd = iUd2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, ax.ud(getContext(), 98.0f));
        view.setBackground(ljh.lnr(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.lnr);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        int iUd4 = ax.ud(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iUd4, iUd4);
        layoutParams3.setMargins(0, iUd3, iUd3, 0);
        layoutParams3.gravity = 8388661;
        mmlVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_titlebar_close_seletor"));
        addView(mmlVar, layoutParams3);
        mmlVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lnr.tvp.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                tvp.this.mml.mzz();
            }
        });
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar2 = new com.bytedance.sdk.openadsdk.core.mo.mml(context);
        this.to = mmlVar2;
        mmlVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lnr.tvp.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                tvp.this.ud();
            }
        });
        this.to.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iUd4, iUd4);
        layoutParams4.setMargins(iUd3, iUd3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableQdl = com.bytedance.sdk.openadsdk.utils.rq.qdl(context, "tt_leftbackicon_selector");
        drawableQdl.setAutoMirrored(true);
        this.to.setImageDrawable(drawableQdl);
        addView(this.to, layoutParams4);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iUd3, iUd, iUd3, iUd3);
        mzzVar.setOrientation(1);
        addView(mzzVar, layoutParams5);
        View viewLnr = lnr(context);
        this.jpc = viewLnr;
        mzzVar.addView(viewLnr);
        View viewMml = mml(context);
        this.tvp = viewMml;
        mzzVar.addView(viewMml);
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVarUd = ud(context);
        this.mzz = jpcVarUd;
        mzzVar.addView(jpcVarUd);
    }

    private View mml(Context context) {
        int iUd;
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setOrientation(1);
        if (!mml()) {
            iUd = ax.ud(context, 200.0f);
        } else {
            iUd = ax.ud(context, 358.0f);
        }
        mzzVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iUd));
        TextView textView = new TextView(context);
        textView.setText(ljh.qdl(context, "tt_select_reason"));
        textView.setTextSize(mml() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = ax.ud(context, mml() ? 24.0f : 4.0f);
        mzzVar.addView(textView, layoutParams);
        mo moVar = new mo(context, this.mml);
        this.qdl = moVar;
        mzzVar.addView(moVar);
        if (com.bytedance.sdk.openadsdk.core.settings.rq.lnr().sy()) {
            com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(context);
            this.rq = jpcVar;
            jpcVar.setId(jtx.ign);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = mml() ? this.ud : ax.ud(context, 6.0f);
            layoutParams2.gravity = 17;
            this.rq.setLayoutParams(layoutParams2);
            this.rq.setFocusable(false);
            this.rq.setHint(ljh.qdl(context, "tt_add_bad_reason"));
            this.rq.setHintTextColor(Color.parseColor("#57000000"));
            this.rq.setTextColor(Color.rgb(22, 24, 35));
            this.rq.setTextSize(15.0f);
            this.rq.setGravity(8388615);
            this.rq.setVisibility(0);
            this.rq.setPadding(0, ax.ud(context, 15.0f), 0, ax.ud(context, 14.0f));
            this.rq.setEllipsize(TextUtils.TruncateAt.END);
            this.rq.setSingleLine();
            this.rq.setMaxLines(1);
            this.rq.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lnr.tvp.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    tvp.this.mml.mo();
                }
            });
            mzzVar.addView(this.rq, layoutParams2);
            mzzVar.addView(new rq(context, Color.argb(128, 0, 0, 0)));
        }
        mzzVar.setVisibility(8);
        return mzzVar;
    }

    private View lnr(Context context) {
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        mzzVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(ljh.qdl(context, "tt_like_this_ad"));
        textView.setTextSize(mml() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        mzzVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(ljh.qdl(context, "tt_feel_hint"));
        textView2.setTextSize(mml() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (mml()) {
            layoutParams2.topMargin = ax.ud(context, 4.0f);
        }
        mzzVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.mo.mzz mzzVar2 = new com.bytedance.sdk.openadsdk.core.mo.mzz(context);
        mzzVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iUd = ax.ud(context, 16.0f);
        int iUd2 = ax.ud(context, 12.0f);
        int iUd3 = ax.ud(context, 8.0f);
        if (mml()) {
            layoutParams3.topMargin = iUd;
            layoutParams3.bottomMargin = iUd;
        } else {
            layoutParams3.topMargin = iUd2;
            layoutParams3.bottomMargin = iUd3;
        }
        mzzVar.addView(mzzVar2, layoutParams3);
        mzzVar2.addView(new mzz(context, 1, this.mml));
        mzz mzzVar3 = new mzz(context, 2, this.mml);
        ViewGroup.LayoutParams layoutParams4 = mzzVar3.getLayoutParams();
        boolean z2 = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z2) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iUd;
        layoutParams7.rightMargin = iUd;
        mzzVar2.addView(mzzVar3, layoutParams5);
        mzzVar2.addView(new mzz(context, 3, this.mml));
        rq rqVar = new rq(context);
        this.wd = rqVar;
        mzzVar.addView(rqVar);
        this.mo = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!mml()) {
            iUd = iUd3;
        }
        layoutParams8.topMargin = iUd;
        this.mo.setTextColor(-16777216);
        this.mo.setPadding(iUd2, iUd3, iUd2, iUd3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iUd3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.mo.setBackground(gradientDrawable);
        this.mo.setText(ljh.qdl(context, "tt_report_this_ad"));
        this.mo.setTextSize(mml() ? 14 : 12);
        Drawable drawableLnr = ljh.lnr(context, "tt_report_ad_arrow");
        drawableLnr.setBounds(0, 0, iUd2, iUd2);
        this.mo.setCompoundDrawables(null, null, drawableLnr, null);
        this.mo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lnr.tvp.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                tvp.this.qdl();
            }
        });
        mzzVar.addView(this.mo, layoutParams8);
        return mzzVar;
    }

    private void ud(List<FilterWord> list) {
        this.qdl.qdl(list);
    }

    public void ud() {
        View view = this.tvp;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.jpc;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = this.to;
        if (mmlVar != null) {
            mmlVar.setVisibility(8);
        }
        to toVar = this.mml;
        if (toVar != null) {
            FilterWord filterWord = this.rdp;
            if (filterWord != null) {
                toVar.qdl(filterWord);
            } else {
                toVar.qdl(to.qdl);
            }
            this.mml.lnr(null);
        }
    }

    public void qdl() {
        View view = this.tvp;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.jpc;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.mo.mml mmlVar = this.to;
        if (mmlVar != null) {
            mmlVar.setVisibility(0);
        }
        to toVar = this.mml;
        if (toVar == null || !toVar.lnr()) {
            return;
        }
        this.rdp = this.mml.ud();
    }

    @Override // com.bytedance.sdk.openadsdk.lnr.to.lnr
    public void qdl(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.mzz != null && TextUtils.isEmpty(this.mml.wd())) {
            this.mzz.setEnabled(!to.qdl.equals(filterWord));
        }
        if (mzz.qdl.equals(filterWord) || mzz.ud.equals(filterWord)) {
            this.mo.setVisibility(8);
            this.wd.setVisibility(8);
        }
        if (mzz.lnr.equals(filterWord) || to.qdl.equals(filterWord)) {
            this.mo.setVisibility(0);
            this.wd.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lnr.to.ud
    public void qdl(int i2) {
        if (to.lnr == i2) {
            this.rdp = null;
            ud();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lnr.to.mml
    public void qdl(String str) {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar;
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar2 = this.rq;
        if (jpcVar2 != null) {
            jpcVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            to toVar = this.mml;
            if (toVar == null || (jpcVar = this.mzz) == null) {
                return;
            }
            jpcVar.setEnabled(toVar.lnr());
            return;
        }
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar3 = this.mzz;
        if (jpcVar3 != null) {
            jpcVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lnr.to.qdl
    public void qdl(List<FilterWord> list) {
        ud(list);
    }
}
