package z4;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.applovin.impl.da;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import wj.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f54641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f54642b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f54643c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f54644d = new LinkedHashMap();

    public d(WindowLayoutComponent windowLayoutComponent) {
        this.f54641a = windowLayoutComponent;
    }

    @Override // y4.a
    public final void a(com.applovin.impl.sdk.ad.d dVar) {
        LinkedHashMap linkedHashMap = this.f54643c;
        LinkedHashMap linkedHashMap2 = this.f54644d;
        ReentrantLock reentrantLock = this.f54642b;
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
                    this.f54641a.removeWindowLayoutInfoListener(fVar);
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
        LinkedHashMap linkedHashMap = this.f54643c;
        ReentrantLock reentrantLock = this.f54642b;
        reentrantLock.lock();
        try {
            f fVar = (f) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f54644d;
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
                this.f54641a.addWindowLayoutInfoListener(context, fVar2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
