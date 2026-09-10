package com.bytedance.sdk.component.adexpress.lc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ZU extends View {
    private Paint JVA;
    private float JXs;
    private int LD;
    private int Lxb;
    private float NXR;
    private List<Integer> OY;
    private List<Integer> QAg;
    private int STP;
    private int ZU;
    private boolean ebl;
    private int lc;
    private float lk;
    private Paint nBu;
    private float sLN;

    public ZU(Context context) {
        this(context, null);
    }

    private void lk() {
        Paint paint = new Paint();
        this.nBu = paint;
        paint.setAntiAlias(true);
        this.nBu.setStrokeWidth(this.STP);
        this.OY.add(255);
        this.QAg.add(0);
        Paint paint2 = new Paint();
        this.JVA = paint2;
        paint2.setAntiAlias(true);
        this.JVA.setColor(Color.parseColor("#0FFFFFFF"));
        this.JVA.setStyle(Paint.Style.FILL);
    }

    public void LD() {
        this.ebl = false;
        this.QAg.clear();
        this.OY.clear();
        this.OY.add(255);
        this.QAg.add(0);
        invalidate();
    }

    public void Lxb() {
        this.ebl = true;
        invalidate();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.nBu.setShader(new LinearGradient(this.sLN, 0.0f, this.NXR, getMeasuredHeight(), -1, ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.OY.size()) {
                break;
            }
            Integer num = this.OY.get(i);
            this.nBu.setAlpha(num.intValue());
            Integer num2 = this.QAg.get(i);
            if (this.lk + num2.intValue() < this.JXs) {
                canvas.drawCircle(this.sLN, this.NXR, this.lk + num2.intValue(), this.nBu);
            }
            if (num.intValue() > 0 && num2.intValue() < this.JXs) {
                this.OY.set(i, Integer.valueOf(num.intValue() - this.lc > 0 ? num.intValue() - (this.lc * 3) : 1));
                this.QAg.set(i, Integer.valueOf(num2.intValue() + this.lc));
            }
            i++;
        }
        if (((Integer) DM.f(this.QAg, 1)).intValue() >= this.JXs / this.ZU) {
            this.OY.add(255);
            this.QAg.add(0);
        }
        if (this.QAg.size() >= 3) {
            this.QAg.remove(0);
            this.OY.remove(0);
        }
        this.nBu.setAlpha(255);
        this.nBu.setColor(this.LD);
        canvas.drawCircle(this.sLN, this.NXR, this.lk, this.JVA);
        if (this.ebl) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i / 2.0f;
        this.sLN = f;
        this.NXR = i2 / 2.0f;
        float f2 = f - (this.STP / 2.0f);
        this.JXs = f2;
        this.lk = f2 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    public void setColor(int i) {
        this.Lxb = i;
    }

    public void setCoreColor(int i) {
        this.LD = i;
    }

    public void setCoreRadius(int i) {
        this.lk = i;
    }

    public void setDiffuseSpeed(int i) {
        this.lc = i;
    }

    public void setDiffuseWidth(int i) {
        this.ZU = i;
    }

    public void setMaxWidth(int i) {
        this.JXs = i;
    }

    public ZU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ZU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Lxb = -1;
        this.LD = SupportMenu.CATEGORY_MASK;
        this.lk = 18.0f;
        this.ZU = 3;
        this.JXs = 50.0f;
        this.lc = 2;
        this.ebl = false;
        this.OY = new ArrayList();
        this.QAg = new ArrayList();
        this.STP = 24;
        lk();
    }
}
