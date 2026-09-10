package com.thinkup.core.common.on;

import android.text.TextUtils;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class omn {
    static final String m = "hasShow";
    static final String m0 = "tpBidId";
    static final String mm = "deal_id";
    static final String mn = "deal_pri";
    static final String mo = "deal_type";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final String f42244n = "hasClick";
    private static String n0 = "omn";
    static final String o = "reqId";
    static final String o0 = "price";
    static final String om = "isHB";
    static final String on = "adsListType";
    static final String oo = "networkFirmId";
    private final String nm;
    private boolean nn;
    private boolean no;
    private boolean o00;
    private o0mm o0m;
    private int o0n;
    private o0mm o0o;
    private String om0;
    private int omm;
    private String omo;
    private double oo0;
    private int oom;
    private String oon;
    private boolean ooo;

    public omn(String str) {
        this.nm = str;
    }

    private boolean no() {
        return this.no;
    }

    private static int o(int i2) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4 || i2 == 5) {
                    return 4;
                }
                if (i2 != 7) {
                    if (i2 != 8 && i2 != 11) {
                        return 1;
                    }
                }
            }
            return 2;
        }
        return 3;
    }

    public final synchronized void m(o0mm o0mmVar) {
        Objects.toString(o0mmVar);
        this.o0m = o0mmVar;
    }

    public final String m0() {
        double dO;
        int i2;
        int i3;
        int iO;
        String str;
        String str2;
        String strOoo;
        String strOo0;
        JSONObject jSONObject = new JSONObject();
        try {
            boolean z2 = this.nn;
            int iOom = 0;
            boolean z3 = this.o00;
            if (this.no) {
                dO = this.oo0;
                i3 = this.o0n;
                iO = o(this.oom);
                str = this.oon;
                str2 = this.om0;
                strOoo = this.omo;
                i2 = this.omm;
            } else {
                dO = com.thinkup.core.common.ooo.nn.o(this.o0o);
                int iNm = this.o0o.nm();
                on0 on0VarN0n = this.o0o.n0n();
                int iO2 = o(this.o0o.mn());
                String str3 = (on0VarN0n == null || TextUtils.isEmpty(on0VarN0n.on)) ? "" : on0VarN0n.on;
                if (on0VarN0n != null) {
                    if (TextUtils.isEmpty(on0VarN0n.oo0())) {
                        strOo0 = "";
                    } else {
                        strOo0 = on0VarN0n.oo0();
                        iOom = on0VarN0n.oom();
                    }
                    if (TextUtils.isEmpty(on0VarN0n.ooo())) {
                        String str4 = strOo0;
                        i2 = iOom;
                        i3 = iNm;
                        iO = iO2;
                        str2 = str4;
                        str = str3;
                        strOoo = "";
                    } else {
                        String str5 = strOo0;
                        i2 = iOom;
                        i3 = iNm;
                        iO = iO2;
                        str2 = str5;
                        String str6 = str3;
                        strOoo = on0VarN0n.ooo();
                        str = str6;
                    }
                } else {
                    i2 = 0;
                    i3 = iNm;
                    iO = iO2;
                    str = str3;
                    str2 = "";
                    strOoo = str2;
                }
            }
            jSONObject.put("price", dO);
            jSONObject.put(oo, i3);
            jSONObject.put("demandType", iO);
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("tp_bid_id", str);
            }
            jSONObject.put("imp", z2 ? 1 : 0);
            jSONObject.put("click", z3 ? 1 : 0);
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put(mo, str2);
                jSONObject.put(mn, i2);
            }
            if (!TextUtils.isEmpty(strOoo)) {
                jSONObject.put(mm, strOoo);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final double mm() {
        if (this.no) {
            return this.oo0;
        }
        o0mm o0mmVar = this.o0o;
        if (o0mmVar != null) {
            return com.thinkup.core.common.ooo.nn.o(o0mmVar);
        }
        return -1.0d;
    }

    public final int mn() {
        if (this.no) {
            return this.o0n;
        }
        o0mm o0mmVar = this.o0o;
        if (o0mmVar != null) {
            return o0mmVar.nm();
        }
        return 0;
    }

    public final synchronized JSONObject mo() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put(o, this.nm);
            jSONObject.put(m, this.nn);
            jSONObject.put(f42244n, this.o00);
            o0mm o0mmVar = this.o0o;
            if (o0mmVar != null) {
                jSONObject.put("price", com.thinkup.core.common.ooo.nn.o(o0mmVar));
                jSONObject.put(oo, this.o0o.nm());
                jSONObject.put(om, this.o0o.oom());
                jSONObject.put(on, this.o0o.mn());
                on0 on0VarN0n = this.o0o.n0n();
                if (on0VarN0n != null && !TextUtils.isEmpty(on0VarN0n.on)) {
                    jSONObject.put(m0, on0VarN0n.on);
                }
                if (on0VarN0n != null) {
                    if (!TextUtils.isEmpty(on0VarN0n.oo0())) {
                        jSONObject.put(mo, on0VarN0n.oo0());
                        jSONObject.put(mn, on0VarN0n.oom());
                    }
                    if (!TextUtils.isEmpty(on0VarN0n.ooo())) {
                        jSONObject.put(mm, on0VarN0n.ooo());
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    public final String n() {
        return this.nm;
    }

    public final boolean n0() {
        if (this.no) {
            return this.ooo;
        }
        o0mm o0mmVar = this.o0o;
        if (o0mmVar != null) {
            return o0mmVar.oom();
        }
        return false;
    }

    public final void o0() {
        this.nn = true;
    }

    public final boolean om() {
        return this.nn;
    }

    public final boolean on() {
        return this.o00;
    }

    public final void oo() {
        this.o00 = true;
    }

    public String toString() {
        String str;
        if (this.no) {
            str = ", priceInDisk=" + this.oo0 + ", networkFirmIdInDisk=" + this.o0n + ", winnerIsHBInDisk=" + this.ooo + ", adsListTypeInDisk=" + this.oom + ", tpBidIdInDisk=" + this.oon + ", pmpTypeStringInDisk=" + this.om0 + ", pmpOrderIdInDisk=" + this.omo + ", pmpPriorityInDisk=" + this.omm;
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder("BiddingRecorder{fromLocalDisk=");
        sb.append(this.no);
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", requestId=");
        sb.append(this.nm);
        sb.append(", hasShow=");
        sb.append(this.nn);
        sb.append(", hasClick=");
        sb.append(this.o00);
        sb.append(", loadedMaxPriceUgInMemory=");
        sb.append(this.o0o);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public final synchronized void o(o0mm o0mmVar) {
        Objects.toString(o0mmVar);
        this.o0o = o0mmVar;
    }

    public final synchronized o0mm m() {
        return this.o0m;
    }

    public final synchronized o0mm o() {
        return this.o0o;
    }

    public static omn o(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            omn omnVar = new omn(jSONObject.getString(o));
            omnVar.no = true;
            omnVar.nn = jSONObject.optBoolean(m);
            omnVar.o00 = jSONObject.optBoolean(f42244n);
            omnVar.oo0 = jSONObject.optDouble("price", -1.0d);
            omnVar.o0n = jSONObject.optInt(oo);
            omnVar.ooo = jSONObject.optBoolean(om);
            omnVar.oom = jSONObject.optInt(on);
            omnVar.oon = jSONObject.optString(m0);
            omnVar.om0 = jSONObject.optString(mo, "");
            omnVar.omo = jSONObject.optString(mm, "");
            omnVar.omm = jSONObject.optInt(mn, 0);
            return omnVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
