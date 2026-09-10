package com.chartboost.sdk.impl;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f14794c;
    public final File d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f14795e;
    public final String f;
    public long g;

    public oi(String url, String filename, File file, File file2, long j, String queueFilePath, long j2) {
        Intrinsics.f(url, "url");
        Intrinsics.f(filename, "filename");
        Intrinsics.f(queueFilePath, "queueFilePath");
        this.f14792a = url;
        this.f14793b = filename;
        this.f14794c = file;
        this.d = file2;
        this.f14795e = j;
        this.f = queueFilePath;
        this.g = j2;
    }

    public final long a() {
        return this.f14795e;
    }

    public final File b() {
        return this.d;
    }

    public final long c() {
        return this.g;
    }

    public final String d() {
        return this.f14793b;
    }

    public final File e() {
        return this.f14794c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return Intrinsics.a(this.f14792a, oiVar.f14792a) && Intrinsics.a(this.f14793b, oiVar.f14793b) && Intrinsics.a(this.f14794c, oiVar.f14794c) && Intrinsics.a(this.d, oiVar.d) && this.f14795e == oiVar.f14795e && Intrinsics.a(this.f, oiVar.f) && this.g == oiVar.g;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.f14792a;
    }

    public int hashCode() {
        int iB = androidx.datastore.preferences.protobuf.a.b(this.f14793b, this.f14792a.hashCode() * 31, 31);
        File file = this.f14794c;
        int iHashCode = (iB + (file == null ? 0 : file.hashCode())) * 31;
        File file2 = this.d;
        return Long.hashCode(this.g) + androidx.datastore.preferences.protobuf.a.b(this.f, androidx.media3.extractor.text.ttml.a.b((iHashCode + (file2 != null ? file2.hashCode() : 0)) * 31, 31, this.f14795e), 31);
    }

    public String toString() {
        String str = this.f14792a;
        String str2 = this.f14793b;
        File file = this.f14794c;
        File file2 = this.d;
        long j = this.f14795e;
        String str3 = this.f;
        long j2 = this.g;
        StringBuilder sbQ = androidx.datastore.preferences.protobuf.a.q("VideoAsset(url=", str, ", filename=", str2, ", localFile=");
        sbQ.append(file);
        sbQ.append(", directory=");
        sbQ.append(file2);
        sbQ.append(", creationDate=");
        sbQ.append(j);
        sbQ.append(", queueFilePath=");
        sbQ.append(str3);
        sbQ.append(", expectedFileSize=");
        sbQ.append(j2);
        sbQ.append(")");
        return sbQ.toString();
    }

    public final void a(long j) {
        this.g = j;
    }

    public /* synthetic */ oi(String str, String str2, File file, File file2, long j, String str3, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, file, file2, (i2 & 16) != 0 ? gg.a() : j, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? 0L : j2);
    }
}
