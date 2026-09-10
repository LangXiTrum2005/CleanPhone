package com.vungle.ads.internal.task;

import com.p004ironsource.x4;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0096\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/vungle/ads/internal/task/PriorityRunnable;", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$ComparableRunnable;", "()V", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "getPriority", "()I", "compareTo", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class PriorityRunnable implements VungleThreadPoolExecutor.ComparableRunnable {
    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        Intrinsics.f(other, "other");
        if (!(other instanceof PriorityRunnable)) {
            return -1;
        }
        return Intrinsics.h(((PriorityRunnable) other).getPriority(), getPriority());
    }

    public abstract int getPriority();
}
