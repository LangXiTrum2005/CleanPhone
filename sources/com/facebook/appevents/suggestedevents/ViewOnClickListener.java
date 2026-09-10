package com.facebook.appevents.suggestedevents;

import an.p;
import android.os.Bundle;
import android.view.View;
import bc.r;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.c;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.appevents.ml.ModelManager;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l7.b0;
import l7.s;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewOnClickListener;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", "hostView", "rootView", "", "activityName", "<init>", "(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V", "Lwj/r;", "process", "()V", "pathID", "buttonText", "Lorg/json/JSONObject;", "viewData", "predictAndProcess", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "view", "onClick", "(Landroid/view/View;)V", "baseListener", "Landroid/view/View$OnClickListener;", "Ljava/lang/ref/WeakReference;", "rootViewWeakReference", "Ljava/lang/ref/WeakReference;", "hostViewWeakReference", "Ljava/lang/String;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class ViewOnClickListener implements View.OnClickListener {
    private static final String API_ENDPOINT = "%s/suggested_events";
    public static final String OTHER_EVENT = "other";
    private final String activityName;
    private final View.OnClickListener baseListener;
    private final WeakReference<View> hostViewWeakReference;
    private final WeakReference<View> rootViewWeakReference;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<Integer> viewsAttachedListener = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ'\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/facebook/appevents/suggestedevents/ViewOnClickListener$Companion;", "", "<init>", "()V", "", "pathID", "buttonText", "", "queryHistoryAndProcess", "(Ljava/lang/String;Ljava/lang/String;)Z", "predictedEvent", "", "dense", "Lwj/r;", "processPredictedResult", "(Ljava/lang/String;Ljava/lang/String;[F)V", "eventToPost", "sendPredictedResult", "Landroid/view/View;", "hostView", "rootView", "activityName", "attachListener$facebook_core_release", "(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V", "attachListener", "API_ENDPOINT", "Ljava/lang/String;", "OTHER_EVENT", "", "", "viewsAttachedListener", "Ljava/util/Set;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void processPredictedResult(String predictedEvent, String buttonText, float[] dense) {
            if (SuggestedEventsManager.isProductionEvents$facebook_core_release(predictedEvent)) {
                new InternalAppEventsLogger(s.b()).logEventFromSE(predictedEvent, buttonText);
            } else if (SuggestedEventsManager.isEligibleEvents$facebook_core_release(predictedEvent)) {
                sendPredictedResult(predictedEvent, buttonText, dense);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean queryHistoryAndProcess(String pathID, String buttonText) {
            String strQueryEvent = PredictionHistoryManager.queryEvent(pathID);
            if (strQueryEvent == null) {
                return false;
            }
            if (strQueryEvent.equals("other")) {
                return true;
            }
            try {
                s.d().execute(new c(strQueryEvent, buttonText, 3));
                return true;
            } catch (Exception unused) {
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void queryHistoryAndProcess$lambda$0(String queriedEvent, String buttonText) {
            n.f(queriedEvent, "$queriedEvent");
            n.f(buttonText, "$buttonText");
            ViewOnClickListener.INSTANCE.processPredictedResult(queriedEvent, buttonText, new float[0]);
        }

        private final void sendPredictedResult(String eventToPost, String buttonText, float[] dense) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", eventToPost);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                for (float f10 : dense) {
                    sb2.append(f10);
                    sb2.append(",");
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", buttonText);
                bundle.putString(TtmlNode.TAG_METADATA, jSONObject.toString());
                String str = b0.f45085j;
                b0 b0VarA = j2.n.A(null, String.format(Locale.US, ViewOnClickListener.API_ENDPOINT, Arrays.copyOf(new Object[]{s.c()}, 1)), null, null);
                b0VarA.f45090d = bundle;
                b0VarA.c();
            } catch (JSONException unused) {
            }
        }

        public final void attachListener$facebook_core_release(View hostView, View rootView, String activityName) {
            n.f(hostView, "hostView");
            n.f(rootView, "rootView");
            n.f(activityName, "activityName");
            int iHashCode = hostView.hashCode();
            if (ViewOnClickListener.access$getViewsAttachedListener$cp().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            ViewHierarchy.setOnClickListener(hostView, new ViewOnClickListener(hostView, rootView, activityName, null));
            ViewOnClickListener.access$getViewsAttachedListener$cp().add(Integer.valueOf(iHashCode));
        }

        private Companion() {
        }
    }

    public /* synthetic */ ViewOnClickListener(View view, View view2, String str, g gVar) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set access$getViewsAttachedListener$cp() {
        if (a.b(ViewOnClickListener.class)) {
            return null;
        }
        try {
            return viewsAttachedListener;
        } catch (Throwable th2) {
            a.a(ViewOnClickListener.class, th2);
            return null;
        }
    }

    public static final void attachListener$facebook_core_release(View view, View view2, String str) {
        if (a.b(ViewOnClickListener.class)) {
            return;
        }
        try {
            INSTANCE.attachListener$facebook_core_release(view, view2, str);
        } catch (Throwable th2) {
            a.a(ViewOnClickListener.class, th2);
        }
    }

    private final void predictAndProcess(String pathID, String buttonText, JSONObject viewData) {
        ViewOnClickListener viewOnClickListener;
        if (a.b(this)) {
            return;
        }
        try {
            viewOnClickListener = this;
            try {
                try {
                    s.d().execute(new r(viewData, buttonText, viewOnClickListener, pathID, 21));
                } catch (Exception unused) {
                }
            } catch (Throwable th2) {
                th = th2;
                a.a(viewOnClickListener, th);
            }
        } catch (Throwable th3) {
            th = th3;
            viewOnClickListener = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void predictAndProcess$lambda$0(JSONObject viewData, String buttonText, ViewOnClickListener this$0, String pathID) {
        String[] strArrPredict;
        if (a.b(ViewOnClickListener.class)) {
            return;
        }
        try {
            n.f(viewData, "$viewData");
            n.f(buttonText, "$buttonText");
            n.f(this$0, "this$0");
            n.f(pathID, "$pathID");
            try {
                String lowerCase = e0.l(s.b()).toLowerCase();
                n.e(lowerCase, "this as java.lang.String).toLowerCase()");
                float[] denseFeatures = FeatureExtractor.getDenseFeatures(viewData, lowerCase);
                String textFeature = FeatureExtractor.getTextFeature(buttonText, this$0.activityName, lowerCase);
                if (denseFeatures != null && (strArrPredict = ModelManager.predict(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{denseFeatures}, new String[]{textFeature})) != null) {
                    String str = strArrPredict[0];
                    PredictionHistoryManager.addPrediction(pathID, str);
                    if (n.a(str, "other")) {
                        return;
                    }
                    INSTANCE.processPredictedResult(str, buttonText, denseFeatures);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            a.a(ViewOnClickListener.class, th2);
        }
    }

    private final void process() {
        if (a.b(this)) {
            return;
        }
        try {
            View view = this.rootViewWeakReference.get();
            View view2 = this.hostViewWeakReference.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String textOfViewRecursively = SuggestedEventViewHierarchy.getTextOfViewRecursively(view2);
                String pathID = PredictionHistoryManager.getPathID(view2, textOfViewRecursively);
                if (pathID != null && !INSTANCE.queryHistoryAndProcess(pathID, textOfViewRecursively)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("view", SuggestedEventViewHierarchy.getDictionaryOfView(view, view2));
                    jSONObject.put(ViewHierarchyConstants.SCREEN_NAME_KEY, this.activityName);
                    predictAndProcess(pathID, textOfViewRecursively, jSONObject);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (a.b(this)) {
            return;
        }
        try {
            if (a.b(this)) {
                return;
            }
            try {
                n.f(view, "view");
                View.OnClickListener onClickListener = this.baseListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                process();
            } catch (Throwable th2) {
                a.a(this, th2);
            }
        } catch (Throwable th3) {
            a.a(this, th3);
        }
    }

    private ViewOnClickListener(View view, View view2, String str) {
        this.baseListener = ViewHierarchy.getExistingOnClickListener(view);
        this.rootViewWeakReference = new WeakReference<>(view2);
        this.hostViewWeakReference = new WeakReference<>(view);
        String lowerCase = str.toLowerCase();
        n.e(lowerCase, "this as java.lang.String).toLowerCase()");
        this.activityName = p.n0(lowerCase, "activity", "");
    }
}
