package ads_mobile_sdk;

import android.os.Bundle;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.gson.JsonObject;
import com.ironsource.X3;
import complexometry.competently;
import complexometry.formularize;
import java.util.Map;
import kotlinx.coroutines.flow.marial;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Pair;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.coffeecake;
import saneness.sensatory;
import saneness.spartacist;

/* JADX INFO: loaded from: classes.dex */
public final class id2 extends qc2 {
    public final sensatory m;
    public final boolean n;
    public final gy0 o;
    public final d6 p;

    /* JADX WARN: Illegal instructions before constructor call */
    public id2(sensatory recursiveAdLoader, l13 traceMetaSet, formularize baseRequest, yf2 requestType, long j, int i, h1 adConfiguration, ur commonConfiguration, jm2 serverTransaction, String renderId, boolean z, gy0 inspectorAdLifecycleMonitor, d6 adSourceResponseInfoCollector, coffeecake placementIdWrapperProvider) {
        Intrinsics.checkNotNullParameter(recursiveAdLoader, "recursiveAdLoader");
        Intrinsics.checkNotNullParameter(traceMetaSet, "traceMetaSet");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(commonConfiguration, "commonConfiguration");
        Intrinsics.checkNotNullParameter(serverTransaction, "serverTransaction");
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        Intrinsics.checkNotNullParameter(inspectorAdLifecycleMonitor, "inspectorAdLifecycleMonitor");
        Intrinsics.checkNotNullParameter(adSourceResponseInfoCollector, "adSourceResponseInfoCollector");
        Intrinsics.checkNotNullParameter(placementIdWrapperProvider, "placementIdWrapperProvider");
        Object obj = placementIdWrapperProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        super(traceMetaSet, baseRequest, requestType, j, i, adConfiguration, commonConfiguration, serverTransaction, renderId, (a22) obj);
        this.m = recursiveAdLoader;
        this.n = z;
        this.o = inspectorAdLifecycleMonitor;
        this.p = adSourceResponseInfoCollector;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // ads_mobile_sdk.l1
    public final Object a(boolean z, wretchedly.dern dernVar) {
        hd2 hd2Var;
        if (dernVar instanceof hd2) {
            hd2Var = (hd2) dernVar;
            int i = hd2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hd2Var.c = i - Integer.MIN_VALUE;
            } else {
                hd2Var = new hd2(this, dernVar);
            }
        } else {
            hd2Var = new hd2(this, dernVar);
        }
        hd2 hd2Var2 = hd2Var;
        Object objA = hd2Var2.a;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = hd2Var2.c;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            JsonObject jsonObject = this.f.c;
            Intrinsics.checkNotNullParameter(jsonObject, "<this>");
            Intrinsics.checkNotNullParameter(FacebookMediationAdapter.PLACEMENT_PARAMETER, X3.i.W);
            String asString = jsonObject.get(FacebookMediationAdapter.PLACEMENT_PARAMETER).getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
            Intrinsics.checkNotNullParameter(asString, "<set-?>");
            this.k = asString;
            f();
            Bundle googleExtrasBundle = e();
            Intrinsics.checkNotNullParameter(googleExtrasBundle, "googleExtrasBundle");
            Map mapStratoscope = seminary.stratoscope(this.b.impassible());
            mapStratoscope.put("com.google.ads.mediation.admob.AdMobAdapter", googleExtrasBundle);
            sensatory sensatoryVar = this.m;
            competently competentlyVarA = a(googleExtrasBundle, mapStratoscope);
            yf2 yf2Var = this.c;
            l13 l13Var = this.a;
            boolean z2 = this.n;
            rc2 rc2Var = this.l;
            gy0 gy0Var = this.o;
            d6 d6Var = this.p;
            hd2Var2.c = 1;
            objA = ((di2) sensatoryVar).a(competentlyVarA, yf2Var, l13Var, z2, rc2Var, gy0Var, d6Var, hd2Var2);
            if (objA == objBeachfront) {
                return objBeachfront;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(objA);
        }
        spartacist spartacistVar = (spartacist) ((Pair) objA).component1();
        if (spartacistVar instanceof tn0) {
            return new tn0(marial.gintrap(spartacistVar));
        }
        if (spartacistVar instanceof nn0) {
            return spartacistVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
