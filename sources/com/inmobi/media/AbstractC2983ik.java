package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.MetaInfo;
import java.util.Map;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: renamed from: com.inmobi.media.ik, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2983ik {
    public static final Map a(G g) {
        String creativeType;
        Intrinsics.checkNotNullParameter(g, "<this>");
        Map mapKowloon = seminary.kowloon(formularize.attabal("plId", Long.valueOf(g.a.a.a)), formularize.attabal("plType", g.a.a.g), formularize.attabal("adType", "native"), formularize.attabal("markupType", g.c), formularize.attabal("creativeId", "\"" + g.e + "\""), formularize.attabal("impressionId", "\"" + g.m.b + "\""), formularize.attabal("isRewarded", Boolean.valueOf(g.b.a)));
        MetaInfo metaInfo = g.d;
        if (metaInfo != null && (creativeType = metaInfo.getCreativeType()) != null) {
            mapKowloon.put("creativeType", creativeType);
        }
        String str = g.i;
        if (str != null) {
            mapKowloon.put("metadataBlob", str);
        }
        return mapKowloon;
    }

    public static final Map a(C3139p1 c3139p1) {
        Intrinsics.checkNotNullParameter(c3139p1, "<this>");
        return seminary.kowloon(formularize.attabal("plId", Long.valueOf(c3139p1.a.a)), formularize.attabal("plType", c3139p1.a.g), formularize.attabal("adType", "native"));
    }
}
