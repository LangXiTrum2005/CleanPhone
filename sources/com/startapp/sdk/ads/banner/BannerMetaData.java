package com.startapp.sdk.ads.banner;

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
public class BannerMetaData implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f40420a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile BannerMetaData f40421b = new BannerMetaData();
    private static final long serialVersionUID = -6987543640616659467L;

    @TypeInfo(complex = true)
    private BannerOptions BannerOptions = new BannerOptions();
    private String bannerMetadataUpdateVersion = "5.2.4";

    public static BannerMetaData c() {
        return f40421b;
    }

    public final BannerOptions a() {
        return this.BannerOptions;
    }

    public final BannerOptions b() {
        return new BannerOptions(this.BannerOptions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BannerMetaData bannerMetaData = (BannerMetaData) obj;
            if (vi.a((Object) this.BannerOptions, (Object) bannerMetaData.BannerOptions) && vi.a((Object) this.bannerMetadataUpdateVersion, (Object) bannerMetaData.bannerMetadataUpdateVersion)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.BannerOptions, this.bannerMetadataUpdateVersion};
        WeakHashMap weakHashMap = vi.f41589a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, BannerMetaData bannerMetaData) {
        synchronized (f40420a) {
            bannerMetaData.bannerMetadataUpdateVersion = "5.2.4";
            f40421b = bannerMetaData;
            g7.a(context, "StartappBannerMetadata", bannerMetaData);
        }
    }

    public static void a(Context context) {
        BannerMetaData bannerMetaData = (BannerMetaData) g7.c(context, "StartappBannerMetadata");
        BannerMetaData bannerMetaData2 = new BannerMetaData();
        if (bannerMetaData != null) {
            boolean zA = vi.a((Serializable) bannerMetaData, (Serializable) bannerMetaData2);
            if ("5.2.4".equals(bannerMetaData.bannerMetadataUpdateVersion) && zA) {
                g9 g9Var = new g9(h9.f41040e);
                g9Var.d = "metadata_null";
                g9Var.a();
            }
            f40421b = bannerMetaData;
            return;
        }
        f40421b = bannerMetaData2;
    }
}
