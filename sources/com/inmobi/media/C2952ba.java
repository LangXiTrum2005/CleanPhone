package com.inmobi.media;

import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2952ba extends N9 {
    public final C2935aa y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2952ba(C2935aa novatiqData, InterfaceC3333z5 interfaceC3333z5) {
        super(novatiqData.f23442c.getBeaconUrl(), interfaceC3333z5);
        Intrinsics.f(novatiqData, "novatiqData");
        this.y = novatiqData;
        this.t = false;
        this.f23014u = false;
        this.x = false;
    }

    @Override // com.inmobi.media.N9
    public final void f() {
        InterfaceC3333z5 interfaceC3333z5 = this.f23008e;
        if (interfaceC3333z5 != null) {
            this.y.getClass();
            ((A5) interfaceC3333z5).a("Novatiq", "preparing Novatiq request with data - hyperId - " + this.y.f23440a + " - sspHost - " + this.y.f23441b + " - pubId - inmobi");
        }
        super.f();
        HashMap map = this.j;
        if (map != null) {
            map.put("sptoken", this.y.f23440a);
        }
        HashMap map2 = this.j;
        if (map2 != null) {
            this.y.getClass();
            map2.put("sspid", "i6i");
        }
        HashMap map3 = this.j;
        if (map3 != null) {
            map3.put("ssphost", this.y.f23441b);
        }
        HashMap map4 = this.j;
        if (map4 != null) {
            this.y.getClass();
            map4.put(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "inmobi");
        }
    }
}
