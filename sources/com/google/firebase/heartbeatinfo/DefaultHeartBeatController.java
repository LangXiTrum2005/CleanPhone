package com.google.firebase.heartbeatinfo;

import android.content.Context;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.Lazy;
import com.google.firebase.inject.Provider;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultHeartBeatController implements HeartBeatController, HeartBeatInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f20820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider f20822c;
    public final Set d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f20823e;

    public DefaultHeartBeatController(final Context context, final String str, Set set, Provider provider, Executor executor) {
        this.f20820a = new Lazy(new Provider() { // from class: com.google.firebase.heartbeatinfo.c
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return new HeartBeatInfoStorage(context, str);
            }
        });
        this.d = set;
        this.f20823e = executor;
        this.f20822c = provider;
        this.f20821b = context;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatController
    public final Task a() {
        if (!UserManagerCompat.a(this.f20821b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f20823e, new a(this, 1));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!UserManagerCompat.a(this.f20821b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f20823e, new a(this, 0));
        }
    }
}
