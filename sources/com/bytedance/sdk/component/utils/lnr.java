package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.inmobi.commons.core.configs.AdConfig;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class lnr {
    private static HashMap<String, ArrayList<String>> qdl = new HashMap<>();

    public static ArrayList<String> qdl(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (qdl.get(str) != null) {
                return qdl.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : ud(context, packageName)) {
                    String strQdl = "error!";
                    if ("MD5".equals(str)) {
                        strQdl = qdl(signature, "MD5");
                    } else if ("SHA1".equals(str)) {
                        strQdl = qdl(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strQdl = qdl(signature, "SHA256");
                    }
                    arrayList.add(strQdl);
                }
            } catch (Exception unused) {
            }
            qdl.put(str, arrayList);
        }
        return arrayList;
    }

    private static Signature[] ud(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String qdl(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayListQdl = qdl(context, "SHA1");
        if (arrayListQdl != null && arrayListQdl.size() != 0) {
            for (int i2 = 0; i2 < arrayListQdl.size(); i2++) {
                sb.append(arrayListQdl.get(i2));
                if (i2 < arrayListQdl.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    private static String qdl(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest != null) {
                byte[] bArrDigest = messageDigest.digest(byteArray);
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(Integer.toHexString((b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | 256).substring(1, 3).toUpperCase());
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
