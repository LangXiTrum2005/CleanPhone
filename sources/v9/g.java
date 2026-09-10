package v9;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.zze;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.internal.auth.j2;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import eb.d0;
import j9.h;
import j9.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i implements AppSetIdClient {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d0 f52508n = new d0("AppSet.API", new j2(8), new j9.d());
    public final Context l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i9.e f52509m;

    public g(Context context, i9.e eVar) {
        super(context, null, f52508n, j9.b.f43727o9, h.f43737c);
        this.l = context;
        this.f52509m = eVar;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        if (this.f52509m.c(this.l, 212800000) != 0) {
            return Tasks.forException(new j9.e(new Status(17, null, null, null)));
        }
        m mVarB = m.b();
        mVarB.f11729a = new i9.c[]{zze.zza};
        mVarB.f11732d = new un.a(this);
        mVarB.f11730b = false;
        mVarB.f11731c = 27601;
        return c(0, mVarB.a());
    }
}
