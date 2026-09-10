package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.p004ironsource.d9;
import com.smartdigimkt.u2.m;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
public class zzarz implements zzard {
    protected final zzasb zza;
    private final zzary zzb;

    public zzarz(zzary zzaryVar) {
        zzasb zzasbVar = new zzasb(4096);
        this.zzb = zzaryVar;
        this.zza = zzasbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    public zzarg zza(zzark zzarkVar) throws Throwable {
        zzasi zzasiVar;
        byte[] bArr;
        zzart zzarfVar;
        String str;
        Map map;
        byte[] byteArray;
        byte[] bArrZza;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                zzaqt zzaqtVarZzk = zzarkVar.zzk();
                if (zzaqtVarZzk == null) {
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map2 = new HashMap();
                    String str2 = zzaqtVarZzk.zzb;
                    if (str2 != null) {
                        map2.put("If-None-Match", str2);
                    }
                    long j = zzaqtVarZzk.zzd;
                    if (j > 0) {
                        map2.put("If-Modified-Since", zzash.zzc(j));
                    }
                    map = map2;
                }
                zzasi zzasiVarZza = this.zzb.zza(zzarkVar, map);
                try {
                    int iZza = zzasiVarZza.zza();
                    List listZzb = zzasiVarZza.zzb();
                    if (iZza == 304) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        zzaqt zzaqtVarZzk2 = zzarkVar.zzk();
                        if (zzaqtVarZzk2 == null) {
                            return new zzarg(304, (byte[]) null, true, jElapsedRealtime2, listZzb);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listZzb.isEmpty()) {
                            Iterator it = listZzb.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzarc) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(listZzb);
                        List list = zzaqtVarZzk2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzarc zzarcVar : zzaqtVarZzk2.zzh) {
                                    if (!treeSet.contains(zzarcVar.zza())) {
                                        arrayList.add(zzarcVar);
                                    }
                                }
                            }
                        } else if (!zzaqtVarZzk2.zzg.isEmpty()) {
                            for (Map.Entry entry : zzaqtVarZzk2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzarc((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzarg(304, zzaqtVarZzk2.zza, true, jElapsedRealtime2, (List) arrayList);
                    }
                    InputStream inputStreamZzd = zzasiVarZza.zzd();
                    if (inputStreamZzd != null) {
                        int iZzc = zzasiVarZza.zzc();
                        zzasb zzasbVar = this.zza;
                        zzasm zzasmVar = new zzasm(zzasbVar, iZzc);
                        try {
                            bArrZza = zzasbVar.zza(1024);
                            while (true) {
                                try {
                                    int i2 = inputStreamZzd.read(bArrZza);
                                    if (i2 == -1) {
                                        break;
                                    }
                                    zzasmVar.write(bArrZza, 0, i2);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamZzd.close();
                                    } catch (IOException unused) {
                                        zzarw.zza("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzasbVar.zzb(bArrZza);
                                    zzasmVar.close();
                                    throw th;
                                }
                            }
                            byteArray = zzasmVar.toByteArray();
                            try {
                                inputStreamZzd.close();
                            } catch (IOException unused2) {
                                zzarw.zza("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzasbVar.zzb(bArrZza);
                            zzasmVar.close();
                        } catch (Throwable th2) {
                            th = th2;
                            bArrZza = null;
                        }
                    } else {
                        byteArray = new byte[0];
                    }
                    byte[] bArr2 = byteArray;
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (zzarw.zzb || jElapsedRealtime3 > m.D0) {
                            zzarw.zzb("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", zzarkVar, Long.valueOf(jElapsedRealtime3), bArr2 != null ? Integer.valueOf(bArr2.length) : AbstractJsonLexerKt.NULL, Integer.valueOf(iZza), Integer.valueOf(zzarkVar.zzy().zzb()));
                        }
                        if (iZza < 200 || iZza > 299) {
                            throw new IOException();
                        }
                        return new zzarg(iZza, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzb);
                    } catch (IOException e2) {
                        e = e2;
                        zzasiVar = zzasiVarZza;
                        bArr = bArr2;
                    }
                } catch (IOException e3) {
                    e = e3;
                    zzasiVar = zzasiVarZza;
                    bArr = null;
                }
            } catch (IOException e4) {
                e = e4;
                zzasiVar = null;
            }
            if (e instanceof SocketTimeoutException) {
                zzarfVar = new zzars();
                str = "socket";
            } else {
                if (e instanceof MalformedURLException) {
                    throw new RuntimeException("Bad URL ".concat(String.valueOf(zzarkVar.zzh())), e);
                }
                if (zzasiVar == null) {
                    throw new zzarh(e);
                }
                int iZza2 = zzasiVar.zza();
                zzarw.zzc("Unexpected response code %d for %s", Integer.valueOf(iZza2), zzarkVar.zzh());
                if (bArr != null) {
                    zzarg zzargVar = new zzarg(iZza2, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzasiVar.zzb());
                    if (iZza2 != 401 && iZza2 != 403) {
                        if (iZza2 < 400 || iZza2 > 499) {
                            throw new zzarr(zzargVar);
                        }
                        throw new zzaqx(zzargVar);
                    }
                    zzarfVar = new zzaqs(zzargVar);
                    str = "auth";
                } else {
                    zzarfVar = new zzarf();
                    str = "network";
                }
            }
            zzaqy zzaqyVarZzy = zzarkVar.zzy();
            int iZzo = zzarkVar.zzo();
            try {
                zzaqyVarZzy.zzc(zzarfVar);
                zzarkVar.zzc(str + "-retry [timeout=" + iZzo + d9.i.f24752e);
            } catch (zzart e5) {
                zzarkVar.zzc(str + "-timeout-giveup [timeout=" + iZzo + d9.i.f24752e);
                throw e5;
            }
        }
    }
}
