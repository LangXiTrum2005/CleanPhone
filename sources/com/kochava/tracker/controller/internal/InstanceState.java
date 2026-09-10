package com.kochava.tracker.controller.internal;

import android.content.Context;
import com.kochava.core.module.internal.ModuleDetailsApi;
import com.kochava.core.task.manager.internal.TaskManager;

/* JADX INFO: loaded from: classes5.dex */
public final class InstanceState implements InstanceStateApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f28116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TaskManager f28117c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f28118e;
    public final MutableState f;
    public final ModuleDetailsApi g;

    public InstanceState(long j, Context context, TaskManager taskManager, String str, boolean z2, String str2, MutableState mutableState, ModuleDetailsApi moduleDetailsApi) {
        this.f28115a = j;
        this.f28116b = context;
        this.f28117c = taskManager;
        this.d = str;
        this.f28118e = str2;
        this.f = mutableState;
        this.g = moduleDetailsApi;
    }
}
