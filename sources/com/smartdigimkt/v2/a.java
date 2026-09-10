package com.smartdigimkt.v2;

import android.content.Context;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.smartdigimkt.d3.c;
import com.smartdigimkt.m6.b;
import com.smartdigimkt.x.d;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f39059a = "VideoViewReport";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap<String, ArrayList<String>> f39060b = new HashMap<>();

    public static void a(String str, String str2) {
    }

    public static void b(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().e() == null) {
            return;
        }
        String strI0 = dVar.i0();
        ArrayList<String> arrayList = f39060b.get(strI0);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            f39060b.put(strI0, arrayList);
        }
        if (arrayList.contains(dVar.j())) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().e(), false, false);
        arrayList.add(dVar.j());
    }

    public static void c(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().f() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().f(), false, false);
    }

    public static void d(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().g() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().g(), false, false);
    }

    public static void e(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().k() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().k(), false, false);
    }

    public static void f(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().o() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().o(), false, false);
    }

    public static void g(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().l() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().l(), false, false);
    }

    public static void h(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().m() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().m(), false, false);
    }

    public static void i(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().n() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().n(), false, false);
    }

    public static void j(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().r() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().r(), false, true);
    }

    public static void k(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().t() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().t(), false, false);
    }

    public static void a(String str) {
        f39060b.remove(str);
    }

    public static void a(Context context, d dVar) {
        if (dVar == null || dVar.p1() == null || dVar.p1().s() == null) {
            return;
        }
        com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), dVar.p1().s(), false, false);
    }

    public static void a(Context context, d dVar, int i2, int i3) {
        try {
            String[] strArrI = dVar.p1().i();
            if (dVar.p1() == null || strArrI == null) {
                return;
            }
            String[] strArr = new String[strArrI.length];
            for (int i4 = 0; i4 < strArrI.length; i4++) {
                String str = strArrI[i4];
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endscreen_type", i2);
                String string = jSONObject.toString();
                if (!TextUtils.isEmpty(string)) {
                    string = com.smartdigimkt.r4.a.c(string);
                }
                if (!TextUtils.isEmpty(string)) {
                    str = str + "&value=" + URLEncoder.encode(string);
                }
                strArr[i4] = dVar.a2() == 1 ? str + "&to=1&cbt=" + dVar.m0() + "&tmorl=" + i3 : str + "&to=0&cbt=" + dVar.m0() + "&tmorl=" + i3;
            }
            com.smartdigimkt.o.a.a(context, dVar, dVar.i0(), strArr, false, true);
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, d dVar, int i2, int i3, int i4) {
        String str;
        Context context2;
        d dVar2;
        if (i3 == 0 || context == null || dVar == null) {
            return;
        }
        try {
            List<Map<Integer, String>> listP = dVar.p1().p();
            int i5 = ((i2 + 1) * 100) / i3;
            if (listP != null) {
                int i6 = 0;
                while (i6 < listP.size()) {
                    Map<Integer, String> map = listP.get(i6);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            int iIntValue = next.getKey().intValue();
                            String value = next.getValue();
                            if (dVar.a2() == 1) {
                                str = value + "&to=1&cbt=" + dVar.m0() + "&tmorl=" + i4;
                            } else {
                                str = value + "&to=0&cbt=" + dVar.m0() + "&tmorl=" + i4;
                            }
                            if (iIntValue > i5 || TextUtils.isEmpty(str)) {
                                context2 = context;
                                dVar2 = dVar;
                            } else {
                                context2 = context;
                                dVar2 = dVar;
                                com.smartdigimkt.o.a.a(context2, dVar2, dVar.i0(), new String[]{str}, false, true);
                                it.remove();
                                listP.remove(i6);
                                i6--;
                            }
                            context = context2;
                            dVar = dVar2;
                        }
                    }
                    i6++;
                    context = context;
                    dVar = dVar;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(d dVar, Map<Integer, String> map, String str, int i2) {
        if (dVar == null || map == null) {
            return;
        }
        try {
            if (map.size() > 0) {
                Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<Integer, String> next = it.next();
                    Integer key = next.getKey();
                    String value = next.getValue();
                    if (i2 == key.intValue() && !TextUtils.isEmpty(value)) {
                        d dVar2 = dVar;
                        String str2 = str;
                        com.smartdigimkt.o.a.a(b.p().k(), dVar2, str2, value, false, false);
                        it.remove();
                        dVar = dVar2;
                        str = str2;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(d dVar, String str) {
        if (dVar != null) {
            try {
                if (dVar.T() == null || dVar.T().size() <= 0) {
                    return;
                }
                for (String str2 : dVar.T()) {
                    if (!TextUtils.isEmpty(str2)) {
                        d dVar2 = dVar;
                        String str3 = str;
                        com.smartdigimkt.o.a.a(b.p().k(), dVar2, str3, str2, false, false);
                        dVar = dVar2;
                        str = str3;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(d dVar, c cVar, String str, String str2, String str3) {
        if (dVar == null || cVar == null) {
            return;
        }
        try {
            com.smartdigimkt.w2.a aVar = new com.smartdigimkt.w2.a(b.p().k());
            com.smartdigimkt.p0.b bVar = new com.smartdigimkt.p0.b();
            bVar.a("user_id", com.smartdigimkt.r4.a.c(str2));
            bVar.a(com.smartdigimkt.o1.b.M0, "1");
            bVar.a("reward_name", cVar.c());
            bVar.a("reward_amount", cVar.a() + "");
            bVar.a("unit_id", str);
            bVar.a("click_id", dVar.O1());
            if (!TextUtils.isEmpty(str3)) {
                bVar.a("extra", str3);
            }
            aVar.a("", bVar);
            com.smartdigimkt.o.a.a(b.p().k(), dVar, dVar.i0(), a(dVar.H0() + "/addReward?", bVar), false, false);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private static String a(String str, com.smartdigimkt.p0.b bVar) {
        if (bVar != null) {
            String strTrim = bVar.b().trim();
            if (!TextUtils.isEmpty(strTrim)) {
                if (!str.endsWith("?") && !str.endsWith(d9.i.f24749c)) {
                    str = str.concat(str.contains("?") ? d9.i.f24749c : "?");
                }
                return android.support.v4.media.a.m(str, strTrim);
            }
            return "";
        }
        return "";
    }
}
