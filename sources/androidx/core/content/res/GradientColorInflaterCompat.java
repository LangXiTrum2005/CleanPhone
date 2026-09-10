package androidx.core.content.res;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class GradientColorInflaterCompat {

    public static final class ColorStops {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f4275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f4276b;

        public ColorStops(ArrayList arrayList, ArrayList arrayList2) {
            int size = arrayList.size();
            this.f4275a = new int[size];
            this.f4276b = new float[size];
            for (int i2 = 0; i2 < size; i2++) {
                this.f4275a[i2] = ((Integer) arrayList.get(i2)).intValue();
                this.f4276b[i2] = ((Float) arrayList2.get(i2)).floatValue();
            }
        }

        public ColorStops(int i2, int i3) {
            this.f4275a = new int[]{i2, i3};
            this.f4276b = new float[]{0.0f, 1.0f};
        }

        public ColorStops(int i2, int i3, int i4) {
            this.f4275a = new int[]{i2, i3, i4};
            this.f4276b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
