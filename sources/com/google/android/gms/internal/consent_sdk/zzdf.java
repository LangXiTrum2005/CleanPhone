package com.google.android.gms.internal.consent_sdk;

import android.support.v4.media.a;
import com.vungle.ads.internal.model.Cookie;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzdf extends zzdb implements Set {
    private transient zzde zza;

    public static int zzf(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzdf zzi() {
        return zzdi.zza;
    }

    public static zzdf zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzm(4, "IABTCF_TCString", "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    public static zzdf zzk(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzm(5, "UMP_CoMoAdStoragePurposeConsentStatus", "UMP_CoMoAdUserDataPurposeConsentStatus", "UMP_CoMoAdPersonalizationPurposeConsentStatus", "UMP_CoMoAnalyticsStoragePurposeConsentStatus", Cookie.IABTCF_GDPR_APPLIES);
    }

    private static zzdf zzm(int i2, Object... objArr) {
        if (i2 == 0) {
            return zzdi.zza;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzdj(obj);
        }
        int iZzf = zzf(i2);
        Object[] objArr2 = new Object[iZzf];
        int i3 = iZzf - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArr[i6];
            if (obj2 == null) {
                throw new NullPointerException(a.h(i6, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzda.zza(iHashCode);
            while (true) {
                int i7 = iZza & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzdj(obj4);
        }
        if (zzf(i5) < iZzf / 2) {
            return zzm(i5, objArr);
        }
        if (i5 < 3) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new zzdi(objArr, i4, objArr2, i3, i5);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdf) && zzl() && ((zzdf) obj).zzl() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzdk iterator();

    public final zzde zzg() {
        zzde zzdeVar = this.zza;
        if (zzdeVar != null) {
            return zzdeVar;
        }
        zzde zzdeVarZzh = zzh();
        this.zza = zzdeVarZzh;
        return zzdeVarZzh;
    }

    public zzde zzh() {
        Object[] array = toArray();
        int i2 = zzde.zzd;
        return zzde.zzg(array, array.length);
    }

    public boolean zzl() {
        return false;
    }
}
