package xn;

import com.applovin.impl.ca;
import com.ironsource.B5;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f53971j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f53972k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f53973m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f53974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f53975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f53976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f53977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f53978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f53979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f53980g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f53981h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f53982i;

    public j(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f53974a = str;
        this.f53975b = str2;
        this.f53976c = j10;
        this.f53977d = str3;
        this.f53978e = str4;
        this.f53979f = z10;
        this.f53980g = z11;
        this.f53981h = z12;
        this.f53982i = z13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.n.a(jVar.f53974a, this.f53974a) && kotlin.jvm.internal.n.a(jVar.f53975b, this.f53975b) && jVar.f53976c == this.f53976c && kotlin.jvm.internal.n.a(jVar.f53977d, this.f53977d) && kotlin.jvm.internal.n.a(jVar.f53978e, this.f53978e) && jVar.f53979f == this.f53979f && jVar.f53980g == this.f53980g && jVar.f53981h == this.f53981h && jVar.f53982i == this.f53982i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f53982i) + ((Boolean.hashCode(this.f53981h) + ((Boolean.hashCode(this.f53980g) + ((Boolean.hashCode(this.f53979f) + d5.u.e(d5.u.e(ca.j(this.f53976c, d5.u.e(d5.u.e(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.f53974a), 31, this.f53975b), 31), 31, this.f53977d), 31, this.f53978e)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f53974a);
        sb2.append(B5.U);
        sb2.append(this.f53975b);
        if (this.f53981h) {
            long j10 = this.f53976c;
            if (j10 == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                String str = ((DateFormat) co.d.f6794a.get()).format(new Date(j10));
                kotlin.jvm.internal.n.e(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(str);
            }
        }
        if (!this.f53982i) {
            sb2.append("; domain=");
            sb2.append(this.f53977d);
        }
        sb2.append("; path=");
        sb2.append(this.f53978e);
        if (this.f53979f) {
            sb2.append("; secure");
        }
        if (this.f53980g) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "toString()");
        return string;
    }
}
