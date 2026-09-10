package androidx.media3.common.util;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    public final Object X = new Object();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final HashMap f5634Y = new HashMap();
    public Set Z = Collections.EMPTY_SET;
    public List e0 = Collections.EMPTY_LIST;

    public final int a(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int iIntValue;
        synchronized (this.X) {
            try {
                iIntValue = this.f5634Y.containsKey(eventDispatcher) ? ((Integer) this.f5634Y.get(eventDispatcher)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator<E> it;
        synchronized (this.X) {
            it = this.e0.iterator();
        }
        return it;
    }
}
