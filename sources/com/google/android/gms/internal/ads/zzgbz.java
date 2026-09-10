package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbz extends zzgbr {
    private final ExecutorService zzb;
    private final zzgby zzc;
    private final Function zzd;

    public zzgbz(File file, ExecutorService executorService, zzgby zzgbyVar, Function function) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzgbyVar;
        this.zzd = function;
    }

    @Override // com.google.android.gms.internal.ads.zzgbr
    public final ListenableFuture zzb() {
        return zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgbw
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgbr
    public final ListenableFuture zzc(final Object obj) {
        return zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgbv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    public final /* synthetic */ Object zzd() {
        Object objApply;
        Object objZzb;
        synchronized (this) {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(this.zza);
                    try {
                        objZzb = this.zzc.zzb(fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (zzgbu e2) {
                    objApply = this.zzd.apply(e2);
                    return objApply;
                } catch (IOException e3) {
                    objApply = this.zzd.apply(new zzgbu(e3));
                    return objApply;
                }
            } catch (FileNotFoundException unused) {
                objApply = this.zzc.zzc();
                return objApply;
            }
        }
        return objZzb;
    }

    public final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            File file = this.zza;
            zzgwk.zzb(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 5);
            sb.append(name);
            sb.append(".temp");
            File file2 = new File(parent, sb.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.zza)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e2) {
                file2.delete();
                throw e2;
            }
        }
        return null;
    }
}
