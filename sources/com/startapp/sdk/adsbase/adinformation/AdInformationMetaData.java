package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.vi;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class AdInformationMetaData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile AdInformationMetaData f40595a = new AdInformationMetaData();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40596b = new Object();
    private static final long serialVersionUID = -6352184674890532240L;

    @TypeInfo(complex = true)
    private AdInformationConfig AdInformation = AdInformationConfig.createAdInformationConfig();
    private String adInformationMetadataUpdateVersion = "5.2.4";

    public static AdInformationMetaData c() {
        return f40595a;
    }

    public final AdInformationConfig a() {
        return this.AdInformation;
    }

    public final String b() {
        return this.AdInformation.getEulaUrl();
    }

    public final String d() {
        return this.AdInformation.getPrivacyIconImageUrl();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AdInformationMetaData adInformationMetaData = (AdInformationMetaData) obj;
            if (vi.a((Object) this.AdInformation, (Object) adInformationMetaData.AdInformation) && vi.a((Object) this.adInformationMetadataUpdateVersion, (Object) adInformationMetaData.adInformationMetadataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.AdInformation, this.adInformationMetadataUpdateVersion};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context) {
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) g7.c(context, "StartappAdInfoMetadata");
        AdInformationMetaData adInformationMetaData2 = new AdInformationMetaData();
        if (adInformationMetaData != null) {
            boolean zA = vi.a((Serializable) adInformationMetaData, (Serializable) adInformationMetaData2);
            if ("5.2.4".equals(adInformationMetaData.adInformationMetadataUpdateVersion) && zA) {
                g9 g9Var = new g9(h9.f41040e);
                g9Var.d = "metadata_null";
                g9Var.a();
            }
            adInformationMetaData.AdInformation.initTransientFields();
            f40595a = adInformationMetaData;
        } else {
            f40595a = adInformationMetaData2;
        }
        f40595a.AdInformation.initImageResourceConfigBitmaps(context);
    }

    public static void a(Context context, AdInformationMetaData adInformationMetaData) {
        synchronized (f40596b) {
            adInformationMetaData.adInformationMetadataUpdateVersion = "5.2.4";
            f40595a = adInformationMetaData;
            AdInformationConfig.setDefaultValues(f40595a.AdInformation);
            f40595a.AdInformation.initImageResourceConfigBitmaps(context);
            g7.a(context, "StartappAdInfoMetadata", adInformationMetaData);
        }
    }
}
