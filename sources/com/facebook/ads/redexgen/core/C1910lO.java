package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1910lO implements C4R {
    public static String[] A02 = {"gru2Lda4S7GCbNBLtOIdQEnlbYeRFwfL", "XnGCgKT7Pg2", "mKUX8sgZfunspLF5wjmFH8sDBtb3K48d", "jKk7kH4cQGBiDg5TKe33YqGV3AsPygQR", "TZdQK9usf81OKXIWMb61JsmxOZFMnA3k", "eyC2dzaRwXiJKVGsgdgz1meLL5sRgImY", "S4mkNNYHIh7xNNZ0OEskqLhCY0hDyySt", "ZXfiglEYlIOoTIuj216uQxYNuz12aQjw"};
    public final Rect A00 = new Rect();
    public final /* synthetic */ C04604v A01;

    public C1910lO(C04604v c04604v) {
        this.A01 = c04604v;
    }

    @Override // com.facebook.ads.redexgen.core.C4R
    public final C04634y ACE(View view, C04634y c04634y) {
        C04634y c04634yA06 = C4h.A06(view, c04634y);
        if (c04634yA06.A07()) {
            return c04634yA06;
        }
        Rect rect = this.A00;
        rect.left = c04634yA06.A03();
        rect.top = c04634yA06.A05();
        rect.right = c04634yA06.A04();
        rect.bottom = c04634yA06.A02();
        int count = this.A01.getChildCount();
        for (int i = 0; i < count; i++) {
            C04634y c04634yA05 = C4h.A05(this.A01.getChildAt(i), c04634yA06);
            rect.left = Math.min(c04634yA05.A03(), rect.left);
            rect.top = Math.min(c04634yA05.A05(), rect.top);
            rect.right = Math.min(c04634yA05.A04(), rect.right);
            rect.bottom = Math.min(c04634yA05.A02(), rect.bottom);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        if (A02[1].length() != 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "4mRHs0uPE72ppwyI9I2NgTpzqE63n9j5";
        strArr[2] = "Zp0DshFYJF7gm0rY227qRNMYobzVhEjB";
        C04634y applied = c04634yA06.A06(i2, i3, i4, i5);
        return applied;
    }
}
