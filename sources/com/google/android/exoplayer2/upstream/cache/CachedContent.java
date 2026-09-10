package com.google.android.exoplayer2.upstream.cache;

import androidx.datastore.preferences.protobuf.a;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class CachedContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TreeSet f18861c = new TreeSet();
    public final ArrayList d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DefaultContentMetadata f18862e;

    public static final class Range {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f18863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f18864b;

        public Range(long j, long j2) {
            this.f18863a = j;
            this.f18864b = j2;
        }
    }

    public CachedContent(int i2, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f18859a = i2;
        this.f18860b = str;
        this.f18862e = defaultContentMetadata;
    }

    public final long a(long j, long j2) {
        Assertions.b(j >= 0);
        Assertions.b(j2 >= 0);
        SimpleCacheSpan simpleCacheSpanB = b(j, j2);
        boolean z2 = simpleCacheSpanB.e0;
        long j3 = simpleCacheSpanB.Z;
        if (!z2) {
            return -Math.min(j3 != -1 ? j3 : Long.MAX_VALUE, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long jMax = simpleCacheSpanB.f18852Y + j3;
        if (jMax < j5) {
            for (SimpleCacheSpan simpleCacheSpan : this.f18861c.tailSet(simpleCacheSpanB, false)) {
                long j6 = simpleCacheSpan.f18852Y;
                if (j6 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, j6 + simpleCacheSpan.Z);
                if (jMax >= j5) {
                    break;
                }
            }
        }
        return Math.min(jMax - j, j2);
    }

    public final SimpleCacheSpan b(long j, long j2) {
        long jMin = j2;
        SimpleCacheSpan simpleCacheSpan = new SimpleCacheSpan(this.f18860b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.f18861c;
        SimpleCacheSpan simpleCacheSpan2 = (SimpleCacheSpan) treeSet.floor(simpleCacheSpan);
        if (simpleCacheSpan2 != null && simpleCacheSpan2.f18852Y + simpleCacheSpan2.Z > j) {
            return simpleCacheSpan2;
        }
        SimpleCacheSpan simpleCacheSpan3 = (SimpleCacheSpan) treeSet.ceiling(simpleCacheSpan);
        if (simpleCacheSpan3 != null) {
            long j3 = simpleCacheSpan3.f18852Y - j;
            jMin = jMin == -1 ? j3 : Math.min(j3, jMin);
        }
        return new SimpleCacheSpan(this.f18860b, j, jMin, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i2 >= arrayList.size()) {
                return false;
            }
            Range range = (Range) arrayList.get(i2);
            long j3 = range.f18864b;
            long j4 = range.f18863a;
            if (j3 == -1) {
                if (j >= j4) {
                    return true;
                }
            } else if (j2 != -1 && j4 <= j && j + j2 <= j4 + j3) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CachedContent.class == obj.getClass()) {
            CachedContent cachedContent = (CachedContent) obj;
            if (this.f18859a == cachedContent.f18859a && this.f18860b.equals(cachedContent.f18860b) && this.f18861c.equals(cachedContent.f18861c) && this.f18862e.equals(cachedContent.f18862e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18862e.hashCode() + a.b(this.f18860b, this.f18859a * 31, 31);
    }
}
