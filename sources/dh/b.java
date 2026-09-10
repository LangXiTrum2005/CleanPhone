package dh;

import ae.l;
import android.graphics.Bitmap;
import android.util.Size;
import com.google.android.gms.internal.auth.i;
import eh.k;
import java.util.Date;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final l f38875n = new l(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.d f38877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f38879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f38880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f38881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Date f38882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Date f38883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f38884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f38885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f38886k;
    public ah.a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h f38887m;

    public b(String str, ah.d dVar, boolean z10, boolean z11, Size size, Long l, Date date, Date date2, boolean z12, String potentiallySimilarIdentifier, String str2, ah.a aVar) {
        n.f(potentiallySimilarIdentifier, "potentiallySimilarIdentifier");
        this.f38876a = str;
        this.f38877b = dVar;
        this.f38878c = z10;
        this.f38879d = z11;
        this.f38880e = size;
        this.f38881f = l;
        this.f38882g = date;
        this.f38883h = date2;
        this.f38884i = z12;
        this.f38885j = potentiallySimilarIdentifier;
        this.f38886k = str2;
        this.l = aVar;
    }

    public final String a() {
        h hVarB = b();
        if (hVarB == null) {
            return null;
        }
        ah.d dVar = this.f38877b;
        int iOrdinal = dVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return null;
                }
                throw new aa.b((byte) 0, 20);
            }
        }
        String str = dVar.f3605a;
        Size size = this.f38880e;
        int width = size.getWidth();
        int height = size.getHeight();
        long j10 = hVarB.f38898a.f38888a;
        Long l = this.f38881f;
        long jLongValue = l != null ? l.longValue() : 0L;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("_");
        sb2.append(width);
        sb2.append("_");
        sb2.append(height);
        q4.a.r(sb2, "_", j10, "_");
        sb2.append(this.f38884i);
        sb2.append("_");
        sb2.append(jLongValue);
        return sb2.toString();
    }

    public final h b() {
        h hVar = this.f38887m;
        if (hVar != null) {
            return hVar;
        }
        Bitmap bitmapF = k.f40087a.f(this);
        if (bitmapF == null) {
            return null;
        }
        h hVarG = i.G(bitmapF, this.f38877b);
        this.f38887m = hVarG;
        return hVarG;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        n.d(obj, "null cannot be cast to non-null type com.storage.androidcleaner.flutter.services.scan.models.CGAsset");
        b bVar = (b) obj;
        return n.a(this.f38876a, bVar.f38876a) && n.a(this.f38883h, bVar.f38883h);
    }

    public final int hashCode() {
        int iHashCode = this.f38876a.hashCode() * 31;
        Date date = this.f38883h;
        return iHashCode + (date != null ? date.hashCode() : 0);
    }
}
