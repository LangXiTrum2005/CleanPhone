package com.google.zxing.common.reedsolomon;

import android.support.v4.media.a;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class GenericGF {
    public static final GenericGF g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f21348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final GenericGFPoly f21350c;
    public final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21351e;
    public final int f;

    static {
        new GenericGF(4201, 4096, 1);
        new GenericGF(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT, 1024, 1);
        new GenericGF(67, 64, 1);
        new GenericGF(19, 16, 1);
        g = new GenericGF(285, 256, 0);
        new GenericGF(301, 256, 1);
    }

    public GenericGF(int i2, int i3, int i4) {
        this.f21351e = i2;
        this.d = i3;
        this.f = i4;
        this.f21348a = new int[i3];
        this.f21349b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.f21348a[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.f21349b[this.f21348a[i7]] = i7;
        }
        this.f21350c = new GenericGFPoly(this, new int[]{0});
        new GenericGFPoly(this, new int[]{1});
    }

    public final int a(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.f21349b;
        return this.f21348a[(iArr[i2] + iArr[i3]) % (this.d - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f21351e));
        sb.append(AbstractJsonLexerKt.COMMA);
        return a.p(sb, this.d, ')');
    }
}
