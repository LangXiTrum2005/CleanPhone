package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kq implements d81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f16509b;

    public /* synthetic */ kq(String str, int i10) {
        this.f16508a = i10;
        this.f16509b = str;
    }

    @Override // com.google.android.gms.internal.ads.d81
    public final /* synthetic */ Object apply(Object obj) {
        int i10 = this.f16508a;
        String strReplace = this.f16509b;
        switch (i10) {
            case 0:
                String str = (String) obj;
                iq iqVar = nq.f17890a;
                if (str == null) {
                    return strReplace;
                }
                if (((Boolean) en.f14022f.o()).booleanValue()) {
                    String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                    String host = Uri.parse(strReplace).getHost();
                    for (int i11 = 0; i11 < 3; i11++) {
                        if (!host.endsWith(strArr[i11])) {
                        }
                    }
                    return strReplace;
                }
                String str2 = (String) en.f14017a.o();
                String str3 = (String) en.f14018b.o();
                if (!TextUtils.isEmpty(str2)) {
                    strReplace = strReplace.replace(str2, str);
                }
                if (TextUtils.isEmpty(str3)) {
                    return strReplace;
                }
                Uri uri = Uri.parse(strReplace);
                return TextUtils.isEmpty(uri.getQueryParameter(str3)) ? uri.buildUpon().appendQueryParameter(str3, str).toString() : strReplace;
            case 1:
                Throwable th2 = (Throwable) obj;
                iq iqVar2 = nq.f17890a;
                if (((Boolean) en.f14025i.o()).booleanValue()) {
                    zzt.zzh().d("prepareClickUrl.attestation2", th2);
                }
                return strReplace;
            case 2:
                return new vf0(strReplace, (yn) obj);
            default:
                Throwable th3 = (Throwable) obj;
                fr0 fr0Var = ur0.f20864j;
                int i12 = zze.zza;
                zzo.zzf("Error calling adapter: ".concat(String.valueOf(strReplace)));
                if (((Boolean) zzba.zzc().a(am.Le)).booleanValue()) {
                    zzt.zzh().e("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th3);
                    return null;
                }
                zzt.zzh().d("rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(strReplace)), th3);
                return null;
        }
    }
}
