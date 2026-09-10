package com.facebook.login;

import com.facebook.internal.instrument.crashshield.CrashShieldHandler;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceLoginManager extends LoginManager {
    public static volatile DeviceLoginManager k;

    public static DeviceLoginManager h() {
        if (CrashShieldHandler.b(DeviceLoginManager.class)) {
            return null;
        }
        try {
            if (k == null) {
                synchronized (DeviceLoginManager.class) {
                    try {
                        if (k == null) {
                            k = new DeviceLoginManager();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return k;
        } catch (Throwable th2) {
            CrashShieldHandler.a(DeviceLoginManager.class, th2);
            return null;
        }
    }
}
