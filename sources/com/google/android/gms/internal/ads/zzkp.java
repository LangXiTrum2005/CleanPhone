package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
final class zzkp extends zzf implements zzje {
    public static final /* synthetic */ int zzd = 0;
    private final long zzA;
    private final zzdm zzB;
    private final zzfa zzC;
    private final zzko zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private zzmp zzH;
    private zzmq zzI;
    private zzjd zzJ;
    private zzax zzK;
    private zzan zzL;
    private Object zzM;
    private Surface zzN;
    private int zzO;
    private zzes zzP;
    private zzd zzQ;
    private float zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private int zzV;
    private boolean zzW;
    private zzan zzX;
    private zzma zzY;
    private int zzZ;
    private long zzaa;
    private zzxz zzab;
    final zzaae zzb;
    final zzax zzc;
    private final zzdq zze = new zzdq(zzdn.zza);
    private final Context zzf;
    private final zzbb zzg;
    private final zzmi[] zzh;
    private final zzmi[] zzi;
    private final zzaad zzj;
    private final zzdx zzk;
    private final zzla zzl;
    private final zzlc zzm;
    private final zzed zzn;
    private final CopyOnWriteArraySet zzo;
    private final zzbd zzp;
    private final List zzq;
    private final boolean zzr;
    private final zzmu zzs;
    private final Looper zzt;
    private final zzaam zzu;
    private final zzdn zzv;
    private final zzjl zzw;
    private final zzkk zzx;
    private final zzfo zzy;
    private final zzfp zzz;

    static {
        zzal.zzb("media3.exoplayer");
    }

