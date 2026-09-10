package com.facebook.appevents.codeless;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import b2.o;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import v7.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessLoggingEventListener;", "", "<init>", "()V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnClickListener;", "getOnClickListener", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnClickListener;", "Landroid/widget/AdapterView;", "Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnItemClickListener;", "getOnItemClickListener", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/widget/AdapterView;)Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnItemClickListener;", "Lwj/r;", "logEvent$facebook_core_release", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "logEvent", "Landroid/os/Bundle;", "parameters", "updateParameters$facebook_core_release", "(Landroid/os/Bundle;)V", "updateParameters", "AutoLoggingOnClickListener", "AutoLoggingOnItemClickListener", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class CodelessLoggingEventListener {
    public static final CodelessLoggingEventListener INSTANCE = new CodelessLoggingEventListener();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnClickListener;", "Landroid/view/View$OnClickListener;", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)V", "view", "Lwj/r;", "onClick", "(Landroid/view/View;)V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "existingOnClickListener", "Landroid/view/View$OnClickListener;", "", "supportCodelessLogging", "Z", "getSupportCodelessLogging", "()Z", "setSupportCodelessLogging", "(Z)V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AutoLoggingOnClickListener implements View.OnClickListener {
        private View.OnClickListener existingOnClickListener;
        private WeakReference<View> hostView;
        private EventBinding mapping;
        private WeakReference<View> rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnClickListener(EventBinding mapping, View rootView, View hostView) {
            n.f(mapping, "mapping");
            n.f(rootView, "rootView");
            n.f(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new WeakReference<>(hostView);
            this.rootView = new WeakReference<>(rootView);
            this.existingOnClickListener = ViewHierarchy.getExistingOnClickListener(hostView);
            this.supportCodelessLogging = true;
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
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
                    View.OnClickListener onClickListener = this.existingOnClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    View view2 = this.rootView.get();
                    View view3 = this.hostView.get();
                    if (view2 == null || view3 == null) {
                        return;
                    }
                    CodelessLoggingEventListener.logEvent$facebook_core_release(this.mapping, view2, view3);
                    return;
                } catch (Throwable th2) {
                    a.a(this, th2);
                    return;
                }
                a.a(this, th);
            } catch (Throwable th3) {
                a.a(this, th3);
            }
        }

        public final void setSupportCodelessLogging(boolean z10) {
            this.supportCodelessLogging = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0011\u001a\u00020\u00102\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R \u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/facebook/appevents/codeless/CodelessLoggingEventListener$AutoLoggingOnItemClickListener;", "Landroid/widget/AdapterView$OnItemClickListener;", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "Landroid/widget/AdapterView;", "hostView", "<init>", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/widget/AdapterView;)V", "parent", "view", "", X3.i.L, "", "id", "Lwj/r;", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "existingOnItemClickListener", "Landroid/widget/AdapterView$OnItemClickListener;", "", "supportCodelessLogging", "Z", "getSupportCodelessLogging", "()Z", "setSupportCodelessLogging", "(Z)V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class AutoLoggingOnItemClickListener implements AdapterView.OnItemClickListener {
        private AdapterView.OnItemClickListener existingOnItemClickListener;
        private WeakReference<AdapterView<?>> hostView;
        private EventBinding mapping;
        private WeakReference<View> rootView;
        private boolean supportCodelessLogging;

        public AutoLoggingOnItemClickListener(EventBinding mapping, View rootView, AdapterView<?> hostView) {
            n.f(mapping, "mapping");
            n.f(rootView, "rootView");
            n.f(hostView, "hostView");
            this.mapping = mapping;
            this.hostView = new WeakReference<>(hostView);
            this.rootView = new WeakReference<>(rootView);
            this.existingOnItemClickListener = hostView.getOnItemClickListener();
            this.supportCodelessLogging = true;
        }

        public final boolean getSupportCodelessLogging() {
            return this.supportCodelessLogging;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> parent, View view, int position, long id2) {
            n.f(view, "view");
            AdapterView.OnItemClickListener onItemClickListener = this.existingOnItemClickListener;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(parent, view, position, id2);
            }
            View view2 = this.rootView.get();
            AdapterView<?> adapterView = this.hostView.get();
            if (view2 == null || adapterView == null) {
                return;
            }
            CodelessLoggingEventListener.logEvent$facebook_core_release(this.mapping, view2, adapterView);
        }

        public final void setSupportCodelessLogging(boolean z10) {
            this.supportCodelessLogging = z10;
        }
    }

    private CodelessLoggingEventListener() {
    }

    public static final AutoLoggingOnClickListener getOnClickListener(EventBinding mapping, View rootView, View hostView) {
        if (a.b(CodelessLoggingEventListener.class)) {
            return null;
        }
        try {
            n.f(mapping, "mapping");
            n.f(rootView, "rootView");
            n.f(hostView, "hostView");
            return new AutoLoggingOnClickListener(mapping, rootView, hostView);
        } catch (Throwable th2) {
            a.a(CodelessLoggingEventListener.class, th2);
            return null;
        }
    }

    public static final AutoLoggingOnItemClickListener getOnItemClickListener(EventBinding mapping, View rootView, AdapterView<?> hostView) {
        if (a.b(CodelessLoggingEventListener.class)) {
            return null;
        }
        try {
            n.f(mapping, "mapping");
            n.f(rootView, "rootView");
            n.f(hostView, "hostView");
            return new AutoLoggingOnItemClickListener(mapping, rootView, hostView);
        } catch (Throwable th2) {
            a.a(CodelessLoggingEventListener.class, th2);
            return null;
        }
    }

    public static final void logEvent$facebook_core_release(EventBinding mapping, View rootView, View hostView) {
        if (a.b(CodelessLoggingEventListener.class)) {
            return;
        }
        try {
            n.f(mapping, "mapping");
            n.f(rootView, "rootView");
            n.f(hostView, "hostView");
            String eventName = mapping.getEventName();
            Bundle parameters = CodelessMatcher.INSTANCE.getParameters(mapping, rootView, hostView);
            INSTANCE.updateParameters$facebook_core_release(parameters);
            s.d().execute(new o(14, eventName, parameters));
        } catch (Throwable th2) {
            a.a(CodelessLoggingEventListener.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logEvent$lambda$0(String eventName, Bundle parameters) {
        if (a.b(CodelessLoggingEventListener.class)) {
            return;
        }
        try {
            n.f(eventName, "$eventName");
            n.f(parameters, "$parameters");
            AppEventsLogger.INSTANCE.newLogger(s.b()).logEvent(eventName, parameters);
        } catch (Throwable th2) {
            a.a(CodelessLoggingEventListener.class, th2);
        }
    }

    public final void updateParameters$facebook_core_release(Bundle parameters) {
        if (a.b(this)) {
            return;
        }
        try {
            n.f(parameters, "parameters");
            String string = parameters.getString(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM);
            if (string != null) {
                parameters.putDouble(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, AppEventUtility.normalizePrice(string));
            }
            parameters.putString(Constants.IS_CODELESS_EVENT_KEY, "1");
        } catch (Throwable th2) {
            a.a(this, th2);
        }
    }
}
