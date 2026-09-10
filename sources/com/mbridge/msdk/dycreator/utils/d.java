package com.mbridge.msdk.dycreator.utils;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(View view, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        String[] strArrSplit;
        if (view != 0) {
            try {
                if ((view instanceof InterBase) && aVar != null) {
                    String actionDes = ((InterBase) view).getActionDes();
                    if (!TextUtils.isEmpty(actionDes) && (strArrSplit = actionDes.split("\\|")) != null && strArrSplit.length >= 2 && !TextUtils.isEmpty(strArrSplit[0]) && strArrSplit[0].startsWith("click") && !TextUtils.isEmpty(strArrSplit[1]) && strArrSplit[1].equals("alecfc") && aVar.getEffectData() != null) {
                        return aVar.getEffectData().isClickScreen();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return true;
    }

    public static void a(String str, View view, boolean z10) {
        if (view == null || !(view instanceof InterBase) || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit == null || strArrSplit.length < 2 || TextUtils.isEmpty(strArrSplit[0]) || !strArrSplit[0].startsWith("visible") || TextUtils.isEmpty(strArrSplit[1]) || !strArrSplit[1].equals("parent") || !z10) {
                return;
            }
            view.setVisibility(8);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static Object a(Object obj, String str) {
        Method method;
        try {
            try {
                method = obj.getClass().getMethod(str, null);
                if (method != null) {
                    try {
                        return method.invoke(obj, null);
                    } catch (NoSuchMethodException unused) {
                        if (obj instanceof com.mbridge.msdk.dycreator.viewdata.base.a) {
                            method = ((com.mbridge.msdk.dycreator.viewdata.base.a) obj).getBindData().getClass().getMethod(str, null);
                        }
                        if (method != null) {
                            return method.invoke(((com.mbridge.msdk.dycreator.viewdata.base.a) obj).getBindData(), null);
                        }
                        return null;
                    }
                }
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return null;
    }

    public static String a(boolean z10, int i10, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2) || !str2.contains("zh")) {
            return str + " " + i10 + "s";
        }
        if (z10) {
            return str + i10 + "s";
        }
        return i10 + "s " + str;
    }
}
