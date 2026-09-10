package vn;

import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import ti.b;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvn/a;", "Lti/b;", "Lxi/n;", "<init>", "()V", "flutter_timezone_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements b, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f52721a;

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        p pVar = new p(binding.f50789c, "flutter_timezone");
        this.f52721a = pVar;
        pVar.b(this);
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        p pVar = this.f52721a;
        if (pVar != null) {
            pVar.b(null);
        } else {
            kotlin.jvm.internal.n.l("channel");
            throw null;
        }
    }

    @Override // xi.n
    public final void onMethodCall(m call, o oVar) {
        kotlin.jvm.internal.n.f(call, "call");
        String str = call.f53822a;
        if (kotlin.jvm.internal.n.a(str, "getLocalTimezone")) {
            String id2 = ZoneId.systemDefault().getId();
            kotlin.jvm.internal.n.c(id2);
            ((j) oVar).a(id2);
        } else {
            if (!kotlin.jvm.internal.n.a(str, "getAvailableTimezones")) {
                ((j) oVar).c();
                return;
            }
            Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
            kotlin.jvm.internal.n.e(availableZoneIds, "getAvailableZoneIds(...)");
            ArrayList arrayList = new ArrayList();
            xj.n.L0(availableZoneIds, arrayList);
            ((j) oVar).a(arrayList);
        }
    }
}
