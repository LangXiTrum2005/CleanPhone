package com.startapp.sdk.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public final class di implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Throwable f40916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable[] f40917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f40918c;
    public boolean d;

    public di(Throwable th) {
        this.f40916a = th;
        this.f40917b = th.getSuppressed();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Throwable next() {
        int i2;
        Throwable th = this.f40916a;
        this.d = false;
        if (th != null) {
            this.f40916a = th.getCause();
        } else {
            Throwable[] thArr = this.f40917b;
            if (thArr != null && (i2 = this.f40918c) < thArr.length) {
                this.d = i2 == 0;
                this.f40918c = i2 + 1;
                th = thArr[i2];
            }
        }
        if (th != null) {
            return th;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f40916a != null) {
            return true;
        }
        Throwable[] thArr = this.f40917b;
        return thArr != null && this.f40918c < thArr.length;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
