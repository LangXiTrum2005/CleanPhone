package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import com.umeng.analytics.pro.cw;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1570fk {
    public static C1570fk A04;
    public static byte[] A05;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<WeakReference<InterfaceC1568fi>> A03 = new CopyOnWriteArrayList<>();
    public final Object A02 = new Object();
    public int A00 = 0;

    static {
        A06();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{108, 99, 105, 127, 98, 100, 105, 35, 99, 104, 121, 35, 110, 98, 99, 99, 35, 78, 66, 67, 67, 72, 78, 89, 68, 91, 68, 89, 84, 82, 78, 69, 76, 67, 74, 72, 9, 5, 4, 4, cw.m, 9, 30, 3, 28, 3, 30, 19};
    }

    public C1570fk(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A04(0, 36, 71));
        context.registerReceiver(new C1569fj(this), intentFilter);
    }

    public static int A00(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(A04(36, 12, 32));
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
            if (networkInfo == null || !networkInfo.isConnected()) {
                return 1;
            }
            switch (networkInfo.getType()) {
                case 0:
                case 4:
                case 5:
                    return A02(networkInfo);
                case 1:
                    return 2;
                case 2:
                case 3:
                case 7:
                case 8:
                default:
                    return 8;
                case 6:
                    return 5;
                case 9:
                    return 7;
            }
        } catch (SecurityException unused) {
            return 0;
        }
    }

    public static int A02(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return AbstractC1600gE.A02 >= 29 ? 9 : 0;
        }
    }

    public static synchronized C1570fk A03(Context context) {
        if (A04 == null) {
            A04 = new C1570fk(context);
        }
        return A04;
    }

    private void A05() {
        for (WeakReference<InterfaceC1568fi> weakReference : this.A03) {
            if (weakReference.get() == null) {
                this.A03.remove(weakReference);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(int i) {
        synchronized (this.A02) {
            if (this.A00 == i) {
                return;
            }
            this.A00 = i;
            for (WeakReference<InterfaceC1568fi> weakReference : this.A03) {
                InterfaceC1568fi interfaceC1568fi = weakReference.get();
                if (interfaceC1568fi != null) {
                    interfaceC1568fi.AEG(i);
                } else {
                    this.A03.remove(weakReference);
                }
            }
        }
    }

    public final int A09() {
        int i;
        synchronized (this.A02) {
            i = this.A00;
        }
        return i;
    }

    public final void A0A(final InterfaceC1568fi interfaceC1568fi) {
        A05();
        this.A03.add(new WeakReference<>(interfaceC1568fi));
        this.A01.post(new Runnable() { // from class: com.facebook.ads.redexgen.X.fe
            @Override // java.lang.Runnable
            public final void run() {
                this.A01.A0B(interfaceC1568fi);
            }
        });
    }

    public final /* synthetic */ void A0B(InterfaceC1568fi interfaceC1568fi) {
        interfaceC1568fi.AEG(A09());
    }
}
