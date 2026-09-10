package com.startapp.sdk.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.RemoteException;
import com.startapp.sdk.adsbase.remoteconfig.ConnectivityHelperMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class g6 {
    public static final int[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f40995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l4 f40996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedList f40997c = new LinkedList();
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public f6 f40998e;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            arrayList.add(5);
        }
        if (i2 >= 27) {
            arrayList.add(6);
        }
        if (i2 >= 31) {
            arrayList.add(8);
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        f = iArr;
    }

    public g6(Context context, l4 l4Var) {
        this.f40995a = context;
        this.f40996b = l4Var;
    }

    public final void a() {
        if (this.d.getAndSet(true)) {
            return;
        }
        try {
            int i2 = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f40995a.getSystemService("connectivity");
            if (connectivityManager != null) {
                connectivityManager.addDefaultNetworkActiveListener(new e6(this));
                this.f40996b.getClass();
                ConnectivityHelperMetadata connectivityHelperMetadataQ = MetaData.E().q();
                f6 n0Var = null;
                ConnectivityHelperMetadata.Transport transportA = connectivityHelperMetadataQ != null ? connectivityHelperMetadataQ.a() : null;
                if (transportA != null) {
                    if (vi.a(i2, transportA.a())) {
                        n0Var = new i(this.f40995a, connectivityManager);
                    } else if (vi.a(i2, transportA.b())) {
                        n0Var = new n0(this.f40995a, connectivityManager);
                    }
                    if (n0Var != null) {
                        n0Var.b();
                        this.f40998e = n0Var;
                    }
                }
            }
        } catch (Throwable th) {
            g9.a(th);
        }
    }

    public final boolean b() {
        if (q0.a(this.f40995a, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f40995a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    return activeNetworkInfo != null && activeNetworkInfo.isConnected();
                }
            } catch (Throwable th) {
                if (!vi.a(th, RemoteException.class)) {
                    g9.a(th);
                }
            }
        }
        return true;
    }

    public final void a(n9 n9Var) {
        synchronized (this.f40997c) {
            try {
                if (!this.f40997c.contains(n9Var)) {
                    this.f40997c.add(n9Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return 0;
        }
        int i2 = 0;
        for (int i3 : f) {
            try {
                if (networkCapabilities.hasTransport(i3)) {
                    i2 |= 1 << i3;
                }
            } catch (Throwable unused) {
            }
        }
        return i2;
    }
}
