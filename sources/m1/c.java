package m1;

import com.google.android.gms.internal.ads.z01;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z01 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f45773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f45774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f45775e;

    public c(int i10, long j10) {
        super(i10, 2);
        this.f45773c = j10;
        this.f45774d = new ArrayList();
        this.f45775e = new ArrayList();
    }

    public final c g(int i10) {
        ArrayList arrayList = this.f45775e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = (c) arrayList.get(i11);
            if (cVar.f22444b == i10) {
                return cVar;
            }
        }
        return null;
    }

    public final d h(int i10) {
        ArrayList arrayList = this.f45774d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) arrayList.get(i11);
            if (dVar.f22444b == i10) {
                return dVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.z01
    public final String toString() {
        return z01.b(this.f22444b) + " leaves: " + Arrays.toString(this.f45774d.toArray()) + " containers: " + Arrays.toString(this.f45775e.toArray());
    }
}
