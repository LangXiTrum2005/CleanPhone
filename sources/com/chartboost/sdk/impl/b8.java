package com.chartboost.sdk.impl;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class b8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f13491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f13492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f13493c;
    public final File d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f13494e;
    public final File f;
    public final File g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final File f13495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final File f13496i;

    public b8(File file) {
        File file2 = new File(file, ".chartboost");
        this.f13491a = file2;
        if (!file2.exists()) {
            file2.mkdirs();
        }
        this.f13492b = a(file2, "css");
        this.f13493c = a(file2, "html");
        this.d = a(file2, "images");
        this.f13494e = a(file2, "js");
        this.f = a(file2, "templates");
        this.g = a(file2, "videos");
        this.f13495h = a(file2, "precache");
        this.f13496i = a(file2, "precache_queue");
    }

    public File a() {
        return this.f13491a;
    }

    public static File a(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }
}
