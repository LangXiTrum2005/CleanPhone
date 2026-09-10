package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzftr extends AsyncTask {
    private zzfts zza;
    protected final zzftj zzd;

    public zzftr(zzftj zzftjVar) {
        this.zzd = zzftjVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfts zzftsVar = this.zza;
        if (zzftsVar != null) {
            zzftsVar.zzb(this);
        }
    }

    public final void zzb(zzfts zzftsVar) {
        this.zza = zzftsVar;
    }
}
