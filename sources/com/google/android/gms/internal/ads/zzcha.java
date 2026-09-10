package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcha extends zzcgx {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcha(zzcfk zzcfkVar) {
        super(zzcfkVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfwj.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfwj.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0456  */
    /* JADX WARN: Code duplicated, block: B:176:0x0468  */
    /* JADX WARN: Code duplicated, block: B:177:0x0483  */
    /* JADX WARN: Code duplicated, block: B:180:0x04a3  */
    @Override // com.google.android.gms.internal.ads.zzcgx
    public final boolean zze(final String str) {
        int i2;
        File file;
        String str2;
        String str3;
        String string;
        FileOutputStream fileOutputStream;
        String string2;
        int i3;
        ByteBuffer byteBuffer;
        int responseCode;
        boolean zDelete;
        String str4 = "Preloaded ";
        if (this.zzg == null) {
            zzq(str, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file2 = this.zzg;
            if (file2 == null) {
                i2 = 0;
            } else {
                File[] fileArrListFiles = file2.listFiles();
                int length = fileArrListFiles.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = length;
                    int i7 = i4;
                    if (!fileArrListFiles[i4].getName().endsWith(".done")) {
                        i5++;
                    }
                    i4 = i7 + 1;
                    length = i6;
                }
                i2 = i5;
            }
            String str5 = str4;
            if (i2 > ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzu)).intValue()) {
                File file3 = this.zzg;
                if (file3 != null) {
                    File[] fileArrListFiles2 = file3.listFiles();
                    int length2 = fileArrListFiles2.length;
                    int i8 = 0;
                    long j = Long.MAX_VALUE;
                    File file4 = null;
                    while (i8 < length2) {
                        File file5 = fileArrListFiles2[i8];
                        int i9 = length2;
                        int i10 = i8;
                        if (!file5.getName().endsWith(".done")) {
                            long jLastModified = file5.lastModified();
                            if (jLastModified < j) {
                                file4 = file5;
                                j = jLastModified;
                            }
                        }
                        i8 = i10 + 1;
                        length2 = i9;
                    }
                    if (file4 != null) {
                        boolean zDelete2 = file4.delete();
                        File fileZza = zza(file4);
                        zDelete = fileZza.isFile() ? fileZza.delete() & zDelete2 : zDelete2;
                    } else {
                        zDelete = false;
                    }
                    if (zDelete) {
                        str4 = str5;
                    }
                }
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to expire stream cache");
                zzq(str, null, "expireFailed", null);
                return false;
            }
            File file6 = new File(zzfwj.zza().zza(this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
            File fileZza2 = zza(file6);
            if (file6.isFile() && fileZza2.isFile()) {
                int length3 = (int) file6.length();
                String strValueOf = String.valueOf(str);
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Stream cache hit at ".concat(strValueOf));
                zzo(str, file6.getAbsolutePath(), length3);
                return true;
            }
            String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
            String strValueOf3 = String.valueOf(str);
            Set set = zze;
            String strConcat = strValueOf2.concat(strValueOf3);
            synchronized (set) {
                try {
                    if (set.contains(strConcat)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
                        sb.append("Stream cache already in progress at ");
                        sb.append(str);
                        String string3 = sb.toString();
                        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(string3);
                        zzq(str, file6.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(strConcat);
                    try {
                        str2 = "error";
                        try {
                            try {
                                HttpURLConnection httpURLConnectionZzh = zzfwv.zza().zzh(new zzfwx() { // from class: com.google.android.gms.internal.ads.zzcgz
                                    @Override // com.google.android.gms.internal.ads.zzfwx
                                    public final /* synthetic */ URLConnection zza() throws IOException {
                                        int i14 = zzcha.zzd;
                                        com.google.android.gms.ads.internal.zzt.zzq();
                                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzah)).intValue();
                                        URL url = new URL(str);
                                        int i15 = 0;
                                        while (true) {
                                            i15++;
                                            if (i15 > 20) {
                                                throw new IOException("Too many redirects (20)");
                                            }
                                            URLConnection uRLConnectionOpenConnection = url.openConnection();
                                            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                                throw new IOException("Invalid protocol.");
                                            }
                                            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                            com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                            zzlVar.zza(httpURLConnection, null);
                                            httpURLConnection.setInstanceFollowRedirects(false);
                                            int responseCode2 = httpURLConnection.getResponseCode();
                                            zzlVar.zzc(httpURLConnection, responseCode2);
                                            if (responseCode2 / 100 != 3) {
                                                return httpURLConnection;
                                            }
                                            String headerField = httpURLConnection.getHeaderField("Location");
                                            if (headerField == null) {
                                                throw new IOException("Missing Location header in redirect");
                                            }
                                            URL url2 = new URL(url, headerField);
                                            String protocol = url2.getProtocol();
                                            if (protocol == null) {
                                                throw new IOException("Protocol is null");
                                            }
                                            if (!protocol.equals("http") && !protocol.equals(HttpRequest.DEFAULT_SCHEME)) {
                                                throw new IOException("Unsupported scheme: ".concat(protocol));
                                            }
                                            String strConcat2 = "Redirecting to ".concat(headerField);
                                            int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzd(strConcat2);
                                            httpURLConnection.disconnect();
                                            url = url2;
                                        }
                                    }
                                }, 265, -1);
                                if (httpURLConnectionZzh != null && (responseCode = httpURLConnectionZzh.getResponseCode()) >= 400) {
                                    str3 = "badUrl";
                                    try {
                                        String string4 = Integer.toString(responseCode);
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(string4).length() + 27);
                                        sb2.append("HTTP request failed. Code: ");
                                        sb2.append(string4);
                                        string = sb2.toString();
                                        try {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(responseCode).length() + 21 + String.valueOf(str).length());
                                            sb3.append("HTTP status code ");
                                            sb3.append(responseCode);
                                            sb3.append(" at ");
                                            sb3.append(str);
                                            throw new IOException(sb3.toString());
                                        } catch (IOException | RuntimeException e2) {
                                            e = e2;
                                            file = file6;
                                            fileOutputStream = null;
                                            if (e instanceof RuntimeException) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                            }
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException | NullPointerException unused) {
                                            }
                                            if (this.zzh) {
                                                String strS = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 26), "Preload aborted for URL \"", str, "\"");
                                                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzh(strS);
                                            } else {
                                                String strS2 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 25), "Preload failed for URL \"", str, "\"");
                                                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzj(strS2, e);
                                            }
                                            if (file.exists()) {
                                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                            }
                                            zzq(str, file.getAbsolutePath(), str3, string);
                                            zze.remove(strConcat);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e3) {
                                        e = e3;
                                        file = file6;
                                        string = null;
                                        fileOutputStream = null;
                                        if (e instanceof RuntimeException) {
                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                        }
                                        fileOutputStream.close();
                                        if (this.zzh) {
                                            String strS3 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 26), "Preload aborted for URL \"", str, "\"");
                                            int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzh(strS3);
                                        } else {
                                            String strS4 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 25), "Preload failed for URL \"", str, "\"");
                                            int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzj(strS4, e);
                                        }
                                        if (file.exists()) {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                        }
                                        zzq(str, file.getAbsolutePath(), str3, string);
                                        zze.remove(strConcat);
                                        return false;
                                    }
                                }
                                int contentLength = httpURLConnectionZzh.getContentLength();
                                if (contentLength < 0) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 55);
                                    sb4.append("Stream cache aborted, missing content-length header at ");
                                    sb4.append(str);
                                    String string5 = sb4.toString();
                                    int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string5);
                                    zzq(str, file6.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat);
                                    return false;
                                }
                                DecimalFormat decimalFormat = zzf;
                                String str6 = decimalFormat.format(contentLength);
                                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzv)).intValue();
                                str3 = "File too big for full file cache. Size: ";
                                if (contentLength > iIntValue) {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str6).length() + 33 + String.valueOf(str).length());
                                    sb5.append("Content length ");
                                    sb5.append(str6);
                                    sb5.append(" exceeds limit at ");
                                    sb5.append(str);
                                    String string6 = sb5.toString();
                                    int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string6);
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(str6).length() + 40);
                                    sb6.append("File too big for full file cache. Size: ");
                                    sb6.append(str6);
                                    zzq(str, file6.getAbsolutePath(), "sizeExceeded", sb6.toString());
                                    set.remove(strConcat);
                                    return false;
                                }
                                StringBuilder sb7 = new StringBuilder(String.valueOf(str6).length() + 20 + String.valueOf(str).length());
                                sb7.append("Caching ");
                                sb7.append(str6);
                                sb7.append(" bytes from ");
                                sb7.append(str);
                                String string7 = sb7.toString();
                                int i20 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzd(string7);
                                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionZzh.getInputStream());
                                file = file6;
                                try {
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        try {
                                            FileChannel channel = fileOutputStream.getChannel();
                                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                            Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
                                            long jCurrentTimeMillis = clockZzk.currentTimeMillis();
                                            com.google.android.gms.ads.internal.util.zzbu zzbuVar = new com.google.android.gms.ads.internal.util.zzbu(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzag)).longValue());
                                            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzaf)).longValue();
                                            int i21 = 0;
                                            while (true) {
                                                int i22 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                                if (i22 < 0) {
                                                    fileOutputStream.close();
                                                    if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
                                                        String str7 = decimalFormat.format(i21);
                                                        StringBuilder sb8 = new StringBuilder(String.valueOf(str7).length() + 22 + String.valueOf(str).length());
                                                        sb8.append(str5);
                                                        sb8.append(str7);
                                                        sb8.append(" bytes from ");
                                                        sb8.append(str);
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb8.toString());
                                                    }
                                                    file.setReadable(true, false);
                                                    if (fileZza2.isFile()) {
                                                        fileZza2.setLastModified(System.currentTimeMillis());
                                                    } else {
                                                        try {
                                                            fileZza2.createNewFile();
                                                        } catch (IOException unused2) {
                                                        }
                                                    }
                                                    zzo(str, file.getAbsolutePath(), i21);
                                                    zze.remove(strConcat);
                                                    return true;
                                                }
                                                i21 += i22;
                                                if (i21 > iIntValue) {
                                                    try {
                                                        String string8 = Integer.toString(i21);
                                                        StringBuilder sb9 = new StringBuilder(String.valueOf(string8).length() + 40);
                                                        sb9.append("File too big for full file cache. Size: ");
                                                        sb9.append(string8);
                                                        string2 = sb9.toString();
                                                        try {
                                                            throw new IOException("stream cache file size limit exceeded");
                                                        } catch (IOException | RuntimeException e4) {
                                                            e = e4;
                                                            str3 = "sizeExceeded";
                                                            string = string2;
                                                            fileOutputStream = fileOutputStream;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.zzh) {
                                                                String strS5 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 26), "Preload aborted for URL \"", str, "\"");
                                                                int i110 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzh(strS5);
                                                            } else {
                                                                String strS6 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 25), "Preload failed for URL \"", str, "\"");
                                                                int i111 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzj(strS6, e);
                                                            }
                                                            if (file.exists()) {
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                            }
                                                            zzq(str, file.getAbsolutePath(), str3, string);
                                                            zze.remove(strConcat);
                                                            return false;
                                                        }
                                                    } catch (IOException | RuntimeException e5) {
                                                        e = e5;
                                                        str3 = "sizeExceeded";
                                                        string = null;
                                                        if (e instanceof RuntimeException) {
                                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.zzh) {
                                                            String strS7 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 26), "Preload aborted for URL \"", str, "\"");
                                                            int i112 = com.google.android.gms.ads.internal.util.zze.zza;
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzh(strS7);
                                                        } else {
                                                            String strS8 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 25), "Preload failed for URL \"", str, "\"");
                                                            int i113 = com.google.android.gms.ads.internal.util.zze.zza;
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzj(strS8, e);
                                                        }
                                                        if (file.exists()) {
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                        }
                                                        zzq(str, file.getAbsolutePath(), str3, string);
                                                        zze.remove(strConcat);
                                                        return false;
                                                    }
                                                }
                                                byteBufferAllocate.flip();
                                                while (channel.write(byteBufferAllocate) > 0) {
                                                }
                                                byteBufferAllocate.clear();
                                                try {
                                                    if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                                        str3 = "downloadTimeout";
                                                        String string9 = Long.toString(jLongValue);
                                                        StringBuilder sb10 = new StringBuilder(String.valueOf(string9).length() + 29);
                                                        sb10.append("Timeout exceeded. Limit: ");
                                                        sb10.append(string9);
                                                        sb10.append(" sec");
                                                        string2 = sb10.toString();
                                                        try {
                                                            throw new IOException("stream cache time limit exceeded");
                                                        } catch (IOException e6) {
                                                            e = e6;
                                                            string = string2;
                                                            fileOutputStream = fileOutputStream;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.zzh) {
                                                                String strS9 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 26), "Preload aborted for URL \"", str, "\"");
                                                                int i114 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzh(strS9);
                                                            } else {
                                                                String strS10 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 25), "Preload failed for URL \"", str, "\"");
                                                                int i115 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzj(strS10, e);
                                                            }
                                                            if (file.exists()) {
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                            }
                                                            zzq(str, file.getAbsolutePath(), str3, string);
                                                            zze.remove(strConcat);
                                                            return false;
                                                        } catch (RuntimeException e7) {
                                                            e = e7;
                                                            string = string2;
                                                            fileOutputStream = fileOutputStream;
                                                            if (e instanceof RuntimeException) {
                                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                            }
                                                            fileOutputStream.close();
                                                            if (this.zzh) {
                                                                String strS11 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 26), "Preload aborted for URL \"", str, "\"");
                                                                int i116 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzh(strS11);
                                                            } else {
                                                                String strS12 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 25), "Preload failed for URL \"", str, "\"");
                                                                int i117 = com.google.android.gms.ads.internal.util.zze.zza;
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzj(strS12, e);
                                                            }
                                                            if (file.exists()) {
                                                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                            }
                                                            zzq(str, file.getAbsolutePath(), str3, string);
                                                            zze.remove(strConcat);
                                                            return false;
                                                        }
                                                    }
                                                    if (this.zzh) {
                                                        throw new IOException("abort requested");
                                                    }
                                                    if (zzbuVar.zza()) {
                                                        byteBuffer = byteBufferAllocate;
                                                        i3 = contentLength;
                                                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcgr(this, str, file.getAbsolutePath(), i21, i3, false));
                                                    } else {
                                                        i3 = contentLength;
                                                        byteBuffer = byteBufferAllocate;
                                                    }
                                                    contentLength = i3;
                                                    zzbuVar = zzbuVar;
                                                    byteBufferAllocate = byteBuffer;
                                                    readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                } catch (IOException e8) {
                                                    e = e8;
                                                    string = null;
                                                    if (e instanceof RuntimeException) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.zzh) {
                                                        String strS13 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 26), "Preload aborted for URL \"", str, "\"");
                                                        int i118 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzh(strS13);
                                                    } else {
                                                        String strS14 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 25), "Preload failed for URL \"", str, "\"");
                                                        int i119 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzj(strS14, e);
                                                    }
                                                    if (file.exists()) {
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                    }
                                                    zzq(str, file.getAbsolutePath(), str3, string);
                                                    zze.remove(strConcat);
                                                    return false;
                                                } catch (RuntimeException e9) {
                                                    e = e9;
                                                    string = null;
                                                    if (e instanceof RuntimeException) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.zzh) {
                                                        String strS15 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 26), "Preload aborted for URL \"", str, "\"");
                                                        int i1110 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzh(strS15);
                                                    } else {
                                                        String strS16 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 25), "Preload failed for URL \"", str, "\"");
                                                        int i1111 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzj(strS16, e);
                                                    }
                                                    if (file.exists()) {
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                    }
                                                    zzq(str, file.getAbsolutePath(), str3, string);
                                                    zze.remove(strConcat);
                                                    return false;
                                                }
                                                if (e instanceof RuntimeException) {
                                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                }
                                                fileOutputStream.close();
                                                if (this.zzh) {
                                                    String strS17 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 26), "Preload aborted for URL \"", str, "\"");
                                                    int i1112 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzh(strS17);
                                                } else {
                                                    String strS18 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 25), "Preload failed for URL \"", str, "\"");
                                                    int i1113 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj(strS18, e);
                                                }
                                                if (file.exists() && !file.delete()) {
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                }
                                                zzq(str, file.getAbsolutePath(), str3, string);
                                                zze.remove(strConcat);
                                                return false;
                                                string = null;
                                                if (e instanceof RuntimeException) {
                                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                }
                                                fileOutputStream.close();
                                                if (this.zzh) {
                                                    String strS19 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 26), "Preload aborted for URL \"", str, "\"");
                                                    int i1114 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzh(strS19);
                                                } else {
                                                    String strS110 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(str).length() + 25), "Preload failed for URL \"", str, "\"");
                                                    int i1115 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj(strS110, e);
                                                }
                                                if (file.exists()) {
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                }
                                                zzq(str, file.getAbsolutePath(), str3, string);
                                                zze.remove(strConcat);
                                                return false;
                                            }
                                        } catch (RuntimeException e10) {
                                            e = e10;
                                            str3 = str2;
                                        }
                                    } catch (IOException e11) {
                                        e = e11;
                                        str3 = str2;
                                    }
                                } catch (IOException e12) {
                                    e = e12;
                                    str3 = str2;
                                    string = null;
                                    fileOutputStream = null;
                                } catch (RuntimeException e13) {
                                    e = e13;
                                    str3 = str2;
                                    string = null;
                                    fileOutputStream = null;
                                }
                            } catch (IOException | RuntimeException e14) {
                                e = e14;
                                file = file6;
                            }
                        } catch (IOException | RuntimeException e15) {
                            e = e15;
                            file = file6;
                        }
                    } catch (IOException | RuntimeException e16) {
                        e = e16;
                        file = file6;
                        str2 = "error";
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void zzl() {
        this.zzh = true;
    }
}
