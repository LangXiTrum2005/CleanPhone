package z4;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.n;
import x4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements l0.a, Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54645a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f54647c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f54646b = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f54648d = new LinkedHashSet();

    public f(Context context) {
        this.f54645a = context;
    }

    @Override // l0.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void accept(WindowLayoutInfo value) {
        n.f(value, "value");
        ReentrantLock reentrantLock = this.f54646b;
        reentrantLock.lock();
        try {
            this.f54647c = e.b(this.f54645a, value);
            Iterator it = this.f54648d.iterator();
            while (it.hasNext()) {
                ((l0.a) it.next()).accept(this.f54647c);
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void b(com.applovin.impl.sdk.ad.d dVar) {
        ReentrantLock reentrantLock = this.f54646b;
        reentrantLock.lock();
        try {
            i iVar = this.f54647c;
            if (iVar != null) {
                dVar.accept(iVar);
            }
            this.f54648d.add(dVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
