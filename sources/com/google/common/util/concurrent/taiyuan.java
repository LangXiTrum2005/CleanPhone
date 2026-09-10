package com.google.common.util.concurrent;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: CollectionFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class taiyuan<V, C> extends AggregateFuture<V, C> {

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    @CheckForNull
    public List<saneness<V>> f22049trm;

    /* JADX INFO: compiled from: CollectionFuture.java */
    public static final class attabal<V> extends taiyuan<V, List<V>> {
        public attabal(ImmutableCollection<? extends adultoid<? extends V>> immutableCollection, boolean z) {
            super(immutableCollection, z);
            splinterproof();
        }

        @Override // com.google.common.util.concurrent.taiyuan
        /* JADX INFO: renamed from: cultivated, reason: merged with bridge method [inline-methods] */
        public List<V> permissivist(List<saneness<V>> list) {
            ArrayList arrayListCutely = Lists.cutely(list.size());
            Iterator<saneness<V>> it = list.iterator();
            while (it.hasNext()) {
                saneness<V> next = it.next();
                arrayListCutely.add(next != null ? next.value : null);
            }
            return Collections.unmodifiableList(arrayListCutely);
        }
    }

    /* JADX INFO: compiled from: CollectionFuture.java */
    public static final class saneness<V> {
        final V value;

        public saneness(V v) {
            this.value = v;
        }
    }

    public taiyuan(ImmutableCollection<? extends adultoid<? extends V>> immutableCollection, boolean z) {
        super(immutableCollection, z, true);
        List<saneness<V>> listCutely = immutableCollection.isEmpty() ? Collections.EMPTY_LIST : Lists.cutely(immutableCollection.size());
        for (int i = 0; i < immutableCollection.size(); i++) {
            listCutely.add(null);
        }
        this.f22049trm = listCutely;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public void dent(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.dent(releaseResourcesReason);
        this.f22049trm = null;
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void peridotite() {
        List<saneness<V>> list = this.f22049trm;
        if (list != null) {
            trm(permissivist(list));
        }
    }

    public abstract C permissivist(List<saneness<V>> list);

    @Override // com.google.common.util.concurrent.AggregateFuture
    public final void starveling(int i, V v) {
        List<saneness<V>> list = this.f22049trm;
        if (list != null) {
            list.set(i, new saneness<>(v));
        }
    }
}
