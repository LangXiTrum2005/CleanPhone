package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes3.dex */
public enum r {
    BANNER,
    INTERSTITIAL,
    REWARDED;

    public static final /* synthetic */ EnumEntries f = EnumEntriesKt.a(a());

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14982a;

        static {
            int[] iArr = new int[r.values().length];
            try {
                iArr[r.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14982a = iArr;
        }
    }

    public final boolean b() {
        return a.f14982a[ordinal()] == 1;
    }
}
