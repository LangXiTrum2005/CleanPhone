package com.google.firebase.sessions;

import android.content.Context;
import android.os.Process;
import androidx.room.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/ProcessDataManagerImpl;", "Lcom/google/firebase/sessions/ProcessDataManager;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessDataManagerImpl implements ProcessDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f21087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21088c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f21089e;
    public boolean f;

    public ProcessDataManagerImpl(Context appContext, UuidGenerator uuidGenerator) {
        Intrinsics.f(appContext, "appContext");
        Intrinsics.f(uuidGenerator, "uuidGenerator");
        this.f21086a = appContext;
        final int i2 = 0;
        this.f21087b = LazyKt.b(new Function0(this) { // from class: com.google.firebase.sessions.b

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ ProcessDataManagerImpl f21144Y;

            {
                this.f21144Y = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((ProcessDetails) this.f21144Y.f21089e.getX()).f21092a;
                    default:
                        return ProcessDetailsProvider.b(this.f21144Y.f21086a);
                }
            }
        });
        this.f21088c = Process.myPid();
        this.d = LazyKt.b(new c(uuidGenerator, 4));
        final int i3 = 1;
        this.f21089e = LazyKt.b(new Function0(this) { // from class: com.google.firebase.sessions.b

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final /* synthetic */ ProcessDataManagerImpl f21144Y;

            {
                this.f21144Y = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return ((ProcessDetails) this.f21144Y.f21089e.getX()).f21092a;
                    default:
                        return ProcessDetailsProvider.b(this.f21144Y.f21086a);
                }
            }
        });
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final String a() {
        return (String) this.f21087b.getX();
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final boolean b(Map map) {
        ProcessData processData = (ProcessData) map.get(a());
        return (processData != null && processData.getPid() == this.f21088c && Intrinsics.a(processData.getUuid(), (String) this.d.getX())) ? false : true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final Map c(Map map) {
        Lazy lazy = this.d;
        if (map == null) {
            return MapsKt.i(new Pair(a(), new ProcessData(Process.myPid(), (String) lazy.getX())));
        }
        LinkedHashMap linkedHashMapS = MapsKt.s(map);
        linkedHashMapS.put(a(), new ProcessData(Process.myPid(), (String) lazy.getX()));
        return MapsKt.q(linkedHashMapS);
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final void d() {
        this.f = true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final boolean e(Map map) {
        if (this.f) {
            return false;
        }
        ArrayList<ProcessDetails> arrayListA = ProcessDetailsProvider.a(this.f21086a);
        ArrayList<Pair> arrayList = new ArrayList();
        for (ProcessDetails processDetails : arrayListA) {
            ProcessData processData = (ProcessData) map.get(processDetails.f21092a);
            Pair pair = processData != null ? new Pair(processDetails, processData) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Pair pair2 : arrayList) {
            ProcessDetails processDetails2 = (ProcessDetails) pair2.X;
            ProcessData processData2 = (ProcessData) pair2.f43249Y;
            boolean zA = Intrinsics.a(a(), processDetails2.f21092a);
            int i2 = processDetails2.f21093b;
            if (zA) {
                if (i2 == processData2.getPid() && Intrinsics.a((String) this.d.getX(), processData2.getUuid())) {
                    return false;
                }
            } else if (i2 == processData2.getPid()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.firebase.sessions.ProcessDataManager
    public final Map f() {
        return c(EmptyMap.X);
    }
}
