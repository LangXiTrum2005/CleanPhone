package com.google.zxing.pdf417.decoder.ec;

/* JADX INFO: loaded from: classes3.dex */
final class ModulusPoly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f21393a;

    public ModulusPoly(int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        int i2 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f21393a = iArr;
            return;
        }
        while (i2 < length && iArr[i2] == 0) {
            i2++;
        }
        if (i2 == length) {
            this.f21393a = new int[]{0};
            return;
        }
        int i3 = length - i2;
        int[] iArr2 = new int[i3];
        this.f21393a = iArr2;
        System.arraycopy(iArr, i2, iArr2, 0, i3);
    }

    public final String toString() {
        int[] iArr = this.f21393a;
        StringBuilder sb = new StringBuilder((iArr.length - 1) * 8);
        for (int length = iArr.length - 1; length >= 0; length--) {
            int i2 = iArr[(iArr.length - 1) - length];
            if (i2 != 0) {
                if (i2 < 0) {
                    sb.append(" - ");
                    i2 = -i2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || i2 != 1) {
                    sb.append(i2);
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
        return sb.toString();
    }
}
