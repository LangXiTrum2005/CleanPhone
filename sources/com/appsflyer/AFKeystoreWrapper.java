package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.ironsource.X3;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes2.dex */
public class AFKeystoreWrapper {
    public KeyStore getMonetizationNetwork;
    private Context getRevenue;
    public final Object getMediationNetwork = new Object();
    public String getCurrencyIso4217Code = "";
    public int AFAdRevenueData = 0;

    public AFKeystoreWrapper(Context context) {
        this.getRevenue = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.getMonetizationNetwork = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    public final boolean AFAdRevenueData() {
        boolean z;
        synchronized (this.getMediationNetwork) {
            try {
                KeyStore keyStore = this.getMonetizationNetwork;
                z = false;
                if (keyStore != null) {
                    try {
                        Enumeration<String> enumerationAliases = keyStore.aliases();
                        while (enumerationAliases.hasMoreElements()) {
                            String strNextElement = enumerationAliases.nextElement();
                            if (strNextElement != null && AFAdRevenueData(strNextElement)) {
                                String[] strArrSplit = strNextElement.split(",");
                                if (strArrSplit.length != 3) {
                                    break;
                                }
                                AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(strNextElement));
                                z = true;
                                String[] strArrSplit2 = strArrSplit[1].trim().split(X3.j.b);
                                String[] strArrSplit3 = strArrSplit[2].trim().split(X3.j.b);
                                if (strArrSplit2.length != 2 || strArrSplit3.length != 2) {
                                    break;
                                    break;
                                }
                                this.getCurrencyIso4217Code = strArrSplit2[1].trim();
                                this.AFAdRevenueData = Integer.parseInt(strArrSplit3[1].trim());
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        StringBuilder sb = new StringBuilder("Couldn't list KeyStore Aliases: ");
                        sb.append(th.getClass().getName());
                        AFLogger.afErrorLog(sb.toString(), th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z;
    }

    public final String getCurrencyIso4217Code() {
        String str;
        synchronized (this.getMediationNetwork) {
            str = this.getCurrencyIso4217Code;
        }
        return str;
    }

    public final String getMonetizationNetwork() {
        StringBuilder sb = new StringBuilder();
        sb.append("com.appsflyer,");
        synchronized (this.getMediationNetwork) {
            sb.append("KSAppsFlyerId=");
            sb.append(this.getCurrencyIso4217Code);
            sb.append(",");
            sb.append("KSAppsFlyerRICounter=");
            sb.append(this.AFAdRevenueData);
        }
        return sb.toString();
    }

    public final void getRevenue(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.getMediationNetwork) {
                try {
                    if (this.getMonetizationNetwork.containsAlias(str)) {
                        AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(keyGenParameterSpecBuild);
                        keyPairGenerator.generateKeyPair();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            StringBuilder sb = new StringBuilder("Exception ");
            sb.append(th2.getMessage());
            sb.append(" occurred");
            AFLogger.afErrorLog(sb.toString(), th2);
        }
    }

    private static boolean AFAdRevenueData(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final int getRevenue() {
        int i;
        synchronized (this.getMediationNetwork) {
            i = this.AFAdRevenueData;
        }
        return i;
    }
}
