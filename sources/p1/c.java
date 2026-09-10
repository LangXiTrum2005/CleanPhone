package p1;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1.p f47972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1.p f47973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f47974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47975e;

    public c(String str, i1.p pVar, i1.p pVar2, int i10, int i11) {
        go.k.i(i10 == 0 || i11 == 0);
        go.k.i(true ^ TextUtils.isEmpty(str));
        this.f47971a = str;
        pVar.getClass();
        this.f47972b = pVar;
        pVar2.getClass();
        this.f47973c = pVar2;
        this.f47974d = i10;
        this.f47975e = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f47974d == cVar.f47974d && this.f47975e == cVar.f47975e && this.f47971a.equals(cVar.f47971a) && this.f47972b.equals(cVar.f47972b) && this.f47973c.equals(cVar.f47973c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f47973c.hashCode() + ((this.f47972b.hashCode() + d5.u.e((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f47974d) * 31) + this.f47975e) * 31, 31, this.f47971a)) * 31);
    }
}
