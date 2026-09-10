package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9H, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C9H {
    public static byte[] A0A;
    public static String[] A0B = {"rRI8qFzkORd3qFRWXYKq4VZ7aOLIEK5J", "8iww", "9Fk01UJleHjJYWOvUCOjDovINy", "Tv7H9N81DtUxkF43CmkgrLrGhTLdsXix", "nBkKdwNSwO57UCO3SoKJGDMTXuqjBDbM", "lOXwNuIjFjHmQAdnwK2N8OZR9kPb", "lPFUJhDD1cvxNL1LCxfPRC2f3Pky1Kvn", "6r"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final C2860qI A07;
    public final boolean A08;
    public final InterfaceC10703k[] A09;

    public static String A06(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 4);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0A = new byte[]{5, 36, 39, 32, 52, 45, 53, 0, 52, 37, 40, 46, 18, 40, 47, 42, 40, 63, 35, 38, 46, 11, 63, 46, 35, 37, 30, 56, 43, 41, 33, 112, 106, 57, 62, 43, 62, 47, 119, 111, 46, 102, 106, 43, 63, 46, 35, 37, 30, 56, 43, 41, 33, 11, 38, 38, 37, 41, 43, 62, 47, 46, 100, 45, 47, 62, 98, 99, 119, 111, 46};
    }

    static {
        A07();
    }

    public C9H(C2860qI c2860qI, int i2, int i3, int i4, int i5, int i6, int i7, int i8, InterfaceC10703k[] interfaceC10703kArr, boolean z2) {
        this.A07 = c2860qI;
        this.A01 = i2;
        this.A04 = i3;
        this.A05 = i4;
        this.A06 = i5;
        this.A02 = i6;
        this.A03 = i7;
        this.A00 = i8;
        this.A09 = interfaceC10703kArr;
        this.A08 = z2;
    }

    public static AudioAttributes A00() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    public static AudioAttributes A01(C2866qQ c2866qQ, boolean z2) {
        if (z2) {
            return A00();
        }
        return c2866qQ.A01().A00;
    }

    private AudioTrack A02(C2866qQ c2866qQ, int i2) {
        int iA04 = C5C.A04(c2866qQ.A05);
        if (i2 != 0) {
            return new AudioTrack(iA04, this.A06, this.A02, this.A03, this.A00, 1, i2);
        }
        return new AudioTrack(iA04, this.A06, this.A02, this.A03, this.A00, 1);
    }

    private AudioTrack A03(boolean z2, C2866qQ c2866qQ, int i2) {
        if (C5C.A02 >= 29) {
            return A05(z2, c2866qQ, i2);
        }
        if (C5C.A02 >= 21) {
            return A04(z2, c2866qQ, i2);
        }
        AudioTrack audioTrackA02 = A02(c2866qQ, i2);
        String[] strArr = A0B;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0B;
        strArr2[5] = "QYyaIvQJX9uBRZ92y0XmWMx9BnIt";
        strArr2[7] = "OM";
        return audioTrackA02;
    }

    private AudioTrack A04(boolean z2, C2866qQ c2866qQ, int i2) {
        return new AudioTrack(A01(c2866qQ, z2), C2741oM.A0D(this.A06, this.A02, this.A03), this.A00, 1, i2);
    }

    private AudioTrack A05(boolean z2, C2866qQ c2866qQ, int i2) {
        AudioFormat audioFormatA0D = C2741oM.A0D(this.A06, this.A02, this.A03);
        AudioAttributes audioTrackAttributes = A01(c2866qQ, z2);
        AudioTrack.Builder audioFormat = new AudioTrack.Builder().setAudioAttributes(audioTrackAttributes).setAudioFormat(audioFormatA0D);
        boolean z3 = true;
        AudioTrack.Builder sessionId = audioFormat.setTransferMode(1).setBufferSizeInBytes(this.A00).setSessionId(i2);
        if (this.A04 != 1) {
            z3 = false;
        }
        AudioTrack audioTrackBuild = sessionId.setOffloadedPlayback(z3).build();
        String[] strArr = A0B;
        if (strArr[4].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        A0B[1] = "btQ69Jh";
        return audioTrackBuild;
    }

    public final long A08(long j) {
        return (1000000 * j) / ((long) this.A06);
    }

    public final long A09(long j) {
        return (1000000 * j) / ((long) this.A07.A0G);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "D23918943: Monitor the audio track usage through audioTrackAllocated")
    public final AudioTrack A0A(boolean z2, C2866qQ c2866qQ, int i2) throws C12078t {
        try {
            AudioTrack audioTrackA03 = A03(z2, c2866qQ, i2);
            C2741oM.A0M().incrementAndGet();
            int state = audioTrackA03.getState();
            if (state == 1) {
                return audioTrackA03;
            }
            try {
                audioTrackA03.release();
                C2741oM.A0M().decrementAndGet();
            } catch (Exception e2) {
                AbstractC10924g.A08(A06(0, 16, 69), String.format(A06(16, 55, 78), Integer.valueOf(state), Integer.valueOf(C2741oM.A0M().get())), e2);
            }
            throw new C12078t(state, this.A06, this.A02, this.A00, this.A07, A0D(), null, C2741oM.A0M().get());
        } catch (IllegalArgumentException | UnsupportedOperationException e3) {
            throw new C12078t(0, this.A06, this.A02, this.A00, this.A07, A0D(), e3, C2741oM.A0M().get());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.8r] */
    public final C12058r A0B() {
        final int i2 = this.A03;
        final int i3 = this.A06;
        final int i4 = this.A02;
        final boolean z2 = this.A08;
        final boolean z3 = this.A04 == 1;
        final int i5 = this.A00;
        return new Object(i2, i3, i4, z2, z3, i5) { // from class: com.facebook.ads.redexgen.X.8r
            public final int A00;
            public final int A01;
            public final int A02;
            public final int A03;
            public final boolean A04;
            public final boolean A05;

            {
                this.A02 = i2;
                this.A03 = i3;
                this.A01 = i4;
                this.A05 = z2;
                this.A04 = z3;
                this.A00 = i5;
            }
        };
    }

    public final C9H A0C(int i2) {
        return new C9H(this.A07, this.A01, this.A04, this.A05, this.A06, this.A02, this.A03, i2, this.A09, this.A08);
    }

    public final boolean A0D() {
        return this.A04 == 1;
    }

    public final boolean A0E(C9H c9h) {
        return c9h.A04 == this.A04 && c9h.A03 == this.A03 && c9h.A06 == this.A06 && c9h.A02 == this.A02 && c9h.A05 == this.A05;
    }
}
