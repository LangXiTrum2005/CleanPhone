package com.bytedance.sdk.openadsdk.lk;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends com.bytedance.sdk.openadsdk.core.JXs.JXs implements View.OnClickListener, nBu.lk {
    private final nBu JXs;
    private final int OY;
    private StateListDrawable ebl;
    private FilterWord lc;
    public static FilterWord Lxb = new FilterWord("100:1", "GOOD");
    public static FilterWord LD = new FilterWord("100:2", "NOT_BAD");
    public static FilterWord lk = new FilterWord("100:3", "BAD");
    public static List<JXs> ZU = new ArrayList(3);

    public JXs(@NonNull Context context, int i, nBu nbu) {
        super(context);
        this.OY = i;
        this.JXs = nbu;
        if (nbu != null) {
            nbu.Lxb(this);
        }
        Lxb(i);
        Lxb();
        LD();
        ZU.add(this);
    }

    private void LD() {
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(getContext());
        oy.setTextSize(this.JXs.QAg() ? 40 : 30);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, le.lk(getContext(), 12.0f), 0, le.lk(getContext(), this.JXs.QAg() ? 8.0f : 4.0f));
        addView(oy, layoutParams);
        Lxb lxb = new Lxb(getContext());
        lxb.setTextSize(this.JXs.QAg() ? 17 : 12);
        lxb.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        lxb.setMaxLines(1);
        lxb.setSingleLine();
        lxb.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.setMargins(0, 0, 0, le.lk(getContext(), 12.0f));
        addView(lxb, layoutParams2);
        int i = this.OY;
        if (i == 1) {
            oy.setText("😍");
            lxb.setText(tD.Lxb(getContext(), "tt_good"));
        } else if (i == 2) {
            lxb.setText(tD.Lxb(getContext(), "tt_not_bad"));
            oy.setText("😐");
        } else {
            if (i != 3) {
                return;
            }
            lxb.setText(tD.Lxb(getContext(), "tt_bad"));
            oy.setText("😡");
        }
    }

    private void Lxb(int i) {
        if (i == 1) {
            this.lc = Lxb;
        } else if (i == 2) {
            this.lc = LD;
        } else {
            if (i != 3) {
                return;
            }
            this.lc = lk;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (isSelected()) {
            this.JXs.Lxb(nBu.Lxb);
        } else {
            this.JXs.Lxb(this.lc);
        }
    }

    private void Lxb() {
        if (this.ebl == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(le.lk(getContext(), 12.0f));
            gradientDrawable.setColor(Color.parseColor("#F8F8F8"));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setStroke(le.lk(getContext(), 2.0f), Color.parseColor("#FE2C55"));
            gradientDrawable2.setCornerRadius(le.lk(getContext(), 12.0f));
            gradientDrawable2.setColor(Color.parseColor("#12FE2C55"));
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.ebl = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_selected}, gradientDrawable2);
            this.ebl.addState(new int[0], gradientDrawable);
        }
        setBackground(this.ebl);
        setSelected(false);
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setOnClickListener(this);
    }

    @Override // com.bytedance.sdk.openadsdk.lk.nBu.lk
    public void Lxb(FilterWord filterWord) {
        FilterWord filterWord2;
        if (filterWord == null || (filterWord2 = this.lc) == null) {
            return;
        }
        setSelected(filterWord.equals(filterWord2));
    }
}
