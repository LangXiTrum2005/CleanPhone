package com.startapp.sdk.common.advertisingid;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.remoteconfig.AdvertisingIdResolverMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.l0;
import com.startapp.sdk.internal.m0;
import com.startapp.sdk.internal.m3;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.v5;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v5 f40718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3 f40719c;
    public final ReentrantLock d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Condition f40720e;
    public final AtomicReference f;
    public volatile boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile int f40721h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f40722i;
    public int j;

    public b(Context context, v5 v5Var, m3 m3Var) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.d = reentrantLock;
        this.f40720e = reentrantLock.newCondition();
        this.f = new AtomicReference();
        this.g = true;
        this.f40721h = 0;
        this.f40722i = Math.random();
        this.f40717a = context;
        this.f40718b = v5Var;
        this.f40719c = m3Var;
    }

    public final boolean a(int i2) {
        this.f40719c.getClass();
        AdvertisingIdResolverMetadata advertisingIdResolverMetadataG = MetaData.E().g();
        if (advertisingIdResolverMetadataG == null || !advertisingIdResolverMetadataG.c()) {
            advertisingIdResolverMetadataG = null;
        }
        return advertisingIdResolverMetadataG != null && this.f40722i < advertisingIdResolverMetadataG.b() && (advertisingIdResolverMetadataG.a() & i2) == i2;
    }

    public final void b(int i2) {
        if (a(i2)) {
            int i3 = this.j;
            if ((i3 & i2) == i2) {
                return;
            }
            this.j = i3 | i2;
            g9 g9Var = new g9(h9.f41040e);
            g9Var.d = "AIR";
            g9Var.f41002e = String.valueOf(i2);
            g9Var.a();
        }
    }

    public final void a(boolean z2) {
        boolean z3 = false;
        try {
            if (this.d.tryLock()) {
                z3 = true;
                this.g = z2;
                if (z2 && this.f40721h == 0) {
                    this.f40718b.newThread(new a(this)).start();
                    this.f40721h = 1;
                }
                this.d.unlock();
            }
        } catch (Throwable th) {
            try {
                if (a(16)) {
                    g9.a(th);
                }
            } finally {
                if (z3) {
                    this.d.unlock();
                }
            }
        }
    }

    public static l0 b(Context context) throws Throwable {
        m0 m0Var;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            m0Var = new m0();
            try {
                if (context.bindService(intent, m0Var, 1)) {
                    if (!m0Var.f41235b) {
                        IBinder iBinder = (IBinder) m0Var.f41234a.take();
                        if (iBinder != null) {
                            m0Var.f41235b = true;
                            Parcel parcelObtain = Parcel.obtain();
                            Parcel parcelObtain2 = Parcel.obtain();
                            try {
                                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                iBinder.transact(1, parcelObtain, parcelObtain2, 0);
                                parcelObtain2.readException();
                                String string = parcelObtain2.readString();
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                if (string != null) {
                                    Parcel parcelObtain3 = Parcel.obtain();
                                    Parcel parcelObtain4 = Parcel.obtain();
                                    try {
                                        parcelObtain3.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                                        parcelObtain3.writeInt(1);
                                        iBinder.transact(2, parcelObtain3, parcelObtain4, 0);
                                        parcelObtain4.readException();
                                        boolean z2 = parcelObtain4.readInt() != 0;
                                        parcelObtain4.recycle();
                                        parcelObtain3.recycle();
                                        l0 l0Var = new l0(string, "DEVICE", z2);
                                        int i2 = q0.f41381a;
                                        try {
                                            context.unbindService(m0Var);
                                        } catch (Throwable unused) {
                                        }
                                        return l0Var;
                                    } catch (Throwable th) {
                                        parcelObtain4.recycle();
                                        parcelObtain3.recycle();
                                        throw th;
                                    }
                                }
                                throw new RemoteException();
                            } catch (Throwable th2) {
                                parcelObtain2.recycle();
                                parcelObtain.recycle();
                                throw th2;
                            }
                        }
                        throw new IllegalStateException();
                    }
                    throw new IllegalStateException();
                }
                throw new AdvertisingIdResolver$InternalException(com.p004ironsource.mediationsdk.metadata.a.f25965n);
            } catch (Throwable th3) {
                th = th3;
                int i3 = q0.f41381a;
                if (m0Var != null) {
                    try {
                        context.unbindService(m0Var);
                    } catch (Throwable unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            m0Var = null;
        }
    }

    public final l0 a() {
        l0 l0Var;
        ReentrantLock reentrantLock;
        l0 l0Var2 = (l0) this.f.get();
        if (l0Var2 != null) {
            return l0Var2;
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            b(1);
            return l0.d;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.d.tryLock(1000L, TimeUnit.MILLISECONDS)) {
                try {
                    if (!this.g) {
                        l0Var = l0.d;
                        reentrantLock = this.d;
                    } else {
                        if (this.f40721h == 0) {
                            this.f40718b.newThread(new a(this)).start();
                            this.f40721h = 1;
                        }
                        while (this.f40721h != 2) {
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                            if (jElapsedRealtime2 > 1000) {
                                b(2);
                                l0Var = l0.d;
                                reentrantLock = this.d;
                            } else {
                                this.f40720e.await(1000 - jElapsedRealtime2, TimeUnit.MILLISECONDS);
                            }
                        }
                        l0 l0Var3 = (l0) this.f.get();
                        if (l0Var3 == null) {
                            b(4);
                            l0Var3 = l0.d;
                        } else if ("00000000-0000-0000-0000-000000000000".equals(l0Var3.f41193a) && Build.VERSION.SDK_INT >= 31) {
                            try {
                                if (this.f40717a.checkSelfPermission("com.google.android.gms.permission.AD_ID") != 0) {
                                    b(4096);
                                }
                            } catch (Throwable th) {
                                if (a(Segment.SIZE)) {
                                    g9.a(th);
                                }
                            }
                        }
                        this.d.unlock();
                        return l0Var3;
                    }
                    reentrantLock.unlock();
                    return l0Var;
                } catch (Throwable th2) {
                    this.d.unlock();
                    throw th2;
                }
            }
            b(8);
            return l0.d;
        } catch (Throwable th3) {
            if (a(32)) {
                g9.a(th3);
            }
            return l0.d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c A[EDGE_INSN: B:27:0x007c->B:28:0x007d BREAK  A[LOOP:1: B:18:0x0055->B:26:0x0079]] */
    public static l0 a(Context context) throws IllegalAccessException, AdvertisingIdResolver$InternalException, InvocationTargetException {
        Object objInvoke;
        Class<?> cls = Boolean.TYPE;
        String str = null;
        try {
            objInvoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
        } catch (NoSuchMethodException unused) {
            Class<?>[] declaredClasses = AdvertisingIdClient.class.getDeclaredClasses();
            if (declaredClasses.length != 1) {
                objInvoke = null;
                break;
            }
            Field[] declaredFields = declaredClasses[0].getDeclaredFields();
            if (declaredFields.length != 2 || ((declaredFields[0].getType() != String.class || declaredFields[1].getType() != cls) && (declaredFields[0].getType() != cls || declaredFields[1].getType() != String.class))) {
                objInvoke = null;
                break;
            }
            Method[] declaredMethods = AdvertisingIdClient.class.getDeclaredMethods();
            int length = declaredMethods.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    objInvoke = null;
                    break;
                }
                Method method = declaredMethods[i2];
                if (method.getReturnType() == declaredClasses[0] && method.getParameterTypes().length == 1 && method.getParameterTypes()[0] == Context.class) {
                    objInvoke = method.invoke(null, context);
                    break;
                }
                i2++;
            }
        }
        if (objInvoke != null) {
            Field[] declaredFields2 = objInvoke.getClass().getDeclaredFields();
            if (declaredFields2.length == 2) {
                Boolean bool = null;
                for (Field field : declaredFields2) {
                    field.setAccessible(true);
                    if (field.getType() == String.class) {
                        str = (String) field.get(objInvoke);
                    } else if (field.getType() == cls) {
                        bool = (Boolean) field.get(objInvoke);
                    }
                }
                if (str != null && !str.isEmpty()) {
                    return new l0(str, IronSourceConstants.APP_EVENT_TYPE, Boolean.TRUE.equals(bool));
                }
                throw new AdvertisingIdResolver$InternalException(1024);
            }
            throw new AdvertisingIdResolver$InternalException(512);
        }
        throw new AdvertisingIdResolver$InternalException(512);
    }
}
