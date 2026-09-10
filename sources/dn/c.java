package dn;

import cn.e2;
import cn.p0;
import java.util.LinkedHashMap;
import s0.x0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f38966c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f38964a = i10;
        this.f38965b = obj;
        this.f38966c = obj2;
    }

    @Override // cn.p0
    public final void dispose() {
        switch (this.f38964a) {
            case 0:
                e eVar = (e) this.f38965b;
                eVar.f38970b.removeCallbacks((e2) this.f38966c);
                return;
            default:
                String str = (String) this.f38965b;
                a4.b bVar = (a4.b) this.f38966c;
                synchronized (x0.f49949b) {
                    LinkedHashMap linkedHashMap = x0.f49950c;
                    x0 x0Var = (x0) linkedHashMap.get(str);
                    if (x0Var != null) {
                        x0Var.f49951a.remove(bVar);
                        if (x0Var.f49951a.isEmpty()) {
                            linkedHashMap.remove(str);
                            x0Var.stopWatching();
                        }
                    }
                    break;
                }
                return;
        }
    }
}
