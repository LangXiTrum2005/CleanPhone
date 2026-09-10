package com.bytedance.adsdk.ugeno.di.ri;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.adsdk.ugeno.di.ka;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ri extends LinearLayout {

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private String f18013co;
    private int di;
    private int fi;
    protected int ik;
    private int jbs;
    private List<View> ka;
    protected int lr;
    private boolean mj;
    private float qt;
    protected Context ri;
    private float sf;
    private int xha;

    public ri(Context context) {
        super(context);
        this.fi = Opcodes.V_PREVIEW;
        this.di = -16776961;
        this.xha = 5;
        this.lr = 40;
        this.ik = 20;
        this.f18013co = "row";
        this.ri = context;
        this.ka = new ArrayList();
        setOrientation(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ka() {
        FrameLayout frameLayout = (FrameLayout) getParent();
        if (frameLayout == null) {
            return;
        }
        float width = frameLayout.getWidth();
        float height = frameLayout.getHeight();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        float width2 = getWidth();
        float height2 = getHeight();
        float f = this.sf;
        layoutParams.topMargin = (int) (((int) ((height * f) / 100.0f)) - ((height2 * f) / 100.0f));
        float f2 = this.qt;
        layoutParams.leftMargin = (int) (((int) ((width * f2) / 100.0f)) - ((width2 * f2) / 100.0f));
        setLayoutParams(layoutParams);
    }

    public int getSize() {
        return this.ka.size();
    }

    public void ik() {
        this.ka.clear();
        removeAllViews();
    }

    public abstract Drawable lr(int i);

    public void lr() {
        View view = new View(getContext());
        view.setClickable(false);
        if (this instanceof lr) {
            this.ik = this.lr;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.lr, this.ik);
        if (getOrientation() == 1) {
            int i = this.xha;
            layoutParams.topMargin = i;
            layoutParams.bottomMargin = i;
        } else {
            int i2 = this.xha;
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
        }
        addView(view, layoutParams);
        view.setBackground(lr(this.di));
        this.ka.add(view);
    }

    public void setIndicatorDirection(String str) {
        this.f18013co = str;
        if (TextUtils.equals(str, "column")) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
    }

    public void setIndicatorHeight(int i) {
        this.ik = i;
    }

    public void setIndicatorWidth(int i) {
        this.lr = i;
    }

    public void setIndicatorX(float f) {
        this.qt = f;
    }

    public void setIndicatorY(float f) {
        this.sf = f;
    }

    public void setLoop(boolean z) {
        this.mj = z;
    }

    public void setSelectedColor(int i) {
        this.fi = i;
    }

    public void setUnSelectedColor(int i) {
        this.di = i;
    }

    public void ri(int i, int i2) {
        Iterator<View> it = this.ka.iterator();
        while (it.hasNext()) {
            it.next().setBackground(lr(this.di));
        }
        if (i < 0 || i >= this.ka.size()) {
            i = 0;
        }
        if (this.ka.size() > 0) {
            this.ka.get(i).setBackground(lr(this.fi));
            this.jbs = i2;
        }
    }

    public void ri() {
        post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.di.ri.ri.1
            @Override // java.lang.Runnable
            public void run() {
                ri.this.ka();
            }
        });
    }

    public void ri(int i) {
        if (this instanceof lr) {
            this.ik = this.lr;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.lr, this.ik);
        if (getOrientation() == 1) {
            int i2 = this.xha;
            layoutParams.topMargin = i2;
            layoutParams.bottomMargin = i2;
        } else {
            int i3 = this.xha;
            layoutParams.leftMargin = i3;
            layoutParams.rightMargin = i3;
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.lr, this.ik);
        if (getOrientation() == 1) {
            int i4 = this.xha;
            layoutParams2.topMargin = i4;
            layoutParams2.bottomMargin = i4;
        } else {
            int i5 = this.xha;
            layoutParams2.leftMargin = i5;
            layoutParams2.rightMargin = i5;
        }
        int iRi = ka.ri(this.mj, this.jbs, this.ka.size());
        int iRi2 = ka.ri(this.mj, i, this.ka.size());
        if (this.ka.size() == 0) {
            iRi2 = 0;
        }
        if (!this.ka.isEmpty() && ka.ri(iRi, this.ka) && ka.ri(iRi2, this.ka)) {
            this.ka.get(iRi).setBackground(lr(this.di));
            this.ka.get(iRi).setLayoutParams(layoutParams2);
            this.ka.get(iRi2).setBackground(lr(this.fi));
            this.ka.get(iRi2).setLayoutParams(layoutParams);
            this.jbs = i;
        }
    }
}
