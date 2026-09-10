package com.google.android.exoplayer2.offline;

import com.google.android.exoplayer2.util.Util;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i2 = DownloadManager.InternalHandler.m;
        long j = ((Download) obj).f18257c;
        long j2 = ((Download) obj2).f18257c;
        int i3 = Util.f18979a;
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }
}
