package androidx.p001lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 /2\u00020\u0001:\u000201B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Landroidx/lifecycle/trm;", "Landroidx/lifecycle/arytenoidectomy;", "<init>", "()V", "", "beachfront", "marial", "wireman", "competently", "cutely", "apical", "Landroid/content/Context;", "context", "impromptu", "(Landroid/content/Context;)V", "", "kowloon", "I", "startedCounter", "arytenoidectomy", "resumedCounter", "", "monoploid", "Z", "pauseSent", "polloi", "stopSent", "Landroid/os/Handler;", "molybdenite", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/polloi;", "graveside", "Landroidx/lifecycle/polloi;", "registry", "Ljava/lang/Runnable;", "adultoid", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/ReportFragment$attabal;", "dovishness", "Landroidx/lifecycle/ReportFragment$attabal;", "initializationListener", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "gintrap", "saneness", "attabal", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class trm implements arytenoidectomy {

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static final trm f10556rotuma = new trm();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int resumedCounter;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int startedCounter;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public Handler handler;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean pauseSent = true;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public boolean stopSent = true;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final polloi registry = new polloi(this);

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final Runnable delayedPauseRunnable = new Runnable() { // from class: androidx.lifecycle.stratoscope
        @Override // java.lang.Runnable
        public final void run() {
            trm.taiyuan(this.f10551kowloon);
        }
    };

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final ReportFragment.attabal initializationListener = new wireman();

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/trm$attabal;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "", "attabal", "(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f10565attabal = new attabal();

        public static final void attabal(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"androidx/lifecycle/trm$dern", "Landroidx/lifecycle/competently;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityCreated", "onActivityPaused", "(Landroid/app/Activity;)V", "onActivityStopped", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class dern extends competently {

        /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/lifecycle/trm$dern$attabal", "Landroidx/lifecycle/competently;", "Landroid/app/Activity;", "activity", "", "onActivityPostStarted", "(Landroid/app/Activity;)V", "onActivityPostResumed", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class attabal extends competently {
            final /* synthetic */ trm this$0;

            public attabal(trm trmVar) {
                this.this$0 = trmVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.marial();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.beachfront();
            }
        }

        public dern() {
        }

        @Override // androidx.p001lifecycle.competently, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                ReportFragment.INSTANCE.saneness(activity).marial(trm.this.initializationListener);
            }
        }

        @Override // androidx.p001lifecycle.competently, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            trm.this.wireman();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            attabal.attabal(activity, new attabal(trm.this));
        }

        @Override // androidx.p001lifecycle.competently, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            trm.this.competently();
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.trm$saneness, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/trm$saneness;", "", "<init>", "()V", "Landroidx/lifecycle/arytenoidectomy;", "attabal", "()Landroidx/lifecycle/arytenoidectomy;", "Landroid/content/Context;", "context", "", "saneness", "(Landroid/content/Context;)V", "Landroidx/lifecycle/trm;", "newInstance", "Landroidx/lifecycle/trm;", "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final arytenoidectomy attabal() {
            return trm.f10556rotuma;
        }

        public final void saneness(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            trm.f10556rotuma.impromptu(context);
        }

        public Companion() {
        }
    }

    public static final arytenoidectomy formularize() {
        return INSTANCE.attabal();
    }

    public static final void taiyuan(trm trmVar) {
        trmVar.cutely();
        trmVar.apical();
    }

    public final void apical() {
        if (this.startedCounter == 0 && this.pauseSent) {
            this.registry.taiyuan(Lifecycle.Event.ON_STOP);
            this.stopSent = true;
        }
    }

    public final void beachfront() {
        int i = this.startedCounter + 1;
        this.startedCounter = i;
        if (i == 1 && this.stopSent) {
            this.registry.taiyuan(Lifecycle.Event.ON_START);
            this.stopSent = false;
        }
    }

    public final void competently() {
        this.startedCounter--;
        apical();
    }

    public final void cutely() {
        if (this.resumedCounter == 0) {
            this.pauseSent = true;
            this.registry.taiyuan(Lifecycle.Event.ON_PAUSE);
        }
    }

    @Override // androidx.p001lifecycle.arytenoidectomy
    public Lifecycle getLifecycle() {
        return this.registry;
    }

    public final void impromptu(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.handler = new Handler();
        this.registry.taiyuan(Lifecycle.Event.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.competently(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new dern());
    }

    public final void marial() {
        int i = this.resumedCounter + 1;
        this.resumedCounter = i;
        if (i == 1) {
            if (this.pauseSent) {
                this.registry.taiyuan(Lifecycle.Event.ON_RESUME);
                this.pauseSent = false;
            } else {
                Handler handler = this.handler;
                Intrinsics.beachfront(handler);
                handler.removeCallbacks(this.delayedPauseRunnable);
            }
        }
    }

    public final void wireman() {
        int i = this.resumedCounter - 1;
        this.resumedCounter = i;
        if (i == 0) {
            Handler handler = this.handler;
            Intrinsics.beachfront(handler);
            handler.postDelayed(this.delayedPauseRunnable, 700L);
        }
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"androidx/lifecycle/trm$wireman", "Landroidx/lifecycle/ReportFragment$attabal;", "", "onCreate", "()V", "onStart", X3.i.u0, "lifecycle-process"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class wireman implements ReportFragment.attabal {
        public wireman() {
        }

        @Override // androidx.lifecycle.ReportFragment.attabal
        public void onResume() {
            trm.this.marial();
        }

        @Override // androidx.lifecycle.ReportFragment.attabal
        public void onStart() {
            trm.this.beachfront();
        }

        @Override // androidx.lifecycle.ReportFragment.attabal
        public void onCreate() {
        }
    }
}
