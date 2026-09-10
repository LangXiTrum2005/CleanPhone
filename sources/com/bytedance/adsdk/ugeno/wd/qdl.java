package com.bytedance.adsdk.ugeno.wd;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes.dex */
public class qdl {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.wd.qdl$qdl, reason: collision with other inner class name */
    public static class C0071qdl {
        public float[] lnr;
        public GradientDrawable.Orientation qdl;
        public int[] ud;
    }

    public static boolean lnr(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static GradientDrawable.Orientation mml(String str) {
        try {
            int i2 = str.contains("deg") ? Integer.parseInt(str.substring(0, str.length() - 3).trim()) : Integer.parseInt(str);
            if (i2 == 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i2 == 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i2 == 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            if (i2 == 135) {
                return GradientDrawable.Orientation.TL_BR;
            }
            return i2 == 45 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    public static int qdl(String str) {
        return qdl(str, -16777216);
    }

    public static C0071qdl ud(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
            if (TextUtils.isEmpty(strSubstring)) {
                return null;
            }
            int iQdl = qdl(strSubstring, '%');
            int iIndexOf = strSubstring.indexOf(",");
            String strSubstring2 = strSubstring.substring(0, iIndexOf);
            C0071qdl c0071qdl = new C0071qdl();
            c0071qdl.qdl = mml(strSubstring2);
            String strSubstring3 = strSubstring.substring(iIndexOf + 1);
            int[] iArr = new int[iQdl];
            float[] fArr = new float[iQdl];
            for (int i2 = 0; i2 < iQdl; i2++) {
                int iIndexOf2 = strSubstring3.indexOf("%");
                String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
                int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(" ")) + 1;
                iArr[i2] = qdl(strTrim.substring(0, iIndexOf3).trim());
                fArr[i2] = lnr.qdl(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
                int i3 = iIndexOf2 + 2;
                if (strSubstring3.length() <= i3) {
                    break;
                }
                strSubstring3 = strSubstring3.substring(i3);
            }
            if (iQdl < 2) {
                return null;
            }
            c0071qdl.ud = iArr;
            c0071qdl.lnr = fArr;
            return c0071qdl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int qdl(String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(d9.h.T)) {
                return 0;
            }
            if (str.charAt(0) == '#' && str.length() == 4) {
                StringBuilder sb = new StringBuilder("#");
                char[] charArray = str.toCharArray();
                for (int i3 = 1; i3 < charArray.length; i3++) {
                    sb.append(charArray[i3]);
                    sb.append(charArray[i3]);
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
        return i2;
    }

    public static int qdl(String str, char c2) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str.charAt(i3) == c2) {
                i2++;
            }
        }
        return i2;
    }

    public static int qdl(int i2, int i3) {
        if (i3 < 0 || i3 > 255) {
            Log.e("ColorUtils", "alpha must be between 0 and 255. ");
            i3 = 255;
        }
        return (i2 & 16777215) | (i3 << 24);
    }
}
