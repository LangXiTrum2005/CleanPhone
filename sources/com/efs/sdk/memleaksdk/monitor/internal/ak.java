package com.efs.sdk.memleaksdk.monitor.internal;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public enum ak {
    IREQUEST_FINISH_CALLBACK { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.af

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f474a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 29;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.app.Activity$1", "this$0", "Android Q added a new android.app.IRequestFinishCallback$Stub class. android.app.Activity creates an implementation of that interface as an anonymous subclass. That anonymous subclass has a reference to the activity. Another process is keeping the android.app.IRequestFinishCallback$Stub reference alive long after Activity.onDestroyed() has been called, causing the activity to leak. Fix: You can \"fix\" this leak by overriding Activity.onBackPressed() and calling Activity.finishAfterTransition(); instead of super if the activity is task root and the fragment stack is empty. Tracked here: https://issuetracker.google.com/issues/139738913", a.f474a));
        }
    },
    ACTIVITY_CLIENT_RECORD__NEXT_IDLE { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.f

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f512a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 19 <= i && 27 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.app.ActivityThread$ActivityClientRecord", "nextIdle", "Android AOSP sometimes keeps a reference to a destroyed activity as a nextIdle client record in the android.app.ActivityThread.mActivities map. Not sure what's going on there, input welcome.", a.f512a));
        }
    },
    SPAN_CONTROLLER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bc

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f494a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b <= 19;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class b extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f495a = new b();

            public b() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b <= 19;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            List<bw> list2 = list;
            v vVar = ak.ao;
            list2.add(vVar.b("android.widget.Editor$SpanController", "this$0", "Editor inserts a special span, which has a reference to the EditText. That span is a NoCopySpan, which makes sure it gets dropped when creating a new SpannableStringBuilder from a given CharSequence. TextView.onSaveInstanceState() does a copy of its mText before saving it in the bundle. Prior to KitKat, that copy was done using the SpannableString constructor, instead of SpannableStringBuilder. The SpannableString constructor does not drop NoCopySpan spans. So we end up with a saved state that holds a reference to the textview and therefore the entire view hierarchy & activity context. Fix: https://github.com/android/platform_frameworks_base/commit/af7dcdf35a37d7a7dbaad7d9869c1c91bce2272b . To fix this, you could override TextView.onSaveInstanceState(), and then use reflection to access TextView.SavedState.mText and clear the NoCopySpan spans.", a.f494a));
            list2.add(vVar.b("android.widget.Editor$EasyEditSpanController", "this$0", "Editor inserts a special span, which has a reference to the EditText. That span is a NoCopySpan, which makes sure it gets dropped when creating a new SpannableStringBuilder from a given CharSequence. TextView.onSaveInstanceState() does a copy of its mText before saving it in the bundle. Prior to KitKat, that copy was done using the SpannableString constructor, instead of SpannableStringBuilder. The SpannableString constructor does not drop NoCopySpan spans. So we end up with a saved state that holds a reference to the textview and therefore the entire view hierarchy & activity context. Fix: https://github.com/android/platform_frameworks_base/commit/af7dcdf35a37d7a7dbaad7d9869c1c91bce2272b . To fix this, you could override TextView.onSaveInstanceState(), and then use reflection to access TextView.SavedState.mText and clear the NoCopySpan spans.", b.f495a));
        }
    },
    MEDIA_SESSION_LEGACY_HELPER__SINSTANCE { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.aq

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f481a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 21;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.media.session.MediaSessionLegacyHelper", "sInstance", "MediaSessionLegacyHelper is a static singleton that is lazily instantiated and keeps a reference to the context it's given the first time MediaSessionLegacyHelper.getHelper() is called. This leak was introduced in android-5.0.1_r1 and fixed in Android 5.1.0_r1 by calling context.getApplicationContext(). Fix: https://github.com/android/platform_frameworks_base/commit/9b5257c9c99c4cb541d8e8e78fb04f008b1a9091 To fix this, you could call MediaSessionLegacyHelper.getHelper() early in Application.onCreate() and pass it the application context.", a.f481a));
        }
    },
    TEXT_LINE__SCACHED { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bj

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f502a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b <= 22;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.text.TextLine", "sCached", "TextLine.sCached is a pool of 3 TextLine instances. TextLine.recycle() has had at least two bugs that created memory leaks by not correctly clearing the recycled TextLine instances. The first was fixed in android-5.1.0_r1: https://github.com/android/platform_frameworks_base/commit/893d6fe48d37f71e683f722457bea646994a10 The second was fixed, not released yet: https://github.com/android/platform_frameworks_base/commit/b3a9bc038d3a218b1dbdf7b5668e3d6c12be5e To fix this, you could access TextLine.sCached and clear the pool every now and then (e.g. on activity destroy).", a.f502a));
        }
    },
    BLOCKING_QUEUE { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.p
        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(v.b(ak.ao, "android.os.Message", "obj", "A thread waiting on a blocking queue will leak the last dequeued object as a stack local reference. So when a HandlerThread becomes idle, it keeps a local reference to the last message it received. That message then gets recycled and can be used again. As long as all messages are recycled after being used, this won't be a problem, because these references are cleared when being recycled. However, dialogs create template Message instances to be copied when a message needs to be sent. These Message templates holds references to the dialog listeners, which most likely leads to holding a reference onto the activity in some way. Dialogs never recycle their template Message, assuming these Message instances will get GCed when the dialog is GCed. The combination of these two things creates a high potential for memory leaks as soon as you use dialogs. These memory leaks might be temporary, but some handler threads sleep for a long time. To fix this, you could post empty messages to the idle handler threads from time to time. This won't be easy because you cannot access all handler threads, but a library that is widely used should consider doing this for its own handler threads. This leaks has been shown to happen in both Dalvik and ART.", null, 8));
        }
    },
    INPUT_METHOD_MANAGER_IS_TERRIBLE { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ad

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f466a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 15 <= i && 27 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class b extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f467a = new b();

            public b() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 15 <= i && 27 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class c extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f468a = new c();

            public c() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 15 <= i && 27 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class d extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f469a = new d();

            public d() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "HUAWEI") && 23 <= (i = ajVar.b) && 28 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class e extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f470a = new e();

            public e() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 15 <= i && 28 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class f extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f471a = new f();

            public f() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 28;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class g extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f472a = new g();

            public g() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 28 <= i && 29 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            List<bw> list2 = list;
            v vVar = ak.ao;
            list2.add(vVar.b("android.view.inputmethod.InputMethodManager", "mNextServedView", "When we detach a view that receives keyboard input, the InputMethodManager leaks a reference to it until a new view asks for keyboard input. Tracked here: https://code.google.com/p/android/issues/detail?id=171190 Hack: https://gist.github.com/pyricau/4df64341cc978a7de414", a.f466a));
            list2.add(vVar.b("android.view.inputmethod.InputMethodManager", "mServedView", "When we detach a view that receives keyboard input, the InputMethodManager leaks a reference to it until a new view asks for keyboard input. Tracked here: https://code.google.com/p/android/issues/detail?id=171190 Hack: https://gist.github.com/pyricau/4df64341cc978a7de414", b.f467a));
            list2.add(vVar.b("android.view.inputmethod.InputMethodManager", "mServedInputConnection", "When we detach a view that receives keyboard input, the InputMethodManager leaks a reference to it until a new view asks for keyboard input. Tracked here: https://code.google.com/p/android/issues/detail?id=171190 Hack: https://gist.github.com/pyricau/4df64341cc978a7de414", c.f468a));
            list2.add(vVar.b("android.view.inputmethod.InputMethodManager", "mLastSrvView", "HUAWEI added a mLastSrvView field to InputMethodManager that leaks a reference to the last served view.", d.f469a));
            list2.add(vVar.b("android.view.inputmethod.InputMethodManager", "mCurRootView", "The singleton InputMethodManager is holding a reference to mCurRootView long after the activity has been destroyed. Observed on ICS MR1: https://github.com/square/leakcanary/issues/1#issuecomment-100579429 Hack: https://gist.github.com/pyricau/4df64341cc978a7de414", e.f470a));
            list2.add(vVar.b("android.view.inputmethod.InputMethodManager", "mImeInsetsConsumer", "Android Q Beta has a leak where InputMethodManager.mImeInsetsConsumer isn't set to\nnull when the activity is destroyed.", f.f471a));
            list2.add(vVar.b("android.view.inputmethod.InputMethodManager", "mCurrentInputConnection", "In Android Q Beta InputMethodManager keeps its EditableInputConnection after the\nactivity has been destroyed.", g.f472a));
        }
    },
    LAYOUT_TRANSITION { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ag

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f475a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 14 <= i && 22 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.animation.LayoutTransition$1", "val$parent", "LayoutTransition leaks parent ViewGroup through ViewTreeObserver.OnPreDrawListener When triggered, this leaks stays until the window is destroyed. Tracked here: https://code.google.com/p/android/issues/detail?id=171830", a.f475a));
        }
    },
    SPELL_CHECKER_SESSION { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bf

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f498a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 16 <= i && 24 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.view.textservice.SpellCheckerSession$1", "this$0", "SpellCheckerSessionListenerImpl.mHandler is leaking destroyed Activity when the SpellCheckerSession is closed before the service is connected. Tracked here: https://code.google.com/p/android/issues/detail?id=172542", a.f498a));
        }
    },
    SPELL_CHECKER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.be

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f497a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 22;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.widget.SpellChecker$1", "this$0", "SpellChecker holds on to a detached view that points to a destroyed activity. mSpellRunnable is being enqueued, and that callback should be removed when  closeSession() is called. Maybe closeSession() wasn't called, or maybe it was  called after the view was detached.", a.f497a));
        }
    },
    ACTIVITY_CHOOSE_MODEL { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.e

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f511a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 15 <= i && 22 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            List<bw> list2 = list;
            v vVar = ak.ao;
            list2.add(vVar.b("androidx.appcompat.internal.widget.ActivityChooserModel", "mActivityChoserModelPolicy", "ActivityChooserModel holds a static reference to the last set ActivityChooserModelPolicy which can be an activity context. Tracked here: https://code.google.com/p/android/issues/detail?id=172659 Hack: https://gist.github.com/andaag/b05ab66ed0f06167d6e0", a.f511a));
            list2.add(v.b(vVar, "android.widget.ActivityChooserModel", "mActivityChoserModelPolicy", "ActivityChooserModel holds a static reference to the last set ActivityChooserModelPolicy which can be an activity context. Tracked here: https://code.google.com/p/android/issues/detail?id=172659 Hack: https://gist.github.com/andaag/b05ab66ed0f06167d6e0", null, 8));
        }
    },
    MEDIA_PROJECTION_CALLBACK { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ao

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f479a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 22 <= i && 28 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.media.projection.MediaProjection$MediaProjectionCallback", "this$0", "MediaProjectionCallback is held by another process, and holds on to MediaProjection\nwhich has an activity as its context.", a.f479a));
        }
    },
    SPEECH_RECOGNIZER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bd

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f496a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b < 21;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.speech.SpeechRecognizer$InternalListener", "this$0", "Prior to Android 5, SpeechRecognizer.InternalListener was a non static inner class and leaked the SpeechRecognizer which leaked an activity context. Fixed in AOSP: https://github.com/android/platform_frameworks_base/commit /b37866db469e81aca534ff6186bdafd44352329b", a.f496a));
        }
    },
    ACCOUNT_MANAGER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.d

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f510a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b <= 27;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.accounts.AccountManager$AmsTask$Response", "this$1", "AccountManager$AmsTask$Response is a stub and is held in memory by native code, probably because the reference to the response in the other process hasn't been cleared. AccountManager$AmsTask is holding on to the activity reference to use for launching a new sub- Activity. Tracked here: https://code.google.com/p/android/issues/detail?id=173689 Fix: Pass a null activity reference to the AccountManager methods and then deal with the returned future to to get the result and correctly start an activity when it's available.", a.f510a));
        }
    },
    MEDIA_SCANNER_CONNECTION { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ap

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f480a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b <= 22;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.media.MediaScannerConnection", "mContext", "The static method MediaScannerConnection.scanFile() takes an activity context but the service might not disconnect after the activity has been destroyed. Tracked here: https://code.google.com/p/android/issues/detail?id=173788 Fix: Create an instance of MediaScannerConnection yourself and pass in the application context. Call connect() and disconnect() manually.", a.f480a));
        }
    },
    USER_MANAGER__SINSTANCE { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bn

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f506a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 18 <= i && 25 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.os.UserManager", "mContext", "UserManager has a static sInstance field that creates an instance and caches it the first time UserManager.get() is called. This instance is created with the outer context (which is an activity base context). Tracked here: https://code.google.com/p/android/issues/detail?id=173789 Introduced by: https://github.com/android/platform_frameworks_base/commit/27db46850b708070452c0ce49daf5f79503fbde6 Fix: trigger a call to UserManager.get() in Application.onCreate(), so that the UserManager instance gets cached with a reference to the application context.", a.f506a));
        }
    },
    APP_WIDGET_HOST_CALLBACKS { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.i

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f515a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b < 22;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.appwidget.AppWidgetHost$Callbacks", "this$0", "android.appwidget.AppWidgetHost$Callbacks is a stub and is held in memory native code. The reference to the `mContext` was not being cleared, which caused the Callbacks instance to retain this reference Fixed in AOSP: https://github.com/android/platform_frameworks_base/commit/7a96f3c917e0001ee739b65da37b2fadec7d7765", a.f515a));
        }
    },
    AUDIO_MANAGER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.k

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f517a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b <= 22;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.media.AudioManager$1", "this$0", "Prior to Android M, VideoView required audio focus from AudioManager and never abandoned it, which leaks the Activity context through the AudioManager. The root of the problem is that AudioManager uses whichever context it receives, which in the case of the VideoView example is an Activity, even though it only needs the application's context. The issue is fixed in Android M, and the AudioManager now uses the application's context. Tracked here: https://code.google.com/p/android/issues/detail?id=152173 Fix: https://gist.github.com/jankovd/891d96f476f7a9ce24e2", a.f517a));
        }
    },
    EDITTEXT_BLINK_MESSAGEQUEUE { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.y

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f531a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b <= 23;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.widget.Editor$Blink", "this$0", "The EditText Blink of the Cursor is implemented using a callback and Messages, which trigger the display of the Cursor. If an AlertDialog or DialogFragment that contains a blinking cursor is detached, a message is posted with a delay after the dialog has been closed and as a result leaks the Activity. This can be fixed manually by calling TextView.setCursorVisible(false) in the dismiss() method of the dialog. Tracked here: https://code.google.com/p/android/issues/detail?id=188551 Fixed in AOSP: https://android.googlesource.com/platform/frameworks/base/+/5b734f2430e9f26c769d6af8ea5645e390fcf5af%5E%21/", a.f531a));
        }
    },
    CONNECTIVITY_MANAGER__SINSTANCE { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.t

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f527a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b <= 23;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.net.ConnectivityManager", "sInstance", "ConnectivityManager has a sInstance field that is set when the first ConnectivityManager instance is created. ConnectivityManager has a mContext field. When calling activity.getSystemService(Context.CONNECTIVITY_SERVICE) , the first ConnectivityManager instance is created with the activity context and stored in sInstance. That activity context then leaks forever. Until this is fixed, app developers can prevent this leak by making sure the ConnectivityManager is first created with an App Context. E.g. in some static init do: context.getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE) Tracked here: https://code.google.com/p/android/issues/detail?id=198852 Introduced here: https://github.com/android/platform_frameworks_base/commit/e0bef71662d81caaaa0d7214fb0bef5d39996a69", a.f527a));
        }
    },
    ACCESSIBILITY_NODE_INFO__MORIGINALTEXT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.c

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f509a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 26 <= i && 27 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.view.accessibility.AccessibilityNodeInfo", "mOriginalText", "AccessibilityNodeInfo has a static sPool of AccessibilityNodeInfo. When AccessibilityNodeInfo instances are released back in the pool, AccessibilityNodeInfo.clear() does not clear the mOriginalText field, which causes spans to leak which in turns causes TextView.ChangeWatcher to leak and the whole view hierarchy. Introduced here: https://android.googlesource.com/platform/frameworks/base/+/193520e3dff5248ddcf8435203bf99d2ba667219%5E%21/core/java/android/view/accessibility/AccessibilityNodeInfo.java", a.f509a));
        }
    },
    ASSIST_STRUCTURE { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.j

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f516a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 24 <= i && 29 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.app.assist.AssistStructure$ViewNodeText", "mText", "AssistStructure (google assistant / autofill) holds on to text spannables on the screen. TextView.ChangeWatcher and android.widget.Editor end up in spans and typically hold on to the view hierarchy", a.f516a));
        }
    },
    ACCESSIBILITY_ITERATORS { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.a

        /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ak$a$a, reason: collision with other inner class name */
        public static final class C0124a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0124a f463a = new C0124a();

            public C0124a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 27;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.widget.AccessibilityIterators$LineTextSegmentIterator", "mLayout", "AccessibilityIterators holds on to text layouts which can hold on to spans TextView.ChangeWatcher and android.widget.Editor end up in spans and typically hold on to the view hierarchy", C0124a.f463a));
        }
    },
    BIOMETRIC_PROMPT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.o

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f521a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 28;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.hardware.biometrics.BiometricPrompt", "mFingerprintManager", "BiometricPrompt holds on to a FingerprintManager which holds on to a destroyed activity.", a.f521a));
        }
    },
    MAGNIFIER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.al

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f477a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 28;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.widget.Magnifier$InternalPopupWindow", "mCallback", "android.widget.Magnifier.InternalPopupWindow registers a frame callback on android.view.ThreadedRenderer.SimpleRenderer which holds it as a native reference. android.widget.Editor$InsertionHandleView registers an OnOperationCompleteCallback on Magnifier.InternalPopupWindow. These references are held after the activity has been destroyed.", a.f477a));
        }
    },
    BACKDROP_FRAME_RENDERER__MDECORVIEW { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.n

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f520a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 24 <= i && 26 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("com.android.internal.policy.BackdropFrameRenderer", "mDecorView", "When BackdropFrameRenderer.releaseRenderer() is called, there's an unknown case where mRenderer becomes null but mChoreographer doesn't and the thread doesn't stop and ends up leaking mDecorView which itself holds on to a destroyed activity", a.f520a));
        }
    },
    VIEWLOCATIONHOLDER_ROOT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bo

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f507a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 28;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.view.ViewGroup$ViewLocationHolder", "mRoot", "In Android P, ViewLocationHolder has an mRoot field that is not cleared in its clear() method. Introduced in https://github.com/aosp-mirror/platform_frameworks_base/commit/86b326012813f09d8f1de7d6d26c986a909d Bug report: https://issuetracker.google.com/issues/112792715", a.f507a));
        }
    },
    ACCESSIBILITY_NODE_ID_MANAGER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.b

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f491a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                int i = ajVar.b;
                return 28 <= i && 29 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.view.accessibility.AccessibilityNodeIdManager", "mIdsToViews", "Android Q Beta added AccessibilityNodeIdManager which stores all views from their\nonAttachedToWindow() call, until detached. Unfortunately it's possible to trigger\nthe view framework to call detach before attach (by having a view removing itself\nfrom its parent in onAttach, which then causes AccessibilityNodeIdManager to keep\nchildren view forever. Future releases of Q will hold weak references.", a.f491a));
        }
    },
    TEXT_TO_SPEECH { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bk

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f503a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 24;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class b extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f504a = new b();

            public b() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 24;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            List<bw> list2 = list;
            v vVar = ak.ao;
            list2.add(vVar.b("android.speech.tts.TextToSpeech", "mContext", "TextToSpeech.shutdown() does not release its references to context objects. Furthermore, TextToSpeech instances cannot be garbage collected due to other process keeping the references, resulting the context objects leaked. Developers might be able to mitigate the issue by passing application context to TextToSpeech constructor. Tracked at: https://github.com/square/leakcanary/issues/1210 and https://issuetracker.google.com/issues/129250419", a.f503a));
            list2.add(vVar.b("android.speech.tts.TtsEngines", "mContext", "TextToSpeech.shutdown() does not release its references to context objects. Furthermore, TextToSpeech instances cannot be garbage collected due to other process keeping the references, resulting the context objects leaked. Developers might be able to mitigate the issue by passing application context to TextToSpeech constructor. Tracked at: https://github.com/square/leakcanary/issues/1210 and https://issuetracker.google.com/issues/129250419", b.f504a));
        }
    },
    CONTROLLED_INPUT_CONNECTION_WRAPPER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.u
        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(v.a(ak.ao, "android.view.inputmethod.InputMethodManager$ControlledInputConnectionWrapper", "ControlledInputConnectionWrapper is held by a global variable in native code. ", null, 4));
        }
    },
    TOAST_TN { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bm
        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(v.a(ak.ao, "android.widget.Toast$TN", "Toast.TN is held by a global variable in native code due to an IPC call to show the toast.", null, 4));
        }
    },
    APPLICATION_PACKAGE_MANAGER__HAS_SYSTEM_FEATURE_QUERY { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.h

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f514a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return ajVar.b == 29;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.app.ApplicationPackageManager$HasSystemFeatureQuery", "this$0", "In Android 11 DP 2 ApplicationPackageManager.HasSystemFeatureQuery was an inner class.\nIntroduced in https://cs.android.com/android/_/android/platform/frameworks/base/+/89608118192580ffca026b5dacafa637a556d578\nFixed in https://cs.android.com/android/_/android/platform/frameworks/base/+/1f771846c51148b7cb6283e6dc82a216ffaa5353\nRelated blog: https://dev.to/pyricau/beware-packagemanager-leaks-223g", a.f514a));
        }
    },
    SPEN_GESTURE_MANAGER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bg

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f499a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 19;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("com.samsung.android.smartclip.SpenGestureManager", "mContext", "SpenGestureManager has a static mContext field that leaks a reference to the activity. Yes, a STATIC mContext field.", a.f499a));
        }
    },
    CLIPBOARD_UI_MANAGER__SINSTANCE { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.s

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f526a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && 19 <= (i = ajVar.b) && 21 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.sec.clipboard.ClipboardUIManager", "mContext", "ClipboardUIManager is a static singleton that leaks an activity context. Fix: trigger a call to ClipboardUIManager.getInstance() in Application.onCreate() , so that the ClipboardUIManager instance gets cached with a reference to the application context. Example: https://gist.github.com/cypressious/91c4fb1455470d803a602838dfcd5774", a.f526a));
        }
    },
    SEM_CLIPBOARD_MANAGER__MCONTEXT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ay

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f488a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && 19 <= (i = ajVar.b) && 28 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class b extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f489a = new b();

            public b() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && 19 <= (i = ajVar.b) && 28 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            List<bw> list2 = list;
            v vVar = ak.ao;
            list2.add(vVar.a("com.samsung.android.content.clipboard.SemClipboardManager$1", "SemClipboardManager inner classes are held by native references due to IPC calls ", a.f488a));
            list2.add(vVar.a("com.samsung.android.content.clipboard.SemClipboardManager$3", "SemClipboardManager inner classes are held by native references due to IPC calls ", b.f489a));
        }
    },
    CLIPBOARD_EX_MANAGER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.r

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f523a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 23;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class b extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f524a = new b();

            public b() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 23;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        public static final class c extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f525a = new c();

            public c() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 22;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            List<bw> list2 = list;
            v vVar = ak.ao;
            list2.add(vVar.b("android.sec.clipboard.ClipboardExManager", "mContext", "android.sec.clipboard.ClipboardExManager$IClipboardDataPasteEventImpl$1 is a native callback that holds IClipboardDataPasteEventImpl which holds ClipboardExManager which has a destroyed activity as mContext", a.f523a));
            list2.add(vVar.b("android.sec.clipboard.ClipboardExManager", "mPersonaManager", "android.sec.clipboard.ClipboardExManager$IClipboardDataPasteEventImpl$1 is a native callback that holds IClipboardDataPasteEventImpl which holds ClipboardExManager which holds PersonaManager which has a destroyed activity as mContext", b.f524a));
            list2.add(vVar.b("android.widget.TextView$IClipboardDataPasteEventImpl", "this$0", "TextView$IClipboardDataPasteEventImpl$1 is held by a native ref, and IClipboardDataPasteEventImpl ends up leaking a detached textview", c.f525a));
        }
    },
    SEM_EMERGENCY_MANAGER__MCONTEXT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.az

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f490a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && 19 <= (i = ajVar.b) && 24 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("com.samsung.android.emergencymode.SemEmergencyManager", "mContext", "SemEmergencyManager is a static singleton that leaks a DecorContext. Fix: https://gist.github.com/jankovd/a210460b814c04d500eb12025902d60d", a.f490a));
        }
    },
    SEM_PERSONA_MANAGER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ba

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f492a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 24;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(v.b(ak.ao, "com.samsung.android.knox.SemPersonaManager", "mContext", null, a.f492a, 4));
        }
    },
    SEM_APP_ICON_SOLUTION { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ax

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f487a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && 28 <= (i = ajVar.b) && 29 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(v.b(ak.ao, "android.app.SemAppIconSolution", "mContext", null, a.f487a, 4));
        }
    },
    AW_RESOURCE__SRESOURCES { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.m

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f519a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 19;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(v.a(ak.ao, "com.android.org.chromium.android_webview.AwResource", "sResources", null, a.f519a, 4));
        }
    },
    TEXT_VIEW__MLAST_HOVERED_VIEW { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bl

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f505a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && 19 <= (i = ajVar.b) && 29 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.widget.TextView", "mLastHoveredView", "mLastHoveredView is a static field in TextView that leaks the last hovered view.", a.f505a));
        }
    },
    PERSONA_MANAGER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.at

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f484a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 19;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.os.PersonaManager", "mContext", "android.app.LoadedApk.mResources has a reference to android.content.res.Resources.mPersonaManager which has a reference to android.os.PersonaManager.mContext which is an activity.", a.f484a));
        }
    },
    RESOURCES__MCONTEXT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.aw

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f486a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 19;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.content.res.Resources", "mContext", "In AOSP the Resources class does not have a context. Here we have ZygoteInit.mResources (static field) holding on to a Resources instance that has a context that is the activity. Observed here: https://github.com/square/leakcanary/issues/1#issue-74450184", a.f486a));
        }
    },
    VIEW_CONFIGURATION__MCONTEXT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bp

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f508a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 19;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.view.ViewConfiguration", "mContext", "In AOSP the ViewConfiguration class does not have a context. Here we have ViewConfiguration.sConfigurations (static field) holding on to a ViewConfiguration instance that has a context that is the activity. Observed here: https://github.com/square/leakcanary/issues/1#issuecomment-100324683", a.f508a));
        }
    },
    AUDIO_MANAGER__MCONTEXT_STATIC { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.l

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f518a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 19;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.media.AudioManager", "mContext_static", "Samsung added a static mContext_static field to AudioManager, holds a reference to the activity. Observed here: https://github.com/square/leakcanary/issues/32", a.f518a));
        }
    },
    ACTIVITY_MANAGER_MCONTEXT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.g

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f513a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && 22 <= (i = ajVar.b) && 23 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.app.ActivityManager", "mContext", "Samsung added a static mContext field to ActivityManager, holds a reference to the activity. Observed here: https://github.com/square/leakcanary/issues/177 Fix in comment: https://github.com/square/leakcanary/issues/177#issuecomment-222724283", a.f513a));
        }
    },
    STATIC_MTARGET_VIEW { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bh

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f500a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && ajVar.b == 27;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.widget.TextView", "mTargetView", "Samsung added a static mTargetView field to TextView which holds on to detached views.", a.f500a));
        }
    },
    MULTI_WINDOW_DECOR_SUPPORT__MWINDOW { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ar

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f482a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "samsung") && 26 <= (i = ajVar.b) && 29 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("com.android.internal.policy.MultiWindowDecorSupport", "mWindow", "DecorView isn't leaking but its mDecorViewSupport field holds\na MultiWindowDecorSupport which has a mWindow field which holds a leaking PhoneWindow.\nDecorView.mDecorViewSupport doesn't exist in AOSP.\nFiled here: https://github.com/square/leakcanary/issues/1819", a.f482a));
        }
    },
    GESTURE_BOOST_MANAGER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ac

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f465a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "HUAWEI") && 24 <= (i = ajVar.b) && 25 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.gestureboost.GestureBoostManager", "mContext", "GestureBoostManager is a static singleton that leaks an activity context. Fix: https://github.com/square/leakcanary/issues/696#issuecomment-296420756", a.f465a));
        }
    },
    BUBBLE_POPUP_HELPER__SHELPER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.q

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f522a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "LGE") && 19 <= (i = ajVar.b) && 22 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.widget.BubblePopupHelper", "sHelper", "A static helper for EditText bubble popups leaks a reference to the latest focused view.", a.f522a));
        }
    },
    LGCONTEXT__MCONTEXT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ak

        /* JADX INFO: renamed from: com.efs.sdk.memleaksdk.monitor.internal.ak$ak$a */
        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f476a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "LGE") && ajVar.b == 21;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("com.lge.systemservice.core.LGContext", "mContext", "LGContext is a static singleton that leaks an activity context.", a.f476a));
        }
    },
    SMART_COVER_MANAGER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bb

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f493a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "LGE") && ajVar.b == 27;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("com.lge.systemservice.core.SmartCoverManager", "mContext", "SmartCoverManager$CallbackRegister is a callback held by a native ref, and SmartCoverManager ends up leaking an activity context.", a.f493a));
        }
    },
    MAPPER_CLIENT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.an

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f478a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "NVIDIA") && ajVar.b == 19;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("com.nvidia.ControllerMapper.MapperClient$ServiceClient", "this$0", "Not sure exactly what ControllerMapper is about, but there is an anonymous Handler in ControllerMapper.MapperClient.ServiceClient, which leaks ControllerMapper.MapperClient which leaks the activity context.", a.f478a));
        }
    },
    SYSTEM_SENSOR_MANAGER__MAPPCONTEXTIMPL { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.bi

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f501a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return (AbstractC2995aW.i(ajVar.f460a, "LENOVO") && ajVar.b == 19) || (AbstractC2995aW.i(ajVar.f460a, "vivo") && ajVar.b == 22);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.hardware.SystemSensorManager", "mAppContextImpl", "SystemSensorManager stores a reference to context in a static field in its constructor. Fix: use application context to get SensorManager", a.f501a));
        }
    },
    INSTRUMENTATION_RECOMMEND_ACTIVITY { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ae

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f473a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "Meizu") && 21 <= (i = ajVar.b) && 22 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.app.Instrumentation", "mRecommendActivity", "Instrumentation would leak com.android.internal.app.RecommendActivity (in framework.jar) in Meizu FlymeOS 4.5 and above, which is based on Android 5.0 and  above", a.f473a));
        }
    },
    DEVICE_POLICY_MANAGER__SETTINGS_OBSERVER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.x

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f530a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                int i;
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "motorola") && 19 <= (i = ajVar.b) && 22 >= i;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.app.admin.DevicePolicyManager$SettingsObserver", "this$0", "DevicePolicyManager keeps a reference to the context it has been created with instead of extracting the application context. In this Motorola build, DevicePolicyManager has an inner SettingsObserver class that is a content observer, which is held into memory by a binder transport object.", a.f530a));
        }
    },
    EXTENDED_STATUS_BAR_MANAGER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.aa

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f464a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "SHARP") && ajVar.b == 29;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.app.ExtendedStatusBarManager", "sInstance", "ExtendedStatusBarManager is held in a static sInstance field and has a mContext\nfield which references a decor context which references a destroyed activity.", a.f464a));
        }
    },
    OEM_SCENE_CALL_BLOCKER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.as

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f483a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "OnePlus") && ajVar.b == 28;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("com.oneplus.util.OemSceneCallBlocker", "sContext", "OemSceneCallBlocker has a sContext static field which holds on to an activity instance.", a.f483a));
        }
    },
    RAZER_TEXT_KEY_LISTENER__MCONTEXT { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.au

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f485a = new a();

            public a() {
                super(1);
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.aj ajVar) {
                AbstractC2995aW.q(ajVar, "$receiver");
                return AbstractC2995aW.i(ajVar.f460a, "Razer") && ajVar.b == 28;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.aj) obj));
            }
        }

        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.b("android.text.method.TextKeyListener", "mContext", "In AOSP, TextKeyListener instances are held in a TextKeyListener.sInstances static\narray. The Razer implementation added a mContext field, creating activity leaks.", a.f485a));
        }
    },
    REFERENCES { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.av
        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            List<bw> list2 = list;
            v vVar = ak.ao;
            list2.add(vVar.a(WeakReference.class.getName(), "referent"));
            list2.add(vVar.a("leakcanary.KeyedWeakReference", "referent"));
            list2.add(vVar.a(SoftReference.class.getName(), "referent"));
            list2.add(vVar.a(PhantomReference.class.getName(), "referent"));
            list2.add(vVar.a("java.lang.ref.Finalizer", "prev"));
            list2.add(vVar.a("java.lang.ref.Finalizer", "element"));
            list2.add(vVar.a("java.lang.ref.Finalizer", "next"));
            list2.add(vVar.a("java.lang.ref.FinalizerReference", "prev"));
            list2.add(vVar.a("java.lang.ref.FinalizerReference", "element"));
            list2.add(vVar.a("java.lang.ref.FinalizerReference", "next"));
            list2.add(vVar.a("sun.misc.Cleaner", "prev"));
            list2.add(vVar.a("sun.misc.Cleaner", "next"));
        }
    },
    FINALIZER_WATCHDOG_DAEMON { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ab
        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("FinalizerWatchdogDaemon"));
        }
    },
    MAIN { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.am
        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("main"));
        }
    },
    LEAK_CANARY_THREAD { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.aj
        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("LeakCanary-Heap-Dump"));
        }
    },
    LEAK_CANARY_HEAP_DUMPER { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ah
        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("leakcanary.internal.AndroidHeapDumper", "resumedActivity"));
        }
    },
    LEAK_CANARY_INTERNAL { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.ai
        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("leakcanary.internal.InternalLeakCanary", MimeTypes.BASE_TYPE_APPLICATION));
        }
    },
    EVENT_RECEIVER__MMESSAGE_QUEUE { // from class: com.efs.sdk.memleaksdk.monitor.internal.ak.z
        @Override // com.efs.sdk.memleaksdk.monitor.internal.ak
        public void a(List<bw> list) {
            AbstractC2995aW.q(list, "references");
            list.add(ak.ao.a("android.view.Choreographer$FrameDisplayEventReceiver", "mMessageQueue"));
        }
    };

    public static final v ao = new v(0);
    private static final InterfaceC2766Sw aq = w.f529a;

    public static final class w extends WG implements InterfaceC2766Sw {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final w f529a = new w();

        public w() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* synthetic */ Object invoke(Object obj) {
            AbstractC2995aW.q((com.efs.sdk.memleaksdk.monitor.internal.aj) obj, "$receiver");
            return Boolean.TRUE;
        }
    }

    public static final List<bw> b() {
        return ao.a();
    }

    public abstract void a(List<bw> list);

    /* synthetic */ ak(byte b2) {
        this();
    }

    public static final class v {

        public static final class a extends WG implements InterfaceC2766Sw {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC2766Sw f528a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2766Sw interfaceC2766Sw) {
                super(1);
                this.f528a = interfaceC2766Sw;
            }

            public final boolean a(com.efs.sdk.memleaksdk.monitor.internal.au auVar) {
                AbstractC2995aW.q(auVar, "graph");
                return ((Boolean) this.f528a.invoke(com.efs.sdk.memleaksdk.monitor.internal.aj.c.a(auVar))).booleanValue();
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(a((com.efs.sdk.memleaksdk.monitor.internal.au) obj));
            }
        }

        private v() {
        }

        public /* synthetic */ v(byte b) {
            this();
        }

        public static /* synthetic */ com.efs.sdk.memleaksdk.monitor.internal.bn a(v vVar, String str, String str2, InterfaceC2766Sw interfaceC2766Sw, int i) {
            if ((i & 2) != 0) {
                str2 = "";
            }
            if ((i & 4) != 0) {
                interfaceC2766Sw = ak.aq;
            }
            return vVar.a(str, str2, interfaceC2766Sw);
        }

        public static /* synthetic */ com.efs.sdk.memleaksdk.monitor.internal.bn b(v vVar, String str, String str2, String str3, InterfaceC2766Sw interfaceC2766Sw, int i) {
            if ((i & 4) != 0) {
                str3 = "";
            }
            if ((i & 8) != 0) {
                interfaceC2766Sw = ak.aq;
            }
            return vVar.b(str, str2, str3, interfaceC2766Sw);
        }

        public static /* synthetic */ com.efs.sdk.memleaksdk.monitor.internal.bn a(v vVar, String str, String str2, String str3, InterfaceC2766Sw interfaceC2766Sw, int i) {
            if ((i & 4) != 0) {
                str3 = "";
            }
            if ((i & 8) != 0) {
                interfaceC2766Sw = ak.aq;
            }
            return vVar.a(str, str2, str3, interfaceC2766Sw);
        }

        public final com.efs.sdk.memleaksdk.monitor.internal.bn b(String str, String str2, String str3, InterfaceC2766Sw interfaceC2766Sw) {
            AbstractC2995aW.q(str, "className");
            AbstractC2995aW.q(str2, "fieldName");
            AbstractC2995aW.q(str3, "description");
            AbstractC2995aW.q(interfaceC2766Sw, "patternApplies");
            return a(new bx.b(str, str2), str3, interfaceC2766Sw);
        }

        public final com.efs.sdk.memleaksdk.monitor.internal.bn a(String str, String str2, InterfaceC2766Sw interfaceC2766Sw) {
            AbstractC2995aW.q(str, "className");
            AbstractC2995aW.q(str2, "description");
            AbstractC2995aW.q(interfaceC2766Sw, "patternApplies");
            return a(new bx.d(str), str2, interfaceC2766Sw);
        }

        public final com.efs.sdk.memleaksdk.monitor.internal.bn a(String str, String str2, String str3, InterfaceC2766Sw interfaceC2766Sw) {
            AbstractC2995aW.q(str, "className");
            AbstractC2995aW.q(str2, "fieldName");
            AbstractC2995aW.q(str3, "description");
            AbstractC2995aW.q(interfaceC2766Sw, "patternApplies");
            return a(new bx.e(str, str2), str3, interfaceC2766Sw);
        }

        public final List<bw> a() {
            v vVar = ak.ao;
            EnumSet enumSetAllOf = EnumSet.allOf(ak.class);
            AbstractC2995aW.p(enumSetAllOf, "EnumSet.allOf(AndroidRef…enceMatchers::class.java)");
            return vVar.a(enumSetAllOf);
        }

        public final List<bw> a(Set<? extends ak> set) {
            AbstractC2995aW.q(set, "referenceMatchers");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                ((ak) it.next()).a(arrayList);
            }
            return arrayList;
        }

        private final com.efs.sdk.memleaksdk.monitor.internal.bn a(bx bxVar, String str, InterfaceC2766Sw interfaceC2766Sw) {
            return new com.efs.sdk.memleaksdk.monitor.internal.bn(bxVar, str, new a(interfaceC2766Sw));
        }

        public final com.efs.sdk.memleaksdk.monitor.internal.be a(String str, String str2) {
            AbstractC2995aW.q(str, "className");
            AbstractC2995aW.q(str2, "fieldName");
            return new com.efs.sdk.memleaksdk.monitor.internal.be(new bx.b(str, str2));
        }

        public final com.efs.sdk.memleaksdk.monitor.internal.be a(String str) {
            AbstractC2995aW.q(str, "threadName");
            return new com.efs.sdk.memleaksdk.monitor.internal.be(new bx.c(str));
        }
    }
}
