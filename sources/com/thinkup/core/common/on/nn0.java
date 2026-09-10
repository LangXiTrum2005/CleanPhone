package com.thinkup.core.common.on;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nn0 extends ooo<nno> {
    public static final int o00n = 1;
    public static final int o0m0 = 6;
    public static final int o0o0 = 2;
    public static final int o0om = 4;
    public static final int o0on = 5;
    public static final int o0oo = 3;
    private int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f42213n;
    long nnn;
    private int o0;
    String o000;
    int o00m;
    String o00o;
    String o0mm;
    nnm o0mn;
    String o0mo;
    int o0n0;
    long o0nm;
    long o0nn;
    String o0no;
    private int oo;
    long oo00;
    private String oo0m;
    private String oo0n;
    private int oom0;
    private String ooo0;
    private String ooom;
    private int ooon;
    private String oooo;
    private final String o = getClass().getSimpleName();
    String oo0o = "";

    private long n0m() {
        return this.o0nm;
    }

    private String n0n() {
        return this.oo0m;
    }

    private boolean n0o() {
        return System.currentTimeMillis() >= this.oo00;
    }

    private long nm0() {
        return this.nnn;
    }

    private String nmm() {
        return this.o00o;
    }

    private String nmn() {
        return this.o0mm;
    }

    private String nmo() {
        return this.o000;
    }

    private String nn0() {
        return this.o0no;
    }

    private int nnm() {
        return this.f42213n;
    }

    private int nnn() {
        return this.o0;
    }

    private int nno() {
        return this.m;
    }

    private String no0() {
        return this.oo0n;
    }

    private int nom() {
        return this.o0n0;
    }

    private nnm non() {
        return this.o0mn;
    }

    private String noo() {
        return this.ooo0;
    }

    private void o(int i2) {
        this.o0n0 = i2;
    }

    private void o0(long j) {
        this.oo00 = j;
    }

    private int o000() {
        return this.oo;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0146  */
    /* JADX WARN: Code duplicated, block: B:79:0x014e  */
    @Override // com.thinkup.core.common.on.ooo
    public final /* synthetic */ List m(oon oonVar) {
        boolean z2;
        nno nnoVar = (nno) oonVar;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(nnoVar.nm()), "0") && !TextUtils.isEmpty(this.oom)) {
            arrayList.add(this.oom);
        }
        if (TextUtils.equals(String.valueOf(nnoVar.nm()), "1")) {
            if (oo()) {
                z2 = true;
            } else {
                if (!TextUtils.isEmpty(this.o0o)) {
                    arrayList.add(this.o0o);
                }
                if (TextUtils.isEmpty(this.o0n)) {
                    stringBuffer.append("full_u,");
                    z2 = false;
                } else {
                    arrayList.add(this.o0n);
                    z2 = true;
                }
            }
            if (TextUtils.isEmpty(this.oom)) {
                if (nnoVar.omm() != 1 && nnoVar.omn() <= 0) {
                    stringBuffer.append("video_u,");
                } else if (nnoVar.omn() != 1) {
                    if (TextUtils.isEmpty(this.o0n)) {
                        stringBuffer.append("full_u,");
                    } else if (!arrayList.contains(this.o0n)) {
                        arrayList.add(this.o0n);
                    }
                }
                z2 = false;
            } else {
                arrayList.add(this.oom);
            }
        } else {
            z2 = true;
        }
        if (TextUtils.equals(String.valueOf(nnoVar.nm()), "3")) {
            if (!oo()) {
                if (!TextUtils.isEmpty(this.o0o)) {
                    arrayList.add(this.o0o);
                }
                if (TextUtils.isEmpty(this.o0n)) {
                    stringBuffer.append("full_u,");
                    z2 = false;
                } else {
                    arrayList.add(this.o0n);
                }
            }
            if (oon() && (this.omn == 1 || nnoVar.onn())) {
                arrayList.add(this.oom);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nnoVar.nm());
        if (TextUtils.equals(sb.toString(), "2")) {
            int i2 = this.o00m;
            if (i2 != 1) {
                if (i2 == 2) {
                    if (TextUtils.isEmpty(this.o0mo)) {
                        stringBuffer.append("img_list,");
                        z2 = false;
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (TextUtils.isEmpty(this.o0mo)) {
                            stringBuffer.append("img_list,");
                            z2 = false;
                        }
                    }
                } else if (!TextUtils.isEmpty(this.oom)) {
                    arrayList.add(this.oom);
                    if (!TextUtils.isEmpty(this.o0n)) {
                        arrayList.add(this.o0n);
                    }
                } else if (TextUtils.isEmpty(this.o0n)) {
                    stringBuffer.append("full_u,");
                    z2 = false;
                } else {
                    arrayList.add(this.o0n);
                }
            } else if (!TextUtils.isEmpty(this.oom)) {
                arrayList.add(this.oom);
                if (!TextUtils.isEmpty(this.o0n)) {
                    arrayList.add(this.o0n);
                }
            } else if (TextUtils.isEmpty(this.o0n)) {
                stringBuffer.append("full_u,");
                z2 = false;
            } else {
                arrayList.add(this.o0n);
            }
        }
        if (TextUtils.equals(String.valueOf(nnoVar.nm()), "4")) {
            if (!TextUtils.isEmpty(this.oom)) {
                arrayList.add(this.oom);
                if (!TextUtils.isEmpty(this.o0n)) {
                    arrayList.add(this.o0n);
                }
            } else if (TextUtils.isEmpty(this.o0n)) {
                stringBuffer.append("full_u,");
                z2 = false;
            } else {
                arrayList.add(this.o0n);
            }
        }
        if (z2) {
            return arrayList;
        }
        this.oo0o = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }

    @Override // com.thinkup.core.common.on.ooo
    public final String m0() {
        return this.oo0o;
    }

    public final long mmm() {
        return this.oo00;
    }

    public final String mmn() {
        return this.oooo;
    }

    public final String mn0() {
        return this.ooom;
    }

    public final void mnm(String str) {
        this.oo0n = str;
    }

    public final void mnn(String str) {
        this.ooo0 = str;
    }

    public final void mno(String str) {
        this.oo0m = str;
    }

    @Override // com.thinkup.core.common.on.ooo
    public final /* synthetic */ List n(oon oonVar) {
        nno nnoVar = (nno) oonVar;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(nnoVar.nm());
        if (TextUtils.equals(sb.toString(), "2") && this.o00m == 3 && !TextUtils.isEmpty(this.o0o)) {
            arrayList.add(this.o0o);
        }
        if (TextUtils.equals(String.valueOf(nnoVar.nm()), "4") && 1 != this.o00m && !TextUtils.isEmpty(this.o0o)) {
            arrayList.add(this.o0o);
        }
        return arrayList;
    }

    public final void n00(String str) {
        this.oooo = str;
    }

    public final void o0m(int i2) {
        this.oom0 = i2;
    }

    public final void o0n(int i2) {
        this.o00m = i2;
    }

    public final void o0o(int i2) {
        this.ooon = i2;
    }

    public final void oo0(int i2) {
        this.m = i2;
    }

    public final void oom(int i2) {
        this.o0 = i2;
    }

    public final void oon(int i2) {
        this.oo = i2;
    }

    public final void ooo(int i2) {
        this.f42213n = i2;
    }

    public final int mnm() {
        return this.oom0;
    }

    public final int mnn() {
        return this.o00m;
    }

    public final int mno() {
        return this.ooon;
    }

    public final String n00() {
        return this.o0mo;
    }

    public final void n0m(String str) {
        this.o000 = str;
    }

    public final void n0n(String str) {
        this.o00o = str;
    }

    public final void n0o(String str) {
        this.ooom = str;
    }

    public final void no0(String str) {
        this.o0mo = str;
    }

    public final void nom(String str) {
        this.o0no = str;
    }

    public final void noo(String str) {
        this.o0mm = str;
    }

    public final void o(nnm nnmVar) {
        this.o0mn = nnmVar;
    }

    public final void o(long j) {
        this.nnn = j;
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0144  */
    /* JADX WARN: Code duplicated, block: B:79:0x014c  */
    private List<String> o(nno nnoVar) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(nnoVar.nm()), "0") && !TextUtils.isEmpty(this.oom)) {
            arrayList.add(this.oom);
        }
        if (TextUtils.equals(String.valueOf(nnoVar.nm()), "1")) {
            if (oo()) {
                z2 = true;
            } else {
                if (!TextUtils.isEmpty(this.o0o)) {
                    arrayList.add(this.o0o);
                }
                if (!TextUtils.isEmpty(this.o0n)) {
                    arrayList.add(this.o0n);
                    z2 = true;
                } else {
                    stringBuffer.append("full_u,");
                    z2 = false;
                }
            }
            if (!TextUtils.isEmpty(this.oom)) {
                arrayList.add(this.oom);
            } else {
                if (nnoVar.omm() != 1 && nnoVar.omn() <= 0) {
                    stringBuffer.append("video_u,");
                } else if (nnoVar.omn() != 1) {
                    if (!TextUtils.isEmpty(this.o0n)) {
                        if (!arrayList.contains(this.o0n)) {
                            arrayList.add(this.o0n);
                        }
                    } else {
                        stringBuffer.append("full_u,");
                    }
                }
                z2 = false;
            }
        } else {
            z2 = true;
        }
        if (TextUtils.equals(String.valueOf(nnoVar.nm()), "3")) {
            if (!oo()) {
                if (!TextUtils.isEmpty(this.o0o)) {
                    arrayList.add(this.o0o);
                }
                if (!TextUtils.isEmpty(this.o0n)) {
                    arrayList.add(this.o0n);
                } else {
                    stringBuffer.append("full_u,");
                    z2 = false;
                }
            }
            if (oon() && (this.omn == 1 || nnoVar.onn())) {
                arrayList.add(this.oom);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(nnoVar.nm());
        if (TextUtils.equals(sb.toString(), "2")) {
            int i2 = this.o00m;
            if (i2 != 1) {
                if (i2 == 2) {
                    if (TextUtils.isEmpty(this.o0mo)) {
                        stringBuffer.append("img_list,");
                        z2 = false;
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (TextUtils.isEmpty(this.o0mo)) {
                            stringBuffer.append("img_list,");
                            z2 = false;
                        }
                    }
                } else if (TextUtils.isEmpty(this.oom)) {
                    if (!TextUtils.isEmpty(this.o0n)) {
                        arrayList.add(this.o0n);
                    } else {
                        stringBuffer.append("full_u,");
                        z2 = false;
                    }
                } else {
                    arrayList.add(this.oom);
                    if (!TextUtils.isEmpty(this.o0n)) {
                        arrayList.add(this.o0n);
                    }
                }
            } else if (TextUtils.isEmpty(this.oom)) {
                if (!TextUtils.isEmpty(this.o0n)) {
                    arrayList.add(this.o0n);
                } else {
                    stringBuffer.append("full_u,");
                    z2 = false;
                }
            } else {
                arrayList.add(this.oom);
                if (!TextUtils.isEmpty(this.o0n)) {
                    arrayList.add(this.o0n);
                }
            }
        }
        if (TextUtils.equals(String.valueOf(nnoVar.nm()), "4")) {
            if (TextUtils.isEmpty(this.oom)) {
                if (!TextUtils.isEmpty(this.o0n)) {
                    arrayList.add(this.o0n);
                } else {
                    stringBuffer.append("full_u,");
                    z2 = false;
                }
            } else {
                arrayList.add(this.oom);
                if (!TextUtils.isEmpty(this.o0n)) {
                    arrayList.add(this.o0n);
                }
            }
        }
        if (z2) {
            return arrayList;
        }
        this.oo0o = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }

    private void n(long j) {
        this.o0nn = j;
    }

    private void m(long j) {
        this.o0nm = j;
        this.oo00 = this.o0nn + j;
    }

    private List<String> m(nno nnoVar) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(nnoVar.nm());
        if (TextUtils.equals(sb.toString(), "2") && this.o00m == 3 && !TextUtils.isEmpty(this.o0o)) {
            arrayList.add(this.o0o);
        }
        if (TextUtils.equals(String.valueOf(nnoVar.nm()), "4") && 1 != this.o00m && !TextUtils.isEmpty(this.o0o)) {
            arrayList.add(this.o0o);
        }
        return arrayList;
    }

    private boolean o(boolean z2, boolean z3) {
        if (z2) {
            if (z3) {
                return this.m == 1;
            }
            return this.f42213n == 1;
        }
        if (z3) {
            return this.o0 == 1;
        }
        return this.oo == 1;
    }
}
