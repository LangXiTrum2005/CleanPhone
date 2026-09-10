package com.google.firebase.sessions;

import android.os.Build;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.p004ironsource.d9;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoSessionEventEncoder implements Configurator {

    public static final class AndroidApplicationInfoEncoder implements ObjectEncoder<AndroidApplicationInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AndroidApplicationInfoEncoder f21021a = new AndroidApplicationInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f21022b = FieldDescriptor.a(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f21023c = FieldDescriptor.a("versionName");
        public static final FieldDescriptor d = FieldDescriptor.a("appBuildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f21024e = FieldDescriptor.a("deviceManufacturer");
        public static final FieldDescriptor f = FieldDescriptor.a("currentProcessDetails");
        public static final FieldDescriptor g = FieldDescriptor.a("appProcessDetails");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            AndroidApplicationInfo androidApplicationInfo = (AndroidApplicationInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f21022b, androidApplicationInfo.f21015a);
            objectEncoderContext.f(f21023c, androidApplicationInfo.f21016b);
            objectEncoderContext.f(d, androidApplicationInfo.f21017c);
            objectEncoderContext.f(f21024e, Build.MANUFACTURER);
            objectEncoderContext.f(f, androidApplicationInfo.d);
            objectEncoderContext.f(g, androidApplicationInfo.f21018e);
        }
    }

    public static final class ApplicationInfoEncoder implements ObjectEncoder<ApplicationInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ApplicationInfoEncoder f21025a = new ApplicationInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f21026b = FieldDescriptor.a(com.smartdigimkt.f3.b.f35043u);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f21027c = FieldDescriptor.a(d9.i.f24755l);
        public static final FieldDescriptor d = FieldDescriptor.a("sessionSdkVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f21028e = FieldDescriptor.a("osVersion");
        public static final FieldDescriptor f = FieldDescriptor.a("logEnvironment");
        public static final FieldDescriptor g = FieldDescriptor.a("androidAppInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ApplicationInfo applicationInfo = (ApplicationInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f21026b, applicationInfo.f21019a);
            objectEncoderContext.f(f21027c, Build.MODEL);
            objectEncoderContext.f(d, "3.0.3");
            objectEncoderContext.f(f21028e, Build.VERSION.RELEASE);
            objectEncoderContext.f(f, LogEnvironment.LOG_ENVIRONMENT_PROD);
            objectEncoderContext.f(g, applicationInfo.f21020b);
        }
    }

    public static final class DataCollectionStatusEncoder implements ObjectEncoder<DataCollectionStatus> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DataCollectionStatusEncoder f21029a = new DataCollectionStatusEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f21030b = FieldDescriptor.a("performance");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f21031c = FieldDescriptor.a("crashlytics");
        public static final FieldDescriptor d = FieldDescriptor.a("sessionSamplingRate");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f21030b, dataCollectionStatus.f21060a);
            objectEncoderContext.f(f21031c, dataCollectionStatus.f21061b);
            objectEncoderContext.d(d, dataCollectionStatus.f21062c);
        }
    }

    public static final class ProcessDetailsEncoder implements ObjectEncoder<ProcessDetails> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProcessDetailsEncoder f21032a = new ProcessDetailsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f21033b = FieldDescriptor.a("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f21034c = FieldDescriptor.a(com.smartdigimkt.o1.b.B0);
        public static final FieldDescriptor d = FieldDescriptor.a("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f21035e = FieldDescriptor.a("defaultProcess");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ProcessDetails processDetails = (ProcessDetails) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f21033b, processDetails.f21092a);
            objectEncoderContext.c(f21034c, processDetails.f21093b);
            objectEncoderContext.c(d, processDetails.f21094c);
            objectEncoderContext.a(f21035e, processDetails.d);
        }
    }

    public static final class SessionEventEncoder implements ObjectEncoder<SessionEvent> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SessionEventEncoder f21036a = new SessionEventEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f21037b = FieldDescriptor.a("eventType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f21038c = FieldDescriptor.a("sessionData");
        public static final FieldDescriptor d = FieldDescriptor.a("applicationInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            SessionEvent sessionEvent = (SessionEvent) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            sessionEvent.getClass();
            objectEncoderContext.f(f21037b, EventType.SESSION_START);
            objectEncoderContext.f(f21038c, sessionEvent.f21099a);
            objectEncoderContext.f(d, sessionEvent.f21100b);
        }
    }

    public static final class SessionInfoEncoder implements ObjectEncoder<SessionInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SessionInfoEncoder f21039a = new SessionInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f21040b = FieldDescriptor.a(JsonStorageKeyNames.SESSION_ID_KEY);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f21041c = FieldDescriptor.a("firstSessionId");
        public static final FieldDescriptor d = FieldDescriptor.a("sessionIndex");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f21042e = FieldDescriptor.a("eventTimestampUs");
        public static final FieldDescriptor f = FieldDescriptor.a("dataCollectionStatus");
        public static final FieldDescriptor g = FieldDescriptor.a("firebaseInstallationId");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f21043h = FieldDescriptor.a("firebaseAuthenticationToken");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            SessionInfo sessionInfo = (SessionInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f21040b, sessionInfo.f21117a);
            objectEncoderContext.f(f21041c, sessionInfo.f21118b);
            objectEncoderContext.c(d, sessionInfo.f21119c);
            objectEncoderContext.b(f21042e, sessionInfo.d);
            objectEncoderContext.f(f, sessionInfo.f21120e);
            objectEncoderContext.f(g, sessionInfo.f);
            objectEncoderContext.f(f21043h, sessionInfo.g);
        }
    }
}
