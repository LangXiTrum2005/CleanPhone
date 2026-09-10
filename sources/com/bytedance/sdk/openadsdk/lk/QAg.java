package com.bytedance.sdk.openadsdk.lk;

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
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class QAg extends com.bytedance.sdk.openadsdk.core.JXs.lk implements nBu.LD, nBu.Lxb, nBu.ZU, nBu.lk {
    private com.bytedance.sdk.openadsdk.core.JXs.OY JVA;
    private com.bytedance.sdk.openadsdk.core.JXs.OY JXs;
    private int LD;
    lc Lxb;
    private int NXR;
    private View OY;
    private View QAg;
    private FilterWord STP;
    private final nBu ZU;
    private JVA ebl;
    private TextView lc;
    private int lk;
    private com.bytedance.sdk.openadsdk.core.JXs.ZU nBu;
    private int sLN;

    public QAg(Context context, nBu nbu) {
        this(context, nbu, null);
    }

    private com.bytedance.sdk.openadsdk.core.JXs.OY LD(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = ZU() ? this.LD : le.lk(context, 12.0f);
        layoutParams.gravity = 80;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.lk);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.lk);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        int i = this.lk;
        oy.setPadding(0, i, 0, i);
        oy.setGravity(17);
        oy.setBackground(stateListDrawable);
        oy.setTextColor(-1);
        oy.setTextSize(16.0f);
        oy.setText(tD.Lxb(context, "tt_suggestion_commit"));
        oy.setEnabled(false);
        oy.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lk.QAg.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                QAg.this.ZU.ZU();
            }
        });
        oy.setLayoutParams(layoutParams);
        return oy;
    }

    private boolean ZU() {
        if (this.sLN == 0) {
            lk();
        }
        return this.sLN < this.NXR;
    }

    private void lk() {
        if (this.sLN > 0) {
            return;
        }
        this.sLN = le.lk(getContext());
        int iZU = le.ZU(getContext());
        this.NXR = iZU;
        this.ZU.Lxb(this.sLN, iZU);
    }

    @Override // com.bytedance.sdk.openadsdk.core.JXs.lk, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            if (this.sLN == 0) {
                lk();
            }
            layoutParams.width = Math.min(this.sLN, this.NXR) - (le.lk(getContext(), 16.0f) * 2);
        }
    }

    public QAg(Context context, nBu nbu, List<FilterWord> list) {
        super(context);
        this.ZU = nbu;
        nbu.Lxb((nBu.lk) this);
        nbu.Lxb((nBu.LD) this);
        nbu.Lxb((nBu.ZU) this);
        nbu.Lxb((nBu.Lxb) this);
        lk();
        Lxb(context);
        if (list == null || list.isEmpty()) {
            return;
        }
        LD(list);
    }

    private void Lxb(Context context) {
        this.lk = le.lk(context, 8.0f);
        this.LD = le.lk(context, 20.0f);
        int iLk = le.lk(context, 56.0f);
        int iLk2 = le.lk(context, 30.0f);
        int iLk3 = le.lk(context, 12.0f);
        if (ZU()) {
            iLk3 = this.LD;
        }
        if (!ZU()) {
            iLk = iLk2;
        }
        View view = new View(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, le.lk(getContext(), 98.0f));
        view.setBackground(tD.lk(context, "tt_ad_bg_header_gradient"));
        addView(view, layoutParams);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.lk);
        gradientDrawable.setColor(-1);
        setBackground(gradientDrawable);
        setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        int iLk4 = le.lk(context, 24.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iLk4, iLk4);
        layoutParams3.setMargins(0, iLk3, iLk3, 0);
        layoutParams3.gravity = 8388661;
        zu.setImageDrawable(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_titlebar_close_seletor"));
        addView(zu, layoutParams3);
        zu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lk.QAg.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                QAg.this.ZU.JXs();
            }
        });
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu2 = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        this.nBu = zu2;
        zu2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lk.QAg.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                QAg.this.LD();
            }
        });
        this.nBu.setVisibility(8);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(iLk4, iLk4);
        layoutParams4.setMargins(iLk3, iLk3, 0, 0);
        layoutParams4.gravity = 8388659;
        Drawable drawableLxb = com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_leftbackicon_selector");
        drawableLxb.setAutoMirrored(true);
        this.nBu.setImageDrawable(drawableLxb);
        addView(this.nBu, layoutParams4);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(iLk3, iLk, iLk3, iLk3);
        jXs.setOrientation(1);
        addView(jXs, layoutParams5);
        View viewLk = lk(context);
        this.OY = viewLk;
        jXs.addView(viewLk);
        View viewZU = ZU(context);
        this.QAg = viewZU;
        jXs.addView(viewZU);
        com.bytedance.sdk.openadsdk.core.JXs.OY oyLD = LD(context);
        this.JXs = oyLD;
        jXs.addView(oyLD);
    }

    private View ZU(Context context) {
        int iLk;
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setOrientation(1);
        if (!ZU()) {
            iLk = le.lk(context, 200.0f);
        } else {
            iLk = le.lk(context, 358.0f);
        }
        jXs.setLayoutParams(new LinearLayout.LayoutParams(-1, iLk));
        TextView textView = new TextView(context);
        textView.setText(tD.Lxb(context, "tt_select_reason"));
        textView.setTextSize(ZU() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.bottomMargin = le.lk(context, ZU() ? 24.0f : 4.0f);
        jXs.addView(textView, layoutParams);
        lc lcVar = new lc(context, this.ZU);
        this.Lxb = lcVar;
        jXs.addView(lcVar);
        if (VVE.TA().Of()) {
            com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
            this.JVA = oy;
            oy.setId(STP.RC);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = ZU() ? this.LD : le.lk(context, 6.0f);
            layoutParams2.gravity = 17;
            this.JVA.setLayoutParams(layoutParams2);
            this.JVA.setFocusable(false);
            this.JVA.setHint(tD.Lxb(context, "tt_add_bad_reason"));
            this.JVA.setHintTextColor(Color.parseColor("#57000000"));
            this.JVA.setTextColor(Color.rgb(22, 24, 35));
            this.JVA.setTextSize(15.0f);
            this.JVA.setGravity(GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK);
            this.JVA.setVisibility(0);
            this.JVA.setPadding(0, le.lk(context, 15.0f), 0, le.lk(context, 14.0f));
            this.JVA.setEllipsize(TextUtils.TruncateAt.END);
            this.JVA.setSingleLine();
            this.JVA.setMaxLines(1);
            this.JVA.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lk.QAg.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    QAg.this.ZU.lc();
                }
            });
            jXs.addView(this.JVA, layoutParams2);
            jXs.addView(new JVA(context, Color.argb(128, 0, 0, 0)));
        }
        jXs.setVisibility(8);
        return jXs;
    }

    private View lk(Context context) {
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        jXs.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(tD.Lxb(context, "tt_like_this_ad"));
        textView.setTextSize(ZU() ? 23 : 16);
        textView.setGravity(1);
        textView.setTextColor(Color.parseColor("#161823"));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        jXs.addView(textView, layoutParams);
        TextView textView2 = new TextView(context);
        textView2.setText(tD.Lxb(context, "tt_feel_hint"));
        textView2.setTextSize(ZU() ? 14 : 10);
        textView2.setAlpha(0.5f);
        textView2.setTextColor(Color.parseColor("#161823"));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        if (ZU()) {
            layoutParams2.topMargin = le.lk(context, 4.0f);
        }
        jXs.addView(textView2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iLk = le.lk(context, 16.0f);
        int iLk2 = le.lk(context, 12.0f);
        int iLk3 = le.lk(context, 8.0f);
        if (ZU()) {
            layoutParams3.topMargin = iLk;
            layoutParams3.bottomMargin = iLk;
        } else {
            layoutParams3.topMargin = iLk2;
            layoutParams3.bottomMargin = iLk3;
        }
        jXs.addView(jXs2, layoutParams3);
        jXs2.addView(new JXs(context, 1, this.ZU));
        JXs jXs3 = new JXs(context, 2, this.ZU);
        ViewGroup.LayoutParams layoutParams4 = jXs3.getLayoutParams();
        boolean z = layoutParams4 instanceof LinearLayout.LayoutParams;
        ViewGroup.LayoutParams layoutParams5 = layoutParams4;
        if (!z) {
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
            layoutParams6.weight = 1.0f;
            layoutParams5 = layoutParams6;
        }
        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams5;
        layoutParams7.leftMargin = iLk;
        layoutParams7.rightMargin = iLk;
        jXs2.addView(jXs3, layoutParams5);
        jXs2.addView(new JXs(context, 3, this.ZU));
        JVA jva = new JVA(context);
        this.ebl = jva;
        jXs.addView(jva);
        this.lc = new TextView(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        if (!ZU()) {
            iLk = iLk3;
        }
        layoutParams8.topMargin = iLk;
        this.lc.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.lc.setPadding(iLk2, iLk3, iLk2, iLk3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(iLk3);
        gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
        this.lc.setBackground(gradientDrawable);
        this.lc.setText(tD.Lxb(context, "tt_report_this_ad"));
        this.lc.setTextSize(ZU() ? 14 : 12);
        Drawable drawableLk = tD.lk(context, "tt_report_ad_arrow");
        drawableLk.setBounds(0, 0, iLk2, iLk2);
        this.lc.setCompoundDrawables(null, null, drawableLk, null);
        this.lc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.lk.QAg.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                QAg.this.Lxb();
            }
        });
        jXs.addView(this.lc, layoutParams8);
        return jXs;
    }

    private void LD(List<FilterWord> list) {
        this.Lxb.Lxb(list);
    }

    public void LD() {
        View view = this.QAg;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.OY;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = this.nBu;
        if (zu != null) {
            zu.setVisibility(8);
        }
        nBu nbu = this.ZU;
        if (nbu != null) {
            FilterWord filterWord = this.STP;
            if (filterWord != null) {
                nbu.Lxb(filterWord);
            } else {
                nbu.Lxb(nBu.Lxb);
            }
            this.ZU.lk(null);
        }
    }

    public void Lxb() {
        View view = this.QAg;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.OY;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = this.nBu;
        if (zu != null) {
            zu.setVisibility(0);
        }
        nBu nbu = this.ZU;
        if (nbu == null || !nbu.lk()) {
            return;
        }
        this.STP = this.ZU.LD();
    }

    @Override // com.bytedance.sdk.openadsdk.lk.nBu.lk
    public void Lxb(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.JXs != null && TextUtils.isEmpty(this.ZU.ebl())) {
            this.JXs.setEnabled(!nBu.Lxb.equals(filterWord));
        }
        if (JXs.Lxb.equals(filterWord) || JXs.LD.equals(filterWord)) {
            this.lc.setVisibility(8);
            this.ebl.setVisibility(8);
        }
        if (JXs.lk.equals(filterWord) || nBu.Lxb.equals(filterWord)) {
            this.lc.setVisibility(0);
            this.ebl.setVisibility(0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lk.nBu.LD
    public void Lxb(int i) {
        if (nBu.lk == i) {
            this.STP = null;
            LD();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lk.nBu.ZU
    public void Lxb(String str) {
        com.bytedance.sdk.openadsdk.core.JXs.OY oy;
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = this.JVA;
        if (oy2 != null) {
            oy2.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            nBu nbu = this.ZU;
            if (nbu == null || (oy = this.JXs) == null) {
                return;
            }
            oy.setEnabled(nbu.lk());
            return;
        }
        com.bytedance.sdk.openadsdk.core.JXs.OY oy3 = this.JXs;
        if (oy3 != null) {
            oy3.setEnabled(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.lk.nBu.Lxb
    public void Lxb(List<FilterWord> list) {
        LD(list);
    }
}
