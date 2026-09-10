package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.vungle.ads.internal.network.VungleApiClient;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3015ai implements InterfaceC2565Lc {
    final /* synthetic */ Context $context;
    final /* synthetic */ C5115yc0 $initRequestToResponseMetric;
    final /* synthetic */ InterfaceC2766Sw $onComplete;

    public C3015ai(C5115yc0 c5115yc0, Context context, InterfaceC2766Sw interfaceC2766Sw) {
        this.$initRequestToResponseMetric = c5115yc0;
        this.$context = context;
        this.$onComplete = interfaceC2766Sw;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2565Lc
    public void onFailure(InterfaceC2435Gc interfaceC2435Gc, Throwable th) {
        this.$initRequestToResponseMetric.markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.$initRequestToResponseMetric, (C4126nJ) null, VungleApiClient.Companion.getBASE_URL$vungle_ads_release(), 2, (Object) null);
        StringBuilder sb = new StringBuilder("Error while fetching config: ");
        sb.append(th != null ? th.getMessage() : null);
        new CR(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
        this.$onComplete.invoke(Boolean.FALSE);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2565Lc
    public void onResponse(InterfaceC2435Gc interfaceC2435Gc, C5109yZ c5109yZ) {
        this.$initRequestToResponseMetric.markEnd();
        C2961a4.logMetric$vungle_ads_release$default(C2961a4.INSTANCE, this.$initRequestToResponseMetric, (C4126nJ) null, VungleApiClient.Companion.getBASE_URL$vungle_ads_release(), 2, (Object) null);
        if (c5109yZ != null && c5109yZ.isSuccessful() && c5109yZ.body() != null) {
            C3457fi.INSTANCE.initWithConfig$vungle_ads_release(this.$context, (C2622Ni) c5109yZ.body(), false, new C3586h70(B30.CONFIG_LOADED_FROM_INIT));
            this.$onComplete.invoke(Boolean.TRUE);
        } else {
            StringBuilder sb = new StringBuilder("config API: ");
            sb.append(c5109yZ != null ? Integer.valueOf(c5109yZ.code()) : null);
            new C3041b(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
        }
    }
}
