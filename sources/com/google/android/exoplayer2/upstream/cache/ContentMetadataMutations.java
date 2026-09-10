package com.google.android.exoplayer2.upstream.cache;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ContentMetadataMutations {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f18877a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18878b = new ArrayList();

    public final void a(Object obj, String str) {
        HashMap map = this.f18877a;
        obj.getClass();
        map.put(str, obj);
        this.f18878b.remove(str);
    }
}
