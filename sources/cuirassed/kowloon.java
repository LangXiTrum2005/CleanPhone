package cuirassed;

import com.ironsource.X3;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: SnapshotThreadLocal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcuirassed/kowloon;", "", "", "size", "", "keys", "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "", X3.i.W, "saneness", "(J)Ljava/lang/Object;", "value", "", "wireman", "(JLjava/lang/Object;)Z", "dern", "(JLjava/lang/Object;)Lcuirassed/kowloon;", "attabal", "(J)I", "I", "[J", "[Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Object[] values;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final long[] keys;

    public kowloon(int i, long[] jArr, Object[] objArr) {
        this.size = i;
        this.keys = jArr;
        this.values = objArr;
    }

    public final int attabal(long key) {
        int i = this.size - 1;
        if (i != -1) {
            int i2 = 0;
            if (i != 0) {
                while (i2 <= i) {
                    int i3 = (i2 + i) >>> 1;
                    long j = this.keys[i3] - key;
                    if (j < 0) {
                        i2 = i3 + 1;
                    } else {
                        if (j <= 0) {
                            return i3;
                        }
                        i = i3 - 1;
                    }
                }
                return -(i2 + 1);
            }
            long j2 = this.keys[0];
            if (j2 == key) {
                return 0;
            }
            if (j2 > key) {
                return -2;
            }
        }
        return -1;
    }

    public final kowloon dern(long key, Object value) {
        int i = this.size;
        int i2 = 0;
        int i3 = 0;
        for (Object obj : this.values) {
            if (obj != null) {
                i3++;
            }
        }
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        Object[] objArr = new Object[i4];
        if (i4 > 1) {
            int i5 = 0;
            while (i2 < i4 && i5 < i) {
                long j = this.keys[i5];
                Object obj2 = this.values[i5];
                if (j > key) {
                    jArr[i2] = key;
                    objArr[i2] = value;
                    i2++;
                    break;
                }
                if (obj2 != null) {
                    jArr[i2] = j;
                    objArr[i2] = obj2;
                    i2++;
                }
                i5++;
            }
            if (i5 == i) {
                jArr[i3] = key;
                objArr[i3] = value;
            } else {
                while (i2 < i4) {
                    long j2 = this.keys[i5];
                    Object obj3 = this.values[i5];
                    if (obj3 != null) {
                        jArr[i2] = j2;
                        objArr[i2] = obj3;
                        i2++;
                    }
                    i5++;
                }
            }
        } else {
            jArr[0] = key;
            objArr[0] = value;
        }
        return new kowloon(i4, jArr, objArr);
    }

    public final Object saneness(long key) {
        int iAttabal = attabal(key);
        if (iAttabal >= 0) {
            return this.values[iAttabal];
        }
        return null;
    }

    public final boolean wireman(long key, Object value) {
        int iAttabal = attabal(key);
        if (iAttabal < 0) {
            return false;
        }
        this.values[iAttabal] = value;
        return true;
    }
}
