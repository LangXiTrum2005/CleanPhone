package com.inmobi.media;

import A.RunnableC0905n;
import A.RunnableC0910q;
import com.google.android.gms.measurement.AppMeasurement;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class E6 implements InterfaceC3274va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CrashConfig f22796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3236t4 f22797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U5 f22798c;
    public final D6 d;

    public E6(CrashConfig crashConfig) {
        Intrinsics.f(crashConfig, "crashConfig");
        this.f22796a = crashConfig;
        this.f22798c = new U5(crashConfig);
        this.d = new D6(this);
    }

    public final void a(T5 t5) {
        R5 r5C = Nc.c();
        long eventTTL = this.f22796a.getEventTTL();
        r5C.getClass();
        r5C.a("ts<?", new String[]{String.valueOf(System.currentTimeMillis() - (eventTTL * ((long) 1000)))});
        R5 r5C2 = Nc.c();
        r5C2.getClass();
        int iA = (T1.a(r5C2, null, null, 63) + 1) - this.f22796a.getMaxEventsToPersist();
        if (iA > 0) {
            Nc.c().a(iA);
        }
        Nc.c().a(t5);
    }

    public final void b(T5 incident) {
        Intrinsics.f(incident, "incident");
        if (Ie.a(incident)) {
            CrashConfig.ANRConfig aNRConfig = this.f22796a.getAnr();
            if ((incident instanceof C2977d1) && L3.f22938a.z() && aNRConfig.getAppExitReason().getUseForReporting() && this.f22798c.d.a()) {
                incident.f23247a = "ANREvent";
                a(incident);
            } else if ((incident instanceof mf) && aNRConfig.getWatchdog().getUseForReporting() && this.f22798c.f23262c.a()) {
                a(incident);
            } else {
                if (!(incident instanceof C3124m3)) {
                    return;
                }
                if (this.f22796a.getCrashConfig().getEnabled() && this.f22798c.f23260a.a()) {
                    a(incident);
                }
            }
            Ie.f22893a.execute(new RunnableC0910q(this, 0));
        }
    }

    public final void c() {
        Ie.f22893a.execute(new RunnableC0910q(this, 1));
        Uc.f().a(new int[]{2, 1, 152, 150, 151}, this.d);
    }

    public static final void a(E6 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.f22797b = new C3236t4(Nc.c(), this$0, this$0.f22796a.getEventConfig(), null);
        R5 r5C = Nc.c();
        r5C.getClass();
        if (T1.a(r5C, null, null, 63) > 0) {
            this$0.b();
        }
    }

    public final void a(C3011f2 incident) {
        Intrinsics.f(incident, "incident");
        if (this.f22796a.getCatchConfig().getEnabled() && this.f22798c.f23261b.a()) {
            Ie.f22893a.execute(new RunnableC0905n(2, this, incident));
        }
    }

    public static final void a(E6 this$0, C3011f2 incident) {
        Intrinsics.f(this$0, "this$0");
        Intrinsics.f(incident, "$incident");
        this$0.a((T5) incident);
        this$0.b();
    }

    public static final void b(E6 this$0) {
        Intrinsics.f(this$0, "this$0");
        this$0.b();
    }

    @Override // com.inmobi.media.InterfaceC3274va
    public final C3220s4 a() {
        int iA;
        String string;
        int iP = L3.f22938a.p();
        int i2 = 1;
        if (iP == 0 || iP != 1) {
            iA = this.f22796a.getMobileConfig().a();
        } else {
            iA = this.f22796a.getWifiConfig().a();
        }
        ArrayList<T5> arrayListB = Nc.c().b(iA);
        if (arrayListB.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((T5) it.next()).f23249c));
        }
        try {
            HashMap map = new HashMap(L3.f22938a.a(false));
            map.put("im-accid", Uc.b());
            map.put("version", "2.0.0");
            map.put("component", AppMeasurement.CRASH_ORIGIN);
            map.put("mk-version", Vc.a());
            map.putAll(C2994e1.f23540e);
            map.put("tp", Vc.d());
            String strF = Vc.f();
            if (strF == null) {
                strF = "";
            }
            map.put("tpVer", strF);
            JSONObject jSONObject = new JSONObject(map);
            JSONArray jSONArray = new JSONArray();
            for (T5 t5 : arrayListB) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventId", t5.f23200e);
                jSONObject2.put("eventType", t5.f23247a);
                String strA = t5.a();
                int length = strA.length() - i2;
                int i3 = 0;
                boolean z2 = false;
                while (i3 <= length) {
                    boolean z3 = Intrinsics.h(strA.charAt(!z2 ? i3 : length), 32) <= 0;
                    if (z2) {
                        if (!z3) {
                            break;
                        }
                        length--;
                    } else if (z3) {
                        i3++;
                    } else {
                        z2 = true;
                    }
                }
                if (strA.subSequence(i3, length + 1).toString().length() > 0) {
                    jSONObject2.put("crash_report", t5.a());
                }
                jSONObject2.put("ts", t5.f23248b);
                jSONArray.put(jSONObject2);
                i2 = 1;
            }
            jSONObject.put(AppMeasurement.CRASH_ORIGIN, jSONArray);
            string = jSONObject.toString();
        } catch (JSONException unused) {
            string = null;
        }
        if (string != null) {
            return new C3220s4(arrayList, string);
        }
        return null;
    }

    public final void b() {
        Unit unit;
        C3189q4 eventConfig = this.f22796a.getEventConfig();
        eventConfig.k = this.f22796a.getUrl();
        C3236t4 c3236t4 = this.f22797b;
        if (c3236t4 != null) {
            c3236t4.f24004i = eventConfig;
            unit = Unit.f43263a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f22797b = new C3236t4(Nc.c(), this, eventConfig, null);
        }
        C3236t4 c3236t5 = this.f22797b;
        if (c3236t5 != null) {
            C3189q4 c3189q4 = c3236t5.f24004i;
            if (c3236t5.f.get() || c3189q4 == null) {
                return;
            }
            c3236t5.a(c3189q4.f23917c, false);
        }
    }
}
