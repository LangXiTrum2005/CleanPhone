package com.google.firebase.crashlytics.internal.model;

import android.os.Build;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StaticSessionData {

    public static abstract class AppData {
        public static AppData b(String str, String str2, String str3, String str4, int i2, DevelopmentPlatformProvider developmentPlatformProvider) {
            return new AutoValue_StaticSessionData_AppData(str, str2, str3, str4, i2, developmentPlatformProvider);
        }

        public abstract String a();

        public abstract int c();

        public abstract DevelopmentPlatformProvider d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    public static abstract class DeviceData {
        public static DeviceData c(int i2, int i3, long j, long j2, boolean z2, int i4) {
            String str = Build.MODEL;
            String str2 = Build.MANUFACTURER;
            String str3 = Build.PRODUCT;
            return new AutoValue_StaticSessionData_DeviceData(i2, i3, j, j2, z2, i4);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    public static abstract class OsData {
        public static OsData a(boolean z2) {
            String str = Build.VERSION.RELEASE;
            String str2 = Build.VERSION.CODENAME;
            return new AutoValue_StaticSessionData_OsData(z2);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static StaticSessionData b(AppData appData, OsData osData, DeviceData deviceData) {
        return new AutoValue_StaticSessionData(appData, osData, deviceData);
    }

    public abstract AppData a();

    public abstract DeviceData c();

    public abstract OsData d();
}
