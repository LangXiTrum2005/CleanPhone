package xa;

import com.google.android.gms.internal.ads.jh1;
import com.google.android.gms.internal.ads.q00;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends q00 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f53716c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(byte[] bArr, int i10) {
        super(bArr, 7);
        this.f53716c = i10;
    }

    @Override // com.google.android.gms.internal.ads.q00
    public final jh1 l(int i10, byte[] bArr) {
        switch (this.f53716c) {
            case 0:
                return new k(bArr, i10, 0);
            default:
                return new k(bArr, i10, 1);
        }
    }
}
