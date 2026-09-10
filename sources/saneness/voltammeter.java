package saneness;

import ads_mobile_sdk.bm0;
import ads_mobile_sdk.cr;
import ads_mobile_sdk.gq0;
import ads_mobile_sdk.po0;
import androidx.p000activity.ComponentActivity;
import java.util.Map;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class voltammeter implements hemolysin {
    @Override // saneness.hemolysin
    public final Object a(gq0 gq0Var, Map map, wretchedly.dern dernVar) {
        libya libyaVar = gq0Var.m;
        if (libyaVar != null) {
            cr closeReason = cr.CUSTOM;
            bm0 bm0Var = (bm0) libyaVar;
            Intrinsics.checkNotNullParameter(closeReason, "closeReason");
            bm0Var.t = closeReason;
            ComponentActivity componentActivity = bm0Var.l;
            if (componentActivity != null) {
                componentActivity.finish();
            }
        }
        return Unit.f29295attabal;
    }

    @Override // saneness.hemolysin
    public final po0 b() {
        return po0.GMSG_CLOSE;
    }
}
