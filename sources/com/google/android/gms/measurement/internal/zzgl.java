package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.applovin.impl.Z;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.smartdigimkt.b0.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgl extends zzg {
    private static final String[] zza = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    private final zzgj zzb;
    private boolean zzc;

    public zzgl(zzic zzicVar) {
        super(zzicVar);
        Context contextZzaY = this.zzu.zzaY();
        this.zzu.zzc();
        this.zzb = new zzgj(this, contextZzaY, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e A[Catch: all -> 0x0098, TRY_ENTER, TryCatch #11 {all -> 0x0098, blocks: (B:30:0x008d, B:32:0x0093, B:45:0x00b6, B:47:0x00da, B:49:0x00e4, B:51:0x00ec, B:61:0x0106, B:75:0x012e, B:77:0x0134, B:78:0x0137, B:93:0x016c, B:85:0x0157), top: B:109:0x008d }] */
    /* JADX WARN: Code duplicated, block: B:80:0x014c  */
    /* JADX WARN: Code duplicated, block: B:88:0x015e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0163 A[PHI: r8 r10 r17
  0x0163: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]
  0x0163: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]
  0x0163: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:81:0x014f, B:96:0x0183, B:89:0x0161] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x0180  */
    private final boolean zzs(int i2, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzp;
        boolean z2;
        boolean z3;
        Cursor cursorRawQuery;
        zzg();
        boolean z4 = false;
        z4 = false;
        if (!this.zzc) {
            zzic zzicVar = this.zzu;
            zzal zzalVarZzc = zzicVar.zzc();
            zzfx zzfxVar = zzfy.zzbb;
            Cursor cursor = null;
            cursor = null;
            zzr zzrVarZzh = zzalVarZzc.zzp(null, zzfxVar) ? this.zzu.zzv().zzh(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i2));
            contentValues.put(a.n0, bArr);
            if (zzicVar.zzc().zzp(null, zzfxVar) && zzrVarZzh != null) {
                contentValues.put("app_version", zzrVarZzh.zzc);
                contentValues.put("app_version_int", Long.valueOf(zzrVarZzh.zzj));
            }
            zzicVar.zzc();
            int i3 = 0;
            int i4 = 5;
            for (int i5 = 5; i3 < i5; i5 = 5) {
                try {
                    sQLiteDatabaseZzp = zzp();
                    if (sQLiteDatabaseZzp == null) {
                        this.zzc = true;
                    } else {
                        try {
                            sQLiteDatabaseZzp.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseZzp.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z4 ? 1 : 0);
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        z2 = z4 ? 1 : 0;
                                        SystemClock.sleep(i4);
                                        i4 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.close();
                                        }
                                        i3++;
                                        z4 = z2;
                                    } catch (SQLiteFullException e2) {
                                        e = e2;
                                        z2 = z4 ? 1 : 0;
                                        this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                        this.zzc = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.close();
                                        }
                                        i3++;
                                        z4 = z2;
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        z2 = z4 ? 1 : 0;
                                        z3 = true;
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.endTransaction();
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                        this.zzc = z3;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.close();
                                        }
                                        i3++;
                                        z4 = z2;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorRawQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseZzp != null) {
                                        sQLiteDatabaseZzp.close();
                                    }
                                    throw th;
                                }
                            }
                            if (j >= 100000) {
                                zzicVar.zzaV().zzb().zza("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseZzp.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    zzgs zzgsVarZzb = zzicVar.zzaV().zzb();
                                    z2 = z4 ? 1 : 0;
                                    try {
                                        try {
                                            z3 = true;
                                            try {
                                                zzgsVarZzb.zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e4) {
                                                e = e4;
                                                this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                                this.zzc = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzp != null) {
                                                    sQLiteDatabaseZzp.close();
                                                }
                                                i3++;
                                                z4 = z2;
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                if (sQLiteDatabaseZzp != null && sQLiteDatabaseZzp.inTransaction()) {
                                                    sQLiteDatabaseZzp.endTransaction();
                                                }
                                                this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                                this.zzc = z3;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseZzp != null) {
                                                    sQLiteDatabaseZzp.close();
                                                }
                                                i3++;
                                                z4 = z2;
                                            }
                                        } catch (SQLiteFullException e6) {
                                            e = e6;
                                            this.zzu.zzaV().zzb().zzb("Error writing entry; local database full", e);
                                            this.zzc = true;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseZzp != null) {
                                                sQLiteDatabaseZzp.close();
                                            }
                                            i3++;
                                            z4 = z2;
                                        } catch (SQLiteException e7) {
                                            e = e7;
                                            z3 = true;
                                            if (sQLiteDatabaseZzp != null) {
                                                sQLiteDatabaseZzp.endTransaction();
                                            }
                                            this.zzu.zzaV().zzb().zzb("Error writing entry to local database", e);
                                            this.zzc = z3;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseZzp != null) {
                                                sQLiteDatabaseZzp.close();
                                            }
                                            i3++;
                                            z4 = z2;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        SystemClock.sleep(i4);
                                        i4 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseZzp != null) {
                                            sQLiteDatabaseZzp.close();
                                        }
                                        i3++;
                                        z4 = z2;
                                    }
                                } else {
                                    z2 = z4 ? 1 : 0;
                                    z3 = true;
                                }
                            } else {
                                z2 = z4 ? 1 : 0;
                                z3 = true;
                            }
                            sQLiteDatabaseZzp.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseZzp.setTransactionSuccessful();
                            sQLiteDatabaseZzp.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseZzp.close();
                            return z3;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z2 = z4 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e8) {
                            e = e8;
                            z2 = z4 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e9) {
                            e = e9;
                            z2 = z4 ? 1 : 0;
                            z3 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z2 = z4 ? 1 : 0;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e10) {
                    e = e10;
                    z2 = z4 ? 1 : 0;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e11) {
                    e = e11;
                    z2 = z4 ? 1 : 0;
                    z3 = true;
                    sQLiteDatabaseZzp = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseZzp = null;
                }
            }
            boolean z5 = z4 ? 1 : 0;
            this.zzu.zzaV().zzk().zza("Failed to write entry to local database");
            return z5;
        }
        return z4;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final boolean zze() {
        return false;
    }

    public final void zzh() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzp = zzp();
            if (sQLiteDatabaseZzp == null || (iDelete = sQLiteDatabaseZzp.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzu.zzaV().zzk().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e2) {
            this.zzu.zzaV().zzb().zzb("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean zzi(zzbg zzbgVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzbh.zza(zzbgVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(0, bArrMarshall);
        }
        this.zzu.zzaV().zzc().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzj(zzpl zzplVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzpm.zza(zzplVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzs(1, bArrMarshall);
        }
        this.zzu.zzaV().zzc().zza("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzk(zzah zzahVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzae = zzicVar.zzk().zzae(zzahVar);
        if (bArrZzae.length <= 131072) {
            return zzs(2, bArrZzae);
        }
        zzicVar.zzaV().zzc().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzl(zzbe zzbeVar) {
        zzic zzicVar = this.zzu;
        byte[] bArrZzae = zzicVar.zzk().zzae(zzbeVar);
        if (bArrZzae == null) {
            zzicVar.zzaV().zzc().zza("Null default event parameters; not writing to database");
            return false;
        }
        if (bArrZzae.length <= 131072) {
            return zzs(4, bArrZzae);
        }
        zzicVar.zzaV().zzc().zza("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:185:0x0338 A[Catch: all -> 0x0111, TryCatch #37 {all -> 0x0111, blocks: (B:38:0x00de, B:40:0x00e4, B:42:0x00f7, B:44:0x00fd, B:58:0x0137, B:63:0x014f, B:65:0x0154, B:183:0x0332, B:185:0x0338, B:186:0x033b, B:193:0x035d, B:201:0x0377, B:80:0x0189, B:81:0x018c, B:79:0x0185, B:89:0x019f, B:91:0x01b3, B:98:0x01ce, B:99:0x01d7, B:100:0x01da, B:96:0x01c8, B:103:0x01de, B:107:0x01f4, B:121:0x021b, B:122:0x0225, B:123:0x0228, B:119:0x0215, B:126:0x022e, B:130:0x0242, B:144:0x0267, B:146:0x0271, B:147:0x0274, B:142:0x0261, B:150:0x0279, B:151:0x0289, B:158:0x02c8, B:160:0x02e5, B:161:0x02f4), top: B:235:0x0332 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x034d  */
    /* JADX WARN: Code duplicated, block: B:196:0x0364  */
    /* JADX WARN: Code duplicated, block: B:198:0x0369 A[PHI: r6 r11 r13 r17 r19 r21
  0x0369: PHI (r6v14 int) = (r6v7 int), (r6v10 int), (r6v15 int) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x0369: PHI (r11v3 int) = (r11v1 int), (r11v1 int), (r11v4 int) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x0369: PHI (r13v9 ??) = (r13v5 ??), (r13v7 ??), (r13v10 ??) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x0369: PHI (r17v8 java.lang.String) = (r17v3 java.lang.String), (r17v5 java.lang.String), (r17v9 java.lang.String) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x0369: PHI (r19v8 java.lang.String) = (r19v3 java.lang.String), (r19v5 java.lang.String), (r19v9 java.lang.String) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]
  0x0369: PHI (r21v8 java.lang.String) = (r21v3 java.lang.String), (r21v5 java.lang.String), (r21v9 java.lang.String) binds: [B:189:0x0350, B:204:0x038c, B:197:0x0367] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:203:0x0389  */
    /* JADX WARN: Code duplicated, block: B:208:0x039e  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:235:0x0332 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x038f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x038f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.database.sqlite.SQLiteClosable, android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r13v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.database.sqlite.SQLiteClosable] */
    /* JADX WARN: Type inference failed for: r15v5, types: [com.google.android.gms.measurement.internal.zzal] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r17v43 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v13 */
    public final List zzm(int i2) {
        Cursor cursor;
        ?? r13;
        ?? Zzp;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        ?? r17;
        ?? r16;
        long j2;
        String string;
        zzic zzicVar;
        int i3;
        int i4;
        zzbe zzbeVarCreateFromParcel;
        zzah zzahVarCreateFromParcel;
        zzpl zzplVarCreateFromParcel;
        String str = a.n0;
        String str2 = "type";
        String str3 = "rowid";
        zzg();
        ?? r6 = 0;
        if (this.zzc) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzq()) {
            return arrayList;
        }
        int i5 = 0;
        int i6 = 5;
        int i7 = 0;
        for (int i8 = 5; i7 < i8; i8 = 5) {
            try {
                Zzp = zzp();
                try {
                    if (Zzp == 0) {
                        this.zzc = true;
                        return r6;
                    }
                    try {
                        Zzp.beginTransaction();
                        try {
                            cursorQuery2 = Zzp.query("messages", new String[]{str3}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                            try {
                                long j3 = -1;
                                if (cursorQuery2.moveToFirst()) {
                                    j = cursorQuery2.getLong(i5);
                                    cursorQuery2.close();
                                } else {
                                    cursorQuery2.close();
                                    j = -1;
                                }
                                if (j != -1) {
                                    String[] strArr = new String[1];
                                    strArr[i5] = String.valueOf(j);
                                    r16 = "rowid<?";
                                    r17 = strArr;
                                } else {
                                    ?? r18 = r6;
                                    r17 = r18;
                                    r16 = r18;
                                }
                                String[] strArr2 = {str3, str2, str};
                                zzic zzicVar2 = this.zzu;
                                ?? Zzc = zzicVar2.zzc();
                                int i9 = 1;
                                zzfx zzfxVar = zzfy.zzbb;
                                boolean zZzp = Zzc.zzp(r6, zzfxVar);
                                int i10 = 4;
                                int i11 = 3;
                                int i12 = 2;
                                if (zZzp) {
                                    strArr2 = new String[i8];
                                    strArr2[i5] = str3;
                                    strArr2[1] = str2;
                                    strArr2[2] = str;
                                    strArr2[3] = "app_version";
                                    strArr2[4] = "app_version_int";
                                }
                                String[] strArr3 = strArr2;
                                zzic zzicVar3 = zzicVar2;
                                cursorQuery = Zzp.query("messages", strArr3, r16, r17, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j3 = cursorQuery.getLong(i5);
                                        int i13 = cursorQuery.getInt(i9);
                                        byte[] blob = cursorQuery.getBlob(i12);
                                        try {
                                            if (zzicVar3.zzc().zzp(null, zzfxVar)) {
                                                string = cursorQuery.getString(i11);
                                                j2 = cursorQuery.getLong(i10);
                                            } else {
                                                j2 = 0;
                                                string = null;
                                            }
                                            String str4 = str;
                                            long j4 = j2;
                                            str2 = str2;
                                            if (i13 == 0) {
                                                try {
                                                    Parcel parcelObtain = Parcel.obtain();
                                                    zzicVar = zzicVar3;
                                                    try {
                                                        str3 = str3;
                                                        try {
                                                            try {
                                                                parcelObtain.unmarshall(blob, 0, blob.length);
                                                                parcelObtain.setDataPosition(0);
                                                                zzbg zzbgVarCreateFromParcel = zzbg.CREATOR.createFromParcel(parcelObtain);
                                                                try {
                                                                    parcelObtain.recycle();
                                                                    if (zzbgVarCreateFromParcel != null) {
                                                                        arrayList.add(new zzgk(zzbgVarCreateFromParcel, string, j4));
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused) {
                                                                    str = str4;
                                                                    i5 = 0;
                                                                    SystemClock.sleep(i6);
                                                                    i6 += 20;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzp != 0) {
                                                                        Zzp.close();
                                                                    }
                                                                    i7++;
                                                                    i5 = i5;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r6 = 0;
                                                                } catch (SQLiteFullException e2) {
                                                                    e = e2;
                                                                    str = str4;
                                                                    i5 = 0;
                                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                    this.zzc = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzp != 0) {
                                                                        Zzp.close();
                                                                    }
                                                                    i7++;
                                                                    i5 = i5;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r6 = 0;
                                                                } catch (SQLiteException e3) {
                                                                    e = e3;
                                                                    str = str4;
                                                                    i5 = 0;
                                                                    if (Zzp != 0) {
                                                                        try {
                                                                            if (Zzp.inTransaction()) {
                                                                                Zzp.endTransaction();
                                                                            }
                                                                        } catch (Throwable th) {
                                                                            th = th;
                                                                            cursor = cursorQuery;
                                                                            r13 = Zzp;
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                            if (r13 != 0) {
                                                                                r13.close();
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                    this.zzc = true;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    if (Zzp != 0) {
                                                                        Zzp.close();
                                                                    }
                                                                    i7++;
                                                                    i5 = i5;
                                                                    str = str;
                                                                    str2 = str2;
                                                                    str3 = str3;
                                                                    r6 = 0;
                                                                }
                                                            } catch (SafeParcelReader.ParseException unused2) {
                                                                this.zzu.zzaV().zzb().zza("Failed to load event from local database");
                                                                parcelObtain.recycle();
                                                            }
                                                            str = str4;
                                                            i4 = 2;
                                                            i3 = 3;
                                                            i5 = 0;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            parcelObtain.recycle();
                                                            throw th;
                                                        }
                                                    } catch (SafeParcelReader.ParseException unused3) {
                                                        str3 = str3;
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused4) {
                                                    str3 = str3;
                                                } catch (SQLiteFullException e4) {
                                                    e = e4;
                                                    str3 = str3;
                                                } catch (SQLiteException e5) {
                                                    e = e5;
                                                    str3 = str3;
                                                }
                                            } else {
                                                zzicVar = zzicVar3;
                                                str3 = str3;
                                                if (i13 == 1) {
                                                    Parcel parcelObtain2 = Parcel.obtain();
                                                    try {
                                                        try {
                                                            parcelObtain2.unmarshall(blob, 0, blob.length);
                                                            parcelObtain2.setDataPosition(0);
                                                            zzplVarCreateFromParcel = zzpl.CREATOR.createFromParcel(parcelObtain2);
                                                            parcelObtain2.recycle();
                                                        } catch (SafeParcelReader.ParseException unused5) {
                                                            this.zzu.zzaV().zzb().zza("Failed to load user property from local database");
                                                            parcelObtain2.recycle();
                                                            zzplVarCreateFromParcel = null;
                                                        }
                                                        if (zzplVarCreateFromParcel != null) {
                                                            arrayList.add(new zzgk(zzplVarCreateFromParcel, string, j4));
                                                        }
                                                        str = str4;
                                                        i4 = 2;
                                                        i3 = 3;
                                                        i5 = 0;
                                                    } catch (Throwable th4) {
                                                        parcelObtain2.recycle();
                                                        throw th4;
                                                    }
                                                } else {
                                                    i4 = 2;
                                                    if (i13 == 2) {
                                                        Parcel parcelObtain3 = Parcel.obtain();
                                                        try {
                                                            str = str4;
                                                            try {
                                                                try {
                                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                    parcelObtain3.setDataPosition(0);
                                                                    zzahVarCreateFromParcel = zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                    try {
                                                                        parcelObtain3.recycle();
                                                                    } catch (SQLiteDatabaseLockedException unused6) {
                                                                        i5 = 0;
                                                                        SystemClock.sleep(i6);
                                                                        i6 += 20;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzp != 0) {
                                                                            Zzp.close();
                                                                        }
                                                                        i7++;
                                                                        i5 = i5;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r6 = 0;
                                                                    } catch (SQLiteFullException e6) {
                                                                        e = e6;
                                                                        i5 = 0;
                                                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                        this.zzc = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzp != 0) {
                                                                            Zzp.close();
                                                                        }
                                                                        i7++;
                                                                        i5 = i5;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r6 = 0;
                                                                    } catch (SQLiteException e7) {
                                                                        e = e7;
                                                                        i5 = 0;
                                                                        if (Zzp != 0) {
                                                                            if (Zzp.inTransaction()) {
                                                                                Zzp.endTransaction();
                                                                            }
                                                                        }
                                                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                        this.zzc = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (Zzp != 0) {
                                                                            Zzp.close();
                                                                        }
                                                                        i7++;
                                                                        i5 = i5;
                                                                        str = str;
                                                                        str2 = str2;
                                                                        str3 = str3;
                                                                        r6 = 0;
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    parcelObtain3.recycle();
                                                                    throw th;
                                                                }
                                                            } catch (SafeParcelReader.ParseException unused7) {
                                                                this.zzu.zzaV().zzb().zza("Failed to load conditional user property from local database");
                                                                parcelObtain3.recycle();
                                                                zzahVarCreateFromParcel = null;
                                                            }
                                                        } catch (SafeParcelReader.ParseException unused8) {
                                                            str = str4;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            str = str4;
                                                        }
                                                        if (zzahVarCreateFromParcel != null) {
                                                            arrayList.add(new zzgk(zzahVarCreateFromParcel, string, j4));
                                                        }
                                                        i3 = 3;
                                                        i5 = 0;
                                                    } else {
                                                        str = str4;
                                                        if (i13 == 4) {
                                                            Parcel parcelObtain4 = Parcel.obtain();
                                                            try {
                                                                i5 = 0;
                                                                try {
                                                                    try {
                                                                        parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                        parcelObtain4.setDataPosition(0);
                                                                        zzbeVarCreateFromParcel = zzbe.CREATOR.createFromParcel(parcelObtain4);
                                                                        try {
                                                                            parcelObtain4.recycle();
                                                                        } catch (SQLiteDatabaseLockedException unused9) {
                                                                            SystemClock.sleep(i6);
                                                                            i6 += 20;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzp != 0) {
                                                                                Zzp.close();
                                                                            }
                                                                            i7++;
                                                                            i5 = i5;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r6 = 0;
                                                                        } catch (SQLiteFullException e8) {
                                                                            e = e8;
                                                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                            this.zzc = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzp != 0) {
                                                                                Zzp.close();
                                                                            }
                                                                            i7++;
                                                                            i5 = i5;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r6 = 0;
                                                                        } catch (SQLiteException e9) {
                                                                            e = e9;
                                                                            if (Zzp != 0) {
                                                                                if (Zzp.inTransaction()) {
                                                                                    Zzp.endTransaction();
                                                                                }
                                                                            }
                                                                            this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                                                            this.zzc = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (Zzp != 0) {
                                                                                Zzp.close();
                                                                            }
                                                                            i7++;
                                                                            i5 = i5;
                                                                            str = str;
                                                                            str2 = str2;
                                                                            str3 = str3;
                                                                            r6 = 0;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        parcelObtain4.recycle();
                                                                        throw th;
                                                                    }
                                                                } catch (SafeParcelReader.ParseException unused10) {
                                                                    this.zzu.zzaV().zzb().zza("Failed to load default event parameters from local database");
                                                                    parcelObtain4.recycle();
                                                                    zzbeVarCreateFromParcel = null;
                                                                }
                                                            } catch (SafeParcelReader.ParseException unused11) {
                                                                i5 = 0;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                            }
                                                            if (zzbeVarCreateFromParcel != null) {
                                                                arrayList.add(new zzgk(zzbeVarCreateFromParcel, string, j4));
                                                            }
                                                            i3 = 3;
                                                        } else {
                                                            i3 = 3;
                                                            i5 = 0;
                                                            if (i13 == 3) {
                                                                this.zzu.zzaV().zzk().zza("Skipping app launch break");
                                                            } else {
                                                                this.zzu.zzaV().zzb().zza("Unknown record type in local database");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            i11 = i3;
                                            i5 = i5;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                            i9 = 1;
                                            i10 = 4;
                                            i12 = i4;
                                            zzicVar3 = zzicVar;
                                        } catch (SQLiteDatabaseLockedException unused12) {
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteFullException e10) {
                                            e = e10;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        } catch (SQLiteException e11) {
                                            e = e11;
                                            str = str;
                                            str2 = str2;
                                            str3 = str3;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused13) {
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i5 = i5;
                                    } catch (SQLiteFullException e12) {
                                        e = e12;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i5 = i5;
                                    } catch (SQLiteException e13) {
                                        e = e13;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        i5 = i5;
                                    }
                                }
                                if (Zzp.delete("messages", "rowid <= ?", new String[]{Long.toString(j3)}) < arrayList.size()) {
                                    this.zzu.zzaV().zzb().zza("Fewer entries removed from local database than expected");
                                }
                                Zzp.setTransactionSuccessful();
                                Zzp.endTransaction();
                                cursorQuery.close();
                                Zzp.close();
                                return arrayList;
                            } catch (Throwable th9) {
                                th = th9;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused14) {
                                        cursorQuery = null;
                                        SystemClock.sleep(i6);
                                        i6 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (Zzp != 0) {
                                            Zzp.close();
                                        }
                                        i7++;
                                        i5 = i5;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r6 = 0;
                                    } catch (SQLiteFullException e14) {
                                        e = e14;
                                        Zzp = Zzp;
                                        cursorQuery = null;
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (Zzp != 0) {
                                            Zzp.close();
                                        }
                                        i7++;
                                        i5 = i5;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r6 = 0;
                                    } catch (SQLiteException e15) {
                                        e = e15;
                                        Zzp = Zzp;
                                        cursorQuery = null;
                                        if (Zzp != 0) {
                                            if (Zzp.inTransaction()) {
                                                Zzp.endTransaction();
                                            }
                                        }
                                        this.zzu.zzaV().zzb().zzb("Error reading entries from local database", e);
                                        this.zzc = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (Zzp != 0) {
                                            Zzp.close();
                                        }
                                        i7++;
                                        i5 = i5;
                                        str = str;
                                        str2 = str2;
                                        str3 = str3;
                                        r6 = 0;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            cursorQuery2 = null;
                        }
                    } catch (SQLiteDatabaseLockedException unused15) {
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i5 = i5;
                    } catch (SQLiteFullException e16) {
                        e = e16;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i5 = i5;
                        Zzp = Zzp;
                    } catch (SQLiteException e17) {
                        e = e17;
                        str = str;
                        str2 = str2;
                        str3 = str3;
                        i5 = i5;
                        Zzp = Zzp;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    cursor = null;
                    r13 = Zzp;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (r13 != 0) {
                        r13.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused16) {
                str = str;
                str2 = str2;
                str3 = str3;
                i5 = i5;
                Zzp = 0;
            } catch (SQLiteFullException e18) {
                e = e18;
                str = str;
                str2 = str2;
                str3 = str3;
                i5 = i5;
                Zzp = 0;
            } catch (SQLiteException e19) {
                e = e19;
                str = str;
                str2 = str2;
                str3 = str3;
                i5 = i5;
                Zzp = 0;
            } catch (Throwable th12) {
                th = th12;
                cursor = null;
                r13 = 0;
            }
        }
        Z.C(this.zzu, "Failed to read events from database in reasonable time");
        return null;
    }

    public final boolean zzn() {
        return zzs(3, new byte[0]);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b A[PHI: r4
  0x006b: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:34:0x007e, B:31:0x0069, B:28:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean zzo() {
        zzg();
        if (!this.zzc && zzq()) {
            int i2 = 5;
            for (int i3 = 0; i3 < 5; i3++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseZzp = zzp();
                            if (sQLiteDatabaseZzp != null) {
                                sQLiteDatabaseZzp.beginTransaction();
                                sQLiteDatabaseZzp.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                                sQLiteDatabaseZzp.setTransactionSuccessful();
                                sQLiteDatabaseZzp.endTransaction();
                                sQLiteDatabaseZzp.close();
                                return true;
                            }
                            this.zzc = true;
                        } catch (SQLiteFullException e2) {
                            this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e2);
                            this.zzc = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i2);
                        i2 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteException e3) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.zzu.zzaV().zzb().zzb("Error deleting app launch break from local database", e3);
                    this.zzc = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            Z.C(this.zzu, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final SQLiteDatabase zzp() throws SQLiteException {
        if (this.zzc) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zzb.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzc = true;
        return null;
    }

    public final boolean zzq() {
        zzic zzicVar = this.zzu;
        Context contextZzaY = zzicVar.zzaY();
        zzicVar.zzc();
        return contextZzaY.getDatabasePath("google_app_measurement_local.db").exists();
    }
}
