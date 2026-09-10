package v1;

import android.text.TextUtils;
import com.ironsource.X3;
import i1.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f52426c;

    public t(String str, String str2, List list) {
        this.f52424a = str;
        this.f52425b = str2;
        this.f52426c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (TextUtils.equals(this.f52424a, tVar.f52424a) && TextUtils.equals(this.f52425b, tVar.f52425b) && this.f52426c.equals(tVar.f52426c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f52424a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f52425b;
        return this.f52426c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strQ;
        StringBuilder sb2 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f52424a;
        if (str != null) {
            strQ = defpackage.e.q(this.f52425b, X3.j.f27836e, d5.u.k(" [", str, ", "));
        } else {
            strQ = "";
        }
        sb2.append(strQ);
        return sb2.toString();
    }
}
