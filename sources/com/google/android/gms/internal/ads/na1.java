package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class na1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final na1 f17728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ na1[] f17729b;

    static {
        na1 na1Var = new na1("INSTANCE", 0);
        f17728a = na1Var;
        f17729b = new na1[]{na1Var};
    }

    public static na1[] values() {
        return (na1[]) f17729b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        ps1.d0("no calls to next() since the last call to remove()", false);
    }
}
