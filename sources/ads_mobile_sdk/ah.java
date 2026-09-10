package ads_mobile_sdk;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;

/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public final amphitheatre a;
    public final Object b;
    public final Object c;
    public final AtomicInteger d;
    public final AtomicInteger e;
    public final AtomicInteger f;
    public Long g;
    public int h;
    public final LinkedHashMap i;
    public final LinkedHashMap j;

    public ah(amphitheatre clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = clock;
        this.b = new Object();
        this.c = new Object();
        this.d = new AtomicInteger(-1);
        this.e = new AtomicInteger(-1);
        this.f = new AtomicInteger(-1);
        new AtomicInteger(0);
        this.i = new LinkedHashMap();
        this.j = new LinkedHashMap();
    }

    public final hv0 a(Set requestTypes, String str) {
        Intrinsics.checkNotNullParameter(requestTypes, "requestTypes");
        synchronized (this.c) {
            int i = this.h;
            this.h = i + 1;
            if (requestTypes.isEmpty()) {
                return new hv0(Integer.valueOf(i), null, null);
            }
            String strPreterite = CollectionsKt.preterite(CollectionsKt.vesuvio(requestTypes), ",", null, null, 0, null, null, 62, null);
            Integer num = (Integer) this.i.get(strPreterite);
            int iIntValue = num != null ? num.intValue() : 0;
            this.i.put(strPreterite, Integer.valueOf(iIntValue + 1));
            if (str == null) {
                return new hv0(Integer.valueOf(i), Integer.valueOf(iIntValue), null);
            }
            String str2 = str + "|" + strPreterite;
            Integer num2 = (Integer) this.j.get(str2);
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            this.j.put(str2, Integer.valueOf(iIntValue2 + 1));
            return new hv0(Integer.valueOf(i), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
        }
    }
}
