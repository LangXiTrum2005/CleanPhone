package com.unity3d.scar.adapter.common;

import com.ironsource.mediationsdk.j;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public static final b A;
    public static final b B;
    public static final b C;
    public static final b D;
    public static final b E;
    public static final b F;
    public static final /* synthetic */ b[] G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f38557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f38558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f38559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f38560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f38561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f38562f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f38563g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f38564h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f38565i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f38566j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f38567k;
    public static final b l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f38568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final b f38569n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f38570o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f38571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f38572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f38573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f38574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f38575t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f38576u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f38577v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f38578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f38579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f38580y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f38581z;

    static {
        b bVar = new b("SCAR_PRESENT", 0);
        f38557a = bVar;
        b bVar2 = new b("SCAR_NOT_PRESENT", 1);
        f38558b = bVar2;
        b bVar3 = new b("ALREADY_INITIALIZED", 2);
        f38559c = bVar3;
        b bVar4 = new b("INIT_SUCCESS", 3);
        f38560d = bVar4;
        b bVar5 = new b("INIT_ERROR", 4);
        f38561e = bVar5;
        b bVar6 = new b("VERSION", 5);
        f38562f = bVar6;
        b bVar7 = new b("SCAR_UNSUPPORTED", 6);
        f38563g = bVar7;
        b bVar8 = new b("SIGNALS", 7);
        f38564h = bVar8;
        b bVar9 = new b("SIGNALS_ERROR", 8);
        f38565i = bVar9;
        b bVar10 = new b("INTERNAL_SIGNALS_ERROR", 9);
        f38566j = bVar10;
        b bVar11 = new b("AD_LOADED", 10);
        f38567k = bVar11;
        b bVar12 = new b("INTERSTITIAL_IMPRESSION_RECORDED", 11);
        l = bVar12;
        b bVar13 = new b("REWARDED_IMPRESSION_RECORDED", 12);
        f38568m = bVar13;
        b bVar14 = new b("INTERNAL_LOAD_ERROR", 13);
        f38569n = bVar14;
        b bVar15 = new b("QUERY_NOT_FOUND_ERROR", 14);
        b bVar16 = new b("LOAD_ERROR", 15);
        f38570o = bVar16;
        b bVar17 = new b("NO_AD_ERROR", 16);
        f38571p = bVar17;
        b bVar18 = new b("AD_STARTED", 17);
        f38572q = bVar18;
        b bVar19 = new b("INTERNAL_SHOW_ERROR", 18);
        f38573r = bVar19;
        b bVar20 = new b("AD_NOT_LOADED_ERROR", 19);
        f38574s = bVar20;
        b bVar21 = new b("REWARDED_SHOW_ERROR", 20);
        f38575t = bVar21;
        b bVar22 = new b("INTERSTITIAL_SHOW_ERROR", 21);
        f38576u = bVar22;
        b bVar23 = new b("FIRST_QUARTILE", 22);
        f38577v = bVar23;
        b bVar24 = new b("MIDPOINT", 23);
        f38578w = bVar24;
        b bVar25 = new b("THIRD_QUARTILE", 24);
        f38579x = bVar25;
        b bVar26 = new b("LAST_QUARTILE", 25);
        f38580y = bVar26;
        b bVar27 = new b("AD_EARNED_REWARD", 26);
        f38581z = bVar27;
        b bVar28 = new b("AD_CLICKED", 27);
        A = bVar28;
        b bVar29 = new b("AD_SKIPPED", 28);
        B = bVar29;
        b bVar30 = new b("AD_LEFT_APPLICATION", 29);
        C = bVar30;
        b bVar31 = new b("AD_CLOSED", 30);
        D = bVar31;
        b bVar32 = new b("METHOD_ERROR", 31);
        E = bVar32;
        b bVar33 = new b(j.f29553a, 32);
        F = bVar33;
        G = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15, bVar16, bVar17, bVar18, bVar19, bVar20, bVar21, bVar22, bVar23, bVar24, bVar25, bVar26, bVar27, bVar28, bVar29, bVar30, bVar31, bVar32, bVar33};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) G.clone();
    }
}
