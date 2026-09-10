package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzep {
    private static final zzep zzb = new zzep(true);
    final zzgu zza = new zzgk(16);
    private boolean zzc;
    private boolean zzd;

    private zzep() {
    }

    public static zzep zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0045 A[RETURN] */
    private static final void zzd(zzeo zzeoVar, Object obj) {
        boolean z2;
        zzeoVar.zzb();
        zzez.zze(obj);
        zzhn zzhnVar = zzhn.zza;
        zzho zzhoVar = zzho.INT;
        switch (r0.zza()) {
            case INT:
                z2 = obj instanceof Integer;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z2 = obj instanceof Long;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z2 = obj instanceof Float;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z2 = obj instanceof Double;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z2 = obj instanceof String;
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzee) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzew)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzfw) || (obj instanceof zzfb)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzeoVar.zza()), zzeoVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzep zzepVar = new zzep();
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            Map.Entry entryZzg = this.zza.zzg(i2);
            zzepVar.zzc((zzeo) entryZzg.getKey(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzepVar.zzc((zzeo) entry.getKey(), entry.getValue());
        }
        zzepVar.zzd = this.zzd;
        return zzepVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzep) {
            return this.zza.equals(((zzep) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(zzeo zzeoVar, Object obj) {
        if (!zzeoVar.zzc()) {
            zzd(zzeoVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzd(zzeoVar, arrayList.get(i2));
            }
            obj = arrayList;
        }
        if (obj instanceof zzfb) {
            this.zzd = true;
        }
        this.zza.put(zzeoVar, obj);
    }

    private zzep(boolean z2) {
        zzb();
        zzb();
    }
}
