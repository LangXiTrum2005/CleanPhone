package com.google.firebase.crashlytics.internal;

import android.content.Context;
import com.adcolony.sdk.AdColonyAppOptions;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.smartdigimkt.v0.k;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class DevelopmentPlatformProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DevelopmentPlatform f20286b = null;

    public class DevelopmentPlatform {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20288b;

        public DevelopmentPlatform(DevelopmentPlatformProvider developmentPlatformProvider) {
            int iD = CommonUtils.d(developmentPlatformProvider.f20285a, "com.google.firebase.crashlytics.unity_version", k.f38992h);
            Logger logger = Logger.f20289a;
            Context context = developmentPlatformProvider.f20285a;
            if (iD != 0) {
                this.f20287a = AdColonyAppOptions.UNITY;
                String string = context.getResources().getString(iD);
                this.f20288b = string;
                logger.e("Unity Editor version is: " + string);
                return;
            }
            if (context.getAssets() != null) {
                try {
                    InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
                    if (inputStreamOpen != null) {
                        inputStreamOpen.close();
                    }
                    this.f20287a = "Flutter";
                    this.f20288b = null;
                    logger.e("Development platform is: Flutter");
                    return;
                } catch (IOException unused) {
                }
            }
            this.f20287a = null;
            this.f20288b = null;
        }
    }

    public DevelopmentPlatformProvider(Context context) {
        this.f20285a = context;
    }

    public final String a() {
        if (this.f20286b == null) {
            this.f20286b = new DevelopmentPlatform(this);
        }
        return this.f20286b.f20287a;
    }

    public final String b() {
        if (this.f20286b == null) {
            this.f20286b = new DevelopmentPlatform(this);
        }
        return this.f20286b.f20288b;
    }
}
