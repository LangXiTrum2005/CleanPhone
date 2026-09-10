package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u6 extends ch {
    public static final a m = new a(null);

    public static final class a {
        public a() {
        }

        public final u6 a(fh name, String message) {
            Intrinsics.f(name, "name");
            Intrinsics.f(message, "message");
            return new u6(name, message, null, null, null, 28, null);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(fh name, String message, String adType, String location, Mediation mediation) {
        super(name, message, adType, location, mediation, ch.b.ERROR, null, false, false, 0L, 0.0f, ch.a.HIGH, 1984, null);
        Intrinsics.f(name, "name");
        Intrinsics.f(message, "message");
        Intrinsics.f(adType, "adType");
        Intrinsics.f(location, "location");
    }

    public static final u6 a(fh fhVar, String str) {
        return m.a(fhVar, str);
    }

    public /* synthetic */ u6(fh fhVar, String str, String str2, String str3, Mediation mediation, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fhVar, str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? null : mediation);
    }
}
