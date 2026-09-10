package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.CTAButtonLayout;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class SplashEndCardView extends BaseEndCardView {
    private View j0;
    protected String k0;
    RoundImageView l0;
    TextView m0;
    TextView n0;
    CTAButtonLayout o0;
    TextView p0;
    BaseShakeView q0;
    ImageView r0;
    private long s0;
    private final View.OnClickListener t0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseEndCardView.a aVar;
            g gVar = SplashEndCardView.this.h0;
            if (gVar != null) {
                if (gVar.T() == 0) {
                    BaseEndCardView.a aVar2 = SplashEndCardView.this.mListener;
                    if (aVar2 != null) {
                        aVar2.a(22);
                        return;
                    }
                    return;
                }
                SplashEndCardView splashEndCardView = SplashEndCardView.this;
                CTAButtonLayout cTAButtonLayout = splashEndCardView.o0;
                if (cTAButtonLayout == null || view != cTAButtonLayout || (aVar = splashEndCardView.mListener) == null) {
                    return;
                }
                aVar.a(22);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseEndCardView.a aVar = SplashEndCardView.this.mListener;
            if (aVar instanceof BaseEndCardView.b) {
                ((BaseEndCardView.b) aVar).a();
            }
        }
    }

    public class c implements com.smartdigimkt.d7.b.f {
        public c() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (bitmap != null) {
                SplashEndCardView.this.r0.setImageBitmap(bitmap);
            }
        }
    }

    public class d implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38429a;

        public d(String str) {
            this.f38429a = str;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f38429a)) {
                SplashEndCardView.this.l0.setImageBitmap(bitmap);
            }
        }
    }

    public class e implements com.smartdigimkt.a6.b.a {
        public e() {
        }

        @Override // com.smartdigimkt.a6.b.a
        public void a(int i2, int i3) {
            BaseEndCardView.a aVar = SplashEndCardView.this.mListener;
            if (aVar != null) {
                aVar.a(i3);
            }
        }
    }

    public class f implements BaseShakeView.o {
        public f() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.BaseShakeView.o
        public boolean a() {
            BaseEndCardView.a aVar;
            if (!com.smartdigimkt.a6.b.a(SplashEndCardView.this.s0, SplashEndCardView.this.g0) || (aVar = SplashEndCardView.this.mListener) == null) {
                return false;
            }
            aVar.a(9);
            return true;
        }
    }

    public SplashEndCardView(Context context, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar) {
        View viewFindViewById;
        super(context, fVar, aVar);
        this.k0 = "Skip";
        View.OnClickListener aVar2 = new a();
        this.t0 = aVar2;
        this.k0 = getResources().getString(h.a(getContext(), "myoffer_splash_skip_text", k.f38992h));
        View viewInflate = LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_splash_endcard", "layout"), (ViewGroup) this, true);
        this.j0 = viewInflate;
        this.l0 = (RoundImageView) viewInflate.findViewById(h.a(getContext(), "myoffer_splash_endcard_icon", "id"));
        this.o0 = (CTAButtonLayout) this.j0.findViewById(h.a(getContext(), "myoffer_splash_endcard_cta", "id"));
        this.m0 = (TextView) this.j0.findViewById(h.a(getContext(), "myoffer_splash_endcard_title", "id"));
        this.n0 = (TextView) this.j0.findViewById(h.a(getContext(), "myoffer_splash_endcard_desc", "id"));
        this.p0 = (TextView) this.j0.findViewById(h.a(getContext(), "myoffer_splash_endcard_count_down_text", "id"));
        this.q0 = (BaseShakeView) this.j0.findViewById(h.a(getContext(), "myoffer_splash_endcard_shake_hint_text", "id"));
        this.r0 = (ImageView) this.j0.findViewById(h.a(getContext(), "myoffer_splash_endcard_top_bg", "id"));
        if (!this.f0.w0()) {
            setOnClickListener(aVar2);
        }
        RoundImageView roundImageView = this.l0;
        if (roundImageView != null) {
            roundImageView.setNeedRadiu(true);
            this.l0.setRadiusInDip(12);
        }
        if (this.o0 != null && !this.f0.w0()) {
            this.o0.setOnClickListener(aVar2);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(h.a(getContext(), 12.0f));
        setBackground(gradientDrawable);
        if (this.p0 != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(Integer.MIN_VALUE);
            gradientDrawable2.setCornerRadius(h.a(getContext(), 12.0f));
            this.p0.setBackground(gradientDrawable2);
            this.p0.setOnClickListener(new b());
        }
        if (TextUtils.isEmpty(this.f0.g0()) && TextUtils.isEmpty(this.f0.r()) && (viewFindViewById = this.j0.findViewById(h.a(getContext(), "myoffer_splash_endcard_header_container", "id"))) != null) {
            viewFindViewById.getLayoutParams().height = h.a(getContext(), 240.0f);
        }
        String strC = com.smartdigimkt.j5.a.a().c("sp_ec_top_bg");
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        com.google.firebase.crashlytics.internal.model.a.g().a(new com.smartdigimkt.d7.e(3, strC), new c());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseEndCardView
    public void a() {
    }

    public void init(BaseEndCardView.a aVar, long j) {
        this.mListener = aVar;
        String strW = this.f0.w();
        if (TextUtils.isEmpty(strW)) {
            strW = this.f0.s();
        }
        int iA = h.a(getContext(), 60.0f);
        com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, strW), iA, iA, new d(strW));
        CTAButtonLayout cTAButtonLayout = this.o0;
        if (cTAButtonLayout != null) {
            cTAButtonLayout.initSetting(this.f0, this.g0, true, new e());
        }
        if (TextUtils.isEmpty(this.f0.g0())) {
            this.m0.setVisibility(8);
        } else {
            this.m0.setVisibility(0);
            this.m0.setText(this.f0.g0());
        }
        if (TextUtils.isEmpty(this.f0.r())) {
            this.n0.setVisibility(8);
        } else {
            this.n0.setVisibility(0);
            this.n0.setText(this.f0.r());
        }
        if (i.a(this.g0)) {
            this.q0.setVisibility(0);
            this.q0.setShakeSetting(this.g0.t, this.f0.j());
            if (this.h0.T() != 1 && !this.f0.w0()) {
                this.q0.setOnClickListener(this.t0);
            }
            this.q0.setOnShakeListener(new f(), this.h0);
        } else {
            this.q0.setVisibility(8);
        }
        BaseEndCardView.a aVar2 = this.mListener;
        if (aVar2 != null) {
            aVar2.b();
        }
        this.s0 = j;
    }

    public void onCountDownTick(long j) {
        TextView textView = this.p0;
        if (textView != null) {
            textView.setText((j / 1000) + "s | " + this.k0);
        }
    }
}
