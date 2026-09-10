package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
final class zzchi extends zzgt implements zzhu {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzht zzg;
    private zzhf zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzchi(String str, zzhz zzhzVar, int i2, int i3, int i4) {
        super(true);
        this.zzc = new zzchh(this);
        this.zzr = new HashSet();
        zzdg.zza(str);
        this.zzf = str;
        this.zzg = new zzht();
        this.zzd = i2;
        this.zze = i3;
        this.zzq = i4;
        if (zzhzVar != null) {
            zze(zzhzVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e2);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i2, int i3) throws zzhq {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i4 = this.zzj.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i4;
                    zzh(i4);
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j4);
            }
            int i5 = this.zzj.read(bArr, i2, i3);
            if (i5 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += (long) i5;
            zzh(i5);
            return i5;
        } catch (IOException e2) {
            throw new zzhq(e2, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00ea A[Catch: IOException -> 0x0044, TryCatch #1 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0048, B:12:0x0060, B:14:0x0066, B:22:0x0094, B:24:0x00b6, B:26:0x00dc, B:27:0x00e1, B:29:0x00ea, B:30:0x00f1, B:43:0x011a, B:96:0x027b, B:98:0x0288, B:100:0x0299, B:103:0x02a2, B:104:0x02af, B:106:0x02b9, B:107:0x02c0, B:108:0x02c1, B:109:0x02de), top: B:114:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0134  */
    /* JADX WARN: Code duplicated, block: B:98:0x0288 A[Catch: IOException -> 0x0044, TryCatch #1 {IOException -> 0x0044, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0048, B:12:0x0060, B:14:0x0066, B:22:0x0094, B:24:0x00b6, B:26:0x00dc, B:27:0x00e1, B:29:0x00ea, B:30:0x00f1, B:43:0x011a, B:96:0x027b, B:98:0x0288, B:100:0x0299, B:103:0x02a2, B:104:0x02af, B:106:0x02b9, B:107:0x02c0, B:108:0x02c1, B:109:0x02de), top: B:114:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzhq {
        long j;
        int responseCode;
        String headerField;
        String protocol;
        long j2;
        long jMax;
        this.zzh = zzhfVar;
        long j3 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzhfVar.zza.toString());
            long j4 = zzhfVar.zze;
            long j5 = zzhfVar.zzf;
            boolean zZza = zzhfVar.zza(1);
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                long j6 = j3;
                if (i2 > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i3);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Iterator it = this.zzg.zza().entrySet().iterator(); it.hasNext(); it = it) {
                    Map.Entry entry = (Map.Entry) it.next();
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j4 == j6) {
                    if (j5 != -1) {
                        j = j6;
                    } else {
                        j4 = j4;
                    }
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.zzf);
                    if (!zZza) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.zzl = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzhs zzhsVar = new zzhs(this.zzl, null, null, headerFields, zzhfVar, zzfj.zzb);
                                if (this.zzl != 416) {
                                    throw zzhsVar;
                                }
                                zzhsVar.initCause(new zzhc(2008));
                                throw zzhsVar;
                            }
                            if (responseCode2 == 200) {
                                j2 = zzhfVar.zze;
                                if (j2 == j6) {
                                    j2 = j6;
                                }
                            } else {
                                j2 = j6;
                            }
                            this.zzm = j2;
                            if (zzhfVar.zza(1)) {
                                this.zzn = zzhfVar.zzf;
                            } else {
                                long j7 = zzhfVar.zzf;
                                if (j7 != -1) {
                                    this.zzn = j7;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (TextUtils.isEmpty(headerField2)) {
                                        jMax = -1;
                                    } else {
                                        try {
                                            jMax = Long.parseLong(headerField2);
                                        } catch (NumberFormatException unused) {
                                            String strS = android.support.v4.media.a.s(new StringBuilder(String.valueOf(headerField2).length() + 28), "Unexpected Content-Length [", headerField2, d9.i.f24752e);
                                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzf(strS);
                                            jMax = -1;
                                        }
                                    }
                                    String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        Matcher matcher = zza.matcher(headerField3);
                                        if (matcher.find()) {
                                            try {
                                                long j8 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (jMax < j6) {
                                                    jMax = j8;
                                                } else if (jMax != j8) {
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(headerField2).length() + 25 + String.valueOf(headerField3).length() + 1);
                                                    sb2.append("Inconsistent headers [");
                                                    sb2.append(headerField2);
                                                    sb2.append("] [");
                                                    sb2.append(headerField3);
                                                    sb2.append(d9.i.f24752e);
                                                    String string = sb2.toString();
                                                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                                                    jMax = Math.max(jMax, j8);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                String strS2 = android.support.v4.media.a.s(new StringBuilder(String.valueOf(headerField3).length() + 27), "Unexpected Content-Range [", headerField3, d9.i.f24752e);
                                                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzf(strS2);
                                            }
                                        }
                                    }
                                    this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzg(zzhfVar);
                                return this.zzn;
                            } catch (IOException e2) {
                                zzn();
                                throw new zzhq(e2, zzhfVar, 2000, 1);
                            }
                        } catch (IOException e3) {
                            zzn();
                            throw new zzhq("Unable to connect to ".concat(String.valueOf(zzhfVar.zza.toString())), e3, zzhfVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i2 = i3;
                    j3 = j6;
                    j4 = j4;
                } else {
                    j = j4;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 7);
                sb3.append("bytes=");
                long j9 = j;
                sb3.append(j9);
                sb3.append(TokenBuilder.TOKEN_DELIMITER);
                String string2 = sb3.toString();
                if (j5 != -1) {
                    long j10 = (j9 + j5) - 1;
                    StringBuilder sb4 = new StringBuilder(string2.length() + String.valueOf(j10).length());
                    sb4.append(string2);
                    sb4.append(j10);
                    string2 = sb4.toString();
                }
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string2);
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.zzf);
                if (!zZza) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!HttpRequest.DEFAULT_SCHEME.equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i2 = i3;
                j3 = j6;
                j4 = j4;
            }
        } catch (IOException e4) {
            throw new zzhq("Unable to connect to ".concat(String.valueOf(zzhfVar.zza.toString())), e4, zzhfVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    throw new zzhq(e2, this.zzh, 2000, 3);
                }
            }
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        } catch (Throwable th) {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzk(int i2) {
        this.zzq = i2;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e2);
                }
            }
        }
    }

    public final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    public final /* synthetic */ int zzm() {
        return this.zzq;
    }
}
