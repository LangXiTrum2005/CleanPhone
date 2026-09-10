package com.google.firebase.sessions;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;

/* JADX INFO: compiled from: AutoSessionEventEncoder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class dern implements macropsia.attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final macropsia.attabal f22953attabal = new dern();

    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    public static final class attabal implements derbyshire.wireman<AndroidApplicationInfo> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f22954attabal = new attabal();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final derbyshire.dern f22959saneness = derbyshire.dern.wireman(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final derbyshire.dern f22957dern = derbyshire.dern.wireman("versionName");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final derbyshire.dern f22960wireman = derbyshire.dern.wireman("appBuildVersion");

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final derbyshire.dern f22958marial = derbyshire.dern.wireman("deviceManufacturer");

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final derbyshire.dern f22955beachfront = derbyshire.dern.wireman("currentProcessDetails");

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static final derbyshire.dern f22956competently = derbyshire.dern.wireman("appProcessDetails");

        @Override // derbyshire.saneness
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void attabal(AndroidApplicationInfo androidApplicationInfo, derbyshire.marial marialVar) throws IOException {
            marialVar.beachfront(f22959saneness, androidApplicationInfo.getPackageName());
            marialVar.beachfront(f22957dern, androidApplicationInfo.getVersionName());
            marialVar.beachfront(f22960wireman, androidApplicationInfo.getAppBuildVersion());
            marialVar.beachfront(f22958marial, androidApplicationInfo.getDeviceManufacturer());
            marialVar.beachfront(f22955beachfront, androidApplicationInfo.getCurrentProcessDetails());
            marialVar.beachfront(f22956competently, androidApplicationInfo.saneness());
        }
    }

    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    public static final class beachfront implements derbyshire.wireman<SessionInfo> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final beachfront f22961attabal = new beachfront();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final derbyshire.dern f22967saneness = derbyshire.dern.wireman(JsonStorageKeyNames.SESSION_ID_KEY);

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final derbyshire.dern f22964dern = derbyshire.dern.wireman("firstSessionId");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final derbyshire.dern f22968wireman = derbyshire.dern.wireman("sessionIndex");

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final derbyshire.dern f22966marial = derbyshire.dern.wireman("eventTimestampUs");

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final derbyshire.dern f22962beachfront = derbyshire.dern.wireman("dataCollectionStatus");

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static final derbyshire.dern f22963competently = derbyshire.dern.wireman("firebaseInstallationId");

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public static final derbyshire.dern f22965impromptu = derbyshire.dern.wireman("firebaseAuthenticationToken");

        @Override // derbyshire.saneness
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void attabal(SessionInfo sessionInfo, derbyshire.marial marialVar) throws IOException {
            marialVar.beachfront(f22967saneness, sessionInfo.getSessionId());
            marialVar.beachfront(f22964dern, sessionInfo.getFirstSessionId());
            marialVar.dern(f22968wireman, sessionInfo.getSessionIndex());
            marialVar.wireman(f22966marial, sessionInfo.getEventTimestampUs());
            marialVar.beachfront(f22962beachfront, sessionInfo.getDataCollectionStatus());
            marialVar.beachfront(f22963competently, sessionInfo.getFirebaseInstallationId());
            marialVar.beachfront(f22965impromptu, sessionInfo.getFirebaseAuthenticationToken());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.sessions.dern$dern, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    public static final class C0330dern implements derbyshire.wireman<DataCollectionStatus> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final C0330dern f22969attabal = new C0330dern();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final derbyshire.dern f22971saneness = derbyshire.dern.wireman("performance");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final derbyshire.dern f22970dern = derbyshire.dern.wireman("crashlytics");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final derbyshire.dern f22972wireman = derbyshire.dern.wireman("sessionSamplingRate");

        @Override // derbyshire.saneness
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void attabal(DataCollectionStatus dataCollectionStatus, derbyshire.marial marialVar) throws IOException {
            marialVar.beachfront(f22971saneness, dataCollectionStatus.getPerformance());
            marialVar.beachfront(f22970dern, dataCollectionStatus.getCrashlytics());
            marialVar.marial(f22972wireman, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    public static final class marial implements derbyshire.wireman<SessionEvent> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final marial f22973attabal = new marial();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final derbyshire.dern f22975saneness = derbyshire.dern.wireman("eventType");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final derbyshire.dern f22974dern = derbyshire.dern.wireman("sessionData");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final derbyshire.dern f22976wireman = derbyshire.dern.wireman("applicationInfo");

        @Override // derbyshire.saneness
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void attabal(SessionEvent sessionEvent, derbyshire.marial marialVar) throws IOException {
            marialVar.beachfront(f22975saneness, sessionEvent.getEventType());
            marialVar.beachfront(f22974dern, sessionEvent.getSessionData());
            marialVar.beachfront(f22976wireman, sessionEvent.getApplicationInfo());
        }
    }

    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    public static final class saneness implements derbyshire.wireman<ApplicationInfo> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final saneness f22977attabal = new saneness();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final derbyshire.dern f22982saneness = derbyshire.dern.wireman("appId");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final derbyshire.dern f22980dern = derbyshire.dern.wireman("deviceModel");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final derbyshire.dern f22983wireman = derbyshire.dern.wireman("sessionSdkVersion");

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final derbyshire.dern f22981marial = derbyshire.dern.wireman("osVersion");

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public static final derbyshire.dern f22978beachfront = derbyshire.dern.wireman("logEnvironment");

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public static final derbyshire.dern f22979competently = derbyshire.dern.wireman("androidAppInfo");

        @Override // derbyshire.saneness
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void attabal(ApplicationInfo applicationInfo, derbyshire.marial marialVar) throws IOException {
            marialVar.beachfront(f22982saneness, applicationInfo.getAppId());
            marialVar.beachfront(f22980dern, applicationInfo.getDeviceModel());
            marialVar.beachfront(f22983wireman, applicationInfo.getSessionSdkVersion());
            marialVar.beachfront(f22981marial, applicationInfo.getOsVersion());
            marialVar.beachfront(f22978beachfront, applicationInfo.getLogEnvironment());
            marialVar.beachfront(f22979competently, applicationInfo.getAndroidAppInfo());
        }
    }

    /* JADX INFO: compiled from: AutoSessionEventEncoder.java */
    public static final class wireman implements derbyshire.wireman<ProcessDetails> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final wireman f22984attabal = new wireman();

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final derbyshire.dern f22987saneness = derbyshire.dern.wireman("processName");

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public static final derbyshire.dern f22985dern = derbyshire.dern.wireman("pid");

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public static final derbyshire.dern f22988wireman = derbyshire.dern.wireman("importance");

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public static final derbyshire.dern f22986marial = derbyshire.dern.wireman("defaultProcess");

        @Override // derbyshire.saneness
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public void attabal(ProcessDetails processDetails, derbyshire.marial marialVar) throws IOException {
            marialVar.beachfront(f22987saneness, processDetails.getProcessName());
            marialVar.dern(f22985dern, processDetails.getPid());
            marialVar.dern(f22988wireman, processDetails.getImportance());
            marialVar.saneness(f22986marial, processDetails.getIsDefaultProcess());
        }
    }

    @Override // macropsia.attabal
    public void attabal(macropsia.saneness<?> sanenessVar) {
        sanenessVar.attabal(SessionEvent.class, marial.f22973attabal);
        sanenessVar.attabal(SessionInfo.class, beachfront.f22961attabal);
        sanenessVar.attabal(DataCollectionStatus.class, C0330dern.f22969attabal);
        sanenessVar.attabal(ApplicationInfo.class, saneness.f22977attabal);
        sanenessVar.attabal(AndroidApplicationInfo.class, attabal.f22954attabal);
        sanenessVar.attabal(ProcessDetails.class, wireman.f22984attabal);
    }
}
