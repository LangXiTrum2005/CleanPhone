package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.smartdigimkt.m3.h;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2781p0 extends AbstractC11325u {
    public static byte[] A08;
    public static String[] A09 = {"2IbL45Ge7WjUS4gtY5SZcZFVqhRirSld", "R240sFcJ0pzYp66WnJ67Fmsy55XV16O5", h.f36614b, "VUex99WpL2gwlvzu7iug41y", "F", "dnMRZWWEUUUJRwdjb1Aq9wn", "Gu9WZr0VQrtP2JtflAIpRNlkyE1rsTK5", "oyOSTbE54dsFuYwfZhcf3OLki3UIwS0J"};

    @MetaExoPlayerCustomization("Keep track of the non-adjusted timestamp")
    public long A00;
    public long A01;
    public ByteBuffer A02;
    public ByteBuffer A03;
    public boolean A04;
    public final C11375z A05;
    public final int A06;
    public final int A07;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 25);
            if (A09[2].length() == 11) {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[1] = "TMnkcu7Wbc02Avo68LXTGXdgCiHDzCoJ";
            strArr[6] = "32B0HSZuRu1EwrCyQNusNP3p455vxDa3";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A08 = new byte[]{40, 32, 32, 40, 97, 42, 55, 32, 97, 43, 42, 44, 32, 43, 42, 61};
    }

    static {
        A05();
        AnonymousClass35.A03(A03(0, 16, 86));
    }

    public C2781p0(int i2) {
        this(i2, 0);
    }

    public C2781p0(int i2, int i3) {
        this.A05 = new C11375z();
        this.A06 = i2;
        this.A07 = i3;
    }

    public static C2781p0 A02() {
        return new C2781p0(0);
    }

    private ByteBuffer A04(final int i2) {
        if (this.A06 == 1) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
            if (A09[2].length() != 11) {
                A09[2] = "";
                return byteBufferAllocate;
            }
        } else {
            int i3 = this.A06;
            if (A09[2].length() != 11) {
                String[] strArr = A09;
                strArr[7] = "Xhbg2bf7wDHhg84e2eXJTK6LXJwKWSr7";
                strArr[0] = "Xvqd08ordVMo4CmGxDs2k5pAuekgSSjU";
                if (i3 == 2) {
                    return ByteBuffer.allocateDirect(i2);
                }
                final int iCapacity = this.A02 == null ? 0 : this.A02.capacity();
                throw new IllegalStateException(iCapacity, i2) { // from class: com.facebook.ads.redexgen.X.63
                    public static byte[] A02;
                    public final int A00;
                    public final int A01;

                    static {
                        A01();
                    }

                    public static String A00(int i4, int i5, int i6) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i5);
                        for (int i7 = 0; i7 < bArrCopyOfRange.length; i7++) {
                            bArrCopyOfRange[i7] = (byte) ((bArrCopyOfRange[i7] - i6) - 17);
                        }
                        return new String(bArrCopyOfRange);
                    }

                    public static void A01() {
                        A02 = new byte[]{-118, -90, -118, -84, -87, -36, -51, -51, -52, -39, -121, -37, -42, -42, -121, -38, -44, -56, -45, -45, -121, -113};
                    }

                    {
                        super(A00(4, 18, 86) + iCapacity + A00(0, 3, 89) + i2 + A00(3, 1, 114));
                        this.A00 = iCapacity;
                        this.A01 = i2;
                    }
                };
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC11325u
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
    public final void A0C(int i2) {
        int i3 = i2 + this.A07;
        ByteBuffer newData = this.A02;
        if (newData == null) {
            ByteBuffer currentData = A04(i3);
            this.A02 = currentData;
            return;
        }
        int position = newData.capacity();
        int capacity = newData.position();
        int i4 = capacity + i3;
        if (position >= i4) {
            this.A02 = newData;
            return;
        }
        ByteBuffer byteBufferA04 = A04(i4);
        byteBufferA04.order(newData.order());
        if (capacity > 0) {
            newData.flip();
            String[] strArr = A09;
            if (strArr[7].charAt(29) != strArr[0].charAt(29)) {
                throw new RuntimeException();
            }
            A09[3] = "fNtiW8alSIVNhAh4w2LF63Pxxp";
            byteBufferA04.put(newData);
        }
        this.A02 = byteBufferA04;
    }

    @EnsuresNonNull({"supplementalData"})
    public final void A0D(int i2) {
        if (this.A03 == null || this.A03.capacity() < i2) {
            this.A03 = ByteBuffer.allocate(i2);
        } else {
            this.A03.clear();
        }
    }

    public final boolean A0E() {
        return A09(1073741824);
    }
}
