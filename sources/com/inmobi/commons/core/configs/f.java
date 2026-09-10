package com.inmobi.commons.core.configs;

import com.inmobi.media.C2989dd;
import com.inmobi.media.C3006ed;
import com.inmobi.media.C3022fd;
import com.inmobi.media.C3038gd;
import com.inmobi.media.C3054hd;
import com.inmobi.media.C3191q6;
import com.inmobi.media.C3192q7;
import com.inmobi.media.Dc;
import com.inmobi.media.Ec;
import com.inmobi.media.U6;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static C3191q6 a() {
        return new C3191q6().a(new Ec("carrierNames", SignalsConfig.NovatiqConfig.class), (Dc) new U6(new C2989dd(), String.class)).a(new Ec("control", SignalsConfig.SessionConfig.class), (Dc) new U6(new C3006ed(), Integer.TYPE)).a(new Ec("generalKeys", SignalsConfig.PublisherConfig.class), (Dc) new C3192q7(new C3022fd(), String.class)).a(new Ec("adSpecificKeys", SignalsConfig.PublisherConfig.class), (Dc) new C3192q7(new C3038gd(), String.class)).a(new Ec("versionList", SignalsConfig.Purchases.class), (Dc) new U6(new C3054hd(), String.class));
    }
}
