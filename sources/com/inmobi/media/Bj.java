package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.Image;
import frenchy.saneness;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class Bj implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return saneness.wireman(Integer.valueOf(((Image) obj2).getWidth()), Integer.valueOf(((Image) obj).getWidth()));
    }
}
