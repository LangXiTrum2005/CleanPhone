package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
public class C1387cl {

    @Nullable
    public final ZM A00;
    public final Throwable A01;

    public C1387cl(@Nullable ZM zm, Throwable th) {
        this.A00 = zm;
        this.A01 = th;
    }
}
