package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgtr {
    public static boolean zza(Iterable iterable, zzgqb zzgqbVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgqbVar.getClass();
            return zzc((List) iterable, zzgqbVar);
        }
        Iterator it = iterable.iterator();
        zzgqbVar.getClass();
        boolean z2 = false;
        while (it.hasNext()) {
            if (zzgqbVar.zza(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgvr it = ((zzgvi) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzgqb zzgqbVar) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < list.size()) {
            Object obj = list.get(i2);
            if (!zzgqbVar.zza(obj)) {
                if (i2 > i3) {
                    try {
                        list.set(i3, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgqbVar, i3, i2);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgqbVar, i3, i2);
                        return true;
                    }
                }
                i3++;
            }
            i2++;
        }
        list.subList(i3, list.size()).clear();
        return i2 != i3;
    }

    private static void zzd(List list, zzgqb zzgqbVar, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (zzgqbVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            } else {
                list.remove(i3);
            }
        }
    }
}
