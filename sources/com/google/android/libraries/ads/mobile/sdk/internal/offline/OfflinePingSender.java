package com.google.android.libraries.ads.mobile.sdk.internal.offline;

import ads_mobile_sdk.au1;
import ads_mobile_sdk.en0;
import ads_mobile_sdk.eu1;
import ads_mobile_sdk.i60;
import ads_mobile_sdk.ju1;
import ads_mobile_sdk.l90;
import ads_mobile_sdk.ms;
import ads_mobile_sdk.ns;
import ads_mobile_sdk.xt1;
import ads_mobile_sdk.yt1;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.preterite;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import p002kotlin.time.dern;
import p002kotlin.time.saneness;
import saneness.terni;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/android/libraries/ads/mobile/sdk/internal/offline/OfflinePingSender;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ads-mobile-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class OfflinePingSender extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflinePingSender(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.attabal attabal() {
        try {
            terni.f37333attabal.getClass();
            au1 au1Var = (au1) ((i60) ((terni) en0.c.getValue())).t2.get();
            au1Var.getClass();
            cutely.wireman(au1Var.a, null, null, new xt1(au1Var, new yt1(au1Var, null), null), 3, null);
        } catch (Exception unused) {
            int iImpromptu = getInputData().impromptu("OFFLINE_DATABASE_VERSION", 1);
            long jCutely = getInputData().cutely("HTTP_CLIENT_TIMEOUT", 20L);
            String strApical = getInputData().apical("USER_AGENT");
            if (strApical == null) {
                ListenableWorker.attabal attabalVarAttabal = ListenableWorker.attabal.attabal();
                Intrinsics.checkNotNullExpressionValue(attabalVarAttabal, "failure(...)");
                return attabalVarAttabal;
            }
            ns nsVar = new ns();
            saran saranVarAttabal = privatdozent.attabal(preterite.dern(nsVar.c));
            saneness.Companion companion = saneness.INSTANCE;
            dern.graveside(jCutely, DurationUnit.MILLISECONDS);
            ms msVar = nsVar.c;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            eu1 eu1Var = new eu1(msVar, strApical, applicationContext);
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            applicationContext2.getClass();
            Integer numValueOf = Integer.valueOf(iImpromptu);
            ju1 ju1Var = new ju1(strApical);
            Long lValueOf = Long.valueOf(jCutely);
            saranVarAttabal.getClass();
            au1 au1Var2 = (au1) new l90(applicationContext2, numValueOf, lValueOf, ju1Var, eu1Var, saranVarAttabal).g.get();
            au1Var2.getClass();
            cutely.wireman(au1Var2.a, null, null, new xt1(au1Var2, new yt1(au1Var2, null), null), 3, null);
        }
        ListenableWorker.attabal attabalVarDern = ListenableWorker.attabal.dern();
        Intrinsics.checkNotNullExpressionValue(attabalVarDern, "success(...)");
        return attabalVarDern;
    }
}
