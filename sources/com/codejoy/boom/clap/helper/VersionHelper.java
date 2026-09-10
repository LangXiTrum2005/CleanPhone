package com.codejoy.boom.clap.helper;

import incidentally.VersionResponse;
import kotlinx.coroutines.premeiotic;
import kotlinx.coroutines.privatdozent;
import kotlinx.coroutines.saran;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VersionHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bR\u001c\u0010\u000e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/codejoy/boom/clap/helper/VersionHelper;", "", "<init>", "()V", "", "dern", "", "marial", "()Z", "wireman", "", "kotlin.jvm.PlatformType", "saneness", "Ljava/lang/String;", "TAG", "Lkotlinx/coroutines/saran;", "Lkotlinx/coroutines/saran;", "IO", "Lincidentally/attabal;", "Lincidentally/attabal;", "versionInfo", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VersionHelper {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static VersionResponse versionInfo;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final VersionHelper f18244attabal = new VersionHelper();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = VersionHelper.class.getSimpleName();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static final saran IO = privatdozent.attabal(premeiotic.saneness());

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final int f18246marial = 8;

    public final void dern() {
        kotlinx.coroutines.cutely.wireman(IO, premeiotic.saneness(), null, new VersionHelper$getVersionInfo$1(null), 2, null);
    }

    public final boolean marial() {
        VersionResponse versionResponse = versionInfo;
        if (versionResponse != null) {
            return versionResponse.getIsNew();
        }
        return true;
    }

    public final boolean wireman() {
        VersionResponse versionResponse = versionInfo;
        boolean isNew = versionResponse != null ? versionResponse.getIsNew() : true;
        dern dernVar = dern.f18260attabal;
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        impromptu impromptuVar = impromptu.f18262attabal;
        dernVar.saneness(TAG2, "hasNewVersion: " + isNew + ", " + impromptuVar.saneness());
        return isNew || impromptuVar.saneness();
    }
}
