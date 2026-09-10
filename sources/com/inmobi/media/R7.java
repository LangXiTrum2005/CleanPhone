package com.inmobi.media;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class R7 implements InterfaceC3323yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T7 f23124a;

    public R7(T7 t7) {
        this.f23124a = t7;
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public final boolean a() {
        return true;
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public final boolean d() {
        return true;
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public final long getViewTouchTimestamp() {
        return -1L;
    }

    @Override // com.inmobi.media.InterfaceC3323yb
    public final void a(String triggerApi) {
        Intrinsics.f(triggerApi, "triggerApi");
        HashMap map = new HashMap();
        map.put("creativeId", this.f23124a.getCreativeId());
        map.put("trigger", triggerApi);
        map.put("impressionId", this.f23124a.getImpressionId());
        map.put("adType", "native");
        Pd pd = Pd.f23077a;
        Pd.b("BlockAutoRedirection", map, Td.SDK);
    }
}
