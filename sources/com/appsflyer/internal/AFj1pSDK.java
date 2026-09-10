package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.appsflyer.AFLogger;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class AFj1pSDK implements AFj1lSDK {
    private static final BitSet component3;
    boolean AFAdRevenueData;
    private final Map<AFj1nSDK, Map<String, Object>> areAllFieldsValid;
    private final SensorManager component1;
    private final ExecutorService component2;
    private final Map<AFj1nSDK, AFj1nSDK> component4;
    private boolean equals;
    final Runnable getCurrencyIso4217Code;
    final Runnable getMediationNetwork;
    final Object getMonetizationNetwork;
    final Handler getRevenue;
    private final Runnable toString;

    static {
        BitSet bitSet = new BitSet(6);
        component3 = bitSet;
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private AFj1pSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        this.getMonetizationNetwork = new Object();
        BitSet bitSet = component3;
        this.component4 = new HashMap(bitSet.size());
        this.areAllFieldsValid = new ConcurrentHashMap(bitSet.size());
        this.getMediationNetwork = new Runnable() { // from class: com.appsflyer.internal.AFj1pSDK.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1pSDK.this.getMonetizationNetwork) {
                    AFj1pSDK.this.getRevenue();
                    AFj1pSDK aFj1pSDK = AFj1pSDK.this;
                    aFj1pSDK.getRevenue.postDelayed(aFj1pSDK.getCurrencyIso4217Code, 150L);
                    AFj1pSDK.this.AFAdRevenueData = true;
                }
            }
        };
        this.getCurrencyIso4217Code = new Runnable() { // from class: com.appsflyer.internal.rotuma
            @Override // java.lang.Runnable
            public final void run() {
                this.f17397kowloon.component4();
            }
        };
        this.toString = new Runnable() { // from class: com.appsflyer.internal.AFj1pSDK.5
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (AFj1pSDK.this.getMonetizationNetwork) {
                    try {
                        AFj1pSDK aFj1pSDK = AFj1pSDK.this;
                        if (aFj1pSDK.AFAdRevenueData) {
                            aFj1pSDK.getRevenue.removeCallbacks(aFj1pSDK.getMediationNetwork);
                            AFj1pSDK aFj1pSDK2 = AFj1pSDK.this;
                            aFj1pSDK2.getRevenue.removeCallbacks(aFj1pSDK2.getCurrencyIso4217Code);
                            AFj1pSDK.this.getCurrencyIso4217Code();
                            AFj1pSDK.this.AFAdRevenueData = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.component1 = sensorManager;
        this.getRevenue = handler;
        this.component2 = executorService;
    }

    private List<Map<String, Object>> areAllFieldsValid() {
        synchronized (this.getMonetizationNetwork) {
            try {
                if (!this.component4.isEmpty() && this.equals) {
                    Iterator<AFj1nSDK> it = this.component4.values().iterator();
                    while (it.hasNext()) {
                        it.next().AFAdRevenueData(this.areAllFieldsValid, false);
                    }
                }
                if (this.areAllFieldsValid.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.areAllFieldsValid.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component1() {
        try {
            for (Sensor sensor : this.component1.getSensorList(-1)) {
                if (getMonetizationNetwork(sensor.getType())) {
                    AFj1nSDK aFj1nSDK = new AFj1nSDK(sensor, this.component2);
                    if (!this.component4.containsKey(aFj1nSDK)) {
                        this.component4.put(aFj1nSDK, aFj1nSDK);
                    }
                    this.component1.registerListener(this.component4.get(aFj1nSDK), sensor, 1, this.getRevenue);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("registerListeners error", th);
        }
        this.equals = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component2() {
        try {
            if (!this.component4.isEmpty()) {
                for (AFj1nSDK aFj1nSDK : this.component4.values()) {
                    this.component1.unregisterListener(aFj1nSDK);
                    aFj1nSDK.AFAdRevenueData(this.areAllFieldsValid, true);
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("error while unregistering listeners", th);
        }
        this.equals = false;
    }

    private List<Map<String, Object>> component3() {
        synchronized (this.getMonetizationNetwork) {
            try {
                Iterator<AFj1nSDK> it = this.component4.values().iterator();
                while (it.hasNext()) {
                    it.next().AFAdRevenueData(this.areAllFieldsValid, true);
                }
                if (this.areAllFieldsValid.isEmpty()) {
                    return new CopyOnWriteArrayList(Collections.EMPTY_LIST);
                }
                return new CopyOnWriteArrayList(this.areAllFieldsValid.values());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component4() {
        synchronized (this.getMonetizationNetwork) {
            this.getRevenue.post(new preprohormone(this));
        }
    }

    private static boolean getMonetizationNetwork(int i) {
        return i >= 0 && component3.get(i);
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final void AFAdRevenueData() {
        this.getRevenue.post(this.toString);
        this.getRevenue.post(this.getMediationNetwork);
    }

    public final void getCurrencyIso4217Code() {
        this.getRevenue.post(new preprohormone(this));
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final Map<String, Object> getMediationNetwork() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<Map<String, Object>> listAreAllFieldsValid = areAllFieldsValid();
        if (!listAreAllFieldsValid.isEmpty()) {
            concurrentHashMap.put("sensors", listAreAllFieldsValid);
            return concurrentHashMap;
        }
        List<Map<String, Object>> listComponent3 = component3();
        if (!listComponent3.isEmpty()) {
            concurrentHashMap.put("sensors", listComponent3);
        }
        return concurrentHashMap;
    }

    public final void getRevenue() {
        this.getRevenue.post(new Runnable() { // from class: com.appsflyer.internal.cord
            @Override // java.lang.Runnable
            public final void run() {
                this.f17368kowloon.component1();
            }
        });
    }

    @Override // com.appsflyer.internal.AFj1lSDK
    public final synchronized void getMonetizationNetwork() {
        this.getRevenue.post(this.toString);
    }

    public AFj1pSDK(Context context, ExecutorService executorService) {
        SensorManager sensorManager = (SensorManager) context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        this(sensorManager, new Handler(handlerThread.getLooper()), executorService);
    }
}
