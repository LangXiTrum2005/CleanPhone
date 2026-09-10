package ads_mobile_sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import igo.beachfront;
import kotlinx.coroutines.kowloon;
import kotlinx.coroutines.saran;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.graveside;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.conclusively;
import saneness.naming;

/* JADX INFO: loaded from: classes.dex */
public final class nj2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ pj2 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ Bundle f;
    public final /* synthetic */ liquory.attabal g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj2(Bundle bundle, Bundle bundle2, liquory.attabal attabalVar, pj2 pj2Var, String str, String str2, wretchedly.dern dernVar) {
        super(2, dernVar);
        this.b = pj2Var;
        this.c = str;
        this.d = str2;
        this.e = bundle;
        this.f = bundle2;
        this.g = attabalVar;
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final wretchedly.dern create(Object obj, wretchedly.dern dernVar) {
        return new nj2(this.e, this.f, this.g, this.b, this.c, this.d, dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nj2) create((saran) obj, (wretchedly.dern) obj2)).invokeSuspend(Unit.f29295attabal);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kowloon kowloonVar;
        AdFormat adFormat;
        AdSize adSize;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p002kotlin.dern.saneness(obj);
            return obj;
        }
        p002kotlin.dern.saneness(obj);
        pj2 pj2Var = this.b;
        String str = this.c;
        String adType = this.d;
        Bundle requestExtras = this.e;
        Bundle serverExtras = this.f;
        liquory.attabal attabalVar = this.g;
        this.a = 1;
        conclusively conclusivelyVarAttabal = naming.attabal(pj2Var.e, str, true, false, null, 12);
        kowloon kowloonVar2 = new kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(this), 1);
        kowloonVar2.kattegat();
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        pj2Var.b.getClass();
        long jGraveside = p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
        if (conclusivelyVarAttabal == null || !(conclusivelyVarAttabal instanceof ij2)) {
            kowloonVar = kowloonVar2;
            Result.Companion companion2 = Result.INSTANCE;
            kowloonVar.resumeWith(Result.m3351constructorimpl(new RtbAdapterData(str, null, null, "Adapter failed to instantiate.", igo.attabal.wireman(1), 78)));
        } else {
            ij2 ij2Var = (ij2) conclusivelyVarAttabal;
            j13.a().a.c.e = ij2Var.a.getVersionInfo().toString();
            uj2 callback = new uj2(str, ij2Var, jGraveside, pj2Var.b, kowloonVar2);
            kowloonVar = kowloonVar2;
            Context context = pj2Var.d.b();
            if (context == null) {
                context = pj2Var.a;
            }
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(adType, "adType");
            Intrinsics.checkNotNullParameter(requestExtras, "requestExtras");
            Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
            Intrinsics.checkNotNullParameter(callback, "callback");
            RtbAdapter rtbAdapter = ij2Var.b;
            switch (adType) {
                case "banner":
                    adFormat = AdFormat.BANNER;
                    break;
                case "native":
                    adFormat = AdFormat.NATIVE;
                    break;
                case "rewarded":
                    adFormat = AdFormat.REWARDED;
                    break;
                case "interstitial":
                    adFormat = AdFormat.INTERSTITIAL;
                    break;
                case "app_open":
                    adFormat = AdFormat.APP_OPEN_AD;
                    break;
                case "app_open_ad":
                    adFormat = AdFormat.APP_OPEN_AD;
                    break;
                case "rewarded_interstitial":
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    break;
                default:
                    adFormat = AdFormat.UNKNOWN;
                    break;
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, serverExtras);
            if (attabalVar != null) {
                int width = attabalVar.getWidth();
                int height = attabalVar.getHeight();
                String formatString = attabalVar.getFormatString();
                boolean isAnchoredAdaptiveBanner = attabalVar.getIsAnchoredAdaptiveBanner();
                boolean isInlineAdaptiveBanner = attabalVar.getIsInlineAdaptiveBanner();
                int height2 = attabalVar.getHeight();
                Intrinsics.checkNotNullParameter(formatString, "formatString");
                adSize = new AdSize(width, height, formatString, isAnchoredAdaptiveBanner, isInlineAdaptiveBanner, height2);
            } else {
                adSize = null;
            }
            rtbAdapter.collectSignals(new RtbSignalData(context, graveside.marial(mediationConfiguration), requestExtras, adSize), callback);
        }
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            beachfront.dern(this);
        }
        return objCuirassed == objBeachfront ? objBeachfront : objCuirassed;
    }
}
