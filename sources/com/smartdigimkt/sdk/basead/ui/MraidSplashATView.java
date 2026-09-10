package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.smartdigimkt.a6.d;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class MraidSplashATView extends BaseSplashATView {
    MraidContainerView d1;
    boolean e1;

    public class a implements com.smartdigimkt.y5.a {
        public a() {
        }

        @Override // com.smartdigimkt.y5.a
        public void a(int i2, int i3) {
            MraidSplashATView.this.a(i2, i3);
        }
    }

    public class b implements MraidContainerView.e {
        public b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void a() {
            try {
                MraidSplashATView.this.z();
            } catch (Throwable unused) {
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void b() {
            MraidSplashATView.this.a(106);
            MraidSplashATView.this.u();
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void open(String str) {
            MraidSplashATView.this.g0.h(str);
            MraidSplashATView.this.a(1, 13);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void a(String str) {
            MraidSplashATView.this.a(i.a("40002", "Mraid init fail with exception:"));
            MraidSplashATView.this.a(true, 5);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidSplashATView mraidSplashATView = MraidSplashATView.this;
            if (mraidSplashATView.I0 == null) {
                return;
            }
            MraidSplashATView.super.m();
        }
    }

    public MraidSplashATView(Context context) {
        super(context);
    }

    private void y() {
        if (this.A0 != null) {
            a((View) this);
            this.A0.b(findViewById(h.a(getContext(), "myoffer_splash_skip_area", "id")));
        }
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.g0, this.f0, this.A0, new b());
        this.d1 = mraidContainerView;
        mraidContainerView.setNeedRegisterVolumeChangeReceiver(true);
        this.d1.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(h.a(getContext(), "myoffer_splash_web", "id"));
        if (frameLayout != null) {
            this.d1.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.d1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.g0.v0() && this.d1 == null) {
            return;
        }
        super.a(this.f0.t.i0() < 0 ? 100 : this.f0.t.i0(), new c());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_web_splash_ad_layout", "layout"), this);
        d dVar = this.R0;
        if (dVar != null) {
            dVar.a(d.o).a(new a()).a(getContext(), this);
        }
        y();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.d1;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView, android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        MraidContainerView mraidContainerView = this.d1;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z2);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView
    public void u() {
        int size = this.n0.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.n0.get(i2);
            if (view != null) {
                view.setOnClickListener(this.Q0);
            }
        }
    }

    public MraidSplashATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar, aVar2);
    }
}
