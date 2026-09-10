package com.unity3d.ads.core.data.datasource;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import jk.b;
import kotlin.jvm.internal.n;
import t9.e;
import wj.h;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements OnSuccessListener, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f38417a;

    public /* synthetic */ a(b bVar) {
        this.f38417a = bVar;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        n.f(task, "task");
        boolean zIsSuccessful = task.isSuccessful();
        b bVar = this.f38417a;
        if (zIsSuccessful) {
            bVar.invoke(new h(task.getResult()));
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            exception = new Exception("Unknown error");
        }
        bVar.invoke(new h(e.c(exception)));
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AndroidAppSetIdDataSource.invoke$lambda$1(this.f38417a, obj);
    }
}
