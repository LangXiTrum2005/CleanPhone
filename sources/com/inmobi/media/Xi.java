package com.inmobi.media;

import android.location.LocationManager;
import com.google.android.gms.common.api.GoogleApiClient;
import p002kotlin.Unit;
import p002kotlin.coroutines.intrinsics.attabal;
import p002kotlin.coroutines.jvm.internal.SuspendLambda;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import wretchedly.dern;

/* JADX INFO: loaded from: classes3.dex */
public final class Xi extends SuspendLambda implements Function1 {
    public Xi(dern dernVar) {
        super(1, dernVar);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final dern create(dern dernVar) {
        return new Xi(dernVar);
    }

    @Override // p002kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Xi((dern) obj).invokeSuspend(Unit.f29295attabal);
    }

    @Override // p002kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        attabal.beachfront();
        p002kotlin.dern.saneness(obj);
        Intrinsics.checkNotNullExpressionValue(Yi.b, "access$getTAG$p(...)");
        C3074mb c3074mb = C3074mb.a;
        if (C3074mb.d()) {
            LocationManager locationManager = C3074mb.b;
            if (locationManager != null) {
                locationManager.removeUpdates(c3074mb);
            }
            GoogleApiClient googleApiClient = C3074mb.d;
            if (googleApiClient != null) {
                googleApiClient.disconnect();
            }
        }
        C3074mb.d = null;
        return Unit.f29295attabal;
    }
}
