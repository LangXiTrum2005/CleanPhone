package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzauo implements Comparator {
    private final boolean zza;

    public zzauo(boolean z2) {
        this.zza = z2;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparator comparatorZza;
        Object objZzn;
        Object objZzn2;
        int[] iArr = {446703183, 1862618146, 1081639777, -1087935358, -803036955, 1104011716, 5522510, 2017461929, 496612959};
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int iC = Z.c((i3 & (~i2)) | i4, (i2 & i5) | i6, i7, i8);
        int i10 = i9 % 496612959;
        zzaus zzausVar = (zzaus) obj;
        zzaus zzausVar2 = (zzaus) obj2;
        int i11 = zzausVar.zza;
        if (i11 != zzausVar2.zza) {
            throw new IllegalArgumentException();
        }
        int i12 = i10 ^ iC;
        try {
            if (i11 == 0) {
                throw null;
            }
            switch (i11 + i12) {
                case 0:
                    return 0;
                case 1:
                    if (this.zza) {
                        return zzausVar.zzl() != zzausVar2.zzl() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 2:
                    return Long.compare(zzausVar.zzm(), zzausVar2.zzm());
                case 3:
                    comparatorZza = zzatw.zzc;
                    objZzn = zzausVar.zzn();
                    objZzn2 = zzausVar2.zzn();
                    break;
                case 4:
                    objZzn = zzausVar.zzo();
                    objZzn2 = zzausVar2.zzo();
                    comparatorZza = zzgsn.zza(this);
                    break;
                case 5:
                    if (this.zza) {
                        return zzausVar.zzp() != zzausVar2.zzp() ? 1 : 0;
                    }
                    throw new IllegalArgumentException();
                case 6:
                    return Double.compare(zzausVar.zzq(), zzausVar2.zzq());
                default:
                    return 0;
            }
            return comparatorZza.compare(objZzn, objZzn2);
        } catch (zzaup e2) {
            throw new AssertionError(zzatu.zza("CEiv6BFfPnitUE+D"), e2);
        }
    }
}
