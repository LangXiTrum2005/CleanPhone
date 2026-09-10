package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import frenchy.saneness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.inmobi.media.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3406zj implements Comparator {
    public final /* synthetic */ int a;

    public C3406zj(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return saneness.wireman(Integer.valueOf(Math.abs(((Image) obj).getWidth() - this.a)), Integer.valueOf(Math.abs(((Image) obj2).getWidth() - this.a)));
    }
}
