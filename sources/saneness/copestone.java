package saneness;

import ads_mobile_sdk.kn0;
import ads_mobile_sdk.l13;
import ads_mobile_sdk.no0;
import ads_mobile_sdk.o12;
import java.util.UUID;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class copestone {
    public static void attabal(no0 cuiName, UUID rootTraceId) {
        Intrinsics.checkNotNullParameter(cuiName, "cuiName");
        Intrinsics.checkNotNullParameter(rootTraceId, "rootTraceId");
        com.google.common.base.triweekly triweeklyVar = kn0.a;
        kn0.b("Trace " + cuiName.name() + " started.", null);
    }

    public static void dern(String label, int i) {
        Intrinsics.checkNotNullParameter(label, "label");
        com.google.common.base.triweekly triweeklyVar = kn0.a;
        kn0.b(i + ": " + label, null);
    }

    public static void saneness(o12 perTraceMeta, l13 unused) {
        Intrinsics.checkNotNullParameter(perTraceMeta, "perTraceMeta");
        Intrinsics.checkNotNullParameter(unused, "unused");
        String str = perTraceMeta.m ? "successfully" : "unsuccessfully";
        com.google.common.base.triweekly triweeklyVar = kn0.a;
        kn0.b("Trace " + perTraceMeta.c.name() + " completed " + str + " in " + p002kotlin.time.saneness.adultoid(perTraceMeta.c()) + "ms.", null);
    }
}
