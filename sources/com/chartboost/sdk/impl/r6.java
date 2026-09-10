package com.chartboost.sdk.impl;

import android.app.Application;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.StatFs;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.LGPD;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r6 f14995a = new r6();

    public enum a {
        BUILTIN_SPEAKER(0),
        WIRED_HEADPHONES(1),
        BLUETOOTH_A2DP(2),
        OTHER(3);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f14998h = EnumEntriesKt.a(a());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f14999b;

        a(int i2) {
            this.f14999b = i2;
        }

        public final int b() {
            return this.f14999b;
        }
    }

    public final s6 a(y8 y8Var, vf vfVar, String str, be privacyApi, String str2) {
        String strC;
        String string;
        String string2;
        String string3;
        String string4;
        Object consent;
        Object consent2;
        Object consent3;
        Object consent4;
        Intrinsics.f(privacyApi, "privacyApi");
        t6 t6Var = t6.f15176a;
        if (!t6Var.o()) {
            za.b("EnvironmentManager not initialized. Call EnvironmentManager.init() first.", (Throwable) null, 2, (Object) null);
            return new s6(null, 0, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, 0, false, 0, 0L, 0L, 0, 0, 0, 0L, 0L, -1, null);
        }
        Application applicationC = t6Var.c();
        b bVarC = c(applicationC);
        String strA = a((Context) applicationC);
        long jD = d(applicationC);
        long jA = a();
        int iB = b(applicationC);
        boolean zE = e(applicationC);
        int iA = a(applicationC);
        if (vfVar == null || (strC = vfVar.c()) == null) {
            strC = "session not ready";
        }
        String str3 = strC;
        int iF = vfVar != null ? vfVar.f() : -1;
        String str4 = str2 == null ? "App was not init yet" : str2;
        String strB = t6Var.b();
        DataUseConsent dataUseConsentA = privacyApi.a("gdpr");
        if (dataUseConsentA == null || (consent4 = dataUseConsentA.getConsent()) == null || (string = consent4.toString()) == null) {
            string = "gdpr not available";
        }
        String str5 = string;
        DataUseConsent dataUseConsentA2 = privacyApi.a(CCPA.CCPA_STANDARD);
        if (dataUseConsentA2 == null || (consent3 = dataUseConsentA2.getConsent()) == null || (string2 = consent3.toString()) == null) {
            string2 = "ccpa not available";
        }
        String str6 = string2;
        DataUseConsent dataUseConsentA3 = privacyApi.a("coppa");
        if (dataUseConsentA3 == null || (consent2 = dataUseConsentA3.getConsent()) == null || (string3 = consent2.toString()) == null) {
            string3 = "coppa not available";
        }
        String str7 = string3;
        DataUseConsent dataUseConsentA4 = privacyApi.a(LGPD.LGPD_STANDARD);
        if (dataUseConsentA4 == null || (consent = dataUseConsentA4.getConsent()) == null || (string4 = consent.toString()) == null) {
            string4 = "lgpd not available";
        }
        return new s6(str3, iF, str4, strB, "9.10.2", false, str5, str6, str7, string4, a(y8Var), t6Var.g(), t6Var.h(), t6Var.i(), t6Var.j(), t6Var.d(), t6Var.f(), t6Var.k(), str == null ? "connection type not provided" : str, strA, bVarC.a(), bVarC.b(), iB, zE, iA, jD, jA, vfVar != null ? vfVar.d() : 0, vfVar != null ? vfVar.e() : 0, vfVar != null ? vfVar.a() : 0, vfVar != null ? vfVar.b() : -1L, SystemClock.uptimeMillis());
    }

    public final int b(AudioManager audioManager) {
        AudioDeviceInfo[] devices = audioManager.getDevices(2);
        Intrinsics.c(devices);
        if (devices.length == 0) {
            return a.OTHER.b();
        }
        AudioDeviceInfo audioDeviceInfo = devices[0];
        Intrinsics.e(audioDeviceInfo, "get(...)");
        int type = audioDeviceInfo.getType();
        if (type == 2) {
            return a.BUILTIN_SPEAKER.b();
        }
        if (type != 4) {
            return type != 8 ? a.OTHER.b() : a.BLUETOOTH_A2DP.b();
        }
        return a.WIRED_HEADPHONES.b();
    }

    public final b c(Application application) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i2 = 3;
        int i3 = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        try {
            if (application == null) {
                return new b(i3, b4 == true ? 1 : 0, i2, defaultConstructorMarker);
            }
            Object systemService = application.getSystemService("batterymanager");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
            BatteryManager batteryManager = (BatteryManager) systemService;
            return new b(batteryManager.getIntProperty(4), batteryManager.isCharging());
        } catch (Exception e2) {
            za.a("Cannot create environment device battery for tracking", e2);
            return new b(b3 == true ? 1 : 0, b2 == true ? 1 : 0, i2, defaultConstructorMarker);
        }
    }

    public final long d(Application application) {
        if (application == null) {
            return -1L;
        }
        try {
            return new StatFs(application.getCacheDir() + "/.chartboost").getAvailableBytes();
        } catch (Exception e2) {
            za.a("Cannot create environment device storage for tracking", e2);
            return -1L;
        }
    }

    public final boolean e(Application application) {
        if (application == null) {
            return false;
        }
        try {
            Object systemService = application.getSystemService("audio");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return ((AudioManager) systemService).getRingerMode() != 2;
        } catch (Exception e2) {
            za.a("Cannot create environment audio for tracking", e2);
            return false;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f15001b;

        public b(int i2, boolean z2) {
            this.f15000a = i2;
            this.f15001b = z2;
        }

        public final int a() {
            return this.f15000a;
        }

        public final boolean b() {
            return this.f15001b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f15000a == bVar.f15000a && this.f15001b == bVar.f15001b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f15001b) + (Integer.hashCode(this.f15000a) * 31);
        }

        public String toString() {
            return "DeviceBattery(batteryLevel=" + this.f15000a + ", isCharging=" + this.f15001b + ")";
        }

        public /* synthetic */ b(int i2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? false : z2);
        }
    }

    public final int b(Application application) {
        if (application == null) {
            return -1;
        }
        try {
            Object systemService = application.getSystemService("audio");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            AudioManager audioManager = (AudioManager) systemService;
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume > 0) {
                return (int) ((streamVolume / streamMaxVolume) * 100);
            }
            return -1;
        } catch (Exception e2) {
            za.a("Cannot create environment audio for tracking", e2);
            return -1;
        }
    }

    public final int a(Application application) {
        try {
            if (application == null) {
                return a.OTHER.b();
            }
            Object systemService = application.getSystemService("audio");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            return b((AudioManager) systemService);
        } catch (Exception e2) {
            za.a("Cannot create environment audio output for tracking", e2);
            return a.OTHER.b();
        }
    }

    public final int a(AudioManager audioManager) {
        if (audioManager.isSpeakerphoneOn()) {
            return a.BUILTIN_SPEAKER.b();
        }
        return a.OTHER.b();
    }

    public final long a() {
        try {
            Runtime runtime = Runtime.getRuntime();
            return (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        } catch (Exception e2) {
            za.a("Cannot create environment runtime for tracking", e2);
            return -1L;
        }
    }

    public final String a(y8 y8Var) {
        String strE = t6.f15176a.e();
        if (!Intrinsics.a(strE, "unknown")) {
            return strE;
        }
        if (y8Var != null) {
            String strA = y8Var.a();
            if (strA == null) {
                strA = y8Var.g();
            }
            if (strA != null) {
                return strA;
            }
        }
        return "unknown";
    }

    public final String a(Context context) {
        String strB;
        try {
            f6 f6VarL = t6.f15176a.l();
            return (f6VarL == null || (strB = qd.b(context, f6VarL)) == null) ? "Cannot retrieve orientation" : strB;
        } catch (Exception e2) {
            za.a("Cannot retrieve orientation", e2);
            return "Cannot retrieve orientation";
        }
    }
}
