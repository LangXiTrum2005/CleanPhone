package com.smartdigimkt.w6;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class l extends f<m> {
    public static final int V0 = 1;
    public static final int W0 = 2;
    public static final int X0 = 3;
    public static final int Y0 = 4;
    public static final int Z0 = 5;
    public static final int a1 = 6;
    int A0;
    String B0;
    String C0;
    n D0;
    int E0;
    String F0;
    private int G0;
    private int H0;
    private int I0;
    private int J0;
    private String K0;
    private String L0;
    private String M0;
    private String N0;
    private String O0;
    private int P0;
    private int Q0;
    long R0;
    long S0;
    long T0;
    long x0;
    String y0;
    String z0;
    private final String w0 = getClass().getSimpleName();
    String U0 = "";

    public String A0() {
        return this.C0;
    }

    @Override // com.smartdigimkt.w6.f
    public String B() {
        return this.U0;
    }

    public int B0() {
        return this.A0;
    }

    public int C0() {
        return this.J0;
    }

    public int D0() {
        return this.I0;
    }

    public int E0() {
        return this.H0;
    }

    public int F0() {
        return this.G0;
    }

    public String G0() {
        return this.K0;
    }

    public String H0() {
        return this.L0;
    }

    public String I0() {
        return this.N0;
    }

    public int J0() {
        return this.Q0;
    }

    public String K0() {
        return this.O0;
    }

    public int L0() {
        return this.P0;
    }

    public String M0() {
        return this.M0;
    }

    public String N0() {
        return this.z0;
    }

    public String O0() {
        return this.B0;
    }

    public long P0() {
        return this.R0;
    }

    public long Q0() {
        return this.T0;
    }

    public n R0() {
        return this.D0;
    }

    public long S0() {
        return this.x0;
    }

    public String T0() {
        return this.y0;
    }

    public boolean U0() {
        return System.currentTimeMillis() >= this.T0;
    }

    public void W(String str) {
        this.F0 = str;
    }

    public void X(String str) {
        this.C0 = str;
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
        this.R0 = j;
        this.T0 = this.S0 + j;
    }

    public void b0(String str) {
        this.O0 = str;
    }

    public void c0(String str) {
        this.M0 = str;
    }

    public void d(long j) {
        this.S0 = j;
    }

    public void d0(String str) {
        this.z0 = str;
    }

    public void e(long j) {
        this.x0 = j;
    }

    public void e0(String str) {
        this.B0 = str;
    }

    public void f0(String str) {
        this.y0 = str;
    }

    public void p(int i2) {
        this.E0 = i2;
    }

    public void q(int i2) {
        this.A0 = i2;
    }

    public void r(int i2) {
        this.J0 = i2;
    }

    public void s(int i2) {
        this.I0 = i2;
    }

    public void t(int i2) {
        this.H0 = i2;
    }

    public void u(int i2) {
        this.G0 = i2;
    }

    public void v(int i2) {
        this.Q0 = i2;
    }

    public void w(int i2) {
        this.P0 = i2;
    }

    public int y0() {
        return this.E0;
    }

    public String z0() {
        return this.F0;
    }

    public void a(n nVar) {
        this.D0 = nVar;
    }

    public void c(long j) {
        this.T0 = j;
    }

    @Override // com.smartdigimkt.w6.f
    public List<String> a(m mVar, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(mVar.Z() + "", "2") && B0() == 3 && !TextUtils.isEmpty(this.f39498e)) {
            arrayList.add(this.f39498e);
        }
        if (TextUtils.equals(String.valueOf(mVar.Z()), "4") && 1 != B0() && !TextUtils.isEmpty(this.f39498e)) {
            arrayList.add(this.f39498e);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0145  */
    /* JADX WARN: Code duplicated, block: B:78:0x014e  */
    @Override // com.smartdigimkt.w6.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<String> c(m mVar, boolean z2) {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(mVar.Z()), "0") && !TextUtils.isEmpty(this.j)) {
            arrayList.add(this.j);
        }
        if (TextUtils.equals(String.valueOf(mVar.Z()), "1")) {
            if (v0()) {
                z3 = true;
            } else {
                if (!TextUtils.isEmpty(this.f39498e)) {
                    arrayList.add(this.f39498e);
                }
                if (!TextUtils.isEmpty(this.g)) {
                    arrayList.add(this.g);
                    z3 = true;
                } else {
                    stringBuffer.append("full_u,");
                    z3 = false;
                }
            }
            if (!TextUtils.isEmpty(this.j)) {
                arrayList.add(this.j);
            } else {
                if (mVar.X0() != 1 && mVar.W0() <= 0) {
                    stringBuffer.append("video_u,");
                } else if (mVar.W0() != 1) {
                    if (!TextUtils.isEmpty(this.g)) {
                        if (!arrayList.contains(this.g)) {
                            arrayList.add(this.g);
                        }
                    } else {
                        stringBuffer.append("full_u,");
                    }
                }
                z3 = false;
            }
        } else {
            z3 = true;
        }
        if (TextUtils.equals(String.valueOf(mVar.Z()), "3")) {
            if (!v0()) {
                if (!TextUtils.isEmpty(this.f39498e)) {
                    arrayList.add(this.f39498e);
                }
                if (!TextUtils.isEmpty(this.g)) {
                    arrayList.add(this.g);
                } else {
                    stringBuffer.append("full_u,");
                    z3 = false;
                }
            }
            if (r0() && this.o == 1) {
                arrayList.add(this.j);
            }
        }
        if (TextUtils.equals(mVar.Z() + "", "2")) {
            int iB0 = B0();
            if (iB0 != 1) {
                if (iB0 == 2) {
                    if (TextUtils.isEmpty(this.B0)) {
                        stringBuffer.append("img_list,");
                        z3 = false;
                    }
                } else if (iB0 != 3) {
                    if (iB0 == 4) {
                        if (TextUtils.isEmpty(this.B0)) {
                            stringBuffer.append("img_list,");
                            z3 = false;
                        }
                    }
                } else if (TextUtils.isEmpty(this.j)) {
                    if (!TextUtils.isEmpty(this.g)) {
                        arrayList.add(this.g);
                    } else {
                        stringBuffer.append("full_u,");
                        z3 = false;
                    }
                } else {
                    arrayList.add(this.j);
                    if (!TextUtils.isEmpty(this.g)) {
                        arrayList.add(this.g);
                    }
                }
            } else if (TextUtils.isEmpty(this.j)) {
                if (!TextUtils.isEmpty(this.g)) {
                    arrayList.add(this.g);
                } else {
                    stringBuffer.append("full_u,");
                    z3 = false;
                }
            } else {
                arrayList.add(this.j);
                if (!TextUtils.isEmpty(this.g)) {
                    arrayList.add(this.g);
                }
            }
        }
        if (TextUtils.equals(String.valueOf(mVar.Z()), "4")) {
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
        this.U0 = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }

    public boolean a(boolean z2, boolean z3) {
        if (z2) {
            if (z3) {
                return F0() == 1;
            }
            return E0() == 1;
        }
        if (z3) {
            return D0() == 1;
        }
        return C0() == 1;
    }
}
