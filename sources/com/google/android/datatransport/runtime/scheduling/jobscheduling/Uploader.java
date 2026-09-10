package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A.C0880a0;
import android.content.Context;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.ProtoEncoderDoNotUse;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.backends.BackendRequest;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class Uploader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BackendRegistry f16925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EventStore f16926c;
    public final WorkScheduler d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f16927e;
    public final SynchronizationGuard f;
    public final Clock g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clock f16928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ClientHealthMetricsStore f16929i;

    public Uploader(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock, Clock clock2, ClientHealthMetricsStore clientHealthMetricsStore) {
        this.f16924a = context;
        this.f16925b = backendRegistry;
        this.f16926c = eventStore;
        this.d = workScheduler;
        this.f16927e = executor;
        this.f = synchronizationGuard;
        this.g = clock;
        this.f16928h = clock2;
        this.f16929i = clientHealthMetricsStore;
    }

    public final void a(final TransportContext transportContext, int i2) {
        BackendResponse backendResponseB;
        TransportBackend transportBackend = this.f16925b.get(transportContext.b());
        final long jMax = 0;
        BackendResponse.e(0L);
        while (true) {
            final int i3 = 0;
            SynchronizationGuard.CriticalSection criticalSection = new SynchronizationGuard.CriticalSection(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public final /* synthetic */ Uploader f16941Y;

                {
                    this.f16941Y = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    switch (i3) {
                        case 0:
                            return Boolean.valueOf(this.f16941Y.f16926c.Z(transportContext));
                        default:
                            return this.f16941Y.f16926c.g0(transportContext);
                    }
                }
            };
            SynchronizationGuard synchronizationGuard = this.f;
            if (!((Boolean) synchronizationGuard.a(criticalSection)).booleanValue()) {
                synchronizationGuard.a(new d(this, transportContext, jMax));
                return;
            }
            final int i4 = 1;
            final Iterable iterable = (Iterable) synchronizationGuard.a(new SynchronizationGuard.CriticalSection(this) { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b

                /* JADX INFO: renamed from: Y, reason: collision with root package name */
                public final /* synthetic */ Uploader f16941Y;

                {
                    this.f16941Y = this;
                }

                @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                public final Object execute() {
                    switch (i4) {
                        case 0:
                            return Boolean.valueOf(this.f16941Y.f16926c.Z(transportContext));
                        default:
                            return this.f16941Y.f16926c.g0(transportContext);
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (transportBackend == null) {
                Logging.a("Uploader", "Unknown backend for %s, deleting event batch for it...", transportContext);
                backendResponseB = BackendResponse.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PersistedEvent) it.next()).a());
                }
                if (transportContext.c() != null) {
                    ClientHealthMetricsStore clientHealthMetricsStore = this.f16929i;
                    Objects.requireNonNull(clientHealthMetricsStore);
                    ClientMetrics clientMetrics = (ClientMetrics) synchronizationGuard.a(new C0880a0(clientHealthMetricsStore, 7));
                    EventInternal.Builder builderA = EventInternal.a();
                    builderA.f(this.g.a());
                    builderA.l(this.f16928h.a());
                    builderA.k("GDT_CLIENT_METRICS");
                    Encoding encoding = new Encoding("proto");
                    clientMetrics.getClass();
                    ProtobufEncoder protobufEncoder = ProtoEncoderDoNotUse.f16835a;
                    protobufEncoder.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        protobufEncoder.a(clientMetrics, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    builderA.e(new EncodedPayload(encoding, byteArrayOutputStream.toByteArray()));
                    arrayList.add(transportBackend.a(builderA.b()));
                }
                BackendRequest.Builder builderA2 = BackendRequest.a();
                builderA2.b(arrayList);
                builderA2.c(transportContext.c());
                backendResponseB = transportBackend.b(builderA2.a());
            }
            if (backendResponseB.c() == BackendResponse.Status.f16859Y) {
                synchronizationGuard.a(new SynchronizationGuard.CriticalSection() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.c
                    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
                    public final Object execute() {
                        Uploader uploader = this.X;
                        EventStore eventStore = uploader.f16926c;
                        eventStore.a0(iterable);
                        eventStore.A0(uploader.g.a() + jMax, transportContext);
                        return null;
                    }
                });
                this.d.b(transportContext, i2 + 1, true);
                return;
            }
            synchronizationGuard.a(new androidx.media3.exoplayer.analytics.d(14, this, iterable));
            if (backendResponseB.c() == BackendResponse.Status.X) {
                jMax = Math.max(jMax, backendResponseB.b());
                if (transportContext.c() != null) {
                    synchronizationGuard.a(new C0880a0(this, 9));
                }
            } else if (backendResponseB.c() == BackendResponse.Status.e0) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strL = ((PersistedEvent) it2.next()).a().l();
                    if (map.containsKey(strL)) {
                        map.put(strL, Integer.valueOf(((Integer) map.get(strL)).intValue() + 1));
                    } else {
                        map.put(strL, 1);
                    }
                }
                synchronizationGuard.a(new androidx.media3.exoplayer.analytics.d(15, this, map));
            }
        }
    }
}
