package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3839k3 extends AppOpenAd.AppOpenAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3491g4 f4581a;
    public final /* synthetic */ I5 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ C3927l3 d;

    public C3839k3(C3927l3 c3927l3, I5 i5, Context context) {
        this.d = c3927l3;
        this.b = i5;
        this.c = context;
        this.f4581a = (C3491g4) i5.f3354a;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        C3927l3 c3927l3 = this.d;
        C3491g4 c3491g4 = this.f4581a;
        if (c3927l3.J(c3491g4) != null) {
            c3927l3.J(c3491g4).onAdFailedToLoad(loadAdError);
        }
        c3927l3.T(c3491g4);
        c3927l3.Q(loadAdError.getCode());
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(AppOpenAd appOpenAd) {
        Tm0 tm0 = new Tm0(appOpenAd);
        C3927l3 c3927l3 = this.d;
        C3491g4 c3491g4 = this.f4581a;
        if (c3927l3.J(c3491g4) != null) {
            c3927l3.J(c3491g4).onAdLoaded(tm0);
        }
        c3927l3.T(c3491g4);
        InterfaceC5085yB interfaceC5085yB = c3927l3.g;
        if (interfaceC5085yB != null) {
            interfaceC5085yB.b(tm0);
        }
        c3927l3.g = null;
        if (this.b.c) {
            return;
        }
        c3927l3.I(this.c.getApplicationContext(), tm0, AbstractC3661i1.d);
    }
}
