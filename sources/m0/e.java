package m0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45684a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipData f45685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f45688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f45689f;

    public /* synthetic */ e() {
    }

    @Override // m0.d
    public void a(Uri uri) {
        this.f45688e = uri;
    }

    @Override // m0.f
    public ContentInfo b() {
        return null;
    }

    @Override // m0.d
    public g build() {
        return new g(new e(this));
    }

    @Override // m0.f
    public int c() {
        return this.f45686c;
    }

    @Override // m0.f
    public ClipData d() {
        return this.f45685b;
    }

    @Override // m0.d
    public void e(int i10) {
        this.f45687d = i10;
    }

    @Override // m0.f
    public int f() {
        return this.f45687d;
    }

    @Override // m0.d
    public void setExtras(Bundle bundle) {
        this.f45689f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f45684a) {
            case 1:
                Uri uri = this.f45688e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f45685b.getDescription());
                sb2.append(", source=");
                int i10 = this.f45686c;
                if (i10 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i10 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i10 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i10 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i10 != 4) {
                    strValueOf = i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb2.append(strValueOf);
                sb2.append(", flags=");
                int i11 = this.f45687d;
                sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                return defpackage.e.q(this.f45689f != null ? ", hasExtras" : "", "}", sb2);
            default:
                return super.toString();
        }
    }

    public e(e eVar) {
        ClipData clipData = eVar.f45685b;
        clipData.getClass();
        this.f45685b = clipData;
        int i10 = eVar.f45686c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i10 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f45686c = i10;
        int i11 = eVar.f45687d;
        if ((i11 & 1) == i11) {
            this.f45687d = i11;
            this.f45688e = eVar.f45688e;
            this.f45689f = eVar.f45689f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
