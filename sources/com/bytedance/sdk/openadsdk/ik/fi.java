package com.bytedance.sdk.openadsdk.ik;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.uq;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.qd;

/* JADX INFO: loaded from: classes2.dex */
public class fi extends com.bytedance.sdk.openadsdk.core.di.fi implements View.OnClickListener, qt.ik {
    private StateListDrawable di;
    private FilterWord fi;
    private final qt ka;
    private final int xha;
    public static FilterWord ri = new FilterWord("100:1", "GOOD");
    public static FilterWord lr = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord ik = new FilterWord("100:3", "BAD");

    public fi(Context context, int i, qt qtVar) {
        super(context);
        this.xha = i;
        this.ka = qtVar;
        if (qtVar != null) {
            qtVar.ri(this);
        }
        ri(i);
        ri();
        lr();
    }

    private void lr() {
        com.bytedance.sdk.openadsdk.core.di.mj mjVar = new com.bytedance.sdk.openadsdk.core.di.mj(getContext());
        mjVar.setTextSize(this.ka.jbs() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, qd.lr(getContext(), 12.0f), 0, qd.lr(getContext(), this.ka.jbs() ? 8.0f : 4.0f));
        addView(mjVar, layoutParams);
        ri riVar = new ri(getContext());
        riVar.setTextSize(this.ka.jbs() ? 17 : 12);
        riVar.setTextColor(-16777216);
        riVar.setMaxLines(1);
        riVar.setSingleLine();
        riVar.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, qd.lr(getContext(), 12.0f));
        addView(riVar, layoutParams2);
        int i = this.xha;
        if (i == 1) {
            mjVar.setText("😍");
            riVar.setText(uq.ri(getContext(), "tt_good"));
        } else if (i == 2) {
            riVar.setText(uq.ri(getContext(), "tt_not_bad"));
            mjVar.setText("😐");
        } else {
            if (i != 3) {
                return;
            }
            riVar.setText(uq.ri(getContext(), "tt_bad"));
            mjVar.setText("😡");
        }
    }

    private void ri(int i) {
        if (i == 1) {
            this.fi = ri;
        } else if (i == 2) {
            this.fi = lr;
        } else {
            if (i != 3) {
                return;
            }
            this.fi = ik;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.ka.ri(qt.ri);
        } else {
            this.ka.ri(this.fi);
        }
    }

    private void ri() {
        if (this.di == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(qd.lr(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(qd.lr(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(qd.lr(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.di = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.di.addState(new int[0], gradientDrawable);
        }
        setBackground(this.di);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.ik.qt.ik
    public void ri(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.fi) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
