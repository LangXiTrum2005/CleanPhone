package ads_mobile_sdk;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import complexometry.formularize;
import java.util.Optional;
import liquory.beachfront;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.gnosis;
import saneness.laky;
import saneness.portwide;

/* JADX INFO: loaded from: classes.dex */
public final class h4 implements portwide {
    public final amphitheatre a;
    public final formularize b;
    public final Optional c;
    public final lf2 d;
    public final Context e;
    public final yf2 f;
    public final boolean g;
    public final jk0 h;
    public final long i;
    public final boolean j;

    public h4(amphitheatre clock, formularize adRequest, Optional bannerRequest, lf2 requestConfigurationWrapper, Context context, yf2 requestType, boolean z, jk0 flags, long j, boolean z2) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(bannerRequest, "bannerRequest");
        Intrinsics.checkNotNullParameter(requestConfigurationWrapper, "requestConfigurationWrapper");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.a = clock;
        this.b = adRequest;
        this.c = bannerRequest;
        this.d = requestConfigurationWrapper;
        this.e = context;
        this.f = requestType;
        this.g = z;
        this.h = flags;
        this.i = j;
        this.j = z2;
    }

    @Override // saneness.portwide
    public final to0 a() {
        return to0.AD_REQUEST;
    }

    @Override // saneness.portwide
    public final Object c(wretchedly.dern dernVar) {
        RequestConfiguration requestConfigurationA = this.d.a();
        laky lakyVar = ip0.f;
        boolean zCompetently = (gnosis.attabal() && this.b.getGoogleExtrasBundle().getBoolean("_emulatorLiveAds", false)) ? false : requestConfigurationA.competently(this.e);
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        formularize formularizeVar = this.b;
        RequestConfiguration.TagForChildDirectedTreatment tagForChildDirectedTreatment = requestConfigurationA.getTagForChildDirectedTreatment();
        RequestConfiguration.TagForUnderAgeOfConsent tagForUnderAgeOfConsent = requestConfigurationA.getTagForUnderAgeOfConsent();
        RequestConfiguration.MaxAdContentRating maxAdContentRating = requestConfigurationA.getMaxAdContentRating();
        yf2 yf2Var = this.f;
        int value = requestConfigurationA.getPublisherPrivacyPersonalizationState().getValue();
        beachfront beachfrontVar = (beachfront) monocoque.attabal.saneness(this.c);
        return new tn0(new g4(formularizeVar, jElapsedRealtime, tagForChildDirectedTreatment, tagForUnderAgeOfConsent, maxAdContentRating, zCompetently, yf2Var, value, beachfrontVar != null ? beachfrontVar.getManualImpressionRequested() : false, this.g, this.h, jElapsedRealtime - this.i, this.j));
    }
}
