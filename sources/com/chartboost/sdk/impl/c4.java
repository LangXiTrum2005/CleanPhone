package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum c4 {
    CLICK_PREFERENCE_EMBEDDED(0),
    CLICK_PREFERENCE_NATIVE(1);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13580b;
    public static final /* synthetic */ EnumEntries g = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13578c = new a(null);

    public static final class a {
        public a() {
        }

        public final c4 a(int i2) {
            if (i2 != 0) {
                return i2 != 1 ? c4.CLICK_PREFERENCE_EMBEDDED : c4.CLICK_PREFERENCE_NATIVE;
            }
            return c4.CLICK_PREFERENCE_EMBEDDED;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    c4(int i2) {
        this.f13580b = i2;
    }

    public final int b() {
        return this.f13580b;
    }
}
