package y7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q7.y;
import q7.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends u {
    public static final Parcelable.Creator<m> CREATOR = new l7.h(15);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f54264e;

    public m(p pVar) {
        super(pVar);
        this.f54264e = "katana_proxy_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // y7.t
    public final String e() {
        return this.f54264e;
    }

    @Override // y7.t
    public final int k(n request) {
        kotlin.jvm.internal.n.f(request, "request");
        boolean z10 = l7.s.f45224n && q7.f.c() != null && wi.d.b(request.f54265a);
        String strE = go.k.E();
        d().e();
        String applicationId = request.f54268d;
        HashSet permissions = request.f54266b;
        boolean zA = request.a();
        int i10 = request.f54267c;
        int i11 = i10 == 0 ? 1 : i10;
        String strC = c(request.f54271g);
        String authType = request.f54274j;
        String str = request.l;
        boolean z11 = request.f54276m;
        boolean z12 = request.f54278o;
        boolean z13 = request.f54279p;
        String str2 = request.f54282s;
        int i12 = request.f54285v;
        if (i12 != 0) {
            wi.d.n(i12);
        }
        String str3 = request.f54269e;
        String str4 = request.f54270f;
        boolean z14 = request.f54280q;
        String str5 = request.f54281r;
        z zVar = z.f48798a;
        ArrayList<Intent> arrayList = null;
        if (!v7.a.b(z.class)) {
            try {
                kotlin.jvm.internal.n.f(applicationId, "applicationId");
                kotlin.jvm.internal.n.f(permissions, "permissions");
                kotlin.jvm.internal.n.f(authType, "authType");
                ArrayList arrayList2 = z.f48799b;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    boolean z15 = z13;
                    boolean z16 = z12;
                    String str6 = str2;
                    String str7 = str3;
                    Intent intentD = z.d((y) it.next(), applicationId, permissions, strE, zA, i11, strC, authType, z10, str, z11, 1, z16, z15, str6, str7, str4, z14, str5, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                    if (intentD != null) {
                        arrayList3.add(intentD);
                    }
                    z12 = z16;
                    z13 = z15;
                    str2 = str6;
                    str3 = str7;
                }
                arrayList = arrayList3;
            } catch (Throwable th2) {
                v7.a.a(z.class, th2);
            }
        }
        a("e2e", strE);
        int i13 = 0;
        for (Intent intent : arrayList) {
            i13++;
            l7.s sVar = l7.s.f45212a;
            q7.f.o();
            if (t(intent)) {
                return i13;
            }
        }
        return 0;
    }

    public m(Parcel parcel) {
        super(parcel, 0);
        this.f54264e = "katana_proxy_auth";
    }
}
