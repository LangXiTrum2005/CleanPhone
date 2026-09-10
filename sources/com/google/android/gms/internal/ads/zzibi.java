package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzb' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class zzibi {
    public static final zzibi zza;
    public static final zzibi zzb;
    public static final zzibi zzc;
    public static final zzibi zzd;
    public static final zzibi zze;
    public static final zzibi zzf;
    public static final zzibi zzg;
    public static final zzibi zzh;
    public static final zzibi zzi;
    public static final zzibi zzj;
    private static final /* synthetic */ zzibi[] zzl;
    private final Class zzk;

    static {
        zzibi zzibiVar = new zzibi("VOID", 0, Void.class, Void.class, null);
        zza = zzibiVar;
        Class cls = Integer.TYPE;
        zzibi zzibiVar2 = new zzibi("INT", 1, cls, Integer.class, 0);
        zzb = zzibiVar2;
        zzibi zzibiVar3 = new zzibi("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = zzibiVar3;
        zzibi zzibiVar4 = new zzibi("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = zzibiVar4;
        zzibi zzibiVar5 = new zzibi("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = zzibiVar5;
        zzibi zzibiVar6 = new zzibi("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = zzibiVar6;
        zzibi zzibiVar7 = new zzibi("STRING", 6, String.class, String.class, "");
        zzg = zzibiVar7;
        zzibi zzibiVar8 = new zzibi("BYTE_STRING", 7, zzhzl.class, zzhzl.class, zzhzl.zzb);
        zzh = zzibiVar8;
        zzibi zzibiVar9 = new zzibi("ENUM", 8, cls, Integer.class, null);
        zzi = zzibiVar9;
        zzibi zzibiVar10 = new zzibi("MESSAGE", 9, Object.class, Object.class, null);
        zzj = zzibiVar10;
        zzl = new zzibi[]{zzibiVar, zzibiVar2, zzibiVar3, zzibiVar4, zzibiVar5, zzibiVar6, zzibiVar7, zzibiVar8, zzibiVar9, zzibiVar10};
    }

    private zzibi(String str, int i2, Class cls, Class cls2, Object obj) {
        super(str, i2);
        this.zzk = cls2;
    }

    public static zzibi[] values() {
        return (zzibi[]) zzl.clone();
    }

    public final Class zza() {
        return this.zzk;
    }
}
