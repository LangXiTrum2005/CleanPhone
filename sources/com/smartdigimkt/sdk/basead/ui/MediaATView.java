package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.smartdigimkt.b5.c;
import com.smartdigimkt.d7.e;
import com.smartdigimkt.k5.d;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import com.smartdigimkt.sdk.basead.ui.component.RoundImageView;
import com.smartdigimkt.v0.k;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class MediaATView extends BaseMediaATView implements com.smartdigimkt.l5.a {
    public static final String TAG = "sdm_MediaATView";
    protected TextView p0;
    protected TextView q0;
    protected ImageView r0;
    protected ImageView s0;
    protected RoundImageView t0;
    protected TextView u0;
    protected ImageView v0;
    RelativeLayout w0;
    private SimplePlayerMediaView x0;

    public class a implements com.smartdigimkt.d7.b.f {
        public a() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(MediaATView.this.e0.w(), str)) {
                MediaATView.this.t0.setImageBitmap(bitmap);
            }
        }
    }

    public MediaATView(Context context, f fVar, com.smartdigimkt.v6.a aVar, c.AbstractC0445c abstractC0445c) {
        super(context, fVar, aVar, abstractC0445c);
    }

    private void a(int i2, int i3) {
        this.s0.setScaleType(ImageView.ScaleType.FIT_CENTER);
        com.smartdigimkt.d7.b.a(getContext()).a(new e(1, this.e0.s()), i2, i3, new b());
    }

    private void d() {
        SimplePlayerMediaView simplePlayerMediaView = (SimplePlayerMediaView) findViewById(h.a(getContext(), "myoffer_media_ad_simple_player_view_no_g2c", "id"));
        this.x0 = simplePlayerMediaView;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setVisibility(0);
        }
    }

    private void f() {
        FrameLayout frameLayout;
        TextView textView;
        if (e()) {
            int i2 = this.n0;
            if (i2 == 3 || i2 == 4 || i2 == 5) {
                ViewGroup viewGroup = (ViewGroup) findViewById(h.a(getContext(), "myoffer_title_desc", "id"));
                if (viewGroup != null) {
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof RelativeLayout.LayoutParams) {
                        ((RelativeLayout.LayoutParams) layoutParams).leftMargin = getResources().getDimensionPixelSize(h.a(getContext(), "myoffer_template_margin_white", "dimen"));
                        viewGroup.setLayoutParams(layoutParams);
                    }
                }
            } else if ((i2 == 1 || i2 == 2) && (textView = this.p0) != null) {
                ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                    this.p0.setLayoutParams(layoutParams2);
                }
            }
        }
        if (TextUtils.isEmpty(this.e0.g0()) && this.n0 == 6) {
            ViewGroup.LayoutParams layoutParams3 = this.u0.getLayoutParams();
            if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams3).topMargin = 0;
                this.u0.setLayoutParams(layoutParams3);
            }
        }
        if (TextUtils.isEmpty(this.e0.r())) {
            int i3 = this.n0;
            if (i3 == 2 || i3 == 1) {
                ViewGroup.LayoutParams layoutParams4 = this.q0.getLayoutParams();
                if (layoutParams4 instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) layoutParams4;
                    layoutParams5.addRule(13);
                    layoutParams5.removeRule(12);
                }
            }
            if (this.n0 != 5 || (frameLayout = (FrameLayout) findViewById(h.a(getContext(), "myoffer_template_bg_desc", "id"))) == null) {
                return;
            }
            frameLayout.setVisibility(8);
        }
    }

    private String getLayoutResName() {
        int i2 = this.n0;
        if (i2 == 1) {
            return "myoffer_template_left_image";
        }
        if (i2 == 2) {
            return "myoffer_template_left_text";
        }
        if (i2 == 3) {
            return "myoffer_template_top_image";
        }
        if (i2 != 4) {
            return i2 != 5 ? "myoffer_media_ad_view" : "myoffer_template_text_float";
        }
        return "myoffer_template_top_text";
    }

    public void b(int i2, int i3) {
        if (i.g(this.e0, this.g0)) {
            d();
        } else {
            a(i2, i3);
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void destroyPlayerView(int i2) {
        SimplePlayerMediaView simplePlayerMediaView = this.x0;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.destroyPlayerView(i2);
        }
    }

    public boolean e() {
        return TextUtils.isEmpty(this.e0.w());
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseMediaATView
    public List<View> getClickViews() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.q0);
        if (this.f0.T() != 1) {
            arrayList.add(this.p0);
            arrayList.add(this.s0);
            arrayList.add(this.t0);
            arrayList.add(this.u0);
            g gVar = this.f0;
            if (gVar != null && gVar.T() == 0) {
                arrayList.add(this.r0);
                arrayList.add(this.w0);
            }
        }
        return arrayList;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseMediaATView
    public List<View> getContainerClickViews() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.r0);
        arrayList.add(this.w0);
        return arrayList;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseMediaATView
    public View getMonitorClickView() {
        return this.q0;
    }

    @Override // com.smartdigimkt.l5.a
    public long getVideoCurrentPosition() {
        SimplePlayerMediaView simplePlayerMediaView = this.x0;
        if (simplePlayerMediaView != null) {
            return simplePlayerMediaView.getVideoCurrentPosition();
        }
        return 0L;
    }

    @Override // com.smartdigimkt.sdk.basead.ui.BaseMediaATView
    public void init(int i2, int i3, int i4) {
        f fVar;
        View viewFindViewById;
        super.init(i2, i3, i4);
        View viewInflate = LayoutInflater.from(getContext()).inflate(h.a(getContext(), getLayoutResName(), "layout"), (ViewGroup) null, false);
        FrameLayout frameLayout = this.l0;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.l0.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        }
        this.p0 = (TextView) findViewById(h.a(getContext(), "myoffer_banner_ad_title", "id"));
        this.q0 = (TextView) findViewById(h.a(getContext(), "myoffer_media_ad_cta", "id"));
        this.r0 = (ImageView) findViewById(h.a(getContext(), "myoffer_media_ad_bg_blur", "id"));
        this.s0 = (ImageView) findViewById(h.a(getContext(), "myoffer_media_ad_main_image", "id"));
        this.v0 = (ImageView) findViewById(h.a(getContext(), "myoffer_ad_logo", "id"));
        this.t0 = (RoundImageView) findViewById(h.a(getContext(), "myoffer_media_ad_icon", "id"));
        this.u0 = (TextView) findViewById(h.a(getContext(), "myoffer_banner_ad_desc", "id"));
        this.w0 = (RelativeLayout) findViewById(h.a(getContext(), "myoffer_media_ad_container", "id"));
        String strG0 = this.e0.g0();
        if (TextUtils.isEmpty(strG0)) {
            this.p0.setVisibility(8);
        } else {
            this.p0.setText(strG0);
        }
        String strN = this.e0.n();
        if (TextUtils.isEmpty(strN)) {
            this.q0.setText(h.a(getContext(), "myoffer_cta_learn_more", k.f38992h));
        } else {
            this.q0.setText(strN);
        }
        String strR = this.e0.r();
        if (TextUtils.isEmpty(strR)) {
            this.u0.setVisibility(8);
        } else {
            this.u0.setText(strR);
        }
        if (TextUtils.isEmpty(this.e0.w())) {
            this.t0.setVisibility(8);
        } else {
            this.t0.setRadiusInDip(6);
            this.t0.setNeedRadiu(true);
            ViewGroup.LayoutParams layoutParams = this.t0.getLayoutParams();
            com.smartdigimkt.d7.b.a(getContext()).a(new e(1, this.e0.w()), layoutParams.width, layoutParams.height, new a());
        }
        com.smartdigimkt.a6.a aVar = new com.smartdigimkt.a6.a(this.e0, this.g0);
        this.o0 = aVar;
        aVar.a(this);
        if (!i.a(this.e0) && (viewFindViewById = findViewById(h.a(getContext(), "myoffer_media_ad_main_image_container", "id"))) != null) {
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) layoutParams2).bottomMargin = h.a(getContext(), 84.0f);
                viewFindViewById.setLayoutParams(layoutParams2);
            }
        }
        b(i2, i3);
        if ((this.q0 instanceof ScanningAnimButton) && (fVar = this.e0) != null && fVar.i() != null) {
            ((ScanningAnimButton) this.q0).startAnimation(this.e0.i().L());
        }
        f();
    }

    @Override // com.smartdigimkt.l5.a
    public void initPlayerView(f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.q5.a.c cVar, d dVar) {
        SimplePlayerMediaView simplePlayerMediaView = this.x0;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.initPlayerView(fVar, aVar, cVar, dVar);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
    }

    @Override // com.smartdigimkt.l5.a
    public void pauseVideo() {
        SimplePlayerMediaView simplePlayerMediaView = this.x0;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.pauseVideo();
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void resumeVideo() {
        SimplePlayerMediaView simplePlayerMediaView = this.x0;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.resumeVideo();
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void setATImproveClickViewController(com.smartdigimkt.w5.a aVar) {
        SimplePlayerMediaView simplePlayerMediaView = this.x0;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setATImproveClickViewController(aVar);
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void setAutoPlay(String str) {
        SimplePlayerMediaView simplePlayerMediaView = this.x0;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setAutoPlay(str);
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void setIsMuted(boolean z2) {
        SimplePlayerMediaView simplePlayerMediaView = this.x0;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setIsMuted(z2);
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void setPlayerOnClickListener(View.OnClickListener onClickListener) {
        SimplePlayerMediaView simplePlayerMediaView = this.x0;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setPlayerOnClickListener(onClickListener);
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void setVideoListener(SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener) {
        SimplePlayerMediaView simplePlayerMediaView = this.x0;
        if (simplePlayerMediaView != null) {
            simplePlayerMediaView.setVideoListener(sDMNativeAdMediaViewListener);
        }
    }

    public class b implements com.smartdigimkt.d7.b.f {

        public class a implements Runnable {
            final /* synthetic */ Bitmap X;

            public a(Bitmap bitmap) {
                this.X = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                int width = MediaATView.this.getWidth();
                int height = MediaATView.this.getHeight();
                if (width <= 0 || height <= 0) {
                    return;
                }
                int[] iArrA = com.smartdigimkt.j7.c.a(width, height, this.X.getWidth() / this.X.getHeight());
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) MediaATView.this.s0.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iArrA[0];
                    layoutParams.height = iArrA[1];
                    layoutParams.addRule(13);
                    MediaATView.this.s0.setLayoutParams(layoutParams);
                }
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.basead.ui.MediaATView$b$b, reason: collision with other inner class name */
        public class C0599b implements com.smartdigimkt.o8.b.InterfaceC0563b {
            public C0599b() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a() {
            }

            @Override // com.smartdigimkt.o8.b.InterfaceC0563b
            public void a(Bitmap bitmap) {
                MediaATView.this.r0.setVisibility(0);
                MediaATView.this.r0.setScaleType(ImageView.ScaleType.FIT_XY);
                MediaATView.this.r0.setImageBitmap(bitmap);
            }
        }

        public b() {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(MediaATView.this.e0.s(), str)) {
                MediaATView.this.s0.setVisibility(0);
                MediaATView.this.s0.setImageBitmap(bitmap);
                MediaATView.this.post(new a(bitmap));
                com.smartdigimkt.o8.b.a(MediaATView.this.getContext(), bitmap, new C0599b());
            }
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
            Log.e(MediaATView.TAG, "load: image load fail:" + str2);
        }
    }
}
