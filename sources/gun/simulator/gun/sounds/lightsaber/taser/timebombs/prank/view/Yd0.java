package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Yd0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4028a;

    public /* synthetic */ Yd0(int i) {
        this.f4028a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        View view;
        String str;
        Gm0 gm0;
        Iterator it;
        Boolean bool;
        String str2;
        View view2;
        String str3;
        View view3 = null;
        switch (this.f4028a) {
            case 0:
                C3097be0 c3097be0 = C3097be0.g;
                c3097be0.getClass();
                c3097be0.b.clear();
                Iterator it2 = Collections.unmodifiableCollection(Cn0.c.b).iterator();
                while (it2.hasNext()) {
                    ((C3203cn0) it2.next()).getClass();
                }
                c3097be0.f = System.nanoTime();
                Ym0 ym0 = c3097be0.d;
                ym0.e();
                long jNanoTime = System.nanoTime();
                C3491g4 c3491g4 = c3097be0.c;
                Dn0 dn0 = (Dn0) c3491g4.c;
                HashSet<String> hashSet = ym0.g;
                int size = hashSet.size();
                C3491g4 c3491g5 = c3097be0.e;
                if (size > 0) {
                    for (String str4 : hashSet) {
                        JSONObject jSONObjectA = dn0.a(null);
                        HashMap map = ym0.d;
                        int i = ym0.f4041a;
                        switch (i) {
                            case 0:
                                view = (View) map.get(str4);
                                break;
                            default:
                                view = (View) map.get(str4);
                                break;
                        }
                        Yn0 yn0 = (Yn0) c3491g4.b;
                        C3491g4 c3491g6 = c3491g4;
                        HashMap map2 = ym0.h;
                        switch (i) {
                            case 0:
                                str = (String) map2.get(str4);
                                break;
                            default:
                                str = (String) map2.get(str4);
                                break;
                        }
                        if (str != null) {
                            JSONObject jSONObjectA2 = yn0.a(view);
                            WindowManager windowManager = En0.f3039a;
                            try {
                                jSONObjectA2.put("adSessionId", str4);
                                break;
                            } catch (JSONException unused) {
                            }
                            try {
                                jSONObjectA2.put("notVisibleReason", str);
                                break;
                            } catch (JSONException unused2) {
                            }
                            En0.c(jSONObjectA, jSONObjectA2);
                        }
                        En0.d(jSONObjectA);
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(str4);
                        c3491g5.n(jSONObjectA, hashSet2, jNanoTime);
                        c3491g4 = c3491g6;
                    }
                }
                HashSet hashSet3 = ym0.f;
                if (hashSet3.size() > 0) {
                    JSONObject jSONObjectA3 = dn0.a(null);
                    dn0.l(null, jSONObjectA3, c3097be0, true, false);
                    En0.d(jSONObjectA3);
                    c3491g5.r(jSONObjectA3, hashSet3, jNanoTime);
                } else {
                    c3491g5.q();
                }
                ym0.c();
                long jNanoTime2 = System.nanoTime() - c3097be0.f;
                ArrayList arrayList = c3097be0.f4179a;
                if (arrayList.size() > 0) {
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        AbstractC3950lJ.z(it3.next());
                        TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                        throw null;
                    }
                }
                C4699to0 c4699to0 = C4699to0.d;
                Context context = (Context) c4699to0.f5052a.get();
                if (context == null) {
                    return;
                }
                KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
                boolean zIsDeviceLocked = Build.VERSION.SDK_INT >= 22 ? keyguardManager.isDeviceLocked() : keyguardManager.inKeyguardRestrictedInputMode();
                c4699to0.a(c4699to0.b, zIsDeviceLocked);
                c4699to0.c = zIsDeviceLocked;
                return;
            case 1:
                Handler handler = C3097be0.i;
                if (handler != null) {
                    handler.post(C3097be0.j);
                    C3097be0.i.postDelayed(C3097be0.k, 200L);
                    return;
                }
                return;
            case 2:
                Zd0 zd0 = Zd0.g;
                zd0.getClass();
                zd0.b.clear();
                Iterator it4 = Collections.unmodifiableCollection(Fn0.c.b).iterator();
                while (it4.hasNext()) {
                    ((C3026an0) it4.next()).getClass();
                }
                zd0.f = System.nanoTime();
                Gm0 gm1 = zd0.d;
                gm1.getClass();
                Fn0 fn0 = Fn0.c;
                HashMap map3 = gm1.f3138a;
                HashSet hashSet4 = gm1.d;
                HashMap map4 = gm1.c;
                HashMap map5 = gm1.g;
                HashSet hashSet5 = gm1.e;
                HashSet hashSet6 = gm1.f;
                if (fn0 != null) {
                    Iterator it5 = Collections.unmodifiableCollection(fn0.b).iterator();
                    while (it5.hasNext()) {
                        C3026an0 c3026an0 = (C3026an0) it5.next();
                        View view4 = (View) c3026an0.d.get();
                        if (!c3026an0.f || c3026an0.g) {
                            gm0 = gm1;
                            it = it5;
                        } else {
                            String str5 = c3026an0.h;
                            if (view4 != null) {
                                if (view4.isAttachedToWindow()) {
                                    boolean zHasWindowFocus = view4.hasWindowFocus();
                                    it = it5;
                                    WeakHashMap weakHashMap = gm1.h;
                                    if (zHasWindowFocus) {
                                        weakHashMap.remove(view4);
                                        bool = Boolean.FALSE;
                                    } else if (weakHashMap.containsKey(view4)) {
                                        bool = (Boolean) weakHashMap.get(view4);
                                    } else {
                                        Boolean bool2 = Boolean.FALSE;
                                        weakHashMap.put(view4, bool2);
                                        bool = bool2;
                                    }
                                    if (bool.booleanValue()) {
                                        gm0 = gm1;
                                        str2 = "noWindowFocus";
                                    } else {
                                        HashSet hashSet7 = new HashSet();
                                        View view5 = view4;
                                        while (true) {
                                            if (view5 == null) {
                                                gm0 = gm1;
                                                hashSet4.addAll(hashSet7);
                                                str2 = null;
                                            } else {
                                                String strD = AbstractC3375el.d(view5);
                                                if (strD != null) {
                                                    str2 = strD;
                                                    gm0 = gm1;
                                                } else {
                                                    hashSet7.add(view5);
                                                    Object parent = view5.getParent();
                                                    gm1 = gm1;
                                                    view5 = parent instanceof View ? (View) parent : null;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    str2 = "notAttached";
                                    gm0 = gm1;
                                    it = it5;
                                }
                                if (str2 == null) {
                                    hashSet5.add(str5);
                                    map3.put(view4, str5);
                                    Iterator it6 = c3026an0.c.iterator();
                                    if (it6.hasNext()) {
                                        AbstractC3950lJ.z(it6.next());
                                        throw null;
                                    }
                                } else if (str2 != "noWindowFocus") {
                                    hashSet6.add(str5);
                                    map4.put(str5, view4);
                                    map5.put(str5, str2);
                                }
                            } else {
                                gm0 = gm1;
                                hashSet6.add(str5);
                                map5.put(str5, "noAdView");
                            }
                            gm1 = gm0;
                        }
                        it5 = it;
                        gm1 = gm0;
                    }
                }
                Gm0 gm2 = gm1;
                long jNanoTime3 = System.nanoTime();
                C3491g4 c3491g7 = zd0.c;
                Dn0 dn1 = (Dn0) c3491g7.c;
                int size2 = hashSet6.size();
                C3491g4 c3491g8 = zd0.e;
                if (size2 > 0) {
                    Iterator it7 = hashSet6.iterator();
                    while (it7.hasNext()) {
                        String str6 = (String) it7.next();
                        Iterator it8 = it7;
                        HashSet hashSet8 = hashSet6;
                        JSONObject jSONObjectA4 = dn1.a(null);
                        View view6 = (View) map4.get(str6);
                        HashSet hashSet9 = hashSet4;
                        Yn0 yn1 = (Yn0) c3491g7.b;
                        C3491g4 c3491g9 = c3491g7;
                        String str7 = (String) map5.get(str6);
                        if (str7 != null) {
                            JSONObject jSONObjectA5 = yn1.a(view6);
                            WindowManager windowManager2 = Gn0.f3140a;
                            try {
                                jSONObjectA5.put("adSessionId", str6);
                                break;
                            } catch (JSONException unused3) {
                            }
                            try {
                                jSONObjectA5.put("notVisibleReason", str7);
                                break;
                            } catch (JSONException unused4) {
                            }
                            Gn0.c(jSONObjectA4, jSONObjectA5);
                        }
                        Gn0.d(jSONObjectA4);
                        HashSet hashSet10 = new HashSet();
                        hashSet10.add(str6);
                        c3491g8.n(jSONObjectA4, hashSet10, jNanoTime3);
                        it7 = it8;
                        hashSet6 = hashSet8;
                        hashSet4 = hashSet9;
                        c3491g7 = c3491g9;
                    }
                }
                HashSet hashSet11 = hashSet4;
                HashSet hashSet12 = hashSet6;
                if (hashSet5.size() > 0) {
                    JSONObject jSONObjectA6 = dn1.a(null);
                    dn1.i(null, jSONObjectA6, zd0, true, false);
                    Gn0.d(jSONObjectA6);
                    c3491g8.r(jSONObjectA6, hashSet5, jNanoTime3);
                } else {
                    c3491g8.q();
                }
                map3.clear();
                gm2.b.clear();
                map4.clear();
                hashSet11.clear();
                hashSet5.clear();
                hashSet12.clear();
                map5.clear();
                gm2.i = false;
                long jNanoTime4 = System.nanoTime() - zd0.f;
                ArrayList arrayList2 = zd0.f4082a;
                if (arrayList2.size() > 0) {
                    Iterator it9 = arrayList2.iterator();
                    if (it9.hasNext()) {
                        AbstractC3950lJ.z(it9.next());
                        TimeUnit.NANOSECONDS.toMillis(jNanoTime4);
                        throw null;
                    }
                    return;
                }
                return;
            case 3:
                Handler handler2 = Zd0.i;
                if (handler2 != null) {
                    handler2.post(Zd0.j);
                    Zd0.i.postDelayed(Zd0.k, 200L);
                    return;
                }
                return;
            case 4:
                C3008ae0 c3008ae0 = C3008ae0.g;
                c3008ae0.getClass();
                c3008ae0.b.clear();
                Iterator it10 = Collections.unmodifiableCollection(Hn0.c.b).iterator();
                while (it10.hasNext()) {
                    ((Jm0) it10.next()).getClass();
                }
                c3008ae0.f = System.nanoTime();
                Ym0 ym1 = c3008ae0.d;
                ym1.e();
                long jNanoTime5 = System.nanoTime();
                C3491g4 c3491g10 = c3008ae0.c;
                Dn0 dn2 = (Dn0) c3491g10.c;
                HashSet<String> hashSet13 = ym1.g;
                int size3 = hashSet13.size();
                C3491g4 c3491g11 = c3008ae0.e;
                if (size3 > 0) {
                    for (String str8 : hashSet13) {
                        JSONObject jSONObjectA7 = dn2.a(view3);
                        HashMap map6 = ym1.d;
                        int i2 = ym1.f4041a;
                        switch (i2) {
                            case 0:
                                view2 = (View) map6.get(str8);
                                break;
                            default:
                                view2 = (View) map6.get(str8);
                                break;
                        }
                        Yn0 yn2 = (Yn0) c3491g10.b;
                        C3491g4 c3491g12 = c3491g10;
                        HashMap map7 = ym1.h;
                        switch (i2) {
                            case 0:
                                str3 = (String) map7.get(str8);
                                break;
                            default:
                                str3 = (String) map7.get(str8);
                                break;
                        }
                        if (str3 != null) {
                            JSONObject jSONObjectA8 = yn2.a(view2);
                            WindowManager windowManager3 = In0.f3240a;
                            try {
                                jSONObjectA8.put("adSessionId", str8);
                                break;
                            } catch (JSONException unused5) {
                            }
                            try {
                                jSONObjectA8.put("notVisibleReason", str3);
                                break;
                            } catch (JSONException unused6) {
                            }
                            In0.c(jSONObjectA7, jSONObjectA8);
                        }
                        In0.d(jSONObjectA7);
                        HashSet hashSet14 = new HashSet();
                        hashSet14.add(str8);
                        c3491g11.n(jSONObjectA7, hashSet14, jNanoTime5);
                        c3491g10 = c3491g12;
                        view3 = null;
                    }
                }
                HashSet hashSet15 = ym1.f;
                if (hashSet15.size() > 0) {
                    JSONObject jSONObjectA9 = dn2.a(null);
                    dn2.f(null, jSONObjectA9, c3008ae0, true, false);
                    In0.d(jSONObjectA9);
                    c3491g11.r(jSONObjectA9, hashSet15, jNanoTime5);
                } else {
                    c3491g11.q();
                }
                ym1.c();
                long jNanoTime6 = System.nanoTime() - c3008ae0.f;
                ArrayList arrayList3 = c3008ae0.f4132a;
                if (arrayList3.size() > 0) {
                    Iterator it11 = arrayList3.iterator();
                    if (it11.hasNext()) {
                        AbstractC3950lJ.z(it11.next());
                        TimeUnit.NANOSECONDS.toMillis(jNanoTime6);
                        throw null;
                    }
                }
                C4611so0 c4611so0 = C4611so0.d;
                Context context2 = (Context) c4611so0.f5000a.get();
                if (context2 == null) {
                    return;
                }
                KeyguardManager keyguardManager2 = (KeyguardManager) context2.getSystemService("keyguard");
                boolean zIsDeviceLocked2 = Build.VERSION.SDK_INT >= 22 ? keyguardManager2.isDeviceLocked() : keyguardManager2.inKeyguardRestrictedInputMode();
                c4611so0.a(c4611so0.b, zIsDeviceLocked2);
                c4611so0.c = zIsDeviceLocked2;
                return;
            default:
                Handler handler3 = C3008ae0.i;
                if (handler3 != null) {
                    handler3.post(C3008ae0.j);
                    C3008ae0.i.postDelayed(C3008ae0.k, 200L);
                    return;
                }
                return;
        }
    }
}
