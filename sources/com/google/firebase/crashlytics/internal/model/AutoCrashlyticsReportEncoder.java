package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.p004ironsource.d9;
import com.p004ironsource.ne;
import com.smartdigimkt.o1.b;
import com.smartdigimkt.x.g;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AutoCrashlyticsReportEncoder f20423a = new AutoCrashlyticsReportEncoder();

    public static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder f20424a = new CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20425b = FieldDescriptor.a("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20426c = FieldDescriptor.a("libraryName");
        public static final FieldDescriptor d = FieldDescriptor.a("buildId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20425b, buildIdMappingForArch.b());
            objectEncoderContext.f(f20426c, buildIdMappingForArch.d());
            objectEncoderContext.f(d, buildIdMappingForArch.c());
        }
    }

    public static final class CrashlyticsReportApplicationExitInfoEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportApplicationExitInfoEncoder f20427a = new CrashlyticsReportApplicationExitInfoEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20428b = FieldDescriptor.a(b.B0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20429c = FieldDescriptor.a("processName");
        public static final FieldDescriptor d = FieldDescriptor.a("reasonCode");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20430e = FieldDescriptor.a("importance");
        public static final FieldDescriptor f = FieldDescriptor.a("pss");
        public static final FieldDescriptor g = FieldDescriptor.a("rss");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f20431h = FieldDescriptor.a("timestamp");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f20432i = FieldDescriptor.a("traceFile");
        public static final FieldDescriptor j = FieldDescriptor.a("buildIdMappingForArch");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.c(f20428b, applicationExitInfo.d());
            objectEncoderContext.f(f20429c, applicationExitInfo.e());
            objectEncoderContext.c(d, applicationExitInfo.g());
            objectEncoderContext.c(f20430e, applicationExitInfo.c());
            objectEncoderContext.b(f, applicationExitInfo.f());
            objectEncoderContext.b(g, applicationExitInfo.h());
            objectEncoderContext.b(f20431h, applicationExitInfo.i());
            objectEncoderContext.f(f20432i, applicationExitInfo.j());
            objectEncoderContext.f(j, applicationExitInfo.b());
        }
    }

    public static final class CrashlyticsReportCustomAttributeEncoder implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportCustomAttributeEncoder f20433a = new CrashlyticsReportCustomAttributeEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20434b = FieldDescriptor.a("key");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20435c = FieldDescriptor.a("value");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20434b, customAttribute.b());
            objectEncoderContext.f(f20435c, customAttribute.c());
        }
    }

    public static final class CrashlyticsReportEncoder implements ObjectEncoder<CrashlyticsReport> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportEncoder f20436a = new CrashlyticsReportEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20437b = FieldDescriptor.a("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20438c = FieldDescriptor.a("gmpAppId");
        public static final FieldDescriptor d = FieldDescriptor.a("platform");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20439e = FieldDescriptor.a("installationUuid");
        public static final FieldDescriptor f = FieldDescriptor.a("firebaseInstallationId");
        public static final FieldDescriptor g = FieldDescriptor.a("firebaseAuthenticationToken");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f20440h = FieldDescriptor.a("appQualitySessionId");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f20441i = FieldDescriptor.a("buildVersion");
        public static final FieldDescriptor j = FieldDescriptor.a("displayVersion");
        public static final FieldDescriptor k = FieldDescriptor.a("session");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f20442l = FieldDescriptor.a("ndkPayload");
        public static final FieldDescriptor m = FieldDescriptor.a("appExitInfo");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20437b, crashlyticsReport.l());
            objectEncoderContext.f(f20438c, crashlyticsReport.h());
            objectEncoderContext.c(d, crashlyticsReport.k());
            objectEncoderContext.f(f20439e, crashlyticsReport.i());
            objectEncoderContext.f(f, crashlyticsReport.g());
            objectEncoderContext.f(g, crashlyticsReport.f());
            objectEncoderContext.f(f20440h, crashlyticsReport.c());
            objectEncoderContext.f(f20441i, crashlyticsReport.d());
            objectEncoderContext.f(j, crashlyticsReport.e());
            objectEncoderContext.f(k, crashlyticsReport.m());
            objectEncoderContext.f(f20442l, crashlyticsReport.j());
            objectEncoderContext.f(m, crashlyticsReport.b());
        }
    }

    public static final class CrashlyticsReportFilesPayloadEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportFilesPayloadEncoder f20443a = new CrashlyticsReportFilesPayloadEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20444b = FieldDescriptor.a("files");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20445c = FieldDescriptor.a("orgId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20444b, filesPayload.b());
            objectEncoderContext.f(f20445c, filesPayload.c());
        }
    }

    public static final class CrashlyticsReportFilesPayloadFileEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportFilesPayloadFileEncoder f20446a = new CrashlyticsReportFilesPayloadFileEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20447b = FieldDescriptor.a("filename");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20448c = FieldDescriptor.a("contents");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20447b, file.c());
            objectEncoderContext.f(f20448c, file.b());
        }
    }

    public static final class CrashlyticsReportSessionApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionApplicationEncoder f20449a = new CrashlyticsReportSessionApplicationEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20450b = FieldDescriptor.a("identifier");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20451c = FieldDescriptor.a("version");
        public static final FieldDescriptor d = FieldDescriptor.a("displayVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20452e = FieldDescriptor.a("organization");
        public static final FieldDescriptor f = FieldDescriptor.a("installationUuid");
        public static final FieldDescriptor g = FieldDescriptor.a("developmentPlatform");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f20453h = FieldDescriptor.a("developmentPlatformVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20450b, application.e());
            objectEncoderContext.f(f20451c, application.h());
            objectEncoderContext.f(d, application.d());
            objectEncoderContext.f(f20452e, application.g());
            objectEncoderContext.f(f, application.f());
            objectEncoderContext.f(g, application.b());
            objectEncoderContext.f(f20453h, application.c());
        }
    }

    public static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionApplicationOrganizationEncoder f20454a = new CrashlyticsReportSessionApplicationOrganizationEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20455b = FieldDescriptor.a("clsId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((CrashlyticsReport.Session.Application.Organization) obj).getClass();
            ((ObjectEncoderContext) obj2).f(f20455b, null);
        }
    }

    public static final class CrashlyticsReportSessionDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Device> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionDeviceEncoder f20456a = new CrashlyticsReportSessionDeviceEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20457b = FieldDescriptor.a("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20458c = FieldDescriptor.a("model");
        public static final FieldDescriptor d = FieldDescriptor.a("cores");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20459e = FieldDescriptor.a("ram");
        public static final FieldDescriptor f = FieldDescriptor.a("diskSpace");
        public static final FieldDescriptor g = FieldDescriptor.a("simulator");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f20460h = FieldDescriptor.a("state");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f20461i = FieldDescriptor.a("manufacturer");
        public static final FieldDescriptor j = FieldDescriptor.a("modelClass");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.c(f20457b, device.b());
            objectEncoderContext.f(f20458c, device.f());
            objectEncoderContext.c(d, device.c());
            objectEncoderContext.b(f20459e, device.h());
            objectEncoderContext.b(f, device.d());
            objectEncoderContext.a(g, device.j());
            objectEncoderContext.c(f20460h, device.i());
            objectEncoderContext.f(f20461i, device.e());
            objectEncoderContext.f(j, device.g());
        }
    }

    public static final class CrashlyticsReportSessionEncoder implements ObjectEncoder<CrashlyticsReport.Session> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEncoder f20462a = new CrashlyticsReportSessionEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20463b = FieldDescriptor.a("generator");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20464c = FieldDescriptor.a("identifier");
        public static final FieldDescriptor d = FieldDescriptor.a("appQualitySessionId");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20465e = FieldDescriptor.a("startedAt");
        public static final FieldDescriptor f = FieldDescriptor.a("endedAt");
        public static final FieldDescriptor g = FieldDescriptor.a("crashed");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f20466h = FieldDescriptor.a("app");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final FieldDescriptor f20467i = FieldDescriptor.a("user");
        public static final FieldDescriptor j = FieldDescriptor.a(ne.f26256E);
        public static final FieldDescriptor k = FieldDescriptor.a(d9.h.G);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final FieldDescriptor f20468l = FieldDescriptor.a("events");
        public static final FieldDescriptor m = FieldDescriptor.a("generatorType");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20463b, session.g());
            objectEncoderContext.f(f20464c, session.i().getBytes(CrashlyticsReport.f20713a));
            objectEncoderContext.f(d, session.c());
            objectEncoderContext.b(f20465e, session.k());
            objectEncoderContext.f(f, session.e());
            objectEncoderContext.a(g, session.m());
            objectEncoderContext.f(f20466h, session.b());
            objectEncoderContext.f(f20467i, session.l());
            objectEncoderContext.f(j, session.j());
            objectEncoderContext.f(k, session.d());
            objectEncoderContext.f(f20468l, session.f());
            objectEncoderContext.c(m, session.h());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationEncoder f20469a = new CrashlyticsReportSessionEventApplicationEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20470b = FieldDescriptor.a("execution");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20471c = FieldDescriptor.a("customAttributes");
        public static final FieldDescriptor d = FieldDescriptor.a("internalKeys");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20472e = FieldDescriptor.a("background");
        public static final FieldDescriptor f = FieldDescriptor.a("currentProcessDetails");
        public static final FieldDescriptor g = FieldDescriptor.a("appProcessDetails");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final FieldDescriptor f20473h = FieldDescriptor.a("uiOrientation");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20470b, application.f());
            objectEncoderContext.f(f20471c, application.e());
            objectEncoderContext.f(d, application.g());
            objectEncoderContext.f(f20472e, application.c());
            objectEncoderContext.f(f, application.d());
            objectEncoderContext.f(g, application.b());
            objectEncoderContext.c(f20473h, application.h());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder f20474a = new CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20475b = FieldDescriptor.a("baseAddress");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20476c = FieldDescriptor.a("size");
        public static final FieldDescriptor d = FieldDescriptor.a("name");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20477e = FieldDescriptor.a("uuid");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f20475b, binaryImage.b());
            objectEncoderContext.b(f20476c, binaryImage.d());
            objectEncoderContext.f(d, binaryImage.c());
            String strE = binaryImage.e();
            objectEncoderContext.f(f20477e, strE != null ? strE.getBytes(CrashlyticsReport.f20713a) : null);
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionEncoder f20478a = new CrashlyticsReportSessionEventApplicationExecutionEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20479b = FieldDescriptor.a("threads");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20480c = FieldDescriptor.a(g.f39715A);
        public static final FieldDescriptor d = FieldDescriptor.a("appExitInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20481e = FieldDescriptor.a("signal");
        public static final FieldDescriptor f = FieldDescriptor.a("binaries");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20479b, execution.f());
            objectEncoderContext.f(f20480c, execution.d());
            objectEncoderContext.f(d, execution.b());
            objectEncoderContext.f(f20481e, execution.e());
            objectEncoderContext.f(f, execution.c());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder f20482a = new CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20483b = FieldDescriptor.a("type");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20484c = FieldDescriptor.a("reason");
        public static final FieldDescriptor d = FieldDescriptor.a("frames");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20485e = FieldDescriptor.a("causedBy");
        public static final FieldDescriptor f = FieldDescriptor.a("overflowCount");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Exception exception = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20483b, exception.f());
            objectEncoderContext.f(f20484c, exception.e());
            objectEncoderContext.f(d, exception.c());
            objectEncoderContext.f(f20485e, exception.b());
            objectEncoderContext.c(f, exception.d());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder f20486a = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20487b = FieldDescriptor.a("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20488c = FieldDescriptor.a("code");
        public static final FieldDescriptor d = FieldDescriptor.a("address");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20487b, signal.d());
            objectEncoderContext.f(f20488c, signal.c());
            objectEncoderContext.b(d, signal.b());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder f20489a = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20490b = FieldDescriptor.a("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20491c = FieldDescriptor.a("importance");
        public static final FieldDescriptor d = FieldDescriptor.a("frames");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20490b, thread.d());
            objectEncoderContext.c(f20491c, thread.c());
            objectEncoderContext.f(d, thread.b());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder f20492a = new CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20493b = FieldDescriptor.a("pc");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20494c = FieldDescriptor.a("symbol");
        public static final FieldDescriptor d = FieldDescriptor.a(d9.h.f24719b);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20495e = FieldDescriptor.a("offset");
        public static final FieldDescriptor f = FieldDescriptor.a("importance");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f20493b, frame.e());
            objectEncoderContext.f(f20494c, frame.f());
            objectEncoderContext.f(d, frame.b());
            objectEncoderContext.b(f20495e, frame.d());
            objectEncoderContext.c(f, frame.c());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationProcessDetailsEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.ProcessDetails> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventApplicationProcessDetailsEncoder f20496a = new CrashlyticsReportSessionEventApplicationProcessDetailsEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20497b = FieldDescriptor.a("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20498c = FieldDescriptor.a(b.B0);
        public static final FieldDescriptor d = FieldDescriptor.a("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20499e = FieldDescriptor.a("defaultProcess");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails = (CrashlyticsReport.Session.Event.Application.ProcessDetails) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20497b, processDetails.d());
            objectEncoderContext.c(f20498c, processDetails.c());
            objectEncoderContext.c(d, processDetails.b());
            objectEncoderContext.a(f20499e, processDetails.e());
        }
    }

    public static final class CrashlyticsReportSessionEventDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventDeviceEncoder f20500a = new CrashlyticsReportSessionEventDeviceEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20501b = FieldDescriptor.a(d9.i.f24746Y);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20502c = FieldDescriptor.a("batteryVelocity");
        public static final FieldDescriptor d = FieldDescriptor.a("proximityOn");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20503e = FieldDescriptor.a("orientation");
        public static final FieldDescriptor f = FieldDescriptor.a("ramUsed");
        public static final FieldDescriptor g = FieldDescriptor.a("diskUsed");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20501b, device.b());
            objectEncoderContext.c(f20502c, device.c());
            objectEncoderContext.a(d, device.g());
            objectEncoderContext.c(f20503e, device.e());
            objectEncoderContext.b(f, device.f());
            objectEncoderContext.b(g, device.d());
        }
    }

    public static final class CrashlyticsReportSessionEventEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventEncoder f20504a = new CrashlyticsReportSessionEventEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20505b = FieldDescriptor.a("timestamp");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20506c = FieldDescriptor.a("type");
        public static final FieldDescriptor d = FieldDescriptor.a("app");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20507e = FieldDescriptor.a(d9.h.G);
        public static final FieldDescriptor f = FieldDescriptor.a("log");
        public static final FieldDescriptor g = FieldDescriptor.a("rollouts");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.b(f20505b, event.f());
            objectEncoderContext.f(f20506c, event.g());
            objectEncoderContext.f(d, event.b());
            objectEncoderContext.f(f20507e, event.c());
            objectEncoderContext.f(f, event.d());
            objectEncoderContext.f(g, event.e());
        }
    }

    public static final class CrashlyticsReportSessionEventLogEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventLogEncoder f20508a = new CrashlyticsReportSessionEventLogEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20509b = FieldDescriptor.a("content");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).f(f20509b, ((CrashlyticsReport.Session.Event.Log) obj).b());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutAssignmentEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutAssignmentEncoder f20510a = new CrashlyticsReportSessionEventRolloutAssignmentEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20511b = FieldDescriptor.a("rolloutVariant");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20512c = FieldDescriptor.a("parameterKey");
        public static final FieldDescriptor d = FieldDescriptor.a("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20513e = FieldDescriptor.a("templateVersion");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20511b, rolloutAssignment.d());
            objectEncoderContext.f(f20512c, rolloutAssignment.b());
            objectEncoderContext.f(d, rolloutAssignment.c());
            objectEncoderContext.b(f20513e, rolloutAssignment.e());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder f20514a = new CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20515b = FieldDescriptor.a("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20516c = FieldDescriptor.a("variantId");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant = (CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.f(f20515b, rolloutVariant.b());
            objectEncoderContext.f(f20516c, rolloutVariant.c());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutsStateEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutsState> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionEventRolloutsStateEncoder f20517a = new CrashlyticsReportSessionEventRolloutsStateEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20518b = FieldDescriptor.a("assignments");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).f(f20518b, ((CrashlyticsReport.Session.Event.RolloutsState) obj).b());
        }
    }

    public static final class CrashlyticsReportSessionOperatingSystemEncoder implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionOperatingSystemEncoder f20519a = new CrashlyticsReportSessionOperatingSystemEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20520b = FieldDescriptor.a("platform");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FieldDescriptor f20521c = FieldDescriptor.a("version");
        public static final FieldDescriptor d = FieldDescriptor.a("buildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final FieldDescriptor f20522e = FieldDescriptor.a("jailbroken");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.c(f20520b, operatingSystem.c());
            objectEncoderContext.f(f20521c, operatingSystem.d());
            objectEncoderContext.f(d, operatingSystem.b());
            objectEncoderContext.a(f20522e, operatingSystem.e());
        }
    }

    public static final class CrashlyticsReportSessionUserEncoder implements ObjectEncoder<CrashlyticsReport.Session.User> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CrashlyticsReportSessionUserEncoder f20523a = new CrashlyticsReportSessionUserEncoder();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FieldDescriptor f20524b = FieldDescriptor.a("identifier");

        @Override // com.google.firebase.encoders.ObjectEncoder
        public final void a(Object obj, Object obj2) {
            ((ObjectEncoderContext) obj2).f(f20524b, ((CrashlyticsReport.Session.User) obj).b());
        }
    }

    public final void a(EncoderConfig encoderConfig) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.f20436a;
        JsonDataEncoderBuilder jsonDataEncoderBuilder = (JsonDataEncoderBuilder) encoderConfig;
        jsonDataEncoderBuilder.b(CrashlyticsReport.class, crashlyticsReportEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.f20462a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.f20449a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.f20454a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.f20523a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.f20519a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.f20456a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.f20504a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.f20469a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.f20478a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.f20489a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder.f20492a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.class, crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder crashlyticsReportSessionEventApplicationExecutionExceptionEncoder = CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder.f20482a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.class, crashlyticsReportSessionEventApplicationExecutionExceptionEncoder);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.f20427a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.f20424a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.f20486a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder = CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder.f20474a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.class, crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.f20433a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventApplicationProcessDetailsEncoder crashlyticsReportSessionEventApplicationProcessDetailsEncoder = CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.f20496a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Application_ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.f20500a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.f20508a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportSessionEventRolloutsStateEncoder crashlyticsReportSessionEventRolloutsStateEncoder = CrashlyticsReportSessionEventRolloutsStateEncoder.f20517a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentEncoder crashlyticsReportSessionEventRolloutAssignmentEncoder = CrashlyticsReportSessionEventRolloutAssignmentEncoder.f20510a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder = CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder.f20514a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.class, crashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.f20443a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.f20446a;
        jsonDataEncoderBuilder.b(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        jsonDataEncoderBuilder.b(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}
