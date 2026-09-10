package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class zzaz extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10782a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdListener f10783b;

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        synchronized (this.f10782a) {
            try {
                AdListener adListener = this.f10783b;
                if (adListener != null) {
                    adListener.onAdClicked();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.f10782a) {
            try {
                AdListener adListener = this.f10783b;
                if (adListener != null) {
                    adListener.onAdClosed();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.f10782a) {
            try {
                AdListener adListener = this.f10783b;
                if (adListener != null) {
                    adListener.onAdFailedToLoad(loadAdError);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.f10782a) {
            try {
                AdListener adListener = this.f10783b;
                if (adListener != null) {
                    adListener.onAdImpression();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.f10782a) {
            try {
                AdListener adListener = this.f10783b;
                if (adListener != null) {
                    adListener.onAdLoaded();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.f10782a) {
            try {
                AdListener adListener = this.f10783b;
                if (adListener != null) {
                    adListener.onAdOpened();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zza(AdListener adListener) {
        synchronized (this.f10782a) {
            this.f10783b = adListener;
        }
    }
}
