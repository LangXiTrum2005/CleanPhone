package com.inmobi.media;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import org.json.JSONObject;
import patroclinal.taiyuan;

/* JADX INFO: loaded from: classes3.dex */
public final class vo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public vo(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TtmlNode.LEFT, F3.a(this.a));
            jSONObject.put("top", F3.a(this.b));
            jSONObject.put(TtmlNode.RIGHT, F3.a(this.c));
            jSONObject.put("bottom", F3.a(this.d));
            return jSONObject;
        } catch (Exception e) {
            taiyuan taiyuanVar = P9.a;
            P9.a(new L2(e));
            return new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return this.a == voVar.a && this.b == voVar.b && this.c == voVar.c && this.d == voVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + AbstractC2906fi.a(this.c, AbstractC2906fi.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + ")";
    }
}
