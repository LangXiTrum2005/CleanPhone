package com.smartdigimkt.n4;

import com.smartdigimkt.p4.f0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f37008i = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f37011c;
    private final a[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37012e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a[] f37013h;

    public l(boolean z2, int i2) {
        this(z2, i2, 0);
    }

    public synchronized void a(int i2) {
        boolean z2 = i2 < this.f37012e;
        this.f37012e = i2;
        if (z2) {
            a();
        }
    }

    @Override // com.smartdigimkt.n4.b
    public synchronized int b() {
        return this.f * this.f37010b;
    }

    @Override // com.smartdigimkt.n4.b
    public synchronized a c() {
        a aVar;
        try {
            this.f++;
            int i2 = this.g;
            if (i2 > 0) {
                a[] aVarArr = this.f37013h;
                int i3 = i2 - 1;
                this.g = i3;
                aVar = aVarArr[i3];
                aVarArr[i3] = null;
            } else {
                aVar = new a(new byte[this.f37010b], 0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return aVar;
    }

    @Override // com.smartdigimkt.n4.b
    public int d() {
        return this.f37010b;
    }

    public synchronized void e() {
        if (this.f37009a) {
            a(0);
        }
    }

    public l(boolean z2, int i2, int i3) {
        com.smartdigimkt.p4.a.a(i2 > 0);
        com.smartdigimkt.p4.a.a(i3 >= 0);
        this.f37009a = z2;
        this.f37010b = i2;
        this.g = i3;
        this.f37013h = new a[i3 + 100];
        if (i3 > 0) {
            this.f37011c = new byte[i3 * i2];
            for (int i4 = 0; i4 < i3; i4++) {
                this.f37013h[i4] = new a(this.f37011c, i4 * i2);
            }
        } else {
            this.f37011c = null;
        }
        this.d = new a[1];
    }

    @Override // com.smartdigimkt.n4.b
    public synchronized void a(a aVar) {
        a[] aVarArr = this.d;
        aVarArr[0] = aVar;
        a(aVarArr);
    }

    @Override // com.smartdigimkt.n4.b
    public synchronized void a(a[] aVarArr) {
        try {
            int i2 = this.g;
            int length = aVarArr.length + i2;
            a[] aVarArr2 = this.f37013h;
            if (length >= aVarArr2.length) {
                this.f37013h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i2 + aVarArr.length));
            }
            for (a aVar : aVarArr) {
                byte[] bArr = aVar.f36984a;
                if (bArr != this.f37011c && bArr.length != this.f37010b) {
                    throw new IllegalArgumentException("Unexpected allocation: " + System.identityHashCode(aVar.f36984a) + ", " + System.identityHashCode(this.f37011c) + ", " + aVar.f36984a.length + ", " + this.f37010b);
                }
                a[] aVarArr3 = this.f37013h;
                int i3 = this.g;
                this.g = i3 + 1;
                aVarArr3[i3] = aVar;
            }
            this.f -= aVarArr.length;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.smartdigimkt.n4.b
    public synchronized void a() {
        try {
            int i2 = 0;
            int iMax = Math.max(0, f0.a(this.f37012e, this.f37010b) - this.f);
            int i3 = this.g;
            if (iMax >= i3) {
                return;
            }
            if (this.f37011c != null) {
                int i4 = i3 - 1;
                while (i2 <= i4) {
                    a[] aVarArr = this.f37013h;
                    a aVar = aVarArr[i2];
                    byte[] bArr = aVar.f36984a;
                    byte[] bArr2 = this.f37011c;
                    if (bArr == bArr2) {
                        i2++;
                    } else {
                        a aVar2 = aVarArr[i4];
                        if (aVar2.f36984a != bArr2) {
                            i4--;
                        } else {
                            aVarArr[i2] = aVar2;
                            aVarArr[i4] = aVar;
                            i4--;
                            i2++;
                        }
                    }
                }
                iMax = Math.max(iMax, i2);
                if (iMax >= this.g) {
                    return;
                }
            }
            Arrays.fill(this.f37013h, iMax, this.g, (Object) null);
            this.g = iMax;
        } catch (Throwable th) {
            throw th;
        }
    }
}
