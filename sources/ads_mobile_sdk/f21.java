package ads_mobile_sdk;

import com.ironsource.X3;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.godward;

/* JADX INFO: loaded from: classes.dex */
public final class f21 extends godward {
    public final saran c;
    public final saran d;
    public final jk0 e;
    public final sn2 f;
    public final ri2 g;
    public final r11 h;

    public f21(saran backgroundScope, saran uiScope, jk0 flags, sn2 sharedSettingsDataStore, ri2 rootTraceCreator, r11 installReferrerClientProxy) {
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(sharedSettingsDataStore, "sharedSettingsDataStore");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        Intrinsics.checkNotNullParameter(installReferrerClientProxy, "installReferrerClientProxy");
        this.c = backgroundScope;
        this.d = uiScope;
        this.e = flags;
        this.f = sharedSettingsDataStore;
        this.g = rootTraceCreator;
        this.h = installReferrerClientProxy;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        c21 c21Var;
        f21 f21Var;
        if (dernVar instanceof c21) {
            c21Var = (c21) dernVar;
            int i = c21Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21Var.d = i - Integer.MIN_VALUE;
            } else {
                c21Var = new c21(this, dernVar);
            }
        } else {
            c21Var = new c21(this, dernVar);
        }
        Object objA = c21Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = c21Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            jk0 jk0Var = this.e;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:install_referrer_details:enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:install_referrer_details:enabled", Boolean.FALSE, zk.b)).booleanValue()) {
                sn2 sn2Var = this.f;
                c21Var.a = this;
                c21Var.d = 1;
                sn2Var.getClass();
                objA = sn2.a(sn2Var, c21Var);
                if (objA == objBeachfront) {
                    return objBeachfront;
                }
                f21Var = this;
            }
            return new tn0(Unit.f29295attabal);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f21Var = c21Var.a;
        p002kotlin.dern.saneness(objA);
        if (!((on2) objA).p()) {
            cutely.wireman(f21Var.d, null, null, new e21(f21Var, null), 3, null);
        }
        return new tn0(Unit.f29295attabal);
    }
}
