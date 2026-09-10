package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f20 extends e20 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f14175f = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecimalFormat f14176g = new DecimalFormat("#,###");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f14177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14178e;

    /* JADX WARN: Code duplicated, block: B:154:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:158:0x04be  */
    /* JADX WARN: Code duplicated, block: B:159:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:162:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.google.android.gms.internal.ads.e20, com.google.android.gms.internal.ads.f20] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.e20
    public final boolean h(String str) {
        int i10;
        Object obj;
        Object obj2;
        String str2;
        Object obj3;
        String str3;
        String str4;
        String string;
        FileOutputStream fileOutputStream;
        ?? r11;
        ?? r10;
        ?? r3;
        Object obj4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        int i11;
        ?? r12;
        boolean zDelete;
        String str11 = str;
        String str12 = " at ";
        if (this.f14177d == null) {
            q(str11, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file = this.f14177d;
            if (file == null) {
                i10 = 0;
            } else {
                File[] fileArrListFiles = file.listFiles();
                int length = fileArrListFiles.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i12;
                    int i15 = length;
                    if (!fileArrListFiles[i12].getName().endsWith(".done")) {
                        i13++;
                    }
                    i12 = i14 + 1;
                    length = i15;
                }
                i10 = i13;
            }
            String str13 = str12;
            if (i10 > ((Integer) zzba.zzc().a(am.f12429y)).intValue()) {
                File file2 = this.f14177d;
                if (file2 == null) {
                    zDelete = false;
                } else {
                    File[] fileArrListFiles2 = file2.listFiles();
                    int length2 = fileArrListFiles2.length;
                    int i16 = 0;
                    long j10 = Long.MAX_VALUE;
                    File file3 = null;
                    while (i16 < length2) {
                        File file4 = fileArrListFiles2[i16];
                        int i17 = length2;
                        int i18 = i16;
                        if (!file4.getName().endsWith(".done")) {
                            long jLastModified = file4.lastModified();
                            if (jLastModified < j10) {
                                j10 = jLastModified;
                                file3 = file4;
                            }
                        }
                        i16 = i18 + 1;
                        length2 = i17;
                    }
                    if (file3 != null) {
                        zDelete = file3.delete();
                        File fileS = s(file3);
                        if (fileS.isFile()) {
                            zDelete = fileS.delete() & zDelete;
                        }
                    } else {
                        zDelete = false;
                    }
                }
                if (!zDelete) {
                    int i19 = zze.zza;
                    zzo.zzi("Unable to expire stream cache");
                    q(str11, null, "expireFailed", null);
                    return false;
                }
                str12 = str13;
            } else {
                File file5 = new File(new File(this.f14177d, zzf.zzg(str11)).getPath());
                File fileS2 = s(file5);
                if (file5.isFile() && fileS2.isFile()) {
                    int length3 = (int) file5.length();
                    String strValueOf = String.valueOf(str11);
                    int i20 = zze.zza;
                    zzo.zzd("Stream cache hit at ".concat(strValueOf));
                    zzf.zza.post(new c20((e20) this, str11, file5.getAbsolutePath(), length3));
                    return true;
                }
                String strValueOf2 = String.valueOf(this.f14177d.getAbsolutePath());
                String strValueOf3 = String.valueOf(str11);
                Set set = f14175f;
                String strConcat = strValueOf2.concat(strValueOf3);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str11).length() + 36);
                            sb2.append("Stream cache already in progress at ");
                            sb2.append(str11);
                            String string2 = sb2.toString();
                            int i21 = zze.zza;
                            zzo.zzi(string2);
                            q(str11, file5.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        try {
                            Object obj5 = "error";
                            try {
                                tt0 tt0Var = tt0.f20494d;
                                x01 x01Var = new x01();
                                x01Var.f21663a = tt0Var;
                                x01Var.f21664b = null;
                                HttpURLConnection httpURLConnectionA = x01Var.a(new xf1(str11, 4));
                                int responseCode = httpURLConnectionA.getResponseCode();
                                if (responseCode >= 400) {
                                    String str14 = strConcat;
                                    String str15 = str11;
                                    try {
                                        String string3 = Integer.toString(responseCode);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(string3).length() + 27);
                                        sb3.append("HTTP request failed. Code: ");
                                        sb3.append(string3);
                                        string = sb3.toString();
                                        try {
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(responseCode).length() + 21 + String.valueOf(str15).length());
                                            sb4.append("HTTP status code ");
                                            sb4.append(responseCode);
                                            sb4.append(str13);
                                            sb4.append(str15);
                                            throw new IOException(sb4.toString());
                                        } catch (IOException | RuntimeException e10) {
                                            e = e10;
                                            obj4 = "badUrl";
                                            str6 = str15;
                                            str5 = str14;
                                            fileOutputStream = null;
                                            r3 = str6;
                                            r10 = str5;
                                            r11 = obj4;
                                            if (e instanceof RuntimeException) {
                                                zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                            }
                                            fileOutputStream.close();
                                            if (this.f14178e) {
                                                String strJ = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 26), "Preload aborted for URL \"", r3, "\"");
                                                int i22 = zze.zza;
                                                zzo.zzh(strJ);
                                            } else {
                                                String strJ2 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 25), "Preload failed for URL \"", r3, "\"");
                                                int i23 = zze.zza;
                                                zzo.zzj(strJ2, e);
                                            }
                                            if (file5.exists()) {
                                                zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                            }
                                            q(r3, file5.getAbsolutePath(), r11, string);
                                            f14175f.remove(r10);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e11) {
                                        e = e11;
                                        obj3 = "badUrl";
                                        str4 = str15;
                                        str3 = str14;
                                        string = null;
                                        str6 = str4;
                                        str5 = str3;
                                        obj4 = obj3;
                                        fileOutputStream = null;
                                        r3 = str6;
                                        r10 = str5;
                                        r11 = obj4;
                                        if (e instanceof RuntimeException) {
                                            zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                        }
                                        fileOutputStream.close();
                                        if (this.f14178e) {
                                            String strJ3 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 26), "Preload aborted for URL \"", r3, "\"");
                                            int i24 = zze.zza;
                                            zzo.zzh(strJ3);
                                        } else {
                                            String strJ4 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 25), "Preload failed for URL \"", r3, "\"");
                                            int i25 = zze.zza;
                                            zzo.zzj(strJ4, e);
                                        }
                                        if (file5.exists()) {
                                            zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                        }
                                        q(r3, file5.getAbsolutePath(), r11, string);
                                        f14175f.remove(r10);
                                        return false;
                                    }
                                }
                                try {
                                    int contentLength = httpURLConnectionA.getContentLength();
                                    if (contentLength < 0) {
                                        StringBuilder sb5 = new StringBuilder(String.valueOf(str11).length() + 55);
                                        sb5.append("Stream cache aborted, missing content-length header at ");
                                        sb5.append(str11);
                                        String string4 = sb5.toString();
                                        int i26 = zze.zza;
                                        zzo.zzi(string4);
                                        q(str11, file5.getAbsolutePath(), "contentLengthMissing", null);
                                        set.remove(strConcat);
                                        return false;
                                    }
                                    DecimalFormat decimalFormat = f14176g;
                                    String str16 = decimalFormat.format(contentLength);
                                    int iIntValue = ((Integer) zzba.zzc().a(am.f12445z)).intValue();
                                    if (contentLength > iIntValue) {
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(str16).length() + 33 + String.valueOf(str11).length());
                                        sb6.append("Content length ");
                                        sb6.append(str16);
                                        sb6.append(" exceeds limit at ");
                                        sb6.append(str11);
                                        String string5 = sb6.toString();
                                        int i27 = zze.zza;
                                        zzo.zzi(string5);
                                        StringBuilder sb7 = new StringBuilder(String.valueOf(str16).length() + 40);
                                        sb7.append("File too big for full file cache. Size: ");
                                        sb7.append(str16);
                                        q(str11, file5.getAbsolutePath(), "sizeExceeded", sb7.toString());
                                        set.remove(strConcat);
                                        return false;
                                    }
                                    StringBuilder sb8 = new StringBuilder(String.valueOf(str16).length() + 20 + String.valueOf(str11).length());
                                    sb8.append("Caching ");
                                    sb8.append(str16);
                                    sb8.append(" bytes from ");
                                    sb8.append(str11);
                                    String string6 = sb8.toString();
                                    int i28 = zze.zza;
                                    zzo.zzd(string6);
                                    ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionA.getInputStream());
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file5);
                                    try {
                                        FileChannel channel = fileOutputStream2.getChannel();
                                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                                        ((p9.b) zzt.zzk()).getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis();
                                        String str17 = "File too big for full file cache. Size: ";
                                        String str18 = strConcat;
                                        try {
                                            zzbu zzbuVar = new zzbu(((Long) zzba.zzc().a(am.r0)).longValue());
                                            long jLongValue = ((Long) zzba.zzc().a(am.f12309q0)).longValue();
                                            ?? r2 = 0;
                                            String str19 = str18;
                                            int i29 = contentLength;
                                            while (true) {
                                                int i30 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                                if (i30 < 0) {
                                                    str10 = str;
                                                    str7 = str19;
                                                    fileOutputStream = fileOutputStream2;
                                                    fileOutputStream.close();
                                                    if (zzo.zzm(3)) {
                                                        String str20 = decimalFormat.format((long) r2);
                                                        StringBuilder sb9 = new StringBuilder(String.valueOf(str20).length() + 22 + String.valueOf(str10).length());
                                                        sb9.append("Preloaded ");
                                                        sb9.append(str20);
                                                        sb9.append(" bytes from ");
                                                        sb9.append(str10);
                                                        zzo.zzd(sb9.toString());
                                                    }
                                                    file5.setReadable(true, false);
                                                    if (fileS2.isFile()) {
                                                        fileS2.setLastModified(System.currentTimeMillis());
                                                    } else {
                                                        try {
                                                            fileS2.createNewFile();
                                                        } catch (IOException unused) {
                                                        }
                                                    }
                                                    zzf.zza.post(new c20((e20) this, str10, file5.getAbsolutePath(), (int) r2));
                                                    f14175f.remove(str7);
                                                    return true;
                                                }
                                                ?? r13 = r2 + i30;
                                                try {
                                                    try {
                                                        if (r13 > iIntValue) {
                                                            String str21 = str17;
                                                            String string7 = Integer.toString(r13);
                                                            StringBuilder sb10 = new StringBuilder(String.valueOf(string7).length() + 40);
                                                            sb10.append(str21);
                                                            sb10.append(string7);
                                                            sb10.toString();
                                                            throw new IOException("stream cache file size limit exceeded");
                                                        }
                                                        byteBufferAllocate.flip();
                                                        str18 = str19;
                                                        int i31 = i29;
                                                        while (channel.write(byteBufferAllocate) > 0) {
                                                            i31 = i31 == true ? 1 : 0;
                                                            str18 = str18;
                                                            fileOutputStream2 = fileOutputStream2;
                                                        }
                                                        byteBufferAllocate.clear();
                                                        if (System.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                                            String string8 = Long.toString(jLongValue);
                                                            StringBuilder sb11 = new StringBuilder(String.valueOf(string8).length() + 29);
                                                            sb11.append("Timeout exceeded. Limit: ");
                                                            sb11.append(string8);
                                                            sb11.append(" sec");
                                                            sb11.toString();
                                                            throw new IOException("stream cache time limit exceeded");
                                                        }
                                                        if (this.f14178e) {
                                                            throw new IOException("abort requested");
                                                        }
                                                        if (zzbuVar.zza()) {
                                                            String absolutePath = file5.getAbsolutePath();
                                                            Handler handler = zzf.zza;
                                                            int i32 = i31;
                                                            str7 = str18;
                                                            i11 = i32 == true ? 1 : 0;
                                                            fileOutputStream = fileOutputStream2;
                                                            r12 = r13;
                                                            str11 = str;
                                                            try {
                                                                z10 z10Var = new z10(this, str11, absolutePath, r12 == true ? 1 : 0, i11 == true ? 1 : 0);
                                                                str10 = str11;
                                                                try {
                                                                    handler.post(z10Var);
                                                                } catch (IOException | RuntimeException e12) {
                                                                    e = e12;
                                                                    str8 = str10;
                                                                    str9 = str7;
                                                                }
                                                            } catch (IOException | RuntimeException e13) {
                                                                e = e13;
                                                                str8 = str11;
                                                                str9 = str7;
                                                                r10 = str9;
                                                                r11 = obj5;
                                                                fileOutputStream = fileOutputStream;
                                                                string = null;
                                                                r3 = str8;
                                                                if (e instanceof RuntimeException) {
                                                                    zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                                                }
                                                                fileOutputStream.close();
                                                                if (this.f14178e) {
                                                                    String strJ5 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 26), "Preload aborted for URL \"", r3, "\"");
                                                                    int i210 = zze.zza;
                                                                    zzo.zzh(strJ5);
                                                                } else {
                                                                    String strJ6 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 25), "Preload failed for URL \"", r3, "\"");
                                                                    int i211 = zze.zza;
                                                                    zzo.zzj(strJ6, e);
                                                                }
                                                                if (file5.exists()) {
                                                                    zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                                                }
                                                                q(r3, file5.getAbsolutePath(), r11, string);
                                                                f14175f.remove(r10);
                                                                return false;
                                                            }
                                                        } else {
                                                            int i33 = i31;
                                                            str7 = str18;
                                                            i11 = i33 == true ? 1 : 0;
                                                            fileOutputStream = fileOutputStream2;
                                                            r12 = r13;
                                                        }
                                                        String str22 = str7;
                                                        i29 = i11;
                                                        str19 = str22;
                                                        r2 = r12;
                                                        byteBufferAllocate = byteBufferAllocate;
                                                        readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                        zzbuVar = zzbuVar;
                                                        fileOutputStream2 = fileOutputStream;
                                                        str17 = str17;
                                                        iIntValue = iIntValue;
                                                    } catch (IOException | RuntimeException e14) {
                                                        e = e14;
                                                        string = null;
                                                        r11 = r13;
                                                        r3 = i30;
                                                        r10 = i29;
                                                        if (e instanceof RuntimeException) {
                                                            zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.f14178e) {
                                                            String strJ7 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 26), "Preload aborted for URL \"", r3, "\"");
                                                            int i212 = zze.zza;
                                                            zzo.zzh(strJ7);
                                                        } else {
                                                            String strJ8 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 25), "Preload failed for URL \"", r3, "\"");
                                                            int i213 = zze.zza;
                                                            zzo.zzj(strJ8, e);
                                                        }
                                                        if (file5.exists()) {
                                                            zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                                        }
                                                        q(r3, file5.getAbsolutePath(), r11, string);
                                                        f14175f.remove(r10);
                                                        return false;
                                                    }
                                                } catch (IOException | RuntimeException e15) {
                                                    e = e15;
                                                    string = " sec";
                                                    r11 = r13;
                                                    r3 = i30;
                                                    r10 = i29;
                                                    if (e instanceof RuntimeException) {
                                                        zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.f14178e) {
                                                        String strJ9 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 26), "Preload aborted for URL \"", r3, "\"");
                                                        int i214 = zze.zza;
                                                        zzo.zzh(strJ9);
                                                    } else {
                                                        String strJ10 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 25), "Preload failed for URL \"", r3, "\"");
                                                        int i215 = zze.zza;
                                                        zzo.zzj(strJ10, e);
                                                    }
                                                    if (file5.exists()) {
                                                        zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                                    }
                                                    q(r3, file5.getAbsolutePath(), r11, string);
                                                    f14175f.remove(r10);
                                                    return false;
                                                }
                                                e = e12;
                                                str8 = str10;
                                                str9 = str7;
                                                r10 = str9;
                                                r11 = obj5;
                                                fileOutputStream = fileOutputStream;
                                                string = null;
                                                r3 = str8;
                                            }
                                        } catch (IOException | RuntimeException e16) {
                                            e = e16;
                                            str8 = str;
                                            str9 = str18;
                                            fileOutputStream = fileOutputStream2;
                                        }
                                    } catch (IOException | RuntimeException e17) {
                                        e = e17;
                                        str7 = strConcat;
                                        fileOutputStream = fileOutputStream2;
                                    }
                                } catch (IOException | RuntimeException e18) {
                                    e = e18;
                                    str2 = strConcat;
                                    obj2 = obj5;
                                    obj3 = obj2;
                                    str4 = str11;
                                    str3 = str2;
                                    string = null;
                                    str6 = str4;
                                    str5 = str3;
                                    obj4 = obj3;
                                    fileOutputStream = null;
                                    r3 = str6;
                                    r10 = str5;
                                    r11 = obj4;
                                }
                                if (e instanceof RuntimeException) {
                                    zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                }
                                try {
                                    fileOutputStream.close();
                                } catch (IOException | NullPointerException unused2) {
                                }
                                if (this.f14178e) {
                                    String strJ11 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 26), "Preload aborted for URL \"", r3, "\"");
                                    int i216 = zze.zza;
                                    zzo.zzh(strJ11);
                                } else {
                                    String strJ12 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 25), "Preload failed for URL \"", r3, "\"");
                                    int i217 = zze.zza;
                                    zzo.zzj(strJ12, e);
                                }
                                if (file5.exists() && !file5.delete()) {
                                    zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                }
                                q(r3, file5.getAbsolutePath(), r11, string);
                                f14175f.remove(r10);
                                return false;
                            } catch (IOException | RuntimeException e19) {
                                e = e19;
                                obj = obj5;
                                str2 = strConcat;
                                obj2 = obj;
                                obj3 = obj2;
                                str4 = str11;
                                str3 = str2;
                                string = null;
                                str6 = str4;
                                str5 = str3;
                                obj4 = obj3;
                                fileOutputStream = null;
                                r3 = str6;
                                r10 = str5;
                                r11 = obj4;
                                if (e instanceof RuntimeException) {
                                    zzt.zzh().d("VideoStreamFullFileCache.preload", e);
                                }
                                fileOutputStream.close();
                                if (this.f14178e) {
                                    String strJ13 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 26), "Preload aborted for URL \"", r3, "\"");
                                    int i218 = zze.zza;
                                    zzo.zzh(strJ13);
                                } else {
                                    String strJ14 = q4.a.j(new StringBuilder(String.valueOf((Object) r3).length() + 25), "Preload failed for URL \"", r3, "\"");
                                    int i219 = zze.zza;
                                    zzo.zzj(strJ14, e);
                                }
                                if (file5.exists()) {
                                    zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file5.getAbsolutePath())));
                                }
                                q(r3, file5.getAbsolutePath(), r11, string);
                                f14175f.remove(r10);
                                return false;
                            }
                        } catch (IOException | RuntimeException e20) {
                            e = e20;
                            obj = "error";
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void p() {
        this.f14178e = true;
    }

    public final File s(File file) {
        return new File(new File(this.f14177d, String.valueOf(file.getName()).concat(".done")).getPath());
    }
}
