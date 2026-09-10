package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class rf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StackTraceElement[] f41448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf f41450c;

    public rf(sf sfVar, StackTraceElement[] stackTraceElementArr, int i2) {
        this.f41450c = sfVar;
        this.f41448a = stackTraceElementArr;
        this.f41449b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            sf sfVar = this.f41450c;
            StackTraceElement[] stackTraceElementArr = this.f41448a;
            int i2 = this.f41449b;
            sfVar.d.getClass();
            RcdMetadata rcdMetadataR = MetaData.E().R();
            if (rcdMetadataR == null || !rcdMetadataR.c()) {
                rcdMetadataR = null;
            }
            RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
            if (rcdTargetsB == null) {
                return;
            }
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                sfVar.a(rcdTargetsB, stackTraceElement.getClassName(), i2);
            }
            ((Executor) sfVar.f41485c.a()).execute(sfVar.j);
        } catch (Throwable th) {
            g9.a(th);
        }
    }
}
