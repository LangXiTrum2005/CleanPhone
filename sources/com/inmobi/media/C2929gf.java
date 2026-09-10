package com.inmobi.media;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.inmobi.media.core.config.models.SignalsConfig;
import p002kotlin.Pair;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: renamed from: com.inmobi.media.gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2929gf extends AbstractC3040l2 {
    public final C2877ef b;
    public final C3097n9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2929gf(SignalsConfig.NovatiqConfig mConfig, C2877ef data, C3097n9 c3097n9) {
        super(mConfig.getBeaconUrl());
        Intrinsics.checkNotNullParameter(mConfig, "mConfig");
        Intrinsics.checkNotNullParameter(data, "data");
        this.b = data;
        this.c = c3097n9;
    }

    public final Je a() {
        C3097n9 c3097n9 = this.c;
        if (c3097n9 != null) {
            C2877ef c2877ef = this.b;
            c3097n9.a("Novatiq", "preparing Novatiq request with data - hyperId - " + c2877ef.a + " - sspHost - " + c2877ef.b + " - pubId - inmobi");
        }
        String str = this.a;
        Pair pairAttabal = formularize.attabal("sptoken", this.b.a);
        this.b.getClass();
        Pair pairAttabal2 = formularize.attabal("sspid", "i6i");
        Pair pairAttabal3 = formularize.attabal("ssphost", this.b.b);
        this.b.getClass();
        return new Je(str, null, null, seminary.impassible(pairAttabal, pairAttabal2, pairAttabal3, formularize.attabal(FacebookMediationAdapter.PLACEMENT_PARAMETER, "inmobi")), null, false, 54);
    }
}
