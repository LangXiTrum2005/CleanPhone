package com.thinkup.core.common.on;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.thinkup.core.common.on.oon;
import java.io.Serializable;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ooo<T extends oon> implements Serializable {
    public static final int m0 = 1;
    public static final int mm = 3;
    public static final int mn = 4;
    public static final int mo = 2;
    public static final int n0 = 10;
    public static final int om = 1;
    public static final int on = 2;
    public static final int on0 = 1;
    public static final int ono = 2;
    private String m;
    protected String m00;
    protected String m0m;
    protected String m0n;
    protected int m0o;
    protected String mm0;
    protected oon mmm;
    protected String mmn;
    protected Bitmap mmo;
    protected String mn0;
    protected String mnm;
    protected String mnn;
    protected int mno;
    protected String mo0;
    protected String mom;
    protected String mon;
    protected String moo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f42256n;
    protected String n00;
    protected int n0m;
    protected int n0n;
    protected String n0o;
    protected String nm;
    protected int nm0;
    protected int nmm;
    protected String nmn;
    protected long nmo;
    protected String nn;
    protected String nn0;
    private int nnn;
    protected String nno;
    protected String no;
    protected int nom;
    protected int non;
    protected int noo;
    private boolean o;
    private String o0;
    protected String o00;
    private String o000;
    protected String o0m;
    private String o0m0;
    private String o0mm;
    private String o0mn;
    private String o0mo;
    protected String o0n;
    protected String o0o;
    private String o0o0;
    private String o0om;
    private String o0on;
    private String o0oo;
    protected String om0;
    protected String omm;
    protected int omn;
    protected String omo;
    protected int onm;
    protected int onn;
    private int oo;
    protected String oo0;
    protected String oom;
    protected String oon;
    protected String ooo;
    protected int no0 = -1;
    protected boolean nnm = false;
    private String o00o = "";
    private String o00m = "";
    private String o00n = "";

    public static class o {
        public static final int m = 2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f42257n = 3;
        public static final int o = 1;
    }

    private int mmm() {
        return this.n0m;
    }

    private int mmn() {
        return this.n0n;
    }

    private int mn0() {
        return this.mno;
    }

    private String mnm() {
        return this.mnn;
    }

    private String mnn() {
        return this.mm0;
    }

    private String mno() {
        return this.mnm;
    }

    private int n00() {
        return this.m0o;
    }

    private String n0m() {
        return this.o0m;
    }

    private String n0n() {
        return this.oon;
    }

    private String n0o() {
        return this.m0m;
    }

    private boolean nm0() {
        return this.o;
    }

    private int nmm() {
        return this.noo;
    }

    private int nmn() {
        return this.nom;
    }

    private int nmo() {
        return this.no0;
    }

    private String nn0() {
        return this.nn0;
    }

    private String nnm() {
        return this.nno;
    }

    private boolean nnn() {
        return this.nnm;
    }

    private boolean nno() {
        return this.onm == 4;
    }

    private int no0() {
        return this.onn;
    }

    private int nom() {
        return this.nmm;
    }

    private long non() {
        return this.nmo;
    }

    private String noo() {
        return this.m00;
    }

    private void o(String str) {
        this.mmn = str;
    }

    private int o000() {
        return this.oo;
    }

    private String o00m() {
        return this.o000;
    }

    private int o00n() {
        oon oonVar = this.mmm;
        if (oonVar == null || oonVar.n0m() != 1 || TextUtils.isEmpty(this.mmm.nom()) || (this.mmm.nm() == 1 && TextUtils.isEmpty(this.oom))) {
            return oo() ? 2 : 1;
        }
        return 3;
    }

    private int o00o() {
        return this.nnn;
    }

    private String o0m0() {
        return this.o0mo;
    }

    private String o0mo() {
        return this.o0mm;
    }

    private String o0o0() {
        return this.o0om;
    }

    private String o0om() {
        return this.o0m0;
    }

    private JSONArray o0on() {
        if (TextUtils.isEmpty(this.o0mo)) {
            return null;
        }
        try {
            return new JSONArray(this.o0mo);
        } catch (Throwable unused) {
            return null;
        }
    }

    private String o0oo() {
        return this.o0on;
    }

    public final String m() {
        return this.mon;
    }

    public abstract List<String> m(T t);

    public abstract String m0();

    public final void m0(String str) {
        this.mm0 = str;
    }

    public final String m00() {
        return this.mn0;
    }

    public final int m0m() {
        return this.nm0;
    }

    public final void m0n(String str) {
        this.o000 = str;
    }

    public final int m0o() {
        return this.non;
    }

    public final void mm(String str) {
        this.no = str;
    }

    public final String mm0() {
        return this.o0oo;
    }

    public final void mmo(String str) {
        this.o0m0 = str;
    }

    public final void mn(String str) {
        this.nm = str;
    }

    public final void mo(String str) {
        this.m0m = str;
    }

    public final void mo0(String str) {
        this.o00o = str;
    }

    public final void mom(String str) {
        this.o00n = str;
    }

    public final String mon() {
        return this.o0o0;
    }

    public final void moo(String str) {
        this.o00m = str;
    }

    public abstract List<String> n(T t);

    public final void n(String str) {
        this.mon = str;
    }

    public final void n0(String str) {
        this.nn = str;
    }

    public final void nm(String str) {
        this.o0o = str;
    }

    public final void nn(String str) {
        this.o0m = str;
    }

    public final void no(String str) {
        this.o00 = str;
    }

    public abstract int o();

    public final void o0(int i2) {
        this.n0n = i2;
    }

    public final void o00(String str) {
        this.o0n = str;
    }

    public final void o0m(String str) {
        this.ooo = str;
    }

    public final void o0n(String str) {
        this.oom = str;
    }

    public final void o0o(String str) {
        this.oo0 = str;
    }

    public final void om(String str) {
        this.mnm = str;
    }

    public final String om0() {
        return this.m0n;
    }

    public final String omm() {
        return this.moo;
    }

    public final String omn() {
        return this.mom;
    }

    public final String omo() {
        return this.mo0;
    }

    public final void on(String str) {
        this.mnn = str;
    }

    public final String on0() {
        return this.nmn;
    }

    public final void onm(String str) {
        this.f42256n = str;
    }

    public boolean onn() {
        return false;
    }

    public final Bitmap ono() {
        return this.mmo;
    }

    public final void oo(String str) {
        this.n0o = str;
    }

    public final void oo0(String str) {
        this.oon = str;
    }

    public final void oom(String str) {
        this.omo = str;
    }

    public final void oon(String str) {
        this.omm = str;
    }

    public final void ooo(String str) {
        this.om0 = str;
    }

    private void m(String str) {
        this.m00 = str;
    }

    private void mnm(String str) {
        this.o0o0 = str;
    }

    private void mnn(String str) {
        this.o0oo = str;
    }

    private boolean mno(String str) {
        return TextUtils.equals(this.oom, str) && !TextUtils.isEmpty(str);
    }

    public final void m0(int i2) {
        this.onm = i2;
    }

    public final void m00(String str) {
        this.mn0 = str;
    }

    public final void m0m(String str) {
        this.nno = str;
    }

    public final String m0n() {
        return this.o00o;
    }

    public final void m0o(String str) {
        this.nn0 = str;
    }

    public final String mm() {
        return this.nm;
    }

    public final void mm0(String str) {
        this.o0on = str;
    }

    public final void mmm(String str) {
        this.o0mo = str;
    }

    public final void mmn(String str) {
        this.o0mm = str;
    }

    public final String mmo() {
        return this.o0mn;
    }

    public final String mn() {
        return this.nn;
    }

    public final void mn0(String str) {
        this.o0mn = str;
    }

    public final String mo() {
        return this.no;
    }

    public final String mo0() {
        return this.o00m;
    }

    public final String mom() {
        oon oonVar = this.mmm;
        return oonVar != null ? oonVar.nom() : "";
    }

    public final void mon(String str) {
        this.o0om = str;
    }

    public final String moo() {
        return this.o00n;
    }

    public final void n(int i2) {
        this.n0m = i2;
    }

    public final String n0() {
        return this.o00;
    }

    public final String nm() {
        return this.o0n;
    }

    public final String nn() {
        return this.oo0;
    }

    public final String no() {
        return this.o0o;
    }

    public final void o(oon oonVar) {
        this.mmm = oonVar;
    }

    public final void o0(String str) {
        this.n00 = str;
    }

    public final String o00() {
        return this.ooo;
    }

    public final String o0m() {
        return this.om0;
    }

    public final String o0n() {
        return this.omo;
    }

    public final String o0o() {
        return this.oom;
    }

    public final String om() {
        return this.mmn;
    }

    public final void om0(String str) {
        this.m0n = str;
    }

    public final void omm(String str) {
        this.moo = str;
    }

    public final void omn(String str) {
        this.mom = str;
    }

    public final void omo(String str) {
        this.mo0 = str;
    }

    public final oon on() {
        return this.mmm;
    }

    public final void on0(String str) {
        this.nmn = str;
    }

    public final boolean onm() {
        return (TextUtils.isEmpty(this.mo0) || TextUtils.isEmpty(this.m0n) || TextUtils.isEmpty(this.moo) || TextUtils.isEmpty(this.mom)) ? false : true;
    }

    public final void onn(String str) {
        this.o0 = str;
    }

    public final void ono(String str) {
        this.m = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean oo() {
        byte b2 = 2;
        int i2 = this.mno;
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            String strValueOf = String.valueOf(this.mmm.nm());
            strValueOf.getClass();
            switch (strValueOf.hashCode()) {
                case 48:
                    b2 = !strValueOf.equals("0") ? (byte) -1 : (byte) 0;
                    break;
                case 49:
                    b2 = !strValueOf.equals("1") ? (byte) -1 : (byte) 1;
                    break;
                case 50:
                    if (!strValueOf.equals("2")) {
                        b2 = -1;
                    }
                    break;
                case AD_REWARD_USER_VALUE:
                    b2 = !strValueOf.equals("3") ? (byte) -1 : (byte) 3;
                    break;
                case AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE:
                    b2 = !strValueOf.equals("4") ? (byte) -1 : (byte) 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 2:
                case 4:
                    if (TextUtils.isEmpty(this.oom) && !TextUtils.isEmpty(this.mnm)) {
                        return true;
                    }
                    break;
                case 1:
                case 3:
                    return !TextUtils.isEmpty(this.mnm);
            }
        }
        return false;
    }

    public final String oo0() {
        return this.omm;
    }

    public final int oom() {
        return this.onm;
    }

    public final boolean oon() {
        return !TextUtils.isEmpty(this.oom);
    }

    public final int ooo() {
        return this.omn;
    }

    private void m(boolean z2) {
        this.nnm = z2;
    }

    public final void mm(int i2) {
        this.nmm = i2;
    }

    public final void mn(int i2) {
        this.non = i2;
    }

    public final void mo(int i2) {
        this.onn = i2;
    }

    public final String n() {
        return this.n00;
    }

    public final void n0(int i2) {
        this.nm0 = i2;
    }

    public final void nm(int i2) {
        this.nom = i2;
    }

    public final void nn(int i2) {
        this.oo = i2;
    }

    public final void no(int i2) {
        this.noo = i2;
    }

    public final void o(Bitmap bitmap) {
        this.mmo = bitmap;
    }

    public final String o0() {
        return this.n0o;
    }

    public final void o00(int i2) {
        this.nnn = i2;
    }

    public final void om(int i2) {
        this.m0o = i2;
    }

    public final void on(int i2) {
        this.omn = i2;
    }

    private void o(long j) {
        this.nmo = j;
    }

    public String o0(T t) {
        return this.o0n;
    }

    private void o(boolean z2) {
        this.o = z2;
    }

    private void o(int i2) {
        this.no0 = i2;
    }

    public final void oo(int i2) {
        this.mno = i2;
    }
}
