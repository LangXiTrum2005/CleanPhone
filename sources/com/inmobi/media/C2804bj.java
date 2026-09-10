package com.inmobi.media;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.bj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2804bj implements B2 {
    public final Mc a;
    public final Function0 b;
    public final AtomicBoolean c;

    public C2804bj(Mc vastBeaconDataModel, Function0 getBeacons) {
        Intrinsics.checkNotNullParameter(vastBeaconDataModel, "vastBeaconDataModel");
        Intrinsics.checkNotNullParameter(getBeacons, "getBeacons");
        this.a = vastBeaconDataModel;
        this.b = getBeacons;
        this.c = new AtomicBoolean(false);
    }

    @Override // com.inmobi.media.B2
    public final void a(C2 c2) {
        Te beaconExtras = Te.a;
        Intrinsics.checkNotNullParameter(beaconExtras, "beaconExtras");
        if (this.c.getAndSet(true)) {
            return;
        }
        Map mapTaiyuan = seminary.taiyuan();
        List listUnconsolidated = CollectionsKt.unconsolidated((Collection) this.b.invoke(), adultoid.formularize());
        if (listUnconsolidated.isEmpty()) {
            return;
        }
        Iterator it = listUnconsolidated.iterator();
        while (it.hasNext()) {
            String url = Oc.a((String) it.next(), this.a, mapTaiyuan);
            C3315w3 c3315w3 = C3315w3.a;
            Intrinsics.checkNotNullParameter(url, "url");
            C3315w3.a(url, false, null);
        }
    }
}
