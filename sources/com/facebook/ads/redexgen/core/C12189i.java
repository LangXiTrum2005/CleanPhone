package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.p004ironsource.f9;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C12189i extends C2819pc implements AnonymousClass24 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final SparseArray<Map<C2690nW, C2675nH>> A0E;
    public final SparseBooleanArray A0F;
    public static String[] A0G = {"aGn7PxmzFVI8pseTQREUgmPTmRn3c3Qe", "IWvjCaXZ0UNcR9QsrMbq4cwMoqcNO01w", "zzFjDnJDYUSk81dZD4bwc1a4UEkJCW7c", "AfyHMFnboWczrAj6gDYBkfictlCviIiz", "ZudaxJy5LTgucmpkRl3p1l6eoKWNEQ3P", "dJwbxLQye6WGEEeA8Aa4EZe7IW3A7RwI", "l9ypC7Hglf3jtTkN6zxYkfXofkc9mvwo", "bL7rVgPoAdAWEHuIi5lDma"};
    public static final C12189i A0J = new C2678nK().A0p();

    @Deprecated
    public static final C12189i A0I = A0J;
    public static final String A0W = C5C.A0h(1000);
    public static final String A0Q = C5C.A0h(1001);
    public static final String A0R = C5C.A0h(1002);
    public static final String A0T = C5C.A0h(1003);
    public static final String A0M = C5C.A0h(1004);
    public static final String A0N = C5C.A0h(1005);
    public static final String A0K = C5C.A0h(1006);
    public static final String A0V = C5C.A0h(1007);
    public static final String A0b = C5C.A0h(1008);
    public static final String A0O = C5C.A0h(1009);
    public static final String A0Z = C5C.A0h(1010);
    public static final String A0a = C5C.A0h(1011);
    public static final String A0Y = C5C.A0h(TTAdConstant.IMAGE_MODE_1012);
    public static final String A0X = C5C.A0h(f9.f24992i);
    public static final String A0P = C5C.A0h(f9.j);
    public static final String A0L = C5C.A0h(1015);
    public static final String A0S = C5C.A0h(f9.f24993l);
    public static final String A0U = C5C.A0h(1017);
    public static final AnonymousClass23<C12189i> A0H = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.nL
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return new C2678nK(bundle).A0p();
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0M(SparseArray<Map<C2690nW, C2675nH>> sparseArray, SparseArray<Map<C2690nW, C2675nH>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
            if (iIndexOfKey < 0 || !A0O(sparseArray.valueAt(i2), sparseArray2.valueAt(iIndexOfKey))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0O(Map<C2690nW, C2675nH> map, Map<C2690nW, C2675nH> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<C2690nW, C2675nH> entry : map.entrySet()) {
            C2690nW key = entry.getKey();
            if (!map2.containsKey(key) || !C5C.A1E(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public C12189i(C2678nK c2678nK) {
        super(c2678nK);
        this.A0C = c2678nK.A0C;
        this.A06 = c2678nK.A06;
        this.A07 = c2678nK.A07;
        this.A05 = c2678nK.A05;
        this.A09 = c2678nK.A09;
        this.A02 = c2678nK.A02;
        this.A03 = c2678nK.A03;
        this.A00 = c2678nK.A00;
        this.A01 = c2678nK.A01;
        this.A08 = c2678nK.A08;
        this.A0B = c2678nK.A0B;
        this.A0D = c2678nK.A0D;
        this.A04 = c2678nK.A04;
        this.A0E = c2678nK.A0E;
        this.A0F = c2678nK.A0F;
        this.A0A = c2678nK.A0A;
    }

    public static C12189i A02(Context context) {
        return new C2678nK(context).A0p();
    }

    public static /* synthetic */ String A0B() {
        String str = A0Z;
        String[] strArr = A0G;
        if (strArr[0].charAt(18) == strArr[1].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[2] = "q21ODw35C4tKhNLL23C7ozdatpTCdbhY";
        return str;
    }

    public static /* synthetic */ String A0C() {
        String str = A0a;
        if (A0G[2].charAt(14) == 'E') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "0vyQVqHCYWPXhQOTbdu3xGlynIqeANBb";
        strArr[6] = "GRyh1cWelO50ilzlDGPvyp85W4uMwhgp";
        return str;
    }

    public static /* synthetic */ String A0H() {
        String str = A0P;
        String[] strArr = A0G;
        if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[7] = "pTwWTj5vm";
        return str;
    }

    public static /* synthetic */ String A0J() {
        String str = A0M;
        String[] strArr = A0G;
        if (strArr[3].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A0G[7] = "PzaI";
        return str;
    }

    public static boolean A0N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final C2678nK A0P() {
        return new C2678nK(this);
    }

    @Deprecated
    public final C2675nH A0Q(int i2, C2690nW c2690nW) {
        Map<C2690nW, C2675nH> map = this.A0E.get(i2);
        if (map != null) {
            return map.get(c2690nW);
        }
        return null;
    }

    public final boolean A0R(int i2) {
        return this.A0F.get(i2);
    }

    @Deprecated
    public final boolean A0S(int i2, C2690nW c2690nW) {
        Map<C2690nW, C2675nH> map = this.A0E.get(i2);
        return map != null && map.containsKey(c2690nW);
    }

    @Override // com.facebook.ads.redexgen.core.C2819pc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A0G;
            if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[0] = "DcJRbXEfPLE5m3v2P2UTupH85cHshXE1";
            strArr2[1] = "UExlWRKDpxUDxSKj0OTM8Ioa8cI6hcv0";
            if (cls == cls2) {
                C12189i c12189i = (C12189i) obj;
                if (super.equals(c12189i) && this.A0C == c12189i.A0C && this.A06 == c12189i.A06 && this.A07 == c12189i.A07 && this.A05 == c12189i.A05 && this.A09 == c12189i.A09 && this.A02 == c12189i.A02 && this.A03 == c12189i.A03 && this.A00 == c12189i.A00 && this.A01 == c12189i.A01 && this.A08 == c12189i.A08 && this.A0B == c12189i.A0B && this.A0D == c12189i.A0D && this.A04 == c12189i.A04 && A0N(this.A0F, c12189i.A0F) && A0M(this.A0E, c12189i.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.C2819pc
    public final int hashCode() {
        return (((((((((((((((((((((((((((1 * 31) + super.hashCode()) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
