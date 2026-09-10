package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;

/* JADX INFO: loaded from: classes3.dex */
public final class FlagSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f18903a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f18904a = new SparseBooleanArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18905b;

        public final void a(int i2) {
            Assertions.d(!this.f18905b);
            this.f18904a.append(i2, true);
        }

        public final FlagSet b() {
            Assertions.d(!this.f18905b);
            this.f18905b = true;
            return new FlagSet(this.f18904a);
        }
    }

    public FlagSet(SparseBooleanArray sparseBooleanArray) {
        this.f18903a = sparseBooleanArray;
    }

    public final int a(int i2) {
        SparseBooleanArray sparseBooleanArray = this.f18903a;
        Assertions.c(i2, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagSet)) {
            return false;
        }
        FlagSet flagSet = (FlagSet) obj;
        int i2 = Util.f18979a;
        SparseBooleanArray sparseBooleanArray = this.f18903a;
        if (i2 >= 24) {
            return sparseBooleanArray.equals(flagSet.f18903a);
        }
        if (sparseBooleanArray.size() != flagSet.f18903a.size()) {
            return false;
        }
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            if (a(i3) != flagSet.a(i3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i2 = Util.f18979a;
        SparseBooleanArray sparseBooleanArray = this.f18903a;
        if (i2 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            size = (size * 31) + a(i3);
        }
        return size;
    }
}
