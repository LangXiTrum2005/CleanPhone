package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ib1 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15708b = C.TIME_UNSET;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15707a = new ArrayList();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.f15708b, ((ib1) obj).f15708b);
    }
}
