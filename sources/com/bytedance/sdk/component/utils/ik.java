package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private static HashMap<String, ArrayList<String>> ri = new HashMap<>();

    private static Signature[] lr(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList<String> ri(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (ri.get(str) != null) {
                return ri.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : lr(context, packageName)) {
                    String strRi = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        strRi = ri(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        strRi = ri(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strRi = ri(signature, "SHA256");
                    }
                    arrayList.add(strRi);
                }
            } catch (Exception unused) {
            }
            ri.put(str, arrayList);
        }
        return arrayList;
    }

    public static String ri(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayListRi = ri(context, "SHA1");
        if (arrayListRi != null && arrayListRi.size() != 0) {
            for (int i = 0; i < arrayListRi.size(); i++) {
                sb.append(arrayListRi.get(i));
                if (i < arrayListRi.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static String ri(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] bArrDigest = messageDigest.digest(byteArray);
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(Integer.toHexString((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
                    sb.append(":");
                }
                return sb.substring(0, sb.length() - 1).toString();
            }
            return "error!";
        } catch (Exception unused) {
            return "error!";
        }
    }
}
