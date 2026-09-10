package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kz0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final kz0 f16576g = new kz0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f16577h = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Handler f16578i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final bf f16579j = new bf(7);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final bf f16580k = new bf(8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16586f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16581a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16582b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ln0 f16584d = new ln0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iw0 f16583c = new iw0(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final md0 f16585e = new md0(new ay0(1));

    public static void b() {
        if (f16578i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f16578i = handler;
            handler.post(f16579j);
            f16578i.postDelayed(f16580k, 200L);
        }
    }

    public final void a(View view, x11 x11Var, JSONObject jSONObject, boolean z10) {
        Object obj;
        boolean z11;
        int i10;
        if (pi1.f(view) == null) {
            ln0 ln0Var = this.f16584d;
            char c4 = ((HashSet) ln0Var.f17074e).contains(view) ? (char) 1 : ln0Var.f17070a ? (char) 2 : (char) 3;
            if (c4 == 3) {
                return;
            }
            JSONObject jSONObjectZ = x11Var.z(view);
            hz0.c(jSONObject, jSONObjectZ);
            HashMap map = (HashMap) ln0Var.f17071b;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z12 = false;
            if (obj != null) {
                try {
                    jSONObjectZ.put("adSessionId", obj);
                } catch (JSONException e10) {
                    rb0.k("Error with setting ad session id", e10);
                }
                WeakHashMap weakHashMap = (WeakHashMap) ln0Var.f17079j;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z12 = true;
                }
                try {
                    jSONObjectZ.put("hasWindowFocus", Boolean.valueOf(z12));
                } catch (JSONException e11) {
                    rb0.k("Error with setting has window focus", e11);
                }
                boolean zContains = ((HashSet) ln0Var.f17078i).contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectZ.put("isPipActive", objValueOf);
                    } catch (JSONException e12) {
                        rb0.k("Error with setting is picture-in-picture active", e12);
                    }
                }
                ln0Var.f17070a = true;
                return;
            }
            HashMap map2 = (HashMap) ln0Var.f17072c;
            iz0 iz0Var = (iz0) map2.get(view);
            if (iz0Var != null) {
                map2.remove(view);
            }
            if (iz0Var != null) {
                yy0 yy0Var = iz0Var.f15878a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = iz0Var.f15879b;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    jSONArray.put((String) arrayList.get(i11));
                }
                try {
                    jSONObjectZ.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZ.put("friendlyObstructionClass", yy0Var.f22410b);
                    jSONObjectZ.put("friendlyObstructionPurpose", yy0Var.f22411c);
                    jSONObjectZ.put("friendlyObstructionReason", yy0Var.f22412d);
                } catch (JSONException e13) {
                    rb0.k("Error with setting friendly obstruction", e13);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z13 = z10 || z11;
            boolean z14 = c4 == 1;
            x11Var.getClass();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!z14) {
                    for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                        a(viewGroup.getChildAt(i12), x11Var, jSONObjectZ, z13);
                    }
                    return;
                }
                HashMap map3 = new HashMap();
                for (int i13 = 0; i13 < viewGroup.getChildCount(); i13++) {
                    View childAt = viewGroup.getChildAt(i13);
                    ArrayList arrayList2 = (ArrayList) map3.get(Float.valueOf(childAt.getZ()));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        map3.put(Float.valueOf(childAt.getZ()), arrayList2);
                    }
                    arrayList2.add(childAt);
                }
                ArrayList arrayList3 = new ArrayList(map3.keySet());
                Collections.sort(arrayList3);
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    ArrayList arrayList4 = (ArrayList) map3.get((Float) arrayList3.get(i14));
                    int size3 = arrayList4.size();
                    int i15 = 0;
                    while (true) {
                        i10 = i14 + 1;
                        if (i15 < size3) {
                            a((View) arrayList4.get(i15), x11Var, jSONObjectZ, z13);
                            i15++;
                        }
                    }
                    i14 = i10;
                }
            }
        }
    }
}
