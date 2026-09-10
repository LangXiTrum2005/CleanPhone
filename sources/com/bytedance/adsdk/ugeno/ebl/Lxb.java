package com.bytedance.adsdk.ugeno.ebl;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class Lxb {

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ebl.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0039Lxb {
        public int[] LD;
        public GradientDrawable.Orientation Lxb;
        public float[] lk;
    }

    public static C0039Lxb LD(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strSubstring = str.substring(str.indexOf("(") + 1, str.lastIndexOf(")"));
        if (TextUtils.isEmpty(strSubstring)) {
            return null;
        }
        int iLxb = Lxb(strSubstring, '%');
        int iIndexOf = strSubstring.indexOf(",");
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        C0039Lxb c0039Lxb = new C0039Lxb();
        c0039Lxb.Lxb = ZU(strSubstring2);
        String strSubstring3 = strSubstring.substring(iIndexOf + 1);
        int[] iArr = new int[iLxb];
        float[] fArr = new float[iLxb];
        for (int i = 0; i < iLxb; i++) {
            int iIndexOf2 = strSubstring3.indexOf("%");
            String strTrim = strSubstring3.substring(0, iIndexOf2 + 1).trim();
            int iIndexOf3 = (strTrim.contains("rgba") ? strTrim.indexOf(")") : strTrim.indexOf(" ")) + 1;
            iArr[i] = Lxb(strTrim.substring(0, iIndexOf3).trim());
            fArr[i] = lk.Lxb(strTrim.substring(iIndexOf3, strTrim.indexOf("%")).trim(), 0.0f) / 100.0f;
            int i2 = iIndexOf2 + 2;
            if (strSubstring3.length() <= i2) {
                break;
            }
            strSubstring3 = strSubstring3.substring(i2);
        }
        c0039Lxb.LD = iArr;
        c0039Lxb.lk = fArr;
        return c0039Lxb;
    }

    public static int Lxb(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            i2 = 255;
        }
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (i2 << 24);
    }

    public static GradientDrawable.Orientation ZU(String str) {
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

    public static boolean lk(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("linear-gradient");
    }

    public static int Lxb(String str) {
        return Lxb(str, ViewCompat.MEASURED_STATE_MASK);
    }

    public static int Lxb(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.equals("transparent")) {
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
            return ViewCompat.MEASURED_STATE_MASK;
        }
        String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (strArrSplit == null || strArrSplit.length != 4) {
            return i;
        }
        return (((int) ((Float.parseFloat(strArrSplit[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(strArrSplit[0])) << 16) | (((int) Float.parseFloat(strArrSplit[1])) << 8) | ((int) Float.parseFloat(strArrSplit[2]));
    }

    public static int Lxb(String str, char c) {
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
