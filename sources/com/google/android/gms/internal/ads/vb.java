package com.google.android.gms.internal.ads;

import com.ironsource.B5;
import com.ironsource.X3;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vb extends hb {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f21144m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kb f21145n;

    public vb(int i10, String str, kb kbVar, jb jbVar) {
        super(i10, str, jbVar);
        this.f21144m = new Object();
        this.f21145n = kbVar;
    }

    @Override // com.google.android.gms.internal.ads.hb
    public final bc.s c(fb fbVar) {
        String str;
        String str2;
        byte[] bArr = fbVar.f14355b;
        try {
            Map map = fbVar.f14356c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                    String[] strArrSplit2 = strArrSplit[i10].trim().split(X3.j.f27830b, 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals(B5.N)) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(bArr);
        }
        return new bc.s(str, dv.c(fbVar));
    }
}
