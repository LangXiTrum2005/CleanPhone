package com.startapp.sdk.jobs;

import com.startapp.sdk.internal.cb;
import com.startapp.sdk.internal.e3;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SchedulerService f41791a;

    public a(SchedulerService schedulerService) {
        this.f41791a = schedulerService;
    }

    @Override // com.startapp.sdk.internal.e3
    public final void a(cb cbVar) {
        ExecutorService executorService = this.f41791a.f41789a;
        if (executorService != null) {
            executorService.execute(cbVar);
        }
    }
}
