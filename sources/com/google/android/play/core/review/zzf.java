package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
final class zzf extends com.google.android.play.core.review.internal.zzj {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f19671Y;
    public final /* synthetic */ zzi Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzi zziVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f19671Y = taskCompletionSource2;
        this.Z = zziVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void b() {
        HashMap map;
        try {
            zzi zziVar = this.Z;
            com.google.android.play.core.review.internal.zzf zzfVar = zziVar.f19674a.m;
            String str = zziVar.f19675b;
            Bundle bundle = new Bundle();
            HashMap map2 = zzj.f19676a;
            synchronized (zzj.class) {
                map = zzj.f19676a;
                map.put("java", 20002);
            }
            bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
            if (map.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
            }
            if (map.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
            }
            zzi zziVar2 = this.Z;
            TaskCompletionSource taskCompletionSource = this.f19671Y;
            String str2 = zziVar2.f19675b;
            zzfVar.a0(str, bundle, new zzh(zziVar2, new com.google.android.play.core.review.internal.zzi("OnRequestInstallCallback"), taskCompletionSource));
        } catch (RemoteException e2) {
            zzi zziVar3 = this.Z;
            com.google.android.play.core.review.internal.zzi zziVar4 = zzi.f19673c;
            Object[] objArr = {zziVar3.f19675b};
            zziVar4.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", com.google.android.play.core.review.internal.zzi.c(zziVar4.f19651a, "error requesting in-app review for %s", objArr), e2);
            }
            this.f19671Y.trySetException(new RuntimeException(e2));
        }
    }
}
