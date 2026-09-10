package com.vungle.ads.internal.task;

import com.ironsource.C3414a2;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PriorityRunnable.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/vungle/ads/internal/task/competently;", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$saneness;", "<init>", "()V", "", C3414a2.d, "", "compareTo", "(Ljava/lang/Object;)I", "getPriority", "()I", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class competently implements VungleThreadPoolExecutor.saneness {
    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!(other instanceof competently)) {
            return -1;
        }
        return Intrinsics.taiyuan(((competently) other).getPriority(), getPriority());
    }

    public abstract int getPriority();
}
