package n6;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements e6.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f46577b;

    public /* synthetic */ e(n nVar, int i10) {
        this.f46576a = i10;
        this.f46577b = nVar;
    }

    @Override // e6.k
    public final g6.a0 a(Object obj, int i10, int i11, e6.i iVar) {
        switch (this.f46576a) {
            case 0:
                n nVar = this.f46577b;
                return nVar.a(new g9.k((ByteBuffer) obj, nVar.f46603d, nVar.f46602c, 23), i10, i11, iVar, n.f46598j);
            default:
                n nVar2 = this.f46577b;
                return nVar2.a(new g9.k((ParcelFileDescriptor) obj, nVar2.f46603d, nVar2.f46602c), i10, i11, iVar, n.f46598j);
        }
    }

    @Override // e6.k
    public final boolean b(Object obj, e6.i iVar) {
        switch (this.f46576a) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
