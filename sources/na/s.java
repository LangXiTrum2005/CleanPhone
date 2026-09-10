package na;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s implements r, Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f46644a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f46645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile transient boolean f46646c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object f46647d;

    public s(r rVar) {
        rVar.getClass();
        this.f46645b = rVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f46644a = new Object();
    }

    @Override // na.r
    public final Object get() {
        if (!this.f46646c) {
            synchronized (this.f46644a) {
                try {
                    if (!this.f46646c) {
                        Object obj = this.f46645b.get();
                        this.f46647d = obj;
                        this.f46646c = true;
                        return obj;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f46647d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder("Suppliers.memoize(");
        if (this.f46646c) {
            obj = "<supplier that returned " + this.f46647d + ">";
        } else {
            obj = this.f46645b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
