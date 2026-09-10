package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CueGroup implements Bundleable {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f18463Y = 0;
    public final ImmutableList X;

    static {
        new CueGroup(ImmutableList.x(), 0L);
        int i2 = Util.f18979a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public CueGroup(List list, long j) {
        this.X = ImmutableList.u(list);
    }
}
