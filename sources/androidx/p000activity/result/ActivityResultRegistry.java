package androidx.p000activity.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.p000activity.result.ActivityResultRegistry;
import androidx.p001lifecycle.Lifecycle;
import androidx.p001lifecycle.arytenoidectomy;
import androidx.p001lifecycle.impassible;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.rotuma;
import p002kotlin.random.Random;

/* JADX INFO: compiled from: ActivityResultRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b&\u0018\u0000 12\u00020\u0001:\u00037:=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJQ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\"\u0010 J)\u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b'\u0010(J%\u0010*\u001a\u00020&\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00028\u0000H\u0007¢\u0006\u0004\b*\u0010+J?\u0010.\u001a\u00020\r\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$2\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010,H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b0\u0010\u001cJ\u000f\u00101\u001a\u00020\u0006H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0010068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0006068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020<068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00100?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010@R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030,068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00108R\"\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u00108R\u0014\u0010E\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010D¨\u0006F"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "<init>", "()V", "I", "O", "", "requestCode", "Lmarial/attabal;", "contract", "input", "Ligbo/dern;", "options", "", "taiyuan", "(ILmarial/attabal;Ljava/lang/Object;Ligbo/dern;)V", "", X3.i.W, "Landroidx/lifecycle/arytenoidectomy;", "lifecycleOwner", "Lwireman/attabal;", "callback", "Lwireman/dern;", "formularize", "(Ljava/lang/String;Landroidx/lifecycle/arytenoidectomy;Lmarial/attabal;Lwireman/attabal;)Lwireman/dern;", "impassible", "(Ljava/lang/String;Lmarial/attabal;Lwireman/attabal;)Lwireman/dern;", "arytenoidectomy", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "outState", "apical", "(Landroid/os/Bundle;)V", "savedInstanceState", "cutely", X3.f.f, "Landroid/content/Intent;", "data", "", "marial", "(IILandroid/content/Intent;)Z", "result", "beachfront", "(ILjava/lang/Object;)Z", "Landroidx/activity/result/ActivityResultRegistry$attabal;", "callbackAndContract", "competently", "(Ljava/lang/String;ILandroid/content/Intent;Landroidx/activity/result/ActivityResultRegistry$attabal;)V", "kowloon", "impromptu", "()I", DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT, "wireman", "(ILjava/lang/String;)V", "", "attabal", "Ljava/util/Map;", "rcToKey", "saneness", "keyToRc", "Landroidx/activity/result/ActivityResultRegistry$dern;", "dern", "keyToLifecycleContainers", "", "Ljava/util/List;", "launchedKeys", "keyToCallback", "parsedPendingResults", "Landroid/os/Bundle;", "pendingResults", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Map<Integer, String> rcToKey = new LinkedHashMap();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Integer> keyToRc = new LinkedHashMap();

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Map<String, dern> keyToLifecycleContainers = new LinkedHashMap();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final List<String> launchedKeys = new ArrayList();

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final transient Map<String, attabal<?>> keyToCallback = new LinkedHashMap();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final Bundle pendingResults = new Bundle();

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR!\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$attabal;", "O", "", "Lwireman/attabal;", "callback", "Lmarial/attabal;", "contract", "<init>", "(Lwireman/attabal;Lmarial/attabal;)V", "attabal", "Lwireman/attabal;", "()Lwireman/attabal;", "saneness", "Lmarial/attabal;", "()Lmarial/attabal;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal<O> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final wireman.attabal<O> callback;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final marial.attabal<?, O> contract;

        public attabal(wireman.attabal<O> callback, marial.attabal<?, O> contract) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(contract, "contract");
            this.callback = callback;
            this.contract = contract;
        }

        public final wireman.attabal<O> attabal() {
            return this.callback;
        }

        public final marial.attabal<?, O> saneness() {
            return this.contract;
        }
    }

    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$dern;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/impassible;", "observer", "", "attabal", "(Landroidx/lifecycle/impassible;)V", "saneness", "()V", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "", "Ljava/util/List;", "observers", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Lifecycle lifecycle;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final List<impassible> observers;

        public dern(Lifecycle lifecycle) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void attabal(impassible observer) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            this.lifecycle.attabal(observer);
            this.observers.add(observer);
        }

        public final void saneness() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.wireman((impassible) it.next());
            }
            this.observers.clear();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/activity/result/ActivityResultRegistry$marial", "Lwireman/dern;", "input", "Ligbo/dern;", "options", "", "saneness", "(Ljava/lang/Object;Ligbo/dern;)V", "dern", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class marial<I> extends wireman.dern<I> {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ marial.attabal<I, O> f4512dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f4513saneness;

        public marial(String str, marial.attabal<I, O> attabalVar) {
            this.f4513saneness = str;
            this.f4512dern = attabalVar;
        }

        @Override // wireman.dern
        public void dern() {
            ActivityResultRegistry.this.arytenoidectomy(this.f4513saneness);
        }

        @Override // wireman.dern
        public void saneness(I input, igbo.dern options) throws Exception {
            Object obj = ActivityResultRegistry.this.keyToRc.get(this.f4513saneness);
            Object obj2 = this.f4512dern;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                ActivityResultRegistry.this.launchedKeys.add(this.f4513saneness);
                try {
                    ActivityResultRegistry.this.taiyuan(iIntValue, this.f4512dern, input, options);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.launchedKeys.remove(this.f4513saneness);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: compiled from: ActivityResultRegistry.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/activity/result/ActivityResultRegistry$wireman", "Lwireman/dern;", "input", "Ligbo/dern;", "options", "", "saneness", "(Ljava/lang/Object;Ligbo/dern;)V", "dern", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class wireman<I> extends wireman.dern<I> {

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ marial.attabal<I, O> f4515dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f4516saneness;

        public wireman(String str, marial.attabal<I, O> attabalVar) {
            this.f4516saneness = str;
            this.f4515dern = attabalVar;
        }

        @Override // wireman.dern
        public void dern() {
            ActivityResultRegistry.this.arytenoidectomy(this.f4516saneness);
        }

        @Override // wireman.dern
        public void saneness(I input, igbo.dern options) throws Exception {
            Object obj = ActivityResultRegistry.this.keyToRc.get(this.f4516saneness);
            Object obj2 = this.f4515dern;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                ActivityResultRegistry.this.launchedKeys.add(this.f4516saneness);
                try {
                    ActivityResultRegistry.this.taiyuan(iIntValue, this.f4515dern, input, options);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.launchedKeys.remove(this.f4516saneness);
                    throw e;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
    }

    public static final void triweekly(ActivityResultRegistry activityResultRegistry, String str, wireman.attabal attabalVar, marial.attabal attabalVar2, arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(arytenoidectomyVar, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (Lifecycle.Event.ON_START != event) {
            if (Lifecycle.Event.ON_STOP == event) {
                activityResultRegistry.keyToCallback.remove(str);
                return;
            } else {
                if (Lifecycle.Event.ON_DESTROY == event) {
                    activityResultRegistry.arytenoidectomy(str);
                    return;
                }
                return;
            }
        }
        activityResultRegistry.keyToCallback.put(str, new attabal<>(attabalVar, attabalVar2));
        if (activityResultRegistry.parsedPendingResults.containsKey(str)) {
            Object obj = activityResultRegistry.parsedPendingResults.get(str);
            activityResultRegistry.parsedPendingResults.remove(str);
            attabalVar.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) claque.dern.attabal(activityResultRegistry.pendingResults, str, ActivityResult.class);
        if (activityResult != null) {
            activityResultRegistry.pendingResults.remove(str);
            attabalVar.onActivityResult(attabalVar2.dern(activityResult.getCom.ironsource.X3.f.f java.lang.String(), activityResult.getData()));
        }
    }

    public final void apical(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.launchedKeys));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.pendingResults));
    }

    public final void arytenoidectomy(String key) {
        Integer numRemove;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            Objects.toString(this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            Objects.toString((ActivityResult) claque.dern.attabal(this.pendingResults, key, ActivityResult.class));
            this.pendingResults.remove(key);
        }
        dern dernVar = this.keyToLifecycleContainers.get(key);
        if (dernVar != null) {
            dernVar.saneness();
            this.keyToLifecycleContainers.remove(key);
        }
    }

    public final <O> boolean beachfront(int requestCode, O result) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        attabal<?> attabalVar = this.keyToCallback.get(str);
        if ((attabalVar != null ? attabalVar.attabal() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, result);
            return true;
        }
        wireman.attabal<?> attabalVarAttabal = attabalVar.attabal();
        Intrinsics.competently(attabalVarAttabal, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        attabalVarAttabal.onActivityResult(result);
        return true;
    }

    public final <O> void competently(String key, int resultCode, Intent data, attabal<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.attabal() : null) == null || !this.launchedKeys.contains(key)) {
            this.parsedPendingResults.remove(key);
            this.pendingResults.putParcelable(key, new ActivityResult(resultCode, data));
        } else {
            callbackAndContract.attabal().onActivityResult(callbackAndContract.saneness().dern(resultCode, data));
            this.launchedKeys.remove(key);
        }
    }

    public final void cutely(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = savedInstanceState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle = savedInstanceState.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle != null) {
            this.pendingResults.putAll(bundle);
        }
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    rotuma.wireman(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
            wireman(iIntValue, str2);
        }
    }

    public final <I, O> wireman.dern<I> formularize(final String key, arytenoidectomy lifecycleOwner, final marial.attabal<I, O> contract, final wireman.attabal<O> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        kowloon(key);
        dern dernVar = this.keyToLifecycleContainers.get(key);
        if (dernVar == null) {
            dernVar = new dern(lifecycle);
        }
        dernVar.attabal(new impassible() { // from class: wireman.wireman
            @Override // androidx.p001lifecycle.impassible
            public final void onStateChanged(arytenoidectomy arytenoidectomyVar, Lifecycle.Event event) {
                ActivityResultRegistry.triweekly(this.f39710kowloon, key, callback, contract, arytenoidectomyVar, event);
            }
        });
        this.keyToLifecycleContainers.put(key, dernVar);
        return new wireman(key, contract);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> wireman.dern<I> impassible(String key, marial.attabal<I, O> contract, wireman.attabal<O> callback) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        kowloon(key);
        this.keyToCallback.put(key, new attabal<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.onActivityResult(obj);
        }
        ActivityResult activityResult = (ActivityResult) claque.dern.attabal(this.pendingResults, key, ActivityResult.class);
        if (activityResult != null) {
            this.pendingResults.remove(key);
            callback.onActivityResult(contract.dern(activityResult.getCom.ironsource.X3.f.f java.lang.String(), activityResult.getData()));
        }
        return new marial(key, contract);
    }

    public final int impromptu() {
        for (Number number : p002kotlin.sequences.arytenoidectomy.kowloon(new Function0<Integer>() { // from class: androidx.activity.result.ActivityResultRegistry$generateRandomNumber$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p002kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return Integer.valueOf(Random.INSTANCE.nextInt(2147418112) + 65536);
            }
        })) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void kowloon(String key) {
        if (this.keyToRc.get(key) != null) {
            return;
        }
        wireman(impromptu(), key);
    }

    public final boolean marial(int requestCode, int resultCode, Intent data) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        competently(str, resultCode, data, this.keyToCallback.get(str));
        return true;
    }

    public abstract <I, O> void taiyuan(int requestCode, marial.attabal<I, O> contract, I input, igbo.dern options);

    public final void wireman(int rc, String key) {
        this.rcToKey.put(Integer.valueOf(rc), key);
        this.keyToRc.put(key, Integer.valueOf(rc));
    }
}
