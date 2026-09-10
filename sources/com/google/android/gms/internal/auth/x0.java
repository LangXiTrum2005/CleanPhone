package com.google.android.gms.internal.auth;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.unity3d.services.core.fid.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements x, com.google.android.gms.common.api.internal.k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l0 f22914c = new l0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f22916b;

    public /* synthetic */ x0(b bVar, d dVar) {
        this.f22915a = 3;
        this.f22916b = dVar;
    }

    @Override // com.google.android.gms.common.api.internal.k
    public void accept(Object obj, Object obj2) {
        d dVar = (d) this.f22916b;
        i2 i2Var = (i2) ((h2) obj).getService();
        l2 l2Var = new l2((TaskCompletionSource) obj2);
        i2Var.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(i2Var.f22790c);
        int i10 = f.f22820a;
        parcelObtain.writeStrongBinder(l2Var);
        f.b(parcelObtain, dVar);
        i2Var.w1(parcelObtain, 2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003e A[Catch: all -> 0x0029, TryCatch #5 {all -> 0x0029, blocks: (B:6:0x0010, B:8:0x0014, B:10:0x0020, B:20:0x003e, B:72:0x0179, B:15:0x002d, B:17:0x0035, B:21:0x0043, B:23:0x0049, B:24:0x004d, B:71:0x0176, B:73:0x017c, B:74:0x017f, B:75:0x0180, B:25:0x0051, B:26:0x0054, B:27:0x0061, B:29:0x0067, B:35:0x007e, B:37:0x0084, B:38:0x0088, B:58:0x0147, B:59:0x014a, B:67:0x016d, B:66:0x0158, B:68:0x016e, B:69:0x0173, B:70:0x0174, B:30:0x006d, B:34:0x0075), top: B:109:0x0010, inners: #0 }] */
    @Override // com.google.android.gms.internal.auth.x
    public Object zza() {
        v wVar;
        v wVar2;
        int i10 = this.f22915a;
        Object obj = this.f22916b;
        switch (i10) {
            case 1:
                l lVar = (l) obj;
                Cursor cursorQuery = lVar.f22863a.query(lVar.f22864b, l.f22862h, null, null, null);
                if (cursorQuery == null) {
                    return Collections.EMPTY_MAP;
                }
                try {
                    int count = cursorQuery.getCount();
                    if (count == 0) {
                        return Collections.EMPTY_MAP;
                    }
                    Map eVar = count <= 256 ? new x.e(count) : new HashMap(count, 1.0f);
                    while (cursorQuery.moveToNext()) {
                        eVar.put(cursorQuery.getString(0), cursorQuery.getString(1));
                    }
                    return eVar;
                } finally {
                    cursorQuery.close();
                }
            default:
                Context contextCreateDeviceProtectedStorageContext = (Context) obj;
                Object obj2 = r.f22894g;
                synchronized (o.class) {
                    try {
                        wVar = o.f22879b;
                        if (wVar == null) {
                            String str = Build.TYPE;
                            String str2 = Build.TAGS;
                            if (!str.equals("eng") && !str.equals("userdebug")) {
                                wVar = u.f22908a;
                            } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                                if (!contextCreateDeviceProtectedStorageContext.isDeviceProtectedStorage()) {
                                    contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
                                }
                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                try {
                                    StrictMode.allowThreadDiskWrites();
                                    try {
                                        File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                        wVar2 = file.exists() ? new w(file) : u.f22908a;
                                    } catch (RuntimeException e10) {
                                        Log.e("HermeticFileOverrides", "no data dir", e10);
                                        wVar2 = u.f22908a;
                                    }
                                    if (wVar2.g()) {
                                        Object objD = wVar2.d();
                                        try {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objD)));
                                            try {
                                                x.i iVar = new x.i(0);
                                                HashMap map = new HashMap();
                                                while (true) {
                                                    String line = bufferedReader.readLine();
                                                    if (line != null) {
                                                        String[] strArrSplit = line.split(" ", 3);
                                                        if (strArrSplit.length != 3) {
                                                            Log.e("HermeticFileOverrides", "Invalid: " + line);
                                                        } else {
                                                            String str3 = new String(strArrSplit[0]);
                                                            String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                            String strDecode2 = (String) map.get(strArrSplit[2]);
                                                            if (strDecode2 == null) {
                                                                String str4 = new String(strArrSplit[2]);
                                                                strDecode2 = Uri.decode(str4);
                                                                if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                                    map.put(str4, strDecode2);
                                                                }
                                                            }
                                                            if (!iVar.containsKey(str3)) {
                                                                iVar.put(str3, new x.i(0));
                                                            }
                                                            ((x.i) iVar.get(str3)).put(strDecode, strDecode2);
                                                        }
                                                    } else {
                                                        Log.w("HermeticFileOverrides", "Parsed " + objD.toString() + " for Android package " + contextCreateDeviceProtectedStorageContext.getPackageName());
                                                        m mVar = new m(iVar);
                                                        bufferedReader.close();
                                                        wVar = new w(mVar);
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                try {
                                                    bufferedReader.close();
                                                    throw th2;
                                                } catch (Throwable th3) {
                                                    try {
                                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                                        throw th2;
                                                    } catch (Exception unused) {
                                                        throw th2;
                                                    }
                                                }
                                            }
                                        } catch (IOException e11) {
                                            throw new RuntimeException(e11);
                                        }
                                    } else {
                                        wVar = u.f22908a;
                                    }
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                } catch (Throwable th4) {
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                    throw th4;
                                }
                            } else {
                                wVar = u.f22908a;
                            }
                            o.f22879b = wVar;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return wVar;
        }
    }

    public /* synthetic */ x0(Object obj, int i10) {
        this.f22915a = i10;
        this.f22916b = obj;
    }

    public x0() {
        b1 b1Var;
        this.f22915a = 0;
        try {
            b1Var = (b1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            b1Var = f22914c;
        }
        w0 w0Var = new w0(l0.f22869b, b1Var);
        Charset charset = p0.f22890a;
        this.f22916b = w0Var;
    }
}
