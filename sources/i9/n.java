package i9;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f42948c;

    public n(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f42948c = bArr;
    }

    @Override // i9.m
    public final byte[] x1() {
        return this.f42948c;
    }
}
