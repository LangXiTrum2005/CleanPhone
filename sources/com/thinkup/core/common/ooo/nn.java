package com.thinkup.core.common.ooo;

import android.content.Context;
import android.support.v4.media.a;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.p004ironsource.d9;
import com.p004ironsource.fl;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.common.on.nn0;
import com.thinkup.core.common.on.o00o;
import com.thinkup.core.common.on.o0mm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class nn {
    private static final String m = "CommonSDKUtil";
    static Random o = new Random();

    public static class o {
        public static final String o = "com.android.vending";
    }

    public static boolean m(int i2) {
        return i2 == 2 || i2 == 7 || i2 == 9 || i2 == 12;
    }

    public static boolean n(int i2) {
        return i2 == 3 || i2 == 4 || i2 == 5 || i2 == 8 || i2 == 11 || i2 == 13;
    }

    public static boolean o(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(com.thinkup.core.common.n.mo.oo0, "Channel Error: The channel cannot be null or empty.");
        }
        return !TextUtils.isEmpty(str);
    }

    public static boolean o0(int i2) {
        return i2 == 1 || i2 == 6 || i2 == 10;
    }

    public static String om(String str) {
        str.getClass();
        switch (str) {
            case "0":
                return "Native";
            case "1":
                return "RewardedVideo";
            case "2":
                return "Banner";
            case "3":
                return "Interstitial";
            case "4":
                return "Splash";
            default:
                return "";
        }
    }

    public static TUShowConfig oo(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new TUShowConfig.Builder().scenarioId(str).build();
    }

    public static boolean m(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(com.thinkup.core.common.n.mo.oo0, "SubChannel Error: The subChannel cannot be null or empty.");
        }
        return !TextUtils.isEmpty(str);
    }

    public static boolean n(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.length() > 50) {
            Log.e(com.thinkup.core.common.n.mo.oo0, "Invalid ScenarioId(" + str + "):The length of ScenarioId must be between 1-50.");
            return false;
        }
        if (!Pattern.matches(".*[\\u4E00-\\u9FFF\\s]+.*", str)) {
            return true;
        }
        Log.e(com.thinkup.core.common.n.mo.oo0, "Invalid ScenarioId(" + str + "):ScenarioId cannot contain spaces or chinese characters.");
        return false;
    }

    public static String o0(String str) {
        return (!TextUtils.isEmpty(str) && n(str)) ? str : "";
    }

    public static int oo(int i2) {
        if (n(i2)) {
            return 1;
        }
        return m(i2) ? 2 : 0;
    }

    public static String o(String str, String str2, long j) {
        return str + "_" + str2 + "_" + j;
    }

    private static String o0(Context context) {
        String strOno = com.thinkup.core.common.n.o0n.m().ono();
        if (TextUtils.isEmpty(strOno)) {
            strOno = n0.o0(context) + n0.om();
        }
        StringBuilder sbW = a.w(strOno);
        sbW.append(UUID.randomUUID().toString());
        return nm.o(sbW.toString());
    }

    public static String m(String str, String str2, long j) {
        return a.r(new StringBuilder(), o(str, str2, j), "_refresh");
    }

    public static JSONObject o(Context context, String str, String str2, int i2, int i3) {
        int[] iArrO = com.thinkup.core.m.o.o(context).o(i2);
        int i4 = iArrO[0];
        int i5 = iArrO[1];
        o00o o00oVarO = com.thinkup.core.m.o.o(context).o(str2, i2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sr", "tp");
            jSONObject.put("rid", str);
            jSONObject.put("ads", i4);
            jSONObject.put("ahs", i5);
            jSONObject.put("pds", o00oVarO != null ? o00oVarO.f42227n : 0);
            jSONObject.put("phs", o00oVarO != null ? o00oVarO.o0 : 0);
            jSONObject.put(fl.SESSION_HISTORY_KEY_AD_PROVIDER, i3);
            jSONObject.put("tpl", str2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static double n(o0mm o0mmVar) {
        if (o0mmVar == null) {
            return 0.0d;
        }
        double dO0nm = o0mmVar.o0nm();
        if (dO0nm <= 0.0d) {
            return dO0nm;
        }
        try {
            if (!o0mmVar.oom()) {
                return dO0nm;
            }
            double dOnnm = o0mmVar.onnm();
            return dOnnm > 0.0d ? dO0nm * dOnnm : dO0nm;
        } catch (Throwable unused) {
            return dO0nm;
        }
    }

    public static double m(o0mm o0mmVar) {
        if (o0mmVar != null) {
            return o0mmVar.mm();
        }
        return 0.0d;
    }

    public static boolean n(Context context) {
        return onn.o().m(context);
    }

    private static String m(com.thinkup.core.common.on.ooo oooVar) {
        if (oooVar instanceof nn0) {
            return ((nn0) oooVar).mmn();
        }
        return "";
    }

    public static boolean n() {
        return onn.o().m();
    }

    private static double o0(o0mm o0mmVar) {
        if (o0mmVar != null) {
            return o0mmVar.onnm();
        }
        return 0.0d;
    }

    public static boolean m() {
        try {
            Map<String, Object> mapNo = com.thinkup.core.common.n.o0n.m().no();
            return mapNo != null && mapNo.containsKey("age") && Integer.parseInt(mapNo.get("age").toString()) <= 13;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean m(Context context) {
        return onn.o().o(context);
    }

    public static String o(Context context) {
        String strOno = com.thinkup.core.common.n.o0n.m().ono();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(n0.o0(context));
        stringBuffer.append(d9.i.f24749c);
        stringBuffer.append(n0.om());
        stringBuffer.append(d9.i.f24749c);
        stringBuffer.append(strOno);
        stringBuffer.append(d9.i.f24749c);
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append(d9.i.f24749c);
        stringBuffer.append(new Random().nextInt(10000));
        return nm.o(stringBuffer.toString());
    }

    public static boolean m(List<String> list, String str) {
        return list != null && list.size() > 0 && list.contains(str);
    }

    public static void o(List<o0mm> list, o0mm o0mmVar) {
        if (list == null) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            list.add(o0mmVar);
            return;
        }
        int i2 = size - 1;
        for (int i3 = 0; i3 < size; i3++) {
            if (mn.o(o0mmVar, list.get(i3)) <= 0) {
                list.add(i3, o0mmVar);
                return;
            } else {
                if (i3 == i2) {
                    list.add(o0mmVar);
                    return;
                }
            }
        }
    }

    private static boolean o(List<o0mm> list, o0mm o0mmVar, o0mm o0mmVar2, int i2, int i3, boolean z2) {
        if (z2 && o0mmVar.n0() == -1) {
            list.add(i2, o0mmVar2);
            return true;
        }
        if (mn.o(o0mmVar2, o0mmVar) <= 0) {
            list.add(i2, o0mmVar2);
            return true;
        }
        if (i2 != i3) {
            return false;
        }
        list.add(o0mmVar2);
        return true;
    }

    public static void o(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("searchBoxjavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setSavePassword(false);
    }

    public static double o(o0mm o0mmVar) {
        if (o0mmVar != null) {
            return o0mmVar.o0nm();
        }
        return 0.0d;
    }

    private static void o(String str, List<o0mm> list) {
        if (list != null) {
            try {
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o0mm o0mmVar = list.get(i2);
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    sb.append(i2);
                    sb.append(" --> adSourceId: ");
                    sb.append(o0mmVar.m0o());
                    sb.append(", ");
                    sb.append(o0mmVar.nn());
                    sb.append(", real: ");
                    sb.append(o0mmVar.moo());
                    sb.append(", sort: ");
                    sb.append(o(o0mmVar));
                    String strMon = o0mmVar.mon();
                    if (!TextUtils.isEmpty(strMon)) {
                        sb.append(", errorMsg: ");
                        sb.append(strMon);
                    }
                }
                Log.e(str, sb.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String o() {
        if (!TextUtils.isEmpty("UA_6.5.36")) {
            return "UA_6.5.36";
        }
        return "UA_0.0.0";
    }

    private static String o(com.thinkup.core.common.on.ooo oooVar) {
        String packageName;
        com.thinkup.core.common.on.oon oonVarOn;
        String str = oooVar.oo0() + oooVar.mo();
        if ((oooVar instanceof nn0) && (oonVarOn = oooVar.on()) != null) {
            if (oonVarOn.on0() != 2) {
                str = m(oooVar) + oooVar.oo0() + oooVar.mo();
            } else {
                str = m(oooVar) + oooVar.oo0();
            }
        }
        if (com.thinkup.core.common.n.o0n.m().on() != null) {
            packageName = com.thinkup.core.common.n.o0n.m().on().getPackageName();
        } else {
            packageName = "";
        }
        return nm.o(str + packageName);
    }

    public static void o(Map<String, Object> map, com.thinkup.core.common.on.n0 n0Var) {
        if (n0Var == null || n0Var.n0n() >= 100000) {
            return;
        }
        map.put(com.thinkup.core.common.n.mo.oon.mo, n0Var);
        map.put(com.thinkup.core.common.n.mo.oon.mm, n0Var.oomn());
    }

    private static int o(int i2, int[] iArr, int i3) {
        if (iArr != null) {
            for (int i4 : iArr) {
                if (i2 == i4) {
                    return i2;
                }
            }
        }
        return i3;
    }

    public static List<o0mm> o(List<o0mm> list, com.thinkup.core.common.mm.om omVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap map = new HashMap(3);
        ArrayList arrayList = new ArrayList();
        for (o0mm o0mmVar : list) {
            double dO = o(o0mmVar);
            List arrayList2 = (List) linkedHashMap.get(String.valueOf(dO));
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(String.valueOf(dO), arrayList2);
            }
            Integer num = (Integer) map.get(String.valueOf(dO));
            if (num == null) {
                num = 0;
            }
            map.put(String.valueOf(dO), Integer.valueOf(o0mmVar.nmn() + num.intValue()));
            arrayList2.add(o0mmVar);
        }
        int i2 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            List<o0mm> list2 = (List) entry.getValue();
            int iIntValue = ((Integer) map.get(entry.getKey())).intValue();
            int i3 = -1;
            while (list2.size() > 0) {
                if (list2.size() == 1) {
                    o0mm o0mmVar2 = (o0mm) list2.get(0);
                    arrayList.add(o0mmVar2);
                    list2.remove(0);
                    if (omVar != null) {
                        omVar.o(o0mmVar2, i2, i3);
                    }
                    i2++;
                    break;
                }
                int iNextInt = o.nextInt(iIntValue) + 1;
                int iNmn = 0;
                for (o0mm o0mmVar3 : list2) {
                    if (o0mmVar3.nmn() + iNmn >= iNextInt) {
                        arrayList.add(o0mmVar3);
                        list2.remove(o0mmVar3);
                        iIntValue -= o0mmVar3.nmn();
                        if (i3 == -1) {
                            i3 = 0;
                        }
                        if (omVar != null) {
                            omVar.o(o0mmVar3, i2, i3);
                        }
                        i3++;
                        i2++;
                        break;
                    }
                    iNmn += o0mmVar3.nmn();
                }
            }
        }
        return arrayList;
    }

    public static String o(int i2) {
        switch (i2) {
            case 2:
                return "c2s";
            case 3:
                return "s2s";
            case 4:
                return "adx";
            case 5:
                return "adx open";
            case 6:
            case 10:
            default:
                return "";
            case 7:
                return "fb in-house";
            case 8:
                return "directly";
            case 9:
                return "dynamic";
            case 11:
                return "custom in-house";
            case 12:
                return "dynamic c2s";
            case 13:
                return "dynamic s2s";
        }
    }

    public static JSONObject o(StackTraceElement[] stackTraceElementArr) {
        JSONObject jSONObject = null;
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < stackTraceElementArr.length; i2++) {
                    String className = stackTraceElementArr[i2].getClassName();
                    if (!className.startsWith("com.thinkup")) {
                        jSONArray.put(stackTraceElementArr[i2].toString());
                        try {
                            jSONArray2.put(Class.forName(className).getSuperclass().getName());
                        } catch (Throwable unused) {
                            jSONArray2.put("fail");
                        }
                        if (jSONArray.length() >= 5) {
                            break;
                        }
                    }
                }
                jSONObject2.put("stacks", jSONArray);
                jSONObject2.put("classes", jSONArray2);
                return jSONObject2;
            } catch (Throwable unused2) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Throwable unused3) {
        }
    }

    public static boolean o(List<String> list, String str) {
        return list == null || list.size() <= 0 || list.contains(str);
    }
}
