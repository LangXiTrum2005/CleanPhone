package com.google.android.gms.internal.ads;

import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uj0 extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20806b;

    public /* synthetic */ uj0(Object obj, int i10) {
        this.f20805a = i10;
        this.f20806b = obj;
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClicked() {
        switch (this.f20805a) {
            case 1:
                super.onAdClicked();
                ((th.d) this.f20806b).f50768b.onAdClicked();
                break;
            case 2:
                super.onAdClicked();
                ((xh.b) this.f20806b).f53799b.onAdClicked();
                break;
            default:
                super.onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdClosed() {
        switch (this.f20805a) {
            case 1:
                super.onAdClosed();
                ((th.d) this.f20806b).f50768b.onAdClosed();
                break;
            case 2:
                super.onAdClosed();
                ((xh.b) this.f20806b).f53799b.onAdClosed();
                break;
            default:
                super.onAdClosed();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        AdView adView;
        AdView adView2;
        switch (this.f20805a) {
            case 0:
                ((vj0) this.f20806b).y1(vj0.B1(loadAdError));
                break;
            case 1:
                super.onAdFailedToLoad(loadAdError);
                th.d dVar = (th.d) this.f20806b;
                th.c cVar = dVar.f50769c;
                RelativeLayout relativeLayout = cVar.f50764h;
                if (relativeLayout != null && (adView = cVar.f50767k) != null) {
                    relativeLayout.removeView(adView);
                }
                dVar.f50768b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
                break;
            default:
                super.onAdFailedToLoad(loadAdError);
                xh.b bVar = (xh.b) this.f20806b;
                xh.a aVar = bVar.f53800c;
                RelativeLayout relativeLayout2 = aVar.f53795h;
                if (relativeLayout2 != null && (adView2 = aVar.f53798k) != null) {
                    relativeLayout2.removeView(adView2);
                }
                bVar.f53799b.onAdFailedToLoad(loadAdError.getCode(), loadAdError.getMessage());
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdImpression() {
        switch (this.f20805a) {
            case 1:
                super.onAdImpression();
                ((th.d) this.f20806b).f50768b.onAdImpression();
                break;
            case 2:
                super.onAdImpression();
                ((xh.b) this.f20806b).f53799b.onAdImpression();
                break;
            default:
                super.onAdImpression();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        switch (this.f20805a) {
            case 1:
                super.onAdLoaded();
                ((th.d) this.f20806b).f50768b.onAdLoaded();
                break;
            case 2:
                super.onAdLoaded();
                ((xh.b) this.f20806b).f53799b.onAdLoaded();
                break;
            default:
                super.onAdLoaded();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdOpened() {
        switch (this.f20805a) {
            case 1:
                super.onAdOpened();
                ((th.d) this.f20806b).f50768b.onAdOpened();
                break;
            case 2:
                super.onAdOpened();
                ((xh.b) this.f20806b).f53799b.onAdOpened();
                break;
            default:
                super.onAdOpened();
                break;
        }
    }

    public uj0(vj0 vj0Var) {
        this.f20805a = 0;
        Objects.requireNonNull(vj0Var);
        this.f20806b = vj0Var;
    }
}
