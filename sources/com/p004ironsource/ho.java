package com.p004ironsource;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.Placement;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\f"}, d2 = {"Lcom/ironsource/ho;", "Lcom/ironsource/n1;", "Lcom/ironsource/c0;", "a", "Lcom/ironsource/m1;", "adTools", "Lcom/ironsource/io;", "adUnitData", "Lcom/ironsource/jo;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/m1;Lcom/ironsource/io;Lcom/ironsource/jo;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ho extends n1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(m1 adTools, io adUnitData, jo listener) {
        String str;
        int iB;
        super(adTools, adUnitData, listener, null, 8, null);
        Intrinsics.f(adTools, "adTools");
        Intrinsics.f(adUnitData, "adUnitData");
        Intrinsics.f(listener, "listener");
        Placement placementG = g();
        IronLog.INTERNAL.verbose("placement = " + placementG);
        if (placementG == null || TextUtils.isEmpty(placementG.getPlacementName())) {
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{placementG == null ? "placement is null" : "placement name is empty"}, 1));
            iB = y1.b(adUnitData.getAdProperties().getAdFormat());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    @Override // com.p004ironsource.n1
    public InterfaceC3348c0 a() {
        return new O(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC3389z a(ho this$0, C3344a0 adInstanceData, C3357g0 adInstancePayload) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(adInstanceData, "adInstanceData");
        Intrinsics.f(adInstancePayload, "adInstancePayload");
        return new zn(new u2(this$0.getAdUnitTools(), c2.b.PROVIDER), adInstanceData, adInstancePayload, new n1.a());
    }
}
