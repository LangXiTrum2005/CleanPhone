package com.inmobi.media;

import com.thinkup.core.common.n.mo;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public final class Q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f23099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f23100c;
    public P3 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S3 f23101e;

    public Q3(S3 s3, String str) {
        this.f23101e = s3;
        this.f23098a = str;
        this.f23099b = new long[s3.f23157h];
    }

    public final File a(int i2) {
        return new File(this.f23101e.f23153a, this.f23098a + mo.ono + i2);
    }

    public final File b(int i2) {
        return new File(this.f23101e.f23153a, this.f23098a + mo.ono + i2 + ".tmp");
    }
}
