package sg.bigo.ads.ad.interstitial.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.ArrayList;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.controller.landing.d;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008f  */
    public static e a(Context context, Ad ad, sg.bigo.ads.api.core.c cVar, String str, p pVar, sg.bigo.ads.core.f.a.a.C0869a c0869a) {
        String str2;
        sg.bigo.ads.api.core.c.b bVarN;
        ArrayList arrayList = new ArrayList();
        String str3 = c0869a == null ? null : c0869a.f48473a;
        if (TextUtils.isEmpty(str3) || str3.startsWith("http")) {
            if (!URLUtil.isNetworkUrl(str3)) {
            }
            if (TextUtils.isEmpty(str)) {
                str = str3;
            } else {
                if (!str.startsWith("http")) {
                    arrayList.add(str);
                } else if (TextUtils.isEmpty(str3) || !URLUtil.isNetworkUrl(str)) {
                }
                str = str3;
            }
            if (pVar == null) {
                str2 = null;
            } else {
                str2 = pVar.m;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (!str2.startsWith("http")) {
                    arrayList.add(str2);
                } else if (TextUtils.isEmpty(str) && URLUtil.isNetworkUrl(str2)) {
                    str = str2;
                }
            }
            bVarN = cVar.N();
            if (!TextUtils.isEmpty(bVarN.b())) {
                arrayList.add(bVarN.b());
            }
            if (TextUtils.isEmpty(str)) {
                str = bVarN.a();
            }
            if (str == null) {
                str = "";
            }
            return d.a(context, arrayList, str, bVarN.g(), cVar.a(2), bVarN.c(), bVarN.d(), (sg.bigo.ads.ad.c<?, ?>) (ad instanceof sg.bigo.ads.ad.c ? (sg.bigo.ads.ad.c) ad : null), cVar.ar());
        }
        arrayList.add(str3);
        str3 = null;
        if (TextUtils.isEmpty(str)) {
            str = str3;
        } else {
            if (!str.startsWith("http")) {
                arrayList.add(str);
            } else if (TextUtils.isEmpty(str3)) {
            }
            str = str3;
        }
        if (pVar == null) {
            str2 = null;
        } else {
            str2 = pVar.m;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (!str2.startsWith("http")) {
                arrayList.add(str2);
            } else if (TextUtils.isEmpty(str)) {
                str = str2;
            }
        }
        bVarN = cVar.N();
        if (!TextUtils.isEmpty(bVarN.b())) {
            arrayList.add(bVarN.b());
        }
        if (TextUtils.isEmpty(str)) {
            str = bVarN.a();
        }
        if (str == null) {
            str = "";
        }
        if (ad instanceof sg.bigo.ads.ad.c) {
        }
        return d.a(context, arrayList, str, bVarN.g(), cVar.a(2), bVarN.c(), bVarN.d(), (sg.bigo.ads.ad.c<?, ?>) (ad instanceof sg.bigo.ads.ad.c ? (sg.bigo.ads.ad.c) ad : null), cVar.ar());
    }
}
