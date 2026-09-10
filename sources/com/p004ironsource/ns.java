package com.p004ironsource;

import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010 \u001a\u00020\u0000¢\u0006\u0004\b\u001e\u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/ironsource/ns;", "", "Lcom/ironsource/ws;", g.f40227p, "a", "Lcom/ironsource/ws;", "sdkInitResponse", "Lcom/ironsource/qt;", "d", "()Lcom/ironsource/qt;", "legacyInitResponse", "Lcom/ironsource/j4;", "()Lcom/ironsource/j4;", "applicationGeneralSettings", "Lcom/ironsource/in;", "e", "()Lcom/ironsource/in;", "loggerSettings", "Lcom/ironsource/c4;", "b", "()Lcom/ironsource/c4;", "crashReporterSettings", "Lcom/ironsource/nc;", "c", "()Lcom/ironsource/nc;", xs.d, "Lcom/ironsource/qt$a;", f.j, "()Lcom/ironsource/qt$a;", "responseOrigin", "<init>", "(Lcom/ironsource/ws;)V", "sdkConfig", "(Lcom/ironsource/ns;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class ns {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ws sdkInitResponse;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ns(ns sdkConfig) {
        this(sdkConfig.sdkInitResponse);
        Intrinsics.f(sdkConfig, "sdkConfig");
    }

    public final j4 a() {
        return this.sdkInitResponse.getConfigurations().getApplicationConfigurations().getGeneralSettings();
    }

    public final c4 b() {
        return this.sdkInitResponse.getConfigurations().getApplicationConfigurations().getCrashReporter();
    }

    public final nc c() {
        return this.sdkInitResponse.getExperiments();
    }

    public final qt d() {
        return this.sdkInitResponse.getFullResponse();
    }

    public final in e() {
        return this.sdkInitResponse.getConfigurations().getApplicationConfigurations().getLogger();
    }

    public final qt.a f() {
        qt.a aVarH = this.sdkInitResponse.getFullResponse().h();
        Intrinsics.e(aVarH, "sdkInitResponse.fullResponse.origin");
        return aVarH;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ws getSdkInitResponse() {
        return this.sdkInitResponse;
    }

    public ns(ws sdkInitResponse) {
        Intrinsics.f(sdkInitResponse, "sdkInitResponse");
        this.sdkInitResponse = sdkInitResponse;
    }
}
