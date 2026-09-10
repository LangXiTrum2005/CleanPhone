package androidx.media3.extractor.text;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CuesWithTiming {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImmutableList f7204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7206c;
    public final long d;

    public CuesWithTiming(List list, long j, long j2) {
        this.f7204a = ImmutableList.u(list);
        this.f7205b = j;
        this.f7206c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