    public zzkp(zzjc zzjcVar, zzbb zzbbVar) {
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = zzfj.zza;
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 38 + String.valueOf(str).length() + 1);
            sb.append("Init ");
            sb.append(hexString);
            sb.append(" [AndroidXMedia3/1.9.0-alpha01] [");
            sb.append(str);
            sb.append(d9.i.f24752e);
            zzee.zzb("ExoPlayerImpl", sb.toString());
            this.zzf = zzjcVar.zza.getApplicationContext();
            this.zzs = (zzmu) zzjcVar.zzh.apply(zzjcVar.zzb);
            this.zzV = zzjcVar.zzj;
            this.zzQ = zzjcVar.zzk;
            this.zzO = zzjcVar.zzl;
            this.zzS = false;
            this.zzA = zzjcVar.zzq;
            zzjl zzjlVar = new zzjl(this, null);
            this.zzw = zzjlVar;
            this.zzx = new zzkk(null);
            zzmi[] zzmiVarArrZza = ((zzmn) zzjcVar.zzc.zza()).zza(new Handler(zzjcVar.zzi), zzjlVar, zzjlVar, zzjlVar, zzjlVar);
            this.zzh = zzmiVarArrZza;
            int length = zzmiVarArrZza.length;
            this.zzi = new zzmi[2];
            int i2 = 0;
            while (true) {
                zzmi[] zzmiVarArr = this.zzi;
                int length2 = zzmiVarArr.length;
                if (i2 >= 2) {
                    break;
                }
                zzmi zzmiVar = this.zzh[i2];
                zzmiVarArr[i2] = null;
                i2++;
            }
            zzaad zzaadVar = (zzaad) zzjcVar.zze.zza();
            this.zzj = zzaadVar;
            zzaam zzaamVar = (zzaam) zzjcVar.zzg.zza();
            this.zzu = zzaamVar;
            this.zzr = zzjcVar.zzm;
            this.zzI = zzjcVar.zzn;
            this.zzH = zzjcVar.zzo;
            Looper looper = zzjcVar.zzi;
            this.zzt = looper;
            zzdn zzdnVar = zzjcVar.zzb;
            this.zzv = zzdnVar;
            this.zzg = zzbbVar;
            this.zzn = new zzed(looper, zzdnVar, new zzdz() { // from class: com.google.android.gms.internal.ads.zzkj
                @Override // com.google.android.gms.internal.ads.zzdz
                public final /* synthetic */ void zza(Object obj, zzs zzsVar) {
                    this.zza.zzJ((zzaz) obj, zzsVar);
                }
            });
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.zzo = copyOnWriteArraySet;
            this.zzq = new ArrayList();
            this.zzab = new zzxz(0);
            this.zzJ = zzjd.zza;
            int length3 = this.zzh.length;
            zzaae zzaaeVar = new zzaae(new zzml[2], new zzzw[2], zzbn.zza, null);
            this.zzb = zzaaeVar;
            this.zzp = new zzbd();
            zzaw zzawVar = new zzaw();
            zzawVar.zzc(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            zzaadVar.zzd();
            zzawVar.zzb(29, true);
            zzawVar.zzb(23, false);
            zzawVar.zzb(25, false);
            zzawVar.zzb(33, false);
            zzawVar.zzb(26, false);
            zzawVar.zzb(34, false);
            zzax zzaxVarZze = zzawVar.zze();
            this.zzc = zzaxVarZze;
            zzaw zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVarZze);
            zzawVar2.zza(4);
            zzawVar2.zza(10);
            this.zzK = zzawVar2.zze();
            this.zzk = zzdnVar.zzd(looper, null);
            zzla zzlaVar = new zzla() { // from class: com.google.android.gms.internal.ads.zzjm
                @Override // com.google.android.gms.internal.ads.zzla
                public final /* synthetic */ void zza(zzkz zzkzVar) {
                    this.zza.zzK(zzkzVar);
                }
            };
            this.zzl = zzlaVar;
            this.zzY = zzma.zza(zzaaeVar);
            this.zzs.zzx(zzbbVar, looper);
            final zzpn zzpnVar = new zzpn(zzjcVar.zzx);
            zzlc zzlcVar = new zzlc(this.zzf, this.zzh, this.zzi, zzaadVar, zzaaeVar, (zzlg) zzjcVar.zzf.zza(), zzaamVar, 0, false, this.zzs, this.zzI, zzjcVar.zzy, zzjcVar.zzp, false, false, looper, zzdnVar, zzlaVar, zzpnVar, null, this.zzJ, this.zzx);
            this.zzm = zzlcVar;
            Looper looperZzn = zzlcVar.zzn();
            this.zzR = 1.0f;
            zzan zzanVar = zzan.zza;
            this.zzL = zzanVar;
            this.zzX = zzanVar;
            this.zzZ = -1;
            int i3 = zzcz.zza;
            this.zzT = true;
            zze(this.zzs);
            zzaamVar.zzf(new Handler(looper), this.zzs);
            copyOnWriteArraySet.add(this.zzw);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 31) {
                final Context context = this.zzf;
                final boolean z2 = zzjcVar.zzv;
                zzdnVar.zzd(zzlcVar.zzn(), null).zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzjf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzpj zzpjVarZza = zzpj.zza(context);
                        if (zzpjVarZza == null) {
                            zzee.zzc("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z2) {
                            this.zzD(zzpjVarZza);
                        }
                        zzpnVar.zzb(zzpjVarZza.zzb());
                    }
                });
            }
            zzdm zzdmVar = new zzdm(0, looperZzn, looper, zzdnVar, new zzdl() { // from class: com.google.android.gms.internal.ads.zzjx
                @Override // com.google.android.gms.internal.ads.zzdl
                public final /* synthetic */ void zza(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    this.zza.zzL(((Integer) obj).intValue(), iIntValue);
                }
            });
            this.zzB = zzdmVar;
            zzdmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzM();
                }
            });
            new zzbz(zzjcVar.zza, looperZzn, zzjcVar.zzi, this.zzw, zzdnVar);
            boolean z3 = (zzjcVar.zzs == Integer.MAX_VALUE || zzjcVar.zzt == Integer.MAX_VALUE) ? false : true;
            zzfo zzfoVar = new zzfo(zzjcVar.zza, looperZzn, zzdnVar);
            this.zzy = zzfoVar;
            zzfoVar.zza(z3);
            this.zzz = new zzfp(zzjcVar.zza, looperZzn, zzdnVar);
            int i5 = zzm.zza;
            zzbv zzbvVar = zzbv.zza;
            this.zzP = zzes.zza;
            this.zzD = i4 >= 34 ? new zzko(this, zzjcVar.zza, null) : null;
            this.zzC = new zzfa(this, this.zzw, zzdnVar, zzjcVar.zzr, zzjcVar.zzs, zzjcVar.zzt, zzjcVar.zzu);
            zzlcVar.zzg(this.zzH);
            zzlcVar.zzi(this.zzQ, false);
            zzas(1, 3, this.zzQ);
            zzas(2, 4, Integer.valueOf(this.zzO));
            zzas(2, 5, 0);
            zzas(1, 9, Boolean.valueOf(this.zzS));
            zzas(6, 8, this.zzx);
            zzas(-1, 16, Integer.valueOf(this.zzV));
        } finally {
            this.zze.zza();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzP(zzit zzitVar) {
        zzma zzmaVar = this.zzY;
        zzma zzmaVarZzh = zzmaVar.zzh(zzmaVar.zzb);
        zzmaVarZzh.zzq = zzmaVarZzh.zzs;
        zzmaVarZzh.zzr = 0L;
        zzma zzmaVarZzak = zzak(zzmaVarZzh, 1);
        if (zzitVar != null) {
            zzmaVarZzak = zzmaVarZzak.zzf(zzitVar);
        }
        this.zzE++;
        this.zzm.zzh();
        zzah(zzmaVarZzak, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private final int zzae(zzma zzmaVar) {
        zzbf zzbfVar = zzmaVar.zza;
        return zzbfVar.zzg() ? this.zzZ : zzbfVar.zzo(zzmaVar.zzb.zza, this.zzp).zzc;
    }

    private final long zzaf(zzma zzmaVar) {
        zzwg zzwgVar = zzmaVar.zzb;
        if (!zzwgVar.zzb()) {
            return zzfj.zzp(zzag(zzmaVar));
        }
        zzbf zzbfVar = zzmaVar.zza;
        zzbfVar.zzo(zzwgVar.zza, this.zzp);
        long j = zzmaVar.zzc;
        if (j == -9223372036854775807L) {
            long j2 = zzbfVar.zzb(zzae(zzmaVar), this.zza, 0L).zzl;
            return zzfj.zzp(0L);
        }
        return zzfj.zzp(j) + zzfj.zzp(0L);
    }

    private final long zzag(zzma zzmaVar) {
        zzbf zzbfVar = zzmaVar.zza;
        if (zzbfVar.zzg()) {
            return zzfj.zzq(this.zzaa);
        }
        long j = zzmaVar.zzs;
        zzwg zzwgVar = zzmaVar.zzb;
        if (zzwgVar.zzb()) {
            return j;
        }
        zzam(zzbfVar, zzwgVar, j);
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:103:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02db  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:112:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:115:0x0308  */
    /* JADX WARN: Code duplicated, block: B:117:0x031c  */
    /* JADX WARN: Code duplicated, block: B:119:0x032c  */
    /* JADX WARN: Code duplicated, block: B:122:0x033c  */
    /* JADX WARN: Code duplicated, block: B:125:0x034a  */
    /* JADX WARN: Code duplicated, block: B:130:0x035d  */
    /* JADX WARN: Code duplicated, block: B:133:0x036e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0383  */
    /* JADX WARN: Code duplicated, block: B:139:0x0399  */
    /* JADX WARN: Code duplicated, block: B:145:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:148:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:149:0x03de  */
    /* JADX WARN: Code duplicated, block: B:151:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:156:0x0401  */
    /* JADX WARN: Code duplicated, block: B:158:0x0411  */
    /* JADX WARN: Code duplicated, block: B:161:0x041c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0430  */
    /* JADX WARN: Code duplicated, block: B:165:0x0434  */
    /* JADX WARN: Code duplicated, block: B:168:0x0443  */
    /* JADX WARN: Code duplicated, block: B:171:0x0453  */
    /* JADX WARN: Code duplicated, block: B:174:0x046d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:176:0x0472  */
    /* JADX WARN: Code duplicated, block: B:179:0x0478 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x047d  */
    /* JADX WARN: Code duplicated, block: B:184:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x048a  */
    /* JADX WARN: Code duplicated, block: B:194:0x0497 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:196:0x049c  */
    /* JADX WARN: Code duplicated, block: B:199:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:208:0x04bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:214:0x04cb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:220:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Code duplicated, block: B:51:0x0128  */
    /* JADX WARN: Code duplicated, block: B:54:0x0136 A[LOOP:1: B:52:0x0130->B:54:0x0136, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0159  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0187  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:67:0x0191  */
    /* JADX WARN: Code duplicated, block: B:68:0x0193  */
    /* JADX WARN: Code duplicated, block: B:71:0x0199  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:86:0x0203  */
    /* JADX WARN: Code duplicated, block: B:87:0x0210  */
    /* JADX WARN: Code duplicated, block: B:89:0x0215  */
    /* JADX WARN: Code duplicated, block: B:91:0x021d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0220  */
    /* JADX WARN: Code duplicated, block: B:94:0x0228  */
    /* JADX WARN: Code duplicated, block: B:95:0x022f  */
    /* JADX WARN: Code duplicated, block: B:98:0x025b  */
    /* JADX WARN: Code duplicated, block: B:99:0x028c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18, types: [com.google.android.gms.internal.ads.zzaw] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.google.android.gms.internal.ads.zzbf] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v28 */
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
    private final void zzah(final zzma zzmaVar, final int i2, boolean z2, int i3, long j, int i4, boolean z3) {
        int i5;
        int i6;
        int i7;
        boolean z4;
        Pair pair;
        boolean z5;
        boolean z6;
        int i8;
        Pair pair2;
        boolean zBooleanValue;
        final int iIntValue;
        final zzak zzakVar;
        zzam zzamVarZza;
        List list;
        int i9;
        zzap zzapVar;
        int i10;
        zzbf zzbfVarZzq;
        zzan zzanVarZzw;
        boolean zEquals;
        int i11;
        int i12;
        int i13;
        zzit zzitVar;
        zzit zzitVar2;
        zzaae zzaaeVar;
        zzaae zzaaeVar2;
        zzax zzaxVar;
        boolean zZzx;
        zzf zzfVar;
        zzbf zzbfVarZzq2;
        boolean z7;
        zzbf zzbfVarZzq3;
        ?? r15;
        int iZzi;
        int i14;
        boolean z8;
        ?? Zzq;
        int iZzs;
        ?? r6;
        zzbf zzbfVarZzq4;
        boolean z9;
        long j2;
        ?? r12;
        zzbf zzbfVarZzq5;
        ?? r9;
        boolean zZzg;
        ?? r2;
        ?? r3;
        ?? r4;
        ?? r5;
        ?? r10;
        ?? r11;
        ?? r14;
        zzax zzaxVarZze;
        zzed zzedVar;
        zzbd zzbdVar;
        int i15;
        Object obj;
        zzak zzakVar2;
        Object obj2;
        int i16;
        long jZzai;
        long jZzai2;
        int iZzs2;
        Object obj3;
        zzak zzakVar3;
        Object obj4;
        int i17;
        long jZzp;
        long jZzp2;
        zzwg zzwgVar;
        final int i18 = i3;
        zzma zzmaVar2 = this.zzY;
        this.zzY = zzmaVar;
        ?? r7 = zzmaVar2.zza;
        zzbf zzbfVar = zzmaVar.zza;
        boolean zEquals2 = r7.equals(zzbfVar);
        if (!zzbfVar.zzg() || !r7.zzg()) {
            i5 = 3;
            if (zzbfVar.zzg() != r7.zzg()) {
                pair2 = new Pair(Boolean.TRUE, 3);
            } else {
                zzwg zzwgVar2 = zzmaVar2.zzb;
                Object obj5 = zzwgVar2.zza;
                zzbd zzbdVar2 = this.zzp;
                int i19 = r7.zzo(obj5, zzbdVar2).zzc;
                zzbe zzbeVar = this.zza;
                Object obj6 = r7.zzb(i19, zzbeVar, 0L).zzb;
                i6 = 0;
                zzwg zzwgVar3 = zzmaVar.zzb;
                if (obj6.equals(zzbfVar.zzb(zzbfVar.zzo(zzwgVar3.zza, zzbdVar2).zzc, zzbeVar, 0L).zzb)) {
                    if (z2) {
                        if (i18 != 0) {
                            i7 = i18;
                        } else if (zzwgVar2.zzd < zzwgVar3.zzd) {
                            pair = new Pair(Boolean.TRUE, 0);
                            i18 = 0;
                            z5 = true;
                        } else {
                            i7 = 0;
                        }
                        z4 = true;
                    } else {
                        i7 = i18;
                        z4 = false;
                    }
                    pair = new Pair(Boolean.FALSE, -1);
                    int i20 = i7;
                    z5 = z4;
                    i18 = i20;
                } else {
                    if (z2) {
                        if (i18 == 0) {
                            i18 = 0;
                            z5 = true;
                            i8 = 1;
                        } else {
                            z5 = true;
                            z6 = true;
                        }
                        pair = new Pair(Boolean.TRUE, Integer.valueOf(i8));
                    } else {
                        z5 = false;
                        z6 = false;
                    }
                    if (z5 && i18 == 1) {
                        z5 = z6;
                        i8 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i8 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i8));
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (zzbfVar.zzg()) {
                    zzakVar = null;
                } else {
                    zzakVar = zzbfVar.zzb(zzbfVar.zzo(zzmaVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd;
                }
                this.zzX = zzan.zza;
            } else {
                zzakVar = null;
            }
            if (zBooleanValue || !zzmaVar2.zzj.equals(zzmaVar.zzj)) {
                zzamVarZza = this.zzX.zza();
                list = zzmaVar.zzj;
                for (i9 = i6; i9 < list.size(); i9++) {
                    zzapVar = (zzap) list.get(i9);
                    for (i10 = i6; i10 < zzapVar.zza(); i10++) {
                        zzapVar.zzb(i10).zza(zzamVarZza);
                    }
                }
                this.zzX = zzamVarZza.zzw();
            }
            zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                zzanVarZzw = this.zzX;
            } else {
                zzak zzakVar4 = zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzd;
                zzam zzamVarZza2 = this.zzX.zza();
                zzamVarZza2.zzv(zzakVar4.zzd);
                zzanVarZzw = zzamVarZza2.zzw();
            }
            zEquals = zzanVarZzw.equals(this.zzL);
            this.zzL = zzanVarZzw;
            if (zzmaVar2.zzl != zzmaVar.zzl) {
                i11 = 1;
            } else {
                i11 = i6;
            }
            if (zzmaVar2.zze != zzmaVar.zze) {
                i12 = 1;
            } else {
                i12 = i6;
            }
            if (i12 == 0 || i11 != 0) {
                zzaq();
            }
            if (zzmaVar2.zzg != zzmaVar.zzg) {
                i13 = 1;
            } else {
                i13 = i6;
            }
            if (!zEquals2) {
                this.zzn.zzd(i6, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkf
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj7) {
                        int i21 = zzkp.zzd;
                        ((zzaz) obj7).zzb(zzmaVar.zza, i2);
                    }
                });
            }
            if (z5) {
                zzbdVar = new zzbd();
                if (r7.zzg()) {
                    i15 = i4;
                    obj = null;
                    zzakVar2 = null;
                    obj2 = null;
                    i16 = -1;
                } else {
                    Object obj7 = zzmaVar2.zzb.zza;
                    r7.zzo(obj7, zzbdVar);
                    int i21 = zzbdVar.zzc;
                    int iZze = r7.zze(obj7);
                    zzbe zzbeVar2 = this.zza;
                    obj = r7.zzb(i21, zzbeVar2, 0L).zzb;
                    zzakVar2 = zzbeVar2.zzd;
                    obj2 = obj7;
                    i15 = i21;
                    i16 = iZze;
                }
                if (i18 == 0) {
                    zzwgVar = zzmaVar2.zzb;
                    if (zzwgVar.zzb()) {
                        jZzai = zzbdVar.zzh(zzwgVar.zzb, zzwgVar.zzc);
                        jZzai2 = zzai(zzmaVar2);
                    } else {
                        if (zzwgVar.zze != -1) {
                            jZzai = zzai(this.zzY);
                        } else {
                            jZzai = zzbdVar.zzd;
                        }
                        jZzai2 = jZzai;
                    }
                } else if (zzmaVar2.zzb.zzb()) {
                    jZzai = zzmaVar2.zzs;
                    jZzai2 = zzai(zzmaVar2);
                } else {
                    jZzai = zzmaVar2.zzs;
                    jZzai2 = jZzai;
                }
                String str = zzfj.zza;
                zzwg zzwgVar4 = zzmaVar2.zzb;
                final zzba zzbaVar = new zzba(obj, i15, zzakVar2, obj2, i16, zzfj.zzp(jZzai), zzfj.zzp(jZzai2), zzwgVar4.zzb, zzwgVar4.zzc);
                iZzs2 = zzs();
                if (this.zzY.zza.zzg()) {
                    obj3 = null;
                    zzakVar3 = null;
                    obj4 = null;
                    i17 = -1;
                } else {
                    zzma zzmaVar3 = this.zzY;
                    Object obj8 = zzmaVar3.zzb.zza;
                    zzmaVar3.zza.zzo(obj8, this.zzp);
                    int iZze2 = this.zzY.zza.zze(obj8);
                    zzbf zzbfVar2 = this.zzY.zza;
                    zzbe zzbeVar3 = this.zza;
                    Object obj9 = zzbfVar2.zzb(iZzs2, zzbeVar3, 0L).zzb;
                    i17 = iZze2;
                    zzakVar3 = zzbeVar3.zzd;
                    obj3 = obj9;
                    obj4 = obj8;
                }
                jZzp = zzfj.zzp(j);
                if (this.zzY.zzb.zzb()) {
                    jZzp2 = zzfj.zzp(zzai(this.zzY));
                } else {
                    jZzp2 = jZzp;
                }
                zzwg zzwgVar5 = this.zzY.zzb;
                final zzba zzbaVar2 = new zzba(obj3, iZzs2, zzakVar3, obj4, i17, jZzp, jZzp2, zzwgVar5.zzb, zzwgVar5.zzc);
                this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkg
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        ((zzaz) obj10).zzo(zzbaVar, zzbaVar2, i18);
                    }
                });
            } else {
                zBooleanValue = zBooleanValue;
                i11 = i11;
                zEquals = zEquals;
            }
            if (zBooleanValue) {
                this.zzn.zzd(1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkh
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        ((zzaz) obj10).zzc(zzakVar, iIntValue);
                    }
                });
            }
            zzitVar = zzmaVar2.zzf;
            zzitVar2 = zzmaVar.zzf;
            if (zzitVar != zzitVar2) {
                zzedVar = this.zzn;
                zzedVar.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzki
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        ((zzaz) obj10).zzn(zzmaVar.zzf);
                    }
                });
                if (zzitVar2 != null) {
                    zzedVar.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjn
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            int i22 = zzkp.zzd;
                            ((zzaz) obj10).zzm(zzmaVar.zzf);
                        }
                    });
                }
            }
            zzaaeVar = zzmaVar2.zzi;
            zzaaeVar2 = zzmaVar.zzi;
            if (zzaaeVar != zzaaeVar2) {
                this.zzj.zzp(zzaaeVar2.zze);
                this.zzn.zzd(2, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjo
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        ((zzaz) obj10).zzd(zzmaVar.zzi.zzd);
                    }
                });
            }
            if (!zEquals) {
                final zzan zzanVar = this.zzL;
                this.zzn.zzd(14, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjp
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        ((zzaz) obj10).zze(zzanVar);
                    }
                });
            }
            if (i13 != 0) {
                this.zzn.zzd(i5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjq
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        ((zzaz) obj10).zzf(zzmaVar.zzg);
                    }
                });
            }
            if (i12 == 0 || i11 != 0) {
                this.zzn.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjr
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        zzma zzmaVar4 = zzmaVar;
                        ((zzaz) obj10).zzh(zzmaVar4.zzl, zzmaVar4.zze);
                    }
                });
            }
            if (i12 != 0) {
                this.zzn.zzd(4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjs
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        ((zzaz) obj10).zzi(zzmaVar.zze);
                    }
                });
            }
            if (i11 == 0 || zzmaVar2.zzm != zzmaVar.zzm) {
                this.zzn.zzd(5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjt
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        zzma zzmaVar4 = zzmaVar;
                        ((zzaz) obj10).zzj(zzmaVar4.zzl, zzmaVar4.zzm);
                    }
                });
            }
            if (zzmaVar2.zzn != zzmaVar.zzn) {
                this.zzn.zzd(6, new zzdy() { // from class: com.google.android.gms.internal.ads.zzju
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        ((zzaz) obj10).zzk(zzmaVar.zzn);
                    }
                });
            }
            if (zzmaVar2.zzj() != zzmaVar.zzj()) {
                this.zzn.zzd(7, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjv
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        ((zzaz) obj10).zzl(zzmaVar.zzj());
                    }
                });
            }
            if (!zzmaVar2.zzo.equals(zzmaVar.zzo)) {
                this.zzn.zzd(12, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjw
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        int i22 = zzkp.zzd;
                        ((zzaz) obj10).zzp(zzmaVar.zzo);
                    }
                });
            }
            zzaxVar = this.zzK;
            zzbb zzbbVar = this.zzg;
            zzax zzaxVar2 = this.zzc;
            String str2 = zzfj.zza;
            zZzx = zzbbVar.zzx();
            zzfVar = (zzf) zzbbVar;
            zzbfVarZzq2 = zzfVar.zzq();
            if (zzbfVarZzq2.zzg() && zzbfVarZzq2.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzh) {
                z7 = true;
            } else {
                z7 = false;
            }
            zzbfVarZzq3 = zzfVar.zzq();
            if (zzbfVarZzq3.zzg()) {
                i14 = -1;
                r15 = 0;
                z8 = false;
            } else {
                int iZzs3 = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                r15 = 0;
                r15 = 0;
                iZzi = zzbfVarZzq3.zzi(iZzs3, 0, false);
                i14 = -1;
                if (iZzi != -1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
            Zzq = zzfVar.zzq();
            if (Zzq.zzg()) {
                r6 = r15;
            } else {
                iZzs = zzfVar.zzs();
                zzfVar.zzl();
                zzfVar.zzm();
                if (Zzq.zzh(iZzs, r15, r15) != i14) {
                    r6 = 1;
                } else {
                    r6 = r15;
                }
            }
            zzbfVarZzq4 = zzfVar.zzq();
            if (!zzbfVarZzq4.zzg()) {
                z9 = zZzx;
                j2 = 0;
                if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                    r12 = 1;
                }
                zzbfVarZzq5 = zzfVar.zzq();
                if (zzbfVarZzq5.zzg() && zzbfVarZzq5.zzb(zzfVar.zzs(), zzfVar.zza, j2).zzi) {
                    r9 = 1;
                } else {
                    r9 = r15;
                }
                zZzg = zzbbVar.zzq().zzg();
                ?? zzawVar = new zzaw();
                zzawVar.zzd(zzaxVar2);
                boolean z10 = !z9;
                zzawVar.zzb(4, z10);
                if (z7 || z9) {
                    r2 = r15;
                } else {
                    r2 = 1;
                }
                zzawVar.zzb(5, r2);
                if (z8 || z9) {
                    r3 = r15;
                } else {
                    r3 = 1;
                }
                zzawVar.zzb(6, r3);
                if (!zZzg || (!(z8 || r12 == 0 || z7) || z9)) {
                    r4 = r15;
                } else {
                    r4 = 1;
                }
                zzawVar.zzb(7, r4);
                if (r6 != 0 || z9) {
                    r5 = r15;
                } else {
                    r5 = 1;
                }
                zzawVar.zzb(8, r5);
                if (!zZzg || ((r6 == 0 && (r12 == 0 || r9 == 0)) || z9)) {
                    r10 = r15;
                } else {
                    r10 = 1;
                }
                zzawVar.zzb(9, r10);
                zzawVar.zzb(10, z10);
                if (z7 || z9) {
                    r11 = r15;
                } else {
                    r11 = 1;
                }
                zzawVar.zzb(11, r11);
                if (z7 || z9) {
                    r14 = r15;
                } else {
                    r14 = 1;
                }
                zzawVar.zzb(12, r14);
                zzaxVarZze = zzawVar.zze();
                this.zzK = zzaxVarZze;
                if (!zzaxVarZze.equals(zzaxVar)) {
                    this.zzn.zzd(13, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjy
                        @Override // com.google.android.gms.internal.ads.zzdy
                        public final /* synthetic */ void zza(Object obj10) {
                            this.zza.zzN((zzaz) obj10);
                        }
                    });
                }
                this.zzn.zze();
            }
            z9 = zZzx;
            j2 = 0;
            r12 = r15;
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                r9 = r15;
            } else {
                r9 = r15;
            }
            zZzg = zzbbVar.zzq().zzg();
            ?? zzawVar2 = new zzaw();
            zzawVar2.zzd(zzaxVar2);
            boolean z11 = !z9;
            zzawVar2.zzb(4, z11);
            if (z7) {
                r2 = r15;
            } else {
                r2 = r15;
            }
            zzawVar2.zzb(5, r2);
            if (z8) {
                r3 = r15;
            } else {
                r3 = r15;
            }
            zzawVar2.zzb(6, r3);
            if (zZzg) {
                r4 = r15;
            } else {
                r4 = r15;
            }
            zzawVar2.zzb(7, r4);
            if (r6 != 0) {
                r5 = r15;
            } else {
                r5 = r15;
            }
            zzawVar2.zzb(8, r5);
            if (zZzg) {
                r10 = r15;
            } else {
                r10 = r15;
            }
            zzawVar2.zzb(9, r10);
            zzawVar2.zzb(10, z11);
            if (z7) {
                r11 = r15;
            } else {
                r11 = r15;
            }
            zzawVar2.zzb(11, r11);
            if (z7) {
                r14 = r15;
            } else {
                r14 = r15;
            }
            zzawVar2.zzb(12, r14);
            zzaxVarZze = zzawVar2.zze();
            this.zzK = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar)) {
                this.zzn.zzd(13, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjy
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj10) {
                        this.zza.zzN((zzaz) obj10);
                    }
                });
            }
            this.zzn.zze();
        }
        i5 = 3;
        pair2 = new Pair(Boolean.FALSE, -1);
        pair = pair2;
        i6 = 0;
        z5 = z2;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (zzbfVar.zzg()) {
                zzakVar = zzbfVar.zzb(zzbfVar.zzo(zzmaVar.zzb.zza, this.zzp).zzc, this.zza, 0L).zzd;
            } else {
                zzakVar = null;
            }
            this.zzX = zzan.zza;
        } else {
            zzakVar = null;
        }
        if (zBooleanValue) {
            zzamVarZza = this.zzX.zza();
            list = zzmaVar.zzj;
            while (i9 < list.size()) {
                zzapVar = (zzap) list.get(i9);
                while (i10 < zzapVar.zza()) {
                    zzapVar.zzb(i10).zza(zzamVarZza);
                }
            }
            this.zzX = zzamVarZza.zzw();
        } else {
            zzamVarZza = this.zzX.zza();
            list = zzmaVar.zzj;
            while (i9 < list.size()) {
                zzapVar = (zzap) list.get(i9);
                while (i10 < zzapVar.zza()) {
                    zzapVar.zzb(i10).zza(zzamVarZza);
                }
            }
            this.zzX = zzamVarZza.zzw();
        }
        zzbfVarZzq = zzq();
        if (zzbfVarZzq.zzg()) {
            zzanVarZzw = this.zzX;
        } else {
            zzak zzakVar5 = zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzd;
            zzam zzamVarZza3 = this.zzX.zza();
            zzamVarZza3.zzv(zzakVar5.zzd);
            zzanVarZzw = zzamVarZza3.zzw();
        }
        zEquals = zzanVarZzw.equals(this.zzL);
        this.zzL = zzanVarZzw;
        if (zzmaVar2.zzl != zzmaVar.zzl) {
            i11 = 1;
        } else {
            i11 = i6;
        }
        if (zzmaVar2.zze != zzmaVar.zze) {
            i12 = 1;
        } else {
            i12 = i6;
        }
        if (i12 == 0) {
            zzaq();
        } else {
            zzaq();
        }
        if (zzmaVar2.zzg != zzmaVar.zzg) {
            i13 = 1;
        } else {
            i13 = i6;
        }
        if (!zEquals2) {
            this.zzn.zzd(i6, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkf
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj10) {
                    int i22 = zzkp.zzd;
                    ((zzaz) obj10).zzb(zzmaVar.zza, i2);
                }
            });
        }
        if (z5) {
            zzbdVar = new zzbd();
            if (r7.zzg()) {
                Object obj10 = zzmaVar2.zzb.zza;
                r7.zzo(obj10, zzbdVar);
                int i22 = zzbdVar.zzc;
                int iZze3 = r7.zze(obj10);
                zzbe zzbeVar4 = this.zza;
                obj = r7.zzb(i22, zzbeVar4, 0L).zzb;
                zzakVar2 = zzbeVar4.zzd;
                obj2 = obj10;
                i15 = i22;
                i16 = iZze3;
            } else {
                i15 = i4;
                obj = null;
                zzakVar2 = null;
                obj2 = null;
                i16 = -1;
            }
            if (i18 == 0) {
                zzwgVar = zzmaVar2.zzb;
                if (zzwgVar.zzb()) {
                    jZzai = zzbdVar.zzh(zzwgVar.zzb, zzwgVar.zzc);
                    jZzai2 = zzai(zzmaVar2);
                } else {
                    if (zzwgVar.zze != -1) {
                        jZzai = zzai(this.zzY);
                    } else {
                        jZzai = zzbdVar.zzd;
                    }
                    jZzai2 = jZzai;
                }
            } else if (zzmaVar2.zzb.zzb()) {
                jZzai = zzmaVar2.zzs;
                jZzai2 = zzai(zzmaVar2);
            } else {
                jZzai = zzmaVar2.zzs;
                jZzai2 = jZzai;
            }
            String str3 = zzfj.zza;
            zzwg zzwgVar6 = zzmaVar2.zzb;
            final zzba zzbaVar3 = new zzba(obj, i15, zzakVar2, obj2, i16, zzfj.zzp(jZzai), zzfj.zzp(jZzai2), zzwgVar6.zzb, zzwgVar6.zzc);
            iZzs2 = zzs();
            if (this.zzY.zza.zzg()) {
                zzma zzmaVar4 = this.zzY;
                Object obj11 = zzmaVar4.zzb.zza;
                zzmaVar4.zza.zzo(obj11, this.zzp);
                int iZze4 = this.zzY.zza.zze(obj11);
                zzbf zzbfVar3 = this.zzY.zza;
                zzbe zzbeVar5 = this.zza;
                Object obj12 = zzbfVar3.zzb(iZzs2, zzbeVar5, 0L).zzb;
                i17 = iZze4;
                zzakVar3 = zzbeVar5.zzd;
                obj3 = obj12;
                obj4 = obj11;
            } else {
                obj3 = null;
                zzakVar3 = null;
                obj4 = null;
                i17 = -1;
            }
            jZzp = zzfj.zzp(j);
            if (this.zzY.zzb.zzb()) {
                jZzp2 = zzfj.zzp(zzai(this.zzY));
            } else {
                jZzp2 = jZzp;
            }
            zzwg zzwgVar7 = this.zzY.zzb;
            final zzba zzbaVar4 = new zzba(obj3, iZzs2, zzakVar3, obj4, i17, jZzp, jZzp2, zzwgVar7.zzb, zzwgVar7.zzc);
            this.zzn.zzd(11, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkg
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    ((zzaz) obj13).zzo(zzbaVar3, zzbaVar4, i18);
                }
            });
        } else {
            zBooleanValue = zBooleanValue;
            i11 = i11;
            zEquals = zEquals;
        }
        if (zBooleanValue) {
            this.zzn.zzd(1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzkh
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    ((zzaz) obj13).zzc(zzakVar, iIntValue);
                }
            });
        }
        zzitVar = zzmaVar2.zzf;
        zzitVar2 = zzmaVar.zzf;
        if (zzitVar != zzitVar2) {
            zzedVar = this.zzn;
            zzedVar.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzki
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    ((zzaz) obj13).zzn(zzmaVar.zzf);
                }
            });
            if (zzitVar2 != null) {
                zzedVar.zzd(10, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjn
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj13) {
                        int i23 = zzkp.zzd;
                        ((zzaz) obj13).zzm(zzmaVar.zzf);
                    }
                });
            }
        }
        zzaaeVar = zzmaVar2.zzi;
        zzaaeVar2 = zzmaVar.zzi;
        if (zzaaeVar != zzaaeVar2) {
            this.zzj.zzp(zzaaeVar2.zze);
            this.zzn.zzd(2, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjo
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    ((zzaz) obj13).zzd(zzmaVar.zzi.zzd);
                }
            });
        }
        if (!zEquals) {
            final zzan zzanVar2 = this.zzL;
            this.zzn.zzd(14, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjp
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    ((zzaz) obj13).zze(zzanVar2);
                }
            });
        }
        if (i13 != 0) {
            this.zzn.zzd(i5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjq
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    ((zzaz) obj13).zzf(zzmaVar.zzg);
                }
            });
        }
        if (i12 == 0) {
            this.zzn.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjr
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    zzma zzmaVar5 = zzmaVar;
                    ((zzaz) obj13).zzh(zzmaVar5.zzl, zzmaVar5.zze);
                }
            });
        } else {
            this.zzn.zzd(-1, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjr
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    zzma zzmaVar5 = zzmaVar;
                    ((zzaz) obj13).zzh(zzmaVar5.zzl, zzmaVar5.zze);
                }
            });
        }
        if (i12 != 0) {
            this.zzn.zzd(4, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjs
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    ((zzaz) obj13).zzi(zzmaVar.zze);
                }
            });
        }
        if (i11 == 0) {
            this.zzn.zzd(5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjt
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    zzma zzmaVar5 = zzmaVar;
                    ((zzaz) obj13).zzj(zzmaVar5.zzl, zzmaVar5.zzm);
                }
            });
        } else {
            this.zzn.zzd(5, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjt
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    zzma zzmaVar5 = zzmaVar;
                    ((zzaz) obj13).zzj(zzmaVar5.zzl, zzmaVar5.zzm);
                }
            });
        }
        if (zzmaVar2.zzn != zzmaVar.zzn) {
            this.zzn.zzd(6, new zzdy() { // from class: com.google.android.gms.internal.ads.zzju
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    ((zzaz) obj13).zzk(zzmaVar.zzn);
                }
            });
        }
        if (zzmaVar2.zzj() != zzmaVar.zzj()) {
            this.zzn.zzd(7, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjv
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    ((zzaz) obj13).zzl(zzmaVar.zzj());
                }
            });
        }
        if (!zzmaVar2.zzo.equals(zzmaVar.zzo)) {
            this.zzn.zzd(12, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjw
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    int i23 = zzkp.zzd;
                    ((zzaz) obj13).zzp(zzmaVar.zzo);
                }
            });
        }
        zzaxVar = this.zzK;
        zzbb zzbbVar2 = this.zzg;
        zzax zzaxVar3 = this.zzc;
        String str4 = zzfj.zza;
        zZzx = zzbbVar2.zzx();
        zzfVar = (zzf) zzbbVar2;
        zzbfVarZzq2 = zzfVar.zzq();
        if (zzbfVarZzq2.zzg()) {
            z7 = false;
        } else {
            z7 = false;
        }
        zzbfVarZzq3 = zzfVar.zzq();
        if (zzbfVarZzq3.zzg()) {
            i14 = -1;
            r15 = 0;
            z8 = false;
        } else {
            int iZzs4 = zzfVar.zzs();
            zzfVar.zzl();
            zzfVar.zzm();
            r15 = 0;
            r15 = 0;
            iZzi = zzbfVarZzq3.zzi(iZzs4, 0, false);
            i14 = -1;
            if (iZzi != -1) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        Zzq = zzfVar.zzq();
        if (Zzq.zzg()) {
            r6 = r15;
        } else {
            iZzs = zzfVar.zzs();
            zzfVar.zzl();
            zzfVar.zzm();
            if (Zzq.zzh(iZzs, r15, r15) != i14) {
                r6 = 1;
            } else {
                r6 = r15;
            }
        }
        zzbfVarZzq4 = zzfVar.zzq();
        if (!zzbfVarZzq4.zzg()) {
            z9 = zZzx;
            j2 = 0;
            if (zzbfVarZzq4.zzb(zzfVar.zzs(), zzfVar.zza, 0L).zzb()) {
                r12 = 1;
            }
            zzbfVarZzq5 = zzfVar.zzq();
            if (zzbfVarZzq5.zzg()) {
                r9 = r15;
            } else {
                r9 = r15;
            }
            zZzg = zzbbVar2.zzq().zzg();
            ?? zzawVar3 = new zzaw();
            zzawVar3.zzd(zzaxVar3);
            boolean z12 = !z9;
            zzawVar3.zzb(4, z12);
            if (z7) {
                r2 = r15;
            } else {
                r2 = r15;
            }
            zzawVar3.zzb(5, r2);
            if (z8) {
                r3 = r15;
            } else {
                r3 = r15;
            }
            zzawVar3.zzb(6, r3);
            if (zZzg) {
                r4 = r15;
            } else {
                r4 = r15;
            }
            zzawVar3.zzb(7, r4);
            if (r6 != 0) {
                r5 = r15;
            } else {
                r5 = r15;
            }
            zzawVar3.zzb(8, r5);
            if (zZzg) {
                r10 = r15;
            } else {
                r10 = r15;
            }
            zzawVar3.zzb(9, r10);
            zzawVar3.zzb(10, z12);
            if (z7) {
                r11 = r15;
            } else {
                r11 = r15;
            }
            zzawVar3.zzb(11, r11);
            if (z7) {
                r14 = r15;
            } else {
                r14 = r15;
            }
            zzawVar3.zzb(12, r14);
            zzaxVarZze = zzawVar3.zze();
            this.zzK = zzaxVarZze;
            if (!zzaxVarZze.equals(zzaxVar)) {
                this.zzn.zzd(13, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjy
                    @Override // com.google.android.gms.internal.ads.zzdy
                    public final /* synthetic */ void zza(Object obj13) {
                        this.zza.zzN((zzaz) obj13);
                    }
                });
            }
            this.zzn.zze();
        }
        z9 = zZzx;
        j2 = 0;
        r12 = r15;
        zzbfVarZzq5 = zzfVar.zzq();
        if (zzbfVarZzq5.zzg()) {
            r9 = r15;
        } else {
            r9 = r15;
        }
        zZzg = zzbbVar2.zzq().zzg();
        ?? zzawVar4 = new zzaw();
        zzawVar4.zzd(zzaxVar3);
        boolean z13 = !z9;
        zzawVar4.zzb(4, z13);
        if (z7) {
            r2 = r15;
        } else {
            r2 = r15;
        }
        zzawVar4.zzb(5, r2);
        if (z8) {
            r3 = r15;
        } else {
            r3 = r15;
        }
        zzawVar4.zzb(6, r3);
        if (zZzg) {
            r4 = r15;
        } else {
            r4 = r15;
        }
        zzawVar4.zzb(7, r4);
        if (r6 != 0) {
            r5 = r15;
        } else {
            r5 = r15;
        }
        zzawVar4.zzb(8, r5);
        if (zZzg) {
            r10 = r15;
        } else {
            r10 = r15;
        }
        zzawVar4.zzb(9, r10);
        zzawVar4.zzb(10, z13);
        if (z7) {
            r11 = r15;
        } else {
            r11 = r15;
        }
        zzawVar4.zzb(11, r11);
        if (z7) {
            r14 = r15;
        } else {
            r14 = r15;
        }
        zzawVar4.zzb(12, r14);
        zzaxVarZze = zzawVar4.zze();
        this.zzK = zzaxVarZze;
        if (!zzaxVarZze.equals(zzaxVar)) {
            this.zzn.zzd(13, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjy
                @Override // com.google.android.gms.internal.ads.zzdy
                public final /* synthetic */ void zza(Object obj13) {
                    this.zza.zzN((zzaz) obj13);
                }
            });
        }
        this.zzn.zze();
    }

    private static long zzai(zzma zzmaVar) {
        zzbe zzbeVar = new zzbe();
        zzbd zzbdVar = new zzbd();
        zzbf zzbfVar = zzmaVar.zza;
        zzbfVar.zzo(zzmaVar.zzb.zza, zzbdVar);
        long j = zzmaVar.zzc;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = zzbfVar.zzb(zzbdVar.zzc, zzbeVar, 0L).zzl;
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    private final zzma zzaj(zzma zzmaVar, zzbf zzbfVar, Pair pair) {
        boolean z2;
        zzgqa.zza(zzbfVar.zzg() || pair != null);
        zzbf zzbfVar2 = zzmaVar.zza;
        long jZzaf = zzaf(zzmaVar);
        zzma zzmaVarZzd = zzmaVar.zzd(zzbfVar);
        if (zzbfVar.zzg()) {
            zzwg zzwgVarZzb = zzma.zzb();
            long jZzq = zzfj.zzq(this.zzaa);
            zzma zzmaVarZzh = zzmaVarZzd.zzc(zzwgVarZzb, jZzq, jZzq, jZzq, 0L, zzyh.zza, this.zzb, zzgtd.zzi()).zzh(zzwgVarZzb);
            zzmaVarZzh.zzq = zzmaVarZzh.zzs;
            return zzmaVarZzh;
        }
        zzwg zzwgVar = zzmaVarZzd.zzb;
        Object obj = zzwgVar.zza;
        String str = zzfj.zza;
        boolean zEquals = obj.equals(pair.first);
        zzwg zzwgVar2 = !zEquals ? new zzwg(pair.first, -1L) : zzwgVar;
        long jLongValue = ((Long) pair.second).longValue();
        long jZzq2 = zzfj.zzq(jZzaf);
        if (zzbfVar2.zzg()) {
            z2 = true;
        } else {
            zzbd zzbdVar = this.zzp;
            zzbfVar2.zzo(obj, zzbdVar);
            if (zEquals && jZzq2 - jLongValue == 1) {
                zzbd zzbdVarZzo = zzbfVar2.zzo(obj, zzbdVar);
                z2 = true;
                if (jZzq2 == zzbdVarZzo.zzd) {
                    jZzq2--;
                }
            } else {
                z2 = true;
            }
        }
        if (!zEquals || jLongValue < jZzq2) {
            zzgqa.zzi(zzwgVar2.zzb() ^ z2);
            zzwg zzwgVar3 = zzwgVar2;
            zzma zzmaVarZzh2 = zzmaVarZzd.zzc(zzwgVar3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? zzyh.zza : zzmaVarZzd.zzh, !zEquals ? this.zzb : zzmaVarZzd.zzi, !zEquals ? zzgtd.zzi() : zzmaVarZzd.zzj).zzh(zzwgVar3);
            zzmaVarZzh2.zzq = jLongValue;
            return zzmaVarZzh2;
        }
        if (jLongValue != jZzq2) {
            zzgqa.zzi(zzwgVar2.zzb() ^ z2);
            long jMax = Math.max(0L, zzmaVarZzd.zzr - (jLongValue - jZzq2));
            long j = zzmaVarZzd.zzq;
            if (zzmaVarZzd.zzk.equals(zzwgVar)) {
                j = jLongValue + jMax;
            }
            zzma zzmaVarZzc = zzmaVarZzd.zzc(zzwgVar2, jLongValue, jLongValue, jLongValue, jMax, zzmaVarZzd.zzh, zzmaVarZzd.zzi, zzmaVarZzd.zzj);
            zzmaVarZzc.zzq = j;
            return zzmaVarZzc;
        }
        int iZze = zzbfVar.zze(zzmaVarZzd.zzk.zza);
        if (iZze != -1) {
            zzbd zzbdVar2 = this.zzp;
            if (zzbfVar.zzd(iZze, zzbdVar2, false).zzc == zzbfVar.zzo(zzwgVar2.zza, zzbdVar2).zzc) {
                return zzmaVarZzd;
            }
        }
        Object obj2 = zzwgVar2.zza;
        zzbd zzbdVar3 = this.zzp;
        zzbfVar.zzo(obj2, zzbdVar3);
        long jZzh = zzwgVar2.zzb() ? zzbdVar3.zzh(zzwgVar2.zzb, zzwgVar2.zzc) : zzbdVar3.zzd;
        zzwg zzwgVar4 = zzwgVar2;
        zzma zzmaVarZzh3 = zzmaVarZzd.zzc(zzwgVar4, zzmaVarZzd.zzs, zzmaVarZzd.zzs, zzmaVarZzd.zzd, jZzh - zzmaVarZzd.zzs, zzmaVarZzd.zzh, zzmaVarZzd.zzi, zzmaVarZzd.zzj).zzh(zzwgVar4);
        zzmaVarZzh3.zzq = jZzh;
        return zzmaVarZzh3;
    }

    private static zzma zzak(zzma zzmaVar, int i2) {
        zzma zzmaVarZze = zzmaVar.zze(i2);
        return (i2 == 1 || i2 == 4) ? zzmaVarZze.zzg(false) : zzmaVarZze;
    }

    private final Pair zzal(zzbf zzbfVar, int i2, long j) {
        if (zzbfVar.zzg()) {
            this.zzZ = i2;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.zzaa = j;
            return null;
        }
        if (i2 == -1 || i2 >= zzbfVar.zza()) {
            i2 = zzbfVar.zzk(false);
            long j2 = zzbfVar.zzb(i2, this.zza, 0L).zzl;
            j = zzfj.zzp(0L);
        }
        return zzbfVar.zzm(this.zza, this.zzp, i2, zzfj.zzq(j));
    }

    private final long zzam(zzbf zzbfVar, zzwg zzwgVar, long j) {
        zzbfVar.zzo(zzwgVar.zza, this.zzp);
        return j;
    }

    private final zzme zzan(zzmd zzmdVar) {
        int iZzae = zzae(this.zzY);
        zzbf zzbfVar = this.zzY.zza;
        if (iZzae == -1) {
            iZzae = 0;
        }
        zzdn zzdnVar = this.zzv;
        zzlc zzlcVar = this.zzm;
        return new zzme(zzlcVar, zzmdVar, zzbfVar, iZzae, zzdnVar, zzlcVar.zzn());
    }

    private final void zzao(Object obj) {
        Object obj2 = this.zzM;
        boolean z2 = false;
        if (obj2 != null && obj2 != obj) {
            z2 = true;
        }
        boolean zZzl = this.zzm.zzl(obj, z2 ? this.zzA : -9223372036854775807L);
        if (z2) {
            Object obj3 = this.zzM;
            Surface surface = this.zzN;
            if (obj3 == surface) {
                surface.release();
                this.zzN = null;
            }
        }
        this.zzM = obj;
        if (zZzl) {
            return;
        }
        zzP(zzit.zzc(new zzld(3), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzap, reason: merged with bridge method [inline-methods] */
    public final void zzS(final int i2, final int i3) {
        if (i2 == this.zzP.zza() && i3 == this.zzP.zzb()) {
            return;
        }
        this.zzP = new zzes(i2, i3);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(24, new zzdy() { // from class: com.google.android.gms.internal.ads.zzjz
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i4 = zzkp.zzd;
                ((zzaz) obj).zzu(i2, i3);
            }
        });
        zzedVar.zze();
        zzas(2, 14, new zzes(i2, i3));
    }

    private final void zzaq() {
        int iZzh = zzh();
        if (iZzh != 2 && iZzh != 3) {
            this.zzy.zzb(false);
            this.zzz.zza(false);
        } else {
            zzar();
            boolean z2 = this.zzY.zzp;
            this.zzy.zzb(zzk());
            this.zzz.zza(zzk());
        }
    }

    private final void zzar() {
        this.zze.zzd();
        Looper looper = this.zzt;
        if (Thread.currentThread() != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = zzfj.zza;
            Locale locale = Locale.US;
            String strN = androidx.datastore.preferences.protobuf.a.n("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.zzT) {
                throw new IllegalStateException(strN);
            }
            zzee.zzd("ExoPlayerImpl", strN, this.zzU ? null : new IllegalStateException());
            this.zzU = true;
        }
    }

    private final void zzas(int i2, int i3, Object obj) {
        zzmi[] zzmiVarArr = this.zzh;
        int length = zzmiVarArr.length;
        for (int i4 = 0; i4 < 2; i4++) {
            zzmi zzmiVar = zzmiVarArr[i4];
            if (i2 == -1 || zzmiVar.zza() == i2) {
                zzme zzmeVarZzan = zzan(zzmiVar);
                zzmeVarZzan.zzb(i3);
                zzmeVarZzan.zzd(obj);
                zzmeVarZzan.zzg();
            }
        }
        zzmi[] zzmiVarArr2 = this.zzi;
        int length2 = zzmiVarArr2.length;
        for (int i5 = 0; i5 < 2; i5++) {
            zzmi zzmiVar2 = zzmiVarArr2[i5];
            if (zzmiVar2 != null && (i2 == -1 || zzmiVar2.zza() == i2)) {
                zzme zzmeVarZzan2 = zzan(zzmiVar2);
                zzmeVarZzan2.zzb(i3);
                zzmeVarZzan2.zzd(obj);
                zzmeVarZzan2.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzA() {
        zzar();
        return zzaf(this.zzY);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzB(float f) {
        zzar();
        String str = zzfj.zza;
        final float fMax = Math.max(0.0f, Math.min(f, 1.0f));
        if (this.zzR == fMax) {
            return;
        }
        this.zzR = fMax;
        this.zzm.zzj(fMax);
        zzed zzedVar = this.zzn;
        zzedVar.zzd(22, new zzdy() { // from class: com.google.android.gms.internal.ads.zzke
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i2 = zzkp.zzd;
                ((zzaz) obj).zzr(fMax);
            }
        });
        zzedVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzC(Surface surface) {
        zzar();
        zzao(surface);
        int i2 = surface == null ? 0 : -1;
        zzS(i2, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final void zzD(zzmx zzmxVar) {
        this.zzs.zzv(zzmxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final void zzE(zzmx zzmxVar) {
        zzar();
        this.zzs.zzw(zzmxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final int zzF() {
        zzar();
        int length = this.zzh.length;
        return 2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ac  */
    @Override // com.google.android.gms.internal.ads.zzje
    public final void zzG(zzwi zzwiVar) {
        zzar();
        List listSingletonList = Collections.singletonList(zzwiVar);
        zzar();
        zzar();
        zzae(this.zzY);
        zzu();
        this.zzE++;
        List list = this.zzq;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                list.remove(i2);
            }
            this.zzab = this.zzab.zzg(0, size);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < listSingletonList.size(); i3++) {
            zzlw zzlwVar = new zzlw((zzwi) listSingletonList.get(i3), this.zzr);
            arrayList.add(zzlwVar);
            list.add(i3, new zzkl(zzlwVar.zzb, zzlwVar.zza));
        }
        this.zzab = this.zzab.zzf(0, arrayList.size());
        zzmg zzmgVar = new zzmg(list, this.zzab);
        if (!zzmgVar.zzg() && zzmgVar.zza() < 0) {
            throw new zzw(zzmgVar, -1, -9223372036854775807L);
        }
        int iZzk = zzmgVar.zzk(false);
        zzma zzmaVarZzaj = zzaj(this.zzY, zzmgVar, zzal(zzmgVar, iZzk, -9223372036854775807L));
        int i4 = zzmaVarZzaj.zze;
        if (i4 == 1) {
            i4 = 1;
        } else if (zzmgVar.zzg()) {
            i4 = 4;
        } else if (iZzk != -1) {
            if (iZzk >= zzmgVar.zza()) {
                i4 = 4;
            } else {
                i4 = 2;
            }
        }
        zzma zzmaVarZzak = zzak(zzmaVarZzaj, i4);
        this.zzm.zzy(arrayList, iZzk, zzfj.zzq(-9223372036854775807L), this.zzab);
        zzah(zzmaVarZzak, 0, (this.zzY.zzb.zza.equals(zzmaVarZzak.zzb.zza) || this.zzY.zza.zzg()) ? false : true, 4, zzag(zzmaVarZzak), -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzje
    public final void zzH() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = zzfj.zza;
        String strZza = zzal.zza();
        int length = String.valueOf(hexString).length();
        StringBuilder sb = new StringBuilder(length + 41 + String.valueOf(str).length() + 3 + String.valueOf(strZza).length() + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "Release ", hexString, " [AndroidXMedia3/1.9.0-alpha01] [", str);
        sb.append("] [");
        sb.append(strZza);
        sb.append(d9.i.f24752e);
        zzee.zzb("ExoPlayerImpl", sb.toString());
        zzar();
        this.zzy.zzb(false);
        this.zzz.zza(false);
        zzko zzkoVar = this.zzD;
        if (zzkoVar != null && Build.VERSION.SDK_INT >= 34) {
            zzkoVar.zza();
        }
        this.zzC.zza();
        if (!this.zzm.zzm()) {
            zzed zzedVar = this.zzn;
            zzedVar.zzd(10, zzkd.zza);
            zzedVar.zze();
        }
        this.zzn.zzf();
        this.zzk.zzm(null);
        zzaam zzaamVar = this.zzu;
        zzmu zzmuVar = this.zzs;
        zzaamVar.zzg(zzmuVar);
        zzma zzmaVar = this.zzY;
        boolean z2 = zzmaVar.zzp;
        zzma zzmaVarZzak = zzak(zzmaVar, 1);
        this.zzY = zzmaVarZzak;
        zzma zzmaVarZzh = zzmaVarZzak.zzh(zzmaVarZzak.zzb);
        this.zzY = zzmaVarZzh;
        zzmaVarZzh.zzq = zzmaVarZzh.zzs;
        this.zzY.zzr = 0L;
        zzmuVar.zzy();
        Surface surface = this.zzN;
        if (surface != null) {
            surface.release();
            this.zzN = null;
        }
        int i2 = zzcz.zza;
        this.zzW = true;
    }

    public final zzit zzI() {
        zzar();
        return this.zzY.zzf;
    }

    public final /* synthetic */ void zzJ(zzaz zzazVar, zzs zzsVar) {
        zzazVar.zza(this.zzg, new zzay(zzsVar));
    }

    public final /* synthetic */ void zzK(final zzkz zzkzVar) {
        this.zzk.zzn(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzO(zzkzVar);
            }
        });
    }

    public final /* synthetic */ void zzL(int i2, final int i3) {
        zzar();
        Integer numValueOf = Integer.valueOf(i3);
        zzas(1, 10, numValueOf);
        zzas(2, 10, numValueOf);
        zzdy zzdyVar = new zzdy() { // from class: com.google.android.gms.internal.ads.zzka
            @Override // com.google.android.gms.internal.ads.zzdy
            public final /* synthetic */ void zza(Object obj) {
                int i4 = zzkp.zzd;
                ((zzaz) obj).zzq(i3);
            }
        };
        zzed zzedVar = this.zzn;
        zzedVar.zzd(21, zzdyVar);
        zzedVar.zze();
    }

    public final /* synthetic */ void zzM() {
        String str = zzfj.zza;
        int iGenerateAudioSessionId = zzcj.zza(this.zzf).generateAudioSessionId();
        if (iGenerateAudioSessionId == -1) {
            iGenerateAudioSessionId = 0;
        }
        this.zzB.zzb(Integer.valueOf(iGenerateAudioSessionId));
    }

    public final /* synthetic */ void zzN(zzaz zzazVar) {
        zzazVar.zzg(this.zzK);
    }

    public final /* synthetic */ void zzO(zzkz zzkzVar) {
        boolean z2;
        int i2 = this.zzE - zzkzVar.zzb;
        this.zzE = i2;
        boolean z3 = true;
        if (zzkzVar.zzc) {
            this.zzF = zzkzVar.zzd;
            this.zzG = true;
        }
        if (i2 == 0) {
            zzbf zzbfVar = zzkzVar.zza.zza;
            if (!this.zzY.zza.zzg() && zzbfVar.zzg()) {
                this.zzZ = -1;
                this.zzaa = 0L;
            }
            if (!zzbfVar.zzg()) {
                List listZzw = ((zzmg) zzbfVar).zzw();
                int size = listZzw.size();
                List list = this.zzq;
                zzgqa.zzi(size == list.size());
                for (int i3 = 0; i3 < listZzw.size(); i3++) {
                    ((zzkl) list.get(i3)).zzc((zzbf) listZzw.get(i3));
                }
            }
            long j = -9223372036854775807L;
            if (this.zzG) {
                if (zzkzVar.zza.zzb.equals(this.zzY.zzb) && zzkzVar.zza.zzd == this.zzY.zzs) {
                    z3 = false;
                }
                if (z3) {
                    if (zzbfVar.zzg() || zzkzVar.zza.zzb.zzb()) {
                        j = zzkzVar.zza.zzd;
                    } else {
                        zzma zzmaVar = zzkzVar.zza;
                        zzwg zzwgVar = zzmaVar.zzb;
                        long j2 = zzmaVar.zzd;
                        zzam(zzbfVar, zzwgVar, j2);
                        j = j2;
                    }
                }
                z2 = z3;
            } else {
                z2 = false;
            }
            this.zzG = false;
            zzah(zzkzVar.zza, 1, z2, this.zzF, j, -1, false);
        }
    }

    public final /* synthetic */ void zzQ(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        zzao(surface);
        this.zzN = surface;
    }

    public final /* synthetic */ void zzR(Object obj) {
        zzao(null);
    }

    public final /* synthetic */ void zzT(int i2, int i3, Object obj) {
        zzas(1, 19, obj);
    }

    public final /* synthetic */ zzed zzU() {
        return this.zzn;
    }

    public final /* synthetic */ zzmu zzV() {
        return this.zzs;
    }

    public final /* synthetic */ Looper zzW() {
        return this.zzt;
    }

    public final /* synthetic */ zzdn zzX() {
        return this.zzv;
    }

    public final /* synthetic */ zzdm zzY() {
        return this.zzB;
    }

    public final /* synthetic */ Object zzZ() {
        return this.zzM;
    }

    public final /* synthetic */ boolean zzaa() {
        return this.zzS;
    }

    public final /* synthetic */ void zzab(boolean z2) {
        this.zzS = z2;
    }

    public final /* synthetic */ boolean zzac() {
        return this.zzW;
    }

    @Override // com.google.android.gms.internal.ads.zzf
    public final void zzc(int i2, long j, int i3, boolean z2) {
        zzar();
        if (i2 == -1) {
            return;
        }
        zzgqa.zza(i2 >= 0);
        zzbf zzbfVar = this.zzY.zza;
        if (zzbfVar.zzg() || i2 < zzbfVar.zza()) {
            this.zzs.zzA();
            this.zzE++;
            if (zzx()) {
                zzee.zzc("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                zzkz zzkzVar = new zzkz(this.zzY);
                zzkzVar.zza(1);
                this.zzl.zza(zzkzVar);
                return;
            }
            zzma zzmaVarZzak = this.zzY;
            int i4 = zzmaVarZzak.zze;
            if (i4 == 3 || (i4 == 4 && !zzbfVar.zzg())) {
                zzmaVarZzak = zzak(this.zzY, 2);
            }
            int iZzs = zzs();
            zzma zzmaVarZzaj = zzaj(zzmaVarZzak, zzbfVar, zzal(zzbfVar, i2, j));
            this.zzm.zzf(zzbfVar, i2, zzfj.zzq(j));
            zzah(zzmaVarZzaj, 0, true, 1, zzag(zzmaVarZzaj), iZzs, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final Looper zzd() {
        return this.zzt;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zze(zzaz zzazVar) {
        zzazVar.getClass();
        this.zzn.zzb(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzf(zzaz zzazVar) {
        zzar();
        zzazVar.getClass();
        this.zzn.zzc(zzazVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzg() {
        zzar();
        zzma zzmaVar = this.zzY;
        if (zzmaVar.zze != 1) {
            return;
        }
        zzma zzmaVarZzf = zzmaVar.zzf(null);
        zzma zzmaVarZzak = zzak(zzmaVarZzf, true != zzmaVarZzf.zza.zzg() ? 2 : 4);
        this.zzE++;
        this.zzm.zzd();
        zzah(zzmaVarZzak, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzh() {
        zzar();
        return this.zzY.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzi() {
        zzar();
        return this.zzY.zzn;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzj(boolean z2) {
        zzar();
        zzma zzmaVar = this.zzY;
        int i2 = zzmaVar.zzn;
        int i3 = 0;
        if (i2 == 1) {
            if (z2) {
                i2 = 1;
            } else {
                i2 = 1;
                i3 = 1;
            }
        }
        if (zzmaVar.zzl == z2 && i2 == i3 && zzmaVar.zzm == 1) {
            return;
        }
        this.zzE++;
        zzma zzmaVarZzi = zzmaVar.zzi(z2, 1, i3);
        this.zzm.zze(z2, 1, i3);
        zzah(zzmaVarZzi, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzk() {
        zzar();
        return this.zzY.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzl() {
        zzar();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzm() {
        zzar();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzav zzn() {
        zzar();
        return this.zzY.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzo() {
        zzar();
        zzP(null);
        new zzcz(zzgtd.zzi(), this.zzY.zzs);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbn zzp() {
        zzar();
        return this.zzY.zzi.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final zzbf zzq() {
        zzar();
        return this.zzY.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzr() {
        zzar();
        if (this.zzY.zza.zzg()) {
            return 0;
        }
        zzma zzmaVar = this.zzY;
        return zzmaVar.zza.zze(zzmaVar.zzb.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzs() {
        zzar();
        int iZzae = zzae(this.zzY);
        if (iZzae == -1) {
            return 0;
        }
        return iZzae;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzt() {
        zzar();
        if (!zzx()) {
            zzbf zzbfVarZzq = zzq();
            if (zzbfVarZzq.zzg()) {
                return -9223372036854775807L;
            }
            return zzfj.zzp(zzbfVarZzq.zzb(zzs(), this.zza, 0L).zzm);
        }
        zzma zzmaVar = this.zzY;
        zzwg zzwgVar = zzmaVar.zzb;
        zzbf zzbfVar = zzmaVar.zza;
        Object obj = zzwgVar.zza;
        zzbd zzbdVar = this.zzp;
        zzbfVar.zzo(obj, zzbdVar);
        return zzfj.zzp(zzbdVar.zzh(zzwgVar.zzb, zzwgVar.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzu() {
        zzar();
        return zzfj.zzp(zzag(this.zzY));
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzv() {
        zzar();
        if (zzx()) {
            zzma zzmaVar = this.zzY;
            return zzmaVar.zzk.equals(zzmaVar.zzb) ? zzfj.zzp(this.zzY.zzq) : zzt();
        }
        zzar();
        if (this.zzY.zza.zzg()) {
            return this.zzaa;
        }
        zzma zzmaVar2 = this.zzY;
        long j = 0;
        if (zzmaVar2.zzk.zzd != zzmaVar2.zzb.zzd) {
            return zzfj.zzp(zzmaVar2.zza.zzb(zzs(), this.zza, 0L).zzm);
        }
        long j2 = zzmaVar2.zzq;
        if (this.zzY.zzk.zzb()) {
            zzma zzmaVar3 = this.zzY;
            zzmaVar3.zza.zzo(zzmaVar3.zzk.zza, this.zzp).zzc(this.zzY.zzk.zzb);
        } else {
            j = j2;
        }
        zzma zzmaVar4 = this.zzY;
        zzam(zzmaVar4.zza, zzmaVar4.zzk, j);
        return zzfj.zzp(j);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final long zzw() {
        zzar();
        return zzfj.zzp(this.zzY.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zzx() {
        zzar();
        return this.zzY.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzy() {
        zzar();
        if (zzx()) {
            return this.zzY.zzb.zzb;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final int zzz() {
        zzar();
        if (zzx()) {
            return this.zzY.zzb.zzc;
        }
        return -1;
    }
}
