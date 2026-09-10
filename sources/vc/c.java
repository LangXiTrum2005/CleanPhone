package vc;

import go.k;
import mb.g;
import mb.i;
import w0.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f52550c = k.X("|S||P|");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f52551d = k.X("|S|id");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f52552e = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jc.c f52553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52554b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public c(g gVar) {
        gVar.a();
        this.f52553a = new jc.c(gVar.f45928a, "com.google.android.gms.appid");
        gVar.a();
        i iVar = gVar.f45930c;
        String str = iVar.f45947e;
        if (str == null) {
            gVar.a();
            str = iVar.f45944b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f52554b = str;
    }
}
