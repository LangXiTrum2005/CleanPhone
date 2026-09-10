package zc;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.applovin.impl.da;
import com.google.android.gms.internal.ads.aj0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import l7.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f54840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f54841c;

    public /* synthetic */ j(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource, int i10) {
        this.f54839a = i10;
        this.f54840b = firebaseMessaging;
        this.f54841c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54839a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.f54840b;
                TaskCompletionSource taskCompletionSource = this.f54841c;
                i0 i0Var = FirebaseMessaging.f24672n;
                firebaseMessaging.getClass();
                try {
                    com.google.android.gms.internal.consent_sdk.x xVar = firebaseMessaging.f24677c;
                    xVar.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    Tasks.await(xVar.C(aj0.c((mb.g) xVar.f23260a), false, bundle).continueWith(new da(1), new tj.i0(xVar, 18)));
                    i0 i0VarE = FirebaseMessaging.e(firebaseMessaging.f24676b);
                    String strF = firebaseMessaging.f();
                    String strC = aj0.c(firebaseMessaging.f24675a);
                    synchronized (i0VarE) {
                        String strA = i0.a(strF, strC);
                        SharedPreferences.Editor editorEdit = i0VarE.f45154a.edit();
                        editorEdit.remove(strA);
                        editorEdit.commit();
                    }
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Exception e10) {
                    taskCompletionSource.setException(e10);
                    return;
                }
            default:
                FirebaseMessaging firebaseMessaging2 = this.f54840b;
                TaskCompletionSource taskCompletionSource2 = this.f54841c;
                i0 i0Var2 = FirebaseMessaging.f24672n;
                try {
                    taskCompletionSource2.setResult(firebaseMessaging2.a());
                    return;
                } catch (Exception e11) {
                    taskCompletionSource2.setException(e11);
                    return;
                }
        }
    }
}
