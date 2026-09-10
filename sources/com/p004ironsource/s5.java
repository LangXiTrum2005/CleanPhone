package com.p004ironsource;

import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public class s5 extends vg.a<ISDemandOnlyBannerListener> {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f26744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f26745c;

        public a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f26743a = str;
            this.f26744b = ironSourceError;
            this.f26745c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            s5.this.a(this.f26743a, "onBannerAdLoadFailed() error = " + this.f26744b.getErrorMessage());
            this.f26745c.onBannerAdLoadFailed(this.f26743a, this.f26744b);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f26747b;

        public b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f26746a = str;
            this.f26747b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            s5.this.a(this.f26746a, "onBannerAdLoaded()");
            this.f26747b.onBannerAdLoaded(this.f26746a);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26749a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f26750b;

        public c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f26749a = str;
            this.f26750b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            s5.this.a(this.f26749a, "onBannerAdShown()");
            this.f26750b.onBannerAdShown(this.f26749a);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f26753b;

        public d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f26752a = str;
            this.f26753b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            s5.this.a(this.f26752a, "onBannerAdClicked()");
            this.f26753b.onBannerAdClicked(this.f26752a);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f26755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyBannerListener f26756b;

        public e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f26755a = str;
            this.f26756b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            s5.this.a(this.f26755a, "onBannerAdLeftApplication()");
            this.f26756b.onBannerAdLeftApplication(this.f26755a);
        }
    }

    public void a(String str) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new d(str, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
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

    public void a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener iSDemandOnlyBannerListenerA = a();
        a(new a(str, ironSourceError, iSDemandOnlyBannerListenerA), iSDemandOnlyBannerListenerA != null);
    }
}
