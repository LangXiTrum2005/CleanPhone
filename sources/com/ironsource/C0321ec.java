package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.ec, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0321ec extends AbstractC0524q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0321ec(C0506p0 adTools, C0339fc adUnitData, InterfaceC0357gc listener) {
        String str;
        int iB;
        super(adTools, adUnitData, listener);
        kotlin.jvm.internal.n.f(adTools, "adTools");
        kotlin.jvm.internal.n.f(adUnitData, "adUnitData");
        kotlin.jvm.internal.n.f(listener, "listener");
        C0358gd c0358gdG = g();
        IronLog.INTERNAL.verbose("placement = " + c0358gdG);
        if (c0358gdG == null || TextUtils.isEmpty(c0358gdG.c())) {
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c0358gdG == null ? "placement is null" : "placement name is empty"}, 1));
            iB = B0.b(adUnitData.b().a());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    @Override // com.ironsource.AbstractC0524q0
    public E a() {
        return new a4.a(this, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B a(C0321ec this$0, C adInstanceData, I adInstancePayload) {
        kotlin.jvm.internal.n.f(this$0, "this$0");
        kotlin.jvm.internal.n.f(adInstanceData, "adInstanceData");
        kotlin.jvm.internal.n.f(adInstancePayload, "adInstancePayload");
        return new Wb(new V0(this$0.f(), F0.b.PROVIDER), adInstanceData, adInstancePayload, new AbstractC0524q0.a());
    }
}
