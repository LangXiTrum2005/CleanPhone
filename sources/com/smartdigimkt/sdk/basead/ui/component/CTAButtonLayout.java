package com.smartdigimkt.sdk.basead.ui.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.smartdigimkt.a6.b;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.r5.c;
import com.smartdigimkt.r5.d;
import com.smartdigimkt.r5.e;
import com.smartdigimkt.v6.a;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class CTAButtonLayout extends LinearLayout {
    protected final int e0;
    protected final int f0;
    protected final int g0;
    protected final int h0;
    private int i0;
    d j0;

    public CTAButtonLayout(Context context) {
        this(context, null);
    }

    public void a() {
        setOrientation(0);
        this.i0 = 0;
    }

    public void activateSubCloseButton() {
        d dVar = this.j0;
        if (dVar != null) {
            dVar.b(this);
        }
    }

    public void changeMajorButtonBackground(Drawable drawable) {
        d dVar = this.j0;
        if (dVar != null) {
            dVar.a(drawable);
        }
    }

    public void changeMinorButtonStyle() {
        d dVar = this.j0;
        if (dVar != null) {
            dVar.c(this);
        }
    }

    public View getMajorCTAButtonView() {
        d dVar = this.j0;
        return dVar != null ? dVar.a() : this;
    }

    public String getMajorCTAText() {
        d dVar = this.j0;
        return dVar != null ? dVar.c() : "";
    }

    public View getSubCloseView() {
        d dVar;
        if (this.i0 != 3 || (dVar = this.j0) == null) {
            return null;
        }
        return dVar.b();
    }

    public void initSetting(f fVar, a aVar, boolean z2, b.a aVar2) {
        int iA = a(fVar, aVar, z2);
        int i2 = this.i0;
        if (iA != i2) {
            if (i2 != 0) {
                removeAllViews();
            }
            this.i0 = iA;
            d dVarA = a(iA);
            this.j0 = dVarA;
            dVarA.a(this);
        }
        d dVar = this.j0;
        if (dVar != null) {
            dVar.a(this, fVar, aVar, z2, aVar2);
        }
    }

    public boolean needInterceptCloseViewShow() {
        return this.i0 == 3;
    }

    public void setMajorCTAText(String str) {
        d dVar = this.j0;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public CTAButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CTAButtonLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e0 = 0;
        this.f0 = 1;
        this.g0 = 2;
        this.h0 = 3;
        a();
    }

    public int a(f fVar, a aVar, boolean z2) {
        String strValueOf = String.valueOf(aVar.f39164b);
        strValueOf.getClass();
        if (strValueOf.equals("1")) {
            return (z2 || aVar.t.F() != 2) ? 1 : 3;
        }
        if (!strValueOf.equals("3")) {
            return 1;
        }
        if (TextUtils.equals("2", aVar.t.q0()) || !i.g(fVar, aVar)) {
            return aVar.t.F() == 2 ? 3 : 1;
        }
        return (z2 || aVar.t.F() != 2) ? 1 : 3;
    }

    private d a(int i2) {
        if (i2 == 2) {
            return new e();
        }
        if (i2 != 3) {
            return new c();
        }
        return new com.smartdigimkt.r5.b();
    }
}
