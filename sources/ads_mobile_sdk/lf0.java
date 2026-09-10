package ads_mobile_sdk;

import com.ironsource.X3;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.blighty;
import saneness.coffeecake;
import saneness.hobby;
import saneness.juju;

/* JADX INFO: loaded from: classes.dex */
public final class lf0 extends bf2 {
    public long k;
    public long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf0(coffeecake consentManagerProvider, hobby httpClient, jk0 flags, blighty userAgentProvider) {
        super(consentManagerProvider, httpClient, flags, userAgentProvider);
        Intrinsics.checkNotNullParameter(consentManagerProvider, "consentManagerProvider");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(userAgentProvider, "userAgentProvider");
    }

    @Override // ads_mobile_sdk.bf2
    public final boolean a() {
        boolean z;
        synchronized (this) {
            int size = this.j.size();
            jk0 jk0Var = this.c;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:exception_buffer_size", X3.i.W);
            z = size >= ((Number) jk0Var.a("gads:exception_buffer_size", 1000, zk.f)).intValue();
        }
        return z;
    }

    @Override // ads_mobile_sdk.bf2
    public final long b() {
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) jk0Var.a("gads:exception_monitoring_interval_ms", juju.attabal(5, DurationUnit.MINUTES, "gads:exception_monitoring_interval_ms", X3.i.W), zk.j)).getRawValue();
    }

    @Override // ads_mobile_sdk.bf2
    public final Object a(wretchedly.dern dernVar) {
        Object objMarial = privatdozent.marial(new kf0(this, null), dernVar);
        return objMarial == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objMarial : Unit.f29295attabal;
    }
}
