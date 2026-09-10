package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.i7.d;
import com.smartdigimkt.l5.b;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class MraidBannerATView extends BaseBannerATView {
    MraidContainerView H0;
    boolean I0;
    boolean J0;
    boolean K0;

    public class a implements MraidContainerView.e {
        public a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void a(String str) {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void open(String str) {
            MraidBannerATView.this.g0.h(str);
            MraidBannerATView.this.a(1, 13);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void a() {
            MraidBannerATView mraidBannerATView = MraidBannerATView.this;
            mraidBannerATView.I0 = true;
            mraidBannerATView.t();
            try {
                MraidBannerATView.this.s();
            } catch (Throwable unused) {
            }
        }
    }

    public MraidBannerATView(Context context) {
        super(context);
    }

    private void u() {
        String strQ = this.f0.t.q();
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_web_banner_ad_layout", "layout"), this);
        this.D0 = (CloseImageView) findViewById(h.a(getContext(), "myoffer_banner_close", "id"));
        int iA = h.a(getContext(), 50.0f);
        int iA2 = h.a(getContext(), 320.0f);
        strQ.getClass();
        switch (strQ) {
            case "300x250":
                iA2 = h.a(getContext(), 300.0f);
                iA = h.a(getContext(), 250.0f);
                break;
            case "320x90":
                iA2 = h.a(getContext(), 320.0f);
                iA = h.a(getContext(), 90.0f);
                break;
            case "728x90":
                iA2 = h.a(getContext(), 720.0f);
                iA = h.a(getContext(), 90.0f);
                break;
        }
        int iMin = Math.min(iA2, getResources().getDisplayMetrics().widthPixels);
        if (this.A0 != null) {
            a(findViewById(h.a(getContext(), "myoffer_banner_root", "id")));
            this.A0.b(this.D0);
        }
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.g0, this.f0, this.A0, new a());
        this.H0 = mraidContainerView;
        mraidContainerView.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(h.a(getContext(), "myoffer_banner_web", "id"));
        this.H0.setMinimumHeight(h.a(getContext(), 50.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iMin, iA);
        layoutParams.gravity = 17;
        frameLayout.addView(this.H0, 0, layoutParams);
        setLayoutParams(new ViewGroup.LayoutParams(iMin, iA));
        if (this.f0.t.t0() != 0) {
            this.D0.setVisibility(8);
        } else {
            this.D0.setVisibility(0);
            a((b) this.D0, false);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        u();
        com.smartdigimkt.a6.a aVar = new com.smartdigimkt.a6.a(this.g0, this.f0);
        this.G0 = aVar;
        aVar.a(this);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.H0;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseBannerATView, com.smartdigimkt.sdk.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J0 = true;
        t();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J0 = false;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseBannerATView
    public void s() {
        if (this.H0 == null) {
            return;
        }
        super.s();
    }

    public synchronized void t() {
        if (this.I0 && this.J0 && !this.K0) {
            this.K0 = true;
            d.a(this.f0, this.g0);
        }
    }

    public MraidBannerATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar, aVar2);
        r();
    }
}
