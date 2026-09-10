package com.appsflyer.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class AFf1qSDK extends AFe1mSDK<AFf1pSDK> {
    public AFi1wSDK areAllFieldsValid;
    private final AFc1oSDK component1;
    public final AFf1mSDK component2;
    public AFf1pSDK component3;
    private final AFf1nSDK component4;
    private final AFd1nSDK copy;
    private final AFf1jSDK copydefault;
    private final String equals;
    private final AFf1hSDK hashCode;
    private final AFf1eSDK toString;

    public AFf1qSDK(AFf1nSDK aFf1nSDK, AFc1oSDK aFc1oSDK, AFf1eSDK aFf1eSDK, AFf1hSDK aFf1hSDK, AFd1nSDK aFd1nSDK, AFf1jSDK aFf1jSDK, String str, AFf1mSDK aFf1mSDK) {
        super(AFe1pSDK.RC_CDN, new AFe1pSDK[0], "UpdateRemoteConfiguration");
        this.component3 = null;
        this.component4 = aFf1nSDK;
        this.component1 = aFc1oSDK;
        this.toString = aFf1eSDK;
        this.hashCode = aFf1hSDK;
        this.copy = aFd1nSDK;
        this.copydefault = aFf1jSDK;
        this.equals = str;
        this.component2 = aFf1mSDK;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065 A[Catch: all -> 0x0135, IOException -> 0x0138, TryCatch #6 {IOException -> 0x0138, all -> 0x0135, blocks: (B:15:0x005d, B:17:0x0065, B:19:0x008c, B:21:0x00a6, B:24:0x00b3, B:26:0x00bf, B:32:0x012f, B:46:0x0150, B:48:0x0162, B:50:0x0168, B:52:0x0188), top: B:70:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:19:0x008c A[Catch: all -> 0x0135, IOException -> 0x0138, TryCatch #6 {IOException -> 0x0138, all -> 0x0135, blocks: (B:15:0x005d, B:17:0x0065, B:19:0x008c, B:21:0x00a6, B:24:0x00b3, B:26:0x00bf, B:32:0x012f, B:46:0x0150, B:48:0x0162, B:50:0x0168, B:52:0x0188), top: B:70:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0168 A[Catch: all -> 0x0135, IOException -> 0x0138, TryCatch #6 {IOException -> 0x0138, all -> 0x0135, blocks: (B:15:0x005d, B:17:0x0065, B:19:0x008c, B:21:0x00a6, B:24:0x00b3, B:26:0x00bf, B:32:0x012f, B:46:0x0150, B:48:0x0162, B:50:0x0168, B:52:0x0188), top: B:70:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0188 A[Catch: all -> 0x0135, IOException -> 0x0138, TRY_LEAVE, TryCatch #6 {IOException -> 0x0138, all -> 0x0135, blocks: (B:15:0x005d, B:17:0x0065, B:19:0x008c, B:21:0x00a6, B:24:0x00b3, B:26:0x00bf, B:32:0x012f, B:46:0x0150, B:48:0x0162, B:50:0x0168, B:52:0x0188), top: B:70:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:70:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private AFf1pSDK component3() throws InterruptedException, InterruptedIOException {
        String monetizationNetwork;
        AFLogger aFLogger;
        AFg1cSDK aFg1cSDK;
        AFe1wSDK<AFi1vSDK> currencyIso4217Code;
        String mediationNetwork;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.equals;
        String mediationNetwork2 = this.toString.getMediationNetwork();
        if (mediationNetwork2 == null || mediationNetwork2.trim().length() == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Dev key is not set, SDK is not started.");
        } else {
            if (str == null) {
                AFLogger.INSTANCE.w(AFg1cSDK.REMOTE_CONTROL, "Can't create CDN token, domain or version is not provided.");
            } else {
                monetizationNetwork = AFj1dSDK.getMonetizationNetwork(TextUtils.join("\u2063", new String[]{"appsflyersdk.com", str, this.component1.getCurrencyIso4217Code.getMonetizationNetwork.getPackageName()}), mediationNetwork2);
            }
            if (monetizationNetwork == null) {
                AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
                return AFf1pSDK.FAILURE;
            }
            try {
                if (this.copydefault.AFAdRevenueData()) {
                    AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
                    return AFf1pSDK.USE_CACHED;
                }
                aFLogger = AFLogger.INSTANCE;
                aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
                aFLogger.i(aFg1cSDK, "Cached config is expired, updating...");
                currencyIso4217Code = this.copy.getRevenue(this.copydefault.getMonetizationNetwork(), this.copydefault.getMediationNetwork(), monetizationNetwork, 1500).getCurrencyIso4217Code();
                if (currencyIso4217Code.isSuccessful()) {
                    getCurrencyIso4217Code(monetizationNetwork, jCurrentTimeMillis, null, null, currencyIso4217Code);
                    StringBuilder sb = new StringBuilder("failed to fetch remote config from CDN with status code: ");
                    sb.append(currencyIso4217Code.getStatusCode());
                    aFLogger.w(aFg1cSDK, sb.toString());
                    return AFf1pSDK.FAILURE;
                }
                AFi1vSDK body = currencyIso4217Code.getBody();
                String revenue = currencyIso4217Code.getRevenue("x-amz-meta-af-auth-v1");
                String revenue2 = currencyIso4217Code.getRevenue("CF-Cache-Status");
                mediationNetwork = this.toString.getMediationNetwork();
                if (mediationNetwork != null || mediationNetwork.trim().length() == 0) {
                    aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
                    return AFf1pSDK.FAILURE;
                }
                AFi1sSDK revenue3 = this.component4.getRevenue(body, revenue, monetizationNetwork, mediationNetwork);
                if (!revenue3.getCurrencyIso4217Code()) {
                    getCurrencyIso4217Code(monetizationNetwork, jCurrentTimeMillis, revenue3.getRevenue, revenue2, currencyIso4217Code);
                    aFLogger.w(aFg1cSDK, "fetched config is not valid (MITM?) refuse to use it.");
                    return AFf1pSDK.FAILURE;
                }
                long currencyIso4217Code2 = this.copydefault.getCurrencyIso4217Code();
                StringBuilder sb2 = new StringBuilder("using max-age fallback: ");
                sb2.append(currencyIso4217Code2);
                sb2.append(" seconds");
                aFLogger.v(aFg1cSDK, sb2.toString());
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                AFf1hSDK aFf1hSDK = this.hashCode;
                String str2 = monetizationNetwork;
                try {
                    try {
                        aFf1hSDK.AFAdRevenueData.getRevenue("af_remote_config", Base64.encodeToString(body.getMediationNetwork.getBytes(Charset.defaultCharset()), 2));
                        aFf1hSDK.getMediationNetwork = aFf1hSDK.getCurrencyIso4217Code;
                        aFf1hSDK.AFAdRevenueData.AFAdRevenueData("af_rc_timestamp", jCurrentTimeMillis2);
                        aFf1hSDK.AFAdRevenueData.AFAdRevenueData("af_rc_max_age", currencyIso4217Code2);
                        aFf1hSDK.getCurrencyIso4217Code = body;
                        aFf1hSDK.getRevenue = jCurrentTimeMillis2;
                        aFf1hSDK.getMonetizationNetwork = currencyIso4217Code2;
                        StringBuilder sb3 = new StringBuilder("Config successfully updated, timeToLive: ");
                        sb3.append(currencyIso4217Code2);
                        sb3.append(" seconds");
                        aFLogger.d(aFg1cSDK, sb3.toString());
                        getCurrencyIso4217Code(str2, jCurrentTimeMillis, revenue3.getRevenue, revenue2, currencyIso4217Code);
                        return AFf1pSDK.SUCCESS;
                    } catch (IOException e) {
                        e = e;
                        monetizationNetwork = str2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        IOException iOException = e;
                        AFLogger aFLogger2 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK2 = AFg1cSDK.REMOTE_CONTROL;
                        StringBuilder sb4 = new StringBuilder("failed to fetch remote config: ");
                        sb4.append(iOException.getMessage());
                        aFLogger2.e(aFg1cSDK2, sb4.toString(), iOException, true, false, false);
                        getMonetizationNetwork(monetizationNetwork, jCurrentTimeMillis, iOException instanceof ParsingException ? ((ParsingException) iOException).getRawResponse() : null, null, null, null, iOException);
                        if (iOException.getCause() instanceof InterruptedIOException) {
                            throw ((InterruptedIOException) iOException.getCause());
                        }
                        return AFf1pSDK.FAILURE;
                    } catch (Throwable th) {
                        th = th;
                        monetizationNetwork = str2;
                        jCurrentTimeMillis = jCurrentTimeMillis;
                        Throwable th2 = th;
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        AFg1cSDK aFg1cSDK3 = AFg1cSDK.REMOTE_CONTROL;
                        StringBuilder sb5 = new StringBuilder("failed to update remote config: ");
                        sb5.append(th2.getMessage());
                        aFLogger3.e(aFg1cSDK3, sb5.toString(), th2, true, false, false);
                        getMonetizationNetwork(monetizationNetwork, jCurrentTimeMillis, null, null, null, null, th2);
                        if (th2.getCause() instanceof InterruptedException) {
                            throw ((InterruptedException) th2.getCause());
                        }
                        return AFf1pSDK.FAILURE;
                    }
                } catch (IOException e2) {
                    e = e2;
                    monetizationNetwork = str2;
                } catch (Throwable th3) {
                    th = th3;
                    monetizationNetwork = str2;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        monetizationNetwork = null;
        if (monetizationNetwork == null) {
            AFLogger.INSTANCE.v(AFg1cSDK.REMOTE_CONTROL, "can't create CDN token, skipping fetch config");
            return AFf1pSDK.FAILURE;
        }
        if (this.copydefault.AFAdRevenueData()) {
            AFLogger.INSTANCE.d(AFg1cSDK.REMOTE_CONTROL, "active config is valid, skipping fetch");
            return AFf1pSDK.USE_CACHED;
        }
        aFLogger = AFLogger.INSTANCE;
        aFg1cSDK = AFg1cSDK.REMOTE_CONTROL;
        aFLogger.i(aFg1cSDK, "Cached config is expired, updating...");
        currencyIso4217Code = this.copy.getRevenue(this.copydefault.getMonetizationNetwork(), this.copydefault.getMediationNetwork(), monetizationNetwork, 1500).getCurrencyIso4217Code();
        if (currencyIso4217Code.isSuccessful()) {
            getCurrencyIso4217Code(monetizationNetwork, jCurrentTimeMillis, null, null, currencyIso4217Code);
            StringBuilder sb6 = new StringBuilder("failed to fetch remote config from CDN with status code: ");
            sb6.append(currencyIso4217Code.getStatusCode());
            aFLogger.w(aFg1cSDK, sb6.toString());
            return AFf1pSDK.FAILURE;
        }
        AFi1vSDK body2 = currencyIso4217Code.getBody();
        String revenue4 = currencyIso4217Code.getRevenue("x-amz-meta-af-auth-v1");
        String revenue5 = currencyIso4217Code.getRevenue("CF-Cache-Status");
        mediationNetwork = this.toString.getMediationNetwork();
        if (mediationNetwork != null) {
        }
        aFLogger.w(aFg1cSDK, "Dev key is not set, SDK is not started.");
        return AFf1pSDK.FAILURE;
    }

    private void getCurrencyIso4217Code(String str, long j, AFi1ySDK aFi1ySDK, String str2, AFe1wSDK<AFi1vSDK> aFe1wSDK) {
        getMonetizationNetwork(str, j, aFe1wSDK, aFe1wSDK != null ? aFe1wSDK.getBody() : null, aFi1ySDK, str2 != null ? str2 : null, null);
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final long AFAdRevenueData() {
        return 1500L;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final boolean getMonetizationNetwork() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1mSDK
    public final AFe1uSDK getRevenue() throws Exception {
        try {
            AFf1pSDK aFf1pSDKComponent3 = component3();
            this.component3 = aFf1pSDKComponent3;
            return aFf1pSDKComponent3 == AFf1pSDK.FAILURE ? AFe1uSDK.FAILURE : AFe1uSDK.SUCCESS;
        } catch (InterruptedException e) {
            e = e;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (SocketTimeoutException unused) {
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        } catch (InterruptedIOException e2) {
            e = e2;
            AFLogger.INSTANCE.e(AFg1cSDK.REMOTE_CONTROL, "RC update config failed", e, false, false, false);
            this.component3 = AFf1pSDK.FAILURE;
            return AFe1uSDK.TIMEOUT;
        }
    }

    private void getMonetizationNetwork(String str, long j, AFe1wSDK<?> aFe1wSDK, AFi1vSDK aFi1vSDK, AFi1ySDK aFi1ySDK, String str2, Throwable th) {
        long j2;
        int statusCode;
        Throwable th2;
        if (aFe1wSDK != null) {
            j2 = aFe1wSDK.getMonetizationNetwork.getMediationNetwork;
            statusCode = aFe1wSDK.getStatusCode();
        } else {
            j2 = 0;
            statusCode = 0;
        }
        int i = statusCode;
        if (th instanceof HttpException) {
            Throwable cause = th.getCause();
            j2 = ((HttpException) th).getMetrics().getMediationNetwork;
            th2 = cause;
        } else {
            th2 = th;
        }
        this.areAllFieldsValid = new AFi1wSDK(aFi1vSDK != null ? aFi1vSDK.AFAdRevenueData : null, str, j2, System.currentTimeMillis() - j, i, aFi1ySDK, str2, th2);
    }
}
