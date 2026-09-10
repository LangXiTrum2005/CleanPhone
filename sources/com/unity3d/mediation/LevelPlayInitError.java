package com.unity3d.mediation;

import com.ironsource.C0520pe;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class LevelPlayInitError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f38518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f38519b;

    public LevelPlayInitError(int i10, String errorMessage) {
        n.f(errorMessage, "errorMessage");
        this.f38518a = i10;
        this.f38519b = errorMessage;
    }

    public final int getErrorCode() {
        return this.f38518a;
    }

    public final String getErrorMessage() {
        return this.f38519b;
    }

    public String toString() {
        return "LevelPlayError(errorCode=" + this.f38518a + ", errorMessage='" + this.f38519b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(C0520pe sdkError) {
        this(sdkError.c(), sdkError.d());
        n.f(sdkError, "sdkError");
    }
}
