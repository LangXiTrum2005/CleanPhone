package u3;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f51727e = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f51728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f51731d;

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f51728a) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f51731d;
            int length = bArr2.length;
            int i13 = this.f51729b + i12;
            if (length < i13) {
                this.f51731d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f51731d, this.f51729b, i12);
            this.f51729b += i12;
        }
    }
}
