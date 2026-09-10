package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class lk {
    private static HashMap<String, ArrayList<String>> Lxb = new HashMap<>();

    private static Signature[] LD(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e) {
            sLN.LD(e.toString());
            return null;
        }
    }

    public static ArrayList<String> Lxb(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (Lxb.get(str) != null) {
                return Lxb.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : LD(context, packageName)) {
                    String strLxb = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        strLxb = Lxb(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        strLxb = Lxb(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strLxb = Lxb(signature, "SHA256");
                    }
                    arrayList.add(strLxb);
                }
            } catch (Exception e) {
                sLN.LD(e.toString());
            }
            Lxb.put(str, arrayList);
        }
        return arrayList;
    }

    public static String Lxb(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayListLxb = Lxb(context, "SHA1");
        if (arrayListLxb != null && arrayListLxb.size() != 0) {
            for (int i = 0; i < arrayListLxb.size(); i++) {
                sb.append(arrayListLxb.get(i));
                if (i < arrayListLxb.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static String Lxb(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(":");
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception e) {
            sLN.LD(e.toString());
            return "error!";
        }
    }
}
