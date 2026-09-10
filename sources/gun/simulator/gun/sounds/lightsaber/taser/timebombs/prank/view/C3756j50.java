package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.internal.network.VungleApiClient;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.j50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3756j50 {
    public static final ServiceLocator$Companion Companion = new ServiceLocator$Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static volatile C3756j50 INSTANCE;
    private final Map<Class<?>, Object> cache;
    private final Map<Class<?>, U40> creators;
    private final Context ctx;

    public /* synthetic */ C3756j50(Context context, AbstractC2471Hm abstractC2471Hm) {
        this(context);
    }

    private final void buildCreators() {
        this.creators.put(BE.class, new C2964a50(this));
        this.creators.put(JE.class, new C3053b50(this));
        this.creators.put(VungleApiClient.class, new C3141c50(this));
        this.creators.put(InterfaceC5016xU.class, new C3230d50(this));
        this.creators.put(InterfaceC4615ss.class, new C3318e50(this));
        this.creators.put(C3080bS.class, new C3406f50(this));
        this.creators.put(C3257dS.class, new C3494g50(this));
        this.creators.put(C2919Yt.class, new C3582h50(this));
        this.creators.put(TI.class, new C3670i50(this));
        this.creators.put(C4582sa.class, new V40(this));
        this.creators.put(ZT.class, new W40(this));
        this.creators.put(InterfaceC2526Jp.class, new X40(this));
        this.creators.put(C2466Hh.class, new Y40(this));
        this.creators.put(L60.class, new Z40(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> T getOrBuild(Class<T> cls) {
        Class<?> serviceClass = getServiceClass(cls);
        T t = (T) this.cache.get(serviceClass);
        if (t != null) {
            return t;
        }
        U40 u40 = this.creators.get(serviceClass);
        if (u40 == null) {
            throw new IllegalArgumentException("Unknown class");
        }
        T t2 = (T) u40.create();
        if (u40.isSingleton()) {
            this.cache.put(serviceClass, t2);
        }
        return t2;
    }

    private final Class<?> getServiceClass(Class<?> cls) {
        for (Class<?> cls2 : this.creators.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + cls);
    }

    @VisibleForTesting
    public final <T> void bindService$vungle_ads_release(Class<?> cls, T t) {
        AbstractC2995aW.q(cls, "serviceClass");
        this.cache.put(cls, t);
    }

    public final synchronized <T> T getService(Class<T> cls) {
        AbstractC2995aW.q(cls, "serviceClass");
        return (T) getOrBuild(cls);
    }

    public final synchronized <T> boolean isCreated(Class<T> cls) {
        AbstractC2995aW.q(cls, "serviceClass");
        return this.cache.containsKey(getServiceClass(cls));
    }

    private C3756j50(Context context) {
        Context applicationContext = context.getApplicationContext();
        AbstractC2995aW.p(applicationContext, "context.applicationContext");
        this.ctx = applicationContext;
        this.creators = new HashMap();
        this.cache = new HashMap();
        buildCreators();
    }
}
