package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14472a;

    public ma(int i2) {
        this.f14472a = i2;
    }

    public final int a() {
        return this.f14472a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma) && this.f14472a == ((ma) obj).f14472a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f14472a);
    }

    public String toString() {
        return androidx.datastore.preferences.protobuf.a.k("InterruptionConfig(audioFocusType=", this.f14472a, ")");
    }

    public /* synthetic */ ma(int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 3 : i2);
    }
}
