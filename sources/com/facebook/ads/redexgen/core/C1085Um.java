package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1085Um {
    public static String[] A04 = {"QZnKiNp6aAK0W5en9QSJY87yWFlnf2Z1", "oEGFaIsL4lk1wqhaVuVQeqsaTU2VcNJy", "HxvJk", "H", "Vyrg", "kWuVGImLIC7NK2kT0FHI1OZvhh7ViNOP", "nylCWDh2dpN6tpgalRHWkNoQnb7bXTbh", "eI"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final byte[] A03;

    public C1085Um(int i, byte[] bArr, int i2, int i3) {
        this.A01 = i;
        this.A03 = bArr;
        this.A02 = i2;
        this.A00 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1085Um c1085Um = (C1085Um) obj;
        int i = this.A01;
        int i2 = c1085Um.A01;
        if (A04[0].charAt(18) == 'M') {
            throw new RuntimeException();
        }
        A04[6] = "9hF1qABLqaGESEzJKHa21vqeYo2qhQjD";
        if (i == i2 && this.A02 == c1085Um.A02 && this.A00 == c1085Um.A00 && Arrays.equals(this.A03, c1085Um.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i = result * 31;
        int result2 = Arrays.hashCode(this.A03);
        int result3 = (((i + result2) * 31) + this.A02) * 31;
        int result4 = this.A00;
        return result3 + result4;
    }
}
