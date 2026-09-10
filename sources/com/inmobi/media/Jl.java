package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Jl {
    public static final int a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            List listSplit$default = StringsKt.split$default(str, new String[]{":", "."}, false, 4, 2, null);
            int i = Integer.parseInt((String) listSplit$default.get(0));
            int i2 = Integer.parseInt((String) listSplit$default.get(1));
            return (((i2 * 60) + (i * 3600) + Integer.parseInt((String) listSplit$default.get(2))) * 1000) + (listSplit$default.size() == 4 ? Integer.parseInt((String) listSplit$default.get(3)) : 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final List a(String trackerType, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(trackerType, "trackerType");
        if (arrayList == null) {
            return adultoid.formularize();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (Intrinsics.wireman(((C3301ve) obj).b, trackerType)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(dovishness.gintrap(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C3301ve) it.next()).a);
        }
        return arrayList3;
    }
}
