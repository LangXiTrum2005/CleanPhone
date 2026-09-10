package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbqw implements zzbnn {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbrq zzb;
    final /* synthetic */ zzbqm zzc;
    final /* synthetic */ zzbrr zzd;

    public zzbqw(zzbrr zzbrrVar, long j, zzbrq zzbrqVar, zzbqm zzbqmVar) {
        this.zza = j;
        this.zzb = zzbrqVar;
        this.zzc = zzbqmVar;
        Objects.requireNonNull(zzbrrVar);
        this.zzd = zzbrrVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(jCurrentTimeMillis);
        sb.append(" ms.");
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbrr zzbrrVar = this.zzd;
        synchronized (zzbrrVar.zzg()) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbrq zzbrqVar = this.zzb;
            if (zzbrqVar.zzi() != -1 && zzbrqVar.zzi() != 1) {
                zzbrrVar.zzl(0);
                zzbqm zzbqmVar = this.zzc;
                zzbqmVar.zzm("/log", zzbnm.zzg);
                zzbqmVar.zzm("/result", zzbnm.zzo);
                zzbrqVar.zzf(zzbqmVar);
                zzbrrVar.zzj(zzbrqVar);
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
