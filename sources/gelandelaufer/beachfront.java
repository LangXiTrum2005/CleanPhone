package gelandelaufer;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DevelopmentPlatformProvider.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f26643attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public saneness f26644saneness = null;

    /* JADX INFO: compiled from: DevelopmentPlatformProvider.java */
    public class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final String f26645attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final String f26647saneness;

        public saneness() {
            int iArytenoidectomy = CommonUtils.arytenoidectomy(beachfront.this.f26643attabal, "com.google.firebase.crashlytics.unity_version", "string");
            if (iArytenoidectomy == 0) {
                if (!beachfront.this.dern("flutter_assets/NOTICES.Z")) {
                    this.f26645attabal = null;
                    this.f26647saneness = null;
                    return;
                } else {
                    this.f26645attabal = "Flutter";
                    this.f26647saneness = null;
                    competently.beachfront().taiyuan("Development platform is: Flutter");
                    return;
                }
            }
            this.f26645attabal = "Unity";
            String string = beachfront.this.f26643attabal.getResources().getString(iArytenoidectomy);
            this.f26647saneness = string;
            competently.beachfront().taiyuan("Unity Editor version is: " + string);
        }
    }

    public beachfront(Context context) {
        this.f26643attabal = context;
    }

    public final saneness beachfront() {
        if (this.f26644saneness == null) {
            this.f26644saneness = new saneness();
        }
        return this.f26644saneness;
    }

    public final boolean dern(String str) {
        if (this.f26643attabal.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f26643attabal.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public String marial() {
        return beachfront().f26647saneness;
    }

    public String wireman() {
        return beachfront().f26645attabal;
    }
}
