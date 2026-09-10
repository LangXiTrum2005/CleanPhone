package hemolysin;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: MemorySizeCalculator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class taiyuan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f27656attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Context f27657dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f27658saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final int f27659wireman;

    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class attabal {

        /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
        public static final int f27660taiyuan;

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f27661attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public dern f27664dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public float f27666marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public ActivityManager f27667saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public float f27668wireman = 2.0f;

        /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
        public float f27662beachfront = 0.4f;

        /* JADX INFO: renamed from: competently, reason: collision with root package name */
        public float f27663competently = 0.33f;

        /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
        public int f27665impromptu = 4194304;

        static {
            f27660taiyuan = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public attabal(Context context) {
            this.f27666marial = f27660taiyuan;
            this.f27661attabal = context;
            this.f27667saneness = (ActivityManager) context.getSystemService("activity");
            this.f27664dern = new saneness(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !taiyuan.marial(this.f27667saneness)) {
                return;
            }
            this.f27666marial = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public taiyuan attabal() {
            return new taiyuan(this);
        }
    }

    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public interface dern {
        int attabal();

        int saneness();
    }

    /* JADX INFO: compiled from: MemorySizeCalculator.java */
    public static final class saneness implements dern {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final DisplayMetrics f27669attabal;

        public saneness(DisplayMetrics displayMetrics) {
            this.f27669attabal = displayMetrics;
        }

        @Override // hemolysin.taiyuan.dern
        public int attabal() {
            return this.f27669attabal.heightPixels;
        }

        @Override // hemolysin.taiyuan.dern
        public int saneness() {
            return this.f27669attabal.widthPixels;
        }
    }

    public taiyuan(attabal attabalVar) {
        this.f27657dern = attabalVar.f27661attabal;
        int i = marial(attabalVar.f27667saneness) ? attabalVar.f27665impromptu / 2 : attabalVar.f27665impromptu;
        this.f27659wireman = i;
        int iDern = dern(attabalVar.f27667saneness, attabalVar.f27662beachfront, attabalVar.f27663competently);
        float fSaneness = attabalVar.f27664dern.saneness() * attabalVar.f27664dern.attabal() * 4;
        int iRound = Math.round(attabalVar.f27666marial * fSaneness);
        int iRound2 = Math.round(fSaneness * attabalVar.f27668wireman);
        int i2 = iDern - i;
        if (iRound2 + iRound <= i2) {
            this.f27658saneness = iRound2;
            this.f27656attabal = iRound;
        } else {
            float f = i2;
            float f2 = attabalVar.f27666marial;
            float f3 = attabalVar.f27668wireman;
            float f4 = f / (f2 + f3);
            this.f27658saneness = Math.round(f3 * f4);
            this.f27656attabal = Math.round(f4 * attabalVar.f27666marial);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            beachfront(this.f27658saneness);
            beachfront(this.f27656attabal);
            beachfront(i);
            beachfront(iDern);
            attabalVar.f27667saneness.getMemoryClass();
            marial(attabalVar.f27667saneness);
        }
    }

    public static int dern(ActivityManager activityManager, float f, float f2) {
        float memoryClass = activityManager.getMemoryClass() * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        if (marial(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    public static boolean marial(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int attabal() {
        return this.f27659wireman;
    }

    public final String beachfront(int i) {
        return Formatter.formatFileSize(this.f27657dern, i);
    }

    public int saneness() {
        return this.f27656attabal;
    }

    public int wireman() {
        return this.f27658saneness;
    }
}
