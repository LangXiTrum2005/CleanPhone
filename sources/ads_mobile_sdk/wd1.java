package ads_mobile_sdk;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wd1 implements MediationAdRequest {
    public final Set a;
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final Location f;

    public /* synthetic */ wd1(Set set, boolean z, int i, int i2, String str) {
        this(set, z, i, i2, str, null);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return 0;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final String getMaxAdContentRating() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForUnderAgeTreatment() {
        return this.d;
    }

    public wd1(Set set, boolean z, int i, int i2, String str, Location location) {
        this.a = set;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = location;
    }
}
