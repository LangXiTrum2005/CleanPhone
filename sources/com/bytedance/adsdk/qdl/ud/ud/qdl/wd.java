package com.bytedance.adsdk.qdl.ud.ud.qdl;

import com.p004ironsource.d9;
import com.p004ironsource.mediationsdk.metadata.a;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class wd implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    private final Object qdl;

    public wd(String str) {
        if (str.equalsIgnoreCase(a.g)) {
            this.qdl = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.qdl = Boolean.FALSE;
        } else {
            if (!str.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                throw new IllegalArgumentException();
            }
            this.qdl = null;
        }
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        return this.qdl;
    }

    public String toString() {
        return android.support.v4.media.a.q(new StringBuilder("KeywordNode [keywordValue="), this.qdl, d9.i.f24752e);
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        Object obj = this.qdl;
        return obj != null ? obj.toString() : "NULL";
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.mo.CONSTANT;
    }
}
