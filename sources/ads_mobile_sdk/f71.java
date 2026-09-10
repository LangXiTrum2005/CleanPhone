package ads_mobile_sdk;

import android.os.SystemClock;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.amphitheatre;
import saneness.coffeecake;
import saneness.coi;

/* JADX INFO: loaded from: classes.dex */
public final class f71 implements coi {
    public final coffeecake a;

    public f71(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        amphitheatre clock = (amphitheatre) this.a.get();
        Intrinsics.checkNotNullParameter(clock, "clock");
        clock.getClass();
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
