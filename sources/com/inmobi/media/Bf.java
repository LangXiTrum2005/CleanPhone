package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class Bf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22730c;
    public final int d;

    public Bf(int i2, int i3, int i4, int i5) {
        this.f22728a = i2;
        this.f22729b = i3;
        this.f22730c = i4;
        this.d = i5;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TtmlNode.LEFT, B2.a(this.f22728a));
            jSONObject.put("top", B2.a(this.f22729b));
            jSONObject.put(TtmlNode.RIGHT, B2.a(this.f22730c));
            jSONObject.put("bottom", B2.a(this.d));
            return jSONObject;
        } catch (Exception e2) {
            S5 s5 = S5.f23167a;
            S5.d.a(AbstractC3285w5.a(e2, "event"));
            return new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bf)) {
            return false;
        }
        Bf bf = (Bf) obj;
        return this.f22728a == bf.f22728a && this.f22729b == bf.f22729b && this.f22730c == bf.f22730c && this.d == bf.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + androidx.media3.extractor.text.ttml.a.a(this.f22730c, androidx.media3.extractor.text.ttml.a.a(this.f22729b, Integer.hashCode(this.f22728a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets(left=");
        sb.append(this.f22728a);
        sb.append(", top=");
        sb.append(this.f22729b);
        sb.append(", right=");
        sb.append(this.f22730c);
        sb.append(", bottom=");
        return android.support.v4.media.a.p(sb, this.d, ')');
    }
}
