package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: compiled from: ListFieldSchemaLite.java */
/* JADX INFO: loaded from: classes.dex */
public final class oilcan implements trm {
    public static <E> gintrap.beachfront<E> wireman(Object obj, long j) {
        return (gintrap.beachfront) sayid.sealless(obj, j);
    }

    @Override // androidx.datastore.preferences.protobuf.trm
    public void attabal(Object obj, long j) {
        wireman(obj, j).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.trm
    public <L> List<L> dern(Object obj, long j) {
        gintrap.beachfront beachfrontVarWireman = wireman(obj, j);
        if (beachfrontVarWireman.isModifiable()) {
            return beachfrontVarWireman;
        }
        int size = beachfrontVarWireman.size();
        gintrap.beachfront beachfrontVarMutableCopyWithCapacity = beachfrontVarWireman.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        sayid.splinterproof(obj, j, beachfrontVarMutableCopyWithCapacity);
        return beachfrontVarMutableCopyWithCapacity;
    }

    @Override // androidx.datastore.preferences.protobuf.trm
    public <E> void saneness(Object obj, Object obj2, long j) {
        gintrap.beachfront beachfrontVarWireman = wireman(obj, j);
        gintrap.beachfront beachfrontVarWireman2 = wireman(obj2, j);
        int size = beachfrontVarWireman.size();
        int size2 = beachfrontVarWireman2.size();
        if (size > 0 && size2 > 0) {
            if (!beachfrontVarWireman.isModifiable()) {
                beachfrontVarWireman = beachfrontVarWireman.mutableCopyWithCapacity(size2 + size);
            }
            beachfrontVarWireman.addAll(beachfrontVarWireman2);
        }
        if (size > 0) {
            beachfrontVarWireman2 = beachfrontVarWireman;
        }
        sayid.splinterproof(obj, j, beachfrontVarWireman2);
    }
}
