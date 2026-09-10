package com.smartdigimkt.c0;

import android.util.Log;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b<K, V> extends a<K, V> {
    private static final int f = 16;
    private static final int g = 16777216;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f34016c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<V> f34017e = Collections.synchronizedList(new LinkedList());
    private final AtomicInteger d = new AtomicInteger();

    public b(int i2) {
        this.f34016c = i2;
        if (i2 > 16777216) {
            Log.w(com.smartdigimkt.q0.b.O, String.format("You set too large memory cache size (more than %1$d Mb)", 16));
        }
    }

    public int b() {
        return this.f34016c;
    }

    public abstract int b(V v);

    public abstract V c();

    @Override // com.smartdigimkt.c0.a, com.smartdigimkt.c0.e
    public void clear() {
        this.f34017e.clear();
        this.d.set(0);
        super.clear();
    }

    @Override // com.smartdigimkt.c0.a, com.smartdigimkt.c0.e
    public boolean put(K k, V v) {
        boolean z2;
        int iB = b(v);
        int iB2 = b();
        int iAddAndGet = this.d.get();
        if (iB < iB2) {
            while (iAddAndGet + iB > iB2) {
                V vC = c();
                if (this.f34017e.remove(vC)) {
                    iAddAndGet = this.d.addAndGet(-b(vC));
                }
            }
            this.f34017e.add(v);
            this.d.addAndGet(iB);
            z2 = true;
        } else {
            z2 = false;
        }
        super.put(k, v);
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.smartdigimkt.c0.a, com.smartdigimkt.c0.e
    public void remove(K k) {
        Object obj = super.get(k);
        if (obj != null && this.f34017e.remove(obj)) {
            this.d.addAndGet(-b(obj));
        }
        super.remove(k);
    }
}
