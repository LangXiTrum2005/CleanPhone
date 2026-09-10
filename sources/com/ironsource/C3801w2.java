package com.ironsource;

import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: renamed from: com.ironsource.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3801w2 extends W7.a<ISDemandOnlyBannerListener> {

    /* JADX INFO: renamed from: com.ironsource.w2$a */
    public class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ IronSourceError b;
        final /* synthetic */ ISDemandOnlyBannerListener c;

        public a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = ironSourceError;
            this.c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3801w2.this.a(this.a, "onBannerAdLoadFailed() error = " + this.b.getErrorMessage());
            this.c.onBannerAdLoadFailed(this.a, this.b);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$b */
    public class b implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3801w2.this.a(this.a, "onBannerAdLoaded()");
            this.b.onBannerAdLoaded(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$c */
    public class c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3801w2.this.a(this.a, "onBannerAdShown()");
            this.b.onBannerAdShown(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$d */
    public class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3801w2.this.a(this.a, "onBannerAdClicked()");
            this.b.onBannerAdClicked(this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.w2$e */
    public class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ ISDemandOnlyBannerListener b;

        public e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.a = str;
            this.b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3801w2.this.a(this.a, "onBannerAdLeftApplication()");
            this.b.onBannerAdLeftApplication(this.a);
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
