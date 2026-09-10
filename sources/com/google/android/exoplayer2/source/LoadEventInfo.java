package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class LoadEventInfo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicLong f18338b = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f18339a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadEventInfo(long j, DataSpec dataSpec) {
        this(Collections.EMPTY_MAP, j);
        Uri uri = dataSpec.f18742a;
    }

    public LoadEventInfo(Map map, long j) {
        this.f18339a = map;
    }
}
