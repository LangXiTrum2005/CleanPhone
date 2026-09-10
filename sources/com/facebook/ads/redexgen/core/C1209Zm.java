package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1209Zm implements InterfaceC0904Nb {
    public NM A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public static String[] A06 = {"4RCZWuhO7OeWa7CNbgfPGwqrPXyQDTq9", "9VQnWHnLQUhJZv23f3", "RQeSOjz6UX", "uCH7Z0gINn9LT5Xd3nbgfB1sVL91p9Fx", "buRqoNnwLPmOLIdH", "cB6qD0tLwk3anyn8RWGpMGrrRUWqBOgq", "bjnvuzeY", "ihwg9d6F4nw4f9S31ZCM8cc59ZVjQ7b5"};
    public static final C1209Zm A07 = new NN().A05();
    public static final String A0A = AbstractC1600gE.A0h(0);
    public static final String A0B = AbstractC1600gE.A0h(1);
    public static final String A0D = AbstractC1600gE.A0h(2);
    public static final String A09 = AbstractC1600gE.A0h(3);
    public static final String A0C = AbstractC1600gE.A0h(4);
    public static final InterfaceC0903Na<C1209Zm> A08 = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Zp
        @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
        public final InterfaceC0904Nb A6V(Bundle bundle) {
            return C1209Zm.A00(bundle);
        }
    };

    public C1209Zm(int i, int i2, int i3, int i4, int i5) {
        this.A02 = i;
        this.A03 = i2;
        this.A05 = i3;
        this.A01 = i4;
        this.A04 = i5;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    public static /* synthetic */ C1209Zm A00(Bundle bundle) {
        int i;
        NN nn = new NN();
        if (bundle.containsKey(A0A)) {
            String str = A0A;
            if (A06[4].length() != 4) {
                A06[4] = "L3Z6nZQhTC4TxOQxR";
                nn.A01(bundle.getInt(str));
                if (bundle.containsKey(A0B)) {
                    nn.A02(bundle.getInt(A0B));
                }
                if (bundle.containsKey(A0D)) {
                    nn.A04(bundle.getInt(A0D));
                }
                if (bundle.containsKey(A09)) {
                    i = bundle.getInt(A09);
                    if (A06[6].length() == 8) {
                        A06[0] = "1dhS0N4NxiXwo6AxbaOOUoyFrFFLDsqy";
                        nn.A00(i);
                    }
                }
                if (bundle.containsKey(A0C)) {
                    nn.A03(bundle.getInt(A0C));
                }
                return nn.A05();
            }
        } else {
            if (bundle.containsKey(A0B)) {
                nn.A02(bundle.getInt(A0B));
            }
            if (bundle.containsKey(A0D)) {
                nn.A04(bundle.getInt(A0D));
            }
            if (bundle.containsKey(A09)) {
                i = bundle.getInt(A09);
                if (A06[6].length() == 8) {
                    A06[0] = "1dhS0N4NxiXwo6AxbaOOUoyFrFFLDsqy";
                    nn.A00(i);
                }
            }
            if (bundle.containsKey(A0C)) {
                nn.A03(bundle.getInt(A0C));
            }
            return nn.A05();
        }
        throw new RuntimeException();
    }

    public final NM A01() {
        if (this.A00 == null) {
            this.A00 = new NM(this);
        }
        return this.A00;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0067  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    public final boolean equals(Object obj) {
        int i;
        int i2;
        String[] strArr;
        if (this == obj) {
            return true;
        }
        if (A06[0].charAt(30) != 'q') {
            throw new RuntimeException();
        }
        A06[4] = "4jdoehrgKVNPR2KDsgvS21Zz6";
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1209Zm c1209Zm = (C1209Zm) obj;
        if (this.A02 == c1209Zm.A02) {
            int i3 = this.A03;
            if (A06[0].charAt(30) == 'q') {
                String[] strArr2 = A06;
                strArr2[2] = "k1XchWimtW";
                strArr2[1] = "9lXhW6xAnyDb6kil5L";
                if (i3 == c1209Zm.A03) {
                    if (this.A05 == c1209Zm.A05) {
                        i = this.A01;
                        i2 = c1209Zm.A01;
                        strArr = A06;
                        if (strArr[2].length() != strArr[1].length()) {
                            throw new RuntimeException();
                        }
                        A06[4] = "Md";
                        if (i != i2) {
                        }
                    }
                }
            } else if (i3 == c1209Zm.A03) {
                if (this.A05 == c1209Zm.A05) {
                    i = this.A01;
                    i2 = c1209Zm.A01;
                    strArr = A06;
                    if (strArr[2].length() != strArr[1].length()) {
                        throw new RuntimeException();
                    }
                    A06[4] = "Md";
                    if (i != i2 && this.A04 == c1209Zm.A04) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A02;
        int result2 = ((((17 * 31) + result) * 31) + this.A03) * 31;
        int result3 = this.A05;
        int result4 = (((result2 + result3) * 31) + this.A01) * 31;
        int result5 = this.A04;
        return result4 + result5;
    }
}
