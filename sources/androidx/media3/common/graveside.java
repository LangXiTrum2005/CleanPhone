package androidx.media3.common;

import android.os.Bundle;
import decarock.grimness;

/* JADX INFO: compiled from: Label.java */
/* JADX INFO: loaded from: classes.dex */
public class graveside {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String f10957attabal;
    public final String value;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f10956saneness = grimness.igbo(0);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String f10955dern = grimness.igbo(1);

    public graveside(String str, String str2) {
        this.f10957attabal = grimness.vesuvio(str);
        this.value = str2;
    }

    public static graveside attabal(Bundle bundle) {
        return new graveside(bundle.getString(f10956saneness), (String) decarock.attabal.marial(bundle.getString(f10955dern)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            graveside gravesideVar = (graveside) obj;
            if (grimness.dern(this.f10957attabal, gravesideVar.f10957attabal) && grimness.dern(this.value, gravesideVar.value)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.f10957attabal;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public Bundle saneness() {
        Bundle bundle = new Bundle();
        String str = this.f10957attabal;
        if (str != null) {
            bundle.putString(f10956saneness, str);
        }
        bundle.putString(f10955dern, this.value);
        return bundle;
    }
}
