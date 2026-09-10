package ads_mobile_sdk;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.blighty;
import saneness.coffeecake;
import saneness.hobby;
import saneness.juju;

/* JADX INFO: loaded from: classes.dex */
public final class n13 extends bf2 {
    public LinkedHashMap k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n13(coffeecake consentManagerProvider, hobby httpClient, jk0 flags, blighty userAgentProvider) {
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
            try {
                Iterator it = this.j.iterator();
                int length = 0;
                while (it.hasNext()) {
                    length += ((p13) it.next()).b.length;
                }
                jk0 jk0Var = this.c;
                jk0Var.getClass();
                Intrinsics.checkNotNullParameter("gads:cui_buffer_size", X3.i.W);
                z = length >= ((Number) jk0Var.a("gads:cui_buffer_size", 1000, zk.f)).intValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // ads_mobile_sdk.bf2
    public final long b() {
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
        return ((p002kotlin.time.saneness) jk0Var.a("gads:cui_monitoring_interval_ms", juju.attabal(5, DurationUnit.MINUTES, "gads:cui_monitoring_interval_ms", X3.i.W), zk.j)).getRawValue();
    }

    @Override // ads_mobile_sdk.bf2
    public final Object a(wretchedly.dern dernVar) {
        Object objMarial = privatdozent.marial(new m13(this, null), dernVar);
        return objMarial == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objMarial : Unit.f29295attabal;
    }
}
