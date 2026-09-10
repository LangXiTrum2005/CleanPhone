package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PlatformServiceClient implements ServiceConnection {
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Handler f16367Y;
    public CompletedListener Z;
    public boolean e0;
    public Messenger f0;
    public final int g0;
    public final int h0;
    public final String i0;
    public final int j0;
    public final String k0;

    public interface CompletedListener {
        void a(Bundle bundle);
    }

    public PlatformServiceClient(Context context, int i2, int i3, int i4, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.X = applicationContext != null ? applicationContext : context;
        this.g0 = i2;
        this.h0 = i3;
        this.i0 = str;
        this.j0 = i4;
        this.k0 = str2;
        this.f16367Y = new Handler() { // from class: com.facebook.internal.PlatformServiceClient.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (CrashShieldHandler.b(this)) {
                    return;
                }
                try {
                    PlatformServiceClient platformServiceClient = PlatformServiceClient.this;
                    platformServiceClient.getClass();
                    if (message.what == platformServiceClient.h0) {
                        Bundle data = message.getData();
                        if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                            platformServiceClient.a(null);
                        } else {
                            platformServiceClient.a(data);
                        }
                        try {
                            platformServiceClient.X.unbindService(platformServiceClient);
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (Throwable th) {
                    CrashShieldHandler.a(this, th);
                }
            }
        };
    }

    public final void a(Bundle bundle) {
        if (this.e0) {
            this.e0 = false;
            CompletedListener completedListener = this.Z;
            if (completedListener != null) {
                completedListener.a(bundle);
            }
        }
    }

    public abstract void b(Bundle bundle);

    /* JADX WARN: Code duplicated, block: B:23:0x006a  */
    public final boolean c() {
        int i2;
        if (!this.e0) {
            int i3 = this.j0;
            ArrayList arrayList = NativeProtocol.f16360a;
            if (CrashShieldHandler.b(NativeProtocol.class)) {
                i2 = 0;
            } else {
                try {
                    i2 = NativeProtocol.f16363e.l(NativeProtocol.f16360a, new int[]{i3}).f16366b;
                } catch (Throwable th) {
                    CrashShieldHandler.a(NativeProtocol.class, th);
                    i2 = 0;
                }
            }
            if (i2 != -1) {
                boolean zB = CrashShieldHandler.b(NativeProtocol.class);
                Context context = this.X;
                Intent intent = null;
                if (!zB) {
                    try {
                        Intrinsics.f(context, "context");
                        Iterator it = NativeProtocol.f16360a.iterator();
                        while (it.hasNext()) {
                            Intent intentAddCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((NativeProtocol.NativeAppInfo) it.next()).c()).addCategory("android.intent.category.DEFAULT");
                            if (CrashShieldHandler.b(NativeProtocol.class) || intentAddCategory == null) {
                                intentAddCategory = null;
                            } else {
                                try {
                                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intentAddCategory, 0);
                                    if (resolveInfoResolveService != null) {
                                        String str = resolveInfoResolveService.serviceInfo.packageName;
                                        Intrinsics.e(str, "resolveInfo.serviceInfo.packageName");
                                        if (!FacebookSignatureValidator.a(context, str)) {
                                            intentAddCategory = null;
                                        }
                                    } else {
                                        intentAddCategory = null;
                                    }
                                } catch (Throwable th2) {
                                    CrashShieldHandler.a(NativeProtocol.class, th2);
                                }
                            }
                            if (intentAddCategory != null) {
                                intent = intentAddCategory;
                                break;
                            }
                        }
                    } catch (Throwable th3) {
                        CrashShieldHandler.a(NativeProtocol.class, th3);
                    }
                }
                if (intent != null) {
                    this.e0 = true;
                    context.bindService(intent, this, 1);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f0 = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.i0);
        String str = this.k0;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        b(bundle);
        Message messageObtain = Message.obtain((Handler) null, this.g0);
        messageObtain.arg1 = this.j0;
        messageObtain.setData(bundle);
        messageObtain.replyTo = new Messenger(this.f16367Y);
        try {
            this.f0.send(messageObtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f0 = null;
        try {
            this.X.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
