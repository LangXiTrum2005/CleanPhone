package oa;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f47357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ z0[] f47358b;

    static {
        z0 z0Var = new z0("INSTANCE", 0);
        f47357a = z0Var;
        f47358b = new z0[]{z0Var};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) f47358b.clone();
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
        go.k.s("no calls to next() since the last call to remove()", false);
    }
}
