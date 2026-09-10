package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.vb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3793vb {
    private final F0 a;

    public C3793vb(F0 f0) {
        this.a = f0;
    }

    public void a(boolean z) {
        HashMap map = new HashMap();
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.a.a(C0.LOAD_AD, map);
    }

    public void b(int i) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        this.a.a(C0.SKIP_RELOAD_AD, map);
    }

    public void a() {
        this.a.a(C0.RELOAD_AD, new HashMap());
    }

    public void b(long j, int i) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        this.a.a(C0.RELOAD_AD_NO_FILL, map);
    }

    public void a(int i) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.valueOf(i));
        this.a.a(C0.DESTROY_AD, map);
    }

    public void a(long j, boolean z) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.a.a(C0.LOAD_AD_SUCCESS, map);
    }

    public void a(long j) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(C0.RELOAD_AD_SUCCESS, map);
    }

    public void a(long j, int i, boolean z) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.a.a(C0.LOAD_AD_FAILED, map);
    }

    public void a(long j, int i, String str, boolean z) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        if (z) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.a.a(C0.LOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(long j, int i, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.a.a(C0.RELOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(boolean z, long j, boolean z2) {
        C0 c0;
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        if (z2) {
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            map.put("reason", "loaded ads are expired");
        }
        F0 f0 = this.a;
        if (z) {
            c0 = C0.AD_AVAILABILITY_CHANGED_TRUE;
        } else {
            c0 = C0.AD_AVAILABILITY_CHANGED_FALSE;
        }
        f0.a(c0, map);
    }

    public void a(long j, int i) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        this.a.a(C0.LOAD_AD_NO_FILL, map);
    }

    public void a(Boolean bool, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.a.a(bool.booleanValue() ? C0.AD_READY_TRUE : C0.AD_READY_FALSE, map);
    }
}
