package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.play:review@@2.0.2 */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront extends collectively.cutely {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f21483arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final /* synthetic */ taiyuan f21484monoploid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public beachfront(taiyuan taiyuanVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f21483arytenoidectomy = taskCompletionSource2;
        this.f21484monoploid = taiyuanVar;
    }

    @Override // collectively.cutely
    public final void attabal() {
        try {
            collectively.beachfront beachfrontVar = (collectively.beachfront) this.f21484monoploid.f21490attabal.marial();
            String str = this.f21484monoploid.f21491saneness;
            Bundle bundle = new Bundle();
            Map mapAttabal = cutely.attabal();
            bundle.putInt("playcore_version_code", ((Integer) mapAttabal.get("java")).intValue());
            if (mapAttabal.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) mapAttabal.get("native")).intValue());
            }
            if (mapAttabal.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapAttabal.get("unity")).intValue());
            }
            taiyuan taiyuanVar = this.f21484monoploid;
            beachfrontVar.marial(str, bundle, new impromptu(taiyuanVar, this.f21483arytenoidectomy, taiyuanVar.f21491saneness));
        } catch (RemoteException e) {
            taiyuan.f21489dern.saneness(e, "error requesting in-app review for %s", this.f21484monoploid.f21491saneness);
            this.f21483arytenoidectomy.trySetException(new RuntimeException(e));
        }
    }
}
