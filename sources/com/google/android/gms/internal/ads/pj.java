package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t6.l f18692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ml f18693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18694c;

    public pj() {
        this.f18693b = nl.K();
        this.f18694c = false;
        this.f18692a = new t6.l(5);
    }

    public final synchronized void a(oj ojVar) {
        if (this.f18694c) {
            try {
                ojVar.a(this.f18693b);
            } catch (NullPointerException e10) {
                zzt.zzh().d("AdMobClearcutLogger.modify", e10);
            }
        }
    }

    public final synchronized void b(int i10) {
        if (this.f18694c) {
            if (((Boolean) zzba.zzc().a(am.f12239l6)).booleanValue()) {
                d(i10);
            } else {
                c(i10);
            }
        }
    }

    public final synchronized void c(int i10) {
        ml mlVar = this.f18693b;
        mlVar.b();
        ((nl) mlVar.f19193b).E();
        List listZzj = zzs.zzj();
        mlVar.b();
        ((nl) mlVar.f19193b).D(listZzj);
        byte[] bArrB = ((nl) mlVar.e()).b();
        t6.l lVar = this.f18692a;
        pb pbVar = new pb();
        Objects.requireNonNull(lVar);
        pbVar.f18584c = lVar;
        pbVar.f18583b = bArrB;
        int i11 = i10 - 1;
        pbVar.f18582a = i11;
        synchronized (pbVar) {
            ((ExecutorService) ((t6.l) pbVar.f18584c).f50551d).execute(new d(pbVar, 11));
        }
        zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void d(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(new File(externalStorageDirectory, "clearcut_events.txt").getPath()), true);
            try {
                fileOutputStream.write(e(i10).getBytes());
            } catch (IOException unused) {
                zze.zza("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            zze.zza("Could not find file for Clearcut");
        }
    }

    public final synchronized String e(int i10) {
        StringBuilder sb2;
        ml mlVar = this.f18693b;
        String strJ = ((nl) mlVar.f19193b).J();
        ((p9.b) zzt.zzk()).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(((nl) mlVar.e()).b(), 3);
        sb2 = new StringBuilder("id=");
        sb2.append(strJ);
        sb2.append(",timestamp=");
        sb2.append(jElapsedRealtime);
        sb2.append(",event=");
        sb2.append(i10 - 1);
        sb2.append(",data=");
        sb2.append(strEncodeToString);
        sb2.append("\n");
        return sb2.toString();
    }

    public pj(t6.l lVar) {
        this.f18693b = nl.K();
        this.f18692a = lVar;
        this.f18694c = ((Boolean) zzba.zzc().a(am.f12225k6)).booleanValue();
    }
}
