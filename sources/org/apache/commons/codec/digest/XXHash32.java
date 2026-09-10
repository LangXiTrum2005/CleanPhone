package org.apache.commons.codec.digest;

import java.util.zip.Checksum;

/* JADX INFO: loaded from: classes7.dex */
public class XXHash32 implements Checksum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45203a;

    @Override // java.util.zip.Checksum
    public final long getValue() {
        throw null;
    }

    @Override // java.util.zip.Checksum
    public final void reset() {
        throw null;
    }

    @Override // java.util.zip.Checksum
    public final void update(int i2) {
        throw null;
    }

    @Override // java.util.zip.Checksum
    public final void update(byte[] bArr, int i2, int i3) {
        if (i3 <= 0) {
            return;
        }
        int i4 = i2 + i3;
        int i5 = this.f45203a;
        if ((i5 + i3) - 16 < 0) {
            System.arraycopy(bArr, i2, null, i5, i3);
            this.f45203a += i3;
            return;
        }
        if (i5 > 0) {
            System.arraycopy(bArr, i2, null, i5, 16 - i5);
            throw null;
        }
        if (i2 <= i4 - 16) {
            throw null;
        }
        if (i2 >= i4) {
            this.f45203a = 0;
            return;
        }
        int i6 = i4 - i2;
        this.f45203a = i6;
        System.arraycopy(bArr, i2, null, 0, i6);
    }
}
