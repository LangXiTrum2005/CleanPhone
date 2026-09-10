package com.charging.screenshow.battery.animations.themes.manager;

import android.content.Intent;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import com.charging.screenshow.battery.animations.themes.entity.BatteryInfo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.charging.screenshow.battery.animations.themes.manager.BatteryManager$updateBatteryInfo$1", f = "BatteryManager.kt", l = {}, m = "invokeSuspend")
final class BatteryManager$updateBatteryInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ BatteryManager X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Intent f13282Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BatteryManager$updateBatteryInfo$1(BatteryManager batteryManager, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.X = batteryManager;
        this.f13282Y = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BatteryManager$updateBatteryInfo$1(this.X, this.f13282Y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BatteryManager$updateBatteryInfo$1 batteryManager$updateBatteryInfo$1 = (BatteryManager$updateBatteryInfo$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f43263a;
        batteryManager$updateBatteryInfo$1.invokeSuspend(unit);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0125  */
    /* JADX WARN: Code duplicated, block: B:66:0x0134 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x0128, B:66:0x0134, B:71:0x013c, B:74:0x0144, B:75:0x0147), top: B:109:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0139  */
    /* JADX WARN: Code duplicated, block: B:71:0x013c A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x0128, B:66:0x0134, B:71:0x013c, B:74:0x0144, B:75:0x0147), top: B:109:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144 A[Catch: Exception -> 0x0137, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x0128, B:66:0x0134, B:71:0x013c, B:74:0x0144, B:75:0x0147), top: B:109:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0147 A[Catch: Exception -> 0x0137, TRY_LEAVE, TryCatch #3 {Exception -> 0x0137, blocks: (B:64:0x0128, B:66:0x0134, B:71:0x013c, B:74:0x0144, B:75:0x0147), top: B:109:0x0128 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x015c  */
    /* JADX WARN: Code duplicated, block: B:82:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0164  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:87:0x016a  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0183  */
    /* JADX WARN: Code duplicated, block: B:99:0x0190  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        float f;
        float f2;
        float f3;
        int intExtra;
        String str3;
        int iC;
        int intExtra2;
        int intExtra3;
        int i2;
        int intExtra4;
        boolean z2;
        Object systemService;
        android.os.BatteryManager batteryManager;
        int intProperty;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        BatteryManager batteryManager2 = this.X;
        BatteryInfo batteryInfo = (BatteryInfo) batteryManager2.f13275b.getValue();
        MutableStateFlow mutableStateFlow = batteryManager2.f13275b;
        Intent intent = this.f13282Y;
        String str4 = "Unknown";
        switch (intent.getIntExtra("health", 1)) {
            case 2:
                str = "Good";
                str2 = str;
                break;
            case 3:
                str = "Overheat";
                str2 = str;
                break;
            case 4:
                str = "Dead";
                str2 = str;
                break;
            case 5:
                str = "Over Voltage";
                str2 = str;
                break;
            case 6:
                str = "Unspecified Failure";
                str2 = str;
                break;
            case 7:
                str = "Cold";
                str2 = str;
                break;
            default:
                str2 = "Unknown";
                break;
        }
        int intExtra5 = intent.getIntExtra("temperature", 0);
        if (intExtra5 > 0) {
            f2 = intExtra5 / 10.0f;
            f = 100.0f;
        } else {
            try {
                Iterator it = CollectionsKt.I("/sys/class/power_supply/battery/temp", "/sys/class/power_supply/battery/batt_temp", "/sys/class/thermal/thermal_zone0/temp").iterator();
                while (true) {
                    if (it.hasNext()) {
                        try {
                            f = 100.0f;
                            try {
                                BufferedReader bufferedReader = new BufferedReader(new FileReader((String) it.next()));
                                String line = bufferedReader.readLine();
                                Intrinsics.e(line, "readLine(...)");
                                String string = StringsKt.a0(line).toString();
                                bufferedReader.close();
                                f2 = Float.parseFloat(string);
                                if (f2 > 100.0f) {
                                    f2 /= 10.0f;
                                }
                            } catch (Exception unused) {
                                continue;
                            }
                        } catch (Exception unused2) {
                        }
                    } else {
                        f = 100.0f;
                        f2 = 0.0f;
                    }
                }
            } catch (Exception e2) {
                f = 100.0f;
                Log.e("BatteryManager", "Error reading temperature from system", e2);
            }
        }
        float f4 = f2;
        int intExtra6 = intent.getIntExtra("voltage", 0);
        try {
            if (intExtra6 <= 0) {
                try {
                    Iterator it2 = CollectionsKt.I("/sys/class/power_supply/battery/voltage_now", "/sys/class/power_supply/battery/batt_vol").iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            try {
                                BufferedReader bufferedReader2 = new BufferedReader(new FileReader((String) it2.next()));
                                String line2 = bufferedReader2.readLine();
                                Intrinsics.e(line2, "readLine(...)");
                                String string2 = StringsKt.a0(line2).toString();
                                bufferedReader2.close();
                                f3 = Float.parseFloat(string2);
                                if (f3 > 1000.0f) {
                                    f3 /= 1000000.0f;
                                } else if (f3 > f) {
                                }
                            } catch (Exception unused3) {
                            }
                        } else {
                            f3 = 0.0f;
                        }
                    }
                } catch (Exception e3) {
                    Log.e("BatteryManager", "Error reading voltage from system", e3);
                }
                float f5 = f3;
                intExtra = intent.getIntExtra("plugged", -1);
                if (intExtra != 1) {
                    str3 = "AC Charger";
                } else if (intExtra != 2) {
                    str3 = "USB Charging";
                } else if (intExtra != 4) {
                    str3 = "Wireless Charging";
                } else if (intExtra != 8) {
                    str3 = "Not Plugged";
                } else {
                    str3 = "Dock Charging";
                }
                String str5 = str3;
                systemService = batteryManager2.f13274a.getSystemService("batterymanager");
                if (systemService instanceof android.os.BatteryManager) {
                    batteryManager = (android.os.BatteryManager) systemService;
                } else {
                    batteryManager = null;
                }
                if (batteryManager != null) {
                    intProperty = batteryManager.getIntProperty(1);
                } else {
                    intProperty = 0;
                }
                if (intProperty > 0) {
                    iC = intProperty / 1000;
                } else {
                    iC = BatteryManager.c();
                }
                intExtra2 = intent.getIntExtra("status", 1);
                if (intExtra2 != 2) {
                    str4 = "Charging";
                } else if (intExtra2 != 3) {
                    str4 = "Discharging";
                } else if (intExtra2 != 4) {
                    str4 = "Not Charging";
                } else if (intExtra2 == 5) {
                    str4 = "Full";
                }
                intExtra3 = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra7 = intent.getIntExtra("scale", -1);
                if (intExtra3 >= 0 || intExtra7 <= 0) {
                    i2 = 0;
                } else {
                    i2 = (intExtra3 * 100) / intExtra7;
                }
                intExtra4 = intent.getIntExtra("status", -1);
                if (intExtra4 != 2 || intExtra4 == 5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mutableStateFlow.setValue(BatteryInfo.a(batteryInfo, str2, f4, f5, str5, 0L, iC, str4, i2, z2, intent.getBooleanExtra("present", true), 0.0f, null, 3088));
                return Unit.f43263a;
            }
            f3 = intExtra6;
            systemService = batteryManager2.f13274a.getSystemService("batterymanager");
            if (systemService instanceof android.os.BatteryManager) {
                batteryManager = (android.os.BatteryManager) systemService;
            } else {
                batteryManager = null;
            }
            if (batteryManager != null) {
                intProperty = batteryManager.getIntProperty(1);
            } else {
                intProperty = 0;
            }
            if (intProperty > 0) {
                iC = intProperty / 1000;
            } else {
                iC = BatteryManager.c();
            }
        } catch (Exception e4) {
            Log.e("BatteryManager", "Error getting capacity", e4);
            iC = 4000;
        }
        f3 /= 1000.0f;
        float f6 = f3;
        intExtra = intent.getIntExtra("plugged", -1);
        if (intExtra != 1) {
            str3 = "AC Charger";
        } else if (intExtra != 2) {
            str3 = "USB Charging";
        } else if (intExtra != 4) {
            str3 = "Wireless Charging";
        } else if (intExtra != 8) {
            str3 = "Not Plugged";
        } else {
            str3 = "Dock Charging";
        }
        String str6 = str3;
        intExtra2 = intent.getIntExtra("status", 1);
        if (intExtra2 != 2) {
            str4 = "Charging";
        } else if (intExtra2 != 3) {
            str4 = "Discharging";
        } else if (intExtra2 != 4) {
            str4 = "Not Charging";
        } else if (intExtra2 == 5) {
            str4 = "Full";
        }
        intExtra3 = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        int intExtra8 = intent.getIntExtra("scale", -1);
        if (intExtra3 >= 0) {
            i2 = 0;
        } else {
            i2 = 0;
        }
        intExtra4 = intent.getIntExtra("status", -1);
        if (intExtra4 != 2) {
            z2 = true;
        } else {
            z2 = true;
        }
        mutableStateFlow.setValue(BatteryInfo.a(batteryInfo, str2, f4, f6, str6, 0L, iC, str4, i2, z2, intent.getBooleanExtra("present", true), 0.0f, null, 3088));
        return Unit.f43263a;
    }
}
