package com.mbridge.msdk.config.component.info.provider.subprovider;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Environment;
import android.os.PowerManager;
import android.os.StatFs;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.C0239a2;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.tools.q0;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f32075a = "OtherDeviceInfoProvider";

    public Map<String, Object> a() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long totalBytes = statFs.getTotalBytes();
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            HashMap map = new HashMap();
            map.put("totalSpace", Long.valueOf(totalBytes));
            map.put("freeExternalSize", Long.valueOf(availableBlocksLong));
            return map;
        } catch (Throwable th2) {
            q0.b(f32075a, th2.getMessage(), th2);
            return null;
        }
    }

    public String b(Context context) {
        if (context == null) {
            return C0239a2.f28156f;
        }
        try {
            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
            String str = new DecimalFormat("0.0").format((audioManager != null ? audioManager.getStreamVolume(3) : -1) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1));
            return TextUtils.isEmpty(str) ? C0239a2.f28156f : str;
        } catch (Throwable th2) {
            q0.b(f32075a, th2.getMessage());
            return C0239a2.f28156f;
        }
    }

    public float c(Context context) {
        if (context == null) {
            return -1.0f;
        }
        try {
            Resources resources = context.getResources();
            if (resources != null) {
                return resources.getConfiguration().fontScale;
            }
        } catch (Throwable th2) {
            q0.b(f32075a, th2.getMessage());
        }
        return -1.0f;
    }

    public int d(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return ((PowerManager) context.getSystemService("power")).isPowerSaveMode() ? 1 : 0;
        } catch (Throwable th2) {
            q0.b(f32075a, th2.getMessage());
            return -1;
        }
    }

    public String b() {
        try {
            return TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
        } catch (Throwable th2) {
            q0.b(f32075a, th2.getMessage(), th2);
            return "";
        }
    }

    public Map<String, Object> a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        HashMap map = new HashMap();
        if (intentRegisterReceiver != null) {
            int intExtra = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
            int i10 = (intExtra == -1 || intExtra2 == -1) ? -1 : (intExtra * 100) / intExtra2;
            int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
            map.put(X3.j.Y, Integer.valueOf(i10));
            map.put("charging", Integer.valueOf(intExtra3 == 2 ? 1 : 2));
        }
        return map;
    }
}
