package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.smartdigimkt.a6.d;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView;
import com.smartdigimkt.w6.f;

/* JADX INFO: loaded from: classes6.dex */
public class HalfScreenATView extends BaseScreenATView {
    public static final String TAG = "HalfScreenATView";
    protected final int A1;
    protected final int B1;
    protected final int C1;
    protected int D1;
    protected View y1;
    protected d z1;

    public class a implements com.smartdigimkt.y5.a {
        public a() {
        }

        @Override // com.smartdigimkt.y5.a
        public void a(int i2, int i3) {
            HalfScreenATView.this.a(i2, i3);
        }
    }

    public HalfScreenATView(Context context) {
        super(context);
        this.A1 = 1;
        this.B1 = 2;
        this.C1 = 3;
    }

    private boolean i0() {
        return this.g0.v0() || this.u1 <= this.v1;
    }

    private boolean j0() {
        return !i.a(this.g0);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void C() {
        super.C();
        this.N0 = h0();
        if (getPanelView() != null) {
            getPanelView().setLayoutType(this.N0);
            if (b(this.N0)) {
                d0();
            } else {
                getPanelView().setVisibility(8);
            }
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void G() {
        super.G();
        try {
            k0();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        d dVar = this.z1;
        if (dVar != null) {
            dVar.a(this.N0).a(new a()).a(getContext(), this.y1);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void K() {
        super.g0();
        super.c(1);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void P() {
        BaseEndCardView baseEndCardView;
        PanelView panelView = this.d1;
        if (panelView != null) {
            panelView.notifyHalfScreenEndCardShow();
        }
        BasePlayerView basePlayerViewC = this.r0.c();
        if (this.c1 == null || (baseEndCardView = this.e1) == null || baseEndCardView.getParent() != null || basePlayerViewC == null) {
            return;
        }
        this.c1.addView(this.e1, 1, basePlayerViewC.getLayoutParams());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public void a() {
        super.a();
        if (j0() || this.g0.v0()) {
            this.D1 = 1;
        } else if (i0()) {
            this.D1 = 2;
        } else {
            this.D1 = 3;
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public boolean b(int i2) {
        if (this.g0.v0()) {
            return false;
        }
        return (i2 == 7 && this.f0.t.T() == 0) ? false : true;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        int i2 = this.D1;
        if (i2 == 1) {
            this.y1 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_half_screen_empty_info", "layout"), this, isAttachRoot());
        } else if (i2 != 2) {
            this.y1 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_half_screen_horizontal", "layout"), this, isAttachRoot());
        } else {
            this.y1 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_half_screen_vertical", "layout"), this, isAttachRoot());
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public int getATViewType() {
        return 2;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void getMaterialRealSize() {
        super.getMaterialRealSize();
        if (this.g0.h0() != 1 || this.g0.l0() <= 0 || this.g0.j0() <= 0) {
            return;
        }
        this.u1 = this.g0.l0();
        this.v1 = this.g0.j0();
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public int getPanelViewTypeForShowEndCard() {
        return this.N0;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView, com.smartdigimkt.sdk.basead.ui.BaseATView
    public RelativeLayout.LayoutParams getSpecialNoteViewLayoutParams() {
        RelativeLayout relativeLayout = this.c1;
        if (relativeLayout == null || this.d1 == null) {
            return super.getSpecialNoteViewLayoutParams();
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.d1.getLayoutParams();
        int i2 = (layoutParams.height * 2) / 3;
        BasePlayerView basePlayerViewC = this.r0.c();
        if (basePlayerViewC != null) {
            i2 = (((RelativeLayout.LayoutParams) basePlayerViewC.getLayoutParams()).height * 2) / 3;
        } else {
            BaseEndCardView baseEndCardView = this.e1;
            if (baseEndCardView != null) {
                i2 = (((RelativeLayout.LayoutParams) baseEndCardView.getLayoutParams()).height * 2) / 3;
            }
        }
        RelativeLayout.LayoutParams layoutParamsF = androidx.media3.extractor.text.ttml.a.f(-2, -2, 11);
        layoutParamsF.setMargins(0, i2, (this.D1 == 2 && this.D0 == 2) ? layoutParams2.width : 0, 0);
        return layoutParamsF;
    }

    public int h0() {
        int i2 = this.D1;
        if (i2 != 1) {
            return i2 != 2 ? 4 : 3;
        }
        return 7;
    }

    public boolean isAttachRoot() {
        return true;
    }

    public void k0() {
        int i2;
        int i3;
        int i4;
        int iA;
        int i5;
        int i6;
        int iA2;
        View viewFindViewById;
        View viewFindViewById2;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d1.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.c1.getLayoutParams();
        int i7 = layoutParams2.leftMargin;
        int i8 = layoutParams2.rightMargin;
        int i9 = layoutParams2.topMargin;
        int i10 = layoutParams2.bottomMargin;
        BasePlayerView basePlayerViewC = this.r0.c();
        RelativeLayout.LayoutParams layoutParams3 = basePlayerViewC != null ? (RelativeLayout.LayoutParams) basePlayerViewC.getLayoutParams() : null;
        int iF = h.f(getContext());
        if (iF <= 0) {
            iF = h.a(getContext(), 32.0f);
        }
        int i11 = this.D1;
        if (i11 == 1) {
            if (this.D0 == 2) {
                i3 = (this.F0 - i9) - i10;
                i4 = (int) (i3 * 1.75f);
                iA = h.a(getContext(), 120.0f);
                if (i9 < iF) {
                    layoutParams2.topMargin = (int) (iF * 1.1f);
                }
                layoutParams2.width = i4;
                this.c1.setLayoutParams(layoutParams2);
            } else if (i0()) {
                i4 = (this.E0 - i7) - i8;
                i3 = (int) (i4 / 0.5714286f);
                int i12 = this.F0;
                int i13 = iF * 4;
                if (i12 - i3 < i13) {
                    i3 = i12 - i13;
                }
                iA = h.a(getContext(), 240.0f);
            } else {
                i4 = (this.E0 - i7) - i8;
                i3 = (int) (i4 / 1.032258f);
                iA = h.a(getContext(), 120.0f);
            }
            this.G0 = i4;
            this.H0 = i3;
        } else {
            if (i11 == 2) {
                if (this.D0 == 1) {
                    View viewFindViewById3 = this.d1.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
                    i2 = viewFindViewById3 != null ? ((RelativeLayout.LayoutParams) viewFindViewById3.getLayoutParams()).topMargin : 0;
                    i4 = (this.E0 - i7) - i8;
                    float f = i4;
                    i5 = (int) (f / 0.5714286f);
                    int i14 = this.F0;
                    int i15 = iF * 4;
                    if (i14 - i5 < i15) {
                        i5 = i14 - i15;
                    }
                    iA = (int) (f / 1.8181819f);
                    this.G0 = i4;
                    this.H0 = (i5 - iA) + i2;
                } else {
                    if (i9 < iF) {
                        i9 = (int) (iF * 1.1f);
                        layoutParams2.topMargin = i9;
                    }
                    i3 = (this.F0 - i9) - i10;
                    i4 = (int) (i3 * 1.6f);
                    if (this.z1 != null && (iA2 = this.E0 - (h.a(getContext(), 116.0f) * 2)) < i4) {
                        i3 = (int) (iA2 / 1.6f);
                        i4 = iA2;
                    }
                    this.H0 = i3;
                    int i16 = (int) (i3 * 0.56f);
                    this.G0 = i16;
                    i6 = i4 - i16;
                    layoutParams2.width = i4;
                    this.c1.setLayoutParams(layoutParams2);
                    iA = i3;
                }
                layoutParams2.width = i4;
                layoutParams2.height = i3;
                this.c1.setLayoutParams(layoutParams2);
                if (layoutParams3 != null && basePlayerViewC != null) {
                    layoutParams3.width = this.G0;
                    layoutParams3.height = this.H0;
                    basePlayerViewC.setLayoutParams(layoutParams3);
                }
                layoutParams.width = i6;
                layoutParams.height = iA;
                this.d1.setLayoutParams(layoutParams);
                if (this.D1 == 2 || this.D0 != 2) {
                    viewFindViewById = findViewById(h.a(getContext(), "myoffer_guide2click_container", "id"));
                    if (viewFindViewById != null && layoutParams3 != null) {
                        viewFindViewById.setLayoutParams(layoutParams3);
                    }
                    viewFindViewById2 = findViewById(h.a(getContext(), "myoffer_guide2click_mask", "id"));
                    if (viewFindViewById2 != null || layoutParams3 == null) {
                    }
                    viewFindViewById2.setLayoutParams(layoutParams3);
                    return;
                }
                return;
            }
            View viewFindViewById4 = this.d1.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
            i2 = viewFindViewById4 != null ? ((RelativeLayout.LayoutParams) viewFindViewById4.getLayoutParams()).topMargin : 0;
            if (this.D0 == 1) {
                i4 = (this.E0 - i7) - i8;
                float f2 = i4;
                i5 = (int) (f2 / 1.032258f);
                this.G0 = i4;
                int i17 = (int) (f2 / 2.0f);
                this.H0 = i17;
                iA = (i5 - i17) + i2;
            } else {
                if (i9 < iF) {
                    i9 = (int) (iF * 1.1f);
                    layoutParams2.topMargin = i9;
                }
                i3 = (this.F0 - i9) - i10;
                i4 = (int) (i3 * 1.032258f);
                this.G0 = i4;
                int i18 = (int) (i4 / 2.0f);
                this.H0 = i18;
                iA = (i3 - i18) + i2;
                layoutParams2.width = i4;
                this.c1.setLayoutParams(layoutParams2);
            }
            i3 = i5;
        }
        i6 = i4;
        layoutParams2.width = i4;
        layoutParams2.height = i3;
        this.c1.setLayoutParams(layoutParams2);
        if (layoutParams3 != null) {
            layoutParams3.width = this.G0;
            layoutParams3.height = this.H0;
            basePlayerViewC.setLayoutParams(layoutParams3);
        }
        layoutParams.width = i6;
        layoutParams.height = iA;
        this.d1.setLayoutParams(layoutParams);
        if (this.D1 == 2) {
        }
        viewFindViewById = findViewById(h.a(getContext(), "myoffer_guide2click_container", "id"));
        if (viewFindViewById != null) {
            viewFindViewById.setLayoutParams(layoutParams3);
        }
        viewFindViewById2 = findViewById(h.a(getContext(), "myoffer_guide2click_mask", "id"));
        if (viewFindViewById2 != null) {
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseScreenATView
    public void u() {
    }

    public HalfScreenATView(Context context, com.smartdigimkt.v6.a aVar, f fVar, String str, int i2, int i3) {
        super(context, aVar, fVar, str, i2, i3);
        this.A1 = 1;
        this.B1 = 2;
        this.C1 = 3;
        setId(h.a(getContext(), "myoffer_half_screen_view_id", "id"));
        if (aVar != null) {
            this.z1 = new d(fVar, aVar.t);
        }
    }
}
