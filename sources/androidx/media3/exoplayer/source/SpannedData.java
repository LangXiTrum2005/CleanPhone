package androidx.media3.exoplayer.source;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
final class SpannedData<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f6459c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f6458b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6457a = -1;

    public SpannedData(k kVar) {
        this.f6459c = kVar;
    }

    public final Object a(int i2) {
        SparseArray sparseArray;
        if (this.f6457a == -1) {
            this.f6457a = 0;
        }
        while (true) {
            int i3 = this.f6457a;
            sparseArray = this.f6458b;
            if (i3 <= 0 || i2 >= sparseArray.keyAt(i3)) {
                break;
            }
            this.f6457a--;
        }
        while (this.f6457a < sparseArray.size() - 1 && i2 >= sparseArray.keyAt(this.f6457a + 1)) {
            this.f6457a++;
        }
        return sparseArray.valueAt(this.f6457a);
    }
}
