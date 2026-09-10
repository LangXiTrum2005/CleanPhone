package com.facebook.appevents.aam;

import an.h;
import an.p;
import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.internal.AppEventUtility;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import j1.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l2.u;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Lwj/r;", "startTracking", "()V", "stopTracking", "Landroid/view/View;", "view", "process", "(Landroid/view/View;)V", "processEditText", "Ljava/lang/Runnable;", "runnable", "runOnUIThread", "(Ljava/lang/Runnable;)V", "oldView", "newView", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "", "", "processedText", "Ljava/util/Set;", "Landroid/os/Handler;", "uiThreadHandler", "Landroid/os/Handler;", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class MetadataViewObserver implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private static final int MAX_TEXT_LENGTH = 100;
    private final WeakReference<Activity> activityWeakReference;
    private final AtomicBoolean isTracking;
    private final Set<String> processedText;
    private final Handler uiThreadHandler;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Integer, MetadataViewObserver> observers = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/aam/MetadataViewObserver$Companion;", "", "<init>", "()V", "", X3.i.W, X3.i.X, "preNormalize", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "userData", "Lwj/r;", "putUserData", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/app/Activity;", "activity", "startTrackingActivity", "(Landroid/app/Activity;)V", "stopTrackingActivity", "", "MAX_TEXT_LENGTH", "I", "Lcom/facebook/appevents/aam/MetadataViewObserver;", "observers", "Ljava/util/Map;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String preNormalize(String key, String value) {
            if (!"r2".equals(key)) {
                return value;
            }
            Pattern patternCompile = Pattern.compile("[^\\d.]");
            n.e(patternCompile, "compile(...)");
            n.f(value, "input");
            String strReplaceAll = patternCompile.matcher(value).replaceAll("");
            n.e(strReplaceAll, "replaceAll(...)");
            return strReplaceAll;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:24:0x008b  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void putUserData(Map<String, String> userData, String key, String value) {
            List listC;
            switch (key.hashCode()) {
                case 3585:
                    if (key.equals("r3")) {
                        String str = "m";
                        if (!p.p0(value, "m", false) && !p.p0(value, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, false) && !p.p0(value, UserDataStore.GENDER, false)) {
                            str = "f";
                        }
                        value = str;
                    }
                    break;
                case 3586:
                    if (key.equals("r4")) {
                        Pattern patternCompile = Pattern.compile("[^a-z]+");
                        n.e(patternCompile, "compile(...)");
                        n.f(value, "input");
                        value = patternCompile.matcher(value).replaceAll("");
                        n.e(value, "replaceAll(...)");
                    }
                    break;
                case 3587:
                    if (key.equals("r5")) {
                        Pattern patternCompile2 = Pattern.compile("[^a-z]+");
                        n.e(patternCompile2, "compile(...)");
                        n.f(value, "input");
                        value = patternCompile2.matcher(value).replaceAll("");
                        n.e(value, "replaceAll(...)");
                    }
                    break;
                case 3588:
                    if (key.equals("r6") && h.q0(value, "-", false)) {
                        Pattern patternCompile3 = Pattern.compile("-");
                        n.e(patternCompile3, "compile(...)");
                        h.G0(0);
                        Matcher matcher = patternCompile3.matcher(value);
                        if (matcher.find()) {
                            ArrayList arrayList = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList.add(value.subSequence(iEnd, matcher.start()).toString());
                                iEnd = matcher.end();
                            } while (matcher.find());
                            arrayList.add(value.subSequence(iEnd, value.length()).toString());
                            listC = arrayList;
                        } else {
                            listC = f.C(value.toString());
                        }
                        value = ((String[]) listC.toArray(new String[0]))[0];
                    }
                    break;
            }
            userData.put(key, value);
        }

        public final void startTrackingActivity(Activity activity) {
            n.f(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapAccess$getObservers$cp = MetadataViewObserver.access$getObservers$cp();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object metadataViewObserver = mapAccess$getObservers$cp.get(numValueOf);
            if (metadataViewObserver == null) {
                metadataViewObserver = new MetadataViewObserver(activity, null);
                mapAccess$getObservers$cp.put(numValueOf, metadataViewObserver);
            }
            MetadataViewObserver.access$startTracking((MetadataViewObserver) metadataViewObserver);
        }

        public final void stopTrackingActivity(Activity activity) {
            n.f(activity, "activity");
            MetadataViewObserver metadataViewObserver = (MetadataViewObserver) MetadataViewObserver.access$getObservers$cp().remove(Integer.valueOf(activity.hashCode()));
            if (metadataViewObserver != null) {
                MetadataViewObserver.access$stopTracking(metadataViewObserver);
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ MetadataViewObserver(Activity activity, g gVar) {
        this(activity);
    }

    public static final /* synthetic */ Map access$getObservers$cp() {
        if (a.b(MetadataViewObserver.class)) {
            return null;
        }
        try {
            return observers;
        } catch (Throwable th2) {
            a.a(MetadataViewObserver.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ void access$startTracking(MetadataViewObserver metadataViewObserver) {
        if (a.b(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.startTracking();
        } catch (Throwable th2) {
            a.a(MetadataViewObserver.class, th2);
        }
    }

    public static final /* synthetic */ void access$stopTracking(MetadataViewObserver metadataViewObserver) {
        if (a.b(MetadataViewObserver.class)) {
            return;
        }
        try {
            metadataViewObserver.stopTracking();
        } catch (Throwable th2) {
            a.a(MetadataViewObserver.class, th2);
        }
    }

    private final void process(View view) {
        if (a.b(this)) {
            return;
        }
        try {
            runOnUIThread(new u(8, view, this));
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void process$lambda$0(View view, MetadataViewObserver this$0) {
        if (a.b(MetadataViewObserver.class)) {
            return;
        }
        try {
            n.f(view, "$view");
            n.f(this$0, "this$0");
            if (view instanceof EditText) {
                this$0.processEditText(view);
            }
        } catch (Throwable th2) {
            a.a(MetadataViewObserver.class, th2);
        }
    }

    private final void processEditText(View view) {
        if (a.b(this)) {
            return;
        }
        try {
            n.d(view, "null cannot be cast to non-null type android.widget.EditText");
            String lowerCase = h.T0(((EditText) view).getText().toString()).toString().toLowerCase();
            n.e(lowerCase, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() != 0 && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                this.processedText.add(lowerCase);
                HashMap map = new HashMap();
                List<String> currentViewIndicators = MetadataMatcher.getCurrentViewIndicators(view);
                List<String> aroundViewIndicators = null;
                for (MetadataRule metadataRule : MetadataRule.INSTANCE.getRules()) {
                    Companion companion = INSTANCE;
                    String strPreNormalize = companion.preNormalize(metadataRule.getName(), lowerCase);
                    if (metadataRule.getValRule().length() <= 0 || MetadataMatcher.matchValue(strPreNormalize, metadataRule.getValRule())) {
                        if (MetadataMatcher.matchIndicator(currentViewIndicators, metadataRule.getKeyRules())) {
                            companion.putUserData(map, metadataRule.getName(), strPreNormalize);
                        } else {
                            if (aroundViewIndicators == null) {
                                aroundViewIndicators = MetadataMatcher.getAroundViewIndicators(view);
                            }
                            if (MetadataMatcher.matchIndicator(aroundViewIndicators, metadataRule.getKeyRules())) {
                                companion.putUserData(map, metadataRule.getName(), strPreNormalize);
                            }
                        }
                    }
                }
                InternalAppEventsLogger.INSTANCE.setInternalUserData(map);
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    private final void runOnUIThread(Runnable runnable) {
        if (a.b(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    private final void startTracking() {
        View rootView;
        if (a.b(this)) {
            return;
        }
        try {
            if (!this.isTracking.getAndSet(true) && (rootView = AppEventUtility.getRootView(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public static final void startTrackingActivity(Activity activity) {
        if (a.b(MetadataViewObserver.class)) {
            return;
        }
        try {
            INSTANCE.startTrackingActivity(activity);
        } catch (Throwable th2) {
            a.a(MetadataViewObserver.class, th2);
        }
    }

    private final void stopTracking() {
        View rootView;
        if (a.b(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(false) && (rootView = AppEventUtility.getRootView(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public static final void stopTrackingActivity(Activity activity) {
        if (a.b(MetadataViewObserver.class)) {
            return;
        }
        try {
            INSTANCE.stopTrackingActivity(activity);
        } catch (Throwable th2) {
            a.a(MetadataViewObserver.class, th2);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View oldView, View newView) {
        if (a.b(this)) {
            return;
        }
        if (oldView != null) {
            try {
                process(oldView);
            } catch (Throwable th2) {
                a.a(this, th2);
                return;
            }
        }
        if (newView != null) {
            process(newView);
        }
    }

    private MetadataViewObserver(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }
}
