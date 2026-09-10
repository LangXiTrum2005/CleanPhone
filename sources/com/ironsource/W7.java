package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class W7 extends Y7.a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27529a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f27530b;

        public a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f27529a = str;
            this.f27530b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f27529a, "onInterstitialAdReady()");
            this.f27530b.onInterstitialAdReady(this.f27529a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f27533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f27534c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f27532a = str;
            this.f27533b = ironSourceError;
            this.f27534c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f27532a, "onInterstitialAdLoadFailed() error = " + this.f27533b.getErrorMessage());
            this.f27534c.onInterstitialAdLoadFailed(this.f27532a, this.f27533b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f27537b;

        public c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f27536a = str;
            this.f27537b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f27536a, "onInterstitialAdOpened()");
            this.f27537b.onInterstitialAdOpened(this.f27536a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f27540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f27541c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f27539a = str;
            this.f27540b = ironSourceError;
            this.f27541c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f27539a, "onInterstitialAdShowFailed() error = " + this.f27540b.getErrorMessage());
            this.f27541c.onInterstitialAdShowFailed(this.f27539a, this.f27540b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f27544b;

        public e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f27543a = str;
            this.f27544b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f27543a, "onInterstitialAdClicked()");
            this.f27544b.onInterstitialAdClicked(this.f27543a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyInterstitialListener f27547b;

        public f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f27546a = str;
            this.f27547b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            W7.this.a(this.f27546a, "onInterstitialAdClosed()");
            this.f27547b.onInterstitialAdClosed(this.f27546a);
        }
    }

    public W7(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new e(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new f(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new b(str, ironSourceError, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new c(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new a(str, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListenerA = a();
        a(new d(str, ironSourceError, iSDemandOnlyInterstitialListenerA), iSDemandOnlyInterstitialListenerA != null);
    }

    public W7() {
    }
}
