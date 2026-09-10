package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.nR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2685nR implements InterfaceC1339Em {
    public static String[] A0B = {"ziZaTeBfSFNnIBcgtlZExnB4uOVj2q5B", "5IZt5NWgPCitKNTqtiA", "aLHVXVzU6ljMUMq9dZgrDfQ8JzHl8MF", "mvLcqO7QF6VGSUKAdCZC8bhhp8aLucng", "FQUZNhR4lN6thgMMBkcdaTgoY6ZzypcM", "72R8UBsha86AOqtb805OpiOBiH7oe8El", "AjNBccUrYW9zDFgtuo7TyJwkSvkBJU7y", "GkSBWsvGG5dBFRJxqtw9GV4lDtiTWOM"};
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final AnonymousClass45 A08;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final F6 A09;
    public final int A0A;

    public C2685nR() {
        this(10000, 25000, 25000, 0.75f);
    }

    public C2685nR(int i2, int i3, int i4, float f) {
        this(null, -1, i2, i3, i4, 1279, 719, f, 0.75f, 2000L, AnonymousClass45.A00);
    }

    public C2685nR(F6 f6) {
        this(f6, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, AnonymousClass45.A00);
    }

    public C2685nR(@MetaExoPlayerCustomization("No longer set through factory") F6 f6, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i2, @MetaExoPlayerCustomization("Removed from upstream") int i3, int i4, int i5, int i6, int i7, float f, float f2, long j, AnonymousClass45 anonymousClass45) {
        this.A09 = f6;
        this.A0A = i2;
        this.A05 = i3;
        this.A02 = i4;
        this.A06 = i5;
        this.A04 = i6;
        this.A03 = i7;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = j;
        this.A08 = anonymousClass45;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C10121a A00(C2823pg c2823pg, int[] iArr, int i2, F6 f6, BP<EU> bp) {
        return new C10121a(c2823pg, iArr, i2, f6, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, bp, this.A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1339Em
    public final InterfaceC2672nE[] A5b(C1338El[] c1338ElArr, F6 f6, C2708no c2708no, Timeline timeline) {
        InterfaceC2672nE interfaceC2672nEA00;
        BP bpA00 = C10121a.A00(c1338ElArr);
        InterfaceC2672nE[] interfaceC2672nEArr = new InterfaceC2672nE[c1338ElArr.length];
        for (int i2 = 0; i2 < c1338ElArr.length; i2++) {
            C1338El c1338El = c1338ElArr[i2];
            if (c1338El != null && c1338El.A02.length != 0) {
                int length = c1338El.A02.length;
                if (A0B[3].length() != 32) {
                    throw new RuntimeException();
                }
                A0B[1] = "4JDRhnBkti3";
                if (length == 1) {
                    interfaceC2672nEA00 = new C1Z(c1338El.A01, c1338El.A02[0], c1338El.A00);
                } else {
                    interfaceC2672nEA00 = A00(c1338El.A01, c1338El.A02, c1338El.A00, f6, (BP) bpA00.get(i2));
                }
                interfaceC2672nEArr[i2] = interfaceC2672nEA00;
            }
        }
        return interfaceC2672nEArr;
    }
}
