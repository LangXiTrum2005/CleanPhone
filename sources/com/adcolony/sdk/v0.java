package com.adcolony.sdk;

import android.content.Context;
import android.os.StatFs;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f9425c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private File f9426e;
    private File f;
    private File g;

    private long b(StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    private long c(StatFs statFs) {
        return d(statFs);
    }

    private long d(StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    public double a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return a(statFs) * c(statFs);
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    public boolean e() {
        k kVarB = a.b();
        this.f9423a = android.support.v4.media.a.r(new StringBuilder(), f(), "/adc3/");
        this.f9424b = android.support.v4.media.a.r(new StringBuilder(), this.f9423a, "media/");
        File file = new File(this.f9424b);
        this.f9426e = file;
        if (!file.isDirectory()) {
            this.f9426e.delete();
            this.f9426e.mkdirs();
        }
        if (!this.f9426e.isDirectory()) {
            kVarB.b(true);
            return false;
        }
        if (a(this.f9424b) < 2.097152E7d) {
            new e0.a().a("Not enough memory available at media path, disabling AdColony.").a(e0.f);
            kVarB.b(true);
            return false;
        }
        this.f9425c = android.support.v4.media.a.r(new StringBuilder(), f(), "/adc3/data/");
        File file2 = new File(this.f9425c);
        this.f = file2;
        if (!file2.isDirectory()) {
            this.f.delete();
        }
        this.f.mkdirs();
        this.d = android.support.v4.media.a.r(new StringBuilder(), this.f9423a, "tmp/");
        File file3 = new File(this.d);
        this.g = file3;
        if (!file3.isDirectory()) {
            this.g.delete();
            this.g.mkdirs();
        }
        return true;
    }

    public String f() {
        Context contextA = a.a();
        return contextA == null ? "" : contextA.getFilesDir().getAbsolutePath();
    }

    public f1 g() {
        return new File(android.support.v4.media.a.r(new StringBuilder(), a(), "AppVersion")).exists() ? c0.c(android.support.v4.media.a.r(new StringBuilder(), a(), "AppVersion")) : c0.b();
    }

    public boolean h() {
        File file = this.f9426e;
        if (file == null || this.f == null || this.g == null) {
            return false;
        }
        if (!file.isDirectory()) {
            this.f9426e.delete();
        }
        if (!this.f.isDirectory()) {
            this.f.delete();
        }
        if (!this.g.isDirectory()) {
            this.g.delete();
        }
        this.f9426e.mkdirs();
        this.f.mkdirs();
        this.g.mkdirs();
        return true;
    }

    public String b() {
        return this.f9425c;
    }

    public String c() {
        return this.f9424b;
    }

    public String d() {
        return this.d;
    }

    private long a(StatFs statFs) {
        return b(statFs);
    }

    public void a(f1 f1Var) {
        c0.j(f1Var, android.support.v4.media.a.r(new StringBuilder(), a(), "AppVersion"));
    }

    public String a() {
        return this.f9423a;
    }
}
