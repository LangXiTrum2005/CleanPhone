package ads_mobile_sdk;

import com.ironsource.X3;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.coffeecake;
import saneness.coi;
import saneness.juju;

/* JADX INFO: loaded from: classes.dex */
public final class gu1 implements coi {
    public final coffeecake a;

    public gu1(coffeecake coffeecakeVar) {
        this.a = coffeecakeVar;
    }

    @Override // saneness.adultoid
    public final Object get() {
        jk0 flags = (jk0) this.a.get();
        Intrinsics.checkNotNullParameter(flags, "flags");
        flags.getClass();
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return Long.valueOf(p002kotlin.time.saneness.adultoid(((p002kotlin.time.saneness) flags.a("gads:http_url_connection_factory:timeout_millis", juju.attabal(20, DurationUnit.SECONDS, "gads:http_url_connection_factory:timeout_millis", X3.i.W), zk.j)).getRawValue()));
    }
}
