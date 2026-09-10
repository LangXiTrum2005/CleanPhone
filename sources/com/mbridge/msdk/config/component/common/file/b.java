package com.mbridge.msdk.config.component.common.file;

import androidx.annotation.NonNull;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f31942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f31943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f31944f;

    public String a() {
        return this.f31941c + this.f31939a;
    }

    public void b(String str) {
        this.f31939a = str;
    }

    public void c(String str) {
        this.f31940b = str;
    }

    public String d() {
        return this.f31943e;
    }

    public void e(String str) {
        this.f31943e = str;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FileDescription{fileName='");
        sb2.append(this.f31939a);
        sb2.append("', fileType='");
        sb2.append(this.f31940b);
        sb2.append("', dirPath='");
        sb2.append(this.f31941c);
        sb2.append("', unZipDirPath='");
        sb2.append(this.f31942d);
        sb2.append("', unZipFilePath='");
        sb2.append(this.f31943e);
        sb2.append("', fileExists=");
        return e.t(sb2, this.f31944f, '}');
    }

    public void a(String str) {
        this.f31941c = str;
    }

    public String b() {
        return this.f31940b;
    }

    public String c() {
        return this.f31942d;
    }

    public void d(String str) {
        this.f31942d = str;
    }

    public boolean e() {
        return this.f31944f;
    }

    public void a(boolean z10) {
        this.f31944f = z10;
    }
}
