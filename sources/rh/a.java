package rh;

import android.content.Context;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.common.api.internal.m0;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.h;
import com.unity3d.services.ads.gmascar.handlers.ScarBannerAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarInterstitialAdHandler;
import com.unity3d.services.ads.gmascar.handlers.ScarRewardedAdHandler;
import com.unity3d.services.banners.BannerView;
import r9.b;
import th.e;
import th.j;
import xh.d;
import xh.f;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f49587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f49588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i10) {
        super(cVar);
        this.f49587e = i10;
    }

    @Override // com.unity3d.scar.adapter.common.e
    public final void a(Context context, ph.c cVar, ScarRewardedAdHandler scarRewardedAdHandler) {
        switch (this.f49587e) {
            case 0:
                e eVar = new e(context, cVar, (sh.a) this.f49588f, (c) this.f38585d, 1);
                eVar.f50762g = new j(scarRewardedAdHandler, eVar);
                b.y(new m0(this, eVar, cVar, 24));
                break;
            default:
                xh.c cVar2 = new xh.c(context, cVar, (wh.a) this.f49588f, (c) this.f38585d, 1);
                cVar2.f50762g = new f(scarRewardedAdHandler, cVar2);
                b.y(new m0(this, cVar2, cVar, 26));
                break;
        }
    }

    @Override // com.unity3d.scar.adapter.common.e
    public final void b(Context context, ph.c cVar, ScarInterstitialAdHandler scarInterstitialAdHandler) {
        switch (this.f49587e) {
            case 0:
                e eVar = new e(context, cVar, (sh.a) this.f49588f, (c) this.f38585d, 0);
                eVar.f50762g = new th.h(scarInterstitialAdHandler, eVar);
                b.y(new m0(this, eVar, cVar, 23));
                break;
            default:
                xh.c cVar2 = new xh.c(context, cVar, (wh.a) this.f49588f, (c) this.f38585d, 0);
                cVar2.f50762g = new d(scarInterstitialAdHandler, cVar2);
                b.y(new m0(this, cVar2, cVar, 25));
                break;
        }
    }

    @Override // com.unity3d.scar.adapter.common.e
    public final void c(Context context, BannerView bannerView, ph.c cVar, int i10, int i11, ScarBannerAdHandler scarBannerAdHandler) {
        switch (this.f49587e) {
            case 0:
                th.c cVar2 = new th.c(context, cVar, (sh.a) this.f49588f, (c) this.f38585d, 0);
                cVar2.f50764h = bannerView;
                cVar2.f50765i = i10;
                cVar2.f50766j = i11;
                cVar2.f50767k = new AdView(context);
                cVar2.f50762g = new th.d(scarBannerAdHandler, cVar2);
                b.y(new q5.a(cVar2, 2));
                break;
            default:
                xh.a aVar = new xh.a(context, cVar, (wh.a) this.f49588f, (c) this.f38585d, 1);
                aVar.f53795h = bannerView;
                aVar.f53796i = i10;
                aVar.f53797j = i11;
                aVar.f53798k = new AdView(context);
                aVar.f50762g = new xh.b(scarBannerAdHandler, aVar);
                b.y(new q5.a(aVar, 5));
                break;
        }
    }
}
