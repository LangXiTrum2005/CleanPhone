package dirl;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness extends cord {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final /* synthetic */ IBinder f25277arytenoidectomy;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final /* synthetic */ marial f25278monoploid;

    public saneness(marial marialVar, IBinder iBinder) {
        this.f25278monoploid = marialVar;
        this.f25277arytenoidectomy = iBinder;
    }

    @Override // dirl.cord
    public final void saneness() {
        this.f25278monoploid.f25272dern.f25262triweekly = (IInterface) this.f25278monoploid.f25272dern.f25261taiyuan.attabal(this.f25277arytenoidectomy);
        beachfront.polloi(this.f25278monoploid.f25272dern);
        this.f25278monoploid.f25272dern.f25253competently = false;
        Iterator it = this.f25278monoploid.f25272dern.f25263wireman.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f25278monoploid.f25272dern.f25263wireman.clear();
    }
}
