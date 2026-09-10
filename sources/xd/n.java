package xd;

import android.util.Log;
import cn.d0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import ud.g1;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f53767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0.i f53768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f53769c;

    public n(ak.k backgroundDispatcher, g1 timeProvider, s0.i sessionConfigsDataStore) {
        kotlin.jvm.internal.n.f(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.n.f(timeProvider, "timeProvider");
        kotlin.jvm.internal.n.f(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f53767a = timeProvider;
        this.f53768b = sessionConfigsDataStore;
        this.f53769c = new AtomicReference();
        d0.w(d0.b(backgroundDispatcher), null, new l(this, null, 0), 3);
    }

    public final g a() throws Throwable {
        AtomicReference atomicReference = this.f53769c;
        if (atomicReference.get() == null) {
            Object objC = d0.C(ak.l.f3620a, new l(this, null, 1));
            while (!atomicReference.compareAndSet(null, objC) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        kotlin.jvm.internal.n.e(obj, "get(...)");
        return (g) obj;
    }

    public final boolean b() {
        Long l = a().f53752e;
        Integer num = a().f53751d;
        return l == null || num == null || this.f53767a.a().f52074c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(g gVar, ck.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i10 = mVar.f53766h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mVar.f53766h = i10 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object obj = mVar.f53764f;
        int i11 = mVar.f53766h;
        try {
            if (i11 == 0) {
                t9.e.z(obj);
                s0.i iVar = this.f53768b;
                sg.a aVar = new sg.a(gVar, null, 1);
                mVar.f53766h = 1;
                Object objA = iVar.a(aVar, mVar);
                bk.a aVar2 = bk.a.f5708a;
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t9.e.z(obj);
            }
        } catch (IOException e10) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e10);
        }
        return r.f53297a;
    }
}
