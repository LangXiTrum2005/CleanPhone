package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: NotificationParams.java */
/* JADX INFO: loaded from: classes3.dex */
public class polder {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Bundle f22694attabal;

    public polder(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f22694attabal = new Bundle(bundle);
    }

    public static boolean adultoid(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    public static String cord(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static String dovishness(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    public static boolean graveside(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(dovishness("gcm.n.e")));
    }

    public static boolean molybdenite(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static int wireman(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public String apical() {
        return arytenoidectomy("gcm.n.android_channel_id");
    }

    public String arytenoidectomy(String str) {
        return this.f22694attabal.getString(gintrap(str));
    }

    public boolean attabal(String str) {
        String strArytenoidectomy = arytenoidectomy(str);
        return "1".equals(strArytenoidectomy) || Boolean.parseBoolean(strArytenoidectomy);
    }

    public Uri beachfront() {
        String strArytenoidectomy = arytenoidectomy("gcm.n.link_android");
        if (TextUtils.isEmpty(strArytenoidectomy)) {
            strArytenoidectomy = arytenoidectomy("gcm.n.link");
        }
        if (TextUtils.isEmpty(strArytenoidectomy)) {
            return null;
        }
        return Uri.parse(strArytenoidectomy);
    }

    public Object[] competently(String str) {
        JSONArray jSONArrayDern = dern(str + "_loc_args");
        if (jSONArrayDern == null) {
            return null;
        }
        int length = jSONArrayDern.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayDern.optString(i);
        }
        return strArr;
    }

    public Long cutely(String str) {
        String strArytenoidectomy = arytenoidectomy(str);
        if (TextUtils.isEmpty(strArytenoidectomy)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strArytenoidectomy));
        } catch (NumberFormatException unused) {
            cord(str);
            return null;
        }
    }

    public JSONArray dern(String str) {
        String strArytenoidectomy = arytenoidectomy(str);
        if (TextUtils.isEmpty(strArytenoidectomy)) {
            return null;
        }
        try {
            return new JSONArray(strArytenoidectomy);
        } catch (JSONException unused) {
            cord(str);
            return null;
        }
    }

    public Integer formularize() {
        Integer numSaneness = saneness("gcm.n.notification_count");
        if (numSaneness != null && numSaneness.intValue() >= 0) {
            return numSaneness;
        }
        return null;
    }

    public final String gintrap(String str) {
        if (!this.f22694attabal.containsKey(str) && str.startsWith("gcm.n.")) {
            String strDovishness = dovishness(str);
            if (this.f22694attabal.containsKey(strDovishness)) {
                return strDovishness;
            }
        }
        return str;
    }

    public Integer impassible() {
        Integer numSaneness = saneness("gcm.n.notification_priority");
        if (numSaneness != null && numSaneness.intValue() >= -2 && numSaneness.intValue() <= 2) {
            return numSaneness;
        }
        return null;
    }

    public String impromptu(String str) {
        return arytenoidectomy(str + "_loc_key");
    }

    public String kowloon() {
        String strArytenoidectomy = arytenoidectomy("gcm.n.sound2");
        return TextUtils.isEmpty(strArytenoidectomy) ? arytenoidectomy("gcm.n.sound") : strArytenoidectomy;
    }

    public int[] marial() {
        JSONArray jSONArrayDern = dern("gcm.n.light_settings");
        if (jSONArrayDern == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayDern.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = wireman(jSONArrayDern.optString(0));
            iArr[1] = jSONArrayDern.optInt(1);
            iArr[2] = jSONArrayDern.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            jSONArrayDern.toString();
            e.getMessage();
            return null;
        } catch (JSONException unused) {
            jSONArrayDern.toString();
            return null;
        }
    }

    public long[] monoploid() {
        JSONArray jSONArrayDern = dern("gcm.n.vibrate_timings");
        if (jSONArrayDern == null) {
            return null;
        }
        try {
            if (jSONArrayDern.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayDern.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayDern.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            jSONArrayDern.toString();
            return null;
        }
    }

    public Integer polloi() {
        Integer numSaneness = saneness("gcm.n.visibility");
        if (numSaneness != null && numSaneness.intValue() >= -1 && numSaneness.intValue() <= 1) {
            return numSaneness;
        }
        return null;
    }

    public Bundle preprohormone() {
        Bundle bundle = new Bundle(this.f22694attabal);
        for (String str : this.f22694attabal.keySet()) {
            if (adultoid(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle rotuma() {
        Bundle bundle = new Bundle(this.f22694attabal);
        for (String str : this.f22694attabal.keySet()) {
            if (!molybdenite(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Integer saneness(String str) {
        String strArytenoidectomy = arytenoidectomy(str);
        if (TextUtils.isEmpty(strArytenoidectomy)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strArytenoidectomy));
        } catch (NumberFormatException unused) {
            cord(str);
            return null;
        }
    }

    public String taiyuan(Resources resources, String str, String str2) {
        String strImpromptu = impromptu(str2);
        if (TextUtils.isEmpty(strImpromptu)) {
            return null;
        }
        int identifier = resources.getIdentifier(strImpromptu, "string", str);
        if (identifier == 0) {
            cord(str2 + "_loc_key");
            return null;
        }
        Object[] objArrCompetently = competently(str2);
        if (objArrCompetently == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrCompetently);
        } catch (MissingFormatArgumentException unused) {
            cord(str2);
            Arrays.toString(objArrCompetently);
            return null;
        }
    }

    public String triweekly(Resources resources, String str, String str2) {
        String strArytenoidectomy = arytenoidectomy(str2);
        return !TextUtils.isEmpty(strArytenoidectomy) ? strArytenoidectomy : taiyuan(resources, str, str2);
    }
}
