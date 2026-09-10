package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C7Z {
    public static final C2708no A0E = new C2708no(new Object());
    public final int A00;
    public final long A01;
    public final long A02;
    public final Timeline A03;
    public final C2708no A04;
    public final C2708no A05;
    public final C2690nW A06;
    public final C1350Ex A07;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Start Stall Logging")
    public final EnumC2426ir A08;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "Determine if stall is from Audio for logging")
    public final boolean A09;
    public final boolean A0A;
    public volatile long A0B;
    public volatile long A0C;
    public volatile long A0D;

    public C7Z(Timeline timeline, long j, C2690nW c2690nW, C1350Ex c1350Ex) {
        this(timeline, A0E, j, -9223372036854775807L, 1, false, c2690nW, c1350Ex, A0E, j, j, j, EnumC2426ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to call base constructor")
    public C7Z(Timeline timeline, C2708no c2708no, long j, long j2, int i2, boolean z2, C2690nW c2690nW, C1350Ex c1350Ex, C2708no c2708no2, long j3, long j4, long j5) {
        this(timeline, c2708no, j, j2, i2, z2, c2690nW, c1350Ex, c2708no2, j3, j4, j5, EnumC2426ir.A09, false);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Customized to add new parameters")
    public C7Z(@MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) Timeline timeline, @MetaExoPlayerCustomization(type = {"NEW_METHOD_ARGS"}) C2708no c2708no, long j, long j2, int i2, boolean z2, C2690nW c2690nW, C1350Ex c1350Ex, C2708no c2708no2, long j3, long j4, long j5, EnumC2426ir enumC2426ir, boolean z3) {
        this.A03 = timeline;
        this.A05 = c2708no;
        this.A02 = j;
        this.A01 = j2;
        this.A0C = j;
        this.A00 = i2;
        this.A0A = z2;
        this.A06 = c2690nW;
        this.A07 = c1350Ex;
        this.A04 = c2708no2;
        this.A0B = j3;
        this.A0D = j4;
        this.A0C = j5;
        this.A08 = enumC2426ir;
        this.A09 = z3;
    }

    public static void A00(C7Z c7z, C7Z c7z2) {
        c7z2.A0C = c7z.A0C;
        c7z2.A0B = c7z.A0B;
        c7z2.A0D = c7z.A0D;
    }

    public final C7Z A01(int i2) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i2, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Stall Reason Logging in Hero")
    public final C7Z A02(int i2, EnumC2426ir enumC2426ir, boolean z2) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i2, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, enumC2426ir, z2);
        A00(this, c7z);
        return c7z;
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "To track Audio Stalls for Logging")
    public final C7Z A03(int i2, boolean z2) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, i2, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, z2);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A04(Timeline timeline) {
        C7Z c7z = new C7Z(timeline, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A05(C2708no c2708no) {
        return new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, this.A06, this.A07, c2708no, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
    }

    public final C7Z A06(C2708no c2708no, long j, long j2, long j3) {
        long j4 = j2;
        Timeline timeline = this.A03;
        if (!c2708no.A00()) {
            j4 = -9223372036854775807L;
        }
        return new C7Z(timeline, c2708no, j, j4, this.A00, this.A0A, this.A06, this.A07, this.A04, this.A0B, j3, j);
    }

    public final C7Z A07(C2690nW c2690nW, C1350Ex c1350Ex) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, this.A0A, c2690nW, c1350Ex, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }

    public final C7Z A08(boolean z2) {
        C7Z c7z = new C7Z(this.A03, this.A05, this.A02, this.A01, this.A00, z2, this.A06, this.A07, this.A04, this.A0B, this.A0D, this.A0C, this.A08, this.A09);
        A00(this, c7z);
        return c7z;
    }
}
