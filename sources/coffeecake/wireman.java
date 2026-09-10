package coffeecake;

/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes.dex */
public class wireman<T> implements dern<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Object[] f15761attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public int f15762saneness;

    public wireman(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f15761attabal = new Object[i];
    }

    @Override // coffeecake.dern
    public boolean attabal(T t) {
        int i = this.f15762saneness;
        Object[] objArr = this.f15761attabal;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f15762saneness = i + 1;
        return true;
    }

    @Override // coffeecake.dern
    public void dern(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.f15762saneness;
            Object[] objArr = this.f15761attabal;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.f15762saneness = i3 + 1;
            }
        }
    }

    @Override // coffeecake.dern
    public T saneness() {
        int i = this.f15762saneness;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f15761attabal;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f15762saneness = i - 1;
        return t;
    }
}
