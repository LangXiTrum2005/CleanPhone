package sg.bigo.ads.ad.interstitial.j;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.c;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.api.a.m;

/* JADX INFO: loaded from: classes7.dex */
public class a extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected x f46343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected m f46344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.common.e.a.AbstractC0836a f46345c;
    private boolean d;

    public a(Activity activity) {
        super(activity);
        this.f46345c = new sg.bigo.ads.common.e.a.AbstractC0836a() { // from class: sg.bigo.ads.ad.interstitial.j.a.1
            @Override // sg.bigo.ads.common.e.a.AbstractC0836a
            public final void a(boolean z2) {
                a aVar = a.this;
                if (z2) {
                    aVar.U();
                } else {
                    aVar.V();
                }
            }
        };
        this.d = true;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public int R() {
        return R.layout.bigo_ad_activity_interstitial_vpaid;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean S() {
        return true;
    }

    public void a() {
        if (this.f46325A == null) {
            return;
        }
        int i2 = this.f46343a.f46714c;
        if (((t) this.y).f().x() != 4) {
            i2 = 0;
        }
        this.f46325A.a(i2, (AdCountDownButton.b) null);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean f() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void g(int i2) {
        super.g(i2);
        if (this.D == null) {
            a("can not find ad root view.");
            return;
        }
        if (this.y == 0) {
            a("Illegal InterstitialAd.");
            return;
        }
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null) {
            sg.bigo.ads.common.e.a.a(adCountDownButton, this.f46345c);
            this.f46325A.setShowCloseButtonInCountdown(false);
            this.f46325A.setTakeoverTickEvent(false);
            if (this.f46325A.getVisibility() != 0) {
                this.f46325A.setVisibility(0);
                c.b((View) this.f46325A);
            }
            a();
        }
        ViewGroup viewGroup = this.D;
        if (viewGroup != null && this.C != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
            TextView textView2 = (TextView) this.D.findViewById(R.id.inter_ad_label);
            String advertiser = this.C.getAdvertiser();
            if (textView != null && textView2 != null) {
                boolean zIsEmpty = TextUtils.isEmpty(advertiser);
                textView.setVisibility(!zIsEmpty ? 0 : 8);
                if (!zIsEmpty) {
                    textView.setText(advertiser);
                    textView2.setText(R.string.bigo_ad_tag);
                }
            }
        }
        u uVarZ = Z();
        ViewGroup viewGroup2 = this.D;
        uVarZ.a(viewGroup2, viewGroup2, Y(), 12, this.f46343a.f46717i, this.f46325A);
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        VideoController videoControllerAa = aa();
        if (videoControllerAa != null && videoControllerAa.isPaused() && this.d) {
            videoControllerAa.play();
            this.d = false;
        }
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton == null || adCountDownButton.f45723c) {
            return;
        }
        adCountDownButton.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void j() {
        VideoController videoControllerAa = aa();
        boolean z2 = videoControllerAa != null && videoControllerAa.isPlaying();
        this.d = z2;
        if (z2) {
            videoControllerAa.pause();
        }
        AdCountDownButton adCountDownButton = this.f46325A;
        if (adCountDownButton != null && !adCountDownButton.f45723c) {
            adCountDownButton.b();
        }
        super.j();
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void m() {
        super.m();
        this.f46344b = ((t) this.y).f().e();
        x xVar = new x();
        m mVar = this.f46344b;
        if (mVar != null) {
            xVar.f = mVar.c("video_play_page.media_view_clickable_switch");
            xVar.g = this.f46344b.c("video_play_page.other_space_clickable_switch");
            xVar.f46717i = this.f46344b.a("video_play_page.click_type");
            xVar.f46714c = this.f46344b.a("video_play_page.force_staying_time");
        }
        this.f46343a = xVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final int n() {
        return 0;
    }
}
