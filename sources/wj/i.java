package wj;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements d, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f53287c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile jk.a f53288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f53289b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new b(getValue());
    }

    @Override // wj.d
    public final Object getValue() {
        Object obj = this.f53289b;
        o oVar = o.f53296a;
        if (obj != oVar) {
            return obj;
        }
        jk.a aVar = this.f53288a;
        if (aVar != null) {
            Object objInvoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f53287c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != oVar) {
                }
            }
            this.f53288a = null;
            return objInvoke;
        }
        return this.f53289b;
    }

    public final String toString() {
        return this.f53289b != o.f53296a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
