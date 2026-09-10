package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class X8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0 f27890a;

    public X8(F0 f10) {
        this.f27890a = f10;
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + "|" + str2);
        this.f27890a.a(C0.INIT_STARTED, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f27890a.a(C0.INIT_ENDED, map);
    }

    public void a() {
        this.f27890a.a(C0.INIT_SUCCESS, null);
    }

    public void a(int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        map.put("reason", str);
        this.f27890a.a(C0.INIT_FAILED, map);
    }
}
