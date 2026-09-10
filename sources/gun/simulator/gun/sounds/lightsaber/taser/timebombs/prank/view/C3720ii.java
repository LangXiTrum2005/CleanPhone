package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3720ii implements InterfaceC5060xx {
    public static final C3720ii INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C3720ii c3720ii = new C3720ii();
        INSTANCE = c3720ii;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.ConfigPayload", c3720ii, 19);
        c3348eV.j("reuse_assets", true);
        c3348eV.j("config", true);
        c3348eV.j("endpoints", true);
        c3348eV.j("log_metrics", true);
        c3348eV.j("placements", true);
        c3348eV.j(com.umeng.analytics.pro.ay.m, true);
        c3348eV.j("viewability", true);
        c3348eV.j("config_extension", true);
        c3348eV.j("disable_ad_id", true);
        c3348eV.j("ri_enabled", true);
        c3348eV.j("session_timeout", true);
        c3348eV.j("wait_for_connectivity_for_tpat", true);
        c3348eV.j("sdk_session_timeout", true);
        c3348eV.j("cacheable_assets_required", true);
        c3348eV.j("signals_disabled", true);
        c3348eV.j("fpd_enabled", true);
        c3348eV.j("rta_debugging", true);
        c3348eV.j("config_last_validated_ts", true);
        c3348eV.j("auto_redirect", true);
        descriptor = c3348eV;
    }

    private C3720ii() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        InterfaceC4123nG interfaceC4123nGU = WD.u(C4071mi.INSTANCE);
        InterfaceC4123nG interfaceC4123nGU2 = WD.u(C4423qi.INSTANCE);
        InterfaceC4123nG interfaceC4123nGU3 = WD.u(C4686ti.INSTANCE);
        InterfaceC4123nG interfaceC4123nGU4 = WD.u(C2389Ei.INSTANCE);
        InterfaceC4123nG interfaceC4123nGU5 = WD.u(new T5(C4488rU.INSTANCE, 0));
        InterfaceC4123nG interfaceC4123nGU6 = WD.u(C2467Hi.INSTANCE);
        InterfaceC4123nG interfaceC4123nGU7 = WD.u(C2545Ki.INSTANCE);
        InterfaceC4123nG interfaceC4123nGU8 = WD.u(W90.f3912a);
        C3969lb c3969lb = C3969lb.f4651a;
        InterfaceC4123nG interfaceC4123nGU9 = WD.u(c3969lb);
        InterfaceC4123nG interfaceC4123nGU10 = WD.u(c3969lb);
        AD ad = AD.f2808a;
        return new InterfaceC4123nG[]{interfaceC4123nGU, interfaceC4123nGU2, interfaceC4123nGU3, interfaceC4123nGU4, interfaceC4123nGU5, interfaceC4123nGU6, interfaceC4123nGU7, interfaceC4123nGU8, interfaceC4123nGU9, interfaceC4123nGU10, WD.u(ad), WD.u(c3969lb), WD.u(ad), WD.u(c3969lb), WD.u(c3969lb), WD.u(c3969lb), WD.u(c3969lb), WD.u(FJ.f3064a), WD.u(C3807ji.INSTANCE)};
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 7321. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2622Ni deserialize(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl r47) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3720ii.deserialize(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kl):gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ni");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C2622Ni c2622Ni) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c2622Ni, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C2622Ni.write$Self(c2622Ni, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
