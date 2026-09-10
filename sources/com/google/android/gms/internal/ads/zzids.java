package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class zzids {
    public static final zzids zza;
    public static final zzids zzb;
    public static final zzids zzc;
    public static final zzids zzd;
    public static final zzids zze;
    public static final zzids zzf;
    public static final zzids zzg;
    public static final zzids zzh;
    public static final zzids zzi;
    public static final zzids zzj;
    public static final zzids zzk;
    public static final zzids zzl;
    public static final zzids zzm;
    public static final zzids zzn;
    public static final zzids zzo;
    public static final zzids zzp;
    public static final zzids zzq;
    public static final zzids zzr;
    private static final /* synthetic */ zzids[] zzu;
    private final zzidt zzs;
    private final int zzt;

    static {
        zzids zzidsVar = new zzids("DOUBLE", 0, zzidt.DOUBLE, 1);
        zza = zzidsVar;
        zzids zzidsVar2 = new zzids("FLOAT", 1, zzidt.FLOAT, 5);
        zzb = zzidsVar2;
        zzidt zzidtVar = zzidt.LONG;
        zzids zzidsVar3 = new zzids("INT64", 2, zzidtVar, 0);
        zzc = zzidsVar3;
        zzids zzidsVar4 = new zzids("UINT64", 3, zzidtVar, 0);
        zzd = zzidsVar4;
        zzidt zzidtVar2 = zzidt.INT;
        zzids zzidsVar5 = new zzids("INT32", 4, zzidtVar2, 0);
        zze = zzidsVar5;
        zzids zzidsVar6 = new zzids("FIXED64", 5, zzidtVar, 1);
        zzf = zzidsVar6;
        zzids zzidsVar7 = new zzids("FIXED32", 6, zzidtVar2, 5);
        zzg = zzidsVar7;
        zzids zzidsVar8 = new zzids("BOOL", 7, zzidt.BOOLEAN, 0);
        zzh = zzidsVar8;
        zzids zzidsVar9 = new zzids("STRING", 8, zzidt.STRING, 2);
        zzi = zzidsVar9;
        zzidt zzidtVar3 = zzidt.MESSAGE;
        zzids zzidsVar10 = new zzids("GROUP", 9, zzidtVar3, 3);
        zzj = zzidsVar10;
        zzids zzidsVar11 = new zzids("MESSAGE", 10, zzidtVar3, 2);
        zzk = zzidsVar11;
        zzids zzidsVar12 = new zzids("BYTES", 11, zzidt.BYTE_STRING, 2);
        zzl = zzidsVar12;
        zzids zzidsVar13 = new zzids("UINT32", 12, zzidtVar2, 0);
        zzm = zzidsVar13;
        zzids zzidsVar14 = new zzids("ENUM", 13, zzidt.ENUM, 0);
        zzn = zzidsVar14;
        zzids zzidsVar15 = new zzids("SFIXED32", 14, zzidtVar2, 5);
        zzo = zzidsVar15;
        zzids zzidsVar16 = new zzids("SFIXED64", 15, zzidtVar, 1);
        zzp = zzidsVar16;
        zzids zzidsVar17 = new zzids("SINT32", 16, zzidtVar2, 0);
        zzq = zzidsVar17;
        zzids zzidsVar18 = new zzids("SINT64", 17, zzidtVar, 0);
        zzr = zzidsVar18;
        zzu = new zzids[]{zzidsVar, zzidsVar2, zzidsVar3, zzidsVar4, zzidsVar5, zzidsVar6, zzidsVar7, zzidsVar8, zzidsVar9, zzidsVar10, zzidsVar11, zzidsVar12, zzidsVar13, zzidsVar14, zzidsVar15, zzidsVar16, zzidsVar17, zzidsVar18};
    }

    private zzids(String str, int i2, zzidt zzidtVar, int i3) {
        super(str, i2);
        this.zzs = zzidtVar;
        this.zzt = i3;
    }

    public static zzids[] values() {
        return (zzids[]) zzu.clone();
    }

    public final zzidt zza() {
        return this.zzs;
    }

    public final int zzb() {
        return this.zzt;
    }
}
