package com.google.android.gms.internal.consent_sdk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f23275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y f23276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f23277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f23278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f23279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ y[] f23280f;

    /* JADX INFO: Fake field, exist only in values array */
    y EF0;

    static {
        y yVar = new y("DEBUG_PARAM_UNKNOWN", 0);
        y yVar2 = new y("ALWAYS_SHOW", 1);
        y yVar3 = new y("GEO_OVERRIDE_EEA", 2);
        f23275a = yVar3;
        y yVar4 = new y("GEO_OVERRIDE_REGULATED_US_STATE", 3);
        f23276b = yVar4;
        y yVar5 = new y("GEO_OVERRIDE_OTHER", 4);
        f23277c = yVar5;
        y yVar6 = new y("GEO_OVERRIDE_NON_EEA", 5);
        f23278d = yVar6;
        y yVar7 = new y("PREVIEWING_DEBUG_MESSAGES", 6);
        f23279e = yVar7;
        f23280f = new y[]{yVar, yVar2, yVar3, yVar4, yVar5, yVar6, yVar7, new y("GEO_OVERRIDE_USFL", 7)};
    }

    public static y[] values() {
        return (y[]) f23280f.clone();
    }
}
