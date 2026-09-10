package zb;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import cc.b1;
import cc.f1;
import cc.g1;
import cc.x0;
import cc.y0;
import cc.z0;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.internal.ads.j30;
import eb.d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashMap f54751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f54752g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f54754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30 f54755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f54756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.internal.consent_sdk.d f54757e;

    static {
        HashMap map = new HashMap();
        f54751f = map;
        d5.u.p(5, map, "armeabi", 6, "armeabi-v7a");
        d5.u.p(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f54752g = "Crashlytics Android SDK/20.1.0";
    }

    public s(Context context, x xVar, j30 j30Var, d0 d0Var, com.google.android.gms.internal.consent_sdk.d dVar) {
        this.f54753a = context;
        this.f54754b = xVar;
        this.f54755c = j30Var;
        this.f54756d = d0Var;
        this.f54757e = dVar;
    }

    public static y0 c(zc.u uVar, int i10) {
        String str = (String) uVar.f54880c;
        String str2 = (String) uVar.f54879b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) uVar.f54881d;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        zc.u uVar2 = (zc.u) uVar.f54882e;
        if (i10 >= 8) {
            zc.u uVar3 = uVar2;
            while (uVar3 != null) {
                uVar3 = (zc.u) uVar3.f54882e;
                i11++;
            }
        }
        int i12 = i11;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b10 = (byte) (0 | 1);
        y0 y0VarC = null;
        if (uVar2 != null && i12 == 0) {
            y0VarC = c(uVar2, i10 + 1);
        }
        if (b10 == 1) {
            return new y0(str, str2, listD, y0VarC, i12);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            b1 b1Var = new b1();
            b1Var.f6005e = i10;
            b1Var.f6006f = (byte) (b1Var.f6006f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            b1Var.f6001a = jMax;
            byte b10 = (byte) (b1Var.f6006f | 1);
            b1Var.f6006f = b10;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            b1Var.f6002b = str;
            b1Var.f6003c = fileName;
            b1Var.f6004d = lineNumber;
            b1Var.f6006f = (byte) (b10 | 2);
            arrayList.add(b1Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static z0 e() {
        byte b10 = (byte) 1;
        if (b10 == 1) {
            return new z0("0", "0", 0L);
        }
        StringBuilder sb2 = new StringBuilder();
        if (b10 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }

    public final List a() {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        j30 j30Var = this.f54755c;
        String str = (String) j30Var.f15950d;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = (String) j30Var.f15947a;
        if (b10 == 3) {
            return Collections.singletonList(new x0(0L, 0L, str, str2));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    public final g1 b(int i10) {
        boolean z10;
        Float fValueOf;
        int i11;
        long j10;
        Context context = this.f54753a;
        boolean z11 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                z10 = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e10) {
                    e = e10;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z10 || fValueOf == null) {
                    i11 = 1;
                } else {
                    i11 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!f.g() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z11 = true;
                }
                long jA = f.a(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j10 = jA - memoryInfo.availMem;
                if (j10 <= 0) {
                    j10 = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                f1 f1Var = new f1();
                f1Var.f6084a = dValueOf;
                f1Var.f6085b = i11;
                byte b10 = (byte) (f1Var.f6090g | 1);
                f1Var.f6086c = z11;
                f1Var.f6087d = i10;
                f1Var.f6088e = j10;
                f1Var.f6089f = blockCount;
                f1Var.f6090g = (byte) (((byte) (((byte) (((byte) (b10 | 2)) | 4)) | 8)) | 16);
                return f1Var.a();
            }
            z10 = false;
        } catch (IllegalStateException e11) {
            e = e11;
            z10 = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z10) {
            i11 = 1;
        } else {
            i11 = 1;
        }
        if (!f.g()) {
            z11 = true;
        }
        long jA2 = f.a(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j10 = jA2 - memoryInfo2.availMem;
        if (j10 <= 0) {
            j10 = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        f1 f1Var2 = new f1();
        f1Var2.f6084a = dValueOf;
        f1Var2.f6085b = i11;
        byte b11 = (byte) (f1Var2.f6090g | 1);
        f1Var2.f6086c = z11;
        f1Var2.f6087d = i10;
        f1Var2.f6088e = j10;
        f1Var2.f6089f = blockCount2;
        f1Var2.f6090g = (byte) (((byte) (((byte) (((byte) (b11 | 2)) | 4)) | 8)) | 16);
        return f1Var2.a();
    }
}
