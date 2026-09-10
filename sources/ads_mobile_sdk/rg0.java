package ads_mobile_sdk;

import android.os.Bundle;
import complexometry.formularize;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.sclerosis;
import saneness.spatterdash;

/* JADX INFO: loaded from: classes.dex */
public final class rg0 implements spatterdash, sclerosis {
    public final formularize a;
    public final wg0 b;
    public final h1 c;
    public final saran d;

    public rg0(formularize baseRequest, wg0 firebaseAnalyticsAdapter, h1 adConfiguration, saran backgroundScope) {
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(firebaseAnalyticsAdapter, "firebaseAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.a = baseRequest;
        this.b = firebaseAnalyticsAdapter;
        this.c = adConfiguration;
        this.d = backgroundScope;
    }

    @Override // saneness.spatterdash
    public final Object a(boolean z, wretchedly.dern dernVar) {
        String adUnitId = this.a.getAdUnitId();
        if (adUnitId == null) {
            return Unit.f29295attabal;
        }
        saran saranVar = this.d;
        pg0 block = new pg0(this, adUnitId, z, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        return Unit.f29295attabal;
    }

    @Override // saneness.sclerosis
    public final Unit a(scarbroite.attabal attabalVar, wretchedly.dern dernVar) {
        Object objA = this.b.a("generateEventId");
        String string = objA != null ? objA.toString() : null;
        if (string == null) {
            return Unit.f29295attabal;
        }
        String adUnitId = this.a.getAdUnitId();
        if (adUnitId == null) {
            return Unit.f29295attabal;
        }
        Bundle bundleAttabal = claque.wireman.attabal(patroclinal.formularize.attabal("_ai", adUnitId), patroclinal.formularize.attabal("reward_type", attabalVar.getType()), patroclinal.formularize.attabal("reward_value", igo.attabal.wireman(attabalVar.getAmount())));
        Bundle bundle = this.c.q;
        tg0 tg0Var = tg0.b;
        bundle.putBundle("_ar", bundleAttabal);
        saran saranVar = this.d;
        qg0 block = new qg0(this, bundle, string, null);
        EmptyCoroutineContext context = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(saranVar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        cutely.wireman(saranVar, context, null, new x13(block, null), 2, null);
        return Unit.f29295attabal;
    }
}
