package com.google.firebase.sessions;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import javax.inject.Inject;
import javax.inject.Singleton;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SessionLifecycleServiceBinder.kt */
/* JADX INFO: loaded from: classes3.dex */
@Singleton
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/firebase/sessions/oilcan;", "Lcom/google/firebase/sessions/trm;", "Landroid/content/Context;", "appContext", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Messenger;", "callback", "Landroid/content/ServiceConnection;", "serviceConnection", "", "attabal", "(Landroid/os/Messenger;Landroid/content/ServiceConnection;)V", "", "saneness", "(Landroid/content/Context;Landroid/content/ServiceConnection;)Ljava/lang/Object;", "Landroid/content/Context;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class oilcan implements trm {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Context appContext;

    @Inject
    public oilcan(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.appContext = appContext;
    }

    @Override // com.google.firebase.sessions.trm
    public void attabal(Messenger callback, ServiceConnection serviceConnection) {
        boolean zBindService;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(serviceConnection, "serviceConnection");
        Intent intent = new Intent(this.appContext, (Class<?>) SessionLifecycleService.class);
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", callback);
        intent.setPackage(this.appContext.getPackageName());
        try {
            zBindService = this.appContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException unused) {
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        saneness(this.appContext, serviceConnection);
    }

    public final Object saneness(Context appContext, ServiceConnection serviceConnection) {
        try {
            appContext.unbindService(serviceConnection);
            return Unit.f29295attabal;
        } catch (IllegalArgumentException e) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e));
        }
    }
}
