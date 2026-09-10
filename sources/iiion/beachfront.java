package iiion;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.provider.FirebaseInitProvider;
import inblowing.graveside;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import saneness.retroflection;

/* JADX INFO: compiled from: FirebaseApp.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f28416attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final graveside<thermotherapy.attabal> f28417beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final friedmanite.saneness<com.google.firebase.heartbeatinfo.attabal> f28418competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final inblowing.triweekly f28419dern;
    private final String name;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final impassible f28422saneness;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final Object f28415cutely = new Object();

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Map<String, beachfront> f28414apical = new androidx.collection.attabal();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final AtomicBoolean f28424wireman = new AtomicBoolean(false);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final AtomicBoolean f28421marial = new AtomicBoolean();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final List<attabal> f28420impromptu = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final List<competently> f28423taiyuan = new CopyOnWriteArrayList();

    /* JADX INFO: compiled from: FirebaseApp.java */
    public interface attabal {
        void onBackgroundStateChanged(boolean z);
    }

    /* JADX INFO: compiled from: FirebaseApp.java */
    public static class dern extends BroadcastReceiver {

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static AtomicReference<dern> f28425saneness = new AtomicReference<>();

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f28426attabal;

        public dern(Context context) {
            this.f28426attabal = context;
        }

        public static void saneness(Context context) {
            if (f28425saneness.get() == null) {
                dern dernVar = new dern(context);
                if (retroflection.attabal(f28425saneness, null, dernVar)) {
                    context.registerReceiver(dernVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void dern() {
            this.f28426attabal.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (beachfront.f28415cutely) {
                try {
                    Iterator<beachfront> it = beachfront.f28414apical.values().iterator();
                    while (it.hasNext()) {
                        it.next().monoploid();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            dern();
        }
    }

    /* JADX INFO: compiled from: FirebaseApp.java */
    public static class saneness implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static AtomicReference<saneness> f28427attabal = new AtomicReference<>();

        public static void saneness(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f28427attabal.get() == null) {
                    saneness sanenessVar = new saneness();
                    if (retroflection.attabal(f28427attabal, null, sanenessVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(sanenessVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (beachfront.f28415cutely) {
                try {
                    for (beachfront beachfrontVar : new ArrayList(beachfront.f28414apical.values())) {
                        if (beachfrontVar.f28424wireman.get()) {
                            beachfrontVar.rotuma(z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public beachfront(final Context context, String str, impassible impassibleVar) {
        this.f28416attabal = (Context) Preconditions.checkNotNull(context);
        this.name = Preconditions.checkNotEmpty(str);
        this.f28422saneness = (impassible) Preconditions.checkNotNull(impassibleVar);
        triweekly triweeklyVarSaneness = FirebaseInitProvider.saneness();
        bochum.dern.saneness("Firebase");
        bochum.dern.saneness("ComponentDiscovery");
        List<friedmanite.saneness<ComponentRegistrar>> listSaneness = inblowing.beachfront.dern(context, ComponentDiscoveryService.class).saneness();
        bochum.dern.attabal();
        bochum.dern.saneness("Runtime");
        inblowing.triweekly.saneness sanenessVarBeachfront = inblowing.triweekly.impassible(UiExecutor.INSTANCE).wireman(listSaneness).dern(new FirebaseCommonRegistrar()).dern(new ExecutorsRegistrar()).saneness(inblowing.dern.monoploid(context, Context.class, new Class[0])).saneness(inblowing.dern.monoploid(this, beachfront.class, new Class[0])).saneness(inblowing.dern.monoploid(impassibleVar, impassible.class, new Class[0])).beachfront(new bochum.saneness());
        if (claque.triweekly.attabal(context) && FirebaseInitProvider.dern()) {
            sanenessVarBeachfront.saneness(inblowing.dern.monoploid(triweeklyVarSaneness, triweekly.class, new Class[0]));
        }
        inblowing.triweekly triweeklyVarMarial = sanenessVarBeachfront.marial();
        this.f28419dern = triweeklyVarMarial;
        bochum.dern.attabal();
        this.f28417beachfront = new graveside<>(new friedmanite.saneness() { // from class: iiion.wireman
            @Override // friedmanite.saneness
            public final Object get() {
                return beachfront.saneness(this.f28438attabal, context);
            }
        });
        this.f28418competently = triweeklyVarMarial.beachfront(com.google.firebase.heartbeatinfo.attabal.class);
        competently(new attabal() { // from class: iiion.marial
            @Override // iiion.beachfront.attabal
            public final void onBackgroundStateChanged(boolean z) {
                beachfront.attabal(this.f28436attabal, z);
            }
        });
        bochum.dern.attabal();
    }

    public static /* synthetic */ void attabal(beachfront beachfrontVar, boolean z) {
        if (z) {
            beachfrontVar.getClass();
        } else {
            beachfrontVar.f28418competently.get().impromptu();
        }
    }

    public static List<beachfront> formularize(Context context) {
        ArrayList arrayList;
        synchronized (f28415cutely) {
            arrayList = new ArrayList(f28414apical.values());
        }
        return arrayList;
    }

    public static String gintrap(String str) {
        return str.trim();
    }

    public static beachfront graveside(Context context, impassible impassibleVar, String str) {
        beachfront beachfrontVar;
        saneness.saneness(context);
        String strGintrap = gintrap(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f28415cutely) {
            Map<String, beachfront> map = f28414apical;
            Preconditions.checkState(!map.containsKey(strGintrap), "FirebaseApp name " + strGintrap + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            beachfrontVar = new beachfront(context, strGintrap, impassibleVar);
            map.put(strGintrap, beachfrontVar);
        }
        beachfrontVar.monoploid();
        return beachfrontVar;
    }

    public static beachfront impassible() {
        beachfront beachfrontVar;
        synchronized (f28415cutely) {
            try {
                beachfrontVar = f28414apical.get("[DEFAULT]");
                if (beachfrontVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                beachfrontVar.f28418competently.get().impromptu();
            } catch (Throwable th) {
                throw th;
            }
        }
        return beachfrontVar;
    }

    public static beachfront molybdenite(Context context, impassible impassibleVar) {
        return graveside(context, impassibleVar, "[DEFAULT]");
    }

    public static beachfront polloi(Context context) {
        synchronized (f28415cutely) {
            try {
                if (f28414apical.containsKey("[DEFAULT]")) {
                    return impassible();
                }
                impassible impassibleVarAttabal = impassible.attabal(context);
                if (impassibleVarAttabal == null) {
                    return null;
                }
                return molybdenite(context, impassibleVarAttabal);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ thermotherapy.attabal saneness(beachfront beachfrontVar, Context context) {
        return new thermotherapy.attabal(context, beachfrontVar.arytenoidectomy(), (silty.dern) beachfrontVar.f28419dern.attabal(silty.dern.class));
    }

    public boolean adultoid() {
        taiyuan();
        return this.f28417beachfront.get().saneness();
    }

    public Context apical() {
        taiyuan();
        return this.f28416attabal;
    }

    public String arytenoidectomy() {
        return Base64Utils.encodeUrlSafeNoPadding(triweekly().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(kowloon().dern().getBytes(Charset.defaultCharset()));
    }

    public void competently(attabal attabalVar) {
        taiyuan();
        if (this.f28424wireman.get() && BackgroundDetector.getInstance().isInBackground()) {
            attabalVar.onBackgroundStateChanged(true);
        }
        this.f28420impromptu.add(attabalVar);
    }

    public <T> T cutely(Class<T> cls) {
        taiyuan();
        return (T) this.f28419dern.attabal(cls);
    }

    public boolean dovishness() {
        return "[DEFAULT]".equals(triweekly());
    }

    public boolean equals(Object obj) {
        if (obj instanceof beachfront) {
            return this.name.equals(((beachfront) obj).triweekly());
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public void impromptu(competently competentlyVar) {
        taiyuan();
        Preconditions.checkNotNull(competentlyVar);
        this.f28423taiyuan.add(competentlyVar);
    }

    public impassible kowloon() {
        taiyuan();
        return this.f28422saneness;
    }

    public final void monoploid() {
        if (!claque.triweekly.attabal(this.f28416attabal)) {
            triweekly();
            dern.saneness(this.f28416attabal);
        } else {
            triweekly();
            this.f28419dern.arytenoidectomy(dovishness());
            this.f28418competently.get().impromptu();
        }
    }

    public final void rotuma(boolean z) {
        Iterator<attabal> it = this.f28420impromptu.iterator();
        while (it.hasNext()) {
            it.next().onBackgroundStateChanged(z);
        }
    }

    public final void taiyuan() {
        Preconditions.checkState(!this.f28421marial.get(), "FirebaseApp was deleted");
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.name).add("options", this.f28422saneness).toString();
    }

    public String triweekly() {
        taiyuan();
        return this.name;
    }
}
