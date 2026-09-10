package com.thinkup.core.o0.m;

import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.a;
import com.p004ironsource.d9;
import com.smartdigimkt.h5.f;
import com.thinkup.core.common.ooo.m00;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class om {
    private static final String m = "UserValueCalculator";
    public static final double o = -1.0d;
    private final oo on;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String[] f42440n = {"MAX", "MIN", "AVG", "SUM", "COUNT"};
    private static final String[] o0 = {d9.i.f24747b, ">", "<", "!=", ">=", "<="};
    private static final String[] oo = {"OR", "AND"};
    private static final String[] om = {"DESC", "ASC"};

    public om(oo ooVar) {
        this.on = ooVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0222 A[ADDED_TO_REGION, Catch: Exception -> 0x0220, REMOVE, TRY_LEAVE, TryCatch #0 {Exception -> 0x0220, blocks: (B:94:0x01fc, B:96:0x020e, B:98:0x0214, B:100:0x021d, B:103:0x0222), top: B:108:0x01fc }] */
    /* JADX WARN: Code duplicated, block: B:11:0x0029 A[Catch: Exception -> 0x001f, TryCatch #1 {Exception -> 0x001f, blocks: (B:4:0x0010, B:6:0x0016, B:11:0x0029, B:12:0x002d, B:15:0x0038, B:17:0x003d, B:19:0x0042), top: B:109:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0038 A[Catch: Exception -> 0x001f, TRY_ENTER, TryCatch #1 {Exception -> 0x001f, blocks: (B:4:0x0010, B:6:0x0016, B:11:0x0029, B:12:0x002d, B:15:0x0038, B:17:0x003d, B:19:0x0042), top: B:109:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[Catch: Exception -> 0x001f, TryCatch #1 {Exception -> 0x001f, blocks: (B:4:0x0010, B:6:0x0016, B:11:0x0029, B:12:0x002d, B:15:0x0038, B:17:0x003d, B:19:0x0042), top: B:109:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x010c A[Catch: Exception -> 0x0118, TRY_LEAVE, TryCatch #4 {Exception -> 0x0118, blocks: (B:56:0x0100, B:58:0x010c), top: B:115:0x0100 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0125 A[Catch: Exception -> 0x013c, TRY_LEAVE, TryCatch #3 {Exception -> 0x013c, blocks: (B:63:0x011c, B:65:0x0125), top: B:113:0x011c }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0146 A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:24:0x006c, B:69:0x0140, B:71:0x0146, B:73:0x014c, B:74:0x0156, B:76:0x0161, B:77:0x0181, B:79:0x0187, B:81:0x018d, B:82:0x0190, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:88:0x01a2, B:89:0x01a5, B:91:0x01c2, B:92:0x01d4, B:68:0x013d, B:50:0x00f2), top: B:117:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0161 A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:24:0x006c, B:69:0x0140, B:71:0x0146, B:73:0x014c, B:74:0x0156, B:76:0x0161, B:77:0x0181, B:79:0x0187, B:81:0x018d, B:82:0x0190, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:88:0x01a2, B:89:0x01a5, B:91:0x01c2, B:92:0x01d4, B:68:0x013d, B:50:0x00f2), top: B:117:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0187 A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:24:0x006c, B:69:0x0140, B:71:0x0146, B:73:0x014c, B:74:0x0156, B:76:0x0161, B:77:0x0181, B:79:0x0187, B:81:0x018d, B:82:0x0190, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:88:0x01a2, B:89:0x01a5, B:91:0x01c2, B:92:0x01d4, B:68:0x013d, B:50:0x00f2), top: B:117:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:81:0x018d A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:24:0x006c, B:69:0x0140, B:71:0x0146, B:73:0x014c, B:74:0x0156, B:76:0x0161, B:77:0x0181, B:79:0x0187, B:81:0x018d, B:82:0x0190, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:88:0x01a2, B:89:0x01a5, B:91:0x01c2, B:92:0x01d4, B:68:0x013d, B:50:0x00f2), top: B:117:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0199 A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:24:0x006c, B:69:0x0140, B:71:0x0146, B:73:0x014c, B:74:0x0156, B:76:0x0161, B:77:0x0181, B:79:0x0187, B:81:0x018d, B:82:0x0190, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:88:0x01a2, B:89:0x01a5, B:91:0x01c2, B:92:0x01d4, B:68:0x013d, B:50:0x00f2), top: B:117:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:87:0x019f A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:24:0x006c, B:69:0x0140, B:71:0x0146, B:73:0x014c, B:74:0x0156, B:76:0x0161, B:77:0x0181, B:79:0x0187, B:81:0x018d, B:82:0x0190, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:88:0x01a2, B:89:0x01a5, B:91:0x01c2, B:92:0x01d4, B:68:0x013d, B:50:0x00f2), top: B:117:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2 A[Catch: Exception -> 0x00f6, TryCatch #5 {Exception -> 0x00f6, blocks: (B:24:0x006c, B:69:0x0140, B:71:0x0146, B:73:0x014c, B:74:0x0156, B:76:0x0161, B:77:0x0181, B:79:0x0187, B:81:0x018d, B:82:0x0190, B:83:0x0193, B:85:0x0199, B:87:0x019f, B:88:0x01a2, B:89:0x01a5, B:91:0x01c2, B:92:0x01d4, B:68:0x013d, B:50:0x00f2), top: B:117:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x020e A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:94:0x01fc, B:96:0x020e, B:98:0x0214, B:100:0x021d, B:103:0x0222), top: B:108:0x01fc }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0214 A[Catch: Exception -> 0x0220, TryCatch #0 {Exception -> 0x0220, blocks: (B:94:0x01fc, B:96:0x020e, B:98:0x0214, B:100:0x021d, B:103:0x0222), top: B:108:0x01fc }] */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0125, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x01c2, please report this as an issue */
    public final double o(int i2, String str) {
        JSONObject jSONObject;
        double d;
        JSONObject jSONObject2;
        int i3;
        String strConcat;
        String str2;
        String string;
        JSONArray jSONArrayOptJSONArray;
        char c2;
        char c3;
        String strConcat2;
        String strConcat3;
        StringBuilder sb;
        String string2;
        String str3;
        double[] dArrO;
        double d2;
        double d3;
        int iOptInt;
        String strOptString;
        int iOptInt2;
        String[] strArr;
        com.thinkup.core.oo.m mVarH = a.h(a.i());
        if (mVarH == null) {
            jSONObject = null;
            if (jSONObject == null) {
                jSONObject = o();
            }
            jSONObject2 = jSONObject;
            i3 = jSONObject2.getInt(f.j);
            strConcat = "";
            if (i3 >= 0) {
                strArr = f42440n;
                if (i3 < strArr.length) {
                    str2 = strArr[i3];
                } else {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            string = jSONObject2.getString("q_f");
            jSONArrayOptJSONArray = jSONObject2.optJSONArray("w_c_f");
            JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("w_c_o");
            JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("w_c_v");
            JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("w_o");
            d = -1.0d;
            if (jSONArrayOptJSONArray != null) {
                c2 = 1;
                c3 = 0;
                strConcat2 = "";
                strOptString = jSONObject2.optString("o_f");
                if (TextUtils.isEmpty(strOptString)) {
                    strConcat3 = "";
                } else {
                    strConcat3 = "ORDER BY ".concat(String.valueOf(strOptString));
                }
                iOptInt2 = jSONObject2.optInt("o", -1);
                if (iOptInt2 != -1) {
                    strConcat3 = strConcat3 + " " + om[iOptInt2];
                }
                if (!jSONObject2.isNull("l")) {
                    strConcat = "LIMIT ".concat(String.valueOf(iOptInt));
                }
                sb = new StringBuilder();
                if (!TextUtils.isEmpty(strConcat2)) {
                    sb.append(strConcat2);
                    sb.append(" ");
                    sb.append("AND ");
                    sb.append("placement_id");
                    sb.append(d9.i.f24747b);
                    sb.append("'");
                    sb.append(str);
                    sb.append("'");
                }
                if (!TextUtils.isEmpty(strConcat3)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(strConcat3);
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(strConcat);
                }
                string2 = sb.toString();
                str3 = "SELECT " + string + " FROM user_value_placement";
                if (!TextUtils.isEmpty(string2)) {
                    str3 = str3 + " " + string2;
                }
                dArrO = this.on.o(new String[]{str2 + "(" + string + ")", "count(*)"}, "(" + str3 + ")");
                d2 = dArrO[c2];
                if (d2 <= 0.0d) {
                    return -1.0d;
                }
                if (!jSONObject2.isNull("l")) {
                    d3 = dArrO[c3];
                } else {
                    d3 = dArrO[c3];
                }
                return d3;
            }
            c2 = 1;
            c3 = 0;
            strConcat2 = "";
            strOptString = jSONObject2.optString("o_f");
            if (TextUtils.isEmpty(strOptString)) {
                strConcat3 = "ORDER BY ".concat(String.valueOf(strOptString));
            } else {
                strConcat3 = "";
            }
            iOptInt2 = jSONObject2.optInt("o", -1);
            if (iOptInt2 != -1) {
                strConcat3 = strConcat3 + " " + om[iOptInt2];
            }
            if (!jSONObject2.isNull("l")) {
                strConcat = "LIMIT ".concat(String.valueOf(iOptInt));
            }
            sb = new StringBuilder();
            if (!TextUtils.isEmpty(strConcat2)) {
                sb.append(strConcat2);
                sb.append(" ");
                sb.append("AND ");
                sb.append("placement_id");
                sb.append(d9.i.f24747b);
                sb.append("'");
                sb.append(str);
                sb.append("'");
            }
            if (!TextUtils.isEmpty(strConcat3)) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(strConcat3);
            }
            if (!TextUtils.isEmpty(strConcat)) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(strConcat);
            }
            string2 = sb.toString();
            str3 = "SELECT " + string + " FROM user_value_placement";
            if (!TextUtils.isEmpty(string2)) {
                str3 = str3 + " " + string2;
            }
            dArrO = this.on.o(new String[]{str2 + "(" + string + ")", "count(*)"}, "(" + str3 + ")");
            d2 = dArrO[c2];
            if (d2 <= 0.0d) {
                return -1.0d;
            }
            if (!jSONObject2.isNull("l")) {
                d3 = dArrO[c3];
            } else {
                d3 = dArrO[c3];
            }
            return d3;
        }
        try {
            JSONObject jSONObjectMno = mVarH.mno();
            if (jSONObjectMno != null) {
                jSONObject = jSONObjectMno.getJSONObject(String.valueOf(i2));
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = o();
            }
            jSONObject2 = jSONObject;
            i3 = jSONObject2.getInt(f.j);
            strConcat = "";
            if (i3 >= 0) {
                strArr = f42440n;
                if (i3 < strArr.length) {
                    str2 = strArr[i3];
                } else {
                    str2 = "";
                }
            } else {
                str2 = "";
            }
            string = jSONObject2.getString("q_f");
            jSONArrayOptJSONArray = jSONObject2.optJSONArray("w_c_f");
            JSONArray jSONArrayOptJSONArray5 = jSONObject2.optJSONArray("w_c_o");
            JSONArray jSONArrayOptJSONArray6 = jSONObject2.optJSONArray("w_c_v");
            JSONArray jSONArrayOptJSONArray7 = jSONObject2.optJSONArray("w_o");
            d = -1.0d;
            if (jSONArrayOptJSONArray != null || jSONArrayOptJSONArray5 == null || jSONArrayOptJSONArray6 == null) {
                c2 = 1;
                c3 = 0;
                strConcat2 = "";
                try {
                    strOptString = jSONObject2.optString("o_f");
                    if (TextUtils.isEmpty(strOptString)) {
                        strConcat3 = "ORDER BY ".concat(String.valueOf(strOptString));
                    } else {
                        strConcat3 = "";
                    }
                    try {
                        iOptInt2 = jSONObject2.optInt("o", -1);
                        if (iOptInt2 != -1) {
                            strConcat3 = strConcat3 + " " + om[iOptInt2];
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.getMessage();
                    }
                } catch (Exception e3) {
                    e = e3;
                    strConcat3 = "";
                }
                if (!jSONObject2.isNull("l") && (iOptInt = jSONObject2.optInt("l")) > 0) {
                    strConcat = "LIMIT ".concat(String.valueOf(iOptInt));
                }
                sb = new StringBuilder();
                if (!TextUtils.isEmpty(strConcat2)) {
                    sb.append(strConcat2);
                    sb.append(" ");
                    sb.append("AND ");
                    sb.append("placement_id");
                    sb.append(d9.i.f24747b);
                    sb.append("'");
                    sb.append(str);
                    sb.append("'");
                }
                if (!TextUtils.isEmpty(strConcat3)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(strConcat3);
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    if (sb.length() > 0) {
                        sb.append(" ");
                    }
                    sb.append(strConcat);
                }
                string2 = sb.toString();
                str3 = "SELECT " + string + " FROM user_value_placement";
                if (!TextUtils.isEmpty(string2)) {
                    str3 = str3 + " " + string2;
                }
                try {
                    dArrO = this.on.o(new String[]{str2 + "(" + string + ")", "count(*)"}, "(" + str3 + ")");
                    d2 = dArrO[c2];
                    if (d2 <= 0.0d) {
                        return -1.0d;
                    }
                    if (!jSONObject2.isNull("l") && d2 < jSONObject2.optInt("l")) {
                        return -1.0d;
                    }
                    d3 = dArrO[c3];
                    return d3;
                } catch (Exception e4) {
                    e = e4;
                }
            } else {
                try {
                    if (jSONArrayOptJSONArray.length() > 0) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            c2 = 1;
                            int i4 = 0;
                            c3 = 0;
                            while (i4 < jSONArrayOptJSONArray.length()) {
                                try {
                                    String string3 = jSONArrayOptJSONArray.getString(i4);
                                    int i5 = jSONArrayOptJSONArray5.getInt(i4);
                                    JSONArray jSONArray = jSONArrayOptJSONArray;
                                    String string4 = jSONArrayOptJSONArray6.getString(i4);
                                    sb2.append(string3);
                                    sb2.append(o0[i5]);
                                    if (m00.o((CharSequence) string4) || string4.startsWith("strftime")) {
                                        sb2.append(string4);
                                    } else {
                                        sb2.append("'");
                                        sb2.append(string4);
                                        sb2.append("'");
                                    }
                                    if (i4 != jSONArray.length() - 1 && jSONArrayOptJSONArray7 != null && i4 < jSONArrayOptJSONArray7.length()) {
                                        int i6 = jSONArrayOptJSONArray7.getInt(i4);
                                        sb2.append(" ");
                                        sb2.append(oo[i6]);
                                        sb2.append(" ");
                                    }
                                    i4++;
                                    jSONArrayOptJSONArray = jSONArray;
                                } catch (Exception e5) {
                                    e = e5;
                                    e.getMessage();
                                    strConcat2 = "";
                                }
                            }
                            strConcat2 = "WHERE ".concat(String.valueOf(sb2));
                        } catch (Exception e6) {
                            e = e6;
                            c2 = 1;
                            c3 = 0;
                        }
                        strOptString = jSONObject2.optString("o_f");
                        if (TextUtils.isEmpty(strOptString)) {
                            strConcat3 = "ORDER BY ".concat(String.valueOf(strOptString));
                        } else {
                            strConcat3 = "";
                        }
                        iOptInt2 = jSONObject2.optInt("o", -1);
                        if (iOptInt2 != -1) {
                            strConcat3 = strConcat3 + " " + om[iOptInt2];
                        }
                        if (!jSONObject2.isNull("l")) {
                            strConcat = "LIMIT ".concat(String.valueOf(iOptInt));
                        }
                        sb = new StringBuilder();
                        if (!TextUtils.isEmpty(strConcat2)) {
                            sb.append(strConcat2);
                            sb.append(" ");
                            sb.append("AND ");
                            sb.append("placement_id");
                            sb.append(d9.i.f24747b);
                            sb.append("'");
                            sb.append(str);
                            sb.append("'");
                        }
                        if (!TextUtils.isEmpty(strConcat3)) {
                            if (sb.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(strConcat3);
                        }
                        if (!TextUtils.isEmpty(strConcat)) {
                            if (sb.length() > 0) {
                                sb.append(" ");
                            }
                            sb.append(strConcat);
                        }
                        string2 = sb.toString();
                        str3 = "SELECT " + string + " FROM user_value_placement";
                        if (!TextUtils.isEmpty(string2)) {
                            str3 = str3 + " " + string2;
                        }
                        dArrO = this.on.o(new String[]{str2 + "(" + string + ")", "count(*)"}, "(" + str3 + ")");
                        d2 = dArrO[c2];
                        if (d2 <= 0.0d) {
                            return -1.0d;
                        }
                        if (!jSONObject2.isNull("l")) {
                            d3 = dArrO[c3];
                        } else {
                            d3 = dArrO[c3];
                        }
                        return d3;
                    }
                    c2 = 1;
                    c3 = 0;
                    strConcat2 = "";
                    strOptString = jSONObject2.optString("o_f");
                    if (TextUtils.isEmpty(strOptString)) {
                        strConcat3 = "ORDER BY ".concat(String.valueOf(strOptString));
                    } else {
                        strConcat3 = "";
                    }
                    iOptInt2 = jSONObject2.optInt("o", -1);
                    if (iOptInt2 != -1) {
                        strConcat3 = strConcat3 + " " + om[iOptInt2];
                    }
                    if (!jSONObject2.isNull("l")) {
                        strConcat = "LIMIT ".concat(String.valueOf(iOptInt));
                    }
                    sb = new StringBuilder();
                    if (!TextUtils.isEmpty(strConcat2)) {
                        sb.append(strConcat2);
                        sb.append(" ");
                        sb.append("AND ");
                        sb.append("placement_id");
                        sb.append(d9.i.f24747b);
                        sb.append("'");
                        sb.append(str);
                        sb.append("'");
                    }
                    if (!TextUtils.isEmpty(strConcat3)) {
                        if (sb.length() > 0) {
                            sb.append(" ");
                        }
                        sb.append(strConcat3);
                    }
                    if (!TextUtils.isEmpty(strConcat)) {
                        if (sb.length() > 0) {
                            sb.append(" ");
                        }
                        sb.append(strConcat);
                    }
                    string2 = sb.toString();
                    str3 = "SELECT " + string + " FROM user_value_placement";
                    if (!TextUtils.isEmpty(string2)) {
                        str3 = str3 + " " + string2;
                    }
                    dArrO = this.on.o(new String[]{str2 + "(" + string + ")", "count(*)"}, "(" + str3 + ")");
                    d2 = dArrO[c2];
                    if (d2 <= 0.0d) {
                        return -1.0d;
                    }
                    if (!jSONObject2.isNull("l")) {
                        d3 = dArrO[c3];
                    } else {
                        d3 = dArrO[c3];
                    }
                    return d3;
                } catch (Exception e7) {
                    e = e7;
                }
            }
        } catch (Exception e8) {
            e = e8;
            d = -1.0d;
        }
        e.getMessage();
        return d;
    }

    private static JSONObject o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f.j, 2);
            jSONObject.put("q_f", "price");
            JSONArray jSONArray = new JSONArray();
            jSONArray.put("type");
            jSONObject.put("w_c_f", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(0);
            jSONObject.put("w_c_o", jSONArray2);
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.put("4");
            jSONObject.put("w_c_v", jSONArray3);
            jSONObject.put("o_f", oo.o.mo);
            jSONObject.put("o", 0);
            jSONObject.put("l", 3);
            return jSONObject;
        } catch (JSONException e2) {
            e2.getMessage();
            return jSONObject;
        }
    }
}
