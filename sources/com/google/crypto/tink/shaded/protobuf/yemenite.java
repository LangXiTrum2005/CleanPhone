package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

/* JADX INFO: compiled from: ListFieldSchemaLite.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yemenite implements oilcan {
    public static <E> rotuma.taiyuan<E> wireman(Object obj, long j) {
        return (rotuma.taiyuan) sayid.sealless(obj, j);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.oilcan
    public void attabal(Object obj, long j) {
        wireman(obj, j).makeImmutable();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.oilcan
    public <L> List<L> dern(Object obj, long j) {
        rotuma.taiyuan taiyuanVarWireman = wireman(obj, j);
        if (taiyuanVarWireman.isModifiable()) {
            return taiyuanVarWireman;
        }
        int size = taiyuanVarWireman.size();
        rotuma.taiyuan taiyuanVarMutableCopyWithCapacity = taiyuanVarWireman.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        sayid.splinterproof(obj, j, taiyuanVarMutableCopyWithCapacity);
        return taiyuanVarMutableCopyWithCapacity;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.oilcan
    public <E> void saneness(Object obj, Object obj2, long j) {
        rotuma.taiyuan taiyuanVarWireman = wireman(obj, j);
        rotuma.taiyuan taiyuanVarWireman2 = wireman(obj2, j);
        int size = taiyuanVarWireman.size();
        int size2 = taiyuanVarWireman2.size();
        if (size > 0 && size2 > 0) {
            if (!taiyuanVarWireman.isModifiable()) {
                taiyuanVarWireman = taiyuanVarWireman.mutableCopyWithCapacity(size2 + size);
            }
            taiyuanVarWireman.addAll(taiyuanVarWireman2);
        }
        if (size > 0) {
            taiyuanVarWireman2 = taiyuanVarWireman;
        }
        sayid.splinterproof(obj, j, taiyuanVarWireman2);
    }
}
