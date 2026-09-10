package com.smartdigimkt.a4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f33665b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f33666c = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33667a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public o(int i2) {
        this.f33667a = i2;
    }

    public o(int i2, Exception exc) {
        super(exc);
        this.f33667a = i2;
    }
}
