package com.zg.adlib.storage;

import android.text.TextUtils;
import com.zg.adlib.util.MDeviceUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/zg/adlib/storage/AppPreferences;", "", "<init>", "()V", "value", "", AppPreferencesKeys.SP_FIRST_LAUNCH_TIME, "getFirst_install_time", "()J", "setFirst_install_time", "(J)V", "", "deviceId", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "app_debug"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppPreferences {
    public static final AppPreferences INSTANCE = new AppPreferences();

    private AppPreferences() {
    }

    public final String getDeviceId() {
        String string = AppPreferencesUtil.INSTANCE.getString(AppPreferencesKeys.DEVICE_ID, "");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String strGenerateImmutableUUID = MDeviceUtil.generateImmutableUUID();
        setDeviceId(strGenerateImmutableUUID);
        return strGenerateImmutableUUID;
    }

    public final long getFirst_install_time() {
        return AppPreferencesUtil.INSTANCE.getLong(AppPreferencesKeys.SP_FIRST_LAUNCH_TIME, 0L);
    }

    public final void setDeviceId(String value) {
        Intrinsics.f(value, "value");
        AppPreferencesUtil.INSTANCE.setString(AppPreferencesKeys.DEVICE_ID, value);
    }

    public final void setFirst_install_time(long j) {
        AppPreferencesUtil.INSTANCE.setLong(AppPreferencesKeys.SP_FIRST_LAUNCH_TIME, j);
    }
}
