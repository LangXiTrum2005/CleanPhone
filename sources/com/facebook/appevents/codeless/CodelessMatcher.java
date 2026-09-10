package com.facebook.appevents.codeless;

import an.h;
import an.p;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ParameterComponent;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.unity3d.services.core.fid.Constants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l7.s;
import q7.e0;
import q7.r;
import q7.u;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R&\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019RF\u0010\u001d\u001a4\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u001aj\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher;", "", "<init>", "()V", "Lwj/r;", "startTracking", "matchViews", "Landroid/app/Activity;", "activity", "add", "(Landroid/app/Activity;)V", "remove", "destroy", "Landroid/os/Handler;", "uiThreadHandler", "Landroid/os/Handler;", "", "activitiesSet", "Ljava/util/Set;", "Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;", "viewMatchers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "listenerSet", "Ljava/util/HashSet;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "activityToListenerMap", "Ljava/util/HashMap;", "Companion", "MatchedView", "ViewMatcher", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CodelessMatcher {
    private static final String CURRENT_CLASS_NAME = ".";
    private static final String PARENT_CLASS_NAME = "..";
    private static CodelessMatcher codelessMatcher;
    private final Set<Activity> activitiesSet;
    private final HashMap<Integer, HashSet<String>> activityToListenerMap;
    private HashSet<String> listenerSet;
    private final Handler uiThreadHandler;
    private final Set<ViewMatcher> viewMatchers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = CodelessMatcher.class.getCanonicalName();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\tH\u0007J\"\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$Companion;", "", "()V", "CURRENT_CLASS_NAME", "", "PARENT_CLASS_NAME", "TAG", "kotlin.jvm.PlatformType", "codelessMatcher", "Lcom/facebook/appevents/codeless/CodelessMatcher;", Constants.GET_INSTANCE, "getParameters", "Landroid/os/Bundle;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "rootView", "Landroid/view/View;", "hostView", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final synchronized CodelessMatcher getInstance() {
            CodelessMatcher codelessMatcherAccess$getCodelessMatcher$cp;
            try {
                if (CodelessMatcher.access$getCodelessMatcher$cp() == null) {
                    CodelessMatcher.access$setCodelessMatcher$cp(new CodelessMatcher(null));
                }
                codelessMatcherAccess$getCodelessMatcher$cp = CodelessMatcher.access$getCodelessMatcher$cp();
                n.d(codelessMatcherAccess$getCodelessMatcher$cp, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            } catch (Throwable th2) {
                throw th2;
            }
            return codelessMatcherAccess$getCodelessMatcher$cp;
        }

        public final Bundle getParameters(EventBinding mapping, View rootView, View hostView) {
            List<ParameterComponent> viewParameters;
            EventBinding eventBinding;
            View view;
            List<MatchedView> listFindViewByPath;
            n.f(rootView, "rootView");
            n.f(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (mapping != null && (viewParameters = mapping.getViewParameters()) != null) {
                for (ParameterComponent parameterComponent : viewParameters) {
                    if (parameterComponent.getValue() != null && parameterComponent.getValue().length() > 0) {
                        bundle.putString(parameterComponent.getName(), parameterComponent.getValue());
                    } else if (parameterComponent.getPath().size() > 0) {
                        if (n.a(parameterComponent.getPathType(), com.facebook.appevents.codeless.internal.Constants.PATH_TYPE_RELATIVE)) {
                            EventBinding eventBinding2 = mapping;
                            listFindViewByPath = ViewMatcher.INSTANCE.findViewByPath(eventBinding2, hostView, parameterComponent.getPath(), 0, -1, hostView.getClass().getSimpleName());
                            eventBinding = eventBinding2;
                            view = rootView;
                        } else {
                            eventBinding = mapping;
                            view = rootView;
                            listFindViewByPath = ViewMatcher.INSTANCE.findViewByPath(eventBinding, view, parameterComponent.getPath(), 0, -1, rootView.getClass().getSimpleName());
                        }
                        for (MatchedView matchedView : listFindViewByPath) {
                            if (matchedView.getView() != null) {
                                String textOfView = ViewHierarchy.getTextOfView(matchedView.getView());
                                if (textOfView.length() > 0) {
                                    bundle.putString(parameterComponent.getName(), textOfView);
                                    break;
                                }
                            }
                        }
                        mapping = eventBinding;
                        rootView = view;
                    }
                }
            }
            return bundle;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u0003R\u0016\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "", "view", "Landroid/view/View;", "viewMapKey", "", "(Landroid/view/View;Ljava/lang/String;)V", "Ljava/lang/ref/WeakReference;", "getViewMapKey", "()Ljava/lang/String;", "getView", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class MatchedView {
        private final WeakReference<View> view;
        private final String viewMapKey;

        public MatchedView(View view, String viewMapKey) {
            n.f(view, "view");
            n.f(viewMapKey, "viewMapKey");
            this.view = new WeakReference<>(view);
            this.viewMapKey = viewMapKey;
        }

        public final View getView() {
            WeakReference<View> weakReference = this.view;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final String getViewMapKey() {
            return this.viewMapKey;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001(B9\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J'\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J'\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0011J\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010'¨\u0006)"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Ljava/lang/Runnable;", "Landroid/view/View;", "rootView", "Landroid/os/Handler;", "handler", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "listenerSet", "activityName", "<init>", "(Landroid/view/View;Landroid/os/Handler;Ljava/util/HashSet;Ljava/lang/String;)V", "Lwj/r;", "startMatch", "()V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "findView", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;)V", "Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "matchedView", "attachListener", "(Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;Landroid/view/View;Lcom/facebook/appevents/codeless/internal/EventBinding;)V", "attachOnClickListener", "attachOnItemClickListener", "attachRCTListener", "run", "onGlobalLayout", "onScrollChanged", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "eventBindings", "Ljava/util/List;", "Landroid/os/Handler;", "Ljava/util/HashSet;", "Ljava/lang/String;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class ViewMatcher implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String activityName;
        private List<EventBinding> eventBindings;
        private final Handler handler;
        private final HashSet<String> listenerSet;
        private final WeakReference<View> rootView;

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¨\u0006\u0018"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessMatcher$ViewMatcher$Companion;", "", "()V", "findViewByPath", "", "Lcom/facebook/appevents/codeless/CodelessMatcher$MatchedView;", "mapping", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "view", "Landroid/view/View;", "path", "Lcom/facebook/appevents/codeless/internal/PathComponent;", AppLovinEventTypes.USER_COMPLETED_LEVEL, "", "index", "mapKey", "", "findVisibleChildren", "viewGroup", "Landroid/view/ViewGroup;", "isTheSameView", "", "targetView", "pathElement", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public static final class Companion {
            public /* synthetic */ Companion(g gVar) {
                this();
            }

            private final List<View> findVisibleChildren(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (childAt.getVisibility() == 0) {
                        arrayList.add(childAt);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0074  */
            /* JADX WARN: Code duplicated, block: B:21:0x008d  */
            /* JADX WARN: Code duplicated, block: B:23:0x009a  */
            /* JADX WARN: Code duplicated, block: B:25:0x00b0  */
            /* JADX WARN: Code duplicated, block: B:28:0x00b8  */
            /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
            /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
            /* JADX WARN: Code duplicated, block: B:33:0x00d3  */
            /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
            /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
            /* JADX WARN: Code duplicated, block: B:41:0x00fd  */
            /* JADX WARN: Code duplicated, block: B:43:0x0113  */
            /* JADX WARN: Code duplicated, block: B:46:0x011a  */
            /* JADX WARN: Code duplicated, block: B:48:0x0127  */
            /* JADX WARN: Code duplicated, block: B:51:0x0132  */
            /* JADX WARN: Code duplicated, block: B:54:0x0148  */
            /* JADX WARN: Instruction removed from duplicated block: B:28:0x00b8, please report this as an issue */
            private final boolean isTheSameView(View targetView, PathComponent pathElement, int index) {
                String tag;
                String string;
                String hint;
                String hintOfView;
                String description;
                String string2;
                String text;
                String textOfView;
                if (pathElement.getIndex() == -1 || index == pathElement.getIndex()) {
                    if (n.a(targetView.getClass().getCanonicalName(), pathElement.getClassName())) {
                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.ID.getValue()) > 0) {
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TEXT.getValue()) <= 0) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                            tag = pathElement.getTag();
                                            if (targetView.getTag() != null) {
                                            }
                                            String strD = e0.d(e0.J(string));
                                            if (!n.a(tag, string)) {
                                            }
                                        }
                                        return true;
                                    }
                                    hint = pathElement.getHint();
                                    hintOfView = ViewHierarchy.getHintOfView(targetView);
                                    String strD2 = e0.d(e0.J(hintOfView));
                                    if (n.a(hint, hintOfView)) {
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                            tag = pathElement.getTag();
                                            if (targetView.getTag() != null) {
                                            }
                                            String strD3 = e0.d(e0.J(string));
                                            if (!n.a(tag, string)) {
                                            }
                                        }
                                        return true;
                                    }
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD4 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                description = pathElement.getDescription();
                                if (targetView.getContentDescription() == null) {
                                    string2 = "";
                                } else {
                                    string2 = targetView.getContentDescription().toString();
                                }
                                String strD5 = e0.d(e0.J(string2));
                                if (n.a(description, string2)) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                            tag = pathElement.getTag();
                                            if (targetView.getTag() != null) {
                                            }
                                            String strD6 = e0.d(e0.J(string));
                                            if (!n.a(tag, string)) {
                                            }
                                        }
                                        return true;
                                    }
                                    hint = pathElement.getHint();
                                    hintOfView = ViewHierarchy.getHintOfView(targetView);
                                    String strD7 = e0.d(e0.J(hintOfView));
                                    if (n.a(hint, hintOfView)) {
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                            tag = pathElement.getTag();
                                            if (targetView.getTag() != null) {
                                            }
                                            String strD8 = e0.d(e0.J(string));
                                            if (!n.a(tag, string)) {
                                            }
                                        }
                                        return true;
                                    }
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD9 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD10 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                hint = pathElement.getHint();
                                hintOfView = ViewHierarchy.getHintOfView(targetView);
                                String strD11 = e0.d(e0.J(hintOfView));
                                if (n.a(hint, hintOfView)) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD12 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD13 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            text = pathElement.getText();
                            textOfView = ViewHierarchy.getTextOfView(targetView);
                            String strD14 = e0.d(e0.J(textOfView));
                            if (n.a(text, textOfView)) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                            tag = pathElement.getTag();
                                            if (targetView.getTag() != null) {
                                            }
                                            String strD15 = e0.d(e0.J(string));
                                            if (!n.a(tag, string)) {
                                            }
                                        }
                                        return true;
                                    }
                                    hint = pathElement.getHint();
                                    hintOfView = ViewHierarchy.getHintOfView(targetView);
                                    String strD16 = e0.d(e0.J(hintOfView));
                                    if (n.a(hint, hintOfView)) {
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                            tag = pathElement.getTag();
                                            if (targetView.getTag() != null) {
                                            }
                                            String strD17 = e0.d(e0.J(string));
                                            if (!n.a(tag, string)) {
                                            }
                                        }
                                        return true;
                                    }
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD18 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                description = pathElement.getDescription();
                                if (targetView.getContentDescription() == null) {
                                    string2 = "";
                                } else {
                                    string2 = targetView.getContentDescription().toString();
                                }
                                String strD19 = e0.d(e0.J(string2));
                                if (n.a(description, string2)) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                            tag = pathElement.getTag();
                                            if (targetView.getTag() != null) {
                                            }
                                            String strD110 = e0.d(e0.J(string));
                                            if (!n.a(tag, string)) {
                                            }
                                        }
                                        return true;
                                    }
                                    hint = pathElement.getHint();
                                    hintOfView = ViewHierarchy.getHintOfView(targetView);
                                    String strD111 = e0.d(e0.J(hintOfView));
                                    if (n.a(hint, hintOfView)) {
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                            tag = pathElement.getTag();
                                            if (targetView.getTag() != null) {
                                            }
                                            String strD112 = e0.d(e0.J(string));
                                            if (!n.a(tag, string)) {
                                            }
                                        }
                                        return true;
                                    }
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD113 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD114 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                hint = pathElement.getHint();
                                hintOfView = ViewHierarchy.getHintOfView(targetView);
                                String strD115 = e0.d(e0.J(hintOfView));
                                if (n.a(hint, hintOfView)) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD116 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD117 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD118 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                hint = pathElement.getHint();
                                hintOfView = ViewHierarchy.getHintOfView(targetView);
                                String strD119 = e0.d(e0.J(hintOfView));
                                if (n.a(hint, hintOfView)) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD1110 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD1111 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            description = pathElement.getDescription();
                            if (targetView.getContentDescription() == null) {
                                string2 = "";
                            } else {
                                string2 = targetView.getContentDescription().toString();
                            }
                            String strD120 = e0.d(e0.J(string2));
                            if (n.a(description, string2)) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD1112 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                hint = pathElement.getHint();
                                hintOfView = ViewHierarchy.getHintOfView(targetView);
                                String strD1113 = e0.d(e0.J(hintOfView));
                                if (n.a(hint, hintOfView)) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD1114 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD1115 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD1116 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            hint = pathElement.getHint();
                            hintOfView = ViewHierarchy.getHintOfView(targetView);
                            String strD1117 = e0.d(e0.J(hintOfView));
                            if (n.a(hint, hintOfView)) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD1118 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                tag = pathElement.getTag();
                                if (targetView.getTag() != null) {
                                }
                                String strD1119 = e0.d(e0.J(string));
                                if (!n.a(tag, string)) {
                                }
                            }
                            return true;
                        }
                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TEXT.getValue()) <= 0) {
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD11110 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                hint = pathElement.getHint();
                                hintOfView = ViewHierarchy.getHintOfView(targetView);
                                String strD11111 = e0.d(e0.J(hintOfView));
                                if (n.a(hint, hintOfView)) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD11112 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD11113 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            description = pathElement.getDescription();
                            if (targetView.getContentDescription() == null) {
                                string2 = "";
                            } else {
                                string2 = targetView.getContentDescription().toString();
                            }
                            String strD121 = e0.d(e0.J(string2));
                            if (n.a(description, string2)) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD11114 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                hint = pathElement.getHint();
                                hintOfView = ViewHierarchy.getHintOfView(targetView);
                                String strD11115 = e0.d(e0.J(hintOfView));
                                if (n.a(hint, hintOfView)) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD11116 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD11117 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD11118 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            hint = pathElement.getHint();
                            hintOfView = ViewHierarchy.getHintOfView(targetView);
                            String strD11119 = e0.d(e0.J(hintOfView));
                            if (n.a(hint, hintOfView)) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD111110 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                tag = pathElement.getTag();
                                if (targetView.getTag() != null) {
                                }
                                String strD111111 = e0.d(e0.J(string));
                                if (!n.a(tag, string)) {
                                }
                            }
                            return true;
                        }
                        text = pathElement.getText();
                        textOfView = ViewHierarchy.getTextOfView(targetView);
                        String strD122 = e0.d(e0.J(textOfView));
                        if (n.a(text, textOfView)) {
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD111112 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                hint = pathElement.getHint();
                                hintOfView = ViewHierarchy.getHintOfView(targetView);
                                String strD111113 = e0.d(e0.J(hintOfView));
                                if (n.a(hint, hintOfView)) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD111114 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD111115 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            description = pathElement.getDescription();
                            if (targetView.getContentDescription() == null) {
                                string2 = "";
                            } else {
                                string2 = targetView.getContentDescription().toString();
                            }
                            String strD123 = e0.d(e0.J(string2));
                            if (n.a(description, string2)) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD111116 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                hint = pathElement.getHint();
                                hintOfView = ViewHierarchy.getHintOfView(targetView);
                                String strD111117 = e0.d(e0.J(hintOfView));
                                if (n.a(hint, hintOfView)) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                        tag = pathElement.getTag();
                                        if (targetView.getTag() != null) {
                                        }
                                        String strD111118 = e0.d(e0.J(string));
                                        if (!n.a(tag, string)) {
                                        }
                                    }
                                    return true;
                                }
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD111119 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD1111110 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            hint = pathElement.getHint();
                            hintOfView = ViewHierarchy.getHintOfView(targetView);
                            String strD1111111 = e0.d(e0.J(hintOfView));
                            if (n.a(hint, hintOfView)) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD1111112 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                tag = pathElement.getTag();
                                if (targetView.getTag() != null) {
                                }
                                String strD1111113 = e0.d(e0.J(string));
                                if (!n.a(tag, string)) {
                                }
                            }
                            return true;
                        }
                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD1111114 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            hint = pathElement.getHint();
                            hintOfView = ViewHierarchy.getHintOfView(targetView);
                            String strD1111115 = e0.d(e0.J(hintOfView));
                            if (n.a(hint, hintOfView)) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD1111116 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                tag = pathElement.getTag();
                                if (targetView.getTag() != null) {
                                }
                                String strD1111117 = e0.d(e0.J(string));
                                if (!n.a(tag, string)) {
                                }
                            }
                            return true;
                        }
                        description = pathElement.getDescription();
                        if (targetView.getContentDescription() == null) {
                            string2 = "";
                        } else {
                            string2 = targetView.getContentDescription().toString();
                        }
                        String strD124 = e0.d(e0.J(string2));
                        if (n.a(description, string2)) {
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD1111118 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            hint = pathElement.getHint();
                            hintOfView = ViewHierarchy.getHintOfView(targetView);
                            String strD1111119 = e0.d(e0.J(hintOfView));
                            if (n.a(hint, hintOfView)) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                    tag = pathElement.getTag();
                                    if (targetView.getTag() != null) {
                                    }
                                    String strD11111110 = e0.d(e0.J(string));
                                    if (!n.a(tag, string)) {
                                    }
                                }
                                return true;
                            }
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                tag = pathElement.getTag();
                                if (targetView.getTag() != null) {
                                }
                                String strD11111111 = e0.d(e0.J(string));
                                if (!n.a(tag, string)) {
                                }
                            }
                            return true;
                        }
                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                tag = pathElement.getTag();
                                if (targetView.getTag() != null) {
                                }
                                String strD11111112 = e0.d(e0.J(string));
                                if (!n.a(tag, string)) {
                                }
                            }
                            return true;
                        }
                        hint = pathElement.getHint();
                        hintOfView = ViewHierarchy.getHintOfView(targetView);
                        String strD11111113 = e0.d(e0.J(hintOfView));
                        if (n.a(hint, hintOfView)) {
                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                tag = pathElement.getTag();
                                if (targetView.getTag() != null) {
                                }
                                String strD11111114 = e0.d(e0.J(string));
                                if (!n.a(tag, string)) {
                                }
                            }
                            return true;
                        }
                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                            tag = pathElement.getTag();
                            if (targetView.getTag() != null) {
                            }
                            String strD11111115 = e0.d(e0.J(string));
                            if (!n.a(tag, string)) {
                            }
                        }
                        return true;
                    }
                    String input = pathElement.getClassName();
                    Pattern patternCompile = Pattern.compile(".*android\\..*");
                    n.e(patternCompile, "compile(...)");
                    n.f(input, "input");
                    if (patternCompile.matcher(input).matches()) {
                        List listI0 = h.I0(pathElement.getClassName(), new String[]{CodelessMatcher.CURRENT_CLASS_NAME}, 0, 6);
                        if (!listI0.isEmpty()) {
                            if (targetView.getClass().getSimpleName().equals((String) listI0.get(listI0.size() - 1))) {
                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.ID.getValue()) > 0 || pathElement.getId() == targetView.getId()) {
                                    if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TEXT.getValue()) <= 0) {
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                    tag = pathElement.getTag();
                                                    if (targetView.getTag() != null) {
                                                    }
                                                    String strD11111116 = e0.d(e0.J(string));
                                                    if (!n.a(tag, string)) {
                                                    }
                                                }
                                                return true;
                                            }
                                            hint = pathElement.getHint();
                                            hintOfView = ViewHierarchy.getHintOfView(targetView);
                                            String strD11111117 = e0.d(e0.J(hintOfView));
                                            if (n.a(hint, hintOfView)) {
                                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                    tag = pathElement.getTag();
                                                    if (targetView.getTag() != null) {
                                                    }
                                                    String strD11111118 = e0.d(e0.J(string));
                                                    if (!n.a(tag, string)) {
                                                    }
                                                }
                                                return true;
                                            }
                                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                tag = pathElement.getTag();
                                                if (targetView.getTag() != null) {
                                                }
                                                String strD11111119 = e0.d(e0.J(string));
                                                if (!n.a(tag, string)) {
                                                }
                                            }
                                            return true;
                                        }
                                        description = pathElement.getDescription();
                                        if (targetView.getContentDescription() == null) {
                                            string2 = "";
                                        } else {
                                            string2 = targetView.getContentDescription().toString();
                                        }
                                        String strD125 = e0.d(e0.J(string2));
                                        if (n.a(description, string2)) {
                                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                    tag = pathElement.getTag();
                                                    if (targetView.getTag() != null) {
                                                    }
                                                    String strD111111110 = e0.d(e0.J(string));
                                                    if (!n.a(tag, string)) {
                                                    }
                                                }
                                                return true;
                                            }
                                            hint = pathElement.getHint();
                                            hintOfView = ViewHierarchy.getHintOfView(targetView);
                                            String strD111111111 = e0.d(e0.J(hintOfView));
                                            if (n.a(hint, hintOfView)) {
                                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                    tag = pathElement.getTag();
                                                    if (targetView.getTag() != null) {
                                                    }
                                                    String strD111111112 = e0.d(e0.J(string));
                                                    if (!n.a(tag, string)) {
                                                    }
                                                }
                                                return true;
                                            }
                                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                tag = pathElement.getTag();
                                                if (targetView.getTag() != null) {
                                                }
                                                String strD111111113 = e0.d(e0.J(string));
                                                if (!n.a(tag, string)) {
                                                }
                                            }
                                            return true;
                                        }
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                tag = pathElement.getTag();
                                                if (targetView.getTag() != null) {
                                                }
                                                String strD111111114 = e0.d(e0.J(string));
                                                if (!n.a(tag, string)) {
                                                }
                                            }
                                            return true;
                                        }
                                        hint = pathElement.getHint();
                                        hintOfView = ViewHierarchy.getHintOfView(targetView);
                                        String strD111111115 = e0.d(e0.J(hintOfView));
                                        if (n.a(hint, hintOfView)) {
                                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                tag = pathElement.getTag();
                                                if (targetView.getTag() != null) {
                                                }
                                                String strD111111116 = e0.d(e0.J(string));
                                                if (!n.a(tag, string)) {
                                                }
                                            }
                                            return true;
                                        }
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                            tag = pathElement.getTag();
                                            if (targetView.getTag() != null) {
                                            }
                                            String strD111111117 = e0.d(e0.J(string));
                                            if (!n.a(tag, string)) {
                                            }
                                        }
                                        return true;
                                    }
                                    text = pathElement.getText();
                                    textOfView = ViewHierarchy.getTextOfView(targetView);
                                    String strD126 = e0.d(e0.J(textOfView));
                                    if (n.a(text, textOfView) || n.a(text, strD126)) {
                                        if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                    tag = pathElement.getTag();
                                                    if (targetView.getTag() != null) {
                                                    }
                                                    String strD111111118 = e0.d(e0.J(string));
                                                    if (!n.a(tag, string)) {
                                                    }
                                                }
                                                return true;
                                            }
                                            hint = pathElement.getHint();
                                            hintOfView = ViewHierarchy.getHintOfView(targetView);
                                            String strD111111119 = e0.d(e0.J(hintOfView));
                                            if (n.a(hint, hintOfView)) {
                                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                    tag = pathElement.getTag();
                                                    if (targetView.getTag() != null) {
                                                    }
                                                    String strD1111111110 = e0.d(e0.J(string));
                                                    if (!n.a(tag, string)) {
                                                    }
                                                }
                                                return true;
                                            }
                                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                tag = pathElement.getTag();
                                                if (targetView.getTag() != null) {
                                                }
                                                String strD1111111111 = e0.d(e0.J(string));
                                                if (!n.a(tag, string)) {
                                                }
                                            }
                                            return true;
                                        }
                                        description = pathElement.getDescription();
                                        if (targetView.getContentDescription() == null) {
                                            string2 = "";
                                        } else {
                                            string2 = targetView.getContentDescription().toString();
                                        }
                                        String strD127 = e0.d(e0.J(string2));
                                        if (n.a(description, string2) || n.a(description, strD127)) {
                                            if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) <= 0) {
                                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                    tag = pathElement.getTag();
                                                    if (targetView.getTag() != null) {
                                                    }
                                                    String strD1111111112 = e0.d(e0.J(string));
                                                    if (!n.a(tag, string)) {
                                                    }
                                                }
                                                return true;
                                            }
                                            hint = pathElement.getHint();
                                            hintOfView = ViewHierarchy.getHintOfView(targetView);
                                            String strD1111111113 = e0.d(e0.J(hintOfView));
                                            if (n.a(hint, hintOfView) || n.a(hint, strD1111111113)) {
                                                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                                                    tag = pathElement.getTag();
                                                    string = targetView.getTag() != null ? targetView.getTag().toString() : "";
                                                    String strD1111111114 = e0.d(e0.J(string));
                                                    if (!n.a(tag, string) || n.a(tag, strD1111111114)) {
                                                    }
                                                }
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            }

            public final List<MatchedView> findViewByPath(EventBinding mapping, View view, List<PathComponent> path, int level, int index, String mapKey) {
                EventBinding eventBinding;
                List<PathComponent> list;
                Companion companion;
                n.f(path, "path");
                n.f(mapKey, "mapKey");
                String str = mapKey + '.' + index;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (level >= path.size()) {
                        arrayList.add(new MatchedView(view, str));
                        eventBinding = mapping;
                        list = path;
                        companion = this;
                    } else {
                        PathComponent pathComponent = path.get(level);
                        if (n.a(pathComponent.getClassName(), CodelessMatcher.PARENT_CLASS_NAME)) {
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                List<View> listFindVisibleChildren = findVisibleChildren((ViewGroup) parent);
                                int size = listFindVisibleChildren.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Companion companion2 = this;
                                    EventBinding eventBinding2 = mapping;
                                    arrayList.addAll(companion2.findViewByPath(eventBinding2, listFindVisibleChildren.get(i10), path, level + 1, i10, str));
                                    i10++;
                                    this = companion2;
                                    mapping = eventBinding2;
                                }
                            }
                        } else {
                            eventBinding = mapping;
                            list = path;
                            companion = this;
                            if (n.a(pathComponent.getClassName(), CodelessMatcher.CURRENT_CLASS_NAME)) {
                                arrayList.add(new MatchedView(view, str));
                                return arrayList;
                            }
                            if (companion.isTheSameView(view, pathComponent, index)) {
                                if (level == list.size() - 1) {
                                    arrayList.add(new MatchedView(view, str));
                                }
                            }
                        }
                    }
                    if (view instanceof ViewGroup) {
                        List<View> listFindVisibleChildren2 = companion.findVisibleChildren((ViewGroup) view);
                        int size2 = listFindVisibleChildren2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Companion companion3 = companion;
                            arrayList.addAll(companion3.findViewByPath(eventBinding, listFindVisibleChildren2.get(i11), list, level + 1, i11, str));
                            i11++;
                            companion = companion3;
                        }
                    }
                }
                return arrayList;
            }

            private Companion() {
            }
        }

        public ViewMatcher(View view, Handler handler, HashSet<String> listenerSet, String activityName) {
            n.f(handler, "handler");
            n.f(listenerSet, "listenerSet");
            n.f(activityName, "activityName");
            this.rootView = new WeakReference<>(view);
            this.handler = handler;
            this.listenerSet = listenerSet;
            this.activityName = activityName;
            handler.postDelayed(this, 200L);
        }

        private final void attachListener(MatchedView matchedView, View rootView, EventBinding mapping) {
            if (mapping == null) {
                return;
            }
            try {
                View view = matchedView.getView();
                if (view == null) {
                    return;
                }
                View viewFindRCTRootView = ViewHierarchy.findRCTRootView(view);
                if (viewFindRCTRootView != null && ViewHierarchy.INSTANCE.isRCTButton(view, viewFindRCTRootView)) {
                    attachRCTListener(matchedView, rootView, mapping);
                    return;
                }
                if (p.p0(view.getClass().getName(), "com.facebook.react", false)) {
                    return;
                }
                if (!(view instanceof AdapterView)) {
                    attachOnClickListener(matchedView, rootView, mapping);
                } else if (view instanceof ListView) {
                    attachOnItemClickListener(matchedView, rootView, mapping);
                }
            } catch (Exception e10) {
                e0.A(CodelessMatcher.access$getTAG$cp(), e10);
            }
        }

        private final void attachOnClickListener(MatchedView matchedView, View rootView, EventBinding mapping) {
            View view = matchedView.getView();
            if (view == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            View.OnClickListener existingOnClickListener = ViewHierarchy.getExistingOnClickListener(view);
            boolean z10 = (existingOnClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnClickListener) && ((CodelessLoggingEventListener.AutoLoggingOnClickListener) existingOnClickListener).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z10) {
                return;
            }
            view.setOnClickListener(CodelessLoggingEventListener.getOnClickListener(mapping, rootView, view));
            this.listenerSet.add(viewMapKey);
        }

        private final void attachOnItemClickListener(MatchedView matchedView, View rootView, EventBinding mapping) {
            AdapterView adapterView = (AdapterView) matchedView.getView();
            if (adapterView == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            boolean z10 = (onItemClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnItemClickListener) && ((CodelessLoggingEventListener.AutoLoggingOnItemClickListener) onItemClickListener).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z10) {
                return;
            }
            adapterView.setOnItemClickListener(CodelessLoggingEventListener.getOnItemClickListener(mapping, rootView, adapterView));
            this.listenerSet.add(viewMapKey);
        }

        private final void attachRCTListener(MatchedView matchedView, View rootView, EventBinding mapping) {
            View view = matchedView.getView();
            if (view == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            View.OnTouchListener existingOnTouchListener = ViewHierarchy.getExistingOnTouchListener(view);
            boolean z10 = (existingOnTouchListener instanceof RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) && ((RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener) existingOnTouchListener).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z10) {
                return;
            }
            view.setOnTouchListener(RCTCodelessLoggingEventListener.getOnTouchListener(mapping, rootView, view));
            this.listenerSet.add(viewMapKey);
        }

        private final void findView(EventBinding mapping, View rootView) {
            if (mapping == null || rootView == null) {
                return;
            }
            String activityName = mapping.getActivityName();
            if (activityName == null || activityName.length() == 0 || n.a(mapping.getActivityName(), this.activityName)) {
                List<PathComponent> viewPath = mapping.getViewPath();
                if (viewPath.size() > 25) {
                    return;
                }
                Iterator<MatchedView> it = INSTANCE.findViewByPath(mapping, rootView, viewPath, 0, -1, this.activityName).iterator();
                while (it.hasNext()) {
                    attachListener(it.next(), rootView, mapping);
                }
            }
        }

        public static final List<MatchedView> findViewByPath(EventBinding eventBinding, View view, List<PathComponent> list, int i10, int i11, String str) {
            return INSTANCE.findViewByPath(eventBinding, view, list, i10, i11, str);
        }

        private final void startMatch() {
            List<EventBinding> list = this.eventBindings;
            if (list == null || this.rootView.get() == null) {
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                findView(list.get(i10), this.rootView.get());
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            startMatch();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            startMatch();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (a.b(this)) {
                return;
            }
            try {
                if (a.b(this)) {
                    return;
                }
                try {
                    r rVarB = u.b(s.c());
                    if (rVarB != null && rVarB.f48763g) {
                        List<EventBinding> array = EventBinding.INSTANCE.parseArray(rVarB.f48764h);
                        this.eventBindings = array;
                        if (array != null && (view = this.rootView.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            startMatch();
                        }
                    }
                } catch (Throwable th2) {
                    a.a(this, th2);
                }
            } catch (Throwable th3) {
                a.a(this, th3);
            }
        }
    }

    public /* synthetic */ CodelessMatcher(g gVar) {
        this();
    }

    public static final /* synthetic */ CodelessMatcher access$getCodelessMatcher$cp() {
        if (a.b(CodelessMatcher.class)) {
            return null;
        }
        try {
            return codelessMatcher;
        } catch (Throwable th2) {
            a.a(CodelessMatcher.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ String access$getTAG$cp() {
        if (a.b(CodelessMatcher.class)) {
            return null;
        }
        try {
            return TAG;
        } catch (Throwable th2) {
            a.a(CodelessMatcher.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ void access$setCodelessMatcher$cp(CodelessMatcher codelessMatcher2) {
        if (a.b(CodelessMatcher.class)) {
            return;
        }
        try {
            codelessMatcher = codelessMatcher2;
        } catch (Throwable th2) {
            a.a(CodelessMatcher.class, th2);
        }
    }

    public static final synchronized CodelessMatcher getInstance() {
        if (a.b(CodelessMatcher.class)) {
            return null;
        }
        try {
            return INSTANCE.getInstance();
        } catch (Throwable th2) {
            a.a(CodelessMatcher.class, th2);
            return null;
        }
    }

    public static final Bundle getParameters(EventBinding eventBinding, View view, View view2) {
        if (a.b(CodelessMatcher.class)) {
            return null;
        }
        try {
            return INSTANCE.getParameters(eventBinding, view, view2);
        } catch (Throwable th2) {
            a.a(CodelessMatcher.class, th2);
            return null;
        }
    }

    private final void matchViews() {
        if (a.b(this)) {
            return;
        }
        try {
            for (Activity activity : this.activitiesSet) {
                if (activity != null) {
                    this.viewMatchers.add(new ViewMatcher(AppEventUtility.getRootView(activity), this.uiThreadHandler, this.listenerSet, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    private final void startTracking() {
        if (a.b(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                matchViews();
            } else {
                this.uiThreadHandler.post(new androidx.fragment.app.n(this, 17));
            }
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startTracking$lambda$1(CodelessMatcher this$0) {
        if (a.b(CodelessMatcher.class)) {
            return;
        }
        try {
            n.f(this$0, "this$0");
            this$0.matchViews();
        } catch (Throwable th2) {
            a.a(CodelessMatcher.class, th2);
        }
    }

    public final void add(Activity activity) {
        if (a.b(this)) {
            return;
        }
        try {
            n.f(activity, "activity");
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new l7.n("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.add(activity);
            this.listenerSet.clear();
            HashSet<String> hashSet = this.activityToListenerMap.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.listenerSet = hashSet;
            }
            startTracking();
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public final void destroy(Activity activity) {
        if (a.b(this)) {
            return;
        }
        try {
            n.f(activity, "activity");
            this.activityToListenerMap.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    public final void remove(Activity activity) {
        if (a.b(this)) {
            return;
        }
        try {
            n.f(activity, "activity");
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new l7.n("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.remove(activity);
            this.viewMatchers.clear();
            HashMap<Integer, HashSet<String>> map = this.activityToListenerMap;
            Integer numValueOf = Integer.valueOf(activity.hashCode());
            Object objClone = this.listenerSet.clone();
            n.d(objClone, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
            map.put(numValueOf, (HashSet) objClone);
            this.listenerSet.clear();
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }

    private CodelessMatcher() {
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        n.e(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.activitiesSet = setNewSetFromMap;
        this.viewMatchers = new LinkedHashSet();
        this.listenerSet = new HashSet<>();
        this.activityToListenerMap = new HashMap<>();
    }
}
