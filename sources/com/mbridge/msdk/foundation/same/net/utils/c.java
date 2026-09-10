package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, b> f33839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<Integer> f33840d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f33841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f33842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f33843c;

        public b(long j10, int i10, String str) {
            this.f33843c = j10;
            this.f33841a = i10;
            this.f33842b = str;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class C0127c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f33844a = new c();
    }

    private List<Integer> a() {
        return Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616);
    }

    public static c b() {
        return C0127c.f33844a;
    }

    private c() {
        this.f33837a = "IDErrorUtil";
        this.f33839c = new ConcurrentHashMap<>();
        this.f33840d = new ArrayList<>();
        g gVarI = f2.i(i.b());
        gVarI = gVarI == null ? i.b().a() : gVarI;
        this.f33838b = gVarI.u() * 1000;
        if (gVarI.z() == null || gVarI.z().size() <= 0) {
            q0.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.f33840d.addAll(a());
        } else {
            q0.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.f33840d.addAll(gVarI.z());
        }
    }

    public synchronized void a(String str, int i10, String str2, long j10) {
        if (this.f33839c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f33840d.contains(Integer.valueOf(i10))) {
            q0.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.f33839c.put(str, new b(j10, i10, str2));
        }
    }

    public e a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        String str = eVar.a().get(MBridgeConstans.APP_ID);
        String str2 = eVar.a().get("placement_id");
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String strReplace = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(strReplace)) {
            strReplace = eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace(X3.j.f27834d, "").replace(X3.j.f27836e, "");
            }
        }
        String str4 = strReplace;
        String str5 = eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str5)) {
            str5 = "0";
        }
        return a(str, str4, str3, eVar.a().get("token"), str5);
    }

    private e a(String str, String str2, String str3, String str4, String str5) {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(str3);
        sb2.append("_");
        sb2.append(str2);
        String strQ = defpackage.e.q("_", str5, sb2);
        b bVarA = a(strQ);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.mbridge.msdk.tracker.network.g("data_res_type", "1"));
        if (bVarA != null && !TextUtils.isEmpty(bVarA.f33842b)) {
            try {
                if (bVarA.f33841a != -1) {
                    return e.a(new JSONObject(bVarA.f33842b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.f33842b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (i10 = Integer.parseInt(str5)) != 287 && i10 != 94) {
                    if (System.currentTimeMillis() < ((long) (i.b().c(str, str2).u() * 1000)) + bVarA.f33843c) {
                        return e.a(new JSONObject(bVarA.f33842b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.f33842b.getBytes(), arrayList));
                    }
                    this.f33839c.remove(strQ);
                    return null;
                }
            } catch (Exception e10) {
                q0.b("IDErrorUtil", e10.getMessage());
            }
        }
        q0.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private synchronized b a(String str) {
        b bVar;
        q0.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.f33839c.containsKey(str) || (bVar = this.f33839c.get(str)) == null) {
            return null;
        }
        if (bVar.f33841a == -1) {
            return bVar;
        }
        if (System.currentTimeMillis() > bVar.f33843c + ((long) this.f33838b)) {
            this.f33839c.remove(str);
            if (this.f33839c.size() > 0) {
                for (Map.Entry<String, b> entry : this.f33839c.entrySet()) {
                    q0.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().f33843c > this.f33838b) {
                        this.f33839c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        q0.b("IDErrorUtil", "getErrorInfo : " + bVar.f33842b);
        return bVar;
    }
}
