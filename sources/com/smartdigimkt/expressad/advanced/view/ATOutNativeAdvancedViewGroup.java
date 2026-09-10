package com.smartdigimkt.expressad.advanced.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.f.c;

/* JADX INFO: loaded from: classes5.dex */
public class ATOutNativeAdvancedViewGroup extends RelativeLayout {
    private c e0;

    public class a implements Runnable {
        final /* synthetic */ int X;

        public a(int i2) {
            this.X = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ATOutNativeAdvancedViewGroup.this.e0 != null) {
                ATOutNativeAdvancedViewGroup.this.e0.i(this.X);
            }
        }
    }

    public ATOutNativeAdvancedViewGroup(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e0 != null) {
            a(1);
            if (getVisibility() == 0) {
                a(2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.e0;
        if (cVar != null) {
            cVar.f(1);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            a(2);
            if (getParent() != null) {
                a(1);
                return;
            }
            return;
        }
        c cVar = this.e0;
        if (cVar != null) {
            cVar.f(2);
        }
    }

    public void setProvider(c cVar) {
        this.e0 = cVar;
    }

    public ATOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(int i2) {
        postDelayed(new a(i2), 200L);
    }

    public ATOutNativeAdvancedViewGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
