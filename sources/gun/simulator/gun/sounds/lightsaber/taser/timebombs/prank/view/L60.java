package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.annotation.VisibleForTesting;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.ServiceLocator$Companion;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class L60 {
    public static final F60 Companion = new F60(null);
    public static final String SESSION_COUNT_KEY = "vungle_signal_session_count";
    private static final int SESSION_COUNT_NOT_SET = -1;
    public static final String SESSION_TIME_KEY = "vungle_signal_session_creation_time";
    public static final int SIGNAL_VERSION = 1;
    private static final String TAG = "SignalManager";
    public static final long TWENTY_FOUR_HOURS_MILLIS = 86400000;
    private final Context context;
    private C4459r50 currentSession;
    private long enterBackgroundTime;
    private long enterForegroundTime;
    private final InterfaceC3069bH filePreferences$delegate;
    private final VE json;
    private ConcurrentHashMap<String, Long> mapOfLastLoadTimes;
    private int sessionCount;
    private long sessionDuration;
    private long sessionSeriesCreatedTime;
    private C4418qf0 unclosedAdDetector;

    public L60(Context context) {
        AbstractC2995aW.q(context, com.umeng.analytics.pro.f.X);
        this.context = context;
        this.json = WD.b(G60.INSTANCE);
        this.enterForegroundTime = System.currentTimeMillis();
        this.sessionCount = -1;
        this.mapOfLastLoadTimes = new ConcurrentHashMap<>();
        ServiceLocator$Companion serviceLocator$Companion = C3756j50.Companion;
        EnumC4124nH enumC4124nH = EnumC4124nH.f4736a;
        this.filePreferences$delegate = AbstractC2340Cl.H(enumC4124nH, new I60(context));
        registerNotifications();
        this.sessionSeriesCreatedTime = getFilePreferences().getLong(SESSION_TIME_KEY, -1L);
        updateSessionCount();
        this.currentSession = new C4459r50(this.sessionCount);
        C4418qf0 c4418qf0 = new C4418qf0(context, this.currentSession.getSessionId(), m183_init_$lambda0(AbstractC2340Cl.H(enumC4124nH, new J60(context))), m184_init_$lambda1(AbstractC2340Cl.H(enumC4124nH, new K60(context))));
        this.unclosedAdDetector = c4418qf0;
        this.currentSession.setUnclosedAd(c4418qf0.retrieveUnclosedAd());
    }

    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    private static final InterfaceC4615ss m183_init_$lambda0(InterfaceC3069bH interfaceC3069bH) {
        return (InterfaceC4615ss) interfaceC3069bH.getValue();
    }

    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    private static final ZT m184_init_$lambda1(InterfaceC3069bH interfaceC3069bH) {
        return (ZT) interfaceC3069bH.getValue();
    }

    private final void registerNotifications() {
        C5064y0.Companion.addLifecycleListener(new H60(this));
    }

    private final void updateSessionCount() {
        if (this.sessionCount == -1) {
            this.sessionCount = getFilePreferences().getInt(SESSION_COUNT_KEY, 0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.sessionSeriesCreatedTime;
        long j2 = jCurrentTimeMillis - j;
        if (j < 0 || j2 >= 86400000) {
            this.sessionCount = 1;
            getFilePreferences().put(SESSION_TIME_KEY, jCurrentTimeMillis);
            this.sessionSeriesCreatedTime = jCurrentTimeMillis;
        } else {
            this.sessionCount++;
        }
        getFilePreferences().put(SESSION_COUNT_KEY, this.sessionCount);
        getFilePreferences().apply();
    }

    private final void updateSessionDuration() {
        this.currentSession.setSessionDuration((System.currentTimeMillis() + this.sessionDuration) - this.enterForegroundTime);
    }

    public final void createNewSessionData() {
        updateSessionCount();
        this.currentSession = new C4459r50(this.sessionCount);
    }

    public final String generateSignals() {
        updateSessionDuration();
        try {
            VE ve = this.json;
            return "1:".concat(ve.b(AbstractC3375el.V(ve.b, AbstractC3263dY.d(C4459r50.class)), this.currentSession));
        } catch (Error | Exception unused) {
            return null;
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final C4459r50 getCurrentSession$vungle_ads_release() {
        return this.currentSession;
    }

    public final long getEnterBackgroundTime() {
        return this.enterBackgroundTime;
    }

    public final long getEnterForegroundTime() {
        return this.enterForegroundTime;
    }

    public final C2919Yt getFilePreferences() {
        return (C2919Yt) this.filePreferences$delegate.getValue();
    }

    public final ConcurrentHashMap<String, Long> getMapOfLastLoadTimes() {
        return this.mapOfLastLoadTimes;
    }

    public final int getSessionCount() {
        return this.sessionCount;
    }

    public final long getSessionDuration() {
        return this.sessionDuration;
    }

    public final long getSessionSeriesCreatedTime() {
        return this.sessionSeriesCreatedTime;
    }

    public final synchronized O60 getSignaledAd(String str) {
        long jCurrentTimeMillis;
        Long l;
        try {
            AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
            jCurrentTimeMillis = System.currentTimeMillis();
            l = this.mapOfLastLoadTimes.containsKey(str) ? this.mapOfLastLoadTimes.get(str) : null;
            this.mapOfLastLoadTimes.put(str, Long.valueOf(jCurrentTimeMillis));
        } catch (Throwable th) {
            throw th;
        }
        return new O60(l, jCurrentTimeMillis);
    }

    public final String getUuid() {
        return this.currentSession.getSessionId();
    }

    public final synchronized void increaseSessionDepthCounter() {
        C4459r50 c4459r50 = this.currentSession;
        c4459r50.setSessionDepthCounter(c4459r50.getSessionDepthCounter() + 1);
    }

    public final void recordUnclosedAd(C4154nf0 c4154nf0) {
        AbstractC2995aW.q(c4154nf0, "unclosedAd");
        if (C3457fi.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.addUnclosedAd(c4154nf0);
    }

    public final void registerSignaledAd(Context context, O60 o60) {
        AbstractC2995aW.q(o60, "signaledAd");
        this.currentSession.getSignaledAd().clear();
        this.currentSession.getSignaledAd().add(o60);
        this.currentSession.getSignaledAd().get(0).setScreenOrientation(screenOrientation(context));
    }

    public final void removeUnclosedAd(C4154nf0 c4154nf0) {
        AbstractC2995aW.q(c4154nf0, "unclosedAd");
        if (C3457fi.INSTANCE.signalsDisabled()) {
            return;
        }
        this.unclosedAdDetector.removeUnclosedAd(c4154nf0);
    }

    public final int screenOrientation(Context context) {
        Configuration configuration;
        if (context == null) {
            context = this.context;
        }
        Resources resources = context.getResources();
        Integer numValueOf = (resources == null || (configuration = resources.getConfiguration()) == null) ? null : Integer.valueOf(configuration.orientation);
        if (numValueOf != null && numValueOf.intValue() == 2) {
            return 2;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 1;
        }
        return (numValueOf != null && numValueOf.intValue() == 0) ? 0 : -1;
    }

    public final void setCurrentSession$vungle_ads_release(C4459r50 c4459r50) {
        AbstractC2995aW.q(c4459r50, "<set-?>");
        this.currentSession = c4459r50;
    }

    public final void setEnterBackgroundTime(long j) {
        this.enterBackgroundTime = j;
    }

    public final void setEnterForegroundTime(long j) {
        this.enterForegroundTime = j;
    }

    public final void setMapOfLastLoadTimes(ConcurrentHashMap<String, Long> concurrentHashMap) {
        AbstractC2995aW.q(concurrentHashMap, "<set-?>");
        this.mapOfLastLoadTimes = concurrentHashMap;
    }

    public final void setSessionCount(int i) {
        this.sessionCount = i;
    }

    public final void setSessionDuration(long j) {
        this.sessionDuration = j;
    }

    public final void setSessionSeriesCreatedTime(long j) {
        this.sessionSeriesCreatedTime = j;
    }

    public final void updateTemplateSignals(String str) {
        if (str == null || str.length() == 0 || !(!this.currentSession.getSignaledAd().isEmpty())) {
            return;
        }
        this.currentSession.getSignaledAd().get(0).setTemplateSignals(str);
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getCurrentSession$vungle_ads_release$annotations() {
    }
}
