package ads_mobile_sdk;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.cutely;
import kotlinx.coroutines.saran;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.time.DurationUnit;
import saneness.godward;
import saneness.hobby;
import saneness.juju;

/* JADX INFO: loaded from: classes.dex */
public final class e4 extends godward {
    public final jk0 c;
    public final hobby d;
    public final saran e;

    public e4(jk0 flags, hobby httpClient, saran backgroundScope) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        this.c = flags;
        this.d = httpClient;
        this.e = backgroundScope;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(e4 e4Var, wretchedly.dern dernVar) {
        d4 d4Var;
        if (dernVar instanceof d4) {
            d4Var = (d4) dernVar;
            int i = d4Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4Var.d = i - Integer.MIN_VALUE;
            } else {
                d4Var = new d4(e4Var, dernVar);
            }
        } else {
            d4Var = new d4(e4Var, dernVar);
        }
        Object obj = d4Var.b;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = d4Var.d;
        if (i2 == 0) {
            p002kotlin.dern.saneness(obj);
            jk0 jk0Var = e4Var.c;
            jk0Var.getClass();
            Intrinsics.checkNotNullParameter("gads:ad_request_http_client_enabled", X3.i.W);
            if (((Boolean) jk0Var.a("gads:ad_request_http_client_enabled", Boolean.TRUE, zk.b)).booleanValue()) {
                hobby hobbyVar = e4Var.d;
                jk0 jk0Var2 = e4Var.c;
                jk0Var2.getClass();
                Intrinsics.checkNotNullParameter("gads:ad_request_http_client_max_idle_connections", X3.i.W);
                int iIntValue = ((Number) jk0Var2.a("gads:ad_request_http_client_max_idle_connections", 5, zk.f)).intValue();
                jk0 jk0Var3 = e4Var.c;
                jk0Var3.getClass();
                p002kotlin.time.saneness.Companion companion = p002kotlin.time.saneness.INSTANCE;
                long jDovishness = p002kotlin.time.saneness.dovishness(((p002kotlin.time.saneness) jk0Var3.a("gads:ad_request_http_client_connection_pool_keep_alive_minutes", juju.attabal(5, DurationUnit.MINUTES, "gads:ad_request_http_client_connection_pool_keep_alive_minutes", X3.i.W), zk.m)).getRawValue());
                d4Var.a = e4Var;
                d4Var.d = 1;
                if (hobbyVar.a(iIntValue, jDovishness, d4Var) == objBeachfront) {
                    return objBeachfront;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e4Var = d4Var.a;
            p002kotlin.dern.saneness(obj);
        }
        jk0 jk0Var4 = e4Var.c;
        jk0Var4.getClass();
        Intrinsics.checkNotNullParameter("gads:preconnect_initialization_task_enabled", X3.i.W);
        if (((Boolean) jk0Var4.a("gads:preconnect_initialization_task_enabled", Boolean.TRUE, zk.b)).booleanValue()) {
            e4Var.b();
        }
        return new tn0(Unit.f29295attabal);
    }

    public final void b() {
        jk0 jk0Var = this.c;
        jk0Var.getClass();
        List defaultValue = adultoid.kowloon("https://googleads.g.doubleclick.net", "https://pubads.g.doubleclick.net");
        Intrinsics.checkNotNullParameter("gads:preconnect_urls", X3.i.W);
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Iterator it = ((List) jk0Var.a("gads:preconnect_urls", defaultValue, zk.g)).iterator();
        while (it.hasNext()) {
            cutely.wireman(this.e, null, null, new c4(this, (String) it.next(), null), 3, null);
        }
    }

    @Override // ads_mobile_sdk.ox0
    public final Object e(wretchedly.dern dernVar) {
        return a(this, dernVar);
    }
}
