package p002kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: KotlinTypeRefiner.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final stratoscope<triweekly<adultoid>> f31722attabal = new stratoscope<>("KotlinTypeRefiner");

    public static final stratoscope<triweekly<adultoid>> attabal() {
        return f31722attabal;
    }

    public static final List<oilcan> saneness(beachfront beachfrontVar, Iterable<? extends oilcan> types) {
        Intrinsics.checkNotNullParameter(beachfrontVar, "<this>");
        Intrinsics.checkNotNullParameter(types, "types");
        ArrayList arrayList = new ArrayList(dovishness.gintrap(types, 10));
        Iterator<? extends oilcan> it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(beachfrontVar.attabal(it.next()));
        }
        return arrayList;
    }
}
