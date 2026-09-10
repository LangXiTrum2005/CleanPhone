package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.CTAButtonLayout;
import com.smartdigimkt.sdk.basead.ui.component.RoundFrameLayout;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class PanelView extends RelativeLayout {
    public static final int TYPE_FULL_SCREEN_BANNER = 0;
    public static final int TYPE_FULL_SCREEN_EMPTY_INFO = 8;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_LANDSCAPE = 6;
    public static final int TYPE_FULL_SCREEN_ENDCARD_HORIZONTAL_PORTRAIT = 1;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_LANDSCAPE = 2;
    public static final int TYPE_FULL_SCREEN_ENDCARD_VERTICAL_PORTRAIT = 5;
    public static final int TYPE_HALF_SCREEN_EMPTY_INFO = 7;
    public static final int TYPE_HALF_SCREEN_HORIZONTAL = 4;
    public static final int TYPE_HALF_SCREEN_VERTICAL = 3;
    public static final int TYPE_LETTER = 9;
    private View e0;
    private ImageView f0;
    private ImageView g0;
    private TextView h0;
    private TextView i0;
    private CTAButtonLayout j0;
    private BaseShakeView k0;
    private g l0;
    private int m0;
    private com.smartdigimkt.w6.g n0;
    private com.smartdigimkt.v6.a o0;
    private com.smartdigimkt.w6.f p0;
    private int q0;
    private boolean r0;
    private boolean s0;
    private boolean t0;
    private List<View> u0;
    private com.smartdigimkt.a6.d v0;
    private View w0;
    protected boolean x0;
    private final View.OnClickListener y0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PanelView.this.n0 != null) {
                if (PanelView.this.n0.T() == 1) {
                    if (view != PanelView.this.j0 || PanelView.this.l0 == null) {
                        return;
                    }
                    PanelView.this.l0.a(1, 1);
                    return;
                }
                if (PanelView.this.l0 != null) {
                    if (view == PanelView.this.j0) {
                        PanelView.this.l0.a(1, 1);
                    } else if (PanelView.this.k0 == null || view != PanelView.this.k0) {
                        PanelView.this.l0.a(1, 2);
                    } else {
                        PanelView.this.l0.a(1, 11);
                    }
                }
            }
        }
    }

    public class b implements com.smartdigimkt.y5.a {
        public b() {
        }

        @Override // com.smartdigimkt.y5.a
        public void a(int i2, int i3) {
            if (PanelView.this.l0 != null) {
                PanelView.this.l0.a(i2, i3);
            }
        }
    }

    public class c implements BaseShakeView.o {
        public c() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView.o
        public boolean a() {
            if (PanelView.this.l0 != null) {
                return PanelView.this.l0.a();
            }
            return false;
        }
    }

    public class d implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38384a;

        public d(String str) {
            this.f38384a = str;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f38384a)) {
                PanelView.this.f0.setImageBitmap(bitmap);
            }
        }
    }

    public class e implements com.smartdigimkt.a6.b.a {
        public e() {
        }

        @Override // com.smartdigimkt.a6.b.a
        public void a(int i2, int i3) {
            if (PanelView.this.l0 != null) {
                PanelView.this.l0.a(i2, i3);
            }
        }
    }

    public class f implements com.smartdigimkt.a6.b.a {
        public f() {
        }

        @Override // com.smartdigimkt.a6.b.a
        public void a(int i2, int i3) {
            if (PanelView.this.l0 != null) {
                PanelView.this.l0.a(i2, i3);
            }
        }
    }

    public interface g {
        void a(int i2, int i3);

        boolean a();
    }

    public PanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q0 = 0;
        this.r0 = false;
        this.s0 = false;
        this.t0 = false;
        this.x0 = false;
        this.y0 = new a();
    }

    private void f() {
        BaseShakeView baseShakeView;
        if (!this.t0 || (baseShakeView = this.k0) == null || this.q0 == 8) {
            return;
        }
        baseShakeView.setVisibility(0);
    }

    private void g() {
        if (this.f0 != null) {
            if (!this.p0.w0()) {
                this.f0.setOnClickListener(this.y0);
            }
            this.u0.add(this.f0);
        }
        if (this.h0 != null) {
            if (!this.p0.w0()) {
                this.h0.setOnClickListener(this.y0);
            }
            this.u0.add(this.h0);
        }
        if (this.i0 != null) {
            if (!this.p0.w0()) {
                this.i0.setOnClickListener(this.y0);
            }
            this.u0.add(this.i0);
        }
        if (this.j0 != null) {
            if (!this.p0.w0()) {
                this.j0.setOnClickListener(this.y0);
            }
            this.u0.add(this.j0);
        }
        if (this.g0 != null) {
            if (!this.p0.w0()) {
                this.g0.setOnClickListener(this.y0);
            }
            this.u0.add(this.g0);
        }
        if (this.k0 != null && this.t0 && !this.p0.w0()) {
            this.k0.setOnClickListener(this.y0);
            this.k0.setOnShakeListener(new c(), this.n0);
        }
        View viewFindViewById = this.e0.findViewById(h.a(getContext(), "myoffer_panel_view_blank", "id"));
        if (viewFindViewById != null) {
            if (!this.p0.w0()) {
                viewFindViewById.setOnClickListener(this.y0);
            }
            this.u0.add(viewFindViewById);
        } else {
            if (!this.p0.w0()) {
                this.e0.setOnClickListener(this.y0);
            }
            this.u0.add(this.e0);
        }
    }

    private void h() {
        ImageView imageView = this.f0;
        if (imageView instanceof RoundImageView) {
            ((RoundImageView) imageView).setNeedRadiu(true);
            int i2 = this.q0;
            if (i2 == 2 || i2 == 6) {
                ((RoundImageView) this.f0).setRadiusInDip(8);
            } else {
                ((RoundImageView) this.f0).setRadiusInDip(12);
            }
            this.f0.invalidate();
        }
    }

    private void setDataFrom(com.smartdigimkt.w6.f fVar) {
        ImageView imageView = this.f0;
        if (imageView != null) {
            View view = this.w0;
            if (view != null) {
                a(imageView, view);
            } else {
                String strW = fVar.w();
                if (!TextUtils.isEmpty(strW)) {
                    ViewGroup.LayoutParams layoutParams = this.f0.getLayoutParams();
                    com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, strW), layoutParams.width, layoutParams.height, new d(strW));
                }
            }
            if (!c()) {
                this.f0.setVisibility(8);
            }
        }
        if (this.i0 != null) {
            if (TextUtils.isEmpty(fVar.r())) {
                this.i0.setVisibility(8);
            } else {
                this.i0.setText(fVar.r());
            }
        }
        if (this.h0 != null) {
            if (TextUtils.isEmpty(fVar.g0())) {
                this.h0.setVisibility(8);
            } else {
                this.h0.setText(fVar.g0());
            }
        }
        CTAButtonLayout cTAButtonLayout = this.j0;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(fVar, this.o0, this.x0, new e());
            int i2 = this.q0;
            if (i2 == 8 || i2 == 7) {
                this.j0.changeMinorButtonStyle();
            }
        }
        new com.smartdigimkt.a6.a(fVar, this.o0).a(this);
    }

    public View getCTAButton() {
        return this.j0;
    }

    public List<View> getClickViews() {
        return this.u0;
    }

    public View getDescView() {
        return this.i0;
    }

    public View getIconView() {
        ImageView imageView = this.f0;
        View view = this.w0;
        return view != null ? view : imageView;
    }

    public View getShakeView() {
        return this.k0;
    }

    public View getTitleView() {
        return this.h0;
    }

    public void init(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2, boolean z2, g gVar) {
        this.l0 = gVar;
        this.m0 = i2;
        this.p0 = fVar;
        this.o0 = aVar;
        this.n0 = aVar.t;
        this.t0 = z2;
        this.r0 = fVar.q0();
        this.s0 = this.n0.h() == 1;
        this.u0 = new ArrayList();
        this.v0 = new com.smartdigimkt.a6.d(fVar, this.n0);
    }

    public void notifyHalfScreenEndCardShow() {
        this.x0 = true;
        CTAButtonLayout cTAButtonLayout = this.j0;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(this.p0, this.o0, true, new f());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setBaseAdIconView(View view) {
        this.w0 = view;
    }

    public void setLayoutType(int i2) {
        this.q0 = i2;
        switch (i2) {
            case 1:
                if (!c()) {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_horizontal_portrait", "layout"), (ViewGroup) this, true);
                }
                break;
            case 2:
            case 6:
                if (!c()) {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_landscape_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_landscape", "layout"), (ViewGroup) this, true);
                }
                break;
            case 3:
                if (this.m0 != 1) {
                    if (!c()) {
                        this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_vertical_without_icon", "layout"), (ViewGroup) this, true);
                    } else {
                        this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_vertical", "layout"), (ViewGroup) this, true);
                    }
                } else if (!c()) {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                }
                break;
            case 4:
                if (!c()) {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_horizontal_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_horizontal", "layout"), (ViewGroup) this, true);
                }
                break;
            case 5:
                if (!c()) {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_portrait_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_endcard_vertical_portrait", "layout"), (ViewGroup) this, true);
                }
                break;
            case 7:
                this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 8:
                this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_full_screen_empty_info", "layout"), (ViewGroup) this, true);
                break;
            case 9:
                this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_letter", "layout"), (ViewGroup) this, true);
                break;
            default:
                if (!c()) {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_bottom_banner_without_icon", "layout"), (ViewGroup) this, true);
                } else {
                    this.e0 = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_panel_view_bottom_banner", "layout"), (ViewGroup) this, true);
                }
                break;
        }
        this.x0 = a(i2);
        a();
    }

    private void a() {
        b();
        setDataFrom(this.p0);
        g();
        h();
        com.smartdigimkt.a6.d dVar = this.v0;
        if (dVar != null) {
            dVar.a(this.q0).a(new b()).a(getContext(), this.e0);
        }
    }

    private void b() {
        this.u0.clear();
        this.f0 = (ImageView) this.e0.findViewById(h.a(getContext(), "myoffer_iv_banner_icon", "id"));
        this.h0 = (TextView) this.e0.findViewById(h.a(getContext(), "myoffer_tv_banner_title", "id"));
        this.i0 = (TextView) this.e0.findViewById(h.a(getContext(), "myoffer_tv_banner_desc", "id"));
        this.j0 = (CTAButtonLayout) this.e0.findViewById(h.a(getContext(), "myoffer_panel_cta_layout", "id"));
        this.g0 = (ImageView) this.e0.findViewById(h.a(getContext(), "myoffer_ad_logo", "id"));
        try {
            BaseShakeView baseShakeView = (BaseShakeView) this.e0.findViewById(h.a(getContext(), "myoffer_shake_hint_text", "id"));
            this.k0 = baseShakeView;
            baseShakeView.setShakeSetting(this.o0.t, this.p0.j());
            this.k0.startShakeIconAnimation();
        } catch (Throwable unused) {
        }
        f();
    }

    private boolean c() {
        return d() || this.w0 != null;
    }

    private boolean d() {
        com.smartdigimkt.w6.f fVar = this.p0;
        return (fVar == null || TextUtils.isEmpty(fVar.w())) ? false : true;
    }

    private boolean e() {
        return this.r0 && !this.s0;
    }

    private void a(ImageView imageView, View view) {
        ViewGroup viewGroup;
        int iIndexOfChild;
        if (imageView == null || view == null) {
            return;
        }
        imageView.setVisibility(0);
        view.setVisibility(0);
        ViewParent parent = imageView.getParent();
        if (!(parent instanceof ViewGroup) || (iIndexOfChild = (viewGroup = (ViewGroup) parent).indexOfChild(imageView)) < 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        com.smartdigimkt.j7.c.a(imageView);
        com.smartdigimkt.j7.c.a(view);
        RoundFrameLayout roundFrameLayout = new RoundFrameLayout(getContext());
        a(roundFrameLayout);
        roundFrameLayout.addView(view);
        viewGroup.addView(roundFrameLayout, iIndexOfChild, layoutParams);
        roundFrameLayout.setId(imageView.getId());
        if (view instanceof ImageView) {
            this.f0 = (ImageView) view;
        }
    }

    private void a(RoundFrameLayout roundFrameLayout) {
        if (roundFrameLayout == null) {
            return;
        }
        int i2 = this.q0;
        if (i2 != 2 && i2 != 6) {
            roundFrameLayout.setRadius(12);
        } else {
            roundFrameLayout.setRadius(8);
        }
    }

    private boolean a(int i2) {
        return (i2 == 1 || i2 == 2 || i2 == 5 || i2 == 6 || i2 == 9) && !i.b(this.p0, this.o0);
    }
}
