package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    private static final HashMap zzc;
    final Set zza;
    final int zzb;
    private ArrayList zzd;
    private int zze;
    private zzs zzf;

    static {
        HashMap map = new HashMap();
        zzc = map;
        map.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzu.class));
        map.put("progress", FastJsonResponse.Field.forConcreteType("progress", 4, zzs.class));
    }

    public zzo() {
        this.zza = new HashSet(1);
        this.zzb = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()));
        }
        this.zzd = arrayList;
        this.zza.add(Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(safeParcelableFieldId), fastJsonResponse.getClass().getCanonicalName()));
        }
        this.zzf = (zzs) fastJsonResponse;
        this.zza.add(Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return zzc;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return Integer.valueOf(this.zzb);
        }
        if (safeParcelableFieldId == 2) {
            return this.zzd;
        }
        if (safeParcelableFieldId == 4) {
            return this.zzf;
        }
        throw new IllegalStateException(a.h(field.getSafeParcelableFieldId(), "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.zza.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.zza;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.zzb);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.zze);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel, 4, this.zzf, i2, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzo(Set set, int i2, ArrayList arrayList, int i3, zzs zzsVar) {
        this.zza = set;
        this.zzb = i2;
        this.zzd = arrayList;
        this.zze = i3;
        this.zzf = zzsVar;
    }
}
