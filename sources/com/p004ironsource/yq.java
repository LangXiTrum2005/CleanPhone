package com.p004ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/ironsource/yq;", "", "Lcom/ironsource/vd$c;", "a", "Lcom/ironsource/vd$c;", "()Lcom/ironsource/vd$c;", "type", "Lorg/json/JSONObject;", "features", "<init>", "(Lorg/json/JSONObject;)V", "b", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class yq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f27802c = "type";
    public static final String d = "single";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f27803e = "onShowSuccess";
    public static final String f = "onLoadSuccess";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vd.c type;

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public yq(JSONObject features) {
        vd.c cVar;
        Intrinsics.f(features, "features");
        String strOptString = features.optString("type");
        if (strOptString == null) {
            cVar = null;
        } else {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1900843810) {
                if (iHashCode != -999907609) {
                    if (iHashCode == -902265784 && strOptString.equals("single")) {
                        cVar = vd.c.SINGLE;
                    } else {
                        cVar = null;
                    }
                } else if (strOptString.equals(f27803e)) {
                    cVar = vd.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                } else {
                    cVar = null;
                }
            } else if (strOptString.equals(f)) {
                cVar = vd.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            } else {
                cVar = null;
            }
        }
        this.type = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final vd.c getType() {
        return this.type;
    }
}
