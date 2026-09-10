package regius;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import patty.graveside;

/* JADX INFO: compiled from: RequestManagerRetriever.java */
/* JADX INFO: loaded from: classes2.dex */
public class kowloon implements Handler.Callback {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final saneness f36206graveside = new attabal();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final saneness f36207arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public volatile com.bumptech.glide.impromptu f36208kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final impassible f36209molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final androidx.collection.attabal<View, Fragment> f36210monoploid = new androidx.collection.attabal<>();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final taiyuan f36211polloi;

    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public class attabal implements saneness {
        @Override // regius.kowloon.saneness
        public com.bumptech.glide.impromptu attabal(com.bumptech.glide.saneness sanenessVar, cutely cutelyVar, arytenoidectomy arytenoidectomyVar, Context context) {
            return new com.bumptech.glide.impromptu(sanenessVar, cutelyVar, arytenoidectomyVar, context);
        }
    }

    /* JADX INFO: compiled from: RequestManagerRetriever.java */
    public interface saneness {
        com.bumptech.glide.impromptu attabal(com.bumptech.glide.saneness sanenessVar, cutely cutelyVar, arytenoidectomy arytenoidectomyVar, Context context);
    }

    public kowloon(saneness sanenessVar) {
        sanenessVar = sanenessVar == null ? f36206graveside : sanenessVar;
        this.f36207arytenoidectomy = sanenessVar;
        this.f36209molybdenite = new impassible(sanenessVar);
        this.f36211polloi = saneness();
    }

    public static void attabal(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public static boolean competently(Context context) {
        Activity activityDern = dern(context);
        return activityDern == null || !activityDern.isFinishing();
    }

    public static Activity dern(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return dern(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static taiyuan saneness() {
        return (graveside.f35122beachfront && graveside.f35125marial) ? new impromptu() : new beachfront();
    }

    public final com.bumptech.glide.impromptu beachfront(Context context) {
        if (this.f36208kowloon == null) {
            synchronized (this) {
                try {
                    if (this.f36208kowloon == null) {
                        this.f36208kowloon = this.f36207arytenoidectomy.attabal(com.bumptech.glide.saneness.dern(context.getApplicationContext()), new regius.attabal(), new competently(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f36208kowloon;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    public com.bumptech.glide.impromptu marial(FragmentActivity fragmentActivity) {
        if (com.bumptech.glide.util.formularize.molybdenite()) {
            return wireman(fragmentActivity.getApplicationContext());
        }
        attabal(fragmentActivity);
        this.f36211polloi.attabal(fragmentActivity);
        boolean zCompetently = competently(fragmentActivity);
        return this.f36209molybdenite.saneness(fragmentActivity, com.bumptech.glide.saneness.dern(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.polloi(), zCompetently);
    }

    public com.bumptech.glide.impromptu wireman(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (com.bumptech.glide.util.formularize.graveside() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return marial((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return wireman(contextWrapper.getBaseContext());
                }
            }
        }
        return beachfront(context);
    }
}
