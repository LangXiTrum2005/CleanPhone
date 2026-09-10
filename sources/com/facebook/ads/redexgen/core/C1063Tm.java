package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization(type = {"INCREASE_VISIBILITY"}, value = "To support OculusMp4Extractor")
public final class C1063Tm extends W5 {
    public static byte[] A03;
    public static String[] A04 = {"qOeSqRkahsCKoKd6q1ywY7fFzJGDwKbS", "ETtTSiiNgdRhzo8NLQ4T", "rE7f23WF2NzHq0gVHBIQvIC", "Xv2tkftuBlFKChIDk8JsCAQzR9K3fgGt", "EvZoxA7p5B4Ue5aZ4dj8", "ZGkM6JqFML3mz5arrOeQjq7kfOe9szJK", "uCGPqFHd1yQvXTOldBNdcEyyQmlykfil", "UMumL3Hv7yNcb5WxOOYKtn3faJ5RL9EA"};
    public final long A00;
    public final List<C1063Tm> A01;
    public final List<C1062Tl> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-75, -8, 4, 3, 9, -10, -2, 3, -6, 7, 8, -49, -75, -126, -50, -57, -61, -40, -57, -43, -100, -126};
    }

    static {
        A01();
    }

    public C1063Tm(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C1063Tm A02(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1063Tm c1063Tm = this.A01.get(i2);
            int i3 = ((W5) c1063Tm).A00;
            String[] strArr = A04;
            String str = strArr[4];
            String str2 = strArr[1];
            int i4 = str.length();
            int childrenSize = str2.length();
            if (i4 != childrenSize) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "BuhWgovJkyziR4VphAGpoHp5Dq8CRcmm";
            strArr2[6] = "G2bIuZ4kxyxa0rvNzvuWXzwuRGkQYRBI";
            if (i3 == i) {
                return c1063Tm;
            }
        }
        return null;
    }

    public final C1062Tl A03(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1062Tl c1062Tl = this.A02.get(i2);
            String[] strArr = A04;
            String str = strArr[0];
            String str2 = strArr[3];
            int i3 = str.charAt(11);
            int childrenSize = str2.charAt(11);
            if (i3 != childrenSize) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[7] = "CLZAQizgOyACgOgxgxovY826t3HZM9ND";
            strArr2[6] = "kY7NnAkupyYN8qdWjfD9d65eFmUpTbGp";
            int childrenSize2 = ((W5) c1062Tl).A00;
            if (childrenSize2 == i) {
                return c1062Tl;
            }
        }
        String[] strArr3 = A04;
        String str3 = strArr3[7];
        String str4 = strArr3[6];
        int iCharAt = str3.charAt(9);
        int childrenSize3 = str4.charAt(9);
        if (iCharAt == childrenSize3) {
            String[] strArr4 = A04;
            strArr4[0] = "BQMuN1X7MvUK3Y53SfbSWEKVElmgJyV1";
            strArr4[3] = "npMRKhYePEVKIb5MPn1LUnFO4WoNwWFr";
            return null;
        }
        throw new RuntimeException();
    }

    public final void A04(C1063Tm c1063Tm) {
        this.A01.add(c1063Tm);
    }

    public final void A05(C1062Tl c1062Tl) {
        this.A02.add(c1062Tl);
    }

    @Override // com.facebook.ads.redexgen.core.W5
    public final String toString() {
        return W5.A04(super.A00) + A00(13, 9, 56) + Arrays.toString(this.A02.toArray()) + A00(0, 13, 107) + Arrays.toString(this.A01.toArray());
    }
}
