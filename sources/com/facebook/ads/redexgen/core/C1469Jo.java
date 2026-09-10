package com.facebook.ads.redexgen.core;

import android.text.Layout;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1469Jo {
    public static final Comparator<C1469Jo> A02 = new Comparator() { // from class: com.facebook.ads.redexgen.X.Jn
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C1469Jo) obj2).A00, ((C1469Jo) obj).A00);
        }
    };
    public final int A00;
    public final C2810pT A01;

    public C1469Jo(CharSequence charSequence, Layout.Alignment alignment, float f, int i2, int i3, float f2, int i4, float f3, boolean z2, int i5, int i6) {
        C10743o cueBuilder = new C10743o().A0G(charSequence).A0F(alignment).A07(f, i2).A09(i3).A04(f2).A0A(i4).A06(f3);
        if (z2) {
            cueBuilder.A0C(i5);
        }
        this.A01 = cueBuilder.A0H();
        this.A00 = i6;
    }
}
