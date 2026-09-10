package com.p004ironsource;

import com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes5.dex */
public class wg extends vg.a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f27577b;

        public a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f27576a = str;
            this.f27577b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            wg.this.a(this.f27576a, "onRewardedVideoAdLoadSuccess()");
            this.f27577b.onRewardedVideoAdLoadSuccess(this.f27576a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f27580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f27581c;

        public b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f27579a = str;
            this.f27580b = ironSourceError;
            this.f27581c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            wg.this.a(this.f27579a, "onRewardedVideoAdLoadFailed() error = " + this.f27580b.getErrorMessage());
            this.f27581c.onRewardedVideoAdLoadFailed(this.f27579a, this.f27580b);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f27583b;

        public c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f27582a = str;
            this.f27583b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            wg.this.a(this.f27582a, "onRewardedVideoAdOpened()");
            this.f27583b.onRewardedVideoAdOpened(this.f27582a);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSourceError f27586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f27587c;

        public d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f27585a = str;
            this.f27586b = ironSourceError;
            this.f27587c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            wg.this.a(this.f27585a, "onRewardedVideoAdShowFailed() error = " + this.f27586b.getErrorMessage());
            this.f27587c.onRewardedVideoAdShowFailed(this.f27585a, this.f27586b);
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f27589b;

        public e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f27588a = str;
            this.f27589b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            wg.this.a(this.f27588a, "onRewardedVideoAdClicked()");
            this.f27589b.onRewardedVideoAdClicked(this.f27588a);
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f27592b;

        public f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f27591a = str;
            this.f27592b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            wg.this.a(this.f27591a, "onRewardedVideoAdRewarded()");
            this.f27592b.onRewardedVideoAdRewarded(this.f27591a);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f27594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f27595b;

        public g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f27594a = str;
            this.f27595b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            wg.this.a(this.f27594a, "onRewardedVideoAdClosed()");
            this.f27595b.onRewardedVideoAdClosed(this.f27594a);
        }
    }

    public wg() {
    }

    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new e(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new g(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new b(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new a(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new c(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new f(str, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    @Override // com.p004ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListenerA = a();
        a(new d(str, ironSourceError, iSDemandOnlyRewardedVideoListenerA), iSDemandOnlyRewardedVideoListenerA != null);
    }

    public wg(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        b(iSDemandOnlyRewardedVideoListener);
    }
}
