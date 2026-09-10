package i2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.pm;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends pm {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final SparseArray D;
    public final SparseBooleanArray E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f42774w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f42775x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f42776y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f42777z;

    public h(i iVar) {
        a(iVar);
        this.f42774w = iVar.f42778w;
        this.f42775x = iVar.f42779x;
        this.f42776y = iVar.f42780y;
        this.f42777z = iVar.f42781z;
        this.A = iVar.A;
        this.B = iVar.B;
        this.C = iVar.C;
        SparseArray sparseArray = iVar.D;
        SparseArray sparseArray2 = new SparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            sparseArray2.put(sparseArray.keyAt(i10), new HashMap((Map) sparseArray.valueAt(i10)));
        }
        this.D = sparseArray2;
        this.E = iVar.E.clone();
    }

    public h() {
        super(1);
        this.D = new SparseArray();
        this.E = new SparseBooleanArray();
        this.f42774w = true;
        this.f42775x = true;
        this.f42776y = true;
        this.f42777z = true;
        this.A = true;
        this.B = true;
        this.C = true;
    }
}
