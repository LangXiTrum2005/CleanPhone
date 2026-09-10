package com.inmobi.media;

import frenchy.saneness;
import java.util.Comparator;
import java.util.Objects;
import p002kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.um, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3284um implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Pair pair = (Pair) obj;
        String str = ((C3159pl) pair.getFirst()).c;
        Objects.toString(pair.getSecond());
        System.out.getClass();
        Double d = (Double) pair.getSecond();
        Pair pair2 = (Pair) obj2;
        String str2 = ((C3159pl) pair2.getFirst()).c;
        Objects.toString(pair2.getSecond());
        System.out.getClass();
        return saneness.wireman(d, (Double) pair2.getSecond());
    }
}
