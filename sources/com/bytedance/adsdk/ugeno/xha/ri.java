package com.bytedance.adsdk.ugeno.xha;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class ri {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.xha.ri$ri, reason: collision with other inner class name */
    public static class C0197ri {
        public float[] ik;
        public int[] lr;
        public GradientDrawable.Orientation ri;
    }

    public static boolean ik(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static GradientDrawable.Orientation ka(String str) {
        try {
            int i = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            if (i == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (i == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            return i == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static C0197ri lr(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            int iRi = ri(strSubstring, '%');
            int iIndexOf = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0197ri c0197ri = new C0197ri();
            c0197ri.ri = ka(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[iRi];
            float[] fArr = new float[iRi];
            for (int i = 0; i < iRi; i++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(" ")) + 1;
                iArr[i] = ri(strTrim.substring(0, iIndexOf3).trim());
                fArr[i] = ik.ri(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / 100.0f;
                int i2 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i2) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i2);
            }
            if (iRi < 2) {
                return null;
            }
            c0197ri.lr = iArr;
            c0197ri.ik = fArr;
            return c0197ri;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int ri(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            i2 = 255;
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static int ri(String str) {
        return ri(str, -16777216);
    }

    public static int ri(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(X3.i.T)) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i2 = 1; i2 < charArray.length; i2++) {
                    sb.append(charArray[i2]);
                    sb.append(charArray[i2]);
                }
                return Color.parseColor(sb.toString());
            }
            if (str.charAt(0) == '#' && str.length() == 7) {
                return Color.parseColor(str);
            }
            if (str.charAt(0) == '#' && str.length() == 9) {
                return Color.parseColor(str);
            }
            if (!str.startsWith("rgba")) {
                return -16777216;
            }
            String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
            if (strArrSplit != null && strArrSplit.length == 4) {
                return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
            }
        }
        return i;
    }

    public static int ri(String str, char c) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }
}
