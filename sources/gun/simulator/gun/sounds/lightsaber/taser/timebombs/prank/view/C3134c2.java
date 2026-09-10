package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3134c2 implements InterfaceC5060xx {
    public static final C3134c2 INSTANCE;
    public static final /* synthetic */ D40 descriptor;

    static {
        C3134c2 c3134c2 = new C3134c2();
        INSTANCE = c3134c2;
        C3348eV c3348eV = new C3348eV("com.vungle.ads.internal.model.AdPayload.AdUnit", c3134c2, 25);
        c3348eV.j("id", true);
        c3348eV.j("ad_type", true);
        c3348eV.j("ad_source", true);
        c3348eV.j("expiry", true);
        c3348eV.j("deeplink_url", true);
        c3348eV.j("click_coordinates_enabled", true);
        c3348eV.j("ad_load_optimization", true);
        c3348eV.j("template_heartbeat_check", true);
        c3348eV.j("info", true);
        c3348eV.j("sleep", true);
        c3348eV.j("error_code", true);
        c3348eV.j("tpat", true);
        c3348eV.j("vm_url", true);
        c3348eV.j("ad_market_id", true);
        c3348eV.j("notification", true);
        c3348eV.j("load_ad", true);
        c3348eV.j("viewability", true);
        c3348eV.j("template_url", true);
        c3348eV.j("template_type", true);
        c3348eV.j("template_settings", true);
        c3348eV.j(CampaignEx.JSON_KEY_CREATIVE_ID, true);
        c3348eV.j("app_id", true);
        c3348eV.j("show_close", true);
        c3348eV.j("show_close_incentivized", true);
        c3348eV.j("ad_size", true);
        descriptor = c3348eV;
    }

    private C3134c2() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] childSerializers() {
        W90 w90 = W90.f3912a;
        InterfaceC4123nG interfaceC4123nGU = WD.u(w90);
        InterfaceC4123nG interfaceC4123nGU2 = WD.u(w90);
        InterfaceC4123nG interfaceC4123nGU3 = WD.u(w90);
        AD ad = AD.f2808a;
        InterfaceC4123nG interfaceC4123nGU4 = WD.u(ad);
        InterfaceC4123nG interfaceC4123nGU5 = WD.u(w90);
        C3969lb c3969lb = C3969lb.f4651a;
        return new InterfaceC4123nG[]{interfaceC4123nGU, interfaceC4123nGU2, interfaceC4123nGU3, interfaceC4123nGU4, interfaceC4123nGU5, WD.u(c3969lb), WD.u(c3969lb), WD.u(c3969lb), WD.u(w90), WD.u(ad), WD.u(ad), WD.u(C4277p2.INSTANCE), WD.u(w90), WD.u(w90), WD.u(new T5(w90, 0)), WD.u(new T5(w90, 0)), WD.u(C4365q2.INSTANCE), WD.u(w90), WD.u(w90), WD.u(C4013m2.INSTANCE), WD.u(w90), WD.u(w90), WD.u(ad), WD.u(ad), WD.u(Z1.INSTANCE)};
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 13701. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3311e2 deserialize(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2548Kl r60) {
        /*
            Method dump skipped, instruction units count: 1370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3134c2.deserialize(gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kl):gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.e2");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2369Do
    public D40 getDescriptor() {
        return descriptor;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4123nG
    public void serialize(InterfaceC3385er interfaceC3385er, C3311e2 c3311e2) {
        AbstractC2995aW.q(interfaceC3385er, "encoder");
        AbstractC2995aW.q(c3311e2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        D40 descriptor2 = getDescriptor();
        InterfaceC4596sh interfaceC4596shC = interfaceC3385er.c(descriptor2);
        C3311e2.write$Self(c3311e2, interfaceC4596shC, descriptor2);
        interfaceC4596shC.b(descriptor2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5060xx
    public InterfaceC4123nG[] typeParametersSerializers() {
        return WD.h;
    }
}
