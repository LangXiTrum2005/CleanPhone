package com.smartdigimkt.n4;

import android.net.Uri;
import com.p004ironsource.d9;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f37002h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f37003i = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f37004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f37005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f37006c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f37007e;
    public final String f;
    public final int g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public k(Uri uri) {
        this(uri, 0);
    }

    public boolean a(int i2) {
        return (this.g & i2) == i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(this.f37004a);
        sb.append(", ");
        sb.append(Arrays.toString(this.f37005b));
        sb.append(", ");
        sb.append(this.f37006c);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", ");
        sb.append(this.f37007e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        return android.support.v4.media.a.i(this.g, d9.i.f24752e, sb);
    }

    public k(Uri uri, int i2) {
        this(uri, 0L, -1L, null, i2);
    }

    public k a(long j) {
        long j2 = this.f37007e;
        return a(j, j2 != -1 ? j2 - j : -1L);
    }

    public k(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public k a(long j, long j2) {
        return (j == 0 && this.f37007e == j2) ? this : new k(this.f37004a, this.f37005b, this.f37006c + j, this.d + j, j2, this.f, this.g);
    }

    public k(Uri uri, long j, long j2, String str, int i2) {
        this(uri, j, j, j2, str, i2);
    }

    public k(Uri uri, long j, long j2, long j3, String str, int i2) {
        this(uri, null, j, j2, j3, str, i2);
    }

    public k a(Uri uri) {
        return new k(uri, this.f37005b, this.f37006c, this.d, this.f37007e, this.f, this.g);
    }

    public k(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        com.smartdigimkt.p4.a.a(j >= 0);
        com.smartdigimkt.p4.a.a(j2 >= 0);
        com.smartdigimkt.p4.a.a(j3 > 0 || j3 == -1);
        this.f37004a = uri;
        this.f37005b = bArr;
        this.f37006c = j;
        this.d = j2;
        this.f37007e = j3;
        this.f = str;
        this.g = i2;
    }
}
