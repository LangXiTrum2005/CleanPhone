package com.inmobi.media;

import java.util.ArrayList;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.flow.marial;
import kotlinx.coroutines.flow.wireman;
import kotlinx.coroutines.monroe;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Xl implements wireman {
    public final /* synthetic */ C3135om a;

    public Xl(saran saranVar, C3135om c3135om) {
        this.a = c3135om;
    }

    @Override // kotlinx.coroutines.flow.wireman
    public final Object emit(Object obj, dern dernVar) {
        K3 k3;
        apical apicalVar;
        monroe monroeVarWireman;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C3097n9 c3097n9 = this.a.e;
        if (c3097n9 != null) {
            c3097n9.a("VideoExperienceManager", "attachWindowLifecycleObserver - window visibility changed: " + zBooleanValue);
        }
        if (zBooleanValue) {
            C3135om c3135om = this.a;
            C3097n9 c3097n10 = c3135om.e;
            if (c3097n10 != null) {
                c3097n10.a("VideoExperienceManager", "handleOnWindowVisible called - starting media player and setting up observers");
            }
            InterfaceC2874ec interfaceC2874ec = c3135om.h;
            if (interfaceC2874ec == null) {
                Intrinsics.preprohormone("mediaPlayer");
                interfaceC2874ec = null;
            }
            Sd sd = (Sd) interfaceC2874ec;
            C3161pn c3161pn = sd.k;
            c3161pn.d.set(true);
            C3328wg c3328wg = (C3328wg) c3161pn.i.d.getValue();
            c3328wg.b.setValue(Mn.HIDDEN);
            c3328wg.f.set(true);
            H6.a(c3328wg.e);
            c3328wg.e = null;
            C3328wg c3328wg2 = (C3328wg) c3161pn.i.d.getValue();
            c3328wg2.a();
            monroe monroeVarWireman2 = cutely.wireman(c3161pn.a, premeiotic.dern(), null, new C3111nn(new Vm(c3328wg2.b), null, c3161pn), 2, null);
            ArrayList activeJobs = c3161pn.e;
            Intrinsics.checkNotNullParameter(monroeVarWireman2, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(monroeVarWireman2);
            c3161pn.a();
            monroe monroeVarWireman3 = cutely.wireman(sd.a, null, null, new Ld(new Od(sd.m), null, sd), 3, null);
            ArrayList activeJobs2 = sd.d;
            Intrinsics.checkNotNullParameter(monroeVarWireman3, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs2, "activeJobs");
            activeJobs2.add(monroeVarWireman3);
            sd.j.b();
            C3097n9 c3097n11 = c3135om.e;
            if (c3097n11 != null) {
                c3097n11.a("VideoExperienceManager", "observeMediaEvents - setting up media event observers");
            }
            InterfaceC2874ec interfaceC2874ec2 = c3135om.h;
            if (interfaceC2874ec2 == null) {
                Intrinsics.preprohormone("mediaPlayer");
                interfaceC2874ec2 = null;
            }
            monroe monroeVarPreprohormone = marial.preprohormone(marial.stratoscope(new C2985im(marial.stratoscope(((Sd) interfaceC2874ec2).m, new C3010jm(c3135om, null))), new C3035km(c3135om, null)), c3135om.b);
            ArrayList activeJobs3 = c3135om.f;
            Intrinsics.checkNotNullParameter(monroeVarPreprohormone, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs3, "activeJobs");
            activeJobs3.add(monroeVarPreprohormone);
            P4.a(c3135om.b, new C3110nm(c3135om, null));
            if (!c3135om.c.b.isEmpty() && (k3 = c3135om.i) != null && (apicalVar = k3.d) != null && (monroeVarWireman = cutely.wireman(c3135om.b, null, null, new C2910fm(apicalVar, null, c3135om), 3, null)) != null) {
                ArrayList activeJobs4 = c3135om.f;
                Intrinsics.checkNotNullParameter(monroeVarWireman, "<this>");
                Intrinsics.checkNotNullParameter(activeJobs4, "activeJobs");
                activeJobs4.add(monroeVarWireman);
            }
        } else {
            this.a.b();
        }
        return Unit.f29295attabal;
    }
}
