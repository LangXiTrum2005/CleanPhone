package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class LetterFullScreenATView extends FullScreenATView {
    com.smartdigimkt.s3.a J1;
    int K1;
    int L1;
    int M1;
    int N1;
    int O1;
    int P1;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LetterFullScreenATView.this.a(1, 7);
        }
    }

    public class b implements com.smartdigimkt.a6.b.a {
        public b() {
        }

        @Override // com.smartdigimkt.a6.b.a
        public void a(int i2, int i3) {
            LetterFullScreenATView.this.a(i2, i3);
        }
    }

    public LetterFullScreenATView(Context context) {
        super(context);
        this.K1 = h.a(getContext(), 13.0f);
        this.L1 = h.a(getContext(), 60.0f);
        this.M1 = h.a(getContext(), 53.0f);
        this.N1 = h.a(getContext(), 17.0f);
    }

    private void o0() {
        this.K1 = (this.E0 - ((int) (((double) ((this.F0 - this.M1) - this.L1)) * 0.49714285714285716d))) / 2;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.FullScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void C() {
        this.N0 = 9;
        PanelView panelView = getPanelView();
        if (panelView != null) {
            panelView.setLayoutType(this.N0);
            ((LinearLayout.LayoutParams) panelView.findViewById(h.a(getContext(), "myoffer_iv_banner_icon", "id")).getLayoutParams()).bottomMargin = h.a(getContext(), 30.0f);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.FullScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void G() {
        o0();
        super.G();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.c1.getLayoutParams();
        int i2 = this.N1;
        layoutParams.setMargins(i2, this.L1, i2, this.M1);
        int i3 = this.K1;
        setPadding(i3, 0, i3, 0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.FullScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void M() {
        super.M();
        Drawable bgDrawable = this.e1.getBgDrawable();
        if (bgDrawable != null) {
            setBackgroundDrawable(bgDrawable);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.FullScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void P() {
        h0();
        if (b(this.N0)) {
            PanelView panelView = getPanelView();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) panelView.getLayoutParams();
            layoutParams.addRule(3, this.e1.getId());
            layoutParams.height = -2;
            layoutParams.bottomMargin = this.J1.c();
            layoutParams.addRule(12, 0);
            panelView.setPadding(0, h.a(getContext(), 30.0f), 0, (this.J1.d() + ((this.J1.c() / 129) * 69)) - layoutParams.bottomMargin);
            panelView.setBackgroundColor(-1);
            this.e1.getLayoutParams().height = this.O1;
        } else {
            ((RelativeLayout.LayoutParams) this.e1.getLayoutParams()).bottomMargin = this.P1;
            this.e1.getLayoutParams().height = this.O1;
            this.e1.setPadding(0, 0, 0, (this.J1.d() - this.P1) - this.J1.c());
            u();
        }
        this.J1.a(this.c1);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.FullScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public boolean b(int i2) {
        if (this.g0.v0()) {
            return false;
        }
        return (TextUtils.isEmpty(this.g0.w()) && TextUtils.isEmpty(this.g0.g0()) && TextUtils.isEmpty(this.g0.r())) ? false : true;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.FullScreenATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        g gVar;
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_letter_full_screen", "layout"), this);
        setGravity(13);
        com.smartdigimkt.v6.a aVar = this.f0;
        if (aVar == null || (gVar = aVar.t) == null || gVar.T() != 0) {
            return;
        }
        setOnClickListener(new a());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.FullScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void d0() {
        if (b(this.N0)) {
            super.d0();
        } else {
            getPanelView().setVisibility(8);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.FullScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public int getPanelViewTypeForShowEndCard() {
        return this.N0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public RelativeLayout.LayoutParams getSpecialNoteViewLayoutParams() {
        int i2 = (this.O1 * 2) / 3;
        RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-2, -2, 11);
        layoutParamsF.setMargins(0, i2, 0, 0);
        return layoutParamsF;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(1140850688);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.FullScreenATView, com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void w() {
        super.w();
        com.smartdigimkt.s3.a aVar = new com.smartdigimkt.s3.a(getContext());
        this.J1 = aVar;
        aVar.a(this.g0, this.f0, new b());
        this.J1.a(this, this.c1.getId());
        this.J1.a(this.E0 - (this.K1 * 2));
        this.O1 = (this.E0 - (this.K1 * 2)) - (this.N1 * 2);
        if (!b(this.N0)) {
            this.P1 = this.J1.c();
            this.O1 = ((this.J1.d() + this.O1) - this.P1) - this.J1.c();
        }
        this.q0 = this.J1.b();
    }

    public LetterFullScreenATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, String str, int i2, int i3) {
        super(context, aVar, fVar, str, i2, i3);
        this.K1 = h.a(getContext(), 13.0f);
        this.L1 = h.a(getContext(), 60.0f);
        this.M1 = h.a(getContext(), 53.0f);
        this.N1 = h.a(getContext(), 17.0f);
        if (this.s0 != null) {
            HashMap map = new HashMap();
            map.put(com.smartdigimkt.w5.g.a.f39426a, 1);
            this.s0.a(map);
        }
    }
}
