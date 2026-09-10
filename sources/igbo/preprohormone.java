package igbo;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: TaskStackBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public final class preprohormone implements Iterable<Intent> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final Context f28383arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final ArrayList<Intent> f28384kowloon = new ArrayList<>();

    /* JADX INFO: compiled from: TaskStackBuilder.java */
    public interface attabal {
        Intent dern();
    }

    public preprohormone(Context context) {
        this.f28383arytenoidectomy = context;
    }

    public static preprohormone marial(Context context) {
        return new preprohormone(context);
    }

    public void beachfront() {
        competently(null);
    }

    public void competently(Bundle bundle) {
        if (this.f28384kowloon.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f28384kowloon.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (picketboat.saneness.startActivities(this.f28383arytenoidectomy, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f28383arytenoidectomy.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public preprohormone dern(Activity activity) {
        Intent intentDern = activity instanceof attabal ? ((attabal) activity).dern() : null;
        if (intentDern == null) {
            intentDern = triweekly.attabal(activity);
        }
        if (intentDern != null) {
            ComponentName component = intentDern.getComponent();
            if (component == null) {
                component = intentDern.resolveActivity(this.f28383arytenoidectomy.getPackageManager());
            }
            wireman(component);
            saneness(intentDern);
        }
        return this;
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f28384kowloon.iterator();
    }

    public preprohormone saneness(Intent intent) {
        this.f28384kowloon.add(intent);
        return this;
    }

    public preprohormone wireman(ComponentName componentName) {
        int size = this.f28384kowloon.size();
        try {
            Intent intentSaneness = triweekly.saneness(this.f28383arytenoidectomy, componentName);
            while (intentSaneness != null) {
                this.f28384kowloon.add(size, intentSaneness);
                intentSaneness = triweekly.saneness(this.f28383arytenoidectomy, intentSaneness.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
