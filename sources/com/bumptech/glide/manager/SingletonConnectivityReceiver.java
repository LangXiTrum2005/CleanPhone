package com.bumptech.glide.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.AsyncTask;
import android.util.Log;
import com.bumptech.glide.util.GlideSuppliers;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class SingletonConnectivityReceiver {
    public static volatile SingletonConnectivityReceiver d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameworkConnectivityMonitorPostApi24 f12758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f12759b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12760c;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$2, reason: invalid class name */
    class AnonymousClass2 implements ConnectivityMonitor.ConnectivityListener {
        public AnonymousClass2() {
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        public final void a(boolean z2) {
            ArrayList arrayList;
            Util.a();
            synchronized (SingletonConnectivityReceiver.this) {
                arrayList = new ArrayList(SingletonConnectivityReceiver.this.f12759b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ConnectivityMonitor.ConnectivityListener) it.next()).a(z2);
            }
        }
    }

    public interface FrameworkConnectivityMonitor {
    }

    public static final class FrameworkConnectivityMonitorPostApi24 implements FrameworkConnectivityMonitor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12763a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConnectivityMonitor.ConnectivityListener f12764b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final GlideSuppliers.GlideSupplier f12765c;
        public final ConnectivityManager.NetworkCallback d = new ConnectivityManager.NetworkCallback() { // from class: com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPostApi24.1

            /* JADX INFO: renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPostApi24$1$1, reason: invalid class name and collision with other inner class name */
            class RunnableC00511 implements Runnable {
                public final /* synthetic */ boolean X;

                public RunnableC00511(boolean z2) {
                    this.X = z2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    anonymousClass1.getClass();
                    Util.a();
                    FrameworkConnectivityMonitorPostApi24 frameworkConnectivityMonitorPostApi24 = FrameworkConnectivityMonitorPostApi24.this;
                    boolean z2 = frameworkConnectivityMonitorPostApi24.f12763a;
                    boolean z3 = this.X;
                    frameworkConnectivityMonitorPostApi24.f12763a = z3;
                    if (z2 != z3) {
                        ((AnonymousClass2) frameworkConnectivityMonitorPostApi24.f12764b).a(z3);
                    }
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                Util.f().post(new RunnableC00511(true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                Util.f().post(new RunnableC00511(false));
            }
        };

        public FrameworkConnectivityMonitorPostApi24(GlideSuppliers.GlideSupplier glideSupplier, ConnectivityMonitor.ConnectivityListener connectivityListener) {
            this.f12765c = glideSupplier;
            this.f12764b = connectivityListener;
        }
    }

    public static final class FrameworkConnectivityMonitorPreApi24 implements FrameworkConnectivityMonitor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Executor f12768a = AsyncTask.SERIAL_EXECUTOR;

        /* JADX INFO: renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$1, reason: invalid class name */
        public class AnonymousClass1 extends BroadcastReceiver {
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$2, reason: invalid class name */
        class AnonymousClass2 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$3, reason: invalid class name */
        class AnonymousClass3 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$4, reason: invalid class name */
        class AnonymousClass4 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$FrameworkConnectivityMonitorPreApi24$5, reason: invalid class name */
        class AnonymousClass5 implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }
    }

    public SingletonConnectivityReceiver(final Context context) {
        this.f12758a = new FrameworkConnectivityMonitorPostApi24(GlideSuppliers.a(new GlideSuppliers.GlideSupplier<ConnectivityManager>() { // from class: com.bumptech.glide.manager.SingletonConnectivityReceiver.1
            @Override // com.bumptech.glide.util.GlideSuppliers.GlideSupplier
            public final Object get() {
                return (ConnectivityManager) context.getSystemService("connectivity");
            }
        }), new AnonymousClass2());
    }

    public static SingletonConnectivityReceiver a(Context context) {
        if (d == null) {
            synchronized (SingletonConnectivityReceiver.class) {
                try {
                    if (d == null) {
                        d = new SingletonConnectivityReceiver(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void b() {
        if (this.f12760c || this.f12759b.isEmpty()) {
            return;
        }
        FrameworkConnectivityMonitorPostApi24 frameworkConnectivityMonitorPostApi24 = this.f12758a;
        GlideSuppliers.GlideSupplier glideSupplier = frameworkConnectivityMonitorPostApi24.f12765c;
        boolean z2 = false;
        frameworkConnectivityMonitorPostApi24.f12763a = ((ConnectivityManager) glideSupplier.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) glideSupplier.get()).registerDefaultNetworkCallback(frameworkConnectivityMonitorPostApi24.d);
            z2 = true;
        } catch (RuntimeException e2) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e2);
            }
        }
        this.f12760c = z2;
    }
}
