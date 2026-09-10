package com.startapp.sdk.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Display;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41219b;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d2 f41221e;
    public SensorManager f;
    public final lb g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f41222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Pair f41223i;
    public final lb j;
    public final s4 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f41224l;
    public final int m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41218a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f41220c = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ig f41225n = new ig(this);
    public final kg o = new kg(this);

    public lg(lb lbVar, lb lbVar2, s4 s4Var, Context context) {
        this.j = lbVar;
        this.k = s4Var;
        this.g = lbVar2;
        this.f41222h = context;
        this.f41223i = new Pair(Integer.valueOf(((vf) lbVar2.a()).getInt("last_collected_day", 0)), Integer.valueOf(((vf) lbVar2.a()).getInt("daily_collected", 0)));
        SensorsData sensorsDataU = MetaData.E().U();
        if (sensorsDataU == null) {
            return;
        }
        this.d = (long) (((double) (1000 / sensorsDataU.d())) * 0.95d);
        this.m = sensorsDataU.e();
    }

    public static boolean a(lg lgVar, SensorEvent sensorEvent) {
        lgVar.getClass();
        int type = sensorEvent.sensor.getType();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l2 = (Long) lgVar.f41220c.get(Integer.valueOf(type));
        if (jCurrentTimeMillis - (l2 == null ? 0L : l2.longValue()) < lgVar.d) {
            return true;
        }
        lgVar.f41220c.put(Integer.valueOf(type), Long.valueOf(jCurrentTimeMillis));
        return false;
    }

    public final void a(Context context, SensorsData sensorsData) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f = sensorManager;
        if (sensorManager == null) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            context.registerReceiver(this.o, intentFilter);
        } catch (Throwable th) {
            if (a(8)) {
                g9.a(th);
            }
        }
        SensorManager sensorManager2 = this.f;
        if (sensorManager2 != null) {
            sensorManager2.unregisterListener(this.f41225n);
        }
        int iD = 1000000 / sensorsData.d();
        Sensor defaultSensor = this.f.getDefaultSensor(1);
        Sensor defaultSensor2 = this.f.getDefaultSensor(4);
        Sensor defaultSensor3 = this.f.getDefaultSensor(2);
        this.f.registerListener(this.f41225n, defaultSensor, iD);
        this.f.registerListener(this.f41225n, defaultSensor2, iD);
        this.f.registerListener(this.f41225n, defaultSensor3, iD);
    }

    public static void a(lg lgVar, SensorEvent sensorEvent, SensorsData sensorsData) {
        Object obj;
        lgVar.f41219b = ((vf) lgVar.g.a()).getInt("total_collected", 0);
        d2 d2Var = lgVar.f41221e;
        if (d2Var == null || d2Var.g.size() >= d2Var.f40897h) {
            lgVar.f41221e = new d2(((com.startapp.sdk.common.advertisingid.b) lgVar.j.a()).a().f41193a, lgVar.f41222h.getPackageName(), System.currentTimeMillis() + "", UUID.randomUUID().toString(), lgVar.f41224l, lgVar.a(), sensorsData.c());
            lgVar.f41218a = 0;
        }
        int i2 = lgVar.f41218a;
        lgVar.f41218a = i2 + 1;
        wf wfVar = new wf(i2, sensorEvent.sensor.getType(), System.currentTimeMillis(), Arrays.copyOf(sensorEvent.values, 3));
        d2 d2Var2 = lgVar.f41221e;
        d2Var2.g.add(wfVar);
        if (d2Var2.g.size() >= d2Var2.f40897h) {
            int i3 = Calendar.getInstance().get(6);
            if (((Integer) lgVar.f41223i.first).intValue() == i3) {
                Pair pair = lgVar.f41223i;
                lgVar.f41223i = new Pair((Integer) pair.first, Integer.valueOf(((Integer) pair.second).intValue() + 1));
            } else {
                lgVar.f41223i = new Pair(Integer.valueOf(i3), 1);
            }
            d2 d2Var3 = lgVar.f41221e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("advertisingId", d2Var3.f40893a);
                jSONObject.put("bId", d2Var3.d);
                jSONObject.put("batchTimestamp", d2Var3.f40895c);
                jSONObject.put("fp", d2Var3.f40894b);
                jSONObject.put(com.ironsource.d9.i.k0, d2Var3.f40896e);
                jSONObject.put("isScreenOn", d2Var3.f);
                JSONArray jSONArray = new JSONArray();
                for (wf wfVar2 : d2Var3.g) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sId", wfVar2.f41634a);
                    jSONObject2.put(com.p004ironsource.dc.q, wfVar2.f41635b);
                    jSONObject2.put("ts", wfVar2.f41636c);
                    JSONArray jSONArray2 = new JSONArray();
                    for (float f : wfVar2.d) {
                        jSONArray2.put(f);
                    }
                    jSONObject2.put("v", jSONArray2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("valueList", jSONArray);
                obj = jSONObject;
            } catch (Throwable th) {
                if (lgVar.a(16)) {
                    g9.a(th);
                }
                obj = null;
            }
            if (sensorsData.g()) {
                g9 g9Var = new g9(h9.f41045p);
                g9Var.f41002e = String.valueOf(obj);
                g9Var.a();
            } else {
                g9 g9Var2 = new g9(h9.f41045p);
                g9Var2.f = obj;
                g9Var2.a();
            }
            uf ufVarEdit = ((vf) lgVar.g.a()).edit();
            int i4 = lgVar.f41219b + 1;
            lgVar.f41219b = i4;
            ufVarEdit.putInt("total_collected", i4);
            ufVarEdit.putLong("sensor_last_collected_time", System.currentTimeMillis());
            Integer num = (Integer) lgVar.f41223i.first;
            int iIntValue = num.intValue();
            ufVarEdit.a("last_collected_day", num);
            ufVarEdit.f41545a.putInt("last_collected_day", iIntValue);
            Integer num2 = (Integer) lgVar.f41223i.second;
            int iIntValue2 = num2.intValue();
            ufVarEdit.a("daily_collected", num2);
            ufVarEdit.f41545a.putInt("daily_collected", iIntValue2);
            ufVarEdit.apply();
            lgVar.a(lgVar.f41219b == sensorsData.e());
        }
    }

    public final boolean a() {
        for (Display display : ((DisplayManager) this.f41222h.getSystemService(com.ironsource.d9.h.d)).getDisplays()) {
            if (display.getState() == 2) {
                return true;
            }
        }
        return false;
    }

    public final void a(boolean z2) {
        try {
            SensorManager sensorManager = this.f;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f41225n);
            }
            this.k.getClass();
            SensorsData sensorsDataU = MetaData.E().U();
            this.f41221e = null;
            if (!z2 && sensorsDataU != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new jg(this), ((long) sensorsDataU.a()) * 1000);
            }
            this.f41222h.unregisterReceiver(this.o);
        } catch (Throwable th) {
            if (a(32)) {
                g9.a(th);
            }
        }
    }

    public final void a(Context context) {
        int iA;
        try {
            this.k.getClass();
            SensorsData sensorsDataU = MetaData.E().U();
            String str = ((com.startapp.sdk.common.advertisingid.b) this.j.a()).a().f41193a;
            if (sensorsDataU != null) {
                this.k.getClass();
                SensorsData sensorsDataU2 = MetaData.E().U();
                if (sensorsDataU2 != null && ((vf) this.g.a()).getInt("total_collected", 0) != sensorsDataU2.e() && !str.equals("0") && !str.equals("00000000-0000-0000-0000-000000000000")) {
                    long j = ((vf) this.g.a()).getLong("sensor_last_collected_time", 0L);
                    if ((((Integer) this.f41223i.first).intValue() != Calendar.getInstance().get(6) || ((Integer) this.f41223i.second).intValue() != sensorsDataU.f()) && (System.currentTimeMillis() - j) / 1000 >= sensorsDataU.a()) {
                        a(context, sensorsDataU);
                        return;
                    }
                    if (((Integer) this.f41223i.first).intValue() == Calendar.getInstance().get(6) && ((Integer) this.f41223i.second).intValue() == sensorsDataU.f()) {
                        iA = (24 - Calendar.getInstance().get(11)) * com.smartdigimkt.o1.b.l2;
                    } else {
                        iA = sensorsDataU.a();
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new jg(this), ((long) iA) * 1000);
                }
            }
        } catch (Throwable th) {
            if (a(4)) {
                g9.a(th);
            }
        }
    }

    public final boolean a(int i2) {
        this.k.getClass();
        SensorsData sensorsDataU = MetaData.E().U();
        ComponentInfoEventConfig componentInfoEventConfigB = sensorsDataU != null ? sensorsDataU.b() : null;
        return componentInfoEventConfigB != null && componentInfoEventConfigB.a((long) i2);
    }
}
