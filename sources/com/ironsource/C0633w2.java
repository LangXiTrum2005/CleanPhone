package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0633w2 extends Y7.a<ISDemandOnlyBannerListener> {

    /* JADX INFO: renamed from: com.ironsource.w2$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f30898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f30899c;

        public a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f30897a = str;
            this.f30898b = ironSourceError;
            this.f30899c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0633w2.this.a(this.f30897a, "onBannerAdLoadFailed() error = " + this.f30898b.getErrorMessage());
            this.f30899c.onBannerAdLoadFailed(this.f30897a, this.f30898b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$b */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f30902b;

        public b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f30901a = str;
            this.f30902b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0633w2.this.a(this.f30901a, "onBannerAdLoaded()");
            this.f30902b.onBannerAdLoaded(this.f30901a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$c */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f30905b;

        public c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f30904a = str;
            this.f30905b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0633w2.this.a(this.f30904a, "onBannerAdShown()");
            this.f30905b.onBannerAdShown(this.f30904a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$d */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f30908b;

        public d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f30907a = str;
            this.f30908b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0633w2.this.a(this.f30907a, "onBannerAdClicked()");
            this.f30908b.onBannerAdClicked(this.f30907a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$e */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f30910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f30911b;

        public e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f30910a = str;
            this.f30911b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0633w2.this.a(this.f30910a, "onBannerAdLeftApplication()");
            this.f30911b.onBannerAdLeftApplication(this.f30910a);
        }
    }

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new a(str, ironSourceError, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void b(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new e(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void c(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new b(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void d(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new c(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }

    public void a(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new d(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }
}
