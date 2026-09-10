package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes3.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new zzb();
    final int zza;
    int zzb;

    @Deprecated
    String zzc;
    Account zzd;

    public AccountChangeEventsRequest() {
        this.zza = 1;
    }

    public Account getAccount() {
        return this.zzd;
    }

    @Deprecated
    public String getAccountName() {
        return this.zzc;
    }

    public int getEventIndex() {
        return this.zzb;
    }

    public AccountChangeEventsRequest setAccount(Account account) {
        this.zzd = account;
        return this;
    }

    @Deprecated
    public AccountChangeEventsRequest setAccountName(String str) {
        this.zzc = str;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int i2) {
        this.zzb = i2;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i2, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public AccountChangeEventsRequest(int i2, int i3, String str, Account account) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.zzd = account;
        } else {
            this.zzd = new Account(str, "com.google");
        }
    }
}
