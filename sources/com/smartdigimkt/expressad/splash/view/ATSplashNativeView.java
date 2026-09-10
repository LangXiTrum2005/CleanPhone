package com.smartdigimkt.expressad.splash.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.expressad.shake.MBShakeView;
import com.smartdigimkt.v0.k;
import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public class ATSplashNativeView extends BaseATSplashNativeView {

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ATSplashNativeView.this.R0.x() != null) {
                String strJ = ATSplashNativeView.this.R0.x().j();
                if (TextUtils.isEmpty(strJ)) {
                    return;
                }
                com.smartdigimkt.o8.c.a(ATSplashNativeView.this.getContext(), strJ);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.x.b bVarX = ATSplashNativeView.this.R0.x();
            if (bVarX != null) {
                com.smartdigimkt.o8.c.a(com.smartdigimkt.m6.b.p().k(), bVarX.i());
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ATSplashNativeView aTSplashNativeView = ATSplashNativeView.this;
            if (aTSplashNativeView.L0) {
                if (aTSplashNativeView.Q0.getSplashJSBridgeImpl() != null && ATSplashNativeView.this.Q0.getSplashJSBridgeImpl().getSplashBridgeListener() != null) {
                    ATSplashNativeView.this.Q0.getSplashJSBridgeImpl().getSplashBridgeListener().close();
                }
                ATSplashNativeView.this.j0.setVisibility(4);
                ATSplashNativeView.this.j0.setEnabled(false);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ATSplashNativeView.this.a(0);
        }
    }

    public class e extends com.smartdigimkt.t4.b {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        @Override // com.smartdigimkt.t4.b
        public void a() {
            ATSplashNativeView aTSplashNativeView = ATSplashNativeView.this;
            if (aTSplashNativeView.N0 || aTSplashNativeView.M0 || !aTSplashNativeView.isShown()) {
                return;
            }
            ATSplashNativeView.this.a(4);
        }
    }

    public ATSplashNativeView(Context context) {
        super(context);
    }

    @Override // com.smartdigimkt.expressad.splash.view.BaseATSplashNativeView
    public void b() {
        if (this.B0 == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.S0 = mBShakeView;
            mBShakeView.initView(this.R0.b());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.S0.setLayoutParams(layoutParams);
            addView(this.S0);
            this.v0.setVisibility(4);
            this.v0.setEnabled(false);
            this.S0.setOnClickListener(new d());
            this.X0 = new e(this.C0, this.D0 * 1000);
        }
    }

    @Override // com.smartdigimkt.expressad.splash.view.BaseATSplashNativeView
    public void f() {
        if (this.R0.x() == null || this.A0 != 0) {
            this.q0.setVisibility(8);
        } else {
            com.smartdigimkt.x.b bVarX = this.R0.x();
            StringBuilder sb = new StringBuilder();
            sb.append(getContext().getString(k.a(getContext(), "sdm_cm_app_info_app_name", k.f38992h)));
            sb.append(bVarX.b());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(getContext().getString(k.a(getContext(), "sdm_cm_app_info_version", k.f38992h)));
            sb.append(bVarX.c());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(getContext().getString(k.a(getContext(), "sdm_cm_app_info_publish", k.f38992h)));
            sb.append(bVarX.d());
            sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            sb.append(getContext().getString(k.a(getContext(), "sdm_cm_app_info_update_time", k.f38992h)));
            sb.append(bVarX.k());
            this.r0.setText(sb);
        }
        this.s0.setOnClickListener(new a());
        b bVar = new b();
        TextView textView = this.t0;
        if (textView != null) {
            textView.setOnClickListener(bVar);
        }
        TextView textView2 = this.u0;
        if (textView2 != null) {
            textView2.setOnClickListener(bVar);
        }
        this.j0.setOnClickListener(new c());
    }

    public ATSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashNativeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    public ATSplashNativeView(Context context, ATSplashView aTSplashView, com.smartdigimkt.q1.b bVar) {
        super(context, aTSplashView, bVar);
    }
}
