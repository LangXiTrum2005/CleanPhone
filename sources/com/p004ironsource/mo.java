package com.p004ironsource;

import com.p004ironsource.mediationsdk.IronSource;
import com.smartdigimkt.h5.f;
import com.smartdigimkt.y4.g;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0005\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\f\u0010\u001a\"\u0004\b\u0005\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/ironsource/mo;", "", "", g.f40227p, "Lcom/ironsource/er;", "a", "Lcom/ironsource/er;", "e", "()Lcom/ironsource/er;", "(Lcom/ironsource/er;)V", "providersSettingsHolder", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "c", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "", "Ljava/lang/String;", f.j, "()Ljava/lang/String;", "(Ljava/lang/String;)V", JsonStorageKeyNames.SESSION_ID_KEY, "Lcom/ironsource/u8;", "d", "Lcom/ironsource/u8;", "()Lcom/ironsource/u8;", "(Lcom/ironsource/u8;)V", "adFormatConfiguration", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class mo {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile mo f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private er providersSettingsHolder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean initialized;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String sessionId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private u8 adFormatConfiguration;

    /* JADX INFO: renamed from: com.ironsource.mo$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0003\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/ironsource/mo$a;", "", "Lcom/ironsource/mo;", "a", "Lcom/ironsource/mediationsdk/IronSource$AD_UNIT;", "Lcom/unity3d/ironsourceads/internal/AdFormat;", "adFormat", "Lcom/ironsource/c3;", m5.f25675p, "Lcom/ironsource/mo;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public final c3 a(IronSource.AD_UNIT adFormat) {
            Intrinsics.f(adFormat, "adFormat");
            mo moVar = mo.f;
            u8 adFormatConfiguration = moVar != null ? moVar.getAdFormatConfiguration() : null;
            mo moVar2 = mo.f;
            er providersSettingsHolder = moVar2 != null ? moVar2.getProvidersSettingsHolder() : null;
            return (adFormatConfiguration == null || providersSettingsHolder == null) ? new kb() : new t7(adFormatConfiguration, providersSettingsHolder, adFormat);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final mo a() {
            mo moVar;
            mo moVar2 = mo.f;
            if (moVar2 != null) {
                return moVar2;
            }
            synchronized (this) {
                moVar = mo.f;
                if (moVar == null) {
                    moVar = new mo(null);
                    mo.f = moVar;
                }
            }
            return moVar;
        }
    }

    private mo() {
        this.initialized = new AtomicBoolean(false);
        this.sessionId = "";
    }

    @JvmStatic
    public static final mo d() {
        return INSTANCE.a();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u8 getAdFormatConfiguration() {
        return this.adFormatConfiguration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AtomicBoolean getInitialized() {
        return this.initialized;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final er getProvidersSettingsHolder() {
        return this.providersSettingsHolder;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final void g() {
        this.initialized.set(true);
    }

    public /* synthetic */ mo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final void a(er erVar) {
        this.providersSettingsHolder = erVar;
    }

    public final void a(u8 u8Var) {
        this.adFormatConfiguration = u8Var;
    }

    public final void a(String str) {
        Intrinsics.f(str, "<set-?>");
        this.sessionId = str;
    }
}
