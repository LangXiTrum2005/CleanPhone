package trawler;

import android.graphics.Bitmap;
import android.os.Build;
import com.ironsource.X3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: SizeConfigStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
public class kowloon implements formularize {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final Bitmap.Config[] f38958beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final Bitmap.Config[] f38959competently;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final Bitmap.Config[] f38960impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Bitmap.Config[] f38961marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Bitmap.Config[] f38962wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f38963attabal = new dern();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently<saneness, Bitmap> f38965saneness = new competently<>();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f38964dern = new HashMap();

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f38966attabal;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f38966attabal = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38966attabal[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38966attabal[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38966attabal[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static class dern extends trawler.dern<saneness> {
        public saneness marial(int i, Bitmap.Config config) {
            saneness sanenessVarSaneness = saneness();
            sanenessVarSaneness.saneness(i, config);
            return sanenessVarSaneness;
        }

        @Override // trawler.dern
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public saneness attabal() {
            return new saneness(this);
        }
    }

    /* JADX INFO: compiled from: SizeConfigStrategy.java */
    public static final class saneness implements impassible {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final dern f38967attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public Bitmap.Config f38968dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public int f38969saneness;

        public saneness(dern dernVar) {
            this.f38967attabal = dernVar;
        }

        @Override // trawler.impassible
        public void attabal() {
            this.f38967attabal.dern(this);
        }

        public boolean equals(Object obj) {
            if (obj instanceof saneness) {
                saneness sanenessVar = (saneness) obj;
                if (this.f38969saneness == sanenessVar.f38969saneness && com.bumptech.glide.util.formularize.marial(this.f38968dern, sanenessVar.f38968dern)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i = this.f38969saneness * 31;
            Bitmap.Config config = this.f38968dern;
            return i + (config != null ? config.hashCode() : 0);
        }

        public void saneness(int i, Bitmap.Config config) {
            this.f38969saneness = i;
            this.f38968dern = config;
        }

        public String toString() {
            return kowloon.impromptu(this.f38969saneness, this.f38968dern);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f38962wireman = configArr;
        f38961marial = configArr;
        f38958beachfront = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f38959competently = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f38960impromptu = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String impromptu(int i, Bitmap.Config config) {
        return X3.j.d + i + "](" + config + ")";
    }

    public static Bitmap.Config[] taiyuan(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f38961marial;
        }
        int i = attabal.f38966attabal[config.ordinal()];
        if (i == 1) {
            return f38962wireman;
        }
        if (i == 2) {
            return f38958beachfront;
        }
        if (i != 3) {
            return i != 4 ? new Bitmap.Config[]{config} : f38960impromptu;
        }
        return f38959competently;
    }

    @Override // trawler.formularize
    public String attabal(Bitmap bitmap) {
        return impromptu(com.bumptech.glide.util.formularize.taiyuan(bitmap), bitmap.getConfig());
    }

    public final void beachfront(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapCutely = cutely(bitmap.getConfig());
        Integer num2 = navigableMapCutely.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapCutely.remove(num);
                return;
            } else {
                navigableMapCutely.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + attabal(bitmap) + ", this: " + this);
    }

    public final saneness competently(int i, Bitmap.Config config) {
        saneness sanenessVarMarial = this.f38963attabal.marial(i, config);
        for (Bitmap.Config config2 : taiyuan(config)) {
            Integer numCeilingKey = cutely(config2).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i * 8) {
                if (numCeilingKey.intValue() == i && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f38963attabal.dern(sanenessVarMarial);
                return this.f38963attabal.marial(numCeilingKey.intValue(), config2);
            }
        }
        return sanenessVarMarial;
    }

    public final NavigableMap<Integer, Integer> cutely(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f38964dern.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f38964dern.put(config, treeMap);
        return treeMap;
    }

    @Override // trawler.formularize
    public void dern(Bitmap bitmap) {
        saneness sanenessVarMarial = this.f38963attabal.marial(com.bumptech.glide.util.formularize.taiyuan(bitmap), bitmap.getConfig());
        this.f38965saneness.wireman(sanenessVarMarial, bitmap);
        NavigableMap<Integer, Integer> navigableMapCutely = cutely(bitmap.getConfig());
        Integer num = navigableMapCutely.get(Integer.valueOf(sanenessVarMarial.f38969saneness));
        navigableMapCutely.put(Integer.valueOf(sanenessVarMarial.f38969saneness), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // trawler.formularize
    public int marial(Bitmap bitmap) {
        return com.bumptech.glide.util.formularize.taiyuan(bitmap);
    }

    @Override // trawler.formularize
    public Bitmap removeLast() {
        Bitmap bitmapBeachfront = this.f38965saneness.beachfront();
        if (bitmapBeachfront != null) {
            beachfront(Integer.valueOf(com.bumptech.glide.util.formularize.taiyuan(bitmapBeachfront)), bitmapBeachfront);
        }
        return bitmapBeachfront;
    }

    @Override // trawler.formularize
    public String saneness(int i, int i2, Bitmap.Config config) {
        return impromptu(com.bumptech.glide.util.formularize.impromptu(i, i2, config), config);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f38965saneness);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f38964dern.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f38964dern.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    @Override // trawler.formularize
    public Bitmap wireman(int i, int i2, Bitmap.Config config) {
        saneness sanenessVarCompetently = competently(com.bumptech.glide.util.formularize.impromptu(i, i2, config), config);
        Bitmap bitmapAttabal = this.f38965saneness.attabal(sanenessVarCompetently);
        if (bitmapAttabal != null) {
            beachfront(Integer.valueOf(sanenessVarCompetently.f38969saneness), bitmapAttabal);
            bitmapAttabal.reconfigure(i, i2, config);
        }
        return bitmapAttabal;
    }
}
