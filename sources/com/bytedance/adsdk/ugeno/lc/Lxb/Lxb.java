package com.bytedance.adsdk.ugeno.lc.Lxb;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.internal.view.SupportMenu;
import com.bytedance.adsdk.ugeno.ebl.OY;
import com.bytedance.adsdk.ugeno.lc.ZU;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Lxb extends LinearLayout {
    private int JXs;
    private int LD;
    private List<View> Lxb;
    private boolean OY;
    private int QAg;
    private Context ZU;
    private int ebl;
    private int lc;
    private int lk;

    public Lxb(Context context) {
        super(context);
        this.LD = SupportMenu.CATEGORY_MASK;
        this.lk = -16776961;
        this.JXs = 5;
        this.lc = 20;
        this.ebl = 20;
        this.ZU = context;
        this.Lxb = new ArrayList();
        Lxb();
    }

    public void LD() {
        View view = new View(getContext());
        view.setClickable(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.lc, this.ebl);
        int i = this.JXs;
        layoutParams.leftMargin = i;
        layoutParams.rightMargin = i;
        addView(view, layoutParams);
        view.setBackground(LD(this.lk));
        this.Lxb.add(view);
    }

    public void Lxb(int i, int i2) {
        Iterator<View> it = this.Lxb.iterator();
        while (it.hasNext()) {
            it.next().setBackground(LD(this.lk));
        }
        if (i < 0 || i >= this.Lxb.size()) {
            i = 0;
        }
        if (this.Lxb.size() > 0) {
            this.Lxb.get(i).setBackground(LD(this.LD));
            this.QAg = i2;
        }
    }

    public int getSize() {
        return this.Lxb.size();
    }

    public void setLoop(boolean z) {
        this.OY = z;
    }

    public void setSelectedColor(int i) {
        this.LD = i;
    }

    public void setUnSelectedColor(int i) {
        this.lk = i;
    }

    public void Lxb() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        setGravity(17);
        setOrientation(0);
        layoutParams.bottomMargin = (int) OY.Lxb(this.ZU, 10.0f);
        setLayoutParams(layoutParams);
    }

    private GradientDrawable LD(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public void Lxb(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.lc, this.ebl);
        int i2 = this.JXs;
        layoutParams.leftMargin = i2;
        layoutParams.rightMargin = i2;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.lc, this.ebl);
        int i3 = this.JXs;
        layoutParams2.leftMargin = i3;
        layoutParams2.rightMargin = i3;
        int iLxb = ZU.Lxb(this.OY, this.QAg, this.Lxb.size());
        int iLxb2 = ZU.Lxb(this.OY, i, this.Lxb.size());
        if (this.Lxb.size() == 0) {
            iLxb2 = 0;
        }
        if (!this.Lxb.isEmpty() && ZU.Lxb(iLxb, this.Lxb) && ZU.Lxb(iLxb2, this.Lxb)) {
            this.Lxb.get(iLxb).setBackground(LD(this.lk));
            this.Lxb.get(iLxb).setLayoutParams(layoutParams2);
            this.Lxb.get(iLxb2).setBackground(LD(this.LD));
            this.Lxb.get(iLxb2).setLayoutParams(layoutParams);
            this.QAg = i;
        }
    }
}
