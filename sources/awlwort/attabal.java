package awlwort;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import awlwort.attabal;
import com.bumptech.glide.Priority;
import com.bumptech.glide.util.apical;
import com.bumptech.glide.util.formularize;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import patty.polloi;

/* JADX INFO: compiled from: BaseRequestOptions.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class attabal<T extends attabal<T>> implements Cloneable {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public Drawable f14763adultoid;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name */
    public boolean f14766cuirassed;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public int f14767dovishness;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public int f14769graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public int f14772kowloon;

    /* JADX INFO: renamed from: merc, reason: collision with root package name */
    public boolean f14773merc;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public Drawable f14774molybdenite;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public int f14776oilcan;

    /* JADX INFO: renamed from: polder, reason: collision with root package name */
    public boolean f14777polder;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name */
    public Resources.Theme f14780restrictive;

    /* JADX INFO: renamed from: saran, reason: collision with root package name */
    public boolean f14782saran;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name */
    public boolean f14784seminary;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name */
    public boolean f14786supplicat;

    /* JADX INFO: renamed from: trm, reason: collision with root package name */
    public Drawable f14787trm;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public float f14764arytenoidectomy = 1.0f;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public endosteum.dern f14775monoploid = endosteum.dern.f25716marial;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public Priority f14778polloi = Priority.NORMAL;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public boolean f14768gintrap = true;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public int f14781rotuma = -1;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public int f14779preprohormone = -1;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public maggot.saneness f14765cord = leafed.attabal.dern();

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name */
    public boolean f14785stratoscope = true;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public maggot.wireman f14788yemenite = new maggot.wireman();

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public Map<Class<?>, maggot.competently<?>> f14783sealless = new com.bumptech.glide.util.saneness();

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name */
    public Class<?> f14771kattegat = Object.class;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name */
    public boolean f14770grimness = true;

    public static boolean restrictive(int i, int i2) {
        return (i & i2) != 0;
    }

    public final Class<?> adultoid() {
        return this.f14771kattegat;
    }

    public final Drawable apical() {
        return this.f14787trm;
    }

    public T attabal(attabal<?> attabalVar) {
        if (this.f14773merc) {
            return (T) clone().attabal(attabalVar);
        }
        if (restrictive(attabalVar.f14772kowloon, 2)) {
            this.f14764arytenoidectomy = attabalVar.f14764arytenoidectomy;
        }
        if (restrictive(attabalVar.f14772kowloon, Opcodes.ASM4)) {
            this.f14777polder = attabalVar.f14777polder;
        }
        if (restrictive(attabalVar.f14772kowloon, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.f14782saran = attabalVar.f14782saran;
        }
        if (restrictive(attabalVar.f14772kowloon, 4)) {
            this.f14775monoploid = attabalVar.f14775monoploid;
        }
        if (restrictive(attabalVar.f14772kowloon, 8)) {
            this.f14778polloi = attabalVar.f14778polloi;
        }
        if (restrictive(attabalVar.f14772kowloon, 16)) {
            this.f14774molybdenite = attabalVar.f14774molybdenite;
            this.f14769graveside = 0;
            this.f14772kowloon &= -33;
        }
        if (restrictive(attabalVar.f14772kowloon, 32)) {
            this.f14769graveside = attabalVar.f14769graveside;
            this.f14774molybdenite = null;
            this.f14772kowloon &= -17;
        }
        if (restrictive(attabalVar.f14772kowloon, 64)) {
            this.f14763adultoid = attabalVar.f14763adultoid;
            this.f14767dovishness = 0;
            this.f14772kowloon &= -129;
        }
        if (restrictive(attabalVar.f14772kowloon, 128)) {
            this.f14767dovishness = attabalVar.f14767dovishness;
            this.f14763adultoid = null;
            this.f14772kowloon &= -65;
        }
        if (restrictive(attabalVar.f14772kowloon, 256)) {
            this.f14768gintrap = attabalVar.f14768gintrap;
        }
        if (restrictive(attabalVar.f14772kowloon, 512)) {
            this.f14779preprohormone = attabalVar.f14779preprohormone;
            this.f14781rotuma = attabalVar.f14781rotuma;
        }
        if (restrictive(attabalVar.f14772kowloon, 1024)) {
            this.f14765cord = attabalVar.f14765cord;
        }
        if (restrictive(attabalVar.f14772kowloon, 4096)) {
            this.f14771kattegat = attabalVar.f14771kattegat;
        }
        if (restrictive(attabalVar.f14772kowloon, 8192)) {
            this.f14787trm = attabalVar.f14787trm;
            this.f14776oilcan = 0;
            this.f14772kowloon &= -16385;
        }
        if (restrictive(attabalVar.f14772kowloon, 16384)) {
            this.f14776oilcan = attabalVar.f14776oilcan;
            this.f14787trm = null;
            this.f14772kowloon &= -8193;
        }
        if (restrictive(attabalVar.f14772kowloon, 32768)) {
            this.f14780restrictive = attabalVar.f14780restrictive;
        }
        if (restrictive(attabalVar.f14772kowloon, 65536)) {
            this.f14785stratoscope = attabalVar.f14785stratoscope;
        }
        if (restrictive(attabalVar.f14772kowloon, 131072)) {
            this.f14766cuirassed = attabalVar.f14766cuirassed;
        }
        if (restrictive(attabalVar.f14772kowloon, 2048)) {
            this.f14783sealless.putAll(attabalVar.f14783sealless);
            this.f14770grimness = attabalVar.f14770grimness;
        }
        if (restrictive(attabalVar.f14772kowloon, Opcodes.ASM8)) {
            this.f14784seminary = attabalVar.f14784seminary;
        }
        if (!this.f14785stratoscope) {
            this.f14783sealless.clear();
            int i = this.f14772kowloon;
            this.f14766cuirassed = false;
            this.f14772kowloon = i & (-133121);
            this.f14770grimness = true;
        }
        this.f14772kowloon |= attabalVar.f14772kowloon;
        this.f14788yemenite.wireman(attabalVar.f14788yemenite);
        return (T) hydrovane();
    }

    public T beachfront(endosteum.dern dernVar) {
        if (this.f14773merc) {
            return (T) clone().beachfront(dernVar);
        }
        this.f14775monoploid = (endosteum.dern) apical.wireman(dernVar);
        this.f14772kowloon |= 4;
        return (T) hydrovane();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T clubfoot(maggot.competently<Bitmap> competentlyVar, boolean z) {
        if (this.f14773merc) {
            return (T) clone().clubfoot(competentlyVar, z);
        }
        polloi polloiVar = new polloi(competentlyVar, z);
        splinterproof(Bitmap.class, competentlyVar, z);
        splinterproof(Drawable.class, polloiVar, z);
        splinterproof(BitmapDrawable.class, polloiVar.dern(), z);
        splinterproof(sevenfold.dern.class, new sevenfold.beachfront(competentlyVar), z);
        return (T) hydrovane();
    }

    public final endosteum.dern competently() {
        return this.f14775monoploid;
    }

    public final boolean cord() {
        return this.f14782saran;
    }

    public final boolean cuirassed() {
        return this.f14777polder;
    }

    public T dent(boolean z) {
        if (this.f14773merc) {
            return (T) clone().dent(z);
        }
        this.f14782saran = z;
        this.f14772kowloon |= ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        return (T) hydrovane();
    }

    public T dern() {
        if (this.f14786supplicat && !this.f14773merc) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f14773merc = true;
        return (T) seminary();
    }

    public final maggot.saneness dovishness() {
        return this.f14765cord;
    }

    public boolean equals(Object obj) {
        if (obj instanceof attabal) {
            return trm((attabal) obj);
        }
        return false;
    }

    public final int formularize() {
        return this.f14776oilcan;
    }

    public final float gintrap() {
        return this.f14764arytenoidectomy;
    }

    public final Priority graveside() {
        return this.f14778polloi;
    }

    public T grimness(int i, int i2) {
        if (this.f14773merc) {
            return (T) clone().grimness(i, i2);
        }
        this.f14779preprohormone = i;
        this.f14781rotuma = i2;
        this.f14772kowloon |= 512;
        return (T) hydrovane();
    }

    public int hashCode() {
        return formularize.monoploid(this.f14780restrictive, formularize.monoploid(this.f14765cord, formularize.monoploid(this.f14771kattegat, formularize.monoploid(this.f14783sealless, formularize.monoploid(this.f14788yemenite, formularize.monoploid(this.f14778polloi, formularize.monoploid(this.f14775monoploid, formularize.polloi(this.f14784seminary, formularize.polloi(this.f14777polder, formularize.polloi(this.f14785stratoscope, formularize.polloi(this.f14766cuirassed, formularize.arytenoidectomy(this.f14779preprohormone, formularize.arytenoidectomy(this.f14781rotuma, formularize.polloi(this.f14768gintrap, formularize.monoploid(this.f14787trm, formularize.arytenoidectomy(this.f14776oilcan, formularize.monoploid(this.f14763adultoid, formularize.arytenoidectomy(this.f14767dovishness, formularize.monoploid(this.f14774molybdenite, formularize.arytenoidectomy(this.f14769graveside, formularize.impassible(this.f14764arytenoidectomy)))))))))))))))))))));
    }

    public final T hydrovane() {
        if (this.f14786supplicat) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) starveling();
    }

    public final boolean impassible() {
        return this.f14784seminary;
    }

    public final int impromptu() {
        return this.f14769graveside;
    }

    public final int kowloon() {
        return this.f14781rotuma;
    }

    public T marial(Class<?> cls) {
        if (this.f14773merc) {
            return (T) clone().marial(cls);
        }
        this.f14771kattegat = (Class) apical.wireman(cls);
        this.f14772kowloon |= 4096;
        return (T) hydrovane();
    }

    public T mathsort(boolean z) {
        if (this.f14773merc) {
            return (T) clone().mathsort(true);
        }
        this.f14768gintrap = !z;
        this.f14772kowloon |= 256;
        return (T) hydrovane();
    }

    public final boolean merc() {
        return this.f14766cuirassed;
    }

    public final int molybdenite() {
        return this.f14767dovishness;
    }

    public final int monoploid() {
        return this.f14779preprohormone;
    }

    public final boolean oilcan() {
        return this.f14768gintrap;
    }

    public T overspeculate(maggot.competently<Bitmap> competentlyVar) {
        return (T) clubfoot(competentlyVar, true);
    }

    public T peridotite(float f) {
        if (this.f14773merc) {
            return (T) clone().peridotite(f);
        }
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f14764arytenoidectomy = f;
        this.f14772kowloon |= 2;
        return (T) hydrovane();
    }

    public final boolean polder() {
        return formularize.dovishness(this.f14779preprohormone, this.f14781rotuma);
    }

    public final Drawable polloi() {
        return this.f14763adultoid;
    }

    public final Map<Class<?>, maggot.competently<?>> preprohormone() {
        return this.f14783sealless;
    }

    public final Resources.Theme rotuma() {
        return this.f14780restrictive;
    }

    public T saran(Priority priority) {
        if (this.f14773merc) {
            return (T) clone().saran(priority);
        }
        this.f14778polloi = (Priority) apical.wireman(priority);
        this.f14772kowloon |= 8;
        return (T) hydrovane();
    }

    public boolean sealless() {
        return this.f14770grimness;
    }

    public T seminary() {
        this.f14786supplicat = true;
        return (T) starveling();
    }

    public <Y> T splinterproof(Class<Y> cls, maggot.competently<Y> competentlyVar, boolean z) {
        if (this.f14773merc) {
            return (T) clone().splinterproof(cls, competentlyVar, z);
        }
        apical.wireman(cls);
        apical.wireman(competentlyVar);
        this.f14783sealless.put(cls, competentlyVar);
        int i = this.f14772kowloon;
        this.f14785stratoscope = true;
        this.f14772kowloon = 67584 | i;
        this.f14770grimness = false;
        if (z) {
            this.f14772kowloon = i | 198656;
            this.f14766cuirassed = true;
        }
        return (T) hydrovane();
    }

    public final boolean stratoscope() {
        return this.f14773merc;
    }

    public final boolean supplicat(int i) {
        return restrictive(this.f14772kowloon, i);
    }

    public final Drawable taiyuan() {
        return this.f14774molybdenite;
    }

    public final maggot.wireman triweekly() {
        return this.f14788yemenite;
    }

    public final boolean trm(attabal<?> attabalVar) {
        return Float.compare(attabalVar.f14764arytenoidectomy, this.f14764arytenoidectomy) == 0 && this.f14769graveside == attabalVar.f14769graveside && formularize.marial(this.f14774molybdenite, attabalVar.f14774molybdenite) && this.f14767dovishness == attabalVar.f14767dovishness && formularize.marial(this.f14763adultoid, attabalVar.f14763adultoid) && this.f14776oilcan == attabalVar.f14776oilcan && formularize.marial(this.f14787trm, attabalVar.f14787trm) && this.f14768gintrap == attabalVar.f14768gintrap && this.f14781rotuma == attabalVar.f14781rotuma && this.f14779preprohormone == attabalVar.f14779preprohormone && this.f14766cuirassed == attabalVar.f14766cuirassed && this.f14785stratoscope == attabalVar.f14785stratoscope && this.f14777polder == attabalVar.f14777polder && this.f14784seminary == attabalVar.f14784seminary && this.f14775monoploid.equals(attabalVar.f14775monoploid) && this.f14778polloi == attabalVar.f14778polloi && this.f14788yemenite.equals(attabalVar.f14788yemenite) && this.f14783sealless.equals(attabalVar.f14783sealless) && this.f14771kattegat.equals(attabalVar.f14771kattegat) && formularize.marial(this.f14765cord, attabalVar.f14765cord) && formularize.marial(this.f14780restrictive, attabalVar.f14780restrictive);
    }

    public T walach(maggot.saneness sanenessVar) {
        if (this.f14773merc) {
            return (T) clone().walach(sanenessVar);
        }
        this.f14765cord = (maggot.saneness) apical.wireman(sanenessVar);
        this.f14772kowloon |= 1024;
        return (T) hydrovane();
    }

    @Override // 
    /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            maggot.wireman wiremanVar = new maggot.wireman();
            t.f14788yemenite = wiremanVar;
            wiremanVar.wireman(this.f14788yemenite);
            com.bumptech.glide.util.saneness sanenessVar = new com.bumptech.glide.util.saneness();
            t.f14783sealless = sanenessVar;
            sanenessVar.putAll(this.f14783sealless);
            t.f14786supplicat = false;
            t.f14773merc = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean yemenite() {
        return supplicat(8);
    }

    public final T starveling() {
        return this;
    }
}
