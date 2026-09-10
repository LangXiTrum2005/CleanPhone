package cybernatic;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: DefaultExtractorsFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class formularize implements adultoid {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public int f24633beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public int f24634competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f24635cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public boolean f24636dern;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public int f24637formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public ImmutableList<androidx.media3.common.polloi> f24638impassible;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public int f24639impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f24641marial;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public int f24642monoploid;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public boolean f24643saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public int f24644taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f24646wireman;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final int[] f24630polloi = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final attabal f24629molybdenite = new attabal(new attabal.InterfaceC0581attabal() { // from class: cybernatic.cutely
        @Override // cybernatic.formularize.attabal.InterfaceC0581attabal
        public final Constructor attabal() {
            return formularize.taiyuan();
        }
    });

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final attabal f24628graveside = new attabal(new attabal.InterfaceC0581attabal() { // from class: cybernatic.apical
        @Override // cybernatic.formularize.attabal.InterfaceC0581attabal
        public final Constructor attabal() {
            return formularize.cutely();
        }
    });

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public int f24631apical = 1;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public int f24645triweekly = 112800;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public strother.polloi.attabal f24632arytenoidectomy = new strother.impromptu();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f24640kowloon = true;

    /* JADX INFO: compiled from: DefaultExtractorsFactory.java */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final InterfaceC0581attabal f24647attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Constructor<? extends arytenoidectomy> f24648dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final AtomicBoolean f24649saneness = new AtomicBoolean(false);

        /* JADX INFO: renamed from: cybernatic.formularize$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DefaultExtractorsFactory.java */
        public interface InterfaceC0581attabal {
            Constructor<? extends arytenoidectomy> attabal() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public attabal(InterfaceC0581attabal interfaceC0581attabal) {
            this.f24647attabal = interfaceC0581attabal;
        }

        public arytenoidectomy attabal(Object... objArr) {
            Constructor<? extends arytenoidectomy> constructorSaneness = saneness();
            if (constructorSaneness == null) {
                return null;
            }
            try {
                return constructorSaneness.newInstance(objArr);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating extractor", e);
            }
        }

        public final Constructor<? extends arytenoidectomy> saneness() {
            synchronized (this.f24649saneness) {
                if (this.f24649saneness.get()) {
                    return this.f24648dern;
                }
                try {
                    return this.f24647attabal.attabal();
                } catch (ClassNotFoundException unused) {
                    this.f24649saneness.set(true);
                    return this.f24648dern;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
        }
    }

    public static Constructor<? extends arytenoidectomy> cutely() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(arytenoidectomy.class).getConstructor(null);
    }

    public static Constructor<? extends arytenoidectomy> taiyuan() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(arytenoidectomy.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    public synchronized formularize apical(int i) {
        this.f24642monoploid = i;
        return this;
    }

    public final void competently(int i, List<arytenoidectomy> list) {
        switch (i) {
            case 0:
                list.add(new ghoulish.saneness());
                break;
            case 1:
                list.add(new ghoulish.marial());
                break;
            case 2:
                list.add(new ghoulish.impromptu((this.f24636dern ? 2 : 0) | ((this.f24646wireman | (this.f24643saneness ? 1 : 0)) == true ? 1 : 0)));
                break;
            case 3:
                list.add(new collection.saneness((this.f24636dern ? 2 : 0) | this.f24641marial | (this.f24643saneness ? 1 : 0)));
                break;
            case 4:
                arytenoidectomy arytenoidectomyVarAttabal = f24629molybdenite.attabal(Integer.valueOf(this.f24633beachfront));
                if (arytenoidectomyVarAttabal == null) {
                    list.add(new saccharic.wireman(this.f24633beachfront));
                } else {
                    list.add(arytenoidectomyVarAttabal);
                }
                break;
            case 5:
                list.add(new alloy.saneness());
                break;
            case 6:
                list.add(new polliwog.marial(this.f24632arytenoidectomy, (this.f24640kowloon ? 0 : 2) | this.f24634competently));
                break;
            case 7:
                list.add(new balance.beachfront((this.f24636dern ? 2 : 0) | this.f24635cutely | (this.f24643saneness ? 1 : 0)));
                break;
            case 8:
                list.add(new nattier.impromptu(this.f24632arytenoidectomy, this.f24644taiyuan | (this.f24640kowloon ? 0 : 32)));
                list.add(new nattier.impassible(this.f24632arytenoidectomy, (this.f24640kowloon ? 0 : 16) | this.f24639impromptu));
                break;
            case 9:
                list.add(new bavaria.wireman());
                break;
            case 10:
                list.add(new ghoulish.trm());
                break;
            case 11:
                if (this.f24638impassible == null) {
                    this.f24638impassible = ImmutableList.of();
                }
                list.add(new ghoulish.merc(this.f24631apical, !this.f24640kowloon ? 1 : 0, this.f24632arytenoidectomy, new decarock.kattegat(0L), new ghoulish.cutely(this.f24637formularize, this.f24638impassible), this.f24645triweekly));
                break;
            case 12:
                list.add(new mef.saneness());
                break;
            case 14:
                list.add(new livable.attabal(this.f24642monoploid));
                break;
            case 15:
                arytenoidectomy arytenoidectomyVarAttabal2 = f24628graveside.attabal(new Object[0]);
                if (arytenoidectomyVarAttabal2 != null) {
                    list.add(arytenoidectomyVarAttabal2);
                }
                break;
            case 16:
                list.add(new likeable.saneness(!this.f24640kowloon ? 1 : 0, this.f24632arytenoidectomy));
                break;
            case 17:
                list.add(new bleacherite.attabal());
                break;
            case 18:
                list.add(new galluses.attabal());
                break;
            case 19:
                list.add(new genii.attabal());
                break;
            case 20:
                int i2 = this.f24639impromptu;
                if ((i2 & 2) == 0 && (i2 & 4) == 0) {
                    list.add(new palewise.attabal());
                    break;
                }
                break;
            case 21:
                list.add(new homophylic.attabal());
                break;
        }
    }

    @Override // cybernatic.adultoid
    public synchronized arytenoidectomy[] createExtractors() {
        return dern(Uri.EMPTY, new HashMap());
    }

    @Override // cybernatic.adultoid
    public synchronized arytenoidectomy[] dern(Uri uri, Map<String, List<String>> map) {
        arytenoidectomy[] arytenoidectomyVarArr;
        try {
            int[] iArr = f24630polloi;
            ArrayList arrayList = new ArrayList(iArr.length);
            int iSaneness = androidx.media3.common.triweekly.saneness(map);
            if (iSaneness != -1) {
                competently(iSaneness, arrayList);
            }
            int iDern = androidx.media3.common.triweekly.dern(uri);
            if (iDern != -1 && iDern != iSaneness) {
                competently(iDern, arrayList);
            }
            for (int i : iArr) {
                if (i != iSaneness && i != iDern) {
                    competently(i, arrayList);
                }
            }
            arytenoidectomyVarArr = new arytenoidectomy[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arytenoidectomy molybdeniteVar = arrayList.get(i2);
                if (this.f24640kowloon && !(molybdeniteVar.saneness() instanceof nattier.impromptu) && !(molybdeniteVar.saneness() instanceof nattier.impassible) && !(molybdeniteVar.saneness() instanceof ghoulish.merc) && !(molybdeniteVar.saneness() instanceof likeable.saneness) && !(molybdeniteVar.saneness() instanceof polliwog.marial)) {
                    molybdeniteVar = new strother.molybdenite(molybdeniteVar, this.f24632arytenoidectomy);
                }
                arytenoidectomyVarArr[i2] = molybdeniteVar;
            }
        } catch (Throwable th) {
            throw th;
        }
        return arytenoidectomyVarArr;
    }

    @Override // cybernatic.adultoid
    /* JADX INFO: renamed from: formularize, reason: merged with bridge method [inline-methods] */
    public synchronized formularize attabal(strother.polloi.attabal attabalVar) {
        this.f24632arytenoidectomy = attabalVar;
        return this;
    }

    @Override // cybernatic.adultoid
    @Deprecated
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public synchronized formularize saneness(boolean z) {
        this.f24640kowloon = z;
        return this;
    }
}
