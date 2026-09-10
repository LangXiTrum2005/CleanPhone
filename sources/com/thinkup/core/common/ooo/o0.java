package com.thinkup.core.common.ooo;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.common.on.o0mm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public class o0 {
    public static int m = 999;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f42341n = 888;
    public static final String o = "thinkup_imp_check";
    public static int o0 = 5;
    private static volatile o0 oo;
    private final List<Integer> om = Arrays.asList(50, 15, 8, 22, 28, 59, 6, 37, 3);
    private final Map<String, List<Integer>> on = new HashMap();
    private final Map<String, String> m0 = new HashMap();
    private final Map<String, List<Integer>> mo = new HashMap();
    private final Map<String, String> mm = new HashMap();

    public interface o {
        void m();

        void o();
    }

    private o0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String oo(TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter == null) {
            return "";
        }
        try {
            com.thinkup.core.common.on.n0 trackingInfo = tUBaseAdAdapter.getTrackingInfo();
            o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
            if (trackingInfo == null) {
                return "";
            }
            String strMon = trackingInfo.mon();
            String strM = m(trackingInfo, unitGroupInfo);
            if (TextUtils.isEmpty(strM) || TextUtils.isEmpty(strMon)) {
                return "";
            }
            return this.mm.get(strMon + "_" + strM);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public final boolean m(TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter != null) {
            try {
                o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo == null || !this.om.contains(Integer.valueOf(unitGroupInfo.nm())) || unitGroupInfo.onoo() != 1) {
                    return true;
                }
                List<Integer> listO = o(unitGroupInfo, false);
                if (listO.isEmpty()) {
                    return true;
                }
                return o(tUBaseAdAdapter, listO, false);
            } catch (Throwable th) {
                com.thinkup.core.common.oo0.oo.m("check imp error", th.getMessage() + ", " + o00.o(th.getStackTrace()), com.thinkup.core.common.n.o0n.m().o0m());
            }
        }
        return true;
    }

    public final boolean n(TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter != null) {
            try {
                o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo == null || !this.om.contains(Integer.valueOf(unitGroupInfo.nm())) || unitGroupInfo.onm0() != 1) {
                    return true;
                }
                List<Integer> listO = o(unitGroupInfo, true);
                if (listO.isEmpty()) {
                    return true;
                }
                return o(tUBaseAdAdapter, listO, true);
            } catch (Throwable th) {
                com.thinkup.core.common.oo0.oo.m("check reward error", th.getMessage() + ", " + o00.o(th.getStackTrace()), com.thinkup.core.common.n.o0n.m().o0m());
            }
        }
        return true;
    }

    public final void o0(TUBaseAdAdapter tUBaseAdAdapter) {
        if (tUBaseAdAdapter != null) {
            try {
                com.thinkup.core.common.on.n0 trackingInfo = tUBaseAdAdapter.getTrackingInfo();
                if (trackingInfo != null) {
                    String strMon = trackingInfo.mon();
                    String strM = m(trackingInfo, tUBaseAdAdapter.getUnitGroupInfo());
                    if (TextUtils.isEmpty(strM) || TextUtils.isEmpty(strMon)) {
                        return;
                    }
                    String str = strMon + "_" + strM;
                    if (this.on.containsKey(str)) {
                        Objects.toString(this.on.remove(str));
                    }
                    if (this.m0.containsKey(str)) {
                        this.m0.remove(str);
                    }
                    if (this.mo.containsKey(str)) {
                        Objects.toString(this.mo.remove(str));
                    }
                    if (this.mm.containsKey(str)) {
                        this.mm.remove(str);
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static o0 o() {
        if (oo == null) {
            synchronized (o0.class) {
                try {
                    if (oo == null) {
                        oo = new o0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return oo;
    }

    private static String[] m() {
        try {
            Class<?> cls = Class.forName(m00.o("mdyd1odqj1Wkuhdg"));
            Object[] objArr = (Object[]) cls.getMethod(m00.o("jhwVwdfnWudfh"), new Class[0]).invoke(cls.getMethod(m00.o("fxuuhqwWkuhdg"), new Class[0]).invoke(null, new Object[0]), new Object[0]);
            if (objArr == null || objArr.length <= 0) {
                return null;
            }
            String[] strArr = new String[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                strArr[i2] = objArr[i2].toString();
            }
            return strArr;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final boolean o(TUBaseAdAdapter tUBaseAdAdapter) {
        JSONArray jSONArrayOnmn;
        String[] strArrM;
        if (tUBaseAdAdapter != null) {
            try {
                o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo == null || !this.om.contains(Integer.valueOf(unitGroupInfo.nm())) || unitGroupInfo.onoo() != 1 || (jSONArrayOnmn = unitGroupInfo.onmn()) == null || jSONArrayOnmn.length() <= 0 || (strArrM = m()) == null || strArrM.length <= 0) {
                    return true;
                }
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < strArrM.length; i2++) {
                    sb.append(strArrM[i2]);
                    if (i2 != strArrM.length - 1) {
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    }
                }
                String strSubstring = "";
                String name = tUBaseAdAdapter.getClass().getName();
                int iLastIndexOf = name.lastIndexOf(com.thinkup.core.common.n.mo.ono);
                if (iLastIndexOf != -1) {
                    strSubstring = name.substring(0, iLastIndexOf);
                }
                boolean zO = o(strArrM, strSubstring, jSONArrayOnmn);
                com.thinkup.core.common.oo0.oo.o(tUBaseAdAdapter.getTrackingInfo(), sb.toString(), zO);
                return zO;
            } catch (Throwable th) {
                com.thinkup.core.common.oo0.oo.m("check imp error", th.getMessage() + ", " + o00.o(th.getStackTrace()), com.thinkup.core.common.n.o0n.m().o0m());
            }
        }
        return true;
    }

    private static String m(com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar) {
        com.thinkup.core.common.on.on0 on0VarN0n;
        String strOon0 = n0Var.oon0();
        return (o0mmVar == null || !o0mmVar.oom() || (on0VarN0n = o0mmVar.n0n()) == null || TextUtils.isEmpty(on0VarN0n.getOriginRequestId())) ? strOon0 : on0VarN0n.getOriginRequestId();
    }

    public final void o(final TUBaseAdAdapter tUBaseAdAdapter, final o oVar) {
        if (tUBaseAdAdapter != null) {
            try {
                o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
                if (unitGroupInfo != null && unitGroupInfo.nm() == 50) {
                    if (!unitGroupInfo.oom()) {
                        oVar.o();
                        return;
                    }
                    if (unitGroupInfo.onoo() != 1) {
                        oVar.o();
                        return;
                    }
                    String strOo = oo(tUBaseAdAdapter);
                    if (!TextUtils.isEmpty(strOo)) {
                        if (strOo.equals("0")) {
                            oVar.o();
                            return;
                        }
                        return;
                    } else {
                        com.thinkup.core.common.n.o0n.m();
                        com.thinkup.core.common.n.o0n.m(new Runnable() { // from class: com.thinkup.core.common.ooo.o0.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                o oVar2;
                                String strOo2 = o0.this.oo(tUBaseAdAdapter);
                                if (TextUtils.isEmpty(strOo2)) {
                                    o oVar3 = oVar;
                                    if (oVar3 != null) {
                                        oVar3.o();
                                        return;
                                    }
                                    return;
                                }
                                if (!strOo2.equals("0") || (oVar2 = oVar) == null) {
                                    return;
                                }
                                oVar2.o();
                            }
                        }, com.smartdigimkt.u2.m.D0);
                        return;
                    }
                }
            } catch (Throwable th) {
                com.thinkup.core.common.oo0.oo.m("check checkWinResult error", th.getMessage() + ", " + o00.o(th.getStackTrace()), com.thinkup.core.common.n.o0n.m().o0m());
            }
        }
        oVar.o();
    }

    private static List<Integer> o(o0mm o0mmVar, boolean z2) {
        JSONArray jSONArrayOnon;
        JSONArray jSONArrayOnom;
        ArrayList arrayList = new ArrayList();
        try {
            int i2 = 0;
            if (o0mmVar.oom()) {
                if (z2) {
                    jSONArrayOnom = o0mmVar.onmo();
                } else {
                    jSONArrayOnom = o0mmVar.onom();
                }
                if (jSONArrayOnom != null && jSONArrayOnom.length() > 0) {
                    while (i2 < jSONArrayOnom.length()) {
                        arrayList.add((Integer) jSONArrayOnom.get(i2));
                        i2++;
                    }
                }
            } else {
                if (z2) {
                    jSONArrayOnon = o0mmVar.onmm();
                } else {
                    jSONArrayOnon = o0mmVar.onon();
                }
                if (jSONArrayOnon != null && jSONArrayOnon.length() > 0) {
                    while (i2 < jSONArrayOnon.length()) {
                        arrayList.add((Integer) jSONArrayOnon.get(i2));
                        i2++;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    public final boolean o(com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar) {
        if (n0Var == null) {
            return true;
        }
        try {
            String strMon = n0Var.mon();
            String strM = m(n0Var, o0mmVar);
            String strOono = n0Var.oono();
            if (TextUtils.isEmpty(strOono) || (!strOono.equals("0") && !strOono.equals("2"))) {
                if (TextUtils.isEmpty(strM) || TextUtils.isEmpty(strMon)) {
                    return true;
                }
                String str = strMon + "_" + strM;
                List<Integer> list = this.mo.get(str);
                List<Integer> list2 = this.on.get(str);
                Objects.toString(list2);
                Objects.toString(list2);
                if (list2 == null) {
                    return false;
                }
                return list == null || !list.contains(Integer.valueOf(m));
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    private boolean o(TUBaseAdAdapter tUBaseAdAdapter, List<Integer> list, boolean z2) {
        if (tUBaseAdAdapter == null) {
            return true;
        }
        try {
            com.thinkup.core.common.on.n0 trackingInfo = tUBaseAdAdapter.getTrackingInfo();
            o0mm unitGroupInfo = tUBaseAdAdapter.getUnitGroupInfo();
            if (trackingInfo == null || list == null) {
                return true;
            }
            String strMon = trackingInfo.mon();
            String strM = m(trackingInfo, unitGroupInfo);
            if (TextUtils.isEmpty(strM) || TextUtils.isEmpty(strMon)) {
                return true;
            }
            String str = strMon + "_" + strM;
            List<Integer> list2 = this.on.get(str);
            String str2 = this.m0.get(str);
            Objects.toString(list2);
            list.toString();
            if (list2 == null || new HashSet(list2).containsAll(list)) {
                return true;
            }
            if (z2) {
                com.thinkup.core.common.oo0.oo.n(trackingInfo, list2.toString(), str2);
                return false;
            }
            com.thinkup.core.common.oo0.oo.m(trackingInfo, list2.toString(), str2);
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return true;
        }
    }

    private static boolean o(String[] strArr, String str, JSONArray jSONArray) {
        int i2;
        try {
            if (!TextUtils.isEmpty(str) && jSONArray != null) {
                int i3 = -1;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    String str2 = strArr[i4];
                    if (str2 != null && str2.startsWith(str)) {
                        i3 = i4;
                    }
                }
                if (i3 != -1 && (i2 = i3 + 1) < strArr.length) {
                    String str3 = strArr[i2];
                    if (!TextUtils.isEmpty(str3) && jSONArray.length() > 0) {
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            String str4 = (String) jSONArray.get(i5);
                            if (!TextUtils.isEmpty(str4) && str3.startsWith(str4)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                return true;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void o(com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar, int i2, String str) {
        Object obj;
        List<Integer> list;
        if (n0Var != null) {
            try {
                String strMon = n0Var.mon();
                String strM = m(n0Var, o0mmVar);
                if (TextUtils.isEmpty(strM) || TextUtils.isEmpty(strMon)) {
                    return;
                }
                String str2 = strMon + "_" + strM;
                if (i2 != f42341n && i2 != m) {
                    List<Integer> list2 = this.on.get(str2);
                    if (list2 != null) {
                        if (!list2.contains(Integer.valueOf(i2))) {
                            list = list2;
                            list2.add(Integer.valueOf(i2));
                            list = list2;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(Integer.valueOf(i2));
                        this.on.put(str2, arrayList);
                        list = arrayList;
                    }
                    list = list2;
                    if (i2 == o0 && !TextUtils.isEmpty(str)) {
                        this.m0.put(str2, str);
                    }
                    n0Var.o(list);
                    list.toString();
                    return;
                }
                try {
                    List<Integer> list3 = this.mo.get(str2);
                    if (list3 != null) {
                        if (!list3.contains(Integer.valueOf(i2))) {
                            obj = list3;
                            list3.add(Integer.valueOf(i2));
                            obj = list3;
                        }
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(Integer.valueOf(i2));
                        this.mo.put(str2, arrayList2);
                        obj = arrayList2;
                    }
                    obj = list3;
                    if (i2 == f42341n && !TextUtils.isEmpty(str)) {
                        this.mm.put(str2, str);
                    }
                    obj.toString();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public final void o(com.thinkup.core.common.on.n0 n0Var, o0mm o0mmVar, int i2) {
        try {
            o(n0Var, o0mmVar, i2, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void o(int i2, String str, String str2) {
        Object obj;
        try {
            List<Integer> list = this.mo.get(str);
            if (list != null) {
                if (!list.contains(Integer.valueOf(i2))) {
                    obj = list;
                    list.add(Integer.valueOf(i2));
                    obj = list;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(i2));
                this.mo.put(str, arrayList);
                obj = arrayList;
            }
            obj = list;
            if (i2 == f42341n && !TextUtils.isEmpty(str2)) {
                this.mm.put(str, str2);
            }
            obj.toString();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
