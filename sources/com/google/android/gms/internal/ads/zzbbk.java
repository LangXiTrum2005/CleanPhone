package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import androidx.media3.ui.i;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbbk {
    public static String zza(Context context, String str, List list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzgzf zzgzfVarZze = zzgzf.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbbj
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzgzf zzgzfVar = zzgzfVarZze;
                if (list2 == null) {
                    zzgzfVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ApkChecksum apkChecksumE = i.e(list2.get(i2));
                        if (apkChecksumE.getType() == 8) {
                            zzgzfVar.zza(zzazw.zza(apkChecksumE.getValue()));
                            return;
                        }
                    }
                    zzgzfVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzgzfVar.zza((Object) null);
                }
            }
        });
        return (String) zzgzfVarZze.get();
    }
}
