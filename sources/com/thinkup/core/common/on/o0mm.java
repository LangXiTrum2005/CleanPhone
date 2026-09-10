package com.thinkup.core.common.on;

import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUAdAppInfo;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdRequest;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class o0mm implements Comparable<o0mm> {
    public static final int om0 = 1;
    public static final int oom = 2;
    public static final int oon = 3;
    public static final int ooo = 1;
    double m0;
    private String m00;
    private int m000;
    private int m00m;
    private int m00n;
    private long m00o;
    private String m0m;
    private String m0m0;
    private double m0mo;
    private String m0n;
    private Map<String, Object> m0o;
    private com.thinkup.core.common.n.ooo m0o0;
    private long m0om;
    private on0 m0oo;
    double mm;
    private double mm0;
    private String mmm;
    private String mmn;
    private int mmo;
    String mn;
    private int mn0;
    private long mnm;
    private long mnn;
    private long mno;
    int mo;
    private long mo0;
    private int mom;
    private int mon;
    private String moo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f42231n;
    protected int n0;
    private long n00;
    private String n0m;
    private long n0n;
    private int n0o;
    int nm;
    private int nm0;
    private int nmm;
    private String nmn;
    private int nmo;
    int nn;
    private long nn0;
    private double nnm;
    private int nnn;
    private long nno;
    int no;
    private long no0;
    private long nom;
    private int non;
    private long noo;
    int o;
    int o0;
    private int o000;
    private int o00m;
    private int o00n;
    private int o00o;
    private String o0m0;
    private int o0mm;
    private long o0mn;
    private int o0mo;
    String o0n;
    private mm o0n0;
    private long o0nm;
    private long o0nn;
    private long o0no;
    private int o0o0;
    private int o0om;
    private int o0on;
    private on0 o0oo;
    int om;
    private double om00;
    private int om0m;
    private int om0n;
    private JSONObject om0o;
    double omm;
    private long omm0;
    private int ommm;
    private long ommn;
    private omo ommo;
    public String omn;
    private int omn0;
    private String omnm;
    private JSONArray omnn;
    private int omno;
    TUAdRequest omo;
    private Map<String, Object> omo0;
    private int omon;
    private mm0 omoo;
    int on;
    private int on0;
    private JSONArray on00;
    private int on0m;
    private JSONArray on0n;
    private JSONArray on0o;
    private int onm;
    private long onm0;
    private int onmm;
    private int onmn;
    private int onmo;
    private int onn;
    private String onn0;
    private int onnm;
    private int onnn;
    private int onno;
    private String ono;
    private JSONArray ono0;
    private long onom;
    private double onon;
    private int onoo;
    String oo;
    long oo0;
    private String oo00;
    private int oo0m;
    private JSONArray oom0;
    private int oomn;
    private int oomo;
    private int oon0;
    private int oonm;
    private double oonn;
    private int oono;
    private int[] oooo;
    private int oo0o = 1;
    int m = 0;
    private int oo0n = -1;
    private TUAdConst.CURRENCY ooo0 = TUAdConst.CURRENCY.USD;
    int o00 = 2;
    boolean o0o = false;
    double o0m = -1.0d;
    private int ooom = 1;
    private int ooon = 1;
    private int oomm = 1;
    private int omom = 2;
    private int m0on = 0;

    public o0mm(int i2) {
        this.o0mm = i2;
    }

    private long m0mm() {
        return this.n0n;
    }

    private int m0mn() {
        return this.nmo;
    }

    private TUAdRequest m0mo() {
        return this.omo;
    }

    private int m0n0() {
        return this.nnn;
    }

    private String m0nm() {
        return this.oo;
    }

    private boolean m0nn() {
        return this.ooon == 1;
    }

    private int m0no() {
        return this.oo0m;
    }

    private boolean mo00() {
        return com.thinkup.core.common.ooo.nn.o0(this.o0mm);
    }

    private String mo0m() {
        return this.omn;
    }

    private String mo0o() {
        return this.omnm;
    }

    private void nn0(int i2) {
        this.nmo = i2;
    }

    private void nno(int i2) {
        this.o0om = i2;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(o0mm o0mmVar) {
        return com.thinkup.core.common.ooo.mn.o(this, o0mmVar);
    }

    public final long m() {
        return this.o0nm;
    }

    public final long m0() {
        return this.m00o;
    }

    public final long m00() {
        return this.mo0;
    }

    public final boolean m000() {
        on0 on0Var = this.o0oo;
        if (on0Var != null) {
            return on0Var.o0m();
        }
        return false;
    }

    public final String m00m() {
        on0 on0Var = this.o0oo;
        return on0Var != null ? on0Var.oon() : "";
    }

    public final String m00n() {
        on0 on0Var = this.o0oo;
        return on0Var != null ? on0Var.getOriginRequestId() : "";
    }

    public final int m00o() {
        return this.oo0o;
    }

    public final String m0m() {
        return this.moo;
    }

    public final mm m0m0() {
        return this.o0n0;
    }

    public final int m0n() {
        return this.mom;
    }

    public final String m0o() {
        return this.n0m;
    }

    public final long m0o0() {
        return this.m0om;
    }

    public final double m0om() {
        return this.m0mo;
    }

    public final String m0on() {
        return this.m0m0;
    }

    public final int m0oo() {
        return this.m0on;
    }

    public final double mm() {
        return this.omm;
    }

    public final long mm0() {
        return this.no0;
    }

    public final int mmm() {
        return this.non;
    }

    public final int mmn() {
        return this.nm0;
    }

    public final long mmo() {
        return this.noo;
    }

    public final int mn() {
        return this.o0mm;
    }

    public final int mn0() {
        return this.nmm;
    }

    public final long mnm() {
        return this.nn0;
    }

    public final long mnn() {
        return this.nno;
    }

    public final String mno() {
        return this.nmn;
    }

    public final int mo() {
        return this.m00m;
    }

    public final int mo0() {
        return this.mon;
    }

    public final String mom() {
        return this.mmm;
    }

    public final String mon() {
        return this.mmn;
    }

    public final double moo() {
        return this.mm0;
    }

    public final long n() {
        return this.o0nn;
    }

    public final int n0() {
        return this.o00n;
    }

    public final double n00() {
        return this.nnm;
    }

    public final boolean n0m() {
        return this.o00o == 2;
    }

    public final on0 n0n() {
        return this.o0oo;
    }

    public final int n0o() {
        return this.o000;
    }

    public final int nm() {
        return this.on0;
    }

    public final String nm0() {
        return this.o0m0;
    }

    public final String nmm() {
        return this.oo00;
    }

    public final int nmn() {
        int i2 = this.m;
        if (i2 <= 0) {
            return 1;
        }
        return i2;
    }

    public final long nmo() {
        return this.o0mn;
    }

    public final String nn() {
        return this.ono;
    }

    public final int nnm() {
        return this.o;
    }

    public final int nnn() {
        return this.oo0n;
    }

    public final void no() {
        this.o00n = -1;
    }

    public final on0 no0() {
        return this.m0oo;
    }

    public final int nom() {
        return this.o0on;
    }

    public final void non() {
        this.o0on = 1;
    }

    public final int noo() {
        return this.o0om;
    }

    public final long o() {
        return this.o0no;
    }

    public final com.thinkup.core.common.n.ooo o0() {
        return this.m0o0;
    }

    public final int o00() {
        return this.onm;
    }

    public final int o000() {
        int i2;
        on0 on0Var = this.o0oo;
        return (on0Var == null || (i2 = on0Var.nm) == 0) ? this.om : i2;
    }

    public final int o00m() {
        return this.onmm;
    }

    public final int o00n() {
        return this.onmn;
    }

    public final int o00o() {
        return this.onmo;
    }

    public final String o0m() {
        return this.m00;
    }

    public final boolean o0m0() {
        return this.on0 == 1 && this.o0o0 == 1;
    }

    public final TUAdConst.CURRENCY o0mm() {
        return this.ooo0;
    }

    public final int o0mn() {
        return this.on;
    }

    public final int o0mo() {
        return this.o0mo;
    }

    public final Map<String, Object> o0n() {
        return this.m0o;
    }

    public final double o0n0() {
        return this.m0;
    }

    public final double o0nm() {
        return this.mm;
    }

    public final String o0nn() {
        return this.mn;
    }

    public final int o0no() {
        return this.mo;
    }

    public final int o0o() {
        return this.onn;
    }

    public final String o0o0() {
        return this.onn0;
    }

    public final int o0om() {
        return this.onnm;
    }

    public final boolean o0on() {
        int i2 = this.on0;
        return i2 == 66 || i2 == 67;
    }

    public final int o0oo() {
        return this.onno;
    }

    public final int om() {
        return this.m000;
    }

    @Deprecated
    public final int om0() {
        return this.o0o0;
    }

    public final int om00() {
        return this.oomn;
    }

    public final int om0m() {
        return this.oono;
    }

    public final int om0n() {
        return this.oonm;
    }

    public final int om0o() {
        return this.oon0;
    }

    public final long omm() {
        return this.nom;
    }

    public final int omm0() {
        return this.om0n;
    }

    public final boolean ommm() {
        return com.thinkup.core.common.ooo.nn.n(this.o0mm);
    }

    public final mm0 ommn() {
        return this.omoo;
    }

    public final boolean ommo() {
        return com.thinkup.core.common.ooo.nn.m(this.o0mm);
    }

    public final int omn() {
        return this.mn0;
    }

    public final Map<String, Object> omn0() {
        return this.omo0;
    }

    public final int omnm() {
        return this.omon;
    }

    public final long omnn() {
        return this.omm0;
    }

    public final int omno() {
        return this.omom;
    }

    public final int omo() {
        return this.o00m;
    }

    public final double omo0() {
        return this.oonn;
    }

    public final JSONObject omom() {
        return this.om0o;
    }

    public final int omon() {
        return this.om0m;
    }

    public final double omoo() {
        return this.om00;
    }

    public final int on() {
        return this.onnn;
    }

    public final long on0() {
        return com.thinkup.core.common.ooo.m0n.n(this);
    }

    public final omo on00() {
        return this.ommo;
    }

    public final int on0m() {
        return this.ommm;
    }

    public final long on0n() {
        return this.ommn;
    }

    public final boolean on0o() {
        if (this.ommm != 2 || this.ommn <= 0 || this.omn0 != 4) {
            return false;
        }
        int i2 = this.oo0n;
        return i2 == -1 || i2 == 4;
    }

    public final long onm() {
        return this.n00;
    }

    public final int onm0() {
        return this.on0m;
    }

    public final JSONArray onmm() {
        return this.ono0;
    }

    public final JSONArray onmn() {
        return this.omnn;
    }

    public final JSONArray onmo() {
        return this.on0n;
    }

    public final int onn() {
        return this.n0o;
    }

    public final int onn0() {
        return this.onoo;
    }

    public final double onnm() {
        return this.onon;
    }

    public final long onnn() {
        return this.onm0;
    }

    public final long onno() {
        return this.onom;
    }

    public final long ono() {
        return this.mnn;
    }

    public final int ono0() {
        return this.omn0;
    }

    public final JSONArray onom() {
        return this.on00;
    }

    public final JSONArray onon() {
        return this.on0o;
    }

    public final int onoo() {
        return this.omno;
    }

    public final int oo() {
        return this.m00n;
    }

    public final String oo0() {
        return this.m0m;
    }

    public final int oo00() {
        return this.n0;
    }

    public final int oo0m() {
        return this.nm;
    }

    public final int oo0n() {
        int i2 = this.nn;
        if (i2 <= 0) {
            return 1;
        }
        return i2;
    }

    public final int oo0o() {
        return this.no;
    }

    public final boolean oom() {
        return this.mmo == 1;
    }

    public final String oom0() {
        return this.o0n;
    }

    public final int[] oomm() {
        return this.oooo;
    }

    public final int oomn() {
        return this.ooom;
    }

    public final long oomo() {
        return this.oo0;
    }

    public final long oon() {
        return this.mnm;
    }

    public final int oon0() {
        return this.ooon;
    }

    public final int oonm() {
        return this.oomo;
    }

    public final int oonn() {
        return this.oomm;
    }

    public final JSONArray oono() {
        return this.oom0;
    }

    public final int ooo() {
        return this.mmo;
    }

    public final int ooo0() {
        return this.o00;
    }

    public final void ooom() {
        this.o0o = true;
    }

    public final double ooon() {
        return this.o0m;
    }

    public final boolean oooo() {
        return this.o0o;
    }

    public String toString() {
        return super.toString();
    }

    public final void m(long j) {
        this.o0nm = j;
    }

    public final void m0(int i2) {
        this.mmo = i2;
    }

    public final void m00(int i2) {
        this.onnm = i2;
    }

    public final void m0m(int i2) {
        this.on = i2;
    }

    public final void m0n(int i2) {
        this.mo = i2;
    }

    public final void m0o(int i2) {
        this.o0mo = i2;
    }

    public final void mm(int i2) {
        this.o00m = i2;
    }

    public final void mm0(int i2) {
        this.o00 = i2;
    }

    public final void mmm(int i2) {
        this.ooon = i2;
    }

    public final void mmn(int i2) {
        this.oomo = i2;
    }

    public final void mmo(int i2) {
        this.ooom = i2;
    }

    public final void mn(int i2) {
        this.mn0 = i2;
    }

    public final void mn0(int i2) {
        this.oomm = i2;
    }

    public final void mnm(int i2) {
        this.oon0 = i2;
    }

    public final void mnn(int i2) {
        this.oono = i2;
    }

    public final void mno(int i2) {
        this.oomn = i2;
    }

    public final void mo(int i2) {
        this.o0o0 = i2;
    }

    public final void mo0(int i2) {
        this.n0 = i2;
    }

    public final void mom(int i2) {
        this.nm = i2;
    }

    public final void mon(int i2) {
        this.nn = i2;
    }

    public final void moo(int i2) {
        this.no = i2;
    }

    public final void n(long j) {
        this.o0nn = j;
    }

    public final void n0(int i2) {
        this.n0o = i2;
    }

    public final void n00(int i2) {
        this.oonm = i2;
    }

    public final void n0m(int i2) {
        this.om0n = i2;
    }

    public final void n0n(int i2) {
        this.omom = i2;
    }

    public final void n0o(int i2) {
        this.om0m = i2;
    }

    public final void nm(int i2) {
        this.mon = i2;
    }

    public final void nm0(int i2) {
        this.on0m = i2;
    }

    public final void nmm(int i2) {
        this.oo0o = i2;
    }

    public final void nmn(int i2) {
        this.m0on = i2;
    }

    public final void nmo(int i2) {
        this.onoo = i2;
    }

    public final void nn(int i2) {
        this.non = i2;
    }

    public final int nn0() {
        return this.f42231n;
    }

    public final int nno() {
        return this.o0;
    }

    public final void no(int i2) {
        this.mom = i2;
    }

    public final void no0(int i2) {
        this.omon = i2;
    }

    public final void nom(int i2) {
        this.omn0 = i2;
    }

    public final void non(int i2) {
        this.omno = i2;
    }

    public final void noo(int i2) {
        this.ommm = i2;
    }

    public final void o(long j) {
        this.o0no = j;
    }

    public final void o0(long j) {
        this.m00o = j;
    }

    public final void o00(int i2) {
        this.nm0 = i2;
    }

    public final void o0m(int i2) {
        this.nnn = i2;
    }

    public final void o0n(int i2) {
        this.o000 = i2;
    }

    public final void o0o(int i2) {
        this.nmm = i2;
    }

    public final void om(int i2) {
        this.onm = i2;
    }

    public final void om0(int i2) {
        this.o0 = i2;
    }

    public final void omm(int i2) {
        this.oo0n = i2;
    }

    public final void omn(int i2) {
        this.om = i2;
    }

    public final void omo(int i2) {
        this.o = i2;
    }

    public final void on(int i2) {
        this.onn = i2;
    }

    public final void on0(int i2) {
        this.onmo = i2;
    }

    public final void onm(int i2) {
        this.onmn = i2;
    }

    public final void onn(int i2) {
        this.onno = i2;
    }

    public final void ono(int i2) {
        this.onmm = i2;
    }

    public final void oo(int i2) {
        this.on0 = i2;
    }

    public final void oo0(int i2) {
        this.o00o = i2;
    }

    public final void oom(int i2) {
        this.m = i2;
    }

    public final void oon(int i2) {
        this.f42231n = i2;
    }

    public final void ooo(int i2) {
        this.oo0m = i2;
    }

    private void o0o(String str) {
        this.o0m0 = str;
    }

    public final void m(int i2) {
        this.m000 = i2;
    }

    public final void m0(long j) {
        this.n00 = j;
    }

    public final void mm(long j) {
        this.n0n = j;
    }

    public final void mn(long j) {
        this.no0 = j;
    }

    public final void mo(long j) {
        this.mo0 = j;
    }

    public final void n(int i2) {
        this.onnn = i2;
    }

    public final void n0(long j) {
        this.noo = j;
    }

    public final void nm(long j) {
        this.nno = j;
    }

    public final void nn(long j) {
        this.o0mn = j;
    }

    public final void no(long j) {
        this.nn0 = j;
    }

    public final void o(com.thinkup.core.common.n.ooo oooVar) {
        this.m0o0 = oooVar;
    }

    public final void o0(int i2) {
        this.m00m = i2;
    }

    public final void o00(long j) {
        this.oo0 = j;
    }

    public final void o0m(long j) {
        this.ommn = j;
    }

    public final void o0n(long j) {
        this.onom = j;
    }

    public final void om(long j) {
        this.nom = j;
    }

    public final void on(long j) {
        this.mnn = j;
    }

    public final void oo(long j) {
        this.mnm = j;
    }

    public final void oo0(long j) {
        this.onm0 = j;
    }

    public final void ooo(long j) {
        this.m0om = j;
    }

    private void o0m(String str) {
        this.omn = str;
    }

    public final void m(String str) {
        this.m00 = str;
    }

    public final void m0(String str) {
        this.mmn = str;
    }

    public final void mm(String str) {
        this.oo00 = str;
    }

    public final void mn(String str) {
        this.oo = str;
    }

    public final void mo(String str) {
        this.nmn = str;
    }

    public final void n(String str) {
        this.m0m = str;
    }

    public final void n0(String str) {
        this.onn0 = str;
    }

    public final void nm(String str) {
        this.o0n = str;
    }

    public final void nn(String str) {
        this.omnm = str;
    }

    public final void no(String str) {
        this.mn = str;
    }

    public final void o(int i2) {
        this.m00n = i2;
    }

    public final void o0(String str) {
        this.m0n = str;
    }

    public final void o00(String str) {
        this.m0m0 = str;
    }

    public final void o0o(long j) {
        this.omm0 = j;
    }

    public final void om(String str) {
        this.moo = str;
    }

    public final void on(String str) {
        this.mmm = str;
    }

    public final void oo(String str) {
        this.n0m = str;
    }

    public final void m(double d) {
        this.mm0 = d;
    }

    public final void m0(double d) {
        this.om00 = d;
    }

    public final void mm(double d) {
        this.m0mo = d;
    }

    public final void mo(double d) {
        this.onon = d;
    }

    public final void n(double d) {
        this.nnm = d;
    }

    public final void o(double d) {
        this.omm = d;
    }

    public final void o0(double d) {
        this.m0 = d;
    }

    public final void om(double d) {
        this.o0m = d;
    }

    public final void on(double d) {
        this.oonn = d;
    }

    public final void oo(double d) {
        this.mm = d;
    }

    private void m(on0 on0Var) {
        this.o0oo = on0Var;
    }

    public final void n(JSONArray jSONArray) {
        this.on0o = jSONArray;
    }

    public final void o(TUAdRequest tUAdRequest) {
        this.omo = tUAdRequest;
    }

    public final void o0(JSONArray jSONArray) {
        this.on0n = jSONArray;
    }

    public final void om(JSONArray jSONArray) {
        this.omnn = jSONArray;
    }

    public final void oo(JSONArray jSONArray) {
        this.ono0 = jSONArray;
    }

    public final void m(JSONArray jSONArray) {
        this.on00 = jSONArray;
    }

    public final void o(String str) {
        this.ono = str;
    }

    public final void o(Map<String, Object> map) {
        this.m0o = map;
    }

    public final void o(on0 on0Var) {
        this.m0oo = on0Var;
    }

    private int o(o0mm o0mmVar) {
        return com.thinkup.core.common.ooo.mn.o(this, o0mmVar);
    }

    public final synchronized void o(o0mm o0mmVar, int i2, int i3, int i4) {
        try {
            if (o0mmVar.n0m.equals(this.n0m)) {
                this.mm0 = o0mmVar.mm0;
                this.mm = o0mmVar.mm;
                this.omm = o0mmVar.omm;
                this.ooo0 = o0mmVar.ooo0;
                this.mn0 = i3;
                this.mmm = o0mmVar.mmm;
                this.o0m0 = o0mmVar.o0m0;
                this.o00n = 0;
                if (i2 == 0) {
                    this.o0om = o0mmVar.o0om;
                } else {
                    this.o0om = i2;
                }
                this.mmn = o0mmVar.mmn;
                this.o0oo = o0mmVar.o0oo;
                this.o0on = i4;
                this.omoo = o0mmVar.omoo;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void o(TUAdConst.CURRENCY currency) {
        this.ooo0 = currency;
    }

    public final void o(int[] iArr) {
        this.oooo = iArr;
    }

    public final void o(JSONArray jSONArray) {
        this.oom0 = jSONArray;
    }

    public final void o(JSONObject jSONObject) {
        this.om0o = jSONObject;
    }

    public final void o(mm0 mm0Var) {
        this.omoo = mm0Var;
    }

    public final void o(BaseAd baseAd) {
        int nativeAdInteractionType;
        String str;
        String appPackageName;
        int i2 = 0;
        String descriptionText = "";
        if (baseAd == null) {
            nativeAdInteractionType = 0;
            str = "";
            appPackageName = str;
        } else {
            String title = baseAd.getTitle();
            nativeAdInteractionType = baseAd.getNativeAdInteractionType();
            TUAdAppInfo adAppInfo = baseAd.getAdAppInfo();
            if (adAppInfo == null) {
                appPackageName = "";
            } else {
                descriptionText = adAppInfo.getPublisher();
                appPackageName = adAppInfo.getAppPackageName();
            }
            if (TextUtils.isEmpty(descriptionText)) {
                descriptionText = baseAd.getDescriptionText();
            }
            if (TextUtils.equals(baseAd.getAdType(), "1")) {
                i2 = baseAd.getVideoWidth() > baseAd.getVideoHeight() ? 3 : 4;
            } else if (TextUtils.equals(baseAd.getAdType(), "2")) {
                if (baseAd.getImageUrlList() != null && baseAd.getImageUrlList().size() > 1) {
                    i2 = 5;
                } else if (baseAd.getMainImageWidth() > baseAd.getMainImageHeight()) {
                    str = descriptionText;
                    descriptionText = title;
                    i2 = 1;
                } else {
                    i2 = 2;
                }
            }
            str = descriptionText;
            descriptionText = title;
        }
        HashMap map = new HashMap();
        this.omo0 = map;
        map.put("native_material_type", Integer.valueOf(i2));
        this.omo0.put("native_material_tittle", descriptionText);
        this.omo0.put("native_material_publisher_name", str);
        this.omo0.put("native_material_package_name", appPackageName);
        this.omo0.put("native_material_interaction_type", Integer.valueOf(nativeAdInteractionType));
    }

    public final void o(omo omoVar) {
        this.ommo = omoVar;
    }

    public final void o(mm mmVar) {
        this.o0n0 = mmVar;
    }

    public final void o(on0 on0Var, int i2, int i3, int i4) {
        this.mn0 = i3;
        this.mm0 = on0Var.getPrice();
        this.mm = on0Var.getSortPrice();
        this.omm = on0Var.getRmbPrice();
        this.ooo0 = on0Var.getCurrency();
        this.mmm = on0Var.token;
        this.o0m0 = on0Var.no;
        this.o00n = 0;
        this.o0om = i2;
        this.o0oo = on0Var;
        this.o0on = i4;
        if (i4 == 1) {
            this.mmn = "";
        }
        if (this.omoo != null) {
            String strN0 = on0Var.n0();
            int iNm = on0Var.nm();
            String strNo = on0Var.no();
            this.omoo.m(strN0);
            this.omoo.o0(strNo);
            this.omoo.o(iNm);
        }
    }
}
