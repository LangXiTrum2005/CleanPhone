package com.ironsource;

import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlay;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Xf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Sf f27945a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c implements Ba {
        public c() {
        }

        @Override // com.ironsource.Ba
        public void b(IronSourceError ironSourceError) {
            Xf.this.a(Yf.f28046b, LevelPlay.AdFormat.BANNER, C0271bg.f28309a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.Ba
        public void d(AdInfo adInfo) {
            Xf.this.a(Yf.f28050f, LevelPlay.AdFormat.BANNER, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void e(AdInfo adInfo) {
            Xf.this.a(Yf.f28054j, LevelPlay.AdFormat.BANNER, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void f(AdInfo adInfo) {
            Xf.this.a(Yf.f28056m, LevelPlay.AdFormat.BANNER, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void g(AdInfo adInfo) {
            Xf.this.a(Yf.f28055k, LevelPlay.AdFormat.BANNER, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.Ba
        public void h(AdInfo adInfo) {
            Xf.this.a(Yf.l, LevelPlay.AdFormat.BANNER, C0271bg.f28309a.a(adInfo));
        }
    }

    public Xf(Sf javaScriptEvaluator) {
        kotlin.jvm.internal.n.f(javaScriptEvaluator, "javaScriptEvaluator");
        this.f27945a = javaScriptEvaluator;
    }

    private final void b() {
        Wf wf2 = Wf.f27610a;
        wf2.a((InterfaceC0338fb) null);
        wf2.a((InterfaceC0552rb) null);
        wf2.a((Ba) null);
    }

    private final void c() {
        com.ironsource.mediationsdk.c.b().c(false);
        Wf.f27610a.e();
    }

    public final void d() {
        Wf wf2 = Wf.f27610a;
        wf2.a(new a());
        wf2.a(new b());
        wf2.a(new c());
    }

    public final void a() {
        b();
        c();
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a implements InterfaceC0338fb {
        public a() {
        }

        @Override // com.ironsource.InterfaceC0338fb
        public void a(AdInfo adInfo) {
            Xf.this.a(Yf.f28045a, LevelPlay.AdFormat.INTERSTITIAL, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC0338fb
        public void b(IronSourceError ironSourceError) {
            Xf.this.a(Yf.f28046b, LevelPlay.AdFormat.INTERSTITIAL, C0271bg.f28309a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC0338fb
        public void c(AdInfo adInfo) {
            Xf.this.a(Yf.f28047c, LevelPlay.AdFormat.INTERSTITIAL, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC0338fb
        public void d(AdInfo adInfo) {
            Xf.this.a(Yf.f28050f, LevelPlay.AdFormat.INTERSTITIAL, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC0338fb
        public void e(AdInfo adInfo) {
            Xf.this.a(Yf.f28048d, LevelPlay.AdFormat.INTERSTITIAL, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC0338fb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Xf.this.a(Yf.f28049e, LevelPlay.AdFormat.INTERSTITIAL, C0271bg.f28309a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC0338fb
        public void b(AdInfo adInfo) {
            Xf.this.a(Yf.f28051g, LevelPlay.AdFormat.INTERSTITIAL, C0271bg.f28309a.a(adInfo));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class b implements InterfaceC0588tb, InterfaceC0570sb {
        public b() {
        }

        @Override // com.ironsource.InterfaceC0588tb
        public void a(AdInfo adInfo) {
            Xf.this.a(Yf.f28045a, LevelPlay.AdFormat.REWARDED, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC0588tb
        public void b(IronSourceError ironSourceError) {
            Xf.this.a(Yf.f28046b, LevelPlay.AdFormat.REWARDED, C0271bg.f28309a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null));
        }

        @Override // com.ironsource.InterfaceC0552rb
        public void c(AdInfo adInfo) {
            Xf.this.a(Yf.f28047c, LevelPlay.AdFormat.REWARDED, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC0570sb
        public void d(AdInfo adInfo) {
            Xf.this.a(Yf.f28052h, LevelPlay.AdFormat.REWARDED, C0271bg.f28309a.a(adInfo));
        }

        @Override // com.ironsource.InterfaceC0570sb
        public void a() {
            Xf.this.a(Yf.f28057n, LevelPlay.AdFormat.REWARDED, C0271bg.f28309a.a(new Object[0]));
        }

        @Override // com.ironsource.InterfaceC0552rb
        public void b(C0358gd c0358gd, AdInfo adInfo) {
            Xf.this.a(Yf.f28053i, LevelPlay.AdFormat.REWARDED, C0271bg.f28309a.a(Wf.f27610a.a(c0358gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC0552rb
        public void a(IronSourceError ironSourceError, AdInfo adInfo) {
            Xf.this.a(Yf.f28049e, LevelPlay.AdFormat.REWARDED, C0271bg.f28309a.a(ironSourceError != null ? ironSourceError.getErrorMessage() : null, adInfo));
        }

        @Override // com.ironsource.InterfaceC0552rb
        public void a(C0358gd c0358gd, AdInfo adInfo) {
            Xf.this.a(Yf.f28050f, LevelPlay.AdFormat.REWARDED, C0271bg.f28309a.a(Wf.f27610a.a(c0358gd), adInfo));
        }

        @Override // com.ironsource.InterfaceC0552rb
        public void b(AdInfo adInfo) {
            Xf.this.a(Yf.f28051g, LevelPlay.AdFormat.REWARDED, C0271bg.f28309a.a(adInfo));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f27945a.a(str, adFormat, list);
    }
}
