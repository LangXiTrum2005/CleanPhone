package com.bytedance.adsdk.ugeno.mo.qdl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.mo.mml;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class qdl extends LinearLayout {
    private String fs;
    private boolean jpc;
    protected int lnr;
    private List<View> mml;
    private int mo;
    private int mzz;
    protected Context qdl;
    private float rq;
    private float to;
    private int tvp;
    protected int ud;
    private int wd;

    public qdl(Context context) {
        super(context);
        this.mzz = -65536;
        this.mo = -16776961;
        this.wd = 5;
        this.ud = 40;
        this.lnr = 20;
        this.fs = "row";
        this.qdl = context;
        this.mml = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mml() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        float height2 = getHeight();
        float f = this.rq;
        layoutParams.topMargin = (int) (((int) ((height * f) / 100.0f)) - ((height2 * f) / 100.0f));
        float f2 = this.to;
        layoutParams.leftMargin = (int) (((int) ((width * f2) / 100.0f)) - ((width2 * f2) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public int getSize() {
        return this.mml.size();
    }

    public void lnr() {
        this.mml.clear();
        removeAllViews();
    }

    public void setIndicatorDirection(String str) {
        this.fs = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i2) {
        this.lnr = i2;
    }

    public void setIndicatorWidth(int i2) {
        this.ud = i2;
    }

    public void setIndicatorX(float f) {
        this.to = f;
    }

    public void setIndicatorY(float f) {
        this.rq = f;
    }

    public void setLoop(boolean z2) {
        this.jpc = z2;
    }

    public void setSelectedColor(int i2) {
        this.mzz = i2;
    }

    public void setUnSelectedColor(int i2) {
        this.mo = i2;
    }

    public abstract Drawable ud(int i2);

    public void ud() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof ud) {
            this.lnr = this.ud;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ud, this.lnr);
        if (getOrientation() == 1) {
            int i2 = this.wd;
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
        } else {
            int i3 = this.wd;
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
        }
        addView(view, layoutParams);
        view.setBackground(ud(this.mo));
        this.mml.add(view);
    }

    public void qdl(int i2, int i3) {
        Iterator<View> it = this.mml.iterator();
        while (it.hasNext()) {
            it.next().setBackground(ud(this.mo));
        }
        if (i2 < 0 || i2 >= this.mml.size()) {
            i2 = 0;
        }
        if (this.mml.size() > 0) {
            this.mml.get(i2).setBackground(ud(this.mzz));
            this.tvp = i3;
        }
    }

    public void qdl() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.mo.qdl.qdl.1
            @Override // java.lang.Runnable
            public void run() {
                qdl.this.mml();
            }
        });
    }

    public void qdl(int i2) {
        if (this instanceof ud) {
            this.lnr = this.ud;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.ud, this.lnr);
        if (getOrientation() == 1) {
            int i3 = this.wd;
            layoutParams.topMargin = i3;
            layoutParams.bottomMargin = i3;
        } else {
            int i4 = this.wd;
            layoutParams.leftMargin = i4;
            layoutParams.rightMargin = i4;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.ud, this.lnr);
        if (getOrientation() == 1) {
            int i5 = this.wd;
            layoutParams2.topMargin = i5;
            layoutParams2.bottomMargin = i5;
        } else {
            int i6 = this.wd;
            layoutParams2.leftMargin = i6;
            layoutParams2.rightMargin = i6;
        }
        int iQdl = mml.qdl(this.jpc, this.tvp, this.mml.size());
        int iQdl2 = mml.qdl(this.jpc, i2, this.mml.size());
        if (this.mml.size() == 0) {
            iQdl2 = 0;
        }
        if (!this.mml.isEmpty() && mml.qdl(iQdl, this.mml) && mml.qdl(iQdl2, this.mml)) {
            this.mml.get(iQdl).setBackground(ud(this.mo));
            this.mml.get(iQdl).setLayoutParams(layoutParams2);
            this.mml.get(iQdl2).setBackground(ud(this.mzz));
            this.mml.get(iQdl2).setLayoutParams(layoutParams);
            this.tvp = i2;
        }
    }
}
