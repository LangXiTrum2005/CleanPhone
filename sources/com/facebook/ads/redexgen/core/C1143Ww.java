package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ww, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1143Ww extends AbstractC1031Sf {
    public static byte[] A08;
    public static String[] A09 = {"1PL2Y4Pi", "rHhy", "VqIrJ5UEaEPRrUaVlihlnOj4AVZsYSrB", "EcVmkXNkGi2G1Rc27fjMehVbck5hCefs", "uAN33ASfmS0JMPy7yuPCyjdqXVu1J4SV", "ry5pyEhAEtXMXTcUkJuFrKVwBMoqj9HE", "N5j4BZMkzk92Ajy5OzTXdEIVQTNDaWom", "5ShEbue2K"};

    @MetaExoPlayerCustomization("Keep track of the non-adjusted timestamp")
    public long A00;
    public long A01;
    public ByteBuffer A02;
    public ByteBuffer A03;
    public boolean A04;
    public final C1036Sk A05;
    public final int A06;
    public final int A07;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A08 = new byte[]{-19, -11, -11, -19, -76, -21, -2, -11, -76, -22, -21, -23, -11, -22, -21, -8};
    }

    static {
        A05();
        PS.A03(A03(0, 16, 16));
    }

    public C1143Ww(int i) {
        this(i, 0);
    }

    public C1143Ww(int i, int i2) {
        this.A05 = new C1036Sk();
        this.A06 = i;
        this.A07 = i2;
    }

    public static C1143Ww A02() {
        return new C1143Ww(0);
    }

    private ByteBuffer A04(int i) {
        if (this.A06 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (this.A06 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.A02;
        String[] strArr = A09;
        if (strArr[0].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[2] = "zkaJ8ixLuilEK0maQq8JVH1jkM9A5ZSA";
        strArr2[4] = "GjTkljrbUrNZqXRPfdy2leVkPGLhHC7g";
        throw new C1040So(byteBuffer == null ? 0 : this.A02.capacity(), i);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1031Sf
    public void A0A() {
        super.A0A();
        if (this.A02 != null) {
            this.A02.clear();
        }
        if (this.A03 != null) {
            this.A03.clear();
        }
        this.A04 = false;
    }

    public final void A0B() {
        if (this.A02 != null) {
            this.A02.flip();
        }
        if (this.A03 != null) {
            this.A03.flip();
        }
    }

    @EnsuresNonNull({"data"})
    public final void A0C(int i) {
        int i2 = i + this.A07;
        ByteBuffer byteBuffer = this.A02;
        if (byteBuffer == null) {
            ByteBuffer currentData = A04(i2);
            this.A02 = currentData;
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = position + i2;
        if (capacity >= i3) {
            this.A02 = byteBuffer;
            return;
        }
        ByteBuffer byteBufferA04 = A04(i3);
        byteBufferA04.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            byteBufferA04.put(byteBuffer);
        }
        this.A02 = byteBufferA04;
    }

    @EnsuresNonNull({"supplementalData"})
    public final void A0D(int i) {
        if (this.A03 == null || this.A03.capacity() < i) {
            this.A03 = ByteBuffer.allocate(i);
        } else {
            this.A03.clear();
        }
    }

    public final boolean A0E() {
        return A09(1073741824);
    }
}
