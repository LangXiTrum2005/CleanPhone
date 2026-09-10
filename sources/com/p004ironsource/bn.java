package com.p004ironsource;

import android.text.TextUtils;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2 f24433a;

    public bn(c2 c2Var) {
        this.f24433a = c2Var;
    }

    public void a() {
        this.f24433a.a(z1.RELOAD_AD, new HashMap());
    }

    public void b(int i2) {
        HashMap map = new HashMap();
        map.put("errorCode", Integer.valueOf(i2));
        this.f24433a.a(z1.SKIP_RELOAD_AD, map);
    }

    public void a(int i2) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.valueOf(i2));
        this.f24433a.a(z1.DESTROY_AD, map);
    }

    public void b(long j, int i2) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i2));
        this.f24433a.a(z1.RELOAD_AD_NO_FILL, map);
    }

    public void a(long j) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        this.f24433a.a(z1.RELOAD_AD_SUCCESS, map);
    }

    public void a(long j, int i2) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i2));
        this.f24433a.a(z1.LOAD_AD_NO_FILL, map);
    }

    public void a(long j, int i2, String str) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f24433a.a(z1.RELOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(long j, int i2, String str, boolean z2) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        if (z2) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f24433a.a(z1.LOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(long j, int i2, boolean z2) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        map.put("errorCode", Integer.valueOf(i2));
        if (z2) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f24433a.a(z1.LOAD_AD_FAILED, map);
    }

    public void a(long j, boolean z2) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        if (z2) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f24433a.a(z1.LOAD_AD_SUCCESS, map);
    }

    public void a(Boolean bool, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f24433a.a(bool.booleanValue() ? z1.AD_READY_TRUE : z1.AD_READY_FALSE, map);
    }

    public void a(boolean z2) {
        HashMap map = new HashMap();
        if (z2) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f24433a.a(z1.LOAD_AD, map);
    }

    public void a(boolean z2, long j, boolean z3) {
        HashMap map = new HashMap();
        map.put("duration", Long.valueOf(j));
        if (z3) {
            map.put("errorCode", Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            map.put("reason", "loaded ads are expired");
        }
        this.f24433a.a(z2 ? z1.AD_AVAILABILITY_CHANGED_TRUE : z1.AD_AVAILABILITY_CHANGED_FALSE, map);
    }
}
