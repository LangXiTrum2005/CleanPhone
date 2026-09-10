package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.o1.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
final class zzgja implements zzgid {
    private final zzgls zza;
    private final zzgle zzb;
    private final ExecutorService zzc;
    private final zzglx zzd;
    private final zzgnc zze;
    private final Object zzf = new Object();
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private zzgiz zzj;

    public zzgja(zzijv zzijvVar, zzgls zzglsVar, zzgle zzgleVar, zzglx zzglxVar, zzgnc zzgncVar, zzgad zzgadVar, ExecutorService executorService) {
        this.zza = zzglsVar;
        this.zzb = zzgleVar;
        this.zzc = executorService;
        this.zzd = zzglxVar;
        this.zze = zzgncVar;
        this.zzg = zzgadVar.zzb();
        this.zzh = zzgadVar.zzk();
        this.zzi = zzgadVar.zzj();
    }

    private final String zzq(Map map) throws zzatb, zzatf {
        String strZzb;
        zzgnc zzgncVar = this.zze;
        zzgna zzgnaVarZza = zzgncVar.zza(20110);
        try {
            zzgnaVarZza.zza();
            synchronized (this.zzf) {
                try {
                    zzgiz zzgizVar = this.zzj;
                    if (zzgizVar == null) {
                        zzgncVar.zzb(20109);
                        strZzb = "";
                    } else {
                        strZzb = zzgizVar.zzb(map);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zzgnaVarZza.zzc();
            return strZzb;
        } catch (Throwable th2) {
            try {
                zzgnaVarZza.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                zzgnaVarZza.zzc();
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final String zza() {
        synchronized (this.zzf) {
            try {
                zzgiz zzgizVar = this.zzj;
                if (zzgizVar == null) {
                    return "3.815976881.-1";
                }
                return zzgizVar.zzd();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final ListenableFuture zzb() {
        zzgye zzgyeVarZzw = zzgye.zzw(this.zzb.zzb());
        zzgiy zzgiyVar = zzgiy.zza;
        ExecutorService executorService = this.zzc;
        return (zzgye) zzgym.zzj((zzgye) zzgym.zzg(zzgyeVarZzw, Throwable.class, zzgiyVar, executorService), new zzgxu() { // from class: com.google.android.gms.internal.ads.zzgiq
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzi((zzgcs) obj);
            }
        }, executorService);
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final ListenableFuture zzc(final Context context) {
        return zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgir
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzj(context);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final ListenableFuture zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzgym.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgis
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final ListenableFuture zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzgym.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgit
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzf) {
                try {
                    zzgiz zzgizVar = this.zzj;
                    if (zzgizVar != null) {
                        HashMap map = new HashMap();
                        map.put("evt", inputEvent);
                        zzgizVar.zzc(map);
                    } else {
                        this.zze.zzb(20105);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (zzatb | zzatf e2) {
            this.zze.zzd(20104, e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgid
    public final int zzg() {
        return 4;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzh(Map map) {
        String strZzb;
        zzgna zzgnaVarZza;
        String str;
        map.put("v", this.zzg);
        ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
        ListenableFuture listenableFuture2 = (ListenableFuture) map.get(b.a3);
        byte[] bArrZzaN = null;
        long jZzd = -1;
        if (listenableFuture != null) {
            zzgna zzgnaVarZza2 = this.zze.zza(20107);
            try {
                try {
                    zzgnaVarZza2.zza();
                    zzawp zzawpVar = (zzawp) listenableFuture.get(this.zzi, TimeUnit.MILLISECONDS);
                    if (zzawpVar != null) {
                        bArrZzaN = zzawpVar.zzh().zzaN();
                        strZzb = zzawpVar.zzb().length() > 1 ? zzawpVar.zzb() : "E";
                        try {
                            if (zzawpVar.zzc()) {
                                jZzd = zzawpVar.zzd();
                            }
                        } catch (ClassCastException e2) {
                            e = e2;
                            zzgnaVarZza2.zzb(e);
                        } catch (InterruptedException e3) {
                            e = e3;
                            zzgnaVarZza2.zzb(e);
                        } catch (ExecutionException e4) {
                            e = e4;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            zzgnaVarZza2.zzb(e);
                        } catch (TimeoutException e5) {
                            e = e5;
                            zzgnaVarZza2.zzb(e);
                        }
                    } else {
                        strZzb = "E";
                    }
                } catch (ClassCastException e6) {
                    e = e6;
                    strZzb = "E";
                    zzgnaVarZza2.zzb(e);
                    zzgnaVarZza2.zzc();
                    if (strZzb.equals("E")) {
                        zzgnaVarZza = this.zze.zza(20108);
                        try {
                            try {
                                zzgnaVarZza.zza();
                                str = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
                                if (true != zzgqr.zzc(str)) {
                                    strZzb = str;
                                }
                            } catch (ClassCastException e7) {
                                e = e7;
                                zzgnaVarZza.zzb(e);
                            } catch (InterruptedException e8) {
                                e = e8;
                                zzgnaVarZza.zzb(e);
                            } catch (ExecutionException e9) {
                                e = e9;
                                Throwable cause2 = e.getCause();
                                if (cause2 != null) {
                                    e = cause2;
                                }
                                zzgnaVarZza.zzb(e);
                            } catch (TimeoutException e10) {
                                e = e10;
                                zzgnaVarZza.zzb(e);
                            }
                            zzgnaVarZza.zzc();
                        } catch (Throwable th) {
                            zzgnaVarZza.zzc();
                            throw th;
                        }
                    }
                    map.put("int", strZzb);
                    if (bArrZzaN != null) {
                        map.put("att", bArrZzaN);
                    }
                    map.put("gv", Long.valueOf(jZzd));
                } catch (InterruptedException e11) {
                    e = e11;
                    strZzb = "E";
                    zzgnaVarZza2.zzb(e);
                    zzgnaVarZza2.zzc();
                    if (strZzb.equals("E")) {
                        zzgnaVarZza = this.zze.zza(20108);
                        zzgnaVarZza.zza();
                        str = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
                        if (true != zzgqr.zzc(str)) {
                            strZzb = str;
                        }
                        zzgnaVarZza.zzc();
                    }
                    map.put("int", strZzb);
                    if (bArrZzaN != null) {
                        map.put("att", bArrZzaN);
                    }
                    map.put("gv", Long.valueOf(jZzd));
                } catch (ExecutionException e12) {
                    e = e12;
                    strZzb = "E";
                } catch (TimeoutException e13) {
                    e = e13;
                    strZzb = "E";
                    zzgnaVarZza2.zzb(e);
                    zzgnaVarZza2.zzc();
                    if (strZzb.equals("E")) {
                        zzgnaVarZza = this.zze.zza(20108);
                        zzgnaVarZza.zza();
                        str = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
                        if (true != zzgqr.zzc(str)) {
                            strZzb = str;
                        }
                        zzgnaVarZza.zzc();
                    }
                    map.put("int", strZzb);
                    if (bArrZzaN != null) {
                        map.put("att", bArrZzaN);
                    }
                    map.put("gv", Long.valueOf(jZzd));
                }
                zzgnaVarZza2.zzc();
            } catch (Throwable th2) {
                zzgnaVarZza2.zzc();
                throw th2;
            }
        } else {
            strZzb = "E";
        }
        if (strZzb.equals("E") && listenableFuture2 != null) {
            zzgnaVarZza = this.zze.zza(20108);
            zzgnaVarZza.zza();
            str = (String) listenableFuture2.get(this.zzh, TimeUnit.MILLISECONDS);
            if (true != zzgqr.zzc(str)) {
                strZzb = str;
            }
            zzgnaVarZza.zzc();
        }
        map.put("int", strZzb);
        if (bArrZzaN != null) {
            map.put("att", bArrZzaN);
        }
        map.put("gv", Long.valueOf(jZzd));
    }

    public final /* synthetic */ ListenableFuture zzi(zzgcs zzgcsVar) {
        if (this.zza.zzb(zzgcsVar)) {
            return zzgym.zzk(this.zzb.zze(), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzgiu
                @Override // com.google.android.gms.internal.ads.zzgpr
                public final /* synthetic */ Object apply(Object obj) {
                    this.zza.zzm((byte[]) obj);
                    return null;
                }
            }, zzgzd.zza());
        }
        this.zze.zzb(20103);
        throw new zzgie(1);
    }

    public final /* synthetic */ String zzj(final Context context) throws zzatb, zzatf {
        final HashMap map = new HashMap();
        this.zze.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgiv
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(map, context);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    public final /* synthetic */ String zzk(final Context context, String str, final View view, final Activity activity) throws zzatb, zzatf {
        final HashMap map = new HashMap();
        final String str2 = null;
        this.zze.zzf(20106, new Runnable(map, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzgiw
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    public final /* synthetic */ String zzl(final Context context, final String str, final View view, Activity activity) throws zzatb, zzatf {
        final HashMap map = new HashMap();
        final Activity activity2 = null;
        this.zze.zzf(20106, new Runnable(map, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzgix
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    public final /* synthetic */ Void zzm(byte[] bArr) {
        zzatd zzatdVarZzc = zzgjd.zzc();
        zzgna zzgnaVarZza = this.zze.zza(20102);
        try {
            try {
                zzgnaVarZza.zza();
                synchronized (this.zzf) {
                    this.zzj = zzgiz.zza(zzatdVarZzc, bArr);
                }
                zzgnaVarZza.zzc();
                return null;
            } catch (zzatb e2) {
                e = e2;
                zzgnaVarZza.zzb(e);
                throw new zzgie(2, e);
            } catch (zzatf e3) {
                e = e3;
                zzgnaVarZza.zzb(e);
                throw new zzgie(2, e);
            } catch (Throwable th) {
                zzgnaVarZza.zzb(th);
                throw th;
            }
        } catch (Throwable th2) {
            zzgnaVarZza.zzc();
            throw th2;
        }
    }

    public final /* synthetic */ void zzn(Map map, Context context) {
        map.putAll(this.zzd.zzb());
        zzh(map);
        map.put(f.j, "q");
        map.put("ctx", context);
    }

    public final /* synthetic */ void zzo(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzc(context, view));
        zzh(map);
        map.put(f.j, "v");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", activity);
        map.put("bds", null);
    }

    public final /* synthetic */ void zzp(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzd());
        zzh(map);
        map.put(f.j, "c");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", null);
        map.put("bds", str);
    }
}
