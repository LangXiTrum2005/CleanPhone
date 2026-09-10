package com.chartboost.sdk.impl;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n7 implements m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f14535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f14536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f14537c;

    public n7(Context context, File precacheDirectory, File precacheQueueDirectory, File precachingInternalDirectory) {
        Intrinsics.f(context, "context");
        Intrinsics.f(precacheDirectory, "precacheDirectory");
        Intrinsics.f(precacheQueueDirectory, "precacheQueueDirectory");
        Intrinsics.f(precachingInternalDirectory, "precachingInternalDirectory");
        this.f14535a = precacheDirectory;
        this.f14536b = precacheQueueDirectory;
        this.f14537c = precachingInternalDirectory;
    }

    @Override // com.chartboost.sdk.impl.m7
    public File a(String id) {
        Intrinsics.f(id, "id");
        return new File(c(), id);
    }

    @Override // com.chartboost.sdk.impl.m7
    public File b() {
        return this.f14537c;
    }

    @Override // com.chartboost.sdk.impl.m7
    public File c() {
        return this.f14535a;
    }

    @Override // com.chartboost.sdk.impl.m7
    public File a() {
        return this.f14536b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ n7(Context context, File file, File file2, File file3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        file = (i2 & 2) != 0 ? w5.b(context) : file;
        this(context, file, (i2 & 4) != 0 ? w5.c(context) : file2, (i2 & 8) != 0 ? new File(file, "exoplayer-cache") : file3);
    }
}
