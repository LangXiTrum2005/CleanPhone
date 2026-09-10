package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.api.InterstitialAd;

/* JADX INFO: loaded from: classes7.dex */
public class o extends k<sg.bigo.ads.api.core.i> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    sg.bigo.ads.ad.banner.h f46449A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected sg.bigo.ads.ad.interstitial.i.a f46450B;
    private final boolean C;
    private boolean D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final AtomicBoolean f46451E;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final sg.bigo.ads.ad.banner.c<o> f46452z;

    public o(sg.bigo.ads.api.core.g gVar) {
        sg.bigo.ads.api.a.m mVarE;
        super(gVar);
        try {
            sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) f();
            sg.bigo.ads.ad.interstitial.i.a aVar = null;
            if (iVar != null && (mVarE = iVar.e()) != null) {
                n nVar = new n();
                nVar.f46445a = mVarE.a("video_play_page.ad_component_layout");
                nVar.f46446b = mVarE.a("video_play_page.force_staying_time");
                nVar.f46447c = mVarE.a("video_play_page.close_button_style");
                nVar.d = mVarE.a("video_play_page.x_area");
                nVar.f46448e = mVarE.a("video_play_page.duration");
                int i2 = nVar.f46445a;
                aVar = i2 != 1 ? i2 != 2 ? new sg.bigo.ads.ad.interstitial.i.a(this, this.f45584b.f47035e, nVar) : new sg.bigo.ads.ad.interstitial.i.c(this, this.f45584b.f47035e, nVar) : new sg.bigo.ads.ad.interstitial.i.b(this, this.f45584b.f47035e, nVar);
            }
            this.f46450B = aVar;
            this.f46451E = new AtomicBoolean(false);
            boolean zAv = iVar.av();
            this.C = zAv;
            sg.bigo.ads.ad.banner.c<o> cVar = new sg.bigo.ads.ad.banner.c<>(this.f45584b.f47035e, gVar, this, iVar, B(), new sg.bigo.ads.ad.banner.h() { // from class: sg.bigo.ads.ad.interstitial.o.1
                @Override // sg.bigo.ads.ad.banner.h
                public final void a() {
                    if (o.this.f46449A != null) {
                        o.this.f46449A.a();
                    }
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void b() {
                    o.d(o.this);
                    if (o.this.n()) {
                        o.this.D();
                    }
                }

                @Override // sg.bigo.ads.ad.banner.h
                public final void a(String str) {
                    p005e.a.d(0, 3, str, "InterstitialBannerAd onCustomJsOmImpression, adSessionId=", "InterstitialBannerAd");
                    o.this.D();
                    sg.bigo.ads.core.d.b.a(o.this.f45584b.f47032a, (String) o.this.b("show_proportion", ""), o.this.i(), ((Integer) o.this.b("render_style", 0)).intValue());
                }

                /* JADX WARN: Code duplicated, block: B:14:0x002a  */
                @Override // sg.bigo.ads.ad.banner.h
                public final void a(sg.bigo.ads.common.i iVar2, sg.bigo.ads.api.core.e eVar) {
                    int i3;
                    if (iVar2 != null) {
                        Rect rect = ((k) o.this).y;
                        Point point = iVar2.f47308a;
                        if (point == null || iVar2.f47309b == null || rect == null || !rect.contains(point.x, point.y)) {
                            i3 = 0;
                        } else {
                            Point point2 = iVar2.f47309b;
                            if (rect.contains(point2.x, point2.y)) {
                                i3 = 33;
                            } else {
                                i3 = 0;
                            }
                        }
                    } else {
                        i3 = 0;
                    }
                    o.this.a(iVar2, i3, 1, eVar);
                }
            }, zAv);
            this.f46452z = cVar;
            cVar.f45521b = 0;
            cVar.f45528p = this.f46450B;
        } catch (Exception unused) {
            throw new IllegalArgumentException("Error data type for ad!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        if (this.f46451E.compareAndSet(false, true)) {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "InterstitialBannerAd report impression AdEvent");
            super.l();
        }
    }

    public static /* synthetic */ boolean d(o oVar) {
        oVar.D = true;
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public Class<? extends sg.bigo.ads.controller.e.b<?>> A() {
        return m.class;
    }

    public sg.bigo.ads.core.mraid.n B() {
        return sg.bigo.ads.core.mraid.n.INTERSTITIAL;
    }

    public final n C() {
        sg.bigo.ads.ad.interstitial.i.a aVar = this.f46450B;
        if (aVar != null) {
            return aVar.f46334c;
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final void b(Activity activity) {
        super.b(activity);
        sg.bigo.ads.ad.banner.c<o> cVar = this.f46452z;
        if (cVar != null) {
            cVar.f45527n = new WeakReference<>(activity);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.k, sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        this.f46449A = null;
        super.destroyInMainThread();
        this.f46452z.a();
    }

    @Override // sg.bigo.ads.api.Ad
    public String getCreativeId() {
        sg.bigo.ads.ad.banner.c<o> cVar = this.f46452z;
        return cVar != null ? cVar.d() : "";
    }

    @Override // sg.bigo.ads.ad.c
    public final void h() {
        super.h();
        sg.bigo.ads.ad.banner.c<o> cVar = this.f46452z;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void l() {
        if (!this.C || this.D) {
            D();
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "InterstitialBannerAd", "BannerAd report impression AdEvent depend on om callback.");
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void m() {
        super.m();
        D();
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public final boolean y() {
        return false;
    }

    public final void a(AdCountDownButton adCountDownButton, View view) {
        int i2;
        sg.bigo.ads.ad.interstitial.i.a aVar = this.f46450B;
        if (aVar == null || adCountDownButton == null) {
            return;
        }
        int i3 = aVar.f46334c.f46447c;
        if (i3 == 2) {
            i2 = R.drawable.bigo_ad_ic_close2;
        } else if (i3 == 3) {
            i2 = R.drawable.bigo_ad_ic_close3;
        } else if (i3 != 4) {
            i2 = i3 != 5 ? R.drawable.bigo_ad_ic_close : R.drawable.bigo_ad_ic_close5;
        } else {
            i2 = R.drawable.bigo_ad_ic_close4;
        }
        adCountDownButton.setCloseImageResource(i2);
        adCountDownButton.setShowCloseButtonInCountdown(true);
        adCountDownButton.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.i.a.1

            /* JADX INFO: renamed from: a */
            final /* synthetic */ AdCountDownButton f46335a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f46336b;

            public AnonymousClass1() {
                adCountDownButton = adCountDownButton;
                view = view;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a aVar2 = a.this;
                int i4 = aVar2.f46334c.d;
                if (i4 == 1) {
                    adCountDownButton.setBtnClickArea(1);
                    return;
                }
                if (i4 == 2) {
                    adCountDownButton.setBtnClickArea(2);
                    return;
                }
                if (i4 != 3) {
                    return;
                }
                AdCountDownButton adCountDownButton2 = adCountDownButton;
                View view2 = view;
                Rect rect = new Rect();
                adCountDownButton2.getHitRect(rect);
                rect.inset((-rect.width()) / 2, (-rect.height()) / 2);
                View closeView = adCountDownButton2.getCloseView();
                if (view2 == null || closeView == null) {
                    return;
                }
                view2.setOnTouchListener(new View.OnTouchListener() { // from class: sg.bigo.ads.ad.interstitial.i.a.2

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ Rect f46338a;

                    /* JADX INFO: renamed from: b */
                    final /* synthetic */ View f46339b;

                    public AnonymousClass2() {
                        rect = rect;
                        view = closeView;
                    }

                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            return false;
                        }
                        if (motionEvent.getActionMasked() != 0) {
                            return true;
                        }
                        view.onTouchEvent(motionEvent);
                        return true;
                    }
                });
            }
        });
    }

    @Override // sg.bigo.ads.ad.interstitial.k
    public void b(sg.bigo.ads.api.b.d.a<InterstitialAd> aVar) {
        sg.bigo.ads.api.core.c cVar = this.f45584b.f47032a;
        if (!(cVar instanceof sg.bigo.ads.api.core.i)) {
            aVar.a(this, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, 1250, "InterstitialBannerAd with invalid AdData class type.");
            return;
        }
        sg.bigo.ads.api.core.i iVar = (sg.bigo.ads.api.core.i) cVar;
        if (iVar.aw() == null || TextUtils.isEmpty(iVar.aw().c())) {
            aVar.a(this, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, 1252, "Empty content.");
        } else {
            this.f46452z.a(new sg.bigo.ads.api.b.a.InterfaceC0830a() { // from class: sg.bigo.ads.ad.interstitial.o.2
                @Override // sg.bigo.ads.api.b.a.InterfaceC0830a
                public final void a(sg.bigo.ads.api.core.d dVar) {
                }

                @Override // sg.bigo.ads.api.b.a.InterfaceC0830a
                public final void b() {
                }
            });
            aVar.a(this);
        }
    }
}
