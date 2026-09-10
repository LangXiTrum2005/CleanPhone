package androidx.media3.extractor.ts;

import androidx.media3.common.util.Assertions;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class NalUnitTargetBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f7586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7587c;
    public byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7588e;

    public NalUnitTargetBuffer(int i2) {
        this.f7585a = i2;
        byte[] bArr = new byte[131];
        this.d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i2, int i3) {
        if (this.f7586b) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i5 = this.f7588e;
            if (length < i5 + i4) {
                this.d = Arrays.copyOf(bArr2, (i5 + i4) * 2);
            }
            System.arraycopy(bArr, i2, this.d, this.f7588e, i4);
            this.f7588e += i4;
        }
    }

    public final boolean b(int i2) {
        if (!this.f7586b) {
            return false;
        }
        this.f7588e -= i2;
        this.f7586b = false;
        this.f7587c = true;
        return true;
    }

    public final void c() {
        this.f7586b = false;
        this.f7587c = false;
    }

    public final void d(int i2) {
        Assertions.e(!this.f7586b);
        boolean z2 = i2 == this.f7585a;
        this.f7586b = z2;
        if (z2) {
            this.f7588e = 3;
            this.f7587c = false;
        }
    }
}
