package sg.bigo.ads.common.w;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final b f47723b = new b() { // from class: sg.bigo.ads.common.w.c.1
        @Override // sg.bigo.ads.common.w.c.b
        public final boolean a(float[] fArr) {
            float f = fArr[2];
            if (f < 0.95f && f > 0.05f) {
                float f2 = fArr[1];
                if ((f2 > 0.1f || f < 0.55f) && ((f2 > 0.5f || f < 0.75f) && (f2 > 0.2f || f < 0.7f))) {
                    float f3 = fArr[0];
                    if (f3 < 10.0f || f3 > 37.0f || f2 > 0.82f) {
                        return true;
                    }
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<C0856c> f47725c;
    private final List<d> d;
    private final SparseBooleanArray f = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<d, C0856c> f47726e = new ArrayMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C0856c f47724a = b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bitmap f47727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<d> f47728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f47729c;
        int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47730e;
        final List<b> f;

        public a(Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f47728b = arrayList;
            this.f47729c = 16;
            this.d = 12544;
            this.f47730e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(c.f47723b);
            this.f47727a = bitmap;
            arrayList.add(d.f47735a);
        }
    }

    public interface b {
        boolean a(float[] fArr);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.c$c, reason: collision with other inner class name */
    public static final class C0856c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f47731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f47732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f47733c;
        private final int d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f47734e;
        private float[] f;

        public C0856c(int i2, int i3) {
            this.f47733c = Color.red(i2);
            this.d = Color.green(i2);
            this.f47734e = Color.blue(i2);
            this.f47731a = i2;
            this.f47732b = i3;
        }

        public final float[] a() {
            if (this.f == null) {
                this.f = new float[3];
            }
            sg.bigo.ads.common.w.b.a(this.f47733c, this.d, this.f47734e, this.f);
            return this.f;
        }
    }

    public c(List<C0856c> list, List<d> list2) {
        this.f47725c = list;
        this.d = list2;
    }

    public static a a(Bitmap bitmap) {
        return new a(bitmap);
    }

    private C0856c b() {
        int size = this.f47725c.size();
        int i2 = Integer.MIN_VALUE;
        C0856c c0856c = null;
        for (int i3 = 0; i3 < size; i3++) {
            C0856c c0856c2 = this.f47725c.get(i3);
            int i4 = c0856c2.f47732b;
            if (i4 > i2) {
                c0856c = c0856c2;
                i2 = i4;
            }
        }
        return c0856c;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    public final void a() {
        float f;
        float fAbs;
        int size = this.d.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            d dVar = this.d.get(i3);
            int length = dVar.d.length;
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i4 = i2; i4 < length; i4++) {
                float f4 = dVar.d[i4];
                if (f4 > 0.0f) {
                    f3 += f4;
                }
            }
            if (f3 != 0.0f) {
                int length2 = dVar.d.length;
                for (int i5 = i2; i5 < length2; i5++) {
                    float[] fArr = dVar.d;
                    float f5 = fArr[i5];
                    if (f5 > 0.0f) {
                        fArr[i5] = f5 / f3;
                    }
                }
            }
            Map<d, C0856c> map = this.f47726e;
            int size2 = this.f47725c.size();
            C0856c c0856c = null;
            int i6 = i2;
            float f6 = 0.0f;
            while (i6 < size2) {
                C0856c c0856c2 = this.f47725c.get(i6);
                float[] fArrA = c0856c2.a();
                float f7 = fArrA[1];
                float[] fArr2 = dVar.f47736b;
                if (f7 < fArr2[i2] || f7 > fArr2[2]) {
                    f = f2;
                } else {
                    float f8 = fArrA[2];
                    float[] fArr3 = dVar.f47737c;
                    if (f8 < fArr3[i2] || f8 > fArr3[2] || this.f.get(c0856c2.f47731a)) {
                        f = f2;
                    } else {
                        float[] fArrA2 = c0856c2.a();
                        C0856c c0856c3 = this.f47724a;
                        int i7 = c0856c3 != null ? c0856c3.f47732b : 1;
                        float f9 = dVar.d[i2];
                        float fAbs2 = f9 > f2 ? (1.0f - Math.abs(fArrA2[1] - dVar.f47736b[1])) * f9 : f2;
                        float f10 = dVar.d[1];
                        if (f10 > f2) {
                            f = f2;
                            fAbs = (1.0f - Math.abs(fArrA2[2] - dVar.f47737c[1])) * f10;
                        } else {
                            f = f2;
                            fAbs = f;
                        }
                        float f11 = dVar.d[2];
                        float f12 = fAbs2 + fAbs + (f11 > f ? (c0856c2.f47732b / i7) * f11 : f);
                        if (c0856c == null || f12 > f6) {
                            f6 = f12;
                            c0856c = c0856c2;
                        }
                    }
                }
                i6++;
                f2 = f;
                i2 = 0;
            }
            if (c0856c != null && dVar.f47738e) {
                this.f.append(c0856c.f47731a, true);
            }
            map.put(dVar, c0856c);
            i3++;
            i2 = 0;
        }
        this.f.clear();
    }
}
