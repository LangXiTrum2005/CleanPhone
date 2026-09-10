package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Process;
import android.os.UserManager;
import android.system.Os;
import android.util.Log;
import com.google.android.gms.internal.ads.zs;
import com.ironsource.X3;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f23507a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f23508b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f23509c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile zs f23510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile zs f23511e;

    public static IOException a(te teVar, Uri uri, IOException iOException, String str) {
        try {
            gf gfVar = new gf();
            gfVar.f23516a = true;
            File file = (File) teVar.a(uri, gfVar);
            if (!file.exists()) {
                return d(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? d(file, iOException, str) : d(file, iOException, str);
                }
                return file.canWrite() ? d(file, iOException, str) : d(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? d(file, iOException, str) : d(file, iOException, str);
            }
            return file.canWrite() ? d(file, iOException, str) : d(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }

    public static b6 c(m1 m1Var, d8 d8Var, ArrayList arrayList, boolean z10) {
        b6 b6VarA;
        yg.f(1, "reduce", arrayList);
        yg.g(2, "reduce", arrayList);
        b6 b6VarE = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(0));
        if (!(b6VarE instanceof p4)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            b6VarA = ((h6) d8Var.f23388c).e(d8Var, (b6) arrayList.get(1));
            if (b6VarA instanceof t2) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (m1Var.q() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            b6VarA = null;
        }
        p4 p4Var = (p4) b6VarE;
        int iQ = m1Var.q();
        int i10 = z10 ? 0 : iQ - 1;
        int i11 = z10 ? iQ - 1 : 0;
        int i12 = true == z10 ? 1 : -1;
        if (b6VarA == null) {
            b6VarA = m1Var.r(i10);
            i10 += i12;
        }
        while ((i11 - i10) * i12 >= 0) {
            if (m1Var.t(i10)) {
                b6VarA = p4Var.a(d8Var, Arrays.asList(b6VarA, m1Var.r(i10), new o3(Double.valueOf(i10)), m1Var));
                if (b6VarA instanceof t2) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i12;
            } else {
                i10 += i12;
            }
        }
        return b6VarA;
    }

    public static IOException d(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return f(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return f(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? f(file, iOException, str) : f(file, iOException, str);
            }
            return parentFile.canWrite() ? f(file, iOException, str) : f(file, iOException, str);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? f(file, iOException, str) : f(file, iOException, str);
        }
        return parentFile.canWrite() ? f(file, iOException, str) : f(file, iOException, str);
    }

    public static m1 e(m1 m1Var, d8 d8Var, a6 a6Var, Boolean bool, Boolean bool2) {
        m1 m1Var2 = new m1();
        Iterator itP = m1Var.p();
        while (itP.hasNext()) {
            int iIntValue = ((Integer) itP.next()).intValue();
            if (m1Var.t(iIntValue)) {
                b6 b6VarA = a6Var.a(d8Var, Arrays.asList(m1Var.r(iIntValue), new o3(Double.valueOf(iIntValue)), m1Var));
                if (b6VarA.zze().equals(bool)) {
                    break;
                }
                if (bool2 == null || b6VarA.zze().equals(bool2)) {
                    m1Var2.s(iIntValue, b6VarA);
                }
            }
        }
        return m1Var2;
    }

    public static IOException f(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + X3.j.f27836e;
            StringBuilder sb2 = new StringBuilder(str2.length() + 16);
            sb2.append("Inoperable file:");
            sb2.append(str2);
            strConcat = sb2.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + X3.j.f27836e;
                StringBuilder sb3 = new StringBuilder(strConcat.length() + str3.length());
                sb3.append(strConcat);
                sb3.append(str3);
                strConcat = sb3.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    public static final void g(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        fb fbVar = new fb(level, exc, str, objArr, 1);
        int i10 = tg.f23998a;
        executor.execute(new com.google.android.gms.common.api.internal.m0(new kotlin.jvm.internal.c0(), dg.a(), fbVar, false, 4));
    }

    public static ta.r h(Context context, Callable callable, Executor executor) {
        q6 q6Var = new q6(callable, 9);
        if (i(context)) {
            ta.x0 x0Var = new ta.x0();
            x0Var.f50672i = new ta.w0(x0Var, q6Var);
            executor.execute(x0Var);
            return x0Var;
        }
        ta.v0 v0Var = new ta.v0();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        eb ebVar = new eb(atomicBoolean, context, v0Var, q6Var, executor);
        context.registerReceiver(ebVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!i(context) || !atomicBoolean.compareAndSet(false, true)) {
            v0Var.addListener(new fb(v0Var, atomicBoolean, context, ebVar, 0), ta.c0.f50592a);
            return v0Var;
        }
        try {
            context.unregisterReceiver(ebVar);
        } catch (IllegalArgumentException e10) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e10);
        }
        ta.x0 x0Var2 = new ta.x0();
        x0Var2.f50672i = new ta.w0(x0Var2, q6Var);
        executor.execute(x0Var2);
        v0Var.o(x0Var2);
        return v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    public static boolean i(Context context) {
        if (f23508b) {
            return true;
        }
        synchronized (gb.class) {
            try {
                if (f23508b) {
                    return true;
                }
                int i10 = 1;
                while (true) {
                    boolean z10 = false;
                    if (i10 <= 2) {
                        if (f23507a == null) {
                            f23507a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f23507a;
                        if (userManager == null) {
                            z10 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z10 = true;
                                }
                            } catch (NullPointerException e10) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e10);
                                f23507a = null;
                                i10++;
                            }
                        }
                        if (z10) {
                            f23508b = true;
                        }
                        return z10;
                    }
                    if (z10) {
                        f23507a = null;
                    }
                    if (z10) {
                        f23508b = true;
                    }
                    return z10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
