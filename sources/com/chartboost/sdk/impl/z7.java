package com.chartboost.sdk.impl;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m7 f15704a;

    public z7(m7 fileCaching) {
        Intrinsics.f(fileCaching, "fileCaching");
        this.f15704a = fileCaching;
    }

    public final File a(i6 i6Var) {
        return j6.a(i6Var, this.f15704a.c());
    }

    public final File b(i6 i6Var) {
        return j6.a(i6Var, this.f15704a.a());
    }

    public final void c(i6 download) throws IOException {
        Intrinsics.f(download, "download");
        if (nf.f14544a.d()) {
            b(download).createNewFile();
        }
    }

    public final void d(i6 download) {
        Intrinsics.f(download, "download");
        if (nf.f14544a.d()) {
            a(download).delete();
            b(download).delete();
        }
    }

    public final void e(i6 download) throws IOException {
        Intrinsics.f(download, "download");
        if (nf.f14544a.d()) {
            b(download).delete();
            a(download).createNewFile();
        }
    }
}
