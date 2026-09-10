package com.inmobi.commons.core.configs;

import com.inmobi.media.C3191q6;
import com.inmobi.media.C3192q7;
import com.inmobi.media.C3231t;
import com.inmobi.media.C3247u;
import com.inmobi.media.C3263v;
import com.inmobi.media.Dc;
import com.inmobi.media.Ec;
import com.inmobi.media.U6;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static C3191q6 a() {
        return new C3191q6().a(new Ec(com.smartdigimkt.q0.b.O, AdConfig.class), (Dc) new C3192q7(new a(), AdConfig.CacheConfig.class)).a(new Ec("allowedContentType", AdConfig.VastVideoConfig.class), (Dc) new U6(new C3231t(), String.class)).a(new Ec("gestures", AdConfig.RenderingConfig.class), (Dc) new U6(new C3247u(), Integer.TYPE)).a(new Ec("skipFields", AdConfig.ContextualDataConfig.class), (Dc) new U6(new C3263v(), String.class));
    }
}
