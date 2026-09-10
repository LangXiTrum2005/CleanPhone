package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes3.dex */
public class ModuleInstallResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new zad();
    private final int zaa;
    private final boolean zab;

    public ModuleInstallResponse(int i2) {
        this(i2, false);
    }

    public boolean areModulesAlreadyInstalled() {
        return this.zaa == 0;
    }

    public int getSessionId() {
        return this.zaa;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        SafeParcelWriter.writeBoolean(parcel, 2, this.zab);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zaa() {
        return this.zab;
    }

    public ModuleInstallResponse(int i2, boolean z2) {
        this.zaa = i2;
        this.zab = z2;
    }
}
