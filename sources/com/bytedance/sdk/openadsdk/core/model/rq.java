package com.bytedance.sdk.openadsdk.core.model;

import androidx.media3.extractor.text.ttml.a;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class rq {
    public boolean qdl = true;
    public boolean ud = true;
    public boolean lnr = true;
    public boolean mml = true;
    public boolean mzz = true;
    public boolean mo = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("ClickArea{clickUpperContentArea=");
        sb.append(this.qdl);
        sb.append(", clickUpperNonContentArea=");
        sb.append(this.ud);
        sb.append(", clickLowerContentArea=");
        sb.append(this.lnr);
        sb.append(", clickLowerNonContentArea=");
        sb.append(this.mml);
        sb.append(", clickButtonArea=");
        sb.append(this.mzz);
        sb.append(", clickVideoArea=");
        return a.r(sb, this.mo, AbstractJsonLexerKt.END_OBJ);
    }
}
