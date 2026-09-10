package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.ViewCompat;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1374cY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Bitmap A0C;
    public Layout.Alignment A0D;
    public Layout.Alignment A0E;
    public CharSequence A0F;
    public boolean A0G;

    public C1374cY() {
        this.A0F = null;
        this.A0C = null;
        this.A0E = null;
        this.A0D = null;
        this.A01 = -3.4028235E38f;
        this.A07 = Integer.MIN_VALUE;
        this.A06 = Integer.MIN_VALUE;
        this.A02 = -3.4028235E38f;
        this.A08 = Integer.MIN_VALUE;
        this.A09 = Integer.MIN_VALUE;
        this.A05 = -3.4028235E38f;
        this.A04 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        this.A0G = false;
        this.A0B = ViewCompat.MEASURED_STATE_MASK;
        this.A0A = Integer.MIN_VALUE;
    }

    public C1374cY(C0982Qh c0982Qh) {
        this.A0F = c0982Qh.A0F;
        this.A0C = c0982Qh.A0C;
        this.A0E = c0982Qh.A0E;
        this.A0D = c0982Qh.A0D;
        this.A01 = c0982Qh.A01;
        this.A07 = c0982Qh.A07;
        this.A06 = c0982Qh.A06;
        this.A02 = c0982Qh.A02;
        this.A08 = c0982Qh.A08;
        this.A09 = c0982Qh.A09;
        this.A05 = c0982Qh.A05;
        this.A04 = c0982Qh.A04;
        this.A00 = c0982Qh.A00;
        this.A0G = c0982Qh.A0G;
        this.A0B = c0982Qh.A0B;
        this.A0A = c0982Qh.A0A;
        this.A03 = c0982Qh.A03;
    }

    @Pure
    public final int A00() {
        return this.A06;
    }

    @Pure
    public final int A01() {
        return this.A08;
    }

    public final C1374cY A02() {
        this.A0G = false;
        return this;
    }

    public final C1374cY A03(float f) {
        this.A00 = f;
        return this;
    }

    public final C1374cY A04(float f) {
        this.A02 = f;
        return this;
    }

    public final C1374cY A05(float f) {
        this.A03 = f;
        return this;
    }

    public final C1374cY A06(float f) {
        this.A04 = f;
        return this;
    }

    public final C1374cY A07(float f, int i) {
        this.A01 = f;
        this.A07 = i;
        return this;
    }

    public final C1374cY A08(float f, int i) {
        this.A05 = f;
        this.A09 = i;
        return this;
    }

    public final C1374cY A09(int i) {
        this.A06 = i;
        return this;
    }

    public final C1374cY A0A(int i) {
        this.A08 = i;
        return this;
    }

    public final C1374cY A0B(int i) {
        this.A0A = i;
        return this;
    }

    public final C1374cY A0C(int i) {
        this.A0B = i;
        this.A0G = true;
        return this;
    }

    public final C1374cY A0D(Bitmap bitmap) {
        this.A0C = bitmap;
        return this;
    }

    public final C1374cY A0E(Layout.Alignment alignment) {
        this.A0D = alignment;
        return this;
    }

    public final C1374cY A0F(Layout.Alignment alignment) {
        this.A0E = alignment;
        return this;
    }

    public final C1374cY A0G(CharSequence charSequence) {
        this.A0F = charSequence;
        return this;
    }

    public final C0982Qh A0H() {
        return new C0982Qh(this.A0F, this.A0E, this.A0D, this.A0C, this.A01, this.A07, this.A06, this.A02, this.A08, this.A09, this.A05, this.A04, this.A00, this.A0G, this.A0B, this.A0A, this.A03);
    }

    @Pure
    public final CharSequence A0I() {
        return this.A0F;
    }
}
