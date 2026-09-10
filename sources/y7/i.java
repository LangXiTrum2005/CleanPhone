package y7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f54247e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v1.j f54246d = new v1.j(13);
    public static final Parcelable.Creator<i> CREATOR = new l7.h(12);

    public i(Parcel parcel) {
        super(parcel);
        this.f54248c = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // y7.t
    public final String e() {
        return this.f54248c;
    }

    @Override // y7.t
    public final int k(n request) {
        kotlin.jvm.internal.n.f(request, "request");
        FragmentActivity fragmentActivityE = d().e();
        if (fragmentActivityE == null || fragmentActivityE.isFinishing()) {
            return 1;
        }
        h hVar = new h();
        hVar.F(fragmentActivityE.F(), "login_with_facebook");
        hVar.O(request);
        return 1;
    }

    public i(p pVar) {
        this.f54315b = pVar;
        this.f54248c = "device_auth";
    }
}
