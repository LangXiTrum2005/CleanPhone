package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class da extends ch {
    public static final a m = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(fh name, String message, String adType, String location, Mediation mediation, ug trackAd) {
        super(name, message, adType, location, mediation, ch.b.INFO, trackAd, false, false, 0L, 0.0f, ch.a.LOW, 1920, null);
        Intrinsics.f(name, "name");
        Intrinsics.f(message, "message");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(location, "location");
        Intrinsics.f(trackAd, "trackAd");
        if (n()) {
            a(ch.a.HIGH);
            a(true);
        }
    }

    public final boolean n() {
        fh fhVarF = f();
        return fhVarF == fh.a.FINISH_SUCCESS || fhVarF == fh.a.FINISH_FAILURE || fhVarF == fh.i.FINISH_SUCCESS || fhVarF == fh.i.FINISH_FAILURE;
    }

    public /* synthetic */ da(fh fhVar, String str, String str2, String str3, Mediation mediation, ug ugVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fhVar, str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : mediation, (i2 & 32) != 0 ? new ug(null, null, null, null, null, null, null, null, 255, null) : ugVar);
    }
}
