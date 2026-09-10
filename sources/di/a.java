package di;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import com.adjust.sdk.Constants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Locale;
import kotlin.Metadata;
import q7.c;
import qd.i;
import ti.b;
import wi.j;
import xi.f;
import xi.g;
import xi.h;
import xi.m;
import xi.n;
import xi.o;
import xi.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldi/a;", "Lxi/n;", "Lxi/h;", "Lti/b;", "<init>", "()V", "battery_plus_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class a implements n, h, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f38901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f38902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f38903d;

    public static String b(int i10) {
        if (i10 == 1) {
            return "unknown";
        }
        if (i10 == 2) {
            return "charging";
        }
        if (i10 == 3) {
            return "discharging";
        }
        if (i10 == 4) {
            return "connected_not_charging";
        }
        if (i10 != 5) {
            return null;
        }
        return "full";
    }

    public final boolean a() {
        Context context = this.f38900a;
        kotlin.jvm.internal.n.c(context);
        Object systemService = context.getSystemService("power");
        kotlin.jvm.internal.n.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode();
    }

    @Override // xi.h
    public final void g(g gVar) {
        c cVar = new c(this, gVar);
        this.f38901b = cVar;
        Context context = this.f38900a;
        if (context != null) {
            b0.b.h(context, cVar, new IntentFilter("android.intent.action.BATTERY_CHANGED"), 4);
        }
        Context context2 = this.f38900a;
        kotlin.jvm.internal.n.c(context2);
        Object systemService = context2.getSystemService("batterymanager");
        kotlin.jvm.internal.n.d(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        String strB = b(((BatteryManager) systemService).getIntProperty(6));
        if (strB != null) {
            gVar.b(strB);
        } else {
            gVar.a("UNAVAILABLE", "Charging status unavailable");
        }
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        this.f38900a = binding.f50787a;
        f fVar = binding.f50789c;
        this.f38902c = new p(fVar, "dev.fluttercommunity.plus/battery");
        i iVar = new i(fVar, "dev.fluttercommunity.plus/charging");
        this.f38903d = iVar;
        iVar.A(this);
        p pVar = this.f38902c;
        kotlin.jvm.internal.n.c(pVar);
        pVar.b(this);
    }

    @Override // xi.h
    public final void onCancel() {
        Context context = this.f38900a;
        kotlin.jvm.internal.n.c(context);
        context.unregisterReceiver(this.f38901b);
        this.f38901b = null;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        this.f38900a = null;
        p pVar = this.f38902c;
        kotlin.jvm.internal.n.c(pVar);
        pVar.b(null);
        this.f38902c = null;
        i iVar = this.f38903d;
        kotlin.jvm.internal.n.c(iVar);
        iVar.A(null);
        this.f38903d = null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00bf  */
    @Override // xi.n
    public final void onMethodCall(m call, o oVar) {
        Boolean boolValueOf;
        kotlin.jvm.internal.n.f(call, "call");
        String str = call.f53822a;
        if (str != null) {
            int iHashCode = str.hashCode();
            String string = null;
            if (iHashCode != -82096147) {
                if (iHashCode != -75204358) {
                    if (iHashCode == 144057854 && str.equals("isInBatterySaveMode")) {
                        String MANUFACTURER = Build.MANUFACTURER;
                        kotlin.jvm.internal.n.e(MANUFACTURER, "MANUFACTURER");
                        Locale locale = Locale.getDefault();
                        kotlin.jvm.internal.n.e(locale, "getDefault(...)");
                        String lowerCase = MANUFACTURER.toLowerCase(locale);
                        kotlin.jvm.internal.n.e(lowerCase, "toLowerCase(...)");
                        int iHashCode2 = lowerCase.hashCode();
                        boolean zA = false;
                        if (iHashCode2 != -1206476313) {
                            if (iHashCode2 != -759499589) {
                                if (iHashCode2 == 1864941562 && lowerCase.equals(Constants.REFERRER_API_SAMSUNG)) {
                                    if (Build.VERSION.SDK_INT < 31) {
                                        Context context = this.f38900a;
                                        kotlin.jvm.internal.n.c(context);
                                        string = Settings.System.getString(context.getContentResolver(), "psm_switch");
                                    }
                                    boolValueOf = Boolean.valueOf(string == null ? a() : string.equals("1"));
                                } else {
                                    boolValueOf = Boolean.valueOf(a());
                                }
                            } else if (lowerCase.equals(Constants.REFERRER_API_XIAOMI)) {
                                Context context2 = this.f38900a;
                                kotlin.jvm.internal.n.c(context2);
                                int i10 = Settings.System.getInt(context2.getContentResolver(), "POWER_SAVE_MODE_OPEN", -1);
                                if (i10 == -1) {
                                    zA = a();
                                } else if (i10 == 1) {
                                    zA = true;
                                }
                                boolValueOf = Boolean.valueOf(zA);
                            } else {
                                boolValueOf = Boolean.valueOf(a());
                            }
                        } else if (lowerCase.equals("huawei")) {
                            Context context3 = this.f38900a;
                            kotlin.jvm.internal.n.c(context3);
                            int i11 = Settings.System.getInt(context3.getContentResolver(), "SmartModeStatus", -1);
                            if (i11 == -1) {
                                zA = a();
                            } else if (i11 == 4) {
                                zA = true;
                            }
                            boolValueOf = Boolean.valueOf(zA);
                        } else {
                            boolValueOf = Boolean.valueOf(a());
                        }
                        ((j) oVar).a(boolValueOf);
                        return;
                    }
                } else if (str.equals("getBatteryState")) {
                    Context context4 = this.f38900a;
                    kotlin.jvm.internal.n.c(context4);
                    Object systemService = context4.getSystemService("batterymanager");
                    kotlin.jvm.internal.n.d(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
                    String strB = b(((BatteryManager) systemService).getIntProperty(6));
                    if (strB != null) {
                        ((j) oVar).a(strB);
                        return;
                    } else {
                        ((j) oVar).b("UNAVAILABLE", "Charging status not available.", null);
                        return;
                    }
                }
            } else if (str.equals("getBatteryLevel")) {
                Context context5 = this.f38900a;
                kotlin.jvm.internal.n.c(context5);
                Object systemService2 = context5.getSystemService("batterymanager");
                kotlin.jvm.internal.n.d(systemService2, "null cannot be cast to non-null type android.os.BatteryManager");
                int intProperty = ((BatteryManager) systemService2).getIntProperty(4);
                if (intProperty != -1) {
                    ((j) oVar).a(Integer.valueOf(intProperty));
                    return;
                } else {
                    ((j) oVar).b("UNAVAILABLE", "Battery level not available.", null);
                    return;
                }
            }
        }
        ((j) oVar).c();
    }
}
