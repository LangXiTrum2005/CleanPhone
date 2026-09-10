package qj;

import java.util.List;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f49037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f49040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f49041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f49042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f49043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f49044h;

    public e(String str, String str2, String str3, boolean z10, Long l, Long l10, Long l11, String str4) {
        this.f49037a = str;
        this.f49038b = str2;
        this.f49039c = str3;
        this.f49040d = z10;
        this.f49041e = l;
        this.f49042f = l10;
        this.f49043g = l11;
        this.f49044h = str4;
    }

    public final List a() {
        return xj.o.Q(this.f49037a, this.f49038b, this.f49039c, Boolean.valueOf(this.f49040d), this.f49041e, this.f49042f, this.f49043g, this.f49044h);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(a(), ((e) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder sbV = defpackage.e.v("AudioTrackMessage(id=", this.f49037a, ", label=", this.f49038b, ", language=");
        sbV.append(this.f49039c);
        sbV.append(", isSelected=");
        sbV.append(this.f49040d);
        sbV.append(", bitrate=");
        sbV.append(this.f49041e);
        sbV.append(", sampleRate=");
        sbV.append(this.f49042f);
        sbV.append(", channelCount=");
        sbV.append(this.f49043g);
        sbV.append(", codec=");
        sbV.append(this.f49044h);
        sbV.append(")");
        return sbV.toString();
    }
}
