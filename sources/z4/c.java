package z4;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import com.applovin.impl.da;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.d0;
import wj.r;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f54635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final el.c f54636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReentrantLock f54637c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f54638d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f54639e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f54640f = new LinkedHashMap();

    public c(WindowLayoutComponent windowLayoutComponent, el.c cVar) {
        this.f54635a = windowLayoutComponent;
        this.f54636b = cVar;
    }

    @Override // y4.a
    public final void a(com.applovin.impl.sdk.ad.d dVar) {
        LinkedHashMap linkedHashMap = this.f54638d;
        LinkedHashMap linkedHashMap2 = this.f54639e;
        ReentrantLock reentrantLock = this.f54637c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(dVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            f fVar = (f) linkedHashMap.get(context);
            if (fVar == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = fVar.f54648d;
            ReentrantLock reentrantLock2 = fVar.f54646b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(dVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(dVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    u4.d dVar2 = (u4.d) this.f54640f.remove(fVar);
                    if (dVar2 != null) {
                        dVar2.f51885a.invoke(dVar2.f51886b, dVar2.f51887c);
                    }
                }
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock2.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @Override // y4.a
    public final void b(Context context, da daVar, com.applovin.impl.sdk.ad.d dVar) {
        r rVar;
        LinkedHashMap linkedHashMap = this.f54638d;
        ReentrantLock reentrantLock = this.f54637c;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f54639e;
            if (fVar != null) {
                fVar.b(dVar);
                linkedHashMap2.put(dVar, context);
                rVar = r.f53297a;
            } else {
                rVar = null;
            }
            if (rVar == null) {
                f fVar2 = new f(context);
                linkedHashMap.put(context, fVar2);
                linkedHashMap2.put(dVar, context);
                fVar2.b(dVar);
                if (!(context instanceof Activity)) {
                    fVar2.accept(new WindowLayoutInfo(v.f53866a));
                } else {
                    this.f54640f.put(fVar2, this.f54636b.a(this.f54635a, d0.f44761a.b(WindowLayoutInfo.class), (Activity) context, new b(1, fVar2, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
