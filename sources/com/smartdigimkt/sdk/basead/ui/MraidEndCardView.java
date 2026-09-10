package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.k5.d;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class MraidEndCardView extends BaseEndCardView {
    private static String m0 = "MraidEndCardView";
    MraidContainerView j0;
    c k0;
    d l0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MraidEndCardView mraidEndCardView = MraidEndCardView.this;
            c cVar = mraidEndCardView.k0;
            if (cVar != null) {
                cVar.b(mraidEndCardView.f0.k());
            }
        }
    }

    public interface c {
        void a();

        void a(String str);

        void b();

        void b(String str);
    }

    public MraidEndCardView(Context context, f fVar, com.smartdigimkt.v6.a aVar, d dVar) {
        super(context, fVar, aVar);
        this.l0 = dVar;
        setId(h.a(getContext(), "myoffer_end_card_id", "id"));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseEndCardView
    public void a() {
        MraidContainerView mraidContainerView = this.j0;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseEndCardView
    public Drawable getBgDrawable() {
        return new com.smartdigimkt.s5.a();
    }

    public void init(boolean z2) {
        if (this.g0.t.T() == 0) {
            setOnClickListener(new a());
        }
        this.j0 = new MraidContainerView(getContext(), this.f0, this.g0, this.l0, new b());
        this.j0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(this.j0);
        this.j0.setNeedRegisterVolumeChangeReceiver(true);
        this.j0.init();
        if (z2) {
            this.j0.loadMraidWebView(1);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        MraidContainerView mraidContainerView = this.j0;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z2);
        }
    }

    public void setEndCardListener(c cVar) {
        this.k0 = cVar;
    }

    public class b implements MraidContainerView.e {
        public b() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void a() {
            c cVar = MraidEndCardView.this.k0;
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void b() {
            c cVar = MraidEndCardView.this.k0;
            if (cVar != null) {
                cVar.b();
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void open(String str) {
            c cVar = MraidEndCardView.this.k0;
            if (cVar != null) {
                cVar.b(str);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.MraidContainerView.e
        public void a(String str) {
            c cVar = MraidEndCardView.this.k0;
            if (cVar != null) {
                cVar.a(str);
            }
        }
    }
}
