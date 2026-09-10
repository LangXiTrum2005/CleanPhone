package com.thinkup.core.api;

import android.content.Context;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.o;
import com.thinkup.core.common.ooo.o0o;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class TUSDKGlobalSetting {
    public static long mDelayInspectTime = 0;
    private static boolean mDenyApi_getRunningAppProcesses = false;
    public static long mInspectInterval;
    private static final List<String> sensorNetworkList = new CopyOnWriteArrayList();
    public static SHAKE_TYPE shakeControlType = SHAKE_TYPE.DEFAULT_NETWORK;
    public static boolean isHideNavAndStatusBar = false;
    public static boolean enableGetDeviceInfoInBg = false;
    public static Boolean isGlobalMute = null;

    public enum SHAKE_TYPE {
        DEFAULT_NETWORK,
        FORBID_ALL,
        ALLOW_ALL,
        ALLOW_NETWORK
    }

    public static void clearCache(String str, int i2) {
        o.o().o(str, i2, true, 7);
    }

    public static TUCustomContentResult customContentResultReviewByInfos(List<TUCustomContentInfo> list) {
        return o0o.m(list);
    }

    public static TUCustomContentInfo customContentReviewResult(List<TUCustomContentInfo> list) {
        return o0o.o(list);
    }

    public static boolean isDenyApi_getRunningAppProcesses() {
        return mDenyApi_getRunningAppProcesses;
    }

    public static Boolean isShakeEnabled(int i2) {
        SHAKE_TYPE shake_type = shakeControlType;
        if (shake_type == SHAKE_TYPE.ALLOW_ALL) {
            return Boolean.TRUE;
        }
        if (shake_type == SHAKE_TYPE.FORBID_ALL) {
            return Boolean.FALSE;
        }
        if (shake_type == SHAKE_TYPE.ALLOW_NETWORK) {
            return Boolean.valueOf(sensorNetworkList.contains(String.valueOf(i2)));
        }
        return null;
    }

    public static void needTraminiInfo(Context context, boolean z2) {
        com.thinkup.core.common.o0o.o(context).o(z2);
    }

    public static void setAdMuted(Boolean bool) {
        isGlobalMute = bool;
    }

    public static void setDenyApi_getRunningAppProcesses(boolean z2) {
        mDenyApi_getRunningAppProcesses = z2;
    }

    public static void setEnableGetDeviceInfoInBg(boolean z2) {
        enableGetDeviceInfoInBg = z2;
    }

    public static void setHideNavAndStatusBar(boolean z2) {
        isHideNavAndStatusBar = z2;
    }

    public static void setShakeControl(SHAKE_TYPE shake_type, List<String> list) {
        try {
            if (shakeControlType != shake_type) {
                o0n.m();
                o0n.o(String.valueOf(shake_type.ordinal()), list != null ? list.toString() : new ArrayList().toString());
            }
            shakeControlType = shake_type;
            if (shake_type == SHAKE_TYPE.ALLOW_NETWORK && list != null && !list.isEmpty()) {
                List<String> list2 = sensorNetworkList;
                list2.clear();
                list2.addAll(list);
            }
            o0n.m().o(isShakeEnabled(66));
        } catch (Throwable unused) {
        }
    }

    public static void clearCache(String str, List<TUAdInfo> list) {
        o.o().o(str, list, true, 7);
    }
}
