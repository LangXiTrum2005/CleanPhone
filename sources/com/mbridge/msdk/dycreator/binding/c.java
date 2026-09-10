package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.strategy.d;
import com.mbridge.msdk.dycreator.binding.strategy.e;
import com.mbridge.msdk.dycreator.binding.strategy.f;
import com.mbridge.msdk.dycreator.binding.strategy.g;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f33157a;

    private c() {
    }

    public static c a() {
        if (f33157a == null) {
            synchronized (c.class) {
                try {
                    if (f33157a == null) {
                        f33157a = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f33157a;
    }

    public <T extends BaseStrategy> T a(String str) {
        T aVar = null;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLOSE)) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.c();
            } else if (str.equals("download")) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.b();
            } else if (!str.equals(Constants.DEEPLINK) && str.equals("activity")) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.a();
            }
            if (str.equals("feedback")) {
                aVar = new d();
            }
            if (str.equals("notice")) {
                aVar = new e();
            }
            if (str.equals("permissionInfo")) {
                aVar = new f();
            }
            if (str.equals("privateAddress")) {
                return new g();
            }
        }
        return aVar;
    }
}
