package ethene;

import android.util.SparseArray;

/* JADX INFO: compiled from: SpannedData.java */
/* JADX INFO: loaded from: classes.dex */
public final class sealless<V> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final decarock.impromptu<V> f26067dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final SparseArray<V> f26068saneness = new SparseArray<>();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int f26066attabal = -1;

    public sealless(decarock.impromptu<V> impromptuVar) {
        this.f26067dern = impromptuVar;
    }

    public void attabal(int i, V v) {
        if (this.f26066attabal == -1) {
            decarock.attabal.competently(this.f26068saneness.size() == 0);
            this.f26066attabal = 0;
        }
        if (this.f26068saneness.size() > 0) {
            SparseArray<V> sparseArray = this.f26068saneness;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            decarock.attabal.attabal(i >= iKeyAt);
            if (iKeyAt == i) {
                decarock.impromptu<V> impromptuVar = this.f26067dern;
                SparseArray<V> sparseArray2 = this.f26068saneness;
                impromptuVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f26068saneness.append(i, v);
    }

    public V beachfront() {
        SparseArray<V> sparseArray = this.f26068saneness;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean competently() {
        return this.f26068saneness.size() == 0;
    }

    public void dern(int i) {
        for (int size = this.f26068saneness.size() - 1; size >= 0 && i < this.f26068saneness.keyAt(size); size--) {
            this.f26067dern.accept(this.f26068saneness.valueAt(size));
            this.f26068saneness.removeAt(size);
        }
        this.f26066attabal = this.f26068saneness.size() > 0 ? Math.min(this.f26066attabal, this.f26068saneness.size() - 1) : -1;
    }

    public V marial(int i) {
        if (this.f26066attabal == -1) {
            this.f26066attabal = 0;
        }
        while (true) {
            int i2 = this.f26066attabal;
            if (i2 <= 0 || i >= this.f26068saneness.keyAt(i2)) {
                break;
            }
            this.f26066attabal--;
        }
        while (this.f26066attabal < this.f26068saneness.size() - 1 && i >= this.f26068saneness.keyAt(this.f26066attabal + 1)) {
            this.f26066attabal++;
        }
        return this.f26068saneness.valueAt(this.f26066attabal);
    }

    public void saneness() {
        for (int i = 0; i < this.f26068saneness.size(); i++) {
            this.f26067dern.accept(this.f26068saneness.valueAt(i));
        }
        this.f26066attabal = -1;
        this.f26068saneness.clear();
    }

    public void wireman(int i) {
        int i2 = 0;
        while (i2 < this.f26068saneness.size() - 1) {
            int i3 = i2 + 1;
            if (i < this.f26068saneness.keyAt(i3)) {
                return;
            }
            this.f26067dern.accept(this.f26068saneness.valueAt(i2));
            this.f26068saneness.removeAt(i2);
            int i4 = this.f26066attabal;
            if (i4 > 0) {
                this.f26066attabal = i4 - 1;
            }
            i2 = i3;
        }
    }
}
