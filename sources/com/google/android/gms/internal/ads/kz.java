package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.ironsource.X3;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kz {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yh0 f16570e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f16566a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16567b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16568c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f16569d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicInteger f16571f = new AtomicInteger(-1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f16572g = new AtomicReference(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f16573h = new AtomicReference(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f16574i = new ConcurrentHashMap(9);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f16575j = new Object();

    public static final Bundle f(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, X3.i.X)) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    public static final boolean g(Context context) {
        if (((Boolean) zzba.zzc().a(am.f12094c1)).booleanValue()) {
            if (t9.d.a(context, ModuleDescriptor.MODULE_ID) >= ((Integer) zzba.zzc().a(am.f12110d1)).intValue()) {
                if (!((Boolean) zzba.zzc().a(am.f12127e1)).booleanValue()) {
                    return true;
                }
                try {
                    context.getClassLoader().loadClass(Constants.FID_CLASS);
                    return false;
                } catch (ClassNotFoundException unused) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0059  */
    public final boolean a(Context context) {
        if (((Boolean) zzba.zzc().a(am.U0)).booleanValue() && !this.f16569d.get()) {
            if (!((Boolean) zzba.zzc().a(am.f12143f1)).booleanValue()) {
                AtomicInteger atomicInteger = this.f16571f;
                if (atomicInteger.get() == -1) {
                    zzay.zza();
                    if (zzf.zzz(context, 12451000)) {
                        atomicInteger.set(1);
                    } else {
                        zzay.zza();
                        if (zzf.zzA(context)) {
                            int i10 = zze.zza;
                            zzo.zzi("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                            atomicInteger.set(0);
                        } else {
                            atomicInteger.set(1);
                        }
                    }
                }
                if (atomicInteger.get() == 1) {
                }
            }
            return true;
        }
        return false;
    }

    public final String b(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.f16567b) {
            try {
                String str = this.f16568c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) k(context, "getGmpAppId");
                this.f16568c = str2;
                return str2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String c(Context context) {
        if (a(context)) {
            long jLongValue = ((Long) zzba.zzc().a(am.f12060a1)).longValue();
            if (jLongValue < 0) {
                return (String) k(context, Constants.GET_APP_INSTANCE_ID);
            }
            AtomicReference atomicReference = this.f16566a;
            if (atomicReference.get() == null) {
                ul ulVar = am.f12077b1;
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzba.zzc().a(ulVar)).intValue(), ((Integer) zzba.zzc().a(ulVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new jz(this));
                while (!atomicReference.compareAndSet(null, threadPoolExecutor) && atomicReference.get() == null) {
                }
            }
            try {
                return (String) ((ExecutorService) atomicReference.get()).submit(new ze(3, this, context)).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String d(Context context) {
        Object objK;
        if (a(context) && (objK = k(context, "generateEventId")) != null) {
            return objK.toString();
        }
        return null;
    }

    public final void e(Context context, String str, String str2, int i10, String str3) {
        if (a(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i10);
            h(context, "_ar", str, bundle);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i10).length());
            sb2.append("Log a Firebase reward video event, reward type: ");
            sb2.append(str3);
            sb2.append(", reward value: ");
            sb2.append(i10);
            zze.zza(sb2.toString());
        }
    }

    public final void h(Context context, String str, String str2, Bundle bundle) {
        if (a(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e10) {
                String strValueOf = String.valueOf(str2);
                int i10 = zze.zza;
                zzo.zzg("Invalid event ID: ".concat(strValueOf), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            AtomicReference atomicReference = this.f16572g;
            if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.f16574i;
                Method declaredMethod = (Method) concurrentHashMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        l("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    l("logEventInternal", true);
                }
            }
        }
    }

    public final Method i(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.f16574i;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            l(str, false);
            return null;
        }
    }

    public final void j(Context context, String str, String str2) {
        AtomicReference atomicReference = this.f16572g;
        if (m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.f16574i;
            Method declaredMethod = (Method) concurrentHashMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    l(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(atomicReference.get(), str);
                StringBuilder sb2 = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb2.append("Invoke Firebase method ");
                sb2.append(str2);
                sb2.append(", Ad Unit Id: ");
                sb2.append(str);
                zze.zza(sb2.toString());
            } catch (Exception unused2) {
                l(str2, false);
            }
        }
    }

    public final Object k(Context context, String str) {
        AtomicReference atomicReference = this.f16572g;
        if (!m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return i(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            l(str, true);
            return null;
        }
    }

    public final void l(String str, boolean z10) {
        AtomicBoolean atomicBoolean = this.f16569d;
        if (atomicBoolean.get()) {
            return;
        }
        String strJ = q4.a.j(new StringBuilder(str.length() + 30), "Invoke Firebase method ", str, " error.");
        int i10 = zze.zza;
        zzo.zzi(strJ);
        if (z10) {
            zzo.zzi("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
        if (this.f16570e != null) {
            if (this.f16573h.get() == null && this.f16572g.get() == null) {
                return;
            }
            lj1 lj1VarA = this.f16570e.a();
            lj1VarA.l("action", "ga_log_event_error");
            lj1VarA.l("method_name", str);
            lj1VarA.m();
        }
    }

    public final boolean m(Context context, String str, AtomicReference atomicReference, boolean z10) {
        if (atomicReference.get() != null) {
            return true;
        }
        try {
            Object objInvoke = context.getClassLoader().loadClass(str).getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context);
            while (!atomicReference.compareAndSet(null, objInvoke) && atomicReference.get() == null) {
            }
            return true;
        } catch (Exception unused) {
            l(Constants.GET_INSTANCE, z10);
            return false;
        }
    }
}
