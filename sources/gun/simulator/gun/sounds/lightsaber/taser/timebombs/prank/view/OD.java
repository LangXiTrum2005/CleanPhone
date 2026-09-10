package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: loaded from: classes4.dex */
public final class OD extends AbstractC4203o9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OD(Context context, String str, C3573h1 c3573h1) {
        super(context, str, c3573h1);
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(c3573h1, "adConfig");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8
    public QD constructAdInternal$vungle_ads_release(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        return new QD(context);
    }

    public /* synthetic */ OD(Context context, String str, C3573h1 c3573h1, int i, AbstractC2471Hm abstractC2471Hm) {
        this(context, str, (i & 4) != 0 ? new C3573h1() : c3573h1);
    }
}
