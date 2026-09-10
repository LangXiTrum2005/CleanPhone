package com.bytedance.sdk.openadsdk.ik;

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
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.bytedance.sdk.openadsdk.utils.slm;
import com.google.android.material.card.MaterialCardView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class jbs extends com.bytedance.sdk.openadsdk.core.di.ik implements qt.ik, qt.ka, qt.lr, qt.ri {
    private int aw;
    private FilterWord bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private int f18153co;
    private TextView di;
    private com.bytedance.sdk.openadsdk.core.di.mj fi;
    private int ik;
    private View jbs;
    private final qt ka;
    private int lr;
    private View mj;
    private com.bytedance.sdk.openadsdk.core.di.ka qt;
    di ri;
    private com.bytedance.sdk.openadsdk.core.di.mj sf;
    private sf xha;

    public jbs(Context context, qt qtVar) {
        this(context, qtVar, null);
    }

    private void ik() {
        if (this.f18153co > 0) {
            return;
        }
        this.f18153co = qd.ik(getContext());
        int iFi = qd.fi(getContext());
        this.aw = iFi;
        this.ka.ri(this.f18153co, iFi);
    }

    private boolean ka() {
        if (this.f18153co == 0) {
            ik();
        }
        return this.f18153co < this.aw;
    }

    private com.bytedance.sdk.openadsdk.core.di.mj lr(Context context) {
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ka() ? this.lr : qd.lr(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.ik);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.ik);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i = this.ik;
        mjVar.setPadding(0, i, 0, i);
        mjVar.setGravity(17);
        mjVar.setBackground(stateListDrawable);
        mjVar.setTextColor(-1);
        mjVar.setTextSize(16.0f);
        mjVar.setText(uq.ri(context, "tt_suggestion_commit"));
        mjVar.setEnabled(false);
        mjVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.jbs.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jbs.this.ka.ka();
            }
        });
        mjVar.setLayoutParams(layoutParams);
        return mjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.di.ik, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.f18153co == 0) {
                ik();
            }
            layoutParams.width = Math.min(this.f18153co, this.aw) - (qd.lr(getContext(), 16.0f) * 2);
        }
    }

    public jbs(Context context, qt qtVar, List<FilterWord> list) {
        super(context);
        this.ka = qtVar;
        qtVar.ri((qt.ik) this);
        qtVar.ri((qt.lr) this);
        qtVar.ri((qt.ka) this);
        qtVar.ri((qt.ri) this);
        ik();
        ri(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        lr(list);
    }

    private void ri(Context context) {
        this.ik = qd.lr(context, 8.0f);
        this.lr = qd.lr(context, 20.0f);
        int iLr = qd.lr(context, 56.0f);
        int iLr2 = qd.lr(context, 30.0f);
        int iLr3 = qd.lr(context, 12.0f);
        if (ka()) {
            iLr3 = this.lr;
        }
        if (!ka()) {
            iLr = iLr2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, qd.lr(getContext(), 98.0f));
        view.setBackground(uq.ik(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.ik);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        int iLr4 = qd.lr(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iLr4, iLr4);
        layoutParams3.setMargins(0, iLr3, iLr3, 0);
        layoutParams3.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_END;
        kaVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_titlebar_close_seletor"));
        addView(kaVar, layoutParams3);
        kaVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.jbs.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                jbs.this.ka.fi();
            }
        });
        com.bytedance.sdk.openadsdk.core.di.ka kaVar2 = new com.bytedance.sdk.openadsdk.core.di.ka(context);
        this.qt = kaVar2;
        kaVar2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.jbs.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                jbs.this.lr();
            }
        });
        this.qt.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iLr4, iLr4);
        layoutParams4.setMargins(iLr3, iLr3, 0, 0);
        layoutParams4.gravity = MaterialCardView.CHECKED_ICON_GRAVITY_TOP_START;
        Drawable drawableRi = com.bytedance.sdk.openadsdk.utils.sf.ri(context, "tt_leftbackicon_selector");
        drawableRi.setAutoMirrored(true);
        this.qt.setImageDrawable(drawableRi);
        addView(this.qt, layoutParams4);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iLr3, iLr, iLr3, iLr3);
        fiVar.setOrientation(1);
        addView(fiVar, layoutParams5);
        View viewIk = ik(context);
        this.mj = viewIk;
        fiVar.addView(viewIk);
        View viewKa = ka(context);
        this.jbs = viewKa;
        fiVar.addView(viewKa);
        com.bytedance.sdk.openadsdk.core.di.mj mjVarLr = lr(context);
        this.fi = mjVarLr;
        fiVar.addView(mjVarLr);
    }

    private View ka(Context context) {
        int iLr;
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setOrientation(1);
        if (!ka()) {
            iLr = qd.lr(context, 200.0f);
        } else {
            iLr = qd.lr(context, 358.0f);
        }
        fiVar.setLayoutParams(new LinearLayout.LayoutParams(-1, iLr));
        TextView textView = new TextView(context);
        textView.setText(uq.ri(context, "tt_select_reason"));
        textView.setTextSize(ka() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = qd.lr(context, ka() ? 24.0f : 4.0f);
        fiVar.addView(textView, layoutParams);
        di diVar = new di(context, this.ka);
        this.ri = diVar;
        fiVar.addView(diVar);
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(context);
        this.sf = mjVar;
        mjVar.setId(slm.cm);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = ka() ? this.lr : qd.lr(context, 6.0f);
        layoutParams2.gravity = 17;
        this.sf.setLayoutParams(layoutParams2);
        this.sf.setFocusable(false);
        this.sf.setHint(uq.ri(context, "tt_add_bad_reason"));
        this.sf.setHintTextColor(Color.parseColor("#57000000"));
        this.sf.setTextColor(Color.rgb(22, 24, 35));
        this.sf.setTextSize(15.0f);
        this.sf.setGravity(8388615);
        this.sf.setVisibility(0);
        this.sf.setPadding(0, qd.lr(context, 15.0f), 0, qd.lr(context, 14.0f));
        this.sf.setEllipsize(TextUtils.TruncateAt.END);
        this.sf.setSingleLine();
        this.sf.setMaxLines(1);
        this.sf.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.jbs.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jbs.this.ka.di();
            }
        });
        fiVar.addView(this.sf, layoutParams2);
        fiVar.addView(new sf(context, Color.argb(128, 0, 0, 0)));
        fiVar.setVisibility(8);
        return fiVar;
    }

    private View ik(Context context) {
        com.bytedance.sdk.openadsdk.core.di.fi fiVar = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        fiVar.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(uq.ri(context, "tt_like_this_ad"));
        textView.setTextSize(ka() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        fiVar.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(uq.ri(context, "tt_feel_hint"));
        textView2.setTextSize(ka() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (ka()) {
            layoutParams2.topMargin = qd.lr(context, 4.0f);
        }
        fiVar.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.di.fi fiVar2 = new com.bytedance.sdk.openadsdk.core.di.fi(context);
        fiVar2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iLr = qd.lr(context, 16.0f);
        int iLr2 = qd.lr(context, 12.0f);
        int iLr3 = qd.lr(context, 8.0f);
        if (ka()) {
            layoutParams3.topMargin = iLr;
            layoutParams3.bottomMargin = iLr;
        } else {
            layoutParams3.topMargin = iLr2;
            layoutParams3.bottomMargin = iLr3;
        }
        fiVar.addView(fiVar2, layoutParams3);
        fiVar2.addView(new fi(context, 1, this.ka));
        fi fiVar3 = new fi(context, 2, this.ka);
        ViewGroup.LayoutParams layoutParams4 = fiVar3.getLayoutParams();
        boolean z = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iLr;
        layoutParams7.rightMargin = iLr;
        fiVar2.addView(fiVar3, layoutParams5);
        fiVar2.addView(new fi(context, 3, this.ka));
        sf sfVar = new sf(context);
        this.xha = sfVar;
        fiVar.addView(sfVar);
        this.di = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!ka()) {
            iLr = iLr3;
        }
        layoutParams8.topMargin = iLr;
        this.di.setTextColor(-16777216);
        this.di.setPadding(iLr2, iLr3, iLr2, iLr3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iLr3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.di.setBackground(gradientDrawable);
        this.di.setText(uq.ri(context, "tt_report_this_ad"));
        this.di.setTextSize(ka() ? 14 : 12);
        Drawable drawableIk = uq.ik(context, "tt_report_ad_arrow");
        drawableIk.setBounds(0, 0, iLr2, iLr2);
        this.di.setCompoundDrawables(null, null, drawableIk, null);
        this.di.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.ik.jbs.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jbs.this.ri();
            }
        });
        fiVar.addView(this.di, layoutParams8);
        return fiVar;
    }

    private void lr(List<FilterWord> list) {
        this.ri.ri(list);
    }

    public void lr() {
        View view = this.jbs;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.mj;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = this.qt;
        if (kaVar != null) {
            kaVar.setVisibility(8);
        }
        qt qtVar = this.ka;
        if (qtVar != null) {
            FilterWord filterWord = this.bgr;
            if (filterWord != null) {
                qtVar.ri(filterWord);
            } else {
                qtVar.ri(qt.ri);
            }
            this.ka.ik(null);
        }
    }

    public void ri() {
        View view = this.jbs;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.mj;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.di.ka kaVar = this.qt;
        if (kaVar != null) {
            kaVar.setVisibility(0);
        }
        qt qtVar = this.ka;
        if (qtVar == null || !qtVar.ik()) {
            return;
        }
        this.bgr = this.ka.lr();
    }

    @Override // com.bytedance.sdk.openadsdk.ik.qt.ik
    public void ri(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.fi != null && TextUtils.isEmpty(this.ka.xha())) {
            this.fi.setEnabled(!qt.ri.equals(filterWord));
        }
        if (fi.ri.equals(filterWord) || fi.lr.equals(filterWord)) {
            this.di.setVisibility(8);
            this.xha.setVisibility(8);
        }
        if (fi.ik.equals(filterWord) || qt.ri.equals(filterWord)) {
            this.di.setVisibility(0);
            this.xha.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ik.qt.lr
    public void ri(int i) {
        if (qt.ik == i) {
            this.bgr = null;
            lr();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ik.qt.ka
    public void ri(String str) {
        com.bytedance.sdk.openadsdk.core.di.mj mjVar;
        com.bytedance.sdk.openadsdk.core.di.mj mjVar2 = this.sf;
        if (mjVar2 != null) {
            mjVar2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            qt qtVar = this.ka;
            if (qtVar == null || (mjVar = this.fi) == null) {
                return;
            }
            mjVar.setEnabled(qtVar.ik());
            return;
        }
        com.bytedance.sdk.openadsdk.core.di.mj mjVar3 = this.fi;
        if (mjVar3 != null) {
            mjVar3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ik.qt.ri
    public void ri(List<FilterWord> list) {
        lr(list);
    }
}
