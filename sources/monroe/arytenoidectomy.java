package monroe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public ConcurrentHashMap<Long, lightstruck.marial.dern> f33580attabal = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    public class attabal implements saneness<hardpan.competently.saneness> {
        public attabal() {
        }

        @Override // monroe.arytenoidectomy.saneness
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public int saneness(hardpan.competently.saneness sanenessVar) {
            return sanenessVar.marial();
        }

        @Override // monroe.arytenoidectomy.saneness
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public boolean attabal(hardpan.competently.saneness sanenessVar) {
            return sanenessVar.beachfront();
        }
    }

    /* JADX INFO: compiled from: TypefaceCompatBaseImpl.java */
    public interface saneness<T> {
        boolean attabal(T t);

        int saneness(T t);
    }

    public static <T> T beachfront(T[] tArr, int i, saneness<T> sanenessVar) {
        return (T) competently(tArr, (i & 1) == 0 ? 400 : IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, (i & 2) != 0, sanenessVar);
    }

    public static <T> T competently(T[] tArr, int i, boolean z, saneness<T> sanenessVar) {
        T t = null;
        int i2 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(sanenessVar.saneness(t2) - i) * 2) + (sanenessVar.attabal(t2) == z ? 0 : 1);
            if (t == null || i2 > iAbs) {
                t = t2;
                i2 = iAbs;
            }
        }
        return t;
    }

    public Typeface attabal(Context context, lightstruck.marial.dern dernVar, Resources resources, int i) {
        throw null;
    }

    public Typeface dern(Context context, CancellationSignal cancellationSignal, List<hardpan.competently.saneness[]> list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public hardpan.competently.saneness impromptu(hardpan.competently.saneness[] sanenessVarArr, int i) {
        return (hardpan.competently.saneness) beachfront(sanenessVarArr, i, new attabal());
    }

    public Typeface marial(Context context, Resources resources, int i, String str, int i2) {
        File fileMarial = monoploid.marial(context);
        if (fileMarial == null) {
            return null;
        }
        try {
            if (monoploid.dern(fileMarial, resources, i)) {
                return Typeface.createFromFile(fileMarial.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileMarial.delete();
        }
    }

    public Typeface saneness(Context context, CancellationSignal cancellationSignal, hardpan.competently.saneness[] sanenessVarArr, int i) {
        throw null;
    }

    public Typeface wireman(Context context, InputStream inputStream) {
        File fileMarial = monoploid.marial(context);
        if (fileMarial == null) {
            return null;
        }
        try {
            if (monoploid.wireman(fileMarial, inputStream)) {
                return Typeface.createFromFile(fileMarial.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileMarial.delete();
        }
    }
}
