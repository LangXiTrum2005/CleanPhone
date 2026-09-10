package co;

import com.google.android.gms.internal.auth.i;
import java.util.regex.Pattern;
import lo.n;
import xn.o;
import xn.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f6806c;

    public h(String str, long j10, n nVar) {
        this.f6804a = str;
        this.f6805b = j10;
        this.f6806c = nVar;
    }

    @Override // xn.y
    public final long h() {
        return this.f6805b;
    }

    @Override // xn.y
    public final o k() {
        String str = this.f6804a;
        if (str == null) {
            return null;
        }
        Pattern pattern = o.f53998c;
        return i.B(str);
    }

    @Override // xn.y
    public final lo.g n() {
        return this.f6806c;
    }
}
