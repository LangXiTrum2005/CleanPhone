package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView;
import com.smartdigimkt.sdk.basead.ui.web.WebProgressBarView;
import com.smartdigimkt.v3.h;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class SimplePlayerMediaView extends FrameLayout implements com.smartdigimkt.l5.a {
    private boolean A0;
    private com.smartdigimkt.k5.d B0;
    int C0;
    protected com.smartdigimkt.q5.a e0;
    protected WebProgressBarView f0;
    private MuteImageView g0;
    long h0;
    SDMNativeAdMediaViewListener i0;
    com.smartdigimkt.k7.c j0;
    com.smartdigimkt.k7.f.c k0;
    ImageView l0;
    ImageView m0;
    ImageView n0;
    ImageView o0;
    View p0;
    View.OnClickListener q0;
    boolean r0;
    private final AtomicBoolean s0;
    private final String t0;
    private final String u0;
    private final String v0;
    String w0;
    boolean x0;
    boolean y0;
    int z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
            simplePlayerMediaView.r0 = false;
            simplePlayerMediaView.l0.setVisibility(8);
            com.smartdigimkt.q5.a aVar = SimplePlayerMediaView.this.e0;
            if (aVar != null) {
                aVar.p();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.smartdigimkt.q5.a aVar = SimplePlayerMediaView.this.e0;
            if (aVar != null) {
                aVar.l();
                SimplePlayerMediaView.this.m0.setVisibility(8);
            }
        }
    }

    public class c implements BasePlayerView.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.v6.a f38410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.f f38411b;

        public c(com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar) {
            this.f38410a = aVar;
            this.f38411b = fVar;
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b() {
            ImageView imageView = SimplePlayerMediaView.this.n0;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = SimplePlayerMediaView.this.o0;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = simplePlayerMediaView.i0;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onVideoAdStartPlay(simplePlayerMediaView.h0);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void c() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void d() {
            WebProgressBarView webProgressBarView;
            SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
            if (simplePlayerMediaView.h0 > 0 && (webProgressBarView = simplePlayerMediaView.f0) != null) {
                if (webProgressBarView.getVisibility() != 0) {
                    SimplePlayerMediaView.this.f0.setVisibility(0);
                }
                SimplePlayerMediaView.this.f0.setProgress(100);
            }
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = SimplePlayerMediaView.this.i0;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onVideoAdComplete();
            }
            ImageView imageView = SimplePlayerMediaView.this.m0;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void e() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void onVideoDownloadResume() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(int i2) {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(h hVar) {
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = SimplePlayerMediaView.this.i0;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onVideoError(hVar.a(), hVar.b());
            }
            SimplePlayerMediaView.this.r0 = true;
            com.smartdigimkt.i7.d.a(this.f38410a, this.f38411b, 2, hVar.c());
            if (SimplePlayerMediaView.this.e0.e() > 0) {
                SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
                if (simplePlayerMediaView.m0 != null) {
                    WebProgressBarView webProgressBarView = simplePlayerMediaView.f0;
                    if (webProgressBarView != null) {
                        webProgressBarView.setVisibility(8);
                    }
                    SimplePlayerMediaView.this.m0.setVisibility(0);
                    return;
                }
            }
            View view = SimplePlayerMediaView.this.p0;
            if (view != null) {
                view.setVisibility(0);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b(long j) {
            com.smartdigimkt.q5.a aVar;
            WebProgressBarView webProgressBarView;
            SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
            if (simplePlayerMediaView.h0 > 0 && (webProgressBarView = simplePlayerMediaView.f0) != null) {
                if (webProgressBarView.getVisibility() != 0) {
                    SimplePlayerMediaView.this.f0.setVisibility(0);
                }
                SimplePlayerMediaView simplePlayerMediaView2 = SimplePlayerMediaView.this;
                simplePlayerMediaView2.f0.setProgress((int) ((j * 100.0d) / simplePlayerMediaView2.h0));
            }
            SimplePlayerMediaView simplePlayerMediaView3 = SimplePlayerMediaView.this;
            SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener = simplePlayerMediaView3.i0;
            if (sDMNativeAdMediaViewListener != null) {
                sDMNativeAdMediaViewListener.onProgressUpdate(j, simplePlayerMediaView3.h0);
            }
            ImageView imageView = SimplePlayerMediaView.this.m0;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            View view = SimplePlayerMediaView.this.p0;
            if (view != null) {
                view.setVisibility(8);
            }
            SimplePlayerMediaView simplePlayerMediaView4 = SimplePlayerMediaView.this;
            if (simplePlayerMediaView4.r0 || (aVar = simplePlayerMediaView4.e0) == null || simplePlayerMediaView4.k0.a(simplePlayerMediaView4, aVar.c(), 50, 0)) {
                return;
            }
            SimplePlayerMediaView.this.e0.b(2);
            SimplePlayerMediaView.this.d();
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(long j) {
            WebProgressBarView webProgressBarView;
            SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
            simplePlayerMediaView.h0 = j;
            if (j <= 0 || (webProgressBarView = simplePlayerMediaView.f0) == null) {
                return;
            }
            webProgressBarView.setVisibility(0);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b(int i2) {
            SimplePlayerMediaView simplePlayerMediaView;
            View.OnClickListener onClickListener;
            com.smartdigimkt.q5.a aVar;
            if ((SimplePlayerMediaView.this.A0 || this.f38410a.t.T() == 0) && (onClickListener = (simplePlayerMediaView = SimplePlayerMediaView.this).q0) != null) {
                onClickListener.onClick(simplePlayerMediaView);
            } else {
                if (!String.valueOf(this.f38410a.f39164b).equals("0") || (aVar = SimplePlayerMediaView.this.e0) == null || aVar.i() || !SimplePlayerMediaView.this.e0.j()) {
                    return;
                }
                SimplePlayerMediaView.this.c();
            }
        }
    }

    public class d implements com.smartdigimkt.d7.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.w6.f f38413a;

        public d(com.smartdigimkt.w6.f fVar) {
            this.f38413a = fVar;
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, String str2) {
        }

        @Override // com.smartdigimkt.d7.b.f
        public void a(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f38413a.s())) {
                ImageView imageView = SimplePlayerMediaView.this.o0;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                SimplePlayerMediaView.this.n0.setImageBitmap(bitmap);
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
            if (simplePlayerMediaView.e0 == null || simplePlayerMediaView.g0 == null) {
                return;
            }
            if (SimplePlayerMediaView.this.e0.h()) {
                SimplePlayerMediaView.this.g0.setMute(false);
                SimplePlayerMediaView.this.e0.d(false);
            } else {
                SimplePlayerMediaView.this.g0.setMute(true);
                SimplePlayerMediaView.this.e0.d(true);
            }
        }
    }

    public class f extends com.smartdigimkt.k7.a {
        public f() {
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public int getImpressionMinPercentageViewed() {
            return 50;
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public void recordImpression(View view) {
            com.smartdigimkt.q5.a aVar;
            SimplePlayerMediaView.this.s0.set(false);
            SimplePlayerMediaView simplePlayerMediaView = SimplePlayerMediaView.this;
            if (simplePlayerMediaView.r0 || (aVar = simplePlayerMediaView.e0) == null) {
                return;
            }
            aVar.p();
        }
    }

    public SimplePlayerMediaView(Context context) {
        this(context, null);
    }

    @Override // com.smartdigimkt.l5.a
    public void destroyPlayerView(int i2) {
        com.smartdigimkt.q5.a aVar = this.e0;
        if (aVar != null) {
            aVar.c(i2);
        }
    }

    @Override // com.smartdigimkt.l5.a
    public long getVideoCurrentPosition() {
        com.smartdigimkt.q5.a aVar = this.e0;
        if (aVar != null) {
            return aVar.e();
        }
        return 0L;
    }

    @Override // com.smartdigimkt.l5.a
    public void initPlayerView(com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.q5.a.c cVar, com.smartdigimkt.k5.d dVar) {
        b();
        if (fVar != null && fVar.i() != null) {
            this.C0 = fVar.i().M1();
        }
        this.k0 = new com.smartdigimkt.k7.f.c(this.C0);
        this.B0 = dVar;
        this.f0 = (WebProgressBarView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_player_view_progress_bar_id", "id"));
        this.l0 = (ImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_player_view_resume_img_id", "id"));
        this.n0 = (ImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_player_view_cover_img_id", "id"));
        this.o0 = (ImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_player_view_cover_icon_id", "id"));
        ImageView imageView = this.l0;
        if (imageView != null) {
            imageView.setOnClickListener(new a());
        }
        ImageView imageView2 = (ImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_player_view_replay_img_id", "id"));
        this.m0 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new b());
        }
        this.z0 = aVar.t.i0() <= 0 ? 100 : aVar.t.i0();
        this.p0 = findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_player_view_fail_id", "id"));
        com.smartdigimkt.q5.a aVar2 = new com.smartdigimkt.q5.a(this, aVar, fVar);
        this.e0 = aVar2;
        aVar2.e(true);
        this.e0.a(cVar);
        this.e0.a(new c(aVar, fVar));
        if (!TextUtils.isEmpty(fVar.s()) && this.n0 != null) {
            com.smartdigimkt.d7.b.a(getContext()).a(new com.smartdigimkt.d7.e(1, fVar.s()), getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels, new d(fVar));
        }
        setAutoPlay(this.w0);
        MuteImageView muteImageView = (MuteImageView) findViewById(com.smartdigimkt.n8.h.a(getContext(), "myoffer_btn_mute_id", "id"));
        this.g0 = muteImageView;
        if (muteImageView != null) {
            muteImageView.setMute(this.x0);
            this.g0.setOnClickListener(new e());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.smartdigimkt.q5.a aVar = this.e0;
        if (aVar != null && !this.y0) {
            this.y0 = true;
            aVar.a(this.x0, (List<Bitmap>) null, this.B0);
        }
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        com.smartdigimkt.q5.a aVar = this.e0;
        if (aVar != null) {
            aVar.b(4);
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void pauseVideo() {
        com.smartdigimkt.q5.a aVar = this.e0;
        if (aVar != null) {
            aVar.b(3);
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void resumeVideo() {
        com.smartdigimkt.q5.a aVar = this.e0;
        if (aVar != null) {
            if (this.r0 || !this.k0.a(this, aVar.c(), 50, 0)) {
                d();
            } else {
                this.e0.p();
            }
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void setATImproveClickViewController(com.smartdigimkt.w5.a aVar) {
        com.smartdigimkt.q5.a aVar2 = this.e0;
        if (aVar2 != null) {
            aVar2.a(aVar);
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void setAutoPlay(String str) {
        this.w0 = str;
        str.getClass();
        if (str.equals("1")) {
            return;
        }
        if (str.equals("2") && com.smartdigimkt.n8.h.i(getContext())) {
            return;
        }
        c();
    }

    @Override // com.smartdigimkt.l5.a
    public void setIsMuted(boolean z2) {
        this.x0 = z2;
        MuteImageView muteImageView = this.g0;
        if (muteImageView != null) {
            muteImageView.setMute(z2);
        }
        com.smartdigimkt.q5.a aVar = this.e0;
        if (aVar != null) {
            aVar.d(z2);
        }
    }

    @Override // com.smartdigimkt.l5.a
    public void setPlayerOnClickListener(View.OnClickListener onClickListener) {
        this.q0 = onClickListener;
    }

    @Override // com.smartdigimkt.l5.a
    public void setVideoListener(SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener) {
        this.i0 = sDMNativeAdMediaViewListener;
    }

    public void setmIsPureMode(boolean z2) {
        this.A0 = z2;
    }

    public SimplePlayerMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        com.smartdigimkt.k7.c cVar = this.j0;
        if (cVar != null) {
            cVar.b();
            this.j0 = null;
        }
        this.s0.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.r0 = true;
        com.smartdigimkt.q5.a aVar = this.e0;
        if (aVar != null && aVar.j()) {
            this.e0.b(1);
        }
        ImageView imageView = this.l0;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.j0 == null) {
            this.j0 = new com.smartdigimkt.k7.c(this.C0, getContext(), this.z0);
        }
        if (this.r0 || this.s0.get()) {
            return;
        }
        this.s0.set(true);
        this.j0.a(this, new f());
    }

    public void b() {
        LayoutInflater.from(getContext()).inflate(com.smartdigimkt.n8.h.a(getContext(), "myoffer_simple_player_media_ad_view", "layout"), this);
    }

    public SimplePlayerMediaView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.r0 = false;
        this.s0 = new AtomicBoolean(false);
        this.t0 = "1";
        this.u0 = "2";
        this.v0 = "3";
        this.w0 = "1";
        this.x0 = true;
        this.y0 = false;
        this.z0 = 0;
        this.A0 = false;
        this.C0 = 1;
    }
}
