package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f8214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f8215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f8216c;

    public j4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f8214a = view;
        this.f8215b = friendlyObstructionPurpose;
        this.f8216c = str;
    }

    public String a() {
        return this.f8216c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f8215b;
    }

    public View c() {
        return this.f8214a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j4 j4Var = (j4) obj;
            View view = this.f8214a;
            if (view == null ? j4Var.f8214a != null : !view.equals(j4Var.f8214a)) {
                return false;
            }
            if (this.f8215b != j4Var.f8215b) {
                return false;
            }
            String str = this.f8216c;
            if (str != null) {
                return str.equals(j4Var.f8216c);
            }
            if (j4Var.f8216c == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        View view = this.f8214a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f8215b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f8216c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
