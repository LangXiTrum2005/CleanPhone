package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class LetterHalfScreenATView extends HalfScreenATView {
    com.smartdigimkt.s3.a E1;
    int F1;
    int G1;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LetterHalfScreenATView.this.a(1, 7);
        }
    }

    public class b implements com.smartdigimkt.a6.b.a {
        public b() {
        }

        @Override // com.smartdigimkt.a6.b.a
        public void a(int i2, int i3) {
            LetterHalfScreenATView.this.a(i2, i3);
        }
    }

    public LetterHalfScreenATView(Context context) {
        super(context);
    }

    private void l0() {
        this.E1.a(this.g0, this.f0, new b());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.HalfScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void G() {
        g gVar;
        super.G();
        com.smartdigimkt.v6.a aVar = this.f0;
        if (aVar == null || (gVar = aVar.t) == null || gVar.T() != 0) {
            return;
        }
        this.c1.setOnClickListener(new a());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void L() {
        super.L();
        com.smartdigimkt.s3.a aVar = this.E1;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.HalfScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void P() {
        BasePlayerView basePlayerViewC = this.r0.c();
        if (basePlayerViewC != null) {
            this.e1.setPadding(basePlayerViewC.getPaddingLeft(), basePlayerViewC.getPaddingTop(), basePlayerViewC.getPaddingRight(), basePlayerViewC.getPaddingBottom());
        }
        super.P();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.HalfScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public boolean b(int i2) {
        if (this.g0.v0()) {
            return false;
        }
        return (TextUtils.isEmpty(this.g0.w()) && TextUtils.isEmpty(this.g0.g0()) && TextUtils.isEmpty(this.g0.r())) ? false : true;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.HalfScreenATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        this.F1 = h.a(getContext(), 38.0f);
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_half_screen_letter_vertical", "layout"), this);
        int i2 = this.F1;
        setPadding(i2, 0, i2, 0);
        setBackgroundResource(h.a(getContext(), "dailog_background_color", "color"));
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void d0() {
        if (b(this.N0)) {
            super.d0();
        } else {
            getPanelView().setVisibility(8);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.HalfScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public RelativeLayout.LayoutParams getSpecialNoteViewLayoutParams() {
        int i2 = (this.G1 * 2) / 3;
        RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-2, -2, 11);
        layoutParamsF.setMargins(0, i2, 0, 0);
        return layoutParamsF;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.HalfScreenATView
    public int h0() {
        return 9;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.HalfScreenATView
    public void k0() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d1.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.c1.getLayoutParams();
        BasePlayerView basePlayerViewC = this.r0.c();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) basePlayerViewC.getLayoutParams();
        int i2 = this.E0;
        int i3 = (i2 - layoutParams2.leftMargin) - layoutParams2.rightMargin;
        int i4 = this.F1 * 2;
        int i5 = i3 - i4;
        this.G0 = i5;
        this.H0 = i5;
        this.E1.a(i2 - i4);
        int iD = this.E1.d();
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        this.c1.setLayoutParams(layoutParams2);
        layoutParams3.width = this.G0;
        layoutParams3.height = this.H0;
        basePlayerViewC.setLayoutParams(layoutParams3);
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.topMargin = this.H0;
        layoutParams.bottomMargin = this.E1.c();
        this.d1.setLayoutParams(layoutParams);
        PanelView panelView = this.d1;
        panelView.setPadding(panelView.getPaddingLeft(), this.d1.getPaddingTop(), this.d1.getPaddingRight(), h.a(getContext(), 9.0f) + (iD - this.E1.c()));
        if (!b(this.N0)) {
            layoutParams3.bottomMargin = this.E1.c();
            layoutParams3.height = (this.E1.d() + this.H0) - (this.E1.c() * 2);
            basePlayerViewC.setLayoutParams(layoutParams3);
            basePlayerViewC.setPadding(basePlayerViewC.getPaddingLeft(), basePlayerViewC.getPaddingTop(), basePlayerViewC.getPaddingRight(), this.E1.d() - (this.E1.c() * 2));
        }
        this.G1 = layoutParams3.height;
        this.E1.a(this.c1);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void w() {
        super.w();
        com.smartdigimkt.s3.a aVar = new com.smartdigimkt.s3.a(getContext());
        this.E1 = aVar;
        aVar.a((RelativeLayout) this.c1.getParent(), this.c1.getId());
        this.q0 = this.E1.b();
        l0();
    }

    public LetterHalfScreenATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, String str, int i2, int i3) {
        super(context, aVar, fVar, str, i2, i3);
        if (this.s0 != null) {
            HashMap map = new HashMap();
            map.put(com.smartdigimkt.w5.g.a.f39426a, 1);
            this.s0.a(map);
        }
    }
}
