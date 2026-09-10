package sg.bigo.ads.ad.splash.a;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.SplashAdRequest;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final m f46907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final m f46908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected sg.bigo.ads.ad.splash.b f46909c;
    int d = c.a.f46853a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    sg.bigo.ads.api.core.g f46910e;
    private final String f;
    private View g;

    public j(sg.bigo.ads.api.core.g gVar, m mVar, m mVar2, sg.bigo.ads.ad.splash.b bVar) {
        this.f46909c = bVar;
        this.f46907a = mVar;
        this.f46908b = mVar2;
        this.f46910e = gVar;
        this.f = gVar.f47032a.i();
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
        VideoController videoController;
        if (this.d == c.a.f46854b && (videoController = this.f46909c.x.getVideoController()) != null) {
            videoController.setVideoLifeCallback(new VideoController.VideoLifeCallback() { // from class: sg.bigo.ads.ad.splash.a.j.1
                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onMuteChange(boolean z2) {
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoEnd() {
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPause() {
                    j.this.f46909c.y();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoPlay() {
                    j.this.f46909c.z();
                }

                @Override // sg.bigo.ads.api.VideoController.VideoLifeCallback
                public final void onVideoStart() {
                }
            });
        }
        sg.bigo.ads.api.core.g gVar = this.f46909c.f46918B;
        final String strL = gVar == null ? "" : gVar.f47033b.l();
        sg.bigo.ads.common.n.d.a(3, new Runnable() { // from class: sg.bigo.ads.ad.splash.a.j.2
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.controller.c.a.a(strL);
                sg.bigo.ads.common.x.a.j(strL);
                String str = strL;
                sg.bigo.ads.common.x.a.a(str, sg.bigo.ads.common.x.a.i(str) + 1);
                sg.bigo.ads.common.x.a.a(strL, System.currentTimeMillis());
            }
        });
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void c() {
        this.d = c.a.d;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final int d() {
        return this.d;
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final AtomicBoolean i() {
        return new AtomicBoolean(false);
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final void j() {
    }

    @Override // sg.bigo.ads.ad.splash.a.h
    public final void a(w wVar) {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z2) {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z2, ViewGroup viewGroup, int i2) {
        int i3;
        if (z2) {
            View view = this.g;
            if (view == null) {
                this.d = c.a.f46854b;
                sg.bigo.ads.ad.b.c cVar = this.f46909c.x;
                if (cVar != null) {
                    o oVar = (o) cVar.f();
                    String title = null;
                    this.g = sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), sg.bigo.ads.ad.splash.a.b(this.f46907a) ? R.layout.bigo_ad_splash_style_halfscreen_vpaid : R.layout.bigo_ad_splash_style_fullscreen_vpaid, null, false);
                    viewGroup.addView(this.g, 1, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup.setTag(11);
                    MediaView mediaView = (MediaView) viewGroup.findViewById(R.id.bigo_ad_splash_media);
                    if (mediaView != null) {
                        mediaView.setImageBlurBorder(false);
                    }
                    AdOptionsView adOptionsView = (AdOptionsView) viewGroup.findViewById(R.id.bigo_ad_splash_options);
                    ArrayList arrayList = new ArrayList();
                    boolean zB = sg.bigo.ads.ad.splash.a.b(this.f46907a);
                    final ImageView imageView = (ImageView) viewGroup.findViewById(R.id.bigo_ad_splash_icon);
                    if (imageView != null) {
                        imageView.setTag(1);
                        if (zB) {
                            sg.bigo.ads.api.b bVar = this.f46910e.f47034c;
                            if ((bVar instanceof SplashAdRequest) && (i3 = ((SplashAdRequest) bVar).f46972h) != 0) {
                                imageView.setImageResource(i3);
                            }
                        } else {
                            String strC = oVar.av() != null ? oVar.av().c() : null;
                            if (!q.a((CharSequence) strC) && URLUtil.isNetworkUrl(strC)) {
                                sg.bigo.ads.common.p.e.b(this.f46909c.f45584b.f47035e, null, strC, oVar.al(), new sg.bigo.ads.common.p.g() { // from class: sg.bigo.ads.ad.splash.a.j.3
                                    @Override // sg.bigo.ads.common.p.g
                                    public final void a(int i4, String str, String str2) {
                                    }

                                    @Override // sg.bigo.ads.common.p.g
                                    public final void a(Bitmap bitmap, sg.bigo.ads.common.p.f fVar) {
                                        if (j.this.d == c.a.f46854b) {
                                            imageView.setImageBitmap(bitmap);
                                        }
                                    }
                                });
                            }
                        }
                    }
                    TextView textView = (TextView) viewGroup.findViewById(R.id.bigo_ad_splash_title);
                    if (textView != null) {
                        textView.setTag(2);
                        if (zB) {
                            sg.bigo.ads.api.b bVar2 = this.f46910e.f47034c;
                            if (bVar2 instanceof SplashAdRequest) {
                                title = ((SplashAdRequest) bVar2).f46973i;
                            }
                        } else {
                            title = cVar.getTitle();
                        }
                        if (!TextUtils.isEmpty(title)) {
                            textView.setText(title);
                        }
                    }
                    TextView textView2 = (TextView) viewGroup.findViewById(R.id.inter_splash_advertiser);
                    TextView textView3 = (TextView) viewGroup.findViewById(R.id.inter_splash_adtage);
                    if (textView2 != null && textView3 != null) {
                        if (q.a((CharSequence) this.f)) {
                            textView2.setVisibility(8);
                        } else {
                            textView3.setText(R.string.bigo_ad_tag);
                            textView2.setText(this.f);
                            textView2.setPadding(sg.bigo.ads.common.utils.e.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView2.getContext(), 1));
                        }
                    }
                    sg.bigo.ads.core.adview.h hVar = new sg.bigo.ads.core.adview.h() { // from class: sg.bigo.ads.ad.splash.a.j.4
                        @Override // sg.bigo.ads.core.adview.h
                        public final void a(int i4, int i5, int i6, int i7, int i8, int i9) {
                        }
                    };
                    View viewFindViewById = viewGroup.findViewById(R.id.layout_contain_view);
                    int iA = this.f46908b.a("video_play_page.click_type");
                    if (mediaView != null) {
                        mediaView.b().a(this.f46908b.a("video_play_page.media_view_clickable_switch") == 1);
                    }
                    if (viewFindViewById != null) {
                        viewFindViewById.setTag(9);
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById, 8, this.f46908b.a("video_play_page.other_space_clickable_switch") == 1 ? cVar : hVar, iA);
                    }
                    cVar.registerViewForInteraction(viewGroup, mediaView, (ImageView) null, adOptionsView, arrayList);
                    if (mediaView != null && sg.bigo.ads.ad.splash.a.b()) {
                        mediaView.getLayoutParams().width = -2;
                        mediaView.getLayoutParams().height = -1;
                    }
                    View viewFindViewById2 = viewGroup.findViewById(R.id.inter_layout_ad_tag);
                    if (viewFindViewById2 != null) {
                        sg.bigo.ads.ad.b.a.a(viewGroup, viewFindViewById2, 8, hVar, iA);
                    }
                    if (viewFindViewById != null) {
                        sg.bigo.ads.ad.splash.a.a(viewGroup, viewFindViewById, this.f46908b.a("video_play_page.below_area_dp"), this.f46908b.a("video_play_page.below_area_clickable") == 1, this.f46908b.a("video_play_page.up_area_dp"), this.f46908b.a("video_play_page.up_area_clickable") == 1, 8, iA, cVar);
                        return;
                    }
                    return;
                }
                return;
            }
            this.d = c.a.f46854b;
            view.setVisibility(0);
            return;
        }
        View view2 = this.g;
        if (view2 != null) {
            this.d = c.a.f46855c;
            view2.setVisibility(8);
            this.d = c.a.d;
        }
    }
}
