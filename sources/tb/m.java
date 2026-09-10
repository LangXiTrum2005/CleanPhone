package tb;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements tc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f50704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f50705b;

    @Override // tc.b
    public final Object get() {
        if (this.f50705b == null) {
            synchronized (this) {
                try {
                    if (this.f50705b == null) {
                        this.f50705b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f50704a.iterator();
                                while (it.hasNext()) {
                                    this.f50705b.add(((tc.b) it.next()).get());
                                }
                                this.f50704a = null;
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return Collections.unmodifiableSet(this.f50705b);
    }
}
