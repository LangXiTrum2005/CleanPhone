package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.d9;
import com.p004ironsource.ko;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
final class zzcic extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzht zze;
    private zzhf zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzcic(String str, zzhz zzhzVar, int i2, int i3, long j, long j2) {
        super(true);
        zzdg.zza(str);
        this.zzd = str;
        this.zze = new zzht();
        this.zzb = i2;
        this.zzc = i3;
        this.zzh = new ArrayDeque();
        this.zzq = j;
        this.zzr = j2;
        if (zzhzVar != null) {
            zze(zzhzVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws zzhq {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            long j2 = this.zzm;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.zzn + j2;
            long j4 = i3;
            long j5 = this.zzr;
            long j6 = j3 + j4 + j5;
            long j7 = this.zzp;
            long j8 = j7 + 1;
            if (j6 > j8) {
                long j9 = this.zzo;
                if (j7 < j9) {
                    long jMin = Math.min(j9, Math.max(((this.zzq + j8) - j5) - 1, (j8 + j4) - 1));
                    zzk(j8, jMin, 2);
                    this.zzp = jMin;
                    j7 = jMin;
                }
            }
            int i4 = this.zzi.read(bArr, i2, (int) Math.min(j4, ((j7 + 1) - this.zzn) - this.zzm));
            if (i4 == -1) {
                throw new EOFException();
            }
            this.zzm += (long) i4;
            zzh(i4);
            return i4;
        } catch (IOException e2) {
            throw new zzhq(e2, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzhq {
        this.zzf = zzhfVar;
        this.zzm = 0L;
        long j = zzhfVar.zze;
        long j2 = zzhfVar.zzf;
        long jMin = j2 == -1 ? this.zzq : Math.min(this.zzq, j2);
        this.zzn = j;
        HttpURLConnection httpURLConnectionZzk = zzk(j, (jMin + j) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j3 = Long.parseLong(matcher.group(2));
                    long j4 = Long.parseLong(matcher.group(3));
                    long j5 = zzhfVar.zzf;
                    if (j5 != -1) {
                        this.zzl = j5;
                        this.zzo = Math.max(j3, (this.zzn + j5) - 1);
                    } else {
                        this.zzl = j4 - this.zzn;
                        this.zzo = j4 - 1;
                    }
                    this.zzp = j3;
                    this.zzj = true;
                    zzg(zzhfVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    String strS = android.support.v4.media.a.s(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, d9.i.f24752e);
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strS);
                }
            }
        }
        throw new zzcia(headerField, zzhfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new zzhq(e2, this.zzf, 2000, 3);
                }
            }
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        } catch (Throwable th) {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j, long j2, int i2) throws zzhq {
        IOException iOException;
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e2) {
                    iOException = e2;
                    String strValueOf = String.valueOf(string);
                    throw new zzhq("Unable to connect to ".concat(strValueOf), iOException, this.zzf, 2000, i2);
                }
            }
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 7 + String.valueOf(j2).length());
            sb.append("bytes=");
            sb.append(j);
            sb.append(TokenBuilder.TOKEN_DELIMITER);
            sb.append(j2);
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, sb.toString());
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod(ko.f25534a);
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzcib(this.zzk, headerFields, this.zzf, i2);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e3) {
                    zzl();
                    throw new zzhq(e3, this.zzf, 2000, i2);
                }
            } catch (IOException e4) {
                zzl();
                String strValueOf2 = String.valueOf(string2);
                throw new zzhq("Unable to connect to ".concat(strValueOf2), e4, this.zzf, 2000, i2);
            }
        } catch (IOException e5) {
            iOException = e5;
        }
    }
}
