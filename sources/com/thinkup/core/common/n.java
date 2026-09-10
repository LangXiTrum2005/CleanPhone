package com.thinkup.core.common;

import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.common.on.mno;
import com.thinkup.core.common.on.o0mm;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static String o = "n";
    private static volatile n om;
    ConcurrentHashMap<String, Long> m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f41885n = new ConcurrentHashMap<>();
    Map<String, o> o0 = new ConcurrentHashMap(5);
    Map<String, mno> oo;

    public static class o {
        String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f41886n;
        String o;
    }

    private n() {
    }

    public static n o() {
        if (om == null) {
            synchronized (n.class) {
                try {
                    if (om == null) {
                        om = new n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return om;
    }

    public final boolean m(o0mm o0mmVar) {
        if (o0mmVar.om0() == 7) {
            return false;
        }
        if (o0mmVar.mnn() == 0) {
            return false;
        }
        return o0mmVar.mnn() + (this.f41885n.get(o0mmVar.m0o()) != null ? this.f41885n.get(o0mmVar.m0o()).longValue() : 0L) >= System.currentTimeMillis();
    }

    private void m(String str, long j) {
        this.f41885n.put(str, Long.valueOf(j));
    }

    public final void m(String str) {
        JSONObject jSONObjectOptJSONObject;
        this.oo = new ConcurrentHashMap(3);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                try {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(next)) != null) {
                        this.oo.put(next, new mno(jSONObjectOptJSONObject));
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public final boolean o(o0mm o0mmVar) {
        if (o0mmVar.mnm() == 0) {
            return false;
        }
        return o0mmVar.mnm() + (this.m.get(o0mmVar.m0o()) != null ? this.m.get(o0mmVar.m0o()).longValue() : 0L) >= System.currentTimeMillis();
    }

    public final void o(String str, long j) {
        this.m.put(str, Long.valueOf(j));
    }

    public final long o(String str) {
        Long l2 = this.f41885n.get(str);
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public final void o(String str, long j, AdError adError) {
        if (TextUtils.equals(adError.getCode(), ErrorCode.noADError)) {
            o oVar = this.o0.get(str);
            if (oVar == null) {
                oVar = new o();
            }
            oVar.o = adError.getPlatformCode();
            oVar.m = adError.getPlatformMSG();
            oVar.f41886n = j;
            this.o0.put(str, oVar);
        }
    }

    public final boolean o(int i2, com.thinkup.core.oo.n0 n0Var, o0mm o0mmVar) {
        int i3;
        if (this.oo == null) {
            return false;
        }
        List<Integer> listOmm = n0Var.omm();
        if (listOmm.isEmpty()) {
            return false;
        }
        o oVar = this.o0.get(o0mmVar.m0o());
        if (oVar == null) {
            return false;
        }
        switch (i2) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                i3 = 3;
                break;
            case 2:
            default:
                i3 = 1;
                break;
            case 8:
                i3 = 2;
                break;
        }
        if (!listOmm.contains(Integer.valueOf(i3))) {
            return false;
        }
        mno mnoVar = this.oo.get(String.valueOf(o0mmVar.nm()));
        if (mnoVar == null) {
            return false;
        }
        List<mno.o> listO = mnoVar.o();
        if (listO.isEmpty()) {
            return false;
        }
        return o(listO, oVar);
    }

    private static boolean o(List<mno.o> list, o oVar) {
        if (oVar != null && list != null) {
            try {
                list.toString();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    mno.o oVar2 = list.get(i2);
                    if (oVar2 != null) {
                        String strO = oVar2.o();
                        if (TextUtils.isEmpty(strO)) {
                            continue;
                        } else {
                            long jM = oVar2.m();
                            Map<String, Long> mapN = oVar2.n();
                            if (strO.equals("-88888")) {
                                if (!TextUtils.isEmpty(oVar.m) && mapN != null && !mapN.isEmpty()) {
                                    for (Map.Entry<String, Long> entry : mapN.entrySet()) {
                                        String key = entry.getKey();
                                        Long value = entry.getValue();
                                        if (value.longValue() > 0 && !TextUtils.isEmpty(key) && oVar.m.contains(key) && oVar.f41886n + value.longValue() > System.currentTimeMillis()) {
                                            return true;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(oVar.o)) {
                                continue;
                            } else if (TextUtils.isEmpty(oVar.m)) {
                                if (strO.equals(oVar.o) && ((mapN == null || mapN.isEmpty()) && jM > 0 && oVar.f41886n + jM > System.currentTimeMillis())) {
                                    return true;
                                }
                            } else if (mapN == null || mapN.isEmpty()) {
                                if (jM > 0 && oVar.f41886n + jM > System.currentTimeMillis()) {
                                    return true;
                                }
                            } else {
                                for (Map.Entry<String, Long> entry2 : mapN.entrySet()) {
                                    String key2 = entry2.getKey();
                                    Long value2 = entry2.getValue();
                                    if (value2.longValue() > 0 && !TextUtils.isEmpty(key2) && oVar.m.contains(key2) && oVar.f41886n + value2.longValue() > System.currentTimeMillis()) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }
}
