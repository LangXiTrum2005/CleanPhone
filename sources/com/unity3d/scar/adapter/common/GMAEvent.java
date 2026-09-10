package com.unity3d.scar.adapter.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class GMAEvent {
    public static final GMAEvent A0;
    public static final GMAEvent B0;
    public static final GMAEvent C0;
    public static final GMAEvent D0;
    public static final GMAEvent E0;
    public static final GMAEvent F0;
    public static final GMAEvent G0;
    public static final /* synthetic */ GMAEvent[] H0;
    public static final GMAEvent X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final GMAEvent f42784Y;
    public static final GMAEvent Z;
    public static final GMAEvent e0;
    public static final GMAEvent f0;
    public static final GMAEvent g0;
    public static final GMAEvent h0;
    public static final GMAEvent i0;
    public static final GMAEvent j0;
    public static final GMAEvent k0;
    public static final GMAEvent l0;
    public static final GMAEvent m0;
    public static final GMAEvent n0;
    public static final GMAEvent o0;
    public static final GMAEvent p0;
    public static final GMAEvent q0;
    public static final GMAEvent r0;
    public static final GMAEvent s0;
    public static final GMAEvent t0;
    public static final GMAEvent u0;
    public static final GMAEvent v0;
    public static final GMAEvent w0;
    public static final GMAEvent x0;
    public static final GMAEvent y0;
    public static final GMAEvent z0;

    static {
        GMAEvent gMAEvent = new GMAEvent("SCAR_PRESENT", 0);
        X = gMAEvent;
        GMAEvent gMAEvent2 = new GMAEvent("SCAR_NOT_PRESENT", 1);
        f42784Y = gMAEvent2;
        GMAEvent gMAEvent3 = new GMAEvent("ALREADY_INITIALIZED", 2);
        Z = gMAEvent3;
        GMAEvent gMAEvent4 = new GMAEvent("INIT_SUCCESS", 3);
        e0 = gMAEvent4;
        GMAEvent gMAEvent5 = new GMAEvent("INIT_ERROR", 4);
        f0 = gMAEvent5;
        GMAEvent gMAEvent6 = new GMAEvent("VERSION", 5);
        g0 = gMAEvent6;
        GMAEvent gMAEvent7 = new GMAEvent("SCAR_UNSUPPORTED", 6);
        h0 = gMAEvent7;
        GMAEvent gMAEvent8 = new GMAEvent("SIGNALS", 7);
        i0 = gMAEvent8;
        GMAEvent gMAEvent9 = new GMAEvent("SIGNALS_ERROR", 8);
        j0 = gMAEvent9;
        GMAEvent gMAEvent10 = new GMAEvent("INTERNAL_SIGNALS_ERROR", 9);
        k0 = gMAEvent10;
        GMAEvent gMAEvent11 = new GMAEvent("AD_LOADED", 10);
        l0 = gMAEvent11;
        GMAEvent gMAEvent12 = new GMAEvent("INTERSTITIAL_IMPRESSION_RECORDED", 11);
        m0 = gMAEvent12;
        GMAEvent gMAEvent13 = new GMAEvent("REWARDED_IMPRESSION_RECORDED", 12);
        n0 = gMAEvent13;
        GMAEvent gMAEvent14 = new GMAEvent("INTERNAL_LOAD_ERROR", 13);
        o0 = gMAEvent14;
        GMAEvent gMAEvent15 = new GMAEvent("QUERY_NOT_FOUND_ERROR", 14);
        GMAEvent gMAEvent16 = new GMAEvent("LOAD_ERROR", 15);
        p0 = gMAEvent16;
        GMAEvent gMAEvent17 = new GMAEvent("NO_AD_ERROR", 16);
        q0 = gMAEvent17;
        GMAEvent gMAEvent18 = new GMAEvent("AD_STARTED", 17);
        r0 = gMAEvent18;
        GMAEvent gMAEvent19 = new GMAEvent("INTERNAL_SHOW_ERROR", 18);
        s0 = gMAEvent19;
        GMAEvent gMAEvent20 = new GMAEvent("AD_NOT_LOADED_ERROR", 19);
        t0 = gMAEvent20;
        GMAEvent gMAEvent21 = new GMAEvent("REWARDED_SHOW_ERROR", 20);
        u0 = gMAEvent21;
        GMAEvent gMAEvent22 = new GMAEvent("INTERSTITIAL_SHOW_ERROR", 21);
        v0 = gMAEvent22;
        GMAEvent gMAEvent23 = new GMAEvent("FIRST_QUARTILE", 22);
        w0 = gMAEvent23;
        GMAEvent gMAEvent24 = new GMAEvent("MIDPOINT", 23);
        x0 = gMAEvent24;
        GMAEvent gMAEvent25 = new GMAEvent("THIRD_QUARTILE", 24);
        y0 = gMAEvent25;
        GMAEvent gMAEvent26 = new GMAEvent("LAST_QUARTILE", 25);
        z0 = gMAEvent26;
        GMAEvent gMAEvent27 = new GMAEvent("AD_EARNED_REWARD", 26);
        A0 = gMAEvent27;
        GMAEvent gMAEvent28 = new GMAEvent("AD_CLICKED", 27);
        B0 = gMAEvent28;
        GMAEvent gMAEvent29 = new GMAEvent("AD_SKIPPED", 28);
        C0 = gMAEvent29;
        GMAEvent gMAEvent30 = new GMAEvent("AD_LEFT_APPLICATION", 29);
        D0 = gMAEvent30;
        GMAEvent gMAEvent31 = new GMAEvent("AD_CLOSED", 30);
        E0 = gMAEvent31;
        GMAEvent gMAEvent32 = new GMAEvent("METHOD_ERROR", 31);
        F0 = gMAEvent32;
        GMAEvent gMAEvent33 = new GMAEvent("BANNER", 32);
        G0 = gMAEvent33;
        H0 = new GMAEvent[]{gMAEvent, gMAEvent2, gMAEvent3, gMAEvent4, gMAEvent5, gMAEvent6, gMAEvent7, gMAEvent8, gMAEvent9, gMAEvent10, gMAEvent11, gMAEvent12, gMAEvent13, gMAEvent14, gMAEvent15, gMAEvent16, gMAEvent17, gMAEvent18, gMAEvent19, gMAEvent20, gMAEvent21, gMAEvent22, gMAEvent23, gMAEvent24, gMAEvent25, gMAEvent26, gMAEvent27, gMAEvent28, gMAEvent29, gMAEvent30, gMAEvent31, gMAEvent32, gMAEvent33};
    }

    public static GMAEvent valueOf(String str) {
        return (GMAEvent) Enum.valueOf(GMAEvent.class, str);
    }

    public static GMAEvent[] values() {
        return (GMAEvent[]) H0.clone();
    }
}
