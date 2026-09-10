package com.startapp.sdk.ads.video.tracking;

import com.startapp.json.TypeClassInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@TypeClassInfo(extendsClass = true)
public class FractionTrackingLink extends VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 1389232981938306043L;
    private int fraction;

    public final void a(int i2) {
        this.fraction = i2;
    }

    public final int g() {
        return this.fraction;
    }
}
