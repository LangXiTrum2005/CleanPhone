package com.bumptech.glide.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: LruCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class impromptu<T, Y> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<T, attabal<Y>> f17936attabal = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public long f17937dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long f17938saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public long f17939wireman;

    /* JADX INFO: compiled from: LruCache.java */
    public static final class attabal<Y> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f17940attabal;
        final Y value;

        public attabal(Y y, int i) {
            this.value = y;
            this.f17940attabal = i;
        }
    }

    public impromptu(long j) {
        this.f17938saneness = j;
        this.f17937dern = j;
    }

    public synchronized Y apical(T t, Y y) {
        int iTaiyuan = taiyuan(y);
        long j = iTaiyuan;
        if (j >= this.f17937dern) {
            cutely(t, y);
            return null;
        }
        if (y != null) {
            this.f17939wireman += j;
        }
        attabal<Y> attabalVarPut = this.f17936attabal.put(t, y == null ? null : new attabal<>(y, iTaiyuan));
        if (attabalVarPut != null) {
            this.f17939wireman -= (long) attabalVarPut.f17940attabal;
            if (!attabalVarPut.value.equals(y)) {
                cutely(t, attabalVarPut.value);
            }
        }
        beachfront();
        return attabalVarPut != null ? attabalVarPut.value : null;
    }

    public final void beachfront() {
        impassible(this.f17937dern);
    }

    public synchronized Y competently(T t) {
        attabal<Y> attabalVar;
        attabalVar = this.f17936attabal.get(t);
        return attabalVar != null ? attabalVar.value : null;
    }

    public synchronized Y formularize(T t) {
        attabal<Y> attabalVarRemove = this.f17936attabal.remove(t);
        if (attabalVarRemove == null) {
            return null;
        }
        this.f17939wireman -= (long) attabalVarRemove.f17940attabal;
        return attabalVarRemove.value;
    }

    public synchronized void impassible(long j) {
        while (this.f17939wireman > j) {
            Iterator<Map.Entry<T, attabal<Y>>> it = this.f17936attabal.entrySet().iterator();
            Map.Entry<T, attabal<Y>> next = it.next();
            attabal<Y> value = next.getValue();
            this.f17939wireman -= (long) value.f17940attabal;
            T key = next.getKey();
            it.remove();
            cutely(key, value.value);
        }
    }

    public synchronized long impromptu() {
        return this.f17937dern;
    }

    public void saneness() {
        impassible(0L);
    }

    public int taiyuan(Y y) {
        return 1;
    }

    public void cutely(T t, Y y) {
    }
}
