package com.smartdigimkt.b4;

import com.smartdigimkt.p4.f0;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f33905h = 65536;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f33906i = 524288;
    private static final int j = 4096;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.smartdigimkt.n4.h f33908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f33909c;
    private long d;
    private int f;
    private int g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f33910e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f33907a = new byte[4096];

    public b(com.smartdigimkt.n4.h hVar, long j2, long j3) {
        this.f33908b = hVar;
        this.d = j2;
        this.f33909c = j3;
    }

    private void e(int i2) {
        int i3 = this.f + i2;
        byte[] bArr = this.f33910e;
        if (i3 > bArr.length) {
            this.f33910e = Arrays.copyOf(this.f33910e, f0.a(bArr.length * 2, 65536 + i3, i3 + f33906i));
        }
    }

    private int f(int i2) {
        int iMin = Math.min(this.g, i2);
        g(iMin);
        return iMin;
    }

    private void g(int i2) {
        int i3 = this.g - i2;
        this.g = i3;
        this.f = 0;
        byte[] bArr = this.f33910e;
        byte[] bArr2 = i3 < bArr.length - f33906i ? new byte[65536 + i3] : bArr;
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        this.f33910e = bArr2;
    }

    @Override // com.smartdigimkt.b4.f
    public int a(byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        int iD = d(bArr, i2, i3);
        if (iD == 0) {
            iD = a(bArr, i2, i3, 0, true);
        }
        d(iD);
        return iD;
    }

    @Override // com.smartdigimkt.b4.f
    public boolean b(int i2, boolean z2) throws InterruptedException, IOException {
        int iF = f(i2);
        while (iF < i2 && iF != -1) {
            iF = a(this.f33907a, -iF, Math.min(i2, this.f33907a.length + iF), iF, z2);
        }
        d(iF);
        return iF != -1;
    }

    @Override // com.smartdigimkt.b4.f
    public void c(byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        a(bArr, i2, i3, false);
    }

    @Override // com.smartdigimkt.b4.f
    public long d() {
        return this.d;
    }

    private int d(byte[] bArr, int i2, int i3) {
        int i4 = this.g;
        if (i4 == 0) {
            return 0;
        }
        int iMin = Math.min(i4, i3);
        System.arraycopy(this.f33910e, 0, bArr, i2, iMin);
        g(iMin);
        return iMin;
    }

    @Override // com.smartdigimkt.b4.f
    public void c(int i2) throws InterruptedException, IOException {
        a(i2, false);
    }

    @Override // com.smartdigimkt.b4.f
    public long c() {
        return this.d + ((long) this.f);
    }

    @Override // com.smartdigimkt.b4.f
    public boolean a(byte[] bArr, int i2, int i3, boolean z2) throws InterruptedException, IOException {
        int iD = d(bArr, i2, i3);
        while (iD < i3 && iD != -1) {
            iD = a(bArr, i2, i3, iD, z2);
        }
        d(iD);
        return iD != -1;
    }

    private void d(int i2) {
        if (i2 != -1) {
            this.d += (long) i2;
        }
    }

    @Override // com.smartdigimkt.b4.f
    public void b(int i2) throws InterruptedException, IOException {
        b(i2, false);
    }

    @Override // com.smartdigimkt.b4.f
    public int a(int i2) throws InterruptedException, IOException {
        int iF = f(i2);
        if (iF == 0) {
            byte[] bArr = this.f33907a;
            iF = a(bArr, 0, Math.min(i2, bArr.length), 0, true);
        }
        d(iF);
        return iF;
    }

    @Override // com.smartdigimkt.b4.f
    public boolean b(byte[] bArr, int i2, int i3, boolean z2) throws InterruptedException, IOException {
        if (!a(i3, z2)) {
            return false;
        }
        System.arraycopy(this.f33910e, this.f - i3, bArr, i2, i3);
        return true;
    }

    @Override // com.smartdigimkt.b4.f
    public void b(byte[] bArr, int i2, int i3) throws InterruptedException, IOException {
        b(bArr, i2, i3, false);
    }

    @Override // com.smartdigimkt.b4.f
    public void b() {
        this.f = 0;
    }

    @Override // com.smartdigimkt.b4.f
    public boolean a(int i2, boolean z2) throws InterruptedException, IOException {
        e(i2);
        int iMin = Math.min(this.g - this.f, i2);
        while (iMin < i2) {
            int i3 = i2;
            boolean z3 = z2;
            iMin = a(this.f33910e, this.f, i3, iMin, z3);
            if (iMin == -1) {
                return false;
            }
            i2 = i3;
            z2 = z3;
        }
        int i4 = this.f + i2;
        this.f = i4;
        this.g = Math.max(this.g, i4);
        return true;
    }

    @Override // com.smartdigimkt.b4.f
    public long a() {
        return this.f33909c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // com.smartdigimkt.b4.f
    public <E extends Throwable> void a(long j2, E e2) throws Throwable {
        com.smartdigimkt.p4.a.a(j2 >= 0);
        this.d = j2;
        throw e2;
    }

    private int a(byte[] bArr, int i2, int i3, int i4, boolean z2) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int iA = this.f33908b.a(bArr, i2 + i4, i3 - i4);
            if (iA != -1) {
                return i4 + iA;
            }
            if (i4 == 0 && z2) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }
}
