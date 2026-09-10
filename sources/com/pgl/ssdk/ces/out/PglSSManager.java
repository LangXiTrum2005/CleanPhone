package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.b;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile PglSSManager f33463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f33464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f33465c = 0;
    private volatile PglSSCallBack d;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f33464b = b.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return b.d();
    }

    public static PglSSManager getInstance() {
        return f33463a;
    }

    public static String getLoadError() {
        if (b.f() != null) {
            return b.f().f33442b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f33463a == null) {
            synchronized (PglSSManager.class) {
                try {
                    if (f33463a == null) {
                        f33463a = new PglSSManager(context, pglSSConfig);
                        if (b.d() == 0) {
                            f33463a.d = pglSSConfig.getCallBack();
                            f33463a.f33464b.a(pglSSConfig.getCustomInfo());
                            f33463a.f33464b.a(str, str3, str2, str4);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33463a;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (b.d() == 0) {
            this.f33464b.a(motionEvent);
        }
    }

    public long getECForBidding() {
        return 0L;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (b.d() == 0) {
            return this.f33464b.a(str, bArr);
        }
        return null;
    }

    public PglSSCallBack getPglCallBack() {
        return this.d;
    }

    public String getSofChara() {
        return null;
    }

    public String getToken() {
        if (b.d() == 0) {
            return this.f33464b.g();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (b.d() == 0) {
            this.f33464b.a(str);
            int i2 = this.f33465c;
            b bVar = this.f33464b;
            if (i2 % bVar.f33452p == 0) {
                bVar.a(str, map);
            }
            this.f33465c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (b.d() == 0) {
            this.f33464b.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (b.d() == 0) {
            this.f33464b.c(str);
        }
    }

    public void setGaid(String str) {
        if (b.d() == 0) {
            this.f33464b.d(str);
        }
    }
}
