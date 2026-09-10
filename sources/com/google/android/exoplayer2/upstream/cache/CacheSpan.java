package com.google.android.exoplayer2.upstream.cache;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    public final String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final long f18852Y;
    public final long Z;
    public final boolean e0;
    public final File f0;
    public final long g0;

    public CacheSpan(String str, long j, long j2, long j3, File file) {
        this.X = str;
        this.f18852Y = j;
        this.Z = j2;
        this.e0 = file != null;
        this.f0 = file;
        this.g0 = j3;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(CacheSpan cacheSpan) {
        String str = cacheSpan.X;
        String str2 = this.X;
        if (!str2.equals(str)) {
            return str2.compareTo(cacheSpan.X);
        }
        long j = this.f18852Y - cacheSpan.f18852Y;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(d9.i.d);
        sb.append(this.f18852Y);
        sb.append(", ");
        return a.j(this.Z, d9.i.f24752e, sb);
    }
}
