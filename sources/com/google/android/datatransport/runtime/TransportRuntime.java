package com.google.android.datatransport.runtime;

import android.content.Context;
import c0.a;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
public class TransportRuntime implements TransportInternal {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile TransportRuntimeComponent f16843e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f16844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clock f16845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scheduler f16846c;
    public final Uploader d;

    public TransportRuntime(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        this.f16844a = clock;
        this.f16845b = clock2;
        this.f16846c = scheduler;
        this.d = uploader;
        workInitializer.getClass();
        workInitializer.f16934a.execute(new a(workInitializer, 16));
    }

    public static TransportRuntime a() {
        TransportRuntimeComponent transportRuntimeComponent = f16843e;
        if (transportRuntimeComponent != null) {
            return transportRuntimeComponent.h();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f16843e == null) {
            synchronized (TransportRuntime.class) {
                try {
                    if (f16843e == null) {
                        DaggerTransportRuntimeComponent.Builder builder = new DaggerTransportRuntimeComponent.Builder();
                        context.getClass();
                        builder.f16830a = context;
                        f16843e = builder.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final TransportFactory c(CCTDestination cCTDestination) {
        byte[] bytes;
        Set setUnmodifiableSet = cCTDestination != null ? Collections.unmodifiableSet(cCTDestination.a()) : Collections.singleton(new Encoding("proto"));
        TransportContext.Builder builderA = TransportContext.a();
        cCTDestination.getClass();
        ((AutoValue_TransportContext.Builder) builderA).f16827a = "cct";
        String str = cCTDestination.f16677a;
        String str2 = cCTDestination.f16678b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = android.support.v4.media.a.o("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        ((AutoValue_TransportContext.Builder) builderA).f16828b = bytes;
        return new TransportFactoryImpl(setUnmodifiableSet, builderA.a(), this);
    }
}
