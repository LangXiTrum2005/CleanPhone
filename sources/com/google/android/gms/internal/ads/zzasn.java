package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import com.p004ironsource.dc;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class zzasn extends zzark {
    private final Object zza;
    private final zzarp zzb;

    public zzasn(int i2, String str, zzarp zzarpVar, zzaro zzaroVar) {
        super(i2, str, zzaroVar);
        this.zza = new Object();
        this.zzb = zzarpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzark
    public final zzarq zzr(zzarg zzargVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzargVar.zzb;
            Map map = zzargVar.zzc;
            String str3 = CharEncoding.ISO_8859_1;
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                    String[] strArrSplit2 = strArrSplit[i2].trim().split(d9.i.f24747b, 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals(dc.M)) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzargVar.zzb);
        }
        return zzarq.zza(str, zzash.zza(zzargVar));
    }

    @Override // com.google.android.gms.internal.ads.zzark
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzarp zzarpVar;
        synchronized (this.zza) {
            zzarpVar = this.zzb;
        }
        zzarpVar.zza(str);
    }
}
