package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.impl.Z;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.ko;
import com.smartdigimkt.o0.b;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhm extends zzgt implements zzhu {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzht zze;
    private final zzht zzf;
    private zzhf zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    public /* synthetic */ zzhm(String str, int i2, int i3, boolean z2, boolean z3, zzht zzhtVar, zzgqb zzgqbVar, boolean z4, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i2;
        this.zzc = i3;
        this.zza = z2;
        this.zze = zzhtVar;
        this.zzf = new zzht();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    private final HttpURLConnection zzk(URL url, int i2, byte[] bArr, long j, long j2, boolean z2, boolean z3, Map map) throws IOException {
        StringBuilder sbV;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap map2 = new HashMap();
        map2.putAll(this.zze.zza());
        map2.putAll(this.zzf.zza());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0) {
            sbV = android.support.v4.media.a.v(j, "bytes=", TokenBuilder.TOKEN_DELIMITER);
            if (j2 != -1) {
                sbV.append((j + j2) - 1);
            }
            string = sbV.toString();
        } else if (j2 == -1) {
            string = null;
        } else {
            j = 0;
            sbV = android.support.v4.media.a.v(j, "bytes=", TokenBuilder.TOKEN_DELIMITER);
            if (j2 != -1) {
                sbV.append((j + j2) - 1);
            }
            string = sbV.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string);
        }
        String str = this.zzd;
        if (str != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z2 ? "identity" : b.d);
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(false);
        int i3 = zzhf.zzh;
        httpURLConnection.setRequestMethod(ko.f25534a);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzhf zzhfVar) throws zzhq {
        if (str == null) {
            throw new zzhq("Null location redirect", zzhfVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!HttpRequest.DEFAULT_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new zzhq("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhfVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(Z.d(protocol, String.valueOf(protocol2).length() + 40, 1));
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzhq(sb.toString(), zzhfVar, 2001, 1);
        } catch (MalformedURLException e2) {
            throw new zzhq(e2, zzhfVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                zzee.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
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
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j2);
            }
            InputStream inputStream = this.zzi;
            String str = zzfj.zza;
            int i4 = inputStream.read(bArr, i2, i3);
            if (i4 == -1) {
                return -1;
            }
            this.zzm += (long) i4;
            zzh(i4);
            return i4;
        } catch (IOException e2) {
            zzhf zzhfVar = this.zzg;
            String str2 = zzfj.zza;
            throw zzhq.zza(e2, zzhfVar, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b0  */
    @Override // com.google.android.gms.internal.ads.zzhb
    public final long zzb(zzhf zzhfVar) throws zzhq {
        zzhm zzhmVar;
        long j;
        int i2;
        HttpURLConnection httpURLConnectionZzk;
        byte[] bArrZza;
        long j2;
        zzhm zzhmVar2 = this;
        zzhmVar2.zzg = zzhfVar;
        long j3 = 0;
        zzhmVar2.zzm = 0L;
        zzhmVar2.zzl = 0L;
        zzf(zzhfVar);
        try {
            URL url = new URL(zzhfVar.zza.toString());
            long j4 = zzhfVar.zze;
            long j5 = zzhfVar.zzf;
            boolean zZza = zzhfVar.zza(1);
            int i3 = 0;
            try {
                if (zzhmVar2.zza) {
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i3 > 20) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 20);
                            sb.append("Too many redirects: ");
                            sb.append(i5);
                            throw new zzhq(new NoRouteToHostException(sb.toString()), zzhfVar, 2001, 1);
                        }
                        j = j3;
                        i2 = i4;
                        zzhmVar2 = this;
                        HttpURLConnection httpURLConnectionZzk2 = zzhmVar2.zzk(url, 1, null, j4, j5, zZza, false, zzhfVar.zzd);
                        URL url2 = url;
                        long j6 = j5;
                        zzhmVar = zzhmVar2;
                        try {
                            int responseCode = httpURLConnectionZzk2.getResponseCode();
                            String headerField = httpURLConnectionZzk2.getHeaderField("Location");
                            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                                httpURLConnectionZzk = httpURLConnectionZzk2;
                                break;
                            }
                            httpURLConnectionZzk2.disconnect();
                            URL urlZzl = zzhmVar.zzl(url2, headerField, zzhfVar);
                            j5 = j6;
                            url = urlZzl;
                            i4 = i2;
                            i3 = i5;
                            j3 = j;
                        } catch (IOException e2) {
                            e = e2;
                        }
                        zzhmVar.zzm();
                        throw zzhq.zza(e, zzhfVar, 1);
                    }
                }
                httpURLConnectionZzk = zzhmVar2.zzk(url, 1, null, j4, j5, zZza, true, zzhfVar.zzd);
                zzhmVar = this;
                j = 0;
                i2 = 0;
                zzhmVar.zzh = httpURLConnectionZzk;
                zzhmVar.zzk = httpURLConnectionZzk.getResponseCode();
                String responseMessage = httpURLConnectionZzk.getResponseMessage();
                int i6 = zzhmVar.zzk;
                if (i6 < 200 || i6 > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionZzk.getHeaderFields();
                    if (zzhmVar.zzk == 416) {
                        if (zzhfVar.zze == zzhv.zza(httpURLConnectionZzk.getHeaderField("Content-Range"))) {
                            zzhmVar.zzj = true;
                            zzg(zzhfVar);
                            long j7 = zzhfVar.zzf;
                            return j7 != -1 ? j7 : j;
                        }
                    }
                    InputStream errorStream = httpURLConnectionZzk.getErrorStream();
                    try {
                        bArrZza = errorStream != null ? zzgwd.zza(errorStream) : zzfj.zzb;
                    } catch (IOException unused) {
                        bArrZza = zzfj.zzb;
                    }
                    zzhmVar.zzm();
                    throw new zzhs(zzhmVar.zzk, responseMessage, zzhmVar.zzk == 416 ? new zzhc(2008) : null, headerFields, zzhfVar, bArrZza);
                }
                httpURLConnectionZzk.getContentType();
                if (zzhmVar.zzk == 200) {
                    j2 = zzhfVar.zze;
                    if (j2 == j) {
                        j2 = j;
                    }
                } else {
                    j2 = j;
                }
                boolean zEqualsIgnoreCase = b.d.equalsIgnoreCase(httpURLConnectionZzk.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    zzhmVar.zzl = zzhfVar.zzf;
                } else {
                    long j8 = zzhfVar.zzf;
                    if (j8 != -1) {
                        zzhmVar.zzl = j8;
                    } else {
                        long jZzb = zzhv.zzb(httpURLConnectionZzk.getHeaderField("Content-Length"), httpURLConnectionZzk.getHeaderField("Content-Range"));
                        zzhmVar.zzl = jZzb != -1 ? jZzb - j2 : -1L;
                    }
                }
                try {
                    zzhmVar.zzi = httpURLConnectionZzk.getInputStream();
                    if (zEqualsIgnoreCase) {
                        zzhmVar.zzi = new GZIPInputStream(zzhmVar.zzi);
                    }
                    zzhmVar.zzj = true;
                    zzg(zzhfVar);
                    if (j2 != j) {
                        try {
                            byte[] bArr = new byte[4096];
                            while (j2 > j) {
                                int iMin = (int) Math.min(j2, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                                InputStream inputStream = zzhmVar.zzi;
                                String str = zzfj.zza;
                                int i7 = inputStream.read(bArr, i2, iMin);
                                if (Thread.currentThread().isInterrupted()) {
                                    throw new zzhq(new InterruptedIOException(), zzhfVar, 2000, 1);
                                }
                                if (i7 == -1) {
                                    throw new zzhq(zzhfVar, 2008, 1);
                                }
                                j2 -= (long) i7;
                                zzhmVar.zzh(i7);
                            }
                        } catch (IOException e3) {
                            zzhmVar.zzm();
                            if (e3 instanceof zzhq) {
                                throw ((zzhq) e3);
                            }
                            throw new zzhq(e3, zzhfVar, 2000, 1);
                        }
                    }
                    return zzhmVar.zzl;
                } catch (IOException e4) {
                    zzhmVar.zzm();
                    throw new zzhq(e4, zzhfVar, 2000, 1);
                }
            } catch (IOException e5) {
                e = e5;
                zzhmVar = this;
            }
        } catch (IOException e6) {
            e = e6;
            zzhmVar = zzhmVar2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhf zzhfVar = this.zzg;
        if (zzhfVar != null) {
            return zzhfVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zzd() throws zzhq {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    zzhf zzhfVar = this.zzg;
                    String str = zzfj.zza;
                    throw new zzhq(e2, zzhfVar, 2000, 3);
                }
            }
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
        } catch (Throwable th) {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhb, com.google.android.gms.internal.ads.zzhu
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgtg.zza() : new zzhl(httpURLConnection.getHeaderFields());
    }
}
