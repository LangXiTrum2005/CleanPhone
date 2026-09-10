package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0982Qh implements InterfaceC0904Nb {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Bitmap A0C;
    public final Layout.Alignment A0D;
    public final Layout.Alignment A0E;
    public final CharSequence A0F;
    public final boolean A0G;
    public static String[] A0H = {"X7OGZc3pb6oJZlPj8nhxVqWmS", "CG21vn2ycOhsHyRB8Ec7PtQllX393or7", "Xg47lYln7De7JM9e1Qsm8WouyvHcmzmf", "k79A4IA9hCPxD7YnC0nuYAhWMdnD", "M05svwDzdKHfpMBpmBiths0G4NFVSZNV", "WNPLVOJgtk3IIJAX9zOmUx1lzVvuJ8m1", "LgVEwL12Pos9huT7UJcssFcnz74M", "SsvYMpSyd2cjXdtidUW4n9yM7K7nlqz2"};
    public static final C0982Qh A0J = new C1374cY().A0G("").A0H();
    public static final String A0U = AbstractC1600gE.A0h(0);
    public static final String A0V = AbstractC1600gE.A0h(1);
    public static final String A0P = AbstractC1600gE.A0h(2);
    public static final String A0K = AbstractC1600gE.A0h(3);
    public static final String A0M = AbstractC1600gE.A0h(4);
    public static final String A0O = AbstractC1600gE.A0h(5);
    public static final String A0N = AbstractC1600gE.A0h(6);
    public static final String A0Q = AbstractC1600gE.A0h(7);
    public static final String A0R = AbstractC1600gE.A0h(8);
    public static final String A0X = AbstractC1600gE.A0h(9);
    public static final String A0W = AbstractC1600gE.A0h(10);
    public static final String A0T = AbstractC1600gE.A0h(11);
    public static final String A0L = AbstractC1600gE.A0h(12);
    public static final String A0Z = AbstractC1600gE.A0h(13);
    public static final String A0a = AbstractC1600gE.A0h(14);
    public static final String A0Y = AbstractC1600gE.A0h(15);
    public static final String A0S = AbstractC1600gE.A0h(16);
    public static final InterfaceC0903Na<C0982Qh> A0I = new InterfaceC0903Na() { // from class: com.facebook.ads.redexgen.X.Qj
        @Override // com.facebook.ads.redexgen.core.InterfaceC0903Na
        public final InterfaceC0904Nb A6V(Bundle bundle) {
            return C0982Qh.A00(bundle);
        }
    };

    public C0982Qh(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            AbstractC1517es.A01(bitmap);
        } else {
            AbstractC1517es.A07(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.A0F = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.A0F = charSequence.toString();
        } else {
            this.A0F = null;
        }
        this.A0E = alignment;
        this.A0D = alignment2;
        this.A0C = bitmap;
        this.A01 = f;
        this.A07 = i;
        this.A06 = i2;
        this.A02 = f2;
        this.A08 = i3;
        this.A04 = f4;
        this.A00 = f5;
        this.A0G = z;
        this.A0B = i5;
        this.A09 = i4;
        this.A05 = f3;
        this.A0A = i6;
        this.A03 = f6;
    }

    public static final C0982Qh A00(Bundle bundle) {
        C1374cY c1374cY = new C1374cY();
        CharSequence charSequence = bundle.getCharSequence(A0U);
        if (charSequence != null) {
            c1374cY.A0G(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(A0V);
        if (alignment != null) {
            c1374cY.A0F(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(A0P);
        if (alignment2 != null) {
            c1374cY.A0E(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(A0K);
        if (bitmap != null) {
            c1374cY.A0D(bitmap);
        }
        if (bundle.containsKey(A0M) && bundle.containsKey(A0O)) {
            c1374cY.A07(bundle.getFloat(A0M), bundle.getInt(A0O));
        }
        if (bundle.containsKey(A0N)) {
            c1374cY.A09(bundle.getInt(A0N));
        }
        if (bundle.containsKey(A0Q)) {
            c1374cY.A04(bundle.getFloat(A0Q));
        }
        if (bundle.containsKey(A0R)) {
            c1374cY.A0A(bundle.getInt(A0R));
        }
        if (bundle.containsKey(A0W) && bundle.containsKey(A0X)) {
            c1374cY.A08(bundle.getFloat(A0W), bundle.getInt(A0X));
        }
        if (bundle.containsKey(A0T)) {
            c1374cY.A06(bundle.getFloat(A0T));
        }
        boolean zContainsKey = bundle.containsKey(A0L);
        if (A0H[1].charAt(11) == 'w') {
            throw new RuntimeException();
        }
        String[] strArr = A0H;
        strArr[5] = "8g4NC67KOuH4JjazyKNzLoPpVu9Yvg5h";
        strArr[7] = "NciJvHe4JsjLjcRh53hpCeauHFN7Fx6s";
        if (zContainsKey) {
            c1374cY.A03(bundle.getFloat(A0L));
        }
        if (bundle.containsKey(A0Z)) {
            c1374cY.A0C(bundle.getInt(A0Z));
        }
        if (!bundle.getBoolean(A0a, false)) {
            c1374cY.A02();
        }
        if (bundle.containsKey(A0Y)) {
            c1374cY.A0B(bundle.getInt(A0Y));
        }
        if (bundle.containsKey(A0S)) {
            c1374cY.A05(bundle.getFloat(A0S));
        }
        C0982Qh c0982QhA0H = c1374cY.A0H();
        String[] strArr2 = A0H;
        if (strArr2[3].length() != strArr2[6].length()) {
            String[] strArr3 = A0H;
            strArr3[5] = "iFzOiQN4WNp6uTEvwqKIawPHqFuQG2r7";
            strArr3[7] = "Mj2Pqz2der90hE0yKzXorbLtsVZt6uPQ";
            return c0982QhA0H;
        }
        String[] strArr4 = A0H;
        strArr4[3] = "HbZYQunlkLAkOS7qKxYKapXeZtQu";
        strArr4[6] = "lqDfmjBFsKExcRkuXM0v0QxVAKug";
        return c0982QhA0H;
    }

    public final C1374cY A02() {
        return new C1374cY(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0982Qh c0982Qh = (C0982Qh) obj;
        if (TextUtils.equals(this.A0F, c0982Qh.A0F) && this.A0E == c0982Qh.A0E && this.A0D == c0982Qh.A0D && (this.A0C != null ? !(c0982Qh.A0C == null || !this.A0C.sameAs(c0982Qh.A0C)) : c0982Qh.A0C == null) && this.A01 == c0982Qh.A01 && this.A07 == c0982Qh.A07 && this.A06 == c0982Qh.A06 && this.A02 == c0982Qh.A02 && this.A08 == c0982Qh.A08 && this.A04 == c0982Qh.A04 && this.A00 == c0982Qh.A00) {
            boolean z = this.A0G;
            boolean z2 = c0982Qh.A0G;
            String[] strArr = A0H;
            if (strArr[5].charAt(5) == strArr[7].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[4] = "MkONXW3pK85XIeK1QgKlM8YJXKXZ4AkU";
            strArr2[2] = "yQGUJBbnVBZoZa5qwXV9Wub8EsO8Vlj5";
            if (z == z2 && this.A0B == c0982Qh.A0B && this.A09 == c0982Qh.A09 && this.A05 == c0982Qh.A05 && this.A0A == c0982Qh.A0A && this.A03 == c0982Qh.A03) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0942Or.A00(this.A0F, this.A0E, this.A0D, this.A0C, Float.valueOf(this.A01), Integer.valueOf(this.A07), Integer.valueOf(this.A06), Float.valueOf(this.A02), Integer.valueOf(this.A08), Float.valueOf(this.A04), Float.valueOf(this.A00), Boolean.valueOf(this.A0G), Integer.valueOf(this.A0B), Integer.valueOf(this.A09), Float.valueOf(this.A05), Integer.valueOf(this.A0A), Float.valueOf(this.A03));
    }
}
