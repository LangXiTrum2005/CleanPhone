package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.ironsource.C0605ua;
import com.ironsource.F9;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m01 implements qv0, z.j, ag0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f17184f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f17189e;

    public /* synthetic */ m01(bc.i iVar, boolean z10, ArrayList arrayList, uj ujVar, zj zjVar) {
        this.f17186b = iVar;
        this.f17185a = z10;
        this.f17187c = arrayList;
        this.f17188d = ujVar;
        this.f17189e = zjVar;
    }

    public static m01 a(ly0 ly0Var, ny0 ny0Var, py0 py0Var, py0 py0Var2, boolean z10) {
        if (py0Var == py0.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        ly0 ly0Var2 = ly0.DEFINED_BY_JAVASCRIPT;
        py0 py0Var3 = py0.NATIVE;
        if (ly0Var == ly0Var2 && py0Var == py0Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (ny0Var == ny0.DEFINED_BY_JAVASCRIPT && py0Var == py0Var3) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new m01(ly0Var, ny0Var, py0Var, py0Var2, z10);
    }

    public static String m(jh jhVar) {
        mh mhVarG = nh.G();
        String strZ = jhVar.z().z();
        mhVarG.b();
        ((nh) mhVarG.f19193b).I(strZ);
        String strA = jhVar.z().A();
        mhVarG.b();
        ((nh) mhVarG.f19193b).J(strA);
        long jC = jhVar.z().C();
        mhVarG.b();
        ((nh) mhVarG.f19193b).L(jC);
        long jD = jhVar.z().D();
        mhVarG.b();
        ((nh) mhVarG.f19193b).M(jD);
        long jB = jhVar.z().B();
        mhVarG.b();
        ((nh) mhVarG.f19193b).K(jB);
        return p9.c.b(((nh) mhVarG.e()).b());
    }

    public static String n(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ue ueVarZ = ve.z();
        ueVarZ.b();
        ((ve) ueVarZ.f19193b).D(5);
        as1 as1VarD = cs1.D(bArr, 0, bArr.length);
        ueVarZ.b();
        ((ve) ueVarZ.f19193b).A(as1VarD);
        return Base64.encodeToString(((ve) ueVarZ.e()).b(), 11);
    }

    public synchronized String b(Context context) {
        byte[] bArrP;
        try {
            HashMap mapZzb = ((p01) this.f17188d).zzb();
            mapZzb.put("f", CampaignEx.JSON_KEY_AD_Q);
            mapZzb.put("ctx", context);
            mapZzb.put(C0605ua.f30806b, null);
            bArrP = p(mapZzb);
            if (this.f17185a) {
                mapZzb.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return n(bArrP);
    }

    @Override // z.j
    public /* synthetic */ Object c(z.i iVar) {
        s21 s21Var = (s21) this.f17186b;
        s21Var.f19779a.execute(new q21(s21Var, (String) this.f17188d, iVar, this.f17185a, (String) this.f17187c, (byte[]) this.f17189e));
        return "";
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ef A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0125 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:55:0x013c A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0143 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014e A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x015c A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x017d A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0189 A[Catch: all -> 0x002a, TryCatch #1 {all -> 0x002a, blocks: (B:5:0x000a, B:7:0x0019, B:9:0x0023, B:10:0x0028, B:14:0x002d, B:16:0x0043, B:19:0x004e, B:22:0x0059, B:31:0x009f, B:33:0x00bf, B:34:0x00c4, B:36:0x00c6, B:38:0x00d4, B:39:0x00d9, B:42:0x00dd, B:47:0x00e7, B:48:0x00ed, B:50:0x00ef, B:52:0x0125, B:53:0x0136, B:55:0x013c, B:56:0x0141, B:58:0x0143, B:60:0x014e, B:61:0x0155, B:63:0x015c, B:64:0x0163, B:66:0x017d, B:68:0x0189, B:69:0x018c, B:70:0x018f, B:71:0x0194, B:23:0x007c, B:25:0x0082, B:28:0x008d, B:29:0x009d), top: B:77:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:80:0x018c A[SYNTHETIC] */
    public boolean d(jh jhVar, s6 s6Var) {
        boolean zA;
        long jCurrentTimeMillis;
        String string;
        SharedPreferences.Editor editorEdit;
        HashSet hashSet;
        nh nhVarQ;
        nh nhVarQ2;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        synchronized (f17184f) {
            try {
                nh nhVarQ3 = q(1);
                String strZ = jhVar.z().z();
                if (nhVarQ3 != null && nhVarQ3.z().equals(strZ)) {
                    o(4014, jCurrentTimeMillis2);
                    return false;
                }
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                File fileI = i(strZ);
                if (fileI.exists()) {
                    String str = true != fileI.isDirectory() ? "0" : "1";
                    String str2 = true != fileI.isFile() ? "0" : "1";
                    StringBuilder sb2 = new StringBuilder(7);
                    sb2.append("d:");
                    sb2.append(str);
                    sb2.append(",f:");
                    sb2.append(str2);
                    ((b01) this.f17189e).zzb(4023, jCurrentTimeMillis3, sb2.toString());
                    o(4015, jCurrentTimeMillis3);
                } else if (!fileI.mkdirs()) {
                    ((b01) this.f17189e).zzb(4024, jCurrentTimeMillis3, "cw:".concat(true != fileI.canWrite() ? "0" : "1"));
                    o(4015, jCurrentTimeMillis3);
                    return false;
                }
                File fileI2 = i(strZ);
                File file = new File(fileI2, "pcam.jar");
                File file2 = new File(fileI2, "pcbc");
                if (!rb0.t(file, jhVar.A().h())) {
                    o(4016, jCurrentTimeMillis2);
                    return false;
                }
                if (!rb0.t(file2, jhVar.B().h())) {
                    o(4017, jCurrentTimeMillis2);
                    return false;
                }
                if (s6Var != null) {
                    try {
                        zA = pz0.a(file);
                    } catch (GeneralSecurityException unused) {
                        zA = false;
                    }
                    if (zA) {
                        String strM = m(jhVar);
                        jCurrentTimeMillis = System.currentTimeMillis();
                        SharedPreferences sharedPreferences = (SharedPreferences) this.f17187c;
                        string = sharedPreferences.getString("LATMTD".concat(String.valueOf((String) this.f17188d)), null);
                        editorEdit = sharedPreferences.edit();
                        editorEdit.putString("LATMTD".concat(String.valueOf((String) this.f17188d)), strM);
                        if (string != null) {
                            editorEdit.putString("FBAMTD".concat(String.valueOf((String) this.f17188d)), string);
                        }
                        if (!editorEdit.commit()) {
                            hashSet = new HashSet();
                            nhVarQ = q(1);
                            if (nhVarQ != null) {
                                hashSet.add(nhVarQ.z());
                            }
                            nhVarQ2 = q(2);
                            if (nhVarQ2 != null) {
                                hashSet.add(nhVarQ2.z());
                            }
                            for (File file3 : new File(((Context) this.f17186b).getDir("pccache", 0), (String) this.f17188d).listFiles()) {
                                if (!hashSet.contains(file3.getName())) {
                                    rb0.G(file3);
                                }
                            }
                            o(5014, jCurrentTimeMillis2);
                            return true;
                        }
                        o(4019, jCurrentTimeMillis);
                    } else {
                        o(4018, jCurrentTimeMillis2);
                        rb0.G(fileI2);
                    }
                } else {
                    String strM2 = m(jhVar);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    SharedPreferences sharedPreferences2 = (SharedPreferences) this.f17187c;
                    string = sharedPreferences2.getString("LATMTD".concat(String.valueOf((String) this.f17188d)), null);
                    editorEdit = sharedPreferences2.edit();
                    editorEdit.putString("LATMTD".concat(String.valueOf((String) this.f17188d)), strM2);
                    if (string != null) {
                        editorEdit.putString("FBAMTD".concat(String.valueOf((String) this.f17188d)), string);
                    }
                    if (!editorEdit.commit()) {
                        hashSet = new HashSet();
                        nhVarQ = q(1);
                        if (nhVarQ != null) {
                            hashSet.add(nhVarQ.z());
                        }
                        nhVarQ2 = q(2);
                        if (nhVarQ2 != null) {
                            hashSet.add(nhVarQ2.z());
                        }
                        while (i < r8) {
                            if (!hashSet.contains(file3.getName())) {
                                rb0.G(file3);
                            }
                        }
                        o(5014, jCurrentTimeMillis2);
                        return true;
                    }
                    o(4019, jCurrentTimeMillis);
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized String e(Context context, View view, Activity activity) {
        byte[] bArrP;
        try {
            HashMap mapZzc = ((p01) this.f17188d).zzc();
            mapZzc.put("f", "v");
            mapZzc.put("ctx", context);
            mapZzc.put(C0605ua.f30806b, null);
            mapZzc.put("view", view);
            mapZzc.put("act", activity);
            bArrP = p(mapZzc);
            if (this.f17185a) {
                mapZzc.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return n(bArrP);
    }

    public boolean f(jh jhVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f17184f) {
            try {
                if (!rb0.t(new File(i(jhVar.z().z()), "pcbc"), jhVar.B().h())) {
                    o(4020, jCurrentTimeMillis);
                    return false;
                }
                String strM = m(jhVar);
                SharedPreferences.Editor editorEdit = ((SharedPreferences) this.f17187c).edit();
                editorEdit.putString("LATMTD".concat(String.valueOf((String) this.f17188d)), strM);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    o(5015, jCurrentTimeMillis);
                } else {
                    o(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized String g(Context context, String str, View view, Activity activity) {
        byte[] bArrP;
        try {
            HashMap mapZzd = ((p01) this.f17188d).zzd();
            mapZzd.put("f", "c");
            mapZzd.put("ctx", context);
            mapZzd.put("cs", str);
            mapZzd.put(C0605ua.f30806b, null);
            mapZzd.put("view", view);
            mapZzd.put("act", activity);
            bArrP = p(mapZzd);
            if (this.f17185a) {
                mapZzd.clear();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return n(bArrP);
    }

    public synchronized void h(MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap mapZze = ((p01) this.f17188d).zze();
            mapZze.put(C0605ua.f30806b, null);
            mapZze.put("evt", motionEvent);
            Object obj = this.f17186b;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapZze);
            ((qz0) this.f17189e).b(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new n01(F9.a.f26068d, e10);
        }
    }

    public File i(String str) {
        return new File(new File(((Context) this.f17186b).getDir("pccache", 0), (String) this.f17188d), str);
    }

    public synchronized boolean j() {
        Object obj;
        try {
            obj = this.f17186b;
        } catch (Exception e10) {
            throw new n01(2001, e10);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public synchronized void k() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.f17186b;
            obj.getClass().getDeclaredMethod(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, null).invoke(obj, null);
            ((qz0) this.f17189e).b(IronSourceError.ERROR_DELIVERY_CAPPING_VALIDATION_FAILED, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new n01(F9.b.f26077c, e10);
        }
    }

    public synchronized int l() {
        Object obj;
        try {
            obj = this.f17186b;
        } catch (Exception e10) {
            throw new n01(F9.a.f26070f, e10);
        }
        return ((Integer) obj.getClass().getDeclaredMethod(CampaignEx.KEY_LOCAL_CHECK_STATE, null).invoke(obj, null)).intValue();
    }

    public void o(int i10, long j10) {
        ((b01) this.f17189e).zza(i10, j10);
    }

    public synchronized byte[] p(Map map) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.f17186b;
        } catch (Exception e10) {
            ((qz0) this.f17189e).c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    public nh q(int i10) {
        ks1 ks1VarA;
        String str = (String) this.f17188d;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f17187c;
        String string = i10 == 1 ? sharedPreferences.getString("LATMTD".concat(String.valueOf(str)), null) : sharedPreferences.getString("FBAMTD".concat(String.valueOf(str)), null);
        if (string != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                byte[] bArrJ = p9.c.j(string);
                as1 as1VarD = cs1.D(bArrJ, 0, bArrJ.length);
                if (this.f17185a) {
                    ks1 ks1Var = ks1.f16518a;
                    int i11 = tr1.f20473a;
                    ks1VarA = ks1.f16519b;
                } else {
                    ks1VarA = ks1.a();
                }
                return nh.F(as1VarD, ks1VarA);
            } catch (et1 unused) {
            } catch (NullPointerException unused2) {
                o(2029, jCurrentTimeMillis);
            } catch (RuntimeException unused3) {
                o(2032, jCurrentTimeMillis);
            }
        }
        return null;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x012d */
    @Override // com.google.android.gms.internal.ads.qv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object zza(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m01.zza(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ m01(s21 s21Var, String str, boolean z10, String str2, byte[] bArr) {
        this.f17186b = s21Var;
        this.f17188d = str;
        this.f17185a = z10;
        this.f17187c = str2;
        this.f17189e = bArr;
    }

    public /* synthetic */ m01(Object obj, Object obj2, Object obj3, Object obj4, boolean z10) {
        this.f17186b = obj;
        this.f17187c = obj2;
        this.f17188d = obj3;
        this.f17189e = obj4;
        this.f17185a = z10;
    }

    public m01(Context context, hh hhVar, b01 b01Var, boolean z10) {
        this.f17185a = false;
        this.f17186b = context;
        this.f17188d = Integer.toString(hhVar.f15291a);
        this.f17187c = context.getSharedPreferences("pcvmspf", 0);
        this.f17189e = b01Var;
        this.f17185a = z10;
    }

    public m01(ly0 ly0Var, ny0 ny0Var, py0 py0Var, py0 py0Var2, boolean z10) {
        this.f17188d = ly0Var;
        this.f17189e = ny0Var;
        this.f17186b = py0Var;
        this.f17187c = py0Var2;
        this.f17185a = z10;
    }

    @Override // com.google.android.gms.internal.ads.ag0, com.google.android.gms.internal.ads.li0
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo161zza(Object obj) {
        ((v32) obj).e(0, (r32) ((iw0) this.f17186b).f15864b, (j32) this.f17187c, (o32) this.f17188d, (IOException) this.f17189e, this.f17185a);
    }
}
