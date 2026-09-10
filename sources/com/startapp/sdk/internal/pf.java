package com.startapp.sdk.internal;

import android.app.Activity;
import android.view.View;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.Collection;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class pf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f41368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f41369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf f41370c;

    public pf(sf sfVar, Activity activity, View view) {
        this.f41370c = sfVar;
        this.f41368a = activity;
        this.f41369b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            sf sfVar = this.f41370c;
            Activity activity = this.f41368a;
            View view = this.f41369b;
            sfVar.d.getClass();
            RcdMetadata rcdMetadataR = MetaData.E().R();
            if (rcdMetadataR == null || !rcdMetadataR.c()) {
                rcdMetadataR = null;
            }
            RcdTargets rcdTargetsB = rcdMetadataR != null ? rcdMetadataR.b() : null;
            if (rcdTargetsB == null) {
                return;
            }
            try {
                Collection collectionA = rcdTargetsB.a(8);
                String name = activity.getClass().getName();
                if (collectionA.contains(name)) {
                    sfVar.a(name, 8);
                    return;
                }
                try {
                    sfVar.a(rcdTargetsB, view);
                } catch (Throwable th) {
                    g9.a(th);
                }
                ((Executor) sfVar.f41485c.a()).execute(sfVar.j);
                return;
            } catch (Throwable th2) {
                g9.a(th2);
            }
            g9.a(th);
        } catch (Throwable th3) {
            g9.a(th3);
        }
    }
}
