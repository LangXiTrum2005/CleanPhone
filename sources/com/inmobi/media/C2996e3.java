package com.inmobi.media;

import A.RunnableC0883c;
import android.content.Context;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2996e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3040h f23541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23543c = "e3";
    public final C3060i3 d = new C3060i3();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23544e = -1;
    public final AtomicBoolean f = new AtomicBoolean();
    public final AtomicBoolean g = new AtomicBoolean();

    public C2996e3(C3040h c3040h, long j) {
        this.f23541a = c3040h;
        this.f23542b = j;
    }

    public final void a() {
        C3040h c3040h;
        C3040h c3040h2;
        Long lM;
        String strH;
        Boolean boolC;
        Intrinsics.c(this.f23543c);
        C3040h c3040h3 = this.f23541a;
        if (c3040h3 != null && (boolC = c3040h3.C()) != null) {
            boolean zBooleanValue = boolC.booleanValue();
            C3044h3 c3044h3 = C3044h3.f23645a;
            Context contextD = Uc.d();
            if (contextD != null && zBooleanValue != C3044h3.d()) {
                ConcurrentHashMap concurrentHashMap = C6.f22734b;
                C6.a(B6.a(contextD, "c_data_store"), "isEnabled", zBooleanValue, false, 4, (Object) null);
                if (!zBooleanValue) {
                    c3044h3.e();
                }
            }
        }
        if (C3044h3.d() && !this.f.getAndSet(true)) {
            this.f23544e = System.currentTimeMillis();
            if (!this.g.get()) {
                C3040h c3040h4 = this.f23541a;
                if ((c3040h4 != null ? c3040h4.h() : null) != null && (strH = this.f23541a.h()) != null) {
                    C3060i3 c3060i3 = this.d;
                    c3060i3.getClass();
                    c3060i3.f23682a = strH;
                    Intrinsics.c(this.f23543c);
                }
            }
            if (!this.g.get() && (c3040h2 = this.f23541a) != null && (lM = c3040h2.m()) != null) {
                this.d.f23683b = lM.longValue();
                Intrinsics.c(this.f23543c);
            }
            if (!this.g.get()) {
                this.d.f23685e = this.f23542b;
                Intrinsics.c(this.f23543c);
            }
            if (!this.g.get() && (c3040h = this.f23541a) != null) {
                this.d.f = c3040h.n();
                Intrinsics.c(this.f23543c);
            }
            long j = this.f23544e / ((long) 1000);
            if (this.g.get()) {
                return;
            }
            this.d.f23684c = j;
            Intrinsics.c(this.f23543c);
        }
    }

    public final void b() {
        if (!C3044h3.d()) {
            Intrinsics.c(this.f23543c);
            return;
        }
        if (!this.f.get()) {
            Intrinsics.c(this.f23543c);
            return;
        }
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.f23544e);
        if (!this.g.get()) {
            this.d.d = iCurrentTimeMillis;
            Intrinsics.c(this.f23543c);
        }
        if (this.g.getAndSet(true)) {
            Intrinsics.c(this.f23543c);
        } else {
            Intrinsics.c(this.f23543c);
            Uc.a(new RunnableC0883c(this, 15));
        }
    }

    public static final void a(C2996e3 this$0) {
        List<String> skipFields;
        AdConfig.ContextualDataConfig contextualData;
        AdConfig.ContextualDataConfig contextualData2;
        AdConfig.ContextualDataConfig contextualData3;
        AdConfig.ContextualDataConfig contextualData4;
        Intrinsics.f(this$0, "this$0");
        C3044h3 c3044h3 = C3044h3.f23645a;
        C3060i3 contextualDataModel = this$0.d;
        Intrinsics.f(contextualDataModel, "contextualDataModel");
        synchronized (c3044h3) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                AdConfig adConfig = C3044h3.f23648e;
                int maxAdRecords = 0;
                long expiryTime = jCurrentTimeMillis - ((long) (((adConfig == null || (contextualData4 = adConfig.getContextualData()) == null) ? 0 : contextualData4.getExpiryTime()) * 1000));
                AdConfig adConfig2 = C3044h3.f23648e;
                C3044h3.a(expiryTime, ((adConfig2 == null || (contextualData3 = adConfig2.getContextualData()) == null) ? 0 : contextualData3.getMaxAdRecords()) - 1);
                AdConfig adConfig3 = C3044h3.f23648e;
                if (adConfig3 == null || (contextualData2 = adConfig3.getContextualData()) == null || (skipFields = contextualData2.getSkipFields()) == null) {
                    skipFields = EmptyList.X;
                }
                String string = AbstractC3076j3.a(contextualDataModel, skipFields).toString();
                Intrinsics.e(string, "toString(...)");
                C3061i4 c3061i4 = new C3061i4(AbstractC3077j4.a(string, C3044h3.f), jCurrentTimeMillis);
                C3044h3.f23646b.add(c3061i4);
                Object objClone = C3044h3.f23646b.clone();
                Intrinsics.d(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
                C3044h3.f23647c = (LinkedList) objClone;
                AdConfig adConfig4 = C3044h3.f23648e;
                if (adConfig4 != null && (contextualData = adConfig4.getContextualData()) != null) {
                    maxAdRecords = contextualData.getMaxAdRecords();
                }
                C2979d3 c2979d3 = (C2979d3) Nc.d.getX();
                c2979d3.getClass();
                Objects.toString(c3061i4);
                c2979d3.a(c3061i4);
                c2979d3.a("id NOT IN (SELECT id FROM ( SELECT id FROM c_data WHERE timestamp > " + expiryTime + " ORDER BY timestamp DESC LIMIT " + maxAdRecords + ") foo);", null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
