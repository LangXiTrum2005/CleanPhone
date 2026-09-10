package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.zb, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class C0696zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F0 f31351a;

    public C0696zb(F0 f10) {
        this.f31351a = f10;
    }

    public void a(boolean z10) {
        a(z10, false);
    }

    public void b(int i10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        this.f31351a.a(C0.SKIP_RELOAD_AD, map);
    }

    public void c() {
        this.f31351a.a(C0.PRELOAD_ADUNIT_LOAD_SUCCESS, new HashMap());
    }

    public void d() {
        this.f31351a.a(C0.RELOAD_AD, new HashMap());
    }

    public void a(boolean z10, boolean z11) {
        HashMap map = new HashMap();
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        if (z11) {
            map.put(IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f31351a.a(C0.LOAD_AD, map);
    }

    public void b(long j10, int i10, boolean z10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (z10) {
            map.put(IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f31351a.a(C0.LOAD_AD_NO_FILL, map);
    }

    public void a(int i10) {
        HashMap map = new HashMap();
        map.put("sessionDepth", Integer.valueOf(i10));
        this.f31351a.a(C0.DESTROY_AD, map);
    }

    public void a(long j10, boolean z10) {
        a(j10, z10, false);
    }

    public void b() {
        this.f31351a.a(C0.PRELOAD_ADUNIT_INITIATED, new HashMap());
    }

    public void a(long j10, boolean z10, boolean z11) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        if (z11) {
            map.put(IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f31351a.a(C0.LOAD_AD_SUCCESS, map);
    }

    public void a(long j10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f31351a.a(C0.RELOAD_AD_SUCCESS, map);
    }

    public void a(long j10, int i10, boolean z10) {
        a(j10, i10, z10, false);
    }

    public void a(long j10, int i10, boolean z10, boolean z11) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        if (z11) {
            map.put(IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f31351a.a(C0.LOAD_AD_FAILED, map);
    }

    public void a(long j10, int i10, String str, boolean z10) {
        a(j10, i10, str, z10, false);
    }

    public void a(long j10, int i10, String str, boolean z10, boolean z11) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        if (z10) {
            map.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        if (z11) {
            map.put(IronSourceConstants.EVENTS_EXT1, "preload");
        }
        this.f31351a.a(C0.LOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(long j10, int i10, String str) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f31351a.a(C0.RELOAD_AD_FAILED_WITH_REASON, map);
    }

    public void a(boolean z10, long j10, boolean z11) {
        C0 c4;
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (z11) {
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(IronSourceError.ERROR_RV_EXPIRED_ADS));
            map.put("reason", "loaded ads are expired");
        }
        F0 f10 = this.f31351a;
        if (z10) {
            c4 = C0.AD_AVAILABILITY_CHANGED_TRUE;
        } else {
            c4 = C0.AD_AVAILABILITY_CHANGED_FALSE;
        }
        f10.a(c4, map);
    }

    public void a(long j10, int i10) {
        HashMap map = new HashMap();
        map.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        this.f31351a.a(C0.RELOAD_AD_NO_FILL, map);
    }

    public void a(Boolean bool, String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("reason", str);
        }
        this.f31351a.a(bool.booleanValue() ? C0.AD_READY_TRUE : C0.AD_READY_FALSE, map);
    }

    public void a() {
        this.f31351a.a(C0.PRELOAD_ADUNIT_FAILED, new HashMap());
    }
}
