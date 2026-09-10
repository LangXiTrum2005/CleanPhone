package com.charging.screenshow.battery.animations.themes.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.media3.extractor.text.ttml.a;
import com.applovin.sdk.AppLovinEventTypes;
import com.charging.screenshow.battery.animations.themes.MyApp;
import com.charging.screenshow.battery.animations.themes.entity.BatteryInfo;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/manager/BatteryManager;", "", "Companion", "ChargeSample", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BatteryManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MyApp f13274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f13275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateFlow f13276c;
    public final ConcurrentLinkedQueue d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13277e;
    public boolean f;
    public final Handler g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/manager/BatteryManager$ChargeSample;", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChargeSample {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f13278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13279b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f13280c;

        public ChargeSample(long j, int i2, float f) {
            this.f13278a = j;
            this.f13279b = i2;
            this.f13280c = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChargeSample)) {
                return false;
            }
            ChargeSample chargeSample = (ChargeSample) obj;
            return this.f13278a == chargeSample.f13278a && this.f13279b == chargeSample.f13279b && Float.compare(this.f13280c, chargeSample.f13280c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f13280c) + a.a(this.f13279b, Long.hashCode(this.f13278a) * 31, 31);
        }

        public final String toString() {
            return "ChargeSample(timestamp=" + this.f13278a + ", level=" + this.f13279b + ", voltage=" + this.f13280c + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/charging/screenshow/battery/animations/themes/manager/BatteryManager$Companion;", "", "", "MAX_SAMPLES", "I", "MIN_SAMPLES", "", "SAMPLE_INTERVAL_MS", "J", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BatteryManager(MyApp myApp) {
        this.f13274a = myApp;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new BatteryInfo("Unknown", 0.0f, 0.0f, "Unknown", 0L, 0, "Unknown", 0, false, true, 0.0f, "Calculating..."));
        this.f13275b = mutableStateFlowA;
        this.f13276c = mutableStateFlowA;
        this.d = new ConcurrentLinkedQueue();
        this.f13277e = -1;
        Handler handler = new Handler(Looper.getMainLooper());
        this.g = handler;
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.charging.screenshow.battery.animations.themes.manager.BatteryManager$batteryReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    BatteryManager batteryManager = this.f13281a;
                    batteryManager.getClass();
                    DefaultScheduler defaultScheduler = Dispatchers.f44752a;
                    BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new BatteryManager$updateBatteryInfo$1(batteryManager, intent, null), 3);
                    BatteryManager.a(batteryManager, intent);
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        myApp.registerReceiver(broadcastReceiver, intentFilter);
        Intent intentRegisterReceiver = myApp.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            BuildersKt.c(CoroutineScopeKt.a(MainDispatcherLoader.f45042a), null, null, new BatteryManager$updateBatteryInfo$1(this, intentRegisterReceiver, null), 3);
            handler.post(new Runnable() { // from class: com.charging.screenshow.battery.animations.themes.manager.BatteryManager$startSampling$1
                @Override // java.lang.Runnable
                public final void run() {
                    BatteryManager batteryManager = this.X;
                    Intent intentRegisterReceiver2 = batteryManager.f13274a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (intentRegisterReceiver2 != null) {
                        BatteryManager.a(batteryManager, intentRegisterReceiver2);
                    }
                    batteryManager.g.postDelayed(this, 2000L);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f2  */
    public static final void a(BatteryManager batteryManager, Intent intent) {
        double dB;
        double d;
        String strK;
        batteryManager.getClass();
        int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        int i2 = (intExtra < 0 || intExtra2 <= 0) ? 0 : (intExtra * 100) / intExtra2;
        float intExtra3 = intent.getIntExtra("voltage", 0) / 1000.0f;
        boolean z2 = intent.getIntExtra("status", -1) == 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = batteryManager.f;
        MutableStateFlow mutableStateFlow = batteryManager.f13275b;
        ConcurrentLinkedQueue concurrentLinkedQueue = batteryManager.d;
        if (z3 != z2) {
            concurrentLinkedQueue.clear();
            batteryManager.f13277e = -1;
            batteryManager.f = z2;
            if (!z2) {
                mutableStateFlow.setValue(BatteryInfo.a((BatteryInfo) mutableStateFlow.getValue(), null, 0.0f, 0.0f, null, 0L, 0, null, 0, false, false, 0.0f, "Not Charging", 1007));
                return;
            } else {
                concurrentLinkedQueue.add(new ChargeSample(jCurrentTimeMillis, i2, intExtra3));
                batteryManager.f13277e = i2;
                mutableStateFlow.setValue(BatteryInfo.a((BatteryInfo) mutableStateFlow.getValue(), null, 0.0f, 0.0f, null, 0L, 0, null, 0, false, false, 0.0f, "Calculating...", IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE));
            }
        }
        if (z2 && i2 > batteryManager.f13277e) {
            concurrentLinkedQueue.add(new ChargeSample(jCurrentTimeMillis, i2, intExtra3));
            batteryManager.f13277e = i2;
            while (concurrentLinkedQueue.size() > 30) {
                concurrentLinkedQueue.poll();
            }
            List listI0 = CollectionsKt.i0(concurrentLinkedQueue);
            if (listI0.size() < 2) {
                mutableStateFlow.setValue(BatteryInfo.a((BatteryInfo) mutableStateFlow.getValue(), null, 0.0f, 0.0f, null, 0L, 0, null, 0, false, false, 0.0f, "Calculating...", 1007));
                return;
            }
            if (listI0.size() < 2) {
                dB = 0.0d;
            } else {
                ChargeSample chargeSample = (ChargeSample) CollectionsKt.w(listI0);
                ChargeSample chargeSample2 = (ChargeSample) CollectionsKt.F(listI0);
                double d2 = (chargeSample2.f13278a - chargeSample.f13278a) / 60000.0d;
                if (d2 < 0.5d) {
                    dB = b(listI0);
                } else {
                    int i3 = chargeSample2.f13279b - chargeSample.f13279b;
                    if (i3 <= 0) {
                        dB = 0.0d;
                    } else {
                        dB = ((double) i3) / d2;
                        if (dB > 10.0d || dB < 0.1d) {
                            dB = b(listI0);
                        }
                    }
                }
            }
            if (dB <= 0.0d) {
                mutableStateFlow.setValue(BatteryInfo.a((BatteryInfo) mutableStateFlow.getValue(), null, 0.0f, 0.0f, null, 0L, 0, null, 0, false, false, 0.0f, "Calculating...", 1007));
                return;
            }
            int i4 = 100 - ((ChargeSample) CollectionsKt.F(listI0)).f13279b;
            if (dB <= 0.0d || i4 <= 0) {
                d = i4 <= 0 ? 0.0d : -1.0d;
            } else {
                d = ((double) i4) / dB;
            }
            if (d < 0.0d) {
                strK = "Calculating...";
            } else if (d <= 0.0d) {
                strK = "Fully Charged";
            } else if (d < 1.0d) {
                strK = "Less than 1 minute";
            } else if (d < 60.0d) {
                int i5 = (int) d;
                strK = i5 == 1 ? "1 minute" : androidx.datastore.preferences.protobuf.a.f(i5, " minutes");
            } else if (d < 1440.0d) {
                int i6 = (int) d;
                int i7 = i6 / 60;
                int i8 = i6 % 60;
                if (i8 == 0) {
                    strK = i7 == 1 ? "1 hour" : androidx.datastore.preferences.protobuf.a.f(i7, " hours");
                } else if (i7 == 1) {
                    strK = androidx.datastore.preferences.protobuf.a.k("1 hour ", i8, " minutes");
                } else {
                    strK = i7 + " hours " + i8 + " minutes";
                }
            } else {
                int i9 = (int) d;
                int i10 = i9 / 1440;
                int i11 = (i9 % 1440) / 60;
                if (i11 == 0) {
                    strK = i10 == 1 ? "1 day" : androidx.datastore.preferences.protobuf.a.f(i10, " days");
                } else if (i10 == 1) {
                    strK = androidx.datastore.preferences.protobuf.a.k("1 day ", i11, " hours");
                } else {
                    strK = i10 + " days " + i11 + " hours";
                }
            }
            String str = strK;
            mutableStateFlow.setValue(BatteryInfo.a((BatteryInfo) mutableStateFlow.getValue(), null, 0.0f, 0.0f, null, d > 0.0d ? (long) (d * ((double) 60) * ((double) 1000)) : 0L, 0, null, 0, false, false, (float) dB, str, 1007));
            Log.d("BatteryManager", "Charging speed: " + String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dB)}, 1)) + "%/min, Remaining: " + str + ", Samples: " + listI0.size());
        }
    }

    public static double b(List list) {
        List list2;
        List listE0;
        if (list.size() >= 3) {
            if (list.size() > 5) {
                list2 = list;
                listE0 = CollectionsKt.e0(5, list2);
            } else {
                list2 = list;
                listE0 = list2;
            }
            if (listE0.size() >= 2) {
                int size = listE0.size();
                int i2 = 0;
                double d = 0.0d;
                for (int i3 = 1; i3 < size; i3++) {
                    ChargeSample chargeSample = (ChargeSample) listE0.get(i3 - 1);
                    ChargeSample chargeSample2 = (ChargeSample) listE0.get(i3);
                    double d2 = (chargeSample2.f13278a - chargeSample.f13278a) / 60000.0d;
                    int i4 = chargeSample2.f13279b - chargeSample.f13279b;
                    if (d2 > 0.0d && i4 > 0) {
                        double d3 = ((double) i4) / d2;
                        if (d3 > 0.1d && d3 < 10.0d) {
                            d += d3;
                            i2++;
                        }
                    }
                }
                if (i2 > 0) {
                    return d / ((double) i2);
                }
                ChargeSample chargeSample3 = (ChargeSample) CollectionsKt.w(list2);
                ChargeSample chargeSample4 = (ChargeSample) CollectionsKt.F(list2);
                double d4 = (chargeSample4.f13278a - chargeSample3.f13278a) / 60000.0d;
                int i5 = chargeSample4.f13279b - chargeSample3.f13279b;
                if (d4 <= 0.0d || i5 <= 0) {
                    return 0.0d;
                }
                return ((double) i5) / d4;
            }
        }
        return 0.0d;
    }

    public static int c() {
        try {
            Iterator it = CollectionsKt.I("/sys/class/power_supply/battery/charge_full_design", "/sys/class/power_supply/battery/charge_full", "/sys/class/power_supply/battery/full_charge").iterator();
            while (it.hasNext()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader((String) it.next()));
                    String line = bufferedReader.readLine();
                    Intrinsics.e(line, "readLine(...)");
                    String string = StringsKt.a0(line).toString();
                    bufferedReader.close();
                    int i2 = Integer.parseInt(string);
                    if (i2 > 10000) {
                        i2 /= 1000;
                    }
                    return i2;
                } catch (Exception unused) {
                }
            }
            return 0;
        } catch (Exception e2) {
            Log.e("BatteryManager", "Error reading capacity from file", e2);
            return 0;
        }
    }
}
