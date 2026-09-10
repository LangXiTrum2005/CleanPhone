package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcgq implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final boolean zza(zzcfk zzcfkVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcgp zzcgpVar = (zzcgp) it.next();
            if (zzcgpVar.zza == zzcfkVar) {
                arrayList.add(zzcgpVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcgp) it2.next()).zzb.zzl();
        }
        return true;
    }

    public final zzcgp zzb(zzcfk zzcfkVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcgp zzcgpVar = (zzcgp) it.next();
            if (zzcgpVar.zza == zzcfkVar) {
                return zzcgpVar;
            }
        }
        return null;
    }

    public final void zzc(zzcgp zzcgpVar) {
        this.zza.add(zzcgpVar);
    }

    public final void zzd(zzcgp zzcgpVar) {
        this.zza.remove(zzcgpVar);
    }
}
