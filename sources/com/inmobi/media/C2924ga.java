package com.inmobi.media;

import java.io.IOException;
import okhttp3.Protocol;
import okhttp3.adultoid;
import okhttp3.cuirassed;
import okhttp3.dovishness;
import okhttp3.stratoscope;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2924ga implements adultoid {
    public static final C2924ga a = new C2924ga();

    @Override // okhttp3.adultoid
    public final cuirassed intercept(adultoid.attabal chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        EnumC2765a6 enumC2765a6A = Re.a();
        if (enumC2765a6A != null) {
            new cuirassed.attabal().molybdenite(chain.request()).monoploid(Protocol.HTTP_1_1).competently(enumC2765a6A.a).triweekly(enumC2765a6A.toString()).saneness(stratoscope.create((dovishness) null, "")).dern();
        }
        cuirassed cuirassedVarAttabal = chain.attabal(chain.request());
        Intrinsics.checkNotNullExpressionValue(cuirassedVarAttabal, "proceed(...)");
        return cuirassedVarAttabal;
    }
}
