package qj;

import java.util.List;
import qk.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f49049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f49050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f49051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f49053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f49054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f49055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f49056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f49057i;

    public g(long j10, long j11, String str, String str2, boolean z10, Long l, Long l10, Long l11, String str3) {
        this.f49049a = j10;
        this.f49050b = j11;
        this.f49051c = str;
        this.f49052d = str2;
        this.f49053e = z10;
        this.f49054f = l;
        this.f49055g = l10;
        this.f49056h = l11;
        this.f49057i = str3;
    }

    public final List a() {
        return xj.o.Q(Long.valueOf(this.f49049a), Long.valueOf(this.f49050b), this.f49051c, this.f49052d, Boolean.valueOf(this.f49053e), this.f49054f, this.f49055g, this.f49056h, this.f49057i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return i0.B(a(), ((g) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        StringBuilder sbL = wi.d.l(this.f49049a, "ExoPlayerAudioTrackData(groupIndex=", ", trackIndex=");
        sbL.append(this.f49050b);
        sbL.append(", label=");
        sbL.append(this.f49051c);
        sbL.append(", language=");
        sbL.append(this.f49052d);
        sbL.append(", isSelected=");
        sbL.append(this.f49053e);
        sbL.append(", bitrate=");
        sbL.append(this.f49054f);
        sbL.append(", sampleRate=");
        sbL.append(this.f49055g);
        sbL.append(", channelCount=");
        sbL.append(this.f49056h);
        sbL.append(", codec=");
        sbL.append(this.f49057i);
        sbL.append(")");
        return sbL.toString();
    }
}
