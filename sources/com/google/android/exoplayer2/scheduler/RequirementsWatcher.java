package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.e;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes3.dex */
public final class RequirementsWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f18307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Requirements f18308c;
    public final Handler d = Util.m(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DeviceStatusChangeReceiver f18309e;
    public int f;
    public NetworkCallback g;

    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        public DeviceStatusChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            RequirementsWatcher.this.a();
        }
    }

    public interface Listener {
    }

    public final class NetworkCallback extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f18312b;

        public NetworkCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            RequirementsWatcher.this.d.post(new b(this, 0));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z2) {
            if (z2) {
                return;
            }
            RequirementsWatcher.this.d.post(new b(this, 1));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            boolean z2 = this.f18311a;
            RequirementsWatcher requirementsWatcher = RequirementsWatcher.this;
            if (z2 && this.f18312b == zHasCapability) {
                if (zHasCapability) {
                    requirementsWatcher.d.post(new b(this, 1));
                }
            } else {
                this.f18311a = true;
                this.f18312b = zHasCapability;
                requirementsWatcher.d.post(new b(this, 0));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            RequirementsWatcher.this.d.post(new b(this, 0));
        }
    }

    public RequirementsWatcher(Context context, e eVar, Requirements requirements) {
        this.f18306a = context.getApplicationContext();
        this.f18307b = eVar;
        this.f18308c = requirements;
    }

    public final void a() {
        int iA = this.f18308c.a(this.f18306a);
        if (this.f != iA) {
            this.f = iA;
            e eVar = this.f18307b;
            eVar.getClass();
            Requirements requirements = DownloadManager.o;
            ((DownloadManager) eVar.f18299a).b(this, iA);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int b() {
        Requirements requirements = this.f18308c;
        Context context = this.f18306a;
        this.f = requirements.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i2 = requirements.X;
        if ((i2 & 1) != 0) {
            if (Util.f18979a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                connectivityManager.getClass();
                NetworkCallback networkCallback = new NetworkCallback();
                this.g = networkCallback;
                connectivityManager.registerDefaultNetworkCallback(networkCallback);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((i2 & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i2 & 4) != 0) {
            if (Util.f18979a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((i2 & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        DeviceStatusChangeReceiver deviceStatusChangeReceiver = new DeviceStatusChangeReceiver();
        this.f18309e = deviceStatusChangeReceiver;
        context.registerReceiver(deviceStatusChangeReceiver, intentFilter, null, this.d);
        return this.f;
    }
}
