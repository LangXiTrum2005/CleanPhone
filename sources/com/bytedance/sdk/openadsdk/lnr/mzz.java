package com.bytedance.sdk.openadsdk.lnr;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.ljh;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class mzz extends com.bytedance.sdk.openadsdk.core.mo.mzz implements View.OnClickListener, to.lnr {
    private final to mml;
    private StateListDrawable mo;
    private FilterWord mzz;
    private final int wd;
    public static FilterWord qdl = new FilterWord("100:1", "GOOD");
    public static FilterWord ud = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord lnr = new FilterWord("100:3", "BAD");

    public mzz(Context context, int i2, to toVar) {
        super(context);
        this.wd = i2;
        this.mml = toVar;
        if (toVar != null) {
            toVar.qdl(this);
        }
        qdl(i2);
        qdl();
        ud();
    }

    private void qdl(int i2) {
        if (i2 == 1) {
            this.mzz = qdl;
        } else if (i2 == 2) {
            this.mzz = ud;
        } else {
            if (i2 != 3) {
                return;
            }
            this.mzz = lnr;
        }
    }

    private void ud() {
        com.bytedance.sdk.openadsdk.core.mo.jpc jpcVar = new com.bytedance.sdk.openadsdk.core.mo.jpc(getContext());
        jpcVar.setTextSize(this.mml.tvp() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, ax.ud(getContext(), 12.0f), 0, ax.ud(getContext(), this.mml.tvp() ? 8.0f : 4.0f));
        addView(jpcVar, layoutParams);
        qdl qdlVar = new qdl(getContext());
        qdlVar.setTextSize(this.mml.tvp() ? 17 : 12);
        qdlVar.setTextColor(-16777216);
        qdlVar.setMaxLines(1);
        qdlVar.setSingleLine();
        qdlVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, ax.ud(getContext(), 12.0f));
        addView(qdlVar, layoutParams2);
        int i2 = this.wd;
        if (i2 == 1) {
            jpcVar.setText("😍");
            qdlVar.setText(ljh.qdl(getContext(), "tt_good"));
        } else if (i2 == 2) {
            qdlVar.setText(ljh.qdl(getContext(), "tt_not_bad"));
            jpcVar.setText("😐");
        } else {
            if (i2 != 3) {
                return;
            }
            qdlVar.setText(ljh.qdl(getContext(), "tt_bad"));
            jpcVar.setText("😡");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.mml.qdl(to.qdl);
        } else {
            this.mml.qdl(this.mzz);
        }
    }

    private void qdl() {
        if (this.mo == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(ax.ud(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(ax.ud(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(ax.ud(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.mo = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.mo.addState(new int[0], gradientDrawable);
        }
        setBackground(this.mo);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.lnr.to.lnr
    public void qdl(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.mzz) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
