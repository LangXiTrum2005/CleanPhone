package com.smartdigimkt.sdk.basead.ui.h5template;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.smartdigimkt.r3.d;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView;
import com.smartdigimkt.sdk.basead.ui.BaseSplashATView;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebContainerView;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import com.smartdigimkt.v3.h;
import com.smartdigimkt.v3.i;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class WTWebViewSplashATView extends BaseSdkSplashATView {
    private final String l1;
    WTWebContainerView m1;
    final int n1;

    public class a implements WTWebContainerView.c {

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.h5template.WTWebViewSplashATView$a$a, reason: collision with other inner class name */
        public class RunnableC0610a implements Runnable {
            public RunnableC0610a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (((BaseSplashATView) WTWebViewSplashATView.this).I0 == null) {
                    return;
                }
                WTWebViewSplashATView.this.m();
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.sdk.basead.webtemplet.WTWebContainerView.c
        public void a() {
        }

        @Override // com.smartdigimkt.sdk.basead.webtemplet.WTWebContainerView.c
        public void b() {
            WTWebViewSplashATView.this.a(302);
            WTWebViewSplashATView wTWebViewSplashATView = WTWebViewSplashATView.this;
            WTWebViewSplashATView.super.a(((BaseATView) wTWebViewSplashATView).f0.t.i0() < 0 ? 100 : ((BaseATView) WTWebViewSplashATView.this).f0.t.i0(), new RunnableC0610a());
        }

        @Override // com.smartdigimkt.sdk.basead.webtemplet.WTWebContainerView.c
        public void a(h hVar) {
            WTWebViewSplashATView.this.a(i.a("40002", "Adx template show fail without exception:" + hVar.c()));
            WTWebViewSplashATView.this.a(true, 10);
        }
    }

    public class b implements com.smartdigimkt.h6.a {
        public b() {
        }

        @Override // com.smartdigimkt.h6.a
        public void a(int i2, int i3) {
            WTWebViewSplashATView.this.a(i2, i3);
        }

        @Override // com.smartdigimkt.h6.a
        public void b(int i2) {
            WTWebViewSplashATView.this.a(true, i2);
        }

        @Override // com.smartdigimkt.h6.a
        public void a(String str, String str2) {
            WTWebViewSplashATView.this.a(i.a("40002", "Adx template show fail without exception:" + str + "," + str2));
            WTWebViewSplashATView.this.a(true, 10);
        }

        @Override // com.smartdigimkt.h6.a
        public void b() {
            ((BaseATView) WTWebViewSplashATView.this).r0.f(0);
            WTWebViewSplashATView.this.G();
        }

        @Override // com.smartdigimkt.h6.a
        public void a() {
            WTWebViewSplashATView.this.w();
        }

        @Override // com.smartdigimkt.h6.a
        public void a(int i2) {
            if (i2 == 1) {
                WTWebViewSplashATView.this.a(BaseATView.g.f38290N);
            } else {
                WTWebViewSplashATView.this.a(304);
            }
        }
    }

    public WTWebViewSplashATView(Context context) {
        super(context);
        this.l1 = "WTWebViewBaseScreenATView";
        this.n1 = 1;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void B() {
        super.B();
        WTWebContainerView wTWebContainerView = new WTWebContainerView(getContext(), this.g0, this.f0, new a());
        this.m1 = wTWebContainerView;
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.a(wTWebContainerView);
        }
        Object aVar2 = null;
        try {
            if (d.c(this.g0)) {
                WTWebView wTWebViewA = d.a(d.a((com.smartdigimkt.v6.a) null, this.g0, 3));
                if (wTWebViewA != null) {
                    aVar2 = wTWebViewA.getJsCommunicationObject();
                }
            } else {
                aVar2 = new com.smartdigimkt.j6.a();
            }
            if (aVar2 != null && (aVar2 instanceof com.smartdigimkt.j6.a)) {
                ((com.smartdigimkt.j6.a) aVar2).a(this.r0);
                ((com.smartdigimkt.j6.a) aVar2).a(new b());
            }
        } catch (Throwable unused) {
        }
        if (aVar2 == null || !(aVar2 instanceof com.smartdigimkt.j6.a)) {
            a(i.a("40002", "Adx template show fail without exception:empty jsCommunication"));
            a(true, 10);
        } else {
            this.m1.init(aVar2);
            this.m1.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.m1, 1);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void D() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView
    public void F() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        WTWebContainerView wTWebContainerView = this.m1;
        if (wTWebContainerView != null) {
            wTWebContainerView.release();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public int getATViewType() {
        return 100;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public boolean h() {
        return false;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSplashATView
    public boolean needShowSplashEndCard() {
        return false;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        LayoutInflater.from(getContext()).inflate(com.smartdigimkt.n8.h.a(getContext(), "myoffer_h5_template_splash", "layout"), this);
        B();
    }

    public WTWebViewSplashATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar, aVar2);
        this.l1 = "WTWebViewBaseScreenATView";
        this.n1 = 1;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseSdkSplashATView, com.smartdigimkt.sdk.basead.ui.BaseSplashATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(int i2) {
        super.a(i2);
        if (this.m1 != null) {
            com.smartdigimkt.w5.a aVar = this.s0;
            this.m1.notifyInnerAdEvent(i2, aVar != null ? aVar.c() : null);
        }
    }
}
