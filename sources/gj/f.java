package gj;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g0;
import b0.l0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import xi.p;
import xi.s;
import zc.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class f implements FlutterFirebasePlugin, xi.n, s, ti.b, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f41926a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f41927b = new ArrayDeque(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p f41928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Activity f41929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f41930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f41931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f41932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f41933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f41934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f41935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f41936k;

    public f() {
        if (h.l == null) {
            h.l = new h();
        }
        this.f41930e = h.l;
        if (h.f41940m == null) {
            h.f41940m = new h();
        }
        this.f41932g = h.f41940m;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050 A[PHI: r2
  0x0050: PHI (r2v2 zc.t) = (r2v1 zc.t), (r2v1 zc.t), (r2v5 zc.t) binds: [B:11:0x0027, B:13:0x0031, B:15:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean a(Intent intent) {
        Map map;
        Map map2;
        HashMap mapO;
        if (intent.getExtras() == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        String string = extras.getString("google.message_id");
        if (string == null) {
            string = extras.getString("message_id");
        }
        if (string == null) {
            return false;
        }
        HashMap map3 = FlutterFirebaseMessagingReceiver.f43402a;
        t tVarS = (t) map3.get(string);
        if (tVarS != null || (mapO = n5.f.p().o(string)) == null) {
            map = null;
        } else {
            tVarS = android.support.v4.media.session.a.s(mapO);
            Object obj = mapO.get("message");
            Objects.requireNonNull(obj);
            Map map4 = (Map) obj;
            if (map4.get("notification") == null) {
                map = null;
            } else {
                map = (Map) map4.get("notification");
            }
        }
        if (tVarS == null) {
            return false;
        }
        this.f41934i = tVarS;
        this.f41935j = map;
        map3.remove(string);
        HashMap mapG = android.support.v4.media.session.a.G(tVarS);
        if (tVarS.m() == null && (map2 = this.f41935j) != null) {
            mapG.put("notification", map2);
        }
        this.f41928c.a("Messaging#onMessageOpenedApp", mapG, null);
        this.f41929d.setIntent(intent);
        return true;
    }

    public final int b() {
        if (a.a.f3311a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        }
        Activity activity = this.f41929d;
        if (activity == null || !b0.b.j(activity, "android.permission.POST_NOTIFICATIONS")) {
            if (!a.a.f3311a.getSharedPreferences("io.flutter.plugins.firebase.messaging.permissions", 0).getBoolean("notification_permission_requested", false)) {
                return -1;
            }
            if (this.f41929d != null) {
                return 3;
            }
        }
        return 0;
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new cj.g(4, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public final Task getPluginConstantsForFirebaseApp(mb.g gVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new dj.k(gVar, taskCompletionSource, 3));
        return taskCompletionSource.getTask();
    }

    @Override // ui.a
    public final void onAttachedToActivity(ui.b bVar) {
        fc.f fVar = (fc.f) bVar;
        fVar.d(this);
        fVar.e(this.f41936k);
        Activity activity = (Activity) fVar.f40780b;
        this.f41929d = activity;
        if (activity.getIntent() == null || this.f41929d.getIntent().getExtras() == null || (this.f41929d.getIntent().getFlags() & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 1048576) {
            return;
        }
        a(this.f41929d.getIntent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [gj.e] */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.lifecycle.g0, gj.e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ti.b
    public final void onAttachedToEngine(ti.a aVar) {
        Context context = aVar.f50787a;
        Log.d("FLTFireContextHolder", "received application context.");
        a.a.f3311a = context;
        p pVar = new p(aVar.f50789c, "plugins.flutter.io/firebase_messaging");
        this.f41928c = pVar;
        pVar.b(this);
        this.f41936k = new g();
        final int i10 = 0;
        ?? r10 = new g0(this) { // from class: gj.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f41925b;

            {
                this.f41925b = this;
            }

            @Override // androidx.lifecycle.g0
            public final void A(Object obj) {
                switch (i10) {
                    case 0:
                        this.f41925b.f41928c.a("Messaging#onMessage", android.support.v4.media.session.a.G((t) obj), null);
                        break;
                    default:
                        this.f41925b.f41928c.a("Messaging#onTokenRefresh", (String) obj, null);
                        break;
                }
            }
        };
        this.f41931f = r10;
        final int i11 = 1;
        this.f41933h = new g0(this) { // from class: gj.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f41925b;

            {
                this.f41925b = this;
            }

            @Override // androidx.lifecycle.g0
            public final void A(Object obj) {
                switch (i11) {
                    case 0:
                        this.f41925b.f41928c.a("Messaging#onMessage", android.support.v4.media.session.a.G((t) obj), null);
                        break;
                    default:
                        this.f41925b.f41928c.a("Messaging#onTokenRefresh", (String) obj, null);
                        break;
                }
            }
        };
        this.f41930e.e(r10);
        this.f41932g.e(this.f41933h);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    @Override // ui.a
    public final void onDetachedFromActivity() {
        this.f41929d = null;
    }

    @Override // ui.a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f41929d = null;
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a aVar) {
        this.f41932g.i(this.f41933h);
        this.f41930e.i(this.f41931f);
    }

    @Override // xi.n
    public final void onMethodCall(xi.m mVar, xi.o oVar) {
        Task task;
        long jIntValue;
        long jIntValue2;
        String str = mVar.f53822a;
        Object obj = mVar.f53823b;
        str.getClass();
        int i10 = 6;
        int i11 = 4;
        int i12 = 3;
        final int i13 = 2;
        final int i14 = 1;
        final int i15 = 0;
        switch (str) {
            case "Messaging#getInitialMessage":
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: gj.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f41919b;

                    {
                        this.f41919b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:61:0x0103 A[PHI: r7
  0x0103: PHI (r7v11 zc.t) = (r7v8 zc.t), (r7v13 zc.t) binds: [B:57:0x00f0, B:59:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map;
                        switch (i15) {
                            case 0:
                                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                                f fVar = this.f41919b;
                                HashMap map2 = fVar.f41926a;
                                try {
                                    t tVar = fVar.f41934i;
                                    if (tVar == null) {
                                        Activity activity = fVar.f41929d;
                                        if (activity != null) {
                                            Intent intent = activity.getIntent();
                                            if (intent != null && intent.getExtras() != null) {
                                                String string = intent.getExtras().getString("google.message_id");
                                                if (string == null) {
                                                    string = intent.getExtras().getString("message_id");
                                                }
                                                if (string != null && map2.get(string) == null) {
                                                    t tVarS = (t) FlutterFirebaseMessagingReceiver.f43402a.get(string);
                                                    if (tVarS == null) {
                                                        HashMap mapO = n5.f.p().o(string);
                                                        if (mapO != null) {
                                                            tVarS = android.support.v4.media.session.a.s(mapO);
                                                            if (mapO.get("notification") != null) {
                                                                map = (Map) mapO.get("notification");
                                                            } else {
                                                                map = null;
                                                            }
                                                        } else {
                                                            map = null;
                                                        }
                                                        n5.f.p().w(string);
                                                    } else {
                                                        map = null;
                                                    }
                                                    if (tVarS != null) {
                                                        map2.put(string, Boolean.TRUE);
                                                        HashMap mapG = android.support.v4.media.session.a.G(tVarS);
                                                        if (tVarS.m() == null && map != null) {
                                                            mapG.put("notification", map);
                                                        }
                                                        taskCompletionSource2.setResult(mapG);
                                                    } else {
                                                        taskCompletionSource2.setResult(null);
                                                    }
                                                }
                                                taskCompletionSource2.setResult(null);
                                            }
                                            taskCompletionSource2.setResult(null);
                                        } else {
                                            taskCompletionSource2.setResult(null);
                                        }
                                    } else {
                                        HashMap mapG2 = android.support.v4.media.session.a.G(tVar);
                                        Map map3 = fVar.f41935j;
                                        if (map3 != null) {
                                            mapG2.put("notification", map3);
                                        }
                                        taskCompletionSource2.setResult(mapG2);
                                        fVar.f41934i = null;
                                        fVar.f41935j = null;
                                    }
                                } catch (Exception e10) {
                                    taskCompletionSource2.setException(e10);
                                    return;
                                }
                                break;
                            case 1:
                                f fVar2 = this.f41919b;
                                TaskCompletionSource taskCompletionSource3 = taskCompletionSource;
                                HashMap map4 = new HashMap();
                                try {
                                    if (a.a.f3311a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                                        map4.put("authorizationStatus", 1);
                                        taskCompletionSource3.setResult(map4);
                                    } else {
                                        fVar2.f41936k.a(fVar2.f41929d, new ac.a(fVar2, map4, taskCompletionSource3), new a4.a(taskCompletionSource3, 26));
                                    }
                                } catch (Exception e11) {
                                    taskCompletionSource3.setException(e11);
                                    return;
                                }
                                break;
                            default:
                                TaskCompletionSource taskCompletionSource4 = taskCompletionSource;
                                f fVar3 = this.f41919b;
                                fVar3.getClass();
                                try {
                                    HashMap map5 = new HashMap();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        map5.put("authorizationStatus", Integer.valueOf(fVar3.b()));
                                    } else {
                                        map5.put("authorizationStatus", Integer.valueOf(new l0(a.a.f3311a).f5152b.areNotificationsEnabled() ? 1 : 0));
                                    }
                                    taskCompletionSource4.setResult(map5);
                                } catch (Exception e12) {
                                    taskCompletionSource4.setException(e12);
                                }
                                break;
                        }
                    }
                });
                task = taskCompletionSource.getTask();
                break;
            case "Messaging#setAutoInitEnabled":
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, (Map) obj, taskCompletionSource2));
                task = taskCompletionSource2.getTask();
                break;
            case "Messaging#deleteToken":
                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new cj.g(i10, taskCompletionSource3));
                task = taskCompletionSource3.getTask();
                break;
            case "Messaging#unsubscribeFromTopic":
                TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new d((Map) obj, taskCompletionSource4, i15));
                task = taskCompletionSource4.getTask();
                break;
            case "Messaging#subscribeToTopic":
                TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new d((Map) obj, taskCompletionSource5, i12));
                task = taskCompletionSource5.getTask();
                break;
            case "Messaging#setDeliveryMetricsExportToBigQuery":
                TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new d((Map) obj, taskCompletionSource6, i14));
                task = taskCompletionSource6.getTask();
                break;
            case "Messaging#startBackgroundIsolate":
                Map map = (Map) obj;
                Object obj2 = map.get("pluginCallbackHandle");
                Object obj3 = map.get("userCallbackHandle");
                if (obj2 instanceof Long) {
                    jIntValue = ((Long) obj2).longValue();
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    jIntValue = ((Integer) obj2).intValue();
                }
                if (obj3 instanceof Long) {
                    jIntValue2 = ((Long) obj3).longValue();
                } else {
                    if (!(obj3 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    jIntValue2 = ((Integer) obj3).intValue();
                }
                List list = FlutterFirebaseMessagingBackgroundService.f43400h;
                Context context = a.a.f3311a;
                if (context == null) {
                    Log.e("FLTFireBGExecutor", "Context is null, cannot continue.");
                } else {
                    context.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("callback_handle", jIntValue).apply();
                }
                a.a.f3311a.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong("user_callback_handle", jIntValue2).apply();
                task = Tasks.forResult(null);
                break;
            case "Messaging#sendMessage":
                TaskCompletionSource taskCompletionSource7 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new d((Map) obj, taskCompletionSource7, i11));
                task = taskCompletionSource7.getTask();
                break;
            case "Messaging#requestPermission":
                if (Build.VERSION.SDK_INT < 33) {
                    final TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: gj.c

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f f41919b;

                        {
                            this.f41919b = this;
                        }

                        /* JADX WARN: Code duplicated, block: B:61:0x0103 A[PHI: r7
  0x0103: PHI (r7v11 zc.t) = (r7v8 zc.t), (r7v13 zc.t) binds: [B:57:0x00f0, B:59:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Map map2;
                            switch (i13) {
                                case 0:
                                    TaskCompletionSource taskCompletionSource9 = taskCompletionSource8;
                                    f fVar = this.f41919b;
                                    HashMap map3 = fVar.f41926a;
                                    try {
                                        t tVar = fVar.f41934i;
                                        if (tVar == null) {
                                            Activity activity = fVar.f41929d;
                                            if (activity != null) {
                                                Intent intent = activity.getIntent();
                                                if (intent != null && intent.getExtras() != null) {
                                                    String string = intent.getExtras().getString("google.message_id");
                                                    if (string == null) {
                                                        string = intent.getExtras().getString("message_id");
                                                    }
                                                    if (string != null && map3.get(string) == null) {
                                                        t tVarS = (t) FlutterFirebaseMessagingReceiver.f43402a.get(string);
                                                        if (tVarS == null) {
                                                            HashMap mapO = n5.f.p().o(string);
                                                            if (mapO != null) {
                                                                tVarS = android.support.v4.media.session.a.s(mapO);
                                                                if (mapO.get("notification") != null) {
                                                                    map2 = (Map) mapO.get("notification");
                                                                } else {
                                                                    map2 = null;
                                                                }
                                                            } else {
                                                                map2 = null;
                                                            }
                                                            n5.f.p().w(string);
                                                        } else {
                                                            map2 = null;
                                                        }
                                                        if (tVarS != null) {
                                                            map3.put(string, Boolean.TRUE);
                                                            HashMap mapG = android.support.v4.media.session.a.G(tVarS);
                                                            if (tVarS.m() == null && map2 != null) {
                                                                mapG.put("notification", map2);
                                                            }
                                                            taskCompletionSource9.setResult(mapG);
                                                        } else {
                                                            taskCompletionSource9.setResult(null);
                                                        }
                                                    }
                                                    taskCompletionSource9.setResult(null);
                                                }
                                                taskCompletionSource9.setResult(null);
                                            } else {
                                                taskCompletionSource9.setResult(null);
                                            }
                                        } else {
                                            HashMap mapG2 = android.support.v4.media.session.a.G(tVar);
                                            Map map4 = fVar.f41935j;
                                            if (map4 != null) {
                                                mapG2.put("notification", map4);
                                            }
                                            taskCompletionSource9.setResult(mapG2);
                                            fVar.f41934i = null;
                                            fVar.f41935j = null;
                                        }
                                    } catch (Exception e10) {
                                        taskCompletionSource9.setException(e10);
                                        return;
                                    }
                                    break;
                                case 1:
                                    f fVar2 = this.f41919b;
                                    TaskCompletionSource taskCompletionSource10 = taskCompletionSource8;
                                    HashMap map5 = new HashMap();
                                    try {
                                        if (a.a.f3311a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                                            map5.put("authorizationStatus", 1);
                                            taskCompletionSource10.setResult(map5);
                                        } else {
                                            fVar2.f41936k.a(fVar2.f41929d, new ac.a(fVar2, map5, taskCompletionSource10), new a4.a(taskCompletionSource10, 26));
                                        }
                                    } catch (Exception e11) {
                                        taskCompletionSource10.setException(e11);
                                        return;
                                    }
                                    break;
                                default:
                                    TaskCompletionSource taskCompletionSource11 = taskCompletionSource8;
                                    f fVar3 = this.f41919b;
                                    fVar3.getClass();
                                    try {
                                        HashMap map6 = new HashMap();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            map6.put("authorizationStatus", Integer.valueOf(fVar3.b()));
                                        } else {
                                            map6.put("authorizationStatus", Integer.valueOf(new l0(a.a.f3311a).f5152b.areNotificationsEnabled() ? 1 : 0));
                                        }
                                        taskCompletionSource11.setResult(map6);
                                    } catch (Exception e12) {
                                        taskCompletionSource11.setException(e12);
                                    }
                                    break;
                            }
                        }
                    });
                    task = taskCompletionSource8.getTask();
                    break;
                } else {
                    final TaskCompletionSource taskCompletionSource9 = new TaskCompletionSource();
                    FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: gj.c

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ f f41919b;

                        {
                            this.f41919b = this;
                        }

                        /* JADX WARN: Code duplicated, block: B:61:0x0103 A[PHI: r7
  0x0103: PHI (r7v11 zc.t) = (r7v8 zc.t), (r7v13 zc.t) binds: [B:57:0x00f0, B:59:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            Map map2;
                            switch (i14) {
                                case 0:
                                    TaskCompletionSource taskCompletionSource10 = taskCompletionSource9;
                                    f fVar = this.f41919b;
                                    HashMap map3 = fVar.f41926a;
                                    try {
                                        t tVar = fVar.f41934i;
                                        if (tVar == null) {
                                            Activity activity = fVar.f41929d;
                                            if (activity != null) {
                                                Intent intent = activity.getIntent();
                                                if (intent != null && intent.getExtras() != null) {
                                                    String string = intent.getExtras().getString("google.message_id");
                                                    if (string == null) {
                                                        string = intent.getExtras().getString("message_id");
                                                    }
                                                    if (string != null && map3.get(string) == null) {
                                                        t tVarS = (t) FlutterFirebaseMessagingReceiver.f43402a.get(string);
                                                        if (tVarS == null) {
                                                            HashMap mapO = n5.f.p().o(string);
                                                            if (mapO != null) {
                                                                tVarS = android.support.v4.media.session.a.s(mapO);
                                                                if (mapO.get("notification") != null) {
                                                                    map2 = (Map) mapO.get("notification");
                                                                } else {
                                                                    map2 = null;
                                                                }
                                                            } else {
                                                                map2 = null;
                                                            }
                                                            n5.f.p().w(string);
                                                        } else {
                                                            map2 = null;
                                                        }
                                                        if (tVarS != null) {
                                                            map3.put(string, Boolean.TRUE);
                                                            HashMap mapG = android.support.v4.media.session.a.G(tVarS);
                                                            if (tVarS.m() == null && map2 != null) {
                                                                mapG.put("notification", map2);
                                                            }
                                                            taskCompletionSource10.setResult(mapG);
                                                        } else {
                                                            taskCompletionSource10.setResult(null);
                                                        }
                                                    }
                                                    taskCompletionSource10.setResult(null);
                                                }
                                                taskCompletionSource10.setResult(null);
                                            } else {
                                                taskCompletionSource10.setResult(null);
                                            }
                                        } else {
                                            HashMap mapG2 = android.support.v4.media.session.a.G(tVar);
                                            Map map4 = fVar.f41935j;
                                            if (map4 != null) {
                                                mapG2.put("notification", map4);
                                            }
                                            taskCompletionSource10.setResult(mapG2);
                                            fVar.f41934i = null;
                                            fVar.f41935j = null;
                                        }
                                    } catch (Exception e10) {
                                        taskCompletionSource10.setException(e10);
                                        return;
                                    }
                                    break;
                                case 1:
                                    f fVar2 = this.f41919b;
                                    TaskCompletionSource taskCompletionSource11 = taskCompletionSource9;
                                    HashMap map5 = new HashMap();
                                    try {
                                        if (a.a.f3311a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                                            map5.put("authorizationStatus", 1);
                                            taskCompletionSource11.setResult(map5);
                                        } else {
                                            fVar2.f41936k.a(fVar2.f41929d, new ac.a(fVar2, map5, taskCompletionSource11), new a4.a(taskCompletionSource11, 26));
                                        }
                                    } catch (Exception e11) {
                                        taskCompletionSource11.setException(e11);
                                        return;
                                    }
                                    break;
                                default:
                                    TaskCompletionSource taskCompletionSource12 = taskCompletionSource9;
                                    f fVar3 = this.f41919b;
                                    fVar3.getClass();
                                    try {
                                        HashMap map6 = new HashMap();
                                        if (Build.VERSION.SDK_INT >= 33) {
                                            map6.put("authorizationStatus", Integer.valueOf(fVar3.b()));
                                        } else {
                                            map6.put("authorizationStatus", Integer.valueOf(new l0(a.a.f3311a).f5152b.areNotificationsEnabled() ? 1 : 0));
                                        }
                                        taskCompletionSource12.setResult(map6);
                                    } catch (Exception e12) {
                                        taskCompletionSource12.setException(e12);
                                    }
                                    break;
                            }
                        }
                    });
                    task = taskCompletionSource9.getTask();
                    break;
                }
                break;
            case "Messaging#getNotificationSettings":
                final TaskCompletionSource taskCompletionSource10 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable(this) { // from class: gj.c

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ f f41919b;

                    {
                        this.f41919b = this;
                    }

                    /* JADX WARN: Code duplicated, block: B:61:0x0103 A[PHI: r7
  0x0103: PHI (r7v11 zc.t) = (r7v8 zc.t), (r7v13 zc.t) binds: [B:57:0x00f0, B:59:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Map map2;
                        switch (i13) {
                            case 0:
                                TaskCompletionSource taskCompletionSource11 = taskCompletionSource10;
                                f fVar = this.f41919b;
                                HashMap map3 = fVar.f41926a;
                                try {
                                    t tVar = fVar.f41934i;
                                    if (tVar == null) {
                                        Activity activity = fVar.f41929d;
                                        if (activity != null) {
                                            Intent intent = activity.getIntent();
                                            if (intent != null && intent.getExtras() != null) {
                                                String string = intent.getExtras().getString("google.message_id");
                                                if (string == null) {
                                                    string = intent.getExtras().getString("message_id");
                                                }
                                                if (string != null && map3.get(string) == null) {
                                                    t tVarS = (t) FlutterFirebaseMessagingReceiver.f43402a.get(string);
                                                    if (tVarS == null) {
                                                        HashMap mapO = n5.f.p().o(string);
                                                        if (mapO != null) {
                                                            tVarS = android.support.v4.media.session.a.s(mapO);
                                                            if (mapO.get("notification") != null) {
                                                                map2 = (Map) mapO.get("notification");
                                                            } else {
                                                                map2 = null;
                                                            }
                                                        } else {
                                                            map2 = null;
                                                        }
                                                        n5.f.p().w(string);
                                                    } else {
                                                        map2 = null;
                                                    }
                                                    if (tVarS != null) {
                                                        map3.put(string, Boolean.TRUE);
                                                        HashMap mapG = android.support.v4.media.session.a.G(tVarS);
                                                        if (tVarS.m() == null && map2 != null) {
                                                            mapG.put("notification", map2);
                                                        }
                                                        taskCompletionSource11.setResult(mapG);
                                                    } else {
                                                        taskCompletionSource11.setResult(null);
                                                    }
                                                }
                                                taskCompletionSource11.setResult(null);
                                            }
                                            taskCompletionSource11.setResult(null);
                                        } else {
                                            taskCompletionSource11.setResult(null);
                                        }
                                    } else {
                                        HashMap mapG2 = android.support.v4.media.session.a.G(tVar);
                                        Map map4 = fVar.f41935j;
                                        if (map4 != null) {
                                            mapG2.put("notification", map4);
                                        }
                                        taskCompletionSource11.setResult(mapG2);
                                        fVar.f41934i = null;
                                        fVar.f41935j = null;
                                    }
                                } catch (Exception e10) {
                                    taskCompletionSource11.setException(e10);
                                    return;
                                }
                                break;
                            case 1:
                                f fVar2 = this.f41919b;
                                TaskCompletionSource taskCompletionSource12 = taskCompletionSource10;
                                HashMap map5 = new HashMap();
                                try {
                                    if (a.a.f3311a.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
                                        map5.put("authorizationStatus", 1);
                                        taskCompletionSource12.setResult(map5);
                                    } else {
                                        fVar2.f41936k.a(fVar2.f41929d, new ac.a(fVar2, map5, taskCompletionSource12), new a4.a(taskCompletionSource12, 26));
                                    }
                                } catch (Exception e11) {
                                    taskCompletionSource12.setException(e11);
                                    return;
                                }
                                break;
                            default:
                                TaskCompletionSource taskCompletionSource13 = taskCompletionSource10;
                                f fVar3 = this.f41919b;
                                fVar3.getClass();
                                try {
                                    HashMap map6 = new HashMap();
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        map6.put("authorizationStatus", Integer.valueOf(fVar3.b()));
                                    } else {
                                        map6.put("authorizationStatus", Integer.valueOf(new l0(a.a.f3311a).f5152b.areNotificationsEnabled() ? 1 : 0));
                                    }
                                    taskCompletionSource13.setResult(map6);
                                } catch (Exception e12) {
                                    taskCompletionSource13.setException(e12);
                                }
                                break;
                        }
                    }
                });
                task = taskCompletionSource10.getTask();
                break;
            case "Messaging#getToken":
                TaskCompletionSource taskCompletionSource11 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new cj.g(this, taskCompletionSource11));
                task = taskCompletionSource11.getTask();
                break;
            default:
                ((wi.j) oVar).c();
                return;
        }
        task.addOnCompleteListener(new b6.a(this, (wi.j) oVar));
    }

    @Override // xi.s
    public final boolean onNewIntent(Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                ArrayDeque arrayDeque = this.f41927b;
                if (string != null) {
                    if (!arrayDeque.contains(string)) {
                        if (arrayDeque.size() >= 10) {
                            arrayDeque.poll();
                        }
                        arrayDeque.add(string);
                    }
                }
                Bundle bundle = extras.getBundle("gcm.n.analytics_data");
                if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
                    d0.c.B(bundle);
                }
            }
        } catch (RuntimeException e10) {
            Log.w("FLTFireMsgPlugin", "Failed to get analytics data from notification intent extras.", e10);
        }
        return a(intent);
    }

    @Override // ui.a
    public final void onReattachedToActivityForConfigChanges(ui.b bVar) {
        fc.f fVar = (fc.f) bVar;
        fVar.d(this);
        this.f41929d = (Activity) fVar.f40780b;
    }
}
