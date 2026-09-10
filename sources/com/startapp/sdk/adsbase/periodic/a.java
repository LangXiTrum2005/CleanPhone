package com.startapp.sdk.adsbase.periodic;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.p004ironsource.z8;
import com.startapp.sdk.internal.b8;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.m2;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.x1;
import com.startapp.sdk.internal.y1;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends y1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f40693i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f40694e;
    public final lb f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f40695h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, m2 callback, lb prefs, long j, long j2) {
        super(context, callback);
        Intrinsics.f(context, "context");
        Intrinsics.f(callback, "callback");
        Intrinsics.f(prefs, "prefs");
        this.f40694e = context;
        this.f = prefs;
        this.g = j;
        this.f40695h = j2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    @Override // com.startapp.sdk.internal.y1
    public final void a() {
        BluetoothAdapter adapter;
        b8 b8Var = new b8();
        boolean zA = false;
        try {
            Object systemService = this.f40694e.getSystemService(z8.d);
            if (!(systemService instanceof BluetoothManager) || (adapter = ((BluetoothManager) systemService).getAdapter()) == null) {
                adapter = null;
            } else {
                if (!(Build.VERSION.SDK_INT < 31 ? q0.a(this.f40694e, "android.permission.BLUETOOTH") : true) || !adapter.isEnabled()) {
                    adapter = null;
                }
            }
            if (adapter != null) {
                zA = a(adapter, b8Var);
            }
        } catch (Throwable th) {
            g9.a(th);
        }
        this.f41699c.postDelayed(new com.google.android.exoplayer2.video.a(10, this, b8Var), zA ? this.g : 0L);
    }

    public static final void a(a this$0, b8 dataBuilder) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(dataBuilder, "$dataBuilder");
        this$0.a(dataBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.BroadcastReceiver, com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1] */
    public final boolean a(BluetoothAdapter bluetoothAdapter, final b8 b8Var) {
        boolean zA;
        boolean zA2;
        Set<BluetoothDevice> bondedDevices;
        try {
            if (Build.VERSION.SDK_INT < 31) {
                zA2 = q0.a(this.f40694e, "android.permission.BLUETOOTH");
            } else {
                zA2 = q0.a(this.f40694e, "android.permission.BLUETOOTH_CONNECT");
            }
            if (zA2 && (bondedDevices = bluetoothAdapter.getBondedDevices()) != null) {
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    Intrinsics.c(bluetoothDevice);
                    synchronized (b8Var) {
                        try {
                            b8Var.f40829a.add(bluetoothDevice);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            g9.a(th2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = jCurrentTimeMillis - ((vf) this.f.a()).getLong("lastBtDiscoveringTime", 0L) >= this.f40695h;
        if (z2) {
            uf ufVarEdit = ((vf) this.f.a()).edit();
            ufVarEdit.a("lastBtDiscoveringTime", Long.valueOf(jCurrentTimeMillis));
            ufVarEdit.f41545a.putLong("lastBtDiscoveringTime", jCurrentTimeMillis);
            ufVarEdit.apply();
        }
        if (!z2) {
            return false;
        }
        ?? r1 = new BroadcastReceiver() { // from class: com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Intrinsics.f(context, "context");
                Intrinsics.f(intent, "intent");
                if (!"android.bluetooth.device.action.FOUND".equals(intent.getAction())) {
                    if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(intent.getAction())) {
                        this.f40691a.a(b8Var);
                    }
                } else {
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice2 != null) {
                        b8 b8Var2 = b8Var;
                        synchronized (b8Var2) {
                            b8Var2.f40830b.add(bluetoothDevice2);
                        }
                    }
                }
            }
        };
        b8Var.f40831c = r1;
        this.f40694e.registerReceiver(r1, new IntentFilter("android.bluetooth.device.action.FOUND"));
        if (Build.VERSION.SDK_INT < 31) {
            zA = q0.a(this.f40694e, "android.permission.BLUETOOTH_ADMIN");
        } else {
            zA = q0.a(this.f40694e, "android.permission.BLUETOOTH_SCAN");
        }
        if (zA) {
            return bluetoothAdapter.startDiscovery();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    public final void a(b8 b8Var) {
        boolean zA;
        BluetoothAdapter adapter;
        JSONObject jSONObjectA;
        boolean zA2;
        BluetoothAdapter bluetoothAdapter = null;
        try {
            x1 x1Var = this.f41698b;
            if (b8Var == null) {
                jSONObjectA = null;
            } else {
                if (Build.VERSION.SDK_INT < 31) {
                    zA2 = q0.a(this.f40694e, "android.permission.BLUETOOTH");
                } else {
                    zA2 = q0.a(this.f40694e, "android.permission.BLUETOOTH_CONNECT");
                }
                if (zA2) {
                    jSONObjectA = b8Var.a();
                } else {
                    jSONObjectA = null;
                }
            }
            x1Var.a(jSONObjectA);
        } catch (Throwable th) {
            g9.a(th);
        }
        if (b8Var != null) {
            try {
                GetBluetoothAsync$startUnsafe$1 getBluetoothAsync$startUnsafe$1 = b8Var.f40831c;
                if (getBluetoothAsync$startUnsafe$1 != null) {
                    b8Var.f40831c = null;
                    this.f40694e.unregisterReceiver(getBluetoothAsync$startUnsafe$1);
                }
            } catch (Throwable th2) {
                g9.a(th2);
            }
        }
        try {
            Object systemService = this.f40694e.getSystemService(z8.d);
            if ((systemService instanceof BluetoothManager) && (adapter = ((BluetoothManager) systemService).getAdapter()) != null) {
                if ((Build.VERSION.SDK_INT < 31 ? q0.a(this.f40694e, "android.permission.BLUETOOTH") : true) && adapter.isEnabled()) {
                    bluetoothAdapter = adapter;
                }
            }
            if (bluetoothAdapter != null) {
                if (Build.VERSION.SDK_INT < 31) {
                    zA = q0.a(this.f40694e, "android.permission.BLUETOOTH_ADMIN");
                } else {
                    zA = q0.a(this.f40694e, "android.permission.BLUETOOTH_SCAN");
                }
                if (zA) {
                    bluetoothAdapter.cancelDiscovery();
                }
            }
        } catch (Throwable th3) {
            g9.a(th3);
        }
    }
}
