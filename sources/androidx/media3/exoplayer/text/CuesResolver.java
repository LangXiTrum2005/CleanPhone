package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes.dex */
interface CuesResolver {
    ImmutableList a(long j);

    boolean b(CuesWithTiming cuesWithTiming, long j);

    long c(long j);

    void clear();

    long d(long j);

    void e(long j);
}
