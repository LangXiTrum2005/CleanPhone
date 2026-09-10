package com.google.android.gms.internal.ads;

import androidx.webkit.ProxyConfig;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.google.android.gms.common.util.Clock;
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

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdh extends zzcde {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcdh(zzcbs zzcbsVar) {
        super(zzcbsVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfpv.zza(zzfpu.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        } else {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.zzg.getAbsolutePath())));
            this.zzg = null;
        }
    }

    private final File zza(File file) {
        return new File(zzfpv.zza(zzfpu.zza(), this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:171:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:174:0x0416  */
    /* JADX WARN: Instruction removed from duplicated block: B:170:0x03e3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:171:0x03fa, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(final String str) {
        int i;
        String str2;
        String str3;
        FileOutputStream fileOutputStream;
        String str4;
        String str5;
        int responseCode;
        String str6;
        boolean zDelete;
        FileOutputStream fileOutputStream2 = null;
        if (this.zzg == null) {
            zzg(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.zzg;
            if (file == null) {
                i = 0;
            } else {
                i = 0;
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            if (i <= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzq)).intValue()) {
                File file3 = new File(zzfpv.zza(zzfpu.zza(), this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
                File fileZza = zza(file3);
                if (file3.isFile() && fileZza.isFile()) {
                    int length = (int) file3.length();
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Stream cache hit at ".concat(String.valueOf(str)));
                    zzh(str, file3.getAbsolutePath(), length);
                    return true;
                }
                String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
                String strValueOf2 = String.valueOf(str);
                Set set = zze;
                String strConcat = strValueOf.concat(strValueOf2);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache already in progress at " + str);
                            zzg(str, file3.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        String str7 = "error";
                        try {
                            HttpURLConnection httpURLConnectionZzn = zzfqf.zza().zzn(new zzfqq() { // from class: com.google.android.gms.internal.ads.zzcdg
                                @Override // com.google.android.gms.internal.ads.zzfqq
                                public final URLConnection zza() throws IOException {
                                    int i2 = zzcdh.zzd;
                                    com.google.android.gms.ads.internal.zzv.zzx();
                                    int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzM)).intValue();
                                    URL url = new URL(str);
                                    int i3 = 0;
                                    while (true) {
                                        i3++;
                                        if (i3 > 20) {
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
                                        zzlVar.zzc(httpURLConnection, null);
                                        httpURLConnection.setInstanceFollowRedirects(false);
                                        int responseCode2 = httpURLConnection.getResponseCode();
                                        zzlVar.zze(httpURLConnection, responseCode2);
                                        if (responseCode2 / 100 != 3) {
                                            return httpURLConnection;
                                        }
                                        String headerField = httpURLConnection.getHeaderField(HttpResponseHeader.Location);
                                        if (headerField == null) {
                                            throw new IOException("Missing Location header in redirect");
                                        }
                                        URL url2 = new URL(url, headerField);
                                        String protocol = url2.getProtocol();
                                        if (protocol == null) {
                                            throw new IOException("Protocol is null");
                                        }
                                        if (!protocol.equals(ProxyConfig.MATCH_HTTP) && !protocol.equals("https")) {
                                            throw new IOException("Unsupported scheme: ".concat(protocol));
                                        }
                                        com.google.android.gms.ads.internal.util.client.zzo.zze("Redirecting to ".concat(headerField));
                                        httpURLConnection.disconnect();
                                        url = url2;
                                    }
                                }
                            }, 265, -1);
                            if (!(httpURLConnectionZzn instanceof HttpURLConnection) || (responseCode = httpURLConnectionZzn.getResponseCode()) < 400) {
                                int contentLength = httpURLConnectionZzn.getContentLength();
                                if (contentLength < 0) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache aborted, missing content-length header at " + str);
                                    zzg(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat);
                                    return false;
                                }
                                String str8 = zzf.format(contentLength);
                                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzr)).intValue();
                                if (contentLength > iIntValue) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Content length " + str8 + " exceeds limit at " + str);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("File too big for full file cache. Size: ");
                                    sb.append(str8);
                                    zzg(str, file3.getAbsolutePath(), "sizeExceeded", sb.toString());
                                    set.remove(strConcat);
                                    return false;
                                }
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Caching " + str8 + " bytes from " + str);
                                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionZzn.getInputStream());
                                FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                                try {
                                    FileChannel channel = fileOutputStream3.getChannel();
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                    Clock clockZzC = com.google.android.gms.ads.internal.zzv.zzC();
                                    long jCurrentTimeMillis = clockZzC.currentTimeMillis();
                                    com.google.android.gms.ads.internal.util.zzbx zzbxVar = new com.google.android.gms.ads.internal.util.zzbx(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzL)).longValue());
                                    zzbcc zzbccVar = zzbcl.zzK;
                                    zzbcj zzbcjVarZzc = com.google.android.gms.ads.internal.client.zzbe.zzc();
                                    long jLongValue = ((Long) zzbcjVarZzc.zza(zzbccVar)).longValue();
                                    int i2 = 0;
                                    while (true) {
                                        int i3 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                        if (i3 >= 0) {
                                            i2 += i3;
                                            try {
                                                try {
                                                    if (i2 > iIntValue) {
                                                        String str9 = "File too big for full file cache. Size: " + Integer.toString(i2);
                                                        throw new IOException("stream cache file size limit exceeded");
                                                    }
                                                    try {
                                                        byteBufferAllocate.flip();
                                                        while (channel.write(byteBufferAllocate) > 0) {
                                                        }
                                                        byteBufferAllocate.clear();
                                                        if (clockZzC.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                                            String str10 = "Timeout exceeded. Limit: " + Long.toString(jLongValue) + " sec";
                                                            throw new IOException("stream cache time limit exceeded");
                                                        }
                                                        ByteBuffer byteBuffer = byteBufferAllocate;
                                                        if (this.zzh) {
                                                            throw new IOException("abort requested");
                                                        }
                                                        if (zzbxVar.zzb()) {
                                                            str4 = str7;
                                                            try {
                                                                str5 = strConcat;
                                                                fileOutputStream = fileOutputStream3;
                                                                try {
                                                                    try {
                                                                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzccy(this, str, file3.getAbsolutePath(), i2, contentLength, false));
                                                                    } catch (RuntimeException e) {
                                                                        e = e;
                                                                    }
                                                                } catch (IOException e2) {
                                                                    e = e2;
                                                                }
                                                            } catch (IOException e3) {
                                                                e = e3;
                                                                fileOutputStream = fileOutputStream3;
                                                                str5 = strConcat;
                                                                str2 = str5;
                                                                str7 = str4;
                                                                fileOutputStream2 = fileOutputStream;
                                                                str3 = 0;
                                                                if (e instanceof RuntimeException) {
                                                                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoStreamFullFileCache.preload");
                                                                }
                                                                fileOutputStream2.close();
                                                                if (this.zzh) {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + str + "\"");
                                                                } else {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                                                                }
                                                                if (file3.exists()) {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                                                }
                                                                zzg(str, file3.getAbsolutePath(), str7, str3);
                                                                zze.remove(str2);
                                                                return false;
                                                            } catch (RuntimeException e4) {
                                                                e = e4;
                                                                fileOutputStream = fileOutputStream3;
                                                                str5 = strConcat;
                                                                str2 = str5;
                                                                str7 = str4;
                                                                fileOutputStream2 = fileOutputStream;
                                                                str3 = 0;
                                                                if (e instanceof RuntimeException) {
                                                                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoStreamFullFileCache.preload");
                                                                }
                                                                fileOutputStream2.close();
                                                                if (this.zzh) {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + str + "\"");
                                                                } else {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                                                                }
                                                                if (file3.exists()) {
                                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                                                }
                                                                zzg(str, file3.getAbsolutePath(), str7, str3);
                                                                zze.remove(str2);
                                                                return false;
                                                            }
                                                        } else {
                                                            fileOutputStream = fileOutputStream3;
                                                            str5 = strConcat;
                                                            str4 = str7;
                                                        }
                                                        byteBufferAllocate = byteBuffer;
                                                        readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                        str7 = str4;
                                                        zzbxVar = zzbxVar;
                                                        strConcat = str5;
                                                        channel = channel;
                                                        fileOutputStream3 = fileOutputStream;
                                                        iIntValue = iIntValue;
                                                        contentLength = contentLength;
                                                    } catch (IOException e5) {
                                                        e = e5;
                                                        fileOutputStream = fileOutputStream3;
                                                        str5 = strConcat;
                                                        str4 = str7;
                                                    } catch (RuntimeException e6) {
                                                        e = e6;
                                                        fileOutputStream = fileOutputStream3;
                                                        str5 = strConcat;
                                                        str4 = str7;
                                                    }
                                                    str2 = str5;
                                                    str7 = str4;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str3 = 0;
                                                } catch (IOException | RuntimeException e7) {
                                                    e = e7;
                                                    str2 = str5;
                                                }
                                            } catch (IOException | RuntimeException e8) {
                                                e = e8;
                                                str3 = zzbcjVarZzc;
                                                str2 = str5;
                                                fileOutputStream2 = fileOutputStream;
                                            }
                                        } else {
                                            fileOutputStream = fileOutputStream3;
                                            str5 = strConcat;
                                            str4 = str7;
                                            fileOutputStream.close();
                                            if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
                                                com.google.android.gms.ads.internal.util.client.zzo.zze("Preloaded " + zzf.format(i2) + " bytes from " + str);
                                            }
                                            file3.setReadable(true, false);
                                            if (fileZza.isFile()) {
                                                fileZza.setLastModified(System.currentTimeMillis());
                                            } else {
                                                try {
                                                    fileZza.createNewFile();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            zzh(str, file3.getAbsolutePath(), i2);
                                            str2 = str5;
                                            try {
                                                zze.remove(str2);
                                                return true;
                                            } catch (IOException e9) {
                                                e = e9;
                                            } catch (RuntimeException e10) {
                                                e = e10;
                                            }
                                        }
                                    }
                                } catch (IOException | RuntimeException e11) {
                                    e = e11;
                                    fileOutputStream = fileOutputStream3;
                                    str2 = strConcat;
                                    str4 = str7;
                                }
                            } else {
                                str7 = "badUrl";
                                try {
                                    String str11 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                    try {
                                        throw new IOException("HTTP status code " + responseCode + " at " + str);
                                    } catch (IOException | RuntimeException e12) {
                                        e = e12;
                                        str6 = str11;
                                        str2 = strConcat;
                                        str3 = str6;
                                        if (e instanceof RuntimeException) {
                                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoStreamFullFileCache.preload");
                                        }
                                        fileOutputStream2.close();
                                        if (this.zzh) {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + str + "\"");
                                        } else {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                                        }
                                        if (file3.exists()) {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                                        }
                                        zzg(str, file3.getAbsolutePath(), str7, str3);
                                        zze.remove(str2);
                                        return false;
                                    }
                                } catch (IOException | RuntimeException e13) {
                                    e = e13;
                                    str6 = null;
                                }
                            }
                        } catch (IOException | RuntimeException e14) {
                            e = e14;
                            str2 = strConcat;
                            str7 = "error";
                            str3 = 0;
                            fileOutputStream2 = null;
                        }
                        if (e instanceof RuntimeException) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "VideoStreamFullFileCache.preload");
                        }
                        try {
                            fileOutputStream2.close();
                        } catch (IOException | NullPointerException unused2) {
                        }
                        if (this.zzh) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Preload aborted for URL \"" + str + "\"");
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzk("Preload failed for URL \"" + str + "\"", e);
                        }
                        if (file3.exists() && !file3.delete()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                        }
                        zzg(str, file3.getAbsolutePath(), str7, str3);
                        zze.remove(str2);
                        return false;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            File file4 = this.zzg;
            if (file4 == null) {
                break;
            }
            long j = Long.MAX_VALUE;
            File file5 = null;
            for (File file6 : file4.listFiles()) {
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j) {
                        file5 = file6;
                        j = jLastModified;
                    }
                }
            }
            if (file5 == null) {
                break;
            }
            zDelete = file5.delete();
            File fileZza2 = zza(file5);
            if (fileZza2.isFile()) {
                zDelete &= fileZza2.delete();
            }
        } while (zDelete);
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to expire stream cache");
        zzg(str, null, "expireFailed", null);
        return false;
    }
}
