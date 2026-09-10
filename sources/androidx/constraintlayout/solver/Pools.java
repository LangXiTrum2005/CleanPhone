package androidx.constraintlayout.solver;

/* JADX INFO: loaded from: classes.dex */
final class Pools {

    public interface Pool<T> {
    }

    public static class SimplePool<T> implements Pool<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f3904a = new Object[256];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f3905b;

        public final Object a() {
            int i2 = this.f3905b;
            if (i2 <= 0) {
                return null;
            }
            int i3 = i2 - 1;
            Object[] objArr = this.f3904a;
            Object obj = objArr[i3];
            objArr[i3] = null;
            this.f3905b = i2 - 1;
            return obj;
        }

        public final boolean b(ArrayRow arrayRow) {
            int i2 = this.f3905b;
            Object[] objArr = this.f3904a;
            if (i2 >= objArr.length) {
                return false;
            }
            objArr[i2] = arrayRow;
            this.f3905b = i2 + 1;
            return true;
        }
    }
}
