package com.smartdigimkt.z6;

import android.text.TextUtils;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a extends f<c> {
    public static final int Q0 = 1;
    public static final int R0 = 2;
    private String A0;
    private String B0;
    private String C0;
    private String D0;
    private String E0;
    private String F0;
    public int G0;
    public long H0;
    private long I0;
    private int J0;
    private String K0;
    private String L0;
    private String M0;
    private String N0;
    private String O0;
    String P0 = "";
    private String w0;
    private String x0;
    private String y0;
    private String z0;

    public String A0() {
        return this.L0;
    }

    @Override // com.smartdigimkt.w6.f
    public String B() {
        return this.P0;
    }

    public String B0() {
        return this.N0;
    }

    public int C0() {
        return this.J0;
    }

    public String D0() {
        return this.F0;
    }

    public String E0() {
        return this.D0;
    }

    public String F0() {
        return this.C0;
    }

    public String G0() {
        return this.E0;
    }

    public String H0() {
        return this.w0;
    }

    public int I0() {
        return this.G0;
    }

    public long J0() {
        return this.H0;
    }

    public String K0() {
        return this.O0;
    }

    public long L0() {
        return this.I0;
    }

    public String M0() {
        return this.B0;
    }

    public String N0() {
        return this.y0;
    }

    @Override // com.smartdigimkt.w6.f
    public int O() {
        return 1;
    }

    public String O0() {
        return this.z0;
    }

    public String P0() {
        return this.A0;
    }

    public String Q0() {
        return this.x0;
    }

    public String W(String str) {
        try {
            JSONObject jSONObject = new JSONObject(this.O0);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                str = str.replaceAll("\\{" + next + "\\}", jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public void X(String str) {
        this.M0 = str;
    }

    public void Y(String str) {
        this.K0 = str;
    }

    public void Z(String str) {
        this.L0 = str;
    }

    public void a0(String str) {
        this.N0 = str;
    }

    public void b(long j) {
        this.H0 = j;
    }

    public void b0(String str) {
        this.F0 = str;
    }

    public void c0(String str) {
        this.D0 = str;
    }

    public void d0(String str) {
        this.C0 = str;
    }

    public void e0(String str) {
        this.E0 = str;
    }

    public void f0(String str) {
        this.w0 = str;
    }

    public void g0(String str) {
        this.O0 = str;
    }

    public void h0(String str) {
        this.B0 = str;
    }

    public void i0(String str) {
        this.y0 = str;
    }

    public void j0(String str) {
        this.z0 = str;
    }

    public void k0(String str) {
        this.A0 = str;
    }

    public void l0(String str) {
        this.x0 = str;
    }

    public void p(int i2) {
        this.J0 = i2;
    }

    public void q(int i2) {
        this.G0 = i2;
    }

    public String y0() {
        return this.M0;
    }

    public String z0() {
        return this.K0;
    }

    public boolean b(c cVar) {
        return cVar == null || System.currentTimeMillis() - this.I0 > cVar.B0();
    }

    public void c(long j) {
        this.I0 = j;
    }

    @Override // com.smartdigimkt.w6.f
    public List<String> a(c cVar, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(String.valueOf(cVar.Z()), "2")) {
            String strA = a(cVar);
            if (!TextUtils.isEmpty(strA) && TextUtils.equals(strA, this.g) && !TextUtils.isEmpty(this.f39498e)) {
                arrayList.add(this.f39498e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0149 A[RETURN] */
    @Override // com.smartdigimkt.w6.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<String> c(c cVar, boolean z2) {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(cVar.Z()), "0") && !TextUtils.isEmpty(this.j)) {
            arrayList.add(this.j);
        }
        if (TextUtils.equals(String.valueOf(cVar.Z()), "2")) {
            String strQ = cVar.q();
            if (!TextUtils.isEmpty(this.j)) {
                arrayList.add(this.j);
            }
            String strA = a(cVar);
            if (!TextUtils.isEmpty(strA)) {
                arrayList.add(strA);
            }
            if (arrayList.size() == 0) {
                stringBuffer.append(strQ);
                stringBuffer.append(" url,");
            }
        }
        if (TextUtils.equals(String.valueOf(cVar.Z()), "1")) {
            if (!TextUtils.isEmpty(this.f39498e)) {
                arrayList.add(this.f39498e);
                z3 = true;
            } else {
                stringBuffer.append("icon_u,");
                z3 = false;
            }
            if (!TextUtils.isEmpty(this.g)) {
                arrayList.add(this.g);
            } else {
                stringBuffer.append("full_u,");
                z3 = false;
            }
            if (!TextUtils.isEmpty(this.j)) {
                arrayList.add(this.j);
            } else {
                stringBuffer.append("video_u,");
                z3 = false;
            }
        } else {
            z3 = true;
        }
        if (TextUtils.equals(cVar.Z() + "", "3")) {
            if (!TextUtils.isEmpty(this.f39498e)) {
                arrayList.add(this.f39498e);
            } else {
                stringBuffer.append("icon_u,");
                z3 = false;
            }
            if (!TextUtils.isEmpty(this.g)) {
                arrayList.add(this.g);
            } else {
                stringBuffer.append("full_u,");
                z3 = false;
            }
            if (this.o == 1) {
                if (!TextUtils.isEmpty(this.j)) {
                    arrayList.add(this.j);
                } else {
                    stringBuffer.append("video_u,");
                    z3 = false;
                }
            }
        }
        if (TextUtils.equals(String.valueOf(cVar.Z()), "4")) {
            if (TextUtils.isEmpty(this.j)) {
                if (!TextUtils.isEmpty(this.g)) {
                    arrayList.add(this.g);
                } else {
                    stringBuffer.append("full_u,");
                }
            } else {
                arrayList.add(this.j);
                if (!TextUtils.isEmpty(this.g)) {
                    arrayList.add(this.g);
                }
            }
            if (z3) {
                return arrayList;
            }
        } else if (z3) {
            return arrayList;
        }
        this.P0 = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    @Override // com.smartdigimkt.w6.f
    public String a(c cVar) {
        byte b2;
        if (TextUtils.equals(String.valueOf(cVar.Z()), "2")) {
            String strQ = cVar.q();
            int iHashCode = strQ.hashCode();
            if (iHashCode != -559799608) {
                if (iHashCode != 1507809730) {
                    if (iHashCode != 1507809854) {
                        if (iHashCode == 1622564786 && strQ.equals("728x90")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (strQ.equals("320x90")) {
                        b2 = 0;
                    } else {
                        b2 = -1;
                    }
                } else if (strQ.equals("320x50")) {
                    b2 = 3;
                } else {
                    b2 = -1;
                }
            } else if (strQ.equals("300x250")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
            if (b2 != 0) {
                if (b2 != 1) {
                    if (b2 != 2) {
                        if (!TextUtils.isEmpty(this.K0)) {
                            return this.K0;
                        }
                    } else if (!TextUtils.isEmpty(this.N0)) {
                        return this.N0;
                    }
                } else if (!TextUtils.isEmpty(this.M0)) {
                    return this.M0;
                }
            } else if (!TextUtils.isEmpty(this.L0)) {
                return this.L0;
            }
            return this.g;
        }
        return "";
    }

    public static List<a> a(String str, String str2, long j, c cVar) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                a aVar = new a();
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                aVar.C(jSONObjectOptJSONObject.optString("o_id"));
                aVar.i(jSONObjectOptJSONObject.optString("c_id"));
                aVar.P(jSONObjectOptJSONObject.optString("t"));
                aVar.J(jSONObjectOptJSONObject.optString("p_g"));
                aVar.m(jSONObjectOptJSONObject.optString("d"));
                aVar.s(jSONObjectOptJSONObject.optString("ic_u"));
                aVar.y(jSONObjectOptJSONObject.optString("im_u"));
                aVar.p(jSONObjectOptJSONObject.optString("f_i_u"));
                aVar.c(jSONObjectOptJSONObject.optString("a_c_u"));
                aVar.j(jSONObjectOptJSONObject.optString("c_t"));
                aVar.Q(jSONObjectOptJSONObject.optString("v_u"));
                aVar.b(jSONObjectOptJSONObject.optInt("l_t"));
                aVar.K(jSONObjectOptJSONObject.optString("p_u"));
                aVar.l(jSONObjectOptJSONObject.optString("dl"));
                aVar.h(jSONObjectOptJSONObject.optString("c_u"));
                aVar.f0(jSONObjectOptJSONObject.optString("ip_u"));
                aVar.l0(jSONObjectOptJSONObject.optString("t_u"));
                aVar.i0(jSONObjectOptJSONObject.optString("t_u_25"));
                aVar.j0(jSONObjectOptJSONObject.optString("t_u_50"));
                aVar.k0(jSONObjectOptJSONObject.optString("t_u_75"));
                aVar.h0(jSONObjectOptJSONObject.optString("t_u_100"));
                aVar.d0(jSONObjectOptJSONObject.optString("s_e_c_t_u"));
                aVar.c0(jSONObjectOptJSONObject.optString("c_t_u"));
                aVar.e0(jSONObjectOptJSONObject.optString("ip_n_u"));
                aVar.b0(jSONObjectOptJSONObject.optString("c_n_u"));
                aVar.q(jSONObjectOptJSONObject.optInt("o_a_d_c"));
                aVar.b(jSONObjectOptJSONObject.optLong("o_a_p"));
                aVar.c(j);
                aVar.m(jSONObjectOptJSONObject.optInt("unit_type"));
                aVar.p(jSONObjectOptJSONObject.optInt("c_m"));
                aVar.Y(jSONObjectOptJSONObject.optString("ext_h_pic"));
                aVar.Z(jSONObjectOptJSONObject.optString("ext_big_h_pic"));
                aVar.X(jSONObjectOptJSONObject.optString("ext_rect_h_pic"));
                aVar.a0(jSONObjectOptJSONObject.optString("ext_home_h_pic"));
                aVar.g0(str2);
                aVar.M(jSONObjectOptJSONObject.optString("pub"));
                aVar.g(jSONObjectOptJSONObject.optString("app_vc"));
                aVar.L(jSONObjectOptJSONObject.optString("pvc"));
                aVar.I(jSONObjectOptJSONObject.optString("pms"));
                aVar.b((g) cVar);
                arrayList.add(aVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }
}
