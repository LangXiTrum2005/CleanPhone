package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
final class zzoy {
    private final zzbd zza;
    private zzgtd zzb = zzgtd.zzi();
    private zzgtg zzc = zzgtg.zza();
    private zzwg zzd;
    private zzwg zze;
    private zzwg zzf;

    public zzoy(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    private final void zzj(zzbf zzbfVar) {
        zzgtf zzgtfVar = new zzgtf();
        if (this.zzb.isEmpty()) {
            zzk(zzgtfVar, this.zze, zzbfVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzgtfVar, this.zzf, zzbfVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzgtfVar, this.zzd, zzbfVar);
            }
        } else {
            for (int i2 = 0; i2 < this.zzb.size(); i2++) {
                zzk(zzgtfVar, (zzwg) this.zzb.get(i2), zzbfVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgtfVar, this.zzd, zzbfVar);
            }
        }
        this.zzc = zzgtfVar.zzc();
    }

    private final void zzk(zzgtf zzgtfVar, zzwg zzwgVar, zzbf zzbfVar) {
        if (zzwgVar == null) {
            return;
        }
        if (zzbfVar.zze(zzwgVar.zza) != -1) {
            zzgtfVar.zza(zzwgVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.zzc.get(zzwgVar);
        if (zzbfVar2 != null) {
            zzgtfVar.zza(zzwgVar, zzbfVar2);
        }
    }

    private static zzwg zzl(zzbb zzbbVar, zzgtd zzgtdVar, zzwg zzwgVar, zzbd zzbdVar) {
        zzbf zzbfVarZzq = zzbbVar.zzq();
        int iZzr = zzbbVar.zzr();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(iZzr);
        int iZzf = -1;
        if (!zzbbVar.zzx() && !zzbfVarZzq.zzg()) {
            iZzf = zzbfVarZzq.zzd(iZzr, zzbdVar, false).zzf(zzfj.zzq(zzbbVar.zzu()));
        }
        int i2 = iZzf;
        for (int i3 = 0; i3 < zzgtdVar.size(); i3++) {
            zzwg zzwgVar2 = (zzwg) zzgtdVar.get(i3);
            if (zzm(zzwgVar2, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i2)) {
                return zzwgVar2;
            }
        }
        if (zzgtdVar.isEmpty() && zzwgVar != null && zzm(zzwgVar, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i2)) {
            return zzwgVar;
        }
        return null;
    }

    private static boolean zzm(zzwg zzwgVar, Object obj, boolean z2, int i2, int i3, int i4) {
        if (!zzwgVar.zza.equals(obj)) {
            return false;
        }
        if (z2) {
            return zzwgVar.zzb == i2 && zzwgVar.zzc == i3;
        }
        return zzwgVar.zzb == -1 && zzwgVar.zze == i4;
    }

    public final zzwg zza() {
        return this.zzd;
    }

    public final zzwg zzb() {
        return this.zze;
    }

    public final zzwg zzc() {
        return this.zzf;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final zzwg zzd() {
        Object next;
        Object objLast;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (list != null) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            objLast = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            objLast = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            objLast = next;
        }
        return (zzwg) objLast;
    }

    public final zzbf zze(zzwg zzwgVar) {
        return (zzbf) this.zzc.get(zzwgVar);
    }

    public final void zzf(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(List list, zzwg zzwgVar, zzbb zzbbVar) {
        this.zzb = zzgtd.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzwg) list.get(0);
            zzwgVar.getClass();
            this.zzf = zzwgVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    public final /* synthetic */ zzgtd zzi() {
        return this.zzb;
    }
}
