package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f23170b;

    public q0(Object obj) {
        this.f23169a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f23170b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f23170b) {
            throw new NoSuchElementException();
        }
        this.f23170b = true;
        return this.f23169a;
    }
}
