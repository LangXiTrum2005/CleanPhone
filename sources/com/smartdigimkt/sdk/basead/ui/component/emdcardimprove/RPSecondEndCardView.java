package com.smartdigimkt.sdk.basead.ui.component.emdcardimprove;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.n5.e;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.ScanningAnimButton;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;

/* JADX INFO: loaded from: classes6.dex */
public class RPSecondEndCardView extends SecondEndCardView {
    private e m0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = RPSecondEndCardView.this.k0;
            if (aVar != null) {
                aVar.a(15, 33);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = RPSecondEndCardView.this.k0;
            if (aVar != null) {
                aVar.a(15, 34);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.a6.b.a aVar = RPSecondEndCardView.this.k0;
            if (aVar != null) {
                aVar.a(15, 35);
            }
        }
    }

    public RPSecondEndCardView(Context context) {
        super(context);
    }

    private void c() {
        e eVar = this.m0;
        if (eVar != null) {
            eVar.pause();
        }
    }

    private void d() {
        e eVar = this.m0;
        if (eVar != null) {
            eVar.resume();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.SecondEndCardView
    public void a() {
        super.a();
        RoundImageView roundImageView = this.f0;
        if (roundImageView != null) {
            roundImageView.setRadiusInDip(12);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.SecondEndCardView
    public void b() {
        RelativeLayout relativeLayout = this.e0;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new a());
        }
        ScanningAnimButton scanningAnimButton = this.j0;
        if (scanningAnimButton != null) {
            scanningAnimButton.setOnClickListener(new b());
        }
        setOnClickListener(new c());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.SecondEndCardView
    public int getLayoutInflateID() {
        return h.a(getContext(), "myoffer_endcard_improve_rp_second_endcard", "layout");
    }

    @Override // com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.SecondEndCardView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.j0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.component.emdcardimprove.SecondEndCardView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stopAnimation();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            d();
        } else {
            c();
        }
    }

    public void stopAnimation() {
        e eVar = this.m0;
        if (eVar != null) {
            eVar.stop();
            this.m0 = null;
        }
    }

    public RPSecondEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RPSecondEndCardView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    private void a(View view) {
        if (view == null) {
            return;
        }
        e eVar = this.m0;
        if (eVar != null) {
            eVar.stop();
        }
        e eVar2 = new e(view);
        this.m0 = eVar2;
        eVar2.start();
    }
}
