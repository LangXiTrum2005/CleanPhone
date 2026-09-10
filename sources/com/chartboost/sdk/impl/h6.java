package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum h6 {
    NONE(0),
    STOPPED_QUEUE(1),
    MAX_COUNT_TIME_WINDOW(2),
    FORCED_OUT(3);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14098b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f14097i = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f14094c = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    h6(int i2) {
        this.f14098b = i2;
    }

    public final int b() {
        return this.f14098b;
    }
}
