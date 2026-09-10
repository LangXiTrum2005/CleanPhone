package com.smartdigimkt.sdk.basead.ui.h5template;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.smartdigimkt.h6.d;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import com.smartdigimkt.sdk.basead.ui.BaseScreenATView;
import com.smartdigimkt.sdk.basead.ui.CloseImageView;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebContainerView;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebView;
import com.smartdigimkt.v3.h;
import com.smartdigimkt.w6.f;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class WTWebViewBaseScreenATView extends BaseScreenATView {
    final int A1;
    private final String y1;
    WTWebContainerView z1;

    public class a implements WTWebContainerView.c {
        public a() {
        }

        @Override // com.smartdigimkt.sdk.basead.webtemplet.WTWebContainerView.c
        public void a() {
        }

        @Override // com.smartdigimkt.sdk.basead.webtemplet.WTWebContainerView.c
        public void b() {
            if (((BaseScreenATView) WTWebViewBaseScreenATView.this).i1 != null) {
                ((BaseScreenATView) WTWebViewBaseScreenATView.this).i1.setVisibility(8);
            }
            WTWebViewBaseScreenATView.this.a(302);
            if (3 != ((BaseScreenATView) WTWebViewBaseScreenATView.this).C0 || i.g(((BaseATView) WTWebViewBaseScreenATView.this).g0, ((BaseATView) WTWebViewBaseScreenATView.this).f0)) {
                return;
            }
            WTWebViewBaseScreenATView.this.S();
        }

        @Override // com.smartdigimkt.sdk.basead.webtemplet.WTWebContainerView.c
        public void a(h hVar) {
            WTWebViewBaseScreenATView.this.a(com.smartdigimkt.v3.i.a("40002", "Adx template show fail without exception:" + hVar.c()));
            WTWebViewBaseScreenATView.this.c(10);
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // com.smartdigimkt.h6.a
        public void a(int i2, int i3) {
            WTWebViewBaseScreenATView.this.a(i2, i3);
        }

        @Override // com.smartdigimkt.h6.a
        public void b(int i2) {
            WTWebViewBaseScreenATView.this.c(i2);
        }

        @Override // com.smartdigimkt.h6.d
        public void c() {
            WTWebViewBaseScreenATView.this.I();
        }

        @Override // com.smartdigimkt.h6.a
        public void a(String str, String str2) {
            WTWebViewBaseScreenATView.this.a(com.smartdigimkt.v3.i.a("40002", "Adx template show fail without exception:" + str + "," + str2));
            WTWebViewBaseScreenATView.this.c(10);
        }

        @Override // com.smartdigimkt.h6.a
        public void b() {
            ((BaseATView) WTWebViewBaseScreenATView.this).r0.f(0);
            WTWebViewBaseScreenATView.this.d(true);
        }

        @Override // com.smartdigimkt.h6.a
        public void a() {
            WTWebViewBaseScreenATView.this.a0();
        }

        @Override // com.smartdigimkt.h6.a
        public void a(int i2) {
            if (i2 == 1) {
                WTWebViewBaseScreenATView.this.a(BaseATView.g.f38290N);
            } else {
                WTWebViewBaseScreenATView.this.a(304);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WTWebViewBaseScreenATView.this.K();
        }
    }

    public WTWebViewBaseScreenATView(Context context) {
        super(context);
        this.y1 = "WTWebViewBaseScreenATView";
        this.A1 = 1;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void G() {
        super.G();
        WTWebContainerView wTWebContainerView = new WTWebContainerView(getContext(), this.g0, this.f0, new a());
        this.z1 = wTWebContainerView;
        com.smartdigimkt.q5.a aVar = this.r0;
        if (aVar != null) {
            aVar.a(wTWebContainerView);
            this.r0.b(true);
        }
        Object aVar2 = null;
        try {
            if (com.smartdigimkt.r3.d.c(this.g0)) {
                WTWebView wTWebViewA = com.smartdigimkt.r3.d.a(com.smartdigimkt.r3.d.a((com.smartdigimkt.v6.a) null, this.g0, 3));
                if (wTWebViewA != null) {
                    aVar2 = wTWebViewA.getJsCommunicationObject();
                }
            } else {
                aVar2 = new com.smartdigimkt.i6.a();
            }
            if (aVar2 != null && (aVar2 instanceof com.smartdigimkt.i6.a)) {
                ((com.smartdigimkt.i6.a) aVar2).a(this.r0);
                ((com.smartdigimkt.i6.a) aVar2).a(new b());
            }
        } catch (Throwable unused) {
        }
        if (aVar2 == null || !(aVar2 instanceof com.smartdigimkt.i6.a)) {
            a(com.smartdigimkt.v3.i.a("40002", "Adx template show fail without exception:empty jsCommunication"));
            c(10);
            return;
        }
        this.z1.init(aVar2);
        if (this.c1 != null) {
            this.z1.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.c1.addView(this.z1, 1);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void K() {
        c(9);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void P() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void X() {
        T();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public boolean b(int i2) {
        return false;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void d0() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void e0() {
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public int getATViewType() {
        return 100;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public CloseImageView getCloseView() {
        return null;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public int getPanelViewTypeForShowEndCard() {
        return 8;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public boolean h() {
        return false;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void x() {
        CloseImageView closeImageView = this.i1;
        if (closeImageView != null) {
            closeImageView.setVisibility(0);
            this.i1.setAlpha(0.2f);
            this.i1.animate().alpha(1.0f).setDuration(1000L).start();
            this.i1.setOnClickListener(new c());
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void c(int i2) {
        super.g0();
        WTWebContainerView wTWebContainerView = this.z1;
        if (wTWebContainerView != null) {
            wTWebContainerView.release();
        }
        super.c(i2);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        LayoutInflater.from(getContext()).inflate(com.smartdigimkt.n8.h.a(getContext(), "myoffer_h5_template_half_screen", "layout"), this);
    }

    public WTWebViewBaseScreenATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, String str, int i2, int i3) {
        super(context, aVar, fVar, str, i2, i3);
        this.y1 = "WTWebViewBaseScreenATView";
        this.A1 = 1;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void a(List<Bitmap> list) {
        super.a(list);
        this.r0.f(4);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a(int i2) {
        super.a(i2);
        if (this.z1 != null) {
            com.smartdigimkt.w5.a aVar = this.s0;
            this.z1.notifyInnerAdEvent(i2, aVar != null ? aVar.c() : null);
        }
    }
}
