package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.Releasable;
import java.io.Closeable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public interface DataBuffer<T> extends Iterable<T>, Releasable, Closeable {
    void close();

    T get(int i2);

    int getCount();

    Bundle getMetadata();

    @Deprecated
    boolean isClosed();

    @Override // java.lang.Iterable
    Iterator<T> iterator();

    void release();

    Iterator<T> singleRefIterator();
}
