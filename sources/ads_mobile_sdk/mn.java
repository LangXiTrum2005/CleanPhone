package ads_mobile_sdk;

import android.os.SystemClock;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.amphitheatre;

/* JADX INFO: loaded from: classes.dex */
public abstract class mn {
    public final amphitheatre a;
    public final long b;

    public mn(amphitheatre clock, long j) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.a = clock;
        this.b = j;
    }

    public final boolean a() {
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        this.a.getClass();
        return p002kotlin.time.saneness.formularize(p002kotlin.time.dern.graveside(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), this.b) >= 0;
    }

    public /* synthetic */ mn(amphitheatre amphitheatreVar, long j, int i) {
        this(amphitheatreVar, j);
    }
}
