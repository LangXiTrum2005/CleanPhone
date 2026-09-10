package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3374yc implements B2 {
    public final Mc a;
    public final Function0 b;

    public C3374yc(Mc nativeBeaconMacroData, Function0 getBeacons) {
        Intrinsics.checkNotNullParameter(nativeBeaconMacroData, "nativeBeaconMacroData");
        Intrinsics.checkNotNullParameter(getBeacons, "getBeacons");
        this.a = nativeBeaconMacroData;
        this.b = getBeacons;
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 beaconExtras) {
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        boolean z = beaconExtras instanceof Fo;
        List listUnconsolidated = CollectionsKt.unconsolidated((Collection) this.b.invoke(), z ? ((Fo) beaconExtras).b : adultoid.formularize());
        if (listUnconsolidated.isEmpty()) {
            return;
        }
        Map mapTaiyuan = z ? ((Fo) beaconExtras).a : seminary.taiyuan();
        Iterator it = listUnconsolidated.iterator();
        while (it.hasNext()) {
            String url = Oc.a((String) it.next(), this.a, mapTaiyuan);
            C3315w3 c3315w3 = C3315w3.a;
            Intrinsics.checkNotNullParameter(url, "url");
            C3315w3.a(url, false, null);
        }
    }
}
