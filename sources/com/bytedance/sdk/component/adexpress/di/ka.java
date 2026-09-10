package com.bytedance.sdk.component.adexpress.di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends View {
    private float aw;
    private int bgr;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private float f18032co;
    private int di;
    private float fi;
    private float ik;
    private List<Integer> jbs;
    private int ka;
    private int lr;
    private List<Integer> mj;
    private Paint qt;
    private int ri;
    private Paint sf;
    private boolean xha;

    public ka(Context context) {
        this(context, null);
    }

    private void ik() {
        Paint paint = new Paint();
        this.qt = paint;
        paint.setAntiAlias(true);
        this.qt.setStrokeWidth(this.bgr);
        this.mj.add(255);
        this.jbs.add(0);
        Paint paint2 = new Paint();
        this.sf = paint2;
        paint2.setAntiAlias(true);
        this.sf.setColor(Color.parseColor("#0FFFFFFF"));
        this.sf.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    public void lr() {
        this.xha = false;
        this.jbs.clear();
        this.mj.clear();
        this.mj.add(255);
        this.jbs.add(0);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.qt.setShader(new LinearGradient(this.f18032co, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.aw, getMeasuredHeight(), -1, 16777215, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            if (i >= this.mj.size()) {
                break;
            }
            Integer num = this.mj.get(i);
            this.qt.setAlpha(num.intValue());
            Integer num2 = this.jbs.get(i);
            if (this.ik + num2.intValue() < this.fi) {
                canvas.drawCircle(this.f18032co, this.aw, this.ik + num2.intValue(), this.qt);
            }
            if (num.intValue() > 0 && num2.intValue() < this.fi) {
                this.mj.set(i, Integer.valueOf(num.intValue() - this.di > 0 ? num.intValue() - (this.di * 3) : 1));
                this.jbs.set(i, Integer.valueOf(num2.intValue() + this.di));
            }
            i++;
        }
        List<Integer> list = this.jbs;
        if (list.get(list.size() - 1).intValue() >= this.fi / this.ka) {
            this.mj.add(255);
            this.jbs.add(0);
        }
        if (this.jbs.size() >= 3) {
            this.jbs.remove(0);
            this.mj.remove(0);
        }
        this.qt.setAlpha(255);
        this.qt.setColor(this.lr);
        canvas.drawCircle(this.f18032co, this.aw, this.ik, this.sf);
        if (this.xha) {
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
        this.f18032co = f;
        this.aw = i2 / 2.0f;
        float f2 = f - (this.bgr / 2.0f);
        this.fi = f2;
        this.ik = f2 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    public void ri() {
        this.xha = true;
        invalidate();
    }

    public void setColor(int i) {
        this.ri = i;
    }

    public void setCoreColor(int i) {
        this.lr = i;
    }

    public void setCoreRadius(int i) {
        this.ik = i;
    }

    public void setDiffuseSpeed(int i) {
        this.di = i;
    }

    public void setDiffuseWidth(int i) {
        this.ka = i;
    }

    public void setMaxWidth(int i) {
        this.fi = i;
    }

    public ka(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ka(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ri = -1;
        this.lr = Opcodes.V_PREVIEW;
        this.ik = 18.0f;
        this.ka = 3;
        this.fi = 50.0f;
        this.di = 2;
        this.xha = false;
        this.mj = new ArrayList();
        this.jbs = new ArrayList();
        this.bgr = 24;
        ik();
    }
}
