package b0;

import android.app.Notification;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5145f;

    public l(int i10) {
        this.f5144e = i10;
        switch (i10) {
            case 1:
                this.f5145f = new ArrayList();
                break;
        }
    }

    @Override // b0.g0
    public final void b(h9.k kVar) {
        switch (this.f5144e) {
            case 0:
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) kVar.f42287b).setBigContentTitle(this.f5122b).bigText((CharSequence) this.f5145f);
                if (this.f5124d) {
                    bigTextStyleBigText.setSummaryText(this.f5123c);
                }
                break;
            default:
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle((Notification.Builder) kVar.f42287b).setBigContentTitle(this.f5122b);
                if (this.f5124d) {
                    bigContentTitle.setSummaryText(this.f5123c);
                }
                Iterator it = ((ArrayList) this.f5145f).iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine((CharSequence) it.next());
                }
                break;
        }
    }

    @Override // b0.g0
    public final String d() {
        switch (this.f5144e) {
            case 0:
                return "androidx.core.app.NotificationCompat$BigTextStyle";
            default:
                return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    @Override // b0.g0
    public final void e(Bundle bundle) {
        switch (this.f5144e) {
            case 0:
                super.e(bundle);
                this.f5145f = bundle.getCharSequence(NotificationCompat.EXTRA_BIG_TEXT);
                break;
            default:
                super.e(bundle);
                ArrayList arrayList = (ArrayList) this.f5145f;
                arrayList.clear();
                if (bundle.containsKey(NotificationCompat.EXTRA_TEXT_LINES)) {
                    Collections.addAll(arrayList, bundle.getCharSequenceArray(NotificationCompat.EXTRA_TEXT_LINES));
                }
                break;
        }
    }
}
