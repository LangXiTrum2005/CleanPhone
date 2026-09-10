package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import com.thinkup.core.common.n.mo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsReportDataCapture {
    public static final HashMap f;
    public static final String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdManager f20342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppData f20343c;
    public final MiddleOutFallbackStrategy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SettingsController f20344e;

    static {
        HashMap map = new HashMap();
        f = map;
        androidx.datastore.preferences.protobuf.a.v(5, map, "armeabi", 6, "armeabi-v7a");
        androidx.datastore.preferences.protobuf.a.v(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.3";
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, MiddleOutFallbackStrategy middleOutFallbackStrategy, SettingsController settingsController) {
        this.f20341a = context;
        this.f20342b = idManager;
        this.f20343c = appData;
        this.d = middleOutFallbackStrategy;
        this.f20344e = settingsController;
    }

    public static CrashlyticsReport.Session.Event.Application.Execution.Exception c(TrimmedThrowableData trimmedThrowableData, int i2) {
        String str = trimmedThrowableData.f20772b;
        int i3 = 0;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.f20773c;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.d;
        if (i2 >= 8) {
            for (TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2; trimmedThrowableData3 != null; trimmedThrowableData3 = trimmedThrowableData3.d) {
                i3++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.Exception.a();
        builderA.f(str);
        builderA.e(trimmedThrowableData.f20771a);
        builderA.c(d(stackTraceElementArr, 4));
        builderA.d(i3);
        if (trimmedThrowableData2 != null && i3 == 0) {
            builderA.b(c(trimmedThrowableData2, i2 + 1));
        }
        return builderA.a();
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.a();
            builderA.c(i2);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + mo.ono + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            builderA.e(jMax);
            builderA.f(str);
            builderA.b(fileName);
            builderA.d(lineNumber);
            arrayList.add(builderA.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List a() {
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.a();
        builderA.b(0L);
        builderA.d(0L);
        AppData appData = this.f20343c;
        builderA.c(appData.f20296e);
        builderA.e(appData.f20294b);
        return Collections.singletonList(builderA.a());
    }

    public final CrashlyticsReport.Session.Event.Device b(int i2) {
        boolean z2;
        Float fValueOf;
        Context context = this.f20341a;
        int i3 = 2;
        boolean z3 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z2 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    fValueOf = (intExtra2 == -1 || intExtra3 == -1) ? null : Float.valueOf(intExtra2 / intExtra3);
                } catch (IllegalStateException e2) {
                    e = e2;
                    Logger.f20289a.c(e, "An error occurred getting battery state.");
                }
            } else {
                fValueOf = null;
                z2 = false;
            }
        } catch (IllegalStateException e3) {
            e = e3;
            z2 = false;
        }
        Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
        if (!z2 || fValueOf == null) {
            i3 = 1;
        } else if (fValueOf.floatValue() >= 0.99d) {
            i3 = 3;
        }
        if (!CommonUtils.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z3 = true;
        }
        long jA = CommonUtils.a(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jA - memoryInfo.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize = statFs.getBlockSize();
        long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
        CrashlyticsReport.Session.Event.Device.Builder builderA = CrashlyticsReport.Session.Event.Device.a();
        builderA.b(dValueOf);
        builderA.c(i3);
        builderA.f(z3);
        builderA.e(i2);
        builderA.g(j);
        builderA.d(blockCount);
        return builderA.a();
    }
}
