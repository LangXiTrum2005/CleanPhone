package d8;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.n;
import xi.r;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f38761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f38762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l8.b f38764d;

    public b(Context context) {
        n.f(context, "context");
        this.f38761a = context;
        this.f38762b = null;
        new LinkedHashMap();
        new ArrayList();
        new ArrayList();
        new LinkedList();
        this.f38763c = 40069;
    }

    public final void a(List list, l8.b bVar) throws IntentSender.SendIntentException {
        this.f38764d = bVar;
        ContentResolver contentResolverB = b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        PendingIntent pendingIntentCreateDeleteRequest = MediaStore.createDeleteRequest(contentResolverB, arrayList);
        n.e(pendingIntentCreateDeleteRequest, "createDeleteRequest(...)");
        Activity activity = this.f38762b;
        if (activity != null) {
            activity.startIntentSenderForResult(pendingIntentCreateDeleteRequest.getIntentSender(), this.f38763c, null, 0, 0, 0);
        }
    }

    public final ContentResolver b() {
        ContentResolver contentResolver = this.f38761a.getContentResolver();
        n.e(contentResolver, "getContentResolver(...)");
        return contentResolver;
    }

    public final void c(List list, l8.b bVar) throws IntentSender.SendIntentException {
        this.f38764d = bVar;
        ContentResolver contentResolverB = b();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        PendingIntent pendingIntentCreateTrashRequest = MediaStore.createTrashRequest(contentResolverB, arrayList, true);
        n.e(pendingIntentCreateTrashRequest, "createTrashRequest(...)");
        Activity activity = this.f38762b;
        if (activity != null) {
            activity.startIntentSenderForResult(pendingIntentCreateTrashRequest.getIntentSender(), this.f38763c, null, 0, 0, 0);
        }
    }

    public final void d(ArrayList arrayList, l8.b bVar) throws IntentSender.SendIntentException {
        this.f38764d = bVar;
        ContentResolver contentResolverB = b();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (uri != null) {
                arrayList2.add(uri);
            }
        }
        PendingIntent pendingIntentCreateTrashRequest = MediaStore.createTrashRequest(contentResolverB, arrayList2, false);
        n.e(pendingIntentCreateTrashRequest, "createTrashRequest(...)");
        Activity activity = this.f38762b;
        if (activity != null) {
            activity.startIntentSenderForResult(pendingIntentCreateTrashRequest.getIntentSender(), this.f38763c, null, 0, 0, 0);
        }
    }

    @Override // xi.r
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        List list;
        l8.b bVar;
        if (i10 == this.f38763c) {
            if (i11 == -1) {
                l8.b bVar2 = this.f38764d;
                if (bVar2 != null && (list = (List) bVar2.f45244b.a("ids")) != null && (bVar = this.f38764d) != null) {
                    bVar.b(list);
                    return true;
                }
            } else {
                l8.b bVar3 = this.f38764d;
                if (bVar3 != null) {
                    bVar3.b(v.f53866a);
                    return true;
                }
            }
        } else if (i10 != 40070) {
            return false;
        }
        return true;
    }
}
