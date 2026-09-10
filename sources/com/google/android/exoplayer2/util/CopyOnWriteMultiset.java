package com.google.android.exoplayer2.util;

import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    public final Object X = new Object();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final HashMap f18900Y = new HashMap();
    public Set Z = Collections.EMPTY_SET;
    public List e0 = Collections.EMPTY_LIST;

    public final int a(DrmSessionEventListener.EventDispatcher eventDispatcher) {
        int iIntValue;
        synchronized (this.X) {
            try {
                iIntValue = this.f18900Y.containsKey(eventDispatcher) ? ((Integer) this.f18900Y.get(eventDispatcher)).intValue() : 0;
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
