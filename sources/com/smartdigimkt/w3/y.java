package com.smartdigimkt.w3;

import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes6.dex */
public interface y extends x.b {
    public static final int f = 0;
    public static final int g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f39390h = 2;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(int i2);

    void a(long j) throws g;

    void a(long j, long j2) throws g;

    void a(a0 a0Var, m[] mVarArr, com.smartdigimkt.j4.y yVar, long j, boolean z2, long j2) throws g;

    void a(m[] mVarArr, com.smartdigimkt.j4.y yVar, long j) throws g;

    boolean a();

    void c();

    int d();

    int e();

    boolean f();

    com.smartdigimkt.j4.y h();

    void i();

    boolean isReady();

    void j() throws IOException;

    boolean k();

    com.smartdigimkt.p4.n l();

    z m();

    void start() throws g;

    void stop() throws g;
}
