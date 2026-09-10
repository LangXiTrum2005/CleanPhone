package com.chartboost.heliumsdk.utils;

import androidx.lifecycle.LifecycleOwner;
import com.applovin.impl.Z;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/chartboost/heliumsdk/utils/BackgroundTimeMonitorOperation;", "Lcom/chartboost/heliumsdk/utils/BackgroundTimeMonitorOperator;", "()V", "lastBackgroundedDate", "Ljava/util/Date;", "totalBackgroundedMs", "", "backgroundTimeUntilNow", "commitLastBackgroundedDate", "", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BackgroundTimeMonitorOperation implements BackgroundTimeMonitorOperator {
    private Date lastBackgroundedDate;
    private long totalBackgroundedMs;

    public BackgroundTimeMonitorOperation() {
        if (LifecycleStatusObserver.INSTANCE.getStatus() == LifecycleStatus.BACKGROUND) {
            this.lastBackgroundedDate = new Date();
        }
    }

    private final void commitLastBackgroundedDate() {
        Date date = this.lastBackgroundedDate;
        if (date == null) {
            return;
        }
        this.totalBackgroundedMs = (Z.f() - date.getTime()) + this.totalBackgroundedMs;
        this.lastBackgroundedDate = null;
    }

    @Override // com.chartboost.heliumsdk.utils.BackgroundTimeMonitorOperator
    public long backgroundTimeUntilNow() {
        commitLastBackgroundedDate();
        return this.totalBackgroundedMs;
    }

    @Override // com.chartboost.heliumsdk.utils.BackgroundTimeMonitorOperator, androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        super.onCreate(lifecycleOwner);
    }

    @Override // com.chartboost.heliumsdk.utils.BackgroundTimeMonitorOperator, androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        super.onDestroy(lifecycleOwner);
    }

    @Override // com.chartboost.heliumsdk.utils.BackgroundTimeMonitorOperator, androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        super.onPause(lifecycleOwner);
    }

    @Override // com.chartboost.heliumsdk.utils.BackgroundTimeMonitorOperator, androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        super.onResume(lifecycleOwner);
    }

    @Override // com.chartboost.heliumsdk.utils.BackgroundTimeMonitorOperator, androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.f(owner, "owner");
        commitLastBackgroundedDate();
    }

    @Override // com.chartboost.heliumsdk.utils.BackgroundTimeMonitorOperator, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.f(owner, "owner");
        this.lastBackgroundedDate = new Date();
    }
}
