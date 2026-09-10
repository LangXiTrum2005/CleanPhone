package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.ImmutableMap;
import com.ironsource.A5;
import decarock.grimness;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import vir.triweekly;

/* JADX INFO: compiled from: HttpMediaDrmCallback.java */
/* JADX INFO: loaded from: classes.dex */
public final class taiyuan implements cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final androidx.media3.datasource.attabal.InterfaceC0080attabal f11874attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final boolean f11875dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final String f11876saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Map<String, String> f11877wireman;

    public taiyuan(String str, boolean z, androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal) {
        decarock.attabal.attabal((z && TextUtils.isEmpty(str)) ? false : true);
        this.f11874attabal = interfaceC0080attabal;
        this.f11876saneness = str;
        this.f11875dern = z;
        this.f11877wireman = new HashMap();
    }

    public static byte[] dern(androidx.media3.datasource.attabal.InterfaceC0080attabal interfaceC0080attabal, String str, byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        triweekly triweeklyVar = new triweekly(interfaceC0080attabal.createDataSource());
        vir.competently competentlyVarAttabal = new vir.competently.saneness().cutely(str).marial(map).wireman(2).dern(bArr).saneness(1).attabal();
        int i = 0;
        vir.competently competentlyVarAttabal2 = competentlyVarAttabal;
        while (true) {
            try {
                vir.marial marialVar = new vir.marial(triweeklyVar, competentlyVarAttabal2);
                try {
                    byte[] bArrWireman = kaif.dern.wireman(marialVar);
                    grimness.formularize(marialVar);
                    return bArrWireman;
                } catch (HttpDataSource$InvalidResponseCodeException e) {
                    try {
                        String strWireman = wireman(e, i);
                        if (strWireman == null) {
                            throw e;
                        }
                        i++;
                        competentlyVarAttabal2 = competentlyVarAttabal2.attabal().cutely(strWireman).attabal();
                        grimness.formularize(marialVar);
                    } catch (Throwable th) {
                        grimness.formularize(marialVar);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                throw new MediaDrmCallbackException(competentlyVarAttabal, (Uri) decarock.attabal.marial(triweeklyVar.marial()), triweeklyVar.getResponseHeaders(), triweeklyVar.wireman(), e2);
            }
        }
    }

    public static String wireman(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = httpDataSource$InvalidResponseCodeException.responseCode;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = httpDataSource$InvalidResponseCodeException.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // androidx.media3.exoplayer.drm.cutely
    public byte[] attabal(UUID uuid, competently.attabal attabalVar) throws MediaDrmCallbackException {
        String str;
        String strSaneness = attabalVar.saneness();
        if (this.f11875dern || TextUtils.isEmpty(strSaneness)) {
            strSaneness = this.f11876saneness;
        }
        if (TextUtils.isEmpty(strSaneness)) {
            vir.competently.saneness sanenessVar = new vir.competently.saneness();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(sanenessVar.taiyuan(uri).attabal(), uri, ImmutableMap.of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = androidx.media3.common.competently.f10814marial;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = androidx.media3.common.competently.f10813dern.equals(uuid) ? A5.M : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f11877wireman) {
            map.putAll(this.f11877wireman);
        }
        return dern(this.f11874attabal, strSaneness, attabalVar.attabal(), map);
    }

    public void marial(String str, String str2) {
        decarock.attabal.marial(str);
        decarock.attabal.marial(str2);
        synchronized (this.f11877wireman) {
            this.f11877wireman.put(str, str2);
        }
    }

    @Override // androidx.media3.exoplayer.drm.cutely
    public byte[] saneness(UUID uuid, competently.wireman wiremanVar) throws MediaDrmCallbackException {
        return dern(this.f11874attabal, wiremanVar.saneness() + "&signedRequest=" + grimness.kattegat(wiremanVar.attabal()), null, Collections.EMPTY_MAP);
    }
}
