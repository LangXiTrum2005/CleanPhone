package h9;

import android.os.Bundle;
import android.util.Log;
import com.applovin.impl.ca;
import com.google.android.gms.internal.ads.zs;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f42279b = new TaskCompletionSource();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f42281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f42282e;

    public j(int i10, int i11, Bundle bundle, int i12) {
        this.f42282e = i12;
        this.f42278a = i10;
        this.f42280c = i11;
        this.f42281d = bundle;
    }

    public final boolean a() {
        switch (this.f42282e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String string = toString();
            String strValueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", u.h(new StringBuilder(string.length() + 16 + strValueOf.length()), "Finishing ", string, " with ", strValueOf));
        }
        this.f42279b.setResult(bundle);
    }

    public final void c(zs zsVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String string = toString();
            String string2 = zsVar.toString();
            Log.d("MessengerIpcClient", u.h(new StringBuilder(string.length() + 14 + string2.length()), "Failing ", string, " with ", string2));
        }
        this.f42279b.setException(zsVar);
    }

    public final String toString() {
        int i10 = this.f42280c;
        int length = String.valueOf(i10).length();
        int i11 = this.f42278a;
        int length2 = String.valueOf(i11).length();
        boolean zA = a();
        StringBuilder sb2 = new StringBuilder(ca.h(length, 19, length2, 8, String.valueOf(zA).length()) + 1);
        l1.d.p(sb2, "Request { what=", i10, " id=", i11);
        sb2.append(" oneWay=");
        sb2.append(zA);
        sb2.append("}");
        return sb2.toString();
    }
}
