package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.smartdigimkt.m5.b;

/* JADX INFO: loaded from: classes6.dex */
public class ScanningAnimButton extends Button {
    private b e0;
    private volatile boolean f0;
    private int g0;

    public ScanningAnimButton(Context context) {
        this(context, null);
    }

    private void a(Context context) {
        setGravity(17);
    }

    private void b() {
        b bVar = this.e0;
        if (bVar != null) {
            bVar.resume();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i2 = this.g0;
        if (i2 != 0) {
            startAnimation(i2);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        b bVar = this.e0;
        if (bVar != null) {
            bVar.a(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        b bVar = this.e0;
        if (bVar != null) {
            bVar.a(getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        b bVar = this.e0;
        if (bVar != null) {
            bVar.a(i2, i3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            b();
        } else {
            a();
        }
    }

    public void startAnimation(int i2) {
        this.g0 = i2;
        if (this.f0) {
            return;
        }
        this.f0 = true;
        b bVar = this.e0;
        if (bVar != null) {
            bVar.stop();
        }
        b bVarA = com.smartdigimkt.m5.a.a(i2, this);
        this.e0 = bVarA;
        bVarA.start();
    }

    public void stopAnimation() {
        b bVar = this.e0;
        if (bVar != null) {
            bVar.stop();
        }
        this.f0 = false;
    }

    public ScanningAnimButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        b bVar = this.e0;
        if (bVar != null) {
            bVar.pause();
        }
    }

    public ScanningAnimButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.g0 = 0;
        a(context);
    }
}
