package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_PackageNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
final class DaggerTransportRuntimeComponent {

    public static final class Builder implements TransportRuntimeComponent.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f16830a;

        public final TransportRuntimeComponentImpl a() {
            Context context = this.f16830a;
            if (context == null) {
                throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
            }
            TransportRuntimeComponentImpl transportRuntimeComponentImpl = new TransportRuntimeComponentImpl();
            transportRuntimeComponentImpl.X = DoubleCheck.a(ExecutionModule_ExecutorFactory.InstanceHolder.f16834a);
            InstanceFactory instanceFactory = new InstanceFactory(context);
            transportRuntimeComponentImpl.f16831Y = instanceFactory;
            transportRuntimeComponentImpl.Z = DoubleCheck.a(new MetadataBackendRegistry_Factory(transportRuntimeComponentImpl.f16831Y, new CreationContextFactory_Factory(instanceFactory, TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a())));
            InstanceFactory instanceFactory2 = transportRuntimeComponentImpl.f16831Y;
            transportRuntimeComponentImpl.e0 = new SchemaManager_Factory(instanceFactory2);
            transportRuntimeComponentImpl.f0 = DoubleCheck.a(new EventStoreModule_PackageNameFactory(instanceFactory2));
            transportRuntimeComponentImpl.g0 = DoubleCheck.a(new SQLiteEventStore_Factory(TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a(), transportRuntimeComponentImpl.e0, transportRuntimeComponentImpl.f0));
            SchedulingModule_WorkSchedulerFactory schedulingModule_WorkSchedulerFactory = new SchedulingModule_WorkSchedulerFactory(transportRuntimeComponentImpl.f16831Y, transportRuntimeComponentImpl.g0, new SchedulingConfigModule_ConfigFactory(), TimeModule_UptimeClockFactory.a());
            transportRuntimeComponentImpl.h0 = schedulingModule_WorkSchedulerFactory;
            Provider provider = transportRuntimeComponentImpl.X;
            Provider provider2 = transportRuntimeComponentImpl.Z;
            Provider provider3 = transportRuntimeComponentImpl.g0;
            transportRuntimeComponentImpl.i0 = new DefaultScheduler_Factory(provider, provider2, schedulingModule_WorkSchedulerFactory, provider3, provider3);
            InstanceFactory instanceFactory3 = transportRuntimeComponentImpl.f16831Y;
            TimeModule_EventClockFactory timeModule_EventClockFactoryA = TimeModule_EventClockFactory.a();
            TimeModule_UptimeClockFactory timeModule_UptimeClockFactoryA = TimeModule_UptimeClockFactory.a();
            Provider provider4 = transportRuntimeComponentImpl.g0;
            transportRuntimeComponentImpl.j0 = new Uploader_Factory(instanceFactory3, provider2, provider3, schedulingModule_WorkSchedulerFactory, provider, provider3, timeModule_EventClockFactoryA, timeModule_UptimeClockFactoryA, provider4);
            transportRuntimeComponentImpl.k0 = new WorkInitializer_Factory(transportRuntimeComponentImpl.X, provider4, transportRuntimeComponentImpl.h0, provider4);
            transportRuntimeComponentImpl.l0 = DoubleCheck.a(new TransportRuntime_Factory(TimeModule_EventClockFactory.a(), TimeModule_UptimeClockFactory.a(), transportRuntimeComponentImpl.i0, transportRuntimeComponentImpl.j0, transportRuntimeComponentImpl.k0));
            return transportRuntimeComponentImpl;
        }
    }

    public static final class TransportRuntimeComponentImpl extends TransportRuntimeComponent {
        public Provider X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public InstanceFactory f16831Y;
        public Provider Z;
        public SchemaManager_Factory e0;
        public Provider f0;
        public Provider g0;
        public SchedulingModule_WorkSchedulerFactory h0;
        public DefaultScheduler_Factory i0;
        public Uploader_Factory j0;
        public WorkInitializer_Factory k0;
        public Provider l0;

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        public final EventStore d() {
            return (EventStore) this.g0.get();
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
        public final TransportRuntime h() {
            return (TransportRuntime) this.l0.get();
        }
    }
}
