package com.thinkup.core.common.o0o;

import androidx.media3.extractor.text.ttml.a;
import com.thinkup.core.common.on.mmm;
import com.thinkup.core.oo.n0;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {
    public String m;
    public n0 m0;
    public on mm;
    public Integer[] mn;
    public int mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f42166n;
    public int o;
    public int o0;
    public mmm om;
    public com.thinkup.core.common.on.n0 on;
    public double oo;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharedPlaceInfo{format=");
        sb.append(this.o);
        sb.append(", placementId='");
        sb.append(this.m);
        sb.append("', requestInterval=");
        sb.append(this.f42166n);
        sb.append(", adCacheNumThreshold=");
        sb.append(this.o0);
        sb.append(", adCachePriceThreshold=");
        sb.append(this.oo);
        sb.append(", realFormatLoadParams=");
        sb.append(this.om);
        sb.append(", failRetryReqCount=");
        sb.append(this.mo);
        sb.append(", loadModes=");
        return a.p(sb, Arrays.toString(this.mn), AbstractJsonLexerKt.END_OBJ);
    }
}
