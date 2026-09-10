package com.p004ironsource;

import android.app.Activity;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/ironsource/a1;", "Lcom/ironsource/z0;", "Landroid/app/Activity;", "activity", "Lcom/ironsource/zj;", d9.h.p0, "", "a", "", "Lcom/ironsource/dp;", "Lcom/ironsource/dp;", "networkShowApi", "<init>", "(Lcom/ironsource/dp;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class a1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final dp networkShowApi;

    public a1(dp networkShowApi) {
        Intrinsics.f(networkShowApi, "networkShowApi");
        this.networkShowApi = networkShowApi;
    }

    @Override // com.p004ironsource.z0
    public void a(Activity activity, zj adInstance) {
        Intrinsics.f(activity, "activity");
        Intrinsics.f(adInstance, "adInstance");
        IronLog.ADAPTER_API.verbose("Show: networkInstanceId=" + adInstance.g() + " adInstanceId=" + adInstance.e());
        this.networkShowApi.a(activity, adInstance, new HashMap());
    }

    @Override // com.p004ironsource.z0
    public boolean a(zj adInstance) {
        Intrinsics.f(adInstance, "adInstance");
        return this.networkShowApi.a(adInstance);
    }
}
