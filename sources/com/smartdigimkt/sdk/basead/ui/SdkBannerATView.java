package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.sdk.core.common.res.image.RecycleImageView;
import com.smartdigimkt.v3.l;

/* JADX INFO: loaded from: classes6.dex */
public class SdkBannerATView extends BaseBannerATView {
    private static final int M0 = 1;
    private static final int N0 = 2;
    String H0;
    private int I0;
    SimplePlayerBannerMediaView J0;
    private final View.OnClickListener K0;
    private final View.OnClickListener L0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SdkBannerATView.super.a(1, 3);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SdkBannerATView sdkBannerATView = SdkBannerATView.this;
            View view2 = sdkBannerATView.q0;
            if (view2 == null || view2 != view) {
                SdkBannerATView.super.a(1, 2);
            } else {
                SdkBannerATView.super.a(1, 1);
            }
        }
    }

    public class c implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RoundImageView f38393a;

        public c(RoundImageView roundImageView) {
            this.f38393a = roundImageView;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerATView.this.g0.w(), str)) {
                this.f38393a.setImageBitmap(bitmap);
            }
        }
    }

    public class d implements com.smartdigimkt.q5.a.c {
        public d() {
        }

        @Override // com.smartdigimkt.q5.a.c
        public l a() {
            return SdkBannerATView.this.b();
        }

        @Override // com.smartdigimkt.q5.a.c
        public com.smartdigimkt.v3.a b() {
            return SdkBannerATView.this.getAdClickRecord();
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SdkBannerATView.this.L0.onClick(view);
        }
    }

    public class f implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f38396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecycleImageView f38397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecycleImageView f38398c;

        public class a implements com.smartdigimkt.o8.b.InterfaceC0563b {
            public a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a(Bitmap bitmap) {
                f.this.f38398c.setImageBitmap(bitmap);
            }
        }

        public f(String str, RecycleImageView recycleImageView, RecycleImageView recycleImageView2) {
            this.f38396a = str;
            this.f38397b = recycleImageView;
            this.f38398c = recycleImageView2;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(this.f38396a, str)) {
                this.f38397b.setImageBitmap(bitmap);
                com.smartdigimkt.o8.b.a(SdkBannerATView.this.getContext(), bitmap, new a());
            }
        }
    }

    public SdkBannerATView(Context context) {
        super(context);
        this.K0 = new a();
        this.L0 = new b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    private void u() {
        byte b2;
        String str;
        String strQ = this.f0.t.q();
        String strA = this.g0.a(this.f0.t);
        int iHashCode = strQ.hashCode();
        if (iHashCode != -559799608) {
            if (iHashCode != 1507809730) {
                if (iHashCode != 1507809854) {
                    if (iHashCode == 1622564786 && strQ.equals("728x90")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (strQ.equals("320x90")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
            } else if (strQ.equals("320x50")) {
                b2 = 3;
            } else {
                b2 = -1;
            }
        } else if (strQ.equals("300x250")) {
            b2 = 1;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            this.H0 = "320x90";
            str = (this.g0.r0() || !TextUtils.isEmpty(strA)) ? "myoffer_banner_ad_layout_320x90" : "myoffer_banner_ad_layout_no_main_res_320x90";
        } else if (b2 == 1) {
            this.H0 = "300x250";
            str = "myoffer_banner_ad_layout_300x250";
        } else if (b2 != 2) {
            this.H0 = "320x50";
            str = "myoffer_banner_ad_layout_320x50";
        } else {
            this.H0 = "728x90";
            str = "myoffer_banner_ad_layout_728x90";
        }
        int iA = a(strA);
        this.I0 = iA;
        if (1 != iA) {
            LayoutInflater.from(getContext()).inflate(h.a(getContext(), str, "layout"), this);
            t();
            return;
        }
        LayoutInflater.from(getContext()).inflate(h.a(getContext(), "myoffer_banner_ad_layout_pure_picture", "layout"), this);
        int iA2 = h.a(getContext(), 320.0f);
        int iA3 = h.a(getContext(), 50.0f);
        switch (strQ) {
            case "300x250":
                iA2 = h.a(getContext(), 300.0f);
                iA3 = h.a(getContext(), 250.0f);
                break;
            case "320x50":
                iA2 = h.a(getContext(), 320.0f);
                iA3 = h.a(getContext(), 50.0f);
                break;
            case "320x90":
                iA2 = h.a(getContext(), 320.0f);
                iA3 = h.a(getContext(), 90.0f);
                break;
            case "728x90":
                iA2 = h.a(getContext(), 720.0f);
                iA3 = h.a(getContext(), 90.0f);
                break;
        }
        if (this.f0.t.N() > 0) {
            iA2 = this.f0.t.N();
        }
        if (this.f0.t.M() > 0) {
            iA3 = this.f0.t.M();
        }
        setLayoutParams(new ViewGroup.LayoutParams(Math.min(iA2, getResources().getDisplayMetrics().widthPixels), iA3));
        b(strA);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void d() {
        u();
        com.smartdigimkt.a6.a aVar = new com.smartdigimkt.a6.a(this.g0, this.f0);
        this.G0 = aVar;
        aVar.a(this);
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        SimplePlayerBannerMediaView simplePlayerBannerMediaView = this.J0;
        if (simplePlayerBannerMediaView != null) {
            simplePlayerBannerMediaView.destroyPlayerView(4);
        }
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseBannerATView
    public void r() {
        super.r();
        if (this.I0 == 1) {
            setOnClickListener(this.K0);
            return;
        }
        if (this.f0.t.T() == 1) {
            View view = this.q0;
            if (view != null) {
                view.setOnClickListener(this.L0);
            }
        } else {
            int size = this.n0.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = this.n0.get(i2);
                if (view2 != null) {
                    view2.setOnClickListener(this.L0);
                }
            }
        }
        if (this.f0.t.T() == 0) {
            setOnClickListener(this.K0);
        }
    }

    public void t() {
        RoundImageView roundImageView = (RoundImageView) findViewById(h.a(getContext(), "myoffer_banner_icon", "id"));
        TextView textView = (TextView) findViewById(h.a(getContext(), "myoffer_banner_ad_title", "id"));
        TextView textView2 = (TextView) findViewById(h.a(getContext(), "myoffer_banner_desc", "id"));
        Button button = (Button) findViewById(h.a(getContext(), "myoffer_banner_ad_install_btn", "id"));
        this.q0 = button;
        this.D0 = (CloseImageView) findViewById(h.a(getContext(), "myoffer_banner_close", "id"));
        if (this.f0.t.t0() == 0) {
            this.D0.setVisibility(0);
            a(this.D0, false);
        } else {
            com.smartdigimkt.a6.b.a((View) this.D0, true, true);
        }
        if (roundImageView != null) {
            if (TextUtils.isEmpty(this.g0.w())) {
                roundImageView.setVisibility(0);
                com.smartdigimkt.a6.b.a((View) roundImageView, true, false);
            } else {
                ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                roundImageView.setVisibility(0);
                roundImageView.setRadiusInDip(6);
                roundImageView.setNeedRadiu(true);
                this.n0.add(roundImageView);
                com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, this.g0.w()), layoutParams.width, layoutParams.height, new c(roundImageView));
            }
        }
        if (TextUtils.isEmpty(this.g0.n())) {
            button.setVisibility(8);
        } else {
            button.setText(this.g0.n());
            button.setVisibility(0);
            this.n0.add(button);
            setTrackClickAreaView(button);
        }
        if (TextUtils.isEmpty(this.g0.g0())) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.g0.g0());
            textView.setVisibility(0);
            this.n0.add(textView);
        }
        if (textView2 != null) {
            if (TextUtils.isEmpty(this.g0.r())) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(this.g0.r());
                textView2.setVisibility(0);
                this.n0.add(textView2);
            }
        }
        a((ViewGroup) findViewById(h.a(getContext(), "myoffer_main_resouce_container", "id")), (String) null);
    }

    private void b(String str) {
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_banner_root", "id"));
        this.D0 = (CloseImageView) findViewById(h.a(getContext(), "myoffer_banner_close", "id"));
        if (this.f0.t.t0() == 0) {
            this.D0.setVisibility(0);
            if (TextUtils.equals("728x90", this.H0)) {
                ViewGroup.LayoutParams layoutParams = this.D0.getLayoutParams();
                layoutParams.width = h.a(getContext(), 23.0f);
                layoutParams.height = h.a(getContext(), 23.0f);
                this.D0.setLayoutParams(layoutParams);
            }
            a((com.smartdigimkt.l5.b) this.D0, false);
        } else {
            com.smartdigimkt.a6.b.a((View) this.D0, true, true);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        relativeLayout.setLayoutParams(layoutParams2);
        a(this, str);
    }

    private int a(String str) {
        com.smartdigimkt.w6.f fVar = this.g0;
        int i2 = 1;
        if (!(fVar instanceof com.smartdigimkt.w6.l) ? !(fVar instanceof com.smartdigimkt.z6.a) || TextUtils.equals(str, fVar.s()) : ((com.smartdigimkt.w6.l) fVar).B0() != 1) {
            i2 = 2;
        }
        this.I0 = i2;
        return i2;
    }

    public SdkBannerATView(Context context, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, com.smartdigimkt.f5.a aVar2) {
        super(context, aVar, fVar, aVar2);
        this.K0 = new a();
        this.L0 = new b();
        s();
        r();
    }

    private void a(ViewGroup viewGroup, String str) {
        if (viewGroup != null) {
            if (i.g(this.g0, this.f0)) {
                SimplePlayerBannerMediaView simplePlayerBannerMediaView = new SimplePlayerBannerMediaView(getContext());
                this.J0 = simplePlayerBannerMediaView;
                simplePlayerBannerMediaView.setmIsPureMode(this.I0 == 1);
                viewGroup.addView(this.J0, 0, new RelativeLayout.LayoutParams(-1, -1));
                this.J0.setATImproveClickViewController(this.s0);
                this.J0.setIsMuted(true);
                this.J0.initPlayerView(this.g0, this.f0, new d(), this.A0);
                this.J0.setPlayerOnClickListener(new e());
            } else {
                if (TextUtils.isEmpty(str)) {
                    str = this.g0.a(this.f0.t);
                }
                if (TextUtils.isEmpty(str)) {
                    str = this.g0.w();
                }
                if (!TextUtils.isEmpty(str)) {
                    RecycleImageView recycleImageView = new RecycleImageView(getContext());
                    recycleImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    RecycleImageView recycleImageView2 = new RecycleImageView(getContext());
                    recycleImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    viewGroup.addView(recycleImageView2, 0, new RelativeLayout.LayoutParams(-1, -1));
                    com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, str), new f(str, recycleImageView, recycleImageView2));
                    viewGroup.addView(recycleImageView, 1, new RelativeLayout.LayoutParams(-1, -1));
                    this.n0.add(recycleImageView);
                } else {
                    viewGroup.setVisibility(8);
                    return;
                }
            }
            viewGroup.setVisibility(0);
        }
    }
}
