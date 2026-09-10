package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mc implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Inflater f23737a = new Inflater(true);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23737a.end();
    }
}
