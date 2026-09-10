package com.inmobi.media;

import java.util.ArrayList;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.cord;

/* JADX INFO: loaded from: classes3.dex */
public final class Ml {
    public final Mc a;
    public final Ll b;

    public Ml(C3034kl vastBeaconData, C2811c0 adLifecycleData, C2937gn responseBeaconData) {
        int iA;
        Intrinsics.checkNotNullParameter(vastBeaconData, "vastBeaconData");
        Intrinsics.checkNotNullParameter(adLifecycleData, "adLifecycleData");
        Intrinsics.checkNotNullParameter(responseBeaconData, "responseBeaconData");
        this.a = new Mc(adLifecycleData, vastBeaconData.a, vastBeaconData.b);
        ArrayList arrayList = vastBeaconData.d;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C3301ve c3301ve = (C3301ve) obj;
            if (!(c3301ve instanceof O5)) {
                String type = c3301ve.b;
                Intrinsics.checkNotNullParameter(type, "type");
                if (!Intrinsics.wireman(type, "Impression") && !Intrinsics.wireman(type, "click")) {
                    arrayList2.add(obj);
                }
            }
        }
        ArrayList arrayList3 = vastBeaconData.d;
        ArrayList<O5> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (obj2 instanceof O5) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList(dovishness.gintrap(arrayList4, 10));
        for (O5 o5 : arrayList4) {
            int i = vastBeaconData.c;
            Intrinsics.checkNotNullParameter(o5, "<this>");
            int i2 = 0;
            if (p002kotlin.text.dovishness.cuirassed(o5.c, "%", false, 2, null)) {
                try {
                    i2 = Integer.parseInt(cord.tailoring(o5.c, 1));
                } catch (Exception unused) {
                }
                iA = (i * i2) / 100;
            } else {
                iA = Jl.a(o5.c);
            }
            arrayList5.add(new M5(o5.a, iA));
        }
        this.b = new Ll(this.a, new Nl(responseBeaconData, arrayList2, arrayList5));
    }
}
