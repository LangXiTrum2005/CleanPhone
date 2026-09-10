package j2;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b2.j f43687g = new b2.j(13);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b2.j f43688h = new b2.j(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43694f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r[] f43690b = new r[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f43689a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43691c = -1;

    public final void a(int i10, float f10) {
        r rVar;
        int i11 = this.f43691c;
        ArrayList arrayList = this.f43689a;
        if (i11 != 1) {
            Collections.sort(arrayList, f43687g);
            this.f43691c = 1;
        }
        int i12 = this.f43694f;
        r[] rVarArr = this.f43690b;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.f43694f = i13;
            rVar = rVarArr[i13];
        } else {
            rVar = new r();
        }
        int i14 = this.f43692d;
        this.f43692d = i14 + 1;
        rVar.f43684a = i14;
        rVar.f43685b = i10;
        rVar.f43686c = f10;
        arrayList.add(rVar);
        this.f43693e += i10;
        while (true) {
            int i15 = this.f43693e;
            if (i15 <= 2000) {
                return;
            }
            int i16 = i15 - 2000;
            r rVar2 = (r) arrayList.get(0);
            int i17 = rVar2.f43685b;
            if (i17 <= i16) {
                this.f43693e -= i17;
                arrayList.remove(0);
                int i18 = this.f43694f;
                if (i18 < 5) {
                    this.f43694f = i18 + 1;
                    rVarArr[i18] = rVar2;
                }
            } else {
                rVar2.f43685b = i17 - i16;
                this.f43693e -= i16;
            }
        }
    }

    public final float b() {
        int i10 = this.f43691c;
        ArrayList arrayList = this.f43689a;
        if (i10 != 0) {
            Collections.sort(arrayList, f43688h);
            this.f43691c = 0;
        }
        float f10 = 0.5f * this.f43693e;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            r rVar = (r) arrayList.get(i12);
            i11 += rVar.f43685b;
            if (i11 >= f10) {
                return rVar.f43686c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r) l1.d.d(arrayList, 1)).f43686c;
    }
}
