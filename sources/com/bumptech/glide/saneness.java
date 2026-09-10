package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.bumptech.glide.util.apical;
import com.bumptech.glide.util.formularize;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import regius.kowloon;

/* JADX INFO: compiled from: Glide.java */
/* JADX INFO: loaded from: classes2.dex */
public class saneness implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public static volatile boolean f17905cord;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static volatile saneness f17906preprohormone;

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final regius.dern f17907adultoid;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final trawler.wireman f17908arytenoidectomy;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final attabal f17910gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final kowloon f17911graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final com.bumptech.glide.load.engine.beachfront f17912kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final trawler.saneness f17913molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final hemolysin.impromptu f17914monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final wireman f17915polloi;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final List<impromptu> f17909dovishness = new ArrayList();

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public MemoryCategory f17916rotuma = MemoryCategory.NORMAL;

    /* JADX INFO: compiled from: Glide.java */
    public interface attabal {
        awlwort.competently build();
    }

    public saneness(Context context, com.bumptech.glide.load.engine.beachfront beachfrontVar, hemolysin.impromptu impromptuVar, trawler.wireman wiremanVar, trawler.saneness sanenessVar, kowloon kowloonVar, regius.dern dernVar, int i, attabal attabalVar, Map<Class<?>, taiyuan<?, ?>> map, List<awlwort.beachfront<Object>> list, List<diandrous.saneness> list2, diandrous.attabal attabalVar2, marial marialVar) {
        this.f17912kowloon = beachfrontVar;
        this.f17908arytenoidectomy = wiremanVar;
        this.f17913molybdenite = sanenessVar;
        this.f17914monoploid = impromptuVar;
        this.f17911graveside = kowloonVar;
        this.f17907adultoid = dernVar;
        this.f17910gintrap = attabalVar;
        this.f17915polloi = new wireman(context, sanenessVar, beachfront.wireman(this, list2, attabalVar2), new belongingness.saneness(), attabalVar, map, list, beachfrontVar, marialVar, i);
    }

    public static void attabal(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f17905cord) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f17905cord = true;
        try {
            impassible(context, generatedAppGlideModule);
        } finally {
            f17905cord = false;
        }
    }

    public static saneness dern(Context context) {
        if (f17906preprohormone == null) {
            GeneratedAppGlideModule generatedAppGlideModuleWireman = wireman(context.getApplicationContext());
            synchronized (saneness.class) {
                try {
                    if (f17906preprohormone == null) {
                        attabal(context, generatedAppGlideModuleWireman);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17906preprohormone;
    }

    public static kowloon formularize(Context context) {
        apical.marial(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return dern(context).apical();
    }

    public static impromptu graveside(Context context) {
        return formularize(context).wireman(context);
    }

    public static void impassible(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        triweekly(context, new dern(), generatedAppGlideModule);
    }

    public static void monoploid(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static void triweekly(Context context, dern dernVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<diandrous.saneness> listSaneness = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.dern()) {
            listSaneness = new diandrous.wireman(applicationContext).saneness();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.wireman().isEmpty()) {
            Set<Class<?>> setWireman = generatedAppGlideModule.wireman();
            Iterator<diandrous.saneness> it = listSaneness.iterator();
            while (it.hasNext()) {
                diandrous.saneness next = it.next();
                if (setWireman.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        next.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<diandrous.saneness> it2 = listSaneness.iterator();
            while (it2.hasNext()) {
                it2.next().getClass().toString();
            }
        }
        dernVar.saneness(generatedAppGlideModule != null ? generatedAppGlideModule.marial() : null);
        Iterator<diandrous.saneness> it3 = listSaneness.iterator();
        while (it3.hasNext()) {
            it3.next().attabal(applicationContext, dernVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.saneness(applicationContext, dernVar);
        }
        saneness sanenessVarAttabal = dernVar.attabal(applicationContext, listSaneness, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(sanenessVarAttabal);
        f17906preprohormone = sanenessVarAttabal;
    }

    public static GeneratedAppGlideModule wireman(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            Log.isLoggable("Glide", 5);
            return null;
        } catch (IllegalAccessException e) {
            monoploid(e);
            return null;
        } catch (InstantiationException e2) {
            monoploid(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            monoploid(e3);
            return null;
        } catch (InvocationTargetException e4) {
            monoploid(e4);
            return null;
        }
    }

    public kowloon apical() {
        return this.f17911graveside;
    }

    public boolean arytenoidectomy(belongingness.wireman<?> wiremanVar) {
        synchronized (this.f17909dovishness) {
            try {
                Iterator<impromptu> it = this.f17909dovishness.iterator();
                while (it.hasNext()) {
                    if (it.next().dovishness(wiremanVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public trawler.wireman beachfront() {
        return this.f17908arytenoidectomy;
    }

    public regius.dern competently() {
        return this.f17907adultoid;
    }

    public Registry cutely() {
        return this.f17915polloi.impromptu();
    }

    public Context impromptu() {
        return this.f17915polloi.getBaseContext();
    }

    public void kowloon(impromptu impromptuVar) {
        synchronized (this.f17909dovishness) {
            try {
                if (this.f17909dovishness.contains(impromptuVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f17909dovishness.add(impromptuVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public trawler.saneness marial() {
        return this.f17913molybdenite;
    }

    public void molybdenite(impromptu impromptuVar) {
        synchronized (this.f17909dovishness) {
            try {
                if (!this.f17909dovishness.contains(impromptuVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f17909dovishness.remove(impromptuVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        saneness();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        polloi(i);
    }

    public void polloi(int i) {
        formularize.saneness();
        synchronized (this.f17909dovishness) {
            try {
                Iterator<impromptu> it = this.f17909dovishness.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17914monoploid.attabal(i);
        this.f17908arytenoidectomy.attabal(i);
        this.f17913molybdenite.attabal(i);
    }

    public void saneness() {
        formularize.saneness();
        this.f17914monoploid.saneness();
        this.f17908arytenoidectomy.saneness();
        this.f17913molybdenite.saneness();
    }

    public wireman taiyuan() {
        return this.f17915polloi;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }
}
