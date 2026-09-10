package com.thinkup.core.common.no.o;

import android.text.TextUtils;
import com.applovin.impl.Z;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    private static volatile n o;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile mo[] f42100n;
    private volatile mn o0 = null;
    private mo oo = null;
    private final mm<String, n0[]> m = new mm<>();

    private n() {
    }

    private synchronized void n() {
        this.m.clear();
    }

    public static n o() {
        if (o == null) {
            synchronized (n.class) {
                try {
                    if (o == null) {
                        o = new n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public final synchronized boolean m() {
        return this.f42100n != null && this.f42100n.length > 0;
    }

    private static String[] m(n0[] n0VarArr) {
        if (n0VarArr == null || n0VarArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(n0VarArr.length);
        for (n0 n0Var : n0VarArr) {
            arrayList.add(n0Var.on);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    private n0[] n(m0 m0Var) throws UnknownHostException {
        n0[] n0VarArr;
        n0[] n0VarArrO = this.m.get(m0Var.o);
        Exception e2 = null;
        if (n0VarArrO == null || n0VarArrO.length == 0) {
            n0VarArr = null;
        } else {
            ArrayList arrayList = new ArrayList(n0VarArrO.length);
            for (n0 n0Var : n0VarArrO) {
                if (n0Var != null && !TextUtils.isEmpty(n0Var.on)) {
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    int i2 = n0Var.mo;
                    if (i2 == -1 || n0Var.mm + ((long) i2) > jCurrentTimeMillis) {
                        arrayList.add(n0Var);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                n0VarArr = null;
            } else {
                n0VarArr = (n0[]) arrayList.toArray(new n0[arrayList.size()]);
            }
        }
        if (n0VarArr != null && n0VarArr.length > 0) {
            return n0VarArr;
        }
        if (this.f42100n != null && this.f42100n.length != 0) {
            for (mo moVar : this.f42100n) {
                try {
                    n0VarArrO = moVar.o(m0Var);
                    if (n0VarArrO != null && n0VarArrO.length > 0) {
                        this.oo = moVar;
                        break;
                    }
                } catch (Exception e3) {
                    e2 = e3;
                }
            }
            if (n0VarArrO != null && n0VarArrO.length != 0) {
                n0[] n0VarArrO2 = o(n0VarArrO);
                if (n0VarArrO2.length != 0) {
                    this.m.put(m0Var.o, n0VarArrO2);
                    return n0VarArrO2;
                }
                throw new UnknownHostException("no A/AAAA records");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m0Var.o);
            sb.append(" ");
            sb.append(e2 != null ? e2.getMessage() : "");
            throw new UnknownHostException(sb.toString());
        }
        throw new IllegalArgumentException("no resolver");
    }

    public final synchronized void o(mn mnVar, mo[] moVarArr) {
        if (mnVar == null) {
            try {
                mnVar = mn.mm;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.o0 = mnVar;
        this.f42100n = moVarArr;
    }

    private n0[] m(String str) {
        return m(new m0(str));
    }

    private n0[] m(m0 m0Var) throws IOException {
        if (m0Var != null) {
            String str = m0Var.o;
            if (str != null && !str.trim().isEmpty()) {
                if (o(m0Var.o)) {
                    return new n0[]{new n0(m0Var.o, 1, -1, Z.f(), 0, "")};
                }
                return n(m0Var);
            }
            throw new IllegalArgumentException("empty domain " + m0Var.o);
        }
        throw new IOException("null domain");
    }

    private static n0[] o(n0[] n0VarArr) {
        ArrayList arrayList = new ArrayList(n0VarArr.length);
        for (n0 n0Var : n0VarArr) {
            if (n0Var != null && (n0Var.o() || n0Var.m())) {
                arrayList.add(n0Var);
            }
        }
        return (n0[]) arrayList.toArray(new n0[arrayList.size()]);
    }

    private static boolean o(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || str.contains(TokenBuilder.TOKEN_DELIMITER)) {
            return false;
        }
        try {
            int iIndexOf = str.indexOf(46);
            if (iIndexOf != -1 && Integer.parseInt(str.substring(0, iIndexOf)) > 255) {
                return false;
            }
            int i2 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(46, i2);
            if (iIndexOf2 != -1 && Integer.parseInt(str.substring(i2, iIndexOf2)) > 255) {
                return false;
            }
            int i3 = iIndexOf2 + 1;
            int iIndexOf3 = str.indexOf(46, i3);
            return iIndexOf3 == -1 || Integer.parseInt(str.substring(i3, iIndexOf3)) <= 255 || Integer.parseInt(str.substring(iIndexOf3 + 1, str.length() - 1)) <= 255 || str.charAt(str.length() - 1) == '.';
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    public final synchronized no o(m0 m0Var) {
        String[] strArr;
        try {
            n0[] n0VarArrM = m(m0Var);
            if (n0VarArrM == null || n0VarArrM.length == 0) {
                strArr = null;
            } else {
                ArrayList arrayList = new ArrayList(n0VarArrM.length);
                for (n0 n0Var : n0VarArrM) {
                    arrayList.add(n0Var.on);
                }
                if (arrayList.size() == 0) {
                    strArr = null;
                } else {
                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
            }
            if (strArr != null && strArr.length != 0) {
                InetAddress[] inetAddressArr = new InetAddress[strArr.length];
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    inetAddressArr[i2] = InetAddress.getByName(strArr[i2]);
                }
                return new no(inetAddressArr, this.oo);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static n0[] n(n0[] n0VarArr) {
        if (n0VarArr == null || n0VarArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(n0VarArr.length);
        for (n0 n0Var : n0VarArr) {
            if (n0Var != null && !TextUtils.isEmpty(n0Var.on)) {
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                int i2 = n0Var.mo;
                if (i2 == -1 || n0Var.mm + ((long) i2) > jCurrentTimeMillis) {
                    arrayList.add(n0Var);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (n0[]) arrayList.toArray(new n0[arrayList.size()]);
    }
}
