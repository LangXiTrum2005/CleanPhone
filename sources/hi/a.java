package hi;

import android.app.Activity;
import android.content.Context;
import cn.d0;
import com.applovin.sdk.AppLovinEventTypes;
import ea.f2;
import fc.f;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import hn.d;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lhi/a;", "Lti/b;", "Lui/a;", "<init>", "()V", "share_plus_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements ti.b, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f42354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f42355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f42356c;

    @Override // ui.a
    public final void onAttachedToActivity(ui.b binding) {
        n.f(binding, "binding");
        b bVar = this.f42355b;
        if (bVar == null) {
            n.l("manager");
            throw null;
        }
        f fVar = (f) binding;
        fVar.b(bVar);
        f fVar2 = this.f42354a;
        if (fVar2 != null) {
            fVar2.f40781c = (Activity) fVar.f40780b;
        } else {
            n.l(AppLovinEventTypes.USER_SHARED_LINK);
            throw null;
        }
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        n.f(binding, "binding");
        this.f42356c = new p(binding.f50789c, "dev.fluttercommunity.plus/share");
        Context context = binding.f50787a;
        n.e(context, "getApplicationContext(...)");
        b bVar = new b();
        bVar.f42358b = new AtomicBoolean(true);
        this.f42355b = bVar;
        f fVar = new f(context, bVar);
        this.f42354a = fVar;
        b bVar2 = this.f42355b;
        if (bVar2 == null) {
            n.l("manager");
            throw null;
        }
        f2 f2Var = new f2(fVar, bVar2);
        p pVar = this.f42356c;
        if (pVar != null) {
            pVar.b(f2Var);
        } else {
            n.l("methodChannel");
            throw null;
        }
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        f fVar = this.f42354a;
        if (fVar != null) {
            fVar.f40781c = null;
        } else {
            n.l(AppLovinEventTypes.USER_SHARED_LINK);
            throw null;
        }
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        n.f(binding, "binding");
        p pVar = this.f42356c;
        if (pVar == null) {
            n.l("methodChannel");
            throw null;
        }
        pVar.b(null);
        f fVar = this.f42354a;
        if (fVar != null) {
            d0.j((d) fVar.f40783e);
        } else {
            n.l(AppLovinEventTypes.USER_SHARED_LINK);
            throw null;
        }
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b binding) {
        n.f(binding, "binding");
        onAttachedToActivity(binding);
    }
}
