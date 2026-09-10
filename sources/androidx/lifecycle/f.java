package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4552a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4554c;

    public f(DefaultLifecycleObserver defaultLifecycleObserver, t tVar) {
        kotlin.jvm.internal.n.f(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f4553b = defaultLifecycleObserver;
        this.f4554c = tVar;
    }

    @Override // androidx.lifecycle.t
    public final void onStateChanged(v vVar, m mVar) {
        switch (this.f4552a) {
            case 0:
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f4553b;
                switch (e.f4540a[mVar.ordinal()]) {
                    case 1:
                        defaultLifecycleObserver.a(vVar);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(vVar);
                        break;
                    case 3:
                        defaultLifecycleObserver.d(vVar);
                        break;
                    case 4:
                        defaultLifecycleObserver.h(vVar);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(vVar);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(vVar);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                t tVar = (t) this.f4554c;
                if (tVar != null) {
                    tVar.onStateChanged(vVar, mVar);
                    return;
                }
                return;
            case 1:
                if (mVar == m.ON_START) {
                    ((o) this.f4553b).b(this);
                    ((j4.e) this.f4554c).d();
                    return;
                }
                return;
            default:
                HashMap map = ((b) this.f4554c).f4525a;
                List list = (List) map.get(mVar);
                Object obj = this.f4553b;
                b.a(list, vVar, mVar, obj);
                b.a((List) map.get(m.ON_ANY), vVar, mVar, obj);
                return;
        }
    }

    public f(u uVar) {
        this.f4553b = uVar;
        d dVar = d.f4533c;
        Class<?> cls = uVar.getClass();
        b bVar = (b) dVar.f4534a.get(cls);
        this.f4554c = bVar == null ? dVar.a(cls, null) : bVar;
    }

    public f(o oVar, j4.e eVar) {
        this.f4553b = oVar;
        this.f4554c = eVar;
    }
}
