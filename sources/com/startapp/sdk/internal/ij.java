package com.startapp.sdk.internal;

import android.content.Context;
import android.util.Base64;
import com.startapp.sdk.ads.video.VideoAdDetails;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.cache.CachedVideoAd;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public final class ij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList f41116a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f41117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lb f41118c;
    public final lb d;

    public ij(Context context, lb lbVar, lb lbVar2) {
        this.f41117b = context;
        this.f41118c = lbVar;
        this.d = lbVar2;
    }

    public final boolean a(int i2) {
        ArrayList arrayList;
        jj jjVar;
        VideoAdDetails videoAdDetails;
        Iterator it = this.f41116a.iterator();
        boolean z2 = false;
        while (it.hasNext() && this.f41116a.size() > i2) {
            CachedVideoAd cachedVideoAd = (CachedVideoAd) it.next();
            p pVar = (p) this.d.a();
            String strA = cachedVideoAd.a();
            synchronized (pVar) {
                arrayList = new ArrayList(pVar.f41333a.values());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    it.remove();
                    if (cachedVideoAd.a() != null) {
                        new File(cachedVideoAd.a()).delete();
                    }
                    z2 = true;
                    break;
                }
                Ad ad = ((x2) it2.next()).o;
                if ((ad instanceof jj) && (videoAdDetails = (jjVar = (jj) ad).r) != null && videoAdDetails.getLocalVideoPath() != null && jjVar.r.getLocalVideoPath().equals(strA)) {
                    break;
                }
            }
        }
        return z2;
    }

    public final void a(Context context, String str, ek ekVar, pe peVar) {
        if (this.f41116a == null) {
            LinkedList linkedList = (LinkedList) g7.c(context, "CachedAds");
            this.f41116a = linkedList;
            if (linkedList == null) {
                this.f41116a = new LinkedList();
            }
            if (a(AdsCommonMetaData.k().F().c())) {
                g7.b(context, "CachedAds", this.f41116a);
            }
        }
        try {
            URL url = new URL(str);
            String str2 = url.getHost() + url.getPath().replace("/", "_");
            try {
                String strSubstring = str2.substring(0, str2.lastIndexOf(46));
                str2 = Base64.encodeToString(MessageDigest.getInstance("MD5").digest(strSubstring.getBytes()), 0).replaceAll("[^a-zA-Z0-9]+", "_") + str2.substring(str2.lastIndexOf(46));
            } catch (NoSuchAlgorithmException e2) {
                g9.a(e2);
            }
            String str3 = str2;
            new fk(context, url, str3, new gj(this, ekVar, new CachedVideoAd(str3), context), new hj(peVar)).a();
        } catch (MalformedURLException e3) {
            if (ekVar != null) {
                ekVar.a(null);
            }
            g9.a(e3);
        }
    }
}
