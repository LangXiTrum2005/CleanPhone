package com.codejoy.boom.clap.helper;

import android.app.Activity;
import android.app.Application;
import com.codejoy.boom.clap.module.vip.VipInfoManager;
import com.yoadx.ad.lib.core.YoadAdSdk;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CommonHomeSupplement.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/codejoy/boom/clap/helper/CommonHomeSupplement;", "", "<init>", "()V", "Landroid/app/Application;", "application", "", "dern", "(Landroid/app/Application;)V", "Landroid/app/Activity;", "activity", "", "firstOpen", "marial", "(Landroid/app/Activity;Z)V", "beachfront", "(Landroid/app/Activity;)V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommonHomeSupplement {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final CommonHomeSupplement f18243attabal = new CommonHomeSupplement();

    public static final void competently() {
        couple.saneness.f24112attabal.saneness().triweekly("ad_scenes_hot_start_app", null);
        couple.wireman.f24115attabal.saneness().triweekly("ad_scenes_hot_start_app", null);
    }

    public static final void wireman(Application application) {
        phonoscope.attabal.attabal();
        phonoscope.attabal.attabal();
        phonoscope.attabal.dern(1150);
        phonoscope.attabal.saneness(application);
        com.yolo.networklibrary.common.util.dern.polloi(application, null);
    }

    public final void beachfront(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        kotlinx.coroutines.cutely.wireman(privatdozent.attabal(premeiotic.saneness()), premeiotic.saneness(), null, new CommonHomeSupplement$initHotUIStart$1(activity, null), 2, null);
        VipInfoManager.INSTANCE.attabal().formularize();
        YoadAdSdk.f23874attabal.impassible(new artsy.dern() { // from class: com.codejoy.boom.clap.helper.marial
            @Override // artsy.dern
            public final void attabal() {
                CommonHomeSupplement.competently();
            }
        });
    }

    public final void dern(final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        attabal.f18250attabal.attabal().execute(new Runnable() { // from class: com.codejoy.boom.clap.helper.wireman
            @Override // java.lang.Runnable
            public final void run() {
                CommonHomeSupplement.wireman(application);
            }
        });
    }

    public final void marial(Activity activity, boolean firstOpen) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        kotlinx.coroutines.cutely.wireman(privatdozent.attabal(premeiotic.saneness()), premeiotic.saneness(), null, new CommonHomeSupplement$initColdUIStart$1(activity, null), 2, null);
        VipInfoManager.INSTANCE.attabal().formularize();
    }
}
