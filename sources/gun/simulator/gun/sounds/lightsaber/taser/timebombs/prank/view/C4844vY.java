package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4844vY {
    public static final Clock j = DefaultClock.getInstance();
    public static final Random k = new Random();
    public static final HashMap l = new HashMap();
    public final Context b;
    public final ScheduledExecutorService c;
    public final C4266ou d;
    public final InterfaceC4705tu e;
    public final C3826ju f;
    public final AW g;
    public final String h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5135a = new HashMap();
    public final HashMap i = new HashMap();

    public C4844vY(Context context, ScheduledExecutorService scheduledExecutorService, C4266ou c4266ou, InterfaceC4705tu interfaceC4705tu, C3826ju c3826ju, AW aw) {
        this.b = context;
        this.c = scheduledExecutorService;
        this.d = c4266ou;
        this.e = interfaceC4705tu;
        this.f = c3826ju;
        this.g = aw;
        c4266ou.a();
        this.h = c4266ou.c.b;
        AtomicReference atomicReference = C4756uY.f5082a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = C4756uY.f5082a;
        if (atomicReference2.get() == null) {
            C4756uY c4756uY = new C4756uY();
            while (!atomicReference2.compareAndSet(null, c4756uY)) {
                if (atomicReference2.get() != null) {
                }
            }
            BackgroundDetector.initialize(application);
            BackgroundDetector.getInstance().addListener(c4756uY);
        }
        Tasks.call(scheduledExecutorService, new CallableC4668tY(this, 0));
    }

    public final synchronized C2375Du a(C4266ou c4266ou, InterfaceC4705tu interfaceC4705tu, C3826ju c3826ju, ScheduledExecutorService scheduledExecutorService, C2777Th c2777Th, C2777Th c2777Th2, C2777Th c2777Th3, C2881Xh c2881Xh, C2907Yh c2907Yh, C3633hi c3633hi) {
        try {
            if (!this.f5135a.containsKey("firebase")) {
                Context context = this.b;
                c4266ou.a();
                C2375Du c2375Du = new C2375Du(context, c4266ou.b.equals("[DEFAULT]") ? c3826ju : null, scheduledExecutorService, c2777Th, c2777Th2, c2777Th3, c2881Xh, c2907Yh, c3633hi, e(c4266ou, interfaceC4705tu, c2881Xh, c2777Th2, this.b, c3633hi));
                c2777Th2.b();
                c2777Th3.b();
                c2777Th.b();
                this.f5135a.put("firebase", c2375Du);
                l.put("firebase", c2375Du);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (C2375Du) this.f5135a.get("firebase");
    }

    public final C2777Th b(String str) {
        C2726Ri c2726Ri;
        String strN = AbstractC5044xl.n("frc_", this.h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.c;
        Context context = this.b;
        HashMap map = C2726Ri.c;
        synchronized (C2726Ri.class) {
            try {
                HashMap map2 = C2726Ri.c;
                if (!map2.containsKey(strN)) {
                    map2.put(strN, new C2726Ri(context, strN));
                }
                c2726Ri = (C2726Ri) map2.get(strN);
            } catch (Throwable th) {
                throw th;
            }
        }
        return C2777Th.c(scheduledExecutorService, c2726Ri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sY] */
    public final C2375Du c() {
        C2375Du c2375DuA;
        synchronized (this) {
            try {
                C2777Th c2777ThB = b("fetch");
                C2777Th c2777ThB2 = b("activate");
                C2777Th c2777ThB3 = b("defaults");
                C3633hi c3633hi = new C3633hi(this.b.getSharedPreferences("frc_" + this.h + "_firebase_settings", 0));
                C2907Yh c2907Yh = new C2907Yh(this.c, c2777ThB2, c2777ThB3);
                C4266ou c4266ou = this.d;
                AW aw = this.g;
                c4266ou.a();
                final C3491g4 c3491g4 = c4266ou.b.equals("[DEFAULT]") ? new C3491g4(aw) : null;
                if (c3491g4 != null) {
                    c2907Yh.a(new BiConsumer() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sY
                        @Override // com.google.android.gms.common.util.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            JSONObject jSONObjectOptJSONObject;
                            C3491g4 c3491g5 = c3491g4;
                            String str = (String) obj;
                            C2803Uh c2803Uh = (C2803Uh) obj2;
                            InterfaceC3227d4 interfaceC3227d4 = (InterfaceC3227d4) ((AW) c3491g5.b).get();
                            if (interfaceC3227d4 == null) {
                                return;
                            }
                            JSONObject jSONObject = c2803Uh.e;
                            if (jSONObject.length() < 1) {
                                return;
                            }
                            JSONObject jSONObject2 = c2803Uh.b;
                            if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                                if (strOptString.isEmpty()) {
                                    return;
                                }
                                synchronized (((Map) c3491g5.c)) {
                                    try {
                                        if (!strOptString.equals(((Map) c3491g5.c).get(str))) {
                                            ((Map) c3491g5.c).put(str, strOptString);
                                            Bundle bundle = new Bundle();
                                            bundle.putString("arm_key", str);
                                            bundle.putString("arm_value", jSONObject2.optString(str));
                                            bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                            bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                            bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                            C3315e4 c3315e4 = (C3315e4) interfaceC3227d4;
                                            c3315e4.a("fp", "personalization_assignment", bundle);
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putString("_fpid", strOptString);
                                            c3315e4.a("fp", "_fpc", bundle2);
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    });
                }
                c2375DuA = a(this.d, this.e, this.f, this.c, c2777ThB, c2777ThB2, c2777ThB3, d(c2777ThB, c3633hi), c2907Yh, c3633hi);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2375DuA;
    }

    public final synchronized C2881Xh d(C2777Th c2777Th, C3633hi c3633hi) {
        InterfaceC4705tu interfaceC4705tu;
        AW c3981lh;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str;
        C4266ou c4266ou;
        try {
            interfaceC4705tu = this.e;
            C4266ou c4266ou2 = this.d;
            c4266ou2.a();
            c3981lh = c4266ou2.b.equals("[DEFAULT]") ? this.g : new C3981lh(6);
            scheduledExecutorService = this.c;
            clock = j;
            random = k;
            C4266ou c4266ou3 = this.d;
            c4266ou3.a();
            str = c4266ou3.c.f2897a;
            c4266ou = this.d;
            c4266ou.a();
        } catch (Throwable th) {
            throw th;
        }
        return new C2881Xh(interfaceC4705tu, c3981lh, scheduledExecutorService, clock, random, c2777Th, new ConfigFetchHttpClient(this.b, c4266ou.c.b, str, c3633hi.f4465a.getLong("fetch_timeout_in_seconds", 60L), c3633hi.f4465a.getLong("fetch_timeout_in_seconds", 60L)), c3633hi, this.i);
    }

    public final synchronized C2648Oi e(C4266ou c4266ou, InterfaceC4705tu interfaceC4705tu, C2881Xh c2881Xh, C2777Th c2777Th, Context context, C3633hi c3633hi) {
        return new C2648Oi(c4266ou, interfaceC4705tu, c2881Xh, c2777Th, context, c3633hi, this.c);
    }
}
