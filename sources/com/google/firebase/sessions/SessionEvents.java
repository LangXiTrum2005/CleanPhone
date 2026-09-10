package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/SessionEvents;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SessionEvents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SessionEvents f21101a = new SessionEvents();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DataEncoder f21102b;

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder = new JsonDataEncoderBuilder();
        jsonDataEncoderBuilder.b(SessionEvent.class, AutoSessionEventEncoder.SessionEventEncoder.f21036a);
        jsonDataEncoderBuilder.b(SessionInfo.class, AutoSessionEventEncoder.SessionInfoEncoder.f21039a);
        jsonDataEncoderBuilder.b(DataCollectionStatus.class, AutoSessionEventEncoder.DataCollectionStatusEncoder.f21029a);
        jsonDataEncoderBuilder.b(ApplicationInfo.class, AutoSessionEventEncoder.ApplicationInfoEncoder.f21025a);
        jsonDataEncoderBuilder.b(AndroidApplicationInfo.class, AutoSessionEventEncoder.AndroidApplicationInfoEncoder.f21021a);
        jsonDataEncoderBuilder.b(ProcessDetails.class, AutoSessionEventEncoder.ProcessDetailsEncoder.f21032a);
        jsonDataEncoderBuilder.d = true;
        f21102b = jsonDataEncoderBuilder.a();
    }

    public static ApplicationInfo a(FirebaseApp firebaseApp) throws PackageManager.NameNotFoundException {
        firebaseApp.a();
        Context context = firebaseApp.f20145a;
        Intrinsics.e(context, "getApplicationContext(...)");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        firebaseApp.a();
        String str = firebaseApp.f20147c.f20155b;
        Intrinsics.e(str, "getApplicationId(...)");
        String MODEL = Build.MODEL;
        Intrinsics.e(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.e(RELEASE, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        Intrinsics.c(packageName);
        String str2 = packageInfo.versionName;
        String str3 = str2 == null ? strValueOf : str2;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.e(MANUFACTURER, "MANUFACTURER");
        firebaseApp.a();
        ProcessDetails processDetailsB = ProcessDetailsProvider.b(context);
        firebaseApp.a();
        return new ApplicationInfo(str, new AndroidApplicationInfo(packageName, str3, strValueOf, processDetailsB, ProcessDetailsProvider.a(context)));
    }
}
