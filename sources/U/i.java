package u;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f51639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f51640b;

    public i(Intent intent, Bundle bundle) {
        this.f51639a = intent;
        this.f51640b = bundle;
    }

    public final void a(Context context, Uri uri) {
        Intent intent = this.f51639a;
        intent.setData(uri);
        context.startActivity(intent, this.f51640b);
    }
}
