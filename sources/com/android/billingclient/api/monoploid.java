package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.internal.play_billing.zzhl;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class monoploid implements kowloon {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final polloi f16527dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public zzgu f16528saneness;

    public monoploid(Context context, zzgu zzguVar) {
        this.f16527dern = new polloi(context);
        this.f16528saneness = zzguVar;
    }

    @Override // com.android.billingclient.api.kowloon
    public final void attabal(zzge zzgeVar, int i) {
        try {
            zzgt zzgtVar = (zzgt) this.f16528saneness.zzi();
            zzgtVar.zzl(i);
            this.f16528saneness = (zzgu) zzgtVar.zzf();
            saneness(zzgeVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.kowloon
    public final void dern(zzhl zzhlVar) {
        if (zzhlVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn(this.f16528saneness);
            zzhdVarZzy.zzo(zzhlVar);
            this.f16527dern.attabal((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.kowloon
    public final void marial(zzga zzgaVar) {
        if (zzgaVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn(this.f16528saneness);
            zzhdVarZzy.zzl(zzgaVar);
            this.f16527dern.attabal((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.kowloon
    public final void saneness(zzge zzgeVar) {
        if (zzgeVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn(this.f16528saneness);
            zzhdVarZzy.zzm(zzgeVar);
            this.f16527dern.attabal((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.kowloon
    public final void wireman(zzga zzgaVar, int i) {
        try {
            zzgt zzgtVar = (zzgt) this.f16528saneness.zzi();
            zzgtVar.zzl(i);
            this.f16528saneness = (zzgu) zzgtVar.zzf();
            marial(zzgaVar);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }
}
