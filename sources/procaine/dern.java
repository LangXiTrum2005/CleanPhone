package procaine;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import babyless.beachfront;
import canephora.UserAttributesConfig;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.yolo.networklibrary.common.model.HttpYoloConfigModel;
import com.yolo.networklibrary.common.util.impassible;
import kaoline.marial;
import kaoline.wireman;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ProxyBaseApplication.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lprocaine/dern;", "", "<init>", "()V", "Lprocaine/dern$attabal;", "builder", "", "competently", "(Lprocaine/dern$attabal;)V", "impromptu", "taiyuan", "apical", "", "saneness", "J", "mLstReportHiTime", "", "dern", "Z", "isCallFirstOpen", "Landroid/app/Application;", "value", "wireman", "Landroid/app/Application;", "beachfront", "()Landroid/app/Application;", "appContext", "attabal", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f35986attabal = new dern();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static boolean isCallFirstOpen = true;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static long mLstReportHiTime;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static Application appContext;

    /* JADX INFO: compiled from: ProxyBaseApplication.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\tJ\u0019\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0003R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\"\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR$\u0010%\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR$\u0010(\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u001b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001eR(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b \u0010*R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b#\u0010-R(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010.\u001a\u0004\b&\u0010/¨\u00060"}, d2 = {"Lprocaine/dern$attabal;", "", "<init>", "()V", "Landroid/app/Application;", "application", "arytenoidectomy", "(Landroid/app/Application;)Lprocaine/dern$attabal;", "apical", "()Lprocaine/dern$attabal;", "Lretrofit2/dern$attabal;", "callAdapterFactory", "Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;", "httpYoloConfigModel", "beachfront", "(Lretrofit2/dern$attabal;Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;)Lprocaine/dern$attabal;", "impromptu", "Lcanephora/beachfront;", "userAttributesConfig", "taiyuan", "(Lcanephora/beachfront;)Lprocaine/dern$attabal;", "", "attabal", "value", "Landroid/app/Application;", "saneness", "()Landroid/app/Application;", "", "Z", "kowloon", "()Z", "isInitSp", "dern", "formularize", "isInitHttp", "wireman", "impassible", "isInitIap", "marial", "triweekly", "isInitReferrer", "Lretrofit2/dern$attabal;", "()Lretrofit2/dern$attabal;", "competently", "Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;", "()Lcom/yolo/networklibrary/common/model/HttpYoloConfigModel;", "Lcanephora/beachfront;", "()Lcanephora/beachfront;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public Application application;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
        public retrofit2.dern.attabal callAdapterFactory;

        /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
        public HttpYoloConfigModel httpYoloConfigModel;

        /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
        public boolean isInitHttp;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
        public UserAttributesConfig userAttributesConfig;

        /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
        public boolean isInitReferrer;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public boolean isInitSp;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
        public boolean isInitIap;

        public static /* synthetic */ attabal competently(attabal attabalVar, retrofit2.dern.attabal attabalVar2, HttpYoloConfigModel httpYoloConfigModel, int i, Object obj) {
            if ((i & 1) != 0) {
                attabalVar2 = null;
            }
            if ((i & 2) != 0) {
                httpYoloConfigModel = null;
            }
            return attabalVar.beachfront(attabalVar2, httpYoloConfigModel);
        }

        public static /* synthetic */ attabal cutely(attabal attabalVar, UserAttributesConfig beachfrontVar, int i, Object obj) {
            if ((i & 1) != 0) {
                beachfrontVar = null;
            }
            return attabalVar.taiyuan(beachfrontVar);
        }

        public final attabal apical() {
            this.isInitSp = true;
            return this;
        }

        public final attabal arytenoidectomy(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            this.application = application;
            return this;
        }

        public final void attabal() {
            if (this.application == null) {
                throw new IllegalArgumentException("application is null");
            }
            dern.f35986attabal.competently(this);
        }

        public final attabal beachfront(retrofit2.dern.attabal callAdapterFactory, HttpYoloConfigModel httpYoloConfigModel) {
            this.isInitHttp = true;
            this.callAdapterFactory = callAdapterFactory;
            this.httpYoloConfigModel = httpYoloConfigModel;
            return this;
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final retrofit2.dern.attabal getCallAdapterFactory() {
            return this.callAdapterFactory;
        }

        /* JADX INFO: renamed from: formularize, reason: from getter */
        public final boolean getIsInitHttp() {
            return this.isInitHttp;
        }

        /* JADX INFO: renamed from: impassible, reason: from getter */
        public final boolean getIsInitIap() {
            return this.isInitIap;
        }

        public final attabal impromptu() {
            this.isInitIap = true;
            return this;
        }

        /* JADX INFO: renamed from: kowloon, reason: from getter */
        public final boolean getIsInitSp() {
            return this.isInitSp;
        }

        /* JADX INFO: renamed from: marial, reason: from getter */
        public final UserAttributesConfig getUserAttributesConfig() {
            return this.userAttributesConfig;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final Application getApplication() {
            return this.application;
        }

        public final attabal taiyuan(UserAttributesConfig userAttributesConfig) {
            this.isInitReferrer = true;
            this.userAttributesConfig = userAttributesConfig;
            return this;
        }

        /* JADX INFO: renamed from: triweekly, reason: from getter */
        public final boolean getIsInitReferrer() {
            return this.isInitReferrer;
        }

        /* JADX INFO: renamed from: wireman, reason: from getter */
        public final HttpYoloConfigModel getHttpYoloConfigModel() {
            return this.httpYoloConfigModel;
        }
    }

    /* JADX INFO: compiled from: ProxyBaseApplication.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"procaine/dern$saneness", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            dern dernVar = dern.f35986attabal;
            dernVar.taiyuan();
            dernVar.apical();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final void cutely(pancuronium.saneness it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.wireman()) {
            mLstReportHiTime = System.currentTimeMillis();
        }
    }

    public static final void formularize() {
        wireman wiremanVarArytenoidectomy = gerenuk.saneness.arytenoidectomy();
        if (wiremanVarArytenoidectomy != null) {
            marial marialVar = new marial();
            marialVar.f29111oilcan = wiremanVarArytenoidectomy.beachfront();
            marialVar.f29110kattegat = wiremanVarArytenoidectomy.competently();
            marialVar.f29113supplicat = wiremanVarArytenoidectomy.marial();
            marialVar.f29114yemenite = wiremanVarArytenoidectomy.saneness();
            marialVar.f29112sealless = wiremanVarArytenoidectomy.dern();
            marialVar.saneness(wiremanVarArytenoidectomy.wireman());
            marialVar.triweekly(wiremanVarArytenoidectomy.impromptu());
            marialVar.trm(wiremanVarArytenoidectomy.molybdenite());
            marialVar.adultoid(wiremanVarArytenoidectomy.cutely());
            marialVar.dovishness(wiremanVarArytenoidectomy.apical());
            marialVar.cuirassed(wiremanVarArytenoidectomy.monoploid());
            marialVar.stratoscope(wiremanVarArytenoidectomy.polloi());
            marialVar.gintrap(wiremanVarArytenoidectomy.formularize());
            marialVar.rotuma(wiremanVarArytenoidectomy.impassible());
            marialVar.preprohormone(wiremanVarArytenoidectomy.triweekly());
            marialVar.cord(wiremanVarArytenoidectomy.kowloon());
            marialVar.marial(wiremanVarArytenoidectomy.attabal());
            agent.saneness.dern(marialVar);
        }
    }

    public final void apical() {
        if (isCallFirstOpen) {
            isCallFirstOpen = false;
            if (beachfront.marial(babyless.dern.f14823saneness, false)) {
                return;
            }
            impassible.attabal().execute(new Runnable() { // from class: procaine.attabal
                @Override // java.lang.Runnable
                public final void run() {
                    dern.formularize();
                }
            });
        }
    }

    public final Application beachfront() {
        Application application = appContext;
        if (application != null) {
            return application;
        }
        Intrinsics.preprohormone("appContext");
        return null;
    }

    public final void competently(attabal builder) {
        Application application = builder.getApplication();
        Intrinsics.beachfront(application);
        appContext = application;
        revolt.attabal.f36720attabal.attabal(beachfront());
        impromptu();
        if (builder.getIsInitSp()) {
            beachfront.cutely(beachfront());
        }
        if (builder.getIsInitHttp()) {
            mucocutaneous.attabal.C0748attabal c0748attabalMarial = new mucocutaneous.attabal.C0748attabal().marial(beachfront());
            if (builder.getCallAdapterFactory() != null) {
                retrofit2.dern.attabal callAdapterFactory = builder.getCallAdapterFactory();
                Intrinsics.beachfront(callAdapterFactory);
                c0748attabalMarial.beachfront(callAdapterFactory);
            }
            if (builder.getHttpYoloConfigModel() != null) {
                HttpYoloConfigModel httpYoloConfigModel = builder.getHttpYoloConfigModel();
                Intrinsics.beachfront(httpYoloConfigModel);
                c0748attabalMarial.competently(httpYoloConfigModel);
            }
            c0748attabalMarial.attabal();
        }
        if (builder.getIsInitIap()) {
            new scannable.attabal().saneness(beachfront()).attabal();
        }
        if (builder.getIsInitReferrer()) {
            new demented.saneness().saneness(beachfront(), builder.getUserAttributesConfig());
        }
    }

    public final void impromptu() {
        beachfront().registerActivityLifecycleCallbacks(new saneness());
    }

    public final void taiyuan() {
        if (System.currentTimeMillis() - mLstReportHiTime >= TTAdConstant.AD_MAX_EVENT_TIME) {
            panocha.wireman.marial().impromptu(hued.attabal.dern(), new panocha.attabal(), Object.class, new pancuronium.attabal() { // from class: procaine.saneness
                @Override // pancuronium.attabal
                public final void attabal(pancuronium.saneness sanenessVar) {
                    dern.cutely(sanenessVar);
                }
            });
        }
    }
}
