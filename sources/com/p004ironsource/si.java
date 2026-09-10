package com.p004ironsource;

import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.smartdigimkt.b0.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class si {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f27192a;

    public si(c2 c2Var) {
        this.f27192a = c2Var;
    }

    public void a() {
        this.f27192a.a(z1.INIT_SUCCESS, null);
    }

    public void a(int i2, String str) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i2));
        map.put("reason", str);
        this.f27192a.a(z1.INIT_FAILED, map);
    }

    public void a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.f27192a.a(z1.INIT_ENDED, map);
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_EXT1, str + a.U1 + str2);
        this.f27192a.a(z1.INIT_STARTED, map);
    }
}
