package zc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends l9.a {
    public static final Parcelable.Creator<t> CREATOR = new l7.h(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f54874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x.e f54875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f54876c;

    public t(Bundle bundle) {
        this.f54874a = bundle;
    }

    public final HashMap b() {
        if (this.f54875b == null) {
            x.e eVar = new x.e(0);
            Bundle bundle = this.f54874a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        eVar.put(str, str2);
                    }
                }
            }
            this.f54875b = eVar;
        }
        return new HashMap(this.f54875b);
    }

    public final String h() {
        Bundle bundle = this.f54874a;
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public final s m() {
        if (this.f54876c == null) {
            Bundle bundle = this.f54874a;
            if (xh.e.l(bundle)) {
                this.f54876c = new s(new xh.e(bundle));
            }
        }
        return this.f54876c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iR = r9.b.R(parcel, 20293);
        r9.b.C(parcel, 2, this.f54874a);
        r9.b.S(parcel, iR);
    }
}
