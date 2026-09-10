package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h5 extends ch {
    public static final a m = new a(null);

    public static final class a {
        public a() {
        }

        public final h5 a(fh name, String message) {
            Intrinsics.f(name, "name");
            Intrinsics.f(message, "message");
            return new h5(name, message, null, null, null, null, 60, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h5 a(fh name, String message, String adType, String location) {
            Intrinsics.f(name, "name");
            Intrinsics.f(message, "message");
            Intrinsics.f(adType, "adType");
            Intrinsics.f(location, "location");
            return new h5(name, message, adType, location, null, null, 48, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(fh name, String message, String adType, String location, Mediation mediation, ug trackAd) {
        super(name, message, adType, location, mediation, ch.b.CRITICAL, trackAd, false, false, 0L, 0.0f, ch.a.HIGH, 1920, null);
        Intrinsics.f(name, "name");
        Intrinsics.f(message, "message");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(location, "location");
        Intrinsics.f(trackAd, "trackAd");
    }

    public static final h5 a(fh fhVar, String str) {
        return m.a(fhVar, str);
    }

    public static final h5 a(fh fhVar, String str, String str2, String str3) {
        return m.a(fhVar, str, str2, str3);
    }

    public /* synthetic */ h5(fh fhVar, String str, String str2, String str3, Mediation mediation, ug ugVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fhVar, str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : mediation, (i2 & 32) != 0 ? new ug(null, null, null, null, null, null, null, null, 255, null) : ugVar);
    }
}
