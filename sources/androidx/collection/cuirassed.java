package androidx.collection;

import p002kotlin.Metadata;

/* JADX INFO: compiled from: FloatSet.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/collection/cuirassed;", "Landroidx/collection/taiyuan;", "", "initialCapacity", "<init>", "(I)V", "", "competently", "capacity", "beachfront", "marial", "()V", "wireman", "I", "growthLimit", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class cuirassed extends taiyuan {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public int growthLimit;

    public cuirassed(int i) {
        super(null);
        if (!(i >= 0)) {
            molybdenite.wireman.attabal("Capacity must be a positive value.");
        }
        competently(peridotite.beachfront(i));
    }

    public final void beachfront(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = peridotite.f5721attabal;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            p002kotlin.collections.arytenoidectomy.adultoid(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i = capacity >> 3;
        long j = 255 << ((capacity & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        marial();
    }

    public final void competently(int initialCapacity) {
        int iMax = initialCapacity > 0 ? Math.max(7, peridotite.marial(initialCapacity)) : 0;
        this._capacity = iMax;
        beachfront(iMax);
        this.elements = new float[iMax];
    }

    public final void marial() {
        this.growthLimit = peridotite.saneness(get_capacity()) - this._size;
    }
}
