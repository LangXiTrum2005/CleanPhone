package d8;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import xi.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f38789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l8.b f38790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f38791d;

    public i(Activity activity, Context context) {
        n.f(context, "context");
        this.f38788a = context;
        this.f38789b = activity;
    }

    public final void a(ArrayList arrayList, String str, l8.b bVar) {
        if (this.f38789b == null) {
            l8.a.b("Activity is null, cannot request write permission");
            bVar.b(Boolean.FALSE);
            return;
        }
        this.f38790c = bVar;
        this.f38791d = new h(arrayList, str);
        try {
            ContentResolver contentResolver = this.f38788a.getContentResolver();
            n.e(contentResolver, "getContentResolver(...)");
            PendingIntent pendingIntentCreateWriteRequest = MediaStore.createWriteRequest(contentResolver, arrayList);
            n.e(pendingIntentCreateWriteRequest, "createWriteRequest(...)");
            Activity activity = this.f38789b;
            if (activity != null) {
                activity.startIntentSenderForResult(pendingIntentCreateWriteRequest.getIntentSender(), 40071, null, 0, 0, 0);
            }
        } catch (Exception e10) {
            l8.a.c("Failed to create write request", e10);
            bVar.b(Boolean.FALSE);
            this.f38791d = null;
            this.f38790c = null;
        }
    }

    @Override // xi.r
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        boolean z10 = false;
        if (i10 != 40071) {
            return false;
        }
        if (i11 == -1) {
            h hVar = this.f38791d;
            if (hVar != null) {
                ArrayList<Uri> arrayList = hVar.f38786a;
                String str = hVar.f38787b;
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("relative_path", str);
                    int i12 = 0;
                    for (Uri uri : arrayList) {
                        try {
                            ContentResolver contentResolver = this.f38788a.getContentResolver();
                            n.e(contentResolver, "getContentResolver(...)");
                            if (contentResolver.update(uri, contentValues, null, null) > 0) {
                                i12++;
                            }
                        } catch (Exception e10) {
                            l8.a.c("Failed to move URI: " + uri, e10);
                        }
                    }
                    l8.a.d("Moved " + i12 + "/" + arrayList.size() + " files to " + str);
                    if (i12 > 0) {
                        z10 = true;
                    }
                } catch (Exception e11) {
                    l8.a.c("Failed to perform move operation", e11);
                }
                l8.b bVar = this.f38790c;
                if (bVar != null) {
                    bVar.b(Boolean.valueOf(z10));
                }
            } else {
                l8.a.b("No pending operation found after write permission granted");
                l8.b bVar2 = this.f38790c;
                if (bVar2 != null) {
                    bVar2.b(Boolean.FALSE);
                }
            }
        } else {
            l8.a.d("User denied write permission");
            l8.b bVar3 = this.f38790c;
            if (bVar3 != null) {
                bVar3.b(Boolean.FALSE);
            }
        }
        this.f38791d = null;
        this.f38790c = null;
        return true;
    }
}
