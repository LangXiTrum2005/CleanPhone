package com.storage.androidcleaner.activity;

import ak.f;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.a1;
import fh.z;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import h.c;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import k3.j;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/storage/androidcleaner/activity/TrashConsentActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class TrashConsentActivity extends ComponentActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f38391e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f38392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f38394d = registerForActivityResult(new a1(4), new j(this, 24));

    public final void F(boolean z10) {
        if (this.f38393c) {
            return;
        }
        this.f38393c = true;
        String str = this.f38392b;
        if (str != null) {
            ConcurrentHashMap concurrentHashMap = z.f40951b;
            f fVar = (f) concurrentHashMap.get(str);
            if (fVar != null) {
                fVar.resumeWith(Boolean.valueOf(z10));
            }
            concurrentHashMap.remove(str);
        }
        finish();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38392b = getIntent().getStringExtra("requestId");
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("uris");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new ArrayList();
        }
        if (parcelableArrayListExtra.isEmpty()) {
            F(false);
            return;
        }
        PendingIntent pendingIntentCreateDeleteRequest = Build.VERSION.SDK_INT == 33 ? MediaStore.createDeleteRequest(getContentResolver(), parcelableArrayListExtra) : MediaStore.createTrashRequest(getContentResolver(), parcelableArrayListExtra, true);
        n.c(pendingIntentCreateDeleteRequest);
        IntentSender intentSender = pendingIntentCreateDeleteRequest.getIntentSender();
        n.e(intentSender, "getIntentSender(...)");
        this.f38394d.a(new h.j(intentSender, null, 0, 0));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f38393c) {
            return;
        }
        F(false);
    }

    @Override // android.app.Activity
    public final void onStop() {
        super.onStop();
        if (this.f38393c) {
            return;
        }
        F(false);
    }
}
