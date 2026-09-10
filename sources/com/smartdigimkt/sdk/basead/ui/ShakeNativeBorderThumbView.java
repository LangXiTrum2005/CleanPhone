package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.hardware.SensorEvent;
import android.view.View;
import com.smartdigimkt.k7.f;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w5.i;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class ShakeNativeBorderThumbView extends ShakeBorderThumbView {
    private final String s0;
    com.smartdigimkt.x4.d t0;
    private f.c u0;
    d v0;
    i.c w0;

    public class a implements d {
        public a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.ShakeNativeBorderThumbView.d
        public boolean a(SensorEvent sensorEvent) {
            com.smartdigimkt.x4.d dVar;
            if (ShakeNativeBorderThumbView.this.getParent() == null || !ShakeNativeBorderThumbView.this.u0.a((View) ShakeNativeBorderThumbView.this.getParent(), ShakeNativeBorderThumbView.this, 80, 0) || (dVar = ShakeNativeBorderThumbView.this.t0) == null) {
                return false;
            }
            return dVar.a(sensorEvent);
        }
    }

    public class b implements i.c {
        public b() {
        }

        @Override // com.smartdigimkt.w5.i.c
        public d a() {
            return ShakeNativeBorderThumbView.this.v0;
        }

        @Override // com.smartdigimkt.w5.i.c
        public int b() {
            int[] iArr = new int[2];
            ShakeNativeBorderThumbView.this.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            int width = (ShakeNativeBorderThumbView.this.getWidth() / 2) + i2;
            int height = (ShakeNativeBorderThumbView.this.getHeight() / 2) + i3;
            int iC = i.a().c();
            return (int) Math.sqrt(Math.pow(height - (i.a().b() / 2), 2.0d) + Math.pow(width - (iC / 2), 2.0d));
        }
    }

    public class c implements com.smartdigimkt.x4.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BaseShakeView.o f38402a;

        public c(BaseShakeView.o oVar) {
            this.f38402a = oVar;
        }

        @Override // com.smartdigimkt.x4.a
        public boolean a() {
            String unused = ShakeNativeBorderThumbView.this.s0;
            BaseShakeView.o oVar = this.f38402a;
            if (oVar != null) {
                return oVar.a();
            }
            return false;
        }
    }

    public interface d {
        boolean a(SensorEvent sensorEvent);
    }

    public ShakeNativeBorderThumbView(Context context) {
        super(context);
        this.s0 = "ShakeNativeBorderThumbView";
        this.v0 = new a();
        this.w0 = new b();
        this.u0 = new f.c(1);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void c() {
        i.a().a(this.w0);
    }

    public void changeBackground() {
        int iA = h.a(getContext(), 10.0f);
        int iA2 = h.a(getContext(), 10.0f);
        int iA3 = h.a(getContext(), 6.0f);
        setPadding(iA, iA3, iA2, iA3);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1725553114);
        gradientDrawable.setCornerRadius(h.a(getContext(), 20.0f));
        setBackground(gradientDrawable);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void d() {
        i.a().b(this.w0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.ShakeBorderThumbView
    public int getLayoutId() {
        return h.a(getContext(), "myoffer_shake_native_border_thumb", "layout");
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void setOnShakeListener(BaseShakeView.o oVar, g gVar) {
        if (gVar != null) {
            this.u0 = new f.c(gVar.M1());
        }
        com.smartdigimkt.x4.f fVar = new com.smartdigimkt.x4.f(gVar);
        if (fVar.e() != 1 || fVar.c() == null || fVar.c().size() <= 0) {
            this.t0 = new com.smartdigimkt.x4.g();
        } else {
            this.t0 = new com.smartdigimkt.x4.c();
        }
        fVar.toString();
        this.t0.getClass();
        this.t0.a(new com.smartdigimkt.x4.f(gVar));
        this.t0.a(new c(oVar));
        this.p0 = oVar;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.ShakeBorderThumbView, com.smartdigimkt.sdk.basead.ui.BaseShakeView
    public void b() {
        super.b();
        setBackgroundResource(h.a(com.smartdigimkt.m6.b.p().k(), "myoffer_bg_shake_native_border_thumb", k.d));
    }
}
