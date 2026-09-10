package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.concurrent.futures.ResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.ko;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgbi implements zzgbc {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzgbi(ExecutorService executorService, String str, long j) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j;
    }

    private final ListenableFuture zze(final String str, final boolean z2, final byte[] bArr, final String str2) {
        return CallbackToFutureAdapter.a(new CallbackToFutureAdapter.Resolver() { // from class: com.google.android.gms.internal.ads.zzgbf
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final /* synthetic */ Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return this.zza.zzc(str, z2, str2, bArr, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:74:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final void zzd(String str, CallbackToFutureAdapter.Completer completer, boolean z2, String str2, byte[] bArr) {
        Throwable th;
        SocketTimeoutException e2;
        byte[] byteArray;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                final HttpURLConnection httpURLConnection2 = (HttpURLConnection) URI.create(str).toURL().openConnection();
                try {
                    Objects.requireNonNull(httpURLConnection2);
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbg
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            httpURLConnection2.disconnect();
                        }
                    };
                    ExecutorService executorService = this.zza;
                    ResolvableFuture resolvableFuture = completer.f3796c;
                    if (resolvableFuture != null) {
                        resolvableFuture.addListener(runnable, executorService);
                    }
                    httpURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.zzb);
                    int i2 = (int) this.zzc;
                    httpURLConnection2.setConnectTimeout(i2);
                    httpURLConnection2.setReadTimeout(i2);
                    if (z2) {
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setRequestMethod(ko.f25535b);
                        if (str2 != null) {
                            httpURLConnection2.setRequestProperty("Content-Type", str2);
                        }
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            bufferedOutputStream.write(bArr);
                            bufferedOutputStream.close();
                        } catch (Throwable th2) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    int responseCode = httpURLConnection2.getResponseCode();
                    InputStream inputStream = responseCode < 400 ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            if (inputStream == null) {
                                byteArray = new byte[0];
                                byteArrayOutputStream.close();
                            } else {
                                byte[] bArr2 = new byte[4096];
                                while (true) {
                                    int i3 = inputStream.read(bArr2);
                                    if (i3 == -1) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr2, 0, i3);
                                    }
                                }
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                inputStream.close();
                            }
                            completer.a(new zzgbh(responseCode, byteArray));
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                            throw th4;
                        }
                    } catch (Throwable th6) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th7) {
                                th6.addSuppressed(th7);
                            }
                        }
                        throw th6;
                    }
                } catch (SocketTimeoutException e3) {
                    e2 = e3;
                    httpURLConnection = httpURLConnection2;
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 9);
                    sb.append("Timeout: ");
                    sb.append(message);
                    completer.c(new TimeoutException(sb.toString()));
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                } catch (Throwable th8) {
                    th = th8;
                    httpURLConnection = httpURLConnection2;
                    completer.c(th);
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                }
            } catch (SocketTimeoutException e4) {
                e2 = e4;
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th10;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbc
    public final ListenableFuture zza(String str) {
        return zze(str, false, new byte[0], null);
    }

    @Override // com.google.android.gms.internal.ads.zzgbc
    public final ListenableFuture zzb(String str, byte[] bArr, String str2) {
        return zze(str, true, bArr, CommonGatewayClient.HEADER_PROTOBUF);
    }

    public final /* synthetic */ Object zzc(final String str, final boolean z2, final String str2, final byte[] bArr, final CallbackToFutureAdapter.Completer completer) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(str, completer, z2, str2, bArr);
            }
        });
        return "";
    }
}
