package com.thinkup.core.common.on;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class n0o extends ooo<n0n> {
    public static final int m = 2;
    public static final int o = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42210n;
    private String nnn;
    public long o0;
    private String o000;
    private String o00m;
    private String o00n;
    private String o00o;
    private String o0m0;
    private int o0mm;
    private String o0mn;
    private long o0mo;
    private String o0n0;
    private String o0nm;
    private String o0nn;
    private String o0no;
    private String o0o0;
    private String o0om;
    private String o0on;
    private String o0oo;
    String oo = "";

    private String mmm() {
        return this.o0nn;
    }

    private String mmn() {
        return this.o0mn;
    }

    private String mn0() {
        return this.o0n0;
    }

    private String n00() {
        return this.nnn;
    }

    private String n0m() {
        return this.o00o;
    }

    private String n0n() {
        return this.o00m;
    }

    private String n0o() {
        return this.o000;
    }

    private String nm0() {
        return this.o0on;
    }

    private int nmm() {
        return this.f42210n;
    }

    private long nmn() {
        return this.o0;
    }

    private String nmo() {
        return this.o0m0;
    }

    private long nn0() {
        return this.o0mo;
    }

    private String no0() {
        return this.o00n;
    }

    private String nom() {
        return this.o0oo;
    }

    private String non() {
        return this.o0om;
    }

    private String noo() {
        return this.o0o0;
    }

    @Override // com.thinkup.core.common.on.ooo
    public final /* synthetic */ List m(oon oonVar) {
        boolean z2;
        n0n n0nVar = (n0n) oonVar;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(n0nVar.nm()), "0") && !TextUtils.isEmpty(this.oom)) {
            arrayList.add(this.oom);
        }
        if (TextUtils.equals(String.valueOf(n0nVar.nm()), "2")) {
            String strNo = n0nVar.no();
            if (!TextUtils.isEmpty(this.oom)) {
                arrayList.add(this.oom);
            }
            String strO0 = o0(n0nVar);
            if (!TextUtils.isEmpty(strO0)) {
                arrayList.add(strO0);
            }
            if (arrayList.size() == 0) {
                stringBuffer.append(strNo);
                stringBuffer.append(" url,");
            }
        }
        if (TextUtils.equals(String.valueOf(n0nVar.nm()), "1")) {
            if (TextUtils.isEmpty(this.o0o)) {
                stringBuffer.append("icon_u,");
                z2 = false;
            } else {
                arrayList.add(this.o0o);
                z2 = true;
            }
            if (TextUtils.isEmpty(this.o0n)) {
                stringBuffer.append("full_u,");
                z2 = false;
            } else {
                arrayList.add(this.o0n);
            }
            if (TextUtils.isEmpty(this.oom)) {
                stringBuffer.append("video_u,");
                z2 = false;
            } else {
                arrayList.add(this.oom);
            }
        } else {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n0nVar.nm());
        if (TextUtils.equals(sb.toString(), "3")) {
            if (TextUtils.isEmpty(this.o0o)) {
                stringBuffer.append("icon_u,");
                z2 = false;
            } else {
                arrayList.add(this.o0o);
            }
            if (TextUtils.isEmpty(this.o0n)) {
                stringBuffer.append("full_u,");
                z2 = false;
            } else {
                arrayList.add(this.o0n);
            }
            if (this.omn == 1) {
                if (TextUtils.isEmpty(this.oom)) {
                    stringBuffer.append("video_u,");
                    z2 = false;
                } else {
                    arrayList.add(this.oom);
                }
            }
        }
        if (TextUtils.equals(String.valueOf(n0nVar.nm()), "4")) {
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
        this.oo = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }

    @Override // com.thinkup.core.common.on.ooo
    public final String m0() {
        return this.oo;
    }

    public final void mnm(String str) {
        this.o0no = str;
    }

    public final void mnn(String str) {
        this.o0nm = str;
    }

    public final void mno(String str) {
        this.o0n0 = str;
    }

    @Override // com.thinkup.core.common.on.ooo
    public final /* synthetic */ List n(oon oonVar) {
        n0n n0nVar = (n0n) oonVar;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(String.valueOf(n0nVar.nm()), "2")) {
            String strO0 = o0(n0nVar);
            if (!TextUtils.isEmpty(strO0) && TextUtils.equals(strO0, this.o0n) && !TextUtils.isEmpty(this.o0o)) {
                arrayList.add(this.o0o);
            }
        }
        return arrayList;
    }

    @Override // com.thinkup.core.common.on.ooo
    public final int o() {
        return 1;
    }

    private String mnm() {
        return this.o0nm;
    }

    private int mnn() {
        return this.o0mm;
    }

    private String mno() {
        return this.o0no;
    }

    private String nmm(String str) {
        try {
            JSONObject jSONObject = new JSONObject(this.o0nn);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                str = str.replaceAll("\\{" + next + "\\}", jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    @Override // com.thinkup.core.common.on.ooo
    public String o0(n0n n0nVar) {
        byte b2;
        if (!TextUtils.equals(String.valueOf(n0nVar.nm()), "2")) {
            return "";
        }
        switch (n0nVar.no()) {
            case "300x250":
                b2 = 1;
                break;
            case "320x50":
                b2 = 3;
                break;
            case "320x90":
                b2 = 0;
                break;
            case "728x90":
                b2 = 2;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (!TextUtils.isEmpty(this.o0mn)) {
                        return this.o0mn;
                    }
                } else if (!TextUtils.isEmpty(this.o0nm)) {
                    return this.o0nm;
                }
            } else if (!TextUtils.isEmpty(this.o0no)) {
                return this.o0no;
            }
        } else if (!TextUtils.isEmpty(this.o0n0)) {
            return this.o0n0;
        }
        return this.o0n;
    }

    public final void n00(String str) {
        this.nnn = str;
    }

    public final void n0m(String str) {
        this.o00o = str;
    }

    public final void n0n(String str) {
        this.o00m = str;
    }

    public final void n0o(String str) {
        this.o000 = str;
    }

    public final void nm0(String str) {
        this.o0on = str;
    }

    public final void nmo(String str) {
        this.o0m0 = str;
    }

    public final void no0(String str) {
        this.o00n = str;
    }

    public final void nom(String str) {
        this.o0oo = str;
    }

    public final void non(String str) {
        this.o0om = str;
    }

    public final void noo(String str) {
        this.o0o0 = str;
    }

    public final void o(String str) {
        this.o0nn = str;
    }

    public final void o(int i2) {
        this.o0mm = i2;
    }

    public final void o(long j) {
        this.o0mo = j;
    }

    public final boolean o(n0n n0nVar) {
        return n0nVar == null || System.currentTimeMillis() - this.o0mo > n0nVar.oo0();
    }

    private List<String> n(n0n n0nVar) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(String.valueOf(n0nVar.nm()), "2")) {
            String strO0 = o0(n0nVar);
            if (!TextUtils.isEmpty(strO0) && TextUtils.equals(strO0, this.o0n) && !TextUtils.isEmpty(this.o0o)) {
                arrayList.add(this.o0o);
            }
        }
        return arrayList;
    }

    public final void m(String str) {
        this.o0mn = str;
    }

    private void m(int i2) {
        this.f42210n = i2;
    }

    private void m(long j) {
        this.o0 = j;
    }

    private List<String> m(n0n n0nVar) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.equals(String.valueOf(n0nVar.nm()), "0") && !TextUtils.isEmpty(this.oom)) {
            arrayList.add(this.oom);
        }
        if (TextUtils.equals(String.valueOf(n0nVar.nm()), "2")) {
            String strNo = n0nVar.no();
            if (!TextUtils.isEmpty(this.oom)) {
                arrayList.add(this.oom);
            }
            String strO0 = o0(n0nVar);
            if (!TextUtils.isEmpty(strO0)) {
                arrayList.add(strO0);
            }
            if (arrayList.size() == 0) {
                stringBuffer.append(strNo);
                stringBuffer.append(" url,");
            }
        }
        if (TextUtils.equals(String.valueOf(n0nVar.nm()), "1")) {
            if (!TextUtils.isEmpty(this.o0o)) {
                arrayList.add(this.o0o);
                z2 = true;
            } else {
                stringBuffer.append("icon_u,");
                z2 = false;
            }
            if (!TextUtils.isEmpty(this.o0n)) {
                arrayList.add(this.o0n);
            } else {
                stringBuffer.append("full_u,");
                z2 = false;
            }
            if (!TextUtils.isEmpty(this.oom)) {
                arrayList.add(this.oom);
            } else {
                stringBuffer.append("video_u,");
                z2 = false;
            }
        } else {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(n0nVar.nm());
        if (TextUtils.equals(sb.toString(), "3")) {
            if (!TextUtils.isEmpty(this.o0o)) {
                arrayList.add(this.o0o);
            } else {
                stringBuffer.append("icon_u,");
                z2 = false;
            }
            if (!TextUtils.isEmpty(this.o0n)) {
                arrayList.add(this.o0n);
            } else {
                stringBuffer.append("full_u,");
                z2 = false;
            }
            if (this.omn == 1) {
                if (!TextUtils.isEmpty(this.oom)) {
                    arrayList.add(this.oom);
                } else {
                    stringBuffer.append("video_u,");
                    z2 = false;
                }
            }
        }
        if (TextUtils.equals(String.valueOf(n0nVar.nm()), "4")) {
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
        this.oo = stringBuffer.substring(0, stringBuffer.length() - 1);
        return null;
    }
}
