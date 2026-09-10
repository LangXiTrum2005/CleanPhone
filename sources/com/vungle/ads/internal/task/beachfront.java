package com.vungle.ads.internal.task;

import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JobRunnerThreadPriorityHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/task/beachfront;", "Lcom/vungle/ads/internal/task/impromptu;", "<init>", "()V", "Lcom/vungle/ads/internal/task/dern;", "jobInfo", "", "makeAndroidThreadPriority", "(Lcom/vungle/ads/internal/task/dern;)I", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class beachfront implements impromptu {
    @Override // com.vungle.ads.internal.task.impromptu
    public int makeAndroidThreadPriority(dern jobInfo) {
        Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, jobInfo.getPriority() - 2)) + 10);
    }
}
