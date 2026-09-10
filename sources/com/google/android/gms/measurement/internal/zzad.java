package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzpu;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzad extends zzos {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzad(zzpg zzpgVar) {
        super(zzpgVar);
    }

    private final zzy zzc(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzd(int i2, int i3) {
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i2));
        if (zzyVar == null) {
            return false;
        }
        return zzyVar.zzc().get(i3);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:105:0x0257  */
    /* JADX WARN: Code duplicated, block: B:107:0x0262  */
    /* JADX WARN: Code duplicated, block: B:111:0x028e A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, LOOP:11: B:111:0x028e->B:515:?, LOOP_START, TryCatch #4 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:436:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x029f A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TryCatch #4 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:436:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:122:0x02c2 A[Catch: all -> 0x02a9, SQLiteException -> 0x02ab, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x02a9, blocks: (B:109:0x0288, B:111:0x028e, B:113:0x029f, B:119:0x02ad, B:122:0x02c2, B:131:0x02d0), top: B:436:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:140:0x030b  */
    /* JADX WARN: Code duplicated, block: B:142:0x0322  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:172:0x0404  */
    /* JADX WARN: Code duplicated, block: B:174:0x0424  */
    /* JADX WARN: Code duplicated, block: B:180:0x043b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0457  */
    /* JADX WARN: Code duplicated, block: B:185:0x0460  */
    /* JADX WARN: Code duplicated, block: B:189:0x046e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0485  */
    /* JADX WARN: Code duplicated, block: B:201:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:208:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:214:0x050d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x0596  */
    /* JADX WARN: Code duplicated, block: B:242:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:248:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:256:0x0621  */
    /* JADX WARN: Code duplicated, block: B:263:0x0649 A[Catch: all -> 0x0652, SQLiteException -> 0x0654, TryCatch #3 {SQLiteException -> 0x0654, blocks: (B:258:0x0624, B:259:0x0628, B:261:0x0639, B:263:0x0649, B:268:0x0656, B:271:0x066c, B:270:0x065b, B:275:0x0679), top: B:434:0x0624 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x0677  */
    /* JADX WARN: Code duplicated, block: B:276:0x067b A[PHI: r0 r7 r20 r22
  0x067b: PHI (r0v94 java.util.Map) = (r0v96 java.util.Map), (r0v102 java.util.Map) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
  0x067b: PHI (r7v22 android.database.Cursor) = (r7v23 android.database.Cursor), (r7v24 android.database.Cursor) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
  0x067b: PHI (r20v8 long) = (r20v9 long), (r20v12 long) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]
  0x067b: PHI (r22v12 com.google.android.gms.measurement.internal.zzbc) = (r22v13 com.google.android.gms.measurement.internal.zzbc), (r22v15 com.google.android.gms.measurement.internal.zzbc) binds: [B:291:0x06b2, B:275:0x0679] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:297:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:301:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:307:0x070a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0733 A[LOOP:10: B:305:0x0704->B:309:0x0733, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:313:0x0747  */
    /* JADX WARN: Code duplicated, block: B:317:0x075b  */
    /* JADX WARN: Code duplicated, block: B:320:0x0763  */
    /* JADX WARN: Code duplicated, block: B:323:0x0772  */
    /* JADX WARN: Code duplicated, block: B:325:0x0785  */
    /* JADX WARN: Code duplicated, block: B:329:0x07be A[Catch: all -> 0x07ef, SQLiteException -> 0x07ff, LOOP:3: B:329:0x07be->B:351:0x0826, LOOP_START, PHI: r3 r6
  0x07be: PHI (r3v44 java.lang.String) = (r3v36 java.lang.String), (r3v48 java.lang.String) binds: [B:328:0x07bc, B:351:0x0826] A[DONT_GENERATE, DONT_INLINE]
  0x07be: PHI (r6v35 java.util.Iterator) = (r6v27 java.util.Iterator), (r6v37 java.util.Iterator) binds: [B:328:0x07bc, B:351:0x0826] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #7 {all -> 0x07ef, blocks: (B:327:0x07b8, B:329:0x07be, B:330:0x07c3, B:332:0x07d4, B:335:0x07e6, B:341:0x07f9, B:348:0x081b, B:364:0x0844, B:345:0x0804, B:347:0x0814, B:355:0x0831), top: B:441:0x07b8 }] */
    /* JADX WARN: Code duplicated, block: B:334:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:340:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:351:0x0826 A[LOOP:3: B:329:0x07be->B:351:0x0826, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:354:0x082d  */
    /* JADX WARN: Code duplicated, block: B:356:0x0833 A[PHI: r0 r13 r18 r38
  0x0833: PHI (r0v154 java.util.Map) = (r0v156 java.util.Map), (r0v162 java.util.Map) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
  0x0833: PHI (r13v11 android.database.Cursor) = (r13v12 android.database.Cursor), (r13v13 android.database.Cursor) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
  0x0833: PHI (r18v7 java.lang.String) = (r18v8 java.lang.String), (r18v13 java.lang.String) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]
  0x0833: PHI (r38v7 java.util.Iterator) = (r38v8 java.util.Iterator), (r38v11 java.util.Iterator) binds: [B:365:0x0857, B:355:0x0831] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:371:0x0864  */
    /* JADX WARN: Code duplicated, block: B:375:0x0876  */
    /* JADX WARN: Code duplicated, block: B:379:0x089b  */
    /* JADX WARN: Code duplicated, block: B:382:0x08ac  */
    /* JADX WARN: Code duplicated, block: B:384:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:386:0x08d1  */
    /* JADX WARN: Code duplicated, block: B:388:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:390:0x0909  */
    /* JADX WARN: Code duplicated, block: B:393:0x0913  */
    /* JADX WARN: Code duplicated, block: B:402:0x095c  */
    /* JADX WARN: Code duplicated, block: B:403:0x0965  */
    /* JADX WARN: Code duplicated, block: B:407:0x0976 A[PHI: r16 r39
  0x0976: PHI (r16v9 java.lang.String) = (r16v10 java.lang.String), (r2v25 java.lang.String) binds: [B:406:0x0974, B:404:0x0966] A[DONT_GENERATE, DONT_INLINE]
  0x0976: PHI (r39v3 java.util.Map) = (r39v4 java.util.Map), (r0v136 java.util.Map) binds: [B:406:0x0974, B:404:0x0966] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:412:0x099b  */
    /* JADX WARN: Code duplicated, block: B:425:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:483:0x0821 A[EDGE_INSN: B:483:0x0821->B:350:0x0821 BREAK  A[LOOP:3: B:329:0x07be->B:351:0x0826], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0888 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x097b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x0948 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:0x0970 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x09f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x0995 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x05b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x05a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:0x05a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x06f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x06eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0743 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x073d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:517:0x056f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x0447 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x0435 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:0x0491 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:0x047f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0328 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x020d A[EDGE_INSN: B:556:0x020d->B:83:0x020d BREAK  A[LOOP:20: B:70:0x01c1->B:84:0x0212], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x016d  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #8 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:443:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #8 {all -> 0x01b0, blocks: (B:59:0x019c, B:61:0x01a2, B:69:0x01bc, B:70:0x01c1, B:71:0x01cb, B:72:0x01db, B:81:0x0207, B:74:0x01ea, B:78:0x01fa, B:80:0x0200, B:98:0x0230), top: B:443:0x019c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0212 A[LOOP:20: B:70:0x01c1->B:84:0x0212, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v205 */
    /* JADX WARN: Type inference failed for: r0v206 */
    /* JADX WARN: Type inference failed for: r0v49, types: [androidx.collection.ArrayMap, androidx.collection.SimpleArrayMap] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v23 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v22, types: [androidx.collection.ArrayMap, androidx.collection.SimpleArrayMap] */
    /* JADX WARN: Type inference failed for: r4v32, types: [androidx.collection.ArrayMap, androidx.collection.SimpleArrayMap] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    public final List zzb(String str, List list, List list2, Long l2, Long l3, boolean z2) throws Throwable {
        int i2;
        int i3;
        boolean z3;
        Map map;
        Cursor cursor;
        boolean z4;
        String str2;
        Cursor cursorQuery;
        Map map2;
        HashSet hashSet;
        HashSet<Integer> hashSet2;
        Map map3;
        com.google.android.gms.internal.measurement.zzii zziiVar;
        BitSet bitSet;
        BitSet bitSet2;
        ArrayMap arrayMap;
        com.google.android.gms.internal.measurement.zzii zziiVar2;
        List list3;
        int i4;
        boolean z5;
        Iterator it;
        com.google.android.gms.internal.measurement.zzik zzikVar;
        Long lValueOf;
        String str3;
        ?? arrayMap2;
        SQLiteDatabase sQLiteDatabaseZze;
        ?? r5;
        Cursor cursorRawQuery;
        ?? r0;
        ArrayMap arrayMap3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.zzii zziiVar3;
        List list4;
        ?? r16;
        HashSet hashSet3;
        Iterator it3;
        Integer numValueOf;
        List arrayList;
        String str4;
        String str5;
        String str6;
        zzz zzzVar;
        ?? arrayMap4;
        Iterator it4;
        com.google.android.gms.internal.measurement.zzhs zzhsVar;
        com.google.android.gms.internal.measurement.zzhs zzhsVarZza;
        zzpg zzpgVar;
        zzbc zzbcVarZzaf;
        long j;
        String strZzd;
        Map map4;
        zzbc zzbcVar;
        long j2;
        String str7;
        String str8;
        int iIntValue;
        Iterator it5;
        boolean zZzd;
        Map map5;
        zzaa zzaaVar;
        zzav zzavVarZzj;
        String str9;
        ArrayMap arrayMap5;
        Cursor cursor2;
        Cursor cursorQuery2;
        Integer numValueOf2;
        List arrayList2;
        String str10;
        String str11;
        ArrayList arrayList3;
        zzav zzavVarZzj2;
        String str12;
        ContentValues contentValues;
        ?? arrayMap6;
        Iterator it6;
        String strZzc;
        Map map6;
        String str13;
        Iterator it7;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzfn zzfnVar;
        zzic zzicVar;
        Integer numValueOf3;
        zzac zzacVar;
        Integer numValueOf4;
        zzav zzavVarZzj3;
        String str14;
        ArrayMap arrayMap7;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf5;
        List list5;
        List arrayList4;
        ArrayMap arrayMap8;
        int i5;
        Cursor cursorQuery4;
        List arrayList5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l2;
        this.zze = l3;
        Iterator it8 = list.iterator();
        while (true) {
            i2 = 1;
            i3 = 0;
            if (!it8.hasNext()) {
                z3 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it8.next()).zzd())) {
                z3 = true;
                break;
            }
        }
        zzpu.zza();
        zzic zzicVar2 = this.zzu;
        boolean zZzp = zzicVar2.zzc().zzp(this.zza, zzfy.zzaF);
        zzpu.zza();
        boolean zZzp2 = zzicVar2.zzc().zzp(this.zza, zzfy.zzaE);
        if (z3) {
            zzav zzavVarZzj4 = this.zzg.zzj();
            String str15 = this.zza;
            zzavVarZzj4.zzaw();
            zzavVarZzj4.zzg();
            Preconditions.checkNotEmpty(str15);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                zzavVarZzj4.zze().update("events", contentValues2, "app_id = ?", new String[]{str15});
            } catch (SQLiteException e2) {
                zzavVarZzj4.zzu.zzaV().zzb().zzc("Error resetting session-scoped event counts. appId", zzgu.zzl(str15), e2);
            }
        }
        Map map7 = Collections.EMPTY_MAP;
        String str16 = "data";
        String str17 = "audience_id";
        if (zZzp2 && zZzp) {
            zzav zzavVarZzj5 = this.zzg.zzj();
            String str18 = this.zza;
            Preconditions.checkNotEmpty(str18);
            ArrayMap arrayMap9 = new ArrayMap();
            try {
                cursorQuery4 = zzavVarZzj5.zze().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str18}, null, null, null);
                try {
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzff zzffVar = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery4.getBlob(i2))).zzbc();
                                    if (zzffVar.zzg()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i3));
                                        List list6 = (List) arrayMap9.get(numValueOf6);
                                        if (list6 == null) {
                                            arrayList5 = new ArrayList();
                                            arrayMap9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(zzffVar);
                                    }
                                } catch (IOException e3) {
                                    zzavVarZzj5.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str18), e3);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i2 = 1;
                                i3 = 0;
                            }
                            cursorQuery4.close();
                            map = arrayMap9;
                        } else {
                            cursorQuery4.close();
                            map = map7;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery4 != null) {
                            cursorQuery4.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    zzavVarZzj5.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str18), e);
                    map7 = Collections.EMPTY_MAP;
                    if (cursorQuery4 != null) {
                    }
                    map = map7;
                    zzav zzavVarZzj6 = this.zzg.zzj();
                    String str19 = this.zza;
                    zzavVarZzj6.zzaw();
                    zzavVarZzj6.zzg();
                    Preconditions.checkNotEmpty(str19);
                    cursorQuery = zzavVarZzj6.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str19}, null, null, null);
                    try {
                        if (cursorQuery.moveToFirst()) {
                            arrayMap8 = new ArrayMap();
                            while (true) {
                                i5 = cursorQuery.getInt(0);
                                try {
                                    arrayMap8.put(Integer.valueOf(i5), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                                    z4 = z3;
                                    str2 = str16;
                                } catch (IOException e5) {
                                    z4 = z3;
                                    str2 = str16;
                                    try {
                                        zzavVarZzj6.zzu.zzaV().zzb().zzd("Failed to merge filter results. appId, audienceId, error", zzgu.zzl(str19), Integer.valueOf(i5), e5);
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        str17 = str17;
                                        zzavVarZzj6.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str19), e);
                                        Map map8 = Collections.EMPTY_MAP;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        map2 = map8;
                                        if (!map2.isEmpty()) {
                                            hashSet = new HashSet(map2.keySet());
                                            if (z4) {
                                                String str20 = this.zza;
                                                zzav zzavVarZzj7 = this.zzg.zzj();
                                                str3 = this.zza;
                                                zzavVarZzj7.zzaw();
                                                zzavVarZzj7.zzg();
                                                Preconditions.checkNotEmpty(str3);
                                                arrayMap2 = new ArrayMap();
                                                sQLiteDatabaseZze = zzavVarZzj7.zze();
                                                try {
                                                    try {
                                                        cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                                                        try {
                                                            if (cursorRawQuery.moveToFirst()) {
                                                                do {
                                                                    numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                    arrayList = (List) arrayMap2.get(numValueOf);
                                                                    if (arrayList == null) {
                                                                        arrayList = new ArrayList();
                                                                        arrayMap2.put(numValueOf, arrayList);
                                                                    }
                                                                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                } while (cursorRawQuery.moveToNext());
                                                            } else {
                                                                arrayMap2 = Collections.EMPTY_MAP;
                                                            }
                                                        } catch (SQLiteException e7) {
                                                            e = e7;
                                                            zzavVarZzj7.zzu.zzaV().zzb().zzc("Database error querying scoped filters. appId", zzgu.zzl(str3), e);
                                                            arrayMap2 = Collections.EMPTY_MAP;
                                                            r0 = arrayMap2;
                                                            if (cursorRawQuery != null) {
                                                            }
                                                            Preconditions.checkNotEmpty(str20);
                                                            Preconditions.checkNotNull(map2);
                                                            arrayMap3 = new ArrayMap();
                                                            if (!map2.isEmpty()) {
                                                                it2 = map2.keySet().iterator();
                                                                while (it2.hasNext()) {
                                                                    num = (Integer) it2.next();
                                                                    num.getClass();
                                                                    zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                                    list4 = (List) r0.get(num);
                                                                    if (list4 != null) {
                                                                    }
                                                                    r16 = r0;
                                                                    hashSet3 = hashSet;
                                                                    it3 = it2;
                                                                    arrayMap3.put(num, zziiVar3);
                                                                    r0 = r16;
                                                                    hashSet = hashSet3;
                                                                    it2 = it3;
                                                                }
                                                            }
                                                            hashSet2 = hashSet;
                                                            map3 = arrayMap3;
                                                            for (Integer num2 : hashSet2) {
                                                                num2.getClass();
                                                                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num2);
                                                                bitSet = new BitSet();
                                                                bitSet2 = new BitSet();
                                                                arrayMap = new ArrayMap();
                                                                if (zziiVar != null) {
                                                                    for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                                                                        if (zzhqVar.zza()) {
                                                                            Map map9 = map3;
                                                                            Integer numValueOf7 = Integer.valueOf(zzhqVar.zzb());
                                                                            if (zzhqVar.zzc()) {
                                                                                lValueOf = Long.valueOf(zzhqVar.zzd());
                                                                            } else {
                                                                                lValueOf = null;
                                                                            }
                                                                            arrayMap.put(numValueOf7, lValueOf);
                                                                            map3 = map9;
                                                                        }
                                                                    }
                                                                }
                                                                Map map10 = map3;
                                                                ArrayMap arrayMap10 = new ArrayMap();
                                                                if (zziiVar != null) {
                                                                    it = zziiVar.zzg().iterator();
                                                                    while (it.hasNext()) {
                                                                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                                        if (!zzikVar.zza()) {
                                                                        }
                                                                    }
                                                                }
                                                                zziiVar2 = zziiVar;
                                                                if (zziiVar2 != null) {
                                                                    i4 = 0;
                                                                    while (i4 < zziiVar2.zzb() * 64) {
                                                                        if (zzpk.zzn(zziiVar2.zza(), i4)) {
                                                                            z5 = zZzp;
                                                                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i4));
                                                                            bitSet2.set(i4);
                                                                            if (zzpk.zzn(zziiVar2.zzc(), i4)) {
                                                                                bitSet.set(i4);
                                                                            }
                                                                            i4++;
                                                                            zZzp = z5;
                                                                        } else {
                                                                            z5 = zZzp;
                                                                        }
                                                                        arrayMap.remove(Integer.valueOf(i4));
                                                                        i4++;
                                                                        zZzp = z5;
                                                                    }
                                                                }
                                                                boolean z6 = zZzp;
                                                                com.google.android.gms.internal.measurement.zzii zziiVar4 = (com.google.android.gms.internal.measurement.zzii) map2.get(num2);
                                                                if (!zZzp2) {
                                                                }
                                                                this.zzc.put(num2, new zzy(this, this.zza, zziiVar4, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                                zZzp = z6;
                                                                map3 = map10;
                                                            }
                                                            str4 = str2;
                                                            str5 = str17;
                                                            str6 = "Skipping failed audience ID";
                                                            if (!list.isEmpty()) {
                                                                zzzVar = new zzz(this, null);
                                                                arrayMap4 = new ArrayMap();
                                                                it4 = list.iterator();
                                                                while (it4.hasNext()) {
                                                                    zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                                    zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                                    if (zzhsVarZza != null) {
                                                                        zzpgVar = this.zzg;
                                                                        zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                                        zzpgVar.zzj().zzh(zzbcVarZzaf);
                                                                        if (!z2) {
                                                                            j = zzbcVarZzaf.zzc;
                                                                            strZzd = zzhsVarZza.zzd();
                                                                            map4 = (Map) arrayMap4.get(strZzd);
                                                                            if (map4 == null) {
                                                                                zzavVarZzj = zzpgVar.zzj();
                                                                                str9 = this.zza;
                                                                                zzavVarZzj.zzaw();
                                                                                zzavVarZzj.zzg();
                                                                                Preconditions.checkNotEmpty(str9);
                                                                                Preconditions.checkNotEmpty(strZzd);
                                                                                arrayMap5 = new ArrayMap();
                                                                                str7 = str4;
                                                                                str8 = str5;
                                                                                try {
                                                                                    try {
                                                                                        zzbcVar = zzbcVarZzaf;
                                                                                        try {
                                                                                            cursorQuery2 = zzavVarZzj.zze().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                                                                            try {
                                                                                                try {
                                                                                                    if (cursorQuery2.moveToFirst()) {
                                                                                                        j2 = j;
                                                                                                        do {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    com.google.android.gms.internal.measurement.zzff zzffVar2 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                                                                                    numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                    arrayList2 = (List) arrayMap5.get(numValueOf2);
                                                                                                                    if (arrayList2 == null) {
                                                                                                                        arrayList2 = new ArrayList();
                                                                                                                        arrayMap5.put(numValueOf2, arrayList2);
                                                                                                                    }
                                                                                                                    arrayList2.add(zzffVar2);
                                                                                                                } catch (IOException e8) {
                                                                                                                    zzavVarZzj.zzu.zzaV().zzb().zzc("Failed to merge filter. appId", zzgu.zzl(str9), e8);
                                                                                                                }
                                                                                                            } catch (SQLiteException e9) {
                                                                                                                e = e9;
                                                                                                                zzavVarZzj.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str9), e);
                                                                                                                map4 = Collections.EMPTY_MAP;
                                                                                                                if (cursorQuery2 != null) {
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            }
                                                                                                        } while (cursorQuery2.moveToNext());
                                                                                                        cursorQuery2.close();
                                                                                                        map4 = arrayMap5;
                                                                                                    } else {
                                                                                                        j2 = j;
                                                                                                        map4 = Collections.EMPTY_MAP;
                                                                                                        cursorQuery2.close();
                                                                                                    }
                                                                                                } catch (Throwable th2) {
                                                                                                    th = th2;
                                                                                                    cursor2 = cursorQuery2;
                                                                                                    if (cursor2 != null) {
                                                                                                        cursor2.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                j2 = j;
                                                                                            }
                                                                                        } catch (SQLiteException e11) {
                                                                                            e = e11;
                                                                                            j2 = j;
                                                                                            cursorQuery2 = null;
                                                                                            zzavVarZzj.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str9), e);
                                                                                            map4 = Collections.EMPTY_MAP;
                                                                                            if (cursorQuery2 != null) {
                                                                                                cursorQuery2.close();
                                                                                            }
                                                                                            arrayMap4.put(strZzd, map4);
                                                                                            for (Integer num3 : map4.keySet()) {
                                                                                                iIntValue = num3.intValue();
                                                                                                if (this.zzb.contains(num3)) {
                                                                                                    this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                                                                                } else {
                                                                                                    it5 = ((List) map4.get(num3)).iterator();
                                                                                                    zZzd = true;
                                                                                                    while (true) {
                                                                                                        if (!it5.hasNext()) {
                                                                                                            map5 = map4;
                                                                                                            break;
                                                                                                        }
                                                                                                        com.google.android.gms.internal.measurement.zzff zzffVar3 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                                                                                        zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar3);
                                                                                                        map5 = map4;
                                                                                                        zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j2, zzbcVar, zzd(iIntValue, zzffVar3.zzb()));
                                                                                                        if (!zZzd) {
                                                                                                            this.zzb.add(num3);
                                                                                                            break;
                                                                                                        }
                                                                                                        zzc(num3).zza(zzaaVar);
                                                                                                        map4 = map5;
                                                                                                    }
                                                                                                    if (!zZzd) {
                                                                                                        this.zzb.add(num3);
                                                                                                    }
                                                                                                    map4 = map5;
                                                                                                }
                                                                                            }
                                                                                            str4 = str7;
                                                                                            str5 = str8;
                                                                                            zzzVar = zzzVar;
                                                                                            it4 = it4;
                                                                                        }
                                                                                    } catch (SQLiteException e12) {
                                                                                        e = e12;
                                                                                        zzbcVar = zzbcVarZzaf;
                                                                                    }
                                                                                    arrayMap4.put(strZzd, map4);
                                                                                } catch (Throwable th3) {
                                                                                    th = th3;
                                                                                    cursor2 = null;
                                                                                }
                                                                            } else {
                                                                                zzbcVar = zzbcVarZzaf;
                                                                                j2 = j;
                                                                                str7 = str4;
                                                                                str8 = str5;
                                                                            }
                                                                            while (r6.hasNext()) {
                                                                                iIntValue = num3.intValue();
                                                                                if (this.zzb.contains(num3)) {
                                                                                    this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                                                                } else {
                                                                                    it5 = ((List) map4.get(num3)).iterator();
                                                                                    zZzd = true;
                                                                                    while (true) {
                                                                                        if (!it5.hasNext()) {
                                                                                            map5 = map4;
                                                                                            break;
                                                                                        }
                                                                                        com.google.android.gms.internal.measurement.zzff zzffVar4 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                                                                        zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar4);
                                                                                        map5 = map4;
                                                                                        zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j2, zzbcVar, zzd(iIntValue, zzffVar4.zzb()));
                                                                                        if (!zZzd) {
                                                                                            this.zzb.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        zzc(num3).zza(zzaaVar);
                                                                                        map4 = map5;
                                                                                    }
                                                                                    if (!zZzd) {
                                                                                        this.zzb.add(num3);
                                                                                    }
                                                                                    map4 = map5;
                                                                                }
                                                                            }
                                                                            str4 = str7;
                                                                            str5 = str8;
                                                                            zzzVar = zzzVar;
                                                                            it4 = it4;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            str10 = str4;
                                                            str11 = str5;
                                                            if (!z2) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                arrayMap6 = new ArrayMap();
                                                                it6 = list2.iterator();
                                                                while (it6.hasNext()) {
                                                                    com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it6.next();
                                                                    strZzc = zziuVar.zzc();
                                                                    map6 = (Map) arrayMap6.get(strZzc);
                                                                    if (map6 == null) {
                                                                        zzavVarZzj3 = this.zzg.zzj();
                                                                        str14 = this.zza;
                                                                        zzavVarZzj3.zzaw();
                                                                        zzavVarZzj3.zzg();
                                                                        Preconditions.checkNotEmpty(str14);
                                                                        Preconditions.checkNotEmpty(strZzc);
                                                                        arrayMap7 = new ArrayMap();
                                                                        try {
                                                                            cursorQuery3 = zzavVarZzj3.zze().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                                                                            try {
                                                                                try {
                                                                                    if (cursorQuery3.moveToFirst()) {
                                                                                        while (true) {
                                                                                            try {
                                                                                                com.google.android.gms.internal.measurement.zzfn zzfnVar2 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                                                                                numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                list5 = (List) arrayMap7.get(numValueOf5);
                                                                                                if (list5 == null) {
                                                                                                    str13 = str10;
                                                                                                    try {
                                                                                                        arrayList4 = new ArrayList();
                                                                                                        arrayMap7.put(numValueOf5, arrayList4);
                                                                                                    } catch (SQLiteException e13) {
                                                                                                        e = e13;
                                                                                                        it6 = it6;
                                                                                                        zzavVarZzj3.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str14), e);
                                                                                                        map6 = Collections.EMPTY_MAP;
                                                                                                        if (cursorQuery3 != null) {
                                                                                                            cursorQuery3.close();
                                                                                                        }
                                                                                                        arrayMap6.put(strZzc, map6);
                                                                                                        for (Integer num4 : map6.keySet()) {
                                                                                                            int iIntValue2 = num4.intValue();
                                                                                                            if (this.zzb.contains(num4)) {
                                                                                                                this.zzu.zzaV().zzk().zzb(str6, num4);
                                                                                                                break;
                                                                                                            }
                                                                                                            it7 = ((List) map6.get(num4)).iterator();
                                                                                                            zZzd2 = true;
                                                                                                            while (true) {
                                                                                                                if (it7.hasNext()) {
                                                                                                                    zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                                                                                                                    zzicVar = this.zzu;
                                                                                                                    if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                                                                                                        zzgs zzgsVarZzk = zzicVar.zzaV().zzk();
                                                                                                                        if (zzfnVar.zza()) {
                                                                                                                            numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                        } else {
                                                                                                                            numValueOf4 = null;
                                                                                                                        }
                                                                                                                        zzgsVarZzk.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                                                                        zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                                                    }
                                                                                                                    if (zzfnVar.zza()) {
                                                                                                                    }
                                                                                                                    zzgs zzgsVarZze = zzicVar.zzaV().zze();
                                                                                                                    Object objZzl = zzgu.zzl(this.zza);
                                                                                                                    if (zzfnVar.zza()) {
                                                                                                                        numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                                                    } else {
                                                                                                                        numValueOf3 = null;
                                                                                                                    }
                                                                                                                    zzgsVarZze.zzc("Invalid property filter ID. appId, id", objZzl, String.valueOf(numValueOf3));
                                                                                                                    this.zzb.add(num4);
                                                                                                                    map6 = map6;
                                                                                                                    str6 = str6;
                                                                                                                } else {
                                                                                                                    map6 = map6;
                                                                                                                    str6 = str6;
                                                                                                                }
                                                                                                                if (!zZzd2) {
                                                                                                                    this.zzb.add(num4);
                                                                                                                }
                                                                                                                map6 = map6;
                                                                                                                str6 = str6;
                                                                                                                zzc(num4).zza(zzacVar);
                                                                                                                map6 = map6;
                                                                                                                str6 = str6;
                                                                                                            }
                                                                                                        }
                                                                                                        it6 = it6;
                                                                                                        str10 = str13;
                                                                                                    }
                                                                                                } else {
                                                                                                    str13 = str10;
                                                                                                    arrayList4 = list5;
                                                                                                }
                                                                                                arrayList4.add(zzfnVar2);
                                                                                            } catch (IOException e14) {
                                                                                                str13 = str10;
                                                                                                zzavVarZzj3.zzu.zzaV().zzb().zzc("Failed to merge filter", zzgu.zzl(str14), e14);
                                                                                            }
                                                                                            try {
                                                                                                if (!cursorQuery3.moveToNext()) {
                                                                                                    break;
                                                                                                }
                                                                                                it6 = it6;
                                                                                                str10 = str13;
                                                                                            } catch (SQLiteException e15) {
                                                                                                e = e15;
                                                                                                zzavVarZzj3.zzu.zzaV().zzb().zzc("Database error querying filters. appId", zzgu.zzl(str14), e);
                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                if (cursorQuery3 != null) {
                                                                                                    cursorQuery3.close();
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        cursorQuery3.close();
                                                                                        map6 = arrayMap7;
                                                                                    } else {
                                                                                        str13 = str10;
                                                                                        it6 = it6;
                                                                                        map6 = Collections.EMPTY_MAP;
                                                                                        cursorQuery3.close();
                                                                                    }
                                                                                } catch (SQLiteException e16) {
                                                                                    e = e16;
                                                                                    str13 = str10;
                                                                                }
                                                                                arrayMap6.put(strZzc, map6);
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                cursor3 = cursorQuery3;
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (SQLiteException e17) {
                                                                            e = e17;
                                                                            str13 = str10;
                                                                            it6 = it6;
                                                                            cursorQuery3 = null;
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            cursor3 = null;
                                                                        }
                                                                    } else {
                                                                        str13 = str10;
                                                                        it6 = it6;
                                                                    }
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue3 = num4.intValue();
                                                                        if (this.zzb.contains(num4)) {
                                                                            this.zzu.zzaV().zzk().zzb(str6, num4);
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num4)).iterator();
                                                                        zZzd2 = true;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                                                                                zzicVar = this.zzu;
                                                                                if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                                                                    zzgs zzgsVarZzk2 = zzicVar.zzaV().zzk();
                                                                                    if (zzfnVar.zza()) {
                                                                                        numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    zzgsVarZzk2.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                                    zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                                                }
                                                                                if (zzfnVar.zza()) {
                                                                                }
                                                                                zzgs zzgsVarZze2 = zzicVar.zzaV().zze();
                                                                                Object objZzl2 = zzgu.zzl(this.zza);
                                                                                if (zzfnVar.zza()) {
                                                                                    numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                zzgsVarZze2.zzc("Invalid property filter ID. appId, id", objZzl2, String.valueOf(numValueOf3));
                                                                                this.zzb.add(num4);
                                                                                map6 = map6;
                                                                                str6 = str6;
                                                                            } else {
                                                                                map6 = map6;
                                                                                str6 = str6;
                                                                            }
                                                                            if (!zZzd2) {
                                                                                this.zzb.add(num4);
                                                                            }
                                                                            map6 = map6;
                                                                            str6 = str6;
                                                                            zzc(num4).zza(zzacVar);
                                                                            map6 = map6;
                                                                            str6 = str6;
                                                                        }
                                                                    }
                                                                    it6 = it6;
                                                                    str10 = str13;
                                                                }
                                                            }
                                                            arrayList3 = new ArrayList();
                                                            Set<Integer> setKeySet = this.zzc.keySet();
                                                            setKeySet.removeAll(this.zzb);
                                                            for (Integer num5 : setKeySet) {
                                                                int iIntValue4 = num5.intValue();
                                                                zzy zzyVar = (zzy) this.zzc.get(num5);
                                                                Preconditions.checkNotNull(zzyVar);
                                                                com.google.android.gms.internal.measurement.zzhg zzhgVarZzb = zzyVar.zzb(iIntValue4);
                                                                arrayList3.add(zzhgVarZzb);
                                                                zzavVarZzj2 = this.zzg.zzj();
                                                                str12 = this.zza;
                                                                com.google.android.gms.internal.measurement.zzii zziiVarZzc = zzhgVarZzb.zzc();
                                                                zzavVarZzj2.zzaw();
                                                                zzavVarZzj2.zzg();
                                                                Preconditions.checkNotEmpty(str12);
                                                                Preconditions.checkNotNull(zziiVarZzc);
                                                                byte[] bArrZzcc = zziiVarZzc.zzcc();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str12);
                                                                contentValues.put(str11, num5);
                                                                contentValues.put("current_results", bArrZzcc);
                                                                try {
                                                                    try {
                                                                        if (zzavVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            zzavVarZzj2.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str12));
                                                                        }
                                                                    } catch (SQLiteException e18) {
                                                                        e = e18;
                                                                        zzavVarZzj2.zzu.zzaV().zzb().zzc("Error storing filter results. appId", zzgu.zzl(str12), e);
                                                                    }
                                                                } catch (SQLiteException e19) {
                                                                    e = e19;
                                                                }
                                                            }
                                                            return arrayList3;
                                                        }
                                                    } catch (SQLiteException e20) {
                                                        e = e20;
                                                        cursorRawQuery = null;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        r5 = 0;
                                                        if (r5 != 0) {
                                                            r5.close();
                                                        }
                                                        throw th;
                                                    }
                                                    cursorRawQuery.close();
                                                    r0 = arrayMap2;
                                                    Preconditions.checkNotEmpty(str20);
                                                    Preconditions.checkNotNull(map2);
                                                    arrayMap3 = new ArrayMap();
                                                    if (!map2.isEmpty()) {
                                                        it2 = map2.keySet().iterator();
                                                        while (it2.hasNext()) {
                                                            num = (Integer) it2.next();
                                                            num.getClass();
                                                            zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                                            list4 = (List) r0.get(num);
                                                            if (list4 != null) {
                                                            }
                                                            r16 = r0;
                                                            hashSet3 = hashSet;
                                                            it3 = it2;
                                                            arrayMap3.put(num, zziiVar3);
                                                            r0 = r16;
                                                            hashSet = hashSet3;
                                                            it2 = it3;
                                                        }
                                                    }
                                                    hashSet2 = hashSet;
                                                    map3 = arrayMap3;
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    r5 = sQLiteDatabaseZze;
                                                    if (r5 != 0) {
                                                        r5.close();
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                map3 = map2;
                                            }
                                            while (r16.hasNext()) {
                                                num2.getClass();
                                                zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num2);
                                                bitSet = new BitSet();
                                                bitSet2 = new BitSet();
                                                arrayMap = new ArrayMap();
                                                if (zziiVar != null) {
                                                    while (r7.hasNext()) {
                                                        if (zzhqVar.zza()) {
                                                            Map map11 = map3;
                                                            Integer numValueOf8 = Integer.valueOf(zzhqVar.zzb());
                                                            if (zzhqVar.zzc()) {
                                                                lValueOf = Long.valueOf(zzhqVar.zzd());
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            arrayMap.put(numValueOf8, lValueOf);
                                                            map3 = map11;
                                                        }
                                                    }
                                                }
                                                Map map12 = map3;
                                                ArrayMap arrayMap11 = new ArrayMap();
                                                if (zziiVar != null) {
                                                    it = zziiVar.zzg().iterator();
                                                    while (it.hasNext()) {
                                                        zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                                        if (!zzikVar.zza()) {
                                                        }
                                                    }
                                                }
                                                zziiVar2 = zziiVar;
                                                if (zziiVar2 != null) {
                                                    i4 = 0;
                                                    while (i4 < zziiVar2.zzb() * 64) {
                                                        if (zzpk.zzn(zziiVar2.zza(), i4)) {
                                                            z5 = zZzp;
                                                            this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i4));
                                                            bitSet2.set(i4);
                                                            if (zzpk.zzn(zziiVar2.zzc(), i4)) {
                                                                bitSet.set(i4);
                                                            }
                                                            i4++;
                                                            zZzp = z5;
                                                        } else {
                                                            z5 = zZzp;
                                                        }
                                                        arrayMap.remove(Integer.valueOf(i4));
                                                        i4++;
                                                        zZzp = z5;
                                                    }
                                                }
                                                boolean z7 = zZzp;
                                                com.google.android.gms.internal.measurement.zzii zziiVar5 = (com.google.android.gms.internal.measurement.zzii) map2.get(num2);
                                                if (!zZzp2) {
                                                }
                                                this.zzc.put(num2, new zzy(this, this.zza, zziiVar5, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                                zZzp = z7;
                                                map3 = map12;
                                            }
                                        }
                                        str4 = str2;
                                        str5 = str17;
                                        str6 = "Skipping failed audience ID";
                                        if (!list.isEmpty()) {
                                            zzzVar = new zzz(this, null);
                                            arrayMap4 = new ArrayMap();
                                            it4 = list.iterator();
                                            while (it4.hasNext()) {
                                                zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                                                zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                                                if (zzhsVarZza != null) {
                                                    zzpgVar = this.zzg;
                                                    zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                                                    zzpgVar.zzj().zzh(zzbcVarZzaf);
                                                    if (!z2) {
                                                        j = zzbcVarZzaf.zzc;
                                                        strZzd = zzhsVarZza.zzd();
                                                        map4 = (Map) arrayMap4.get(strZzd);
                                                        if (map4 == null) {
                                                            zzavVarZzj = zzpgVar.zzj();
                                                            str9 = this.zza;
                                                            zzavVarZzj.zzaw();
                                                            zzavVarZzj.zzg();
                                                            Preconditions.checkNotEmpty(str9);
                                                            Preconditions.checkNotEmpty(strZzd);
                                                            arrayMap5 = new ArrayMap();
                                                            str7 = str4;
                                                            str8 = str5;
                                                            zzbcVar = zzbcVarZzaf;
                                                            cursorQuery2 = zzavVarZzj.zze().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                j2 = j;
                                                                do {
                                                                    com.google.android.gms.internal.measurement.zzff zzffVar5 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                                    numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    arrayList2 = (List) arrayMap5.get(numValueOf2);
                                                                    if (arrayList2 == null) {
                                                                        arrayList2 = new ArrayList();
                                                                        arrayMap5.put(numValueOf2, arrayList2);
                                                                    }
                                                                    arrayList2.add(zzffVar5);
                                                                } while (cursorQuery2.moveToNext());
                                                                cursorQuery2.close();
                                                                map4 = arrayMap5;
                                                            } else {
                                                                j2 = j;
                                                                map4 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            arrayMap4.put(strZzd, map4);
                                                        } else {
                                                            zzbcVar = zzbcVarZzaf;
                                                            j2 = j;
                                                            str7 = str4;
                                                            str8 = str5;
                                                        }
                                                        while (r6.hasNext()) {
                                                            iIntValue = num3.intValue();
                                                            if (this.zzb.contains(num3)) {
                                                                this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                                            } else {
                                                                it5 = ((List) map4.get(num3)).iterator();
                                                                zZzd = true;
                                                                while (true) {
                                                                    if (!it5.hasNext()) {
                                                                        map5 = map4;
                                                                        break;
                                                                    }
                                                                    com.google.android.gms.internal.measurement.zzff zzffVar6 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                                                    zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar6);
                                                                    map5 = map4;
                                                                    zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j2, zzbcVar, zzd(iIntValue, zzffVar6.zzb()));
                                                                    if (!zZzd) {
                                                                        this.zzb.add(num3);
                                                                        break;
                                                                    }
                                                                    zzc(num3).zza(zzaaVar);
                                                                    map4 = map5;
                                                                }
                                                                if (!zZzd) {
                                                                    this.zzb.add(num3);
                                                                }
                                                                map4 = map5;
                                                            }
                                                        }
                                                        str4 = str7;
                                                        str5 = str8;
                                                        zzzVar = zzzVar;
                                                        it4 = it4;
                                                    }
                                                }
                                            }
                                        }
                                        str10 = str4;
                                        str11 = str5;
                                        if (!z2) {
                                            return new ArrayList();
                                        }
                                        if (!list2.isEmpty()) {
                                            arrayMap6 = new ArrayMap();
                                            it6 = list2.iterator();
                                            while (it6.hasNext()) {
                                                com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it6.next();
                                                strZzc = zziuVar2.zzc();
                                                map6 = (Map) arrayMap6.get(strZzc);
                                                if (map6 == null) {
                                                    zzavVarZzj3 = this.zzg.zzj();
                                                    str14 = this.zza;
                                                    zzavVarZzj3.zzaw();
                                                    zzavVarZzj3.zzg();
                                                    Preconditions.checkNotEmpty(str14);
                                                    Preconditions.checkNotEmpty(strZzc);
                                                    arrayMap7 = new ArrayMap();
                                                    cursorQuery3 = zzavVarZzj3.zze().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                                                    if (cursorQuery3.moveToFirst()) {
                                                        while (true) {
                                                            com.google.android.gms.internal.measurement.zzfn zzfnVar3 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                            list5 = (List) arrayMap7.get(numValueOf5);
                                                            if (list5 == null) {
                                                                str13 = str10;
                                                                arrayList4 = new ArrayList();
                                                                arrayMap7.put(numValueOf5, arrayList4);
                                                            } else {
                                                                str13 = str10;
                                                                arrayList4 = list5;
                                                            }
                                                            arrayList4.add(zzfnVar3);
                                                            if (!cursorQuery3.moveToNext()) {
                                                                break;
                                                                break;
                                                            }
                                                            it6 = it6;
                                                            str10 = str13;
                                                        }
                                                        cursorQuery3.close();
                                                        map6 = arrayMap7;
                                                    } else {
                                                        str13 = str10;
                                                        it6 = it6;
                                                        map6 = Collections.EMPTY_MAP;
                                                        cursorQuery3.close();
                                                    }
                                                    arrayMap6.put(strZzc, map6);
                                                } else {
                                                    str13 = str10;
                                                    it6 = it6;
                                                }
                                                while (r3.hasNext()) {
                                                    int iIntValue5 = num4.intValue();
                                                    if (this.zzb.contains(num4)) {
                                                        this.zzu.zzaV().zzk().zzb(str6, num4);
                                                        break;
                                                        break;
                                                    }
                                                    it7 = ((List) map6.get(num4)).iterator();
                                                    zZzd2 = true;
                                                    while (true) {
                                                        if (it7.hasNext()) {
                                                            zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                                                            zzicVar = this.zzu;
                                                            if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                                                zzgs zzgsVarZzk3 = zzicVar.zzaV().zzk();
                                                                if (zzfnVar.zza()) {
                                                                    numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                                                } else {
                                                                    numValueOf4 = null;
                                                                }
                                                                zzgsVarZzk3.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                                                zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                                            }
                                                            if (zzfnVar.zza()) {
                                                            }
                                                            zzgs zzgsVarZze3 = zzicVar.zzaV().zze();
                                                            Object objZzl3 = zzgu.zzl(this.zza);
                                                            if (zzfnVar.zza()) {
                                                                numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                                            } else {
                                                                numValueOf3 = null;
                                                            }
                                                            zzgsVarZze3.zzc("Invalid property filter ID. appId, id", objZzl3, String.valueOf(numValueOf3));
                                                            this.zzb.add(num4);
                                                            map6 = map6;
                                                            str6 = str6;
                                                        } else {
                                                            map6 = map6;
                                                            str6 = str6;
                                                        }
                                                        if (!zZzd2) {
                                                            this.zzb.add(num4);
                                                        }
                                                        map6 = map6;
                                                        str6 = str6;
                                                        zzc(num4).zza(zzacVar);
                                                        map6 = map6;
                                                        str6 = str6;
                                                    }
                                                }
                                                it6 = it6;
                                                str10 = str13;
                                            }
                                        }
                                        arrayList3 = new ArrayList();
                                        Set<Integer> setKeySet2 = this.zzc.keySet();
                                        setKeySet2.removeAll(this.zzb);
                                        while (r3.hasNext()) {
                                            int iIntValue6 = num5.intValue();
                                            zzy zzyVar2 = (zzy) this.zzc.get(num5);
                                            Preconditions.checkNotNull(zzyVar2);
                                            com.google.android.gms.internal.measurement.zzhg zzhgVarZzb2 = zzyVar2.zzb(iIntValue6);
                                            arrayList3.add(zzhgVarZzb2);
                                            zzavVarZzj2 = this.zzg.zzj();
                                            str12 = this.zza;
                                            com.google.android.gms.internal.measurement.zzii zziiVarZzc2 = zzhgVarZzb2.zzc();
                                            zzavVarZzj2.zzaw();
                                            zzavVarZzj2.zzg();
                                            Preconditions.checkNotEmpty(str12);
                                            Preconditions.checkNotNull(zziiVarZzc2);
                                            byte[] bArrZzcc2 = zziiVarZzc2.zzcc();
                                            contentValues = new ContentValues();
                                            contentValues.put("app_id", str12);
                                            contentValues.put(str11, num5);
                                            contentValues.put("current_results", bArrZzcc2);
                                            if (zzavVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                zzavVarZzj2.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str12));
                                            }
                                        }
                                        return arrayList3;
                                    }
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    z3 = z4;
                                    str16 = str2;
                                    str17 = str17;
                                } catch (SQLiteException e21) {
                                    e = e21;
                                    zzavVarZzj6.zzu.zzaV().zzb().zzc("Database error querying filter results. appId", zzgu.zzl(str19), e);
                                    Map map13 = Collections.EMPTY_MAP;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    map2 = map13;
                                }
                            }
                            cursorQuery.close();
                            map2 = arrayMap8;
                        } else {
                            Map map14 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map14;
                            z4 = z3;
                            str2 = "data";
                            str17 = "audience_id";
                        }
                    } catch (SQLiteException e22) {
                        e = e22;
                        z4 = z3;
                        str2 = "data";
                    }
                    if (!map2.isEmpty()) {
                        hashSet = new HashSet(map2.keySet());
                        if (z4) {
                            String str21 = this.zza;
                            zzav zzavVarZzj8 = this.zzg.zzj();
                            str3 = this.zza;
                            zzavVarZzj8.zzaw();
                            zzavVarZzj8.zzg();
                            Preconditions.checkNotEmpty(str3);
                            arrayMap2 = new ArrayMap();
                            sQLiteDatabaseZze = zzavVarZzj8.zze();
                            cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                            if (cursorRawQuery.moveToFirst()) {
                                do {
                                    numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                    arrayList = (List) arrayMap2.get(numValueOf);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        arrayMap2.put(numValueOf, arrayList);
                                    }
                                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                } while (cursorRawQuery.moveToNext());
                            } else {
                                arrayMap2 = Collections.EMPTY_MAP;
                            }
                            cursorRawQuery.close();
                            r0 = arrayMap2;
                            Preconditions.checkNotEmpty(str21);
                            Preconditions.checkNotNull(map2);
                            arrayMap3 = new ArrayMap();
                            if (!map2.isEmpty()) {
                                it2 = map2.keySet().iterator();
                                while (it2.hasNext()) {
                                    num = (Integer) it2.next();
                                    num.getClass();
                                    zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                    list4 = (List) r0.get(num);
                                    if (list4 != null) {
                                    }
                                    r16 = r0;
                                    hashSet3 = hashSet;
                                    it3 = it2;
                                    arrayMap3.put(num, zziiVar3);
                                    r0 = r16;
                                    hashSet = hashSet3;
                                    it2 = it3;
                                }
                            }
                            hashSet2 = hashSet;
                            map3 = arrayMap3;
                        } else {
                            hashSet2 = hashSet;
                            map3 = map2;
                        }
                        while (r16.hasNext()) {
                            num2.getClass();
                            zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num2);
                            bitSet = new BitSet();
                            bitSet2 = new BitSet();
                            arrayMap = new ArrayMap();
                            if (zziiVar != null) {
                                while (r7.hasNext()) {
                                    if (zzhqVar.zza()) {
                                        Map map15 = map3;
                                        Integer numValueOf9 = Integer.valueOf(zzhqVar.zzb());
                                        if (zzhqVar.zzc()) {
                                            lValueOf = Long.valueOf(zzhqVar.zzd());
                                        } else {
                                            lValueOf = null;
                                        }
                                        arrayMap.put(numValueOf9, lValueOf);
                                        map3 = map15;
                                    }
                                }
                            }
                            Map map16 = map3;
                            ArrayMap arrayMap12 = new ArrayMap();
                            if (zziiVar != null) {
                                it = zziiVar.zzg().iterator();
                                while (it.hasNext()) {
                                    zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                    if (!zzikVar.zza()) {
                                    }
                                }
                            }
                            zziiVar2 = zziiVar;
                            if (zziiVar2 != null) {
                                i4 = 0;
                                while (i4 < zziiVar2.zzb() * 64) {
                                    if (zzpk.zzn(zziiVar2.zza(), i4)) {
                                        z5 = zZzp;
                                        this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i4));
                                        bitSet2.set(i4);
                                        if (zzpk.zzn(zziiVar2.zzc(), i4)) {
                                            bitSet.set(i4);
                                        }
                                        i4++;
                                        zZzp = z5;
                                    } else {
                                        z5 = zZzp;
                                    }
                                    arrayMap.remove(Integer.valueOf(i4));
                                    i4++;
                                    zZzp = z5;
                                }
                            }
                            boolean z8 = zZzp;
                            com.google.android.gms.internal.measurement.zzii zziiVar6 = (com.google.android.gms.internal.measurement.zzii) map2.get(num2);
                            if (!zZzp2) {
                            }
                            this.zzc.put(num2, new zzy(this, this.zza, zziiVar6, bitSet, bitSet2, arrayMap, arrayMap12, null));
                            zZzp = z8;
                            map3 = map16;
                        }
                    }
                    str4 = str2;
                    str5 = str17;
                    str6 = "Skipping failed audience ID";
                    if (!list.isEmpty()) {
                        zzzVar = new zzz(this, null);
                        arrayMap4 = new ArrayMap();
                        it4 = list.iterator();
                        while (it4.hasNext()) {
                            zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                            zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                            if (zzhsVarZza != null) {
                                zzpgVar = this.zzg;
                                zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                                zzpgVar.zzj().zzh(zzbcVarZzaf);
                                if (!z2) {
                                    j = zzbcVarZzaf.zzc;
                                    strZzd = zzhsVarZza.zzd();
                                    map4 = (Map) arrayMap4.get(strZzd);
                                    if (map4 == null) {
                                        zzavVarZzj = zzpgVar.zzj();
                                        str9 = this.zza;
                                        zzavVarZzj.zzaw();
                                        zzavVarZzj.zzg();
                                        Preconditions.checkNotEmpty(str9);
                                        Preconditions.checkNotEmpty(strZzd);
                                        arrayMap5 = new ArrayMap();
                                        str7 = str4;
                                        str8 = str5;
                                        zzbcVar = zzbcVarZzaf;
                                        cursorQuery2 = zzavVarZzj.zze().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                        if (cursorQuery2.moveToFirst()) {
                                            j2 = j;
                                            do {
                                                com.google.android.gms.internal.measurement.zzff zzffVar7 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                                numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                arrayList2 = (List) arrayMap5.get(numValueOf2);
                                                if (arrayList2 == null) {
                                                    arrayList2 = new ArrayList();
                                                    arrayMap5.put(numValueOf2, arrayList2);
                                                }
                                                arrayList2.add(zzffVar7);
                                            } while (cursorQuery2.moveToNext());
                                            cursorQuery2.close();
                                            map4 = arrayMap5;
                                        } else {
                                            j2 = j;
                                            map4 = Collections.EMPTY_MAP;
                                            cursorQuery2.close();
                                        }
                                        arrayMap4.put(strZzd, map4);
                                    } else {
                                        zzbcVar = zzbcVarZzaf;
                                        j2 = j;
                                        str7 = str4;
                                        str8 = str5;
                                    }
                                    while (r6.hasNext()) {
                                        iIntValue = num3.intValue();
                                        if (this.zzb.contains(num3)) {
                                            this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                        } else {
                                            it5 = ((List) map4.get(num3)).iterator();
                                            zZzd = true;
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    map5 = map4;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzff zzffVar8 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                                zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar8);
                                                map5 = map4;
                                                zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j2, zzbcVar, zzd(iIntValue, zzffVar8.zzb()));
                                                if (!zZzd) {
                                                    this.zzb.add(num3);
                                                    break;
                                                }
                                                zzc(num3).zza(zzaaVar);
                                                map4 = map5;
                                            }
                                            if (!zZzd) {
                                                this.zzb.add(num3);
                                            }
                                            map4 = map5;
                                        }
                                    }
                                    str4 = str7;
                                    str5 = str8;
                                    zzzVar = zzzVar;
                                    it4 = it4;
                                }
                            }
                        }
                    }
                    str10 = str4;
                    str11 = str5;
                    if (!z2) {
                        return new ArrayList();
                    }
                    if (!list2.isEmpty()) {
                        arrayMap6 = new ArrayMap();
                        it6 = list2.iterator();
                        while (it6.hasNext()) {
                            com.google.android.gms.internal.measurement.zziu zziuVar3 = (com.google.android.gms.internal.measurement.zziu) it6.next();
                            strZzc = zziuVar3.zzc();
                            map6 = (Map) arrayMap6.get(strZzc);
                            if (map6 == null) {
                                zzavVarZzj3 = this.zzg.zzj();
                                str14 = this.zza;
                                zzavVarZzj3.zzaw();
                                zzavVarZzj3.zzg();
                                Preconditions.checkNotEmpty(str14);
                                Preconditions.checkNotEmpty(strZzc);
                                arrayMap7 = new ArrayMap();
                                cursorQuery3 = zzavVarZzj3.zze().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                                if (cursorQuery3.moveToFirst()) {
                                    while (true) {
                                        com.google.android.gms.internal.measurement.zzfn zzfnVar4 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                        numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                        list5 = (List) arrayMap7.get(numValueOf5);
                                        if (list5 == null) {
                                            str13 = str10;
                                            arrayList4 = new ArrayList();
                                            arrayMap7.put(numValueOf5, arrayList4);
                                        } else {
                                            str13 = str10;
                                            arrayList4 = list5;
                                        }
                                        arrayList4.add(zzfnVar4);
                                        if (!cursorQuery3.moveToNext()) {
                                            break;
                                            break;
                                        }
                                        it6 = it6;
                                        str10 = str13;
                                    }
                                    cursorQuery3.close();
                                    map6 = arrayMap7;
                                } else {
                                    str13 = str10;
                                    it6 = it6;
                                    map6 = Collections.EMPTY_MAP;
                                    cursorQuery3.close();
                                }
                                arrayMap6.put(strZzc, map6);
                            } else {
                                str13 = str10;
                                it6 = it6;
                            }
                            while (r3.hasNext()) {
                                int iIntValue7 = num4.intValue();
                                if (this.zzb.contains(num4)) {
                                    this.zzu.zzaV().zzk().zzb(str6, num4);
                                    break;
                                    break;
                                }
                                it7 = ((List) map6.get(num4)).iterator();
                                zZzd2 = true;
                                while (true) {
                                    if (it7.hasNext()) {
                                        zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                                        zzicVar = this.zzu;
                                        if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                            zzgs zzgsVarZzk4 = zzicVar.zzaV().zzk();
                                            if (zzfnVar.zza()) {
                                                numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                            } else {
                                                numValueOf4 = null;
                                            }
                                            zzgsVarZzk4.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                            zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                        }
                                        if (zzfnVar.zza()) {
                                        }
                                        zzgs zzgsVarZze4 = zzicVar.zzaV().zze();
                                        Object objZzl4 = zzgu.zzl(this.zza);
                                        if (zzfnVar.zza()) {
                                            numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                        } else {
                                            numValueOf3 = null;
                                        }
                                        zzgsVarZze4.zzc("Invalid property filter ID. appId, id", objZzl4, String.valueOf(numValueOf3));
                                        this.zzb.add(num4);
                                        map6 = map6;
                                        str6 = str6;
                                    } else {
                                        map6 = map6;
                                        str6 = str6;
                                    }
                                    if (!zZzd2) {
                                        this.zzb.add(num4);
                                    }
                                    map6 = map6;
                                    str6 = str6;
                                    zzc(num4).zza(zzacVar);
                                    map6 = map6;
                                    str6 = str6;
                                }
                            }
                            it6 = it6;
                            str10 = str13;
                        }
                    }
                    arrayList3 = new ArrayList();
                    Set<Integer> setKeySet3 = this.zzc.keySet();
                    setKeySet3.removeAll(this.zzb);
                    while (r3.hasNext()) {
                        int iIntValue8 = num5.intValue();
                        zzy zzyVar3 = (zzy) this.zzc.get(num5);
                        Preconditions.checkNotNull(zzyVar3);
                        com.google.android.gms.internal.measurement.zzhg zzhgVarZzb3 = zzyVar3.zzb(iIntValue8);
                        arrayList3.add(zzhgVarZzb3);
                        zzavVarZzj2 = this.zzg.zzj();
                        str12 = this.zza;
                        com.google.android.gms.internal.measurement.zzii zziiVarZzc3 = zzhgVarZzb3.zzc();
                        zzavVarZzj2.zzaw();
                        zzavVarZzj2.zzg();
                        Preconditions.checkNotEmpty(str12);
                        Preconditions.checkNotNull(zziiVarZzc3);
                        byte[] bArrZzcc3 = zziiVarZzc3.zzcc();
                        contentValues = new ContentValues();
                        contentValues.put("app_id", str12);
                        contentValues.put(str11, num5);
                        contentValues.put("current_results", bArrZzcc3);
                        if (zzavVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                            zzavVarZzj2.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str12));
                        }
                    }
                    return arrayList3;
                }
            } catch (SQLiteException e23) {
                e = e23;
                cursorQuery4 = null;
            } catch (Throwable th8) {
                th = th8;
                cursorQuery4 = null;
                if (cursorQuery4 != null) {
                    cursorQuery4.close();
                }
                throw th;
            }
        } else {
            map = map7;
        }
        zzav zzavVarZzj9 = this.zzg.zzj();
        String str110 = this.zza;
        zzavVarZzj9.zzaw();
        zzavVarZzj9.zzg();
        Preconditions.checkNotEmpty(str110);
        try {
            cursorQuery = zzavVarZzj9.zze().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str110}, null, null, null);
            try {
                if (cursorQuery.moveToFirst()) {
                    Map map17 = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    map2 = map17;
                    z4 = z3;
                    str2 = "data";
                    str17 = "audience_id";
                } else {
                    arrayMap8 = new ArrayMap();
                    while (true) {
                        i5 = cursorQuery.getInt(0);
                        arrayMap8.put(Integer.valueOf(i5), (com.google.android.gms.internal.measurement.zzii) ((com.google.android.gms.internal.measurement.zzih) zzpk.zzw(com.google.android.gms.internal.measurement.zzii.zzi(), cursorQuery.getBlob(1))).zzbc());
                        z4 = z3;
                        str2 = str16;
                        if (!cursorQuery.moveToNext()) {
                            break;
                            break;
                        }
                        z3 = z4;
                        str16 = str2;
                        str17 = str17;
                    }
                    cursorQuery.close();
                    map2 = arrayMap8;
                }
                if (!map2.isEmpty()) {
                    hashSet = new HashSet(map2.keySet());
                    if (z4) {
                        String str22 = this.zza;
                        zzav zzavVarZzj10 = this.zzg.zzj();
                        str3 = this.zza;
                        zzavVarZzj10.zzaw();
                        zzavVarZzj10.zzg();
                        Preconditions.checkNotEmpty(str3);
                        arrayMap2 = new ArrayMap();
                        sQLiteDatabaseZze = zzavVarZzj10.zze();
                        cursorRawQuery = sQLiteDatabaseZze.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str3, str3});
                        if (cursorRawQuery.moveToFirst()) {
                            do {
                                numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                arrayList = (List) arrayMap2.get(numValueOf);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    arrayMap2.put(numValueOf, arrayList);
                                }
                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                            } while (cursorRawQuery.moveToNext());
                        } else {
                            arrayMap2 = Collections.EMPTY_MAP;
                        }
                        cursorRawQuery.close();
                        r0 = arrayMap2;
                        Preconditions.checkNotEmpty(str22);
                        Preconditions.checkNotNull(map2);
                        arrayMap3 = new ArrayMap();
                        if (!map2.isEmpty()) {
                            it2 = map2.keySet().iterator();
                            while (it2.hasNext()) {
                                num = (Integer) it2.next();
                                num.getClass();
                                zziiVar3 = (com.google.android.gms.internal.measurement.zzii) map2.get(num);
                                list4 = (List) r0.get(num);
                                if (list4 != null || list4.isEmpty()) {
                                    r16 = r0;
                                    hashSet3 = hashSet;
                                    it3 = it2;
                                    arrayMap3.put(num, zziiVar3);
                                    r0 = r16;
                                    hashSet = hashSet3;
                                    it2 = it3;
                                } else {
                                    zzpg zzpgVar2 = this.zzg;
                                    ?? r17 = r0;
                                    hashSet3 = hashSet;
                                    List listZzq = zzpgVar2.zzp().zzq(zziiVar3.zzc(), list4);
                                    if (listZzq.isEmpty()) {
                                        r0 = r17;
                                        hashSet = hashSet3;
                                    } else {
                                        com.google.android.gms.internal.measurement.zzih zzihVar = (com.google.android.gms.internal.measurement.zzih) zziiVar3.zzcl();
                                        zzihVar.zzd();
                                        zzihVar.zzc(listZzq);
                                        List listZzq2 = zzpgVar2.zzp().zzq(zziiVar3.zza(), list4);
                                        zzihVar.zzb();
                                        zzihVar.zza(listZzq2);
                                        ArrayList arrayList6 = new ArrayList();
                                        Iterator it9 = zziiVar3.zze().iterator();
                                        while (it9.hasNext()) {
                                            Iterator it10 = it2;
                                            com.google.android.gms.internal.measurement.zzhq zzhqVar2 = (com.google.android.gms.internal.measurement.zzhq) it9.next();
                                            Iterator it11 = it9;
                                            if (!list4.contains(Integer.valueOf(zzhqVar2.zzb()))) {
                                                arrayList6.add(zzhqVar2);
                                            }
                                            it2 = it10;
                                            it9 = it11;
                                        }
                                        it3 = it2;
                                        zzihVar.zzf();
                                        zzihVar.zze(arrayList6);
                                        ArrayList arrayList7 = new ArrayList();
                                        for (com.google.android.gms.internal.measurement.zzik zzikVar2 : zziiVar3.zzg()) {
                                            if (!list4.contains(Integer.valueOf(zzikVar2.zzb()))) {
                                                arrayList7.add(zzikVar2);
                                            }
                                        }
                                        zzihVar.zzh();
                                        zzihVar.zzg(arrayList7);
                                        arrayMap3.put(num, (com.google.android.gms.internal.measurement.zzii) zzihVar.zzbc());
                                        r16 = r17;
                                        r0 = r16;
                                        hashSet = hashSet3;
                                        it2 = it3;
                                    }
                                }
                            }
                        }
                        hashSet2 = hashSet;
                        map3 = arrayMap3;
                    } else {
                        hashSet2 = hashSet;
                        map3 = map2;
                    }
                    while (r16.hasNext()) {
                        num2.getClass();
                        zziiVar = (com.google.android.gms.internal.measurement.zzii) map3.get(num2);
                        bitSet = new BitSet();
                        bitSet2 = new BitSet();
                        arrayMap = new ArrayMap();
                        if (zziiVar != null && zziiVar.zzf() != 0) {
                            while (r7.hasNext()) {
                                if (zzhqVar.zza()) {
                                    Map map18 = map3;
                                    Integer numValueOf10 = Integer.valueOf(zzhqVar.zzb());
                                    if (zzhqVar.zzc()) {
                                        lValueOf = Long.valueOf(zzhqVar.zzd());
                                    } else {
                                        lValueOf = null;
                                    }
                                    arrayMap.put(numValueOf10, lValueOf);
                                    map3 = map18;
                                }
                            }
                        }
                        Map map19 = map3;
                        ArrayMap arrayMap13 = new ArrayMap();
                        if (zziiVar != null && zziiVar.zzh() != 0) {
                            it = zziiVar.zzg().iterator();
                            while (it.hasNext()) {
                                zzikVar = (com.google.android.gms.internal.measurement.zzik) it.next();
                                if (!zzikVar.zza() && zzikVar.zzd() > 0) {
                                    arrayMap13.put(Integer.valueOf(zzikVar.zzb()), Long.valueOf(zzikVar.zze(zzikVar.zzd() - 1)));
                                    it = it;
                                    zziiVar = zziiVar;
                                }
                            }
                        }
                        zziiVar2 = zziiVar;
                        if (zziiVar2 != null) {
                            i4 = 0;
                            while (i4 < zziiVar2.zzb() * 64) {
                                if (zzpk.zzn(zziiVar2.zza(), i4)) {
                                    z5 = zZzp;
                                    this.zzu.zzaV().zzk().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i4));
                                    bitSet2.set(i4);
                                    if (zzpk.zzn(zziiVar2.zzc(), i4)) {
                                        bitSet.set(i4);
                                    }
                                    i4++;
                                    zZzp = z5;
                                } else {
                                    z5 = zZzp;
                                }
                                arrayMap.remove(Integer.valueOf(i4));
                                i4++;
                                zZzp = z5;
                            }
                        }
                        boolean z9 = zZzp;
                        com.google.android.gms.internal.measurement.zzii zziiVar7 = (com.google.android.gms.internal.measurement.zzii) map2.get(num2);
                        if (!zZzp2 && z9 && (list3 = (List) map.get(num2)) != null && this.zze != null && this.zzd != null) {
                            Iterator it12 = list3.iterator();
                            while (it12.hasNext()) {
                                com.google.android.gms.internal.measurement.zzff zzffVar9 = (com.google.android.gms.internal.measurement.zzff) it12.next();
                                int iZzb = zzffVar9.zzb();
                                Iterator it13 = it12;
                                long jLongValue = this.zze.longValue() / 1000;
                                if (zzffVar9.zzj()) {
                                    jLongValue = this.zzd.longValue() / 1000;
                                }
                                Integer numValueOf11 = Integer.valueOf(iZzb);
                                if (arrayMap.containsKey(numValueOf11)) {
                                    arrayMap.put(numValueOf11, Long.valueOf(jLongValue));
                                }
                                if (arrayMap13.containsKey(numValueOf11)) {
                                    arrayMap13.put(numValueOf11, Long.valueOf(jLongValue));
                                }
                                it12 = it13;
                            }
                        }
                        this.zzc.put(num2, new zzy(this, this.zza, zziiVar7, bitSet, bitSet2, arrayMap, arrayMap13, null));
                        zZzp = z9;
                        map3 = map19;
                    }
                }
                str4 = str2;
                str5 = str17;
                str6 = "Skipping failed audience ID";
                if (!list.isEmpty()) {
                    zzzVar = new zzz(this, null);
                    arrayMap4 = new ArrayMap();
                    it4 = list.iterator();
                    while (it4.hasNext()) {
                        zzhsVar = (com.google.android.gms.internal.measurement.zzhs) it4.next();
                        zzhsVarZza = zzzVar.zza(this.zza, zzhsVar);
                        if (zzhsVarZza != null) {
                            zzpgVar = this.zzg;
                            zzbcVarZzaf = zzpgVar.zzj().zzaf(this.zza, zzhsVar, zzhsVarZza.zzd());
                            zzpgVar.zzj().zzh(zzbcVarZzaf);
                            if (!z2) {
                                j = zzbcVarZzaf.zzc;
                                strZzd = zzhsVarZza.zzd();
                                map4 = (Map) arrayMap4.get(strZzd);
                                if (map4 == null) {
                                    zzavVarZzj = zzpgVar.zzj();
                                    str9 = this.zza;
                                    zzavVarZzj.zzaw();
                                    zzavVarZzj.zzg();
                                    Preconditions.checkNotEmpty(str9);
                                    Preconditions.checkNotEmpty(strZzd);
                                    arrayMap5 = new ArrayMap();
                                    str7 = str4;
                                    str8 = str5;
                                    zzbcVar = zzbcVarZzaf;
                                    cursorQuery2 = zzavVarZzj.zze().query("event_filters", new String[]{str8, str7}, "app_id=? AND event_name=?", new String[]{str9, strZzd}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        j2 = j;
                                        do {
                                            com.google.android.gms.internal.measurement.zzff zzffVar10 = (com.google.android.gms.internal.measurement.zzff) ((com.google.android.gms.internal.measurement.zzfe) zzpk.zzw(com.google.android.gms.internal.measurement.zzff.zzn(), cursorQuery2.getBlob(1))).zzbc();
                                            numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                            arrayList2 = (List) arrayMap5.get(numValueOf2);
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                                arrayMap5.put(numValueOf2, arrayList2);
                                            }
                                            arrayList2.add(zzffVar10);
                                        } while (cursorQuery2.moveToNext());
                                        cursorQuery2.close();
                                        map4 = arrayMap5;
                                    } else {
                                        j2 = j;
                                        map4 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    arrayMap4.put(strZzd, map4);
                                } else {
                                    zzbcVar = zzbcVarZzaf;
                                    j2 = j;
                                    str7 = str4;
                                    str8 = str5;
                                }
                                while (r6.hasNext()) {
                                    iIntValue = num3.intValue();
                                    if (this.zzb.contains(num3)) {
                                        this.zzu.zzaV().zzk().zzb("Skipping failed audience ID", num3);
                                    } else {
                                        it5 = ((List) map4.get(num3)).iterator();
                                        zZzd = true;
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                map5 = map4;
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzff zzffVar11 = (com.google.android.gms.internal.measurement.zzff) it5.next();
                                            zzaaVar = new zzaa(this, this.zza, iIntValue, zzffVar11);
                                            map5 = map4;
                                            zZzd = zzaaVar.zzd(this.zzd, this.zze, zzhsVarZza, j2, zzbcVar, zzd(iIntValue, zzffVar11.zzb()));
                                            if (!zZzd) {
                                                this.zzb.add(num3);
                                                break;
                                            }
                                            zzc(num3).zza(zzaaVar);
                                            map4 = map5;
                                        }
                                        if (!zZzd) {
                                            this.zzb.add(num3);
                                        }
                                        map4 = map5;
                                    }
                                }
                                str4 = str7;
                                str5 = str8;
                                zzzVar = zzzVar;
                                it4 = it4;
                            }
                        }
                    }
                }
                str10 = str4;
                str11 = str5;
                if (!z2) {
                    return new ArrayList();
                }
                if (!list2.isEmpty()) {
                    arrayMap6 = new ArrayMap();
                    it6 = list2.iterator();
                    while (it6.hasNext()) {
                        com.google.android.gms.internal.measurement.zziu zziuVar4 = (com.google.android.gms.internal.measurement.zziu) it6.next();
                        strZzc = zziuVar4.zzc();
                        map6 = (Map) arrayMap6.get(strZzc);
                        if (map6 == null) {
                            zzavVarZzj3 = this.zzg.zzj();
                            str14 = this.zza;
                            zzavVarZzj3.zzaw();
                            zzavVarZzj3.zzg();
                            Preconditions.checkNotEmpty(str14);
                            Preconditions.checkNotEmpty(strZzc);
                            arrayMap7 = new ArrayMap();
                            cursorQuery3 = zzavVarZzj3.zze().query("property_filters", new String[]{str11, str10}, "app_id=? AND property_name=?", new String[]{str14, strZzc}, null, null, null);
                            if (cursorQuery3.moveToFirst()) {
                                while (true) {
                                    com.google.android.gms.internal.measurement.zzfn zzfnVar5 = (com.google.android.gms.internal.measurement.zzfn) ((com.google.android.gms.internal.measurement.zzfm) zzpk.zzw(com.google.android.gms.internal.measurement.zzfn.zzi(), cursorQuery3.getBlob(1))).zzbc();
                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                    list5 = (List) arrayMap7.get(numValueOf5);
                                    if (list5 == null) {
                                        str13 = str10;
                                        arrayList4 = new ArrayList();
                                        arrayMap7.put(numValueOf5, arrayList4);
                                    } else {
                                        str13 = str10;
                                        arrayList4 = list5;
                                    }
                                    arrayList4.add(zzfnVar5);
                                    if (!cursorQuery3.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    it6 = it6;
                                    str10 = str13;
                                }
                                cursorQuery3.close();
                                map6 = arrayMap7;
                            } else {
                                str13 = str10;
                                it6 = it6;
                                map6 = Collections.EMPTY_MAP;
                                cursorQuery3.close();
                            }
                            arrayMap6.put(strZzc, map6);
                        } else {
                            str13 = str10;
                            it6 = it6;
                        }
                        while (r3.hasNext()) {
                            int iIntValue9 = num4.intValue();
                            if (this.zzb.contains(num4)) {
                                this.zzu.zzaV().zzk().zzb(str6, num4);
                                break;
                                break;
                            }
                            it7 = ((List) map6.get(num4)).iterator();
                            zZzd2 = true;
                            while (true) {
                                if (it7.hasNext()) {
                                    zzfnVar = (com.google.android.gms.internal.measurement.zzfn) it7.next();
                                    zzicVar = this.zzu;
                                    if (Log.isLoggable(zzicVar.zzaV().zzn(), 2)) {
                                        zzgs zzgsVarZzk5 = zzicVar.zzaV().zzk();
                                        if (zzfnVar.zza()) {
                                            numValueOf4 = Integer.valueOf(zzfnVar.zzb());
                                        } else {
                                            numValueOf4 = null;
                                        }
                                        zzgsVarZzk5.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, zzicVar.zzl().zzc(zzfnVar.zzc()));
                                        zzicVar.zzaV().zzk().zzb("Filter definition", this.zzg.zzp().zzk(zzfnVar));
                                    }
                                    if (zzfnVar.zza() || zzfnVar.zzb() > 256) {
                                        zzgs zzgsVarZze5 = zzicVar.zzaV().zze();
                                        Object objZzl5 = zzgu.zzl(this.zza);
                                        if (zzfnVar.zza()) {
                                            numValueOf3 = Integer.valueOf(zzfnVar.zzb());
                                        } else {
                                            numValueOf3 = null;
                                        }
                                        zzgsVarZze5.zzc("Invalid property filter ID. appId, id", objZzl5, String.valueOf(numValueOf3));
                                        this.zzb.add(num4);
                                        map6 = map6;
                                        str6 = str6;
                                    } else {
                                        zzacVar = new zzac(this, this.zza, iIntValue9, zzfnVar);
                                        zZzd2 = zzacVar.zzd(this.zzd, this.zze, zziuVar4, zzd(iIntValue9, zzfnVar.zzb()));
                                        if (zZzd2) {
                                            zzc(num4).zza(zzacVar);
                                            map6 = map6;
                                            str6 = str6;
                                        } else {
                                            this.zzb.add(num4);
                                        }
                                    }
                                } else {
                                    map6 = map6;
                                    str6 = str6;
                                }
                                if (!zZzd2) {
                                    this.zzb.add(num4);
                                }
                                map6 = map6;
                                str6 = str6;
                            }
                        }
                        it6 = it6;
                        str10 = str13;
                    }
                }
                arrayList3 = new ArrayList();
                Set<Integer> setKeySet4 = this.zzc.keySet();
                setKeySet4.removeAll(this.zzb);
                while (r3.hasNext()) {
                    int iIntValue10 = num5.intValue();
                    zzy zzyVar4 = (zzy) this.zzc.get(num5);
                    Preconditions.checkNotNull(zzyVar4);
                    com.google.android.gms.internal.measurement.zzhg zzhgVarZzb4 = zzyVar4.zzb(iIntValue10);
                    arrayList3.add(zzhgVarZzb4);
                    zzavVarZzj2 = this.zzg.zzj();
                    str12 = this.zza;
                    com.google.android.gms.internal.measurement.zzii zziiVarZzc4 = zzhgVarZzb4.zzc();
                    zzavVarZzj2.zzaw();
                    zzavVarZzj2.zzg();
                    Preconditions.checkNotEmpty(str12);
                    Preconditions.checkNotNull(zziiVarZzc4);
                    byte[] bArrZzcc4 = zziiVarZzc4.zzcc();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str12);
                    contentValues.put(str11, num5);
                    contentValues.put("current_results", bArrZzcc4);
                    if (zzavVarZzj2.zze().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                        zzavVarZzj2.zzu.zzaV().zzb().zzb("Failed to insert filter results (got -1). appId", zzgu.zzl(str12));
                    }
                }
                return arrayList3;
            } catch (Throwable th9) {
                th = th9;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e24) {
            e = e24;
            z4 = z3;
            str2 = "data";
            str17 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th10) {
            th = th10;
            cursor = null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }
}
