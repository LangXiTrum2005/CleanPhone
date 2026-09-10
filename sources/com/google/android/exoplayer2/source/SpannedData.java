package com.google.android.exoplayer2.source;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
final class SpannedData<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f18422c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f18421b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18420a = -1;

    public SpannedData(i iVar) {
        this.f18422c = iVar;
    }

    public final Object a(int i2) {
        SparseArray sparseArray;
        if (this.f18420a == -1) {
            this.f18420a = 0;
        }
        while (true) {
            int i3 = this.f18420a;
            sparseArray = this.f18421b;
            if (i3 <= 0 || i2 >= sparseArray.keyAt(i3)) {
                break;
            }
            this.f18420a--;
        }
        while (this.f18420a < sparseArray.size() - 1 && i2 >= sparseArray.keyAt(this.f18420a + 1)) {
            this.f18420a++;
        }
        return sparseArray.valueAt(this.f18420a);
    }
}
