package com.chartboost.sdk.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public enum a9 {
    NONE(0),
    TOP(1),
    LEFT(2),
    BOTTOM(4),
    RIGHT(8),
    ALL(15);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13419b;
    public static final /* synthetic */ EnumEntries k = EnumEntriesKt.a(a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f13415c = new a(null);

    public static final class a {
        public a() {
        }

        public final boolean a(int i2) {
            return (i2 & a9.BOTTOM.b()) != 0;
        }

        public final boolean b(int i2) {
            return (i2 & a9.LEFT.b()) != 0;
        }

        public final boolean c(int i2) {
            return (i2 & a9.RIGHT.b()) != 0;
        }

        public final boolean d(int i2) {
            return (i2 & a9.TOP.b()) != 0;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    a9(int i2) {
        this.f13419b = i2;
    }

    public final int b() {
        return this.f13419b;
    }
}
