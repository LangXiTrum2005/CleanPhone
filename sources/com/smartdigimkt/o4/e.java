package com.smartdigimkt.o4;

import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class e implements Comparable<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f37423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37424c;
    public final boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f37425e;
    public final long f;

    public e(String str, long j, long j2) {
        this(str, j, j2, -9223372036854775807L, null);
    }

    public boolean a() {
        return !this.d;
    }

    public boolean b() {
        return this.f37424c == -1;
    }

    public e(String str, long j, long j2, long j3, File file) {
        this.f37422a = str;
        this.f37423b = j;
        this.f37424c = j2;
        this.d = file != null;
        this.f37425e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        if (!this.f37422a.equals(eVar.f37422a)) {
            return this.f37422a.compareTo(eVar.f37422a);
        }
        long j = this.f37423b - eVar.f37423b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
